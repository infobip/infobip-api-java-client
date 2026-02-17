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
    private static final String VOICE_REPORTS = "/voice/1/reports";
    private static final String VOICE_LOGS = "/tts/3/logs";
    private static final String IVR_FILES = "/voice/ivr/1/files";
    private static final String IVR_UPLOADS = "/voice/ivr/1/uploads";
    private static final String VOICE_SCENARIOS = "/voice/ivr/1/scenarios";
    private static final String VOICE_SCENARIO = "/voice/ivr/1/scenarios/{id}";
    private static final String LAUNCH_IVR_SCENARIO = "/voice/ivr/1/messages";

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

    @Test
    void shouldGetVoiceDeliveryReports() {
        String givenBulkId = "8c20f086-d82b-48cc-b2b3-3ca5f7aca9fb";
        String givenMessageId = "ff4804ef-6ab6-4abd-984d-ab3b1387e852";
        String givenFrom = "385333444";
        String givenTo = "385981178";
        String givenSentAt = "2018-06-25T13:38:14.730+0000";
        String givenMccMnc = "21901";
        String givenCallbackData = "DLR callback data";
        String givenFeature = "Voice-message";
        String givenStartTime = "2018-06-25T13:38:15.000+0000";
        String givenAnswerTime = "2018-06-25T13:38:25.000+0000";
        String givenEndTime = "2018-06-25T13:38:28.316+0000";
        int givenDuration = 10;
        int givenChargedDuration = 30;
        double givenFileDuration = 19.3;
        String givenDtmfCodes = "3, 9";
        String givenScenarioId = "333";
        String givenScenarioName = "Scenario name";
        String givenCollectedDtmfs = "{\"myFirstVar\":\"3\",\"mySecondVar\":\"9\"}";
        double givenPricePerSecond = 0.01;
        String givenCurrency = "EUR";
        int givenStatusGroupId = 3;
        String givenStatusGroupName = "DELIVERED";
        int givenStatusId = 5;
        String givenStatusName = "DELIVERED_TO_HANDSET";
        String givenStatusDescription = "Message delivered to handset";
        int givenErrorGroupId = 0;
        String givenErrorGroupName = "OK";
        int givenErrorId = 5000;
        String givenErrorName = "VOICE_ANSWERED";
        String givenErrorDescription = "Call answered by human";
        boolean givenErrorPermanent = true;

        String givenResponse = String.format(
                "{ \"results\": [\n" + "  {\n"
                        + "    \"bulkId\": \"%s\",\n"
                        + "    \"messageId\": \"%s\",\n"
                        + "    \"from\": \"%s\",\n"
                        + "    \"to\": \"%s\",\n"
                        + "    \"sentAt\": \"%s\",\n"
                        + "    \"mccMnc\": \"%s\",\n"
                        + "    \"callbackData\": \"%s\",\n"
                        + "    \"voiceCall\": {\n"
                        + "      \"feature\": \"%s\",\n"
                        + "      \"startTime\": \"%s\",\n"
                        + "      \"answerTime\": \"%s\",\n"
                        + "      \"endTime\": \"%s\",\n"
                        + "      \"duration\": %d,\n"
                        + "      \"chargedDuration\": %d,\n"
                        + "      \"fileDuration\": %.1f,\n"
                        + "      \"ivr\": {\n"
                        + "        \"scenarioId\": \"%s\",\n"
                        + "        \"scenarioName\": \"%s\"\n"
                        + "      }\n"
                        + "    },\n"
                        + "    \"price\": {\n"
                        + "      \"pricePerSecond\": %.2f,\n"
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
                        + "    }\n"
                        + "  }\n"
                        + "]}",
                givenBulkId,
                givenMessageId,
                givenFrom,
                givenTo,
                givenSentAt,
                givenMccMnc,
                givenCallbackData,
                givenFeature,
                givenStartTime,
                givenAnswerTime,
                givenEndTime,
                givenDuration,
                givenChargedDuration,
                givenFileDuration,
                givenScenarioId,
                givenScenarioName,
                givenPricePerSecond,
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
                givenErrorPermanent);

        setUpGetRequest(VOICE_REPORTS, Map.of(), givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsReportResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getSentAt()).isEqualTo(givenSentAt);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            then(result.getCallbackData()).isEqualTo(givenCallbackData);
            var voiceCall = result.getVoiceCall();
            then(voiceCall.getFeature()).isEqualTo(givenFeature);
            then(voiceCall.getStartTime()).isEqualTo(givenStartTime);
            then(voiceCall.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(voiceCall.getEndTime()).isEqualTo(givenEndTime);
            then(voiceCall.getDuration()).isEqualTo(givenDuration);
            then(voiceCall.getChargedDuration()).isEqualTo(givenChargedDuration);
            then(voiceCall.getFileDuration()).isEqualTo(givenFileDuration);
            var ivr = voiceCall.getIvr();
            then(ivr.getScenarioId()).isEqualTo(givenScenarioId);
            then(ivr.getScenarioName()).isEqualTo(givenScenarioName);
            then(ivr.getCollectedMappedDtmfs()).isNull();
            then(ivr.getSpokenInput()).isNull();
            then(ivr.getMatchedSpokenInput()).isNull();
            var price = result.getPrice();
            then(price.getPricePerSecond()).isEqualTo(givenPricePerSecond);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            var status = result.getStatus();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            var error = result.getError();
            then(error.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error.getId()).isEqualTo(givenErrorId);
            then(error.getName()).isEqualTo(givenErrorName);
            then(error.getDescription()).isEqualTo(givenErrorDescription);
            then(error.getPermanent()).isEqualTo(givenErrorPermanent);
        };

        var voice = api.getVoiceDeliveryReports();
        testSuccessfulCall(voice::execute, assertions);
        testSuccessfulAsyncCall(voice::executeAsync, assertions);
    }

    @Test
    void shouldGetVoiceLogs() {
        String givenBulkId = "06479ba3-5977-47f6-9346-fee0369bc76b";
        String givenMessageId = "1f21d8d7-f306-4f53-9f6e-eddfce9849ea";
        String givenTo = "41793026727";
        String givenFrom = "41793026700";
        String givenText = "Test voice message.";
        String givenSentAt = "2022-12-06T13:37:15Z";
        OffsetDateTime givenSentAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2022, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        String givenDoneAt = "2022-12-06T13:37:15Z";
        OffsetDateTime givenDoneAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2022, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        int givenDuration = 10;
        String givenMccMnc = "22801";
        double givenPricePerSecond = 0.01;
        String givenCurrency = "EUR";
        int givenStatusGroupId = 3;
        String givenStatusGroupName = "DELIVERED";
        int givenStatusId = 5;
        String givenStatusName = "DELIVERED_TO_HANDSET";
        String givenStatusDescription = "Message delivered to handset";
        int givenErrorGroupId = 0;
        String givenErrorGroupName = "OK";
        int givenErrorId = 5003;
        String givenErrorName = "EC_VOICE_NO_ANSWER";
        String givenErrorDescription = "User was notified, but did not answer call";
        boolean givenErrorPermanent = true;

        String givenResponse = String.format(
                "{ \"results\": [\n" + "  {\n"
                        + "    \"bulkId\": \"%s\",\n"
                        + "    \"messageId\": \"%s\",\n"
                        + "    \"to\": \"%s\",\n"
                        + "    \"from\": \"%s\",\n"
                        + "    \"text\": \"%s\",\n"
                        + "    \"sentAt\": \"%s\",\n"
                        + "    \"doneAt\": \"%s\",\n"
                        + "    \"duration\": %d,\n"
                        + "    \"mccMnc\": \"%s\",\n"
                        + "    \"price\": {\n"
                        + "      \"pricePerSecond\": %.2f,\n"
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
                        + "    }\n"
                        + "  }\n"
                        + "]}",
                givenBulkId,
                givenMessageId,
                givenTo,
                givenFrom,
                givenText,
                givenSentAt,
                givenDoneAt,
                givenDuration,
                givenMccMnc,
                givenPricePerSecond,
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
                givenErrorPermanent);

        setUpGetRequest(VOICE_LOGS, Map.of(), givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsLogsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getBulkId()).isEqualTo(givenBulkId);
            then(result.getMessageId()).isEqualTo(givenMessageId);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getText()).isEqualTo(givenText);
            then(result.getSentAt()).isEqualTo(givenSentAtDateTime);
            then(result.getDoneAt()).isEqualTo(givenDoneAtDateTime);
            then(result.getDuration()).isEqualTo(givenDuration);
            then(result.getMccMnc()).isEqualTo(givenMccMnc);
            var price = result.getPrice();
            then(price.getPricePerSecond()).isEqualTo(givenPricePerSecond);
            then(price.getCurrency()).isEqualTo(givenCurrency);
            var status = result.getStatus();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            var error = result.getError();
            then(error.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error.getId()).isEqualTo(givenErrorId);
            then(error.getName()).isEqualTo(givenErrorName);
            then(error.getDescription()).isEqualTo(givenErrorDescription);
            then(error.getPermanent()).isEqualTo(givenErrorPermanent);
        };

        var call = api.getSentVoiceLogs();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSearchVoiceIvrRecordedFiles() {
        String givenMessageId1 = "453e161a-fe4f-4f3c-80c0-ab520de9a969";
        String givenFrom1 = "442032864231";
        String givenTo1 = "38712345678";
        String givenScenarioId1 = "C9CE33CF130511D8E333C1260BABA309";
        String givenGroupId1 = "#/script/1";
        String givenUrl1 =
                "/voice/ivr/1/files/3C67336FA555A606C85FA9637906A6AB98436B7AFC65D857A416F6521D39F8F0E1D3D2469FF580D8968D3DD89A2DB561";

        String givenRecordedAt1 = "2022-12-06T13:37:15Z";
        OffsetDateTime givenRecordedAt1DateTime =
                OffsetDateTime.of(LocalDateTime.of(2022, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        String givenMessageId2 = "05b2859d-85c6-4068-9347-2e563b5c9cf4";
        String givenFrom2 = "442032864231";
        String givenTo2 = "38712345678";
        String givenScenarioId2 = "4A6177C9B92039306F1F091708851A2E";
        String givenGroupId2 = "#/script/1";
        String givenUrl2 =
                "/voice/ivr/1/files/305DE72BA11D81D1BAED75BFC46706761580BDEC2218C22628447FD3814E7913D3058E4ECBFD6F55C80E976235EEB111";
        String givenRecordedAt2 = "2023-12-06T13:37:15Z";
        OffsetDateTime givenRecordedAt2DateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        String givenResponse = String.format(
                "{ \"files\": [\n" + "  {\n"
                        + "    \"messageId\": \"%s\",\n"
                        + "    \"from\": \"%s\",\n"
                        + "    \"to\": \"%s\",\n"
                        + "    \"scenarioId\": \"%s\",\n"
                        + "    \"groupId\": \"%s\",\n"
                        + "    \"url\": \"%s\",\n"
                        + "    \"recordedAt\": \"%s\"\n"
                        + "  },\n"
                        + "  {\n"
                        + "    \"messageId\": \"%s\",\n"
                        + "    \"from\": \"%s\",\n"
                        + "    \"to\": \"%s\",\n"
                        + "    \"scenarioId\": \"%s\",\n"
                        + "    \"groupId\": \"%s\",\n"
                        + "    \"url\": \"%s\",\n"
                        + "    \"recordedAt\": \"%s\"\n"
                        + "  }\n"
                        + "]}",
                givenMessageId1,
                givenFrom1,
                givenTo1,
                givenScenarioId1,
                givenGroupId1,
                givenUrl1,
                givenRecordedAt1,
                givenMessageId2,
                givenFrom2,
                givenTo2,
                givenScenarioId2,
                givenGroupId2,
                givenUrl2,
                givenRecordedAt2);

        setUpGetRequest(IVR_FILES, Map.of(), givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsRecordedAudioFilesResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getFiles().size()).isEqualTo(2);
            var file1 = response.getFiles().get(0);
            then(file1.getMessageId()).isEqualTo(givenMessageId1);
            then(file1.getFrom()).isEqualTo(givenFrom1);
            then(file1.getTo()).isEqualTo(givenTo1);
            then(file1.getScenarioId()).isEqualTo(givenScenarioId1);
            then(file1.getGroupId()).isEqualTo(givenGroupId1);
            then(file1.getUrl()).isEqualTo(givenUrl1);
            then(file1.getRecordedAt()).isEqualTo(givenRecordedAt1DateTime);
            var file2 = response.getFiles().get(1);
            then(file2.getMessageId()).isEqualTo(givenMessageId2);
            then(file2.getFrom()).isEqualTo(givenFrom2);
            then(file2.getTo()).isEqualTo(givenTo2);
            then(file2.getScenarioId()).isEqualTo(givenScenarioId2);
            then(file2.getGroupId()).isEqualTo(givenGroupId2);
            then(file2.getUrl()).isEqualTo(givenUrl2);
            then(file2.getRecordedAt()).isEqualTo(givenRecordedAt2DateTime);
        };

        var call = api.searchVoiceIvrRecordedFiles();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetVoiceIvrScenario() {
        String givenId = "E83E787CF2613450157ADA3476171E3F";
        String givenName = "scenario";
        String givenDescription = "";
        String givenCreateTime = "2023-12-06T13:37:15Z";
        OffsetDateTime givenCreateTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        String givenUpdateTime = null;

        String script = "[{\"dial\":\"dial\",\"actionId\":1}]";

        String givenResponse = String.format(
                "[{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"createTime\": \"%s\",\n"
                        + "  \"updateTime\": %s,\n"
                        + "  \"script\": [{\"dial\": \"dial\", \"actionId\": 1}]\n"
                        + "}]",
                givenId, givenName, givenDescription, givenCreateTime, givenUpdateTime);

        setUpGetRequest("/voice/ivr/1/scenarios", Map.of(), givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<List<CallsSearchResponse>> assertions = (response) -> {
            then(response).isNotNull();
            then(response.get(0)).isNotNull();
            then(response.get(0).getId()).isEqualTo(givenId);
            then(response.get(0).getName()).isEqualTo(givenName);
            then(response.get(0).getDescription()).isEqualTo(givenDescription);
            then(response.get(0).getCreateTime()).isEqualTo(givenCreateTimeDateTime);
            then(response.get(0).getUpdateTime()).isNull();
            then(response.get(0).getScript()).isEqualTo(script);
        };

        var call = api.searchVoiceIvrScenarios();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateCallApiVoiceIvrScenario() {
        String script =
                "[{\"request\":\"https://example.com/api/12345\",\"options\":{\"method\":\"POST\",\"headers\":{\"content-type\":\"application/json\"},\"body\":{\"payload\":\"${to} finished the IVR.\"}}}]";
        String givenRequest = String.format("{\n" + "  \"name\": \"Call API\",\n"
                + "  \"description\": \"Perform a POST request to provided URL with headers and payload.\",\n"
                + "  \"script\": [ { \"request\": \"https://example.com/api/12345\", \"options\": { \"method\": \"POST\", \"headers\": { \"content-type\": \"application/json\" }, \"body\": { \"payload\": \"${to} finished the IVR.\" } } } ]\n"
                + "}");

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"E83E787CF2613450157ADA3476171E3F\",\n"
                        + "  \"name\": \"Call API\",\n"
                        + "  \"description\": \"Perform a POST request to provided URL with headers and payload.\",\n"
                        + "  \"script\": [ { \"request\": \"https://example.com/api/12345\", \"options\": { \"method\": \"POST\", \"headers\": { \"content-type\": \"application/json\" }, \"body\": { \"payload\": \"${to} finished the IVR.\" } } } ],\n"
                        + "  \"createTime\": \"2024-11-09T17:00:00.000+01:00\"\n"
                        + "}",
                script);

        setUpSuccessPostRequest(VOICE_SCENARIOS, givenRequest, givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        CallsUpdateScenarioRequest request = new CallsUpdateScenarioRequest()
                .name("Call API")
                .description("Perform a POST request to provided URL with headers and payload.")
                .script(script);

        Consumer<CallsUpdateScenarioResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("E83E787CF2613450157ADA3476171E3F");
            then(response.getName()).isEqualTo("Call API");
            then(response.getDescription())
                    .isEqualTo("Perform a POST request to provided URL with headers and payload.");
            then(response.getCreateTime()).isEqualTo("2024-11-09T17:00:00.000+01:00");
            then(response.getScript()).isNotNull();
            then(response.getScript()).isEqualTo(script);
        };

        var call = api.createAVoiceIvrScenario(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetVoiceIvrScenarioById() {
        String givenId = "E83E787CF2613450157ADA3476171E3F";
        String givenName = "scenario";
        String givenDescription = "";
        String givenCreateTime = "2023-12-06T13:37:15Z";
        OffsetDateTime givenCreateTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        String givenUpdateTime = null;
        String script = "[{\"dial\":\"dial\",\"actionId\":1}]";

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"createTime\": \"%s\",\n"
                        + "  \"updateTime\": %s,\n"
                        + "  \"script\": [{\"dial\": \"dial\", \"actionId\": 1}]\n"
                        + "}",
                givenId, givenName, givenDescription, givenCreateTime, givenUpdateTime);

        setUpGetRequest(VOICE_SCENARIO.replace("{id}", givenId), Map.of(), givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallsUpdateScenarioResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getDescription()).isEqualTo(givenDescription);
            then(response.getCreateTime()).isEqualTo(givenCreateTimeDateTime);
            then(response.getUpdateTime()).isNull();
            then(response.getScript()).isEqualTo(script);
        };

        var call = api.getAVoiceIvrScenario(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateVoiceIvrScenario() {
        String givenId = "E83E787CF2613450157ADA3476171E3F";
        String givenName = "scenario";
        String givenDescription = "";
        String givenCreateTime = "2023-12-06T13:37:15Z";
        OffsetDateTime givenCreateTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));
        String givenUpdateTime = null;
        String script = "[{\"dial\":\"dial\",\"actionId\":1}]";

        String givenRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n" + "  \"description\": \"%s\",\n"
                        + "  \"script\": [{\"dial\": \"dial\", \"actionId\": 1}]\n" + "}",
                givenName, givenDescription);

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"createTime\": \"%s\",\n"
                        + "  \"updateTime\": %s,\n"
                        + "  \"script\": [{\"dial\": \"dial\", \"actionId\": 1}]\n"
                        + "}",
                givenId, givenName, givenDescription, givenCreateTime, givenUpdateTime);

        setUpPostRequest(VOICE_SCENARIOS, givenRequest, givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        CallsUpdateScenarioRequest request = new CallsUpdateScenarioRequest()
                .name(givenName)
                .description(givenDescription)
                .script(script);

        Consumer<CallsUpdateScenarioResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getDescription()).isEqualTo(givenDescription);
            then(response.getCreateTime()).isEqualTo(givenCreateTimeDateTime);
            then(response.getUpdateTime()).isNull();
            then(response.getScript()).isEqualTo(script);
        };

        var call = api.createAVoiceIvrScenario(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateVoiceIvrScenario() {
        String givenId = "E83E787CF2613450157ADA3476171E3F";
        String givenName = "Call API";
        String givenDescription = "Perform a POST request to provided URL with headers and payload.";
        String givenCreateTime = "2023-12-06T13:37:15Z";
        OffsetDateTime givenCreateTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));
        String givenUpdateTime = null;
        String script =
                "[{\"request\":\"https://example.com/api/12345\",\"options\":{\"method\":\"POST\",\"headers\":{\"content-type\":\"application/json\"},\"body\":{\"payload\":\"${to} finished the IVR.\"}}}]";

        String givenRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n" + "  \"description\": \"%s\",\n"
                        + "  \"script\": [{\"request\":\"https://example.com/api/12345\",\"options\":{\"method\":\"POST\",\"headers\":{\"content-type\":\"application/json\"},\"body\":{\"payload\":\"${to} finished the IVR.\"}}}]\n"
                        + "}",
                givenName, givenDescription);

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"createTime\": \"%s\",\n"
                        + "  \"updateTime\": %s,\n"
                        + "  \"script\": [{\"request\":\"https://example.com/api/12345\",\"options\":{\"method\":\"POST\",\"headers\":{\"content-type\":\"application/json\"},\"body\":{\"payload\":\"${to} finished the IVR.\"}}}]\n"
                        + "}",
                givenId, givenName, givenDescription, givenCreateTime, givenUpdateTime);

        setUpPutRequest(VOICE_SCENARIO.replace("{id}", givenId), Map.of(), givenRequest, givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        CallsUpdateScenarioRequest request = new CallsUpdateScenarioRequest()
                .name(givenName)
                .description(givenDescription)
                .script(script);

        Consumer<CallsUpdateScenarioResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getDescription()).isEqualTo(givenDescription);
            then(response.getCreateTime()).isEqualTo(givenCreateTimeDateTime);
            then(response.getUpdateTime()).isNull();
            then(response.getScript()).isEqualTo(script);
        };

        var call = api.updateVoiceIvrScenario(givenId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteVoiceIvrScenario() {
        String givenId = "E83E787CF2613450157ADA3476171E3F";

        String givenResponse = "{}";

        setUpNoRequestBodyDeleteRequest(VOICE_SCENARIO.replace("{id}", givenId), Map.of(), givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<String> assertions = (response) -> {
            then(response).isNotNull();
            then(response).isEqualTo(givenResponse);
        };

        var call = api.deleteAVoiceIvrScenario(givenId);
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }

    @Test
    void shouldLaunchIvrScenario() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenScenarioId = "6298AA7707903A4ED680B436929681AD";
        String givenFrom = "41793026700";
        String givenTo1 = "41793026727";
        String givenTo2 = "41793026731";
        String givenNotifyUrl = "https://www.example.com/voice/advanced";
        String givenNotifyContentType = "application/json";
        String givenCallbackData = "DLR callback data";
        int givenValidityPeriod = 720;
        String givenSendAt = "2023-12-06T13:37:15.000+0000";
        OffsetDateTime givenSendAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 12, 6, 13, 37, 15), ZoneOffset.ofHours(0));

        int givenRetryMinPeriod = 1;
        int givenRetryMaxPeriod = 5;
        int givenRetryMaxCount = 5;
        int givenDeliveryFromHour = 6;
        int givenDeliveryFromMinute = 0;
        int givenDeliveryToHour = 15;
        int givenDeliveryToMinute = 30;
        DeliveryDay monday = DeliveryDay.MONDAY;
        List<DeliveryDay> givenDeliveryDays = List.of(monday);

        String givenRequest = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"scenarioId\": \"%s\",\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        { \"to\": \"%s\" },\n"
                        + "        { \"to\": \"%s\" }\n"
                        + "      ],\n"
                        + "      \"notifyUrl\": \"%s\",\n"
                        + "      \"notifyContentType\": \"%s\",\n"
                        + "      \"callbackData\": \"%s\",\n"
                        + "      \"validityPeriod\": %d,\n"
                        + "      \"sendAt\": \"%s\",\n"
                        + "      \"retry\": {\n"
                        + "        \"minPeriod\": %d,\n"
                        + "        \"maxPeriod\": %d,\n"
                        + "        \"maxCount\": %d\n"
                        + "      },\n"
                        + "      \"deliveryTimeWindow\": {\n"
                        + "        \"from\": { \"hour\": %d, \"minute\": %d },\n"
                        + "        \"to\": { \"hour\": %d, \"minute\": %d },\n"
                        + "        \"days\": [ \"%s\" ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenScenarioId,
                givenFrom,
                givenTo1,
                givenTo2,
                givenNotifyUrl,
                givenNotifyContentType,
                givenCallbackData,
                givenValidityPeriod,
                givenSendAt,
                givenRetryMinPeriod,
                givenRetryMaxPeriod,
                givenRetryMaxCount,
                givenDeliveryFromHour,
                givenDeliveryFromMinute,
                givenDeliveryToHour,
                givenDeliveryToMinute,
                monday);

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": 1,\n"
                        + "        \"groupName\": \"PENDING\",\n"
                        + "        \"id\": 26,\n"
                        + "        \"name\": \"PENDING_ACCEPTED\",\n"
                        + "        \"description\": \"Message accepted, pending for delivery.\"\n"
                        + "      },\n"
                        + "      \"messageId\": \"4242f196ba50-a356-2f91-831c4aa55f351ed2\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": 1,\n"
                        + "        \"groupName\": \"PENDING\",\n"
                        + "        \"id\": 26,\n"
                        + "        \"name\": \"PENDING_ACCEPTED\",\n"
                        + "        \"description\": \"Message accepted, pending for delivery.\"\n"
                        + "      },\n"
                        + "      \"messageId\": \"5f35f896ba50-a356-43a4-91cd81b85f8c689\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId, givenTo1, givenTo2);

        setUpPostRequest(LAUNCH_IVR_SCENARIO, givenRequest, givenResponse, 200);

        VoiceApi api = new VoiceApi(getApiClient());

        CallsLaunchScenarioRequest request = new CallsLaunchScenarioRequest()
                .bulkId(givenBulkId)
                .messages(List.of(new CallsIvrMessage()
                        .scenarioId(givenScenarioId)
                        .from(givenFrom)
                        .destinations(List.of(new CallsDestination().to(givenTo1), new CallsDestination().to(givenTo2)))
                        .notifyUrl(givenNotifyUrl)
                        .notifyContentType(givenNotifyContentType)
                        .callbackData(givenCallbackData)
                        .validityPeriod(givenValidityPeriod)
                        .sendAt(givenSendAtDateTime)
                        .retry(new CallsRetry()
                                .minPeriod(givenRetryMinPeriod)
                                .maxPeriod(givenRetryMaxPeriod)
                                .maxCount(givenRetryMaxCount))
                        .deliveryTimeWindow(new DeliveryTimeWindow()
                                .from(new DeliveryTime()
                                        .hour(givenDeliveryFromHour)
                                        .minute(givenDeliveryFromMinute))
                                .to(new DeliveryTime().hour(givenDeliveryToHour).minute(givenDeliveryToMinute))
                                .days(givenDeliveryDays))));

        Consumer<CallsVoiceResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(2);
            var message1 = response.getMessages().get(0);
            then(message1.getTo()).isEqualTo(givenTo1);
            then(message1.getStatus().getGroupId()).isEqualTo(1);
            then(message1.getStatus().getGroupName()).isEqualTo("PENDING");
            then(message1.getStatus().getId()).isEqualTo(26);
            then(message1.getStatus().getName()).isEqualTo("PENDING_ACCEPTED");
            then(message1.getStatus().getDescription()).isEqualTo("Message accepted, pending for delivery.");
            var message2 = response.getMessages().get(1);
            then(message2.getTo()).isEqualTo(givenTo2);
            then(message2.getStatus().getGroupId()).isEqualTo(1);
            then(message2.getStatus().getGroupName()).isEqualTo("PENDING");
            then(message2.getStatus().getId()).isEqualTo(26);
            then(message2.getStatus().getName()).isEqualTo("PENDING_ACCEPTED");
            then(message2.getStatus().getDescription()).isEqualTo("Message accepted, pending for delivery.");
        };

        var call = api.sendVoiceMessagesWithAnIvrScenario(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetIvrUploadedFiles() {
        var givenId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        var givenName = "Example file";
        var givenFileFormat = "WAV";
        var givenSize = 292190L;
        var givenDuration = 3L;
        var givenPagingPage = 0;
        var givenPagingSize = 20;
        var givenPagingTotalPages = 1;
        var givenPagingTotalResults = 1L;

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"fileFormat\": \"%s\",\n"
                        + "      \"size\": %d,\n"
                        + "      \"duration\": %d\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "  }\n"
                        + "}",
                givenId,
                givenName,
                givenFileFormat,
                givenSize,
                givenDuration,
                givenPagingPage,
                givenPagingSize,
                givenPagingTotalPages,
                givenPagingTotalResults);

        setUpSuccessGetRequest(IVR_UPLOADS, Map.of(), givenResponse);

        VoiceApi api = new VoiceApi(getApiClient());

        Consumer<CallRoutingRouteResponsePage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getPaging()).isNotNull();
            then(response.getPaging().getPage()).isEqualTo(givenPagingPage);
            then(response.getPaging().getSize()).isEqualTo(givenPagingSize);
            then(response.getPaging().getTotalPages()).isEqualTo(givenPagingTotalPages);
            then(response.getPaging().getTotalResults()).isEqualTo(givenPagingTotalResults);
        };

        var call = api.ivrUploadGetFiles();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
