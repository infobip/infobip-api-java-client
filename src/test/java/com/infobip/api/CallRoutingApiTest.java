package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class CallRoutingApiTest extends ApiTest {

    private static final String ROUTES = "/callrouting/1/routes";
    private static final String ROUTE = "/callrouting/1/routes/{routeId}";
    private static final String ROUTE_STATUS = "/callrouting/1/routes/{routeId}/status";
    private static final String ROUTE_SIMULATE = "/callrouting/1/routes/simulate";
    private static final String RECORDINGS = "/callrouting/1/recordings";

    @Test
    void shouldGetCallRoutes() {
        var givenId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenName = "SIP endpoint route";
        var givenDestinationsValueUsername = "41793026834";
        var givenDestinationsValueSipTrunkId = "string";
        var givenDestinationsValueCustomHeadersString = "string";
        var givenDestinationsValueType = "SIP";
        var givenDestinationsConnectTimeout = 30;
        var givenDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenDestinationsRecordingRecordingCompositionEnabled = true;
        var givenDestinationsRecordingCustomDataString = "string";
        var givenDestinationsRecordingFilePrefix = "string";
        var givenDestinationsType = "ENDPOINT";

        var givenSecondId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenSecondName = "Phone endpoint route";
        var givenSecondDestinationsValuePhoneNumber = "41793026834";
        var givenSecondDestinationsValueType = "PHONE";
        var givenSecondDestinationsConnectTimeout = 30;
        var givenSecondDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenSecondDestinationsRecordingRecordingCompositionEnabled = true;
        var givenSecondDestinationsRecordingCustomDataString = "string";
        var givenSecondDestinationsRecordingFilePrefix = "string";
        var givenSecondDestinationsType = "ENDPOINT";

        var givenPagingPage = 0;
        var givenPagingSize = 20;
        var givenPagingTotalPages = 1;
        var givenPagingTotalResults = 2L;

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"phoneNumber\": \"%s\",\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "  }\n"
                        + "}\n",
                givenId,
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType,
                givenSecondId,
                givenSecondName,
                givenSecondDestinationsValuePhoneNumber,
                givenSecondDestinationsValueType,
                givenSecondDestinationsConnectTimeout,
                givenSecondDestinationsRecordingRecordingType,
                givenSecondDestinationsRecordingRecordingCompositionEnabled,
                givenSecondDestinationsRecordingCustomDataString,
                givenSecondDestinationsRecordingFilePrefix,
                givenSecondDestinationsType,
                givenPagingPage,
                givenPagingSize,
                givenPagingTotalPages,
                givenPagingTotalResults);

        setUpSuccessGetRequest(ROUTES, Map.of(), givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var expectedResponse = new CallRoutingRouteResponsePage()
                .addResultsItem(new CallRoutingRouteResponse()
                        .id(givenId)
                        .name(givenName)
                        .destinations(List.of(new CallRoutingEndpointDestination()
                                .value(new CallRoutingSipEndpoint()
                                        .username(givenDestinationsValueUsername)
                                        .sipTrunkId(givenDestinationsValueSipTrunkId)
                                        .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                                .connectTimeout(givenDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                        .filePrefix(givenDestinationsRecordingFilePrefix)))))
                .addResultsItem(new CallRoutingRouteResponse()
                        .id(givenSecondId)
                        .name(givenSecondName)
                        .destinations(List.of(new CallRoutingEndpointDestination()
                                .value(new CallRoutingPhoneEndpoint()
                                        .phoneNumber(givenSecondDestinationsValuePhoneNumber))
                                .connectTimeout(givenSecondDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenSecondDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenSecondDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of("string", givenSecondDestinationsRecordingCustomDataString))
                                        .filePrefix(givenSecondDestinationsRecordingFilePrefix)))))
                .paging(new PageInfo()
                        .page(givenPagingPage)
                        .size(givenPagingSize)
                        .totalPages(givenPagingTotalPages)
                        .totalResults(givenPagingTotalResults));

        Consumer<CallRoutingRouteResponsePage> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = callRoutingApi.getCallRoutes();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPostCallRoute() {
        var givenId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenName = "SIP endpoint route";
        var givenDestinationsValueUsername = "41793026834";
        var givenDestinationsValueSipTrunkId = "string";
        var givenDestinationsValueCustomHeadersString = "string";
        var givenDestinationsValueType = "SIP";
        var givenDestinationsConnectTimeout = 30;
        var givenDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenDestinationsRecordingRecordingCompositionEnabled = true;
        var givenDestinationsRecordingCustomDataString = "string";
        var givenDestinationsRecordingFilePrefix = "string";
        var givenDestinationsType = "ENDPOINT";

        String expectedRequest = String.format(
                "{\n" + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n",
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType);

        String givenResponse = String.format(
                "{\n" + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n",
                givenId,
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType);

        setUpSuccessPostRequest(ROUTES, expectedRequest, givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteRequest()
                .name(givenName)
                .destinations(List.of(new CallRoutingEndpointDestination()
                        .value(new CallRoutingSipEndpoint()
                                .username(givenDestinationsValueUsername)
                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                        .connectTimeout(givenDestinationsConnectTimeout)
                        .recording(new CallRoutingRecording()
                                .recordingType(givenDestinationsRecordingRecordingType)
                                .recordingComposition(new CallRoutingRecordingComposition()
                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                .filePrefix(givenDestinationsRecordingFilePrefix))));

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(new CallRoutingEndpointDestination()
                        .value(new CallRoutingSipEndpoint()
                                .username(givenDestinationsValueUsername)
                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                        .connectTimeout(givenDestinationsConnectTimeout)
                        .recording(new CallRoutingRecording()
                                .recordingType(givenDestinationsRecordingRecordingType)
                                .recordingComposition(new CallRoutingRecordingComposition()
                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                .filePrefix(givenDestinationsRecordingFilePrefix))));
        Consumer<CallRoutingRouteResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = callRoutingApi.createCallRoute(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallRoute() {
        var givenId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenName = "SIP endpoint route";
        var givenDestinationsValueUsername = "41793026834";
        var givenDestinationsValueSipTrunkId = "string";
        var givenDestinationsValueCustomHeadersString = "string";
        var givenDestinationsValueType = "SIP";
        var givenDestinationsConnectTimeout = 30;
        var givenDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenDestinationsRecordingRecordingCompositionEnabled = true;
        var givenDestinationsRecordingCustomDataString = "string";
        var givenDestinationsRecordingFilePrefix = "string";
        var givenDestinationsType = "ENDPOINT";

        String givenResponse = String.format(
                "{\n" + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n",
                givenId,
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType);

        setUpSuccessGetRequest(ROUTE.replace("{routeId}", givenId), Map.of(), givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(new CallRoutingEndpointDestination()
                        .value(new CallRoutingSipEndpoint()
                                .username(givenDestinationsValueUsername)
                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                        .connectTimeout(givenDestinationsConnectTimeout)
                        .recording(new CallRoutingRecording()
                                .recordingType(givenDestinationsRecordingRecordingType)
                                .recordingComposition(new CallRoutingRecordingComposition()
                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                .filePrefix(givenDestinationsRecordingFilePrefix))));
        Consumer<CallRoutingRouteResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = callRoutingApi.getCallRoute(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPutCallRoute() {
        var givenId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenName = "SIP endpoint route";
        var givenDestinationsValueUsername = "41793026834";
        var givenDestinationsValueSipTrunkId = "string";
        var givenDestinationsValueCustomHeadersString = "string";
        var givenDestinationsValueType = "SIP";
        var givenDestinationsConnectTimeout = 30;
        var givenDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenDestinationsRecordingRecordingCompositionEnabled = true;
        var givenDestinationsRecordingCustomDataString = "string";
        var givenDestinationsRecordingFilePrefix = "string";
        var givenDestinationsType = "ENDPOINT";

        String expectedRequest = String.format(
                "{\n" + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n",
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType);

        String givenResponse = String.format(
                "{\n" + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n",
                givenId,
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType);

        setUpSuccessPutRequest(ROUTE.replace("{routeId}", givenId), Map.of(), expectedRequest, givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteRequest()
                .name(givenName)
                .destinations(List.of(new CallRoutingEndpointDestination()
                        .value(new CallRoutingSipEndpoint()
                                .username(givenDestinationsValueUsername)
                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                        .connectTimeout(givenDestinationsConnectTimeout)
                        .recording(new CallRoutingRecording()
                                .recordingType(givenDestinationsRecordingRecordingType)
                                .recordingComposition(new CallRoutingRecordingComposition()
                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                .filePrefix(givenDestinationsRecordingFilePrefix))));

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(new CallRoutingEndpointDestination()
                        .value(new CallRoutingSipEndpoint()
                                .username(givenDestinationsValueUsername)
                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                        .connectTimeout(givenDestinationsConnectTimeout)
                        .recording(new CallRoutingRecording()
                                .recordingType(givenDestinationsRecordingRecordingType)
                                .recordingComposition(new CallRoutingRecordingComposition()
                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                .filePrefix(givenDestinationsRecordingFilePrefix))));
        Consumer<CallRoutingRouteResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = callRoutingApi.updateCallRoute(givenId, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCallRoute() {
        var givenId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenName = "SIP endpoint route";
        var givenDestinationsValueUsername = "41793026834";
        var givenDestinationsValueSipTrunkId = "string";
        var givenDestinationsValueCustomHeadersString = "string";
        var givenDestinationsValueType = "SIP";
        var givenDestinationsConnectTimeout = 30;
        var givenDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenDestinationsRecordingRecordingCompositionEnabled = true;
        var givenDestinationsRecordingCustomDataString = "string";
        var givenDestinationsRecordingFilePrefix = "string";
        var givenDestinationsType = "ENDPOINT";

        String givenResponse = String.format(
                "{\n" + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"value\": {\n"
                        + "            \"username\": \"%s\",\n"
                        + "            \"sipTrunkId\": \"%s\",\n"
                        + "            \"customHeaders\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"type\": \"%s\"\n"
                        + "          },\n"
                        + "          \"connectTimeout\": %d,\n"
                        + "          \"recording\": {\n"
                        + "            \"recordingType\": \"%s\",\n"
                        + "            \"recordingComposition\": {\n"
                        + "              \"enabled\": %b\n"
                        + "            },\n"
                        + "            \"customData\": {\n"
                        + "              \"string\": \"%s\"\n"
                        + "            },\n"
                        + "            \"filePrefix\": \"%s\"\n"
                        + "          },\n"
                        + "          \"type\": \"%s\"\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n",
                givenId,
                givenName,
                givenDestinationsValueUsername,
                givenDestinationsValueSipTrunkId,
                givenDestinationsValueCustomHeadersString,
                givenDestinationsValueType,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled,
                givenDestinationsRecordingCustomDataString,
                givenDestinationsRecordingFilePrefix,
                givenDestinationsType);

        setUpNoRequestBodyDeleteRequest(ROUTE.replace("{routeId}", givenId), Map.of(), givenResponse, 200);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(new CallRoutingEndpointDestination()
                        .value(new CallRoutingSipEndpoint()
                                .username(givenDestinationsValueUsername)
                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                .customHeaders(Map.of("string", givenDestinationsRecordingCustomDataString)))
                        .connectTimeout(givenDestinationsConnectTimeout)
                        .recording(new CallRoutingRecording()
                                .recordingType(givenDestinationsRecordingRecordingType)
                                .recordingComposition(new CallRoutingRecordingComposition()
                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                .customData(Map.of("string", givenDestinationsRecordingCustomDataString))
                                .filePrefix(givenDestinationsRecordingFilePrefix))));
        Consumer<CallRoutingRouteResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = callRoutingApi.deleteCallRoute(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSimulateRouteSelection() {
        var givenTo = "41793012345";
        var givenFrom = "41793026234";
        var givenUseDisabledRoutes = false;
        var givenId = "f8fc8aca-786d-4943-9af2-e7ec01b5e80d";
        var givenName = "Sample Route Name";
        var givenDestinationsValuePhoneNumber = "41793026834";
        var givenDestinationsConnectTimeout = 30;
        var givenDestinationsRecordingRecordingType = CallRoutingRecordingType.AUDIO;
        var givenDestinationsRecordingRecordingCompositionEnabled = true;

        String expectedRequest = String.format(
                "{\n" + "  \"to\": \"%s\",\n"
                        + "  \"useDisabledRoutes\": %b,\n"
                        + "  \"endpoint\": {\n"
                        + "    \"from\": \"%s\",\n"
                        + "    \"type\": \"PHONE\"\n"
                        + "  }\n"
                        + "}",
                givenTo, givenUseDisabledRoutes, givenFrom);

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"destinations\": [\n"
                        + "    {\n"
                        + "      \"value\": {\n"
                        + "        \"phoneNumber\": \"%s\",\n"
                        + "        \"type\": \"PHONE\"\n"
                        + "      },\n"
                        + "      \"connectTimeout\": %d,\n"
                        + "      \"recording\": {\n"
                        + "        \"recordingType\": \"%s\",\n"
                        + "        \"recordingComposition\": {\n"
                        + "          \"enabled\": %b\n"
                        + "        }\n"
                        + "      },\n"
                        + "      \"type\": \"ENDPOINT\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenId,
                givenName,
                givenDestinationsValuePhoneNumber,
                givenDestinationsConnectTimeout,
                givenDestinationsRecordingRecordingType,
                givenDestinationsRecordingRecordingCompositionEnabled);

        setUpSuccessPostRequest(ROUTE_SIMULATE, expectedRequest, givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteSimulatorRequest()
                .to(givenTo)
                .useDisabledRoutes(givenUseDisabledRoutes)
                .endpoint(new CallRoutingSimulatorPhoneEndpoint().from(givenFrom));

        Consumer<CallRoutingRouteResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getDestinations()).isNotNull();
            then(response.getDestinations().size()).isEqualTo(1);
        };

        var call = callRoutingApi.simulateRouteSelection(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateCallRouteStatus() {
        var givenRouteId = "56b3e3ea-e91f-44ed-9d57-c7f05cd358ba";
        var givenName = "SIP endpoint route";
        var givenDestinationsValuePhoneNumber = "41793026834";
        var givenDestinationsConnectTimeout = 30;

        String expectedRequest = "{\n" + "  \"routeStatus\": \"ENABLED\"\n" + "}";

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"destinations\": [\n"
                        + "    {\n"
                        + "      \"value\": {\n"
                        + "        \"phoneNumber\": \"%s\",\n"
                        + "        \"type\": \"PHONE\"\n"
                        + "      },\n"
                        + "      \"connectTimeout\": %d,\n"
                        + "      \"type\": \"ENDPOINT\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenRouteId, givenName, givenDestinationsValuePhoneNumber, givenDestinationsConnectTimeout);

        setUpSuccessPostRequest(ROUTE_STATUS.replace("{routeId}", givenRouteId), expectedRequest, givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteStatusRequest().routeStatus(CallRoutingRouteStatus.ENABLED);

        Consumer<CallRoutingRouteResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenRouteId);
            then(response.getName()).isEqualTo(givenName);
        };

        var call = callRoutingApi.updateCallRouteStatus(givenRouteId, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSetOrderCallRoute() {
        var givenRouteId = "56b3e3ea-e91f-44ed-9d57-c7f05cd358ba";
        var givenOrder = 1;
        var givenName = "SIP endpoint route";
        var givenDestinationsValuePhoneNumber = "41793026834";
        var givenDestinationsConnectTimeout = 30;

        String expectedRequest = String.format("{\n" + "  \"order\": %d\n" + "}", givenOrder);

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"destinations\": [\n"
                        + "    {\n"
                        + "      \"value\": {\n"
                        + "        \"phoneNumber\": \"%s\",\n"
                        + "        \"type\": \"PHONE\"\n"
                        + "      },\n"
                        + "      \"connectTimeout\": %d,\n"
                        + "      \"type\": \"ENDPOINT\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"order\": %d\n"
                        + "}",
                givenRouteId,
                givenName,
                givenDestinationsValuePhoneNumber,
                givenDestinationsConnectTimeout,
                givenOrder);

        setUpPatchRequest(ROUTE.replace("{routeId}", givenRouteId), Map.of(), expectedRequest, givenResponse, 200);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteOrderRequest().order(givenOrder);

        Consumer<CallRoutingRouteResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenRouteId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getOrder()).isEqualTo(givenOrder);
        };

        var call = callRoutingApi.setOrderCallRoute(givenRouteId, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSearchCallRoutingRecordings() {
        var givenRouteId = "edef623d-0e1a-4a83-91e5-73c75ed31473";
        var givenRouteName = "Route with recording";
        var givenCorrelationId = "8fdbf7d9-9889-4c2e-8f16-246d5fe066de";
        var givenPagingPage = 0;
        var givenPagingSize = 20;
        var givenPagingTotalPages = 1;
        var givenPagingTotalResults = 1L;

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"application\": {\n"
                        + "        \"routeId\": \"%s\",\n"
                        + "        \"routeName\": \"%s\",\n"
                        + "        \"correlationId\": \"%s\",\n"
                        + "        \"type\": \"CALL_ROUTING\"\n"
                        + "      },\n"
                        + "      \"recording\": {\n"
                        + "        \"composedFiles\": [],\n"
                        + "        \"callRecordings\": []\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "  }\n"
                        + "}",
                givenRouteId,
                givenRouteName,
                givenCorrelationId,
                givenPagingPage,
                givenPagingSize,
                givenPagingTotalPages,
                givenPagingTotalResults);

        setUpSuccessGetRequest(RECORDINGS, Map.of(), givenResponse);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        Consumer<CallRoutingCallRoutingRecordingPage> assertions = response -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getApplication()).isNotNull();
            then(result.getApplication()).isInstanceOf(CallRoutingCallRoutingApplication.class);
            var app = (CallRoutingCallRoutingApplication) result.getApplication();
            then(app.getRouteId()).isEqualTo(givenRouteId);
            then(app.getRouteName()).isEqualTo(givenRouteName);
            then(app.getCorrelationId()).isEqualTo(givenCorrelationId);
            then(result.getRecording()).isNotNull();
            var paging = response.getPaging();
            then(paging).isNotNull();
            then(paging.getPage()).isEqualTo(givenPagingPage);
            then(paging.getSize()).isEqualTo(givenPagingSize);
            then(paging.getTotalPages()).isEqualTo(givenPagingTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenPagingTotalResults);
        };

        var call = callRoutingApi.searchCallRoutingRecording();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteRecordingByCorrelationId() {
        var givenCorrelationId = "d8d84155-3831-43fb-91c9-bb897149a79d";

        String givenResponse = "{\n" + "  \"correlationId\": \"" + givenCorrelationId + "\"\n" + "}";

        setUpNoRequestBodyDeleteRequest(RECORDINGS, Map.of("correlationId", givenCorrelationId), givenResponse, 200);

        var callRoutingApi = new CallRoutingApi(getApiClient());

        Consumer<CallRoutingRecordingApiResponse> assertions = response -> {
            then(response).isNotNull();
        };

        var call = callRoutingApi.deleteByCorrelationId(givenCorrelationId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
