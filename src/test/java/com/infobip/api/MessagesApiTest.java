package com.infobip.api;

import com.infobip.JSON;
import com.infobip.api.MessagesApi;
import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.function.Consumer;

import static org.assertj.core.api.BDDAssertions.then;

class MessagesApiTest extends ApiTest {

    private static final String MESSAGES = "/messages-api/1/messages";
    private static final String EVENTS = "/messages-api/1/events";

    @Test
    void shouldSendTextMessages() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";
        MessagesApiOutboundMessageChannel givenChannel = MessagesApiOutboundMessageChannel.SMS;
        String givenSender = "447491163443";
        String givenTo = "111111111";
        String givenText = "May the Force be with you.";
        String givenType = "TEXT";

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"messages\": [\n" +
                                             "    {\n" +
                                             "      \"messageId\": \"%s\",\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"destination\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenMessageId,
                                             givenGroupId,
                                             givenGroupName,
                                             givenId,
                                             givenName,
                                             givenDescription,
                                             givenDestination);

        String expectedRequest = String.format("{\n" +
                                               "   \"messages\": [\n" +
                                               "     {\n" +
                                               "       \"channel\": \"%s\",\n" +
                                               "       \"sender\": \"%s\",\n" +
                                               "       \"destinations\": [\n" +
                                               "         {\n" +
                                               "           \"to\": \"%s\"\n" +
                                               "         }\n" +
                                               "       ],\n" +
                                               "       \"content\": {\n" +
                                               "         \"body\": {\n" +
                                               "           \"text\": \"%s\",\n" +
                                               "           \"type\": \"%s\"\n" +
                                               "         }\n" +
                                               "       }\n" +
                                               "     }\n" +
                                               "   ]\n" +
                                               "}", givenChannel, givenSender, givenTo, givenText, givenType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest().messages(List.of(new MessagesApiMessage().channel(MessagesApiOutboundMessageChannel.SMS)
                                                                                                       .sender(givenSender)
                                                                                                       .destinations(List.of(new MessagesApiToDestination().to(
                                                                                                           givenTo)))
                                                                                                       .content(new MessagesApiMessageContent().body(new MessagesApiMessageTextBody().text(
                                                                                                           givenText)))));

        Consumer<MessagesApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            var messages = response.getMessages();
            then(messages.size()).isEqualTo(1);
            var message = messages.get(0);
            then(message).isNotNull();
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
        };

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessage() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"messages\": [\n" +
                                             "    {\n" +
                                             "      \"messageId\": \"%s\",\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"destination\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}",
                                             givenBulkId,
                                             givenMessageId,
                                             givenGroupId,
                                             givenGroupName,
                                             givenId,
                                             givenName,
                                             givenDescription,
                                             givenDestination);

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedSuffix = "search?q=007";
        String expectedButtonType = "OPEN_URL";

        String expectedRequest = String.format("{\n" +
                                               "  \"messages\": [\n" +
                                               "    {\n" +
                                               "      \"channel\": \"%s\",\n" +
                                               "      \"sender\": \"%s\",\n" +
                                               "      \"destinations\": [\n" +
                                               "        {\n" +
                                               "          \"to\": \"%s\"\n" +
                                               "        }\n" +
                                               "      ],\n" +
                                               "      \"template\": {\n" +
                                               "        \"templateName\": \"%s\",\n" +
                                               "        \"language\": \"%s\"\n" +
                                               "      },\n" +
                                               "      \"content\": {\n" +
                                               "        \"body\": {\n" +
                                               "          \"type\": \"%s\"\n" +
                                               "        },\n" +
                                               "        \"buttons\": [\n" +
                                               "          {\n" +
                                               "            \"suffix\": \"%s\",\n" +
                                               "            \"type\": \"%s\"\n" +
                                               "          }\n" +
                                               "        ]\n" +
                                               "      }\n" +
                                               "    }\n" +
                                               "  ]\n" +
                                               "}",
                                               expectedChannel,
                                               expectedSender,
                                               expectedDestination,
                                               expectedTemplateName,
                                               expectedLanguage,
                                               expectedType,
                                               expectedSuffix,
                                               expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessagesApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            var messages = response.getMessages();
            then(messages.size()).isEqualTo(1);
            var message = messages.get(0);
            then(message).isNotNull();
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
        };

        MessagesApiRequest request = new MessagesApiRequest().messages(List.of(new MessagesApiTemplateMessage().channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                                                                                                               .sender(expectedSender)
                                                                                                               .destinations(List.of(new MessagesApiToDestination().to(
                                                                                                                   expectedDestination)))
                                                                                                               .template(new MessagesApiTemplate().templateName(
                                                                                                                                                      expectedTemplateName)
                                                                                                                                                  .language(
                                                                                                                                                      expectedLanguage))
                                                                                                               .content(new MessagesApiTemplateMessageContent().body(
                                                                                                                                                                   new MessagesApiTemplateTextBody()
                                                                                                                                                               )
                                                                                                                                                               .buttons(
                                                                                                                                                                   List.of(
                                                                                                                                                                       new MessagesApiTemplateOpenUrlButton().suffix(
                                                                                                                                                                           expectedSuffix))))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendMessagesEvent() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";
        MessagesApiOutboundEventChannel givenChannel = MessagesApiOutboundEventChannel.APPLE_MB;
        String givenSender = "447491163443";
        String givenTo = "111111111";
        String givenEvent = "TYPING_STARTED";

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"messages\": [\n" +
                                             "    {\n" +
                                             "      \"messageId\": \"%s\",\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"destination\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenMessageId,
                                             givenGroupId,
                                             givenGroupName,
                                             givenId,
                                             givenName,
                                             givenDescription,
                                             givenDestination);

        String expectedRequest = String.format("{\n" +
                                               "   \"events\": [\n" +
                                               "     {\n" +
                                               "       \"channel\": \"%s\",\n" +
                                               "       \"sender\": \"%s\",\n" +
                                               "       \"destinations\": [\n" +
                                               "         {\n" +
                                               "           \"to\": \"%s\"\n" +
                                               "         }\n" +
                                               "       ],\n" +
                                               "       \"event\": \"%s\"\n" +
                                               "     }\n" +
                                               "   ]\n" +
                                               " }\n", givenChannel, givenSender, givenTo, givenEvent);

        setUpSuccessPostRequest(EVENTS, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        var request = new MessagesApiEventRequest().events(List.of(new MessagesApiOutboundTypingStartedEvent().channel(givenChannel)
                                                                                                      .sender(givenSender)
                                                                                                      .destinations(List.of(new MessagesApiToDestination().to(
                                                                                                          givenTo)))));

        Consumer<MessagesApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            var messages = response.getMessages();
            then(messages.size()).isEqualTo(1);
            var message = messages.get(0);
            then(message).isNotNull();
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getStatus()).isNotNull();
            var status = message.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
        };

        var call = api.sendMessagesApiEvents(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    // WEBHOOKS

    private final JSON json = new JSON();

    @Test
    void shouldParseReceiveDeliveryReports() {
        String expectedEvent = "DELIVERY";
        MessagesApiInboundDlrChannel expectedChannel = MessagesApiInboundDlrChannel.SMS;
        String expectedSender = "string";
        String expectedDestination = "string";
        String expectedSentAt = "string";
        String expectedDoneAt = "string";
        String expectedMessageId = "string";
        String expectedCallbackData = "string";
        Integer expectedMessageCount = 0;
        Integer expectedGroupId = 0;
        String expectedGroupName = "string";
        Integer expectedId = 0;
        String expectedName = "string";
        String expectedDescription = "string";
        Integer expectedErrorGroupId = 0;
        String expectedErrorGroupName = "string";
        Integer expectedErrorId = 0;
        String expectedErrorName = "string";
        String expectedErrorDescription = "string";
        boolean expectedPermanent = true;
        String expectedApplicationId = "string";
        String expectedEntityId = "string";
        String expectedDeviceDetails = "string";
        Integer expectedMccMnc = 0;
        Integer expectedNetworkId = 0;

        String expectedRequest = String.format("{\n" +
                                               "  \"results\": [\n" +
                                               "    {\n" +
                                               "      \"event\": \"%s\",\n" +
                                               "      \"channel\": \"%s\",\n" +
                                               "      \"sender\": \"%s\",\n" +
                                               "      \"destination\": \"%s\",\n" +
                                               "      \"sentAt\": \"%s\",\n" +
                                               "      \"doneAt\": \"%s\",\n" +
                                               "      \"messageId\": \"%s\",\n" +
                                               "      \"callbackData\": \"%s\",\n" +
                                               "      \"messageCount\": %d,\n" +
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
                                               "        \"description\": \"%s\",\n" +
                                               "        \"permanent\": %b\n" +
                                               "      },\n" +
                                               "      \"platform\": {\n" +
                                               "        \"applicationId\": \"%s\",\n" +
                                               "        \"entityId\": \"%s\"\n" +
                                               "      },\n" +
                                               "      \"deviceDetails\": \"%s\",\n" +
                                               "      \"mccMnc\": %d,\n" +
                                               "      \"networkId\": %d\n" +
                                               "    }\n" +
                                               "  ]\n" +
                                               "}",
                                               expectedEvent,
                                               expectedChannel,
                                               expectedSender,
                                               expectedDestination,
                                               expectedSentAt,
                                               expectedDoneAt,
                                               expectedMessageId,
                                               expectedCallbackData,
                                               expectedMessageCount,
                                               expectedGroupId,
                                               expectedGroupName,
                                               expectedId,
                                               expectedName,
                                               expectedDescription,
                                               expectedErrorGroupId,
                                               expectedErrorGroupName,
                                               expectedErrorId,
                                               expectedErrorName,
                                               expectedErrorDescription,
                                               expectedPermanent,
                                               expectedApplicationId,
                                               expectedEntityId,
                                               expectedDeviceDetails,
                                               expectedMccMnc,
                                               expectedNetworkId);

        MessagesApiDeliveryReport messagesApiDlrRequest = json.deserialize(expectedRequest, MessagesApiDeliveryReport.class);

        then(messagesApiDlrRequest.getResults()).isNotNull();
        then(messagesApiDlrRequest.getResults().size()).isEqualTo(1);
        var messagesApiDlrEvent = messagesApiDlrRequest.getResults().get(0);
        then(messagesApiDlrEvent.getEvent()).isEqualTo(expectedEvent);
        then(messagesApiDlrEvent.getChannel()).isEqualTo(expectedChannel);
        then(messagesApiDlrEvent.getSender()).isEqualTo(expectedSender);
        then(messagesApiDlrEvent.getDestination()).isEqualTo(expectedDestination);
        then(messagesApiDlrEvent.getSentAt()).isEqualTo(expectedSentAt);
        then(messagesApiDlrEvent.getDoneAt()).isEqualTo(expectedDoneAt);
        then(messagesApiDlrEvent.getMessageId()).isEqualTo(expectedMessageId);
        then(messagesApiDlrEvent.getCallbackData()).isEqualTo(expectedCallbackData);
        then(messagesApiDlrEvent.getMessageCount()).isEqualTo(expectedMessageCount);
        var messageStatus = messagesApiDlrEvent.getStatus();
        then(messageStatus.getGroupId()).isEqualTo(expectedGroupId);
        then(messageStatus.getGroupName()).isEqualTo(expectedGroupName);
        then(messageStatus.getId()).isEqualTo(expectedId);
        then(messageStatus.getName()).isEqualTo(expectedName);
        then(messageStatus.getDescription()).isEqualTo(expectedDescription);
        var messageError = messagesApiDlrEvent.getError();
        then(messageError.getGroupId()).isEqualTo(expectedErrorGroupId);
        then(messageError.getGroupName()).isEqualTo(expectedErrorGroupName);
        then(messageError.getId()).isEqualTo(expectedErrorId);
        then(messageError.getName()).isEqualTo(expectedErrorName);
        then(messageError.getDescription()).isEqualTo(expectedErrorDescription);
        then(messageError.getPermanent()).isEqualTo(expectedPermanent);
        var messagePlatform = messagesApiDlrEvent.getPlatform();
        then(messagePlatform.getApplicationId()).isEqualTo(expectedApplicationId);
        then(messagePlatform.getEntityId()).isEqualTo(expectedEntityId);
        then(messagesApiDlrEvent.getDeviceDetails()).isEqualTo(expectedDeviceDetails);
        then(messagesApiDlrEvent.getMccMnc()).isEqualTo(expectedMccMnc);
        then(messagesApiDlrEvent.getNetworkId()).isEqualTo(expectedNetworkId);
    }

    @Test
    void shouldParseReceiveIncomingMessages() {
        MessagesApiInboundMoEventChannel expectedChannel = MessagesApiInboundMoEventChannel.SMS;
        String expectedSender = "48123234567";
        String expectedDestination = "48123098765";
        String expectedText = "Text message 123";
        String expectedCleanText = "Text message";
        Integer expectedMessageCount = 1;
        String expectedType = "TEXT";
        String expectedReceivedAt = "2020-02-06T14:18:29.797+0000";
        String expectedMessageId = "ABEGVUGWh3gEAgo-sLTvmQCS5kwjhsy";
        String expectedApplicationId = "my-application-id";
        String expectedEntityId = "my-entity-id";
        MessagesApiInboundEventType expectedEvent = MessagesApiInboundEventType.MO;

        String expectedRequest = String.format("{\n" +
                                               "  \"results\": [\n" +
                                               "    {\n" +
                                               "      \"channel\": \"%s\",\n" +
                                               "      \"sender\": \"%s\",\n" +
                                               "      \"destination\": \"%s\",\n" +
                                               "      \"content\": [\n" +
                                               "        {\n" +
                                               "          \"text\": \"%s\",\n" +
                                               "          \"cleanText\": \"%s\",\n" +
                                               "          \"messageCount\": %d,\n" +
                                               "          \"type\": \"%s\"\n" +
                                               "        }\n" +
                                               "      ],\n" +
                                               "      \"receivedAt\": \"%s\",\n" +
                                               "      \"messageId\": \"%s\",\n" +
                                               "      \"platform\": {\n" +
                                               "        \"applicationId\": \"%s\",\n" +
                                               "        \"entityId\": \"%s\"\n" +
                                               "      },\n" +
                                               "      \"event\": \"%s\"\n" +
                                               "    }\n" +
                                               "  ]\n" +
                                               "}",
                                               expectedChannel,
                                               expectedSender,
                                               expectedDestination,
                                               expectedText,
                                               expectedCleanText,
                                               expectedMessageCount,
                                               expectedType,
                                               expectedReceivedAt,
                                               expectedMessageId,
                                               expectedApplicationId,
                                               expectedEntityId,
                                               expectedEvent);

        OffsetDateTime expectedReceivedAtDateTime = OffsetDateTime.of(2020, 2, 6, 14, 18, 29, 797_000_000, ZoneOffset.ofHours(0));

        MessagesApiIncomingMessage messagesApiWebhookRequest = json.deserialize(expectedRequest, MessagesApiIncomingMessage.class);

        then(messagesApiWebhookRequest.getResults()).isNotNull();
        then(messagesApiWebhookRequest.getResults().size()).isEqualTo(1);
        then(messagesApiWebhookRequest.getResults().get(0).getClass()).isEqualTo(MessagesApiWebhookEvent.class);
        MessagesApiWebhookEvent messagesApiWebhookEvent = (MessagesApiWebhookEvent) messagesApiWebhookRequest.getResults().get(0);
        then(messagesApiWebhookEvent.getChannel()).isEqualTo(expectedChannel);
        then(messagesApiWebhookEvent.getSender()).isEqualTo(expectedSender);
        then(messagesApiWebhookEvent.getDestination()).isEqualTo(expectedDestination);
        then(messagesApiWebhookEvent.getContent()).isNotNull();
        then(messagesApiWebhookEvent.getContent().size()).isEqualTo(1);
        then(messagesApiWebhookEvent.getContent().get(0).getClass()).isEqualTo(MessagesApiWebhookEventTextContent.class);
        MessagesApiWebhookEventTextContent messageContent = (MessagesApiWebhookEventTextContent) messagesApiWebhookEvent.getContent().get(0);
        then(messageContent.getText()).isEqualTo(expectedText);
        then(messageContent.getCleanText()).isEqualTo(expectedCleanText);
        then(messageContent.getMessageCount()).isEqualTo(expectedMessageCount);
        then(messagesApiWebhookEvent.getReceivedAt()).isEqualTo(expectedReceivedAtDateTime);
        then(messagesApiWebhookEvent.getMessageId()).isEqualTo(expectedMessageId);
        var messagePlatform = messagesApiWebhookEvent.getPlatform();
        then(messagePlatform.getApplicationId()).isEqualTo(expectedApplicationId);
        then(messagePlatform.getEntityId()).isEqualTo(expectedEntityId);
        then(messagesApiWebhookEvent.getEvent()).isEqualTo(expectedEvent);
    }

}
