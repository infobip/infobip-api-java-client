package com.infobip.api;

import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.entry;
import static org.assertj.core.api.BDDAssertions.then;

class CallsApiTest extends ApiTest {

    private static final String APPLICATION_TRANSFER = "/calls/1/calls/{callId}/application-transfer";
    private static final String APPLICATION_TRANSFER_ACCEPT = "/calls/1/calls/{callId}/application-transfer/{transferId}/accept";
    private static final String APPLICATION_TRANSFER_REJECT = "/calls/1/calls/{callId}/application-transfer/{transferId}/reject";
    private static final String CALLS = "/calls/1/calls";
    private static final String CALL = "/calls/1/calls/{callId}";
    private static final String CALLS_HISTORY = "/calls/1/calls/history";
    private static final String CALL_HISTORY = "/calls/1/calls/{callId}/history";
    private static final String CONNECT_CALLS = "/calls/1/connect";
    private static final String CONNECT_CALL = "/calls/1/calls/{callId}/connect";
    private static final String PRE_ANSWER_CALL = "/calls/1/calls/{callId}/pre-answer";
    private static final String ANSWER_CALL = "/calls/1/calls/{callId}/answer";
    private static final String HANGUP_CALL = "/calls/1/calls/{callId}/hangup";
    private static final String CALL_PLAY_FILE = "/calls/1/calls/{callId}/play";
    private static final String CALL_STOP_PLAYING_FILE = "/calls/1/calls/{callId}/stop-play";
    private static final String CALL_SAY_TEXT = "/calls/1/calls/{callId}/say";
    private static final String CALL_SEND_DTMF = "/calls/1/calls/{callId}/send-dtmf";
    private static final String CALL_CAPTURE_DTMF = "/calls/1/calls/{callId}/capture/dtmf";
    private static final String CALL_CAPTURE_SPEECH = "/calls/1/calls/{callId}/capture/speech";
    private static final String CALL_START_RECORDING = "/calls/1/calls/{callId}/start-recording";
    private static final String CALL_STOP_RECORDING = "/calls/1/calls/{callId}/stop-recording";
    private static final String START_MEDIA_STREAM = "/calls/1/calls/{callId}/start-media-stream";
    private static final String STOP_MEDIA_STREAM = "/calls/1/calls/{callId}/stop-media-stream";
    private static final String CONFERENCES = "/calls/1/conferences";
    private static final String CONFERENCE = "/calls/1/conferences/{conferenceId}";
    private static final String CONFERENCES_HISTORY = "/calls/1/conferences/history";
    private static final String CONFERENCE_HISTORY = "/calls/1/conferences/{conferenceId}/history";
    private static final String CONFERENCE_CALL = "/calls/1/conferences/{conferenceId}/call/{callId}";
    private static final String CONFERENCE_CALLS = "/calls/1/conferences/{conferenceId}/call";
    private static final String HANGUP_CONFERENCE = "/calls/1/conferences/{conferenceId}/hangup";
    private static final String CONFERENCE_PLAY_FILE = "/calls/1/conferences/{conferenceId}/play";
    private static final String CONFERENCE_SAY_TEXT = "/calls/1/conferences/{conferenceId}/say";
    private static final String CONFERENCE_STOP_PLAYING_FILE = "/calls/1/conferences/{conferenceId}/stop-play";
    private static final String CONFERENCE_START_RECORDING = "/calls/1/conferences/{conferenceId}/start-recording";
    private static final String CONFERENCE_STOP_RECORDING = "/calls/1/conferences/{conferenceId}/stop-recording";
    private static final String CONFERENCE_BROADCAST_WEBRTC_TEXT = "/calls/1/conferences/{conferenceId}/broadcast-webrtc-text";
    private static final String CALLS_FILES = "/calls/1/files";
    private static final String CALLS_FILE = "/calls/1/files/{fileId}";
    private static final String MEDIA_STREAM_CONFIGS = "/calls/1/media-stream-configs";
    private static final String MEDIA_STREAM_CONFIG = "/calls/1/media-stream-configs/{mediaStreamConfigId}";
    private static final String CALLS_RECORDINGS = "/calls/1/recordings/calls";
    private static final String CALL_RECORDINGS = "/calls/1/recordings/calls/{callId}";
    private static final String CONFERENCES_RECORDINGS = "/calls/1/recordings/conferences";
    private static final String CONFERENCE_RECORDINGS = "/calls/1/recordings/conferences/{conferenceId}";
    private static final String CALLS_RECORDINGS_FILES = "/calls/1/recordings/files/{fileId}";
    private static final String COMPOSE_CONFERENCE_RECORDING = "/calls/1/recordings/conferences/{conferenceId}/compose";
    private static final String BULKS = "/calls/1/bulks";
    private static final String BULK = "/calls/1/bulks/{bulkId}";
    private static final String RESCHEDULE_BULK = "/calls/1/bulks/{bulkId}/reschedule";
    private static final String PAUSE_BULK = "/calls/1/bulks/{bulkId}/pause";
    private static final String RESUME_BULK = "/calls/1/bulks/{bulkId}/resume";
    private static final String CANCEL_BULK = "/calls/1/bulks/{bulkId}/cancel";
    private static final String DIALOGS = "/calls/1/dialogs";
    private static final String DIALOGS_EXISTING_CALLS = "/calls/1/dialogs/parent-call/{parentCallId}/child-call/{childCallId}";
    private static final String DIALOGS_BROADCAST_TEXT = "/calls/1/dialogs/{dialogId}/broadcast-webrtc-text";
    private static final String SIP_TRUNKS = "/calls/1/sip-trunks";
    private static final String SIP_TRUNK = "/calls/1/sip-trunks/{sipTrunkId}";
    private static final String SIP_TRUNK_STATUS = "/calls/1/sip-trunks/{sipTrunkId}/status";
    private static final String SIP_TRUNK_SERVICE_ADDRESSES = "/calls/1/sip-trunks/service-addresses";
    private static final String SIP_TRUNK_SERVICE_ADDRESS = "/calls/1/sip-trunks/service-addresses/{sipTrunkServiceAddressId}";
    private static final String SIP_TRUNK_COUNTRIES = "/calls/1/sip-trunks/service-addresses/countries";
    private static final String SIP_TRUNK_REGIONS = "/calls/1/sip-trunks/service-addresses/countries/regions";

    @Test
    void shouldApplicationTransfer() {
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenDestinationApplicationId = "61c060db2675060027d8c7a6";
        Integer givenTimeout = 20;
        String givenCustomDataField = "custom";
        String givenCustomDataFieldValue = "data";
        Map<String, String> givenCustomData = Map.of(
            givenCustomDataField, givenCustomDataFieldValue
        );

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );
        String expectedRequest = String.format("{\n" +
                                                   "  \"destinationApplicationId\": \"%s\",\n" +
                                                   "  \"timeout\": %d,\n" +
                                                   "  \"customData\": {\n" +
                                                   "      \"%s\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenDestinationApplicationId,
                                               givenTimeout,
                                               givenCustomDataField,
                                               givenCustomDataFieldValue
        );

        setUpSuccessPostRequest(
            APPLICATION_TRANSFER.replace("{callId}", givenDestinationApplicationId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsApplicationTransferRequest request = new CallsApplicationTransferRequest()
            .destinationApplicationId(givenDestinationApplicationId)
            .timeout(givenTimeout)
            .customData(givenCustomData);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.applicationTransfer(givenDestinationApplicationId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldApplicationTransferAccept() {
        String givenCallId = "123";
        String givenTransferId = "1234";
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            APPLICATION_TRANSFER_ACCEPT
                .replace("{callId}", givenCallId)
                .replace("{transferId}", givenTransferId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.applicationTransferAccept(givenCallId, givenTransferId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldApplicationTransferReject() {
        String givenCallId = "123";
        String givenTransferId = "1234";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            APPLICATION_TRANSFER_REJECT
                .replace("{callId}", givenCallId)
                .replace("{transferId}", givenTransferId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.applicationTransferReject(givenCallId, givenTransferId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCalls() {
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenFrom = "44790123456";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        Boolean givenMuted = true;
        Boolean givenUserMuted = true;
        Boolean givenDeaf = true;
        Boolean givenCamera = true;
        Boolean givenScreenShare = true;
        String givenStartTime = "2022-05-01T14:25:45.125Z";
        String givenAnswerTime = "2022-05-01T14:25:55.123Z";
        String givenEndTime = "2022-05-01T14:27:40.235Z";
        String givenParentCallId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        CallsDetectionResult givenDetectionResult = CallsDetectionResult.HUMAN;
        Integer givenRingDuration = 3;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenKey1 = "value1";
        String givenKey2 = "value2";
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "        \"id\": \"%s\",\n" +
                                                 "        \"endpoint\": {\n" +
                                                 "          \"phoneNumber\": \"%s\",\n" +
                                                 "          \"type\": \"%s\"\n" +
                                                 "        },\n" +
                                                 "        \"from\": \"%s\",\n" +
                                                 "        \"to\": \"%s\",\n" +
                                                 "        \"direction\": \"%s\",\n" +
                                                 "        \"state\": \"%s\",\n" +
                                                 "        \"media\": {\n" +
                                                 "          \"audio\": {\n" +
                                                 "            \"muted\": %b,\n" +
                                                 "            \"userMuted\": %b,\n" +
                                                 "            \"deaf\": %b\n" +
                                                 "          },\n" +
                                                 "          \"video\": {\n" +
                                                 "            \"camera\": %b,\n" +
                                                 "            \"screenShare\": %b\n" +
                                                 "          }\n" +
                                                 "        },\n" +
                                                 "        \"startTime\": \"%s\",\n" +
                                                 "        \"answerTime\": \"%s\",\n" +
                                                 "        \"endTime\": \"%s\",\n" +
                                                 "        \"parentCallId\": \"%s\",\n" +
                                                 "        \"machineDetection\": {\n" +
                                                 "          \"detectionResult\": \"%s\"\n" +
                                                 "        },\n" +
                                                 "        \"ringDuration\": %d,\n" +
                                                 "        \"applicationId\": \"%s\",\n" +
                                                 "        \"conferenceId\": \"%s\",\n" +
                                                 "        \"customData\": {\n" +
                                                 "          \"key1\": \"%s\",\n" +
                                                 "          \"key2\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenUserMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenEndTime,
                                             givenParentCallId,
                                             givenDetectionResult,
                                             givenRingDuration,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenKey1,
                                             givenKey2,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CALLS,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getPaging()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getId()).isEqualTo(givenCallId);
            then(result.getEndpoint()).isNotNull();
            var callEndpoint = result.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getDirection()).isEqualTo(givenDirection);
            then(result.getState()).isEqualTo(givenCallState);
            var callMedia = result.getMedia();
            then(callMedia.getAudio()).isNotNull();
            var callAudio = callMedia.getAudio();
            then(callAudio.getMuted()).isEqualTo(givenMuted);
            then(callAudio.getUserMuted()).isEqualTo(givenUserMuted);
            then(callAudio.getDeaf()).isEqualTo(givenDeaf);
            then(callMedia.getVideo()).isNotNull();
            var callVideo = callMedia.getVideo();
            then(callVideo.getCamera()).isEqualTo(givenCamera);
            then(callVideo.getScreenShare()).isEqualTo(givenScreenShare);
            then(result.getStartTime()).isEqualTo(givenStartTime);
            then(result.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(result.getEndTime()).isEqualTo(givenEndTime);
            then(result.getParentCallId()).isEqualTo(givenParentCallId);
            then(result.getMachineDetection()).isNotNull();
            then(result.getMachineDetection().getDetectionResult()).isEqualTo(givenDetectionResult);
            then(result.getRingDuration()).isEqualTo(givenRingDuration);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
            then(result.getConferenceId()).isEqualTo(givenConferenceId);
            then(result.getCustomData()).isNotNull();
            then(result.getCustomData().get("key1")).isEqualTo(givenKey1);
            then(result.getCustomData().get("key2")).isEqualTo(givenKey2);
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getCalls();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateCall() {
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        String givenFrom = "44790123456";
        Integer givenConnectTimeout = 0;
        CallsRecordingType givenRecordingType = CallsRecordingType.AUDIO;
        Integer givenMaxDuration = 28800;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenParentCallId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";

        String expectedRequest = String.format("{\n" +
                                                   "    \"endpoint\": {\n" +
                                                   "      \"phoneNumber\": \"%s\",\n" +
                                                   "      \"type\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"from\": \"%s\",\n" +
                                                   "    \"connectTimeout\": %d,\n" +
                                                   "    \"recording\": {\n" +
                                                   "      \"recordingType\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"maxDuration\": %d,\n" +
                                                   "    \"applicationId\": \"%s\",\n" +
                                                   "    \"parentCallId\": \"%s\"\n" +
                                                   "}\n",
                                               givenPhoneNumber,
                                               givenType,
                                               givenFrom,
                                               givenConnectTimeout,
                                               givenRecordingType,
                                               givenMaxDuration,
                                               givenApplicationId,
                                               givenParentCallId
        );

        String givenCallId = "string";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        Boolean givenMuted = true;
        Boolean givenUserMuted = true;
        Boolean givenDeaf = true;
        Boolean givenCamera = true;
        Boolean givenScreenShare = true;
        String givenStartTime = "2022-05-01T14:25:45.125Z";
        String givenAnswerTime = "2022-05-01T14:25:55.123Z";
        String givenEndTime = "2022-05-01T14:27:40.235Z";
        CallsDetectionResult givenDetectionResult = CallsDetectionResult.HUMAN;
        Integer givenRingDuration = 3;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenKey1 = "value1";
        String givenKey2 = "value2";

        String givenResponse = String.format("{\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"phoneNumber\": \"%s\",\n" +
                                                 "      \"type\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"from\": \"%s\",\n" +
                                                 "    \"to\": \"%s\",\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"userMuted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"endTime\": \"%s\",\n" +
                                                 "    \"parentCallId\": \"%s\",\n" +
                                                 "    \"machineDetection\": {\n" +
                                                 "      \"detectionResult\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"conferenceId\": \"%s\",\n" +
                                                 "    \"customData\": {\n" +
                                                 "      \"key1\": \"%s\",\n" +
                                                 "      \"key2\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  }\n",
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenUserMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenEndTime,
                                             givenParentCallId,
                                             givenDetectionResult,
                                             givenRingDuration,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenKey1,
                                             givenKey2
        );

        setUpPostRequest(
            CALLS,
            expectedRequest,
            givenResponse,
            201
        );

        CallsApi api = new CallsApi(getApiClient());

        CallRequest request = new CallRequest()
            .endpoint(new CallsPhoneEndpoint()
                          .phoneNumber(givenPhoneNumber))
            .from(givenFrom)
            .connectTimeout(givenConnectTimeout)
            .recording(new CallRecordingRequest()
                           .recordingType(givenRecordingType))
            .maxDuration(givenMaxDuration)
            .applicationId(givenApplicationId)
            .parentCallId(givenParentCallId);

        Consumer<Call> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenCallId);
            then(response.getEndpoint()).isNotNull();
            var callEndpoint = response.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(response.getFrom()).isEqualTo(givenFrom);
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getDirection()).isEqualTo(givenDirection);
            then(response.getState()).isEqualTo(givenCallState);
            var callMedia = response.getMedia();
            then(callMedia.getAudio()).isNotNull();
            var callAudio = callMedia.getAudio();
            then(callAudio.getMuted()).isEqualTo(givenMuted);
            then(callAudio.getUserMuted()).isEqualTo(givenUserMuted);
            then(callAudio.getDeaf()).isEqualTo(givenDeaf);
            then(callMedia.getVideo()).isNotNull();
            var callVideo = callMedia.getVideo();
            then(callVideo.getCamera()).isEqualTo(givenCamera);
            then(callVideo.getScreenShare()).isEqualTo(givenScreenShare);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(response.getEndTime()).isEqualTo(givenEndTime);
            then(response.getParentCallId()).isEqualTo(givenParentCallId);
            then(response.getMachineDetection()).isNotNull();
            then(response.getMachineDetection().getDetectionResult()).isEqualTo(givenDetectionResult);
            then(response.getRingDuration()).isEqualTo(givenRingDuration);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getConferenceId()).isEqualTo(givenConferenceId);
            then(response.getCustomData()).isNotNull();
            then(response.getCustomData().get("key1")).isEqualTo(givenKey1);
            then(response.getCustomData().get("key2")).isEqualTo(givenKey2);
        };

        var call = api.createCall(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCall() {
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenFrom = "44790123456";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        Boolean givenMuted = true;
        Boolean givenUserMuted = true;
        Boolean givenDeaf = true;
        Boolean givenCamera = true;
        Boolean givenScreenShare = true;
        String givenStartTime = "2022-05-01T14:25:45.125Z";
        String givenAnswerTime = "2022-05-01T14:25:55.123Z";
        String givenEndTime = "2022-05-01T14:27:40.235Z";
        String givenParentCallId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        CallsDetectionResult givenDetectionResult = CallsDetectionResult.HUMAN;
        Integer givenRingDuration = 3;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenKey1 = "value1";
        String givenKey2 = "value2";

        String givenResponse = String.format("{\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"phoneNumber\": \"%s\",\n" +
                                                 "      \"type\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"from\": \"%s\",\n" +
                                                 "    \"to\": \"%s\",\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"userMuted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"endTime\": \"%s\",\n" +
                                                 "    \"parentCallId\": \"%s\",\n" +
                                                 "    \"machineDetection\": {\n" +
                                                 "      \"detectionResult\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"conferenceId\": \"%s\",\n" +
                                                 "    \"customData\": {\n" +
                                                 "      \"key1\": \"%s\",\n" +
                                                 "      \"key2\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  }\n",
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenUserMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenEndTime,
                                             givenParentCallId,
                                             givenDetectionResult,
                                             givenRingDuration,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenKey1,
                                             givenKey2
        );

        setUpSuccessGetRequest(
            CALL.replace("{callId}", givenCallId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<Call> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenCallId);
            then(response.getEndpoint()).isNotNull();
            var callEndpoint = response.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(response.getFrom()).isEqualTo(givenFrom);
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getDirection()).isEqualTo(givenDirection);
            then(response.getState()).isEqualTo(givenCallState);
            var callMedia = response.getMedia();
            then(callMedia.getAudio()).isNotNull();
            var callAudio = callMedia.getAudio();
            then(callAudio.getMuted()).isEqualTo(givenMuted);
            then(callAudio.getUserMuted()).isEqualTo(givenUserMuted);
            then(callAudio.getDeaf()).isEqualTo(givenDeaf);
            then(callMedia.getVideo()).isNotNull();
            var callVideo = callMedia.getVideo();
            then(callVideo.getCamera()).isEqualTo(givenCamera);
            then(callVideo.getScreenShare()).isEqualTo(givenScreenShare);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(response.getEndTime()).isEqualTo(givenEndTime);
            then(response.getParentCallId()).isEqualTo(givenParentCallId);
            then(response.getMachineDetection()).isNotNull();
            then(response.getMachineDetection().getDetectionResult()).isEqualTo(givenDetectionResult);
            then(response.getRingDuration()).isEqualTo(givenRingDuration);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getConferenceId()).isEqualTo(givenConferenceId);
            then(response.getCustomData()).isNotNull();
            then(response.getCustomData().get("key1")).isEqualTo(givenKey1);
            then(response.getCustomData().get("key2")).isEqualTo(givenKey2);
        };

        var call = api.getCall(givenCallId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallsHistory() {
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenFrom = "44790123456";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        Boolean givenMuted = true;
        Boolean givenUserMuted = true;
        Boolean givenDeaf = true;
        Boolean givenCamera = true;
        Boolean givenScreenShare = true;
        String givenStartTime = "2022-05-01T14:25:45.125Z";
        String givenAnswerTime = "2022-05-01T14:25:55.123Z";
        String givenEndTime = "2022-05-01T14:27:40.235Z";
        String givenParentCallId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        CallsDetectionResult givenDetectionResult = CallsDetectionResult.HUMAN;
        Long givenDuration = 5L;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        Boolean givenHasCameraVideo = false;
        Boolean givenHasScreenShareVideo = false;
        Integer givenErrorCodeId = 2;
        String givenErrorCodeName = "NORMAL_HANGUP";
        String givenErrorCodeDescription = "The call has ended with hangup initiated by caller, callee or API";
        String givenKey1 = "value1";
        String givenKey2 = "value2";
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "      {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"from\": \"%s\",\n" +
                                                 "          \"to\": \"%s\",\n" +
                                                 "          \"direction\": \"%s\",\n" +
                                                 "          \"state\": \"%s\",\n" +
                                                 "          \"media\": {\n" +
                                                 "            \"audio\": {\n" +
                                                 "              \"muted\": %b,\n" +
                                                 "              \"userMuted\": %b,\n" +
                                                 "              \"deaf\": %b\n" +
                                                 "            },\n" +
                                                 "            \"video\": {\n" +
                                                 "              \"camera\": %b,\n" +
                                                 "              \"screenShare\": %b\n" +
                                                 "            }\n" +
                                                 "          },\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"answerTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"parentCallId\": \"%s\",\n" +
                                                 "          \"machineDetection\": {\n" +
                                                 "            \"detectionResult\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"applicationIds\": [\n" +
                                                 "          \"%s\"\n" +
                                                 "          ],\n" +
                                                 "          \"conferenceIds\": [\n" +
                                                 "          \"%s\"\n" +
                                                 "          ],\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"hasCameraVideo\": %b,\n" +
                                                 "          \"hasScreenshareVideo\": %b,\n" +
                                                 "          \"errorCode\": {\n" +
                                                 "              \"id\": %d,\n" +
                                                 "              \"name\": \"%s\",\n" +
                                                 "              \"description\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"customData\": {\n" +
                                                 "            \"key1\": \"%s\",\n" +
                                                 "            \"key2\": \"%s\"\n" +
                                                 "          }\n" +
                                                 "        }\n" +
                                                 "    ],\n" +
                                                 "    \"paging\": {\n" +
                                                 "      \"page\": %d,\n" +
                                                 "      \"size\": %d,\n" +
                                                 "      \"totalPages\": %d,\n" +
                                                 "      \"totalResults\": %d\n" +
                                                 "    }\n" +
                                                 "}\n",
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenUserMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenEndTime,
                                             givenParentCallId,
                                             givenDetectionResult,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenDuration,
                                             givenHasCameraVideo,
                                             givenHasScreenShareVideo,
                                             givenErrorCodeId,
                                             givenErrorCodeName,
                                             givenErrorCodeDescription,
                                             givenKey1,
                                             givenKey2,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CALLS_HISTORY,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallLogPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getPaging()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getCallId()).isEqualTo(givenCallId);
            then(result.getEndpoint()).isNotNull();
            var callEndpoint = result.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(result.getFrom()).isEqualTo(givenFrom);
            then(result.getTo()).isEqualTo(givenTo);
            then(result.getDirection()).isEqualTo(givenDirection);
            then(result.getState()).isEqualTo(givenCallState);
            then(result.getStartTime()).isEqualTo(givenStartTime);
            then(result.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(result.getEndTime()).isEqualTo(givenEndTime);
            then(result.getParentCallId()).isEqualTo(givenParentCallId);
            then(result.getMachineDetection()).isNotNull();
            then(result.getMachineDetection().getDetectionResult()).isEqualTo(givenDetectionResult);
            then(result.getApplicationIds()).isNotNull();
            then(result.getApplicationIds().size()).isEqualTo(1);
            then(result.getApplicationIds().get(0)).isEqualTo(givenApplicationId);
            then(result.getConferenceIds()).isNotNull();
            then(result.getConferenceIds().size()).isEqualTo(1);
            then(result.getConferenceIds().get(0)).isEqualTo(givenConferenceId);
            then(result.getDuration()).isEqualTo(givenDuration);
            then(result.getHasCameraVideo()).isEqualTo(givenHasCameraVideo);
            then(result.getHasScreenshareVideo()).isEqualTo(givenHasScreenShareVideo);
            then(result.getErrorCode()).isNotNull();
            var errorCode = result.getErrorCode();
            then(errorCode.getId()).isEqualTo(givenErrorCodeId);
            then(errorCode.getName()).isEqualTo(givenErrorCodeName);
            then(errorCode.getDescription()).isEqualTo(givenErrorCodeDescription);
            then(result.getCustomData()).isNotNull();
            then(result.getCustomData().get("key1")).isEqualTo(givenKey1);
            then(result.getCustomData().get("key2")).isEqualTo(givenKey2);
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getCallsHistory();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallHistory() {
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenFrom = "44790123456";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        Boolean givenMuted = true;
        Boolean givenUserMuted = true;
        Boolean givenDeaf = true;
        Boolean givenCamera = true;
        Boolean givenScreenShare = true;
        String givenStartTime = "2022-05-01T14:25:45.125Z";
        String givenAnswerTime = "2022-05-01T14:25:55.123Z";
        String givenEndTime = "2022-05-01T14:27:40.235Z";
        String givenParentCallId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        CallsDetectionResult givenDetectionResult = CallsDetectionResult.HUMAN;
        Long givenDuration = 5L;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        Boolean givenHasCameraVideo = false;
        Boolean givenHasScreenShareVideo = false;
        Integer givenErrorCodeId = 2;
        String givenErrorCodeName = "NORMAL_HANGUP";
        String givenErrorCodeDescription = "The call has ended with hangup initiated by caller, callee or API";
        String givenKey1 = "value1";
        String givenKey2 = "value2";
        String givenDialogId = "dialogId";
        String givenSender = "sender";

        String givenResponse = String.format("{\n" +
                                                 "  \"callId\": \"%s\",\n" +
                                                 "  \"endpoint\": {\n" +
                                                 "    \"phoneNumber\": \"%s\",\n" +
                                                 "    \"type\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"from\": \"%s\",\n" +
                                                 "  \"to\": \"%s\",\n" +
                                                 "  \"direction\": \"%s\",\n" +
                                                 "  \"state\": \"%s\",\n" +
                                                 "  \"media\": {\n" +
                                                 "    \"audio\": {\n" +
                                                 "      \"muted\": %b,\n" +
                                                 "      \"userMuted\": %b,\n" +
                                                 "      \"deaf\": %b\n" +
                                                 "    },\n" +
                                                 "    \"video\": {\n" +
                                                 "      \"camera\": %b,\n" +
                                                 "      \"screenShare\": %b\n" +
                                                 "    }\n" +
                                                 "  },\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"answerTime\": \"%s\",\n" +
                                                 "  \"endTime\": \"%s\",\n" +
                                                 "  \"parentCallId\": \"%s\",\n" +
                                                 "  \"machineDetection\": {\n" +
                                                 "    \"detectionResult\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"applicationIds\": [\n" +
                                                 "  \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"conferenceIds\": [\n" +
                                                 "  \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"duration\": %d,\n" +
                                                 "  \"hasCameraVideo\": %b,\n" +
                                                 "  \"hasScreenshareVideo\": %b,\n" +
                                                 "  \"errorCode\": {\n" +
                                                 "      \"id\": %d,\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"description\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"customData\": {\n" +
                                                 "    \"key1\": \"%s\",\n" +
                                                 "    \"key2\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"dialogId\": \"%s\",\n" +
                                                 "  \"sender\": \"%s\"\n" +
                                                 "}\n",
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenUserMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenEndTime,
                                             givenParentCallId,
                                             givenDetectionResult,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenDuration,
                                             givenHasCameraVideo,
                                             givenHasScreenShareVideo,
                                             givenErrorCodeId,
                                             givenErrorCodeName,
                                             givenErrorCodeDescription,
                                             givenKey1,
                                             givenKey2,
                                             givenDialogId,
                                             givenSender
        );

        setUpSuccessGetRequest(
            CALL_HISTORY.replace("{callId}", givenCallId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallLog> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getCallId()).isEqualTo(givenCallId);
            then(response.getEndpoint()).isNotNull();
            var callEndpoint = response.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(response.getFrom()).isEqualTo(givenFrom);
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getDirection()).isEqualTo(givenDirection);
            then(response.getState()).isEqualTo(givenCallState);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(response.getEndTime()).isEqualTo(givenEndTime);
            then(response.getParentCallId()).isEqualTo(givenParentCallId);
            then(response.getMachineDetection()).isNotNull();
            then(response.getMachineDetection().getDetectionResult()).isEqualTo(givenDetectionResult);
            then(response.getApplicationIds()).isNotNull();
            then(response.getApplicationIds().size()).isEqualTo(1);
            then(response.getApplicationIds().get(0)).isEqualTo(givenApplicationId);
            then(response.getConferenceIds()).isNotNull();
            then(response.getConferenceIds().size()).isEqualTo(1);
            then(response.getConferenceIds().get(0)).isEqualTo(givenConferenceId);
            then(response.getDuration()).isEqualTo(givenDuration);
            then(response.getHasCameraVideo()).isEqualTo(givenHasCameraVideo);
            then(response.getHasScreenshareVideo()).isEqualTo(givenHasScreenShareVideo);
            then(response.getErrorCode()).isNotNull();
            var errorCode = response.getErrorCode();
            then(errorCode.getId()).isEqualTo(givenErrorCodeId);
            then(errorCode.getName()).isEqualTo(givenErrorCodeName);
            then(errorCode.getDescription()).isEqualTo(givenErrorCodeDescription);
            then(response.getCustomData()).isNotNull();
            then(response.getCustomData().get("key1")).isEqualTo(givenKey1);
            then(response.getCustomData().get("key2")).isEqualTo(givenKey2);
        };

        var call = api.getCallHistory(givenCallId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConnectCalls() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId1 = "d6d6058c-5077-49f9-a030-2fc40e8ca195";
        String givenCallId2 = "6539fcb4-4b2a-4ac9-a43a-d60807af29b0";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.0Z";
        Boolean givenAudioMuted = true;
        Boolean givenAudioUserDeaf = true;
        Boolean givenVideoCamera = true;
        Boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"participants\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"applicationId\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId1,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenCallId2,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"callIds\": [\n" +
                                                   "    \"%s\",\n" +
                                                   "    \"%s\"\n" +
                                                   "  ]\n" +
                                                   "}\n",
                                               givenCallId1,
                                               givenCallId2
        );

        setUpSuccessPostRequest(
            CONNECT_CALLS,
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsConnectRequest request = new CallsConnectRequest()
            .callIds(Set.of(givenCallId1, givenCallId2));

        Consumer<CallsConference> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getParticipants()).isNotNull();
            var participants = response.getParticipants();
            then(participants.size()).isEqualTo(2);

            var participant = participants.get(0);
            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);

            var participant2 = participants.get(0);
            then(participant2.getEndpoint()).isNotNull();
            var endpoint2 = participant2.getEndpoint();
            then(endpoint2.getType()).isEqualTo(givenType);
            then(participant2.getState()).isEqualTo(givenState);
            then(participant2.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant2.getMedia()).isNotNull();
            var media2 = participant2.getMedia();
            then(media2.getAudio()).isNotNull();
            var audio2 = media2.getAudio();
            then(audio2.getMuted()).isEqualTo(givenAudioMuted);
            then(audio2.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media2.getVideo()).isNotNull();
            var video2 = media2.getVideo();
            then(video2.getCamera()).isEqualTo(givenVideoCamera);
            then(video2.getScreenShare()).isEqualTo(givenVideoScreenShare);

            then(response.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.connectCalls(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConnectWithNewCall() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.0Z";
        OffsetDateTime givenJoinTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 5, 1, 14, 25, 45, 0),
            ZoneOffset.ofHours(0));
        boolean givenAudioMuted = true;
        boolean givenAudioUserMuted = true;
        boolean givenAudioUserDeaf = true;
        boolean givenVideoCamera = true;
        boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenFrom = "44790123456";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        Boolean givenMuted = true;
        Boolean givenUserMuted = true;
        Boolean givenDeaf = true;
        Boolean givenCamera = true;
        Boolean givenScreenShare = true;
        String givenStartTime = "2022-05-01T14:25:45.0+0000";
        String givenAnswerTime = "2022-05-01T14:25:55.0+0000";
        String givenEndTime = "2022-05-01T14:27:40.0+0000";
        OffsetDateTime givenStartTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 5, 1, 14, 25, 45, 0),
            ZoneOffset.ofHours(0));
        OffsetDateTime givenAnswerTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 5, 1, 14, 25, 55, 0),
            ZoneOffset.ofHours(0));
        OffsetDateTime givenEndTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 5, 1, 14, 27, 40, 0),
            ZoneOffset.ofHours(0));
        String givenParentCallId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        CallsDetectionResult givenDetectionResult = CallsDetectionResult.HUMAN;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenKey1 = "value1";
        String givenKey2 = "value2";

        String givenResponse = String.format("{\n" +
                                                 "  \"conference\": {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"participants\": [\n" +
                                                 "        {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"state\": \"%s\",\n" +
                                                 "          \"joinTime\": \"%s\",\n" +
                                                 "          \"media\": {\n" +
                                                 "            \"audio\": {\n" +
                                                 "              \"muted\": %b,\n" +
                                                 "              \"userMuted\": %b,\n" +
                                                 "              \"deaf\": %b\n" +
                                                 "            },\n" +
                                                 "            \"video\": {\n" +
                                                 "              \"camera\": %b,\n" +
                                                 "              \"screenShare\": %b\n" +
                                                 "            }\n" +
                                                 "          }\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"applicationId\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "  \"call\": {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"from\": \"%s\",\n" +
                                                 "      \"to\": \"%s\",\n" +
                                                 "      \"direction\": \"%s\",\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"userMuted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      },\n" +
                                                 "      \"startTime\": \"%s\",\n" +
                                                 "      \"answerTime\": \"%s\",\n" +
                                                 "      \"endTime\": \"%s\",\n" +
                                                 "      \"parentCallId\": \"%s\",\n" +
                                                 "      \"machineDetection\": {\n" +
                                                 "        \"detectionResult\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"applicationId\": \"%s\",\n" +
                                                 "      \"conferenceId\": \"%s\",\n" +
                                                 "      \"customData\": {\n" +
                                                 "        \"key1\": \"%s\",\n" +
                                                 "        \"key2\": \"%s\"\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenUserMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenEndTime,
                                             givenParentCallId,
                                             givenDetectionResult,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenKey1,
                                             givenKey2
        );

        Boolean givenConnectOnEarlyMedia = false;

        String expectedRequest = String.format("{\n" +
                                                   "  \"callRequest\": {\n" +
                                                   "    \"endpoint\": {\n" +
                                                   "      \"phoneNumber\": \"%s\",\n" +
                                                   "      \"type\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"from\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"connectOnEarlyMedia\": %b\n" +
                                                   "}\n",
                                               givenPhoneNumber,
                                               givenType,
                                               givenFrom,
                                               givenConnectOnEarlyMedia
        );

        setUpSuccessPostRequest(
            CONNECT_CALL.replace("{callId}", givenId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsConnectWithNewCallRequest request = new CallsConnectWithNewCallRequest()
            .callRequest(new CallsActionCallRequest()
                             .endpoint(new CallsPhoneEndpoint().phoneNumber(givenPhoneNumber))
                             .from(givenFrom)
            )
            .connectOnEarlyMedia(givenConnectOnEarlyMedia);

        Consumer<CallsConferenceAndCall> assertions = response -> {
            then(response).isNotNull();

            var conference = response.getConference();
            then(conference).isNotNull();
            then(conference.getId()).isEqualTo(givenId);
            then(conference.getName()).isEqualTo(givenName);

            var participants = conference.getParticipants();
            then(participants).isNotNull();
            then(participants).hasSize(1);

            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);
            then(participant.getEndpoint()).isNotNull();

            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTimeDateTime);
            then(participant.getMedia()).isNotNull();

            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getUserMuted()).isEqualTo(givenAudioUserMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(conference.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getCall()).isNotNull();

            var call = response.getCall();
            var callEndpoint = call.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(call.getFrom()).isEqualTo(givenFrom);
            then(call.getTo()).isEqualTo(givenTo);
            then(call.getDirection()).isEqualTo(givenDirection);
            then(call.getState()).isEqualTo(givenCallState);

            var callMedia = call.getMedia();
            then(callMedia.getAudio()).isNotNull();
            var callAudio = callMedia.getAudio();
            then(callAudio.getMuted()).isEqualTo(givenMuted);
            then(callAudio.getUserMuted()).isEqualTo(givenUserMuted);
            then(callAudio.getDeaf()).isEqualTo(givenDeaf);
            then(callMedia.getVideo()).isNotNull();
            var callVideo = callMedia.getVideo();
            then(callVideo.getCamera()).isEqualTo(givenCamera);
            then(callVideo.getScreenShare()).isEqualTo(givenScreenShare);

            then(call.getStartTime()).isEqualTo(givenStartTimeDateTime);
            then(call.getAnswerTime()).isEqualTo(givenAnswerTimeDateTime);
            then(call.getEndTime()).isEqualTo(givenEndTimeDateTime);
            then(call.getParentCallId()).isEqualTo(givenParentCallId);

            then(call.getMachineDetection())
                .isNotNull()
                .extracting(CallsMachineDetectionProperties::getDetectionResult)
                .isEqualTo(givenDetectionResult);

            then(call.getApplicationId()).isEqualTo(givenApplicationId);
            then(call.getConferenceId()).isEqualTo(givenConferenceId);
            then(call.getCustomData())
                .isNotNull()
                .containsExactly(
                    entry("key1", givenKey1),
                    entry("key2", givenKey2)
                );
        };

        var call = api.connectWithNewCall(givenId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPreAnswerCall() {
        String givenCallId = "123";
        Map<String, String> givenCustomData = Map.of("custom", "data");
        CallsPreAnswerRequest givenCallPreRequest = new CallsPreAnswerRequest().customData(givenCustomData);
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            PRE_ANSWER_CALL.replace("{callId}", givenCallId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.preAnswerCall(givenCallId, givenCallPreRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAnswerCall() {
        String givenCallId = "123";
        CallsRecordingType givenRecordingType = CallsRecordingType.AUDIO;
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;
        String givenCustomDataField = "custom";
        String givenCustomDataFieldValue = "data";
        Map<String, String> givenCustomData = Map.of(
            givenCustomDataField, givenCustomDataFieldValue
        );

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"recording\": {\n" +
                                                   "    \"recordingType\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"customData\": {\n" +
                                                   "    \"%s\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenRecordingType,
                                               givenCustomDataField,
                                               givenCustomDataFieldValue
        );

        setUpSuccessPostRequest(
            ANSWER_CALL.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsAnswerRequest request = new CallsAnswerRequest()
            .recording(
                new CallRecordingRequest()
                    .recordingType(givenRecordingType)
            )
            .customData(givenCustomData);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.answerCall(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHangupCall() {
        String givenErrorCode = "NORMAL_HANGUP";

        String givenCallId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "44790123456";
        String givenType = "PHONE";
        String givenFrom = "44790123456";
        String givenTo = "44790123456";
        CallDirection givenDirection = CallDirection.OUTBOUND;
        CallState givenState = CallState.CALLING;
        Boolean givenAudioMuted = false;
        Boolean givenAudioDeaf = false;
        Boolean givenVideoCamera = false;
        Boolean givenVideoScreenShare = false;
        String givenStartTime = "2022-01-01T00:00:00.100Z";
        String givenAnswerTime = "2022-01-01T00:00:00.100Z";
        Integer givenRingDuration = 2;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenKey2 = "value2";
        String givenKey1 = "value1";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"endpoint\": {\n" +
                                                 "    \"phoneNumber\": \"%s\",\n" +
                                                 "    \"type\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"from\": \"%s\",\n" +
                                                 "  \"to\": \"%s\",\n" +
                                                 "  \"direction\": \"%s\",\n" +
                                                 "  \"state\": \"%s\",\n" +
                                                 "  \"media\": {\n" +
                                                 "    \"audio\": {\n" +
                                                 "      \"muted\": %b,\n" +
                                                 "      \"deaf\": %b\n" +
                                                 "    },\n" +
                                                 "    \"video\": {\n" +
                                                 "      \"camera\": %b,\n" +
                                                 "      \"screenShare\": %b\n" +
                                                 "    }\n" +
                                                 "  },\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"answerTime\": \"%s\",\n" +
                                                 "  \"ringDuration\": %d,\n" +
                                                 "  \"applicationId\": \"%s\",\n" +
                                                 "  \"conferenceId\": \"%s\",\n" +
                                                 "  \"customData\": {\n" +
                                                 "    \"key2\": \"%s\",\n" +
                                                 "    \"key1\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenState,
                                             givenAudioMuted,
                                             givenAudioDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenStartTime,
                                             givenAnswerTime,
                                             givenRingDuration,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenKey2,
                                             givenKey1
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"errorCode\": \"%s\"\n" +
                                                   "}\n",
                                               givenErrorCode
        );

        setUpSuccessPostRequest(
            HANGUP_CALL.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsHangupRequest request = new CallsHangupRequest().errorCode(CallsErrorCode.NORMAL_HANGUP);

        Consumer<Call> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenCallId);
            then(response.getEndpoint()).isNotNull();
            then(response.getFrom()).isEqualTo(givenFrom);
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getDirection()).isEqualTo(givenDirection);
            then(response.getState()).isEqualTo(givenState);
            then(response.getMedia()).isNotNull();
            var media = response.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioDeaf);
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getAnswerTime()).isEqualTo(givenAnswerTime);
            then(response.getRingDuration()).isEqualTo(givenRingDuration);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getConferenceId()).isEqualTo(givenConferenceId);
            then(response.getCustomData()).isNotNull();
            var customData = response.getCustomData();
            then(customData.get("key2")).isEqualTo(givenKey2);
            then(customData.get("key1")).isEqualTo(givenKey1);
        };

        var call = api.hangupCall(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallPlayFile() {
        String givenCallId = "123";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        Integer givenLoopCount = 0;
        CallsPlayContentType givenContentType = CallsPlayContentType.FILE;
        String givenFileId = "100";

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"loopCount\": %d,\n" +
                                                   "  \"content\": {\n" +
                                                   "    \"fileId\" : \"%s\",\n" +
                                                   "    \"type\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenLoopCount,
                                               givenFileId,
                                               givenContentType
        );

        setUpSuccessPostRequest(
            CALL_PLAY_FILE.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsPlayRequest request = new CallsPlayRequest()
            .loopCount(givenLoopCount)
            .content(new CallsFilePlayContent()
                         .fileId(givenFileId)
            );

        Consumer<CallsActionResponse> assertions = response -> then(response)
            .isNotNull()
            .extracting(CallsActionResponse::getStatus)
            .isEqualTo(givenStatus);

        var call = api.callPlayFile(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallStopPlayingFile() {
        String givenCallId = "123";
        Map<String, String> givenCustomData = Map.of("custom", "data");
        CallsStopPlayRequest givenCallsStopPlayRequest = new CallsStopPlayRequest().customData(givenCustomData);

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            CALL_STOP_PLAYING_FILE.replace("{callId}", givenCallId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callStopPlayingFile(givenCallId, givenCallsStopPlayRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallSayText() {
        String givenCallId = "123";

        String givenText = "string";
        CallsLanguage givenLanguage = CallsLanguage.AR;
        Double givenSpeechRate = 0.5;
        Integer givenLoopCount = 0;
        CallsGender givenCallsGender = CallsGender.FEMALE;
        CallVoice givenVoiceName = CallVoice.HODA;

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"text\": \"%s\",\n" +
                                                   "  \"language\": \"%s\",\n" +
                                                   "  \"speechRate\": %f,\n" +
                                                   "  \"loopCount\": %d,\n" +
                                                   "  \"preferences\": {\n" +
                                                   "    \"voiceGender\": \"%s\",\n" +
                                                   "    \"voiceName\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenText,
                                               givenLanguage,
                                               givenSpeechRate,
                                               givenLoopCount,
                                               givenCallsGender,
                                               givenVoiceName
        );

        setUpSuccessPostRequest(
            CALL_SAY_TEXT.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsSayRequest request = new CallsSayRequest()
            .text(givenText)
            .language(givenLanguage)
            .speechRate(givenSpeechRate)
            .loopCount(givenLoopCount)
            .preferences(new CallsVoicePreferences()
                             .voiceGender(givenCallsGender)
                             .voiceName(givenVoiceName)
            );

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callSayText(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallSendDtmf() {
        String givenCallId = "123";

        String givenDtmf = "3";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"dtmf\": \"%s\"\n" +
                                                   "}\n",
                                               givenDtmf
        );

        setUpSuccessPostRequest(
            CALL_SEND_DTMF.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsDtmfSendRequest request = new CallsDtmfSendRequest().dtmf(givenDtmf);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callSendDtmf(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallCaptureDtmf() {
        String givenCallId = "123";

        Integer givenMaxLength = 0;
        Integer givenTimeout = 0;
        String givenTerminator = "string";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"maxLength\": %d,\n" +
                                                   "  \"timeout\": %d,\n" +
                                                   "  \"terminator\": \"%s\"\n" +
                                                   "}\n",
                                               givenMaxLength,
                                               givenTimeout,
                                               givenTerminator
        );

        setUpSuccessPostRequest(
            CALL_CAPTURE_DTMF.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsDtmfCaptureRequest request = new CallsDtmfCaptureRequest()
            .maxLength(givenMaxLength)
            .timeout(givenTimeout)
            .terminator(givenTerminator);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callCaptureDtmf(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCaptureSpeech() {
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;
        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}",
                                             givenStatus
        );

        CallsLanguage expectedLanguage = CallsLanguage.EN_GB;
        Integer expectedTimeout = 30;
        Integer expectedMaxSilence = 3;
        String expectedKeyPhrase1 = "phrase";
        String expectedKeyPhrase2 = "word";
        String expectedRequest = String.format("{\n" +
                                                   "  \"language\": \"%s\",\n" +
                                                   "  \"timeout\": %d,\n" +
                                                   "  \"maxSilence\": %d,\n" +
                                                   "  \"keyPhrases\": [\n" +
                                                   "    \"%s\",\n" +
                                                   "    \"%s\"\n" +
                                                   "  ]\n" +
                                                   "}",
                                               expectedLanguage,
                                               expectedTimeout,
                                               expectedMaxSilence,
                                               expectedKeyPhrase1,
                                               expectedKeyPhrase2
        );

        String givenCallId = "123";

        setUpSuccessPostRequest(
            CALL_CAPTURE_SPEECH.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsSpeechCaptureRequest = new CallsSpeechCaptureRequest()
            .language(expectedLanguage)
            .timeout(expectedTimeout)
            .maxSilence(expectedMaxSilence)
            .addKeyPhrasesItem(expectedKeyPhrase1)
            .addKeyPhrasesItem(expectedKeyPhrase2);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callCaptureSpeech(givenCallId, callsSpeechCaptureRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallStartRecording() {
        String givenCallId = "123";
        String givenFilePrefix = "filePrefix";
        String givenCustomDataField = "custom";
        String givenCustomDataFieldValue = "data";
        Map<String, String> givenCustomData = Map.of(
            givenCustomDataField, givenCustomDataFieldValue
        );

        CallsRecordingType givenRecordingType = CallsRecordingType.AUDIO;

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"recording\": {\n" +
                                                   "    \"recordingType\": \"%s\",\n" +
                                                   "    \"customData\": {\n" +
                                                   "        \"%s\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"filePrefix\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenRecordingType,
                                               givenCustomDataField,
                                               givenCustomDataFieldValue,
                                               givenFilePrefix
        );

        setUpSuccessPostRequest(
            CALL_START_RECORDING.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsRecordingStartRequest request = new CallsRecordingStartRequest()
            .recording(new CallsRecordingRequest()
                           .recordingType(givenRecordingType)
                           .customData(givenCustomData)
                           .filePrefix(givenFilePrefix)
            );

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callStartRecording(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCallStopRecording() {
        String givenCallId = "123";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            CALL_STOP_RECORDING.replace("{callId}", givenCallId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.callStopRecording(givenCallId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldStartMediaStream() {
        String givenCallId = "123";

        String givenMediaStreamConfigId = "string";
        Boolean givenReplaceMedia = true;

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"mediaStream\": {\n" +
                                                   "    \"audioProperties\": {\n" +
                                                   "      \"mediaStreamConfigId\": \"%s\",\n" +
                                                   "      \"replaceMedia\": %b\n" +
                                                   "    }\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenMediaStreamConfigId,
                                               givenReplaceMedia
        );

        setUpSuccessPostRequest(
            START_MEDIA_STREAM.replace("{callId}", givenCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsStartMediaStreamRequest request = new CallsStartMediaStreamRequest()
            .mediaStream(new CallsMediaStream()
                             .audioProperties(new CallsMediaStreamAudioProperties()
                                                  .mediaStreamConfigId(givenMediaStreamConfigId)
                                                  .replaceMedia(givenReplaceMedia)
                             )
            );

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.startMediaStream(givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldStopMediaStream() {
        String givenCallId = "123";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            STOP_MEDIA_STREAM.replace("{callId}", givenCallId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.stopMediaStream(givenCallId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetConferences() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.134Z";
        Boolean givenAudioMuted = true;
        Boolean givenAudioUserMuted = true;
        Boolean givenAudioUserDeaf = true;
        Boolean givenVideoCamera = true;
        Boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"participants\": [\n" +
                                                 "        {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"state\": \"%s\",\n" +
                                                 "          \"joinTime\": \"%s\",\n" +
                                                 "          \"media\": {\n" +
                                                 "            \"audio\": {\n" +
                                                 "              \"muted\": %b,\n" +
                                                 "              \"userMuted\": %b,\n" +
                                                 "              \"deaf\": %b\n" +
                                                 "            },\n" +
                                                 "            \"video\": {\n" +
                                                 "              \"camera\": %b,\n" +
                                                 "              \"screenShare\": %b\n" +
                                                 "            }\n" +
                                                 "          }\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"applicationId\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CONFERENCES,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConferencePage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(1);
            var result = results.get(0);
            then(result.getId()).isEqualTo(givenId);
            then(result.getName()).isEqualTo(givenName);
            then(result.getParticipants()).isNotNull();
            var participants = result.getParticipants();
            then(participants.size()).isEqualTo(1);
            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);
            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getUserMuted()).isEqualTo(givenAudioUserMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getConferences();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateConference() {
        CallsRecordingType givenRecordingType = CallsRecordingType.AUDIO;
        Boolean givenCompositionEnabled = false;
        Integer givenMaxDuration = 28800;

        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.134Z";
        Boolean givenAudioMuted = true;
        Boolean givenAudioUserMuted = true;
        Boolean givenAudioUserDeaf = true;
        Boolean givenVideoCamera = true;
        Boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenCustomDataField = "custom";
        String givenCustomDataFieldValue = "data";
        Map<String, String> givenCustomData = Map.of(
            givenCustomDataField, givenCustomDataFieldValue
        );
        String givenFilePrefix = "filePrefix";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"participants\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"userMuted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"applicationId\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"name\": \"%s\",\n" +
                                                   "  \"recording\": {\n" +
                                                   "    \"recordingType\": \"%s\",\n" +
                                                   "    \"conferenceComposition\": {\n" +
                                                   "      \"enabled\": %b\n" +
                                                   "    },\n" +
                                                   "    \"customData\": {\n" +
                                                   "      \"%s\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"filePrefix\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"maxDuration\": %d,\n" +
                                                   "  \"applicationId\": \"%s\"\n" +
                                                   "}\n",
                                               givenName,
                                               givenRecordingType,
                                               givenCompositionEnabled,
                                               givenCustomDataField,
                                               givenCustomDataFieldValue,
                                               givenFilePrefix,
                                               givenMaxDuration,
                                               givenApplicationId
        );

        setUpPostRequest(
            CONFERENCES,
            expectedRequest,
            givenResponse,
            201
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsConferenceRequest request = new CallsConferenceRequest()
            .name(givenName)
            .recording(new CallsConferenceRecordingRequest()
                           .recordingType(givenRecordingType)
                           .conferenceComposition(new CallsConferenceComposition().enabled(givenCompositionEnabled))
                           .customData(givenCustomData)
                           .filePrefix(givenFilePrefix)
            )
            .maxDuration(givenMaxDuration)
            .applicationId(givenApplicationId);

        Consumer<CallsConference> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getParticipants()).isNotNull();
            var participants = response.getParticipants();
            then(participants.size()).isEqualTo(1);
            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);
            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getUserMuted()).isEqualTo(givenAudioUserMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.createConference(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetConference() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.134Z";
        Boolean givenAudioMuted = true;
        Boolean givenAudioUserMuted = true;
        Boolean givenAudioUserDeaf = true;
        Boolean givenVideoCamera = true;
        Boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"participants\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"userMuted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"applicationId\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId
        );

        setUpSuccessGetRequest(
            CONFERENCE.replace("{conferenceId}", givenId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConference> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getParticipants()).isNotNull();
            var participants = response.getParticipants();
            then(participants.size()).isEqualTo(1);
            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);
            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getUserMuted()).isEqualTo(givenAudioUserMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.getConference(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetConferencesHistory() {
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenStartTime = "2022-05-01T14:25:55.000Z";
        String givenEndTime = "2022-05-01T14:26:55.000Z";
        Long givenDuration = 55L;
        String givenJoinTime = "2022-12-07T14:01:29Z";
        String givenLeaveTime = "2022-12-07T14:01:29Z";
        String givenCallId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenFileName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenFilesDuration = 3L;
        String givenFilesStartTime = "2022-05-01T14:25:45.134Z";
        String givenFilesEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;
        Integer givenErrorCodeId = 10000;
        String givenErrorCodeName = "NORMAL_HANGUP";
        String givenErrorCodeDescription = "The call has ended with hangup initiated by caller, callee or API";

        String givenResponse = String.format("{\n" +
                                                 "    \"results\": [\n" +
                                                 "        {\n" +
                                                 "          \"conferenceId\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"applicationId\": \"%s\",\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"sessions\": [\n" +
                                                 "            {\n" +
                                                 "              \"callId\": \"%s\",\n" +
                                                 "              \"joinTime\": \"%s\",\n" +
                                                 "              \"leaveTime\": \"%s\"\n" +
                                                 "            }\n" +
                                                 "          ],\n" +
                                                 "          \"recording\": {\n" +
                                                 "                \"composedFiles\": [\n" +
                                                 "                    {\n" +
                                                 "                      \"id\": \"%s\",\n" +
                                                 "                      \"name\": \"%s\",\n" +
                                                 "                      \"fileFormat\": \"%s\",\n" +
                                                 "                      \"size\": %d,\n" +
                                                 "                      \"creationMethod\": \"%s\",\n" +
                                                 "                      \"creationTime\": \"%s\",\n" +
                                                 "                      \"expirationTime\": \"%s\",\n" +
                                                 "                      \"duration\": %d,\n" +
                                                 "                      \"startTime\": \"%s\",\n" +
                                                 "                      \"endTime\": \"%s\"\n" +
                                                 "                    }\n" +
                                                 "                ],\n" +
                                                 "                \"callRecordings\": [\n" +
                                                 "                    {\n" +
                                                 "                      \"callId\": \"%s\",\n" +
                                                 "                      \"endpoint\": {\n" +
                                                 "                        \"phoneNumber\": \"%s\",\n" +
                                                 "                        \"type\": \"%s\"\n" +
                                                 "                      },\n" +
                                                 "                      \"direction\": \"%s\",\n" +
                                                 "                      \"files\": [\n" +
                                                 "                        {\n" +
                                                 "                          \"id\": \"%s\",\n" +
                                                 "                          \"name\": \"%s\",\n" +
                                                 "                          \"fileFormat\": \"%s\",\n" +
                                                 "                          \"size\": %d,\n" +
                                                 "                          \"creationMethod\": \"%s\",\n" +
                                                 "                          \"creationTime\": \"%s\",\n" +
                                                 "                          \"expirationTime\": \"%s\",\n" +
                                                 "                          \"duration\": %d,\n" +
                                                 "                          \"startTime\": \"%s\",\n" +
                                                 "                          \"endTime\": \"%s\",\n" +
                                                 "                          \"location\": \"%s\"\n" +
                                                 "                        }\n" +
                                                 "                      ],\n" +
                                                 "                      \"status\": \"%s\",\n" +
                                                 "                      \"reason\": \"%s\"\n" +
                                                 "                    }\n" +
                                                 "                ]\n" +
                                                 "            },\n" +
                                                 "            \"errorCode\": {\n" +
                                                 "              \"id\": %d,\n" +
                                                 "              \"name\": \"%s\",\n" +
                                                 "              \"description\": \"%s\"\n" +
                                                 "            }\n" +
                                                 "        }\n" +
                                                 "    ],\n" +
                                                 "    \"paging\": {\n" +
                                                 "      \"page\": %d,\n" +
                                                 "      \"size\": %d,\n" +
                                                 "      \"totalPages\": %d,\n" +
                                                 "      \"totalResults\": %d\n" +
                                                 "    }\n" +
                                                 "}\n",
                                             givenConferenceId,
                                             givenName,
                                             givenApplicationId,
                                             givenStartTime,
                                             givenEndTime,
                                             givenDuration,
                                             givenCallId,
                                             givenJoinTime,
                                             givenLeaveTime,
                                             givenFileId,
                                             givenFileName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenFilesDuration,
                                             givenFilesStartTime,
                                             givenFilesEndTime,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenFileName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenFilesDuration,
                                             givenFilesStartTime,
                                             givenFilesEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason,
                                             givenErrorCodeId,
                                             givenErrorCodeName,
                                             givenErrorCodeDescription,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CONFERENCES_HISTORY,
            Map.of(
                "name", givenName,
                "callId", givenCallId,
                "applicationId", givenApplicationId
            ),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConferenceLogPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(1);
            var result = results.get(0);
            then(result.getConferenceId()).isEqualTo(givenConferenceId);
            then(result.getName()).isEqualTo(givenName);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
            then(result.getStartTime()).isEqualTo(givenStartTime);
            then(result.getEndTime()).isEqualTo(givenEndTime);
            then(result.getDuration()).isEqualTo(givenDuration);
            var sessions = result.getSessions();
            then(sessions.get(0)).isNotNull();
            var session = sessions.get(0);
            then(session.getCallId()).isEqualTo(givenCallId);
            then(session.getJoinTime()).isEqualTo(givenJoinTime);
            then(session.getLeaveTime()).isEqualTo(givenLeaveTime);
            var recording = result.getRecording();
            then(recording.getComposedFiles()).isNotNull();
            var files = recording.getComposedFiles();
            then(files.size()).isEqualTo(1);
            var file = files.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenFileName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(file.getDuration()).isEqualTo(givenFilesDuration);
            then(file.getStartTime()).isEqualTo(givenFilesStartTime);
            then(file.getEndTime()).isEqualTo(givenFilesEndTime);
            then(recording.getCallRecordings()).isNotNull();
            var callRecordings = recording.getCallRecordings();
            then(callRecordings.size()).isEqualTo(1);
            var callRecording = callRecordings.get(0);
            then(callRecording.getCallId()).isEqualTo(givenCallId);
            then(callRecording.getEndpoint()).isNotNull();
            var endpoint = callRecording.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(callRecording.getDirection()).isEqualTo(givenDirection);
            then(callRecording.getFiles()).isNotNull();
            var callRecordingFiles = callRecording.getFiles();
            then(callRecordingFiles.size()).isEqualTo(1);
            var callRecordingFile = callRecordingFiles.get(0);
            then(callRecordingFile.getId()).isEqualTo(givenFileId);
            then(callRecordingFile.getName()).isEqualTo(givenFileName);
            then(callRecordingFile.getFileFormat()).isEqualTo(givenFileFormat);
            then(callRecordingFile.getSize()).isEqualTo(givenSize);
            then(callRecordingFile.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(callRecordingFile.getCreationTime()).isEqualTo(givenCreationTime);
            then(callRecordingFile.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(callRecordingFile.getDuration()).isEqualTo(givenFilesDuration);
            then(callRecordingFile.getStartTime()).isEqualTo(givenFilesStartTime);
            then(callRecordingFile.getEndTime()).isEqualTo(givenFilesEndTime);
            then(callRecordingFile.getLocation()).isEqualTo(givenLocation);
            then(callRecording.getStatus()).isEqualTo(givenStatus);
            then(callRecording.getReason()).isEqualTo(givenReason);
            var errorCode = result.getErrorCode();
            then(errorCode).isNotNull();
            then(errorCode.getId()).isEqualTo(givenErrorCodeId);
            then(errorCode.getName()).isEqualTo(givenErrorCodeName);
            then(errorCode.getDescription()).isEqualTo(givenErrorCodeDescription);
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getConferencesHistory()
                      .name(givenName)
                      .callId(givenCallId)
                      .applicationId(givenApplicationId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetConferenceHistory() {
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenStartTime = "2022-05-01T14:25:55.123Z";
        String givenEndTime = "2022-05-01T14:25:55.123Z";
        Long givenDuration = 55L;
        String givenJoinTime = "2022-12-07T14:01:29Z";
        String givenLeaveTime = "2022-12-07T14:01:29Z";
        String givenCallId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenFileName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenFilesDuration = 3L;
        String givenFilesStartTime = "2022-05-01T14:25:45.134Z";
        String givenFilesEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";
        Integer givenErrorCodeId = 10000;
        String givenErrorCodeName = "NORMAL_HANGUP";
        String givenErrorCodeDescription = "The call has ended with hangup initiated by caller, callee or API";

        String givenResponse = String.format("{\n" +
                                                 "  \"conferenceId\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"applicationId\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"endTime\": \"%s\",\n" +
                                                 "  \"duration\": %d,\n" +
                                                 "  \"sessions\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"leaveTime\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"recording\": {\n" +
                                                 "    \"composedFiles\": [\n" +
                                                 "            {\n" +
                                                 "              \"id\": \"%s\",\n" +
                                                 "              \"name\": \"%s\",\n" +
                                                 "              \"fileFormat\": \"%s\",\n" +
                                                 "              \"size\": %d,\n" +
                                                 "              \"creationTime\": \"%s\",\n" +
                                                 "              \"duration\": %d,\n" +
                                                 "              \"startTime\": \"%s\",\n" +
                                                 "              \"endTime\": \"%s\"\n" +
                                                 "            }\n" +
                                                 "          ],\n" +
                                                 "    \"callRecordings\": [\n" +
                                                 "        {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"direction\": \"%s\",\n" +
                                                 "          \"files\": [\n" +
                                                 "            {\n" +
                                                 "              \"id\": \"%s\",\n" +
                                                 "              \"name\": \"%s\",\n" +
                                                 "              \"fileFormat\": \"%s\",\n" +
                                                 "              \"size\": %d,\n" +
                                                 "              \"creationMethod\": \"%s\",\n" +
                                                 "              \"creationTime\": \"%s\",\n" +
                                                 "              \"expirationTime\": \"%s\",\n" +
                                                 "              \"duration\": %d,\n" +
                                                 "              \"startTime\": \"%s\",\n" +
                                                 "              \"endTime\": \"%s\",\n" +
                                                 "              \"location\": \"%s\"\n" +
                                                 "            }\n" +
                                                 "          ],\n" +
                                                 "          \"status\": \"%s\",\n" +
                                                 "          \"reason\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ]\n" +
                                                 "  },\n" +
                                                 "  \"errorCode\": {\n" +
                                                 "    \"id\": %d,\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"description\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenConferenceId,
                                             givenName,
                                             givenApplicationId,
                                             givenStartTime,
                                             givenEndTime,
                                             givenDuration,

                                             givenCallId,
                                             givenJoinTime,
                                             givenLeaveTime,

                                             givenFileId,
                                             givenFileName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationTime,
                                             givenFilesDuration,
                                             givenFilesStartTime,
                                             givenFilesEndTime,

                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenFileName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenFilesDuration,
                                             givenFilesStartTime,
                                             givenFilesEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason,
                                             givenErrorCodeId,
                                             givenErrorCodeName,
                                             givenErrorCodeDescription
        );

        setUpSuccessGetRequest(
            CONFERENCE_HISTORY.replace("{conferenceId}", givenConferenceId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConferenceLog> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getConferenceId()).isEqualTo(givenConferenceId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getEndTime()).isEqualTo(givenEndTime);
            then(response.getDuration()).isEqualTo(givenDuration);

            var sessions = response.getSessions();
            then(sessions.get(0)).isNotNull();

            var session = sessions.get(0);
            then(session.getCallId()).isEqualTo(givenCallId);
            then(session.getJoinTime()).isEqualTo(givenJoinTime);
            then(session.getLeaveTime()).isEqualTo(givenLeaveTime);

            var recording = response.getRecording();
            then(recording.getComposedFiles()).isNotNull();

            var files = recording.getComposedFiles();
            then(files.size()).isEqualTo(1);

            var file = files.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenFileName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getDuration()).isEqualTo(givenFilesDuration);
            then(file.getStartTime()).isEqualTo(givenFilesStartTime);
            then(file.getEndTime()).isEqualTo(givenFilesEndTime);
            then(recording.getCallRecordings()).isNotNull();

            var callRecordings = recording.getCallRecordings();
            then(callRecordings.size()).isEqualTo(1);

            var callRecording = callRecordings.get(0);
            then(callRecording.getCallId()).isEqualTo(givenCallId);
            then(callRecording.getEndpoint()).isNotNull();

            var endpoint = callRecording.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(callRecording.getDirection()).isEqualTo(givenDirection);
            then(callRecording.getFiles()).isNotNull();

            var callRecordingFiles = callRecording.getFiles();
            then(callRecordingFiles.size()).isEqualTo(1);

            var callRecordingFile = callRecordingFiles.get(0);
            then(callRecordingFile.getId()).isEqualTo(givenFileId);
            then(callRecordingFile.getName()).isEqualTo(givenFileName);
            then(callRecordingFile.getFileFormat()).isEqualTo(givenFileFormat);
            then(callRecordingFile.getSize()).isEqualTo(givenSize);
            then(callRecordingFile.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(callRecordingFile.getCreationTime()).isEqualTo(givenCreationTime);
            then(callRecordingFile.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(callRecordingFile.getDuration()).isEqualTo(givenFilesDuration);
            then(callRecordingFile.getStartTime()).isEqualTo(givenFilesStartTime);
            then(callRecordingFile.getEndTime()).isEqualTo(givenFilesEndTime);
            then(callRecordingFile.getLocation()).isEqualTo(givenLocation);
            then(callRecording.getStatus()).isEqualTo(givenStatus);
            then(callRecording.getReason()).isEqualTo(givenReason);

            var errorCode = response.getErrorCode();
            then(errorCode).isNotNull();
            then(errorCode.getId()).isEqualTo(givenErrorCodeId);
            then(errorCode.getName()).isEqualTo(givenErrorCodeName);
            then(errorCode.getDescription()).isEqualTo(givenErrorCodeDescription);
        };

        var call = api.getConferenceHistory(givenConferenceId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAddNewConferenceCall() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenTime = "2022-05-01T14:25:45+0000";
        boolean givenAudioMuted = true;
        boolean givenAudioUserDeaf = true;
        boolean givenVideoCamera = true;
        boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";
        String givenFrom = "44790123456";
        String givenTo = "44790987654";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenCallState = CallState.CALLING;
        boolean givenMuted = true;
        boolean givenDeaf = true;
        boolean givenCamera = true;
        boolean givenScreenShare = true;
        Integer givenRingDuration = 3;
        String givenConferenceId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenKey1 = "value1";
        String givenKey2 = "value2";

        Boolean givenConnectOnEarlyMedia = false;

        String givenResponse = String.format("{\n" +
                                                 "  \"conference\": {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"participants\": [\n" +
                                                 "        {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"state\": \"%s\",\n" +
                                                 "          \"joinTime\": \"%s\",\n" +
                                                 "          \"media\": {\n" +
                                                 "            \"audio\": {\n" +
                                                 "              \"muted\": %b,\n" +
                                                 "              \"deaf\": %b\n" +
                                                 "            },\n" +
                                                 "            \"video\": {\n" +
                                                 "              \"camera\": %b,\n" +
                                                 "              \"screenShare\": %b\n" +
                                                 "            }\n" +
                                                 "          }\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"applicationId\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "  \"call\": {\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"phoneNumber\": \"%s\",\n" +
                                                 "      \"type\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"from\": \"%s\",\n" +
                                                 "    \"to\": \"%s\",\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"conferenceId\": \"%s\",\n" +
                                                 "    \"customData\": {\n" +
                                                 "      \"key1\": \"%s\",\n" +
                                                 "      \"key2\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenTime,
                                             givenAudioMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenFrom,
                                             givenTo,
                                             givenDirection,
                                             givenCallState,
                                             givenMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenTime,
                                             givenTime,
                                             givenRingDuration,
                                             givenApplicationId,
                                             givenConferenceId,
                                             givenKey1,
                                             givenKey2
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"callRequest\": {\n" +
                                                   "    \"endpoint\": {\n" +
                                                   "      \"phoneNumber\": \"%s\",\n" +
                                                   "      \"type\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"from\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"connectOnEarlyMedia\": %b\n" +
                                                   "}\n",
                                               givenPhoneNumber,
                                               givenType,
                                               givenFrom,
                                               givenConnectOnEarlyMedia
        );

        setUpSuccessPostRequest(
            CONFERENCE_CALLS.replace("{conferenceId}", givenId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsAddNewCallRequest request = new CallsAddNewCallRequest()
            .callRequest(new CallsActionCallRequest()
                             .endpoint(new CallsPhoneEndpoint().phoneNumber(givenPhoneNumber))
                             .from(givenFrom)
            )
            .connectOnEarlyMedia(givenConnectOnEarlyMedia);

        Consumer<CallsConferenceAndCall> assertions = response -> {
            OffsetDateTime expectedTime = OffsetDateTime.of(
                LocalDateTime.of(
                    LocalDate.of(2022, 5, 1),
                    LocalTime.of(14, 25, 45)
                ),
                ZoneOffset.UTC
            );

            then(response).isNotNull();

            then(response.getConference()).isNotNull();
            var conference = response.getConference();
            then(conference.getId()).isEqualTo(givenId);
            then(conference.getName()).isEqualTo(givenName);

            then(conference.getParticipants()).isNotNull();
            var participants = conference.getParticipants();
            then(participants.size()).isEqualTo(1);

            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);

            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(expectedTime);

            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();

            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);

            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(conference.getApplicationId()).isEqualTo(givenApplicationId);

            var call = response.getCall();
            then(call.getId()).isEqualTo(givenCallId);
            then(call.getEndpoint()).isNotNull();

            var callEndpoint = call.getEndpoint();
            then(callEndpoint.getType()).isEqualTo(givenType);
            then(call.getFrom()).isEqualTo(givenFrom);
            then(call.getTo()).isEqualTo(givenTo);
            then(call.getDirection()).isEqualTo(givenDirection);
            then(call.getState()).isEqualTo(givenCallState);

            var callMedia = participant.getMedia();
            then(callMedia.getAudio()).isNotNull();

            var callAudio = callMedia.getAudio();
            then(callAudio.getMuted()).isEqualTo(givenAudioMuted);
            then(callAudio.getDeaf()).isEqualTo(givenAudioUserDeaf);

            var callVideo = callMedia.getVideo();
            then(callVideo.getCamera()).isEqualTo(givenVideoCamera);
            then(callVideo.getScreenShare()).isEqualTo(givenVideoScreenShare);

            then(call.getStartTime()).isEqualTo(expectedTime);
            then(call.getAnswerTime()).isEqualTo(expectedTime);
            then(call.getRingDuration()).isEqualTo(givenRingDuration);
            then(call.getApplicationId()).isEqualTo(givenApplicationId);
            then(call.getConferenceId()).isEqualTo(givenConferenceId);
            then(call.getCustomData())
                .isNotNull()
                .containsExactly(
                    entry("key1", givenKey1),
                    entry("key2", givenKey2)
                );
        };

        var call = api.addNewConferenceCall(givenConferenceId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAddExistingConferenceCall() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.134Z";
        Boolean givenAudioMuted = true;
        Boolean givenAudioUserMuted = true;
        Boolean givenAudioUserDeaf = true;
        Boolean givenVideoCamera = true;
        Boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";

        Boolean givenConnectOnEarlyMedia = false;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"participants\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"userMuted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"applicationId\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"connectOnEarlyMedia\": %b\n" +
                                                   "}\n",
                                               givenConnectOnEarlyMedia
        );

        setUpSuccessPutRequest(
            CONFERENCE_CALL
                .replace("{conferenceId}", givenId)
                .replace("{callId}", givenCallId),
            Map.of(),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsAddExistingCallRequest request = new CallsAddExistingCallRequest()
            .connectOnEarlyMedia(givenConnectOnEarlyMedia);

        Consumer<CallsConference> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getParticipants()).isNotNull();
            var participants = response.getParticipants();
            then(participants.size()).isEqualTo(1);
            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);
            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getUserMuted()).isEqualTo(givenAudioUserMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.addExistingConferenceCall(givenId, givenCallId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRemoveConferenceCall() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenCallId = "string";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpNoRequestBodyDeleteRequest(
            CONFERENCE_CALL
                .replace("{conferenceId}", givenId)
                .replace("{callId}", givenCallId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.removeConferenceCall(givenId, givenCallId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHangupConference() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenName = "Example conference";
        String givenCallId = "string";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallsParticipantState givenState = CallsParticipantState.JOINING;
        String givenJoinTime = "2022-05-01T14:25:45.134Z";
        Boolean givenAudioMuted = true;
        Boolean givenAudioUserMuted = true;
        Boolean givenAudioUserDeaf = true;
        Boolean givenVideoCamera = true;
        Boolean givenVideoScreenShare = true;
        String givenApplicationId = "61c060db2675060027d8c7a6";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"participants\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"state\": \"%s\",\n" +
                                                 "      \"joinTime\": \"%s\",\n" +
                                                 "      \"media\": {\n" +
                                                 "        \"audio\": {\n" +
                                                 "          \"muted\": %b,\n" +
                                                 "          \"userMuted\": %b,\n" +
                                                 "          \"deaf\": %b\n" +
                                                 "        },\n" +
                                                 "        \"video\": {\n" +
                                                 "          \"camera\": %b,\n" +
                                                 "          \"screenShare\": %b\n" +
                                                 "        }\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"applicationId\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenCallId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenState,
                                             givenJoinTime,
                                             givenAudioMuted,
                                             givenAudioUserMuted,
                                             givenAudioUserDeaf,
                                             givenVideoCamera,
                                             givenVideoScreenShare,
                                             givenApplicationId);

        setUpEmptyPostRequest(
            HANGUP_CONFERENCE.replace("{conferenceId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConference> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getParticipants()).isNotNull();
            var participants = response.getParticipants();
            then(participants.size()).isEqualTo(1);
            var participant = participants.get(0);
            then(participant.getCallId()).isEqualTo(givenCallId);
            then(participant.getEndpoint()).isNotNull();
            var endpoint = participant.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(participant.getState()).isEqualTo(givenState);
            then(participant.getJoinTime()).isEqualTo(givenJoinTime);
            then(participant.getMedia()).isNotNull();
            var media = participant.getMedia();
            then(media.getAudio()).isNotNull();
            var audio = media.getAudio();
            then(audio.getMuted()).isEqualTo(givenAudioMuted);
            then(audio.getUserMuted()).isEqualTo(givenAudioUserMuted);
            then(audio.getDeaf()).isEqualTo(givenAudioUserDeaf);
            then(media.getVideo()).isNotNull();
            var video = media.getVideo();
            then(video.getCamera()).isEqualTo(givenVideoCamera);
            then(video.getScreenShare()).isEqualTo(givenVideoScreenShare);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
        };

        var call = api.hangupConference(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConferencePlayFile() {
        String givenId = "123";

        Integer givenLoopCount = 1;
        CallsPlayContentType givenContentType = CallsPlayContentType.FILE;
        String givenFileId = "100";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"loopCount\": %d,\n" +
                                                   "  \"content\": {\n" +
                                                   "    \"type\": \"%s\",\n" +
                                                   "    \"fileId\" : \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenLoopCount,
                                               givenContentType,
                                               givenFileId
        );

        setUpSuccessPostRequest(
            CONFERENCE_PLAY_FILE.replace("{conferenceId}", givenId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsPlayRequest request = new CallsPlayRequest()
            .loopCount(givenLoopCount)
            .content(new CallsFilePlayContent()
                         .fileId(givenFileId)
            );

        Consumer<CallsActionResponse> assertions = response -> then(response)
            .isNotNull()
            .extracting(CallsActionResponse::getStatus)
            .isEqualTo(givenStatus);

        var call = api.conferencePlayFile(givenId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConferenceSayText() {
        String givenId = "123";

        String givenText = "string";
        CallsLanguage givenLanguage = CallsLanguage.AR;
        Double givenSpeechRate = 0.5;
        Integer givenLoopCount = 0;
        CallsGender givenCallsGender = CallsGender.FEMALE;
        CallVoice givenVoiceName = CallVoice.HODA;

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"text\": \"%s\",\n" +
                                                   "  \"language\": \"%s\",\n" +
                                                   "  \"speechRate\": %f,\n" +
                                                   "  \"loopCount\": %d,\n" +
                                                   "  \"preferences\": {\n" +
                                                   "    \"voiceGender\": \"%s\",\n" +
                                                   "    \"voiceName\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenText,
                                               givenLanguage,
                                               givenSpeechRate,
                                               givenLoopCount,
                                               givenCallsGender,
                                               givenVoiceName
        );

        setUpSuccessPostRequest(
            CONFERENCE_SAY_TEXT.replace("{conferenceId}", givenId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsSayRequest request = new CallsSayRequest()
            .text(givenText)
            .language(givenLanguage)
            .speechRate(givenSpeechRate)
            .loopCount(givenLoopCount)
            .preferences(new CallsVoicePreferences()
                             .voiceGender(givenCallsGender)
                             .voiceName(givenVoiceName)
            );

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.conferenceSayText(givenId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConferenceStopPlayingFile() {
        String givenId = "123";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            CONFERENCE_STOP_PLAYING_FILE.replace("{conferenceId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.conferenceStopPlayingFile(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConferenceStartRecording() {
        String givenId = "123";

        CallsRecordingType givenRecordingType = CallsRecordingType.AUDIO;
        Boolean givenEnabled = false;

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            CONFERENCE_START_RECORDING.replace("{conferenceId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsConferenceRecordingRequest request = new CallsConferenceRecordingRequest()
            .recordingType(givenRecordingType)
            .conferenceComposition(new CallsConferenceComposition().enabled(givenEnabled));

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.conferenceStartRecording(givenId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConferenceStopRecording() {
        String givenId = "123";

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        setUpEmptyPostRequest(
            CONFERENCE_STOP_RECORDING.replace("{conferenceId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.conferenceStopRecording(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConferenceBroadcastWebRtcText() {
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedText = "This meeting will end in 5 minutes.";
        String expectedRequest = String.format("{\n" +
                                                   "  \"text\": \"%s\"\n" +
                                                   "}",
                                               expectedText
        );

        String givenConferenceId = "123";
        setUpPostRequest(
            CONFERENCE_BROADCAST_WEBRTC_TEXT.replace("{conferenceId}", givenConferenceId),
            expectedRequest,
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsConferenceBroadcastWebrtcTextRequest = new CallsConferenceBroadcastWebrtcTextRequest()
            .text(expectedText);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.conferenceBroadcastWebrtcText(givenConferenceId, callsConferenceBroadcastWebrtcTextRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallsFiles() {
        String givenId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"fileFormat\": \"%s\",\n" +
                                                 "      \"size\": %d,\n" +
                                                 "      \"creationMethod\": \"%s\",\n" +
                                                 "      \"creationTime\": \"%s\",\n" +
                                                 "      \"expirationTime\": \"%s\",\n" +
                                                 "      \"duration\": %d\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CALLS_FILES,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsFilePage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(1);
            var result = results.get(0);
            then(result.getId()).isEqualTo(givenId);
            then(result.getName()).isEqualTo(givenName);
            then(result.getFileFormat()).isEqualTo(givenFileFormat);
            then(result.getSize()).isEqualTo(givenSize);
            then(result.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(result.getCreationTime()).isEqualTo(givenCreationTime);
            then(result.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(result.getDuration()).isEqualTo(givenDuration);
            then(response.getPaging()).isNotNull();
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getCallsFiles();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUploadCallsAudioFile() throws IOException {
        String givenId = "string";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;

        String givenAttachmentText = "Test file text";
        File tempFile = File.createTempFile("attachment", ".txt");
        Files.writeString(tempFile.toPath(), givenAttachmentText);

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"fileFormat\": \"%s\",\n" +
                                                 "  \"size\": %d,\n" +
                                                 "  \"creationMethod\": \"%s\",\n" +
                                                 "  \"creationTime\": \"%s\",\n" +
                                                 "  \"expirationTime\": \"%s\",\n" +
                                                 "  \"duration\": %d\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration
        );

        setUpMultipartRequest(
            CALLS_FILES,
            List.of(new Multipart("file", givenAttachmentText)),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsFile> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getFileFormat()).isEqualTo(givenFileFormat);
            then(response.getSize()).isEqualTo(givenSize);
            then(response.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(response.getCreationTime()).isEqualTo(givenCreationTime);
            then(response.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(response.getDuration()).isEqualTo(givenDuration);
        };

        var call = api.uploadCallsAudioFile(tempFile);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallsFile() {
        String givenId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"fileFormat\": \"%s\",\n" +
                                                 "  \"size\": %d,\n" +
                                                 "  \"creationMethod\": \"%s\",\n" +
                                                 "  \"creationTime\": \"%s\",\n" +
                                                 "  \"expirationTime\": \"%s\",\n" +
                                                 "  \"duration\": %d\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration
        );

        setUpSuccessGetRequest(
            CALLS_FILE.replace("{fileId}", givenId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsFile> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getFileFormat()).isEqualTo(givenFileFormat);
            then(response.getSize()).isEqualTo(givenSize);
            then(response.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(response.getCreationTime()).isEqualTo(givenCreationTime);
            then(response.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(response.getDuration()).isEqualTo(givenDuration);
        };

        var call = api.getCallsFile(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCallsFile() {
        String givenId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"fileFormat\": \"%s\",\n" +
                                                 "  \"size\": %d,\n" +
                                                 "  \"creationMethod\": \"%s\",\n" +
                                                 "  \"creationTime\": \"%s\",\n" +
                                                 "  \"expirationTime\": \"%s\",\n" +
                                                 "  \"duration\": %d\n" +
                                                 "}\n",
                                             givenId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration
        );

        setUpNoRequestBodyDeleteRequest(
            CALLS_FILE.replace("{fileId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsFile> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getFileFormat()).isEqualTo(givenFileFormat);
            then(response.getSize()).isEqualTo(givenSize);
            then(response.getCreationMethod()).isEqualTo(givenMethod);
            then(response.getCreationTime()).isEqualTo(givenCreationTime);
            then(response.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(response.getDuration()).isEqualTo(givenDuration);
        };

        var call = api.deleteCallsFile(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetMediaStreamConfigs() {
        String givenId = "string";
        String givenUrl = "string";
        CallsUrlSecurityConfigType givenType = CallsUrlSecurityConfigType.BASIC;
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"url\": \"%s\",\n" +
                                                 "      \"securityConfig\": {\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId, givenUrl, givenType, givenPage, givenPageSize, givenPageTotalPages, givenPageTotalResults
        );

        setUpSuccessGetRequest(
            MEDIA_STREAM_CONFIGS,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsMediaStreamConfigPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(1);
            var result = results.get(0);
            then(result.getId()).isEqualTo(givenId);
            then(result.getUrl()).isEqualTo(givenUrl);
            then(response.getPaging()).isNotNull();
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getMediaStreamConfigs();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetMediaStreamConfig() {
        String givenId = "63467c6e2885a5389ba11d80";
        String givenUrl = "wss://example-websocket.com:3001";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"url\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenUrl
        );

        setUpSuccessGetRequest(
            MEDIA_STREAM_CONFIG.replace("{mediaStreamConfigId}", givenId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsMediaStreamConfigResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getUrl()).isEqualTo(givenUrl);
        };

        var call = api.getMediaStreamConfig(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateMediaStreamConfig() {
        String givenUrl = "givenUrl";
        CallsUrlSecurityConfigType givenType = CallsUrlSecurityConfigType.BASIC;
        String givenUsername = "username";
        String givenPassword = "password";
        String givenName = "name";

        String expectedRequest = String.format("{\n" +
                                                   "  \"name\" : \"%s\",\n" +
                                                   "  \"url\": \"%s\",\n" +
                                                   "  \"securityConfig\": {\n" +
                                                   "    \"type\": \"%s\",\n" +
                                                   "    \"username\": \"%s\",\n" +
                                                   "    \"password\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenName,
                                               givenUrl,
                                               givenType,
                                               givenUsername,
                                               givenPassword
        );

        String givenId = "63467c6e2885a5389ba11d80";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"url\": \"%s\",\n" +
                                                 "  \"securityConfig\": {\n" +
                                                 "    \"type\": \"%s\",\n" +
                                                 "    \"username\": \"%s\",\n" +
                                                 "    \"password\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenUrl,
                                             givenType,
                                             givenUsername,
                                             givenPassword
        );

        setUpPostRequest(
            MEDIA_STREAM_CONFIGS,
            expectedRequest,
            givenResponse,
            201
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsMediaStreamConfigRequest request = new CallsMediaStreamConfigRequest()
            .name(givenName)
            .url(givenUrl)
            .securityConfig(new BasicSecurityConfig()
                                .username(givenUsername)
                                .password(givenPassword)
            );

        Consumer<CallsMediaStreamConfigResponse> assertions = response -> {
            CallsMediaStreamConfigResponse expectedConfig = new CallsMediaStreamConfigResponse()
                .id(givenId)
                .url(givenUrl);
            then(response).isEqualTo(expectedConfig);
        };

        var call = api.createMediaStreamConfig(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateMediaStreamConfig() {
        String givenId = "63467c6e2885a5389ba11d80";
        String givenUrl = "wss://example-websocket.com:3001";

        CallsUrlSecurityConfigType givenType = CallsUrlSecurityConfigType.BASIC;
        String givenUsername = "username";
        String givenPassword = "password";

        String expectedRequest = String.format("{\n" +
                                                   "  \"url\": \"%s\",\n" +
                                                   "  \"securityConfig\": {\n" +
                                                   "    \"type\": \"%s\",\n" +
                                                   "    \"username\": \"%s\",\n" +
                                                   "    \"password\": \"%s\"\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenUrl,
                                               givenType,
                                               givenUsername,
                                               givenPassword
        );

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"url\": \"%s\",\n" +
                                                 "  \"securityConfig\": {\n" +
                                                 "    \"type\": \"%s\",\n" +
                                                 "    \"username\": \"%s\",\n" +
                                                 "    \"password\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenUrl,
                                             givenType,
                                             givenUsername,
                                             givenPassword
        );

        setUpPutRequest(
            MEDIA_STREAM_CONFIG.replace("{mediaStreamConfigId}", givenId),
            Map.of(),
            expectedRequest,
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsMediaStreamConfigRequest request = new CallsMediaStreamConfigRequest()
            .url(givenUrl)
            .securityConfig(new BasicSecurityConfig()
                                .username(givenUsername)
                                .password(givenPassword)
            );

        Consumer<CallsMediaStreamConfigResponse> assertions = response -> {
            CallsMediaStreamConfigResponse expectedConfig = new CallsMediaStreamConfigResponse()
                .id(givenId)
                .url(givenUrl);
            then(response).isEqualTo(expectedConfig);
        };

        var call = api.updateMediaStreamConfig(givenId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteMediaStreamConfig() {
        String givenId = "63467c6e2885a5389ba11d80";
        String givenUrl = "wss://example-websocket.com:3001";
        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"url\": \"%s\"\n" +
                                                 "}\n",
                                             givenId,
                                             givenUrl
        );

        setUpNoRequestBodyDeleteRequest(
            MEDIA_STREAM_CONFIG.replace("{mediaStreamConfigId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsMediaStreamConfigResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getUrl()).isEqualTo(givenUrl);
            then(response.getId()).isEqualTo(givenId);
        };

        var call = api.deleteMediaStreamConfig(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallsRecordings() {
        String givenId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"direction\": \"%s\",\n" +
                                                 "      \"files\": [\n" +
                                                 "        {\n" +
                                                 "          \"id\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"fileFormat\": \"%s\",\n" +
                                                 "          \"size\": %d,\n" +
                                                 "          \"creationMethod\": \"%s\",\n" +
                                                 "          \"creationTime\": \"%s\",\n" +
                                                 "          \"expirationTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"location\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"status\": \"%s\",\n" +
                                                 "      \"reason\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CALLS_RECORDINGS,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallRecordingPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(1);
            var result = results.get(0);
            then(result.getCallId()).isEqualTo(givenId);
            then(result.getEndpoint()).isNotNull();
            var endpoint = result.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(result.getDirection()).isEqualTo(givenDirection);
            then(result.getFiles()).isNotNull();
            var files = result.getFiles();
            then(files.size()).isEqualTo(1);
            var file = files.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(file.getDuration()).isEqualTo(givenDuration);
            then(file.getStartTime()).isEqualTo(givenStartTime);
            then(file.getEndTime()).isEqualTo(givenEndTime);
            then(file.getLocation()).isEqualTo(givenLocation);
            then(result.getStatus()).isEqualTo(givenStatus);
            then(result.getReason()).isEqualTo(givenReason);
            then(response.getPaging()).isNotNull();
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getCallsRecordings();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallRecordings() {
        String givenId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";

        String givenResponse = String.format("    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"direction\": \"%s\",\n" +
                                                 "      \"files\": [\n" +
                                                 "        {\n" +
                                                 "          \"id\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"fileFormat\": \"%s\",\n" +
                                                 "          \"size\": %d,\n" +
                                                 "          \"creationMethod\": \"%s\",\n" +
                                                 "          \"creationTime\": \"%s\",\n" +
                                                 "          \"expirationTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"location\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"status\": \"%s\",\n" +
                                                 "      \"reason\": \"%s\"\n" +
                                                 "    }\n",
                                             givenId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason
        );

        setUpSuccessGetRequest(
            CALL_RECORDINGS.replace("{callId}", givenId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallRecording> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getCallId()).isEqualTo(givenId);
            then(response.getEndpoint()).isNotNull();
            var endpoint = response.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(response.getDirection()).isEqualTo(givenDirection);
            then(response.getFiles()).isNotNull();
            var files = response.getFiles();
            then(files.size()).isEqualTo(1);
            var file = files.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(file.getDuration()).isEqualTo(givenDuration);
            then(file.getStartTime()).isEqualTo(givenStartTime);
            then(file.getEndTime()).isEqualTo(givenEndTime);
            then(file.getLocation()).isEqualTo(givenLocation);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getReason()).isEqualTo(givenReason);
        };

        var call = api.getCallRecordings(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCallRecordings() {
        String givenId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";

        String givenResponse = String.format("    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"direction\": \"%s\",\n" +
                                                 "      \"files\": [\n" +
                                                 "        {\n" +
                                                 "          \"id\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"fileFormat\": \"%s\",\n" +
                                                 "          \"size\": %d,\n" +
                                                 "          \"creationMethod\": \"%s\",\n" +
                                                 "          \"creationTime\": \"%s\",\n" +
                                                 "          \"expirationTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"location\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"status\": \"%s\",\n" +
                                                 "      \"reason\": \"%s\"\n" +
                                                 "    }\n",
                                             givenId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason
        );

        setUpNoRequestBodyDeleteRequest(
            CALL_RECORDINGS.replace("{callId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        Consumer<CallRecording> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getCallId()).isEqualTo(givenId);
            then(response.getEndpoint()).isNotNull();
            var endpoint = response.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(response.getDirection()).isEqualTo(givenDirection);
            then(response.getFiles()).isNotNull();
            var files = response.getFiles();
            then(files.size()).isEqualTo(1);
            var file = files.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(file.getDuration()).isEqualTo(givenDuration);
            then(file.getStartTime()).isEqualTo(givenStartTime);
            then(file.getEndTime()).isEqualTo(givenEndTime);
            then(file.getLocation()).isEqualTo(givenLocation);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getReason()).isEqualTo(givenReason);
        };

        CallsApi api = new CallsApi(getApiClient());

        var call = api.deleteCallRecordings(givenId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetConferencesRecordings() {
        String givenConferenceId = "string";
        String givenConferenceName = "string";
        String givenApplicationId = "string";
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        String givenId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";
        Integer givenPage = 0;
        Integer givenPageSize = 1;
        Integer givenPageTotalPages = 0;
        Long givenPageTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"conferenceId\": \"%s\",\n" +
                                                 "      \"conferenceName\": \"%s\",\n" +
                                                 "      \"applicationId\": \"%s\",\n" +
                                                 "      \"composedFiles\": [\n" +
                                                 "        {\n" +
                                                 "          \"id\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"fileFormat\": \"%s\",\n" +
                                                 "          \"size\": %d,\n" +
                                                 "          \"creationMethod\": \"%s\",\n" +
                                                 "          \"creationTime\": \"%s\",\n" +
                                                 "          \"expirationTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"location\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"callRecordings\": [\n" +
                                                 "        {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"direction\": \"%s\",\n" +
                                                 "          \"files\": [\n" +
                                                 "            {\n" +
                                                 "              \"id\": \"%s\",\n" +
                                                 "              \"name\": \"%s\",\n" +
                                                 "              \"fileFormat\": \"%s\",\n" +
                                                 "              \"size\": %d,\n" +
                                                 "              \"creationMethod\": \"%s\",\n" +
                                                 "              \"creationTime\": \"%s\",\n" +
                                                 "              \"expirationTime\": \"%s\",\n" +
                                                 "              \"duration\": %d,\n" +
                                                 "              \"startTime\": \"%s\",\n" +
                                                 "              \"endTime\": \"%s\",\n" +
                                                 "              \"location\": \"%s\"\n" +
                                                 "            }\n" +
                                                 "          ],\n" +
                                                 "          \"status\": \"%s\",\n" +
                                                 "          \"reason\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ]\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenConferenceId,
                                             givenConferenceName,
                                             givenApplicationId,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason,
                                             givenPage,
                                             givenPageSize,
                                             givenPageTotalPages,
                                             givenPageTotalResults
        );

        setUpSuccessGetRequest(
            CONFERENCES_RECORDINGS,
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConferenceRecordingPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(1);
            var result = results.get(0);
            then(result.getConferenceId()).isEqualTo(givenConferenceId);
            then(result.getConferenceName()).isEqualTo(givenConferenceName);
            then(result.getApplicationId()).isEqualTo(givenApplicationId);
            then(result.getComposedFiles()).isNotNull();
            var composedFiles = result.getComposedFiles();
            then(composedFiles.size()).isEqualTo(1);
            var file = composedFiles.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(file.getDuration()).isEqualTo(givenDuration);
            then(file.getStartTime()).isEqualTo(givenStartTime);
            then(file.getEndTime()).isEqualTo(givenEndTime);
            then(file.getLocation()).isEqualTo(givenLocation);
            then(result.getCallRecordings()).isNotNull();
            var callRecordings = result.getCallRecordings();
            then(callRecordings.size()).isEqualTo(1);
            var callRecording = callRecordings.get(0);
            then(callRecording).isNotNull();
            then(callRecording.getCallId()).isEqualTo(givenId);
            then(callRecording.getEndpoint()).isNotNull();
            var endpoint = callRecording.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(callRecording.getDirection()).isEqualTo(givenDirection);
            then(callRecording.getFiles()).isNotNull();
            var callRecordingsFiles = callRecording.getFiles();
            then(callRecordingsFiles.size()).isEqualTo(1);
            var callRecordingFile = callRecordingsFiles.get(0);
            then(callRecordingFile.getId()).isEqualTo(givenFileId);
            then(callRecordingFile.getName()).isEqualTo(givenName);
            then(callRecordingFile.getFileFormat()).isEqualTo(givenFileFormat);
            then(callRecordingFile.getSize()).isEqualTo(givenSize);
            then(callRecordingFile.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(callRecordingFile.getCreationTime()).isEqualTo(givenCreationTime);
            then(callRecordingFile.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(callRecordingFile.getDuration()).isEqualTo(givenDuration);
            then(callRecordingFile.getStartTime()).isEqualTo(givenStartTime);
            then(callRecordingFile.getEndTime()).isEqualTo(givenEndTime);
            then(callRecordingFile.getLocation()).isEqualTo(givenLocation);
            then(callRecording.getStatus()).isEqualTo(givenStatus);
            then(callRecording.getReason()).isEqualTo(givenReason);
            then(response.getPaging()).isNotNull();
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenPageSize);
            then(paging.getTotalPages()).isEqualTo(givenPageTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPageTotalResults);
        };

        var call = api.getConferencesRecordings();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetConferenceRecordings() {
        String givenConferenceId = "string";
        String givenConferenceName = "string";
        String givenApplicationId = "string";
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        String givenId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";

        String givenResponse = String.format("{\n" +
                                                 "  \"conferenceId\": \"%s\",\n" +
                                                 "  \"conferenceName\": \"%s\",\n" +
                                                 "  \"applicationId\": \"%s\",\n" +
                                                 "  \"composedFiles\": [\n" +
                                                 "    {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"fileFormat\": \"%s\",\n" +
                                                 "      \"size\": %d,\n" +
                                                 "      \"creationTime\": \"%s\",\n" +
                                                 "      \"duration\": %d,\n" +
                                                 "      \"startTime\": \"%s\",\n" +
                                                 "      \"endTime\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"callRecordings\": [\n" +
                                                 "    {\n" +
                                                 "      \"callId\": \"%s\",\n" +
                                                 "      \"endpoint\": {\n" +
                                                 "        \"phoneNumber\": \"%s\",\n" +
                                                 "        \"type\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"direction\": \"%s\",\n" +
                                                 "      \"files\": [\n" +
                                                 "        {\n" +
                                                 "          \"id\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"fileFormat\": \"%s\",\n" +
                                                 "          \"size\": %d,\n" +
                                                 "          \"creationMethod\": \"%s\",\n" +
                                                 "          \"creationTime\": \"%s\",\n" +
                                                 "          \"expirationTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\",\n" +
                                                 "          \"location\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"status\": \"%s\",\n" +
                                                 "      \"reason\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ]\n" +
                                                 "}\n",
                                             givenConferenceId,
                                             givenConferenceName,
                                             givenApplicationId,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason
        );

        setUpSuccessGetRequest(
            CONFERENCE_RECORDINGS.replace("{conferenceId}", givenConferenceId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConferenceRecording> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getConferenceId()).isEqualTo(givenConferenceId);
            then(response.getConferenceName()).isEqualTo(givenConferenceName);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getComposedFiles()).isNotNull();

            var composedFiles = response.getComposedFiles();
            then(composedFiles.size()).isEqualTo(1);

            var file = composedFiles.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getDuration()).isEqualTo(givenDuration);
            then(file.getStartTime()).isEqualTo(givenStartTime);
            then(file.getEndTime()).isEqualTo(givenEndTime);

            then(response.getCallRecordings()).isNotNull();
            var callRecordings = response.getCallRecordings();

            then(callRecordings.size()).isEqualTo(1);
            var callRecording = callRecordings.get(0);
            then(callRecording).isNotNull();
            then(callRecording.getCallId()).isEqualTo(givenId);
            then(callRecording.getEndpoint()).isNotNull();

            var endpoint = callRecording.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);

            then(callRecording.getDirection()).isEqualTo(givenDirection);

            then(callRecording.getFiles()).isNotNull();
            var callRecordingsFiles = callRecording.getFiles();
            then(callRecordingsFiles.size()).isEqualTo(1);

            var callRecordingFile = callRecordingsFiles.get(0);
            then(callRecordingFile.getId()).isEqualTo(givenFileId);
            then(callRecordingFile.getName()).isEqualTo(givenName);
            then(callRecordingFile.getFileFormat()).isEqualTo(givenFileFormat);
            then(callRecordingFile.getSize()).isEqualTo(givenSize);
            then(callRecordingFile.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(callRecordingFile.getCreationTime()).isEqualTo(givenCreationTime);
            then(callRecordingFile.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(callRecordingFile.getDuration()).isEqualTo(givenDuration);
            then(callRecordingFile.getStartTime()).isEqualTo(givenStartTime);
            then(callRecordingFile.getEndTime()).isEqualTo(givenEndTime);
            then(callRecordingFile.getLocation()).isEqualTo(givenLocation);

            then(callRecording.getStatus()).isEqualTo(givenStatus);
            then(callRecording.getReason()).isEqualTo(givenReason);
        };

        var call = api.getConferenceRecordings(givenConferenceId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteConferenceRecordings() {
        String givenConferenceId = "string";
        String givenConferenceName = "string";
        String givenApplicationId = "string";
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;
        String givenId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        String givenPhoneNumber = "41792030000";
        CallEndpointType givenType = CallEndpointType.PHONE;
        CallDirection givenDirection = CallDirection.INBOUND;
        CallsRecordingStatus givenStatus = CallsRecordingStatus.SUCCESSFUL;
        String givenReason = "string";

        String givenResponse = String.format("    {\n" +
                                                 "      \"conferenceId\": \"%s\",\n" +
                                                 "      \"conferenceName\": \"%s\",\n" +
                                                 "      \"applicationId\": \"%s\",\n" +
                                                 "      \"composedFiles\": [\n" +
                                                 "        {\n" +
                                                 "          \"id\": \"%s\",\n" +
                                                 "          \"name\": \"%s\",\n" +
                                                 "          \"fileFormat\": \"%s\",\n" +
                                                 "          \"size\": %d,\n" +
                                                 "          \"creationTime\": \"%s\",\n" +
                                                 "          \"duration\": %d,\n" +
                                                 "          \"startTime\": \"%s\",\n" +
                                                 "          \"endTime\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ],\n" +
                                                 "      \"callRecordings\": [\n" +
                                                 "        {\n" +
                                                 "          \"callId\": \"%s\",\n" +
                                                 "          \"endpoint\": {\n" +
                                                 "            \"phoneNumber\": \"%s\",\n" +
                                                 "            \"type\": \"%s\"\n" +
                                                 "          },\n" +
                                                 "          \"direction\": \"%s\",\n" +
                                                 "          \"files\": [\n" +
                                                 "            {\n" +
                                                 "              \"id\": \"%s\",\n" +
                                                 "              \"name\": \"%s\",\n" +
                                                 "              \"fileFormat\": \"%s\",\n" +
                                                 "              \"size\": %d,\n" +
                                                 "              \"creationMethod\": \"%s\",\n" +
                                                 "              \"creationTime\": \"%s\",\n" +
                                                 "              \"expirationTime\": \"%s\",\n" +
                                                 "              \"duration\": %d,\n" +
                                                 "              \"startTime\": \"%s\",\n" +
                                                 "              \"endTime\": \"%s\",\n" +
                                                 "              \"location\": \"%s\"\n" +
                                                 "            }\n" +
                                                 "          ],\n" +
                                                 "          \"status\": \"%s\",\n" +
                                                 "          \"reason\": \"%s\"\n" +
                                                 "        }\n" +
                                                 "      ]\n" +
                                                 "    }\n",
                                             givenConferenceId,
                                             givenConferenceName,
                                             givenApplicationId,

                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,

                                             givenId,
                                             givenPhoneNumber,
                                             givenType,
                                             givenDirection,

                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation,
                                             givenStatus,
                                             givenReason
        );

        setUpNoRequestBodyDeleteRequest(
            CONFERENCE_RECORDINGS.replace("{conferenceId}", givenConferenceId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsConferenceRecording> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getConferenceId()).isEqualTo(givenConferenceId);
            then(response.getConferenceName()).isEqualTo(givenConferenceName);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getComposedFiles()).isNotNull();
            var files = response.getComposedFiles();
            then(files.size()).isEqualTo(1);
            var file = files.get(0);
            then(file.getId()).isEqualTo(givenFileId);
            then(file.getName()).isEqualTo(givenName);
            then(file.getFileFormat()).isEqualTo(givenFileFormat);
            then(file.getSize()).isEqualTo(givenSize);
            then(file.getCreationTime()).isEqualTo(givenCreationTime);
            then(file.getDuration()).isEqualTo(givenDuration);
            then(file.getStartTime()).isEqualTo(givenStartTime);
            then(file.getEndTime()).isEqualTo(givenEndTime);

            then(response.getCallRecordings()).isNotNull();
            var recordings = response.getCallRecordings();
            then(recordings.size()).isEqualTo(1);
            var recording = recordings.get(0);
            then(recording.getCallId()).isEqualTo(givenId);
            then(recording.getEndpoint()).isNotNull();

            var endpoint = recording.getEndpoint();
            then(endpoint.getType()).isEqualTo(givenType);
            then(recording.getDirection()).isEqualTo(givenDirection);
            then(recording.getFiles()).isNotNull();
            var recordingFiles = recording.getFiles();
            then(recordingFiles.size()).isEqualTo(1);
            var recordingFile = recordingFiles.get(0);
            then(recordingFile.getId()).isEqualTo(givenFileId);
            then(recordingFile.getName()).isEqualTo(givenName);
            then(recordingFile.getFileFormat()).isEqualTo(givenFileFormat);
            then(recordingFile.getSize()).isEqualTo(givenSize);
            then(recordingFile.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(recordingFile.getCreationTime()).isEqualTo(givenCreationTime);
            then(recordingFile.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(recordingFile.getDuration()).isEqualTo(givenDuration);
            then(recordingFile.getStartTime()).isEqualTo(givenStartTime);
            then(recordingFile.getEndTime()).isEqualTo(givenEndTime);
            then(recordingFile.getLocation()).isEqualTo(givenLocation);

            then(recording.getStatus()).isEqualTo(givenStatus);
            then(recording.getReason()).isEqualTo(givenReason);
        };

        var call = api.deleteConferenceRecordings(givenConferenceId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldDownloadCallsRecording() {
        String givenId = "";
        String givenResponse = "";

        setUpGetRequestOctet(
            CALLS_RECORDINGS_FILES.replace("{fileId}", givenId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        var call = api.downloadRecordingFile(givenId);
        testSuccessfulCallWithFileResult(call::execute);
    }

    @Test
    void shouldDeleteCallsRecording() {
        String givenFileId = "218eceba-c044-430d-9f26-8f1a7f0g2d03";
        String givenName = "Example file";
        CallsFileFormat givenFileFormat = CallsFileFormat.WAV;
        Long givenSize = 292190L;
        CallsCreationMethod givenCreationMethod = CallsCreationMethod.RECORDED;
        String givenCreationTime = "2022-05-01T14:25:45.143Z";
        String givenExpirationTime = "2022-06-01T14:25:45.143Z";
        Long givenDuration = 3L;
        String givenStartTime = "2022-05-01T14:25:45.134Z";
        String givenEndTime = "2022-05-01T14:35:45.154Z";
        CallsRecordingFileLocation givenLocation = CallsRecordingFileLocation.SFTP;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"fileFormat\": \"%s\",\n" +
                                                 "  \"size\": %d,\n" +
                                                 "  \"creationMethod\": \"%s\",\n" +
                                                 "  \"creationTime\": \"%s\",\n" +
                                                 "  \"expirationTime\": \"%s\",\n" +
                                                 "  \"duration\": %d,\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"endTime\": \"%s\",\n" +
                                                 "  \"location\": \"%s\"\n" +
                                                 "}\n",
                                             givenFileId,
                                             givenName,
                                             givenFileFormat,
                                             givenSize,
                                             givenCreationMethod,
                                             givenCreationTime,
                                             givenExpirationTime,
                                             givenDuration,
                                             givenStartTime,
                                             givenEndTime,
                                             givenLocation
        );

        setUpNoRequestBodyDeleteRequest(
            CALLS_RECORDINGS_FILES.replace("{fileId}", givenFileId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsRecordingFile> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenFileId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getFileFormat()).isEqualTo(givenFileFormat);
            then(response.getSize()).isEqualTo(givenSize);
            then(response.getCreationMethod()).isEqualTo(givenCreationMethod);
            then(response.getCreationTime()).isEqualTo(givenCreationTime);
            then(response.getExpirationTime()).isEqualTo(givenExpirationTime);
            then(response.getDuration()).isEqualTo(givenDuration);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getEndTime()).isEqualTo(givenEndTime);
            then(response.getLocation()).isEqualTo(givenLocation);
        };

        var call = api.deleteRecordingFile(givenFileId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldComposeConferenceRecording() {
        String givenConferenceId = "string";

        Boolean givenDeleteCallRecordings = true;

        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("        {\n" +
                                                 "          \"status\": \"%s\"\n" +
                                                 "        }\n",
                                             givenStatus
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"deleteCallRecordings\": %b\n" +
                                                   "}\n",
                                               givenDeleteCallRecordings
        );

        setUpSuccessPostRequest(
            COMPOSE_CONFERENCE_RECORDING.replace("{conferenceId}", givenConferenceId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsOnDemandComposition request = new CallsOnDemandComposition().deleteCallRecordings(givenDeleteCallRecordings);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.composeConferenceRecording(givenConferenceId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateBulk() {
        String givenBulkId = "46ab0413-448f-4153-ada9-b68b14242dc3";

        String givenApplicationId1 = "61c060db2675060027d8c7a6";
        String givenCallId1 = "7672f60c-3418-40d9-8d6c-d2bac7e9a2b7";
        String givenExternalId1 = "7672f60c-3418-40d9-8d6c-d2bac7e9a2b7";
        String givenFrom1 = "41793026834";
        String givenPhoneNumber1 = "41792036727";
        CallEndpointType givenType1 = CallEndpointType.PHONE;
        CallsBulkCall.StatusEnum givenStatus1 = CallsBulkCall.StatusEnum.COMPLETED;
        String givenReason1 = "Created";

        String givenResponse = String.format("{\n" +
                                                 "    \"bulkId\" : \"%s\",\n" +
                                                 "    \"calls\" : [ {\n" +
                                                 "      \"applicationId\" : \"%s\",\n" +
                                                 "      \"callId\" : \"%s\",\n" +
                                                 "      \"externalId\" : \"%s\",\n" +
                                                 "      \"from\" : \"%s\",\n" +
                                                 "      \"endpoint\" : {\n" +
                                                 "        \"phoneNumber\" : \"%s\",\n" +
                                                 "        \"type\" : \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"status\" : \"%s\",\n" +
                                                 "      \"reason\" : \"%s\"\n" +
                                                 "    }\n" +
                                                 "    ]\n" +
                                                 "  }\n",
                                             givenBulkId,
                                             givenApplicationId1,
                                             givenCallId1,
                                             givenExternalId1,
                                             givenFrom1,
                                             givenPhoneNumber1,
                                             givenType1,
                                             givenStatus1,
                                             givenReason1
        );

        String givenRecordingType = "AUDIO";
        Boolean givenMachineDetectionEnabled = true;
        Integer givenMaxDuration = 28000;
        Integer givenConnectTimeout = 20000;
        Integer givenMaxCalls = 10;
        String givenTimeUnit = "MINUTES";
        Integer givenValidityPeriod = 60;
        Integer givenMinWaitPeriod = 5;
        Integer givenMaxWaitPeriod = 10;
        Integer givenMaxAttempts = 5;
        OffsetDateTime givenStartTimeDateTime = OffsetDateTime.of(2022, 1, 1, 0, 0, 0, 100_000_000, ZoneOffset.ofHours(0));
        String givenStartTime = "2022-01-01T00:00:00.100+0000";
        String givenDays = "MONDAY";
        Integer givenHourFrom = 9;
        Integer givenMinuteFrom = 0;
        Integer givenHourTo = 17;
        Integer givenMinuteTo = 0;
        String givenKey2 = "value2";
        String givenKey1 = "value1";

        String expectedRequest = String.format("{\n" +
                                                   "  \"bulkId\" : \"%s\",\n" +
                                                   "  \"applicationId\" : \"%s\",\n" +
                                                   "  \"items\" : [\n" +
                                                   "  {\n" +
                                                   "    \"from\" : \"%s\",\n" +
                                                   "    \"callRequests\" : [\n" +
                                                   "        {\n" +
                                                   "          \"externalId\" : \"%s\",\n" +
                                                   "          \"endpoint\" : {\n" +
                                                   "            \"phoneNumber\": \"%s\",\n" +
                                                   "            \"type\": \"%s\"\n" +
                                                   "          }\n" +
                                                   "        }\n" +
                                                   "    ],\n" +
                                                   "    \"recording\" : {\n" +
                                                   "      \"recordingType\" : \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"machineDetection\" : {\n" +
                                                   "      \"enabled\" : %b\n" +
                                                   "    },\n" +
                                                   "    \"maxDuration\" : %d,\n" +
                                                   "    \"connectTimeout\" : %s,\n" +
                                                   "    \"callRate\" : {\n" +
                                                   "      \"maxCalls\" : %d,\n" +
                                                   "      \"timeUnit\" : \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"validityPeriod\" : %d,\n" +
                                                   "    \"retryOptions\" : {\n" +
                                                   "      \"minWaitPeriod\" : %d,\n" +
                                                   "      \"maxWaitPeriod\" : %d,\n" +
                                                   "      \"maxAttempts\" : %d\n" +
                                                   "    },\n" +
                                                   "    \"schedulingOptions\" : {\n" +
                                                   "      \"startTime\": \"%s\",\n" +
                                                   "      \"callingTimeWindow\" : {\n" +
                                                   "        \"from\" : {\n" +
                                                   "          \"hour\" : %d,\n" +
                                                   "          \"minute\" : %d\n" +
                                                   "        },\n" +
                                                   "        \"to\" : {\n" +
                                                   "          \"hour\" : %d,\n" +
                                                   "          \"minute\" : %d\n" +
                                                   "        },\n" +
                                                   "        \"days\" : [\n" +
                                                   "          \"%s\"\n" +
                                                   "        ]\n" +
                                                   "      }\n" +
                                                   "    },\n" +
                                                   "    \"customData\" : {\n" +
                                                   "      \"key2\" : \"%s\",\n" +
                                                   "      \"key1\" : \"%s\"\n" +
                                                   "    }\n" +
                                                   "  }\n" +
                                                   "  ]\n" +
                                                   "}\n",
                                               givenBulkId,
                                               givenApplicationId1,
                                               givenFrom1,
                                               givenExternalId1,
                                               givenPhoneNumber1,
                                               givenType1,
                                               givenRecordingType,
                                               givenMachineDetectionEnabled,
                                               givenMaxDuration,
                                               givenConnectTimeout,
                                               givenMaxCalls, givenTimeUnit,
                                               givenValidityPeriod,
                                               givenMinWaitPeriod, givenMaxWaitPeriod, givenMaxAttempts, givenStartTime,
                                               givenHourFrom, givenMinuteFrom, givenHourTo, givenMinuteTo, givenDays,
                                               givenKey2, givenKey1
        );

        setUpPostRequest(
            BULKS,
            expectedRequest,
            givenResponse,
            201
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallBulkResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            var calls = response.getCalls();
            then(calls.size()).isEqualTo(1);

            var call1 = calls.get(0);
            then(call1.getApplicationId()).isEqualTo(givenApplicationId1);
            then(call1.getCallId()).isEqualTo(givenCallId1);
            then(call1.getExternalId()).isEqualTo(givenExternalId1);
            then(call1.getFrom()).isEqualTo(givenFrom1);
            then(call1.getStatus()).isEqualTo(givenStatus1);
            then(call1.getReason()).isEqualTo(givenReason1);
            then(call1.getEndpoint()).isNotNull();
        };

        CallBulkRequest voiceBulkRequest = new CallBulkRequest().bulkId(givenBulkId).applicationId(givenApplicationId1)
                                                                .items(List.of(
                                                                    new CallsBulkItem()
                                                                        .from(givenFrom1)
                                                                        .callRequests(List.of(
                                                                            new CallsBulkCallRequest()
                                                                                .endpoint(new CallsBulkPhoneEndpoint().phoneNumber(givenPhoneNumber1)
                                                                                ).externalId(givenExternalId1)
                                                                        ))
                                                                        .recording(new CallRecordingRequest().recordingType(CallsRecordingType.AUDIO))
                                                                        .machineDetection(new CallsMachineDetectionRequest().enabled(
                                                                            givenMachineDetectionEnabled))
                                                                        .maxDuration(givenMaxDuration)
                                                                        .connectTimeout(givenConnectTimeout)
                                                                        .callRate(new CallRate().maxCalls(givenMaxCalls)
                                                                                                .timeUnit(CallRate.TimeUnitEnum.MINUTES))
                                                                        .validityPeriod(givenValidityPeriod)
                                                                        .retryOptions(new CallsRetryOptions()
                                                                                          .minWaitPeriod(givenMinWaitPeriod)
                                                                                          .maxWaitPeriod(givenMaxWaitPeriod)
                                                                                          .maxAttempts(givenMaxAttempts))
                                                                        .schedulingOptions(new CallsSchedulingOptions()
                                                                                               .startTime(givenStartTimeDateTime)
                                                                                               .callingTimeWindow(new CallsTimeWindow()
                                                                                                                      .from(new CallsTimeWindowPoint().hour(
                                                                                                                                                          givenHourFrom)
                                                                                                                                                      .minute(
                                                                                                                                                          givenMinuteFrom))
                                                                                                                      .to(new CallsTimeWindowPoint().hour(
                                                                                                                          givenHourTo).minute(givenMinuteTo))
                                                                                                                      .days(List.of(CallsTimeWindow.DaysEnum.MONDAY))
                                                                                               ))
                                                                        .customData(Map.of("key2", givenKey2, "key1", givenKey1))
                                                                ));
        var call = api.createBulk(voiceBulkRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBulkStatus() {
        String givenBulkId = "46ab0413-448f-4153-ada9-b68b14242dc3";
        String givenStartTime = "2022-11-01T12:00:00.125Z";
        CallsStatus givenStatus = CallsStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"bulkId\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenStartTime,
                                             givenStatus
        );

        setUpSuccessGetRequest(
            BULK.replace("{bulkId}", givenBulkId),
            Map.of(),
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallBulkStatus> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.getBulkStatus(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRescheduleBulk() {
        String givenBulkId = "46ab0413-448f-4153-ada9-b68b14242dc3";
        String givenStartTime = "2022-11-01T12:00:00.000+0000";
        OffsetDateTime givenStartTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 11, 1, 12, 0, 0, 0),
            ZoneOffset.ofHours(0)
        );
        CallsStatus givenStatus = CallsStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"bulkId\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenStartTime,
                                             givenStatus
        );
        String expectedRequest = String.format("{\n" +
                                                   "  \"startTime\": \"%s\"\n" +
                                                   "}\n",
                                               givenStartTime
        );

        setUpSuccessPostRequest(
            RESCHEDULE_BULK.replace("{bulkId}", givenBulkId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsRescheduleRequest request = new CallsRescheduleRequest()
            .startTime(givenStartTimeDateTime);

        Consumer<CallBulkStatus> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStartTime()).isEqualTo(givenStartTimeDateTime);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.rescheduleBulk(givenBulkId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPauseBulk() {
        String givenBulkId = "46ab0413-448f-4153-ada9-b68b14242dc3";
        String givenStartTime = "2022-11-01T12:00:00.125Z";
        CallsStatus givenStatus = CallsStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"bulkId\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenStartTime,
                                             givenStatus
        );

        setUpEmptyPostRequest(
            PAUSE_BULK.replace("{bulkId}", givenBulkId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallBulkStatus> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.pauseBulk(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldResumeBulk() {
        String givenBulkId = "46ab0413-448f-4153-ada9-b68b14242dc3";
        String givenStartTime = "2022-11-01T12:00:00.125Z";
        CallsStatus givenStatus = CallsStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"bulkId\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenStartTime,
                                             givenStatus
        );

        setUpEmptyPostRequest(
            RESUME_BULK.replace("{bulkId}", givenBulkId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallBulkStatus> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.resumeBulk(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCancelBulk() {
        String givenBulkId = "46ab0413-448f-4153-ada9-b68b14242dc3";
        String givenStartTime = "2022-11-01T12:00:00.125Z";
        CallsStatus givenStatus = CallsStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"bulkId\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenStartTime,
                                             givenStatus
        );

        setUpEmptyPostRequest(
            CANCEL_BULK.replace("{bulkId}", givenBulkId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallBulkStatus> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStartTime()).isEqualTo(givenStartTime);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.cancelBulk(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPostDialogCall() {
        var givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        var givenApplicationId = "61c060db2675060027d8c7a6";
        var givenState = CallsDialogState.ESTABLISHED;
        var givenStartTime = "2022-01-01T00:00:00.100+0000";
        OffsetDateTime givenStartTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 0, 0, 100000000),
            ZoneOffset.ofHours(0)
        );
        var givenEstablishTime = "2022-01-01T00:00:02.100+0000";
        OffsetDateTime givenEstablishTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 0, 2, 100000000),
            ZoneOffset.ofHours(0)
        );
        var givenEndTime = "2022-01-01T00:01:00.100+0000";
        OffsetDateTime givenEndTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 1, 0, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenSecondId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        var givenType = CallEndpointType.PHONE;
        var givenPhoneNumber = "44790123456";
        var givenDirection = CallDirection.INBOUND;
        var givenSecondState = CallState.ESTABLISHED;
        var givenMuted = false;
        var givenDeaf = false;
        var givenCamera = false;
        var givenScreenShare = false;
        var givenSecondStartTime = "2022-01-01T00:00:00.100+0000";
        OffsetDateTime givenSecondStartTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 0, 0, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenAnswerTime = "2022-01-01T00:00:02.100+0000";
        OffsetDateTime givenAnswerTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 0, 2, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenSecondEndTime = "2022-01-01T00:01:00.100+0000";
        OffsetDateTime givenSecondEndTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 1, 0, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenRingDuration = 2;
        var givenSecondApplicationId = "61c060db2675060027d8c7a6";
        var givenDialogId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        var givenThirdId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        var givenSecondType = "PHONE";
        var givenSecondPhoneNumber = "44790987654";
        var givenSecondDirection = CallDirection.OUTBOUND;
        var givenThirdState = CallState.ESTABLISHED;
        var givenSecondMuted = false;
        var givenSecondDeaf = false;
        var givenSecondCamera = false;
        var givenThirdScreenShare = false;
        var givenThirdStartTime = "2022-01-01T00:00:00.100+0000";
        OffsetDateTime givenThirdStartTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 0, 0, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenSecondAnswerTime = "2022-01-01T00:00:02.100+0000";
        OffsetDateTime givenSecondAnswerTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 0, 2, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenThirdEndTime = "2022-01-01T00:01:00.100+0000";
        OffsetDateTime givenThirdEndTimeDateTime = OffsetDateTime.of(
            LocalDateTime.of(2022, 1, 1, 0, 1, 0, 100000000),
            ZoneOffset.ofHours(0)
        );

        var givenSecondRingDuration = 2;
        var givenThirdApplicationId = "61c060db2675060027d8c7a6";
        var givenSecondDialogId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"applicationId\": \"%s\",\n" +
                                                 "  \"state\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"establishTime\": \"%s\",\n" +
                                                 "  \"endTime\": \"%s\",\n" +
                                                 "  \"parentCall\": {\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"type\": \"%s\",\n" +
                                                 "      \"phoneNumber\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"endTime\": \"%s\",\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"dialogId\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"childCall\": {\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"type\": \"%s\",\n" +
                                                 "      \"phoneNumber\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"endTime\": \"%s\",\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"dialogId\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}\n",
                                             givenId,
                                             givenApplicationId,
                                             givenState,
                                             givenStartTime,
                                             givenEstablishTime,
                                             givenEndTime,
                                             givenSecondId,
                                             givenType,
                                             givenPhoneNumber,
                                             givenDirection,
                                             givenSecondState,
                                             givenMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenSecondStartTime,
                                             givenAnswerTime,
                                             givenSecondEndTime,
                                             givenRingDuration,
                                             givenSecondApplicationId,
                                             givenDialogId,
                                             givenThirdId,
                                             givenSecondType,
                                             givenSecondPhoneNumber,
                                             givenSecondDirection,
                                             givenThirdState,
                                             givenSecondMuted,
                                             givenSecondDeaf,
                                             givenSecondCamera,
                                             givenThirdScreenShare,
                                             givenThirdStartTime,
                                             givenSecondAnswerTime,
                                             givenThirdEndTime,
                                             givenSecondRingDuration,
                                             givenThirdApplicationId,
                                             givenSecondDialogId
        );

        var givenParentCallId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        var givenRequestType = CallEndpointType.PHONE;
        var givenRequestPhoneNumber = "44790987654";
        var givenFrom = "44790123456";
        var givenConnectTimeout = 60;
        var givenEnabled = true;
        var givenKey2 = "value2";
        var givenKey1 = "value1";
        var givenRecordingType = CallsRecordingType.AUDIO;
        var givenRequestEnabled = false;
        var givenMaxDuration = 3600;
        var givenChildCallHangup = false;
        var givenCallRinging = false;
        String givenFilePrefix = "filePrefix";
        String givenCustomDataField = "custom";
        String givenCustomDataFieldValue = "data";
        Map<String, String> givenCustomData = Map.of(
            givenCustomDataField, givenCustomDataFieldValue
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"parentCallId\": \"%s\",\n" +
                                                   "  \"childCallRequest\": {\n" +
                                                   "    \"endpoint\": {\n" +
                                                   "      \"type\": \"%s\",\n" +
                                                   "      \"phoneNumber\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"from\": \"%s\",\n" +
                                                   "    \"connectTimeout\": %d,\n" +
                                                   "    \"machineDetection\": {\n" +
                                                   "      \"enabled\": %b\n" +
                                                   "    },\n" +
                                                   "    \"customData\": {\n" +
                                                   "      \"key2\": \"%s\",\n" +
                                                   "      \"key1\": \"%s\"\n" +
                                                   "    }\n" +
                                                   "  },\n" +
                                                   "  \"recording\": {\n" +
                                                   "    \"recordingType\": \"%s\",\n" +
                                                   "    \"dialogComposition\": {\n" +
                                                   "      \"enabled\": %b\n" +
                                                   "    },\n" +
                                                   "    \"customData\": {\n" +
                                                   "        \"%s\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"filePrefix\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"maxDuration\": %d,\n" +
                                                   "  \"propagationOptions\": {\n" +
                                                   "    \"childCallHangup\": %b,\n" +
                                                   "    \"childCallRinging\": %b\n" +
                                                   "  }\n" +
                                                   "}\n",
                                               givenParentCallId,
                                               givenRequestType,
                                               givenRequestPhoneNumber,
                                               givenFrom,
                                               givenConnectTimeout,
                                               givenEnabled,
                                               givenKey2,
                                               givenKey1,
                                               givenRecordingType,
                                               givenRequestEnabled,
                                               givenCustomDataField,
                                               givenCustomDataFieldValue,
                                               givenFilePrefix,
                                               givenMaxDuration,
                                               givenChildCallHangup,
                                               givenCallRinging
        );

        setUpSuccessPostRequest(
            DIALOGS,
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsDialogRequest request = new CallsDialogRequest()
            .parentCallId(givenParentCallId)
            .childCallRequest(new CallsDialogCallRequest()
                                  .endpoint(new CallsPhoneEndpoint()
                                                .phoneNumber(givenRequestPhoneNumber))
                                  .from(givenFrom)
                                  .connectTimeout(givenConnectTimeout)
                                  .machineDetection(new CallsMachineDetectionRequest()
                                                        .enabled(givenEnabled))
                                  .customData(Map.of(
                                      "key2", givenKey2,
                                      "key1", givenKey1
                                  )))
            .recording(new CallsDialogRecordingRequest()
                           .recordingType(CallsRecordingType.AUDIO)
                           .dialogComposition(new CallsDialogRecordingComposition()
                                                  .enabled(givenRequestEnabled))
                           .customData(givenCustomData)
                           .filePrefix(givenFilePrefix))
            .maxDuration(givenMaxDuration)
            .propagationOptions(new CallsDialogPropagationOptions()
                                    .childCallHangup(givenChildCallHangup)
                                    .childCallRinging(givenCallRinging)
            );

        Consumer<CallsDialogResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getState()).isEqualTo(givenState);
            then(response.getStartTime()).isEqualTo(givenStartTimeDateTime);
            then(response.getEstablishTime()).isEqualTo(givenEstablishTimeDateTime);
            then(response.getEndTime()).isEqualTo(givenEndTimeDateTime);
            then(response.getParentCall()).isNotNull();
            then(response.getParentCall().getId()).isEqualTo(givenSecondId);
            then(response.getParentCall().getEndpoint()).isNotNull();
            then(response.getParentCall().getEndpoint().getType()).isEqualTo(givenType);
            then(response.getParentCall().getEndpoint()).isEqualTo(new CallsPhoneEndpoint().phoneNumber(givenPhoneNumber));
            then(response.getParentCall().getDirection()).isEqualTo(givenDirection);
            then(response.getParentCall().getState()).isEqualTo(givenSecondState);
            then(response.getParentCall().getMedia()).isEqualTo(
                new CallsMediaProperties()
                    .audio(new CallsAudioMediaProperties()
                               .muted(givenMuted)
                               .deaf(givenDeaf))
                    .video(new CallsVideoMediaProperties()
                               .camera(givenCamera)
                               .screenShare(givenScreenShare)));
            then(response.getParentCall().getStartTime()).isEqualTo(givenSecondStartTimeDateTime);
            then(response.getParentCall().getAnswerTime()).isEqualTo(givenAnswerTimeDateTime);
            then(response.getParentCall().getEndTime()).isEqualTo(givenSecondEndTimeDateTime);
            then(response.getParentCall().getRingDuration()).isEqualTo(givenRingDuration);
            then(response.getParentCall().getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getParentCall().getDialogId()).isEqualTo(givenDialogId);
            then(response.getChildCall()).isNotNull();
            then(response.getChildCall().getId()).isEqualTo(givenThirdId);
            then(response.getChildCall().getEndpoint()).isEqualTo(new CallsPhoneEndpoint().phoneNumber(givenSecondPhoneNumber));
            then(response.getChildCall().getDirection()).isEqualTo(givenSecondDirection);
            then(response.getChildCall().getState()).isEqualTo(givenThirdState);
            then(response.getChildCall().getMedia()).isEqualTo(
                new CallsMediaProperties()
                    .audio(new CallsAudioMediaProperties()
                               .muted(givenSecondMuted)
                               .deaf(givenSecondDeaf))
                    .video(new CallsVideoMediaProperties()
                               .camera(givenSecondCamera)
                               .screenShare(givenThirdScreenShare)));
            then(response.getChildCall().getStartTime()).isEqualTo(givenThirdStartTimeDateTime);
            then(response.getChildCall().getAnswerTime()).isEqualTo(givenSecondAnswerTimeDateTime);
            then(response.getChildCall().getEndTime()).isEqualTo(givenThirdEndTimeDateTime);
            then(response.getChildCall().getRingDuration()).isEqualTo(givenSecondRingDuration);
            then(response.getChildCall().getApplicationId()).isEqualTo(givenThirdApplicationId);
            then(response.getChildCall().getDialogId()).isEqualTo(givenSecondDialogId);
        };

        var call = api.createDialog(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateDialogWithExistingCalls() {
        String givenId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenApplicationId = "61c060db2675060027d8c7a6";
        CallsDialogState givenState = CallsDialogState.ESTABLISHED;
        String givenStartTime = "2022-01-01T00:00:00.100+0000";
        OffsetDateTime givenStartTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 0, 0, 100_000_000, ZoneOffset.ofHours(0));
        String givenEstablishTime = "2022-01-01T00:00:02.100+0000";
        OffsetDateTime givenEstablishTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 0, 2, 100_000_000, ZoneOffset.ofHours(0));
        String givenEndTime = "2022-01-01T00:01:00.100+0000";
        OffsetDateTime givenEndTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 1, 0, 100_000_000, ZoneOffset.ofHours(0));
        String givenParentId = "d8d84155-3831-43fb-91c9-bb897149a79d";
        CallEndpointType givenType = CallEndpointType.PHONE;
        String givenParentPhoneNumber = "44790123456";
        CallDirection givenDirection = CallDirection.INBOUND;
        CallState givenParentState = CallState.ESTABLISHED;
        Boolean givenMuted = false;
        Boolean givenDeaf = false;
        Boolean givenCamera = false;
        Boolean givenScreenShare = false;
        String givenParentStartTime = "2022-01-01T00:00:00.100+0000";
        OffsetDateTime givenParentStartTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 0, 0, 100_000_000, ZoneOffset.ofHours(0));
        String givenParentAnswerTime = "2022-01-01T00:00:02.100+0000";
        OffsetDateTime givenParentAnswerTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 0, 2, 100_000_000, ZoneOffset.ofHours(0));
        String givenParentEndTime = "2022-01-01T00:01:00.100+0000";
        OffsetDateTime givenParentEndTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 1, 0, 100_000_000, ZoneOffset.ofHours(0));
        Integer givenRingDuration = 2;
        String givenParentApplicationId = "61c060db2675060027d8c7a6";
        String givenDialogId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";
        String givenChildId = "3ad8805e-d401-424e-9b03-e02a2016a5e2";
        String givenChildType = "PHONE";
        String givenChildPhoneNumber = "44790987654";
        CallDirection givenChildDirection = CallDirection.OUTBOUND;
        CallState givenChildState = CallState.ESTABLISHED;
        Boolean givenChildMuted = false;
        Boolean givenChildDeaf = false;
        Boolean givenChildCamera = false;
        Boolean givenChildScreenShare = false;
        String givenChildStartTime = "2022-01-01T00:00:00.100+0000";
        OffsetDateTime givenChildStartTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 0, 0, 100_000_000, ZoneOffset.ofHours(0));
        String givenChildAnswerTime = "2022-01-01T00:00:02.100+0000";
        OffsetDateTime givenChildAnswerTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 0, 2, 100_000_000, ZoneOffset.ofHours(0));
        String givenChildEndTime = "2022-01-01T00:01:00.100+0000";
        OffsetDateTime givenChildEndTimeDate = OffsetDateTime.of(2022, 1, 1, 0, 1, 0, 100_000_000, ZoneOffset.ofHours(0));
        Integer givenChildRingDuration = 2;
        String givenChildApplicationId = "61c060db2675060027d8c7a6";
        String givenChildDialogId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"applicationId\": \"%s\",\n" +
                                                 "  \"state\": \"%s\",\n" +
                                                 "  \"startTime\": \"%s\",\n" +
                                                 "  \"establishTime\": \"%s\",\n" +
                                                 "  \"endTime\": \"%s\",\n" +
                                                 "  \"parentCall\": {\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"type\": \"%s\",\n" +
                                                 "      \"phoneNumber\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"endTime\": \"%s\",\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"dialogId\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"childCall\": {\n" +
                                                 "    \"id\": \"%s\",\n" +
                                                 "    \"endpoint\": {\n" +
                                                 "      \"type\": \"%s\",\n" +
                                                 "      \"phoneNumber\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    \"direction\": \"%s\",\n" +
                                                 "    \"state\": \"%s\",\n" +
                                                 "    \"media\": {\n" +
                                                 "      \"audio\": {\n" +
                                                 "        \"muted\": %b,\n" +
                                                 "        \"deaf\": %b\n" +
                                                 "      },\n" +
                                                 "      \"video\": {\n" +
                                                 "        \"camera\": %b,\n" +
                                                 "        \"screenShare\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    \"startTime\": \"%s\",\n" +
                                                 "    \"answerTime\": \"%s\",\n" +
                                                 "    \"endTime\": \"%s\",\n" +
                                                 "    \"ringDuration\": %d,\n" +
                                                 "    \"applicationId\": \"%s\",\n" +
                                                 "    \"dialogId\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenApplicationId,
                                             givenState,
                                             givenStartTime,
                                             givenEstablishTime,
                                             givenEndTime,
                                             givenParentId,
                                             givenType,
                                             givenParentPhoneNumber,
                                             givenDirection,
                                             givenParentState,
                                             givenMuted,
                                             givenDeaf,
                                             givenCamera,
                                             givenScreenShare,
                                             givenParentStartTime,
                                             givenParentAnswerTime,
                                             givenParentEndTime,
                                             givenRingDuration,
                                             givenParentApplicationId,
                                             givenDialogId,
                                             givenChildId,
                                             givenChildType,
                                             givenChildPhoneNumber,
                                             givenChildDirection,
                                             givenChildState,
                                             givenChildMuted,
                                             givenChildDeaf,
                                             givenChildCamera,
                                             givenChildScreenShare,
                                             givenChildStartTime,
                                             givenChildAnswerTime,
                                             givenChildEndTime,
                                             givenChildRingDuration,
                                             givenChildApplicationId,
                                             givenChildDialogId
        );

        CallsRecordingType expectedRecordingType = CallsRecordingType.AUDIO;
        Boolean expectedEnabled = false;
        String expectedProperty1 = "string";
        String expectedProperty2 = "string";
        String expectedFilePrefix = "string";
        Integer expectedMaxDuration = 28800;
        Boolean expectedChildCallHangup = true;
        Boolean expectedChildCallRinging = false;

        String expectedRequest = String.format("{\n" +
                                                   "  \"recording\": {\n" +
                                                   "    \"recordingType\": \"%s\",\n" +
                                                   "    \"dialogComposition\": {\n" +
                                                   "      \"enabled\": %b\n" +
                                                   "    },\n" +
                                                   "    \"customData\": {\n" +
                                                   "      \"property1\": \"%s\",\n" +
                                                   "      \"property2\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"filePrefix\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"maxDuration\": %d,\n" +
                                                   "  \"propagationOptions\": {\n" +
                                                   "    \"childCallHangup\": %b,\n" +
                                                   "    \"childCallRinging\": %b\n" +
                                                   "  }\n" +
                                                   "}",
                                               expectedRecordingType,
                                               expectedEnabled,
                                               expectedProperty1,
                                               expectedProperty2,
                                               expectedFilePrefix,
                                               expectedMaxDuration,
                                               expectedChildCallHangup,
                                               expectedChildCallRinging
        );

        String givenParentCallId = "126f327b-dd4e-456d-8a10-1cb78a23bc8a";
        String givenChildCallId = "034e622a-cc7e-456d-8a10-0ba43b11aa5e";

        setUpSuccessPostRequest(
            DIALOGS_EXISTING_CALLS.replace("{parentCallId}", givenParentCallId).replace("{childCallId}", givenChildCallId),
            expectedRequest,
            givenResponse
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsDialogRequest = new CallsDialogWithExistingCallRequest()
            .recording(
                new CallsDialogRecordingRequest()
                    .recordingType(expectedRecordingType)
                    .dialogComposition(
                        new CallsDialogRecordingComposition()
                            .enabled(expectedEnabled)
                    )
                    .customData(
                        Map.of(
                            "property1", expectedProperty1,
                            "property2", expectedProperty2
                        )
                    )
                    .filePrefix(expectedFilePrefix)
            )
            .maxDuration(expectedMaxDuration)
            .propagationOptions(
                new CallsDialogPropagationOptions()
                    .childCallHangup(expectedChildCallHangup)
                    .childCallRinging(expectedChildCallRinging)
            );

        Consumer<CallsDialogResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getState()).isEqualTo(givenState);
            then(response.getStartTime()).isEqualTo(givenStartTimeDate);
            then(response.getEstablishTime()).isEqualTo(givenEstablishTimeDate);
            then(response.getEndTime()).isEqualTo(givenEndTimeDate);
            then(response.getParentCall()).isNotNull();
            then(response.getParentCall().getId()).isEqualTo(givenParentId);
            then(response.getParentCall().getEndpoint()).isNotNull();
            then(response.getParentCall().getEndpoint().getType()).isEqualTo(givenType);
            then(response.getParentCall().getEndpoint()).isEqualTo(new CallsPhoneEndpoint().phoneNumber(givenParentPhoneNumber));
            then(response.getParentCall().getDirection()).isEqualTo(givenDirection);
            then(response.getParentCall().getState()).isEqualTo(givenParentState);
            then(response.getParentCall().getMedia()).isEqualTo(
                new CallsMediaProperties()
                    .audio(new CallsAudioMediaProperties()
                               .muted(givenMuted)
                               .deaf(givenDeaf))
                    .video(new CallsVideoMediaProperties()
                               .camera(givenCamera)
                               .screenShare(givenScreenShare)));
            then(response.getParentCall().getStartTime()).isEqualTo(givenParentStartTimeDate);
            then(response.getParentCall().getAnswerTime()).isEqualTo(givenParentAnswerTimeDate);
            then(response.getParentCall().getEndTime()).isEqualTo(givenParentEndTimeDate);
            then(response.getParentCall().getRingDuration()).isEqualTo(givenRingDuration);
            then(response.getParentCall().getApplicationId()).isEqualTo(givenApplicationId);
            then(response.getParentCall().getDialogId()).isEqualTo(givenDialogId);
            then(response.getChildCall()).isNotNull();
            then(response.getChildCall().getId()).isEqualTo(givenChildId);
            then(response.getChildCall().getEndpoint()).isEqualTo(new CallsPhoneEndpoint().phoneNumber(givenChildPhoneNumber));
            then(response.getChildCall().getDirection()).isEqualTo(givenChildDirection);
            then(response.getChildCall().getState()).isEqualTo(givenChildState);
            then(response.getChildCall().getMedia()).isEqualTo(
                new CallsMediaProperties()
                    .audio(new CallsAudioMediaProperties()
                               .muted(givenChildMuted)
                               .deaf(givenChildDeaf))
                    .video(new CallsVideoMediaProperties()
                               .camera(givenChildCamera)
                               .screenShare(givenChildScreenShare)));
            then(response.getChildCall().getStartTime()).isEqualTo(givenChildStartTimeDate);
            then(response.getChildCall().getAnswerTime()).isEqualTo(givenChildAnswerTimeDate);
            then(response.getChildCall().getEndTime()).isEqualTo(givenChildEndTimeDate);
            then(response.getChildCall().getRingDuration()).isEqualTo(givenChildRingDuration);
            then(response.getChildCall().getApplicationId()).isEqualTo(givenChildApplicationId);
            then(response.getChildCall().getDialogId()).isEqualTo(givenChildDialogId);
        };

        var call = api.createDialogWithExistingCalls(givenParentCallId, givenChildCallId, callsDialogRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDialogBroadcastText() {
        CallsActionStatus givenStatus = CallsActionStatus.PENDING;

        String givenResponse = String.format("{\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenStatus
        );

        String expectedText = "This dialog will end in 5 minutes.";
        String expectedRequest = String.format("{\n" +
                                                   "  \"text\": \"%s\"\n" +
                                                   "}",
                                               expectedText
        );

        String givenDialogId = "123";
        setUpPostRequest(
            DIALOGS_BROADCAST_TEXT.replace("{dialogId}", givenDialogId),
            expectedRequest,
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsDialogBroadcastWebrtcTextRequest = new CallsDialogBroadcastWebrtcTextRequest()
            .text(expectedText);

        Consumer<CallsActionResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.dialogBroadcastWebrtcText(givenDialogId, callsDialogBroadcastWebrtcTextRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSipTrunks() {
        String givenId = "string";
        String givenName = "string";
        CallsSipTrunkLocation givenLocation = CallsSipTrunkLocation.SAO_PAULO;
        Boolean givenTls = true;
        CallsAudioCodec givenCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType givenDtmf = CallsDtmfType.RFC2833;
        CallsFaxType givenFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat givenNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean givenInternationalCallsAllowed = true;
        Integer givenChannelLimit = 0;
        CallsAnonymizationType givenAnonymization = CallsAnonymizationType.NONE;
        CallsBillingPackageType givenPackageType = CallsBillingPackageType.METERED;
        String givenAddressId = "string";
        String givenPrimary = "string";
        String givenBackup = "string";
        CallsPegasusSipTrunkType givenType = CallsPegasusSipTrunkType.STATIC;
        Integer givenPage = 0;
        Integer givenSize = 1;
        Integer givenTotalPages = 0;
        Long givenTotalResults = 0L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"location\": \"%s\",\n" +
                                                 "      \"tls\": %b,\n" +
                                                 "      \"codecs\": [\n" +
                                                 "        \"%s\"\n" +
                                                 "      ],\n" +
                                                 "      \"dtmf\": \"%s\",\n" +
                                                 "      \"fax\": \"%s\",\n" +
                                                 "      \"numberFormat\": \"%s\",\n" +
                                                 "      \"internationalCallsAllowed\": %b,\n" +
                                                 "      \"channelLimit\": %d,\n" +
                                                 "      \"anonymization\": \"%s\",\n" +
                                                 "      \"billingPackage\": {\n" +
                                                 "        \"packageType\": \"%s\",\n" +
                                                 "        \"addressId\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"sbcHosts\": {\n" +
                                                 "        \"primary\": [\n" +
                                                 "          \"%s\"\n" +
                                                 "        ],\n" +
                                                 "        \"backup\": [\n" +
                                                 "          \"%s\"\n" +
                                                 "        ]\n" +
                                                 "      },\n" +
                                                 "      \"type\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenLocation,
                                             givenTls,
                                             givenCodecs,
                                             givenDtmf,
                                             givenFax,
                                             givenNumberFormat,
                                             givenInternationalCallsAllowed,
                                             givenChannelLimit,
                                             givenAnonymization,
                                             givenPackageType,
                                             givenAddressId,
                                             givenPrimary,
                                             givenBackup,
                                             givenType,
                                             givenPage,
                                             givenSize,
                                             givenTotalPages,
                                             givenTotalResults
        );

        String givenNameParameter = "My SIP trunk";
        Integer givenPageParameter = 0;
        Integer givenSizeParameter = 20;

        setUpGetRequest(
            SIP_TRUNKS,
            Map.of(
                "name", givenNameParameter,
                "page", givenPageParameter.toString(),
                "size", givenSizeParameter.toString()
            ),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsSipTrunkPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getId()).isEqualTo(givenId);
            then(result.getName()).isEqualTo(givenName);
            then(result.getLocation()).isEqualTo(givenLocation);
            then(result.getTls()).isEqualTo(givenTls);
            then(result.getCodecs().size()).isEqualTo(1);
            then(result.getCodecs().get(0)).isEqualTo(givenCodecs);
            then(result.getDtmf()).isEqualTo(givenDtmf);
            then(result.getFax()).isEqualTo(givenFax);
            then(result.getNumberFormat()).isEqualTo(givenNumberFormat);
            then(result.getInternationalCallsAllowed()).isEqualTo(givenInternationalCallsAllowed);
            then(result.getChannelLimit()).isEqualTo(givenChannelLimit);
            then(result.getAnonymization()).isEqualTo(givenAnonymization);
            then(result.getBillingPackage()).isNotNull();
            var billingPackage = result.getBillingPackage();
            then(billingPackage.getPackageType()).isEqualTo(givenPackageType);
            then(billingPackage.getAddressId()).isEqualTo(givenAddressId);
            then(result.getSbcHosts().getPrimary().get(0)).isEqualTo(givenPrimary);
            then(result.getSbcHosts().getBackup().get(0)).isEqualTo(givenBackup);
            then(result.getType()).isEqualTo(givenType);
            then(response.getPaging()).isNotNull();
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenSize);
            then(paging.getTotalPages()).isEqualTo(givenTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenTotalResults);
        };

        var call = api.getSipTrunks()
                      .name(givenNameParameter)
                      .page(givenPageParameter)
                      .size(givenSizeParameter);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateSipTrunk() {
        String givenId = "string";
        String givenName = "string";
        CallsSipTrunkLocation givenLocation = CallsSipTrunkLocation.SAO_PAULO;
        Boolean givenTls = true;
        CallsAudioCodec givenCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType givenDtmf = CallsDtmfType.RFC2833;
        CallsFaxType givenFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat givenNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean givenInternationalCallsAllowed = true;
        Integer givenChannelLimit = 0;
        CallsAnonymizationType givenAnonymization = CallsAnonymizationType.NONE;
        CallsBillingPackageType givenPackageType = CallsBillingPackageType.METERED;
        String givenAddressId = "string";
        String givenPrimary = "string";
        String givenBackup = "string";
        CallsPegasusSipTrunkType givenType = CallsPegasusSipTrunkType.STATIC;
        String givenSourceHosts = "string";
        String givenDestinationHosts = "string";
        CallsSelectionStrategy givenStrategy = CallsSelectionStrategy.FAILOVER;
        Boolean givenEnabled = false;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"location\": \"%s\",\n" +
                                                 "  \"tls\": %b,\n" +
                                                 "  \"codecs\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"dtmf\": \"%s\",\n" +
                                                 "  \"fax\": \"%s\",\n" +
                                                 "  \"numberFormat\": \"%s\",\n" +
                                                 "  \"internationalCallsAllowed\": %b,\n" +
                                                 "  \"channelLimit\": %d,\n" +
                                                 "  \"anonymization\": \"%s\",\n" +
                                                 "  \"billingPackage\": {\n" +
                                                 "    \"packageType\": \"%s\",\n" +
                                                 "    \"addressId\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"sbcHosts\": {\n" +
                                                 "    \"primary\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ],\n" +
                                                 "    \"backup\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ]\n" +
                                                 "  },\n" +
                                                 "  \"type\": \"%s\",\n" +
                                                 "  \"sourceHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"destinationHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"strategy\": \"%s\",\n" +
                                                 "  \"sipOptions\": {\n" +
                                                 "    \"enabled\": %b\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenLocation,
                                             givenTls,
                                             givenCodecs,
                                             givenDtmf,
                                             givenFax,
                                             givenNumberFormat,
                                             givenInternationalCallsAllowed,
                                             givenChannelLimit,
                                             givenAnonymization,
                                             givenPackageType,
                                             givenAddressId,
                                             givenPrimary,
                                             givenBackup,
                                             givenType,
                                             givenSourceHosts,
                                             givenDestinationHosts,
                                             givenStrategy,
                                             givenEnabled
        );

        String expectedType = "STATIC";
        String expectedName = "string";
        CallsSipTrunkLocation expectedLocation = CallsSipTrunkLocation.SAO_PAULO;
        Boolean expectedTls = false;
        CallsAudioCodec expectedCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType expectedDtmf = CallsDtmfType.RFC2833;
        CallsFaxType expectedFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat expectedNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean expectedInternationalCallsAllowed = false;
        Integer expectedChannelLimit = 0;
        CallsAnonymizationType expectedAnonymization = CallsAnonymizationType.NONE;
        CallsBillingPackageType expectedPackageType = CallsBillingPackageType.METERED;
        String expectedAddressId = "string";
        String expectedSourceHosts = "string";
        String expectedDestinationHosts = "string";
        CallsSelectionStrategy expectedStrategy = CallsSelectionStrategy.FAILOVER;
        Boolean expectedEnabled = false;

        String expectedRequest = String.format("{\n" +
                                                   "  \"type\": \"%s\",\n" +
                                                   "  \"name\": \"%s\",\n" +
                                                   "  \"location\": \"%s\",\n" +
                                                   "  \"tls\": %b,\n" +
                                                   "  \"codecs\": [\n" +
                                                   "    \"%s\"\n" +
                                                   "  ],\n" +
                                                   "  \"dtmf\": \"%s\",\n" +
                                                   "  \"fax\": \"%s\",\n" +
                                                   "  \"numberFormat\": \"%s\",\n" +
                                                   "  \"internationalCallsAllowed\": %b,\n" +
                                                   "  \"channelLimit\": %d,\n" +
                                                   "  \"anonymization\": \"%s\",\n" +
                                                   "  \"billingPackage\": {\n" +
                                                   "    \"packageType\": \"%s\",\n" +
                                                   "    \"addressId\": \"%s\"\n" +
                                                   "  },\n" +
                                                   "  \"sourceHosts\": [\n" +
                                                   "    \"%s\"\n" +
                                                   "  ],\n" +
                                                   "  \"destinationHosts\": [\n" +
                                                   "    \"%s\"\n" +
                                                   "  ],\n" +
                                                   "  \"strategy\": \"%s\",\n" +
                                                   "  \"sipOptions\": {\n" +
                                                   "    \"enabled\": %b\n" +
                                                   "  }\n" +
                                                   "}",
                                               expectedType,
                                               expectedName,
                                               expectedLocation,
                                               expectedTls,
                                               expectedCodecs,
                                               expectedDtmf,
                                               expectedFax,
                                               expectedNumberFormat,
                                               expectedInternationalCallsAllowed,
                                               expectedChannelLimit,
                                               expectedAnonymization,
                                               expectedPackageType,
                                               expectedAddressId,
                                               expectedSourceHosts,
                                               expectedDestinationHosts,
                                               expectedStrategy,
                                               expectedEnabled
        );

        setUpPostRequest(
            SIP_TRUNKS,
            Map.of(),
            expectedRequest,
            givenResponse,
            202
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsStaticSipTrunkRequest callsSipTrunkRequest = (CallsStaticSipTrunkRequest) new CallsStaticSipTrunkRequest()
            .sourceHosts(
                List.of(
                    expectedSourceHosts
                )
            )
            .destinationHosts(
                List.of(
                    expectedDestinationHosts
                )
            )
            .strategy(expectedStrategy)
            .sipOptions(
                new CallsSipOptions()
                    .enabled(expectedEnabled)
            )
            .tls(expectedTls)
            .codecs(
                List.of(
                    expectedCodecs
                )
            )
            .anonymization(expectedAnonymization)
            .dtmf(expectedDtmf)
            .fax(expectedFax)
            .numberFormat(expectedNumberFormat)
            .internationalCallsAllowed(expectedInternationalCallsAllowed)
            .channelLimit(expectedChannelLimit)
            .billingPackage(
                new CallsBillingPackage()
                    .packageType(expectedPackageType)
                    .addressId(expectedAddressId)
            )
            .name(expectedName)
            .location(expectedLocation);

        Consumer<CallsCreateSipTrunkResponse> assertions = (staticResponse) -> {
            CallsCreateStaticSipTrunkResponse response = (CallsCreateStaticSipTrunkResponse) staticResponse;
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getLocation()).isEqualTo(givenLocation);
            then(response.getTls()).isEqualTo(givenTls);
            then(response.getCodecs().size()).isEqualTo(1);
            then(response.getCodecs().get(0)).isEqualTo(givenCodecs);
            then(response.getDtmf()).isEqualTo(givenDtmf);
            then(response.getFax()).isEqualTo(givenFax);
            then(response.getNumberFormat()).isEqualTo(givenNumberFormat);
            then(response.getInternationalCallsAllowed()).isEqualTo(givenInternationalCallsAllowed);
            then(response.getChannelLimit()).isEqualTo(givenChannelLimit);
            then(response.getAnonymization()).isEqualTo(givenAnonymization);
            then(response.getBillingPackage()).isNotNull();
            var billingPackage = response.getBillingPackage();
            then(billingPackage.getPackageType()).isEqualTo(givenPackageType);
            then(billingPackage.getAddressId()).isEqualTo(givenAddressId);
            then(response.getSbcHosts().getPrimary().get(0)).isEqualTo(givenPrimary);
            then(response.getSbcHosts().getBackup().get(0)).isEqualTo(givenBackup);
            then(response.getType()).isEqualTo(givenType);
            then(response).isInstanceOf(CallsCreateStaticSipTrunkResponse.class);
            then(response.getSourceHosts().get(0)).isEqualTo(givenSourceHosts);
            then(response.getDestinationHosts().get(0)).isEqualTo(givenDestinationHosts);
            then(response.getStrategy()).isEqualTo(givenStrategy);
            then(response.getSipOptions().getEnabled()).isEqualTo(givenEnabled);
        };

        var call = api.createSipTrunk(callsSipTrunkRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSipTrunk() {
        String givenId = "string";
        String givenName = "string";
        CallsSipTrunkLocation givenLocation = CallsSipTrunkLocation.SAO_PAULO;
        Boolean givenTls = true;
        CallsAudioCodec givenCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType givenDtmf = CallsDtmfType.RFC2833;
        CallsFaxType givenFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat givenNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean givenInternationalCallsAllowed = true;
        Integer givenChannelLimit = 0;
        CallsAnonymizationType givenAnonymization = CallsAnonymizationType.NONE;
        CallsBillingPackageType givenPackageType = CallsBillingPackageType.METERED;
        String givenAddressId = "string";
        String givenPrimary = "string";
        String givenBackup = "string";
        CallsPegasusSipTrunkType givenType = CallsPegasusSipTrunkType.STATIC;
        String givenSourceHosts = "string";
        String givenDestinationHosts = "string";
        CallsSelectionStrategy givenStrategy = CallsSelectionStrategy.FAILOVER;
        Boolean givenEnabled = false;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"location\": \"%s\",\n" +
                                                 "  \"tls\": %b,\n" +
                                                 "  \"codecs\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"dtmf\": \"%s\",\n" +
                                                 "  \"fax\": \"%s\",\n" +
                                                 "  \"numberFormat\": \"%s\",\n" +
                                                 "  \"internationalCallsAllowed\": %b,\n" +
                                                 "  \"channelLimit\": %d,\n" +
                                                 "  \"anonymization\": \"%s\",\n" +
                                                 "  \"billingPackage\": {\n" +
                                                 "    \"packageType\": \"%s\",\n" +
                                                 "    \"addressId\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"sbcHosts\": {\n" +
                                                 "    \"primary\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ],\n" +
                                                 "    \"backup\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ]\n" +
                                                 "  },\n" +
                                                 "  \"type\": \"%s\",\n" +
                                                 "  \"sourceHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"destinationHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"strategy\": \"%s\",\n" +
                                                 "  \"sipOptions\": {\n" +
                                                 "    \"enabled\": %b\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenLocation,
                                             givenTls,
                                             givenCodecs,
                                             givenDtmf,
                                             givenFax,
                                             givenNumberFormat,
                                             givenInternationalCallsAllowed,
                                             givenChannelLimit,
                                             givenAnonymization,
                                             givenPackageType,
                                             givenAddressId,
                                             givenPrimary,
                                             givenBackup,
                                             givenType,
                                             givenSourceHosts,
                                             givenDestinationHosts,
                                             givenStrategy,
                                             givenEnabled
        );

        String givenSipTrunkId = "123";

        setUpGetRequest(
            SIP_TRUNK.replace("{sipTrunkId}", givenSipTrunkId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsSipTrunkResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getLocation()).isEqualTo(givenLocation);
            then(response.getTls()).isEqualTo(givenTls);
            then(response.getCodecs().size()).isEqualTo(1);
            then(response.getCodecs().get(0)).isEqualTo(givenCodecs);
            then(response.getDtmf()).isEqualTo(givenDtmf);
            then(response.getFax()).isEqualTo(givenFax);
            then(response.getNumberFormat()).isEqualTo(givenNumberFormat);
            then(response.getInternationalCallsAllowed()).isEqualTo(givenInternationalCallsAllowed);
            then(response.getChannelLimit()).isEqualTo(givenChannelLimit);
            then(response.getAnonymization()).isEqualTo(givenAnonymization);
            then(response.getBillingPackage()).isNotNull();
            var billingPackage = response.getBillingPackage();
            then(billingPackage.getPackageType()).isEqualTo(givenPackageType);
            then(billingPackage.getAddressId()).isEqualTo(givenAddressId);
            then(response.getSbcHosts().getPrimary().get(0)).isEqualTo(givenPrimary);
            then(response.getSbcHosts().getBackup().get(0)).isEqualTo(givenBackup);
            then(response.getType()).isEqualTo(givenType);
            then(response).isInstanceOf(CallsStaticSipTrunkResponse.class);
            CallsStaticSipTrunkResponse staticResponse = (CallsStaticSipTrunkResponse) response;
            then(staticResponse.getSourceHosts().get(0)).isEqualTo(givenSourceHosts);
            then(staticResponse.getDestinationHosts().get(0)).isEqualTo(givenDestinationHosts);
            then(staticResponse.getStrategy()).isEqualTo(givenStrategy);
            then(staticResponse.getSipOptions().getEnabled()).isEqualTo(givenEnabled);
        };

        var call = api.getSipTrunk(givenSipTrunkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateSipTrunk() {
        String givenId = "string";
        String givenName = "string";
        CallsSipTrunkLocation givenLocation = CallsSipTrunkLocation.SAO_PAULO;
        Boolean givenTls = true;
        CallsAudioCodec givenCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType givenDtmf = CallsDtmfType.RFC2833;
        CallsFaxType givenFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat givenNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean givenInternationalCallsAllowed = true;
        Integer givenChannelLimit = 0;
        CallsAnonymizationType givenAnonymization = CallsAnonymizationType.NONE;
        CallsBillingPackageType givenPackageType = CallsBillingPackageType.METERED;
        String givenAddressId = "string";
        String givenPrimary = "string";
        String givenBackup = "string";
        CallsPegasusSipTrunkType givenType = CallsPegasusSipTrunkType.STATIC;
        String givenSourceHosts = "string";
        String givenDestinationHosts = "string";
        CallsSelectionStrategy givenStrategy = CallsSelectionStrategy.FAILOVER;
        Boolean givenEnabled = false;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"location\": \"%s\",\n" +
                                                 "  \"tls\": %b,\n" +
                                                 "  \"codecs\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"dtmf\": \"%s\",\n" +
                                                 "  \"fax\": \"%s\",\n" +
                                                 "  \"numberFormat\": \"%s\",\n" +
                                                 "  \"internationalCallsAllowed\": %b,\n" +
                                                 "  \"channelLimit\": %d,\n" +
                                                 "  \"anonymization\": \"%s\",\n" +
                                                 "  \"billingPackage\": {\n" +
                                                 "    \"packageType\": \"%s\",\n" +
                                                 "    \"addressId\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"sbcHosts\": {\n" +
                                                 "    \"primary\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ],\n" +
                                                 "    \"backup\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ]\n" +
                                                 "  },\n" +
                                                 "  \"type\": \"%s\",\n" +
                                                 "  \"sourceHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"destinationHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"strategy\": \"%s\",\n" +
                                                 "  \"sipOptions\": {\n" +
                                                 "    \"enabled\": %b\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenLocation,
                                             givenTls,
                                             givenCodecs,
                                             givenDtmf,
                                             givenFax,
                                             givenNumberFormat,
                                             givenInternationalCallsAllowed,
                                             givenChannelLimit,
                                             givenAnonymization,
                                             givenPackageType,
                                             givenAddressId,
                                             givenPrimary,
                                             givenBackup,
                                             givenType,
                                             givenSourceHosts,
                                             givenDestinationHosts,
                                             givenStrategy,
                                             givenEnabled
        );

        CallsPegasusSipTrunkType expectedType = CallsPegasusSipTrunkType.STATIC;
        String expectedName = "string";
        CallsAudioCodec expectedCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType expectedDtmf = CallsDtmfType.RFC2833;
        CallsFaxType expectedFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat expectedNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean expectedInternationalCallsAllowed = false;
        Integer expectedChannelLimit = 0;
        CallsAnonymizationType expectedAnonymization = CallsAnonymizationType.NONE;
        String expectedSourceHosts = "string";
        String expectedDestinationHosts = "string";
        CallsSelectionStrategy expectedStrategy = CallsSelectionStrategy.FAILOVER;
        Boolean expectedEnabled = false;

        String expectedRequest = String.format("{\n" +
                                                   "  \"type\": \"%s\",\n" +
                                                   "  \"name\": \"%s\",\n" +
                                                   "  \"codecs\": [\n" +
                                                   "    \"%s\"\n" +
                                                   "  ],\n" +
                                                   "  \"dtmf\": \"%s\",\n" +
                                                   "  \"fax\": \"%s\",\n" +
                                                   "  \"numberFormat\": \"%s\",\n" +
                                                   "  \"internationalCallsAllowed\": %b,\n" +
                                                   "  \"channelLimit\": %d,\n" +
                                                   "  \"anonymization\": \"%s\",\n" +
                                                   "  \"sourceHosts\": [\n" +
                                                   "    \"%s\"\n" +
                                                   "  ],\n" +
                                                   "  \"destinationHosts\": [\n" +
                                                   "    \"%s\"\n" +
                                                   "  ],\n" +
                                                   "  \"strategy\": \"%s\",\n" +
                                                   "  \"sipOptions\": {\n" +
                                                   "    \"enabled\": %b\n" +
                                                   "  }\n" +
                                                   "}",
                                               expectedType,
                                               expectedName,
                                               expectedCodecs,
                                               expectedDtmf,
                                               expectedFax,
                                               expectedNumberFormat,
                                               expectedInternationalCallsAllowed,
                                               expectedChannelLimit,
                                               expectedAnonymization,
                                               expectedSourceHosts,
                                               expectedDestinationHosts,
                                               expectedStrategy,
                                               expectedEnabled
        );

        String givenSipTrunkId = "123";

        setUpPutRequest(
            SIP_TRUNK.replace("{sipTrunkId}", givenSipTrunkId),
            Map.of(),
            expectedRequest,
            givenResponse,
            202
        );

        CallsApi api = new CallsApi(getApiClient());

        CallsStaticSipTrunkUpdateRequest callsSipTrunkUpdateRequest = (CallsStaticSipTrunkUpdateRequest) new CallsStaticSipTrunkUpdateRequest()
            .sourceHosts(
                List.of(
                    expectedSourceHosts
                )
            )
            .destinationHosts(
                List.of(
                    expectedDestinationHosts
                )
            )
            .strategy(expectedStrategy)
            .sipOptions(
                new CallsSipOptions()
                    .enabled(expectedEnabled)
            )
            .name(expectedName)
            .codecs(
                List.of(
                    expectedCodecs
                )
            )
            .dtmf(expectedDtmf)
            .fax(expectedFax)
            .numberFormat(expectedNumberFormat)
            .internationalCallsAllowed(expectedInternationalCallsAllowed)
            .channelLimit(expectedChannelLimit)
            .anonymization(expectedAnonymization);

        Consumer<CallsSipTrunkResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getLocation()).isEqualTo(givenLocation);
            then(response.getTls()).isEqualTo(givenTls);
            then(response.getCodecs().size()).isEqualTo(1);
            then(response.getCodecs().get(0)).isEqualTo(givenCodecs);
            then(response.getDtmf()).isEqualTo(givenDtmf);
            then(response.getFax()).isEqualTo(givenFax);
            then(response.getNumberFormat()).isEqualTo(givenNumberFormat);
            then(response.getInternationalCallsAllowed()).isEqualTo(givenInternationalCallsAllowed);
            then(response.getChannelLimit()).isEqualTo(givenChannelLimit);
            then(response.getAnonymization()).isEqualTo(givenAnonymization);
            then(response.getBillingPackage()).isNotNull();
            var billingPackage = response.getBillingPackage();
            then(billingPackage.getPackageType()).isEqualTo(givenPackageType);
            then(billingPackage.getAddressId()).isEqualTo(givenAddressId);
            then(response.getSbcHosts().getPrimary().get(0)).isEqualTo(givenPrimary);
            then(response.getSbcHosts().getBackup().get(0)).isEqualTo(givenBackup);
            then(response.getType()).isEqualTo(givenType);
            then(response).isInstanceOf(CallsStaticSipTrunkResponse.class);
            CallsStaticSipTrunkResponse staticResponse = (CallsStaticSipTrunkResponse) response;
            then(staticResponse.getSourceHosts().get(0)).isEqualTo(givenSourceHosts);
            then(staticResponse.getDestinationHosts().get(0)).isEqualTo(givenDestinationHosts);
            then(staticResponse.getStrategy()).isEqualTo(givenStrategy);
            then(staticResponse.getSipOptions().getEnabled()).isEqualTo(givenEnabled);
        };

        var call = api.updateSipTrunk(givenSipTrunkId, callsSipTrunkUpdateRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteSipTrunk() {
        String givenId = "string";
        String givenName = "string";
        CallsSipTrunkLocation givenLocation = CallsSipTrunkLocation.SAO_PAULO;
        Boolean givenTls = true;
        CallsAudioCodec givenCodecs = CallsAudioCodec.PCMU;
        CallsDtmfType givenDtmf = CallsDtmfType.RFC2833;
        CallsFaxType givenFax = CallsFaxType.NONE;
        CallsNumberPresentationFormat givenNumberFormat = CallsNumberPresentationFormat.E164;
        Boolean givenInternationalCallsAllowed = true;
        Integer givenChannelLimit = 0;
        CallsAnonymizationType givenAnonymization = CallsAnonymizationType.NONE;
        CallsBillingPackageType givenPackageType = CallsBillingPackageType.METERED;
        String givenAddressId = "string";
        String givenPrimary = "string";
        String givenBackup = "string";
        CallsPegasusSipTrunkType givenType = CallsPegasusSipTrunkType.STATIC;
        String givenSourceHosts = "string";
        String givenDestinationHosts = "string";
        CallsSelectionStrategy givenStrategy = CallsSelectionStrategy.FAILOVER;
        Boolean givenEnabled = false;

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"location\": \"%s\",\n" +
                                                 "  \"tls\": %b,\n" +
                                                 "  \"codecs\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"dtmf\": \"%s\",\n" +
                                                 "  \"fax\": \"%s\",\n" +
                                                 "  \"numberFormat\": \"%s\",\n" +
                                                 "  \"internationalCallsAllowed\": %b,\n" +
                                                 "  \"channelLimit\": %d,\n" +
                                                 "  \"anonymization\": \"%s\",\n" +
                                                 "  \"billingPackage\": {\n" +
                                                 "    \"packageType\": \"%s\",\n" +
                                                 "    \"addressId\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"sbcHosts\": {\n" +
                                                 "    \"primary\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ],\n" +
                                                 "    \"backup\": [\n" +
                                                 "      \"%s\"\n" +
                                                 "    ]\n" +
                                                 "  },\n" +
                                                 "  \"type\": \"%s\",\n" +
                                                 "  \"sourceHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"destinationHosts\": [\n" +
                                                 "    \"%s\"\n" +
                                                 "  ],\n" +
                                                 "  \"strategy\": \"%s\",\n" +
                                                 "  \"sipOptions\": {\n" +
                                                 "    \"enabled\": %b\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenLocation,
                                             givenTls,
                                             givenCodecs,
                                             givenDtmf,
                                             givenFax,
                                             givenNumberFormat,
                                             givenInternationalCallsAllowed,
                                             givenChannelLimit,
                                             givenAnonymization,
                                             givenPackageType,
                                             givenAddressId,
                                             givenPrimary,
                                             givenBackup,
                                             givenType,
                                             givenSourceHosts,
                                             givenDestinationHosts,
                                             givenStrategy,
                                             givenEnabled
        );

        String givenSipTrunkId = "123";

        setUpNoRequestBodyDeleteRequest(
            SIP_TRUNK.replace("{sipTrunkId}", givenSipTrunkId),
            Map.of(),
            givenResponse,
            202
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsSipTrunkResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getLocation()).isEqualTo(givenLocation);
            then(response.getTls()).isEqualTo(givenTls);
            then(response.getCodecs().size()).isEqualTo(1);
            then(response.getCodecs().get(0)).isEqualTo(givenCodecs);
            then(response.getDtmf()).isEqualTo(givenDtmf);
            then(response.getFax()).isEqualTo(givenFax);
            then(response.getNumberFormat()).isEqualTo(givenNumberFormat);
            then(response.getInternationalCallsAllowed()).isEqualTo(givenInternationalCallsAllowed);
            then(response.getChannelLimit()).isEqualTo(givenChannelLimit);
            then(response.getAnonymization()).isEqualTo(givenAnonymization);
            then(response.getBillingPackage()).isNotNull();
            var billingPackage = response.getBillingPackage();
            then(billingPackage.getPackageType()).isEqualTo(givenPackageType);
            then(billingPackage.getAddressId()).isEqualTo(givenAddressId);
            then(response.getSbcHosts().getPrimary().get(0)).isEqualTo(givenPrimary);
            then(response.getSbcHosts().getBackup().get(0)).isEqualTo(givenBackup);
            then(response.getType()).isEqualTo(givenType);
            then(response).isInstanceOf(CallsStaticSipTrunkResponse.class);
            CallsStaticSipTrunkResponse staticResponse = (CallsStaticSipTrunkResponse) response;
            then(staticResponse.getSourceHosts().get(0)).isEqualTo(givenSourceHosts);
            then(staticResponse.getDestinationHosts().get(0)).isEqualTo(givenDestinationHosts);
            then(staticResponse.getStrategy()).isEqualTo(givenStrategy);
            then(staticResponse.getSipOptions().getEnabled()).isEqualTo(givenEnabled);
        };

        var call = api.deleteSipTrunk(givenSipTrunkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSipTrunkStatus() {
        CallsSipTrunkAdminStatus givenAdminStatus = CallsSipTrunkAdminStatus.ENABLED;
        CallsSipTrunkActionStatus givenActionStatus = CallsSipTrunkActionStatus.CREATING;
        String givenActionReason = "string";
        Integer givenActiveCalls = 0;

        String givenResponse = String.format("{\n" +
                                                 "  \"adminStatus\": \"%s\",\n" +
                                                 "  \"actionStatus\": {\n" +
                                                 "    \"status\": \"%s\",\n" +
                                                 "    \"reason\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"activeCalls\": %d\n" +
                                                 "}",
                                             givenAdminStatus,
                                             givenActionStatus,
                                             givenActionReason,
                                             givenActiveCalls
        );

        String givenSipTrunkId = "123";

        setUpGetRequest(
            SIP_TRUNK_STATUS.replace("{sipTrunkId}", givenSipTrunkId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsExtendedSipTrunkStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getAdminStatus()).isEqualTo(givenAdminStatus);
            then(response.getActionStatus().getStatus()).isEqualTo(givenActionStatus);
            then(response.getActionStatus().getReason()).isEqualTo(givenActionReason);
            then(response.getActiveCalls()).isEqualTo(givenActiveCalls);
        };

        var call = api.getSipTrunkStatus(givenSipTrunkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSetSipTrunkStatus() {
        CallsSipTrunkAdminStatus givenAdminStatus = CallsSipTrunkAdminStatus.ENABLED;

        String givenResponse = String.format("{\n" +
                                                 "  \"adminStatus\": \"%s\"\n" +
                                                 "}",
                                             givenAdminStatus
        );

        CallsSipTrunkAdminStatus expectedAdminStatus = CallsSipTrunkAdminStatus.ENABLED;

        String expectedRequest = String.format("{\n" +
                                                   "  \"adminStatus\": \"%s\"\n" +
                                                   "}",
                                               expectedAdminStatus
        );

        String givenSipTrunkId = "123";

        setUpPostRequest(
            SIP_TRUNK_STATUS.replace("{sipTrunkId}", givenSipTrunkId),
            Map.of(),
            expectedRequest,
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsSipTrunkStatusRequest = new CallsSipTrunkStatusRequest()
            .adminStatus(expectedAdminStatus);

        Consumer<CallsSipTrunkStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getAdminStatus()).isEqualTo(givenAdminStatus);
        };

        var call = api.setSipTrunkStatus(givenSipTrunkId, callsSipTrunkStatusRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSipTrunkServiceAddresses() {
        String givenId = "abc-def-ghi";
        String givenName = "Location address name";
        String givenStreet = "Location address street";
        String givenCity = "My city";
        String givenPostCode = "71000";
        String givenSuite = "1030";
        String givenCountryName = "Croatia";
        String givenCountryCode = "HRV";
        String givenRegionName = "Zagreb County";
        String givenRegionCode = "HR-01";
        Integer givenPage = 0;
        Integer givenSize = 20;
        Integer givenTotalPages = 1;
        Long givenTotalResults = 1L;

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"id\": \"%s\",\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"street\": \"%s\",\n" +
                                                 "      \"city\": \"%s\",\n" +
                                                 "      \"postCode\": \"%s\",\n" +
                                                 "      \"suite\": \"%s\",\n" +
                                                 "      \"country\": {\n" +
                                                 "        \"name\": \"%s\",\n" +
                                                 "        \"code\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"region\": {\n" +
                                                 "        \"name\": \"%s\",\n" +
                                                 "        \"code\": \"%s\"\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ],\n" +
                                                 "  \"paging\": {\n" +
                                                 "    \"page\": %d,\n" +
                                                 "    \"size\": %d,\n" +
                                                 "    \"totalPages\": %d,\n" +
                                                 "    \"totalResults\": %d\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenStreet,
                                             givenCity,
                                             givenPostCode,
                                             givenSuite,
                                             givenCountryName,
                                             givenCountryCode,
                                             givenRegionName,
                                             givenRegionCode,
                                             givenPage,
                                             givenSize,
                                             givenTotalPages,
                                             givenTotalResults
        );

        Integer givenPageParameter = 0;
        Integer givenSizeParameter = 20;

        setUpGetRequest(
            SIP_TRUNK_SERVICE_ADDRESSES,
            Map.of(
                "page", "0",
                "size", "20"
            ),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsSipTrunkServiceAddressPage> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getId()).isEqualTo(givenId);
            then(result.getName()).isEqualTo(givenName);
            then(result.getCity()).isEqualTo(givenCity);
            then(result.getPostCode()).isEqualTo(givenPostCode);
            then(result.getSuite()).isEqualTo(givenSuite);
            then(result.getCountry()).isNotNull();
            var country = result.getCountry();
            then(country.getName()).isEqualTo(givenCountryName);
            then(country.getCode()).isEqualTo(givenCountryCode);
            then(result.getCountry()).isNotNull();
            var region = result.getRegion();
            then(region.getName()).isEqualTo(givenRegionName);
            then(region.getCode()).isEqualTo(givenRegionCode);
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenSize);
            then(paging.getTotalPages()).isEqualTo(givenTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenTotalResults);
        };

        var call = api.getSipTrunkServiceAddresses()
                      .page(givenPageParameter)
                      .size(givenSizeParameter);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateSipTrunkServiceAddress() {
        String givenId = "abc-def-ghi";
        String givenName = "Location address name";
        String givenStreet = "Location address street";
        String givenCity = "My city";
        String givenPostCode = "71000";
        String givenSuite = "1030";
        String givenCountryName = "Croatia";
        String givenCountryCode = "HRV";
        String givenRegionName = "Zagreb County";
        String givenRegionCode = "HR-01";

        String givenResponse = String.format(" {\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"street\": \"%s\",\n" +
                                                 "  \"city\": \"%s\",\n" +
                                                 "  \"postCode\": \"%s\",\n" +
                                                 "  \"suite\": \"%s\",\n" +
                                                 "  \"country\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"region\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenStreet,
                                             givenCity,
                                             givenPostCode,
                                             givenSuite,
                                             givenCountryName,
                                             givenCountryCode,
                                             givenRegionName,
                                             givenRegionCode
        );

        String expectedName = "Location address name";
        String expectedStreet = "Location address street";
        String expectedCity = "My city";
        String expectedPostCode = "71000";
        String expectedSuite = "1030";
        String expectedCountryCode = "HRV";
        String expectedCountryRegionCode = "HR-01";

        String expectedRequest = String.format("{\n" +
                                                   "  \"name\": \"%s\",\n" +
                                                   "  \"street\": \"%s\",\n" +
                                                   "  \"city\": \"%s\",\n" +
                                                   "  \"postCode\": \"%s\",\n" +
                                                   "  \"suite\": \"%s\",\n" +
                                                   "  \"countryCode\": \"%s\",\n" +
                                                   "  \"countryRegionCode\": \"%s\"\n" +
                                                   "}",
                                               expectedName,
                                               expectedStreet,
                                               expectedCity,
                                               expectedPostCode,
                                               expectedSuite,
                                               expectedCountryCode,
                                               expectedCountryRegionCode
        );

        setUpPostRequest(
            SIP_TRUNK_SERVICE_ADDRESSES,
            expectedRequest,
            givenResponse,
            201
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsPublicSipTrunkServiceAddressRequest = new CallsPublicSipTrunkServiceAddressRequest()
            .name(expectedName)
            .street(expectedStreet)
            .city(expectedCity)
            .postCode(expectedPostCode)
            .suite(expectedSuite)
            .countryCode(expectedCountryCode)
            .countryRegionCode(expectedCountryRegionCode);

        Consumer<CallsPublicSipTrunkServiceAddress> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getStreet()).isEqualTo(givenStreet);
            then(response.getCity()).isEqualTo(givenCity);
            then(response.getPostCode()).isEqualTo(givenPostCode);
            then(response.getSuite()).isEqualTo(givenSuite);
            then(response.getCountry()).isNotNull();
            var country = response.getCountry();
            then(country.getName()).isEqualTo(givenCountryName);
            then(country.getCode()).isEqualTo(givenCountryCode);
            then(response.getRegion()).isNotNull();
            var region = response.getRegion();
            then(region.getName()).isEqualTo(givenRegionName);
            then(region.getCode()).isEqualTo(givenRegionCode);
        };

        var call = api.createSipTrunkServiceAddress(callsPublicSipTrunkServiceAddressRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSipTrunkServiceAddress() {
        String givenId = "abc-def-ghi";
        String givenName = "Location address name";
        String givenStreet = "Location address street";
        String givenCity = "My city";
        String givenPostCode = "71000";
        String givenSuite = "1030";
        String givenCountryName = "Croatia";
        String givenCountryCode = "HRV";
        String givenRegionName = "Zagreb County";
        String givenRegionCode = "HR-01";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"street\": \"%s\",\n" +
                                                 "  \"city\": \"%s\",\n" +
                                                 "  \"postCode\": \"%s\",\n" +
                                                 "  \"suite\": \"%s\",\n" +
                                                 "  \"country\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"region\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenStreet,
                                             givenCity,
                                             givenPostCode,
                                             givenSuite,
                                             givenCountryName,
                                             givenCountryCode,
                                             givenRegionName,
                                             givenRegionCode
        );

        String givenSipTrunkServiceAddressId = "123";

        setUpGetRequest(
            SIP_TRUNK_SERVICE_ADDRESS.replace("{sipTrunkServiceAddressId}", givenSipTrunkServiceAddressId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsPublicSipTrunkServiceAddress> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCity()).isEqualTo(givenCity);
            then(response.getPostCode()).isEqualTo(givenPostCode);
            then(response.getSuite()).isEqualTo(givenSuite);
            then(response.getCountry()).isNotNull();
            var country = response.getCountry();
            then(country.getName()).isEqualTo(givenCountryName);
            then(country.getCode()).isEqualTo(givenCountryCode);
            then(response.getCountry()).isNotNull();
            var region = response.getRegion();
            then(region.getName()).isEqualTo(givenRegionName);
            then(region.getCode()).isEqualTo(givenRegionCode);
        };

        var call = api.getSipTrunkServiceAddress(givenSipTrunkServiceAddressId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateSipTrunkServiceAddress() {
        String givenId = "abc-def-ghi";
        String givenName = "Location address name";
        String givenStreet = "Location address street";
        String givenCity = "My city";
        String givenPostCode = "71000";
        String givenSuite = "1030";
        String givenCountryName = "Croatia";
        String givenCountryCode = "HRV";
        String givenRegionName = "Zagreb County";
        String givenRegionCode = "HR-01";

        String givenResponse = String.format(" {\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"street\": \"%s\",\n" +
                                                 "  \"city\": \"%s\",\n" +
                                                 "  \"postCode\": \"%s\",\n" +
                                                 "  \"suite\": \"%s\",\n" +
                                                 "  \"country\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"region\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenStreet,
                                             givenCity,
                                             givenPostCode,
                                             givenSuite,
                                             givenCountryName,
                                             givenCountryCode,
                                             givenRegionName,
                                             givenRegionCode
        );

        String expectedName = "Location address name";
        String expectedStreet = "Location address street";
        String expectedCity = "My city";
        String expectedPostCode = "71000";
        String expectedSuite = "1030";
        String expectedCountryCode = "HRV";
        String expectedCountryRegionCode = "HR-01";

        String expectedRequest = String.format("{\n" +
                                                   "  \"name\": \"%s\",\n" +
                                                   "  \"street\": \"%s\",\n" +
                                                   "  \"city\": \"%s\",\n" +
                                                   "  \"postCode\": \"%s\",\n" +
                                                   "  \"suite\": \"%s\",\n" +
                                                   "  \"countryCode\": \"%s\",\n" +
                                                   "  \"countryRegionCode\": \"%s\"\n" +
                                                   "}",
                                               expectedName,
                                               expectedStreet,
                                               expectedCity,
                                               expectedPostCode,
                                               expectedSuite,
                                               expectedCountryCode,
                                               expectedCountryRegionCode
        );

        String givenSipTrunkServiceAddressId = "123";

        setUpPutRequest(
            SIP_TRUNK_SERVICE_ADDRESS.replace("{sipTrunkServiceAddressId}", givenSipTrunkServiceAddressId),
            Map.of(),
            expectedRequest,
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        var callsPublicSipTrunkServiceAddressRequest = new CallsPublicSipTrunkServiceAddressRequest()
            .name(expectedName)
            .street(expectedStreet)
            .city(expectedCity)
            .postCode(expectedPostCode)
            .suite(expectedSuite)
            .countryCode(expectedCountryCode)
            .countryRegionCode(expectedCountryRegionCode);

        Consumer<CallsPublicSipTrunkServiceAddress> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getStreet()).isEqualTo(givenStreet);
            then(response.getCity()).isEqualTo(givenCity);
            then(response.getPostCode()).isEqualTo(givenPostCode);
            then(response.getSuite()).isEqualTo(givenSuite);
            then(response.getCountry()).isNotNull();
            var country = response.getCountry();
            then(country.getName()).isEqualTo(givenCountryName);
            then(country.getCode()).isEqualTo(givenCountryCode);
            then(response.getRegion()).isNotNull();
            var region = response.getRegion();
            then(region.getName()).isEqualTo(givenRegionName);
            then(region.getCode()).isEqualTo(givenRegionCode);
        };

        var call = api.updateSipTrunkServiceAddress(givenSipTrunkServiceAddressId, callsPublicSipTrunkServiceAddressRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteSipTrunkServiceAddress() {
        String givenId = "abc-def-ghi";
        String givenName = "Location address name";
        String givenStreet = "Location address street";
        String givenCity = "My city";
        String givenPostCode = "71000";
        String givenSuite = "1030";
        String givenCountryName = "Croatia";
        String givenCountryCode = "HRV";
        String givenRegionName = "Zagreb County";
        String givenRegionCode = "HR-01";

        String givenResponse = String.format("{\n" +
                                                 "  \"id\": \"%s\",\n" +
                                                 "  \"name\": \"%s\",\n" +
                                                 "  \"street\": \"%s\",\n" +
                                                 "  \"city\": \"%s\",\n" +
                                                 "  \"postCode\": \"%s\",\n" +
                                                 "  \"suite\": \"%s\",\n" +
                                                 "  \"country\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  },\n" +
                                                 "  \"region\": {\n" +
                                                 "    \"name\": \"%s\",\n" +
                                                 "    \"code\": \"%s\"\n" +
                                                 "  }\n" +
                                                 "}",
                                             givenId,
                                             givenName,
                                             givenStreet,
                                             givenCity,
                                             givenPostCode,
                                             givenSuite,
                                             givenCountryName,
                                             givenCountryCode,
                                             givenRegionName,
                                             givenRegionCode
        );

        String givenSipTrunkServiceAddressId = "123";

        setUpNoRequestBodyDeleteRequest(
            SIP_TRUNK_SERVICE_ADDRESS.replace("{sipTrunkServiceAddressId}", givenSipTrunkServiceAddressId),
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsPublicSipTrunkServiceAddress> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCity()).isEqualTo(givenCity);
            then(response.getPostCode()).isEqualTo(givenPostCode);
            then(response.getSuite()).isEqualTo(givenSuite);
            then(response.getCountry()).isNotNull();
            var country = response.getCountry();
            then(country.getName()).isEqualTo(givenCountryName);
            then(country.getCode()).isEqualTo(givenCountryCode);
            then(response.getCountry()).isNotNull();
            var region = response.getRegion();
            then(region.getName()).isEqualTo(givenRegionName);
            then(region.getCode()).isEqualTo(givenRegionCode);
        };

        var call = api.deleteSipTrunkServiceAddress(givenSipTrunkServiceAddressId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCountries() {
        String givenName1 = "New Zealand";
        String givenCode1 = "NZL";
        String givenName2 = "Fiji";
        String givenCode2 = "FJI";
        String givenName3 = "Guadeloupe";
        String givenCode3 = "GLP";

        String givenResponse = String.format("{\n" +
                                                 " \"countries\":\n" +
                                                 "  [\n" +
                                                 "   {\n" +
                                                 "     \"name\": \"%s\",\n" +
                                                 "     \"code\": \"%s\"\n" +
                                                 "   },\n" +
                                                 "   {\n" +
                                                 "     \"name\": \"%s\",\n" +
                                                 "     \"code\": \"%s\"\n" +
                                                 "   },\n" +
                                                 "   {\n" +
                                                 "     \"name\": \"%s\",\n" +
                                                 "     \"code\": \"%s\"\n" +
                                                 "   }\n" +
                                                 "  ]\n" +
                                                 "}",
                                             givenName1,
                                             givenCode1,
                                             givenName2,
                                             givenCode2,
                                             givenName3,
                                             givenCode3
        );

        setUpGetRequest(
            SIP_TRUNK_COUNTRIES,
            Map.of(),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsCountryList> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getCountries().size()).isEqualTo(3);
            var country1 = response.getCountries().get(0);
            then(country1.getName()).isEqualTo(givenName1);
            then(country1.getCode()).isEqualTo(givenCode1);
            var country2 = response.getCountries().get(1);
            then(country2.getName()).isEqualTo(givenName2);
            then(country2.getCode()).isEqualTo(givenCode2);
            var country3 = response.getCountries().get(2);
            then(country3.getName()).isEqualTo(givenName3);
            then(country3.getCode()).isEqualTo(givenCode3);
        };

        var call = api.getCountries();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetRegions() {
        String givenName1 = "Dubrovnik-Neretva County";
        String givenCode1 = "HR-19";
        String givenCountryCode1 = "HRV";
        String givenName2 = "Međimurje County";
        String givenCode2 = "HR-20";
        String givenCountryCode2 = "HRV";
        String givenName3 = "City of Zagreb";
        String givenCode3 = "HR-21";
        String givenCountryCode3 = "HRV";

        String givenResponse = String.format("{ \"regions\":\n" +
                                                 "  [\n" +
                                                 "    {\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"code\": \"%s\",\n" +
                                                 "      \"countryCode\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    {\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"code\": \"%s\",\n" +
                                                 "      \"countryCode\": \"%s\"\n" +
                                                 "    },\n" +
                                                 "    {\n" +
                                                 "      \"name\": \"%s\",\n" +
                                                 "      \"code\": \"%s\",\n" +
                                                 "      \"countryCode\": \"%s\"\n" +
                                                 "    }\n" +
                                                 "  ]\n" +
                                                 "}",
                                             givenName1,
                                             givenCode1,
                                             givenCountryCode1,
                                             givenName2,
                                             givenCode2,
                                             givenCountryCode2,
                                             givenName3,
                                             givenCode3,
                                             givenCountryCode3
        );

        String givenCountryCode = "HRV";

        setUpGetRequest(
            SIP_TRUNK_REGIONS,
            Map.of(
                "countryCode", givenCountryCode
            ),
            givenResponse,
            200
        );

        CallsApi api = new CallsApi(getApiClient());

        Consumer<CallsRegionList> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getRegions().size()).isEqualTo(3);
            var region1 = response.getRegions().get(0);
            then(region1.getName()).isEqualTo(givenName1);
            then(region1.getCode()).isEqualTo(givenCode1);
            then(region1.getCountryCode()).isEqualTo(givenCountryCode1);
            var region2 = response.getRegions().get(1);
            then(region2.getName()).isEqualTo(givenName2);
            then(region2.getCode()).isEqualTo(givenCode2);
            then(region2.getCountryCode()).isEqualTo(givenCountryCode2);
            var region3 = response.getRegions().get(2);
            then(region3.getName()).isEqualTo(givenName3);
            then(region3.getCode()).isEqualTo(givenCode3);
            then(region3.getCountryCode()).isEqualTo(givenCountryCode3);
        };

        var call = api.getRegions(givenCountryCode);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

}
