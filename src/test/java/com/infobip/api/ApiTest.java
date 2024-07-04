package com.infobip.api;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.ApiKey;
import com.infobip.BaseUrl;
import com.infobip.api.util.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.fail;
import static org.assertj.core.api.BDDAssertions.then;

abstract class ApiTest {

    private static final String API_KEY_PREFIX = "App";
    private static final String API_KEY = "APIKEY";
    private static final String EXPECTED_API_KEY_HEADER_VALUE = String.format("%s %s", API_KEY_PREFIX, API_KEY);
    private static final String EXPECTED_CONTENT_TYPE_HEADER_VALUE = "application/json; charset=UTF-8";
    private static final String EXPECTED_ACCEPT_HEADER_VALUE = "application/json";
    private static final String EXPECTED_SERVER_HEADER_VALUE = "SMS API";
    private static final String EXPECTED_X_REQUEST_ID_HEADER_VALUE = "1608758729810312842";

    private final ApiCallExecutor apiCallExecutor = new ApiCallExecutor();

    private WireMockServer wireMockServer;
    private ApiClient apiClientWithApiKeyAuth;

    @BeforeEach
    void setUp() {
        wireMockServer = new WireMockServer(
                options().dynamicPort()
        );

        wireMockServer.start();

        int port = wireMockServer.port();
        configureFor(port);

        apiClientWithApiKeyAuth = ApiClient.forApiKey(ApiKey.from(API_KEY))
                .withBaseUrl(BaseUrl.from(String.format("http://localhost:%d", port)))
                .build();
    }

    protected ApiClient getApiClient() {
        return apiClientWithApiKeyAuth;
    }

    protected String getExpectedApiKeyValue() {
        return EXPECTED_API_KEY_HEADER_VALUE;
    }

    protected WireMockServer getWireMockServer() {
        return wireMockServer;
    }

    protected void setUpSuccessPostRequest(String url, Map<String, String> expectedParameters, String expectedRequest, String givenResponse) {
        setUpPostRequest(url, expectedParameters, expectedRequest, givenResponse, 200);
    }

    protected void setUpSuccessPostRequest(String url, String expectedRequest, String givenResponse) {
        setUpPostRequest(url, expectedRequest, givenResponse, 200);
    }

    protected void setUpPostRequest(String url, String expectedRequest, String givenResponse, int statusCode) {
        setUpPostRequest(url, Collections.emptyMap(), expectedRequest, givenResponse, statusCode);
    }

    protected void setUpNoBodyPostRequest(String url, Map<String, String> expectedParameters, int statusCode) {
        wireMockServer.givenThat(post(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                )
        );
    }

    protected void setUpEmptyPostRequest(String url, Map<String, String> expectedParameters, String givenResponse, int statusCode) {
        wireMockServer.givenThat(post(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                )
        );
    }

    protected void setUpPostRequest(String url, Map<String, String> expectedParameters, String expectedRequest, String givenResponse, int statusCode) {
        wireMockServer.givenThat(post(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .withRequestBody(equalToJson(expectedRequest, true, false))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                )
        );
    }

    protected void setUpNoResponseBodyPostRequest(String url, Map<String, String> expectedParameters, String expectedRequest, int statusCode) {
        wireMockServer.givenThat(post(urlPathEqualTo(url))
                                         .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                                         .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                                         .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                                         .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                                         .withQueryParams(equalToParams(expectedParameters))
                                         .withRequestBody(equalToJson(expectedRequest, true, false))
                                         .willReturn(aResponse()
                                                             .withStatus(statusCode)
                                                             .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                                                             .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                                                             .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                                         )
        );
    }

    protected void setUpNoRequestBodyDeleteRequest(String url, Map<String, String> expectedParameters, String givenResponse, int statusCode) {
        wireMockServer.givenThat(delete(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                )
        );
    }

    protected void setUpNoResponseBodyDeleteRequest(String url, Map<String, String> expectedParameters, String expectedRequest, int statusCode) {
        wireMockServer.givenThat(delete(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .withRequestBody(equalToJson(expectedRequest, true, false))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                )
        );
    }

    protected void setUpNoResponseBodyDeleteRequest(String url, Map<String, String> expectedParameters, int statusCode) {
        wireMockServer.givenThat(delete(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                )
        );
    }

    public class Multipart {
        private final String name;
        private final String body;

        public Multipart(String name, String body) {
            this.name = name;
            this.body = body;
        }

        public String getName() {
            return name;
        }

        public String getBody() {
            return body;
        }
    }

    protected void setUpMultipartRequest(String url, List<Multipart> expectedParts, String givenResponse, int statusCode) {
        MappingBuilder mappingBuilder = post(urlPathEqualTo(url));
        expectedParts.forEach(part -> mappingBuilder
                .withMultipartRequestBody(aMultipart(part.getName()).withBody(equalTo(part.getBody())))
        );
        mappingBuilder
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", matching("multipart/form-data; boundary=.*"))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                );
        wireMockServer.givenThat(mappingBuilder);
    }

    protected void setUpSuccessGetRequest(String url, Map<String, String> expectedParameters, String givenResponse) {
        setUpGetRequest(url, expectedParameters, givenResponse, 200);
    }

    protected void setUpGetRequestOctet(String url, Map<String,String> expectedParameters, String givenResponse, int statusCode){
        wireMockServer.givenThat(get(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Accept", equalTo("application/octet-stream"))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                )
        );
    }

    protected void setUpGetRequest(String url, Map<String, String> expectedParameters, String givenResponse, int statusCode) {
        wireMockServer.givenThat(get(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                )
        );
    }

    protected void setUpSuccessPutRequest(String url, Map<String, String> expectedParameters, String expectedRequest, String givenResponse) {
        setUpPutRequest(url, expectedParameters, expectedRequest, givenResponse, 200);
    }

    protected void setUpPutRequest(String url, Map<String, String> expectedParameters, String expectedRequest, String givenResponse, int statusCode) {
        wireMockServer.givenThat(put(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withRequestBody(equalToJson(expectedRequest, true, false))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                        .withBody(givenResponse)
                )
        );
    }

    protected void setUpNoResponseBodyPutRequest(String url, Map<String, String> expectedParameters, String expectedRequest, int statusCode) {
        wireMockServer.givenThat(put(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .withRequestBody(equalToJson(expectedRequest, true, false))
                .withQueryParams(equalToParams(expectedParameters))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                )
        );
    }

    protected void setUpNoContentPostRequest(String url, int statusCode) {
        wireMockServer.givenThat(post(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                )
        );
    }

    protected void setUpSuccessHeadRequest(String url) {
        wireMockServer.givenThat(head(urlPathEqualTo(url))
                .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                        .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                )
        );
    }

    protected void setUpPatchRequest(String url, Map<String, String> expectedParameters, String expectedRequest, String givenResponse, int statusCode) {
        wireMockServer.givenThat(patch(urlPathEqualTo(url))
                                         .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                                         .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                                         .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                                         .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                                         .withQueryParams(equalToParams(expectedParameters))
                                         .withRequestBody(equalToJson(expectedRequest, true, false))
                                         .willReturn(aResponse()
                                                             .withStatus(statusCode)
                                                             .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                                                             .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                                                             .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                                                             .withBody(givenResponse)
                                         )
        );
    }

    protected void setUpNoResponseBodyPatchRequest(String url, Map<String, String> expectedParameters, String expectedRequest, int statusCode) {
        wireMockServer.givenThat(patch(urlPathEqualTo(url))
                                         .withHeader("Authorization", equalTo(EXPECTED_API_KEY_HEADER_VALUE))
                                         .withHeader("Content-Type", equalTo(EXPECTED_CONTENT_TYPE_HEADER_VALUE))
                                         .withHeader("Accept", equalTo(EXPECTED_ACCEPT_HEADER_VALUE))
                                         .withHeader("User-Agent", matching("infobip-api-client-java/.*"))
                                         .withQueryParams(equalToParams(expectedParameters))
                                         .withRequestBody(equalToJson(expectedRequest, true, false))
                                         .willReturn(aResponse()
                                                             .withStatus(statusCode)
                                                             .withHeader("Content-Type", EXPECTED_CONTENT_TYPE_HEADER_VALUE)
                                                             .withHeader("Server", EXPECTED_SERVER_HEADER_VALUE)
                                                             .withHeader("X-Request-Id", EXPECTED_X_REQUEST_ID_HEADER_VALUE)
                                         )
        );
    }

    protected <T> void testSuccessfulCall(ApiCall<T> call, Consumer<T> assertions) {
        CallResult<T> callResult = apiCallExecutor.execute(call);
        assertions.accept(assertSuccess(callResult));
    }

    protected <T> void testSuccessfulCallWithFileResult(ApiCall<T> call) {
        CallResult<T> callResult = apiCallExecutor.execute(call);
        then(callResult).isNotNull();
        then(callResult.getException()).isNull();
        T result = callResult.getResult();
        then(result).isNotNull();
        then(result.getClass()).isEqualTo(File.class);
    }

    protected <T> void testFailedCall(ApiCall<T> call, Consumer<ApiException> assertions) {
        CallResult<T> callResult = apiCallExecutor.execute(call);
        assertions.accept(assertFail(callResult));
    }

    protected <T> void testSuccessfulCallWithNoBody(AsyncApiCall<T> call, int expectedStatusCode) {
        CallResultWithStatusCode<T> callResult = handleInterruption(call);
        then(callResult.getStatusCode()).isEqualTo(expectedStatusCode);
        then(callResult.getData()).isNull();
        then(callResult.getException()).isNull();
    }

    protected <T> void testSuccessfulAsyncCall(AsyncApiCall<T> call, Consumer<T> assertions) {
        CallResultWithStatusCode<T> callResult = handleInterruption(call);
        then(callResult.getException()).isNull();
        assertions.accept(callResult.getData());
    }

    protected <T> void testFailedAsyncCall(AsyncApiCall<T> call, Consumer<ApiException> assertions) {
        CallResultWithStatusCode<T> callResult = handleInterruption(call);
        then(callResult.getException()).isNotNull();
        assertions.accept(callResult.getException());
    }

    private <T> T assertSuccess(CallResult<T> callResult) {
        then(callResult).isNotNull();
        then(callResult.getException()).isNull();
        T result = callResult.getResult();
        then(result).isNotNull();
        return result;
    }

    private <T> ApiException assertFail(CallResult<T> callResult) {
        then(callResult).isNotNull();
        then(callResult.getResult()).isNull();
        ApiException exception = callResult.getException();
        then(exception).isNotNull();
        return exception;
    }

    private <T> CallResultWithStatusCode<T> handleInterruption(AsyncApiCall<T> asyncApiCall) {
        try {
            return apiCallExecutor.execute(asyncApiCall);
        } catch (InterruptedException e) {
            return fail("Async call interrupted!");
        }
    }

    private Map<String, StringValuePattern> equalToParams(Map<String, String> parameters) {
        return parameters.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> equalTo(entry.getValue())
                ));
    }

    @AfterEach
    void tearDown() {
        wireMockServer.stop();
    }
}
