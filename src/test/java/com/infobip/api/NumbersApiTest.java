package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class NumbersApiTest extends ApiTest {

    private static final String OWNED_NUMBERS = "/numbers/1/numbers";
    private static final String OWNED_NUMBER = "/numbers/1/numbers/{numberKey}";
    private static final String OWNED_NUMBER_VOICE = "/numbers/2/numbers/{numberKey}/voice";
    private static final String OWNED_NUMBER_CNAM = "/numbers/2/numbers/{numberKey}/voice/cnam";
    private static final String OWNED_NUMBER_CNAM_STATUS = "/numbers/2/numbers/{numberKey}/voice/cnam/status";
    private static final String OWNED_NUMBER_EMERGENCY_SERVICE_VALIDATE =
            "/numbers/2/numbers/{numberKey}/voice/emergency-service/validate-address";
    private static final String OWNED_NUMBER_EMERGENCY_SERVICE =
            "/numbers/2/numbers/{numberKey}/voice/emergency-service";
    private static final String OWNED_NUMBER_EMERGENCY_SERVICE_STATUS =
            "/numbers/2/numbers/{numberKey}/voice/emergency-service/status";
    private static final String RECORDING_CONFIGURATION = "/voice/recording/1/configuration/numbers";
    private static final String RECORDING_CONFIGURATION_NUMBER = "/voice/recording/1/configuration/numbers/{key}";
    private static final String BRANDS = "/number-registration/1/brands";
    private static final String BRAND = "/number-registration/1/brands/{brandId}";
    private static final String REGISTER_BRAND = "/number-registration/1/brands/{brandId}/register";
    private static final String BRAND_REGISTRAR_STATUSES = "/number-registration/1/brands/{brandId}/registrar-statuses";
    private static final String BRAND_AUTH_VERIFICATION =
            "/number-registration/1/brands/{brandId}/brand-auth-verification";
    private static final String BRAND_RESEND_2FA = "/number-registration/1/brands/{brandId}/resend2fa";
    private static final String BRAND_VETS = "/number-registration/1/brands/{brandId}/vets";
    private static final String BRAND_VET = "/number-registration/1/brands/{brandId}/vets/{vetId}";
    private static final String BRAND_VET_IMPORT = "/number-registration/1/brands/{brandId}/vets/import";
    private static final String BRAND_VET_REPORT = "/number-registration/1/brands/{brandId}/vets/{vetId}/report";
    private static final String CAMPAIGNS = "/number-registration/1/campaigns";
    private static final String CAMPAIGNS_TOLL_FREE = "/number-registration/1/campaigns/toll-free";
    private static final String CAMPAIGN = "/number-registration/1/campaigns/{campaignId}";
    private static final String REGISTER_CAMPAIGN = "/number-registration/1/campaigns/{campaignId}/register";
    private static final String CAMPAIGN_NETWORK_STATUSES =
            "/number-registration/1/campaigns/{campaignId}/network-statuses";
    private static final String DEREGISTER_CAMPAIGN = "/number-registration/1/campaigns/{campaignId}/deregister";
    private static final String UPDATE_REGISTRATION =
            "/number-registration/1/campaigns/{campaignId}/update-registration";
    private static final String ADD_NUMBERS = "/number-registration/1/campaigns/{campaignId}/add-numbers";
    private static final String REMOVE_NUMBERS = "/number-registration/1/campaigns/{campaignId}/remove-numbers";
    private static final String CAMPAIGN_NUMBERS = "/number-registration/1/campaigns/{campaignId}/numbers";
    private static final String APPEAL_CAMPAIGN = "/number-registration/1/campaigns/{campaignId}/appeal";
    private static final String CAMPAIGN_PRIORITIES = "/number-registration/1/campaigns/priorities";
    private static final String ATTACH_NUMBER_POOL = "/number-registration/1/campaigns/{campaignId}/number-pool/attach";
    private static final String DETACH_NUMBER_POOL = "/number-registration/1/campaigns/{campaignId}/number-pool/detach";
    private static final String NUMBER_POOLS = "/number-registration/1/number-pools";
    private static final String DOCUMENTS = "/number-registration/1/documents";
    private static final String DOCUMENT = "/number-registration/1/documents/{documentId}";
    private static final String AUTOMATIC_REVIEW_CAMPAIGN =
            "/number-registration/1/automatic-review/campaigns/{campaignUuid}";
    private static final String AUTOMATIC_REVIEW = "/number-registration/1/automatic-review";
    private static final String AUTOMATIC_REVIEW_RESULTS = "/number-registration/1/automatic-review/{requestUuid}";

    @Test
    void shouldListOwnedNumbers() {
        String givenNumberKey = "6FED0BC540BFADD9B05ED7D89AAC22FA";
        String givenNumber = "447860041117";
        String givenCountry = "GB";
        String givenCountryName = "United Kingdom";
        NumberType givenType = NumberType.VIRTUAL_LONG_NUMBER;
        NumbersNumberCapabilityType givenCapability = NumbersNumberCapabilityType.SMS;
        Boolean givenShared = false;
        Double givenPricePerMonth = 5.0;
        Double givenSetupPrice = 0.0;
        String givenCurrency = "EUR";
        String givenNetwork = "02 (Telefonica UK Ltd)";
        String givenKeyword1 = "test";
        String givenKeyword2 = "stop";
        Boolean givenAdditionalSetupRequired = false;
        Boolean givenCanEditNumber = true;
        Boolean givenCanEditConfiguration = true;
        String givenApplicationId = "default";
        Long givenNumberCount = 1L;

        String givenResponse = String.format(
                "{\n" + "  \"numbers\": [\n"
                        + "    {\n"
                        + "      \"numberKey\": \"%s\",\n"
                        + "      \"number\": \"%s\",\n"
                        + "      \"country\": \"%s\",\n"
                        + "      \"countryName\": \"%s\",\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"capabilities\": [\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"shared\": %b,\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMonth\": %s,\n"
                        + "        \"setupPrice\": %s,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      },\n"
                        + "      \"network\": \"%s\",\n"
                        + "      \"keywords\": [\n"
                        + "        \"%s\",\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"additionalSetupRequired\": %b,\n"
                        + "      \"editPermissions\": {\n"
                        + "        \"canEditNumber\": %b,\n"
                        + "        \"canEditConfiguration\": %b\n"
                        + "      },\n"
                        + "      \"applicationId\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"numberCount\": %d\n"
                        + "}\n",
                givenNumberKey,
                givenNumber,
                givenCountry,
                givenCountryName,
                givenType,
                givenCapability,
                givenShared,
                givenPricePerMonth.intValue(),
                givenSetupPrice.intValue(),
                givenCurrency,
                givenNetwork,
                givenKeyword1,
                givenKeyword2,
                givenAdditionalSetupRequired,
                givenCanEditNumber,
                givenCanEditConfiguration,
                givenApplicationId,
                givenNumberCount);

        setUpSuccessGetRequest(OWNED_NUMBERS, Map.of(), givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new NumbersResponse()
                .addNumbersItem(new NumbersNumberResponse()
                        .numberKey(givenNumberKey)
                        .number(givenNumber)
                        .country(givenCountry)
                        .countryName(givenCountryName)
                        .type(givenType)
                        .addCapabilitiesItem(givenCapability)
                        .shared(givenShared)
                        .price(new NumbersNumberPrice()
                                .pricePerMonth(givenPricePerMonth)
                                .setupPrice(givenSetupPrice)
                                .currency(givenCurrency))
                        .network(givenNetwork)
                        .addKeywordsItem(givenKeyword1)
                        .addKeywordsItem(givenKeyword2)
                        .additionalSetupRequired(givenAdditionalSetupRequired)
                        .editPermissions(new NumbersEditPermissions()
                                .canEditNumber(givenCanEditNumber)
                                .canEditConfiguration(givenCanEditConfiguration))
                        .applicationId(givenApplicationId))
                .numberCount(givenNumberCount);

        Consumer<NumbersResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.listOwnedNumbers();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSingleOwnedNumber() {
        String givenNumberKey = "6FED0BC540BFADD9B05ED7D89AAC22FA";
        String givenNumber = "447860041117";
        String givenCountry = "GB";
        NumberType givenType = NumberType.VIRTUAL_LONG_NUMBER;
        NumbersNumberCapabilityType givenCapability = NumbersNumberCapabilityType.SMS;
        Boolean givenShared = false;
        Double givenPricePerMonth = 5.0;
        Double givenSetupPrice = 0.0;
        String givenCurrency = "EUR";

        String givenResponse = String.format(
                "{\n" + "  \"numberKey\": \"%s\",\n"
                        + "  \"number\": \"%s\",\n"
                        + "  \"country\": \"%s\",\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"capabilities\": [\n"
                        + "    \"%s\"\n"
                        + "  ],\n"
                        + "  \"shared\": %b,\n"
                        + "  \"price\": {\n"
                        + "    \"pricePerMonth\": %s,\n"
                        + "    \"setupPrice\": %s,\n"
                        + "    \"currency\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenNumberKey,
                givenNumber,
                givenCountry,
                givenType,
                givenCapability,
                givenShared,
                givenPricePerMonth.intValue(),
                givenSetupPrice.intValue(),
                givenCurrency);

        setUpSuccessGetRequest(OWNED_NUMBER.replace("{numberKey}", givenNumberKey), Map.of(), givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new NumbersNumberResponse()
                .numberKey(givenNumberKey)
                .number(givenNumber)
                .country(givenCountry)
                .type(givenType)
                .addCapabilitiesItem(givenCapability)
                .shared(givenShared)
                .price(new NumbersNumberPrice()
                        .pricePerMonth(givenPricePerMonth)
                        .setupPrice(givenSetupPrice)
                        .currency(givenCurrency));

        Consumer<NumbersNumberResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.getSingleOwnedNumber(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateOwnedNumber() {
        String givenNumberKey = "58B3840032C7774BAC840EEEA2C23A44";
        String givenApplicationId = "appId";
        String givenEntityId = "entId";

        String givenNumber = "447860041117";
        String givenCountry = "GB";
        NumberType givenType = NumberType.VIRTUAL_LONG_NUMBER;
        NumbersNumberCapabilityType givenCapability = NumbersNumberCapabilityType.SMS;
        Boolean givenShared = false;
        Double givenPricePerMonth = 5.0;
        Double givenSetupPrice = 0.0;
        String givenCurrency = "EUR";

        String expectedRequest = String.format(
                "{\n" + "  \"applicationId\": \"%s\",\n" + "  \"entityId\": \"%s\"\n" + "}\n",
                givenApplicationId, givenEntityId);

        String givenResponse = String.format(
                "{\n" + "  \"numberKey\": \"%s\",\n"
                        + "  \"number\": \"%s\",\n"
                        + "  \"country\": \"%s\",\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"capabilities\": [\n"
                        + "    \"%s\"\n"
                        + "  ],\n"
                        + "  \"shared\": %b,\n"
                        + "  \"price\": {\n"
                        + "    \"pricePerMonth\": %s,\n"
                        + "    \"setupPrice\": %s,\n"
                        + "    \"currency\": \"%s\"\n"
                        + "  },\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"entityId\": \"%s\"\n"
                        + "}\n",
                givenNumberKey,
                givenNumber,
                givenCountry,
                givenType,
                givenCapability,
                givenShared,
                givenPricePerMonth.intValue(),
                givenSetupPrice.intValue(),
                givenCurrency,
                givenApplicationId,
                givenEntityId);

        setUpSuccessPutRequest(
                OWNED_NUMBER.replace("{numberKey}", givenNumberKey), Map.of(), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new NumbersUpdateOwnedNumberRequest()
                .applicationId(givenApplicationId)
                .entityId(givenEntityId);

        var expectedResponse = new NumbersNumberResponse()
                .numberKey(givenNumberKey)
                .number(givenNumber)
                .country(givenCountry)
                .type(givenType)
                .addCapabilitiesItem(givenCapability)
                .shared(givenShared)
                .price(new NumbersNumberPrice()
                        .pricePerMonth(givenPricePerMonth)
                        .setupPrice(givenSetupPrice)
                        .currency(givenCurrency))
                .applicationId(givenApplicationId)
                .entityId(givenEntityId);

        Consumer<NumbersNumberResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.updateOwnedNumber(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCancelNumber() {
        String givenNumberKey = "58B3840032C7774BAC840EEEA2C23A44";

        setUpNoResponseBodyDeleteRequest(OWNED_NUMBER.replace("{numberKey}", givenNumberKey), Map.of(), 204);

        var api = new NumbersApi(getApiClient());

        var call = api.cancelNumber(givenNumberKey);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldGetVoiceSetupOnNumber() {
        String givenNumberKey = "6FED0BC540BFADD9B05ED7D89AAC22FA";
        String givenVoiceNumberMaskingConfigKey = "C6A5995CBF4D2DF2ADE29963B3BB00E6";
        MoActionType givenType = MoActionType.VOICE_NUMBER_MASKING;

        String givenResponse = String.format(
                "{\n" + "  \"action\": {\n"
                        + "    \"voiceNumberMaskingConfigKey\": \"%s\",\n"
                        + "    \"type\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenVoiceNumberMaskingConfigKey, givenType);

        setUpSuccessGetRequest(OWNED_NUMBER_VOICE.replace("{numberKey}", givenNumberKey), Map.of(), givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new NumbersVoiceSetup()
                .action(new NumbersVoiceNumberMaskingActionDetails()
                        .voiceNumberMaskingConfigKey(givenVoiceNumberMaskingConfigKey));

        Consumer<NumbersVoiceSetup> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.getVoiceSetupOnNumber(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateVoiceSetupOnNumber() {
        String givenNumberKey = "6FED0BC540BFADD9B05ED7D89AAC22FA";
        String givenVoiceNumberMaskingConfigKey = "C6A5995CBF4D2DF2ADE29963B3BB00E6";
        MoActionType givenType = MoActionType.VOICE_NUMBER_MASKING;

        String expectedRequest = String.format(
                "{\n" + "  \"action\": {\n"
                        + "    \"voiceNumberMaskingConfigKey\": \"%s\",\n"
                        + "    \"type\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenVoiceNumberMaskingConfigKey, givenType);

        String givenResponse = String.format(
                "{\n" + "  \"action\": {\n"
                        + "    \"voiceNumberMaskingConfigKey\": \"%s\",\n"
                        + "    \"type\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenVoiceNumberMaskingConfigKey, givenType);

        setUpSuccessPutRequest(
                OWNED_NUMBER_VOICE.replace("{numberKey}", givenNumberKey), Map.of(), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new NumbersVoiceSetup()
                .action(new NumbersVoiceNumberMaskingActionDetails()
                        .voiceNumberMaskingConfigKey(givenVoiceNumberMaskingConfigKey));

        var expectedResponse = new NumbersVoiceSetup()
                .action(new NumbersVoiceNumberMaskingActionDetails()
                        .voiceNumberMaskingConfigKey(givenVoiceNumberMaskingConfigKey));

        Consumer<NumbersVoiceSetup> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.updateVoiceSetupOnNumber(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateVoiceSetupOnNumber() {
        String givenNumberKey = "6FED0BC540BFADD9B05ED7D89AAC22FA";
        String givenVoiceNumberMaskingConfigKey = "C6A5995CBF4D2DF2ADE29963B3BB00E6";
        MoActionType givenType = MoActionType.VOICE_NUMBER_MASKING;

        String expectedRequest = String.format(
                "{\n" + "  \"action\": {\n"
                        + "    \"voiceNumberMaskingConfigKey\": \"%s\",\n"
                        + "    \"type\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenVoiceNumberMaskingConfigKey, givenType);

        String givenResponse = String.format(
                "{\n" + "  \"action\": {\n"
                        + "    \"voiceNumberMaskingConfigKey\": \"%s\",\n"
                        + "    \"type\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenVoiceNumberMaskingConfigKey, givenType);

        setUpSuccessPostRequest(
                OWNED_NUMBER_VOICE.replace("{numberKey}", givenNumberKey), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new NumbersVoiceSetup()
                .action(new NumbersVoiceNumberMaskingActionDetails()
                        .voiceNumberMaskingConfigKey(givenVoiceNumberMaskingConfigKey));

        var expectedResponse = new NumbersVoiceSetup()
                .action(new NumbersVoiceNumberMaskingActionDetails()
                        .voiceNumberMaskingConfigKey(givenVoiceNumberMaskingConfigKey));

        Consumer<NumbersVoiceSetup> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.createVoiceSetupOnNumber(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteVoiceSetupOnNumber() {
        String givenNumberKey = "6FED0BC540BFADD9B05ED7D89AAC22FA";

        setUpNoResponseBodyDeleteRequest(OWNED_NUMBER_VOICE.replace("{numberKey}", givenNumberKey), Map.of(), 204);

        var api = new NumbersApi(getApiClient());

        var call = api.deleteVoiceSetupOnNumber(givenNumberKey);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldGetCnam() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenStorageEnabled = false;
        String givenStorageName = "string";
        Boolean givenDeliveryEnabled = false;

        String givenResponse = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"enabled\": %b,\n"
                        + "    \"name\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenStorageEnabled, givenStorageName, givenDeliveryEnabled);

        setUpSuccessGetRequest(OWNED_NUMBER_CNAM.replace("{numberKey}", givenNumberKey), Map.of(), givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new CallsCnam()
                .storage(new CallsCnamStorage().enabled(givenStorageEnabled).name(givenStorageName))
                .delivery(new CallsCnamDelivery().enabled(givenDeliveryEnabled));

        Consumer<CallsCnam> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.getCnam(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateCnam() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenStorageEnabled = false;
        String givenStorageName = "string";
        Boolean givenDeliveryEnabled = false;

        String expectedRequest = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"enabled\": %b,\n"
                        + "    \"name\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenStorageEnabled, givenStorageName, givenDeliveryEnabled);

        String givenResponse = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"enabled\": %b,\n"
                        + "    \"name\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenStorageEnabled, givenStorageName, givenDeliveryEnabled);

        setUpSuccessPutRequest(
                OWNED_NUMBER_CNAM.replace("{numberKey}", givenNumberKey), Map.of(), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new CallsCnam()
                .storage(new CallsCnamStorage().enabled(givenStorageEnabled).name(givenStorageName))
                .delivery(new CallsCnamDelivery().enabled(givenDeliveryEnabled));

        var expectedResponse = new CallsCnam()
                .storage(new CallsCnamStorage().enabled(givenStorageEnabled).name(givenStorageName))
                .delivery(new CallsCnamDelivery().enabled(givenDeliveryEnabled));

        Consumer<CallsCnam> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.updateCnam(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateCnam() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenStorageEnabled = false;
        String givenStorageName = "string";
        Boolean givenDeliveryEnabled = false;

        String expectedRequest = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"enabled\": %b,\n"
                        + "    \"name\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenStorageEnabled, givenStorageName, givenDeliveryEnabled);

        String givenResponse = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"enabled\": %b,\n"
                        + "    \"name\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenStorageEnabled, givenStorageName, givenDeliveryEnabled);

        setUpSuccessPostRequest(
                OWNED_NUMBER_CNAM.replace("{numberKey}", givenNumberKey), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new CallsCnam()
                .storage(new CallsCnamStorage().enabled(givenStorageEnabled).name(givenStorageName))
                .delivery(new CallsCnamDelivery().enabled(givenDeliveryEnabled));

        var expectedResponse = new CallsCnam()
                .storage(new CallsCnamStorage().enabled(givenStorageEnabled).name(givenStorageName))
                .delivery(new CallsCnamDelivery().enabled(givenDeliveryEnabled));

        Consumer<CallsCnam> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.createCnam(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCnam() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenStorageEnabled = false;
        String givenStorageName = "string";
        Boolean givenDeliveryEnabled = false;

        String givenResponse = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"enabled\": %b,\n"
                        + "    \"name\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenStorageEnabled, givenStorageName, givenDeliveryEnabled);

        setUpNoRequestBodyDeleteRequest(
                OWNED_NUMBER_CNAM.replace("{numberKey}", givenNumberKey), Collections.emptyMap(), givenResponse, 200);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new CallsCnam()
                .storage(new CallsCnamStorage().enabled(givenStorageEnabled).name(givenStorageName))
                .delivery(new CallsCnamDelivery().enabled(givenDeliveryEnabled));

        Consumer<CallsCnam> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.deleteCnam(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCnamStatus() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        CallsStatus givenStorageStatus = CallsStatus.PENDING;
        String givenStorageReason = "string";
        CallsStatus givenDeliveryStatus = CallsStatus.PENDING;
        String givenDeliveryReason = "string";

        String givenResponse = String.format(
                "{\n" + "  \"storage\": {\n"
                        + "    \"status\": \"%s\",\n"
                        + "    \"reason\": \"%s\"\n"
                        + "  },\n"
                        + "  \"delivery\": {\n"
                        + "    \"status\": \"%s\",\n"
                        + "    \"reason\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenStorageStatus, givenStorageReason, givenDeliveryStatus, givenDeliveryReason);

        setUpSuccessGetRequest(
                OWNED_NUMBER_CNAM_STATUS.replace("{numberKey}", givenNumberKey), Collections.emptyMap(), givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new CallsPublicCnamStatus()
                .storage(new CallsCnamStorageStatus().status(givenStorageStatus).reason(givenStorageReason))
                .delivery(new CallsCnamDeliveryStatus()
                        .status(givenDeliveryStatus)
                        .reason(givenDeliveryReason));

        Consumer<CallsPublicCnamStatus> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.getCnamStatus(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldValidateEmergencyServiceAddress() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        String givenName = "string";
        String givenStreetName = "string";
        String givenStreetNumber = "string";
        String givenCity = "string";
        String givenCountryCode = "st";
        String givenStateCode = "st";
        String givenZipCode = "string";
        CallsDirection givenDirection = CallsDirection.NORTH;
        String givenSuite = "string";

        String expectedRequest = String.format(
                "{\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"streetName\": \"%s\",\n"
                        + "  \"streetNumber\": \"%s\",\n"
                        + "  \"city\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"stateCode\": \"%s\",\n"
                        + "  \"zipCode\": \"%s\",\n"
                        + "  \"direction\": \"%s\",\n"
                        + "  \"suite\": \"%s\"\n"
                        + "}\n",
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        String givenResponse = String.format(
                "{\n"
                        + "  \"validAddresses\": [\n"
                        + "    {\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"streetName\": \"%s\",\n"
                        + "      \"streetNumber\": \"%s\",\n"
                        + "      \"city\": \"%s\",\n"
                        + "      \"countryCode\": \"%s\",\n"
                        + "      \"stateCode\": \"%s\",\n"
                        + "      \"zipCode\": \"%s\",\n"
                        + "      \"direction\": \"%s\",\n"
                        + "      \"suite\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        setUpSuccessPostRequest(
                OWNED_NUMBER_EMERGENCY_SERVICE_VALIDATE.replace("{numberKey}", givenNumberKey),
                expectedRequest,
                givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new CallsAddress()
                .name(givenName)
                .streetName(givenStreetName)
                .streetNumber(givenStreetNumber)
                .city(givenCity)
                .countryCode(givenCountryCode)
                .stateCode(givenStateCode)
                .zipCode(givenZipCode)
                .direction(givenDirection)
                .suite(givenSuite);

        var expectedResponse = new CallsValidateAddressResponse()
                .addValidAddressesItem(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        Consumer<CallsValidateAddressResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = api.validateEmergencyService(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetEmergencyServiceAddress() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenEnabled = false;
        String givenName = "string";
        String givenStreetName = "string";
        String givenStreetNumber = "string";
        String givenCity = "string";
        String givenCountryCode = "st";
        String givenStateCode = "st";
        String givenZipCode = "string";
        CallsDirection givenDirection = CallsDirection.NORTH;
        String givenSuite = "string";

        String givenResponse = String.format(
                "{\n"
                        + "  \"enabled\": %b,\n"
                        + "  \"address\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"streetName\": \"%s\",\n"
                        + "    \"streetNumber\": \"%s\",\n"
                        + "    \"city\": \"%s\",\n"
                        + "    \"countryCode\": \"%s\",\n"
                        + "    \"stateCode\": \"%s\",\n"
                        + "    \"zipCode\": \"%s\",\n"
                        + "    \"direction\": \"%s\",\n"
                        + "    \"suite\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenEnabled,
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        setUpSuccessGetRequest(
                OWNED_NUMBER_EMERGENCY_SERVICE.replace("{numberKey}", givenNumberKey),
                Collections.emptyMap(),
                givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new CallsEmergencyAddress()
                .enabled(givenEnabled)
                .address(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        Consumer<CallsEmergencyAddress> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.getEmergencyService(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateEmergencyServiceAddress() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenEnabled = false;
        String givenName = "string";
        String givenStreetName = "string";
        String givenStreetNumber = "string";
        String givenCity = "string";
        String givenCountryCode = "st";
        String givenStateCode = "st";
        String givenZipCode = "string";
        CallsDirection givenDirection = CallsDirection.NORTH;
        String givenSuite = "string";

        String expectedRequest = String.format(
                "{\n"
                        + "  \"enabled\": %b,\n"
                        + "  \"address\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"streetName\": \"%s\",\n"
                        + "    \"streetNumber\": \"%s\",\n"
                        + "    \"city\": \"%s\",\n"
                        + "    \"countryCode\": \"%s\",\n"
                        + "    \"stateCode\": \"%s\",\n"
                        + "    \"zipCode\": \"%s\",\n"
                        + "    \"direction\": \"%s\",\n"
                        + "    \"suite\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenEnabled,
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        String givenResponse = String.format(
                "{\n"
                        + "  \"enabled\": %b,\n"
                        + "  \"address\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"streetName\": \"%s\",\n"
                        + "    \"streetNumber\": \"%s\",\n"
                        + "    \"city\": \"%s\",\n"
                        + "    \"countryCode\": \"%s\",\n"
                        + "    \"stateCode\": \"%s\",\n"
                        + "    \"zipCode\": \"%s\",\n"
                        + "    \"direction\": \"%s\",\n"
                        + "    \"suite\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenEnabled,
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        setUpSuccessPutRequest(
                OWNED_NUMBER_EMERGENCY_SERVICE.replace("{numberKey}", givenNumberKey),
                Collections.emptyMap(),
                expectedRequest,
                givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new CallsEmergencyAddress()
                .enabled(givenEnabled)
                .address(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        var expectedResponse = new CallsEmergencyAddress()
                .enabled(givenEnabled)
                .address(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        Consumer<CallsEmergencyAddress> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.updateEmergencyService(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateEmergencyServiceAddress() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenEnabled = false;
        String givenName = "string";
        String givenStreetName = "string";
        String givenStreetNumber = "string";
        String givenCity = "string";
        String givenCountryCode = "st";
        String givenStateCode = "st";
        String givenZipCode = "string";
        CallsDirection givenDirection = CallsDirection.NORTH;
        String givenSuite = "string";

        String expectedRequest = String.format(
                "{\n"
                        + "  \"enabled\": %b,\n"
                        + "  \"address\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"streetName\": \"%s\",\n"
                        + "    \"streetNumber\": \"%s\",\n"
                        + "    \"city\": \"%s\",\n"
                        + "    \"countryCode\": \"%s\",\n"
                        + "    \"stateCode\": \"%s\",\n"
                        + "    \"zipCode\": \"%s\",\n"
                        + "    \"direction\": \"%s\",\n"
                        + "    \"suite\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenEnabled,
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        String givenResponse = String.format(
                "{\n"
                        + "  \"enabled\": %b,\n"
                        + "  \"address\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"streetName\": \"%s\",\n"
                        + "    \"streetNumber\": \"%s\",\n"
                        + "    \"city\": \"%s\",\n"
                        + "    \"countryCode\": \"%s\",\n"
                        + "    \"stateCode\": \"%s\",\n"
                        + "    \"zipCode\": \"%s\",\n"
                        + "    \"direction\": \"%s\",\n"
                        + "    \"suite\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenEnabled,
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        setUpSuccessPostRequest(
                OWNED_NUMBER_EMERGENCY_SERVICE.replace("{numberKey}", givenNumberKey), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new CallsEmergencyAddress()
                .enabled(givenEnabled)
                .address(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        var expectedResponse = new CallsEmergencyAddress()
                .enabled(givenEnabled)
                .address(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        Consumer<CallsEmergencyAddress> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.createEmergencyService(givenNumberKey, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteEmergencyServiceAddress() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        Boolean givenEnabled = false;
        String givenName = "string";
        String givenStreetName = "string";
        String givenStreetNumber = "string";
        String givenCity = "string";
        String givenCountryCode = "st";
        String givenStateCode = "st";
        String givenZipCode = "string";
        CallsDirection givenDirection = CallsDirection.NORTH;
        String givenSuite = "string";

        String givenResponse = String.format(
                "{\n"
                        + "  \"enabled\": %b,\n"
                        + "  \"address\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"streetName\": \"%s\",\n"
                        + "    \"streetNumber\": \"%s\",\n"
                        + "    \"city\": \"%s\",\n"
                        + "    \"countryCode\": \"%s\",\n"
                        + "    \"stateCode\": \"%s\",\n"
                        + "    \"zipCode\": \"%s\",\n"
                        + "    \"direction\": \"%s\",\n"
                        + "    \"suite\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenEnabled,
                givenName,
                givenStreetName,
                givenStreetNumber,
                givenCity,
                givenCountryCode,
                givenStateCode,
                givenZipCode,
                givenDirection,
                givenSuite);

        setUpNoRequestBodyDeleteRequest(
                OWNED_NUMBER_EMERGENCY_SERVICE.replace("{numberKey}", givenNumberKey),
                Collections.emptyMap(),
                givenResponse,
                200);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new CallsEmergencyAddress()
                .enabled(givenEnabled)
                .address(new CallsAddress()
                        .name(givenName)
                        .streetName(givenStreetName)
                        .streetNumber(givenStreetNumber)
                        .city(givenCity)
                        .countryCode(givenCountryCode)
                        .stateCode(givenStateCode)
                        .zipCode(givenZipCode)
                        .direction(givenDirection)
                        .suite(givenSuite));

        Consumer<CallsEmergencyAddress> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = api.deleteEmergencyService(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetEmergencyServiceAddressStatus() {
        String givenNumberKey = "E9FCDCA496035F08EEA5933702EDF745";
        CallsStatus givenStatus = CallsStatus.PENDING;
        String givenReason = "string";

        String givenResponse = String.format(
                "{\n"
                        + "  \"emergencyService\": {\n"
                        + "    \"status\": \"%s\",\n"
                        + "    \"reason\": \"%s\"\n"
                        + "  }\n"
                        + "}\n",
                givenStatus, givenReason);

        setUpSuccessGetRequest(
                OWNED_NUMBER_EMERGENCY_SERVICE_STATUS.replace("{numberKey}", givenNumberKey),
                Collections.emptyMap(),
                givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new CallsEmergencyAddressStatus()
                .emergencyService(
                        new NumbersStatusResponse().status(givenStatus).reason(givenReason));

        Consumer<CallsEmergencyAddressStatus> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = api.getEmergencyServiceStatus(givenNumberKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateVoiceRecordingConfiguration() {
        String givenNumberKey = "2838023A778DFAECDC212708F721B788";
        Boolean givenRecordingEnabled = true;

        String expectedRequest = String.format(
                "{\n"
                        + "  \"numberKey\": \"%s\",\n"
                        + "  \"recording\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenNumberKey, givenRecordingEnabled);

        String givenResponse = String.format(
                "{\n"
                        + "  \"numberKey\": \"%s\",\n"
                        + "  \"recording\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenNumberKey, givenRecordingEnabled);

        setUpSuccessPutRequest(RECORDING_CONFIGURATION, Collections.emptyMap(), expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new NumbersNumberConfigurationModel()
                .numberKey(givenNumberKey)
                .recording(new NumbersRecordingBody().enabled(givenRecordingEnabled));

        var expectedResponse = new NumbersNumberConfigurationModel()
                .numberKey(givenNumberKey)
                .recording(new NumbersRecordingBody().enabled(givenRecordingEnabled));

        Consumer<NumbersNumberConfigurationModel> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = api.updateRecordingConfiguration(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateVoiceRecordingConfiguration() {
        String givenNumberKey = "2838023A778DFAECDC212708F721B788";
        Boolean givenRecordingEnabled = true;

        String expectedRequest = String.format(
                "{\n"
                        + "  \"numberKey\": \"%s\",\n"
                        + "  \"recording\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenNumberKey, givenRecordingEnabled);

        String givenResponse = String.format(
                "{\n"
                        + "  \"numberKey\": \"%s\",\n"
                        + "  \"recording\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenNumberKey, givenRecordingEnabled);

        setUpSuccessPostRequest(RECORDING_CONFIGURATION, expectedRequest, givenResponse);

        var api = new NumbersApi(getApiClient());

        var request = new NumbersNumberConfigurationModel()
                .numberKey(givenNumberKey)
                .recording(new NumbersRecordingBody().enabled(givenRecordingEnabled));

        var expectedResponse = new NumbersNumberConfigurationModel()
                .numberKey(givenNumberKey)
                .recording(new NumbersRecordingBody().enabled(givenRecordingEnabled));

        Consumer<NumbersNumberConfigurationModel> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = api.createRecordingConfiguration(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetVoiceRecordingConfiguration() {
        String givenKey = "9A1158154DFA42CADDBD0694A4E9BDC8";
        String givenNumberKey = "2838023A778DFAECDC212708F721B788";
        Boolean givenRecordingEnabled = true;

        String givenResponse = String.format(
                "{\n"
                        + "  \"numberKey\": \"%s\",\n"
                        + "  \"recording\": {\n"
                        + "    \"enabled\": %b\n"
                        + "  }\n"
                        + "}\n",
                givenNumberKey, givenRecordingEnabled);

        setUpSuccessGetRequest(
                RECORDING_CONFIGURATION_NUMBER.replace("{key}", givenKey), Collections.emptyMap(), givenResponse);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new NumbersNumberConfigurationModel()
                .numberKey(givenNumberKey)
                .recording(new NumbersRecordingBody().enabled(givenRecordingEnabled));

        Consumer<NumbersNumberConfigurationModel> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = api.retrieveRecordingConfiguration(givenKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteVoiceRecordingConfiguration() {
        String givenKey = "9A1158154DFA42CADDBD0694A4E9BDC8";
        String givenId = "9A1158154DFA42CADDBD0694A4E9BDC8";
        String givenDownloadUrl = "https://example.com/download";
        String givenExpiresAt = "2024-01-01T00:00:00Z";

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"downloadUrl\": \""
                + givenDownloadUrl
                + "\",\n"
                + "  \"expiresAt\": \""
                + givenExpiresAt
                + "\"\n"
                + "}\n";

        setUpNoRequestBodyDeleteRequest(
                RECORDING_CONFIGURATION_NUMBER.replace("{key}", givenKey), Collections.emptyMap(), givenResponse, 200);

        var api = new NumbersApi(getApiClient());

        var expectedResponse = new NumbersDownloadResponseModel()
                .id(givenId)
                .downloadUrl(givenDownloadUrl)
                .expiresAt(givenExpiresAt);

        Consumer<NumbersDownloadResponseModel> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = api.removeRecordingConfiguration(givenKey);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBrands() {
        UUID givenId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Examples Warehouse";
        NumbersBrandStage givenStage = NumbersBrandStage.SUBMITTED;
        String givenWebsite = "https://www.example.com";
        String givenCreatedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        String givenReferenceId = "customer-defined-identifier";
        String givenLegalName = "Examples Warehouse LLC";
        String givenCity = "Seattle";
        String givenState = "WA";
        String givenStreet = "56486 915th Street";
        String givenZipCode = "98061";
        String givenCountryCode = "US";
        String givenAlternateBusinessIdValue = "858020355";
        String givenSupportEmail = "help@example.com";
        String givenSupportPhone = "41785473249";
        NumbersVertical givenVertical = NumbersVertical.RETAIL_AND_CONSUMER_PRODUCTS;
        String givenTaxId = "62-4161762";
        String givenTaxIdIssuingCountry = "US";
        NumbersBrandType givenType = NumbersBrandType.PRIVATE_COMPANY;
        String givenSort = "createdDate,desc";
        int givenPage = 0;
        int givenSize = 20;
        int givenTotalPages = 1;
        long givenTotalResults = 1L;

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"id\": \""
                + givenId
                + "\",\n"
                + "      \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "      \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "      \"name\": \""
                + givenName
                + "\",\n"
                + "      \"stage\": \"SUBMITTED\",\n"
                + "      \"website\": \""
                + givenWebsite
                + "\",\n"
                + "      \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "      \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "      \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "      \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "      \"address\": {\n"
                + "        \"city\": \""
                + givenCity
                + "\",\n"
                + "        \"state\": \""
                + givenState
                + "\",\n"
                + "        \"street\": \""
                + givenStreet
                + "\",\n"
                + "        \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "      },\n"
                + "      \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "      \"alternateBusinessId\": {\n"
                + "        \"id\": \""
                + givenAlternateBusinessIdValue
                + "\",\n"
                + "        \"type\": \"DUNS\"\n"
                + "      },\n"
                + "      \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "      \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "      \"vertical\": \"RETAIL_AND_CONSUMER_PRODUCTS\",\n"
                + "      \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "      \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\",\n"
                + "      \"type\": \"TENDLC_PRIVATE_COMPANY\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"paging\": {\n"
                + "    \"page\": "
                + givenPage
                + ",\n"
                + "    \"size\": "
                + givenSize
                + ",\n"
                + "    \"totalPages\": "
                + givenTotalPages
                + ",\n"
                + "    \"totalResults\": "
                + givenTotalResults
                + "\n"
                + "  }\n"
                + "}\n";

        setUpSuccessGetRequest(BRANDS, Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getBrands().sort(List.of(givenSort));

        Consumer<NumbersPageResponseBrand> assertions = response -> {
            then(response).isNotNull();
            then(response.getPaging()).isNotNull();
            then(response.getPaging().getPage()).isEqualTo(givenPage);
            then(response.getPaging().getSize()).isEqualTo(givenSize);
            then(response.getPaging().getTotalPages()).isEqualTo(givenTotalPages);
            then(response.getPaging().getTotalResults()).isEqualTo(givenTotalResults);
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);

            NumbersBrand brand = response.getResults().get(0);
            then(brand.getClass()).isEqualTo(NumbersPrivateCompanyBrand.class);
            then(brand.getId()).isEqualTo(givenId);
            then(brand.getApplicationId()).isEqualTo(givenApplicationId);
            then(brand.getEntityId()).isEqualTo(givenEntityId);
            then(brand.getName()).isEqualTo(givenName);
            then(brand.getStage()).isEqualTo(givenStage);
            then(brand.getWebsite()).isEqualTo(givenWebsite);
            then(brand.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(brand.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(brand.getType()).isEqualTo(givenType);

            NumbersPrivateCompanyBrand privateBrand = (NumbersPrivateCompanyBrand) brand;
            then(privateBrand.getReferenceId()).isEqualTo(givenReferenceId);
            then(privateBrand.getLegalName()).isEqualTo(givenLegalName);
            then(privateBrand.getCountryCode()).isEqualTo(givenCountryCode);
            then(privateBrand.getSupportEmail()).isEqualTo(givenSupportEmail);
            then(privateBrand.getSupportPhone()).isEqualTo(givenSupportPhone);
            then(privateBrand.getVertical()).isEqualTo(givenVertical);
            then(privateBrand.getTaxId()).isEqualTo(givenTaxId);
            then(privateBrand.getTaxIdIssuingCountry()).isEqualTo(givenTaxIdIssuingCountry);

            NumbersAddress address = privateBrand.getAddress();
            then(address).isNotNull();
            then(address.getCity()).isEqualTo(givenCity);
            then(address.getState()).isEqualTo(givenState);
            then(address.getStreet()).isEqualTo(givenStreet);
            then(address.getZipCode()).isEqualTo(givenZipCode);

            NumbersBusinessIdentifier alternateBusinessId = privateBrand.getAlternateBusinessId();
            then(alternateBusinessId).isNotNull();
            then(alternateBusinessId.getClass()).isEqualTo(NumbersDataUniversalNumberingSystemNumber.class);
            then(alternateBusinessId.getId()).isEqualTo(givenAlternateBusinessIdValue);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateBrand() {
        UUID givenId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Non Profit Company";
        NumbersBrandStage givenStage = NumbersBrandStage.SUBMITTED;
        String givenWebsite = "https://www.example.com";
        String givenCreatedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        String givenReferenceId = "customer-defined-identifier";
        String givenLegalName = "Examples Warehouse LLC";
        String givenCity = "Seattle";
        String givenState = "WA";
        String givenStreet = "56486 915th Street";
        String givenZipCode = "98061";
        String givenCountryCode = "US";
        String givenAlternateBusinessIdValue = "590900O3Z29E78HVXT56";
        String givenSupportEmail = "help@example.com";
        String givenSupportPhone = "41785473249";
        NumbersVertical givenVertical = NumbersVertical.NON_PROFIT_ORGANIZATION;
        String givenTaxId = "62-4161762";
        String givenTaxIdIssuingCountry = "US";
        NumbersBrandType givenType = NumbersBrandType.NON_PROFIT;

        String givenRequest = "{\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"website\": \""
                + givenWebsite
                + "\",\n"
                + "  \"type\": \"TENDLC_NON_PROFIT\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"alternateBusinessId\": {\n"
                + "    \"id\": \""
                + givenAlternateBusinessIdValue
                + "\",\n"
                + "    \"type\": \"LEI\"\n"
                + "  },\n"
                + "  \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"vertical\": \"NON_PROFIT_ORGANIZATION\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\"\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"stage\": \"SUBMITTED\",\n"
                + "  \"website\": \""
                + givenWebsite
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"alternateBusinessId\": {\n"
                + "    \"id\": \""
                + givenAlternateBusinessIdValue
                + "\",\n"
                + "    \"type\": \"LEI\"\n"
                + "  },\n"
                + "  \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"vertical\": \"NON_PROFIT_ORGANIZATION\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\",\n"
                + "  \"type\": \"TENDLC_NON_PROFIT\"\n"
                + "}\n";

        setUpPostRequest(BRANDS, givenRequest, givenResponse, 201);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersNonProfitBrand()
                .referenceId(givenReferenceId)
                .legalName(givenLegalName)
                .address(new NumbersAddress()
                        .city(givenCity)
                        .state(givenState)
                        .street(givenStreet)
                        .zipCode(givenZipCode))
                .countryCode(givenCountryCode)
                .alternateBusinessId(new NumbersLegalEntityIdentifier().id(givenAlternateBusinessIdValue))
                .supportEmail(givenSupportEmail)
                .supportPhone(givenSupportPhone)
                .vertical(givenVertical)
                .taxId(givenTaxId)
                .taxIdIssuingCountry(givenTaxIdIssuingCountry);
        request.name(givenName);
        request.applicationId(givenApplicationId);
        request.entityId(givenEntityId);
        request.website(givenWebsite);

        var call = api.createBrand(request);

        Consumer<NumbersBrand> assertions = response -> {
            then(response).isNotNull();
            then(response.getClass()).isEqualTo(NumbersNonProfitBrand.class);
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getWebsite()).isEqualTo(givenWebsite);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getType()).isEqualTo(givenType);

            NumbersNonProfitBrand nonProfitBrand = (NumbersNonProfitBrand) response;
            then(nonProfitBrand.getReferenceId()).isEqualTo(givenReferenceId);
            then(nonProfitBrand.getLegalName()).isEqualTo(givenLegalName);
            then(nonProfitBrand.getCountryCode()).isEqualTo(givenCountryCode);
            then(nonProfitBrand.getSupportEmail()).isEqualTo(givenSupportEmail);
            then(nonProfitBrand.getSupportPhone()).isEqualTo(givenSupportPhone);
            then(nonProfitBrand.getVertical()).isEqualTo(givenVertical);
            then(nonProfitBrand.getTaxId()).isEqualTo(givenTaxId);
            then(nonProfitBrand.getTaxIdIssuingCountry()).isEqualTo(givenTaxIdIssuingCountry);

            NumbersAddress address = nonProfitBrand.getAddress();
            then(address).isNotNull();
            then(address.getCity()).isEqualTo(givenCity);
            then(address.getState()).isEqualTo(givenState);
            then(address.getStreet()).isEqualTo(givenStreet);
            then(address.getZipCode()).isEqualTo(givenZipCode);

            NumbersBusinessIdentifier alternateBusinessId = nonProfitBrand.getAlternateBusinessId();
            then(alternateBusinessId).isNotNull();
            then(alternateBusinessId.getClass()).isEqualTo(NumbersLegalEntityIdentifier.class);
            then(alternateBusinessId.getId()).isEqualTo(givenAlternateBusinessIdValue);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBrand() {
        UUID givenId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Non Profit Company";
        NumbersBrandStage givenStage = NumbersBrandStage.SUBMITTED;
        String givenWebsite = "https://www.example.com";
        String givenCreatedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        String givenReferenceId = "customer-defined-identifier";
        String givenLegalName = "Examples Warehouse LLC";
        String givenCity = "Seattle";
        String givenState = "WA";
        String givenStreet = "56486 915th Street";
        String givenZipCode = "98061";
        String givenCountryCode = "US";
        String givenAlternateBusinessIdValue = "590900O3Z29E78HVXT56";
        String givenSupportEmail = "help@example.com";
        String givenSupportPhone = "41785473249";
        NumbersVertical givenVertical = NumbersVertical.NON_PROFIT_ORGANIZATION;
        String givenTaxId = "62-4161762";
        String givenTaxIdIssuingCountry = "US";
        NumbersBrandType givenType = NumbersBrandType.NON_PROFIT;

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"stage\": \"SUBMITTED\",\n"
                + "  \"website\": \""
                + givenWebsite
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"alternateBusinessId\": {\n"
                + "    \"id\": \""
                + givenAlternateBusinessIdValue
                + "\",\n"
                + "    \"type\": \"LEI\"\n"
                + "  },\n"
                + "  \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"vertical\": \"NON_PROFIT_ORGANIZATION\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\",\n"
                + "  \"type\": \"TENDLC_NON_PROFIT\"\n"
                + "}\n";

        setUpSuccessGetRequest(BRAND.replace("{brandId}", givenId.toString()), Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getBrand(givenId);

        Consumer<NumbersBrand> assertions = response -> {
            then(response).isNotNull();
            then(response.getClass()).isEqualTo(NumbersNonProfitBrand.class);
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getWebsite()).isEqualTo(givenWebsite);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getType()).isEqualTo(givenType);

            NumbersNonProfitBrand nonProfitBrand = (NumbersNonProfitBrand) response;
            then(nonProfitBrand.getReferenceId()).isEqualTo(givenReferenceId);
            then(nonProfitBrand.getLegalName()).isEqualTo(givenLegalName);
            then(nonProfitBrand.getCountryCode()).isEqualTo(givenCountryCode);
            then(nonProfitBrand.getSupportEmail()).isEqualTo(givenSupportEmail);
            then(nonProfitBrand.getSupportPhone()).isEqualTo(givenSupportPhone);
            then(nonProfitBrand.getVertical()).isEqualTo(givenVertical);
            then(nonProfitBrand.getTaxId()).isEqualTo(givenTaxId);
            then(nonProfitBrand.getTaxIdIssuingCountry()).isEqualTo(givenTaxIdIssuingCountry);

            NumbersAddress address = nonProfitBrand.getAddress();
            then(address).isNotNull();
            then(address.getCity()).isEqualTo(givenCity);
            then(address.getState()).isEqualTo(givenState);
            then(address.getStreet()).isEqualTo(givenStreet);
            then(address.getZipCode()).isEqualTo(givenZipCode);

            NumbersBusinessIdentifier alternateBusinessId = nonProfitBrand.getAlternateBusinessId();
            then(alternateBusinessId).isNotNull();
            then(alternateBusinessId.getClass()).isEqualTo(NumbersLegalEntityIdentifier.class);
            then(alternateBusinessId.getId()).isEqualTo(givenAlternateBusinessIdValue);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateBrand() {
        UUID givenId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Non Profit Company";
        NumbersBrandStage givenStage = NumbersBrandStage.SUBMITTED;
        String givenWebsite = "https://www.example.com";
        String givenCreatedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2021-01-19T16:17:14Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        String givenReferenceId = "customer-defined-identifier";
        String givenLegalName = "Examples Warehouse LLC";
        String givenCity = "Seattle";
        String givenState = "WA";
        String givenStreet = "56486 915th Street";
        String givenZipCode = "98061";
        String givenCountryCode = "US";
        String givenAlternateBusinessIdValue = "590900O3Z29E78HVXT56";
        String givenSupportEmail = "help@example.com";
        String givenSupportPhone = "41785473249";
        NumbersVertical givenVertical = NumbersVertical.NON_PROFIT_ORGANIZATION;
        String givenTaxId = "62-4161762";
        String givenTaxIdIssuingCountry = "US";
        NumbersBrandType givenType = NumbersBrandType.NON_PROFIT;

        String givenRequest = "{\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"website\": \""
                + givenWebsite
                + "\",\n"
                + "  \"type\": \"TENDLC_NON_PROFIT\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"alternateBusinessId\": {\n"
                + "    \"id\": \""
                + givenAlternateBusinessIdValue
                + "\",\n"
                + "    \"type\": \"LEI\"\n"
                + "  },\n"
                + "  \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"vertical\": \"NON_PROFIT_ORGANIZATION\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\"\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"stage\": \"SUBMITTED\",\n"
                + "  \"website\": \""
                + givenWebsite
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"alternateBusinessId\": {\n"
                + "    \"id\": \""
                + givenAlternateBusinessIdValue
                + "\",\n"
                + "    \"type\": \"LEI\"\n"
                + "  },\n"
                + "  \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"vertical\": \"NON_PROFIT_ORGANIZATION\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\",\n"
                + "  \"type\": \"TENDLC_NON_PROFIT\"\n"
                + "}\n";

        setUpSuccessPutRequest(BRAND.replace("{brandId}", givenId.toString()), Map.of(), givenRequest, givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersNonProfitBrand()
                .referenceId(givenReferenceId)
                .legalName(givenLegalName)
                .address(new NumbersAddress()
                        .city(givenCity)
                        .state(givenState)
                        .street(givenStreet)
                        .zipCode(givenZipCode))
                .countryCode(givenCountryCode)
                .alternateBusinessId(new NumbersLegalEntityIdentifier().id(givenAlternateBusinessIdValue))
                .supportEmail(givenSupportEmail)
                .supportPhone(givenSupportPhone)
                .vertical(givenVertical)
                .taxId(givenTaxId)
                .taxIdIssuingCountry(givenTaxIdIssuingCountry);
        request.name(givenName);
        request.applicationId(givenApplicationId);
        request.entityId(givenEntityId);
        request.website(givenWebsite);

        var call = api.updateBrand(givenId, request);

        Consumer<NumbersBrand> assertions = response -> {
            then(response).isNotNull();
            then(response.getClass()).isEqualTo(NumbersNonProfitBrand.class);
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getWebsite()).isEqualTo(givenWebsite);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getType()).isEqualTo(givenType);

            NumbersNonProfitBrand nonProfitBrand = (NumbersNonProfitBrand) response;
            then(nonProfitBrand.getReferenceId()).isEqualTo(givenReferenceId);
            then(nonProfitBrand.getLegalName()).isEqualTo(givenLegalName);
            then(nonProfitBrand.getCountryCode()).isEqualTo(givenCountryCode);
            then(nonProfitBrand.getSupportEmail()).isEqualTo(givenSupportEmail);
            then(nonProfitBrand.getSupportPhone()).isEqualTo(givenSupportPhone);
            then(nonProfitBrand.getVertical()).isEqualTo(givenVertical);
            then(nonProfitBrand.getTaxId()).isEqualTo(givenTaxId);
            then(nonProfitBrand.getTaxIdIssuingCountry()).isEqualTo(givenTaxIdIssuingCountry);

            NumbersAddress address = nonProfitBrand.getAddress();
            then(address).isNotNull();
            then(address.getCity()).isEqualTo(givenCity);
            then(address.getState()).isEqualTo(givenState);
            then(address.getStreet()).isEqualTo(givenStreet);
            then(address.getZipCode()).isEqualTo(givenZipCode);

            NumbersBusinessIdentifier alternateBusinessId = nonProfitBrand.getAlternateBusinessId();
            then(alternateBusinessId).isNotNull();
            then(alternateBusinessId.getClass()).isEqualTo(NumbersLegalEntityIdentifier.class);
            then(alternateBusinessId.getId()).isEqualTo(givenAlternateBusinessIdValue);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteBrand() {
        UUID givenBrandId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");

        setUpNoResponseBodyDeleteRequest(BRAND.replace("{brandId}", givenBrandId.toString()), Map.of(), 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.deleteBrand(givenBrandId);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldRegisterBrand() {
        UUID givenBrandId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");

        setUpNoBodyPostRequest(REGISTER_BRAND.replace("{brandId}", givenBrandId.toString()), Map.of(), 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.registerBrand(givenBrandId);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldGetBrandRegistrarStatuses() {
        UUID givenBrandId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");
        NumbersBrandRegistrar givenRegistrar = NumbersBrandRegistrar.CAMPAIGN_REGISTRY;
        NumbersBrandRegistrationStatusPublic givenState = NumbersBrandRegistrationStatusPublic.REJECTED;
        NumbersBrandStatus.BrandIdentityStatusEnum givenBrandIdentityStatus =
                NumbersBrandStatus.BrandIdentityStatusEnum.UNVERIFIED;
        NumbersBrandStatus.BrandAuthenticationStatusEnum givenBrandAuthenticationStatus =
                NumbersBrandStatus.BrandAuthenticationStatusEnum.PENDING;
        String givenRejectionReason = "Invalid country code.";

        String givenResponse = "[\n"
                + "  {\n"
                + "    \"registrar\": \"CAMPAIGN_REGISTRY\",\n"
                + "    \"state\": \"REJECTED\",\n"
                + "    \"brandIdentityStatus\": \"UNVERIFIED\",\n"
                + "    \"brandAuthenticationStatus\": \"PENDING\",\n"
                + "    \"rejectionReason\": \""
                + givenRejectionReason
                + "\"\n"
                + "  }\n"
                + "]\n";

        setUpSuccessGetRequest(
                BRAND_REGISTRAR_STATUSES.replace("{brandId}", givenBrandId.toString()), Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getBrandRegistrarStatuses(givenBrandId);

        Consumer<List<NumbersBrandStatus>> assertions = response -> {
            then(response).isNotNull();
            then(response.size()).isEqualTo(1);

            NumbersBrandStatus status = response.get(0);
            then(status.getRegistrar()).isEqualTo(givenRegistrar);
            then(status.getState()).isEqualTo(givenState);
            then(status.getBrandIdentityStatus()).isEqualTo(givenBrandIdentityStatus);
            then(status.getBrandAuthenticationStatus()).isEqualTo(givenBrandAuthenticationStatus);
            then(status.getRejectionReason()).isEqualTo(givenRejectionReason);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRequestBrandAuthVerification() {
        UUID givenBrandId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");

        setUpNoBodyPostRequest(BRAND_AUTH_VERIFICATION.replace("{brandId}", givenBrandId.toString()), Map.of(), 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.brandAuthVerification(givenBrandId);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldResend2faMailBrandAuth() {
        UUID givenBrandId = UUID.fromString("79ff0424-7201-45ca-bcbe-9989535fa2ec");

        setUpNoBodyPostRequest(BRAND_RESEND_2FA.replace("{brandId}", givenBrandId.toString()), Map.of(), 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.resend2faMailBrandAuth(givenBrandId);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldReceiveBrandStatusUpdate() {
        UUID givenBrandId = UUID.fromString("0579c038-55f2-11ee-9458-325096b39f47");
        String givenReceivedAtString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenReceivedAt = OffsetDateTime.parse(givenReceivedAtString);
        NumbersWebhookBrandRegistrationStatus givenBrandStatus = NumbersWebhookBrandRegistrationStatus.FAILURE;
        String givenRejectionReason = "Tax id does not match with the company name or business type.";
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"BRAND_STATUS_UPDATE\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "        \"brandStatus\": \"FAILURE\",\n"
                + "        \"rejectionReasons\": [\n"
                + "          \""
                + givenRejectionReason
                + "\"\n"
                + "        ]\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        NumbersBrandRegistrationWebhookResponse requestBody =
                json.deserialize(givenRequest, NumbersBrandRegistrationWebhookResponse.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        NumbersBrandRegistrationWebhookMessage message =
                requestBody.getResults().get(0);
        then(message.getEvent()).isEqualTo(NumbersBrandRegistrationWebhookMessage.EventEnum.BRAND_STATUS_UPDATE);
        then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(message.getPlatform()).isNotNull();
        then(message.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(message.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        NumbersBrandRegistrationWebhookContent content = message.getContent();
        then(content).isNotNull();
        then(content.getBrandId()).isEqualTo(givenBrandId);
        then(content.getBrandStatus()).isEqualTo(givenBrandStatus);
        then(content.getRejectionReasons()).isNotNull();
        then(content.getRejectionReasons().size()).isEqualTo(1);
        then(content.getRejectionReasons().get(0)).isEqualTo(givenRejectionReason);
    }

    @Test
    void shouldReceiveBrandAuth2faUpdate() {
        UUID givenBrandId = UUID.fromString("0579c038-55f2-11ee-9458-325096b39f47");
        String givenReceivedAtString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenReceivedAt = OffsetDateTime.parse(givenReceivedAtString);
        NumbersBrandAuthUpdateWebhookContent.BrandAuthUpdateEnum givenBrandAuthUpdate =
                NumbersBrandAuthUpdateWebhookContent.BrandAuthUpdateEnum.SEND;
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"BRAND_AUTH_UPDATE\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "        \"brandAuthUpdate\": \"BRAND_EMAIL_2FA_SEND\"\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        NumbersBrandAuthUpdateWebhookResponse requestBody =
                json.deserialize(givenRequest, NumbersBrandAuthUpdateWebhookResponse.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        NumbersBrandAuthUpdateWebhookMessage message = requestBody.getResults().get(0);
        then(message.getEvent()).isEqualTo(NumbersBrandAuthUpdateWebhookMessage.EventEnum.BRAND_AUTH_UPDATE);
        then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(message.getPlatform()).isNotNull();
        then(message.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(message.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        NumbersBrandAuthUpdateWebhookContent content = message.getContent();
        then(content).isNotNull();
        then(content.getBrandId()).isEqualTo(givenBrandId);
        then(content.getBrandAuthUpdate()).isEqualTo(givenBrandAuthUpdate);
    }

    @Test
    void shouldGetBrandVets() {
        UUID givenBrandId = UUID.fromString("0e9bcbb3-096e-49f9-aeea-7a13a201eff5");
        UUID givenVetId = UUID.fromString("ff189fb0-ad19-4670-b3e8-9afb5de5695d");
        Integer givenScore = 0;
        String givenVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenVettedDate = OffsetDateTime.parse(givenVettedDateString);
        String givenEnhancedVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenEnhancedVettedDate = OffsetDateTime.parse(givenEnhancedVettedDateString);
        NumbersBrandVetStatus givenStatus = NumbersBrandVetStatus.PENDING;
        NumbersVettingType givenType = NumbersVettingType.STANDARD;
        Boolean givenImported = true;
        NumbersVettingProvider givenImportedVetProvider = NumbersVettingProvider.AEGIS_MOBILE;
        String givenSort = "vettedDate,desc";
        int givenPage = 0;
        int givenSize = 1;
        int givenTotalPages = 0;
        long givenTotalResults = 0L;

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "      \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "      \"score\": "
                + givenScore
                + ",\n"
                + "      \"vettedDate\": \""
                + givenVettedDateString
                + "\",\n"
                + "      \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateString
                + "\",\n"
                + "      \"status\": \"PENDING\",\n"
                + "      \"type\": \"STANDARD\",\n"
                + "      \"imported\": true,\n"
                + "      \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"paging\": {\n"
                + "    \"page\": "
                + givenPage
                + ",\n"
                + "    \"size\": "
                + givenSize
                + ",\n"
                + "    \"totalPages\": "
                + givenTotalPages
                + ",\n"
                + "    \"totalResults\": "
                + givenTotalResults
                + "\n"
                + "  }\n"
                + "}\n";

        setUpSuccessGetRequest(BRAND_VETS.replace("{brandId}", givenBrandId.toString()), Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getBrandVets(givenBrandId).sort(List.of(givenSort));

        Consumer<NumbersPageResponseBrandVet> assertions = response -> {
            then(response).isNotNull();
            then(response.getPaging()).isNotNull();
            then(response.getPaging().getPage()).isEqualTo(givenPage);
            then(response.getPaging().getSize()).isEqualTo(givenSize);
            then(response.getPaging().getTotalPages()).isEqualTo(givenTotalPages);
            then(response.getPaging().getTotalResults()).isEqualTo(givenTotalResults);
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);

            NumbersBrandVet vet = response.getResults().get(0);
            then(vet.getVetId()).isEqualTo(givenVetId);
            then(vet.getBrandId()).isEqualTo(givenBrandId);
            then(vet.getScore()).isEqualTo(givenScore);
            then(vet.getVettedDate()).isEqualTo(givenVettedDate);
            then(vet.getEnhancedVettedDate()).isEqualTo(givenEnhancedVettedDate);
            then(vet.getStatus()).isEqualTo(givenStatus);
            then(vet.getType()).isEqualTo(givenType);
            then(vet.getImported()).isEqualTo(givenImported);
            then(vet.getImportedVetProvider()).isEqualTo(givenImportedVetProvider);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldVetBrand() {
        UUID givenBrandId = UUID.fromString("0e9bcbb3-096e-49f9-aeea-7a13a201eff5");
        UUID givenVetId = UUID.fromString("ff189fb0-ad19-4670-b3e8-9afb5de5695d");
        Integer givenScore = 0;
        String givenVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenVettedDate = OffsetDateTime.parse(givenVettedDateString);
        String givenVettedDateSerialized = "2019-08-24T14:15:22.000+0000";
        String givenEnhancedVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenEnhancedVettedDate = OffsetDateTime.parse(givenEnhancedVettedDateString);
        String givenEnhancedVettedDateSerialized = "2019-08-24T14:15:22.000+0000";
        NumbersBrandVetStatus givenStatus = NumbersBrandVetStatus.PENDING;
        NumbersVettingType givenType = NumbersVettingType.STANDARD;
        Boolean givenImported = true;
        NumbersVettingProvider givenImportedVetProvider = NumbersVettingProvider.AEGIS_MOBILE;

        String givenRequest = "{\n"
                + "  \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"score\": "
                + givenScore
                + ",\n"
                + "  \"vettedDate\": \""
                + givenVettedDateSerialized
                + "\",\n"
                + "  \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateSerialized
                + "\",\n"
                + "  \"status\": \"PENDING\",\n"
                + "  \"type\": \"STANDARD\",\n"
                + "  \"imported\": true,\n"
                + "  \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"score\": "
                + givenScore
                + ",\n"
                + "  \"vettedDate\": \""
                + givenVettedDateString
                + "\",\n"
                + "  \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateString
                + "\",\n"
                + "  \"status\": \"PENDING\",\n"
                + "  \"type\": \"STANDARD\",\n"
                + "  \"imported\": true,\n"
                + "  \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "}\n";

        setUpPostRequest(BRAND_VETS.replace("{brandId}", givenBrandId.toString()), givenRequest, givenResponse, 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersBrandVet()
                .vetId(givenVetId)
                .brandId(givenBrandId)
                .score(givenScore)
                .vettedDate(givenVettedDate)
                .enhancedVettedDate(givenEnhancedVettedDate)
                .status(givenStatus)
                .type(givenType)
                .imported(givenImported)
                .importedVetProvider(givenImportedVetProvider);

        var call = api.vetBrand(givenBrandId, request);

        Consumer<NumbersBrandVet> assertions = response -> {
            then(response).isNotNull();
            then(response.getVetId()).isEqualTo(givenVetId);
            then(response.getBrandId()).isEqualTo(givenBrandId);
            then(response.getScore()).isEqualTo(givenScore);
            then(response.getVettedDate()).isEqualTo(givenVettedDate);
            then(response.getEnhancedVettedDate()).isEqualTo(givenEnhancedVettedDate);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getType()).isEqualTo(givenType);
            then(response.getImported()).isEqualTo(givenImported);
            then(response.getImportedVetProvider()).isEqualTo(givenImportedVetProvider);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBrandVet() {
        UUID givenBrandId = UUID.fromString("0e9bcbb3-096e-49f9-aeea-7a13a201eff5");
        UUID givenVetId = UUID.fromString("ff189fb0-ad19-4670-b3e8-9afb5de5695d");
        Integer givenScore = 0;
        String givenVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenVettedDate = OffsetDateTime.parse(givenVettedDateString);
        String givenEnhancedVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenEnhancedVettedDate = OffsetDateTime.parse(givenEnhancedVettedDateString);
        NumbersBrandVetStatus givenStatus = NumbersBrandVetStatus.PENDING;
        NumbersVettingType givenType = NumbersVettingType.STANDARD;
        Boolean givenImported = true;
        NumbersVettingProvider givenImportedVetProvider = NumbersVettingProvider.AEGIS_MOBILE;

        String givenResponse = "{\n"
                + "  \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"score\": "
                + givenScore
                + ",\n"
                + "  \"vettedDate\": \""
                + givenVettedDateString
                + "\",\n"
                + "  \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateString
                + "\",\n"
                + "  \"status\": \"PENDING\",\n"
                + "  \"type\": \"STANDARD\",\n"
                + "  \"imported\": true,\n"
                + "  \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "}\n";

        setUpSuccessGetRequest(
                BRAND_VET.replace("{brandId}", givenBrandId.toString()).replace("{vetId}", givenVetId.toString()),
                Map.of(),
                givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getBrandVet(givenBrandId, givenVetId);

        Consumer<NumbersBrandVet> assertions = response -> {
            then(response).isNotNull();
            then(response.getVetId()).isEqualTo(givenVetId);
            then(response.getBrandId()).isEqualTo(givenBrandId);
            then(response.getScore()).isEqualTo(givenScore);
            then(response.getVettedDate()).isEqualTo(givenVettedDate);
            then(response.getEnhancedVettedDate()).isEqualTo(givenEnhancedVettedDate);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getType()).isEqualTo(givenType);
            then(response.getImported()).isEqualTo(givenImported);
            then(response.getImportedVetProvider()).isEqualTo(givenImportedVetProvider);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateBrandVet() {
        UUID givenBrandId = UUID.fromString("0e9bcbb3-096e-49f9-aeea-7a13a201eff5");
        UUID givenVetId = UUID.fromString("ff189fb0-ad19-4670-b3e8-9afb5de5695d");
        Integer givenScore = 0;
        String givenVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenVettedDate = OffsetDateTime.parse(givenVettedDateString);
        String givenVettedDateSerialized = "2019-08-24T14:15:22.000+0000";
        String givenEnhancedVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenEnhancedVettedDate = OffsetDateTime.parse(givenEnhancedVettedDateString);
        String givenEnhancedVettedDateSerialized = "2019-08-24T14:15:22.000+0000";
        NumbersBrandVetStatus givenStatus = NumbersBrandVetStatus.PENDING;
        NumbersVettingType givenType = NumbersVettingType.STANDARD;
        Boolean givenImported = true;
        NumbersVettingProvider givenImportedVetProvider = NumbersVettingProvider.AEGIS_MOBILE;

        String givenRequest = "{\n"
                + "  \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"score\": "
                + givenScore
                + ",\n"
                + "  \"vettedDate\": \""
                + givenVettedDateSerialized
                + "\",\n"
                + "  \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateSerialized
                + "\",\n"
                + "  \"status\": \"PENDING\",\n"
                + "  \"type\": \"STANDARD\",\n"
                + "  \"imported\": true,\n"
                + "  \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"score\": "
                + givenScore
                + ",\n"
                + "  \"vettedDate\": \""
                + givenVettedDateString
                + "\",\n"
                + "  \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateString
                + "\",\n"
                + "  \"status\": \"PENDING\",\n"
                + "  \"type\": \"STANDARD\",\n"
                + "  \"imported\": true,\n"
                + "  \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "}\n";

        setUpSuccessPutRequest(
                BRAND_VET.replace("{brandId}", givenBrandId.toString()).replace("{vetId}", givenVetId.toString()),
                Map.of(),
                givenRequest,
                givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersBrandVet()
                .vetId(givenVetId)
                .brandId(givenBrandId)
                .score(givenScore)
                .vettedDate(givenVettedDate)
                .enhancedVettedDate(givenEnhancedVettedDate)
                .status(givenStatus)
                .type(givenType)
                .imported(givenImported)
                .importedVetProvider(givenImportedVetProvider);

        var call = api.updateBrandVet(givenBrandId, givenVetId, request);

        Consumer<NumbersBrandVet> assertions = response -> {
            then(response).isNotNull();
            then(response.getVetId()).isEqualTo(givenVetId);
            then(response.getBrandId()).isEqualTo(givenBrandId);
            then(response.getScore()).isEqualTo(givenScore);
            then(response.getVettedDate()).isEqualTo(givenVettedDate);
            then(response.getEnhancedVettedDate()).isEqualTo(givenEnhancedVettedDate);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getType()).isEqualTo(givenType);
            then(response.getImported()).isEqualTo(givenImported);
            then(response.getImportedVetProvider()).isEqualTo(givenImportedVetProvider);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldImportExistingBrandVet() {
        UUID givenBrandId = UUID.fromString("0e9bcbb3-096e-49f9-aeea-7a13a201eff5");
        UUID givenVetId = UUID.fromString("ff189fb0-ad19-4670-b3e8-9afb5de5695d");
        String givenExternalVetId = "string";
        String givenVettingToken = "string";
        Integer givenScore = 0;
        String givenVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenVettedDate = OffsetDateTime.parse(givenVettedDateString);
        String givenEnhancedVettedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenEnhancedVettedDate = OffsetDateTime.parse(givenEnhancedVettedDateString);
        NumbersBrandVetStatus givenStatus = NumbersBrandVetStatus.PENDING;
        NumbersVettingType givenType = NumbersVettingType.STANDARD;
        Boolean givenImported = true;
        NumbersVettingProvider givenImportedVetProvider = NumbersVettingProvider.AEGIS_MOBILE;

        String givenRequest = "{\n"
                + "  \"type\": \"AEGIS_MOBILE\",\n"
                + "  \"externalVetId\": \""
                + givenExternalVetId
                + "\",\n"
                + "  \"vettingToken\": \""
                + givenVettingToken
                + "\"\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"score\": "
                + givenScore
                + ",\n"
                + "  \"vettedDate\": \""
                + givenVettedDateString
                + "\",\n"
                + "  \"enhancedVettedDate\": \""
                + givenEnhancedVettedDateString
                + "\",\n"
                + "  \"status\": \"PENDING\",\n"
                + "  \"type\": \"STANDARD\",\n"
                + "  \"imported\": true,\n"
                + "  \"importedVetProvider\": \"AEGIS_MOBILE\"\n"
                + "}\n";

        setUpSuccessPutRequest(
                BRAND_VET_IMPORT.replace("{brandId}", givenBrandId.toString()), Map.of(), givenRequest, givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersAegisVetImportRequest()
                .externalVetId(givenExternalVetId)
                .vettingToken(givenVettingToken);

        var call = api.importExistingBrandVet(givenBrandId, request);

        Consumer<NumbersBrandVet> assertions = response -> {
            then(response).isNotNull();
            then(response.getVetId()).isEqualTo(givenVetId);
            then(response.getBrandId()).isEqualTo(givenBrandId);
            then(response.getScore()).isEqualTo(givenScore);
            then(response.getVettedDate()).isEqualTo(givenVettedDate);
            then(response.getEnhancedVettedDate()).isEqualTo(givenEnhancedVettedDate);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getType()).isEqualTo(givenType);
            then(response.getImported()).isEqualTo(givenImported);
            then(response.getImportedVetProvider()).isEqualTo(givenImportedVetProvider);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBrandEnhancedVetReport() {
        UUID givenBrandId = UUID.fromString("0e9bcbb3-096e-49f9-aeea-7a13a201eff5");
        UUID givenVetId = UUID.fromString("ff189fb0-ad19-4670-b3e8-9afb5de5695d");
        String givenFileContent = "Test vet report content";

        setUpGetRequestOctet(
                BRAND_VET_REPORT
                        .replace("{brandId}", givenBrandId.toString())
                        .replace("{vetId}", givenVetId.toString()),
                Map.of(),
                givenFileContent,
                200);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getBrandEnhancedVetReport(givenBrandId, givenVetId);
        testSuccessfulCallWithFileResult(call::execute);
    }

    @Test
    void shouldReceiveBrandVetUpdate() {
        UUID givenVetId = UUID.fromString("20ef4b12-55f2-11ee-bfc2-325096b39f47");
        UUID givenBrandId = UUID.fromString("0579c038-55f2-11ee-9458-325096b39f47");
        String givenReceivedAtString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenReceivedAt = OffsetDateTime.parse(givenReceivedAtString);
        Integer givenVettingScore = 80;
        NumbersWebhookBrandVetStatus givenBrandVettingStatus = NumbersWebhookBrandVetStatus.SUCCESS;
        NumbersWebhookBrandVettingType givenVetType = NumbersWebhookBrandVettingType.STANDARD;
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"BRAND_VET_UPDATE\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"vetId\": \""
                + givenVetId
                + "\",\n"
                + "        \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "        \"vettingScore\": "
                + givenVettingScore
                + ",\n"
                + "        \"brandVettingStatus\": \"SUCCESS\",\n"
                + "        \"vetType\": \"STANDARD\"\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        NumbersBrandVetStatusWebhookResponse requestBody =
                json.deserialize(givenRequest, NumbersBrandVetStatusWebhookResponse.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        NumbersBrandVetStatusWebhookMessage message = requestBody.getResults().get(0);
        then(message.getEvent()).isEqualTo(NumbersBrandVetStatusWebhookMessage.EventEnum.BRAND_VET_UPDATE);
        then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(message.getPlatform()).isNotNull();
        then(message.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(message.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        NumbersBrandVetStatusWebhookContent content = message.getContent();
        then(content).isNotNull();
        then(content.getVetId()).isEqualTo(givenVetId);
        then(content.getBrandId()).isEqualTo(givenBrandId);
        then(content.getVettingScore()).isEqualTo(givenVettingScore);
        then(content.getBrandVettingStatus()).isEqualTo(givenBrandVettingStatus);
        then(content.getVetType()).isEqualTo(givenVetType);
    }

    @Test
    void shouldGetCampaigns() {
        UUID givenId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenReferenceId = "customer-defined-identifier";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Promo";
        String givenCreatedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        NumbersCampaignStage givenStage = NumbersCampaignStage.DRAFT;
        UUID givenPriorityId = UUID.fromString("46de4f63-390c-4253-9869-da282096691b");
        String givenPrioritySubmittedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenPrioritySubmittedDate = OffsetDateTime.parse(givenPrioritySubmittedDateString);
        UUID givenBrandId = UUID.fromString("a0c63335-f841-4d43-9ef8-e0765a233f29");
        String givenProgramSummary = "A mix of promotional and informational messaging.";
        String givenCustomerCareEmail = "examples@example.com";
        String givenConfirmationMessage =
                "Example promotional-marketing. Msg&data rates may apply. Reply HELP for help, STOP to cancel.";
        String givenExampleMessage = "Come in today and get 10% OFF today!";
        String givenHelpMessage =
                "Example promotional-marketing: Help at textsupport@example.com or 18889997777. Msg&data rates may apply. Reply STOP to cancel.";
        String givenStopMessage =
                "Example promotional-marketing: You have been unsubscribed, no more messages will be sent.";
        String givenTermsAndConditionsUrl = "https://www.example.com/terms-and-conditions";
        String givenOptInCallToAction = "Text MESSAGE to subscribe";
        String givenOptInKeyword = "MESSAGE";
        String givenBrandPreviewBrandId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        String givenBrandPreviewBrandName = "Examples Warehouse";
        String givenCustomerCarePhone = "41785473249";
        Boolean givenLowVolume = false;
        NumbersTenDlcUseCase givenUseCase1 = NumbersTenDlcUseCase.PROMOTIONAL_MARKETING;
        NumbersTenDlcUseCase givenUseCase2 = NumbersTenDlcUseCase.EDUCATION;
        String givenNumberKey = "2C958BA98F9EBACA4F9357D81BFBF47B";
        String givenNumber = "41793026727";
        String givenCountryCode = "US";
        Boolean givenAgeGated = true;
        Boolean givenDirectLending = false;
        Boolean givenEmbeddedLink = true;
        Boolean givenEmbeddedPhone = false;
        NumbersCampaignType givenType = NumbersCampaignType.TEN_DIGIT_LONG_CODE;
        String givenRejectionReason1 = "Example rejection reason 1";
        String givenRejectionReason2 = "Example rejection reason 2";
        String givenRejectionDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenRejectionDate = OffsetDateTime.parse(givenRejectionDateString);
        String givenAppealReason = "Example appeal reason";
        String givenAppealDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenAppealDate = OffsetDateTime.parse(givenAppealDateString);
        int givenPage = 0;
        int givenSize = 20;
        int givenTotalPages = 1;
        long givenTotalResults = 1L;
        String givenSort = "createdDate,desc";

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"id\": \""
                + givenId
                + "\",\n"
                + "      \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "      \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "      \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "      \"name\": \""
                + givenName
                + "\",\n"
                + "      \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "      \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "      \"stage\": \"DRAFT\",\n"
                + "      \"priority\": {\n"
                + "        \"priorityId\": \""
                + givenPriorityId
                + "\",\n"
                + "        \"submittedDate\": \""
                + givenPrioritySubmittedDateString
                + "\"\n"
                + "      },\n"
                + "      \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "      \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "      \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "      \"confirmationMessage\": \""
                + givenConfirmationMessage
                + "\",\n"
                + "      \"exampleMessages\": [\n"
                + "        \""
                + givenExampleMessage
                + "\"\n"
                + "      ],\n"
                + "      \"helpMessage\": \""
                + givenHelpMessage
                + "\",\n"
                + "      \"stopMessage\": \""
                + givenStopMessage
                + "\",\n"
                + "      \"messageTypes\": [\n"
                + "        \"SMS\",\n"
                + "        \"MMS\"\n"
                + "      ],\n"
                + "      \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "      \"optIns\": {\n"
                + "        \"keyword\": {\n"
                + "          \"callToAction\": \""
                + givenOptInCallToAction
                + "\",\n"
                + "          \"keywords\": [\n"
                + "            \""
                + givenOptInKeyword
                + "\"\n"
                + "          ]\n"
                + "        }\n"
                + "      },\n"
                + "      \"brandPreview\": {\n"
                + "        \"brandId\": \""
                + givenBrandPreviewBrandId
                + "\",\n"
                + "        \"brandName\": \""
                + givenBrandPreviewBrandName
                + "\"\n"
                + "      },\n"
                + "      \"customerCarePhone\": \""
                + givenCustomerCarePhone
                + "\",\n"
                + "      \"lowVolume\": false,\n"
                + "      \"useCase\": null,\n"
                + "      \"useCases\": [\n"
                + "        \"PROMOTIONAL_MARKETING\",\n"
                + "        \"EDUCATION\"\n"
                + "      ],\n"
                + "      \"numberKeys\": [\n"
                + "        \""
                + givenNumberKey
                + "\"\n"
                + "      ],\n"
                + "      \"numberPreviews\": [\n"
                + "        {\n"
                + "          \"numberKey\": \""
                + givenNumberKey
                + "\",\n"
                + "          \"number\": \""
                + givenNumber
                + "\",\n"
                + "          \"countryCode\": \""
                + givenCountryCode
                + "\"\n"
                + "        }\n"
                + "      ],\n"
                + "      \"ageGated\": true,\n"
                + "      \"directLending\": false,\n"
                + "      \"embeddedLink\": true,\n"
                + "      \"embeddedPhone\": false,\n"
                + "      \"type\": \"TEN_DIGIT_LONG_CODE\",\n"
                + "      \"campaignFeedback\": {\n"
                + "        \"rejectionReasons\": [\n"
                + "          \""
                + givenRejectionReason1
                + "\",\n"
                + "          \""
                + givenRejectionReason2
                + "\"\n"
                + "        ],\n"
                + "        \"rejectionDate\": \""
                + givenRejectionDateString
                + "\"\n"
                + "      },\n"
                + "      \"appealData\": {\n"
                + "        \"appealReason\": \""
                + givenAppealReason
                + "\",\n"
                + "        \"appealDate\": \""
                + givenAppealDateString
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"paging\": {\n"
                + "    \"page\": "
                + givenPage
                + ",\n"
                + "    \"size\": "
                + givenSize
                + ",\n"
                + "    \"totalPages\": "
                + givenTotalPages
                + ",\n"
                + "    \"totalResults\": "
                + givenTotalResults
                + "\n"
                + "  }\n"
                + "}\n";

        setUpSuccessGetRequest(CAMPAIGNS, Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getCampaigns().sort(List.of(givenSort));

        Consumer<NumbersPageResponseCampaign> assertions = response -> {
            then(response).isNotNull();
            then(response.getPaging()).isNotNull();
            then(response.getPaging().getPage()).isEqualTo(givenPage);
            then(response.getPaging().getSize()).isEqualTo(givenSize);
            then(response.getPaging().getTotalPages()).isEqualTo(givenTotalPages);
            then(response.getPaging().getTotalResults()).isEqualTo(givenTotalResults);
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);

            NumbersCampaign campaign = response.getResults().get(0);
            then(campaign).isNotNull();
            then(campaign.getClass()).isEqualTo(NumbersTenDlcCampaign.class);
            then(campaign.getId()).isEqualTo(givenId);
            then(campaign.getApplicationId()).isEqualTo(givenApplicationId);
            then(campaign.getEntityId()).isEqualTo(givenEntityId);
            then(campaign.getName()).isEqualTo(givenName);
            then(campaign.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(campaign.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(campaign.getStage()).isEqualTo(givenStage);
            then(campaign.getType()).isEqualTo(givenType);

            NumbersPriorityInfo priority = campaign.getPriority();
            then(priority).isNotNull();
            then(priority.getPriorityId()).isEqualTo(givenPriorityId);
            then(priority.getSubmittedDate()).isEqualTo(givenPrioritySubmittedDate);

            NumbersCampaignFeedback feedback = campaign.getCampaignFeedback();
            then(feedback).isNotNull();
            then(feedback.getRejectionReasons()).containsExactly(givenRejectionReason1, givenRejectionReason2);
            then(feedback.getRejectionDate()).isEqualTo(givenRejectionDate);

            NumbersTenDlcCampaign tenDlcCampaign = (NumbersTenDlcCampaign) campaign;
            then(tenDlcCampaign.getBrandId()).isEqualTo(givenBrandId);
            then(tenDlcCampaign.getProgramSummary()).isEqualTo(givenProgramSummary);
            then(tenDlcCampaign.getCustomerCareEmail()).isEqualTo(givenCustomerCareEmail);
            then(tenDlcCampaign.getConfirmationMessage()).isEqualTo(givenConfirmationMessage);
            then(tenDlcCampaign.getExampleMessages()).containsExactly(givenExampleMessage);
            then(tenDlcCampaign.getHelpMessage()).isEqualTo(givenHelpMessage);
            then(tenDlcCampaign.getStopMessage()).isEqualTo(givenStopMessage);
            then(tenDlcCampaign.getTermsAndConditionsUrl()).isEqualTo(givenTermsAndConditionsUrl);
            then(tenDlcCampaign.getCustomerCarePhone()).isEqualTo(givenCustomerCarePhone);
            then(tenDlcCampaign.getLowVolume()).isEqualTo(givenLowVolume);
            then(tenDlcCampaign.getUseCases()).containsExactlyInAnyOrder(givenUseCase1, givenUseCase2);
            then(tenDlcCampaign.getAgeGated()).isEqualTo(givenAgeGated);
            then(tenDlcCampaign.getDirectLending()).isEqualTo(givenDirectLending);
            then(tenDlcCampaign.getEmbeddedLink()).isEqualTo(givenEmbeddedLink);
            then(tenDlcCampaign.getEmbeddedPhone()).isEqualTo(givenEmbeddedPhone);
            then(tenDlcCampaign.getNumberKeys()).containsExactly(givenNumberKey);

            NumbersOptIns optIns = tenDlcCampaign.getOptIns();
            then(optIns).isNotNull();
            then(optIns.getKeyword()).isNotNull();
            then(optIns.getKeyword().getCallToAction()).isEqualTo(givenOptInCallToAction);
            then(optIns.getKeyword().getKeywords()).containsExactly(givenOptInKeyword);

            NumbersBrandPreview brandPreview = tenDlcCampaign.getBrandPreview();
            then(brandPreview).isNotNull();
            then(brandPreview.getBrandId()).isEqualTo(givenBrandPreviewBrandId);
            then(brandPreview.getBrandName()).isEqualTo(givenBrandPreviewBrandName);

            then(tenDlcCampaign.getNumberPreviews()).isNotNull();
            then(tenDlcCampaign.getNumberPreviews().size()).isEqualTo(1);
            NumbersNumberPreview numberPreview =
                    tenDlcCampaign.getNumberPreviews().iterator().next();
            then(numberPreview.getNumberKey()).isEqualTo(givenNumberKey);
            then(numberPreview.getNumber()).isEqualTo(givenNumber);
            then(numberPreview.getCountryCode()).isEqualTo(givenCountryCode);

            NumbersAppealData appealData = tenDlcCampaign.getAppealData();
            then(appealData).isNotNull();
            then(appealData.getAppealReason()).isEqualTo(givenAppealReason);
            then(appealData.getAppealDate()).isEqualTo(givenAppealDate);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateCampaign() {
        UUID givenId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenReferenceId = "customer-defined-identifier";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Promo";
        String givenNumber = "41785473249";
        UUID givenBrandId = UUID.fromString("a0c63335-f841-4d43-9ef8-e0765a233f29");
        String givenConfirmationMessage =
                "Example promotional-marketing. Msg&data rates may apply. Reply HELP for help, STOP to cancel.";
        String givenCustomerCarePhone = "41785473249";
        String givenCustomerCareEmail = "examples@example.com";
        String givenExampleMessage = "Come in today and get 10% OFF today!";
        String givenHelpMessage =
                "Example promotional-marketing: Help at textsupport@example.com or 18889997777. Msg&data rates may apply. Reply STOP to cancel.";
        Boolean givenLowVolume = false;
        String givenProgramSummary = "A mix of promotional and informational messaging.";
        String givenStopMessage =
                "Example promotional-marketing: You have been unsubscribed, no more messages will be sent.";
        String givenTermsAndConditionsUrl = "https://www.example.com/terms-and-conditions";
        NumbersTenDlcUseCase givenUseCase1 = NumbersTenDlcUseCase.PROMOTIONAL_MARKETING;
        NumbersTenDlcUseCase givenUseCase2 = NumbersTenDlcUseCase.EDUCATION;
        String givenOptInCallToAction =
                "Text MESSAGE to subscribe to recurring promotional marketing alerts. Msg&DataRates may apply. Text HELP for help, STOP to opt out. Terms and PP https://www.example.om/terms-of-service/";
        String givenOptInKeyword = "MESSAGE";
        Boolean givenAgeGated = true;
        Boolean givenDirectLending = false;
        Boolean givenEmbeddedLink = true;
        Boolean givenEmbeddedPhone = false;
        String givenCreatedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        NumbersCampaignStage givenStage = NumbersCampaignStage.DRAFT;
        UUID givenPriorityId = UUID.fromString("46de4f63-390c-4253-9869-da282096691b");
        String givenPrioritySubmittedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenPrioritySubmittedDate = OffsetDateTime.parse(givenPrioritySubmittedDateString);
        String givenBrandPreviewBrandId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        String givenBrandPreviewBrandName = "Examples Warehouse";
        String givenNumberKey = "2C958BA98F9EBACA4F9357D81BFBF47B";
        String givenNumberPreviewNumber = "41793026727";
        String givenCountryCode = "US";
        String givenRejectionReason1 =
                "Campaign appears to be for an age-gated content type but age gate attribute is not selected.";
        String givenRejectionReason2 = "This is a custom rejection reason provided by a reviewer.";
        String givenRejectionErrorCode1 = "1001";
        String givenRejectionDescription1 =
                "Campaign appears to be for an age-gated content type but age gate attribute is not selected.";
        String givenRejectionRecommendedAction1 =
                "Verify if the Age Gate attribute is selected for the campaign registration. If the campaign is not related to age-gated content, update the campaign description.";
        String givenRejectionErrorCode2 = "9999";
        String givenRejectionDescription2 = "This is a custom rejection reason provided by a reviewer.";
        String givenRejectionDateString = "2019-08-23T14:15:22Z";
        OffsetDateTime givenRejectionDate = OffsetDateTime.parse(givenRejectionDateString);
        String givenAppealReason = "Example appeal reason";
        String givenAppealDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenAppealDate = OffsetDateTime.parse(givenAppealDateString);
        NumbersCampaignType givenType = NumbersCampaignType.TEN_DIGIT_LONG_CODE;

        String givenRequest = "{\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"type\": \"TEN_DIGIT_LONG_CODE\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"numbers\": [\n"
                + "    \""
                + givenNumber
                + "\"\n"
                + "  ],\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"confirmationMessage\": \""
                + givenConfirmationMessage
                + "\",\n"
                + "  \"customerCarePhone\": \""
                + givenCustomerCarePhone
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "  \"exampleMessages\": [\n"
                + "    \""
                + givenExampleMessage
                + "\"\n"
                + "  ],\n"
                + "  \"helpMessage\": \""
                + givenHelpMessage
                + "\",\n"
                + "  \"lowVolume\": false,\n"
                + "  \"messageTypes\": [\n"
                + "    \"SMS\",\n"
                + "    \"MMS\"\n"
                + "  ],\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"stopMessage\": \""
                + givenStopMessage
                + "\",\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"useCases\": [\n"
                + "    \"PROMOTIONAL_MARKETING\",\n"
                + "    \"EDUCATION\"\n"
                + "  ],\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"ageGated\": true,\n"
                + "  \"directLending\": false,\n"
                + "  \"embeddedLink\": true,\n"
                + "  \"embeddedPhone\": false\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"stage\": \"DRAFT\",\n"
                + "  \"priority\": {\n"
                + "    \"priorityId\": \""
                + givenPriorityId
                + "\",\n"
                + "    \"submittedDate\": \""
                + givenPrioritySubmittedDateString
                + "\"\n"
                + "  },\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "  \"confirmationMessage\": \""
                + givenConfirmationMessage
                + "\",\n"
                + "  \"exampleMessages\": [\n"
                + "    \""
                + givenExampleMessage
                + "\"\n"
                + "  ],\n"
                + "  \"helpMessage\": \""
                + givenHelpMessage
                + "\",\n"
                + "  \"stopMessage\": \""
                + givenStopMessage
                + "\",\n"
                + "  \"messageTypes\": [\n"
                + "    \"SMS\",\n"
                + "    \"MMS\"\n"
                + "  ],\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"brandPreview\": {\n"
                + "    \"brandId\": \""
                + givenBrandPreviewBrandId
                + "\",\n"
                + "    \"brandName\": \""
                + givenBrandPreviewBrandName
                + "\"\n"
                + "  },\n"
                + "  \"customerCarePhone\": \""
                + givenCustomerCarePhone
                + "\",\n"
                + "  \"lowVolume\": false,\n"
                + "  \"useCase\": null,\n"
                + "  \"useCases\": [\n"
                + "    \"PROMOTIONAL_MARKETING\",\n"
                + "    \"EDUCATION\"\n"
                + "  ],\n"
                + "  \"numberKeys\": [\n"
                + "    \""
                + givenNumberKey
                + "\"\n"
                + "  ],\n"
                + "  \"numberPreviews\": [\n"
                + "    {\n"
                + "      \"numberKey\": \""
                + givenNumberKey
                + "\",\n"
                + "      \"number\": \""
                + givenNumberPreviewNumber
                + "\",\n"
                + "      \"countryCode\": \""
                + givenCountryCode
                + "\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"ageGated\": true,\n"
                + "  \"directLending\": false,\n"
                + "  \"embeddedLink\": true,\n"
                + "  \"embeddedPhone\": false,\n"
                + "  \"type\": \"TEN_DIGIT_LONG_CODE\",\n"
                + "  \"campaignFeedback\": {\n"
                + "    \"rejectionReasons\": [\n"
                + "      \""
                + givenRejectionReason1
                + "\",\n"
                + "      \""
                + givenRejectionReason2
                + "\"\n"
                + "    ],\n"
                + "    \"rejectionDetails\": [\n"
                + "      {\n"
                + "        \"errorCode\": \""
                + givenRejectionErrorCode1
                + "\",\n"
                + "        \"description\": \""
                + givenRejectionDescription1
                + "\",\n"
                + "        \"recommendedAction\": \""
                + givenRejectionRecommendedAction1
                + "\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"errorCode\": \""
                + givenRejectionErrorCode2
                + "\",\n"
                + "        \"description\": \""
                + givenRejectionDescription2
                + "\",\n"
                + "        \"recommendedAction\": null\n"
                + "      }\n"
                + "    ],\n"
                + "    \"rejectionDate\": \""
                + givenRejectionDateString
                + "\"\n"
                + "  },\n"
                + "  \"appealData\": {\n"
                + "    \"appealReason\": \""
                + givenAppealReason
                + "\",\n"
                + "    \"appealDate\": \""
                + givenAppealDateString
                + "\"\n"
                + "  }\n"
                + "}\n";

        setUpPostRequest(CAMPAIGNS, givenRequest, givenResponse, 201);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersTenDlcCampaign()
                .brandId(givenBrandId)
                .numbers(new java.util.LinkedHashSet<>(List.of(givenNumber)))
                .programSummary(givenProgramSummary)
                .confirmationMessage(givenConfirmationMessage)
                .exampleMessages(List.of(givenExampleMessage))
                .helpMessage(givenHelpMessage)
                .stopMessage(givenStopMessage)
                .messageTypes(new java.util.LinkedHashSet<>(List.of(NumbersMessageType.SMS, NumbersMessageType.MMS)))
                .termsAndConditionsUrl(givenTermsAndConditionsUrl)
                .optIns(new NumbersOptIns()
                        .keyword(new NumbersKeywordOptIn()
                                .callToAction(givenOptInCallToAction)
                                .addKeywordsItem(givenOptInKeyword)))
                .ageGated(givenAgeGated)
                .customerCarePhone(givenCustomerCarePhone)
                .lowVolume(givenLowVolume)
                .useCases(new java.util.LinkedHashSet<>(List.of(givenUseCase1, givenUseCase2)))
                .directLending(givenDirectLending)
                .embeddedLink(givenEmbeddedLink)
                .embeddedPhone(givenEmbeddedPhone)
                .customerCareEmail(givenCustomerCareEmail);
        request.referenceId(givenReferenceId);
        request.applicationId(givenApplicationId);
        request.entityId(givenEntityId);
        request.name(givenName);

        var call = api.createCampaign(request);

        Consumer<NumbersCampaign> assertions = response -> {
            then(response).isNotNull();
            then(response.getClass()).isEqualTo(NumbersTenDlcCampaign.class);
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getType()).isEqualTo(givenType);

            NumbersPriorityInfo priority = response.getPriority();
            then(priority).isNotNull();
            then(priority.getPriorityId()).isEqualTo(givenPriorityId);
            then(priority.getSubmittedDate()).isEqualTo(givenPrioritySubmittedDate);

            NumbersCampaignFeedback feedback = response.getCampaignFeedback();
            then(feedback).isNotNull();
            then(feedback.getRejectionReasons()).containsExactly(givenRejectionReason1, givenRejectionReason2);
            then(feedback.getRejectionDate()).isEqualTo(givenRejectionDate);
            then(feedback.getRejectionDetails()).isNotNull();
            then(feedback.getRejectionDetails().size()).isEqualTo(2);
            NumbersRejectionReason detail1 = feedback.getRejectionDetails().get(0);
            then(detail1.getErrorCode()).isEqualTo(givenRejectionErrorCode1);
            then(detail1.getDescription()).isEqualTo(givenRejectionDescription1);
            then(detail1.getRecommendedAction()).isEqualTo(givenRejectionRecommendedAction1);
            NumbersRejectionReason detail2 = feedback.getRejectionDetails().get(1);
            then(detail2.getErrorCode()).isEqualTo(givenRejectionErrorCode2);
            then(detail2.getDescription()).isEqualTo(givenRejectionDescription2);
            then(detail2.getRecommendedAction()).isNull();

            NumbersTenDlcCampaign tenDlcCampaign = (NumbersTenDlcCampaign) response;
            then(tenDlcCampaign.getBrandId()).isEqualTo(givenBrandId);
            then(tenDlcCampaign.getProgramSummary()).isEqualTo(givenProgramSummary);
            then(tenDlcCampaign.getCustomerCareEmail()).isEqualTo(givenCustomerCareEmail);
            then(tenDlcCampaign.getConfirmationMessage()).isEqualTo(givenConfirmationMessage);
            then(tenDlcCampaign.getExampleMessages()).containsExactly(givenExampleMessage);
            then(tenDlcCampaign.getHelpMessage()).isEqualTo(givenHelpMessage);
            then(tenDlcCampaign.getStopMessage()).isEqualTo(givenStopMessage);
            then(tenDlcCampaign.getTermsAndConditionsUrl()).isEqualTo(givenTermsAndConditionsUrl);
            then(tenDlcCampaign.getCustomerCarePhone()).isEqualTo(givenCustomerCarePhone);
            then(tenDlcCampaign.getLowVolume()).isEqualTo(givenLowVolume);
            then(tenDlcCampaign.getUseCases()).containsExactlyInAnyOrder(givenUseCase1, givenUseCase2);
            then(tenDlcCampaign.getAgeGated()).isEqualTo(givenAgeGated);
            then(tenDlcCampaign.getDirectLending()).isEqualTo(givenDirectLending);
            then(tenDlcCampaign.getEmbeddedLink()).isEqualTo(givenEmbeddedLink);
            then(tenDlcCampaign.getEmbeddedPhone()).isEqualTo(givenEmbeddedPhone);
            then(tenDlcCampaign.getNumberKeys()).containsExactly(givenNumberKey);

            NumbersOptIns optIns = tenDlcCampaign.getOptIns();
            then(optIns).isNotNull();
            then(optIns.getKeyword()).isNotNull();
            then(optIns.getKeyword().getCallToAction()).isEqualTo(givenOptInCallToAction);
            then(optIns.getKeyword().getKeywords()).containsExactly(givenOptInKeyword);

            NumbersBrandPreview brandPreview = tenDlcCampaign.getBrandPreview();
            then(brandPreview).isNotNull();
            then(brandPreview.getBrandId()).isEqualTo(givenBrandPreviewBrandId);
            then(brandPreview.getBrandName()).isEqualTo(givenBrandPreviewBrandName);

            then(tenDlcCampaign.getNumberPreviews()).isNotNull();
            then(tenDlcCampaign.getNumberPreviews().size()).isEqualTo(1);
            NumbersNumberPreview numberPreview =
                    tenDlcCampaign.getNumberPreviews().iterator().next();
            then(numberPreview.getNumberKey()).isEqualTo(givenNumberKey);
            then(numberPreview.getNumber()).isEqualTo(givenNumberPreviewNumber);
            then(numberPreview.getCountryCode()).isEqualTo(givenCountryCode);

            NumbersAppealData appealData = tenDlcCampaign.getAppealData();
            then(appealData).isNotNull();
            then(appealData.getAppealReason()).isEqualTo(givenAppealReason);
            then(appealData.getAppealDate()).isEqualTo(givenAppealDate);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTollFreeCampaign() {
        String givenReferenceId = "customer-defined-identifier";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Promo";
        String givenNumber = "18007321000";
        String givenExampleMessage = "Come in today and get 10% OFF today!";
        String givenProgramSummary = "A mix of promotional and informational messaging.";
        String givenTermsAndConditionsUrl = "https://www.example.com/terms-and-conditions";
        String givenPrivacyPolicyUrl = "https://www.example.com/privacy-policy";
        NumbersTollFreeUseCase givenUseCase = NumbersTollFreeUseCase.APP_NOTIFICATIONS;
        String givenOptInCallToAction = "Text MESSAGE to subscribe";
        String givenOptInKeyword = "MESSAGE";
        NumbersTollFreeMessageVolume givenMessageVolume = NumbersTollFreeMessageVolume.HUNDRED;
        String givenOptInImageUrl = "https://www.example.com/terms-and-conditions";
        String givenAdditionalInformation = "Example additional information";
        String givenCustomerCareEmail = "examples@example.com";
        String givenCountryCode = "US";
        String givenCity = "Seattle";
        String givenState = "WA";
        String givenStreet = "56486 915th Street";
        String givenZipCode = "98061";
        String givenSupportPhone = "1234567890";
        String givenSupportEmail = "example@example.com";
        String givenBusinessContactFirstName = "First Name";
        String givenBusinessContactLastName = "Last Name";
        String givenBusinessDba = "Example DBA name";
        String givenBusinessName = "Example business name";
        String givenLegalName = "Example legal name";
        String givenBusinessWebsite = "https://www.example.com";
        String givenTaxId = "62-4161762";
        String givenTaxIdIssuingCountry = "US";
        NumbersTollFreeUnifiedNumberCampaignApiModel.LegalEntityTypeEnum givenLegalEntityType =
                NumbersTollFreeUnifiedNumberCampaignApiModel.LegalEntityTypeEnum.PRIVATE_COMPANY;
        NumbersBusinessRegistrationType givenBusinessRegistrationType = NumbersBusinessRegistrationType.EIN;
        UUID givenId = UUID.fromString("2e13b58f-e8d1-45a1-bc67-efc834e2b146");
        String givenResponseName = "Example toll free unified number campaign";
        String givenCreatedDateString = "2025-06-30T15:38:40Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2025-06-30T15:38:41Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        NumbersCampaignStage givenStage = NumbersCampaignStage.SUBMITTED_FOR_REVIEW;
        String givenPrioritySubmittedDateString = "2025-06-30T15:38:41Z";
        OffsetDateTime givenPrioritySubmittedDate = OffsetDateTime.parse(givenPrioritySubmittedDateString);
        String givenNumberKey = "8CE2738191F7F06F84E5417579D41D74";
        String givenNumberPreviewNumber = "18007321000";
        String givenNumberPreviewCountryCode = "UF";
        String givenResponseOptInImageUrl = "https://www.example.com";
        String givenResponseSupportEmail = "email@example.com";
        String givenResponseBusinessDba = "Example Business DBA";
        String givenResponseBusinessName = "Example Business Name";
        String givenResponseCustomerCareEmail = "customercare@example.com";
        NumbersTollFreeUnifiedNumberCampaignApiModel.TypeEnum givenType =
                NumbersTollFreeUnifiedNumberCampaignApiModel.TypeEnum.TOLL_FREE_UNIFIED_NUMBER;

        String givenRequest = "{\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"type\": \"TOLL_FREE_UNIFIED_NUMBER\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"numbers\": [\n"
                + "    \""
                + givenNumber
                + "\"\n"
                + "  ],\n"
                + "  \"numberKeys\": [],\n"
                + "  \"exampleMessage\": \""
                + givenExampleMessage
                + "\",\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"privacyPolicyUrl\": \""
                + givenPrivacyPolicyUrl
                + "\",\n"
                + "  \"useCase\": \"APP_NOTIFICATIONS\",\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"messageVolume\": \"HUNDRED\",\n"
                + "  \"optInImageURLs\": [\n"
                + "    \""
                + givenOptInImageUrl
                + "\"\n"
                + "  ],\n"
                + "  \"additionalInformation\": \""
                + givenAdditionalInformation
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"supportEmail\": \""
                + givenSupportEmail
                + "\",\n"
                + "  \"businessContactFirstName\": \""
                + givenBusinessContactFirstName
                + "\",\n"
                + "  \"businessContactLastName\": \""
                + givenBusinessContactLastName
                + "\",\n"
                + "  \"businessDBA\": \""
                + givenBusinessDba
                + "\",\n"
                + "  \"businessName\": \""
                + givenBusinessName
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"businessWebsite\": \""
                + givenBusinessWebsite
                + "\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\",\n"
                + "  \"legalEntityType\": \"PRIVATE_COMPANY\",\n"
                + "  \"businessRegistrationType\": \"EIN\"\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenResponseName
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"stage\": \"SUBMITTED_FOR_REVIEW\",\n"
                + "  \"priority\": {\n"
                + "    \"priorityId\": null,\n"
                + "    \"submittedDate\": \""
                + givenPrioritySubmittedDateString
                + "\"\n"
                + "  },\n"
                + "  \"campaignFeedback\": null,\n"
                + "  \"privacyPolicyUrl\": \""
                + givenPrivacyPolicyUrl
                + "\",\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"messageVolume\": \"HUNDRED\",\n"
                + "  \"numberKeys\": [\n"
                + "    \""
                + givenNumberKey
                + "\"\n"
                + "  ],\n"
                + "  \"numberPreviews\": [\n"
                + "    {\n"
                + "      \"numberKey\": \""
                + givenNumberKey
                + "\",\n"
                + "      \"number\": \""
                + givenNumberPreviewNumber
                + "\",\n"
                + "      \"countryCode\": \""
                + givenNumberPreviewCountryCode
                + "\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"useCase\": \"APP_NOTIFICATIONS\",\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"exampleMessage\": \""
                + givenExampleMessage
                + "\",\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"optInImageURLs\": [\n"
                + "    \""
                + givenResponseOptInImageUrl
                + "\"\n"
                + "  ],\n"
                + "  \"additionalInformation\": \""
                + givenAdditionalInformation
                + "\",\n"
                + "  \"countryCode\": \""
                + givenCountryCode
                + "\",\n"
                + "  \"address\": {\n"
                + "    \"city\": \""
                + givenCity
                + "\",\n"
                + "    \"state\": \""
                + givenState
                + "\",\n"
                + "    \"street\": \""
                + givenStreet
                + "\",\n"
                + "    \"zipCode\": \""
                + givenZipCode
                + "\"\n"
                + "  },\n"
                + "  \"supportPhone\": \""
                + givenSupportPhone
                + "\",\n"
                + "  \"supportEmail\": \""
                + givenResponseSupportEmail
                + "\",\n"
                + "  \"businessContactFirstName\": \""
                + givenBusinessContactFirstName
                + "\",\n"
                + "  \"businessContactLastName\": \""
                + givenBusinessContactLastName
                + "\",\n"
                + "  \"businessDBA\": \""
                + givenResponseBusinessDba
                + "\",\n"
                + "  \"businessName\": \""
                + givenResponseBusinessName
                + "\",\n"
                + "  \"legalName\": \""
                + givenLegalName
                + "\",\n"
                + "  \"businessWebsite\": \""
                + givenBusinessWebsite
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenResponseCustomerCareEmail
                + "\",\n"
                + "  \"taxId\": \""
                + givenTaxId
                + "\",\n"
                + "  \"taxIdIssuingCountry\": \""
                + givenTaxIdIssuingCountry
                + "\",\n"
                + "  \"legalEntityType\": \"PRIVATE_COMPANY\",\n"
                + "  \"businessRegistrationType\": \"EIN\",\n"
                + "  \"type\": \"TOLL_FREE_UNIFIED_NUMBER\"\n"
                + "}\n";

        setUpPostRequest(CAMPAIGNS_TOLL_FREE, givenRequest, givenResponse, 201);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersTollFreeUnifiedNumberCampaignApiModel()
                .referenceId(givenReferenceId)
                .applicationId(givenApplicationId)
                .entityId(givenEntityId)
                .name(givenName)
                .numbers(new java.util.LinkedHashSet<>(List.of(givenNumber)))
                .exampleMessage(givenExampleMessage)
                .programSummary(givenProgramSummary)
                .termsAndConditionsUrl(givenTermsAndConditionsUrl)
                .privacyPolicyUrl(givenPrivacyPolicyUrl)
                .useCase(givenUseCase)
                .optIns(new NumbersOptIns()
                        .keyword(new NumbersKeywordOptIn()
                                .callToAction(givenOptInCallToAction)
                                .addKeywordsItem(givenOptInKeyword)))
                .messageVolume(givenMessageVolume)
                .addOptInImageURLsItem(givenOptInImageUrl)
                .additionalInformation(givenAdditionalInformation)
                .customerCareEmail(givenCustomerCareEmail)
                .countryCode(givenCountryCode)
                .address(new NumbersAddress()
                        .city(givenCity)
                        .state(givenState)
                        .street(givenStreet)
                        .zipCode(givenZipCode))
                .supportPhone(givenSupportPhone)
                .supportEmail(givenSupportEmail)
                .businessContactFirstName(givenBusinessContactFirstName)
                .businessContactLastName(givenBusinessContactLastName)
                .businessDBA(givenBusinessDba)
                .businessName(givenBusinessName)
                .legalName(givenLegalName)
                .businessWebsite(givenBusinessWebsite)
                .taxId(givenTaxId)
                .taxIdIssuingCountry(givenTaxIdIssuingCountry)
                .legalEntityType(givenLegalEntityType)
                .businessRegistrationType(givenBusinessRegistrationType)
                .type(givenType);

        var call = api.createTollFreeCampaign(request);

        Consumer<NumbersTollFreeUnifiedNumberCampaignApiModel> assertions = response -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getReferenceId()).isEqualTo(givenReferenceId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenResponseName);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getType()).isEqualTo(givenType);
            then(response.getCampaignFeedback()).isNull();

            NumbersPriorityInfo priority = response.getPriority();
            then(priority).isNotNull();
            then(priority.getPriorityId()).isNull();
            then(priority.getSubmittedDate()).isEqualTo(givenPrioritySubmittedDate);

            then(response.getPrivacyPolicyUrl()).isEqualTo(givenPrivacyPolicyUrl);
            then(response.getTermsAndConditionsUrl()).isEqualTo(givenTermsAndConditionsUrl);
            then(response.getMessageVolume()).isEqualTo(givenMessageVolume);
            then(response.getNumberKeys()).containsExactly(givenNumberKey);

            then(response.getNumberPreviews()).isNotNull();
            then(response.getNumberPreviews().size()).isEqualTo(1);
            NumbersNumberPreview numberPreview =
                    response.getNumberPreviews().iterator().next();
            then(numberPreview.getNumberKey()).isEqualTo(givenNumberKey);
            then(numberPreview.getNumber()).isEqualTo(givenNumberPreviewNumber);
            then(numberPreview.getCountryCode()).isEqualTo(givenNumberPreviewCountryCode);

            then(response.getUseCase()).isEqualTo(givenUseCase);
            then(response.getProgramSummary()).isEqualTo(givenProgramSummary);
            then(response.getExampleMessage()).isEqualTo(givenExampleMessage);

            NumbersOptIns optIns = response.getOptIns();
            then(optIns).isNotNull();
            then(optIns.getKeyword()).isNotNull();
            then(optIns.getKeyword().getCallToAction()).isEqualTo(givenOptInCallToAction);
            then(optIns.getKeyword().getKeywords()).containsExactly(givenOptInKeyword);

            then(response.getOptInImageURLs()).containsExactly(givenResponseOptInImageUrl);
            then(response.getAdditionalInformation()).isEqualTo(givenAdditionalInformation);
            then(response.getCountryCode()).isEqualTo(givenCountryCode);

            NumbersAddress address = response.getAddress();
            then(address).isNotNull();
            then(address.getCity()).isEqualTo(givenCity);
            then(address.getState()).isEqualTo(givenState);
            then(address.getStreet()).isEqualTo(givenStreet);
            then(address.getZipCode()).isEqualTo(givenZipCode);

            then(response.getSupportPhone()).isEqualTo(givenSupportPhone);
            then(response.getSupportEmail()).isEqualTo(givenResponseSupportEmail);
            then(response.getBusinessContactFirstName()).isEqualTo(givenBusinessContactFirstName);
            then(response.getBusinessContactLastName()).isEqualTo(givenBusinessContactLastName);
            then(response.getBusinessDBA()).isEqualTo(givenResponseBusinessDba);
            then(response.getBusinessName()).isEqualTo(givenResponseBusinessName);
            then(response.getLegalName()).isEqualTo(givenLegalName);
            then(response.getBusinessWebsite()).isEqualTo(givenBusinessWebsite);
            then(response.getCustomerCareEmail()).isEqualTo(givenResponseCustomerCareEmail);
            then(response.getTaxId()).isEqualTo(givenTaxId);
            then(response.getTaxIdIssuingCountry()).isEqualTo(givenTaxIdIssuingCountry);
            then(response.getLegalEntityType()).isEqualTo(givenLegalEntityType);
            then(response.getBusinessRegistrationType()).isEqualTo(givenBusinessRegistrationType);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCampaign() {
        UUID givenId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenReferenceId = "customer-defined-identifier";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Promo";
        String givenCreatedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        NumbersCampaignStage givenStage = NumbersCampaignStage.DRAFT;
        UUID givenPriorityId = UUID.fromString("46de4f63-390c-4253-9869-da282096691b");
        String givenPrioritySubmittedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenPrioritySubmittedDate = OffsetDateTime.parse(givenPrioritySubmittedDateString);
        UUID givenBrandId = UUID.fromString("a0c63335-f841-4d43-9ef8-e0765a233f29");
        String givenProgramSummary = "A mix of promotional and informational messaging.";
        String givenCustomerCareEmail = "examples@example.com";
        String givenConfirmationMessage =
                "Example promotional-marketing. Msg&data rates may apply. Reply HELP for help, STOP to cancel.";
        String givenExampleMessage = "Come in today and get 10% OFF today!";
        String givenHelpMessage =
                "Example promotional-marketing: Help at textsupport@example.com or 18889997777. Msg&data rates may apply. Reply STOP to cancel.";
        String givenStopMessage =
                "Example promotional-marketing: You have been unsubscribed, no more messages will be sent.";
        String givenTermsAndConditionsUrl = "https://www.example.com/terms-and-conditions";
        String givenOptInCallToAction = "Text MESSAGE to subscribe";
        String givenOptInKeyword = "MESSAGE";
        String givenBrandPreviewBrandId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        String givenBrandPreviewBrandName = "Examples Warehouse";
        String givenCustomerCarePhone = "41785473249";
        Boolean givenLowVolume = false;
        NumbersTenDlcUseCase givenUseCase1 = NumbersTenDlcUseCase.PROMOTIONAL_MARKETING;
        NumbersTenDlcUseCase givenUseCase2 = NumbersTenDlcUseCase.EDUCATION;
        String givenNumberKey = "2C958BA98F9EBACA4F9357D81BFBF47B";
        String givenNumber = "41793026727";
        String givenCountryCode = "US";
        Boolean givenAgeGated = true;
        Boolean givenDirectLending = false;
        Boolean givenEmbeddedLink = true;
        Boolean givenEmbeddedPhone = false;
        NumbersCampaignType givenType = NumbersCampaignType.TEN_DIGIT_LONG_CODE;
        String givenRejectionReason1 =
                "Campaign appears to be for an age-gated content type but age gate attribute is not selected.";
        String givenRejectionReason2 = "This is a custom rejection reason provided by a reviewer.";
        String givenRejectionErrorCode1 = "1001";
        String givenRejectionDescription1 =
                "Campaign appears to be for an age-gated content type but age gate attribute is not selected.";
        String givenRejectionRecommendedAction1 =
                "Verify if the Age Gate attribute is selected for the campaign registration. If the campaign is not related to age-gated content, update the campaign description.";
        String givenRejectionErrorCode2 = "9999";
        String givenRejectionDescription2 = "This is a custom rejection reason provided by a reviewer.";
        String givenRejectionDateString = "2019-08-23T14:15:22Z";
        OffsetDateTime givenRejectionDate = OffsetDateTime.parse(givenRejectionDateString);
        String givenAppealReason = "Example appeal reason";
        String givenAppealDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenAppealDate = OffsetDateTime.parse(givenAppealDateString);

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"stage\": \"DRAFT\",\n"
                + "  \"priority\": {\n"
                + "    \"priorityId\": \""
                + givenPriorityId
                + "\",\n"
                + "    \"submittedDate\": \""
                + givenPrioritySubmittedDateString
                + "\"\n"
                + "  },\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "  \"confirmationMessage\": \""
                + givenConfirmationMessage
                + "\",\n"
                + "  \"exampleMessages\": [\n"
                + "    \""
                + givenExampleMessage
                + "\"\n"
                + "  ],\n"
                + "  \"helpMessage\": \""
                + givenHelpMessage
                + "\",\n"
                + "  \"stopMessage\": \""
                + givenStopMessage
                + "\",\n"
                + "  \"messageTypes\": [\n"
                + "    \"SMS\",\n"
                + "    \"MMS\"\n"
                + "  ],\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"brandPreview\": {\n"
                + "    \"brandId\": \""
                + givenBrandPreviewBrandId
                + "\",\n"
                + "    \"brandName\": \""
                + givenBrandPreviewBrandName
                + "\"\n"
                + "  },\n"
                + "  \"customerCarePhone\": \""
                + givenCustomerCarePhone
                + "\",\n"
                + "  \"lowVolume\": false,\n"
                + "  \"useCase\": null,\n"
                + "  \"useCases\": [\n"
                + "    \"PROMOTIONAL_MARKETING\",\n"
                + "    \"EDUCATION\"\n"
                + "  ],\n"
                + "  \"numberKeys\": [\n"
                + "    \""
                + givenNumberKey
                + "\"\n"
                + "  ],\n"
                + "  \"numberPreviews\": [\n"
                + "    {\n"
                + "      \"numberKey\": \""
                + givenNumberKey
                + "\",\n"
                + "      \"number\": \""
                + givenNumber
                + "\",\n"
                + "      \"countryCode\": \""
                + givenCountryCode
                + "\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"ageGated\": true,\n"
                + "  \"directLending\": false,\n"
                + "  \"embeddedLink\": true,\n"
                + "  \"embeddedPhone\": false,\n"
                + "  \"type\": \"TEN_DIGIT_LONG_CODE\",\n"
                + "  \"campaignFeedback\": {\n"
                + "    \"rejectionReasons\": [\n"
                + "      \""
                + givenRejectionReason1
                + "\",\n"
                + "      \""
                + givenRejectionReason2
                + "\"\n"
                + "    ],\n"
                + "    \"rejectionDetails\": [\n"
                + "      {\n"
                + "        \"errorCode\": \""
                + givenRejectionErrorCode1
                + "\",\n"
                + "        \"description\": \""
                + givenRejectionDescription1
                + "\",\n"
                + "        \"recommendedAction\": \""
                + givenRejectionRecommendedAction1
                + "\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"errorCode\": \""
                + givenRejectionErrorCode2
                + "\",\n"
                + "        \"description\": \""
                + givenRejectionDescription2
                + "\",\n"
                + "        \"recommendedAction\": null\n"
                + "      }\n"
                + "    ],\n"
                + "    \"rejectionDate\": \""
                + givenRejectionDateString
                + "\"\n"
                + "  },\n"
                + "  \"appealData\": {\n"
                + "    \"appealReason\": \""
                + givenAppealReason
                + "\",\n"
                + "    \"appealDate\": \""
                + givenAppealDateString
                + "\"\n"
                + "  }\n"
                + "}\n";

        setUpSuccessGetRequest(CAMPAIGN.replace("{campaignId}", givenId.toString()), Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getCampaign(givenId);

        Consumer<NumbersCampaign> assertions = response -> {
            then(response).isNotNull();
            then(response.getClass()).isEqualTo(NumbersTenDlcCampaign.class);
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getType()).isEqualTo(givenType);

            NumbersPriorityInfo priority = response.getPriority();
            then(priority).isNotNull();
            then(priority.getPriorityId()).isEqualTo(givenPriorityId);
            then(priority.getSubmittedDate()).isEqualTo(givenPrioritySubmittedDate);

            NumbersCampaignFeedback feedback = response.getCampaignFeedback();
            then(feedback).isNotNull();
            then(feedback.getRejectionReasons()).containsExactly(givenRejectionReason1, givenRejectionReason2);
            then(feedback.getRejectionDate()).isEqualTo(givenRejectionDate);
            then(feedback.getRejectionDetails()).isNotNull();
            then(feedback.getRejectionDetails().size()).isEqualTo(2);
            NumbersRejectionReason detail1 = feedback.getRejectionDetails().get(0);
            then(detail1.getErrorCode()).isEqualTo(givenRejectionErrorCode1);
            then(detail1.getDescription()).isEqualTo(givenRejectionDescription1);
            then(detail1.getRecommendedAction()).isEqualTo(givenRejectionRecommendedAction1);
            NumbersRejectionReason detail2 = feedback.getRejectionDetails().get(1);
            then(detail2.getErrorCode()).isEqualTo(givenRejectionErrorCode2);
            then(detail2.getDescription()).isEqualTo(givenRejectionDescription2);
            then(detail2.getRecommendedAction()).isNull();

            NumbersTenDlcCampaign tenDlcCampaign = (NumbersTenDlcCampaign) response;
            then(tenDlcCampaign.getBrandId()).isEqualTo(givenBrandId);
            then(tenDlcCampaign.getProgramSummary()).isEqualTo(givenProgramSummary);
            then(tenDlcCampaign.getCustomerCareEmail()).isEqualTo(givenCustomerCareEmail);
            then(tenDlcCampaign.getConfirmationMessage()).isEqualTo(givenConfirmationMessage);
            then(tenDlcCampaign.getExampleMessages()).containsExactly(givenExampleMessage);
            then(tenDlcCampaign.getHelpMessage()).isEqualTo(givenHelpMessage);
            then(tenDlcCampaign.getStopMessage()).isEqualTo(givenStopMessage);
            then(tenDlcCampaign.getTermsAndConditionsUrl()).isEqualTo(givenTermsAndConditionsUrl);
            then(tenDlcCampaign.getCustomerCarePhone()).isEqualTo(givenCustomerCarePhone);
            then(tenDlcCampaign.getLowVolume()).isEqualTo(givenLowVolume);
            then(tenDlcCampaign.getUseCases()).containsExactlyInAnyOrder(givenUseCase1, givenUseCase2);
            then(tenDlcCampaign.getAgeGated()).isEqualTo(givenAgeGated);
            then(tenDlcCampaign.getDirectLending()).isEqualTo(givenDirectLending);
            then(tenDlcCampaign.getEmbeddedLink()).isEqualTo(givenEmbeddedLink);
            then(tenDlcCampaign.getEmbeddedPhone()).isEqualTo(givenEmbeddedPhone);
            then(tenDlcCampaign.getNumberKeys()).containsExactly(givenNumberKey);

            NumbersOptIns optIns = tenDlcCampaign.getOptIns();
            then(optIns).isNotNull();
            then(optIns.getKeyword()).isNotNull();
            then(optIns.getKeyword().getCallToAction()).isEqualTo(givenOptInCallToAction);
            then(optIns.getKeyword().getKeywords()).containsExactly(givenOptInKeyword);

            NumbersBrandPreview brandPreview = tenDlcCampaign.getBrandPreview();
            then(brandPreview).isNotNull();
            then(brandPreview.getBrandId()).isEqualTo(givenBrandPreviewBrandId);
            then(brandPreview.getBrandName()).isEqualTo(givenBrandPreviewBrandName);

            then(tenDlcCampaign.getNumberPreviews()).isNotNull();
            then(tenDlcCampaign.getNumberPreviews().size()).isEqualTo(1);
            NumbersNumberPreview numberPreview =
                    tenDlcCampaign.getNumberPreviews().iterator().next();
            then(numberPreview.getNumberKey()).isEqualTo(givenNumberKey);
            then(numberPreview.getNumber()).isEqualTo(givenNumber);
            then(numberPreview.getCountryCode()).isEqualTo(givenCountryCode);

            NumbersAppealData appealData = tenDlcCampaign.getAppealData();
            then(appealData).isNotNull();
            then(appealData.getAppealReason()).isEqualTo(givenAppealReason);
            then(appealData.getAppealDate()).isEqualTo(givenAppealDate);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateCampaign() {
        UUID givenId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenReferenceId = "customer-defined-identifier";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Promo";
        String givenNumber = "41785473249";
        UUID givenBrandId = UUID.fromString("a0c63335-f841-4d43-9ef8-e0765a233f29");
        String givenConfirmationMessage =
                "Example promotional-marketing. Msg&data rates may apply. Reply HELP for help, STOP to cancel.";
        String givenCustomerCarePhone = "41785473249";
        String givenCustomerCareEmail = "examples@example.com";
        String givenExampleMessage = "Come in today and get 10% OFF today!";
        String givenHelpMessage =
                "Example promotional-marketing: Help at textsupport@example.com or 18889997777. Msg&data rates may apply. Reply STOP to cancel.";
        Boolean givenLowVolume = false;
        String givenProgramSummary = "A mix of promotional and informational messaging.";
        String givenStopMessage =
                "Example promotional-marketing: You have been unsubscribed, no more messages will be sent.";
        String givenTermsAndConditionsUrl = "https://www.example.com/terms-and-conditions";
        NumbersTenDlcUseCase givenUseCase1 = NumbersTenDlcUseCase.PROMOTIONAL_MARKETING;
        NumbersTenDlcUseCase givenUseCase2 = NumbersTenDlcUseCase.EDUCATION;
        String givenRequestOptInCallToAction =
                "Text MESSAGE to subscribe to recurring promotional marketing alerts. Msg&DataRates may apply. Text HELP for help, STOP to opt out. Terms and PP https://www.example.om/terms-of-service/";
        String givenResponseOptInCallToAction = "Text MESSAGE to subscribe";
        String givenOptInKeyword = "MESSAGE";
        Boolean givenAgeGated = true;
        Boolean givenDirectLending = false;
        Boolean givenEmbeddedLink = true;
        Boolean givenEmbeddedPhone = false;
        String givenCreatedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenCreatedDate = OffsetDateTime.parse(givenCreatedDateString);
        String givenLastModifiedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenLastModifiedDate = OffsetDateTime.parse(givenLastModifiedDateString);
        NumbersCampaignStage givenStage = NumbersCampaignStage.DRAFT;
        UUID givenPriorityId = UUID.fromString("46de4f63-390c-4253-9869-da282096691b");
        String givenPrioritySubmittedDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenPrioritySubmittedDate = OffsetDateTime.parse(givenPrioritySubmittedDateString);
        String givenBrandPreviewBrandId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        String givenBrandPreviewBrandName = "Examples Warehouse";
        String givenNumberKey = "2C958BA98F9EBACA4F9357D81BFBF47B";
        String givenNumberPreviewNumber = "41793026727";
        String givenCountryCode = "US";
        String givenRejectionReason1 =
                "Campaign appears to be for an age-gated content type but age gate attribute is not selected.";
        String givenRejectionReason2 = "This is a custom rejection reason provided by a reviewer.";
        String givenRejectionErrorCode1 = "1001";
        String givenRejectionDescription1 =
                "Campaign appears to be for an age-gated content type but age gate attribute is not selected.";
        String givenRejectionRecommendedAction1 =
                "Verify if the Age Gate attribute is selected for the campaign registration. If the campaign is not related to age-gated content, update the campaign description.";
        String givenRejectionErrorCode2 = "9999";
        String givenRejectionDescription2 = "This is a custom rejection reason provided by a reviewer.";
        String givenRejectionDateString = "2019-08-23T14:15:22Z";
        OffsetDateTime givenRejectionDate = OffsetDateTime.parse(givenRejectionDateString);
        String givenAppealReason = "Example appeal reason";
        String givenAppealDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenAppealDate = OffsetDateTime.parse(givenAppealDateString);
        NumbersCampaignType givenType = NumbersCampaignType.TEN_DIGIT_LONG_CODE;

        String givenRequest = "{\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"type\": \"TEN_DIGIT_LONG_CODE\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"numbers\": [\n"
                + "    \""
                + givenNumber
                + "\"\n"
                + "  ],\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"confirmationMessage\": \""
                + givenConfirmationMessage
                + "\",\n"
                + "  \"customerCarePhone\": \""
                + givenCustomerCarePhone
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "  \"exampleMessages\": [\n"
                + "    \""
                + givenExampleMessage
                + "\"\n"
                + "  ],\n"
                + "  \"helpMessage\": \""
                + givenHelpMessage
                + "\",\n"
                + "  \"lowVolume\": false,\n"
                + "  \"messageTypes\": [\n"
                + "    \"SMS\",\n"
                + "    \"MMS\"\n"
                + "  ],\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"stopMessage\": \""
                + givenStopMessage
                + "\",\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"useCases\": [\n"
                + "    \"PROMOTIONAL_MARKETING\",\n"
                + "    \"EDUCATION\"\n"
                + "  ],\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenRequestOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"ageGated\": true,\n"
                + "  \"directLending\": false,\n"
                + "  \"embeddedLink\": true,\n"
                + "  \"embeddedPhone\": false\n"
                + "}\n";

        String givenResponse = "{\n"
                + "  \"id\": \""
                + givenId
                + "\",\n"
                + "  \"referenceId\": \""
                + givenReferenceId
                + "\",\n"
                + "  \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "  \"entityId\": \""
                + givenEntityId
                + "\",\n"
                + "  \"name\": \""
                + givenName
                + "\",\n"
                + "  \"createdDate\": \""
                + givenCreatedDateString
                + "\",\n"
                + "  \"lastModifiedDate\": \""
                + givenLastModifiedDateString
                + "\",\n"
                + "  \"stage\": \"DRAFT\",\n"
                + "  \"priority\": {\n"
                + "    \"priorityId\": \""
                + givenPriorityId
                + "\",\n"
                + "    \"submittedDate\": \""
                + givenPrioritySubmittedDateString
                + "\"\n"
                + "  },\n"
                + "  \"brandId\": \""
                + givenBrandId
                + "\",\n"
                + "  \"programSummary\": \""
                + givenProgramSummary
                + "\",\n"
                + "  \"customerCareEmail\": \""
                + givenCustomerCareEmail
                + "\",\n"
                + "  \"confirmationMessage\": \""
                + givenConfirmationMessage
                + "\",\n"
                + "  \"exampleMessages\": [\n"
                + "    \""
                + givenExampleMessage
                + "\"\n"
                + "  ],\n"
                + "  \"helpMessage\": \""
                + givenHelpMessage
                + "\",\n"
                + "  \"stopMessage\": \""
                + givenStopMessage
                + "\",\n"
                + "  \"messageTypes\": [\n"
                + "    \"SMS\",\n"
                + "    \"MMS\"\n"
                + "  ],\n"
                + "  \"termsAndConditionsUrl\": \""
                + givenTermsAndConditionsUrl
                + "\",\n"
                + "  \"optIns\": {\n"
                + "    \"keyword\": {\n"
                + "      \"callToAction\": \""
                + givenResponseOptInCallToAction
                + "\",\n"
                + "      \"keywords\": [\n"
                + "        \""
                + givenOptInKeyword
                + "\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"brandPreview\": {\n"
                + "    \"brandId\": \""
                + givenBrandPreviewBrandId
                + "\",\n"
                + "    \"brandName\": \""
                + givenBrandPreviewBrandName
                + "\"\n"
                + "  },\n"
                + "  \"customerCarePhone\": \""
                + givenCustomerCarePhone
                + "\",\n"
                + "  \"lowVolume\": false,\n"
                + "  \"useCase\": null,\n"
                + "  \"useCases\": [\n"
                + "    \"PROMOTIONAL_MARKETING\",\n"
                + "    \"EDUCATION\"\n"
                + "  ],\n"
                + "  \"numberKeys\": [\n"
                + "    \""
                + givenNumberKey
                + "\"\n"
                + "  ],\n"
                + "  \"numberPreviews\": [\n"
                + "    {\n"
                + "      \"numberKey\": \""
                + givenNumberKey
                + "\",\n"
                + "      \"number\": \""
                + givenNumberPreviewNumber
                + "\",\n"
                + "      \"countryCode\": \""
                + givenCountryCode
                + "\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"ageGated\": true,\n"
                + "  \"directLending\": false,\n"
                + "  \"embeddedLink\": true,\n"
                + "  \"embeddedPhone\": false,\n"
                + "  \"type\": \"TEN_DIGIT_LONG_CODE\",\n"
                + "  \"campaignFeedback\": {\n"
                + "    \"rejectionReasons\": [\n"
                + "      \""
                + givenRejectionReason1
                + "\",\n"
                + "      \""
                + givenRejectionReason2
                + "\"\n"
                + "    ],\n"
                + "    \"rejectionDetails\": [\n"
                + "      {\n"
                + "        \"errorCode\": \""
                + givenRejectionErrorCode1
                + "\",\n"
                + "        \"description\": \""
                + givenRejectionDescription1
                + "\",\n"
                + "        \"recommendedAction\": \""
                + givenRejectionRecommendedAction1
                + "\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"errorCode\": \""
                + givenRejectionErrorCode2
                + "\",\n"
                + "        \"description\": \""
                + givenRejectionDescription2
                + "\",\n"
                + "        \"recommendedAction\": null\n"
                + "      }\n"
                + "    ],\n"
                + "    \"rejectionDate\": \""
                + givenRejectionDateString
                + "\"\n"
                + "  },\n"
                + "  \"appealData\": {\n"
                + "    \"appealReason\": \""
                + givenAppealReason
                + "\",\n"
                + "    \"appealDate\": \""
                + givenAppealDateString
                + "\"\n"
                + "  }\n"
                + "}\n";

        setUpSuccessPutRequest(
                CAMPAIGN.replace("{campaignId}", givenId.toString()), Map.of(), givenRequest, givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersTenDlcCampaign()
                .brandId(givenBrandId)
                .numbers(new java.util.LinkedHashSet<>(List.of(givenNumber)))
                .programSummary(givenProgramSummary)
                .confirmationMessage(givenConfirmationMessage)
                .exampleMessages(List.of(givenExampleMessage))
                .helpMessage(givenHelpMessage)
                .stopMessage(givenStopMessage)
                .messageTypes(new java.util.LinkedHashSet<>(List.of(NumbersMessageType.SMS, NumbersMessageType.MMS)))
                .termsAndConditionsUrl(givenTermsAndConditionsUrl)
                .optIns(new NumbersOptIns()
                        .keyword(new NumbersKeywordOptIn()
                                .callToAction(givenRequestOptInCallToAction)
                                .addKeywordsItem(givenOptInKeyword)))
                .ageGated(givenAgeGated)
                .customerCarePhone(givenCustomerCarePhone)
                .lowVolume(givenLowVolume)
                .useCases(new java.util.LinkedHashSet<>(List.of(givenUseCase1, givenUseCase2)))
                .directLending(givenDirectLending)
                .embeddedLink(givenEmbeddedLink)
                .embeddedPhone(givenEmbeddedPhone)
                .customerCareEmail(givenCustomerCareEmail);
        request.referenceId(givenReferenceId);
        request.applicationId(givenApplicationId);
        request.entityId(givenEntityId);
        request.name(givenName);

        var call = api.updateCampaign(givenId, request);

        Consumer<NumbersCampaign> assertions = response -> {
            then(response).isNotNull();
            then(response.getClass()).isEqualTo(NumbersTenDlcCampaign.class);
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getEntityId()).isEqualTo(givenEntityId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCreatedDate()).isEqualTo(givenCreatedDate);
            then(response.getLastModifiedDate()).isEqualTo(givenLastModifiedDate);
            then(response.getStage()).isEqualTo(givenStage);
            then(response.getType()).isEqualTo(givenType);

            NumbersPriorityInfo priority = response.getPriority();
            then(priority).isNotNull();
            then(priority.getPriorityId()).isEqualTo(givenPriorityId);
            then(priority.getSubmittedDate()).isEqualTo(givenPrioritySubmittedDate);

            NumbersCampaignFeedback feedback = response.getCampaignFeedback();
            then(feedback).isNotNull();
            then(feedback.getRejectionReasons()).containsExactly(givenRejectionReason1, givenRejectionReason2);
            then(feedback.getRejectionDate()).isEqualTo(givenRejectionDate);
            then(feedback.getRejectionDetails()).isNotNull();
            then(feedback.getRejectionDetails().size()).isEqualTo(2);
            NumbersRejectionReason detail1 = feedback.getRejectionDetails().get(0);
            then(detail1.getErrorCode()).isEqualTo(givenRejectionErrorCode1);
            then(detail1.getDescription()).isEqualTo(givenRejectionDescription1);
            then(detail1.getRecommendedAction()).isEqualTo(givenRejectionRecommendedAction1);
            NumbersRejectionReason detail2 = feedback.getRejectionDetails().get(1);
            then(detail2.getErrorCode()).isEqualTo(givenRejectionErrorCode2);
            then(detail2.getDescription()).isEqualTo(givenRejectionDescription2);
            then(detail2.getRecommendedAction()).isNull();

            NumbersTenDlcCampaign tenDlcCampaign = (NumbersTenDlcCampaign) response;
            then(tenDlcCampaign.getBrandId()).isEqualTo(givenBrandId);
            then(tenDlcCampaign.getProgramSummary()).isEqualTo(givenProgramSummary);
            then(tenDlcCampaign.getCustomerCareEmail()).isEqualTo(givenCustomerCareEmail);
            then(tenDlcCampaign.getConfirmationMessage()).isEqualTo(givenConfirmationMessage);
            then(tenDlcCampaign.getExampleMessages()).containsExactly(givenExampleMessage);
            then(tenDlcCampaign.getHelpMessage()).isEqualTo(givenHelpMessage);
            then(tenDlcCampaign.getStopMessage()).isEqualTo(givenStopMessage);
            then(tenDlcCampaign.getTermsAndConditionsUrl()).isEqualTo(givenTermsAndConditionsUrl);
            then(tenDlcCampaign.getCustomerCarePhone()).isEqualTo(givenCustomerCarePhone);
            then(tenDlcCampaign.getLowVolume()).isEqualTo(givenLowVolume);
            then(tenDlcCampaign.getUseCases()).containsExactlyInAnyOrder(givenUseCase1, givenUseCase2);
            then(tenDlcCampaign.getAgeGated()).isEqualTo(givenAgeGated);
            then(tenDlcCampaign.getDirectLending()).isEqualTo(givenDirectLending);
            then(tenDlcCampaign.getEmbeddedLink()).isEqualTo(givenEmbeddedLink);
            then(tenDlcCampaign.getEmbeddedPhone()).isEqualTo(givenEmbeddedPhone);
            then(tenDlcCampaign.getNumberKeys()).containsExactly(givenNumberKey);

            NumbersOptIns optIns = tenDlcCampaign.getOptIns();
            then(optIns).isNotNull();
            then(optIns.getKeyword()).isNotNull();
            then(optIns.getKeyword().getCallToAction()).isEqualTo(givenResponseOptInCallToAction);
            then(optIns.getKeyword().getKeywords()).containsExactly(givenOptInKeyword);

            NumbersBrandPreview brandPreview = tenDlcCampaign.getBrandPreview();
            then(brandPreview).isNotNull();
            then(brandPreview.getBrandId()).isEqualTo(givenBrandPreviewBrandId);
            then(brandPreview.getBrandName()).isEqualTo(givenBrandPreviewBrandName);

            then(tenDlcCampaign.getNumberPreviews()).isNotNull();
            then(tenDlcCampaign.getNumberPreviews().size()).isEqualTo(1);
            NumbersNumberPreview numberPreview =
                    tenDlcCampaign.getNumberPreviews().iterator().next();
            then(numberPreview.getNumberKey()).isEqualTo(givenNumberKey);
            then(numberPreview.getNumber()).isEqualTo(givenNumberPreviewNumber);
            then(numberPreview.getCountryCode()).isEqualTo(givenCountryCode);

            NumbersAppealData appealData = tenDlcCampaign.getAppealData();
            then(appealData).isNotNull();
            then(appealData.getAppealReason()).isEqualTo(givenAppealReason);
            then(appealData.getAppealDate()).isEqualTo(givenAppealDate);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");

        setUpNoResponseBodyDeleteRequest(CAMPAIGN.replace("{campaignId}", givenCampaignId.toString()), Map.of(), 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.deleteCampaign(givenCampaignId);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldSubmitCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        UUID givenPriorityId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6");

        String givenRequest = "{\n" + "  \"priorityId\": \"" + givenPriorityId + "\"\n" + "}\n";

        setUpNoResponseBodyPostRequest(
                REGISTER_CAMPAIGN.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenRequest, 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersRegisterCampaignRequest().priorityId(givenPriorityId);

        var call = api.registerCampaign(givenCampaignId, request);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldGetCampaignNetworkStatuses() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        NumbersNetwork givenNetwork1 = NumbersNetwork.ATT;
        NumbersNetworkState givenState1 = NumbersNetworkState.ACTIVE;
        String givenMessageClass1 = "A";
        Integer givenThroughput1 = 4500;

        String givenResponse = "{\n"
                + "  \"network\": \"ATT\",\n"
                + "  \"state\": \"ACTIVE\",\n"
                + "  \"messageClass\": \""
                + givenMessageClass1
                + "\",\n"
                + "  \"throughput\": "
                + givenThroughput1
                + ",\n"
                + "  \"brandTier\": null\n"
                + "}\n";

        setUpSuccessGetRequest(
                CAMPAIGN_NETWORK_STATUSES.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getCampaignNetworkStatuses(givenCampaignId);

        Consumer<NumbersNetworkStatus> assertions = response -> {
            then(response).isNotNull();
            then(response.getNetwork()).isEqualTo(givenNetwork1);
            then(response.getState()).isEqualTo(givenState1);
            then(response.getMessageClass()).isEqualTo(givenMessageClass1);
            then(response.getThroughput()).isEqualTo(givenThroughput1);
            then(response.getBrandTier()).isNull();
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeregisterCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");

        setUpNoBodyPostRequest(DEREGISTER_CAMPAIGN.replace("{campaignId}", givenCampaignId.toString()), Map.of(), 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.deregisterCampaign(givenCampaignId);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldUpdateRegisteredCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenNumberKey1 = "8F665E5F6582E586BA9DF4D227035298";
        String givenNumberKey2 = "D79C1785A82A2BC6FC0B867DCD055215";

        String givenRequest =
                String.format("{" + "\"numberKeys\":[\"%s\",\"%s\"]" + "}", givenNumberKey1, givenNumberKey2);

        setUpNoResponseBodyPostRequest(
                UPDATE_REGISTRATION.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenRequest, 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersUpdateCampaignRegistrationRequest()
                .numberKeys(new java.util.LinkedHashSet<>(List.of(givenNumberKey1, givenNumberKey2)));

        var call = api.updateRegisteredCampaign(givenCampaignId, request);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldAddNumbersToRegisteredCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenNumberKey1 = "8F665E5F6582E586BA9DF4D227035298";
        String givenNumberKey2 = "D79C1785A82A2BC6FC0B867DCD055215";

        String givenRequest =
                String.format("{" + "\"numberKeys\":[\"%s\",\"%s\"]" + "}", givenNumberKey1, givenNumberKey2);

        setUpNoResponseBodyPostRequest(
                ADD_NUMBERS.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenRequest, 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersUpdateCampaignRegistrationRequest()
                .numberKeys(new java.util.LinkedHashSet<>(List.of(givenNumberKey1, givenNumberKey2)));

        var call = api.addNumbers(givenCampaignId, request);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldRemoveNumbersFromRegisteredCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenNumberKey1 = "8F665E5F6582E586BA9DF4D227035298";
        String givenNumberKey2 = "D79C1785A82A2BC6FC0B867DCD055215";

        String givenRequest =
                String.format("{" + "\"numberKeys\":[\"%s\",\"%s\"]" + "}", givenNumberKey1, givenNumberKey2);

        setUpNoResponseBodyPostRequest(
                REMOVE_NUMBERS.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenRequest, 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersUpdateCampaignRegistrationRequest()
                .numberKeys(new java.util.LinkedHashSet<>(List.of(givenNumberKey1, givenNumberKey2)));

        var call = api.removeNumbers(givenCampaignId, request);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldGetCampaignNumbers() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenNumberKey1 = "2C958BA98F9EBACA4F9357D81BFBF47B";
        String givenNumber1 = "41793026727";
        String givenCountryCode1 = "US";
        String givenNumberKey2 = "D79C1785A82A2BC6FC0B867DCD055215";
        String givenNumber2 = "42893024539";
        String givenCountryCode2 = "US";

        String givenResponse = String.format(
                "{"
                        + "\"numberPreviews\":["
                        + "{\"numberKey\":\"%s\",\"number\":\"%s\",\"countryCode\":\"%s\"},"
                        + "{\"numberKey\":\"%s\",\"number\":\"%s\",\"countryCode\":\"%s\"}"
                        + "]"
                        + "}",
                givenNumberKey1, givenNumber1, givenCountryCode1, givenNumberKey2, givenNumber2, givenCountryCode2);

        setUpSuccessGetRequest(
                CAMPAIGN_NUMBERS.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getCampaignNumbers(givenCampaignId);

        Consumer<NumbersNumberPreviews> assertions = response -> {
            then(response).isNotNull();
            var firstPreview = response.getNumberPreviews().stream()
                    .filter(p -> givenNumberKey1.equals(p.getNumberKey()))
                    .findFirst()
                    .orElseThrow();
            then(firstPreview.getNumber()).isEqualTo(givenNumber1);
            then(firstPreview.getCountryCode()).isEqualTo(givenCountryCode1);
            var secondPreview = response.getNumberPreviews().stream()
                    .filter(p -> givenNumberKey2.equals(p.getNumberKey()))
                    .findFirst()
                    .orElseThrow();
            then(secondPreview.getNumber()).isEqualTo(givenNumber2);
            then(secondPreview.getCountryCode()).isEqualTo(givenCountryCode2);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAppealCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenReason = "Example appeal reason";

        String givenRequest = String.format("{\"reason\":\"%s\"}", givenReason);

        setUpNoResponseBodyPostRequest(
                APPEAL_CAMPAIGN.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenRequest, 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersAppealRequest().reason(givenReason);

        var call = api.appealCampaign(givenCampaignId, request);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldGetCampaignPriorities() {
        UUID givenPriorityId1 = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        Integer givenDailySubmitLimit1 = 10;
        NumbersPriorityTimeUnit givenTimeUnit1 = NumbersPriorityTimeUnit.HOURS;
        Integer givenAmount1 = 2;

        String givenResponse = String.format(
                "{\"priorityId\":\"%s\",\"dailySubmitLimit\":%d,\"reviewTime\":{\"timeUnit\":\"%s\",\"amount\":%d}}",
                givenPriorityId1, givenDailySubmitLimit1, givenTimeUnit1.getValue(), givenAmount1);

        setUpSuccessGetRequest(CAMPAIGN_PRIORITIES, Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getCampaignPriorities();

        Consumer<NumbersPriority> assertions = response -> {
            then(response).isNotNull();
            then(response.getPriorityId()).isEqualTo(givenPriorityId1);
            then(response.getDailySubmitLimit()).isEqualTo(givenDailySubmitLimit1);
            then(response.getReviewTime().getTimeUnit()).isEqualTo(givenTimeUnit1);
            then(response.getReviewTime().getAmount()).isEqualTo(givenAmount1);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAttachNumberPoolToCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenNumberPoolId = "number-pool-identifier";
        String givenReason = "Example attach reason";

        String givenRequest =
                String.format("{\"numberPoolId\":\"%s\",\"reason\":\"%s\"}", givenNumberPoolId, givenReason);

        setUpNoResponseBodyPostRequest(
                ATTACH_NUMBER_POOL.replace("{campaignId}", givenCampaignId.toString()), Map.of(), givenRequest, 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersAttachNumberPoolRequest()
                .numberPoolId(givenNumberPoolId)
                .reason(givenReason);

        var call = api.attachNumberPool(givenCampaignId, request);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldDetachNumberPoolFromCampaign() {
        UUID givenCampaignId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");

        setUpNoBodyPostRequest(DETACH_NUMBER_POOL.replace("{campaignId}", givenCampaignId.toString()), Map.of(), 204);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.detachNumberPool(givenCampaignId);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldReceiveCampaignNetworkStatusUpdate() {
        UUID givenCampaignId = UUID.fromString("38a1c2c6-55f2-11ee-a061-325096b39f47");
        String givenReceivedAtString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenReceivedAt = OffsetDateTime.parse(givenReceivedAtString);
        NumbersCampaignRegistrar givenCampaignNetwork = NumbersCampaignRegistrar.VERIZON;
        NumbersWebhookCampaignNetworkStatus givenCampaignNetworkStatus = NumbersWebhookCampaignNetworkStatus.ACTIVE;
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"CAMPAIGN_NETWORK_STATUS_UPDATE\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"campaignId\": \""
                + givenCampaignId
                + "\",\n"
                + "        \"campaignNetwork\": \"VERIZON\",\n"
                + "        \"campaignNetworkStatus\": \"ACTIVE\"\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        NumbersCampaignNetworkStatusWebhookResponse requestBody =
                json.deserialize(givenRequest, NumbersCampaignNetworkStatusWebhookResponse.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        NumbersCampaignNetworkStatusWebhookMessage message =
                requestBody.getResults().get(0);
        then(message.getEvent())
                .isEqualTo(NumbersCampaignNetworkStatusWebhookMessage.EventEnum.CAMPAIGN_NETWORK_STATUS_UPDATE);
        then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(message.getPlatform()).isNotNull();
        then(message.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(message.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        NumbersCampaignNetworkStatusWebhookContent content = message.getContent();
        then(content).isNotNull();
        then(content.getCampaignId()).isEqualTo(givenCampaignId);
        then(content.getCampaignNetwork()).isEqualTo(givenCampaignNetwork);
        then(content.getCampaignNetworkStatus()).isEqualTo(givenCampaignNetworkStatus);
    }

    @Test
    void shouldReceiveCampaignStatusUpdate() {
        UUID givenCampaignId = UUID.fromString("38a1c2c6-55f2-11ee-a061-325096b39f47");
        String givenReceivedAtString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenReceivedAt = OffsetDateTime.parse(givenReceivedAtString);
        NumbersWebhookCampaignStage givenCampaignStatus = NumbersWebhookCampaignStage.REJECTED;
        String givenRejectionReasons = "Unable to verify, need website.";
        String givenErrorCode = "1001";
        String givenDescription =
                "Campaign appears to be for an age gated content type but age gate attribute is not selected.";
        String givenRejectionDateString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenRejectionDate = OffsetDateTime.parse(givenRejectionDateString);
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"CAMPAIGN_STATUS_UPDATE\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"campaignId\": \""
                + givenCampaignId
                + "\",\n"
                + "        \"campaignStatus\": \"REJECTED\",\n"
                + "        \"rejectionReasons\": \""
                + givenRejectionReasons
                + "\",\n"
                + "        \"rejectionDetails\": [\n"
                + "          {\n"
                + "            \"errorCode\": \""
                + givenErrorCode
                + "\",\n"
                + "            \"description\": \""
                + givenDescription
                + "\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"rejectionDate\": \""
                + givenRejectionDateString
                + "\"\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        NumbersCampaignStatusWebhookResponse requestBody =
                json.deserialize(givenRequest, NumbersCampaignStatusWebhookResponse.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        NumbersCampaignStatusWebhookMessage message = requestBody.getResults().get(0);
        then(message.getEvent()).isEqualTo(NumbersCampaignStatusWebhookMessage.EventEnum.CAMPAIGN_STATUS_UPDATE);
        then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(message.getPlatform()).isNotNull();
        then(message.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(message.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        NumbersCampaignStatusWebhookContent content = message.getContent();
        then(content).isNotNull();
        then(content.getCampaignId()).isEqualTo(givenCampaignId);
        then(content.getCampaignStatus()).isEqualTo(givenCampaignStatus);
        then(content.getRejectionReasons()).isEqualTo(givenRejectionReasons);
        then(content.getRejectionDate()).isEqualTo(givenRejectionDate);
        then(content.getRejectionDetails()).isNotNull();
        then(content.getRejectionDetails().size()).isEqualTo(1);
        NumbersRejectionReasonPayload rejectionDetail =
                content.getRejectionDetails().get(0);
        then(rejectionDetail.getErrorCode()).isEqualTo(givenErrorCode);
        then(rejectionDetail.getDescription()).isEqualTo(givenDescription);
    }

    @Test
    void shouldGetOwnedNumberPools() {
        String givenNumberPoolId1 = "number-pool-identifier-1";
        String givenCampaignId1 = "4d3601ed-c632-4979-ae22-43854ef4ffaf";
        String givenCampaignName1 = "Example name";
        String givenNumberPoolId2 = "number-pool-identifier-2";
        Integer givenPage = 0;
        Integer givenSize = 20;
        Integer givenTotalPages = 1;
        Long givenTotalResults = 2L;

        String givenResponse = String.format(
                "{"
                        + "\"results\":["
                        + "{\"numberPoolId\":\"%s\",\"campaignId\":\"%s\",\"campaignName\":\"%s\"},"
                        + "{\"numberPoolId\":\"%s\"}"
                        + "],"
                        + "\"paging\":{\"page\":%d,\"size\":%d,\"totalPages\":%d,\"totalResults\":%d}"
                        + "}",
                givenNumberPoolId1,
                givenCampaignId1,
                givenCampaignName1,
                givenNumberPoolId2,
                givenPage,
                givenSize,
                givenTotalPages,
                givenTotalResults);

        setUpSuccessGetRequest(NUMBER_POOLS, Map.of(), givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getOwnedNumberPools();

        Consumer<NumbersNumberPoolUsageApiPageResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(2);
            var firstResult = response.getResults().get(0);
            then(firstResult.getNumberPoolId()).isEqualTo(givenNumberPoolId1);
            then(firstResult.getCampaignId()).isEqualTo(givenCampaignId1);
            then(firstResult.getCampaignName()).isEqualTo(givenCampaignName1);
            var secondResult = response.getResults().get(1);
            then(secondResult.getNumberPoolId()).isEqualTo(givenNumberPoolId2);
            then(response.getPaging()).isNotNull();
            then(response.getPaging().getPage()).isEqualTo(givenPage);
            then(response.getPaging().getSize()).isEqualTo(givenSize);
            then(response.getPaging().getTotalPages()).isEqualTo(givenTotalPages);
            then(response.getPaging().getTotalResults()).isEqualTo(givenTotalResults);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUploadDocument() throws IOException {
        String givenFileContent = "74AEE8084910ED9207FD67107DE275B43AC04AEEA6";
        UUID givenDocumentId = UUID.fromString("9904751a-9436-4bda-b98a-37b1f7179483");
        String givenDocumentName = "Example document.pdf";
        String givenContentType = "application/pdf";
        Integer givenContentLength = 14956;

        File tempFile = File.createTempFile("document", ".pdf");
        Files.writeString(tempFile.toPath(), givenFileContent);

        String givenResponse = String.format(
                "{"
                        + "\"documentId\":\"%s\","
                        + "\"documentName\":\"%s\","
                        + "\"contentType\":\"%s\","
                        + "\"contentLength\":%d"
                        + "}",
                givenDocumentId, givenDocumentName, givenContentType, givenContentLength);

        setUpMultipartRequest(DOCUMENTS, List.of(new Multipart("document", givenFileContent)), givenResponse, 201);

        NumbersApi api = new NumbersApi(getApiClient());

        Consumer<NumbersDocumentMetadata> assertions = response -> {
            then(response).isNotNull();
            then(response.getDocumentId()).isEqualTo(givenDocumentId);
            then(response.getDocumentName()).isEqualTo(givenDocumentName);
            then(response.getContentType()).isEqualTo(givenContentType);
            then(response.getContentLength()).isEqualTo(givenContentLength);
        };

        var call = api.uploadDocumentMetadata(tempFile);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDownloadDocument() {
        UUID givenDocumentId = UUID.fromString("9904751a-9436-4bda-b98a-37b1f7179483");
        String givenFileContent = "74AEE8084910ED9207FD67107DE275B43AC04AEEA6";

        setUpGetRequestOctet(
                DOCUMENT.replace("{documentId}", givenDocumentId.toString()), Map.of(), givenFileContent, 200);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.downloadDocumentContent(givenDocumentId);
        testSuccessfulCallWithFileResult(call::execute);
    }

    @Test
    void shouldSubmitExistingCampaignForAiReview() {
        UUID givenCampaignUuid = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        UUID givenRequestUuid = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6");

        String givenResponse = String.format("{\"requestUuid\":\"%s\"}", givenRequestUuid);

        setUpEmptyPostRequest(
                AUTOMATIC_REVIEW_CAMPAIGN.replace("{campaignUuid}", givenCampaignUuid.toString()),
                Map.of(),
                givenResponse,
                202);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.submitExistingCampaignForAiReview(givenCampaignUuid);

        Consumer<NumbersReviewSubmissionResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getRequestUuid()).isEqualTo(givenRequestUuid);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSubmitCampaignInfoForAiReview() {
        String givenOptInMessage =
                "Welcome to Example Corp alerts! Msg&data rates may apply. Reply HELP for help, STOP to cancel.";
        String givenHelpMessage =
                "Example Corp Help: contact support@example.com or call 1-800-555-0100. Msg&data rates may apply.";
        String givenOptOutMessage = "You have been unsubscribed from Example Corp alerts. Text START to resubscribe.";
        String givenCtaWebsite = "https://www.example.com/opt-in";
        String givenCta1 = "Text JOIN to 12345 to subscribe";
        String givenCta2 = "Visit https://example.com/opt-in to sign up";
        NumbersTenDlcUseCase givenUseCase = NumbersTenDlcUseCase.PROMOTIONAL_MARKETING;
        Boolean givenAgeGated = false;
        Boolean givenDirectLending = false;
        String givenMessageFlow = "Users opt-in via website, receive confirmation messages";
        UUID givenRequestUuid = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6");

        String givenRequest = String.format(
                "{"
                        + "\"optInMessage\":\"%s\","
                        + "\"helpMessage\":\"%s\","
                        + "\"optOutMessage\":\"%s\","
                        + "\"ctaWebsite\":\"%s\","
                        + "\"ctas\":[\"%s\",\"%s\"],"
                        + "\"useCases\":[\"%s\"],"
                        + "\"ageGated\":%b,"
                        + "\"directLending\":%b,"
                        + "\"messageFlow\":\"%s\""
                        + "}",
                givenOptInMessage,
                givenHelpMessage,
                givenOptOutMessage,
                givenCtaWebsite,
                givenCta1,
                givenCta2,
                givenUseCase.getValue(),
                givenAgeGated,
                givenDirectLending,
                givenMessageFlow);

        String givenResponse = String.format("{\"requestUuid\":\"%s\"}", givenRequestUuid);

        setUpPostRequest(AUTOMATIC_REVIEW, givenRequest, givenResponse, 202);

        NumbersApi api = new NumbersApi(getApiClient());

        var request = new NumbersTenDlcAiReviewRequest()
                .optInMessage(givenOptInMessage)
                .helpMessage(givenHelpMessage)
                .optOutMessage(givenOptOutMessage)
                .ctaWebsite(givenCtaWebsite)
                .ctas(List.of(givenCta1, givenCta2))
                .useCases(List.of(givenUseCase))
                .ageGated(givenAgeGated)
                .directLending(givenDirectLending)
                .messageFlow(givenMessageFlow);

        var call = api.submitCampaignInfoForAiReview(request);

        Consumer<NumbersReviewSubmissionResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getRequestUuid()).isEqualTo(givenRequestUuid);
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetAiReviewResults() {
        UUID givenRequestUuid = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6");
        NumbersExternalAutomaticReviewStatus givenReviewStatus = NumbersExternalAutomaticReviewStatus.COMPLIANT;

        String givenResponse =
                String.format("{\"reviewStatus\":\"%s\",\"campaignErrors\":[]}", givenReviewStatus.getValue());

        setUpSuccessGetRequest(
                AUTOMATIC_REVIEW_RESULTS.replace("{requestUuid}", givenRequestUuid.toString()),
                Map.of(),
                givenResponse);

        NumbersApi api = new NumbersApi(getApiClient());

        var call = api.getAiReviewResults(givenRequestUuid);

        Consumer<NumbersExternalAutomaticReviewResults> assertions = response -> {
            then(response).isNotNull();
            then(response.getReviewStatus()).isEqualTo(givenReviewStatus);
            then(response.getCampaignErrors()).isNotNull();
            then(response.getCampaignErrors()).isEmpty();
        };

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldReceiveAiCampaignFeedback() {
        UUID givenAiCampaignFeedbackRequestUuid = UUID.fromString("f371631b-f204-4488-9393-981fadd088c7");
        String givenReceivedAtString = "2019-08-24T14:15:22Z";
        OffsetDateTime givenReceivedAt = OffsetDateTime.parse(givenReceivedAtString);
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"AI_CAMPAIGN_FEEDBACK\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"aiCampaignFeedbackRequestUuid\": \""
                + givenAiCampaignFeedbackRequestUuid
                + "\"\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        NumbersCampaignAiFeedbackWebhookResponse requestBody =
                json.deserialize(givenRequest, NumbersCampaignAiFeedbackWebhookResponse.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        NumbersCampaignAiFeedbackWebhookMessage message =
                requestBody.getResults().get(0);
        then(message.getEvent()).isEqualTo(NumbersCampaignAiFeedbackWebhookMessage.EventEnum.AI_CAMPAIGN_FEEDBACK);
        then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(message.getPlatform()).isNotNull();
        then(message.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(message.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        NumbersCampaignAiFeedbackWebhookContent content = message.getContent();
        then(content).isNotNull();
        then(content.getAiCampaignFeedbackRequestUuid()).isEqualTo(givenAiCampaignFeedbackRequestUuid);
    }
}
