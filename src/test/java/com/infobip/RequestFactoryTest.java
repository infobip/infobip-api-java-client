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

import com.infobip.util.TestResource;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.*;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import okio.Buffer;
import okio.BufferedSink;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RequestFactoryTest {

    private static final String GIVEN_API_KEY_VALUE = "apiKeyValue";
    private static final ApiKey GIVEN_API_KEY = ApiKey.from(GIVEN_API_KEY_VALUE);
    private static final String EXPECTED_USER_AGENT_HEADER_VALUE = "infobip-api-client-java/4.1.2";

    private final OkHttpClient client = new OkHttpClient();
    private final JSON json = new JSON();

    private final MockWebServer server = new MockWebServer();

    @BeforeEach
    void setUpServer() throws IOException {
        server.enqueue(new MockResponse());
        server.start();
    }

    @AfterEach
    void shutdownServer() throws IOException {
        server.shutdown();
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullApiKeyIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new RequestFactory(null, localhost(8080), json));
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullBaseUrlIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new RequestFactory(GIVEN_API_KEY, null, json));
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullJsonIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new RequestFactory(GIVEN_API_KEY, localhost(8080), null));
    }

    @Test
    void shouldConstructRequestFactorySuccessfully() {
        // when
        BaseUrl givenBaseUrl = localhost(8080);
        RequestFactory givenRequestFactory = new RequestFactory(GIVEN_API_KEY, givenBaseUrl, json);

        // then
        then(givenRequestFactory.apiKey()).isSameAs(GIVEN_API_KEY);
        then(givenRequestFactory.baseUrl()).isSameAs(givenBaseUrl);
        then(givenRequestFactory.json()).isSameAs(json);
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullRequestDefinitionIsProvided() {
        // given
        RequestFactory factory = new RequestFactory(GIVEN_API_KEY, localhost(8080), json);

        // when, then
        thenNullPointerException().isThrownBy(() -> factory.create(null));
    }

    @Test
    void shouldReplacePathParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test/{firstParam}/path/{secondParam}";
        String givenMethod = "GET";
        String givenFirstParamValue = "givenFirstParamValue";
        String givenSecondParamValue = "givenSecondParamValue";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addPathParameter(new Parameter("firstParam", givenFirstParamValue))
                .addPathParameter(new Parameter("secondParam", givenSecondParamValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedPath = String.format("/test/%s/path/%s", givenFirstParamValue, givenSecondParamValue);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldUrlEncodePathParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test/{param}";
        String givenMethod = "GET";
        String givenParamValue = "{\"I'm\":\"not encoded\"}";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addPathParameter(new Parameter("param", givenParamValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedEncodedParamValue = "%7B%22I%27m%22%3A%22not%20encoded%22%7D";
        String expectedPath = String.format("/test/%s", expectedEncodedParamValue);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldIncludeQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String givenFirstParam = "firstParam";
        String givenFirstParamValue = "givenFirstParamValue";
        String givenSecondParam = "secondParam";
        String givenSecondParamValue = "givenSecondParamValue";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(givenFirstParam, givenFirstParamValue))
                .addQueryParameter(new Parameter(givenSecondParam, givenSecondParamValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedPath = String.format(
                "/test?%s=%s&%s=%s", givenFirstParam, givenFirstParamValue, givenSecondParam, givenSecondParamValue);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldUrlEncodeQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String notEncodedValue = "{\"I'm\":\"not encoded\"}";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(notEncodedValue, notEncodedValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedEncodedValue = "%7B%22I%27m%22%3A%22not%20encoded%22%7D";
        String expectedPath = String.format("/test?%s=%s", expectedEncodedValue, expectedEncodedValue);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldReplaceSpacesEncodedWithPlusCharacter() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String parameterToEncode = "parameterToEncode";
        String notEncodedValueContainingPlusCharacters = " Param with  spaces   ";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(parameterToEncode, notEncodedValueContainingPlusCharacters))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedEncodedValue = "%20Param%20with%20%20spaces%20%20%20";
        String expectedPath = String.format("/test?%s=%s", parameterToEncode, expectedEncodedValue);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldIncludeExplodedCollectionQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String givenCollectionParam = "collectionParam";
        String givenFirstParamValue = "givenFirstParamValue";
        String givenSecondParamValue = "givenSecondParamValue";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(givenCollectionParam, givenFirstParamValue))
                .addQueryParameter(new Parameter(givenCollectionParam, givenSecondParamValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedPath = String.format(
                "/test?%s=%s&%s=%s",
                givenCollectionParam, givenFirstParamValue, givenCollectionParam, givenSecondParamValue);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldIncludeNotExplodedCollectionQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String givenCollectionParam = "collectionParam";
        String givenFirstParamValue = "givenFirstParamValue";
        String givenSecondParamValue = "givenSecondParamValue";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(
                        new Parameter(givenCollectionParam, List.of(givenFirstParamValue, givenSecondParamValue)))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedPath = String.format(
                "/test?%s=%s", givenCollectionParam, String.join(",", givenFirstParamValue, givenSecondParamValue));
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldEncodeNotExplodedCollectionQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String givenCollectionParam = "collectionParam";
        String givenFirstParamValue = "{\"I'm\":\"not encoded\"}";
        String givenSecondParamValue = "there are spaces";
        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(
                        new Parameter(givenCollectionParam, List.of(givenFirstParamValue, givenSecondParamValue)))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedEncodedFirstParamValue = "%7B%22I%27m%22%3A%22not%20encoded%22%7D";
        String expectedEncodedSecondParamValue = "there%20are%20spaces";
        String expectedPath = String.format(
                "/test?%s=%s",
                givenCollectionParam,
                String.join(",", expectedEncodedFirstParamValue, expectedEncodedSecondParamValue));
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldUseStringRepresentationOfQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String givenParam = "collectionParam";
        String givenParamStringRepresentation = "REPRESENTATION";
        Object givenParamValue = customStringRepresentation(givenParamStringRepresentation);

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(givenParam, givenParamValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedPath = String.format("/test?%s=%s", givenParam, givenParamStringRepresentation);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldUseProperDateTimeFormatForQueryParameters() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";
        String givenDateParam = "dateParam";
        OffsetDateTime givenParamValue =
                OffsetDateTime.of(LocalDateTime.of(LocalDate.of(2023, 2, 1), LocalTime.of(10, 11, 12)), ZoneOffset.UTC);

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addQueryParameter(new Parameter(givenDateParam, givenParamValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        String expectedDateFormat = "2023-02-01T10%3A11%3A12.000%2B0000";
        String expectedPath = String.format("/test?%s=%s", givenDateParam, expectedDateFormat);
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(expectedPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
    }

    @Test
    void shouldAlwaysIncludeUserAgentHeader() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().get("User-Agent")).isEqualTo(EXPECTED_USER_AGENT_HEADER_VALUE);
    }

    @Test
    void shouldIncludeHeaders() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        String givenHeaderName = "X-Custom-Header";
        String givenHeaderValue = "customHeaderValue";
        String givenCollectionHeaderName = "X-Custom-Collection-Header";
        String givenCollectionHeaderFirstValue = "firstValue";
        String givenCollectionHeaderSecondValue = "secondValue";
        String givenIntHeaderName = "X-Validity-Period";
        int givenIntHeaderValue = 10;
        String givenCustomHeaderRepresentation = "REPRESENTATION";
        String givenHeaderWithCustomRepresentationName = "X-Custom-Representation";
        Object givenHeaderWithCustomRepresentationValue = customStringRepresentation(givenCustomHeaderRepresentation);
        String givenDateHeaderName = "X-Custom-Date";
        OffsetDateTime givenDateHeaderValue =
                OffsetDateTime.of(LocalDateTime.of(LocalDate.of(2023, 2, 1), LocalTime.of(10, 11, 12)), ZoneOffset.UTC);

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addHeaderParameter(new Parameter(givenHeaderName, givenHeaderValue))
                .addHeaderParameter(new Parameter(
                        givenCollectionHeaderName,
                        List.of(givenCollectionHeaderFirstValue, givenCollectionHeaderSecondValue)))
                .addHeaderParameter(new Parameter(givenIntHeaderName, givenIntHeaderValue))
                .addHeaderParameter(new Parameter(
                        givenHeaderWithCustomRepresentationName, givenHeaderWithCustomRepresentationValue))
                .addHeaderParameter(new Parameter(givenDateHeaderName, givenDateHeaderValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);

        Headers headers = recordedRequest.getHeaders();
        then(headers.values(givenHeaderName)).containsExactly(givenHeaderValue);
        then(headers.values(givenCollectionHeaderName))
                .containsExactly(String.join(",", givenCollectionHeaderFirstValue, givenCollectionHeaderSecondValue));
        then(headers.values(givenIntHeaderName)).containsExactly(String.valueOf(givenIntHeaderValue));
        then(headers.values(givenHeaderWithCustomRepresentationName)).containsExactly(givenCustomHeaderRepresentation);
        then(headers.values(givenDateHeaderName)).containsExactly("2023-02-01T10:11:12.000+0000");
    }

    @Test
    void shouldNotEncodeHeaderValues() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        String givenHeaderName = "X-Custom-Header";
        String givenHeaderValue = "{\"I'm\":\"not encoded\"}";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addHeaderParameter(new Parameter(givenHeaderName, givenHeaderValue))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values(givenHeaderName)).containsExactly(givenHeaderValue);
    }

    @Test
    void shouldIncludeApiKeyAuthorizationHeaderIfRequired() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .requiresAuthentication(true)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Authorization")).containsExactly("App " + GIVEN_API_KEY_VALUE);
    }

    @Test
    void shouldNotIncludeApiKeyAuthorizationHeaderIfNotRequired() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .requiresAuthentication(false)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Authorization")).isEmpty();
    }

    @Test
    void shouldNotIncludeApiKeyAuthorizationHeaderByDefault() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Authorization")).isEmpty();
    }

    @Test
    void shouldNotIncludeContentTypeAndAcceptHeadersByDefault() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().names()).doesNotContain("Content-Type", "Accept");
    }

    @Test
    void shouldIncludeContentTypeAndAcceptHeadersIfSpecified() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";
        String givenContentType = "application/x-www-form-urlencoded";
        String givenAccept = "application/json";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .contentType(givenContentType)
                .accept(givenAccept)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly(givenContentType);
        then(recordedRequest.getHeaders().values("Accept")).containsExactly(givenAccept);
    }

    @Test
    void shouldOverrideContentTypeAndAcceptHeadersIfProvidedInHeadersAsWell() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";
        String givenContentType = "application/json; charset=utf-8";
        String givenAccept = "application/json";
        String givenContentTypeToOverride = "application/xml";
        String givenAcceptToOverride = "application/xml";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addHeaderParameter(new Parameter("Content-Type", givenContentTypeToOverride))
                .addHeaderParameter(new Parameter("Accept", givenAcceptToOverride))
                .contentType(givenContentType)
                .accept(givenAccept)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly(givenContentType);
        then(recordedRequest.getHeaders().values("Accept")).containsExactly(givenAccept);
    }

    @Test
    void shouldOverrideUserAgentIfProvidedInHeadersAsWell() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addHeaderParameter(new Parameter("User-Agent", "differentUserAgent"))
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("User-Agent")).containsExactly(EXPECTED_USER_AGENT_HEADER_VALUE);
    }

    @Test
    void shouldOverrideAuthorizationIfProvidedInHeadersAsWell() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addHeaderParameter(new Parameter("Authorization", "App differentApiKey"))
                .requiresAuthentication(true)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Authorization")).containsExactly("App " + GIVEN_API_KEY_VALUE);
    }

    @Test
    void shouldProcessFormRequest() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";

        String givenStringField = "stringField";
        String givenStringFieldValue = "stringValue";
        String givenCollectionField = "collectionField";
        String givenCollectionFieldFirstValue = "firstValue";
        String givenCollectionFieldSecondValue = "secondValue";
        String givenIntField = "intField";
        int givenIntFieldValue = 10;
        String givenCustomRepresentation = "REPRESENTATION";
        String givenFieldWithCustomRepresentation = "fieldWithCustomRepresentation";
        Object givenFieldWithCustomRepresentationValue = customStringRepresentation(givenCustomRepresentation);
        String givenDateField = "dateField";
        OffsetDateTime givenDateFieldValue =
                OffsetDateTime.of(LocalDateTime.of(LocalDate.of(2023, 2, 1), LocalTime.of(10, 11, 12)), ZoneOffset.UTC);

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addFormParameter(new Parameter(givenStringField, givenStringFieldValue))
                .addFormParameter(new Parameter(
                        givenCollectionField, List.of(givenCollectionFieldFirstValue, givenCollectionFieldSecondValue)))
                .addFormParameter(new Parameter(givenIntField, givenIntFieldValue))
                .addFormParameter(
                        new Parameter(givenFieldWithCustomRepresentation, givenFieldWithCustomRepresentationValue))
                .addFormParameter(new Parameter(givenDateField, givenDateFieldValue))
                .contentType("application/x-www-form-urlencoded")
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly("application/x-www-form-urlencoded");

        String expectedDateFormat = "2023-02-01T10%3A11%3A12.000%2B0000";
        String expectedBody = String.join(
                "&",
                String.join("=", givenStringField, givenStringFieldValue),
                String.join(
                        "=",
                        givenCollectionField,
                        String.join("%2C", givenCollectionFieldFirstValue, givenCollectionFieldSecondValue)),
                String.join("=", givenIntField, String.valueOf(givenIntFieldValue)),
                String.join("=", givenFieldWithCustomRepresentation, givenCustomRepresentation),
                String.join("=", givenDateField, expectedDateFormat));
        then(recordedRequest.getBody().readUtf8()).isEqualTo(expectedBody);
    }

    @Test
    void shouldProcessMultipartFormDataRequest(@TempDir File tempDir) throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";

        String givenStringField = "stringField";
        String givenStringFieldValue = "stringValue";
        String givenCollectionField = "collectionField";
        String givenCollectionFieldFirstValue = "firstValue";
        String givenCollectionFieldSecondValue = "secondValue";
        String givenIntField = "intField";
        int givenIntFieldValue = 10;
        String givenCustomRepresentation = "REPRESENTATION";
        String givenFieldWithCustomRepresentation = "fieldWithCustomRepresentation";
        Object givenFieldWithCustomRepresentationValue = customStringRepresentation(givenCustomRepresentation);
        String givenDateField = "dateField";
        OffsetDateTime givenDateFieldValue =
                OffsetDateTime.of(LocalDateTime.of(LocalDate.of(2023, 2, 1), LocalTime.of(10, 11, 12)), ZoneOffset.UTC);
        String givenIconField = "iconField";
        File icon = iconResource();

        String givenAttachmentField = "attachmentField";
        File textFile = new File(tempDir, "attachment.txt");
        Files.writeString(textFile.toPath(), "Hello World!");
        File htmlFile = new File(tempDir, "attachment.html");
        Files.writeString(htmlFile.toPath(), "<html></html>");

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addFormParameter(new Parameter(givenStringField, givenStringFieldValue))
                .addFormParameter(new Parameter(
                        givenCollectionField, List.of(givenCollectionFieldFirstValue, givenCollectionFieldSecondValue)))
                .addFormParameter(new Parameter(givenIntField, givenIntFieldValue))
                .addFormParameter(
                        new Parameter(givenFieldWithCustomRepresentation, givenFieldWithCustomRepresentationValue))
                .addFormParameter(new Parameter(givenDateField, givenDateFieldValue))
                .addFormParameter(new Parameter(givenIconField, icon))
                .addFormParameter(new Parameter(givenAttachmentField, List.of(textFile, htmlFile)))
                .contentType("multipart/form-data")
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);

        String contentTypeHeader = recordedRequest.getHeaders().get("Content-Type");
        then(contentTypeHeader).isNotNull().startsWith("multipart/form-data; boundary=");

        Matcher contentTypeMatcher =
                Pattern.compile("^multipart/form-data; boundary=([a-z0-9-]+)$").matcher(contentTypeHeader);
        then(contentTypeMatcher.matches()).isTrue();
        String resultBoundary = contentTypeMatcher.group(1);
        then(resultBoundary).isNotNull();

        String expectedDateFormat = "2023-02-01T10:11:12.000+0000";
        MultipartBody expectedMultipartBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart(givenStringField, givenStringFieldValue)
                .addFormDataPart(givenCollectionField, givenCollectionFieldFirstValue)
                .addFormDataPart(givenCollectionField, givenCollectionFieldSecondValue)
                .addFormDataPart(givenIntField, String.valueOf(givenIntFieldValue))
                .addFormDataPart(givenFieldWithCustomRepresentation, givenCustomRepresentation)
                .addFormDataPart(givenDateField, expectedDateFormat)
                .addFormDataPart(givenIconField, icon.getName(), RequestBody.create(icon, MediaType.parse("image/png")))
                .addFormDataPart(
                        givenAttachmentField,
                        textFile.getName(),
                        RequestBody.create(textFile, MediaType.parse("text/plain")))
                .addFormDataPart(
                        givenAttachmentField,
                        htmlFile.getName(),
                        RequestBody.create(htmlFile, MediaType.parse("text/html")))
                .build();

        BufferedSink expectedBodySink = new Buffer();
        expectedMultipartBody.writeTo(expectedBodySink);
        String expectedBody =
                expectedBodySink.getBuffer().readUtf8().replaceAll(expectedMultipartBody.boundary(), resultBoundary);

        then(recordedRequest.getBody().readUtf8()).isEqualTo(expectedBody);
    }

    @Test
    void shouldSendEmptyBodyForMethodThatRequiresBodyButHasNoBodyProvided() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";

        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getBodySize()).isZero();
    }

    @Test
    void shouldNotSendBodyForMethodThatDoesNotRequireBody() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "GET";

        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getBodySize()).isZero();
    }

    @ParameterizedTest
    @ValueSource(strings = {"PUT", "POST", "DELETE", "OPTIONS", "PATCH", "TRACE"})
    void shouldSendJsonBodyForMethodsThatSupportBody(String givenMethod) throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        TestResource givenBody = new TestResource("Hello World!");

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .contentType("application/json")
                .body(givenBody)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly("application/json; charset=utf-8");
        then(recordedRequest.getBody().readUtf8()).isEqualTo(givenBody.toJsonString());
    }

    @ParameterizedTest
    @ValueSource(strings = {"GET", "HEAD"})
    void shouldFailIfBodyProvidedForMethodsThatDoesNotAcceptBody(String givenMethod) {
        // given
        String givenPath = "/test";
        TestResource givenBody = new TestResource("Hello World!");

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenBody)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        thenExceptionOfType(InternalException.class).isThrownBy(() -> requestFactory.create(givenRequestDefinition));
    }

    @Test
    void shouldUseApplicationJsonContentTypeByDefault() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";
        TestResource givenBody = new TestResource("Hello World!");

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenBody)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly("application/json; charset=utf-8");
        then(recordedRequest.getBody().readUtf8()).isEqualTo(givenBody.toJsonString());
    }

    @Test
    void shouldSendOctetStreamBody() throws IOException, InterruptedException {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";
        byte[] givenBody = "Hello World!".getBytes(StandardCharsets.UTF_8);

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .body(givenBody)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly("application/octet-stream");
        then(recordedRequest.getBody().readByteArray()).isEqualTo(givenBody);
    }

    @Test
    void shouldSendFileBody() throws IOException, InterruptedException {
        // given
        String givenPath = "/icon";
        String givenMethod = "POST";
        File icon = iconResource();

        RequestDefinition givenRequestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).body(icon).build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        sendRequest(requestFactory.create(givenRequestDefinition));

        // then
        RecordedRequest recordedRequest = server.takeRequest();
        then(recordedRequest.getPath()).isEqualTo(givenPath);
        then(recordedRequest.getMethod()).isEqualTo(givenMethod);
        then(recordedRequest.getHeaders().values("Content-Type")).containsExactly("image/png");
        then(recordedRequest.getBody().readByteArray()).isEqualTo(Files.readAllBytes(icon.toPath()));
    }

    @Test
    void shouldFailIfContentTypeIsNotSupported() {
        // given
        String givenPath = "/test";
        String givenMethod = "POST";
        String givenNotSupportedContentType = "application/xml";
        TestResource givenBody = new TestResource("Hello World!");

        RequestDefinition givenRequestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .contentType(givenNotSupportedContentType)
                .body(givenBody)
                .build();

        RequestFactory requestFactory = new RequestFactory(GIVEN_API_KEY, localhost(server.getPort()), json);

        // when
        thenExceptionOfType(InternalException.class).isThrownBy(() -> requestFactory.create(givenRequestDefinition));
    }

    private void sendRequest(Request request) throws IOException {
        client.newCall(request).execute().close();
    }

    private static Object customStringRepresentation(String customRepresentation) {
        return new Object() {
            @Override
            public String toString() {
                return customRepresentation;
            }
        };
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
