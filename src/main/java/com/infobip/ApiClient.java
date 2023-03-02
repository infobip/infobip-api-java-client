/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import com.infobip.ApiException.RequestContext;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.time.Clock;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.*;

/**
 * Represents an API Client that can be used to call the Infobip API.
 */
public class ApiClient {

    private static final int DEFAULT_CONNECT_TIMEOUT_IN_SECONDS = 10;
    private static final int DEFAULT_READ_TIMEOUT_IN_SECONDS = 60;
    private static final int DEFAULT_WRITE_TIMEOUT_IN_SECONDS = 60;

    private final OkHttpClient httpClient;
    private final JSON json;
    private final RequestFactory requestFactory;
    private final ResponseProcessor responseProcessor;

    /**
     * {@link ApiClient} Builder class.
     */
    public static class Builder {

        private final ApiKey apiKey;
        private BaseUrl baseUrl = BaseUrl.api();
        private int connectTimeoutInSeconds = 0;
        private int readTimeoutInSeconds = 0;
        private int writeTimeoutInSeconds = 0;
        private Downloader downloader = new Downloader();
        private JSON json = new JSON();
        private OkHttpClient httpClient;

        private Builder(ApiKey apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey, "Provided API key must not be null.");
        }

        /**
         * The {@link BaseUrl} to be used for calling the Infobip API.
         *
         * @param baseUrl The {@link BaseUrl} representing the Infobip API base url.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>baseUrl</code> is null.
         */
        public Builder withBaseUrl(BaseUrl baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl, "Provided base url must not be null.");
            return this;
        }

        /**
         * The specified connect timeout.
         * <p>
         * The timeout value corresponds to OkHttp connect timeout. If provided together with the {@link OkHttpClient}
         * instance using method {@link #withHttpClient(OkHttpClient)}, the client value will be overridden by calling
         * newBuilder(). If not provided, the provided client's timeout configuration will be used. If neither timeout
         * nor client override is available, 10 seconds connect timeout will be set by default.
         *
         * @see <a href="https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/connect-timeout/">OkHttp connect timeout</a>
         * @param seconds The timeout in seconds.
         * @return This {@link Builder}.
         * @throws IllegalArgumentException if provided value is less than or equal to 0.
         */
        public Builder withConnectTimeout(int seconds) {
            if (seconds < 1) {
                throw new IllegalArgumentException("Connect timeout must be greater than 0.");
            }
            this.connectTimeoutInSeconds = seconds;
            return this;
        }

        /**
         * The specified read timeout.
         * <p>
         * The timeout value corresponds to OkHttp read timeout. If provided together with the {@link OkHttpClient}
         * instance using method {@link #withHttpClient(OkHttpClient)}, the client value will be overridden by calling
         * newBuilder(). If not provided, the provided client's timeout configuration will be used. If neither timeout
         * nor client override is available, 60 seconds read timeout will be set by default.
         *
         * @see <a href="https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/read-timeout/">OkHttp read timeout</a>
         * @param seconds The timeout in seconds.
         * @return This {@link Builder}.
         * @throws IllegalArgumentException if provided value is less than or equal to 0.
         */
        public Builder withReadTimeout(int seconds) {
            if (seconds < 1) {
                throw new IllegalArgumentException("Read timeout must be greater than 0.");
            }
            this.readTimeoutInSeconds = seconds;
            return this;
        }

        /**
         * The specified write timeout.
         * <p>
         * The timeout value corresponds to OkHttp write timeout. If provided together with the {@link OkHttpClient}
         * instance using method {@link #withHttpClient(OkHttpClient)}, the client value will be overridden by calling
         * newBuilder(). If not provided, the provided client's timeout configuration will be used. If neither timeout
         * nor client override is available, 60 seconds write timeout will be set by default.
         *
         * @see <a href="https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/write-timeout/">OkHttp write timeout</a>
         * @param seconds The timeout in seconds.
         * @return This {@link Builder}.
         * @throws IllegalArgumentException if provided value is less than or equal to 0.
         */
        public Builder withWriteTimeout(int seconds) {
            if (seconds < 1) {
                throw new IllegalArgumentException("Write timeout must be greater than 0.");
            }
            this.writeTimeoutInSeconds = seconds;
            return this;
        }

        /**
         * The {@link OkHttpClient} instance to be used as an API client.
         *
         * @param httpClient The HTTP client to be used as an API client.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>httpClient</code> is null.
         */
        public Builder withHttpClient(OkHttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "Provided HTTP client must not be null.");
            return this;
        }

        /**
         * The temporary directory path used to store downloaded files from endpoints that return a file response.
         * If not specified, the system's default temporary directory will be used.
         *
         * @param tempDirectoryPath The temporary directory {@link Path}.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>tempDirectoryPath</code> is null.
         * @throws IllegalArgumentException if provided <code>tempDirectoryPath</code> is not a writable existing directory.
         */
        public Builder withTempDirectoryPath(Path tempDirectoryPath) {
            this.downloader = new Downloader(tempDirectoryPath);
            return this;
        }

        /**
         * The {@link JSON} instance used for request and response (de)serialization.
         * <p>
         * Use this setter method only if you need to customize serialization behaviour by extending {@link JSON}
         * implementation. In general, the original default implementation should be preferred.
         *
         * @param json The {@link JSON} instance used for request and response (de)serialization.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>json</code> is null.
         */
        public Builder withJSON(JSON json) {
            this.json = Objects.requireNonNull(json, "Provided JSON must not be null.");
            return this;
        }

        /**
         * Builds and instance of {@link ApiClient} representing an Infobip API client.
         *
         * @return An instance of Infobip API client.
         */
        public ApiClient build() {
            return new ApiClient(this);
        }
    }

    private ApiClient(Builder builder) {
        this.json = builder.json;
        this.requestFactory = new RequestFactory(builder.apiKey, builder.baseUrl, json);
        DeprecationChecker deprecationChecker = new DeprecationChecker(Clock.systemUTC());
        this.responseProcessor = new ResponseProcessor(builder.downloader, json, deprecationChecker);

        boolean isTimeoutConfigured = builder.connectTimeoutInSeconds > 0
                || builder.readTimeoutInSeconds > 0
                || builder.writeTimeoutInSeconds > 0;

        if (builder.httpClient == null) {
            int connectTimeout = (builder.connectTimeoutInSeconds > 0)
                    ? builder.connectTimeoutInSeconds
                    : DEFAULT_CONNECT_TIMEOUT_IN_SECONDS;
            int readTimeout =
                    (builder.readTimeoutInSeconds > 0) ? builder.readTimeoutInSeconds : DEFAULT_READ_TIMEOUT_IN_SECONDS;
            int writeTimeout = (builder.writeTimeoutInSeconds > 0)
                    ? builder.writeTimeoutInSeconds
                    : DEFAULT_WRITE_TIMEOUT_IN_SECONDS;
            this.httpClient = new OkHttpClient.Builder()
                    .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                    .readTimeout(readTimeout, TimeUnit.SECONDS)
                    .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                    .build();
        } else if (isTimeoutConfigured) {
            OkHttpClient.Builder providedHttpClientBuilder = builder.httpClient.newBuilder();
            if (builder.connectTimeoutInSeconds > 0) {
                providedHttpClientBuilder.connectTimeout(builder.connectTimeoutInSeconds, TimeUnit.SECONDS);
            }
            if (builder.readTimeoutInSeconds > 0) {
                providedHttpClientBuilder.readTimeout(builder.readTimeoutInSeconds, TimeUnit.SECONDS);
            }
            if (builder.writeTimeoutInSeconds > 0) {
                providedHttpClientBuilder.writeTimeout(builder.writeTimeoutInSeconds, TimeUnit.SECONDS);
            }
            this.httpClient = providedHttpClientBuilder.build();
        } else {
            this.httpClient = builder.httpClient;
        }
    }

    /**
     * Returns {@link Builder} to build {@link ApiKey} for a provided {@link ApiKey}.
     * <p>
     * {@link ApiKey} instance is mandatory.
     *
     * @param apiKey Infobip API key representation.
     * @return An instance of {@link Builder} to build {@link ApiClient} instance.
     * @throws NullPointerException if provided <code>apiKey</code> is null.
     */
    public static Builder forApiKey(ApiKey apiKey) {
        return new Builder(apiKey);
    }

    /**
     * Returns the provided Infobip API {@link ApiKey}.
     *
     * @return The {@link ApiKey} instance that represents the API key to be used for authentication.
     */
    public ApiKey apiKey() {
        return requestFactory.apiKey();
    }

    /**
     * Returns the provided Infobip API {@link BaseUrl}.
     *
     * @return The {@link BaseUrl} instance that represents the base url.
     */
    public BaseUrl baseUrl() {
        return requestFactory.baseUrl();
    }

    /**
     * Returns the {@link OkHttpClient} instance used as an API client.
     *
     * @return The {@link OkHttpClient} instance used as an API client.
     */
    public OkHttpClient httpClient() {
        return httpClient;
    }

    /**
     * Returns the connection timeout (in milliseconds).
     *
     * @return The timeout in milliseconds.
     */
    public int connectTimeout() {
        return httpClient.connectTimeoutMillis();
    }

    /**
     * Returns the read timeout (in milliseconds).
     *
     * @return The timeout in milliseconds
     */
    public int readTimeout() {
        return httpClient.readTimeoutMillis();
    }

    /**
     * Returns the write timeout (in milliseconds).
     *
     * @return The timeout in milliseconds
     */
    public int writeTimeout() {
        return httpClient.writeTimeoutMillis();
    }

    /**
     * Returns the temporary directory path used to store downloaded files from endpoints that return a file response.
     * If not specified, the system's default temporary directory will be used.
     *
     * @return The temporary directory {@link Path}.
     */
    public Path tempDirectoryPath() {
        return responseProcessor.downloader().tempDirectoryPath();
    }

    /**
     * Returns the {@link JSON} instance used for request and response (de)serialization.
     *
     * @return The {@link JSON} instance used for (de)serialization.
     */
    public JSON json() {
        return json;
    }

    /**
     * Executes the API requests defined by the given {@link RequestDefinition} without result processing.
     * <p>
     * This method does not interpret the response body. It should be used for API calls that don't expect the response
     * body or the response body doesn't need to be processed.
     *
     * @param definition The API request definition.
     * @throws ApiException If the API call fails or an error occurs during the request or response processing.
     * @throws NullPointerException if provided <code>definition</code> is null.
     */
    public void execute(RequestDefinition definition) throws ApiException {
        execute(definition, null);
    }

    /**
     * Executes the API requests defined by the given {@link RequestDefinition}.
     * <p>
     * This method interprets the response body. The response body will be deserialized in the type specified by
     * the <code>returnType</code> argument.
     *
     * @param definition The API request definition.
     * @param returnType The API response body deserialization type.
     * @return The API response deserialized in the type specified by the <code>returnType</code> argument.
     * @param <T> The resulting type.
     * @throws ApiException If the API call fails or an error occurs during the request or response processing.
     * @throws NullPointerException if provided <code>definition</code> is null.
     */
    public <T> T execute(RequestDefinition definition, Type returnType) throws ApiException {
        Call call = buildCall(definition);
        Response response;
        try {
            response = call.execute();
        } catch (IOException exception) {
            throw ApiException.becauseCallExecutionFailed(
                    call.request().method(), call.request().url().encodedPath(), exception);
        }
        return responseProcessor.processResponse(response, returnType);
    }

    /**
     * Executes the API requests defined by the given {@link RequestDefinition} asynchronously without result processing.
     * <p>
     * This method does not interpret the response body. It should be used for API calls that don't expect the response
     * body or the response body doesn't need to be processed.
     *
     * @param definition The API request definition.
     * @param callback The {@link ApiCallback} to be invoked.
     * @return The {@link Call} associated with the API request.
     * @throws NullPointerException if provided <code>definition</code> is null or provided <code>callback</code> is null.
     */
    public Call executeAsync(RequestDefinition definition, ApiCallback<Void> callback) {
        return executeAsync(definition, null, callback);
    }

    /**
     * Executes the API requests defined by the given {@link RequestDefinition}.
     * <p>
     * This method interprets the response body. The response body will be deserialized in the type specified by
     * the <code>returnType</code> argument.
     *
     * @param definition The API request definition.
     * @param returnType The API response body deserialization type.
     * @param callback The {@link ApiCallback} to be invoked.
     * @return The {@link Call} associated with the API request.
     * @param <T> The resulting type.
     * @throws NullPointerException if provided <code>definition</code> is null or provided <code>callback</code> is null.
     */
    public <T> Call executeAsync(RequestDefinition definition, Type returnType, ApiCallback<T> callback) {
        Objects.requireNonNull(callback, "Provided callback must not be null.");
        Call call = buildCall(definition);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                ApiException apiException = ApiException.becauseCallExecutionFailed(
                        call.request().method(), call.request().url().encodedPath(), e);
                callback.onFailure(apiException, 0, null);
            }

            @Override
            public void onResponse(Call call, Response response) {
                T result;
                int responseStatusCode = response.code();
                Map<String, List<String>> responseHeaders = response.headers().toMultimap();
                try {
                    result = responseProcessor.processResponse(response, returnType);
                } catch (ApiException apiException) {
                    callback.onFailure(apiException, responseStatusCode, responseHeaders);
                    return;
                } catch (Exception exception) {
                    ApiException apiException = ApiException.wrapErrorDuringResponseProcessing(
                            RequestContext.tryToReadFrom(response), exception);
                    callback.onFailure(apiException, responseStatusCode, responseHeaders);
                    return;
                }
                callback.onSuccess(result, responseStatusCode, responseHeaders);
            }
        });
        return call;
    }

    private Call buildCall(RequestDefinition requestDefinition) {
        return httpClient.newCall(requestFactory.create(requestDefinition));
    }
}
