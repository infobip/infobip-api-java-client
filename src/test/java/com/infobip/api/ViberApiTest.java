package com.infobip.api;

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

class ViberApiTest extends ApiTest {

    private static final String SEND_VIBER_MESSAGES = "/viber/2/messages";
    private static final String GET_VIBER_REPORTS = "/viber/2/reports";
    private static final String GET_VIBER_LOGS = "/viber/2/logs";

    @Test
    void shouldSendNewViberTextMessage() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "441134960001";
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
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedSender = "441134960000";
        String expectedTo = "441134960001";
        String expectedText = "Some text";
        String expectedTitle = "Button title";
        String expectedAction = "https://www.example.com/action";
        String expectedType = "TEXT";
        String expectedSmsFailoverSender = "441134960000";
        String expectedSmsFailoverText = "Some failover text";
        String expectedLabel = "TRANSACTIONAL";
        Boolean expectedApplySessionRate = false;
        Boolean expectedToPrimaryDeviceOnly = true;
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
                        + "        \"button\": {\n"
                        + "          \"title\": \"%s\",\n"
                        + "          \"action\": \"%s\"\n"
                        + "        },\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"options\": {\n"
                        + "        \"smsFailover\": {\n"
                        + "           \"sender\": \"%s\",\n"
                        + "           \"text\": \"%s\"\n"
                        + "        },\n"
                        + "        \"label\": \"%s\",\n"
                        + "        \"applySessionRate\": %b,\n"
                        + "        \"toPrimaryDeviceOnly\": %b\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedSender,
                expectedTo,
                expectedText,
                expectedTitle,
                expectedAction,
                expectedType,
                expectedSmsFailoverSender,
                expectedSmsFailoverText,
                expectedLabel,
                expectedApplySessionRate,
                expectedToPrimaryDeviceOnly);

        setUpPostRequest(SEND_VIBER_MESSAGES, expectedRequest, givenResponse, 200);

        ViberApi api = new ViberApi(getApiClient());

        ViberMessage viberMessage = new ViberMessage()
                .sender(expectedSender)
                .destinations(List.of(new ViberToDestination().to(expectedTo)))
                .content(new ViberOutboundTextContent()
                        .text(expectedText)
                        .button(new ViberButton().title(expectedTitle).action(expectedAction)))
                .options(new ViberMessageOptions()
                        .smsFailover(new ViberDefaultSmsFailover()
                                .sender(expectedSmsFailoverSender)
                                .text(expectedSmsFailoverText))
                        .label(ViberLabel.TRANSACTIONAL)
                        .applySessionRate(expectedApplySessionRate)
                        .toPrimaryDeviceOnly(expectedToPrimaryDeviceOnly));
        ViberRequest viberRequest = new ViberRequest().addMessagesItem(viberMessage);

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(message.getDestination()).isEqualTo(givenDestination);
        };

        var call = api.sendViberMessages(viberRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendNewViberImageMessage() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "441134960001";
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
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedSender = "441134960000";
        String expectedTo = "441134960001";
        String expectedText = "Some text";
        String expectedMediaUrl = "https://www.example.com/image.jpg";
        String expectedTitle = "Button title";
        String expectedAction = "https://www.example.com/action";
        String expectedType = "IMAGE";
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
                        + "        \"mediaUrl\": \"%s\",\n"
                        + "        \"button\": {\n"
                        + "          \"title\": \"%s\",\n"
                        + "          \"action\": \"%s\"\n"
                        + "        },\n"
                        + "        \"type\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedSender,
                expectedTo,
                expectedText,
                expectedMediaUrl,
                expectedTitle,
                expectedAction,
                expectedType);

        setUpPostRequest(SEND_VIBER_MESSAGES, expectedRequest, givenResponse, 200);

        ViberApi api = new ViberApi(getApiClient());

        ViberMessage viberMessage = new ViberMessage()
                .sender(expectedSender)
                .destinations(List.of(new ViberToDestination().to(expectedTo)))
                .content(new ViberOutboundImageContent()
                        .text(expectedText)
                        .mediaUrl(expectedMediaUrl)
                        .button(new ViberButton().title(expectedTitle).action(expectedAction)));

        ViberRequest viberRequest = new ViberRequest().addMessagesItem(viberMessage);

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(message.getDestination()).isEqualTo(givenDestination);
        };

        var call = api.sendViberMessages(viberRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendNewViberVideoMessage() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "441134960001";
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
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedSender = "441134960000";
        String expectedTo = "441134960001";
        String expectedText = "Some text";
        String expectedMediaUrl = "https://www.example.com/video.mp4";
        String expectedMediaDuration = "PT5S";
        String expectedThumbnailUrl = "https://www.example.com/video.jpg";
        String expectedButtonTitle = "Button title";
        String expectedType = "VIDEO";
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
                        + "        \"mediaUrl\": \"%s\",\n"
                        + "        \"mediaDuration\": \"%s\",\n"
                        + "        \"thumbnailUrl\": \"%s\",\n"
                        + "        \"buttonTitle\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedSender,
                expectedTo,
                expectedText,
                expectedMediaUrl,
                expectedMediaDuration,
                expectedThumbnailUrl,
                expectedButtonTitle,
                expectedType);

        setUpPostRequest(SEND_VIBER_MESSAGES, expectedRequest, givenResponse, 200);

        ViberApi api = new ViberApi(getApiClient());

        ViberMessage viberMessage = new ViberMessage()
                .sender(expectedSender)
                .destinations(List.of(new ViberToDestination().to(expectedTo)))
                .content(new ViberOutboundVideoContent()
                        .text(expectedText)
                        .mediaUrl(expectedMediaUrl)
                        .mediaDuration(expectedMediaDuration)
                        .thumbnailUrl(expectedThumbnailUrl)
                        .buttonTitle(expectedButtonTitle));

        ViberRequest viberRequest = new ViberRequest().addMessagesItem(viberMessage);

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(message.getDestination()).isEqualTo(givenDestination);
        };

        var call = api.sendViberMessages(viberRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendNewViberFileMessage() {
        String givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "441134960001";
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
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedSender = "441134960000";
        String expectedTo = "441134960001";
        String expectedFileName = "file.xlsx";
        String expectedMediaUrl = "https://www.example.com/file.xlsx";
        String expectedType = "FILE";
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
                        + "        \"fileName\": \"%s\",\n"
                        + "        \"mediaUrl\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedSender, expectedTo, expectedFileName, expectedMediaUrl, expectedType);

        setUpPostRequest(SEND_VIBER_MESSAGES, expectedRequest, givenResponse, 200);

        ViberApi api = new ViberApi(getApiClient());

        ViberMessage viberMessage = new ViberMessage()
                .sender(expectedSender)
                .destinations(List.of(new ViberToDestination().to(expectedTo)))
                .content(new ViberOutboundFileContent()
                        .fileName(expectedFileName)
                        .mediaUrl(expectedMediaUrl));

        ViberRequest viberRequest = new ViberRequest().addMessagesItem(viberMessage);

        Consumer<MessageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
            then(message.getDestination()).isEqualTo(givenDestination);
        };

        var call = api.sendViberMessages(viberRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetOutboundViberMessageDeliveryReports() {
        String givenBulkId = "string";
        Double givenPricePerMessage = 0.0;
        String givenCurrency = "string";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenAction = "string";
        Integer givenErrorGroupId = 0;
        MessageErrorGroup givenErrorGroupName = MessageErrorGroup.OK;
        Integer givenErrorId = 0;
        String givenErrorName = "string";
        String givenErrorDescription = "string";
        Boolean givenPermanent = false;
        String givenMessageId = "string";
        String givenTo = "string";
        String givenSender = "string";
        String givenSentAt = "2023-12-08T08:54:15Z";
        String givenDoneAt = "2023-12-08T08:54:15Z";
        Integer givenMessageCount = 0;
        String givenMccMnc = "string";
        String givenCallbackData = "string";

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
                        + "      },\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": %d,\n"
                        + "      \"mccMnc\": \"%s\",\n"
                        + "      \"callbackData\": \"%s\"\n"
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
                givenAction,
                givenErrorGroupId,
                givenErrorGroupName,
                givenErrorId,
                givenErrorName,
                givenErrorDescription,
                givenPermanent,
                givenMessageId,
                givenTo,
                givenSender,
                givenSentAt,
                givenDoneAt,
                givenMessageCount,
                givenMccMnc,
                givenCallbackData);

        setUpSuccessGetRequest(
                GET_VIBER_REPORTS,
                Map.of(
                        "bulkId", "BULK-ID-123-xyz",
                        "messageId", "MESSAGE-ID-123-xyz",
                        "limit", "2"),
                givenResponse);

        ViberApi api = new ViberApi(getApiClient());

        Consumer<ViberWebhookReportsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
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
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getSender()).isEqualTo(givenSender);
            then(result.getSentAt()).isEqualTo(givenSentAt);
            then(result.getDoneAt()).isEqualTo(givenDoneAt);
            then(result.getMessageCount()).isEqualTo(givenMessageCount);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            then(result.getCallbackData()).isEqualTo(givenCallbackData);
        };

        var call = api.getOutboundViberMessageDeliveryReports()
                .bulkId("BULK-ID-123-xyz")
                .messageId("MESSAGE-ID-123-xyz")
                .limit(2);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    // TODO: Fix this test
    @Test
    void shouldGetOutboundViberMessageLogs() {
        String givenSender = "string";
        String givenDestination = "string";
        String givenBulkId = "BULK-ID-123-xyz";
        String givenMessageId = "string";
        String givenSentAt = "2023-12-08T08:54:15Z";
        String givenDoneAt = "2023-12-08T08:54:15Z";
        Integer givenMessageCount = 0;
        Double givenPricePerMessage = 0.0;
        String givenCurrency = "EUR";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenAction = "string";
        Integer givenErrorGroupId = 0;
        MessageErrorGroup givenErrorGroupName = MessageErrorGroup.OK;
        Integer givenErrorId = 0;
        String givenErrorName = "string";
        String givenErrorDescription = "string";
        Boolean givenPermanent = true;
        String givenEntityId = "string";
        String givenApplicationId = "string";
        String givenContentType = "TEXT";
        String givenContentText = "Some text";

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
                        + "        \"pricePerMessage\": %f,\n"
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
                        + "        \"permanent\": %b\n"
                        + "      },\n"
                        + "      \"platform\": {\n"
                        + "        \"entityId\": \"%s\",\n"
                        + "        \"applicationId\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"type\": \"%s\",\n"
                        + "        \"text\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
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
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenAction,
                givenErrorGroupId,
                givenErrorGroupName,
                givenErrorId,
                givenErrorName,
                givenErrorDescription,
                givenPermanent,
                givenEntityId,
                givenApplicationId,
                givenContentType,
                givenContentText);

        ViberApi api = new ViberApi(getApiClient());

        Consumer<ViberLogsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
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
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getSender()).isEqualTo(givenSender);
            then(result.getSentAt()).isEqualTo(givenSentAt);
            then(result.getDoneAt()).isEqualTo(givenDoneAt);
            then(result.getMessageCount()).isEqualTo(givenMessageCount);
        };

        String givenSentSinceString = "2019-11-09T16:00:00.000+0000";
        String givenSentUntilString = "2019-11-09T16:00:00.000+0000";
        OffsetDateTime givenSentSince =
                OffsetDateTime.of(LocalDateTime.of(2019, 11, 9, 16, 0, 0), ZoneOffset.ofHours(0));
        OffsetDateTime givenSentUntil =
                OffsetDateTime.of(LocalDateTime.of(2019, 11, 9, 16, 0, 0), ZoneOffset.ofHours(0));

        setUpSuccessGetRequest(
                GET_VIBER_LOGS,
                Map.of(
                        "bulkId", "BULK-ID-123-xyz",
                        "messageId", "MESSAGE-ID-123-xyz",
                        "sender", "sender",
                        "destination", "destination",
                        "generalStatus", "DELIVERED",
                        "sentSince", givenSentSinceString,
                        "sentUntil", givenSentUntilString,
                        "limit", "50",
                        "entityId", "entityId",
                        "applicationId", "applicationId"),
                givenResponse);

        var call = api.getOutboundViberMessageLogs()
                .bulkId(List.of("BULK-ID-123-xyz"))
                .messageId(List.of("MESSAGE-ID-123-xyz"))
                .sender("sender")
                .destination("destination")
                .generalStatus(MessageGeneralStatus.DELIVERED)
                .sentSince(givenSentSince)
                .sentUntil(givenSentUntil)
                .limit(50)
                .entityId("entityId")
                .applicationId("applicationId");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldParseViberDeliveryReports() {
        var givenBulkId = "a28dd97c-2222-4fcf-99f1-0b557ed381da";
        var givenPricePerMessage = 0.15;
        var givenCurrency = "EUR";
        var givenStatusGroupId = 3;
        var givenStatusGroupName = "DELIVERED";
        var givenStatusId = 5;
        var givenStatusName = "DELIVERED_TO_HANDSET";
        var givenStatusDescription = "Message delivered to handset";
        var givenErrorGroupId = 0;
        var givenErrorGroupName = "OK";
        var givenErrorId = 0;
        var givenErrorName = "NO_ERROR";
        var givenErrorDescription = "No Error";
        var givenErrorPermanent = false;
        var givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";
        var givenTo = "441134960001";
        var givenSender = "441134960000";
        var givenSentAt = "2019-04-09T16:00:58.000-0300";
        var givenDoneAt = "2019-04-09T16:01:56.000-0300";
        var givenMessageCount = 1;
        var givenMccMnc = "22801";
        var givenCallbackData = "Callback data";
        var givenRequest = String.format(
                "{\n" + "\"results\": [\n"
                        + "  {\n"
                        + "    \"bulkId\": \"%s\",\n"
                        + "    \"price\": {\n"
                        + "      \"pricePerMessage\": %f,\n"
                        + "      \"currency\": \"%s\"\n"
                        + "    },\n"
                        + "    \"status\": {\n"
                        + "      \"groupId\": %d,\n"
                        + "      \"groupName\": \"%s\",\n"
                        + "      \"id\": %d,\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\"\n"
                        + "    },\n"
                        + "    \"error\": {\n"
                        + "      \"groupId\": %d,\n"
                        + "      \"groupName\": \"%s\",\n"
                        + "      \"id\": %d,\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"permanent\": %b\n"
                        + "    },\n"
                        + "    \"messageId\": \"%s\",\n"
                        + "    \"to\": \"%s\",\n"
                        + "    \"sender\": \"%s\",\n"
                        + "    \"sentAt\": \"%s\",\n"
                        + "    \"doneAt\": \"%s\",\n"
                        + "    \"messageCount\": %d,\n"
                        + "    \"mccMnc\": \"%s\",\n"
                        + "    \"callbackData\": \"%s\"\n"
                        + "  }\n"
                        + " ]\n"
                        + "}",
                givenBulkId,
                givenPricePerMessage,
                givenCurrency,
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
                givenMessageId,
                givenTo,
                givenSender,
                givenSentAt,
                givenDoneAt,
                givenMessageCount,
                givenMccMnc,
                givenCallbackData);

        ViberWebhookReportsResponse deliveryResult =
                new JSON().deserialize(givenRequest, ViberWebhookReportsResponse.class);

        var expectedSentAt = OffsetDateTime.of(LocalDateTime.of(2019, 4, 9, 16, 0, 58), ZoneOffset.ofHours(-3));
        var expectedDoneAt = OffsetDateTime.of(LocalDateTime.of(2019, 4, 9, 16, 1, 56), ZoneOffset.ofHours(-3));

        var expectedReport = new ViberWebhookReport()
                .bulkId(givenBulkId)
                .messageId(givenMessageId)
                .to(givenTo)
                .sentAt(expectedSentAt)
                .doneAt(expectedDoneAt)
                .sender(givenSender)
                .messageCount(givenMessageCount)
                .mccMnc(givenMccMnc)
                .callbackData(givenCallbackData)
                .price(new MessagePrice().pricePerMessage(givenPricePerMessage).currency(givenCurrency))
                .error(new ViberMessageError()
                        .id(givenErrorId)
                        .groupId(givenErrorGroupId)
                        .groupName(MessageErrorGroup.valueOf(givenErrorGroupName))
                        .name(givenErrorName)
                        .description(givenErrorDescription)
                        .permanent(givenErrorPermanent))
                .status(new MessageStatus()
                        .id(givenStatusId)
                        .name(givenStatusName)
                        .description(givenStatusDescription)
                        .groupId(givenStatusGroupId)
                        .groupName(givenStatusGroupName));
        var expectedReportResponse = new ViberWebhookReportsResponse().addResultsItem(expectedReport);

        then(deliveryResult).isEqualTo(expectedReportResponse);
    }

    @Test
    void shouldParseViberInboundTextMessage() {
        String givenFrom = "385912345678";
        String givenTo = "givenClient";
        String givenIntegrationType = "VIBER";
        String givenReceivedAt = "2020-04-01T11:02:43.594+0000";
        String givenMessageId = "1234567890123456789";
        String givenPairedMessageId = "9876543210987654321";
        String givenCallbackData = "callback data";
        String givenText = "givenText";
        String givenTrackingData = "givenTrackingData";
        String givenType = "TEXT";
        Double givenPricePerMessage = 0.150000;
        String givenCurrency = "EUR";
        Integer givenMessageCount = 1;
        Integer givenPendingMessageCount = 1;

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
                        + "        \"trackingData\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"pendingMessageCount\": %d\n"
                        + "}\n",
                givenFrom,
                givenTo,
                givenIntegrationType,
                givenReceivedAt,
                givenMessageId,
                givenPairedMessageId,
                givenCallbackData,
                givenText,
                givenTrackingData,
                givenType,
                givenPricePerMessage,
                givenCurrency,
                givenMessageCount,
                givenPendingMessageCount);

        ViberWebhookInboundReportResponse receivedMessages =
                new JSON().deserialize(givenRequest, ViberWebhookInboundReportResponse.class);

        var expectedSentAt =
                OffsetDateTime.of(LocalDateTime.of(2020, 4, 1, 11, 2, 43, 594_000_000), ZoneOffset.ofHours(0));

        var viberResultViberInboundContent = new ViberInboundMessageViberInboundContent()
                .sender(givenFrom)
                .to(givenTo)
                .integrationType(givenIntegrationType)
                .receivedAt(expectedSentAt)
                .messageId(givenMessageId)
                .pairedMessageId(givenPairedMessageId)
                .callbackData(givenCallbackData)
                .message(new ViberInboundTextContent().text(givenText).trackingData(givenTrackingData))
                .price(new MessagePrice().pricePerMessage(givenPricePerMessage).currency(givenCurrency));

        var viberWebhookInboundReportResponse = new ViberWebhookInboundReportResponse()
                .addResultsItem(viberResultViberInboundContent)
                .messageCount(givenMessageCount)
                .pendingMessageCount(givenPendingMessageCount);

        then(viberWebhookInboundReportResponse).isEqualTo(receivedMessages);
    }

    @Test
    void shouldParseViberInboundFileMessage() {
        String givenFrom = "385912345678";
        String givenTo = "givenClient";
        String givenIntegrationType = "VIBER";
        String givenReceivedAt = "2020-04-01T11:02:43.594+0000";
        String givenMessageId = "1234567890123456789";
        String givenPairedMessageId = "9876543210987654321";
        String givenCallbackData = "callback data";
        String givenUrl = "https://example.com/givenUrl.pdf";
        String givenFileName = "givenFileName";
        String givenTrackingData = "givenTrackingData";
        String givenType = "FILE";
        Double givenPricePerMessage = 0.150000;
        String givenCurrency = "EUR";
        Integer givenMessageCount = 1;
        Integer givenPendingMessageCount = 1;

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
                        + "        \"url\": \"%s\",\n"
                        + "        \"fileName\": \"%s\",\n"
                        + "        \"trackingData\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": %f,\n"
                        + "        \"currency\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"pendingMessageCount\": %d\n"
                        + "}\n",
                givenFrom,
                givenTo,
                givenIntegrationType,
                givenReceivedAt,
                givenMessageId,
                givenPairedMessageId,
                givenCallbackData,
                givenUrl,
                givenFileName,
                givenTrackingData,
                givenType,
                givenPricePerMessage,
                givenCurrency,
                givenMessageCount,
                givenPendingMessageCount);

        ViberWebhookInboundReportResponse receivedMessages =
                new JSON().deserialize(givenRequest, ViberWebhookInboundReportResponse.class);

        var expectedSentAt =
                OffsetDateTime.of(LocalDateTime.of(2020, 4, 1, 11, 2, 43, 594_000_000), ZoneOffset.ofHours(0));

        var viberResultViberInboundContent = new ViberInboundMessageViberInboundContent()
                .sender(givenFrom)
                .to(givenTo)
                .integrationType(givenIntegrationType)
                .receivedAt(expectedSentAt)
                .messageId(givenMessageId)
                .pairedMessageId(givenPairedMessageId)
                .callbackData(givenCallbackData)
                .message(new ViberInboundFileContent()
                        .url(givenUrl)
                        .fileName(givenFileName)
                        .trackingData(givenTrackingData))
                .price(new MessagePrice().pricePerMessage(givenPricePerMessage).currency(givenCurrency));

        var viberInboundMessages = new ViberWebhookInboundReportResponse()
                .addResultsItem(viberResultViberInboundContent)
                .messageCount(givenMessageCount)
                .pendingMessageCount(givenPendingMessageCount);

        then(viberInboundMessages).isEqualTo(receivedMessages);
    }

    @Test
    void shouldParseViberSeenReports() {
        String givenMessageId = "1215f543ab19-345f-adbd-12ad31451ed25f35";
        String givenFrom = "385919998888";
        String givenTo = "41793026731";
        String givenSentAt = "2023-04-05T11:21:57.793+0000";
        String givenSeenAt = "2023-04-05T11:22:10.251+0000";
        String givenApplicationId = "applicationId";
        String givenEntityId = "entityId";

        String givenRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"seenAt\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\",\n"
                        + "      \"entityId\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenMessageId, givenFrom, givenTo, givenSentAt, givenSeenAt, givenApplicationId, givenEntityId);

        ViberSeenReports receivedSeenReports = new JSON().deserialize(givenRequest, ViberSeenReports.class);

        var expectedSentAt =
                OffsetDateTime.of(LocalDateTime.of(2023, 4, 5, 11, 21, 57, 793_000_000), ZoneOffset.ofHours(0));

        var expectedSeenAt =
                OffsetDateTime.of(LocalDateTime.of(2023, 4, 5, 11, 22, 10, 251_000_000), ZoneOffset.ofHours(0));

        var seenReport = new ViberSeenReport()
                .messageId(givenMessageId)
                .from(givenFrom)
                .to(givenTo)
                .sentAt(expectedSentAt)
                .seenAt(expectedSeenAt)
                .applicationId(givenApplicationId)
                .entityId(givenEntityId);

        var seenReports = new ViberSeenReports().addResultsItem(seenReport);

        then(receivedSeenReports).isEqualTo(seenReports);
    }
}
