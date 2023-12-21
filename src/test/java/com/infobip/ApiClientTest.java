/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static org.assertj.core.api.BDDAssertions.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infobip.util.AsyncCallResult;
import com.infobip.util.AsyncExecutor;
import com.infobip.util.TestResource;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.*;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import okio.Buffer;
import okio.BufferedSink;
import org.assertj.core.api.ThrowingConsumer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ApiClientTest {

    private static final String GIVEN_API_KEY_VALUE = "apiKeyValue";
    private static final ApiKey GIVEN_API_KEY = ApiKey.from(GIVEN_API_KEY_VALUE);
    private static final String EXPECTED_AUTHORIZATION_HEADER = "App " + GIVEN_API_KEY_VALUE;
    private static final String EXPECTED_USER_AGENT_HEADER_PREFIX = "infobip-api-client-java";

    private final MockWebServer server = new MockWebServer();

    @BeforeEach
    void setUpServer() throws IOException {
        server.start();
    }

    @AfterEach
    void shutdownServer() throws IOException {
        server.shutdown();
    }

    @Test
    void shouldUseDefaultsWhenBuildingApiClient() {
        // given
        ApiKey givenApiKey = ApiKey.from("someApiKey");

        // when
        ApiClient apiClient = ApiClient.forApiKey(givenApiKey).build();

        // then
        then(apiClient.apiKey()).isEqualTo(givenApiKey);
        then(apiClient.baseUrl()).isEqualTo(BaseUrl.from("https://api.infobip.com"));
        String expectedSystemDefaultPath = System.getProperty("java.io.tmpdir");
        then(apiClient.tempDirectoryPath()).isEqualTo(Path.of(expectedSystemDefaultPath));

        OkHttpClient providedHttpClient = apiClient.httpClient();
        then(providedHttpClient).isNotNull();

        int libraryDefaultConnectTimeout = 10_000;
        int libraryDefaultReadTimeout = 60_000;
        int libraryDefaultWriteTimeout = 60_000;

        then(providedHttpClient.connectTimeoutMillis()).isEqualTo(libraryDefaultConnectTimeout);
        then(providedHttpClient.readTimeoutMillis()).isEqualTo(libraryDefaultReadTimeout);
        then(providedHttpClient.writeTimeoutMillis()).isEqualTo(libraryDefaultWriteTimeout);
        then(apiClient.connectTimeout()).isEqualTo(libraryDefaultConnectTimeout);
        then(apiClient.readTimeout()).isEqualTo(libraryDefaultReadTimeout);
        then(apiClient.writeTimeout()).isEqualTo(libraryDefaultWriteTimeout);

        then(apiClient.json()).isNotNull();
    }

    @Test
    void shouldBuildApiClientWithProvidedData(@TempDir File tempDir) {
        // given
        ApiKey givenApiKey = ApiKey.from("someApiKey");
        BaseUrl givenBaseUrl = BaseUrl.from("https://abcdef.api.infobip.com");
        int givenConnectTimeoutInSeconds = 5;
        int givenReadTimeoutInSeconds = 10;
        int givenWriteTimeoutInSeconds = 15;
        Path givenTempDirPath = tempDir.toPath();
        JSON givenJSON = new JSON();

        // when
        ApiClient apiClient = ApiClient.forApiKey(givenApiKey)
                .withBaseUrl(givenBaseUrl)
                .withConnectTimeout(givenConnectTimeoutInSeconds)
                .withReadTimeout(givenReadTimeoutInSeconds)
                .withWriteTimeout(givenWriteTimeoutInSeconds)
                .withTempDirectoryPath(givenTempDirPath)
                .withJSON(givenJSON)
                .build();

        // then
        then(apiClient.apiKey()).isSameAs(givenApiKey);
        then(apiClient.baseUrl()).isSameAs(givenBaseUrl);
        then(apiClient.tempDirectoryPath()).isEqualTo(givenTempDirPath);
        then(apiClient.json()).isSameAs(givenJSON);

        OkHttpClient providedHttpClient = apiClient.httpClient();
        then(providedHttpClient).isNotNull();

        then(providedHttpClient.connectTimeoutMillis()).isEqualTo(givenConnectTimeoutInSeconds * 1000);
        then(providedHttpClient.readTimeoutMillis()).isEqualTo(givenReadTimeoutInSeconds * 1000);
        then(providedHttpClient.writeTimeoutMillis()).isEqualTo(givenWriteTimeoutInSeconds * 1000);
        then(apiClient.connectTimeout()).isEqualTo(givenConnectTimeoutInSeconds * 1000);
        then(apiClient.readTimeout()).isEqualTo(givenReadTimeoutInSeconds * 1000);
        then(apiClient.writeTimeout()).isEqualTo(givenWriteTimeoutInSeconds * 1000);
    }

    @Test
    void shouldBuildApiClientWithProvidedCustomHttpClient() {
        // given
        ApiKey givenApiKey = ApiKey.from("someApiKey");
        OkHttpClient givenHttpClient = new OkHttpClient();

        // when
        ApiClient apiClient =
                ApiClient.forApiKey(givenApiKey).withHttpClient(givenHttpClient).build();

        // then
        then(apiClient.apiKey()).isEqualTo(givenApiKey);
        then(apiClient.baseUrl()).isEqualTo(BaseUrl.from("https://api.infobip.com"));
        String expectedSystemDefaultPath = System.getProperty("java.io.tmpdir");
        then(apiClient.tempDirectoryPath()).isEqualTo(Path.of(expectedSystemDefaultPath));

        then(apiClient.httpClient()).isSameAs(givenHttpClient);

        int okHttpDefaultConnectTimeout = 10_000;
        int okHttpDefaultReadTimeout = 10_000;
        int okHttpDefaultWriteTimeout = 10_000;
        then(apiClient.connectTimeout()).isEqualTo(okHttpDefaultConnectTimeout);
        then(apiClient.readTimeout()).isEqualTo(okHttpDefaultReadTimeout);
        then(apiClient.writeTimeout()).isEqualTo(okHttpDefaultWriteTimeout);
    }

    @Test
    void shouldOverrideCustomHttpClientTimeouts() {
        // given
        ApiKey givenApiKey = ApiKey.from("someApiKey");
        int givenLibraryConnectTimeoutInSeconds = 5;
        int givenLibraryReadTimeoutInSeconds = 10;
        int givenLibraryWriteTimeoutInSeconds = 15;
        int givenHttpClientConnectTimeoutInSeconds = 1;
        int givenHttpClientReadTimeoutInSeconds = 2;
        int givenHttpClientWriteTimeoutInSeconds = 3;

        OkHttpClient givenHttpClient = new OkHttpClient()
                .newBuilder()
                .connectTimeout(givenHttpClientConnectTimeoutInSeconds, TimeUnit.SECONDS)
                .readTimeout(givenHttpClientReadTimeoutInSeconds, TimeUnit.SECONDS)
                .writeTimeout(givenHttpClientWriteTimeoutInSeconds, TimeUnit.SECONDS)
                .build();

        // when
        ApiClient apiClient = ApiClient.forApiKey(givenApiKey)
                .withHttpClient(givenHttpClient)
                .withConnectTimeout(givenLibraryConnectTimeoutInSeconds)
                .withReadTimeout(givenLibraryReadTimeoutInSeconds)
                .withWriteTimeout(givenLibraryWriteTimeoutInSeconds)
                .build();

        // then
        then(apiClient.apiKey()).isEqualTo(givenApiKey);
        then(apiClient.baseUrl()).isEqualTo(BaseUrl.from("https://api.infobip.com"));
        String expectedSystemDefaultPath = System.getProperty("java.io.tmpdir");
        then(apiClient.tempDirectoryPath()).isEqualTo(Path.of(expectedSystemDefaultPath));

        then(apiClient.httpClient()).isNotNull();
        then(apiClient.connectTimeout()).isEqualTo(givenLibraryConnectTimeoutInSeconds * 1000);
        then(apiClient.readTimeout()).isEqualTo(givenLibraryReadTimeoutInSeconds * 1000);
        then(apiClient.writeTimeout()).isEqualTo(givenLibraryWriteTimeoutInSeconds * 1000);
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullApiKeyIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> ApiClient.forApiKey(null).build());
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullBaseUrlIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withBaseUrl(null)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfZeroConnectTimeoutIsProvided() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withConnectTimeout(0)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfNegativeConnectTimeoutIsProvided() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withConnectTimeout(-1)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfZeroReadTimeoutIsProvided() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withReadTimeout(0)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfNegativeReadTimeoutIsProvided() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withReadTimeout(-1)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfZeroWriteTimeoutIsProvided() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withWriteTimeout(0)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfNegativeWriteTimeoutIsProvided() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withWriteTimeout(-1)
                .build());
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullHttpClientIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withHttpClient(null)
                .build());
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullTempDirectoryPathIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withTempDirectoryPath(null)
                .build());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfProvidedPathIsNotADirectory(@TempDir File tempDir) {
        // when, then
        File givenFile = new File(tempDir, "a.txt");
        thenIllegalArgumentException().isThrownBy(() -> ApiClient.forApiKey(ApiKey.from("validApiKey"))
                .withTempDirectoryPath(givenFile.toPath())
                .build());
    }

    @Test
    void shouldGetTheResource() throws InterruptedException, ApiException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/resources/{id}";
        String givenMethod = "GET";
        String givenIdParameter = "id";
        String givenIdParameterValue = "abc";

        TestResource givenResource = new TestResource("Hello");
        int givenResponseStatusCode = 200;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "application/json")
                .set("X-Request-Id", "100")
                .build();

        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeaders(givenResponseHeaders)
                .setBody(givenResource.toJsonString());

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addPathParameter(new Parameter(givenIdParameter, givenIdParameterValue))
                .accept("application/json")
                .requiresAuthentication(true)
                .build();

        ThrowingConsumer<TestResource> responseBodyAssertions =
                resource -> then(resource).isEqualTo(givenResource);

        String expectedPath = "/resources/abc";
        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(expectedPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        };

        // sync
        server.enqueue(givenResponse);
        TestResource resource = apiClient.execute(givenRequestDefinition, TestResource.class);
        then(resource).satisfies(responseBodyAssertions);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<TestResource> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);
        then(callResult.exception()).isEmpty();
        then(callResult.result()).isNotEmpty();
        then(callResult.result().get()).satisfies(responseBodyAssertions);
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldGetResources() throws InterruptedException, ApiException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/resources";
        String givenMethod = "GET";
        String givenLimitParameter = "limit";
        int givenLimitParameterValue = 2;

        TestResource givenResource = new TestResource("Hello");
        TestResource givenAnotherResource = new TestResource("Hello");
        String givenResponseBody = "[" + givenResource.toJsonString() + "," + givenAnotherResource.toJsonString() + "]";

        int givenResponseStatusCode = 200;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "application/json")
                .set("X-Request-Id", "100")
                .build();

        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeaders(givenResponseHeaders)
                .setBody(givenResponseBody);

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(givenLimitParameter, givenLimitParameterValue))
                .accept("application/json")
                .requiresAuthentication(true)
                .build();

        Type expectedType = new TypeReference<List<TestResource>>() {}.getType();

        ThrowingConsumer<List<TestResource>> responseBodyAssertions =
                resources -> then(resources).containsExactly(givenResource, givenAnotherResource);

        String expectedPath = "/resources?limit=2";
        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(expectedPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        };

        // sync
        server.enqueue(givenResponse);
        List<TestResource> resources = apiClient.execute(givenRequestDefinition, expectedType);
        responseBodyAssertions.accept(resources);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<List<TestResource>> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, expectedType);
        then(callResult.exception()).isEmpty();
        then(callResult.result()).isNotEmpty();
        responseBodyAssertions.accept(callResult.result().get());
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldPostTheResource() throws InterruptedException, ApiException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/resources";
        String givenMethod = "POST";

        TestResource givenResource = new TestResource("Hello");
        int givenResponseStatusCode = 200;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "application/json")
                .set("X-Request-Id", "100")
                .build();

        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeaders(givenResponseHeaders)
                .setBody(givenResource.toJsonString());

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenResource)
                .accept("application/json")
                .contentType("application/json")
                .requiresAuthentication(true)
                .build();

        ThrowingConsumer<TestResource> responseBodyAssertions =
                resource -> then(resource).isEqualTo(givenResource);
        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(givenPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Content-Type")).isEqualTo("application/json; charset=utf-8");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
            then(recordedRequest.getBody().readUtf8()).isEqualTo(givenResource.toJsonString());
        };

        // sync
        server.enqueue(givenResponse);
        TestResource resource = apiClient.execute(givenRequestDefinition, TestResource.class);
        then(resource).satisfies(responseBodyAssertions);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<TestResource> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);
        then(callResult.exception()).isEmpty();
        then(callResult.result()).isNotEmpty();
        then(callResult.result().get()).satisfies(responseBodyAssertions);
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldDeleteTheResource() throws InterruptedException, ApiException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/resources/{id}";
        String givenMethod = "DELETE";
        String givenIdParameter = "id";
        String givenIdParameterValue = "abc";

        int givenResponseStatusCode = 204;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "application/json")
                .set("X-Request-Id", "100")
                .build();

        MockResponse givenResponse =
                new MockResponse().setResponseCode(givenResponseStatusCode).setHeaders(givenResponseHeaders);

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addPathParameter(new Parameter(givenIdParameter, givenIdParameterValue))
                .accept("application/json")
                .requiresAuthentication(true)
                .build();

        String expectedPath = "/resources/abc";
        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(expectedPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        };

        // sync
        server.enqueue(givenResponse);
        apiClient.execute(givenRequestDefinition);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<Void> callResult = AsyncExecutor.using(apiClient).execute(givenRequestDefinition);
        then(callResult.exception()).isEmpty();
        then(callResult.result()).isEmpty();
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldDownloadFile(@TempDir File downloadDirectory) throws InterruptedException, ApiException, IOException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withTempDirectoryPath(downloadDirectory.toPath())
                .build();

        String givenPath = "/icon";
        String givenMethod = "GET";
        String givenFileName = "icon.png";
        File givenIcon = iconResource();

        Buffer givenResponseBuffer = new Buffer();
        givenResponseBuffer.write(Files.readAllBytes(givenIcon.toPath()));
        int givenResponseStatusCode = 200;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "img/png")
                .set("X-Request-Id", "100")
                .set("Content-Disposition", "attachment;filename=\"" + givenFileName + "\"")
                .build();

        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeaders(givenResponseHeaders)
                .setBody(givenResponseBuffer);

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .accept("application/octet-stream")
                .requiresAuthentication(true)
                .build();

        ThrowingConsumer<File> fileResponseAssertions = downloadedIcon -> {
            then(downloadedIcon).hasSameBinaryContentAs(givenIcon);
            then(downloadedIcon.getName()).startsWith("icon").endsWith(".png");
            then(downloadedIcon).hasParent(downloadDirectory);
        };
        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(givenPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/octet-stream");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        };

        // sync
        server.enqueue(givenResponse);
        File downloadedFile = apiClient.execute(givenRequestDefinition, File.class);
        then(downloadedFile).satisfies(fileResponseAssertions);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<File> callResult = AsyncExecutor.using(apiClient).execute(givenRequestDefinition, File.class);
        then(callResult.exception()).isEmpty();
        then(callResult.result()).isNotEmpty();
        then(callResult.result().get()).satisfies(fileResponseAssertions);
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);

        givenResponseBuffer.close();
    }

    @Test
    void shouldSendMultipartRequest() throws InterruptedException, ApiException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/icon";
        String givenMethod = "POST";
        String givenDescriptionParameter = "description";

        String givenDescriptionParameterValue = "someDescription";
        String givenIconParameter = "icon";
        File givenIcon = iconResource();

        int givenResponseStatusCode = 200;
        Headers givenResponseHeaders = new Headers.Builder()
                .add("Content-Type", "img/png")
                .add("X-Request-Id", "100")
                .build();

        TestResource givenResponseBody = new TestResource("SUCCESS");
        MockResponse givenResponse = new MockResponse()
                .setHeaders(givenResponseHeaders)
                .setResponseCode(givenResponseStatusCode)
                .setBody(givenResponseBody.toJsonString());

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addFormParameter(new Parameter(givenDescriptionParameter, givenDescriptionParameterValue))
                .addFormParameter(new Parameter(givenIconParameter, givenIcon))
                .accept("application/json")
                .contentType("multipart/form-data")
                .requiresAuthentication(true)
                .build();

        ThrowingConsumer<TestResource> responseBodyAssertions =
                resource -> then(resource).isEqualTo(givenResponseBody);

        Pattern contentTypePattern = Pattern.compile("^multipart/form-data; boundary=([a-z0-9-]+)$");
        MultipartBody expectedMultipartBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart(givenDescriptionParameter, givenDescriptionParameterValue)
                .addFormDataPart(
                        givenIconParameter,
                        givenIcon.getName(),
                        RequestBody.create(givenIcon, MediaType.parse("image/png")))
                .build();

        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(givenPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);

            String contentTypeHeader = recordedRequest.getHeader("Content-Type");
            then(contentTypeHeader).isNotNull();
            Matcher contentTypeMatcher = contentTypePattern.matcher(contentTypeHeader);
            then(contentTypeMatcher.matches()).isTrue();
            String resultBoundary = contentTypeMatcher.group(1);
            then(resultBoundary).isNotNull();

            BufferedSink expectedBodySink = new Buffer();
            expectedMultipartBody.writeTo(expectedBodySink);
            String expectedBody = expectedBodySink
                    .getBuffer()
                    .readUtf8()
                    .replaceAll(expectedMultipartBody.boundary(), resultBoundary);

            then(recordedRequest.getBody().readUtf8()).isEqualTo(expectedBody);
            expectedBodySink.close();
        };

        // sync
        server.enqueue(givenResponse);
        TestResource resource = apiClient.execute(givenRequestDefinition, TestResource.class);
        then(resource).satisfies(responseBodyAssertions);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<TestResource> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);
        then(callResult.exception()).isEmpty();
        then(callResult.result()).isNotEmpty();
        then(callResult.result().get()).satisfies(responseBodyAssertions);
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldAcceptErrorResponses() throws InterruptedException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/resources";
        String givenMethod = "POST";
        TestResource givenResource = new TestResource("");

        int givenResponseStatusCode = 400;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "application/json")
                .set("X-Request-Id", "100")
                .build();
        String givenResponseBody = "{\n" + "  \"requestError\": {\n"
                + "    \"serviceException\": {\n"
                + "      \"messageId\": \"BAD_REQUEST\",\n"
                + "      \"text\": \"Bad request\",\n"
                + "      \"validationErrors\": {\n"
                + "        \"message\": [\n"
                + "          \"must not be empty\"\n"
                + "        ]\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + "}";

        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeaders(givenResponseHeaders)
                .setBody(givenResponseBody);

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenResource)
                .accept("application/json")
                .contentType("application/json")
                .requiresAuthentication(true)
                .build();

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setMessageId("BAD_REQUEST");
        expectedDetails.setText("Bad request");
        expectedDetails.setValidationErrors(Map.of("message", List.of("must not be empty")));
        expectedDetails.setDescription("Bad request");
        expectedDetails.setErrorCode("E400");

        var violation = new ApiExceptionDetails.Violation();
        violation.setProperty("message");
        violation.setViolation("must not be empty");

        expectedDetails.setViolations(List.of(violation));

        ThrowingConsumer<ApiException> exceptionAssertions = apiException -> {
            then(apiException)
                    .hasMessageStartingWith(String.format(
                            "Infobip API returned %d when calling %s %s.",
                            givenResponseStatusCode, givenMethod, givenPath))
                    .hasNoCause();
            then(apiException.rawResponseBody()).isEqualTo(givenResponseBody);
            then(apiException.responseStatusCode()).isEqualTo(givenResponseStatusCode);
            then(apiException.details()).isEqualTo(expectedDetails);
        };

        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(givenPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Content-Type")).isEqualTo("application/json; charset=utf-8");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        };

        // sync
        server.enqueue(givenResponse);
        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> apiClient.execute(givenRequestDefinition, TestResource.class))
                .satisfies(exceptionAssertions);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<Void> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);
        then(callResult.result()).isEmpty();
        then(callResult.exception()).isNotEmpty();
        then(callResult.exception().get()).satisfies(exceptionAssertions);
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldAcceptAdditionalFieldsInErrorResponse() throws InterruptedException {
        // given
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        String givenPath = "/resources";
        String givenMethod = "POST";
        TestResource givenResource = new TestResource("");

        int givenResponseStatusCode = 400;
        Headers givenResponseHeaders = new Headers.Builder()
                .set("Content-Type", "application/json")
                .set("X-Request-Id", "100")
                .build();
        String givenResponseBody = "{\n" + "  \"errorCode\": \"E500\",\n"
                + "  \"description\": \"A detailed description of the error\",\n"
                + "  \"action\": \"Action that should be taken to recover from the error\",\n"
                + "  \"violations\": [ \n"
                + "    {\n"
                + "      \"property\": \"messages[1].content.text\", \n"
                + "      \"violation\": \"Must not be null.\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"resources\": [ \n"
                + "    {\n"
                + "      \"name\": \"API endpoint documentation\",\n"
                + "      \"url\": \"https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message\"\n"
                + "    },\n"
                + "    {\n"
                + "      \"name\": \"Error codes description\",\n"
                + "      \"url\": \"https://www.infobip.com/docs/essentials/response-status-and-error-codes\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeaders(givenResponseHeaders)
                .setBody(givenResponseBody);

        // when, then
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenResource)
                .accept("application/json")
                .contentType("application/json")
                .requiresAuthentication(true)
                .build();

        ApiExceptionDetails.Violation violation = new ApiExceptionDetails.Violation();
        violation.setProperty("messages[1].content.text");
        violation.setViolation("Must not be null.");

        ApiExceptionDetails.Resource resource = new ApiExceptionDetails.Resource();
        resource.setName("API endpoint documentation");
        resource.setUrl("https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message");

        ApiExceptionDetails.Resource anotherResource = new ApiExceptionDetails.Resource();
        anotherResource.setName("Error codes description");
        anotherResource.setUrl("https://www.infobip.com/docs/essentials/response-status-and-error-codes");

        ApiExceptionDetails apiExceptionDetails = new ApiExceptionDetails();
        apiExceptionDetails.setErrorCode("E500");
        apiExceptionDetails.setDescription("A detailed description of the error");
        apiExceptionDetails.setAction("Action that should be taken to recover from the error");
        apiExceptionDetails.setViolations(List.of(violation));
        apiExceptionDetails.setResources(List.of(resource, anotherResource));

        ThrowingConsumer<ApiException> exceptionAssertions = apiException -> {
            then(apiException)
                    .hasMessageStartingWith(String.format(
                            "Infobip API returned %d when calling %s %s.",
                            givenResponseStatusCode, givenMethod, givenPath))
                    .hasNoCause();
            then(apiException.rawResponseBody()).isEqualTo(givenResponseBody);
            then(apiException.responseStatusCode()).isEqualTo(givenResponseStatusCode);
            then(apiException.details()).isEqualTo(apiExceptionDetails);
        };

        ThrowingConsumer<RecordedRequest> requestAssertions = recordedRequest -> {
            then(recordedRequest.getPath()).isEqualTo(givenPath);
            then(recordedRequest.getMethod()).isEqualTo(givenMethod);
            then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
            then(recordedRequest.getHeader("Content-Type")).isEqualTo("application/json; charset=utf-8");
            then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
            then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        };

        // sync
        server.enqueue(givenResponse);
        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> apiClient.execute(givenRequestDefinition, TestResource.class))
                .satisfies(exceptionAssertions);
        then(server.takeRequest()).satisfies(requestAssertions);

        // async
        server.enqueue(givenResponse);
        AsyncCallResult<Void> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);
        then(callResult.result()).isEmpty();
        then(callResult.exception()).isNotEmpty();
        then(callResult.exception().get()).satisfies(exceptionAssertions);
        then(callResult.responseStatusCode()).isEqualTo(givenResponseStatusCode);
        then(callResult.responseHeaders()).containsAllEntriesOf(givenResponseHeaders.toMultimap());
        then(server.takeRequest()).satisfies(requestAssertions);
    }

    @Test
    void shouldRespectReadTimeoutDefinitionWhenWaitingForHeaders() {
        // given
        int clientReadTimeoutInSeconds = 1;
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withReadTimeout(clientReadTimeoutInSeconds)
                .build();

        int serverDelayInSeconds = 2;
        MockResponse givenResponse = new MockResponse()
                .setResponseCode(200)
                .setHeader("Content-Type", "application/json")
                .setHeader("X-Request-Id", "100")
                .setBody(new TestResource("Hello World!").toJsonString())
                .setHeadersDelay(serverDelayInSeconds, TimeUnit.SECONDS);

        server.enqueue(givenResponse);

        // when, then
        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder("GET", "/timeout").build();
        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> apiClient.execute(givenRequestDefinition, TestResource.class))
                .havingRootCause()
                .isInstanceOfAny(SocketTimeoutException.class, SocketException.class);
    }

    @Test
    void shouldRespectReadTimeoutDefinitionWhenWaitingForHeadersDuringAsyncCall() {
        // given
        int clientReadTimeoutInSeconds = 1;
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withReadTimeout(clientReadTimeoutInSeconds)
                .build();

        int serverDelayInSeconds = 2;
        MockResponse givenResponse = new MockResponse()
                .setResponseCode(200)
                .setHeader("Content-Type", "application/json")
                .setHeader("X-Request-Id", "100")
                .setBody(new TestResource("Hello World!").toJsonString())
                .setHeadersDelay(serverDelayInSeconds, TimeUnit.SECONDS);

        server.enqueue(givenResponse);

        // when, then
        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder("GET", "/timeout").build();

        AsyncCallResult<TestResource> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);

        then(callResult.result()).isEmpty();
        then(callResult.exception()).isNotEmpty().get().satisfies(apiException -> {
            then(apiException).getRootCause().isInstanceOfAny(SocketTimeoutException.class, SocketException.class);
            then(apiException.responseStatusCode()).isZero();
            then(apiException.rawResponseBody()).isNull();
        });
    }

    @Test
    void shouldRespectReadTimeoutDefinitionWhenWaitingForBody() {
        // given
        int clientReadTimeoutInSeconds = 1;
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withReadTimeout(clientReadTimeoutInSeconds)
                .build();

        int serverDelayInSeconds = 2;
        MockResponse givenResponse = new MockResponse()
                .setResponseCode(200)
                .setHeader("Content-Type", "application/json")
                .setBody(new TestResource("Hello World!").toJsonString())
                .setBodyDelay(serverDelayInSeconds, TimeUnit.SECONDS);

        server.enqueue(givenResponse);

        // when, then
        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder("GET", "/timeout").build();
        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> apiClient.execute(givenRequestDefinition, TestResource.class))
                .havingRootCause()
                .isInstanceOfAny(SocketTimeoutException.class, SocketException.class);
    }

    @Test
    void shouldRespectReadTimeoutDefinitionWhenWaitingForBodyDuringAsyncCall() {
        // given
        int clientReadTimeoutInSeconds = 1;
        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withReadTimeout(clientReadTimeoutInSeconds)
                .build();

        int serverDelayInSeconds = 2;
        int givenResponseStatusCode = 200;
        MockResponse givenResponse = new MockResponse()
                .setResponseCode(givenResponseStatusCode)
                .setHeader("Content-Type", "application/json")
                .setBody(new TestResource("Hello World!").toJsonString())
                .setBodyDelay(serverDelayInSeconds, TimeUnit.SECONDS);

        server.enqueue(givenResponse);

        // when, then
        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder("GET", "/timeout").build();

        AsyncCallResult<TestResource> callResult =
                AsyncExecutor.using(apiClient).execute(givenRequestDefinition, TestResource.class);

        then(callResult.result()).isEmpty();
        then(callResult.exception()).isNotEmpty().get().satisfies(apiException -> {
            then(apiException).getRootCause().isInstanceOfAny(SocketTimeoutException.class, SocketException.class);
            then(apiException.responseStatusCode()).isEqualTo(givenResponseStatusCode);
            then(apiException.rawResponseBody()).isNull();
        });
    }

    @Test
    void shouldUseDefaultJSONConfigurationNotSerializingNulls() throws ApiException, InterruptedException {
        // given
        String givenPath = "/resources";
        String givenMethod = "POST";

        TestResource givenResourceWithNullMessage = new TestResource();

        server.enqueue(new MockResponse()
                .setResponseCode(200)
                .setHeader("Content-Type", "application/json")
                .setHeader("X-Request-Id", "100")
                .setBody(givenResourceWithNullMessage.toJsonString()));

        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .build();

        // when
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenResourceWithNullMessage)
                .accept("application/json")
                .contentType("application/json")
                .requiresAuthentication(true)
                .build();

        TestResource resource = apiClient.execute(givenRequestDefinition, TestResource.class);

        // then
        then(resource).isEqualTo(givenResourceWithNullMessage);

        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);

        String expectedRequestBody = "{}";
        then(recordedRequest.getBody().readUtf8()).isEqualTo(expectedRequestBody);
    }

    @Test
    void shouldRespectCustomJSONConfigurationSerializingNulls() throws ApiException, InterruptedException {
        // given
        String givenPath = "/resources";
        String givenMethod = "POST";

        TestResource givenResourceWithNullMessage = new TestResource();

        server.enqueue(new MockResponse()
                .setResponseCode(200)
                .setHeader("Content-Type", "application/json")
                .setHeader("X-Request-Id", "100")
                .setBody(givenResourceWithNullMessage.toJsonString()));

        JSON customJSON = new JSON() {
            @Override
            protected ObjectMapper configureObjectMapper() {
                ObjectMapper customObjectMapper = super.configureObjectMapper();
                customObjectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
                return customObjectMapper;
            }
        };

        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withJSON(customJSON)
                .build();

        // when
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenResourceWithNullMessage)
                .accept("application/json")
                .contentType("application/json")
                .requiresAuthentication(true)
                .build();

        TestResource resource = apiClient.execute(givenRequestDefinition, TestResource.class);

        // then
        then(resource).isEqualTo(givenResourceWithNullMessage);

        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);

        String expectedRequestBody = "{\"message\":null}";
        then(recordedRequest.getBody().readUtf8()).isEqualTo(expectedRequestBody);
    }

    @Test
    void shouldRespectCustomOkHttpClientDefinition() throws ApiException, InterruptedException {
        // given
        String givenPath = "/resource";
        String givenMethod = "GET";
        TestResource givenResource = new TestResource("Hello");

        server.enqueue(new MockResponse()
                .setResponseCode(200)
                .setHeader("Content-Type", "application/json")
                .setHeader("X-Request-Id", "100")
                .setBody(givenResource.toJsonString()));

        String customHeader = "X-Intercepted-Request";
        String customHeaderValue = "1";

        Interceptor customHeaderAdder = chain -> chain.proceed(chain.request()
                .newBuilder()
                .addHeader(customHeader, customHeaderValue)
                .build());

        OkHttpClient customClient =
                new OkHttpClient.Builder().addInterceptor(customHeaderAdder).build();

        ApiClient apiClient = ApiClient.forApiKey(GIVEN_API_KEY)
                .withBaseUrl(localhost(server.getPort()))
                .withHttpClient(customClient)
                .build();

        // when
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .accept("application/json")
                .requiresAuthentication(true)
                .build();

        TestResource resource = apiClient.execute(givenRequestDefinition, TestResource.class);

        // then
        then(resource).isEqualTo(givenResource);

        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeader("Accept")).isEqualTo("application/json");
        then(recordedRequest.getHeader("Authorization")).isEqualTo(EXPECTED_AUTHORIZATION_HEADER);
        then(recordedRequest.getHeader("User-Agent")).startsWith(EXPECTED_USER_AGENT_HEADER_PREFIX);
        then(recordedRequest.getHeader(customHeader)).isEqualTo(customHeaderValue);
    }

    private static BaseUrl localhost(int port) {
        return BaseUrl.from("http://localhost:" + port);
    }

    private static File iconResource() {
        URL iconResourceURL = ApiClientTest.class.getResource("/icon.png");
        if (iconResourceURL == null) {
            throw new RuntimeException("Required test resource can't be found!");
        }
        return new File(iconResourceURL.getFile());
    }
}
