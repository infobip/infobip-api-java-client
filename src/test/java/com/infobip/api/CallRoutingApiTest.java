package com.infobip.api;

import com.infobip.api.CallRoutingApi;
import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.assertj.core.api.BDDAssertions.then;

class CallRoutingApiTest extends ApiTest {
    private static final String ROUTES = "/callrouting/1/routes";
    private static final String ROUTE = "/callrouting/1/routes/{routeId}";


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

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"destinations\": [\n" +
                                             "        {\n" +
                                             "          \"value\": {\n" +
                                             "            \"username\": \"%s\",\n" +
                                             "            \"sipTrunkId\": \"%s\",\n" +
                                             "            \"customHeaders\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"type\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"connectTimeout\": %d,\n" +
                                             "          \"recording\": {\n" +
                                             "            \"recordingType\": \"%s\",\n" +
                                             "            \"recordingComposition\": {\n" +
                                             "              \"enabled\": %b\n" +
                                             "            },\n" +
                                             "            \"customData\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"filePrefix\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"type\": \"%s\"\n" +
                                             "        }\n" +
                                             "      ]\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"destinations\": [\n" +
                                             "        {\n" +
                                             "          \"value\": {\n" +
                                             "            \"phoneNumber\": \"%s\",\n" +
                                             "            \"type\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"connectTimeout\": %d,\n" +
                                             "          \"recording\": {\n" +
                                             "            \"recordingType\": \"%s\",\n" +
                                             "            \"recordingComposition\": {\n" +
                                             "              \"enabled\": %b\n" +
                                             "            },\n" +
                                             "            \"customData\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"filePrefix\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"type\": \"%s\"\n" +
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
                                             givenPagingTotalResults
        );

        setUpSuccessGetRequest(
                ROUTES,
                Map.of(),
                givenResponse
        );

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var expectedResponse = new CallRoutingRouteResponsePage()
                .addResultsItem(new CallRoutingRouteResponse()
                        .id(givenId)
                        .name(givenName)
                        .destinations(List.of(
                                new CallRoutingEndpointDestination()
                                        .value(new CallRoutingSipEndpoint()
                                                .username(givenDestinationsValueUsername)
                                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                                .customHeaders(Map.of(
                                                        "string", givenDestinationsRecordingCustomDataString
                                                )))
                                        .connectTimeout(givenDestinationsConnectTimeout)
                                        .recording(new CallRoutingRecording()
                                                .recordingType(givenDestinationsRecordingRecordingType)
                                                .recordingComposition(new CallRoutingRecordingComposition()
                                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                                .customData(Map.of(
                                                        "string", givenDestinationsRecordingCustomDataString
                                                ))
                                                .filePrefix(givenDestinationsRecordingFilePrefix))
                        )))
                .addResultsItem(new CallRoutingRouteResponse()
                        .id(givenSecondId)
                        .name(givenSecondName)
                        .destinations(List.of(
                                new CallRoutingEndpointDestination()
                                        .value(new CallRoutingPhoneEndpoint().phoneNumber(givenSecondDestinationsValuePhoneNumber))
                                        .connectTimeout(givenSecondDestinationsConnectTimeout)
                                        .recording(new CallRoutingRecording()
                                                .recordingType(givenSecondDestinationsRecordingRecordingType)
                                                .recordingComposition(new CallRoutingRecordingComposition()
                                                        .enabled(givenSecondDestinationsRecordingRecordingCompositionEnabled))
                                                .customData(Map.of(
                                                        "string", givenSecondDestinationsRecordingCustomDataString
                                                ))
                                                .filePrefix(givenSecondDestinationsRecordingFilePrefix))
                        )))
                .paging(new PageInfo()
                        .page(givenPagingPage)
                        .size(givenPagingSize)
                        .totalPages(givenPagingTotalPages)
                        .totalResults(givenPagingTotalResults)
                );

        Consumer<CallRoutingRouteResponsePage> assertions = response -> then(response).isEqualTo(expectedResponse);

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

        String expectedRequest = String.format("{\n" +
                                               "      \"name\": \"%s\",\n" +
                                               "      \"destinations\": [\n" +
                                               "        {\n" +
                                               "          \"value\": {\n" +
                                               "            \"username\": \"%s\",\n" +
                                               "            \"sipTrunkId\": \"%s\",\n" +
                                               "            \"customHeaders\": {\n" +
                                               "              \"string\": \"%s\"\n" +
                                               "            },\n" +
                                               "            \"type\": \"%s\"\n" +
                                               "          },\n" +
                                               "          \"connectTimeout\": %d,\n" +
                                               "          \"recording\": {\n" +
                                               "            \"recordingType\": \"%s\",\n" +
                                               "            \"recordingComposition\": {\n" +
                                               "              \"enabled\": %b\n" +
                                               "            },\n" +
                                               "            \"customData\": {\n" +
                                               "              \"string\": \"%s\"\n" +
                                               "            },\n" +
                                               "            \"filePrefix\": \"%s\"\n" +
                                               "          },\n" +
                                               "          \"type\": \"%s\"\n" +
                                               "        }\n" +
                                               "      ]\n" +
                                               "    }\n",
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
                                               givenDestinationsType
        );

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"destinations\": [\n" +
                                             "        {\n" +
                                             "          \"value\": {\n" +
                                             "            \"username\": \"%s\",\n" +
                                             "            \"sipTrunkId\": \"%s\",\n" +
                                             "            \"customHeaders\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"type\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"connectTimeout\": %d,\n" +
                                             "          \"recording\": {\n" +
                                             "            \"recordingType\": \"%s\",\n" +
                                             "            \"recordingComposition\": {\n" +
                                             "              \"enabled\": %b\n" +
                                             "            },\n" +
                                             "            \"customData\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"filePrefix\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"type\": \"%s\"\n" +
                                             "        }\n" +
                                             "      ]\n" +
                                             "    }\n",
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
                                             givenDestinationsType
        );

        setUpSuccessPostRequest(
                ROUTES,
                expectedRequest,
                givenResponse
        );

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteRequest()
                .name(givenName)
                .destinations(List.of(
                        new CallRoutingEndpointDestination()
                                .value(new CallRoutingSipEndpoint()
                                        .username(givenDestinationsValueUsername)
                                        .sipTrunkId(givenDestinationsValueSipTrunkId)
                                        .customHeaders(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        )))
                                .connectTimeout(givenDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        ))
                                        .filePrefix(givenDestinationsRecordingFilePrefix))
                ));

        var expectedResponse = new CallRoutingRouteResponse()
                        .id(givenId)
                        .name(givenName)
                        .destinations(List.of(
                                new CallRoutingEndpointDestination()
                                        .value(new CallRoutingSipEndpoint()
                                                .username(givenDestinationsValueUsername)
                                                .sipTrunkId(givenDestinationsValueSipTrunkId)
                                                .customHeaders(Map.of(
                                                        "string", givenDestinationsRecordingCustomDataString
                                                )))
                                        .connectTimeout(givenDestinationsConnectTimeout)
                                        .recording(new CallRoutingRecording()
                                                .recordingType(givenDestinationsRecordingRecordingType)
                                                .recordingComposition(new CallRoutingRecordingComposition()
                                                        .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                                .customData(Map.of(
                                                        "string", givenDestinationsRecordingCustomDataString
                                                ))
                                                .filePrefix(givenDestinationsRecordingFilePrefix))
                        ));
        Consumer<CallRoutingRouteResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

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

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"destinations\": [\n" +
                                             "        {\n" +
                                             "          \"value\": {\n" +
                                             "            \"username\": \"%s\",\n" +
                                             "            \"sipTrunkId\": \"%s\",\n" +
                                             "            \"customHeaders\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"type\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"connectTimeout\": %d,\n" +
                                             "          \"recording\": {\n" +
                                             "            \"recordingType\": \"%s\",\n" +
                                             "            \"recordingComposition\": {\n" +
                                             "              \"enabled\": %b\n" +
                                             "            },\n" +
                                             "            \"customData\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"filePrefix\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"type\": \"%s\"\n" +
                                             "        }\n" +
                                             "      ]\n" +
                                             "    }\n",
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
                                             givenDestinationsType
        );

        setUpSuccessGetRequest(
                ROUTE.replace("{routeId}", givenId),
                Map.of(),
                givenResponse
        );

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(
                        new CallRoutingEndpointDestination()
                                .value(new CallRoutingSipEndpoint()
                                        .username(givenDestinationsValueUsername)
                                        .sipTrunkId(givenDestinationsValueSipTrunkId)
                                        .customHeaders(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        )))
                                .connectTimeout(givenDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        ))
                                        .filePrefix(givenDestinationsRecordingFilePrefix))
                ));
        Consumer<CallRoutingRouteResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

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

        String expectedRequest = String.format("{\n" +
                                               "      \"name\": \"%s\",\n" +
                                               "      \"destinations\": [\n" +
                                               "        {\n" +
                                               "          \"value\": {\n" +
                                               "            \"username\": \"%s\",\n" +
                                               "            \"sipTrunkId\": \"%s\",\n" +
                                               "            \"customHeaders\": {\n" +
                                               "              \"string\": \"%s\"\n" +
                                               "            },\n" +
                                               "            \"type\": \"%s\"\n" +
                                               "          },\n" +
                                               "          \"connectTimeout\": %d,\n" +
                                               "          \"recording\": {\n" +
                                               "            \"recordingType\": \"%s\",\n" +
                                               "            \"recordingComposition\": {\n" +
                                               "              \"enabled\": %b\n" +
                                               "            },\n" +
                                               "            \"customData\": {\n" +
                                               "              \"string\": \"%s\"\n" +
                                               "            },\n" +
                                               "            \"filePrefix\": \"%s\"\n" +
                                               "          },\n" +
                                               "          \"type\": \"%s\"\n" +
                                               "        }\n" +
                                               "      ]\n" +
                                               "    }\n",
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
                                               givenDestinationsType
        );

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"destinations\": [\n" +
                                             "        {\n" +
                                             "          \"value\": {\n" +
                                             "            \"username\": \"%s\",\n" +
                                             "            \"sipTrunkId\": \"%s\",\n" +
                                             "            \"customHeaders\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"type\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"connectTimeout\": %d,\n" +
                                             "          \"recording\": {\n" +
                                             "            \"recordingType\": \"%s\",\n" +
                                             "            \"recordingComposition\": {\n" +
                                             "              \"enabled\": %b\n" +
                                             "            },\n" +
                                             "            \"customData\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"filePrefix\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"type\": \"%s\"\n" +
                                             "        }\n" +
                                             "      ]\n" +
                                             "    }\n",
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
                                             givenDestinationsType
        );

        setUpSuccessPutRequest(
                ROUTE.replace("{routeId}", givenId),
                Map.of(),
                expectedRequest,
                givenResponse
        );

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var request = new CallRoutingRouteRequest()
                .name(givenName)
                .destinations(List.of(
                        new CallRoutingEndpointDestination()
                                .value(new CallRoutingSipEndpoint()
                                        .username(givenDestinationsValueUsername)
                                        .sipTrunkId(givenDestinationsValueSipTrunkId)
                                        .customHeaders(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        )))
                                .connectTimeout(givenDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        ))
                                        .filePrefix(givenDestinationsRecordingFilePrefix))
                ));

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(
                        new CallRoutingEndpointDestination()
                                .value(new CallRoutingSipEndpoint()
                                        .username(givenDestinationsValueUsername)
                                        .sipTrunkId(givenDestinationsValueSipTrunkId)
                                        .customHeaders(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        )))
                                .connectTimeout(givenDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        ))
                                        .filePrefix(givenDestinationsRecordingFilePrefix))
                ));
        Consumer<CallRoutingRouteResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

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

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"destinations\": [\n" +
                                             "        {\n" +
                                             "          \"value\": {\n" +
                                             "            \"username\": \"%s\",\n" +
                                             "            \"sipTrunkId\": \"%s\",\n" +
                                             "            \"customHeaders\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"type\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"connectTimeout\": %d,\n" +
                                             "          \"recording\": {\n" +
                                             "            \"recordingType\": \"%s\",\n" +
                                             "            \"recordingComposition\": {\n" +
                                             "              \"enabled\": %b\n" +
                                             "            },\n" +
                                             "            \"customData\": {\n" +
                                             "              \"string\": \"%s\"\n" +
                                             "            },\n" +
                                             "            \"filePrefix\": \"%s\"\n" +
                                             "          },\n" +
                                             "          \"type\": \"%s\"\n" +
                                             "        }\n" +
                                             "      ]\n" +
                                             "    }\n",
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
                                             givenDestinationsType
        );

        setUpNoRequestBodyDeleteRequest(
                ROUTE.replace("{routeId}", givenId),
                Map.of(),
                givenResponse,
                200
        );

        var callRoutingApi = new CallRoutingApi(getApiClient());

        var expectedResponse = new CallRoutingRouteResponse()
                .id(givenId)
                .name(givenName)
                .destinations(List.of(
                        new CallRoutingEndpointDestination()
                                .value(new CallRoutingSipEndpoint()
                                        .username(givenDestinationsValueUsername)
                                        .sipTrunkId(givenDestinationsValueSipTrunkId)
                                        .customHeaders(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        )))
                                .connectTimeout(givenDestinationsConnectTimeout)
                                .recording(new CallRoutingRecording()
                                        .recordingType(givenDestinationsRecordingRecordingType)
                                        .recordingComposition(new CallRoutingRecordingComposition()
                                                .enabled(givenDestinationsRecordingRecordingCompositionEnabled))
                                        .customData(Map.of(
                                                "string", givenDestinationsRecordingCustomDataString
                                        ))
                                        .filePrefix(givenDestinationsRecordingFilePrefix))
                ));
        Consumer<CallRoutingRouteResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callRoutingApi.deleteCallRoute(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
