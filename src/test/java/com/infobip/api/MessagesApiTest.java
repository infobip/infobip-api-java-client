package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class MessagesApiTest extends ApiTest {

    private static final String MESSAGES = "/messages-api/1/messages";
    private static final String EVENTS = "/messages-api/1/events";
    private static final String VALIDATE = "/messages-api/1/messages/validate";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         }\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel, givenSender, givenTo, givenText, givenType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText)))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendTextMessagesWithReplyButton() {
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
        String givenButtonText = "Yes, I agree!";
        String givenButtonType = "REPLY";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel, givenSender, givenTo, givenText, givenType, givenButtonText, givenButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText))
                                .buttons(List.of(new MessagesApiMessageReplyButton().text(givenButtonText))))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendTextMessagesWithOperUrlButton() {
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
        String givenButtonText = "Yes, I agree!";
        String givenButtonType = "OPEN_URL";
        String givenOpenUrl = "http://example.com/agree";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"url\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel,
                givenSender,
                givenTo,
                givenText,
                givenType,
                givenButtonText,
                givenOpenUrl,
                givenButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText))
                                .buttons(List.of(new MessagesApiMessageOpenUrlButton()
                                        .text(givenButtonText)
                                        .url(givenOpenUrl))))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendTextMessagesWithDialPhoneButton() {
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
        String givenButtonText = "Yes, I agree!";
        String givenButtonType = "DIAL_PHONE";
        String givenPhoneNumber = "+1234567890";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"phoneNumber\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel,
                givenSender,
                givenTo,
                givenText,
                givenType,
                givenButtonText,
                givenPhoneNumber,
                givenButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText))
                                .buttons(List.of(new MessagesApiMessageDialPhoneButton()
                                        .text(givenButtonText)
                                        .phoneNumber(givenPhoneNumber))))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendTextMessagesWithShowLocationButton() {
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
        String givenButtonText = "Yes, I agree!";
        String givenButtonType = "SHOW_LOCATION";
        Double givenLatitude = 37.7749;
        Double givenLongitude = -122.4194;

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"latitude\": %f,\n"
                        + "            \"longitude\": %f,\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel,
                givenSender,
                givenTo,
                givenText,
                givenType,
                givenButtonText,
                givenLatitude,
                givenLongitude,
                givenButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText))
                                .buttons(List.of(new MessagesApiMessageShowLocationButton()
                                        .text(givenButtonText)
                                        .longitude(givenLongitude)
                                        .latitude(givenLatitude))))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendTextMessagesWithRequestLocationButton() {
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
        String givenButtonText = "Yes, I agree!";
        String givenButtonType = "REQUEST_LOCATION";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel, givenSender, givenTo, givenText, givenType, givenButtonText, givenButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText))
                                .buttons(List.of(
                                        new MessagesApiMessageRequestLocationButton().text(givenButtonText))))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendTextMessagesWithAddCalendarEventButton() {
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
        String givenButtonText = "Yes, I agree!";
        String givenButtonType = "ADD_CALENDAR_EVENT";
        OffsetDateTime givenStartTime = OffsetDateTime.of(2024, 7, 1, 10, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime givenEndTime = OffsetDateTime.of(2024, 7, 1, 11, 0, 0, 0, ZoneOffset.UTC);
        String givenStartTimeAsString = "2024-07-01T10:00:00.000+0000";
        String givenEndTimeAsString = "2024-07-01T11:00:00.000+0000";
        String givenEventTitle = "Meeting";
        String givenEventDescription = "Discuss project updates";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"text\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"text\": \"%s\",\n"
                        + "            \"startTime\": \"%s\",\n"
                        + "            \"endTime\": \"%s\",\n"
                        + "            \"title\": \"%s\",\n"
                        + "            \"description\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel,
                givenSender,
                givenTo,
                givenText,
                givenType,
                givenButtonText,
                givenStartTimeAsString,
                givenEndTimeAsString,
                givenEventTitle,
                givenEventDescription,
                givenButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenText))
                                .buttons(List.of(new MessagesApiMessageAddCalendarEventButton()
                                        .description(givenEventDescription)
                                        .title(givenEventTitle)
                                        .startTime(givenStartTime)
                                        .endTime(givenEndTime)
                                        .text(givenButtonText))))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendImageMessages() {
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
        String givenType = "IMAGE";
        String givenImageUrl = "https://example.com/image.jpg";

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"messages\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"content\": {\n"
                        + "         \"body\": {\n"
                        + "           \"url\": \"%s\",\n"
                        + "           \"type\": \"%s\"\n"
                        + "         }\n"
                        + "       }\n"
                        + "     }\n"
                        + "   ]\n"
                        + "}",
                givenChannel, givenSender, givenTo, givenImageUrl, givenType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(MessagesApiOutboundMessageChannel.SMS)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageImageBody().url(givenImageUrl)))));

        Consumer<MessageResponse> assertions = (response) -> {
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
    void shouldSendValidateMessagesApiMessage() {
        MessagesApiOutboundMessageChannel givenChannel = MessagesApiOutboundMessageChannel.SMS;
        String givenSender = "447491163443";
        String givenTo = "111111111";
        String givenMessageText = "May the Force be with you.";
        String givenTextType = "TEXT";
        String givenDescription =
                "Request can be sent through '/messages' endpoint and should be accepted by our platform.";
        String givenAction = "No action is required, but it is recommended to check and address any violations.";
        String givenProperty = "messages[0].metadata";
        String givenViolation = "Unknown property";

        String givenResponse = String.format(
                "{\n" + "  \"description\": \"%s\",\n"
                        + "  \"action\": \"%s\",\n"
                        + "  \"skippableViolations\": [\n"
                        + "    {\n"
                        + "      \"property\": \"%s\",\n"
                        + "      \"violation\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenDescription, givenAction, givenProperty, givenViolation);

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"text\": \"%s\",\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenChannel, givenSender, givenTo, givenMessageText, givenTextType);

        setUpSuccessPostRequest(VALIDATE, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        var request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiMessage()
                        .channel(givenChannel)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))
                        .content(new MessagesApiMessageContent()
                                .body(new MessagesApiMessageTextBody().text(givenMessageText)))));

        Consumer<MessagesApiValidationOkResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getDescription()).isEqualTo(givenDescription);
            then(response.getAction()).isEqualTo(givenAction);
            then(response.getSkippableViolations()).isNotNull();
            var violations = response.getSkippableViolations();
            then(violations.size()).isEqualTo(1);
            var violation = violations.get(0);
            then(violation.getProperty()).isEqualTo(givenProperty);
            then(violation.getViolation()).isEqualTo(givenViolation);
        };

        var call = api.validateMessagesApiMessage(request);
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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedSuffix = "search?q=007";
        String expectedButtonType = "OPEN_URL";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"suffix\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
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

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(new MessagesApiTemplateOpenUrlButton().suffix(expectedSuffix))))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessageWithQuickReplyButtonType() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectPostbackData = "postback_data_123";
        String expectedButtonType = "QUICK_REPLY";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"postbackData\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedTemplateName,
                expectedLanguage,
                expectedType,
                expectPostbackData,
                expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(
                                        new MessagesApiTemplateQuickReplyButton().postbackData(expectPostbackData))))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessageWithPhoneNumberButtonType() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedButtonType = "PHONE_NUMBER";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedTemplateName,
                expectedLanguage,
                expectedType,
                expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(new MessagesApiTemplatePhoneNumberButton())))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessageWithCopyCodeButtonType() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedCode = "code";
        String expectedButtonType = "COPY_CODE";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"code\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedTemplateName,
                expectedLanguage,
                expectedType,
                expectedCode,
                expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(new MessagesApiTemplateCopyCodeButton().code(expectedCode))))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessageWithFlowButtonType() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedToken = "flow_token";
        String expectedButtonType = "FLOW";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"token\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedTemplateName,
                expectedLanguage,
                expectedType,
                expectedToken,
                expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(new MessagesApiTemplateFlowButton().token(expectedToken))))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessageWithCatalogButtonType() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedProductId = "product_id";
        String expectedButtonType = "CATALOG";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"productId\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedTemplateName,
                expectedLanguage,
                expectedType,
                expectedProductId,
                expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(
                                        new MessagesApiTemplateCatalogButton().productId(expectedProductId))))));

        var call = api.sendMessagesApiMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTemplateMessageWithMultiProductButtonType() {
        String givenBulkId = "1688025180464000013";
        String givenMessageId = "1688025180464000014";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 26;
        String givenName = "MESSAGE_ACCEPTED";
        String givenDescription = "Message sent to next instance";
        String givenDestination = "48600700800";

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

        MessagesApiOutboundTemplateChannel expectedChannel = MessagesApiOutboundTemplateChannel.WHATSAPP;
        String expectedSender = "447860099299";
        String expectedDestination = "111111111";
        String expectedTemplateName = "registration_success";
        String expectedLanguage = "en_GB";
        String expectedType = "TEXT";
        String expectedProductId = "product_id";
        String expectedProductId2 = "product_id_2";
        String expectedButtonType = "MULTI_PRODUCT";
        String expectedTitleForButton = "title";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"template\": {\n"
                        + "        \"templateName\": \"%s\",\n"
                        + "        \"language\": \"%s\"\n"
                        + "      },\n"
                        + "      \"content\": {\n"
                        + "        \"body\": {\n"
                        + "          \"type\": \"%s\"\n"
                        + "        },\n"
                        + "        \"buttons\": [\n"
                        + "          {\n"
                        + "            \"sections\": [\n"
                        + "             {\n"
                        + "              \"title\": \"%s\",\n"
                        + "              \"productIds\": [\"%s\", \"%s\"]\n"
                        + "             }\n"
                        + "             ],\n"
                        + "            \"type\": \"%s\"\n"
                        + "          }\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedTemplateName,
                expectedLanguage,
                expectedType,
                expectedTitleForButton,
                expectedProductId,
                expectedProductId2,
                expectedButtonType);

        setUpSuccessPostRequest(MESSAGES, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        Consumer<MessageResponse> assertions = (response) -> {
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

        MessagesApiRequest request = new MessagesApiRequest()
                .messages(List.of(new MessagesApiTemplateMessage()
                        .channel(MessagesApiOutboundTemplateChannel.WHATSAPP)
                        .sender(expectedSender)
                        .destinations(List.of(new MessagesApiToDestination().to(expectedDestination)))
                        .template(new MessagesApiTemplate()
                                .templateName(expectedTemplateName)
                                .language(expectedLanguage))
                        .content(new MessagesApiTemplateMessageContent()
                                .body(new MessagesApiTemplateTextBody())
                                .buttons(List.of(new MessagesApiTemplateMultiProductButton()
                                        .sections(List.of(new MessagesApiTemplateMultiProductButtonSection()
                                                .title(expectedTitleForButton)
                                                .productIds(List.of(expectedProductId, expectedProductId2)))))))));

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
                        + "}\n",
                givenBulkId,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                givenDestination);

        String expectedRequest = String.format(
                "{\n" + "   \"events\": [\n"
                        + "     {\n"
                        + "       \"channel\": \"%s\",\n"
                        + "       \"sender\": \"%s\",\n"
                        + "       \"destinations\": [\n"
                        + "         {\n"
                        + "           \"to\": \"%s\"\n"
                        + "         }\n"
                        + "       ],\n"
                        + "       \"event\": \"%s\"\n"
                        + "     }\n"
                        + "   ]\n"
                        + " }\n",
                givenChannel, givenSender, givenTo, givenEvent);

        setUpSuccessPostRequest(EVENTS, expectedRequest, givenResponse);

        MessagesApi api = new MessagesApi(getApiClient());

        var request = new MessagesApiEventRequest()
                .events(List.of(new MessagesApiOutboundTypingStartedEvent()
                        .channel(givenChannel)
                        .sender(givenSender)
                        .destinations(List.of(new MessagesApiToDestination().to(givenTo)))));

        Consumer<MessageResponse> assertions = (response) -> {
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
        Integer expectedMccMnc = 0;

        String expectedRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"event\": \"%s\",\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destination\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"callbackData\": \"%s\",\n"
                        + "      \"messageCount\": %d,\n"
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
                        + "      \"platform\": {\n"
                        + "        \"applicationId\": \"%s\",\n"
                        + "        \"entityId\": \"%s\"\n"
                        + "      },\n"
                        + "      \"mccMnc\": %d\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
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
                expectedMccMnc);

        MessagesApiDeliveryReport messagesApiDlrRequest =
                json.deserialize(expectedRequest, MessagesApiDeliveryReport.class);

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
        then(messagesApiDlrEvent.getMccMnc()).isEqualTo(expectedMccMnc);
    }

    @Test
    void shouldParseReceiveIncomingMessages() {
        MessagesApiInboundMoEventChannel expectedChannel = MessagesApiInboundMoEventChannel.SMS;
        String expectedSender = "48123234567";
        String expectedDestination = "48123098765";
        String expectedText = "Text message 123";
        String expectedCleanText = "Text message";
        String expectedType = "TEXT";
        String expectedReceivedAt = "2020-02-06T14:18:29.797+0000";
        String expectedMessageId = "ABEGVUGWh3gEAgo-sLTvmQCS5kwjhsy";
        String expectedApplicationId = "my-application-id";
        String expectedEntityId = "my-entity-id";
        MessagesApiInboundEventType expectedEvent = MessagesApiInboundEventType.MO;

        String expectedRequest = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destination\": \"%s\",\n"
                        + "      \"content\": [\n"
                        + "        {\n"
                        + "          \"text\": \"%s\",\n"
                        + "          \"cleanText\": \"%s\",\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"receivedAt\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"platform\": {\n"
                        + "        \"applicationId\": \"%s\",\n"
                        + "        \"entityId\": \"%s\"\n"
                        + "      },\n"
                        + "      \"event\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedChannel,
                expectedSender,
                expectedDestination,
                expectedText,
                expectedCleanText,
                expectedType,
                expectedReceivedAt,
                expectedMessageId,
                expectedApplicationId,
                expectedEntityId,
                expectedEvent);

        OffsetDateTime expectedReceivedAtDateTime =
                OffsetDateTime.of(2020, 2, 6, 14, 18, 29, 797_000_000, ZoneOffset.ofHours(0));

        MessagesApiIncomingMessage messagesApiWebhookRequest =
                json.deserialize(expectedRequest, MessagesApiIncomingMessage.class);

        then(messagesApiWebhookRequest.getResults()).isNotNull();
        then(messagesApiWebhookRequest.getResults().size()).isEqualTo(1);
        then(messagesApiWebhookRequest.getResults().get(0).getClass()).isEqualTo(MessagesApiWebhookEvent.class);
        MessagesApiWebhookEvent messagesApiWebhookEvent =
                (MessagesApiWebhookEvent) messagesApiWebhookRequest.getResults().get(0);
        then(messagesApiWebhookEvent.getChannel()).isEqualTo(expectedChannel);
        then(messagesApiWebhookEvent.getSender()).isEqualTo(expectedSender);
        then(messagesApiWebhookEvent.getDestination()).isEqualTo(expectedDestination);
        then(messagesApiWebhookEvent.getContent()).isNotNull();
        then(messagesApiWebhookEvent.getContent().size()).isEqualTo(1);
        then(messagesApiWebhookEvent.getContent().get(0).getClass())
                .isEqualTo(MessagesApiWebhookEventTextContent.class);
        MessagesApiWebhookEventTextContent messageContent = (MessagesApiWebhookEventTextContent)
                messagesApiWebhookEvent.getContent().get(0);
        then(messageContent.getText()).isEqualTo(expectedText);
        then(messageContent.getCleanText()).isEqualTo(expectedCleanText);
        then(messagesApiWebhookEvent.getReceivedAt()).isEqualTo(expectedReceivedAtDateTime);
        then(messagesApiWebhookEvent.getMessageId()).isEqualTo(expectedMessageId);
        var messagePlatform = messagesApiWebhookEvent.getPlatform();
        then(messagePlatform.getApplicationId()).isEqualTo(expectedApplicationId);
        then(messagePlatform.getEntityId()).isEqualTo(expectedEntityId);
        then(messagesApiWebhookEvent.getEvent()).isEqualTo(expectedEvent);
    }
}
