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
        String givenRecording = "ALWAYS";
        Long givenTimeToLive = 43200L;

        String givenResponse = String.format(
                "{\n" + "  \"token\" : \"%s\",\n" + "  \"expirationTime\" : \"%s\"\n" + "}\n",
                givenToken, givenExpirationTime);

        String expectedRequest = String.format(
                "{\n" + "  \"identity\" : \"%s\",\n"
                        + "  \"displayName\" : \"%s\",\n"
                        + "  \"capabilities\" : {\n"
                        + "    \"recording\" : \"%s\"\n"
                        + "  },\n"
                        + "  \"timeToLive\" : %d\n"
                        + "}\n",
                givenIdentity, givenDisplayName, givenRecording, givenTimeToLive);

        setUpSuccessPostRequest(TOKEN, expectedRequest, givenResponse);

        WebRtcApi webrtcTokenApi = new WebRtcApi(getApiClient());
        WebRtcTokenRequestModel request = new WebRtcTokenRequestModel()
                .identity(givenIdentity)
                .displayName(givenDisplayName)
                .capabilities(new WebRtcCapabilities().recording(WebRtcRecording.valueOf(givenRecording)))
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
        var givenApplicationId = "test-application";
        var givenApnsCertificateFileName = "IOS_APNS_certificate.p";
        var givenApnsCertificateFileContent = "APNS certificate content";
        var givenApnsCertificatePassword = "pass";
        var givenPrivateKeyJson = "{'test': 'test'}";
        var givenAndroidConfigured = true;

        var expectedRequest = String.format(
                "{\n" + "  \"applicationId\": \"%s\",\n"
                        + "  \"android\": {\n"
                        + "    \"privateKeyJson\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenApplicationId, givenPrivateKeyJson);

        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"androidConfigured\": \"%s\"\n"
                        + "}",
                givenPushConfigurationId, givenApplicationId, givenAndroidConfigured);

        setUpSuccessPostRequest(PUSH_CONFIGURATIONS, expectedRequest, givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var request = new WebRtcPushConfigurationRequest()
                .applicationId(givenApplicationId)
                .android(new WebRtcAndroidPushNotificationConfig().privateKeyJson(givenPrivateKeyJson));

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .applicationId(givenApplicationId)
                .androidConfigured(true);

        Consumer<WebRtcPushConfigurationResponse> assertions =
                response -> then(response).isEqualTo(expectedResponse);

        var call = webrtcApi.savePushConfiguration(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateWebRtcPushConfiguration() {
        var givenApplicationId = "test-application";
        var givenApnsCertificateFileName = "IOS_APNS_certificate.p";
        var givenApnsCertificateFileContent = "APNS certificate content";
        var givenApnsCertificatePassword = "pass";
        var givenPrivateKeyJson = "{'test': 'test'}";

        var expectedRequest = String.format(
                "{\n" + "  \"applicationId\": \"%s\",\n"
                        + "  \"ios\": {\n"
                        + "    \"apnsCertificateFileName\": \"%s\",\n"
                        + "    \"apnsCertificateFileContent\": \"%s\",\n"
                        + "    \"apnsCertificatePassword\": \"%s\"\n"
                        + "  },\n"
                        + "  \"android\": {\n"
                        + "    \"privateKeyJson\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenApplicationId,
                givenApnsCertificateFileName,
                givenApnsCertificateFileContent,
                givenApnsCertificatePassword,
                givenPrivateKeyJson);

        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";
        var givenAndroidConfigured = true;
        var givenIosConfigured = true;

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"iosConfigured\": \"%s\",\n"
                        + "  \"androidConfigured\": \"%s\"\n"
                        + "}",
                givenPushConfigurationId, givenApplicationId, givenAndroidConfigured, givenIosConfigured);

        setUpSuccessPutRequest(
                PUSH_CONFIGURATION.replace("{id}", givenPushConfigurationId), Map.of(), expectedRequest, givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var request = new WebRtcPushConfigurationRequest()
                .applicationId(givenApplicationId)
                .ios(new WebRtcIosPushNotificationConfig()
                        .apnsCertificateFileName(givenApnsCertificateFileName)
                        .apnsCertificateFileContent(givenApnsCertificateFileContent)
                        .apnsCertificatePassword(givenApnsCertificatePassword))
                .android(new WebRtcAndroidPushNotificationConfig().privateKeyJson(givenPrivateKeyJson));

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .applicationId(givenApplicationId)
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
        var givenApplicationId = "test-application";
        var givenApnsCertificateFileName = "IOS_APNS_certificate.p";
        var givenApnsCertificateFileContent = "APNS certificate content";
        var givenApnsCertificatePassword = "pass";

        var givenFirstFcmServerKey = "AAAAtm7JlCY:VmoD3sz1juETi";
        var givenSecondFcmServerKey = "AAAAtm7JlCY:APA91bEe02qey";

        var givenFirstPushConfigurationId = "454d142b-a1ad-239a-d231-227fa335aadc3";
        var givenSecondPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";

        var givenPage = 0;
        var givenSize = 0;
        var givenTotalPages = 1;
        var givenTotalResults = 2L;

        var givenFirstAndroidConfigured = true;
        var givenFirstIosConfigured = true;

        var givenSecondAndroidConfigured = true;
        var givenSecondIosConfigured = true;

        var givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\",\n"
                        + "      \"androidConfigured\": \"%s\",\n"
                        + "      \"iosConfigured\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"applicationId\": \"%s\",\n"
                        + "      \"androidConfigured\": \"%s\",\n"
                        + "      \"iosConfigured\": \"%s\"\n"
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
                givenApplicationId,
                givenFirstAndroidConfigured,
                givenFirstIosConfigured,
                givenSecondPushConfigurationId,
                givenApplicationId,
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
                .applicationId(givenApplicationId)
                .androidConfigured(givenFirstAndroidConfigured)
                .iosConfigured(givenFirstIosConfigured);

        var expectedSecondConfiguration = new WebRtcPushConfigurationResponse()
                .id(givenSecondPushConfigurationId)
                .applicationId(givenApplicationId)
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
        var givenApplicationId = "test-application";
        var givenApnsCertificateFileName = "IOS_APNS_certificate.p";
        var givenApnsCertificateFileContent = "APNS certificate content";
        var givenApnsCertificatePassword = "pass";
        var givenFcmServerKey = "AAAAtm7JlCY:APA91bEe02qey";

        var givenPushConfigurationId = "894c822b-d7ba-439c-a761-141f591cace7";

        var givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"ios\": {\n"
                        + "    \"apnsCertificateFileName\": \"%s\",\n"
                        + "    \"apnsCertificateFileContent\": \"%s\",\n"
                        + "    \"apnsCertificatePassword\": \"%s\"\n"
                        + "  },\n"
                        + "  \"android\": {\n"
                        + "    \"fcmServerKey\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenPushConfigurationId,
                givenApplicationId,
                givenApnsCertificateFileName,
                givenApnsCertificateFileContent,
                givenApnsCertificatePassword,
                givenFcmServerKey);

        setUpSuccessGetRequest(PUSH_CONFIGURATION.replace("{id}", givenPushConfigurationId), Map.of(), givenResponse);

        var webrtcApi = new WebRtcApi(getApiClient());

        var expectedResponse = new WebRtcPushConfigurationResponse()
                .id(givenPushConfigurationId)
                .applicationId(givenApplicationId);

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
}
