package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class NumberLookupApiTest extends ApiTest {

    private static final String NUMBER_CONTEXT_LOOKUP_ASYNC = "/number/1/notify";
    private static final String NUMBER_CONTEXT_LOOKUP = "/number/1/query";
    private static final String NUMBER_CONTEXT_LOGS = "/number/1/logs";

    @Test
    void shouldNumberContextLookupAsync() {
        String givenNotifyContentType = "application/json";
        String givenNotifyUrl = "https://www.example.com/number/lookup/report";
        String givenTo1 = "41793026727";
        String givenTo2 = "41793026834";

        String givenResultTo1 = "3859851212";
        Integer givenResultGroupId1 = 1;
        String givenResultGroupName1 = "PENDING";
        Integer givenResultStatusId1 = 3;
        String givenResultStatusName1 = "PENDING_WAITING_DELIVERY";
        String givenResultDescription1 = "Message sent, waiting for delivery report";
        String givenResultMessageId1 = "2b691c32-1233-4716-a763-4f70cc929eae";

        String givenResultTo2 = "3816038923";
        Integer givenResultGroupId2 = 1;
        String givenResultGroupName2 = "PENDING";
        Integer givenResultStatusId2 = 3;
        String givenResultStatusName2 = "PENDING_WAITING_DELIVERY";
        String givenResultDescription2 = "Message sent, waiting for delivery report";
        String givenResultMessageId2 = "24c753c7-8113-4983-9ddb-c50978ba47dc";

        String givenBulkId = "BULK-ID-123-xyz";

        String givenResponse = String.format(
                "{\n"
                        + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"messageId\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"messageId\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"bulkId\": \"%s\"\n"
                        + "}\n",
                givenResultTo1,
                givenResultGroupId1,
                givenResultGroupName1,
                givenResultStatusId1,
                givenResultStatusName1,
                givenResultDescription1,
                givenResultMessageId1,
                givenResultTo2,
                givenResultGroupId2,
                givenResultGroupName2,
                givenResultStatusId2,
                givenResultStatusName2,
                givenResultDescription2,
                givenResultMessageId2,
                givenBulkId);

        String expectedRequest = String.format(
                "{\n"
                        + "  \"notifyContentType\": \"%s\",\n"
                        + "  \"notifyUrl\": \"%s\",\n"
                        + "  \"to\": [\n"
                        + "    \"%s\",\n"
                        + "    \"%s\"\n"
                        + "  ]\n"
                        + "}\n",
                givenNotifyContentType, givenNotifyUrl, givenTo1, givenTo2);

        setUpSuccessPostRequest(NUMBER_CONTEXT_LOOKUP_ASYNC, expectedRequest, givenResponse);

        NumberLookupApi api = new NumberLookupApi(getApiClient());

        NumberLookupNotifyRequest request = new NumberLookupNotifyRequest()
                .notifyContentType(givenNotifyContentType)
                .notifyUrl(givenNotifyUrl)
                .to(List.of(givenTo1, givenTo2));

        Consumer<NumberLookupResponseAsync> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getResults()).isNotNull();
            then(response.getResults()).hasSize(2);

            NumberLookupResponseAsyncDetails result1 = response.getResults().get(0);
            then(result1.getTo()).isEqualTo(givenResultTo1);
            then(result1.getMessageId()).isEqualTo(givenResultMessageId1);
            then(result1.getStatus()).isNotNull();
            then(result1.getStatus().getGroupId()).isEqualTo(givenResultGroupId1);
            then(result1.getStatus().getGroupName()).isEqualTo(givenResultGroupName1);
            then(result1.getStatus().getId()).isEqualTo(givenResultStatusId1);
            then(result1.getStatus().getName()).isEqualTo(givenResultStatusName1);
            then(result1.getStatus().getDescription()).isEqualTo(givenResultDescription1);

            NumberLookupResponseAsyncDetails result2 = response.getResults().get(1);
            then(result2.getTo()).isEqualTo(givenResultTo2);
            then(result2.getMessageId()).isEqualTo(givenResultMessageId2);
            then(result2.getStatus()).isNotNull();
            then(result2.getStatus().getGroupId()).isEqualTo(givenResultGroupId2);
            then(result2.getStatus().getGroupName()).isEqualTo(givenResultGroupName2);
            then(result2.getStatus().getId()).isEqualTo(givenResultStatusId2);
            then(result2.getStatus().getName()).isEqualTo(givenResultStatusName2);
            then(result2.getStatus().getDescription()).isEqualTo(givenResultDescription2);
        };

        var call = api.numberContextLookupAsync(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldNumberContextLookup() {
        String givenTo = "41793026727";

        String givenResultTo = "41793026727";
        String givenMccMnc = "22801";
        String givenImsi = "228011234567890";

        String givenOriginalNetworkName = "Swisscom";
        String givenOriginalNetworkPrefix = "79";
        String givenOriginalCountryName = "Switzerland";
        String givenOriginalCountryPrefix = "41";
        Integer givenOriginalNetworkId = 123;

        Boolean givenPorted = true;

        String givenPortedNetworkName = "Sunrise";
        String givenPortedNetworkPrefix = "77";
        String givenPortedCountryName = "Switzerland";
        String givenPortedCountryPrefix = "41";
        Integer givenPortedNetworkId = 321;

        Boolean givenRoaming = false;
        String givenServingMSC = "41002";

        Integer givenStatusGroupId = 3;
        String givenStatusGroupName = "DELIVERED";
        Integer givenStatusId = 5;
        String givenStatusName = "DELIVERED_TO_HANDSET";
        String givenStatusDescription = "Message delivered to handset";

        Integer givenErrorGroupId = 0;
        String givenErrorGroupName = "Ok";
        Integer givenErrorId = 0;
        String givenErrorName = "NO_ERROR";
        String givenErrorDescription = "No Error";
        Boolean givenErrorPermanent = false;

        String givenBulkId = "BULK-ID-123-xyz";

        String givenResponse = String.format(
                "{\n"
                        + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"mccMnc\": \"%s\",\n"
                        + "      \"imsi\": \"%s\",\n"
                        + "      \"originalNetwork\": {\n"
                        + "        \"networkName\": \"%s\",\n"
                        + "        \"networkPrefix\": \"%s\",\n"
                        + "        \"countryName\": \"%s\",\n"
                        + "        \"countryPrefix\": \"%s\",\n"
                        + "        \"networkId\": %d\n"
                        + "      },\n"
                        + "      \"ported\": %b,\n"
                        + "      \"portedNetwork\": {\n"
                        + "        \"networkName\": \"%s\",\n"
                        + "        \"networkPrefix\": \"%s\",\n"
                        + "        \"countryName\": \"%s\",\n"
                        + "        \"countryPrefix\": \"%s\",\n"
                        + "        \"networkId\": %d\n"
                        + "      },\n"
                        + "      \"roaming\": %b,\n"
                        + "      \"servingMSC\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"error\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\",\n"
                        + "        \"permanent\": %b\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"bulkId\": \"%s\"\n"
                        + "}\n",
                givenResultTo,
                givenMccMnc,
                givenImsi,
                givenOriginalNetworkName,
                givenOriginalNetworkPrefix,
                givenOriginalCountryName,
                givenOriginalCountryPrefix,
                givenOriginalNetworkId,
                givenPorted,
                givenPortedNetworkName,
                givenPortedNetworkPrefix,
                givenPortedCountryName,
                givenPortedCountryPrefix,
                givenPortedNetworkId,
                givenRoaming,
                givenServingMSC,
                givenStatusGroupId,
                givenStatusGroupName,
                givenStatusId,
                givenStatusName,
                givenStatusDescription,
                givenErrorGroupId,
                givenErrorGroupName,
                givenErrorId,
                givenErrorName,
                givenErrorDescription,
                givenErrorPermanent,
                givenBulkId);

        String expectedRequest = String.format("{\n" + "  \"to\": [\n" + "    \"%s\"\n" + "  ]\n" + "}\n", givenTo);

        setUpSuccessPostRequest(NUMBER_CONTEXT_LOOKUP, expectedRequest, givenResponse);

        NumberLookupApi api = new NumberLookupApi(getApiClient());

        NumberLookupQueryRequest request = new NumberLookupQueryRequest().to(List.of(givenTo));

        Consumer<NumberLookupResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getResults()).isNotNull();
            then(response.getResults()).hasSize(1);

            NumberLookupResponseDetails result = response.getResults().get(0);
            then(result.getTo()).isEqualTo(givenResultTo);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            then(result.getImsi()).isEqualTo(givenImsi);
            then(result.getPorted()).isEqualTo(givenPorted);
            then(result.getRoaming()).isEqualTo(givenRoaming);
            then(result.getServingMSC()).isEqualTo(givenServingMSC);

            NumberLookupNetwork originalNetwork = result.getOriginalNetwork();
            then(originalNetwork).isNotNull();
            then(originalNetwork.getNetworkName()).isEqualTo(givenOriginalNetworkName);
            then(originalNetwork.getNetworkPrefix()).isEqualTo(givenOriginalNetworkPrefix);
            then(originalNetwork.getCountryName()).isEqualTo(givenOriginalCountryName);
            then(originalNetwork.getCountryPrefix()).isEqualTo(givenOriginalCountryPrefix);
            then(originalNetwork.getNetworkId()).isEqualTo(givenOriginalNetworkId);

            NumberLookupNetwork portedNetwork = result.getPortedNetwork();
            then(portedNetwork).isNotNull();
            then(portedNetwork.getNetworkName()).isEqualTo(givenPortedNetworkName);
            then(portedNetwork.getNetworkPrefix()).isEqualTo(givenPortedNetworkPrefix);
            then(portedNetwork.getCountryName()).isEqualTo(givenPortedCountryName);
            then(portedNetwork.getCountryPrefix()).isEqualTo(givenPortedCountryPrefix);
            then(portedNetwork.getNetworkId()).isEqualTo(givenPortedNetworkId);

            MessageStatus status = result.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);

            MessageError error = result.getError();
            then(error).isNotNull();
            then(error.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error.getId()).isEqualTo(givenErrorId);
            then(error.getName()).isEqualTo(givenErrorName);
            then(error.getDescription()).isEqualTo(givenErrorDescription);
            then(error.getPermanent()).isEqualTo(givenErrorPermanent);
        };

        var call = api.numberContextLookup(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetNumberContextLogs() {
        String givenSentSinceString = "2015-02-22T17:42:05.390+0100";
        OffsetDateTime givenSentSinceDateTime =
                OffsetDateTime.of(LocalDateTime.of(2015, 2, 22, 17, 42, 5, 390000000), ZoneOffset.ofHours(1));
        String givenSentUntilString = "2015-02-22T19:42:05.390+0100";
        OffsetDateTime givenSentUntilDateTime =
                OffsetDateTime.of(LocalDateTime.of(2015, 2, 22, 19, 42, 5, 390000000), ZoneOffset.ofHours(1));

        String givenBulkId = "BULK-ID-123-xyz";
        String givenMessageId = "MESSAGE-ID-123-xyz";
        String givenTo = "41793026727";
        String givenSentAt = "2019-08-24T14:15:22.000+0000";
        String givenDoneAt = "2019-08-24T14:15:22.000+0000";
        String givenMccMnc = "12345";
        String givenCurrency = "EUR";
        Double givenPricePerLookup = 0.1;

        Integer givenStatusGroupId = 3;
        String givenStatusGroupName = "DELIVERED";
        Integer givenStatusId = 5;
        String givenStatusName = "DELIVERED_TO_HANDSET";
        String givenStatusDescription = "Message delivered to handset";
        String givenStatusAction = "none";

        Integer givenErrorGroupId = 0;
        String givenErrorGroupName = "Ok";
        Integer givenErrorId = 0;
        String givenErrorName = "NO_ERROR";
        String givenErrorDescription = "No Error";
        Boolean givenErrorPermanent = false;

        String givenResponse = String.format(
                "{\n"
                        + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"mccMnc\": \"%s\",\n"
                        + "      \"price\": {\n"
                        + "        \"currency\": \"%s\",\n"
                        + "        \"pricePerLookup\": %s\n"
                        + "      },\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\",\n"
                        + "        \"action\": \"%s\"\n"
                        + "      },\n"
                        + "      \"error\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\",\n"
                        + "        \"permanent\": %b\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenTo,
                givenSentAt,
                givenDoneAt,
                givenMccMnc,
                givenCurrency,
                givenPricePerLookup,
                givenStatusGroupId,
                givenStatusGroupName,
                givenStatusId,
                givenStatusName,
                givenStatusDescription,
                givenStatusAction,
                givenErrorGroupId,
                givenErrorGroupName,
                givenErrorId,
                givenErrorName,
                givenErrorDescription,
                givenErrorPermanent);

        setUpSuccessGetRequest(
                NUMBER_CONTEXT_LOGS,
                Map.of(
                        "sentSince", givenSentSinceString,
                        "sentUntil", givenSentUntilString),
                givenResponse);

        NumberLookupApi api = new NumberLookupApi(getApiClient());

        Consumer<NumberLookupLogResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            then(response.getResults()).hasSize(1);

            NumberLookupLog log = response.getResults().get(0);
            then(log.getBulkId()).isEqualTo(givenBulkId);
            then(log.getMessageId()).isEqualTo(givenMessageId);
            then(log.getTo()).isEqualTo(givenTo);

            OffsetDateTime expectedSentAt =
                    OffsetDateTime.of(LocalDateTime.of(2019, 8, 24, 14, 15, 22), ZoneOffset.UTC);
            OffsetDateTime expectedDoneAt =
                    OffsetDateTime.of(LocalDateTime.of(2019, 8, 24, 14, 15, 22), ZoneOffset.UTC);
            then(log.getSentAt()).isEqualTo(expectedSentAt);
            then(log.getDoneAt()).isEqualTo(expectedDoneAt);
            then(log.getMccMnc()).isEqualTo(givenMccMnc);

            NumberLookupLogPrice price = log.getPrice();
            then(price).isNotNull();
            then(price.getCurrency()).isEqualTo(givenCurrency);
            then(price.getPricePerLookup()).isEqualTo(givenPricePerLookup);

            MessageStatus status = log.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            then(status.getAction()).isEqualTo(givenStatusAction);

            MessageError error = log.getError();
            then(error).isNotNull();
            then(error.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error.getId()).isEqualTo(givenErrorId);
            then(error.getName()).isEqualTo(givenErrorName);
            then(error.getDescription()).isEqualTo(givenErrorDescription);
            then(error.getPermanent()).isEqualTo(givenErrorPermanent);
        };

        var call = api.getNumberContextLogs().sentSince(givenSentSinceDateTime).sentUntil(givenSentUntilDateTime);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
