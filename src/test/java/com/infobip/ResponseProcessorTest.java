/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static com.infobip.util.DeprecationNoticeLogRecorder.recordDeprecationNoticeLogs;
import static org.assertj.core.api.AssertionsForClassTypes.tuple;
import static org.assertj.core.api.BDDAssertions.*;

import com.infobip.util.DeprecationNoticeLogRecorder.ResultWithLogRecords;
import com.infobip.util.TestResource;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.Buffer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class ResponseProcessorTest {

    private static final Instant NOW =
            OffsetDateTime.parse("2023-02-09T12:00:00+01:00").toInstant();
    private static final String THREE_MONTHS_AGO_RFC1123 = "Wed, 9 Nov 2022 11:00:00 GMT";
    private static final String THREE_MONTHS_FROM_NOW_RFC1123 = "Tue, 9 May 2023 11:00:00 GMT";
    private static final String THREE_MONTHS_FROM_NOW_ISO_LOCAL_DATE = "2023-05-09";
    private static final Clock FIXED_CLOCK = Clock.fixed(NOW, ZoneOffset.ofHours(1));

    private static final String SUPPORT_EMAIL = "support@infobip.com";

    private final Downloader downloader = new Downloader();
    private final JSON json = new JSON();
    private final DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

    private final OkHttpClient client = new OkHttpClient();
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
    void shouldThrowNullPointerExceptionIfNullDownloaderIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new ResponseProcessor(null, json, deprecationChecker));
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullJsonIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new ResponseProcessor(downloader, null, deprecationChecker));
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullDeprecationCheckerIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new ResponseProcessor(downloader, json, null));
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullResponseIsProvided() {
        // given
        ResponseProcessor givenResponseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when, then
        thenNullPointerException().isThrownBy(() -> givenResponseProcessor.processResponse(null, String.class));
    }

    @Test
    void shouldConstructResponseProcessorSuccessfully() {
        // when
        ResponseProcessor givenResponseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // then
        then(givenResponseProcessor.downloader()).isSameAs(downloader);
        then(givenResponseProcessor.json()).isSameAs(json);
    }

    @Test
    void shouldIgnoreBodyIfNullTypeIsProvided() throws IOException, ApiException {
        // given
        MockResponse mockResponse = new MockResponse().setBody("Hello World!");
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        Object processedResponse = responseProcessor.processResponse(response, null);

        // then
        then(processedResponse).isNull();
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldProcessStringResponseBody() throws IOException, ApiException {
        // given
        String givenBody = "Hello World!";
        MockResponse mockResponse = new MockResponse().setBody(givenBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        Object processedResponse = responseProcessor.processResponse(response, String.class);

        // then
        then(processedResponse).isEqualTo(givenBody);
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldProcessUtf8StringResponseBody() throws IOException, ApiException {
        // given
        String givenBody = "Č";
        MockResponse mockResponse = new MockResponse().setBody(givenBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        String processedResponse = responseProcessor.processResponse(response, String.class);

        // then
        then(processedResponse).isEqualTo(givenBody);
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldProcessByteArrayResponseBody() throws IOException, ApiException {
        // given
        byte[] givenBodyBytes = "Hello World!".getBytes(StandardCharsets.UTF_8);
        Buffer givenBody = new Buffer().write(givenBodyBytes);
        MockResponse mockResponse = new MockResponse().setBody(givenBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        byte[] processedResponse = responseProcessor.processResponse(response, byte[].class);

        // then
        then(processedResponse).isEqualTo(givenBodyBytes);
        thenResponseBodyIsClosed(response);
        givenBody.close();
    }

    @Test
    void shouldProcessFileResponseBodyThroughDownloader(@TempDir File tempDir) throws IOException, ApiException {
        // given
        File icon = iconResource();
        Buffer givenBody = new Buffer().write(Files.readAllBytes(icon.toPath()));
        MockResponse mockResponse = new MockResponse().setBody(givenBody);
        server.enqueue(mockResponse);

        Downloader givenDownloader = new Downloader(tempDir.toPath());
        ResponseProcessor responseProcessor = new ResponseProcessor(givenDownloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        File processedResponse = responseProcessor.processResponse(response, File.class);

        // then
        then(processedResponse).hasParent(tempDir);
        then(processedResponse).hasSameBinaryContentAs(icon);
        thenResponseBodyIsClosed(response);
        givenBody.close();
    }

    @Test
    void shouldProcessJsonResponseBody() throws IOException, ApiException {
        // given
        TestResource testBody = new TestResource("Hello World!");
        MockResponse mockResponse = new MockResponse().setBody(testBody.toJsonString());
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        TestResource processedResponse = responseProcessor.processResponse(response, TestResource.class);

        // then
        then(processedResponse).isEqualTo(testBody);
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldNotFailIfAdditionalFieldsWereAddedToResponse() throws IOException, ApiException {
        // given
        MockResponse mockResponse = new MockResponse().setBody("{\"message\":\"Hello World!\",\"note\":\"Hi!\"}");
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        TestResource processedResponse = responseProcessor.processResponse(response, TestResource.class);

        // then
        TestResource expectedTestBody = new TestResource("Hello World!");
        then(processedResponse).isEqualTo(expectedTestBody);
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldThrowApiExceptionForMalformedResponseBody() throws IOException {
        // given
        int givenResponseCode = 200;
        String invalidJson = "{\"note\":";
        MockResponse mockResponse =
                new MockResponse().setResponseCode(givenResponseCode).setBody(invalidJson);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when, then
        Response response = sendRequest(server);
        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> responseProcessor.processResponse(response, TestResource.class))
                .withCauseInstanceOf(JSONException.class)
                .satisfies(
                        apiException -> then(apiException.responseStatusCode()).isEqualTo(givenResponseCode));
    }

    @Test
    void shouldThrowApiExceptionIfRequestFailsWith4XXStatus() throws IOException {
        // given
        int givenResponseCode = 400;
        String givenResponseBody = "{\n" + "  \"requestError\": {\n"
                + "    \"serviceException\": {\n"
                + "      \"messageId\": \"BAD_REQUEST\",\n"
                + "      \"text\": \"Bad request\",\n"
                + "      \"validationErrors\": {\n"
                + "        \"message\": [\n"
                + "          \"must not be null\"\n,"
                + "          \"must not be empty\"\n"
                + "        ]\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + "}";
        MockResponse mockResponse =
                new MockResponse().setResponseCode(givenResponseCode).setBody(givenResponseBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when, then
        Response response = sendRequest(server);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setMessageId("BAD_REQUEST");
        expectedDetails.setText("Bad request");
        expectedDetails.setValidationErrors(Map.of("message", List.of("must not be null", "must not be empty")));
        expectedDetails.setErrorCode("E400");
        expectedDetails.setDescription("Bad request");

        var violation1 = new ApiExceptionDetails.Violation();
        violation1.setProperty("message");
        violation1.setViolation("must not be null");

        var violation2 = new ApiExceptionDetails.Violation();
        violation2.setProperty("message");
        violation2.setViolation("must not be empty");

        expectedDetails.setViolations(List.of(violation1, violation2));

        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> responseProcessor.processResponse(response, TestResource.class))
                .withNoCause()
                .satisfies(
                        apiException -> then(apiException.responseStatusCode()).isEqualTo(givenResponseCode))
                .satisfies(apiException -> then(apiException.rawResponseBody()).isEqualTo(givenResponseBody))
                .satisfies(apiException -> then(apiException.details()).isEqualTo(expectedDetails));
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldThrowApiExceptionIfRequestFailsWith4XXStatusAndAdditionalErrorFields() throws IOException {
        // given
        int givenResponseCode = 400;
        String givenResponseBody = "{\n" + "  \"errorCode\": \"E400\",\n"
                + "  \"description\": \"Provided request can not be processed.\",\n"
                + "  \"action\": \"Check request syntax and provided violations to adjust the request accordingly.\",\n"
                + "  \"violations\": [\n"
                + "    {\n"
                + "      \"property\": \"Some property\",\n"
                + "      \"violation\": \"Some violation\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"resources\": [\n"
                + "    {\n"
                + "      \"name\": \"API docs\",\n"
                + "      \"url\": \"https://www.infobip.com/docs/api\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        MockResponse mockResponse =
                new MockResponse().setResponseCode(givenResponseCode).setBody(givenResponseBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when, then
        Response response = sendRequest(server);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setErrorCode("E400");
        expectedDetails.setDescription("Provided request can not be processed.");
        expectedDetails.setAction("Check request syntax and provided violations to adjust the request accordingly.");

        var violation = new ApiExceptionDetails.Violation();
        violation.setProperty("Some property");
        violation.setViolation("Some violation");
        expectedDetails.setViolations(List.of(violation));

        var resource = new ApiExceptionDetails.Resource();
        resource.setName("API docs");
        resource.setUrl("https://www.infobip.com/docs/api");
        expectedDetails.setResources(List.of(resource));

        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> responseProcessor.processResponse(response, TestResource.class))
                .withNoCause()
                .satisfies(
                        apiException -> then(apiException.responseStatusCode()).isEqualTo(givenResponseCode))
                .satisfies(apiException -> then(apiException.rawResponseBody()).isEqualTo(givenResponseBody))
                .satisfies(apiException -> then(apiException.details()).isEqualTo(expectedDetails));
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldThrowApiExceptionIfRequestFailsWith5XXStatus() throws IOException {
        // given
        int givenResponseCode = 500;
        String givenResponseBody = "{\n" + "  \"requestError\": {\n"
                + "    \"serviceException\": {\n"
                + "      \"messageId\": \"GENERAL_ERROR\",\n"
                + "      \"text\": \"Something went wrong. Please contact support.\"\n"
                + "    }\n"
                + "  }\n"
                + "}";
        MockResponse mockResponse =
                new MockResponse().setResponseCode(givenResponseCode).setBody(givenResponseBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when, then
        Response response = sendRequest(server);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setMessageId("GENERAL_ERROR");
        expectedDetails.setText("Something went wrong. Please contact support.");
        expectedDetails.setErrorCode("E500");
        expectedDetails.setDescription("Something went wrong. Please contact support.");

        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> responseProcessor.processResponse(response, TestResource.class))
                .withNoCause()
                .satisfies(
                        apiException -> then(apiException.responseStatusCode()).isEqualTo(givenResponseCode))
                .satisfies(apiException -> then(apiException.rawResponseBody()).isEqualTo(givenResponseBody))
                .satisfies(apiException -> then(apiException.details()).isEqualTo(expectedDetails));
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldThrowApiExceptionIfRequestFailsWith5XXStatusAndAdditionalErrorFields() throws IOException {
        // given
        int givenResponseCode = 500;
        String givenResponseBody = "{\n" + "  \"errorCode\": \"E500\",\n"
                + "  \"description\": \"Something went wrong.\",\n"
                + "  \"action\": \"Please contact the support.\",\n"
                + "  \"violations\": [\n"
                + "    {\n"
                + "      \"property\": \"Some property\",\n"
                + "      \"violation\": \"Some violation\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"resources\": [\n"
                + "    {\n"
                + "      \"name\": \"API docs\",\n"
                + "      \"url\": \"https://www.infobip.com/docs/api\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        MockResponse mockResponse =
                new MockResponse().setResponseCode(givenResponseCode).setBody(givenResponseBody);
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when, then
        Response response = sendRequest(server);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setErrorCode("E500");
        expectedDetails.setDescription("Something went wrong.");
        expectedDetails.setAction("Please contact the support.");

        var violation = new ApiExceptionDetails.Violation();
        violation.setProperty("Some property");
        violation.setViolation("Some violation");
        expectedDetails.setViolations(List.of(violation));

        var resource = new ApiExceptionDetails.Resource();
        resource.setName("API docs");
        resource.setUrl("https://www.infobip.com/docs/api");
        expectedDetails.setResources(List.of(resource));

        thenExceptionOfType(ApiException.class)
                .isThrownBy(() -> responseProcessor.processResponse(response, TestResource.class))
                .withNoCause()
                .satisfies(
                        apiException -> then(apiException.responseStatusCode()).isEqualTo(givenResponseCode))
                .satisfies(apiException -> then(apiException.rawResponseBody()).isEqualTo(givenResponseBody))
                .satisfies(apiException -> then(apiException.details()).isEqualTo(expectedDetails));
        thenResponseBodyIsClosed(response);
    }

    @Test
    void shouldRespectDeprecationAndSunsetHeaders() throws IOException {
        // given
        TestResource testBody = new TestResource("Hello World!");

        MockResponse mockResponse = new MockResponse()
                .setHeader("Deprecation", THREE_MONTHS_AGO_RFC1123)
                .setHeader("Sunset", THREE_MONTHS_FROM_NOW_RFC1123)
                .setBody(testBody.toJsonString());
        server.enqueue(mockResponse);

        ResponseProcessor responseProcessor = new ResponseProcessor(downloader, json, deprecationChecker);

        // when
        Response response = sendRequest(server);
        ResultWithLogRecords<TestResource> resultWithLogRecords = recordDeprecationNoticeLogs(() -> {
            try {
                return responseProcessor.processResponse(response, TestResource.class);
            } catch (ApiException e) {
                throw new RuntimeException("This case should not happen.", e);
            }
        });

        // then
        then(resultWithLogRecords.result()).isEqualTo(testBody);

        String expectedDeprecationNotice = String.format(
                "As of %s UTC, the endpoint GET / will no longer be available. "
                        + "To avoid disruption, kindly update the library or reach out to %s.",
                THREE_MONTHS_FROM_NOW_ISO_LOCAL_DATE, SUPPORT_EMAIL);
        then(resultWithLogRecords.logRecords())
                .extracting(LogRecord::getLevel, LogRecord::getMessage)
                .containsExactly(tuple(Level.WARNING, expectedDeprecationNotice));

        thenResponseBodyIsClosed(response);
    }

    private Response sendRequest(MockWebServer server) throws IOException {
        Request request = new Request.Builder().url(server.url("/")).build();
        return client.newCall(request).execute();
    }

    private static void thenResponseBodyIsClosed(Response response) {
        then(response.body().source().isOpen()).isFalse();
    }

    private static File iconResource() {
        URL iconResourceURL = ResponseProcessorTest.class.getResource("/icon.png");
        if (iconResourceURL == null) {
            throw new RuntimeException("Required test resource can't be found!");
        }
        return new File(iconResourceURL.getFile());
    }
}
