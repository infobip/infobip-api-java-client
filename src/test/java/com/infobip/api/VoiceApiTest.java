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

class VoiceApiTest extends ApiTest {

    private static final String BULKS = "/tts/3/bulks";
    private static final String BULKS_STATUS = "/tts/3/bulks/status";
    private static final String SINGLE = "/tts/3/single";
    private static final String MULTIPLE = "/tts/3/multi";
    private static final String ADVANCED = "/tts/3/advanced";
    private static final String VOICE_LANGUAGE = "/tts/3/voices/{language}";

    @Test
    void shouldGetSentBulks() {
        String givenBulkId = "string";
        String givenSendAt = "2022-12-06T13:37:15Z";
        OffsetDateTime givenSendAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2022, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n" + "  \"sendAt\": \"%s\"\n" + "}\n", givenBulkId, givenSendAt);

        setUpSuccessGetRequest(BULKS, Map.of(), givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsBulkResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getSendAt()).isEqualTo(givenSendAtDateTime);
        };

        var call = api.getSentBulks(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRescheduleSentBulk() {
        String givenBulkId = "123";
        String givenSendAt = "2022-12-06T13:37:15.000+0000";
        OffsetDateTime givenSendAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2022, 12, 6, 13, 37, 15, 0), ZoneOffset.ofHours(0));

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n" + "  \"sendAt\": \"%s\"\n" + "}\n", givenBulkId, givenSendAt);

        String expectedRequest = String.format("{\n" + "  \"sendAt\": \"%s\"\n" + "}\n", givenSendAt);

        setUpSuccessPutRequest(BULKS, Map.of("bulkId", givenBulkId), expectedRequest, givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        CallsBulkRequest request = new CallsBulkRequest().sendAt(givenSendAtDateTime);

        Consumer<CallsBulkResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getSendAt()).isEqualTo(givenSendAtDateTime);
        };

        var call = api.rescheduleSentBulk(givenBulkId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSentBulksStatus() {
        String givenBulkId = "string";
        CallsBulkStatus givenStatus = CallsBulkStatus.PENDING;
        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n" + "  \"status\": \"%s\"\n" + "}\n", givenBulkId, givenStatus);

        setUpSuccessGetRequest(BULKS_STATUS, Map.of(), givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsBulkStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.getSentBulksStatus(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldManageSentBulksStatus() {
        String givenBulkId = "string";
        CallsBulkStatus givenStatus = CallsBulkStatus.PENDING;
        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n" + "  \"status\": \"%s\"\n" + "}\n", givenBulkId, givenStatus);
        String expectedRequest = String.format("{\n" + "  \"status\": \"%s\"\n" + "}\n", givenStatus);

        setUpSuccessPutRequest(BULKS_STATUS, Map.of(), expectedRequest, givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());
        CallsUpdateStatusRequest request = new CallsUpdateStatusRequest().status(givenStatus);

        Consumer<CallsBulkStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.manageSentBulksStatus(givenBulkId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendSingleVoiceTts() {
        String givenBulkId = "4fda521a-c680-470d-b134-83d468f7ac80";
        String givenTo = "41793026727";
        Integer givenStatusGroupId = 1;
        String givenStatusGroupName = "PENDING";
        Integer givenStatusId = 26;
        String givenStatusName = "PENDING_ACCEPTED";
        String givenStatusDescription = "Message accepted, pending for delivery.";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String givenText = "Test Voice message.";
        String givenLanguage = "en";
        String givenName = "Joanna";
        String givenGender = "female";
        String givenFrom = "442032864231";

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
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
                        + "  ]\n"
                        + "}\n",
                givenBulkId,
                givenTo,
                givenStatusGroupId,
                givenStatusGroupName,
                givenStatusId,
                givenStatusName,
                givenStatusDescription,
                givenMessageId);

        String expectedRequest = String.format(
                "{\n" + "  \"text\": \"%s\",\n"
                        + "  \"language\": \"%s\",\n"
                        + "  \"voice\": {\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"gender\": \"%s\"\n"
                        + "  },\n"
                        + "  \"from\": \"%s\",\n"
                        + "  \"to\": \"%s\"\n"
                        + "}\n",
                givenText, givenLanguage, givenName, givenGender, givenFrom, givenTo);

        setUpSuccessPostRequest(SINGLE, expectedRequest, givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsVoiceResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message).isNotNull();
            then(message.getTo()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            then(message.getMessageId()).isEqualTo(givenMessageId);
        };

        CallsSingleBody request = new CallsSingleBody()
                .text(givenText)
                .language(givenLanguage)
                .voice(new CallsVoice().name(givenName).gender(givenGender))
                .from(givenFrom)
                .to(givenTo);

        var call = api.sendSingleVoiceTts(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendMultipleVoiceTts() {
        String givenBulkId = "4fda521a-c680-470d-b134-83d468f7ac80";
        String givenTo = "41793026727";
        Integer givenStatusGroupId = 1;
        String givenStatusGroupName = "PENDING";
        Integer givenStatusId = 26;
        String givenStatusName = "PENDING_ACCEPTED";
        String givenStatusDescription = "Message accepted, pending for delivery.";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String givenAudioFileUrl = "https://www.example.com/media.mp3";
        String givenReqFrom = "41793026700";
        String givenReqTo1 = "41793026727";
        String givenReqTo2 = "41793026731";
        String givenText = "Hello world!";
        String givenLanguage = "en";
        String givenName = "Joanna";
        String givenGender = "female";
        String givenTo1 = "41793026785";

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
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
                        + "  ]\n"
                        + "}\n",
                givenBulkId,
                givenTo,
                givenStatusGroupId,
                givenStatusGroupName,
                givenStatusId,
                givenStatusName,
                givenStatusDescription,
                givenMessageId);

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"audioFileUrl\": \"%s\",\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"to\": [\n"
                        + "        \"%s\",\n"
                        + "        \"%s\"\n"
                        + "      ]\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"to\": [\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"language\": \"%s\",\n"
                        + "      \"text\": \"%s\",\n"
                        + "      \"voice\": {\n"
                        + "        \"gender\": \"%s\",\n"
                        + "        \"name\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenAudioFileUrl,
                givenReqFrom,
                givenReqTo1,
                givenReqTo2,
                givenReqFrom,
                givenTo1,
                givenLanguage,
                givenText,
                givenGender,
                givenName);

        setUpSuccessPostRequest(MULTIPLE, expectedRequest, givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        CallsMultiBody request = new CallsMultiBody()
                .messages(List.of(
                        new CallsMultiMessage()
                                .audioFileUrl(givenAudioFileUrl)
                                .from(givenReqFrom)
                                .to(List.of(givenReqTo1, givenReqTo2)),
                        new CallsMultiMessage()
                                .text(givenText)
                                .language(givenLanguage)
                                .voice(new CallsVoice().name(givenName).gender(givenGender))
                                .from(givenReqFrom)
                                .to(List.of(givenTo1))));

        Consumer<CallsVoiceResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message).isNotNull();
            then(message.getTo()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            then(message.getMessageId()).isEqualTo(givenMessageId);
        };

        var call = api.sendMultipleVoiceTts(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetVoices() {
        String givenLanguage = "en";
        String givenName1 = "Benjamin";
        String givenGender1 = "male";
        String givenName2 = "Ivy";
        String givenGender2 = "female";
        String givenName3 = "Joanna";
        String givenGender3 = "female";
        String givenName4 = "Joey";
        String givenGender4 = "male";

        String givenResponse = String.format(
                "{\n" + "  \"voices\": [\n"
                        + "    {\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"gender\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"gender\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"gender\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"gender\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}\n",
                givenName1, givenGender1, givenName2, givenGender2, givenName3, givenGender3, givenName4, givenGender4);

        setUpSuccessGetRequest(VOICE_LANGUAGE.replace("{language}", givenLanguage), Map.of(), givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsGetVoicesResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getVoices()).isNotNull();
            var voices = response.getVoices();
            then(voices.size()).isEqualTo(4);
            var voice1 = voices.get(0);
            var voice2 = voices.get(1);
            var voice3 = voices.get(2);
            var voice4 = voices.get(3);
            then(voice1).isNotNull();
            then(voice1.getName()).isEqualTo(givenName1);
            then(voice1.getGender()).isEqualTo(givenGender1);
            then(voice2).isNotNull();
            then(voice2.getName()).isEqualTo(givenName2);
            then(voice2.getGender()).isEqualTo(givenGender2);
            then(voice3).isNotNull();
            then(voice3.getName()).isEqualTo(givenName3);
            then(voice3.getGender()).isEqualTo(givenGender3);
            then(voice4).isNotNull();
            then(voice4.getName()).isEqualTo(givenName4);
            then(voice4.getGender()).isEqualTo(givenGender4);
        };

        var call = api.getVoices(givenLanguage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
