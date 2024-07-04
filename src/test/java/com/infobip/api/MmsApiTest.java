package com.infobip.api;

import com.infobip.JSON;
import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.BDDAssertions.then;

class MmsApiTest extends ApiTest {
    private static final String ADVANCED = "/mms/1/advanced";
    private static final String REPORTS = "/mms/1/reports";
    private static final String CONTENT = "/mms/1/content";
    private static final String INBOX_REPORTS = "/mms/1/inbox/reports";
    private static final String LOGS = "/mms/1/logs";

    @Test
    void shouldSendMmsMessage() {
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenFrom = "InfoMMS";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";
        String givenText = "This is a sample message";
        String givenContentId = "320px-Depth_of_field_Cat.jpg";
        String givenTitle = "This is sample subject";
        String givenErrorMessage = "string";
        String givenCallbackData = "string";
        MmsDeliveryDay givenDay = MmsDeliveryDay.MONDAY;
        Integer givenFromHour = 0;
        Integer givenFromMinute = 0;
        Integer givenToHour = 0;
        Integer givenToMinute = 0;
        Boolean givenIntermediateReport = true;
        String givenNotifyUrl = "string";
        String givenSendAt = "2023-08-01T16:10:15.000+0500";
        OffsetDateTime givenSendAtDate = OffsetDateTime.of(2023, 8, 1, 16, 10, 15, 0, ZoneOffset.ofHours(5));
        Long givenValidityPeriod = 0L;
        String givenApplicationId = "applicationId";
        String givenEntityId = "entityId";

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"messages\": [\n" +
                                             "    {\n" +
                                             "      \"to\": \"%s\",\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"messageId\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ],\n" +
                                             "  \"errorMessage\": \"%s\"\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenTo,
                                             givenGroupId,
                                             givenGroupName,
                                             givenId,
                                             givenName,
                                             givenDescription,
                                             givenMessageId,
                                             givenErrorMessage
        );

        String expectedRequest = String.format("{\n" +
                                               "   \"bulkId\": \"%s\",\n" +
                                               "   \"messages\": [\n" +
                                               "     {\n" +
                                               "       \"callbackData\": \"%s\",\n" +
                                               "       \"deliveryTimeWindow\": {\n" +
                                               "         \"days\": [\n" +
                                               "           \"%s\"\n" +
                                               "         ],\n" +
                                               "         \"from\": {\n" +
                                               "           \"hour\": %d,\n" +
                                               "           \"minute\": %d\n" +
                                               "         },\n" +
                                               "         \"to\": {\n" +
                                               "           \"hour\": %d,\n" +
                                               "           \"minute\": %d\n" +
                                               "         }\n" +
                                               "       },\n" +
                                               "       \"destinations\": [\n" +
                                               "         {\n" +
                                               "           \"messageId\": \"%s\",\n" +
                                               "           \"to\": \"%s\",\n" +
                                               "           \"group\": []\n" +
                                               "         }\n" +
                                               "       ],\n" +
                                               "       \"from\": \"%s\",\n" +
                                               "       \"intermediateReport\": %b,\n" +
                                               "       \"notifyUrl\": \"%s\",\n" +
                                               "       \"sendAt\": \"%s\",\n" +
                                               "       \"messageSegments\": [\n" +
                                               "         {\n" +
                                               "           \"contentId\": \"%s\",\n" +
                                               "           \"text\": \"%s\"\n" +
                                               "         }\n" +
                                               "       ],\n" +
                                               "       \"validityPeriod\": %d,\n" +
                                               "       \"title\": \"%s\",\n" +
                                               "       \"applicationId\": \"%s\",\n" +
                                               "       \"entityId\": \"%s\"\n" +
                                               "     }\n" +
                                               "   ]\n" +
                                               "}\n",
                                               givenBulkId,
                                               givenCallbackData,
                                               givenDay,
                                               givenFromHour,
                                               givenFromMinute,
                                               givenToHour,
                                               givenToMinute,
                                               givenMessageId,
                                               givenTo,
                                               givenFrom,
                                               givenIntermediateReport,
                                               givenNotifyUrl,
                                               givenSendAt,
                                               givenContentId,
                                               givenText,
                                               givenValidityPeriod,
                                               givenTitle,
                                               givenApplicationId,
                                               givenEntityId
        );

        setUpSuccessPostRequest(
                ADVANCED,
                expectedRequest,
                givenResponse
        );

        MmsApi api = new MmsApi(getApiClient());

        MmsAdvancedRequest request = new MmsAdvancedRequest()
                .bulkId(givenBulkId)
                .messages(List.of(new MmsAdvancedMessage()
                                .callbackData(givenCallbackData)
                                .deliveryTimeWindow(new MmsDeliveryTimeWindow()
                                        .days(List.of(givenDay))
                                        .from(new MmsDeliveryTime()
                                                .hour(givenFromHour)
                                                .minute(givenFromMinute)
                                        )
                                        .to(new MmsDeliveryTime()
                                                .hour(givenToHour)
                                                .minute(givenToMinute)
                                        )
                                )
                                .addDestinationsItem(new MmsDestination()
                                                .messageId(givenMessageId)
                                                .to(givenTo)
                                ).from(givenFrom)
                                .intermediateReport(givenIntermediateReport)
                                .notifyUrl(givenNotifyUrl)
                                .sendAt(givenSendAtDate)
                                .messageSegments(List.of(
                                        new MmsAdvancedMessageSegment()
                                                .contentId(givenContentId)
                                                .text(givenText)
                                ))
                                .validityPeriod(givenValidityPeriod)
                                .title(givenTitle)
                                .applicationId(givenApplicationId)
                                .entityId(givenEntityId)
                        )
                );

        Consumer<MmsSendResult> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message).isNotNull();
            then(message.getTo()).isEqualTo(givenTo);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(response.getErrorMessage()).isEqualTo(givenErrorMessage);
        };

        var call = api.sendMmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetOutboundMmsMessageDeliveryReports() {
        String givenBulkId = "string";
        String givenMessageId = "string";
        String givenTo = "string";
        String givenFrom = "string";
        String givenSentAt = "string";
        String givenDoneAt = "string";
        Integer givenMmsCount = 0;
        String givenMccMnc = "string";
        String givenCallbackData = "string";
        Double givenPricePerMessage = 0D;
        String givenCurrency = "string";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        Integer givenErrorGroupId = 0;
        String givenErrorGroupName = "string";
        Integer givenErrorId = 0;
        String givenErrorName = "string";
        String givenErrorDescription = "string";
        String givenEntityId = "string";
        String givenApplicationId = "string";

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"bulkId\": \"%s\",\n" +
                                             "      \"messageId\": \"%s\",\n" +
                                             "      \"to\": \"%s\",\n" +
                                             "      \"from\": \"%s\",\n" +
                                             "      \"sentAt\": \"%s\",\n" +
                                             "      \"doneAt\": \"%s\",\n" +
                                             "      \"mmsCount\": %d,\n" +
                                             "      \"mccMnc\": \"%s\",\n" +
                                             "      \"callbackData\": \"%s\",\n" +
                                             "      \"price\": {\n" +
                                             "        \"pricePerMessage\": %f,\n" +
                                             "        \"currency\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"error\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"entityId\": \"%s\",\n" +
                                             "      \"applicationId\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId, givenMessageId, givenTo, givenFrom, givenSentAt, givenDoneAt, givenMmsCount, givenMccMnc,
                                             givenCallbackData, givenPricePerMessage, givenCurrency,
                                             givenGroupId, givenGroupName, givenId, givenName, givenDescription,
                                             givenErrorGroupId, givenErrorGroupName, givenErrorId, givenErrorName, givenErrorDescription,
                                             givenEntityId, givenApplicationId
        );

        setUpSuccessGetRequest(
                REPORTS,
                Map.of(),
                givenResponse
        );

        MmsApi api = new MmsApi(getApiClient());

        Consumer<MmsReportResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getSentAt()).isEqualTo(givenSentAt);
            then(result.getDoneAt()).isEqualTo(givenDoneAt);
            then(result.getMmsCount()).isEqualTo(givenMmsCount);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            then(result.getCallbackData()).isEqualTo(givenCallbackData);
            then(result.getPrice()).isNotNull();
            var price = result.getPrice();
            then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            then(result.getStatus()).isNotNull();
            var status = result.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(result.getError()).isNotNull();
            var errorStatus = result.getError();
            then(errorStatus.getGroupId()).isEqualTo(givenErrorGroupId);
            then(errorStatus.getGroupName()).isEqualTo(givenErrorGroupName);
            then(errorStatus.getId()).isEqualTo(givenErrorId);
            then(errorStatus.getName()).isEqualTo(givenErrorName);
            then(errorStatus.getDescription()).isEqualTo(givenErrorDescription);
            then(result.getEntityId()).isEqualTo(givenEntityId);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.getOutboundMmsMessageDeliveryReports();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUploadBinary() throws IOException {
        String givenUploadedContentId = "B44419205B27012D82F3BAD7B7EB37BAC884DBC91685390C3232D2191DC9D5EAF32F119D3530679F9B251AB689B4A60D7C2EB5A5EBB75C305367140D512E6B5D04200E7FFA5E84EAF37590C33F22B973514126755981CB170D86A7506CB38265280478A5B4EF2A7D11E9F24F286E7E315DFB1FF9BFEE08E036584074A1B76F097D9EC77E3FDD0FCC08362243E306F99F";

        String xContentId = "icon_png";
        String xMediaType = "image/png";
        File body = new File(MmsApiTest.class.getResource("/icon.png").getFile());

        String givenResponse = String.format("{\n" +
                                             "  \"uploadedContentId\": \"%s\"\n" +
                                             "}\n",
                                             givenUploadedContentId
        );

        getWireMockServer().givenThat(
                post(urlPathEqualTo(CONTENT))
                        .withHeader("Authorization", equalTo(getExpectedApiKeyValue()))
                        .withHeader("Content-Type", equalTo(xMediaType))
                        .withHeader("X-Content-Id", equalTo(xContentId))
                        .withHeader("X-Media-Type", equalTo(xMediaType))
                        .withRequestBody(binaryEqualTo(Files.readAllBytes(body.toPath())))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withBody(givenResponse)
                        )
        );

        MmsApi api = new MmsApi(getApiClient());

        Consumer<MmsUploadBinaryResult> assertions = response -> then(response)
                .isNotNull()
                .extracting(MmsUploadBinaryResult::getUploadedContentId)
                .isEqualTo(givenUploadedContentId);

        var call = api.uploadBinary(xContentId, xMediaType, body);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetInboundMmsMessages() {
        String givenMessageId = "string";
        String givenTo = "string";
        String givenFrom = "string";
        String givenMessage = "string";
        String givenReceivedAt = "string";
        Integer givenMmsCount = 0;
        String givenCallbackData = "string";
        Double givenPricePerMessage = 0D;
        String givenCurrency = "string";
        String givenEntityId = "string";
        String givenApplicationId = "string";

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"messageId\": \"%s\",\n" +
                                             "      \"to\": \"%s\",\n" +
                                             "      \"from\": \"%s\",\n" +
                                             "      \"message\": \"%s\",\n" +
                                             "      \"receivedAt\": \"%s\",\n" +
                                             "      \"mmsCount\": %s,\n" +
                                             "      \"callbackData\": \"%s\",\n" +
                                             "      \"price\": {\n" +
                                             "        \"pricePerMessage\": %f,\n" +
                                             "        \"currency\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"entityId\": \"%s\",\n" +
                                             "      \"applicationId\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenMessageId, givenTo, givenFrom, givenMessage, givenReceivedAt, givenMmsCount, givenCallbackData,
                                             givenPricePerMessage, givenCurrency, givenEntityId, givenApplicationId
        );

        setUpSuccessGetRequest(
                INBOX_REPORTS,
                Map.of(),
                givenResponse
        );

        MmsApi api = new MmsApi(getApiClient());

        Consumer<MmsInboundReportResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getMessage()).isEqualTo(givenMessage);
            then(result.getReceivedAt()).isEqualTo(givenReceivedAt);
            then(result.getMmsCount()).isEqualTo(givenMmsCount);
            then(result.getCallbackData()).isEqualTo(givenCallbackData);
            then(result.getPrice()).isNotNull();
            var price = result.getPrice();
            then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            then(result.getEntityId()).isEqualTo(givenEntityId);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.getInboundMmsMessages();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetOutboundMmsMessageLogs() {
        String givenBulkId = "3746923784";
        String givenMessageId = "43u2ih-6453jbh-897kfs90u2nj";
        String givenTo = "To name";
        String givenFrom = "Company name";
        String givenTitle = "Message title";
        String givenContentId = "contentId";
        String givenText = "some text";
        String givenContentId2 = "contentId";
        String givenContentType2 = "image/png";
        String givenContentUrl2 = "host.com/image.png";
        String givenContentId3 = "contentId";
        String givenText3 = "some other text";
        String givenSentAt = "2023-01-01T17:42:05.390+0100";
        String givenDoneAt = "2023-01-01T17:42:10.390+0100";
        OffsetDateTime expectedSentAt = OffsetDateTime.of(2023, 1, 1, 17, 42, 5, 390_000_000, ZoneOffset.ofHours(1));
        OffsetDateTime expectedDoneAt = OffsetDateTime.of(2023, 1, 1, 17, 42, 10, 390_000_000, ZoneOffset.ofHours(1));
        Integer givenMmsCount = 3;
        String givenMccMnc = "22801";
        Double givenPricePerMessage = 1.0;
        String givenCurrency = "EUR";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenEntityId = "string";
        String givenApplicationId = "string";

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"bulkId\": \"%s\",\n" +
                                             "      \"messageId\": \"%s\",\n" +
                                             "      \"to\": \"%s\",\n" +
                                             "      \"from\": \"%s\",\n" +
                                             "      \"title\": \"%s\",\n" +
                                             "      \"messageSegments\": [\n" +
                                             "        {\n" +
                                             "          \"contentId\": \"%s\",\n" +
                                             "          \"text\": \"%s\"\n" +
                                             "        },\n" +
                                             "        {\n" +
                                             "          \"contentId\": \"%s\",\n" +
                                             "          \"contentType\": \"%s\",\n" +
                                             "          \"contentUrl\": \"%s\"\n" +
                                             "        },\n" +
                                             "        {\n" +
                                             "          \"contentId\": \"%s\",\n" +
                                             "          \"text\": \"%s\"\n" +
                                             "        }\n" +
                                             "      ],\n" +
                                             "      \"sentAt\": \"%s\",\n" +
                                             "      \"doneAt\": \"%s\",\n" +
                                             "      \"mmsCount\": %d,\n" +
                                             "      \"mccMnc\": \"%s\",\n" +
                                             "      \"price\": {\n" +
                                             "        \"pricePerMessage\": %f,\n" +
                                             "        \"currency\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"entityId\": \"%s\",\n" +
                                             "      \"applicationId\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenMessageId,
                                             givenTo,
                                             givenFrom,
                                             givenTitle,
                                             givenContentId,
                                             givenText,
                                             givenContentId2,
                                             givenContentType2,
                                             givenContentUrl2,
                                             givenContentId3,
                                             givenText3,
                                             givenSentAt,
                                             givenDoneAt,
                                             givenMmsCount,
                                             givenMccMnc,
                                             givenPricePerMessage,
                                             givenCurrency,
                                             givenGroupId,
                                             givenGroupName,
                                             givenId,
                                             givenName,
                                             givenDescription,
                                             givenEntityId,
                                             givenApplicationId);

        setUpSuccessGetRequest(
                LOGS,
                Map.of(
                        "bulkId", "BULK-ID-123-xyz",
                        "messageId","MESSAGE-ID-123-xyz"
                ),
                givenResponse
        );

        MmsApi api = new MmsApi(getApiClient());

        Consumer<MmsLogsResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getTitle()).isEqualTo(givenTitle);
            then(result.getMessageSegments().size()).isEqualTo(3);
            var segment1 = result.getMessageSegments().get(0);
            then(segment1).isNotNull();
            then(segment1.getContentId()).isEqualTo(givenContentId);
            then(segment1.getText()).isEqualTo(givenText);
            var segment2 = result.getMessageSegments().get(1);
            then(segment2.getContentId()).isEqualTo(givenContentId2);
            then(segment2.getContentType()).isEqualTo(givenContentType2);
            then(segment2.getContentUrl()).isEqualTo(givenContentUrl2);
            var segment3 = result.getMessageSegments().get(2);
            then(segment3.getContentId()).isEqualTo(givenContentId3);
            then(segment3.getText()).isEqualTo(givenText3);
            then(result.getSentAt()).isEqualTo(expectedSentAt);
            then(result.getDoneAt()).isEqualTo(expectedDoneAt);
            then(result.getMmsCount()).isEqualTo(givenMmsCount);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            then(result.getPrice()).isNotNull();
            var price = result.getPrice();
            then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            var status = result.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(result.getEntityId()).isEqualTo(givenEntityId);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.getOutboundMmsMessageLogs()
                      .bulkId("BULK-ID-123-xyz")
                      .messageId("MESSAGE-ID-123-xyz");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldParseOutboundMmsMessageReport() {
        var givenRequest = "{\n" +
                           "  \"results\": [\n" +
                           "    {\n" +
                           "      \"bulkId\": \"BULK-ID-123-xyz\",\n" +
                           "      \"messageId\": \"MESSAGE-ID-123-xyz\",\n" +
                           "      \"to\": \"41793026727\",\n" +
                           "      \"sentAt\": \"2019-11-09T16:00:00.000+0000\",\n" +
                           "      \"doneAt\": \"2019-11-09T16:00:00.000+0000\",\n" +
                           "      \"smsCount\": 1,\n" +
                           "      \"mccMnc\": 90134,\n" +
                           "      \"callbackData\": \"callbackData\",\n" +
                           "      \"price\": {\n" +
                           "        \"pricePerMessage\": 0.01,\n" +
                           "        \"currency\": \"EUR\"\n" +
                           "      },\n" +
                           "      \"status\": {\n" +
                           "        \"groupId\": 3,\n" +
                           "        \"groupName\": \"DELIVERED\",\n" +
                           "        \"id\": 5,\n" +
                           "        \"name\": \"DELIVERED_TO_HANDSET\",\n" +
                           "        \"description\": \"Message delivered to handset\"\n" +
                           "      },\n" +
                           "      \"error\": {\n" +
                           "        \"groupId\": 0,\n" +
                           "        \"groupName\": \"Ok\",\n" +
                           "        \"id\": 0,\n" +
                           "        \"name\": \"NO_ERROR\",\n" +
                           "        \"description\": \"No Error\",\n" +
                           "        \"permanent\": false\n" +
                           "      },\n" +
                           "      \"entityId\": \"entityId\",\n" +
                           "      \"applicationId\": \"applicationId\"\n" +
                           "    },\n" +
                           "    {\n" +
                           "      \"bulkId\": \"BULK-ID-123-xyz\",\n" +
                           "      \"messageId\": \"12db39c3-7822-4e72-a3ec-c87442c0ffc5\",\n" +
                           "      \"to\": \"41793026834\",\n" +
                           "      \"sentAt\": \"2019-11-09T17:00:00.000+0000\",\n" +
                           "      \"doneAt\": \"2019-11-09T17:00:00.000+0000\",\n" +
                           "      \"smsCount\": 1,\n" +
                           "      \"mccMnc\": 90134,\n" +
                           "      \"callbackData\": \"callbackData\",\n" +
                           "      \"price\": {\n" +
                           "        \"pricePerMessage\": 0.01,\n" +
                           "        \"currency\": \"EUR\"\n" +
                           "      },\n" +
                           "      \"status\": {\n" +
                           "        \"groupId\": 3,\n" +
                           "        \"groupName\": \"DELIVERED\",\n" +
                           "        \"id\": 5,\n" +
                           "        \"name\": \"DELIVERED_TO_HANDSET\",\n" +
                           "        \"description\": \"Message delivered to handset\"\n" +
                           "      },\n" +
                           "      \"error\": {\n" +
                           "        \"groupId\": 0,\n" +
                           "        \"groupName\": \"Ok\",\n" +
                           "        \"id\": 0,\n" +
                           "        \"name\": \"NO_ERROR\",\n" +
                           "        \"description\": \"No Error\",\n" +
                           "        \"permanent\": false\n" +
                           "      },\n" +
                           "      \"entityId\": \"entityId\",\n" +
                           "      \"applicationId\": \"applicationId\"\n" +
                           "    }\n" +
                           "  ]\n" +
                           "}\n";

        MmsWebhookOutboundReportResponse reportResponse = json.deserialize(
                givenRequest,
                MmsWebhookOutboundReportResponse.class
        );
        then(reportResponse.getResults()).isNotNull();
        then(reportResponse.getResults().size()).isEqualTo(2);

        then(reportResponse.getResults().get(0).getClass()).isEqualTo(MmsWebhookOutboundReport.class);
        var message1 = (MmsWebhookOutboundReport) reportResponse.getResults().get(0);
        then(message1.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message1.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message1.getError().getClass()).isEqualTo(MessageError.class);

        then(reportResponse.getResults().get(1).getClass()).isEqualTo(MmsWebhookOutboundReport.class);
        var message2 = (MmsWebhookOutboundReport) reportResponse.getResults().get(1);
        then(message2.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message2.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message2.getError().getClass()).isEqualTo(MessageError.class);
    }

    @Test
    void shouldParseInboundMmsMessages() {
        var givenRequest = "{\n" +
                           "   \"results\": [\n" +
                           "     {\n" +
                           "       \"entityId\": \"entityId\",\n" +
                           "       \"applicationId\": \"applicationId\",\n" +
                           "       \"from\": \"385916242493\",\n" +
                           "       \"to\": \"385921004026\",\n" +
                           "       \"receivedAt\": \"2016-10-06T09:28:39.220+0000\",\n" +
                           "       \"messageId\": \"817790313235066447\",\n" +
                           "       \"pairedMessageId\": null,\n" +
                           "       \"callbackData\": null,\n" +
                           "       \"userAgent\": \"iPhone_12_Pro_Max_A2342\",\n" +
                           "       \"message\": [\n" +
                           "         {\n" +
                           "           \"contentType\": \"image/jpeg\",\n" +
                           "           \"url\": \"https://examplelink.com/123456\"\n" +
                           "         },\n" +
                           "         {\n" +
                           "           \"contentType\": \"text/plain\",\n" +
                           "           \"value\": \"This is message text\"\n" +
                           "         }\n" +
                           "       ],\n" +
                           "       \"group\": [\n" +
                           "         {\n" +
                           "            \"to\": \"abc\"\n" +
                           "         },\n" +
                           "         {\n" +
                           "            \"cc\": \"def\"\n" +
                           "         }\n" +
                           "       ],\n" +
                           "       \"price\": {\n" +
                           "         \"pricePerMessage\": 0,\n" +
                           "         \"currency\": \"EUR\"\n" +
                           "       }\n" +
                           "     }\n" +
                           "   ],\n" +
                           "   \"messageCount\": 1,\n" +
                           "   \"pendingMessageCount\": 0\n" +
                           " }\n";

        MmsWebhookInboundReportResponse reportResponse = json.deserialize(
                givenRequest,
                MmsWebhookInboundReportResponse.class
        );
        then(reportResponse.getResults()).isNotNull();

        then(reportResponse.getResults().get(0).getClass()).isEqualTo(MmsWebhookInboundReport.class);
        var result = (MmsWebhookInboundReport) reportResponse.getResults().get(0);
        then(result.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(result.getMessage()).isNotNull();
        then(result.getMessage().size()).isEqualTo(2);
        then(result.getMessage().get(0).getClass()).isEqualTo(MmsWebhookInboundMessageSegment.class);
        then(result.getMessage().get(1).getClass()).isEqualTo(MmsWebhookInboundMessageSegment.class);
        then(result.getGroup().get(0).getClass()).isEqualTo(MmsWebhookInboundDestination.class);
        then(result.getGroup().get(1).getClass()).isEqualTo(MmsWebhookInboundDestination.class);
    }
}
