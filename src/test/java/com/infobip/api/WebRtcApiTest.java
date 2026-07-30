package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class WebRtcApiTest extends ApiTest {

    private static final String TOKEN = "/webrtc/1/token";
    private static final String PUSH_CONFIGURATIONS = "/webrtc/1/webrtc-push-config";
    private static final String PUSH_CONFIGURATION = "/webrtc/1/webrtc-push-config/{id}";
    private static final String FILES = "/webrtc/1/files";
    private static final String FILE = "/webrtc/1/files/{id}";
    private static final String DOWNLOAD = "/webrtc/1/files/{id}/download";

    @Test
    void shouldGenerateWebRtcToken() {
        String givenToken =
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZGVudGl0eSI6IkFsaWNlIiwibmFtZSI6IkFsaWNlIGluIFdvbmRlcmxhbmQiLCJleHAiOjE1NzkyOTA2MzgsImNhcHMiOlsyXX0.QyCMqjH8DsftChibW2Rw4EByH-eEviUp3-kHVKuJpKg";
        String givenExpirationTime = "2020-01-17T19:50:38.488589Z";

        String givenIdentity = "Alice";
        String givenApplicationId = "2277594c-76ea-4b8e-a299-e2b6db41b9dc";
        String givenDisplayName = "Alice in Wonderland";
        Long givenTimeToLive = 43200L;

        String givenResponse = String.format(
                "{\n" + "  \"token\" : \"%s\",\n" + "  \"expirationTime\" : \"%s\"\n" + "}\n",
                givenToken, givenExpirationTime);

        String expectedRequest = String.format(
                "{\n" + "  \"identity\" : \"%s\",\n"
                        + "  \"displayName\" : \"%s\",\n"
                        + "  \"timeToLive\" : %d\n"
                        + "}\n",
                givenIdentity, givenDisplayName, givenTimeToLive);

        setUpSuccessPostRequest(TOKEN, expectedRequest, givenResponse);

        WebRtcApi webrtcTokenApi = new WebRtcApi(getApiClient());
        WebRtcTokenRequestModel request = new WebRtcTokenRequestModel()
                .identity(givenIdentity)
                .displayName(givenDisplayName)
                .timeToLive(givenTimeToLive);

        Consumer<WebRtcTokenResponseModel> assertions = applicationResponse -> {
            then(applicationResponse).isNotNull();
            then(applicationResponse.getToken()).isEqualTo(givenToken);
            then(applicationResponse.getExpirationTime()).isEqualTo(givenExpirationTime);
        };

        var call = webrtcTokenApi.generateWebRtcToken(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateWebRtcPushConfiguration() {
        var givenName = "Android Push Config Production";
        var givenPrivateKeyJson = "{'test': 'test'}";
        var givenAndroidConfigured = true;

        var expectedRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n"
                        + "  \"android\": {\n"
                        + "    \"privateKeyJson\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenName, givenPrivateKeyJson);

        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"androidConfigured\": %b,\n"
                        + "  \"iosConfigured\": false\n"
                        + "}",
                givenPushConfigurationId, givenName, givenAndroidConfigured);

        setUpSuccessPostRequest(PUSH_CONFIGURATIONS, expectedRequest, givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var request = new WebRtcPushConfigurationRequest()
                .name(givenName)
                .android(new WebRtcAndroidPushNotificationConfig().privateKeyJson(givenPrivateKeyJson));

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .name(givenName)
                .androidConfigured(true)
                .iosConfigured(false);

        Consumer<WebRtcPushConfigurationResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.savePushConfiguration(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateWebRtcPushConfiguration() {
        var givenName = "Test Push Config";
        var givenApnsCertificateFileName = "IOS_APNS_certificate.p";
        var givenApnsCertificateFileContent = "APNS certificate content";
        var givenApnsCertificatePassword = "pass";
        var givenPrivateKeyJson = "{'test': 'test'}";

        var expectedRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n"
                        + "  \"ios\": {\n"
                        + "    \"apnsCertificateFileName\": \"%s\",\n"
                        + "    \"apnsCertificateFileContent\": \"%s\",\n"
                        + "    \"apnsCertificatePassword\": \"%s\"\n"
                        + "  },\n"
                        + "  \"android\": {\n"
                        + "    \"privateKeyJson\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenName,
                givenApnsCertificateFileName,
                givenApnsCertificateFileContent,
                givenApnsCertificatePassword,
                givenPrivateKeyJson);

        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";
        var givenAndroidConfigured = true;
        var givenIosConfigured = true;

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"iosConfigured\": %b,\n"
                        + "  \"androidConfigured\": %b\n"
                        + "}",
                givenPushConfigurationId, givenName, givenIosConfigured, givenAndroidConfigured);

        setUpSuccessPutRequest(
                PUSH_CONFIGURATION.replace("{id}", givenPushConfigurationId), Map.of(), expectedRequest, givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var request = new WebRtcPushConfigurationRequest()
                .name(givenName)
                .ios(new WebRtcIosPushNotificationConfig()
                        .apnsCertificateFileName(givenApnsCertificateFileName)
                        .apnsCertificateFileContent(givenApnsCertificateFileContent)
                        .apnsCertificatePassword(givenApnsCertificatePassword))
                .android(new WebRtcAndroidPushNotificationConfig().privateKeyJson(givenPrivateKeyJson));

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .name(givenName)
                .androidConfigured(true)
                .iosConfigured(true);

        Consumer<WebRtcPushConfigurationResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.updatePushConfiguration(givenPushConfigurationId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteWebRtcPushConfiguration() {
        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";
        var expectedStatusCode = 204;

        setUpNoResponseBodyDeleteRequest(
                PUSH_CONFIGURATION.replace("{id}", givenPushConfigurationId), Map.of(), expectedStatusCode);

        var webrtcApi = new WebRtcApi(getApiClient());

        var call = webrtcApi.deletePushConfiguration(givenPushConfigurationId);
        testSuccessfulCallWithNoBody(call::executeAsync, expectedStatusCode);
    }

    @Test
    void shouldGetWebRtcPushConfigurations() {
        var givenFirstName = "Android Push Config Production";
        var givenSecondName = "Test Push Config";

        var givenFirstPushConfigurationId = "454d142b-a1ad-239a-d231-227fa335aadc3";
        var givenSecondPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";

        var givenPage = 0;
        var givenSize = 0;
        var givenTotalPages = 1;
        var givenTotalResults = 2L;

        var givenFirstAndroidConfigured = true;
        var givenFirstIosConfigured = false;

        var givenSecondAndroidConfigured = true;
        var givenSecondIosConfigured = true;

        var givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"androidConfigured\": %b,\n"
                        + "      \"iosConfigured\": %b\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"androidConfigured\": %b,\n"
                        + "      \"iosConfigured\": %b\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"pageInfo\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "  }\n"
                        + "}",
                givenFirstPushConfigurationId,
                givenFirstName,
                givenFirstAndroidConfigured,
                givenFirstIosConfigured,
                givenSecondPushConfigurationId,
                givenSecondName,
                givenSecondAndroidConfigured,
                givenSecondIosConfigured,
                givenPage,
                givenSize,
                givenTotalPages,
                givenTotalResults);

        setUpSuccessGetRequest(PUSH_CONFIGURATIONS, Map.of(), givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var expectedFirstConfiguration = new WebRtcPushConfigurationResponse()
                .id(givenFirstPushConfigurationId)
                .name(givenFirstName)
                .androidConfigured(givenFirstAndroidConfigured)
                .iosConfigured(givenFirstIosConfigured);

        var expectedSecondConfiguration = new WebRtcPushConfigurationResponse()
                .id(givenSecondPushConfigurationId)
                .name(givenSecondName)
                .androidConfigured(givenSecondAndroidConfigured)
                .iosConfigured(givenSecondIosConfigured);

        var expectedResponse = new WebRtcPushConfigurationPageResponse()
                .addResultsItem(expectedFirstConfiguration)
                .addResultsItem(expectedSecondConfiguration)
                .pageInfo(new PageInfo()
                        .page(givenPage)
                        .size(givenSize)
                        .totalPages(givenTotalPages)
                        .totalResults(givenTotalResults));

        Consumer<WebRtcPushConfigurationPageResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.getPushConfigurations(0, 20);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetWebRtcPushConfiguration() {
        var givenName = "Test Push Config";
        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";
        var givenAndroidConfigured = true;
        var givenIosConfigured = true;

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"androidConfigured\": %b,\n"
                        + "  \"iosConfigured\": %b\n"
                        + "}",
                givenPushConfigurationId, givenName, givenAndroidConfigured, givenIosConfigured);

        setUpSuccessGetRequest(PUSH_CONFIGURATION.replace("{id}", givenPushConfigurationId), Map.of(), givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .name(givenName)
                .androidConfigured(givenAndroidConfigured)
                .iosConfigured(givenIosConfigured);

        Consumer<WebRtcPushConfigurationResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.getPushConfiguration(givenPushConfigurationId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetWebRtcFiles() {
        var givenId = "5f4e8861-8ed7-4521-b8c8-f26346726716";
        var givenName = "5f4e8861-8ed7-4521-b8c8-f26346726716_alice_1680266280000.png";
        var givenFileFormat = WebRtcFileFormat.PNG;
        var givenSize = 10780L;
        var givenCreationTime = "2023-03-31T12:38:00.000+0000";
        var givenCreationTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 3, 31, 12, 38, 0, 0), ZoneOffset.ofHours(0));

        var givenPage = 0;
        var givenPageSize = 1;
        var givenTotalPages = 1;
        var givenTotalResults = 1L;

        var givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"fileFormat\": \"%s\",\n"
                        + "      \"size\": %d,\n"
                        + "      \"creationTime\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"pageInfo\": {\n"
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
                givenCreationTime,
                givenPage,
                givenPageSize,
                givenTotalPages,
                givenTotalResults);

        setUpSuccessGetRequest(FILES, Map.of(), givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var expectedResponse = new WebRtcFilePageResponse()
                .addResultsItem(new WebRtcFileResponse()
                        .id(givenId)
                        .name(givenName)
                        .fileFormat(givenFileFormat)
                        .size(givenSize)
                        .creationTime(givenCreationTimeDateTime))
                .pageInfo(new PageInfo()
                        .page(givenPage)
                        .size(givenPageSize)
                        .totalPages(givenTotalPages)
                        .totalResults(givenTotalResults));

        Consumer<WebRtcFilePageResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.getFiles();

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetWebRtcFile() {
        var givenId = "5f4e8861-8ed7-4521-b8c8-f26346726716";
        var givenName = "5f4e8861-8ed7-4521-b8c8-f26346726716_alice_1680266280000.png";
        var givenFileFormat = WebRtcFileFormat.PNG;
        var givenSize = 10780L;
        var givenCreationTime = "2023-03-31T12:38:00.000+0000";
        var givenCreationTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 3, 31, 12, 38, 0, 0), ZoneOffset.ofHours(0));

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"fileFormat\": \"%s\",\n"
                        + "  \"size\": %d,\n"
                        + "  \"creationTime\": \"%s\"\n"
                        + "}\n",
                givenId, givenName, givenFileFormat, givenSize, givenCreationTime);

        setUpSuccessGetRequest(FILE.replace("{id}", givenId), Map.of(), givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var expectedResponse = new WebRtcFileResponse()
                .id(givenId)
                .name(givenName)
                .fileFormat(givenFileFormat)
                .size(givenSize)
                .creationTime(givenCreationTimeDateTime);

        Consumer<WebRtcFileResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.getFile(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteWebRtcFile() {
        var givenId = "5f4e8861-8ed7-4521-b8c8-f26346726716";
        var givenName = "5f4e8861-8ed7-4521-b8c8-f26346726716_alice_1680266280000.png";
        var givenFileFormat = WebRtcFileFormat.PNG;
        var givenSize = 10780L;
        var givenCreationTime = "2023-03-31T12:38:00.000+0000";
        var givenCreationTimeDateTime =
                OffsetDateTime.of(LocalDateTime.of(2023, 3, 31, 12, 38, 0, 0), ZoneOffset.ofHours(0));

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"fileFormat\": \"%s\",\n"
                        + "  \"size\": %d,\n"
                        + "  \"creationTime\": \"%s\"\n"
                        + "}\n",
                givenId, givenName, givenFileFormat, givenSize, givenCreationTime);

        setUpNoRequestBodyDeleteRequest(FILE.replace("{id}", givenId), Map.of(), givenResponse, 200);

        var webrtcApi = new WebRtcApi(getApiClient());

        var expectedResponse = new WebRtcFileResponse()
                .id(givenId)
                .name(givenName)
                .fileFormat(givenFileFormat)
                .size(givenSize)
                .creationTime(givenCreationTimeDateTime);

        Consumer<WebRtcFileResponse> assertions = response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.deleteFile(givenId);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDownloadWebRtcFile() {
        String givenId = "5f4e8861-8ed7-4521-b8c8-f26346726716";
        String givenResponse = "";

        setUpGetRequestOctet(DOWNLOAD.replace("{id}", givenId), Map.of(), givenResponse, 200);

        WebRtcApi webrtcApi = new WebRtcApi(getApiClient());

        var call = webrtcApi.downloadFile(givenId);
        testSuccessfulCallWithFileResult(call::execute);
    }

    @Test
    void shouldPatchWebRtcPushConfiguration() {
        var givenName = "Test Push Config";
        var givenPrivateKeyJson = "{'test': 'test'}";

        var expectedRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n"
                        + "  \"android\": {\n"
                        + "    \"privateKeyJson\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenName, givenPrivateKeyJson);

        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";
        var givenAndroidConfigured = true;
        var givenIosConfigured = false;

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"iosConfigured\": %b,\n"
                        + "  \"androidConfigured\": %b\n"
                        + "}",
                givenPushConfigurationId, givenName, givenIosConfigured, givenAndroidConfigured);

        setUpPatchRequest(
                PUSH_CONFIGURATION.replace("{id}", givenPushConfigurationId),
                Map.of(),
                expectedRequest,
                givenResponse,
                200);

        var webrtcApi = new WebRtcApi(getApiClient());

        var request = new WebRtcPushConfigurationRequest()
                .name(givenName)
                .android(new WebRtcAndroidPushNotificationConfig().privateKeyJson(givenPrivateKeyJson));

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .name(givenName)
                .androidConfigured(givenAndroidConfigured)
                .iosConfigured(givenIosConfigured);

        Consumer<WebRtcPushConfigurationResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.patchPushConfiguration(givenPushConfigurationId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
