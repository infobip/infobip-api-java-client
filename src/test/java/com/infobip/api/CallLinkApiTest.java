package com.infobip.api;

import com.infobip.api.CallLinkApi;
import com.infobip.model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.BDDAssertions.then;

class CallLinkApiTest extends ApiTest {
    private static final String CALL_LINKS = "/call-link/1/links";
    private static final String CALL_LINK = "/call-link/1/links/{id}";

    private static final String CONFIGS = "/call-link/1/configs";
    private static final String CONFIG = "/call-link/1/configs/{id}";

    private static final String IMAGES = "/call-link/1/images";
    private static final String UPLOAD_IMAGE = "/call-link/1/images/upload/{type}";
    private static final String IMAGE = "/call-link/1/images/{id}";

    private static final String SUBDOMAINS = "/call-link/1/subdomains";
    private static final String SUBDOMAIN = "/call-link/1/subdomains/{id}";

    @Test
    void shouldGetCallLinks() {
        var givenId = "r9wpIY";
        var givenIdentity = "john";
        var givenDisplayName = "John Doe";
        var givenDestinationIdentity = "bob";
        var givenDestinationType = "WEBRTC";
        var givenCustomDataCity = "New York";
        var givenCustomDataLanguage = "en";
        var givenValidityWindowOneTime = true;
        var givenValidityWindowStartTime = "2023-12-04T09:17:26.000+0000";
        var givenValidityWindowStartTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 4, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenValidityWindowEndTime = "2023-12-05T09:17:26.000+0000";
        var givenValidityWindowEndTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 5, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenCallLinkConfigId = "638dbdc6ecede164c3799d04";
        var givenPagingPage = 0;
        var givenPagingSize = 10;
        var givenPagingTotalPages = 1;
        var givenPagingTotalResults = 2L;

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"identity\": \"%s\",\n" +
                                             "      \"displayName\": \"%s\",\n" +
                                             "      \"destination\": {\n" +
                                             "        \"identity\": \"%s\",\n" +
                                             "        \"type\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"customData\": {\n" +
                                             "        \"city\": \"%s\",\n" +
                                             "        \"language\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"validityWindow\": {\n" +
                                             "        \"oneTime\": %b,\n" +
                                             "        \"startTime\": \"%s\",\n" +
                                             "        \"endTime\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callLinkConfigId\": \"%s\"\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"identity\": \"%s\",\n" +
                                             "      \"displayName\": \"%s\",\n" +
                                             "      \"destination\": {\n" +
                                             "        \"identity\": \"%s\",\n" +
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
                                             givenId,
                                             givenIdentity,
                                             givenDisplayName,
                                             givenDestinationIdentity,
                                             givenDestinationType,
                                             givenCustomDataCity,
                                             givenCustomDataLanguage,
                                             givenValidityWindowOneTime,
                                             givenValidityWindowStartTime,
                                             givenValidityWindowEndTime,
                                             givenCallLinkConfigId,
                                             givenId,
                                             givenIdentity,
                                             givenDisplayName,
                                             givenDestinationIdentity,
                                             givenDestinationType,
                                             givenPagingPage,
                                             givenPagingSize,
                                             givenPagingTotalPages,
                                             givenPagingTotalResults
        );

        setUpSuccessGetRequest(
                CALL_LINKS,
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkPage()
                .addResultsItem(new WebRtcCallLink()
                        .id(givenId)
                        .identity(givenIdentity)
                        .displayName(givenDisplayName)
                        .destination(new WebRtcWebRtcDestination().identity(givenDestinationIdentity))
                        .customData(Map.of(
                                "city", givenCustomDataCity,
                                "language", givenCustomDataLanguage
                        ))
                        .validityWindow(new WebRtcValidityWindow()
                                .oneTime(givenValidityWindowOneTime)
                                .startTime(givenValidityWindowStartTimeDateTime)
                                .endTime(givenValidityWindowEndTimeDateTime))
                        .callLinkConfigId(givenCallLinkConfigId)
                )
                .addResultsItem(new WebRtcCallLink()
                        .id(givenId)
                        .identity(givenIdentity)
                        .displayName(givenDisplayName)
                        .destination(new WebRtcWebRtcDestination()
                                .identity(givenDestinationIdentity)))
                .paging(new PageInfo()
                        .page(givenPagingPage)
                        .size(givenPagingSize)
                        .totalPages(givenPagingTotalPages)
                        .totalResults(givenPagingTotalResults)
                );


        Consumer<WebRtcCallLinkPage> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getCallLinks();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateCallLink() {
        var givenDestinationIdentity = "bob";
        var givenDestinationType = "WEBRTC";
        var givenValidityWindowOneTime = true;
        var givenValidityWindowStartTime = "2023-12-04T09:17:26.000+0000";
        var givenValidityWindowStartTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 4, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenValidityWindowEndTime = "2023-12-05T09:17:26.000+0000";
        var givenValidityWindowEndTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 5, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenCallLinkConfigId = "638dbdc6ecede164c3799d04";

        String expectedRequest = String.format("{\n" +
                                               "  \"destination\": {\n" +
                                               "    \"identity\": \"%s\",\n" +
                                               "    \"type\": \"%s\"\n" +
                                               "  },\n" +
                                               "  \"validityWindow\": {\n" +
                                               "    \"oneTime\": %b,\n" +
                                               "    \"startTime\": \"%s\",\n" +
                                               "    \"endTime\": \"%s\"\n" +
                                               "  },\n" +
                                               "  \"callLinkConfigId\": \"%s\"\n" +
                                               "}\n",
                                               givenDestinationIdentity,
                                               givenDestinationType,
                                               givenValidityWindowOneTime,
                                               givenValidityWindowStartTime,
                                               givenValidityWindowEndTime,
                                               givenCallLinkConfigId
        );

        var givenId = "r9wpIY";
        var givenUrl = "https://call-link.com/r9wpIY";

        String givenResponse = String.format("{\n" +
                                             "    \"id\": \"%s\",\n" +
                                             "    \"url\": \"%s\"\n" +
                                             "}\n",
                                             givenId,
                                             givenUrl
        );


        setUpSuccessPostRequest(
                CALL_LINKS,
                expectedRequest,
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var request = new WebRtcCallLinkRequest()
                .destination(new WebRtcWebRtcDestination().identity(givenDestinationIdentity))
                .validityWindow(new WebRtcValidityWindow()
                        .oneTime(givenValidityWindowOneTime)
                        .startTime(givenValidityWindowStartTimeDateTime)
                        .endTime(givenValidityWindowEndTimeDateTime))
                .callLinkConfigId(givenCallLinkConfigId);

        var expectedResponse = new WebRtcCallLinkResponse().id(givenId).url(givenUrl);


        Consumer<WebRtcCallLinkResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.createCallLink(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }


    @Test
    void shouldGetCallLink() {
        var givenId = "r9wpIY";
        var givenUrl = "https://call-link.com/r9wpIY";
        var givenIdentity = "john";
        var givenDisplayName = "John Doe";
        var givenShowIdentity = true;
        var givenDestinationIdentity = "bob";
        var givenDestinationType = "WEBRTC";
        var givenCustomDataCity = "New York";
        var givenCustomDataLanguage = "en";
        var givenValidityWindowOneTime = true;
        var givenValidityWindowStartTime = "2023-12-04T09:17:26.000+0000";
        var givenValidityWindowStartTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 4, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenValidityWindowEndTime = "2023-12-05T09:17:26.000+0000";
        var givenValidityWindowEndTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 5, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenAcceptableHoursStartHour = 0;
        var givenAcceptableHoursStartMinute = 0;
        var givenAcceptableHoursEndHour = 0;
        var givenAcceptableHoursEndMinute = 0;
        var givenAcceptableDays = WebRtcValidityWindow.AcceptableDaysEnum.MONDAY;

        var givenCallLinkConfigId = "638dbdc6ecede164c3799d04";
        String givenResponse = String.format("{\n" +
                                             "   \"id\": \"%s\",\n" +
                                             "   \"url\": \"%s\",\n" +
                                             "   \"identity\": \"%s\",\n" +
                                             "   \"displayName\": \"%s\",\n" +
                                             "   \"showIdentity\": %b,\n" +
                                             "   \"destination\": {\n" +
                                             "     \"identity\": \"%s\",\n" +
                                             "     \"type\": \"%s\"\n" +
                                             "   },\n" +
                                             "   \"customData\": {\n" +
                                             "     \"city\": \"%s\",\n" +
                                             "     \"language\": \"%s\"\n" +
                                             "   },\n" +
                                             "   \"validityWindow\": {\n" +
                                             "     \"oneTime\": %b,\n" +
                                             "     \"startTime\": \"%s\",\n" +
                                             "     \"endTime\": \"%s\",\n" +
                                             "     \"acceptableHours\": {\n" +
                                             "       \"start\": {\n" +
                                             "         \"hour\": %d,\n" +
                                             "         \"minute\": %d\n" +
                                             "       },\n" +
                                             "       \"end\": {\n" +
                                             "         \"hour\": %d,\n" +
                                             "         \"minute\": %d\n" +
                                             "       }\n" +
                                             "     },\n" +
                                             "     \"acceptableDays\": [\n" +
                                             "       \"%s\"\n" +
                                             "     ]\n" +
                                             "   },\n" +
                                             "   \"callLinkConfigId\": \"%s\"\n" +
                                             " }\n",
                                             givenId,
                                             givenUrl,
                                             givenIdentity,
                                             givenDisplayName,
                                             givenShowIdentity,
                                             givenDestinationIdentity,
                                             givenDestinationType,
                                             givenCustomDataCity,
                                             givenCustomDataLanguage,
                                             givenValidityWindowOneTime,
                                             givenValidityWindowStartTime,
                                             givenValidityWindowEndTime,
                                             givenAcceptableHoursStartHour,
                                             givenAcceptableHoursStartMinute,
                                             givenAcceptableHoursEndHour,
                                             givenAcceptableHoursEndMinute,
                                             givenAcceptableDays,
                                             givenCallLinkConfigId
        );

        setUpSuccessGetRequest(
                CALL_LINK.replace("{id}", givenId),
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLink()
                .id(givenId)
                .url(givenUrl)
                .identity(givenIdentity)
                .displayName(givenDisplayName)
                .showIdentity(givenShowIdentity)
                .destination(new WebRtcWebRtcDestination().identity(givenDestinationIdentity))
                .customData(Map.of(
                        "city", givenCustomDataCity,
                        "language", givenCustomDataLanguage
                ))
                .validityWindow(new WebRtcValidityWindow()
                        .oneTime(givenValidityWindowOneTime)
                        .startTime(givenValidityWindowStartTimeDateTime)
                        .endTime(givenValidityWindowEndTimeDateTime)
                        .acceptableHours(new WebRtcAcceptableHours()
                                .start(new WebRtcTimeOfDay()
                                        .hour(givenAcceptableHoursStartHour)
                                        .minute(givenAcceptableHoursStartMinute))
                                .end(new WebRtcTimeOfDay()
                                        .hour(givenAcceptableHoursEndHour)
                                        .minute(givenAcceptableHoursEndMinute)))
                        .acceptableDays(List.of(WebRtcValidityWindow.AcceptableDaysEnum.MONDAY)))
                .callLinkConfigId(givenCallLinkConfigId);


        Consumer<WebRtcCallLink> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getCallLink(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCallLink() {
        var givenId = "r9wpIY";
        var givenUrl = "https://call-link.com/r9wpIY";
        var givenIdentity = "john";
        var givenDisplayName = "John Doe";
        var givenShowIdentity = true;
        var givenDestinationIdentity = "bob";
        var givenDestinationType = "WEBRTC";
        var givenCustomDataCity = "New York";
        var givenCustomDataLanguage = "en";
        var givenValidityWindowOneTime = true;
        var givenValidityWindowStartTime = "2023-12-04T09:17:26.000+0000";
        var givenValidityWindowStartTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 4, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenValidityWindowEndTime = "2023-12-05T09:17:26.000+0000";
        var givenValidityWindowEndTimeDateTime = OffsetDateTime.of(
                LocalDateTime.of(2023, 12, 5, 9, 17, 26, 0),
                ZoneOffset.ofHours(0)
        );

        var givenAcceptableHoursStartHour = 0;
        var givenAcceptableHoursStartMinute = 0;
        var givenAcceptableHoursEndHour = 0;
        var givenAcceptableHoursEndMinute = 0;
        var givenAcceptableDays = WebRtcValidityWindow.AcceptableDaysEnum.MONDAY;

        var givenCallLinkConfigId = "638dbdc6ecede164c3799d04";
        String givenResponse = String.format("{\n" +
                                             "   \"id\": \"%s\",\n" +
                                             "   \"url\": \"%s\",\n" +
                                             "   \"identity\": \"%s\",\n" +
                                             "   \"displayName\": \"%s\",\n" +
                                             "   \"showIdentity\": %b,\n" +
                                             "   \"destination\": {\n" +
                                             "     \"identity\": \"%s\",\n" +
                                             "     \"type\": \"%s\"\n" +
                                             "   },\n" +
                                             "   \"customData\": {\n" +
                                             "     \"city\": \"%s\",\n" +
                                             "     \"language\": \"%s\"\n" +
                                             "   },\n" +
                                             "   \"validityWindow\": {\n" +
                                             "     \"oneTime\": %b,\n" +
                                             "     \"startTime\": \"%s\",\n" +
                                             "     \"endTime\": \"%s\",\n" +
                                             "     \"acceptableHours\": {\n" +
                                             "       \"start\": {\n" +
                                             "         \"hour\": %d,\n" +
                                             "         \"minute\": %d\n" +
                                             "       },\n" +
                                             "       \"end\": {\n" +
                                             "         \"hour\": %d,\n" +
                                             "         \"minute\": %d\n" +
                                             "       }\n" +
                                             "     },\n" +
                                             "     \"acceptableDays\": [\n" +
                                             "       \"%s\"\n" +
                                             "     ]\n" +
                                             "   },\n" +
                                             "   \"callLinkConfigId\": \"%s\"\n" +
                                             " }\n",
                                             givenId,
                                             givenUrl,
                                             givenIdentity,
                                             givenDisplayName,
                                             givenShowIdentity,
                                             givenDestinationIdentity,
                                             givenDestinationType,
                                             givenCustomDataCity,
                                             givenCustomDataLanguage,
                                             givenValidityWindowOneTime,
                                             givenValidityWindowStartTime,
                                             givenValidityWindowEndTime,
                                             givenAcceptableHoursStartHour,
                                             givenAcceptableHoursStartMinute,
                                             givenAcceptableHoursEndHour,
                                             givenAcceptableHoursEndMinute,
                                             givenAcceptableDays,
                                             givenCallLinkConfigId
        );

        setUpNoRequestBodyDeleteRequest(
                CALL_LINK.replace("{id}", givenId),
                Map.of(),
                givenResponse,
                200
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLink()
                .id(givenId)
                .url(givenUrl)
                .identity(givenIdentity)
                .displayName(givenDisplayName)
                .showIdentity(givenShowIdentity)
                .destination(new WebRtcWebRtcDestination().identity(givenDestinationIdentity))
                .customData(Map.of(
                        "city", givenCustomDataCity,
                        "language", givenCustomDataLanguage
                ))
                .validityWindow(new WebRtcValidityWindow()
                        .oneTime(givenValidityWindowOneTime)
                        .startTime(givenValidityWindowStartTimeDateTime)
                        .endTime(givenValidityWindowEndTimeDateTime)
                        .acceptableHours(new WebRtcAcceptableHours()
                                .start(new WebRtcTimeOfDay()
                                        .hour(givenAcceptableHoursStartHour)
                                        .minute(givenAcceptableHoursStartMinute))
                                .end(new WebRtcTimeOfDay()
                                        .hour(givenAcceptableHoursEndHour)
                                        .minute(givenAcceptableHoursEndMinute)))
                        .acceptableDays(List.of(WebRtcValidityWindow.AcceptableDaysEnum.MONDAY)))
                .callLinkConfigId(givenCallLinkConfigId);


        Consumer<WebRtcCallLink> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.deleteCallLink(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallLinksImages() {
        var givenFirstId = "638f29f0ee8f0c1da369a722";
        var givenFirstName = "logo.png";
        var givenFirstType = WebRtcImageType.LOGO;
        var givenFirstSize = 512L;

        var givenSecondId = "968f29f0ee8f0c1da369a545";
        var givenSecondName = "background.jpg";
        var givenSecondType = WebRtcImageType.BACKGROUND;
        var givenSecondSize = 1512L;

        var givenPagingPage = 0;
        var givenPagingSize = 10;
        var givenPagingTotalPages = 1;
        var givenPagingTotalResults = 2L;

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"type\": \"%s\",\n" +
                                             "      \"size\": %d\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"type\": \"%s\",\n" +
                                             "      \"size\": %d\n" +
                                             "    }\n" +
                                             "  ],\n" +
                                             "  \"paging\": {\n" +
                                             "    \"page\": %d,\n" +
                                             "    \"size\": %d,\n" +
                                             "    \"totalPages\": %d,\n" +
                                             "    \"totalResults\": %d\n" +
                                             "  }\n" +
                                             "}\n",
                                             givenFirstId,
                                             givenFirstName,
                                             givenFirstType,
                                             givenFirstSize,
                                             givenSecondId,
                                             givenSecondName,
                                             givenSecondType,
                                             givenSecondSize,
                                             givenPagingPage,
                                             givenPagingSize,
                                             givenPagingTotalPages,
                                             givenPagingTotalResults
        );

        setUpSuccessGetRequest(
                IMAGES,
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcImagePage()
                .addResultsItem(new WebRtcImageResponse()
                        .id(givenFirstId)
                        .name(givenFirstName)
                        .type(givenFirstType)
                        .size(givenFirstSize)

                )
                .addResultsItem(new WebRtcImageResponse()
                        .id(givenSecondId)
                        .name(givenSecondName)
                        .type(givenSecondType)
                        .size(givenSecondSize))
                .paging(new PageInfo()
                        .page(givenPagingPage)
                        .size(givenPagingSize)
                        .totalPages(givenPagingTotalPages)
                        .totalResults(givenPagingTotalResults)
                );


        Consumer<WebRtcImagePage> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getImages();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    @Disabled
    void shouldPostCallLinksImage() throws IOException {
        var givenFirstId = "638f29f0ee8f0c1da369a722";
        var givenFirstName = "icon.png";
        var givenFirstType = WebRtcImageType.LOGO;
        var givenFirstSize = 512L;

        String binaryString = "B44419205B27012D82F3BAD7B7EB37BAC884DBC91685390C3232D2191DC9D5EAF32F119D3530679F9B251AB689B4A60D7C2EB5A5EBB75C305367140D512E6B5D04200E7FFA5E84EAF37590C33F22B973514126755981CB170D86A7506CB38265280478A5B4EF2A7D11E9F24F286E7E315DFB1FF9BFEE08E036584074A1B76F097D9EC77E3FDD0FCC08362243E306F99F";

        File givenFile = new File(CallLinkApiTest.class.getResource("/icon.png").getFile());

        String xMediaType = "multipart/form-data;";

        String givenResponse = String.format("{\n" +
                                             "  \"id\": \"%s\",\n" +
                                             "  \"name\": \"%s\",\n" +
                                             "  \"type\": \"%s\",\n" +
                                             "  \"size\": %d\n" +
                                             "}\n",
                                             givenFirstId,
                                             givenFirstName,
                                             givenFirstType,
                                             givenFirstSize
        );


        getWireMockServer().givenThat(
                post(urlPathEqualTo(UPLOAD_IMAGE.replace("{type}", givenFirstType.getValue())))
                        .withHeader("Authorization", equalTo(getExpectedApiKeyValue()))
                        .withHeader("Content-Type", equalTo(xMediaType))
                        .withRequestBody(binaryEqualTo(Files.readAllBytes(givenFile.toPath())))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withBody(givenResponse)
                        )
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcImageResponse()
                        .id(givenFirstId)
                        .name(givenFirstName)
                        .type(givenFirstType)
                        .size(givenFirstSize);


        Consumer<WebRtcImageResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.uploadImage(givenFirstType, givenFile);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallLinkImages() {
        var givenFirstId = "638f29f0ee8f0c1da369a722";
        var givenFirstName = "logo.png";
        var givenFirstType = WebRtcImageType.LOGO;
        var givenFirstSize = 512L;

        String givenResponse = String.format("{\n" +
                                             "  \"id\": \"%s\",\n" +
                                             "  \"name\": \"%s\",\n" +
                                             "  \"type\": \"%s\",\n" +
                                             "  \"size\": %d\n" +
                                             "}\n",
                                             givenFirstId,
                                             givenFirstName,
                                             givenFirstType,
                                             givenFirstSize
        );

        setUpSuccessGetRequest(
                IMAGE.replace("{id}", givenFirstId),
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcImageResponse()
                        .id(givenFirstId)
                        .name(givenFirstName)
                        .type(givenFirstType)
                        .size(givenFirstSize);


        Consumer<WebRtcImageResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getImage(givenFirstId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }


    @Test
    void shouldDeleteCallLinkImages() {
        var givenFirstId = "638f29f0ee8f0c1da369a722";
        var givenFirstName = "logo.png";
        var givenFirstType = WebRtcImageType.LOGO;
        var givenFirstSize = 512L;

        String givenResponse = String.format("{\n" +
                                             "  \"id\": \"%s\",\n" +
                                             "  \"name\": \"%s\",\n" +
                                             "  \"type\": \"%s\",\n" +
                                             "  \"size\": %d\n" +
                                             "}\n",
                                             givenFirstId,
                                             givenFirstName,
                                             givenFirstType,
                                             givenFirstSize
        );

        setUpNoRequestBodyDeleteRequest(
                IMAGE.replace("{id}", givenFirstId),
                Map.of(),
                givenResponse,
                200
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcImageResponse()
                .id(givenFirstId)
                .name(givenFirstName)
                .type(givenFirstType)
                .size(givenFirstSize);


        Consumer<WebRtcImageResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.deleteImage(givenFirstId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallLinksSubdomains() {
        var givenFirstId = "id";
        var givenFirstName = "subdomain";

        String givenResponse = String.format("[\n" +
                                             "  {\n" +
                                             "    \"id\": \"%s\",\n" +
                                             "    \"name\": \"%s\"\n" +
                                             "  }\n" +
                                             "]\n",
                                             givenFirstId,
                                             givenFirstName
        );

        setUpSuccessGetRequest(
                SUBDOMAINS,
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = List.of(
                new WebRtcSubdomainResponse()
                    .id(givenFirstId).name(givenFirstName)
        );


        Consumer<List<WebRtcSubdomainResponse>> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getSubdomains();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPostCallLinksSubdomain() {
        var givenFirstId = "id";
        var givenFirstName = "subdomain";

        String expectedRequest = String.format("  {\n" +
                                               "    \"name\": \"%s\"\n" +
                                               "  }\n",
                                               givenFirstName
        );

        String givenResponse = String.format("  {\n" +
                                             "    \"id\": \"%s\",\n" +
                                             "    \"name\": \"%s\"\n" +
                                             "  }\n",
                                             givenFirstId,
                                             givenFirstName
        );

        setUpSuccessPostRequest(
                SUBDOMAINS,
                expectedRequest,
                givenResponse
        );

        var request = new WebRtcSubdomainRequest().name(givenFirstName);

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcSubdomain()
                        .id(givenFirstId).name(givenFirstName);


        Consumer<WebRtcSubdomain> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.createSubdomain(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCallLinksSubdomain() {
        var givenFirstId = "id";
        var givenFirstName = "subdomain";

        String givenResponse = String.format("  {\n" +
                                             "    \"id\": \"%s\",\n" +
                                             "    \"name\": \"%s\"\n" +
                                             "  }\n",
                                             givenFirstId,
                                             givenFirstName
        );

        setUpNoRequestBodyDeleteRequest(
                SUBDOMAIN.replace("{id}", givenFirstId),
                Map.of(),
                givenResponse,
                200
        );

        var request = new WebRtcSubdomainRequest().name(givenFirstName);

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcSubdomain()
                .id(givenFirstId).name(givenFirstName);


        Consumer<WebRtcSubdomain> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.deleteSubdomain(givenFirstId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallLinksConfigurations() {
        var givenName = "Company name";
        var givenInitialOptionsAudio = true;
        var givenInitialOptionsVideo = false;
        var givenInitialOptionsMuted = false;
        var givenInitialOptionsCameraFacingMode = WebRtcCameraFacingMode.FRONT;
        var givenCallOptionsMute = true;
        var givenCallOptionsScreenShare = true;
        var givenCallOptionsSwitchCameraFacingMode = true;
        var givenCallOptionsDialPad = true;
        var givenThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenThemeMessagesWelcomeText = "Call link page";
        var givenThemeMessagesInactiveText = "This link is no longer active.";
        var givenThemeMessagesExpirationText = "This link has expired";
        var givenThemeColorsPrimary = "D8D8D8";
        var givenThemeColorsPrimaryText = "242424";
        var givenThemeColorsBackground = "FFFFFF";

        var givenSecondName = "Company name";
        var givenSecondThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenSecondThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenSecondThemeMessagesWelcomeText = "Call link page";
        var givenSecondThemeMessagesInactiveText = "This link is no longer active.";
        var givenSecondThemeMessagesExpirationText = "This link has expired";
        var givenSecondThemeColorsPrimary = "D8D8D8";
        var givenSecondThemeColorsPrimaryText = "242424";
        var givenSecondThemeColorsBackground = "FFFFFF";


        var givenPagingPage = 0;
        var givenPagingSize = 10;
        var givenPagingTotalPages = 1;
        var givenPagingTotalResults = 2L;

        String givenResponse = String.format("{\n" +
                                             "  \"results\": [\n" +
                                             "    {\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"initialOptions\": {\n" +
                                             "        \"audio\": %b,\n" +
                                             "        \"video\": %b,\n" +
                                             "        \"muted\": %b,\n" +
                                             "        \"cameraFacingMode\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callOptions\": {\n" +
                                             "        \"mute\": %b,\n" +
                                             "        \"screenShare\": %b,\n" +
                                             "        \"switchCameraFacingMode\": %b,\n" +
                                             "        \"dialPad\": %b\n" +
                                             "      },\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
                                             "      }\n" +
                                             "    },\n" +
                                             "    {\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
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
                                             givenName,
                                             givenInitialOptionsAudio,
                                             givenInitialOptionsVideo,
                                             givenInitialOptionsMuted,
                                             givenInitialOptionsCameraFacingMode,
                                             givenCallOptionsMute,
                                             givenCallOptionsScreenShare,
                                             givenCallOptionsSwitchCameraFacingMode,
                                             givenCallOptionsDialPad,
                                             givenThemeImagesLogoImageId,
                                             givenThemeImagesBackgroundImageId,
                                             givenThemeMessagesWelcomeText,
                                             givenThemeMessagesInactiveText,
                                             givenThemeMessagesExpirationText,
                                             givenThemeColorsPrimary,
                                             givenThemeColorsPrimaryText,
                                             givenThemeColorsBackground,

                                             givenSecondName,
                                             givenSecondThemeImagesLogoImageId,
                                             givenSecondThemeImagesBackgroundImageId,
                                             givenSecondThemeMessagesWelcomeText,
                                             givenSecondThemeMessagesInactiveText,
                                             givenSecondThemeMessagesExpirationText,
                                             givenSecondThemeColorsPrimary,
                                             givenSecondThemeColorsPrimaryText,
                                             givenSecondThemeColorsBackground,

                                             givenPagingPage,
                                             givenPagingSize,
                                             givenPagingTotalPages,
                                             givenPagingTotalResults
        );

        setUpSuccessGetRequest(
                CONFIGS,
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkConfigPage()
                                       .addResultsItem(new WebRtcCallLinkConfig()
                                               .name(givenName)
                                               .initialOptions(new WebRtcInitialOptions()
                                                       .audio(givenInitialOptionsAudio)
                                                       .video(givenInitialOptionsVideo)
                                                       .muted(givenInitialOptionsMuted)
                                                       .cameraFacingMode(givenInitialOptionsCameraFacingMode))
                                               .callOptions(new WebRtcCallOptions()
                                                       .mute(givenCallOptionsMute)
                                                       .screenShare(givenCallOptionsScreenShare)
                                                       .switchCameraFacingMode(givenCallOptionsSwitchCameraFacingMode)
                                                       .dialPad(givenCallOptionsDialPad))
                                               .theme(new WebRtcTheme()
                                                       .images(new WebRtcImages()
                                                               .logoImageId(givenThemeImagesLogoImageId)
                                                               .backgroundImageId(givenThemeImagesBackgroundImageId))
                                                       .messages(new WebRtcMessages()
                                                               .welcomeText(givenThemeMessagesWelcomeText)
                                                               .inactiveText(givenThemeMessagesInactiveText)
                                                               .expirationText(givenThemeMessagesExpirationText))
                                                       .colors(new WebRtcColors()
                                                               .primary(givenThemeColorsPrimary)
                                                               .primaryText(givenThemeColorsPrimaryText)
                                                               .background(givenThemeColorsBackground))))
                                       .addResultsItem(new WebRtcCallLinkConfig()
                                               .name(givenName)
                                               .theme(new WebRtcTheme()
                                                       .images(new WebRtcImages()
                                                               .logoImageId(givenSecondThemeImagesLogoImageId)
                                                               .backgroundImageId(givenSecondThemeImagesBackgroundImageId))
                                                       .messages(new WebRtcMessages()
                                                               .welcomeText(givenSecondThemeMessagesWelcomeText)
                                                               .inactiveText(givenSecondThemeMessagesInactiveText)
                                                               .expirationText(givenSecondThemeMessagesExpirationText))
                                                       .colors(new WebRtcColors()
                                                               .primary(givenSecondThemeColorsPrimary)
                                                               .primaryText(givenSecondThemeColorsPrimaryText)
                                                               .background(givenSecondThemeColorsBackground))))
                .paging(new PageInfo()
                        .page(givenPagingPage)
                        .size(givenPagingSize)
                        .totalPages(givenPagingTotalPages)
                        .totalResults(givenPagingTotalResults));


        Consumer<WebRtcCallLinkConfigPage> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getConfigs();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateCallLinksConfiguration() {
        var givenName = "Company name";
        var givenInitialOptionsAudio = true;
        var givenInitialOptionsVideo = false;
        var givenInitialOptionsMuted = false;
        var givenInitialOptionsCameraFacingMode = WebRtcCameraFacingMode.FRONT;
        var givenCallOptionsMute = true;
        var givenCallOptionsScreenShare = true;
        var givenCallOptionsSwitchCameraFacingMode = true;
        var givenCallOptionsDialPad = true;
        var givenThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenThemeMessagesWelcomeText = "Call link page";
        var givenThemeMessagesInactiveText = "This link is no longer active.";
        var givenThemeMessagesExpirationText = "This link has expired";
        var givenThemeColorsPrimary = "D8D8D8";
        var givenThemeColorsPrimaryText = "242424";
        var givenThemeColorsBackground = "FFFFFF";

        String expectedRequest = String.format("{\n" +
                                               "  \"name\": \"%s\",\n" +
                                               "  \"initialOptions\": {\n" +
                                               "    \"audio\": %b,\n" +
                                               "    \"video\": %b,\n" +
                                               "    \"muted\": %b,\n" +
                                               "    \"cameraFacingMode\": \"%s\"\n" +
                                               "  }\n" +
                                               "}\n",
                                               givenName,
                                               givenInitialOptionsAudio,
                                               givenInitialOptionsVideo,
                                               givenInitialOptionsMuted,
                                               givenInitialOptionsCameraFacingMode
        );

        String givenResponse = String.format("{\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"initialOptions\": {\n" +
                                             "        \"audio\": %b,\n" +
                                             "        \"video\": %b,\n" +
                                             "        \"muted\": %b,\n" +
                                             "        \"cameraFacingMode\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callOptions\": {\n" +
                                             "        \"mute\": %b,\n" +
                                             "        \"screenShare\": %b,\n" +
                                             "        \"switchCameraFacingMode\": %b,\n" +
                                             "        \"dialPad\": %b\n" +
                                             "      },\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
                                             "      }\n" +
                                             "}\n",
                                             givenName,
                                             givenInitialOptionsAudio,
                                             givenInitialOptionsVideo,
                                             givenInitialOptionsMuted,
                                             givenInitialOptionsCameraFacingMode,
                                             givenCallOptionsMute,
                                             givenCallOptionsScreenShare,
                                             givenCallOptionsSwitchCameraFacingMode,
                                             givenCallOptionsDialPad,
                                             givenThemeImagesLogoImageId,
                                             givenThemeImagesBackgroundImageId,
                                             givenThemeMessagesWelcomeText,
                                             givenThemeMessagesInactiveText,
                                             givenThemeMessagesExpirationText,
                                             givenThemeColorsPrimary,
                                             givenThemeColorsPrimaryText,
                                             givenThemeColorsBackground
        );

        setUpSuccessPostRequest(
                CONFIGS,
                expectedRequest,
                givenResponse
        );

        var request = new WebRtcCallLinkConfigRequest()
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode));

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkConfig()
                        .name(givenName)
                        .initialOptions(new WebRtcInitialOptions()
                                .audio(givenInitialOptionsAudio)
                                .video(givenInitialOptionsVideo)
                                .muted(givenInitialOptionsMuted)
                                .cameraFacingMode(givenInitialOptionsCameraFacingMode))
                        .callOptions(new WebRtcCallOptions()
                                .mute(givenCallOptionsMute)
                                .screenShare(givenCallOptionsScreenShare)
                                .switchCameraFacingMode(givenCallOptionsSwitchCameraFacingMode)
                                .dialPad(givenCallOptionsDialPad))
                        .theme(new WebRtcTheme()
                                .images(new WebRtcImages()
                                        .logoImageId(givenThemeImagesLogoImageId)
                                        .backgroundImageId(givenThemeImagesBackgroundImageId))
                                .messages(new WebRtcMessages()
                                        .welcomeText(givenThemeMessagesWelcomeText)
                                        .inactiveText(givenThemeMessagesInactiveText)
                                        .expirationText(givenThemeMessagesExpirationText))
                                .colors(new WebRtcColors()
                                        .primary(givenThemeColorsPrimary)
                                        .primaryText(givenThemeColorsPrimaryText)
                                        .background(givenThemeColorsBackground)));

        Consumer<WebRtcCallLinkConfig> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.createConfig(request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetCallLinksConfiguration() {
        var givenId = "638dbdc6ecede164c3799d04";
        var givenName = "Company name";
        var givenInitialOptionsAudio = true;
        var givenInitialOptionsVideo = false;
        var givenInitialOptionsMuted = false;
        var givenInitialOptionsCameraFacingMode = WebRtcCameraFacingMode.FRONT;
        var givenCallOptionsMute = true;
        var givenCallOptionsScreenShare = true;
        var givenCallOptionsSwitchCameraFacingMode = true;
        var givenCallOptionsDialPad = true;
        var givenThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenThemeMessagesWelcomeText = "Call link page";
        var givenThemeMessagesInactiveText = "This link is no longer active.";
        var givenThemeMessagesExpirationText = "This link has expired";
        var givenThemeColorsPrimary = "D8D8D8";
        var givenThemeColorsPrimaryText = "242424";
        var givenThemeColorsBackground = "FFFFFF";

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"initialOptions\": {\n" +
                                             "        \"audio\": %b,\n" +
                                             "        \"video\": %b,\n" +
                                             "        \"muted\": %b,\n" +
                                             "        \"cameraFacingMode\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callOptions\": {\n" +
                                             "        \"mute\": %b,\n" +
                                             "        \"screenShare\": %b,\n" +
                                             "        \"switchCameraFacingMode\": %b,\n" +
                                             "        \"dialPad\": %b\n" +
                                             "      },\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
                                             "      }\n" +
                                             "}\n",
                                             givenId,
                                             givenName,
                                             givenInitialOptionsAudio,
                                             givenInitialOptionsVideo,
                                             givenInitialOptionsMuted,
                                             givenInitialOptionsCameraFacingMode,
                                             givenCallOptionsMute,
                                             givenCallOptionsScreenShare,
                                             givenCallOptionsSwitchCameraFacingMode,
                                             givenCallOptionsDialPad,
                                             givenThemeImagesLogoImageId,
                                             givenThemeImagesBackgroundImageId,
                                             givenThemeMessagesWelcomeText,
                                             givenThemeMessagesInactiveText,
                                             givenThemeMessagesExpirationText,
                                             givenThemeColorsPrimary,
                                             givenThemeColorsPrimaryText,
                                             givenThemeColorsBackground
        );

        setUpSuccessGetRequest(
                CONFIG.replace("{id}", givenId),
                Map.of(),
                givenResponse
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkConfig()
                .id(givenId)
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode))
                .callOptions(new WebRtcCallOptions()
                        .mute(givenCallOptionsMute)
                        .screenShare(givenCallOptionsScreenShare)
                        .switchCameraFacingMode(givenCallOptionsSwitchCameraFacingMode)
                        .dialPad(givenCallOptionsDialPad))
                .theme(new WebRtcTheme()
                        .images(new WebRtcImages()
                                .logoImageId(givenThemeImagesLogoImageId)
                                .backgroundImageId(givenThemeImagesBackgroundImageId))
                        .messages(new WebRtcMessages()
                                .welcomeText(givenThemeMessagesWelcomeText)
                                .inactiveText(givenThemeMessagesInactiveText)
                                .expirationText(givenThemeMessagesExpirationText))
                        .colors(new WebRtcColors()
                                .primary(givenThemeColorsPrimary)
                                .primaryText(givenThemeColorsPrimaryText)
                                .background(givenThemeColorsBackground)));

        Consumer<WebRtcCallLinkConfig> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.getConfig(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPutCallLinksConfiguration() {
        var givenName = "Company name";
        var givenId = "638dbdc6ecede164c3799d04";
        var givenInitialOptionsAudio = true;
        var givenInitialOptionsVideo = false;
        var givenInitialOptionsMuted = false;
        var givenInitialOptionsCameraFacingMode = WebRtcCameraFacingMode.FRONT;
        var givenCallOptionsMute = true;
        var givenCallOptionsScreenShare = true;
        var givenCallOptionsSwitchCameraFacingMode = true;
        var givenCallOptionsDialPad = true;
        var givenThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenThemeMessagesWelcomeText = "Call link page";
        var givenThemeMessagesInactiveText = "This link is no longer active.";
        var givenThemeMessagesExpirationText = "This link has expired";
        var givenThemeColorsPrimary = "D8D8D8";
        var givenThemeColorsPrimaryText = "242424";
        var givenThemeColorsBackground = "FFFFFF";

        String expectedRequest = String.format("{\n" +
                                               "  \"name\": \"%s\",\n" +
                                               "  \"initialOptions\": {\n" +
                                               "    \"audio\": %b,\n" +
                                               "    \"video\": %b,\n" +
                                               "    \"muted\": %b,\n" +
                                               "    \"cameraFacingMode\": \"%s\"\n" +
                                               "  }\n" +
                                               "}\n",
                                               givenName,
                                               givenInitialOptionsAudio,
                                               givenInitialOptionsVideo,
                                               givenInitialOptionsMuted,
                                               givenInitialOptionsCameraFacingMode
        );

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"initialOptions\": {\n" +
                                             "        \"audio\": %b,\n" +
                                             "        \"video\": %b,\n" +
                                             "        \"muted\": %b,\n" +
                                             "        \"cameraFacingMode\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callOptions\": {\n" +
                                             "        \"mute\": %b,\n" +
                                             "        \"screenShare\": %b,\n" +
                                             "        \"switchCameraFacingMode\": %b,\n" +
                                             "        \"dialPad\": %b\n" +
                                             "      },\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
                                             "      }\n" +
                                             "}\n",
                                             givenId,
                                             givenName,
                                             givenInitialOptionsAudio,
                                             givenInitialOptionsVideo,
                                             givenInitialOptionsMuted,
                                             givenInitialOptionsCameraFacingMode,
                                             givenCallOptionsMute,
                                             givenCallOptionsScreenShare,
                                             givenCallOptionsSwitchCameraFacingMode,
                                             givenCallOptionsDialPad,
                                             givenThemeImagesLogoImageId,
                                             givenThemeImagesBackgroundImageId,
                                             givenThemeMessagesWelcomeText,
                                             givenThemeMessagesInactiveText,
                                             givenThemeMessagesExpirationText,
                                             givenThemeColorsPrimary,
                                             givenThemeColorsPrimaryText,
                                             givenThemeColorsBackground
        );

        setUpSuccessPutRequest(
                CONFIG.replace("{id}", givenId),
                Map.of(),
                expectedRequest,
                givenResponse
        );


        var request = new WebRtcCallLinkConfigRequest()
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode));

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkConfig()
                .id(givenId)
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode))
                .callOptions(new WebRtcCallOptions()
                        .mute(givenCallOptionsMute)
                        .screenShare(givenCallOptionsScreenShare)
                        .switchCameraFacingMode(givenCallOptionsSwitchCameraFacingMode)
                        .dialPad(givenCallOptionsDialPad))
                .theme(new WebRtcTheme()
                        .images(new WebRtcImages()
                                .logoImageId(givenThemeImagesLogoImageId)
                                .backgroundImageId(givenThemeImagesBackgroundImageId))
                        .messages(new WebRtcMessages()
                                .welcomeText(givenThemeMessagesWelcomeText)
                                .inactiveText(givenThemeMessagesInactiveText)
                                .expirationText(givenThemeMessagesExpirationText))
                        .colors(new WebRtcColors()
                                .primary(givenThemeColorsPrimary)
                                .primaryText(givenThemeColorsPrimaryText)
                                .background(givenThemeColorsBackground)));

        Consumer<WebRtcCallLinkConfig> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.updateConfig(givenId, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteCallLinksConfiguration() {
        var givenName = "Company name";
        var givenId = "638dbdc6ecede164c3799d04";
        var givenInitialOptionsAudio = true;
        var givenInitialOptionsVideo = false;
        var givenInitialOptionsMuted = false;
        var givenInitialOptionsCameraFacingMode = WebRtcCameraFacingMode.FRONT;
        var givenCallOptionsMute = true;
        var givenCallOptionsScreenShare = true;
        var givenCallOptionsSwitchCameraFacingMode = true;
        var givenCallOptionsDialPad = true;
        var givenThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenThemeMessagesWelcomeText = "Call link page";
        var givenThemeMessagesInactiveText = "This link is no longer active.";
        var givenThemeMessagesExpirationText = "This link has expired";
        var givenThemeColorsPrimary = "D8D8D8";
        var givenThemeColorsPrimaryText = "242424";
        var givenThemeColorsBackground = "FFFFFF";

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"initialOptions\": {\n" +
                                             "        \"audio\": %b,\n" +
                                             "        \"video\": %b,\n" +
                                             "        \"muted\": %b,\n" +
                                             "        \"cameraFacingMode\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callOptions\": {\n" +
                                             "        \"mute\": %b,\n" +
                                             "        \"screenShare\": %b,\n" +
                                             "        \"switchCameraFacingMode\": %b,\n" +
                                             "        \"dialPad\": %b\n" +
                                             "      },\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
                                             "      }\n" +
                                             "}\n",
                                             givenId,
                                             givenName,
                                             givenInitialOptionsAudio,
                                             givenInitialOptionsVideo,
                                             givenInitialOptionsMuted,
                                             givenInitialOptionsCameraFacingMode,
                                             givenCallOptionsMute,
                                             givenCallOptionsScreenShare,
                                             givenCallOptionsSwitchCameraFacingMode,
                                             givenCallOptionsDialPad,
                                             givenThemeImagesLogoImageId,
                                             givenThemeImagesBackgroundImageId,
                                             givenThemeMessagesWelcomeText,
                                             givenThemeMessagesInactiveText,
                                             givenThemeMessagesExpirationText,
                                             givenThemeColorsPrimary,
                                             givenThemeColorsPrimaryText,
                                             givenThemeColorsBackground
        );

        setUpNoRequestBodyDeleteRequest(
                CONFIG.replace("{id}", givenId),
                Map.of(),
                givenResponse,
                200
        );

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkConfig()
                .id(givenId)
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode))
                .callOptions(new WebRtcCallOptions()
                        .mute(givenCallOptionsMute)
                        .screenShare(givenCallOptionsScreenShare)
                        .switchCameraFacingMode(givenCallOptionsSwitchCameraFacingMode)
                        .dialPad(givenCallOptionsDialPad))
                .theme(new WebRtcTheme()
                        .images(new WebRtcImages()
                                .logoImageId(givenThemeImagesLogoImageId)
                                .backgroundImageId(givenThemeImagesBackgroundImageId))
                        .messages(new WebRtcMessages()
                                .welcomeText(givenThemeMessagesWelcomeText)
                                .inactiveText(givenThemeMessagesInactiveText)
                                .expirationText(givenThemeMessagesExpirationText))
                        .colors(new WebRtcColors()
                                .primary(givenThemeColorsPrimary)
                                .primaryText(givenThemeColorsPrimaryText)
                                .background(givenThemeColorsBackground)));

        Consumer<WebRtcCallLinkConfig> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.deleteConfig(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPatchCallLinksConfiguration() {
        var givenName = "Company name";
        var givenId = "638dbdc6ecede164c3799d04";
        var givenInitialOptionsAudio = true;
        var givenInitialOptionsVideo = false;
        var givenInitialOptionsMuted = false;
        var givenInitialOptionsCameraFacingMode = WebRtcCameraFacingMode.FRONT;
        var givenCallOptionsMute = true;
        var givenCallOptionsScreenShare = true;
        var givenCallOptionsSwitchCameraFacingMode = true;
        var givenCallOptionsDialPad = true;
        var givenThemeImagesLogoImageId = "638dbe28ecede164c3799d06";
        var givenThemeImagesBackgroundImageId = "638dbe0cecede164c3799d05";
        var givenThemeMessagesWelcomeText = "Call link page";
        var givenThemeMessagesInactiveText = "This link is no longer active.";
        var givenThemeMessagesExpirationText = "This link has expired";
        var givenThemeColorsPrimary = "D8D8D8";
        var givenThemeColorsPrimaryText = "242424";
        var givenThemeColorsBackground = "FFFFFF";

        String expectedRequest = String.format("{\n" +
                                               "  \"name\": \"%s\",\n" +
                                               "  \"initialOptions\": {\n" +
                                               "    \"audio\": %b,\n" +
                                               "    \"video\": %b,\n" +
                                               "    \"muted\": %b,\n" +
                                               "    \"cameraFacingMode\": \"%s\"\n" +
                                               "  }\n" +
                                               "}\n",
                                               givenName,
                                               givenInitialOptionsAudio,
                                               givenInitialOptionsVideo,
                                               givenInitialOptionsMuted,
                                               givenInitialOptionsCameraFacingMode
        );

        String givenResponse = String.format("{\n" +
                                             "      \"id\": \"%s\",\n" +
                                             "      \"name\": \"%s\",\n" +
                                             "      \"initialOptions\": {\n" +
                                             "        \"audio\": %b,\n" +
                                             "        \"video\": %b,\n" +
                                             "        \"muted\": %b,\n" +
                                             "        \"cameraFacingMode\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"callOptions\": {\n" +
                                             "        \"mute\": %b,\n" +
                                             "        \"screenShare\": %b,\n" +
                                             "        \"switchCameraFacingMode\": %b,\n" +
                                             "        \"dialPad\": %b\n" +
                                             "      },\n" +
                                             "      \"theme\": {\n" +
                                             "        \"images\": {\n" +
                                             "          \"logoImageId\": \"%s\",\n" +
                                             "          \"backgroundImageId\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"messages\": {\n" +
                                             "          \"welcomeText\": \"%s\",\n" +
                                             "          \"inactiveText\": \"%s\",\n" +
                                             "          \"expirationText\": \"%s\"\n" +
                                             "        },\n" +
                                             "        \"colors\": {\n" +
                                             "          \"primary\": \"%s\",\n" +
                                             "          \"primaryText\": \"%s\",\n" +
                                             "          \"background\": \"%s\"\n" +
                                             "        }\n" +
                                             "      }\n" +
                                             "}\n",
                                             givenId,
                                             givenName,
                                             givenInitialOptionsAudio,
                                             givenInitialOptionsVideo,
                                             givenInitialOptionsMuted,
                                             givenInitialOptionsCameraFacingMode,
                                             givenCallOptionsMute,
                                             givenCallOptionsScreenShare,
                                             givenCallOptionsSwitchCameraFacingMode,
                                             givenCallOptionsDialPad,
                                             givenThemeImagesLogoImageId,
                                             givenThemeImagesBackgroundImageId,
                                             givenThemeMessagesWelcomeText,
                                             givenThemeMessagesInactiveText,
                                             givenThemeMessagesExpirationText,
                                             givenThemeColorsPrimary,
                                             givenThemeColorsPrimaryText,
                                             givenThemeColorsBackground
        );

        setUpPatchRequest(
                CONFIG.replace("{id}", givenId),
                Map.of(),
                expectedRequest,
                givenResponse,
                200
        );


        var request = new WebRtcCallLinkConfigRequest()
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode));

        var callLinkApi = new CallLinkApi(getApiClient());

        var expectedResponse = new WebRtcCallLinkConfig()
                .id(givenId)
                .name(givenName)
                .initialOptions(new WebRtcInitialOptions()
                        .audio(givenInitialOptionsAudio)
                        .video(givenInitialOptionsVideo)
                        .muted(givenInitialOptionsMuted)
                        .cameraFacingMode(givenInitialOptionsCameraFacingMode))
                .callOptions(new WebRtcCallOptions()
                        .mute(givenCallOptionsMute)
                        .screenShare(givenCallOptionsScreenShare)
                        .switchCameraFacingMode(givenCallOptionsSwitchCameraFacingMode)
                        .dialPad(givenCallOptionsDialPad))
                .theme(new WebRtcTheme()
                        .images(new WebRtcImages()
                                .logoImageId(givenThemeImagesLogoImageId)
                                .backgroundImageId(givenThemeImagesBackgroundImageId))
                        .messages(new WebRtcMessages()
                                .welcomeText(givenThemeMessagesWelcomeText)
                                .inactiveText(givenThemeMessagesInactiveText)
                                .expirationText(givenThemeMessagesExpirationText))
                        .colors(new WebRtcColors()
                                .primary(givenThemeColorsPrimary)
                                .primaryText(givenThemeColorsPrimaryText)
                                .background(givenThemeColorsBackground)));

        Consumer<WebRtcCallLinkConfig> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = callLinkApi.patchConfig(givenId, request);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
