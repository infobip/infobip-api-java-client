package com.infobip.api;

import com.infobip.model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import static org.assertj.core.api.BDDAssertions.then;

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
        OffsetDateTime givenSendAtDateTime = OffsetDateTime.of(
                LocalDateTime.of(2022, 12, 6, 13, 37, 15),
                ZoneOffset.ofHours(0)
        );

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"sendAt\": \"%s\"\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenSendAt
        );

        setUpSuccessGetRequest(
                BULKS,
                Map.of(),
                givenResponse
        );

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
        OffsetDateTime givenSendAtDateTime = OffsetDateTime.of(
                LocalDateTime.of(2022, 12, 6, 13, 37, 15, 0),
                ZoneOffset.ofHours(0)
        );

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"sendAt\": \"%s\"\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenSendAt
        );

        String expectedRequest = String.format("{\n" +
                                               "  \"sendAt\": \"%s\"\n" +
                                               "}\n",
                                               givenSendAt
        );

        setUpSuccessPutRequest(
                BULKS,
                Map.of("bulkId", givenBulkId),
                expectedRequest,
                givenResponse
        );

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
        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"status\": \"%s\"\n" +
                                             "}\n",
                                             givenBulkId,
                                             givenStatus
        );

        setUpSuccessGetRequest(
                BULKS_STATUS,
                Map.of(),
                givenResponse
        );

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
        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"status\": \"%s\"\n" +
                                             "}\n", givenBulkId, givenStatus);
        String expectedRequest = String.format("{\n" +
                                               "  \"status\": \"%s\"\n" +
                                               "}\n", givenStatus);

        setUpSuccessPutRequest(
                BULKS_STATUS,
                Map.of(),
                expectedRequest,
                givenResponse
        );

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
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId, givenTo, givenStatusGroupId, givenStatusGroupName, givenStatusId, givenStatusName,
                                             givenStatusDescription, givenMessageId
        );

        String expectedRequest = String.format("{\n" +
                                               "  \"text\": \"%s\",\n" +
                                               "  \"language\": \"%s\",\n" +
                                               "  \"voice\": {\n" +
                                               "    \"name\": \"%s\",\n" +
                                               "    \"gender\": \"%s\"\n" +
                                               "  },\n" +
                                               "  \"from\": \"%s\",\n" +
                                               "  \"to\": \"%s\"\n" +
                                               "}\n", givenText, givenLanguage, givenName, givenGender, givenFrom, givenTo);

        setUpSuccessPostRequest(
                SINGLE,
                expectedRequest,
                givenResponse
        );

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
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId, givenTo, givenStatusGroupId, givenStatusGroupName, givenStatusId, givenStatusName,
                                             givenStatusDescription, givenMessageId
        );

        String expectedRequest = String.format("{\n" +
                                               "  \"messages\": [\n" +
                                               "    {\n" +
                                               "      \"audioFileUrl\": \"%s\",\n" +
                                               "      \"from\": \"%s\",\n" +
                                               "      \"to\": [\n" +
                                               "        \"%s\",\n" +
                                               "        \"%s\"\n" +
                                               "      ]\n" +
                                               "    },\n" +
                                               "    {\n" +
                                               "      \"from\": \"%s\",\n" +
                                               "      \"to\": [\n" +
                                               "        \"%s\"\n" +
                                               "      ],\n" +
                                               "      \"language\": \"%s\",\n" +
                                               "      \"text\": \"%s\",\n" +
                                               "      \"voice\": {\n" +
                                               "        \"gender\": \"%s\",\n" +
                                               "        \"name\": \"%s\"\n" +
                                               "      }\n" +
                                               "    }\n" +
                                               "  ]\n" +
                                               "}\n",
                                               givenAudioFileUrl, givenReqFrom, givenReqTo1, givenReqTo2,
                                               givenReqFrom, givenTo1, givenLanguage, givenText, givenGender, givenName
        );

        setUpSuccessPostRequest(
                MULTIPLE,
                expectedRequest,
                givenResponse
        );

        VoiceApi api = new VoiceApi(getApiClient());

        CallsMultiBody request = new CallsMultiBody().messages(List.of(
                new CallsMultiMessage()
                        .audioFileUrl(givenAudioFileUrl)
                        .from(givenReqFrom)
                        .to(List.of(givenReqTo1, givenReqTo2)),
                new CallsMultiMessage()
                        .text(givenText)
                        .language(givenLanguage)
                        .voice(new CallsVoice().name(givenName).gender(givenGender))
                        .from(givenReqFrom)
                        .to(List.of(givenTo1))
        ));

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

    // randomly fails
    @Test
    @Disabled
    void shouldSendAdvancedVoiceTts() {
        String givenBulkId = "4fda521a-c680-470d-b134-83d468f7ac80";
        String givenTo = "41793026727";
        Integer givenStatusGroupId = 1;
        String givenStatusGroupName = "PENDING";
        Integer givenStatusId = 26;
        String givenStatusName = "PENDING_ACCEPTED";
        String givenStatusDescription = "Message accepted, pending for delivery.";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

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
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId, givenTo, givenStatusGroupId, givenStatusGroupName, givenStatusId, givenStatusName,
                                             givenStatusDescription, givenMessageId
        );

        String givenFrom = "41793026700";
        String givenDestinationTo1 = "41793026727";
        String givenDestinationMessageId1 = "MESSAGE-ID-123-xyz";
        String givenDestinationTo2 = "41793026731";
        String givenText = "Test Voice message.";
        String givenLanguage = "en";
        String givenName = "Joanna";
        String givenGender = "female";
        Double givenSpeechRate = 1D;
        String givenNotifyUrl = "https://www.example.com/voice/advanced";
        String givenNotifyContentType = "application/json";
        Integer givenValidityPeriod = 720;
        String givenSendAt = "2022-10-13T12:02:43.000+0000";
        OffsetDateTime givenSendAtDateTime = OffsetDateTime.of(
                LocalDateTime.of(2022, 10, 13, 12, 2, 43, 0),
                ZoneOffset.ofHours(0)
        );
        Boolean givenRecord = false;
        String givenRepeatDtmf = "123";
        Integer givenMaxDtmf = 1;
        Integer givenRingTimeout = 45;
        Integer givenDtmfTimeout = 10;
        Integer givenCallTimeout = 130;
        String givenEquals1 = "2";
        String givenTransferTo1 = "41793026700";
        Integer givenCallTransferMaxDuration1 = 45;
        String givenIf1 = "DTMF";
        String givenTransferTo2 = "41793026701";
        Integer givenCallTransferMaxDuration2 = 45;
        String givenIf2 = "anyDtmf";
        String givenCallbackData = "DLR callback data";
        Integer givenPause = 3;
        Integer givenMinPeriod = 1;
        Integer givenMaxPeriod = 5;
        Integer givenMaxCount = 5;
        Integer givenSpeed = 5;
        String givenTimeUnit = "minute";
        String givenMachineDetection = "continue";
        Integer givenFromHour = 6;
        Integer givenFromMinute = 0;
        Integer givenToHour = 15;
        Integer givenToMinute = 30;

        String expectedRequest = String.format("{\n" +
                                               "  \"bulkId\": \"%s\",\n" +
                                               "  \"messages\": [\n" +
                                               "    {\n" +
                                               "      \"from\": \"%s\",\n" +
                                               "      \"destinations\": [\n" +
                                               "        {\n" +
                                               "          \"to\": \"%s\",\n" +
                                               "          \"messageId\": \"%s\"\n" +
                                               "        },\n" +
                                               "        {\n" +
                                               "          \"to\": \"%s\"\n" +
                                               "        }\n" +
                                               "      ],\n" +
                                               "      \"text\": \"%s\",\n" +
                                               "      \"language\": \"%s\",\n" +
                                               "      \"voice\": {\n" +
                                               "        \"name\": \"%s\",\n" +
                                               "        \"gender\": \"%s\"\n" +
                                               "      },\n" +
                                               "      \"speechRate\": %f,\n" +
                                               "      \"notifyUrl\": \"%s\",\n" +
                                               "      \"notifyContentType\": \"%s\",\n" +
                                               "      \"validityPeriod\": %d,\n" +
                                               "      \"sendAt\": \"%s\",\n" +
                                               "      \"record\": %b,\n" +
                                               "      \"repeatDtmf\": \"%s\",\n" +
                                               "      \"maxDtmf\": %d,\n" +
                                               "      \"ringTimeout\": %d,\n" +
                                               "      \"dtmfTimeout\": %d,\n" +
                                               "      \"callTimeout\": %d,\n" +
                                               "      \"callTransfers\": [\n" +
                                               "        {\n" +
                                               "          \"equals\": \"%s\",\n" +
                                               "          \"transferTo\": \"%s\",\n" +
                                               "          \"callTransferMaxDuration\": %d,\n" +
                                               "          \"if\": \"%s\"\n" +
                                               "        },\n" +
                                               "        {\n" +
                                               "          \"transferTo\": \"%s\",\n" +
                                               "          \"callTransferMaxDuration\": %d,\n" +
                                               "          \"if\": \"%s\"\n" +
                                               "        }\n" +
                                               "      ],\n" +
                                               "      \"callbackData\": \"%s\",\n" +
                                               "      \"pause\": %d,\n" +
                                               "      \"retry\": {\n" +
                                               "        \"minPeriod\": %d,\n" +
                                               "        \"maxPeriod\": %d,\n" +
                                               "        \"maxCount\": %d\n" +
                                               "      },\n" +
                                               "      \"sendingSpeed\": {\n" +
                                               "        \"speed\": %d,\n" +
                                               "        \"timeUnit\": \"%s\"\n" +
                                               "      },\n" +
                                               "      \"machineDetection\": \"%s\",\n" +
                                               "      \"deliveryTimeWindow\": {\n" +
                                               "        \"from\": {\n" +
                                               "          \"hour\": %d,\n" +
                                               "          \"minute\": %d\n" +
                                               "        },\n" +
                                               "        \"to\": {\n" +
                                               "          \"hour\": %d,\n" +
                                               "          \"minute\": %d\n" +
                                               "        },\n" +
                                               "        \"days\": [\n" +
                                               "          \"MONDAY\",\n" +
                                               "          \"TUESDAY\",\n" +
                                               "          \"WEDNESDAY\",\n" +
                                               "          \"THURSDAY\",\n" +
                                               "          \"FRIDAY\",\n" +
                                               "          \"SATURDAY\",\n" +
                                               "          \"SUNDAY\"\n" +
                                               "        ]\n" +
                                               "      }\n" +
                                               "    }\n" +
                                               "  ]\n" +
                                               "}\n",
                                               givenBulkId,
                                               givenFrom, givenDestinationTo1, givenDestinationMessageId1, givenDestinationTo2,
                                               givenText,
                                               givenLanguage,
                                               givenName, givenGender,
                                               givenSpeechRate,
                                               givenNotifyUrl,
                                               givenNotifyContentType,
                                               givenValidityPeriod,
                                               givenSendAt,
                                               givenRecord,
                                               givenRepeatDtmf,
                                               givenMaxDtmf,
                                               givenRingTimeout,
                                               givenDtmfTimeout,
                                               givenCallTimeout,
                                               givenEquals1, givenTransferTo1, givenCallTransferMaxDuration1, givenIf1,
                                               givenTransferTo2, givenCallTransferMaxDuration2, givenIf2,
                                               givenCallbackData,
                                               givenPause,
                                               givenMinPeriod, givenMaxPeriod, givenMaxCount,
                                               givenSpeed, givenTimeUnit,
                                               givenMachineDetection,
                                               givenFromHour, givenFromMinute,
                                               givenToHour, givenToMinute
        );

        setUpSuccessPostRequest(
                ADVANCED,
                expectedRequest,
                givenResponse
        );

        VoiceApi api = new VoiceApi(getApiClient());

        CallsAdvancedBody req = new CallsAdvancedBody()
                .bulkId(givenBulkId)
                .messages(List.of(new CallsAdvancedMessage()
                        .from(givenFrom)
                        .destinations(List.of(
                                new CallsDestination().to(givenDestinationTo1).messageId(givenDestinationMessageId1),
                                new CallsDestination().to(givenDestinationTo2)
                        ))
                        .text(givenText)
                        .language(givenLanguage)
                        .voice(new CallsVoice().name(givenName).gender(givenGender))
                        .speechRate(givenSpeechRate)
                        .notifyUrl(givenNotifyUrl)
                        .notifyContentType(givenNotifyContentType)
                        .validityPeriod(givenValidityPeriod)
                        .sendAt(givenSendAtDateTime)
                        .record(givenRecord)
                        .repeatDtmf(givenRepeatDtmf)
                        .maxDtmf(givenMaxDtmf)
                        .ringTimeout(givenRingTimeout)
                        .dtmfTimeout(givenDtmfTimeout)
                        .callTimeout(givenCallTimeout)
                        .callTransfers(List.of(
                                new CallTransfer()
                                        .equals(givenEquals1)
                                        .transferTo(givenTransferTo1)
                                        .callTransferMaxDuration(givenCallTransferMaxDuration1)
                                        ._if(givenIf1),
                                new CallTransfer()
                                        .transferTo(givenTransferTo2)
                                        .callTransferMaxDuration(givenCallTransferMaxDuration2)
                                        ._if(givenIf2)
                        ))
                        .callbackData(givenCallbackData)
                        .pause(givenPause)
                        .retry(new CallsRetry()
                                .minPeriod(givenMinPeriod)
                                .maxPeriod(givenMaxPeriod)
                                .maxCount(givenMaxCount)
                        )
                        .sendingSpeed(new CallsSendingSpeed()
                                .speed(givenSpeed)
                                .timeUnit(givenTimeUnit)
                        )
                        .machineDetection(givenMachineDetection)
                        .deliveryTimeWindow(new CallsDeliveryTimeWindow()
                                .from(new CallsDeliveryTime().hour(givenFromHour).minute(givenFromMinute))
                                .to(new CallsDeliveryTime().hour(givenToHour).minute(givenToMinute))
                                .days(Set.of(
                                        CallsDeliveryDay.MONDAY,
                                        CallsDeliveryDay.TUESDAY,
                                        CallsDeliveryDay.WEDNESDAY,
                                        CallsDeliveryDay.THURSDAY,
                                        CallsDeliveryDay.FRIDAY,
                                        CallsDeliveryDay.SATURDAY,
                                        CallsDeliveryDay.SUNDAY
                                ))
                        )
                ));

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

        var call = api.sendAdvancedVoiceTts(req);
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

        String givenResponse = String.format("{\n" +
                                             "  \"voices\": [\n" +
                                             "    {\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"gender\": \"%s\"\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"gender\": \"%s\"\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"gender\": \"%s\"\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"gender\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenName1, givenGender1, givenName2, givenGender2, givenName3, givenGender3, givenName4, givenGender4
        );

        setUpSuccessGetRequest(
                VOICE_LANGUAGE.replace("{language}", givenLanguage),
                Map.of(),
                givenResponse
        );

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
