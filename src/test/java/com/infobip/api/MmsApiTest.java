package com.infobip.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class MmsApiTest extends ApiTest {

    private static final String MESSAGES = "/mms/2/messages";
    private static final String REPORTS = "/mms/2/reports";
    private static final String CONTENT = "/mms/1/content";
    private static final String INBOX_REPORTS = "/mms/1/inbox/reports";
    private static final String LOGS = "/mms/2/logs";

    @Test
    void shouldSendMmsMessages() {
        String givenSender = "441134960000";
        String givenTitle = "Some title";
        String givenText = "Some text";
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenStatusId = 26;
        String givenStatusName = "PENDING_ACCEPTED";
        String givenStatusDescription = "Message sent to next instance";

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"destination\": \"441134960001\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenStatusId,
                givenStatusName,
                givenStatusDescription);

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"group\": [\n"
                        + "            {\"to\": \"441134960001\"},\n"
                        + "            {\"to\": \"441134960002\"}\n"
                        + "          ]\n"
                        + "        },\n"
                        + "        {\n"
                        + "          \"to\": \"441134960003\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"title\": \"%s\",\n"
                        + "        \"messageSegments\": [\n"
                        + "          {\"text\": \"%s\", \"type\": \"TEXT\"}\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenSender, givenTitle, givenText);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MmsApi api = new MmsApi(getApiClient());

        MmsRequest request = new MmsRequest()
                .messages(List.of(new MmsMessage()
                        .sender(givenSender)
                        .destinations(List.of(
                                new MmsDestinationSingle().to("441134960003"),
                                new MmsDestinationGroup()
                                        .group(List.of(
                                                new MmsDestinationSingle().to("441134960001"),
                                                new MmsDestinationSingle().to("441134960002")))))
                        .content(new MmsOutboundContent()
                                .title(givenTitle)
                                .messageSegments(List.of(new MmsOutboundTextSegment().text(givenText))))));

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message).isNotNull();
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            then(message.getDestination()).isEqualTo("441134960001");
        };

        var call = api.sendMmsMessages(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetMmsDeliveryReports() {
        String givenBulkId = "3746923784";
        String givenMessageId = "43u2ih-6453jbh-897kfs90u2nj";
        String givenSender = "441134960000";
        String givenSentAt = "2025-01-20T13:06:33.968+0000";
        String givenDoneAt = "2025-01-20T13:06:33.968+0000";
        OffsetDateTime expectedSentAt = OffsetDateTime.of(2025, 1, 20, 13, 6, 33, 968_000_000, ZoneOffset.ofHours(0));
        OffsetDateTime expectedDoneAt = OffsetDateTime.of(2025, 1, 20, 13, 6, 33, 968_000_000, ZoneOffset.ofHours(0));
        Integer givenMessageCount = 3;
        Double givenPricePerMessage = 1.0;
        String givenCurrency = "EUR";
        Integer givenGroupId = 3;
        String givenGroupName = "DELIVERED";
        Integer givenId = 5;
        String givenName = "DELIVERED_TO_HANDSET";
        String givenDescription = "Message delivered to handset";

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      },\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": %d\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenBulkId,
                givenPricePerMessage,
                givenCurrency,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenMessageId,
                givenSender,
                givenSentAt,
                givenDoneAt,
                givenMessageCount);

        setUpSuccessGetRequest(REPORTS, Map.of(), givenResponse);

        MmsApi api = new MmsApi(getApiClient());

        Consumer<MmsReportResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getSender()).isEqualTo(givenSender);
            then(result.getSentAt()).isEqualTo(expectedSentAt);
            then(result.getDoneAt()).isEqualTo(expectedDoneAt);
            then(result.getMessageCount()).isEqualTo(givenMessageCount);
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
        };

        var call = api.getOutboundMmsMessageDeliveryReports();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUploadBinary() throws IOException {
        String givenUploadedContentId =
                "B44419205B27012D82F3BAD7B7EB37BAC884DBC91685390C3232D2191DC9D5EAF32F119D3530679F9B251AB689B4A60D7C2EB5A5EBB75C305367140D512E6B5D04200E7FFA5E84EAF37590C33F22B973514126755981CB170D86A7506CB38265280478A5B4EF2A7D11E9F24F286E7E315DFB1FF9BFEE08E036584074A1B76F097D9EC77E3FDD0FCC08362243E306F99F";

        String xContentId = "icon_png";
        String xMediaType = "image/png";
        File body = new File(MmsApiTest.class.getResource("/icon.png").getFile());

        String givenResponse =
                String.format("{\n" + "  \"uploadedContentId\": \"%s\"\n" + "}\n", givenUploadedContentId);

        getWireMockServer()
                .givenThat(post(urlPathEqualTo(CONTENT))
                        .withHeader("Authorization", equalTo(getExpectedApiKeyValue()))
                        .withHeader("Content-Type", equalTo(xMediaType))
                        .withHeader("X-Content-Id", equalTo(xContentId))
                        .withHeader("X-Media-Type", equalTo(xMediaType))
                        .withRequestBody(binaryEqualTo(Files.readAllBytes(body.toPath())))
                        .willReturn(aResponse().withStatus(200).withBody(givenResponse)));

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

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"message\": \"%s\",\n"
                        + "      \"receivedAt\": \"%s\",\n"
                        + "      \"mmsCount\": %s,\n"
                        + "      \"callbackData\": \"%s\",\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      },\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenMessageId,
                givenTo,
                givenFrom,
                givenMessage,
                givenReceivedAt,
                givenMmsCount,
                givenCallbackData,
                givenPricePerMessage,
                givenCurrency,
                givenEntityId,
                givenApplicationId);

        setUpSuccessGetRequest(INBOX_REPORTS, Map.of(), givenResponse);

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
    void shouldGetMmsDeliveryLogs() {
        String givenBulkId = "3746923784";
        String givenMessageId = "43u2ih-6453jbh-897kfs90u2nj";
        String givenSender = "441134960000";
        String givenDestination = "441134960001";
        String givenSentAt = "2025-01-20T13:06:34.784+0000";
        String givenDoneAt = "2025-01-20T13:06:34.785+0000";
        OffsetDateTime expectedSentAt = OffsetDateTime.of(2025, 1, 20, 13, 6, 34, 784_000_000, ZoneOffset.ofHours(0));
        OffsetDateTime expectedDoneAt = OffsetDateTime.of(2025, 1, 20, 13, 6, 34, 785_000_000, ZoneOffset.ofHours(0));
        Integer givenMessageCount = 3;
        Double givenPricePerMessage = 1.0;
        String givenCurrency = "EUR";
        Integer givenGroupId = 3;
        String givenGroupName = "DELIVERED";
        Integer givenId = 5;
        String givenName = "DELIVERED_TO_HANDSET";
        String givenDescription = "Message delivered to handset";
        String givenTitle = "Message title";
        String givenMccMnc = "22801";
        String givenContentTitle = "Some title";
        String givenText = "Some text";
        String givenType = "TEXT";

        var givenNextCursor = "next-cursor-id";
        var givenCursorLimit = 10;
        var givenUseCursor = true;

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"title\": \"%s\",\n"
                        + "      \"mccMnc\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destination\": \"%s\",\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": %d,\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      },\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"title\": \"%s\",\n"
                        + "        \"messageSegments\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"cursor\": {"
                        + "    \"limit\": %d,"
                        + "    \"nextCursor\": \"%s\""
                        + "  }"
                        + "}\n",
                givenTitle,
                givenMccMnc,
                givenSender,
                givenDestination,
                givenBulkId,
                givenMessageId,
                givenSentAt,
                givenDoneAt,
                givenMessageCount,
                givenPricePerMessage,
                givenCurrency,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenContentTitle,
                givenText,
                givenType,
                givenCursorLimit,
                givenNextCursor);

        setUpSuccessGetRequest(
                LOGS, Map.of("useCursor", Boolean.toString(givenUseCursor), "cursor", givenNextCursor), givenResponse);

        MmsApi api = new MmsApi(getApiClient());

        var expectedSegment = new MmsOutboundTextSegment().text(givenText);

        Consumer<MmsLogsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getSender()).isEqualTo(givenSender);
            then(result.getDestination()).isEqualTo(givenDestination);
            then(result.getSentAt()).isEqualTo(expectedSentAt);
            then(result.getDoneAt()).isEqualTo(expectedDoneAt);
            then(result.getMessageCount()).isEqualTo(givenMessageCount);
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
            then(result.getTitle()).isEqualTo(givenTitle);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            then(result.getContent()).isNotNull();
            var content = result.getContent();
            then(content.getTitle()).isEqualTo(givenContentTitle);
            then(content.getMessageSegments().size()).isEqualTo(1);
            var segment = content.getMessageSegments().get(0);
            then(segment).isEqualTo(expectedSegment);
        };

        var call = api.getOutboundMmsMessageLogs()
                .useCursor(givenUseCursor)
                .cursor(givenNextCursor)
                .limit(givenCursorLimit);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldParseOutboundMmsMessageReport() {
        var givenRequest = "{\n" + "  \"results\": [\n"
                + "    {\n"
                + "      \"bulkId\": \"BULK-ID-123-xyz\",\n"
                + "      \"messageId\": \"MESSAGE-ID-123-xyz\",\n"
                + "      \"to\": \"41793026727\",\n"
                + "      \"sentAt\": \"2019-11-09T16:00:00.000+0000\",\n"
                + "      \"doneAt\": \"2019-11-09T16:00:00.000+0000\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"mccMnc\": 90134,\n"
                + "      \"callbackData\": \"callbackData\",\n"
                + "      \"price\": {\n"
                + "        \"pricePerMessage\": 0.01,\n"
                + "        \"currency\": \"EUR\"\n"
                + "      },\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 3,\n"
                + "        \"groupName\": \"DELIVERED\",\n"
                + "        \"id\": 5,\n"
                + "        \"name\": \"DELIVERED_TO_HANDSET\",\n"
                + "        \"description\": \"Message delivered to handset\"\n"
                + "      },\n"
                + "      \"error\": {\n"
                + "        \"groupId\": 0,\n"
                + "        \"groupName\": \"OK\",\n"
                + "        \"id\": 0,\n"
                + "        \"name\": \"NO_ERROR\",\n"
                + "        \"description\": \"No Error\",\n"
                + "        \"permanent\": false\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "         \"entityId\": \"entityId\",\n"
                + "         \"applicationId\": \"applicationId\"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"bulkId\": \"BULK-ID-123-xyz\",\n"
                + "      \"messageId\": \"12db39c3-7822-4e72-a3ec-c87442c0ffc5\",\n"
                + "      \"to\": \"41793026834\",\n"
                + "      \"sentAt\": \"2019-11-09T17:00:00.000+0000\",\n"
                + "      \"doneAt\": \"2019-11-09T17:00:00.000+0000\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"mccMnc\": 90134,\n"
                + "      \"callbackData\": \"callbackData\",\n"
                + "      \"price\": {\n"
                + "        \"pricePerMessage\": 0.01,\n"
                + "        \"currency\": \"EUR\"\n"
                + "      },\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 3,\n"
                + "        \"groupName\": \"DELIVERED\",\n"
                + "        \"id\": 5,\n"
                + "        \"name\": \"DELIVERED_TO_HANDSET\",\n"
                + "        \"description\": \"Message delivered to handset\"\n"
                + "      },\n"
                + "      \"error\": {\n"
                + "        \"groupId\": 0,\n"
                + "        \"groupName\": \"OK\",\n"
                + "        \"id\": 0,\n"
                + "        \"name\": \"NO_ERROR\",\n"
                + "        \"description\": \"No Error\",\n"
                + "        \"permanent\": false\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "         \"entityId\": \"entityId\",\n"
                + "         \"applicationId\": \"applicationId\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        MmsReportResponse reportResponse = json.deserialize(givenRequest, MmsReportResponse.class);
        then(reportResponse.getResults()).isNotNull();
        then(reportResponse.getResults().size()).isEqualTo(2);

        then(reportResponse.getResults().get(0).getClass()).isEqualTo(MmsReport.class);
        var message1 = (MmsReport) reportResponse.getResults().get(0);
        then(message1.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message1.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message1.getError().getClass()).isEqualTo(MmsMessageError.class);

        then(reportResponse.getResults().get(1).getClass()).isEqualTo(MmsReport.class);
        var message2 = (MmsReport) reportResponse.getResults().get(1);
        then(message2.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message2.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message2.getError().getClass()).isEqualTo(MmsMessageError.class);
    }

    @Test
    void shouldParseInboundMmsMessages() {
        var givenRequest = "{\n" + "   \"results\": [\n"
                + "     {\n"
                + "       \"entityId\": \"entityId\",\n"
                + "       \"applicationId\": \"applicationId\",\n"
                + "       \"from\": \"385916242493\",\n"
                + "       \"to\": \"385921004026\",\n"
                + "       \"receivedAt\": \"2016-10-06T09:28:39.220+0000\",\n"
                + "       \"messageId\": \"817790313235066447\",\n"
                + "       \"pairedMessageId\": null,\n"
                + "       \"callbackData\": null,\n"
                + "       \"userAgent\": \"iPhone_12_Pro_Max_A2342\",\n"
                + "       \"message\": [\n"
                + "         {\n"
                + "           \"contentType\": \"image/jpeg\",\n"
                + "           \"url\": \"https://examplelink.com/123456\"\n"
                + "         },\n"
                + "         {\n"
                + "           \"contentType\": \"text/plain\",\n"
                + "           \"value\": \"This is message text\"\n"
                + "         }\n"
                + "       ],\n"
                + "       \"group\": [\n"
                + "         {\n"
                + "            \"to\": \"abc\"\n"
                + "         },\n"
                + "         {\n"
                + "            \"cc\": \"def\"\n"
                + "         }\n"
                + "       ],\n"
                + "       \"price\": {\n"
                + "         \"pricePerMessage\": 0,\n"
                + "         \"currency\": \"EUR\"\n"
                + "       }\n"
                + "     }\n"
                + "   ],\n"
                + "   \"messageCount\": 1,\n"
                + "   \"pendingMessageCount\": 0\n"
                + " }\n";

        MmsInboundWebhookRequest reportResponse = json.deserialize(givenRequest, MmsInboundWebhookRequest.class);
        then(reportResponse.getResults()).isNotNull();

        then(reportResponse.getResults().get(0).getClass()).isEqualTo(MmsInboundWebhookResult.class);
        var result = reportResponse.getResults().get(0);
        then(result.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(result.getMessage()).isNotNull();
        then(result.getMessage().size()).isEqualTo(2);
        then(result.getMessage().get(0).getClass()).isEqualTo(MmsInboundLinkSegment.class);
        then(result.getMessage().get(1).getClass()).isEqualTo(MmsInboundTextSegment.class);
        then(result.getGroup().get(0).getClass()).isEqualTo(MmsInboundDestination.class);
        then(result.getGroup().get(1).getClass()).isEqualTo(MmsInboundDestination.class);
    }
}
