package com.infobip.api;

import static com.infobip.api.util.ResponseStatuses.*;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class RcsApiTest extends ApiTest {

    private static final String MESSAGES = "/rcs/2/messages";
    private static final String EVENTS = "/rcs/1/events";
    private static final String REPORTS = "/rcs/2/reports";
    private static final String LOGS = "/rcs/2/logs";
    private static final String CAPABILITY_CHECK_QUERY = "/rcs/2/capability-check/query";
    private static final String CAPABILITY_CHECK_NOTIFY = "/rcs/2/capability-check/notify";

    @Test
    void shouldSendRcsTextMessage() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenTo = "441134960001";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String givenSender = "DemoSender";
        String givenText = "Some text";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"type\": \"TEXT\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenSender, givenTo, givenText);

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
                        + "      \"destination\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenMessageId,
                PENDING_STATUS_GROUP_ID,
                PENDING_STATUS_GROUP_NAME,
                PENDING_STATUS_ID,
                PENDING_STATUS_NAME,
                PENDING_STATUS_DESCRIPTION,
                givenTo);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsMessageRequest request = new RcsMessageRequest()
                .messages(List.of(new RcsMessage()
                        .sender(givenSender)
                        .destinations(List.of(new RcsToDestination().to(givenTo)))
                        .content(new RcsOutboundTextContent().text(givenText))));

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getDestination()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(PENDING_STATUS_GROUP_ID);
            then(status.getGroupName()).isEqualTo(PENDING_STATUS_GROUP_NAME);
            then(status.getId()).isEqualTo(PENDING_STATUS_ID);
            then(status.getName()).isEqualTo(PENDING_STATUS_NAME);
            then(status.getDescription()).isEqualTo(PENDING_STATUS_DESCRIPTION);
        };

        var call = api.sendRcsMessages(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendRcsCardMessageWithUrlTracking() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenTo = "441134960001";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String givenSender = "DemoSender";
        String givenOrientation = "HORIZONTAL";
        String givenAlignment = "LEFT";
        String givenTitle = "Some title";
        String givenDescription = "Some description";
        String givenMediaUrl = "https://www.example.com/video.mp4";
        String givenThumbnailUrl = "https://www.example.com/thumbnail.jpg";
        String givenHeight = "TALL";
        String givenSuggestion1Text = "Example text";
        String givenSuggestion1PostbackData = "Example postback data";
        String givenSuggestion1Url = "https://www.example.com/";
        String givenSuggestion1Application = "BROWSER";
        String givenSuggestion2Text = "Example text";
        String givenSuggestion2PostbackData = "Example postback data";
        String givenMessageSuggestionText = "Example text";
        String givenMessageSuggestionPostbackData = "Example postback data";
        boolean givenShortenUrl = true;
        boolean givenTrackClicks = true;
        String givenTrackingUrl = "https://www.example.com/tracking-callback-server";
        boolean givenRemoveProtocol = false;

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"orientation\": \"%s\",\n"
                        + "        \"alignment\": \"%s\",\n"
                        + "        \"content\": {\n"
                        + "          \"title\": \"%s\",\n"
                        + "          \"description\": \"%s\",\n"
                        + "          \"media\": {\n"
                        + "            \"file\": {\n"
                        + "              \"url\": \"%s\"\n"
                        + "            },\n"
                        + "            \"thumbnail\": {\n"
                        + "              \"url\": \"%s\"\n"
                        + "            },\n"
                        + "            \"height\": \"%s\"\n"
                        + "          },\n"
                        + "          \"suggestions\": [\n"
                        + "            {\n"
                        + "              \"text\": \"%s\",\n"
                        + "              \"postbackData\": \"%s\",\n"
                        + "              \"url\": \"%s\",\n"
                        + "              \"application\": \"%s\",\n"
                        + "              \"type\": \"OPEN_URL\"\n"
                        + "            },\n"
                        + "            {\n"
                        + "              \"text\": \"%s\",\n"
                        + "              \"postbackData\": \"%s\",\n"
                        + "              \"type\": \"REPLY\"\n"
                        + "            }\n"
                        + "          ]\n"
                        + "        },\n"
                        + "        \"suggestions\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"postbackData\": \"%s\",\n"
                        + "            \"type\": \"REPLY\"\n"
                        + "          }\n"
                        + "        ],\n"
                        + "        \"type\": \"CARD\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"options\": {\n"
                        + "    \"tracking\": {\n"
                        + "      \"shortenUrl\": %s,\n"
                        + "      \"trackClicks\": %s,\n"
                        + "      \"trackingUrl\": \"%s\",\n"
                        + "      \"removeProtocol\": %s\n"
                        + "    }\n"
                        + "  }\n"
                        + "}",
                givenSender,
                givenTo,
                givenOrientation,
                givenAlignment,
                givenTitle,
                givenDescription,
                givenMediaUrl,
                givenThumbnailUrl,
                givenHeight,
                givenSuggestion1Text,
                givenSuggestion1PostbackData,
                givenSuggestion1Url,
                givenSuggestion1Application,
                givenSuggestion2Text,
                givenSuggestion2PostbackData,
                givenMessageSuggestionText,
                givenMessageSuggestionPostbackData,
                givenShortenUrl,
                givenTrackClicks,
                givenTrackingUrl,
                givenRemoveProtocol);

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
                        + "      \"destination\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenMessageId,
                PENDING_STATUS_GROUP_ID,
                PENDING_STATUS_GROUP_NAME,
                PENDING_STATUS_ID,
                PENDING_STATUS_NAME,
                PENDING_STATUS_DESCRIPTION,
                givenTo);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsMessage rcsMessage = new RcsMessage()
                .sender(givenSender)
                .destinations(List.of(new RcsToDestination().to(givenTo)))
                .content(new RcsOutboundCardContent()
                        .orientation(RcsOrientation.HORIZONTAL)
                        .alignment(RcsAlignment.LEFT)
                        .content(new RcsCardContent()
                                .title(givenTitle)
                                .description(givenDescription)
                                .media(new RcsCardMedia()
                                        ._file(new RcsCardResourceSchema().url(givenMediaUrl))
                                        .thumbnail(new RcsResource().url(givenThumbnailUrl))
                                        .height(RcsHeight.TALL))
                                .suggestions(List.of(
                                        new RcsOpenUrlSuggestion()
                                                .text(givenSuggestion1Text)
                                                .postbackData(givenSuggestion1PostbackData)
                                                .url(givenSuggestion1Url)
                                                .application(RcsOpenUrlApplicationType.BROWSER),
                                        new RcsReplySuggestion()
                                                .text(givenSuggestion2Text)
                                                .postbackData(givenSuggestion2PostbackData))))
                        .suggestions(List.of(new RcsReplySuggestion()
                                .text(givenMessageSuggestionText)
                                .postbackData(givenMessageSuggestionPostbackData))));

        RcsMessageRequest request = new RcsMessageRequest()
                .messages(List.of(rcsMessage))
                .options(new RcsMessageRequestOptions()
                        .tracking(new UrlOptions()
                                .shortenUrl(givenShortenUrl)
                                .trackClicks(givenTrackClicks)
                                .trackingUrl(givenTrackingUrl)
                                .removeProtocol(givenRemoveProtocol)));

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getDestination()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(PENDING_STATUS_GROUP_ID);
            then(status.getGroupName()).isEqualTo(PENDING_STATUS_GROUP_NAME);
            then(status.getId()).isEqualTo(PENDING_STATUS_ID);
            then(status.getName()).isEqualTo(PENDING_STATUS_NAME);
            then(status.getDescription()).isEqualTo(PENDING_STATUS_DESCRIPTION);
        };

        var call = api.sendRcsMessages(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetRcsDeliveryReports() {
        String givenBulkId = "29ee2440-5461-4b04-bc81-3f6aa630ffa7";
        String givenMessageId = "c0ed295b-c39d-4f6d-b347-fa1837f18c00";
        String givenTo = "441134960001";
        String givenSender = "DemoSender";
        String givenSentAt = "2024-06-14T09:12:00.000+0000";
        String givenDoneAt = "2024-06-14T09:12:03.000+0000";
        int givenMessageCount = 1;
        String givenMccMnc = "21901";
        double givenPricePerMessage = 0.23;
        String givenCurrency = "EUR";

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %.2f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      },\n"
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
                        + "      },\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": %d,\n"
                        + "      \"mccMnc\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenPricePerMessage,
                givenCurrency,
                DELIVERED_STATUS_GROUP_ID,
                DELIVERED_STATUS_GROUP_NAME,
                DELIVERED_STATUS_ID,
                DELIVERED_STATUS_NAME,
                DELIVERED_STATUS_DESCRIPTION,
                NO_ERROR_GROUP_ID,
                NO_ERROR_GROUP_NAME,
                NO_ERROR_ID,
                NO_ERROR_NAME,
                NO_ERROR_DESCRIPTION,
                NO_ERROR_IS_PERMANENT,
                givenMessageId,
                givenTo,
                givenSender,
                givenSentAt,
                givenDoneAt,
                givenMessageCount,
                givenMccMnc);

        setUpSuccessGetRequest(REPORTS, Map.of(), givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        Consumer<RcsDeliveryReports> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getSender()).isEqualTo(givenSender);
            then(result.getMessageCount()).isEqualTo(givenMessageCount);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            var price = result.getPrice();
            then(price).isNotNull();
            then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            var status = result.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(DELIVERED_STATUS_GROUP_ID);
            then(status.getGroupName()).isEqualTo(DELIVERED_STATUS_GROUP_NAME);
            then(status.getId()).isEqualTo(DELIVERED_STATUS_ID);
            then(status.getName()).isEqualTo(DELIVERED_STATUS_NAME);
            then(status.getDescription()).isEqualTo(DELIVERED_STATUS_DESCRIPTION);
            var error = result.getError();
            then(error).isNotNull();
            then(error.getGroupId()).isEqualTo(NO_ERROR_GROUP_ID);
            then(error.getGroupName()).isEqualTo(NO_ERROR_GROUP_NAME);
            then(error.getId()).isEqualTo(NO_ERROR_ID);
            then(error.getName()).isEqualTo(NO_ERROR_NAME);
            then(error.getDescription()).isEqualTo(NO_ERROR_DESCRIPTION);
            then(error.getPermanent()).isEqualTo(NO_ERROR_IS_PERMANENT);
        };

        var call = api.getOutboundRcsMessageDeliveryReports();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetRcsMessageLogs() {
        String givenSender = "string";
        String givenDestination = "string";
        String givenBulkId = "BULK-ID-123-xyz";
        String givenMessageId = "string";
        String givenSentAt = "2019-08-24T14:15:22Z";
        OffsetDateTime givenSentAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2019, 8, 24, 14, 15, 22), ZoneOffset.ofHours(0));
        String givenDoneAt = "2019-08-24T14:15:22Z";
        OffsetDateTime givenDoneAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2019, 8, 24, 14, 15, 22), ZoneOffset.ofHours(0));
        int givenMessageCount = 0;
        double givenPricePerMessage = 0;
        String givenCurrency = "string";
        int givenStatusGroupId = 0;
        String givenStatusGroupName = "ACCEPTED";
        int givenStatusId = 0;
        String givenStatusName = "string";
        String givenStatusDescription = "string";
        String givenStatusAction = "string";
        int givenErrorGroupId = 0;
        String givenErrorGroupName = "OK";
        int givenErrorId = 0;
        String givenErrorName = "string";
        String givenErrorDescription = "string";
        boolean givenErrorPermanent = true;
        String givenPlatformEntityId = "string";
        String givenPlatformApplicationId = "string";
        RcsOutboundMessageContentType givenContentType = RcsOutboundMessageContentType.TEXT;
        String givenCampaignReferenceId = "string";
        int givenCursorLimit = 0;
        String givenNextCursor = "string";

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destination\": \"%s\",\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": %d,\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %.0f,\n"
                        + "        \"currency\": \"%s\"\n"
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
                        + "        \"permanent\": %s\n"
                        + "      },\n"
                        + "      \"platform\": {\n"
                        + "        \"entityId\": \"%s\",\n"
                        + "        \"applicationId\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"campaignReferenceId\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"cursor\": {\n"
                        + "    \"limit\": %d,\n"
                        + "    \"nextCursor\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenSender,
                givenDestination,
                givenBulkId,
                givenMessageId,
                givenSentAt,
                givenDoneAt,
                givenMessageCount,
                givenPricePerMessage,
                givenCurrency,
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
                givenErrorPermanent,
                givenPlatformEntityId,
                givenPlatformApplicationId,
                givenContentType,
                givenCampaignReferenceId,
                givenCursorLimit,
                givenNextCursor);

        setUpSuccessGetRequest(LOGS, Map.of(), givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        Consumer<RcsLogsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getSender()).isEqualTo(givenSender);
            then(result.getDestination()).isEqualTo(givenDestination);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getSentAt()).isEqualTo(givenSentAtDateTime);
            then(result.getDoneAt()).isEqualTo(givenDoneAtDateTime);
            then(result.getMessageCount()).isEqualTo(givenMessageCount);
            var price = result.getPrice();
            then(price).isNotNull();
            then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            var status = result.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            then(status.getAction()).isEqualTo(givenStatusAction);
            var error = result.getError();
            then(error).isNotNull();
            then(error.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error.getId()).isEqualTo(givenErrorId);
            then(error.getName()).isEqualTo(givenErrorName);
            then(error.getDescription()).isEqualTo(givenErrorDescription);
            then(error.getPermanent()).isEqualTo(givenErrorPermanent);
            var platform = result.getPlatform();
            then(platform).isNotNull();
            then(platform.getEntityId()).isEqualTo(givenPlatformEntityId);
            then(platform.getApplicationId()).isEqualTo(givenPlatformApplicationId);
            var content = result.getContent();
            then(content).isNotNull();
            then(content.getType()).isEqualTo(givenContentType);
            then(result.getCampaignReferenceId()).isEqualTo(givenCampaignReferenceId);
            var cursor = response.getCursor();
            then(cursor).isNotNull();
            then(cursor.getLimit()).isEqualTo(givenCursorLimit);
            then(cursor.getNextCursor()).isEqualTo(givenNextCursor);
        };

        var call = api.getOutboundRcsMessageLogs();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCheckRcsCapabilitySync() {
        String givenSender = "DemoSender";
        String givenPhoneNumber1 = "441134960001";
        String givenPhoneNumber2 = "441134960002";
        String givenMessageId1 = "d5c3bdff-2d44-4f74-8a8e-3792fa57dfc8";
        String givenMessageId2 = "b5c3bdff-2d44-4f74-8a8e-3792fa57dfc3";
        String givenPlatformEntityId = "Example entity id";
        String givenPlatformApplicationId = "Example application id";

        String expectedRequest = String.format(
                "{\n" + "  \"sender\": \"%s\",\n"
                        + "  \"phoneNumbers\": [\n"
                        + "    \"%s\",\n"
                        + "    \"%s\"\n"
                        + "  ],\n"
                        + "  \"options\": {\n"
                        + "    \"platform\": {\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\"\n"
                        + "    }\n"
                        + "  }\n"
                        + "}",
                givenSender, givenPhoneNumber1, givenPhoneNumber2, givenPlatformEntityId, givenPlatformApplicationId);

        String givenResponse = String.format(
                "{\n" + "  \"capabilityCheckResults\": [\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"code\": \"ENABLED\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"code\": \"UNREACHABLE\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"options\": {\n"
                        + "    \"platform\": {\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\"\n"
                        + "    }\n"
                        + "  }\n"
                        + "}",
                givenMessageId1,
                givenPhoneNumber1,
                givenMessageId2,
                givenPhoneNumber2,
                givenPlatformEntityId,
                givenPlatformApplicationId);

        setUpSuccessPostRequest(CAPABILITY_CHECK_QUERY, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsCapabilityCheckSyncRequest request = new RcsCapabilityCheckSyncRequest()
                .sender(givenSender)
                .phoneNumbers(List.of(givenPhoneNumber1, givenPhoneNumber2))
                .options(new RcsCapabilityCheckOptions()
                        .platform(new Platform()
                                .entityId(givenPlatformEntityId)
                                .applicationId(givenPlatformApplicationId)));

        Consumer<RcsCapabilityCheckSyncResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getCapabilityCheckResults()).isNotNull();
            then(response.getCapabilityCheckResults().size()).isEqualTo(2);
            var result1 = response.getCapabilityCheckResults().get(0);
            then(result1.getMessageId()).isEqualTo(givenMessageId1);
            then(result1.getPhoneNumber()).isEqualTo(givenPhoneNumber1);
            then(result1.getCode()).isEqualTo(RcsCapabilityCheckResponseCode.ENABLED);
            var result2 = response.getCapabilityCheckResults().get(1);
            then(result2.getMessageId()).isEqualTo(givenMessageId2);
            then(result2.getPhoneNumber()).isEqualTo(givenPhoneNumber2);
            then(result2.getCode()).isEqualTo(RcsCapabilityCheckResponseCode.UNREACHABLE);
            var options = response.getOptions();
            then(options).isNotNull();
            var platform = options.getPlatform();
            then(platform).isNotNull();
            then(platform.getEntityId()).isEqualTo(givenPlatformEntityId);
            then(platform.getApplicationId()).isEqualTo(givenPlatformApplicationId);
        };

        var call = api.capabilityCheckRcsDestinationsQuery(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCheckRcsCapabilityAsync() {
        String givenSender = "DemoSender";
        String givenPhoneNumber1 = "441134960001";
        String givenPhoneNumber2 = "441134960002";
        String givenNotifyUrl = "http://example.com/notify";
        String givenBulkId = "d5c3bdff-2d44-4f74-8a8e-3792fa57dfc8";
        String givenMessageId1 = "d5c3bdff-2d44-4f74-8a8e-3792fa57dfc8";
        String givenMessageId2 = "b5c3bdff-2d44-4f74-8a8e-3792fa57dfc3";
        RcsStatusReason givenStatus = RcsStatusReason.PENDING_ENROUTE;

        String expectedRequest = String.format(
                "{\n" + "  \"sender\": \"%s\",\n"
                        + "  \"phoneNumbers\": [\"%s\", \"%s\"],\n"
                        + "  \"notifyUrl\": \"%s\"\n"
                        + "}",
                givenSender, givenPhoneNumber1, givenPhoneNumber2, givenNotifyUrl);

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"capabilityCheckRequestStates\": [\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"status\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"phoneNumber\": \"%s\",\n"
                        + "      \"status\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenMessageId1,
                givenPhoneNumber1,
                givenStatus,
                givenMessageId2,
                givenPhoneNumber2,
                givenStatus);

        setUpSuccessPostRequest(CAPABILITY_CHECK_NOTIFY, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsCapabilityCheckAsyncRequest request = new RcsCapabilityCheckAsyncRequest()
                .sender(givenSender)
                .phoneNumbers(List.of(givenPhoneNumber1, givenPhoneNumber2))
                .notifyUrl(givenNotifyUrl);

        Consumer<RcsCapabilityCheckAsyncResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getCapabilityCheckRequestStates()).isNotNull();
            then(response.getCapabilityCheckRequestStates().size()).isEqualTo(2);
            var state1 = response.getCapabilityCheckRequestStates().get(0);
            then(state1.getMessageId()).isEqualTo(givenMessageId1);
            then(state1.getPhoneNumber()).isEqualTo(givenPhoneNumber1);
            then(state1.getStatus()).isEqualTo(givenStatus);
            var state2 = response.getCapabilityCheckRequestStates().get(1);
            then(state2.getMessageId()).isEqualTo(givenMessageId2);
            then(state2.getPhoneNumber()).isEqualTo(givenPhoneNumber2);
            then(state2.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.capabilityCheckRcsDestinationsNotify(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldParseRcsInboundTextMessage() {
        String givenSender = "385912345678";
        String givenTo = "DemoSender";
        String givenIntegrationType = "RCS";
        String givenReceivedAt = "2024-06-14T09:12:00.000+0000";
        String givenMessageId = "c0ed295b-c39d-4f6d-b347-fa1837f18c00";
        String givenPairedMessageId = "29ee2440-5461-4b04-bc81-3f6aa630ffa7";
        String givenCallbackData = "someCallbackData";
        String givenText = "This is a text message";
        double givenPricePerMessage = 0.0;
        String givenCurrency = "EUR";
        int givenMessageCount = 1;
        int givenPendingMessageCount = 0;

        String givenRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"integrationType\": \"%s\",\n"
                        + "      \"receivedAt\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"pairedMessageId\": \"%s\",\n"
                        + "      \"callbackData\": \"%s\",\n"
                        + "      \"message\": {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"type\": \"TEXT\"\n"
                        + "      },\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %.1f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"pendingMessageCount\": %d\n"
                        + "}",
                givenSender,
                givenTo,
                givenIntegrationType,
                givenReceivedAt,
                givenMessageId,
                givenPairedMessageId,
                givenCallbackData,
                givenText,
                givenPricePerMessage,
                givenCurrency,
                givenMessageCount,
                givenPendingMessageCount);

        RcsInboundMessages result = new JSON().deserialize(givenRequest, RcsInboundMessages.class);

        then(result).isNotNull();
        then(result.getMessageCount()).isEqualTo(givenMessageCount);
        then(result.getPendingMessageCount()).isEqualTo(givenPendingMessageCount);
        then(result.getResults()).isNotNull();
        then(result.getResults().size()).isEqualTo(1);
        var message = result.getResults().get(0);
        then(message.getSender()).isEqualTo(givenSender);
        then(message.getTo()).isEqualTo(givenTo);
        then(message.getIntegrationType()).isEqualTo(givenIntegrationType);
        then(message.getMessageId()).isEqualTo(givenMessageId);
        then(message.getPairedMessageId()).isEqualTo(givenPairedMessageId);
        then(message.getCallbackData()).isEqualTo(givenCallbackData);
        var content = message.getMessage();
        then(content).isNotNull();
        then(content).isInstanceOf(RcsInboundTextContent.class);
        then(((RcsInboundTextContent) content).getText()).isEqualTo(givenText);
        var price = message.getPrice();
        then(price).isNotNull();
        then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
        then(price.getCurrency()).isEqualTo(givenCurrency);
    }

    @Test
    void shouldParseRcsUserActionEvent() {
        String givenEntityId = "c0ed295b-c39d-4f6d-b347-fa1837f18c00";
        String givenApplicationId = "21901";
        String givenSender = "DemoSender";
        String givenTo = "441134960001";
        String givenIntegrationType = "RCS";
        String givenReceivedAt = "2024-06-14T09:12:00.000+0000";
        String givenKeyword = "someKeyword";
        String givenMessageId = "c0ed295b-c39d-4f6d-b347-fa1837f18c00";
        String givenPairedMessageId = "29ee2440-5461-4b04-bc81-3f6aa630ffa7";
        String givenCallbackData = "someCallbackData";
        String givenSuggestionText = "suggestionText";
        String givenPostbackData = "suggestionPostbackData";
        double givenPricePerMessage = 0;
        String givenCurrency = "EUR";
        int givenMessageCount = 1;
        int givenPendingMessageCount = 0;

        String givenRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"integrationType\": \"%s\",\n"
                        + "      \"receivedAt\": \"%s\",\n"
                        + "      \"keyword\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"pairedMessageId\": \"%s\",\n"
                        + "      \"callbackData\": \"%s\",\n"
                        + "      \"message\": {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"postbackData\": \"%s\",\n"
                        + "        \"type\": \"SUGGESTION\"\n"
                        + "      },\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %.0f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"pendingMessageCount\": %d\n"
                        + "}",
                givenEntityId,
                givenApplicationId,
                givenSender,
                givenTo,
                givenIntegrationType,
                givenReceivedAt,
                givenKeyword,
                givenMessageId,
                givenPairedMessageId,
                givenCallbackData,
                givenSuggestionText,
                givenPostbackData,
                givenPricePerMessage,
                givenCurrency,
                givenMessageCount,
                givenPendingMessageCount);

        RcsInboundEvents result = new JSON().deserialize(givenRequest, RcsInboundEvents.class);

        then(result).isNotNull();
        then(result.getMessageCount()).isEqualTo(givenMessageCount);
        then(result.getPendingMessageCount()).isEqualTo(givenPendingMessageCount);
        then(result.getResults()).isNotNull();
        then(result.getResults().size()).isEqualTo(1);
        var event = result.getResults().get(0);
        then(event.getEntityId()).isEqualTo(givenEntityId);
        then(event.getApplicationId()).isEqualTo(givenApplicationId);
        then(event.getSender()).isEqualTo(givenSender);
        then(event.getTo()).isEqualTo(givenTo);
        then(event.getIntegrationType()).isEqualTo(givenIntegrationType);
        then(event.getKeyword()).isEqualTo(givenKeyword);
        then(event.getMessageId()).isEqualTo(givenMessageId);
        then(event.getPairedMessageId()).isEqualTo(givenPairedMessageId);
        then(event.getCallbackData()).isEqualTo(givenCallbackData);
        var content = event.getMessage();
        then(content).isNotNull();
        then(content).isInstanceOf(RcsInboundSuggestionContent.class);
        then(content.getType()).isEqualTo(RcsInboundMessageContentType.SUGGESTION);
        var price = event.getPrice();
        then(price).isNotNull();
        then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
        then(price.getCurrency()).isEqualTo(givenCurrency);
    }

    @Test
    void shouldParseRcsDeliveryReport() {
        String givenBulkId = "29ee2440-5461-4b04-bc81-3f6aa630ffa7";
        String givenMessageId = "c0ed295b-c39d-4f6d-b347-fa1837f18c00";
        String givenTo = "441134960001";
        String givenSender = "DemoSender";
        String givenSentAt = "2024-06-14T09:12:00.000+0000";
        String givenDoneAt = "2024-06-14T09:12:03.000+0000";
        int givenMessageCount = 1;
        String givenMccMnc = "21901";
        double givenPricePerMessage = 0.23;
        String givenCurrency = "EUR";

        String givenRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %.2f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      },\n"
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
                        + "      },\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": %d,\n"
                        + "      \"mccMnc\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenPricePerMessage,
                givenCurrency,
                DELIVERED_STATUS_GROUP_ID,
                DELIVERED_STATUS_GROUP_NAME,
                DELIVERED_STATUS_ID,
                DELIVERED_STATUS_NAME,
                DELIVERED_STATUS_DESCRIPTION,
                NO_ERROR_GROUP_ID,
                NO_ERROR_GROUP_NAME,
                NO_ERROR_ID,
                NO_ERROR_NAME,
                NO_ERROR_DESCRIPTION,
                NO_ERROR_IS_PERMANENT,
                givenMessageId,
                givenTo,
                givenSender,
                givenSentAt,
                givenDoneAt,
                givenMessageCount,
                givenMccMnc);

        RcsWebhookDeliveryReports result = new JSON().deserialize(givenRequest, RcsWebhookDeliveryReports.class);

        then(result).isNotNull();
        then(result.getResults()).isNotNull();
        then(result.getResults().size()).isEqualTo(1);
        var report = result.getResults().get(0);
        then(report.getBulkId()).isEqualTo(givenBulkId);
        then(report.getMessageId()).isEqualTo(givenMessageId);
        then(report.getTo()).isEqualTo(givenTo);
        then(report.getSender()).isEqualTo(givenSender);
        then(report.getMessageCount()).isEqualTo(givenMessageCount);
        then(report.getMccMnc()).isEqualTo(givenMccMnc);
        var price = report.getPrice();
        then(price).isNotNull();
        then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
        then(price.getCurrency()).isEqualTo(givenCurrency);
        var status = report.getStatus();
        then(status).isNotNull();
        then(status.getGroupId()).isEqualTo(DELIVERED_STATUS_GROUP_ID);
        then(status.getGroupName()).isEqualTo(DELIVERED_STATUS_GROUP_NAME);
        then(status.getId()).isEqualTo(DELIVERED_STATUS_ID);
        then(status.getName()).isEqualTo(DELIVERED_STATUS_NAME);
        then(status.getDescription()).isEqualTo(DELIVERED_STATUS_DESCRIPTION);
        var error = report.getError();
        then(error).isNotNull();
        then(error.getGroupId()).isEqualTo(NO_ERROR_GROUP_ID);
        then(error.getGroupName()).isEqualTo(NO_ERROR_GROUP_NAME);
        then(error.getId()).isEqualTo(NO_ERROR_ID);
        then(error.getName()).isEqualTo(NO_ERROR_NAME);
        then(error.getDescription()).isEqualTo(NO_ERROR_DESCRIPTION);
        then(error.getPermanent()).isEqualTo(NO_ERROR_IS_PERMANENT);
    }

    @Test
    void shouldParseRcsSeenReport() {
        String givenMessageId = "string";
        String givenFrom = "string";
        String givenTo = "string";
        String givenSentAt = "2019-08-24T14:15:22Z";
        String givenSeenAt = "2019-08-24T14:15:22Z";
        String givenApplicationId = "string";
        String givenEntityId = "string";
        String givenCampaignReferenceId = "string";

        OffsetDateTime expectedSentAt =
                OffsetDateTime.of(LocalDateTime.of(2019, 8, 24, 14, 15, 22), ZoneOffset.ofHours(0));
        OffsetDateTime expectedSeenAt =
                OffsetDateTime.of(LocalDateTime.of(2019, 8, 24, 14, 15, 22), ZoneOffset.ofHours(0));

        String givenRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"seenAt\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\",\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"campaignReferenceId\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenMessageId,
                givenFrom,
                givenTo,
                givenSentAt,
                givenSeenAt,
                givenApplicationId,
                givenEntityId,
                givenCampaignReferenceId);

        RcsSeenReports result = new JSON().deserialize(givenRequest, RcsSeenReports.class);

        then(result).isNotNull();
        then(result.getResults()).isNotNull();
        then(result.getResults().size()).isEqualTo(1);
        var report = result.getResults().get(0);
        then(report.getMessageId()).isEqualTo(givenMessageId);
        then(report.getFrom()).isEqualTo(givenFrom);
        then(report.getTo()).isEqualTo(givenTo);
        then(report.getSentAt()).isEqualTo(expectedSentAt);
        then(report.getSeenAt()).isEqualTo(expectedSeenAt);
        then(report.getApplicationId()).isEqualTo(givenApplicationId);
        then(report.getEntityId()).isEqualTo(givenEntityId);
        then(report.getCampaignReferenceId()).isEqualTo(givenCampaignReferenceId);
    }

    @Test
    void shouldParseRcsCapabilityCheckResult() {
        String givenBulkId = "d5c3bdff-2d44-4f74-8a8e-3792fa57dfc8";
        String givenMessageId = "b5c3bdff-2d44-4f74-8a8e-3792fa57dfc3";
        String givenPhoneNumber = "441134960001";
        String givenCode = "ENABLED";
        String givenPlatformEntityId = "Example entity id";
        String givenPlatformApplicationId = "Example application id";

        String givenRequest = String.format(
                "{\n" + "  \"capabilityCheckResult\": {\n"
                        + "    \"bulkId\": \"%s\",\n"
                        + "    \"messageId\": \"%s\",\n"
                        + "    \"phoneNumber\": \"%s\",\n"
                        + "    \"code\": \"%s\"\n"
                        + "  },\n"
                        + "  \"options\": {\n"
                        + "    \"platform\": {\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\"\n"
                        + "    }\n"
                        + "  }\n"
                        + "}",
                givenBulkId,
                givenMessageId,
                givenPhoneNumber,
                givenCode,
                givenPlatformEntityId,
                givenPlatformApplicationId);

        RcsCapabilityCheckAsyncResult result =
                new JSON().deserialize(givenRequest, RcsCapabilityCheckAsyncResult.class);

        then(result).isNotNull();
        var capabilityCheckResult = result.getCapabilityCheckResult();
        then(capabilityCheckResult).isNotNull();
        then(capabilityCheckResult.getBulkId()).isEqualTo(givenBulkId);
        then(capabilityCheckResult.getMessageId()).isEqualTo(givenMessageId);
        then(capabilityCheckResult.getPhoneNumber()).isEqualTo(givenPhoneNumber);
        then(capabilityCheckResult.getCode()).isEqualTo(RcsCapabilityCheckResponseCode.ENABLED);
        var options = result.getOptions();
        then(options).isNotNull();
        var platform = options.getPlatform();
        then(platform).isNotNull();
        then(platform.getEntityId()).isEqualTo(givenPlatformEntityId);
        then(platform.getApplicationId()).isEqualTo(givenPlatformApplicationId);
    }

    @Test
    void shouldSendRcsTypingIndicatorEvent() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenTo = "441134960001";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String givenSender = "DemoSender";

        String expectedRequest = String.format(
                "{\n" + "  \"events\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"type\": \"TYPING_INDICATOR\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenSender, givenTo);

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
                        + "      \"destination\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenMessageId,
                PENDING_STATUS_GROUP_ID,
                PENDING_STATUS_GROUP_NAME,
                PENDING_STATUS_ID,
                PENDING_STATUS_NAME,
                PENDING_STATUS_DESCRIPTION,
                givenTo);

        setUpSuccessPostRequest(EVENTS, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsEventRequest request = new RcsEventRequest()
                .events(List.of(new RcsEvent()
                        .sender(givenSender)
                        .destinations(List.of(new RcsToDestination().to(givenTo)))
                        .content(new RcsOutboundEventTypingIndicatorContent())));

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getDestination()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(PENDING_STATUS_GROUP_ID);
            then(status.getGroupName()).isEqualTo(PENDING_STATUS_GROUP_NAME);
            then(status.getId()).isEqualTo(PENDING_STATUS_ID);
            then(status.getName()).isEqualTo(PENDING_STATUS_NAME);
            then(status.getDescription()).isEqualTo(PENDING_STATUS_DESCRIPTION);
        };

        var call = api.sendRcsEvents(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendRcsSeenEvent() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenTo = "441134960001";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String givenSeenMessageId = "b28dd97c-1ffb-4fcf-99f1-0b557ed381db";
        String givenSender = "DemoSender";

        String expectedRequest = String.format(
                "{\n" + "  \"events\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"messageId\": \"%s\",\n"
                        + "        \"type\": \"SEEN\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenSender, givenTo, givenSeenMessageId);

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
                        + "      \"destination\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenMessageId,
                PENDING_STATUS_GROUP_ID,
                PENDING_STATUS_GROUP_NAME,
                PENDING_STATUS_ID,
                PENDING_STATUS_NAME,
                PENDING_STATUS_DESCRIPTION,
                givenTo);

        setUpSuccessPostRequest(EVENTS, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsEventRequest request = new RcsEventRequest()
                .events(List.of(new RcsEvent()
                        .sender(givenSender)
                        .destinations(List.of(new RcsToDestination().to(givenTo)))
                        .content(new RcsOutboundEventSeenContent().messageId(givenSeenMessageId))));

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getDestination()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(PENDING_STATUS_GROUP_ID);
            then(status.getGroupName()).isEqualTo(PENDING_STATUS_GROUP_NAME);
            then(status.getId()).isEqualTo(PENDING_STATUS_ID);
            then(status.getName()).isEqualTo(PENDING_STATUS_NAME);
            then(status.getDescription()).isEqualTo(PENDING_STATUS_DESCRIPTION);
        };

        var call = api.sendRcsEvents(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldParseRcsTypingIndicatorEvent() {
        String givenSender = "441134960001";
        String givenTo = "DemoSender";
        String givenReceivedAt = "2025-02-06T15:35:12.123+0000";
        String givenEventType = "TYPING_INDICATOR";
        String givenEntityId = "string";
        String givenApplicationId = "string";
        int givenEventCount = 1;
        int givenPendingEventCount = 42;

        String givenRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"receivedAt\": \"%s\",\n"
                        + "      \"event\": {\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"entityId\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"eventCount\": %d,\n"
                        + "  \"pendingEventCount\": %d\n"
                        + "}",
                givenSender,
                givenTo,
                givenReceivedAt,
                givenEventType,
                givenEntityId,
                givenApplicationId,
                givenEventCount,
                givenPendingEventCount);

        RcsIsTypingEvents result = new JSON().deserialize(givenRequest, RcsIsTypingEvents.class);

        then(result).isNotNull();
        then(result.getEventCount()).isEqualTo(givenEventCount);
        then(result.getPendingEventCount()).isEqualTo(givenPendingEventCount);
        then(result.getResults()).isNotNull();
        then(result.getResults().size()).isEqualTo(1);
        var event = result.getResults().get(0);
        then(event.getSender()).isEqualTo(givenSender);
        then(event.getTo()).isEqualTo(givenTo);
        then(event.getReceivedAt()).isEqualTo(givenReceivedAt);
        then(event.getEntityId()).isEqualTo(givenEntityId);
        then(event.getApplicationId()).isEqualTo(givenApplicationId);
        var eventContent = event.getEvent();
        then(eventContent).isNotNull();
        then(eventContent.getType()).isEqualTo(RcsIsTypingEventType.TYPING_INDICATOR);
    }
}
