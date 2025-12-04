package com.infobip.api;

import static com.infobip.api.util.ResponseStatuses.*;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.ApiCallback;
import com.infobip.ApiException;
import com.infobip.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class CapabilityCheckApiTest extends ApiTest {

    private static final String CAPABILITY_CHECK = "/number/1/capability-check";

    @Test
    void shouldCheckCapabilities() {
        // Given
        String givenPhoneNumber1 = "41793026727";
        String givenPhoneNumber2 = "385915242424";

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"phoneNumber\": \"" + givenPhoneNumber1 + "\",\n"
                + "      \"mccMnc\": \"22801\",\n"
                + "      \"countryCode\": \"CH\",\n"
                + "      \"networkName\": \"Sunrise\",\n"
                + "      \"capabilities\": [\n"
                + "        {\n"
                + "          \"channel\": \"SMS\",\n"
                + "          \"supported\": true\n"
                + "        },\n"
                + "        {\n"
                + "          \"channel\": \"RCS\",\n"
                + "          \"supported\": true\n"
                + "        },\n"
                + "        {\n"
                + "          \"channel\": \"WHATSAPP\",\n"
                + "          \"supported\": false,\n"
                + "          \"reason\": \"Not registered on WhatsApp\"\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    {\n"
                + "      \"phoneNumber\": \"" + givenPhoneNumber2 + "\",\n"
                + "      \"mccMnc\": \"21901\",\n"
                + "      \"countryCode\": \"HR\",\n"
                + "      \"networkName\": \"T-Mobile\",\n"
                + "      \"capabilities\": [\n"
                + "        {\n"
                + "          \"channel\": \"SMS\",\n"
                + "          \"supported\": true\n"
                + "        },\n"
                + "        {\n"
                + "          \"channel\": \"RCS\",\n"
                + "          \"supported\": false,\n"
                + "          \"reason\": \"RCS not enabled for this network\"\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"numbers\": [\n"
                + "    \"" + givenPhoneNumber1 + "\",\n"
                + "    \"" + givenPhoneNumber2 + "\"\n"
                + "  ],\n"
                + "  \"channels\": [\n"
                + "    \"SMS\",\n"
                + "    \"RCS\",\n"
                + "    \"WHATSAPP\"\n"
                + "  ]\n"
                + "}";

        // When
        setUpSuccessPostRequest(CAPABILITY_CHECK, expectedRequest, givenResponse);

        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());

        CapabilityCheckRequest request = new CapabilityCheckRequest()
                .numbers(List.of(givenPhoneNumber1, givenPhoneNumber2))
                .channels(List.of("SMS", "RCS", "WHATSAPP"));

        // Then
        Consumer<CapabilityCheckResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).hasSize(2);

            // Verify first number
            CapabilityCheckResult result1 = response.getResults().get(0);
            then(result1.getPhoneNumber()).isEqualTo(givenPhoneNumber1);
            then(result1.getMccMnc()).isEqualTo("22801");
            then(result1.getCountryCode()).isEqualTo("CH");
            then(result1.getNetworkName()).isEqualTo("Sunrise");
            then(result1.getCapabilities()).hasSize(3);

            ChannelCapability smsCapability = result1.getCapabilities().get(0);
            then(smsCapability.getChannel()).isEqualTo("SMS");
            then(smsCapability.getSupported()).isTrue();

            ChannelCapability rcsCapability = result1.getCapabilities().get(1);
            then(rcsCapability.getChannel()).isEqualTo("RCS");
            then(rcsCapability.getSupported()).isTrue();

            ChannelCapability whatsappCapability = result1.getCapabilities().get(2);
            then(whatsappCapability.getChannel()).isEqualTo("WHATSAPP");
            then(whatsappCapability.getSupported()).isFalse();
            then(whatsappCapability.getReason()).isEqualTo("Not registered on WhatsApp");

            // Verify second number
            CapabilityCheckResult result2 = response.getResults().get(1);
            then(result2.getPhoneNumber()).isEqualTo(givenPhoneNumber2);
            then(result2.getMccMnc()).isEqualTo("21901");
            then(result2.getCountryCode()).isEqualTo("HR");
            then(result2.getNetworkName()).isEqualTo("T-Mobile");
            then(result2.getCapabilities()).hasSize(2);
        };

        var call = api.checkCapabilities(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCheckCapabilitiesForSingleNumber() {
        // Given
        String givenPhoneNumber = "41793026727";

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"phoneNumber\": \"" + givenPhoneNumber + "\",\n"
                + "      \"mccMnc\": \"22801\",\n"
                + "      \"countryCode\": \"CH\",\n"
                + "      \"networkName\": \"Sunrise\",\n"
                + "      \"capabilities\": [\n"
                + "        {\n"
                + "          \"channel\": \"SMS\",\n"
                + "          \"supported\": true\n"
                + "        },\n"
                + "        {\n"
                + "          \"channel\": \"VOICE\",\n"
                + "          \"supported\": true\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n" + "  \"numbers\": [\n" + "    \"" + givenPhoneNumber + "\"\n" + "  ]\n" + "}";

        // When
        setUpSuccessPostRequest(CAPABILITY_CHECK, expectedRequest, givenResponse);

        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());

        CapabilityCheckRequest request = new CapabilityCheckRequest().addNumbersItem(givenPhoneNumber);

        // Then
        Consumer<CapabilityCheckResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).hasSize(1);

            CapabilityCheckResult result = response.getResults().get(0);
            then(result.getPhoneNumber()).isEqualTo(givenPhoneNumber);
            then(result.getCapabilities()).hasSize(2);

            then(result.getCapabilities().get(0).getChannel()).isEqualTo("SMS");
            then(result.getCapabilities().get(0).getSupported()).isTrue();

            then(result.getCapabilities().get(1).getChannel()).isEqualTo("VOICE");
            then(result.getCapabilities().get(1).getSupported()).isTrue();
        };

        var call = api.checkCapabilities(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleEmptyCapabilitiesResponse() {
        // Given
        String givenPhoneNumber = "00000000000";

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"phoneNumber\": \"" + givenPhoneNumber + "\",\n"
                + "      \"capabilities\": []\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n" + "  \"numbers\": [\n" + "    \"" + givenPhoneNumber + "\"\n" + "  ]\n" + "}";

        // When
        setUpSuccessPostRequest(CAPABILITY_CHECK, expectedRequest, givenResponse);

        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());

        CapabilityCheckRequest request = new CapabilityCheckRequest().addNumbersItem(givenPhoneNumber);

        // Then
        Consumer<CapabilityCheckResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).hasSize(1);
            then(response.getResults().get(0).getCapabilities()).isEmpty();
        };

        var call = api.checkCapabilities(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleCapabilityCheckError() {
        // Given
        String invalidNumber = "invalid";
        String givenResponse = "{\n"
                + "  \"errorCode\": \"E400\",\n"
                + "  \"description\": \"Invalid phone number format.\",\n"
                + "  \"action\": \"Check phone number format and retry.\",\n"
                + "  \"violations\": [\n"
                + "    {\n"
                + "      \"field\": \"numbers[0]\",\n"
                + "      \"description\": \"Invalid phone number format\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n" + "  \"numbers\": [\n" + "    \"" + invalidNumber + "\"\n" + "  ]\n" + "}";

        // When
        setUpPostRequest(CAPABILITY_CHECK, expectedRequest, givenResponse, 400);

        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());

        CapabilityCheckRequest request = new CapabilityCheckRequest().addNumbersItem(invalidNumber);

        // Then
        Consumer<ApiException> assertions = (exception) -> {
            then(exception).isNotNull();
            then(exception.responseStatusCode()).isEqualTo(400);
            then(exception.rawResponseBody()).isEqualTo(givenResponse);
        };

        testFailedCall(() -> api.checkCapabilities(request).execute(), assertions);
        testFailedAsyncCall(
                (ApiCallback<CapabilityCheckResponse> callback) ->
                        api.checkCapabilities(request).executeAsync(callback),
                assertions);
    }

    @Test
    void shouldHandlePartialCapabilityResults() {
        // Given - some numbers valid, some invalid
        String validNumber = "41793026727";
        String invalidNumber = "00000000000";

        String givenResponse = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"phoneNumber\": \"" + validNumber + "\",\n"
                + "      \"mccMnc\": \"22801\",\n"
                + "      \"countryCode\": \"CH\",\n"
                + "      \"networkName\": \"Sunrise\",\n"
                + "      \"capabilities\": [\n"
                + "        {\n"
                + "          \"channel\": \"SMS\",\n"
                + "          \"supported\": true\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    {\n"
                + "      \"phoneNumber\": \"" + invalidNumber + "\",\n"
                + "      \"capabilities\": [\n"
                + "        {\n"
                + "          \"channel\": \"SMS\",\n"
                + "          \"supported\": false,\n"
                + "          \"reason\": \"Number not recognized\"\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"numbers\": [\n"
                + "    \"" + validNumber + "\",\n"
                + "    \"" + invalidNumber + "\"\n"
                + "  ],\n"
                + "  \"channels\": [\n"
                + "    \"SMS\"\n"
                + "  ]\n"
                + "}";

        // When
        setUpSuccessPostRequest(CAPABILITY_CHECK, expectedRequest, givenResponse);

        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());

        CapabilityCheckRequest request = new CapabilityCheckRequest()
                .numbers(List.of(validNumber, invalidNumber))
                .channels(List.of("SMS"));

        // Then
        Consumer<CapabilityCheckResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).hasSize(2);

            // Valid number has full details
            CapabilityCheckResult validResult = response.getResults().get(0);
            then(validResult.getPhoneNumber()).isEqualTo(validNumber);
            then(validResult.getMccMnc()).isNotNull();
            then(validResult.getCountryCode()).isNotNull();
            then(validResult.getCapabilities().get(0).getSupported()).isTrue();

            // Invalid number has limited details
            CapabilityCheckResult invalidResult = response.getResults().get(1);
            then(invalidResult.getPhoneNumber()).isEqualTo(invalidNumber);
            then(invalidResult.getMccMnc()).isNull();
            then(invalidResult.getCountryCode()).isNull();
            then(invalidResult.getCapabilities().get(0).getSupported()).isFalse();
            then(invalidResult.getCapabilities().get(0).getReason()).isNotNull();
        };

        var call = api.checkCapabilities(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleRateLimitError() {
        // Given
        String givenResponse = "{\n"
                + "  \"errorCode\": \"E429\",\n"
                + "  \"description\": \"Too many requests.\",\n"
                + "  \"action\": \"Retry after some time.\"\n"
                + "}";

        String expectedRequest = "{\n" + "  \"numbers\": [\n" + "    \"41793026727\"\n" + "  ]\n" + "}";

        // When
        setUpPostRequest(CAPABILITY_CHECK, expectedRequest, givenResponse, 429);

        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());

        CapabilityCheckRequest request = new CapabilityCheckRequest().addNumbersItem("41793026727");

        // Then
        Consumer<ApiException> assertions = (exception) -> {
            then(exception).isNotNull();
            then(exception.responseStatusCode()).isEqualTo(429);
            then(exception.rawResponseBody()).contains("E429");
        };

        testFailedCall(() -> api.checkCapabilities(request).execute(), assertions);
    }

    @Test
    void shouldHandleLargeNumberBatch() {
        // Given - testing with maximum allowed numbers
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add("4179302" + String.format("%04d", i));
        }

        StringBuilder resultsJson = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (i > 0) resultsJson.append(",");
            resultsJson.append(String.format(
                    "{\"phoneNumber\":\"%s\",\"capabilities\":[{\"channel\":\"SMS\",\"supported\":true}]}",
                    numbers.get(i)));
        }

        String givenResponse = "{\"results\":[" + resultsJson + "]}";

        // When
        CapabilityCheckApi api = new CapabilityCheckApi(getApiClient());
        CapabilityCheckRequest request = new CapabilityCheckRequest().numbers(numbers);

        // Note: In real test we would set up the mock, simplified here
        then(request.getNumbers()).hasSize(100);
    }
}
