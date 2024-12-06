package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class NumberMaskingApiTest extends ApiTest {
    private static final String NUMBER_MASKING_CONFIGURATIONS = "/voice/masking/2/config";
    private static final String NUMBER_MASKING_CONFIGURATION = "/voice/masking/2/config/{key}";
    private static final String NUMBER_MASKING_UPLOAD_AUDIO = "/voice/masking/1/upload";
    private static final String NUMBER_MASKING_CREDENTIALS = "/voice/masking/2/credentials";

    @Test
    void shouldGetVoiceMaskingConfig() {
        String givenKey = "string";
        String givenName = "string";
        String givenCallbackUrl = "string";
        String givenStatusUrl = "string";
        String givenBackupCallbackUrl = "string";
        String givenBackupStatusUrl = "string";
        String givenDescription = "string";
        String givenInsertDateTime = "2024-12-04T09:39:15Z";
        OffsetDateTime givenInsertDateTimeOffset = OffsetDateTime.parse(givenInsertDateTime);
        String givenUpdateDateTime = "2024-12-04T09:39:15Z";
        OffsetDateTime givenUpdateDateTimeOffset = OffsetDateTime.parse(givenUpdateDateTime);

        String givenResponse = String.format(
                "[{\n" + "  \"key\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"statusUrl\": \"%s\",\n"
                        + "  \"backupCallbackUrl\": \"%s\",\n"
                        + "  \"backupStatusUrl\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"insertDateTime\": \"%s\",\n"
                        + "  \"updateDateTime\": \"%s\"\n"
                        + "}]",
                givenKey,
                givenName,
                givenCallbackUrl,
                givenStatusUrl,
                givenBackupCallbackUrl,
                givenBackupStatusUrl,
                givenDescription,
                givenInsertDateTime,
                givenUpdateDateTime);

        setUpGetRequest(NUMBER_MASKING_CONFIGURATIONS, Map.of(), givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        Consumer<List<NumberMaskingSetupResponse>> assertions = (response) -> {
            then(response).isNotNull();
            then(response.size()).isEqualTo(1);
            var config = response.get(0);
            then(config.getKey()).isEqualTo(givenKey);
            then(config.getName()).isEqualTo(givenName);
            then(config.getCallbackUrl()).isEqualTo(givenCallbackUrl);
            then(config.getStatusUrl()).isEqualTo(givenStatusUrl);
            then(config.getBackupCallbackUrl()).isEqualTo(givenBackupCallbackUrl);
            then(config.getBackupStatusUrl()).isEqualTo(givenBackupStatusUrl);
            then(config.getDescription()).isEqualTo(givenDescription);
            then(config.getInsertDateTime()).isEqualTo(givenInsertDateTimeOffset);
            then(config.getUpdateDateTime()).isEqualTo(givenUpdateDateTimeOffset);
        };

        var call = api.getNumberMaskingConfigurations();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateNumberMaskingConfiguration() {
        String givenKey = "3FC0C9CB4AFAEAC67E8FC6BA3B1E044A";
        String givenName = "UniqueConfigurationName";
        String givenCallbackUrl = "http://xyz.com/1/callback";
        String givenStatusUrl = "http://xyz.com/1/status";
        String givenInsertDateTime = "2024-12-04T09:39:15Z";
        OffsetDateTime givenInsertDateTimeOffset = OffsetDateTime.parse(givenInsertDateTime);
        String givenUpdateDateTime = "2024-12-04T09:39:15Z";
        OffsetDateTime givenUpdateDateTimeOffset = OffsetDateTime.parse(givenUpdateDateTime);

        String expectedRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n" + "  \"callbackUrl\": \"%s\",\n" + "  \"statusUrl\": \"%s\"\n" + "}",
                givenName, givenCallbackUrl, givenStatusUrl);

        String givenResponse = String.format(
                "{\n" + "  \"key\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"statusUrl\": \"%s\",\n"
                        + "  \"insertDateTime\": \"%s\",\n"
                        + "  \"updateDateTime\": \"%s\"\n"
                        + "}",
                givenKey, givenName, givenCallbackUrl, givenStatusUrl, givenInsertDateTime, givenUpdateDateTime);

        setUpPostRequest(NUMBER_MASKING_CONFIGURATIONS, expectedRequest, givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        NumberMaskingSetupBody request = new NumberMaskingSetupBody()
                .name(givenName)
                .callbackUrl(givenCallbackUrl)
                .statusUrl(givenStatusUrl);

        Consumer<NumberMaskingSetupResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getKey()).isEqualTo(givenKey);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCallbackUrl()).isEqualTo(givenCallbackUrl);
            then(response.getStatusUrl()).isEqualTo(givenStatusUrl);
            then(response.getInsertDateTime()).isEqualTo(givenInsertDateTimeOffset);
            then(response.getUpdateDateTime()).isEqualTo(givenUpdateDateTimeOffset);
        };

        var call = api.createNumberMaskingConfiguration(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateNumberMaskingConfiguration() {
        String givenKey = "3FC0C9CB4AFAEAC67E8FC6BA3B1E044A";
        String givenName = "UniqueConfigurationName";
        String givenCallbackUrl = "http://xyz.com/1/callback";
        String givenStatusUrl = "http://xyz.com/1/status";
        String givenInsertDateTime = "2024-12-04T09:39:15Z";
        OffsetDateTime givenInsertDateTimeOffset = OffsetDateTime.parse(givenInsertDateTime);
        String givenUpdateDateTime = "2024-12-04T09:39:15Z";
        OffsetDateTime givenUpdateDateTimeOffset = OffsetDateTime.parse(givenUpdateDateTime);

        String expectedRequest = String.format(
                "{\n" + "  \"name\": \"%s\",\n" + "  \"callbackUrl\": \"%s\",\n" + "  \"statusUrl\": \"%s\"\n" + "}",
                givenName, givenCallbackUrl, givenStatusUrl);

        String givenResponse = String.format(
                "{\n" + "  \"key\": \"%s\",\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"callbackUrl\": \"%s\",\n"
                        + "  \"statusUrl\": \"%s\",\n"
                        + "  \"insertDateTime\": \"%s\",\n"
                        + "  \"updateDateTime\": \"%s\"\n"
                        + "}",
                givenKey, givenName, givenCallbackUrl, givenStatusUrl, givenInsertDateTime, givenUpdateDateTime);

        setUpPutRequest(
                NUMBER_MASKING_CONFIGURATION.replace("{key}", givenKey), Map.of(), expectedRequest, givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        NumberMaskingSetupBody request = new NumberMaskingSetupBody()
                .name(givenName)
                .callbackUrl(givenCallbackUrl)
                .statusUrl(givenStatusUrl);

        Consumer<NumberMaskingSetupResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getKey()).isEqualTo(givenKey);
            then(response.getName()).isEqualTo(givenName);
            then(response.getCallbackUrl()).isEqualTo(givenCallbackUrl);
            then(response.getStatusUrl()).isEqualTo(givenStatusUrl);
            then(response.getInsertDateTime()).isEqualTo(givenInsertDateTimeOffset);
            then(response.getUpdateDateTime()).isEqualTo(givenUpdateDateTimeOffset);
        };

        var call = api.updateNumberMaskingConfiguration(givenKey, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUploadAudioFile() {
        String givenUrl = "http://www.winhistory.de/more/winstart/mp3/winxp.mp3";
        String givenFileId = "cb702ae4-f356-4efd-b2dd-7a667b570af5";

        String expectedRequest = String.format("{\n" + "  \"url\": \"%s\"\n" + "}", givenUrl);

        String givenResponse = String.format("{\n" + "  \"fileId\": \"%s\"\n" + "}", givenFileId);

        setUpPostRequest(NUMBER_MASKING_UPLOAD_AUDIO, expectedRequest, givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        NumberMaskingUploadBody request = new NumberMaskingUploadBody().url(givenUrl);

        Consumer<NumberMaskingUploadResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getFileId()).isEqualTo(givenFileId);
        };

        var call = api.uploadAudioFiles(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetNumberMaskingCredentials() {
        String givenApiId = "55ddccad2df62a4b615b7e3c472b2ab6";
        String givenKey = "5da086b6a8e4424993646b8699c333ca";

        String givenResponse =
                String.format("{\n" + "  \"apiId\": \"%s\",\n" + "  \"key\": \"%s\"\n" + "}", givenApiId, givenKey);

        setUpGetRequest(NUMBER_MASKING_CREDENTIALS, Map.of(), givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        Consumer<NumberMaskingCredentialsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getApiId()).isEqualTo(givenApiId);
            then(response.getKey()).isEqualTo(givenKey);
        };

        var call = api.getNumberMaskingCredentials();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateNumberMaskingCredentials() {
        String givenApiId = "55ddccad2df62a4b615b7e3c472b2ab6";
        String givenKey = "5da086b6a8e4424993646b8699c333ca";

        String expectedRequest =
                String.format("{\n" + "  \"apiId\": \"%s\",\n" + "  \"key\": \"%s\"\n" + "}", givenApiId, givenKey);

        String givenResponse =
                String.format("{\n" + "  \"apiId\": \"%s\",\n" + "  \"key\": \"%s\"\n" + "}", givenApiId, givenKey);

        setUpPostRequest(NUMBER_MASKING_CREDENTIALS, expectedRequest, givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        NumberMaskingCredentialsBody request =
                new NumberMaskingCredentialsBody().apiId(givenApiId).key(givenKey);

        Consumer<NumberMaskingCredentialsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getApiId()).isEqualTo(givenApiId);
            then(response.getKey()).isEqualTo(givenKey);
        };

        var call = api.createNumberMaskingCredentials(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateNumberMaskingCredentials() {
        String givenApiId = "55ddccad2df62a4b615b7e3c472b2ab6";
        String givenKey = "5da086b6a8e4424993646b8699c333ca";

        String expectedRequest =
                String.format("{\n" + "  \"apiId\": \"%s\",\n" + "  \"key\": \"%s\"\n" + "}", givenApiId, givenKey);

        String givenResponse =
                String.format("{\n" + "  \"apiId\": \"%s\",\n" + "  \"key\": \"%s\"\n" + "}", givenApiId, givenKey);

        setUpPutRequest(NUMBER_MASKING_CREDENTIALS, Map.of(), expectedRequest, givenResponse, 200);

        NumberMaskingApi api = new NumberMaskingApi(getApiClient());

        NumberMaskingCredentialsBody request =
                new NumberMaskingCredentialsBody().apiId(givenApiId).key(givenKey);

        Consumer<NumberMaskingCredentialsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getApiId()).isEqualTo(givenApiId);
            then(response.getKey()).isEqualTo(givenKey);
        };

        var call = api.updateNumberMaskingCredentials(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
