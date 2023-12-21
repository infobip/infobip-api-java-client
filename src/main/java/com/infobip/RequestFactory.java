/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okhttp3.*;
import okhttp3.internal.http.HttpMethod;

/**
 * Request factory class. It should only be used internally by {@link com.infobip.ApiClient}.
 */
final class RequestFactory {

    private static final String USER_AGENT_HEADER_VALUE = "infobip-api-client-java/4.1.0";

    private final ApiKey apiKey;
    private final BaseUrl baseUrl;
    private final JSON json;

    /**
     * {@link RequestFactory} constructor.
     *
     * @param apiKey The given {@link ApiKey}.
     * @param baseUrl The given {@link BaseUrl}.
     * @param json The {@link JSON} instance.
     * @throws NullPointerException if either of the arguments is null.
     */
    RequestFactory(ApiKey apiKey, BaseUrl baseUrl, JSON json) {
        this.apiKey = Objects.requireNonNull(apiKey);
        this.baseUrl = Objects.requireNonNull(baseUrl);
        this.json = Objects.requireNonNull(json);
    }

    /**
     * Returns the provided Infobip API {@link ApiKey}.
     *
     * @return {@link ApiKey} representing API key.
     */
    ApiKey apiKey() {
        return apiKey;
    }

    /**
     * Returns the provided Infobip API {@link BaseUrl}.
     *
     * @return {@link BaseUrl} instance representing base url.
     */
    BaseUrl baseUrl() {
        return baseUrl;
    }

    /**
     * The {@link JSON} instance used for response deserialization by the processor.
     *
     * @return {@link JSON} used for response deserialization.
     */
    JSON json() {
        return json;
    }

    /**
     * Creates OkHttp {@link Request} instance from given Request definition instance.
     *
     * @param definition The request definition.
     * @return The OkHttp {@link Request} instance.
     * @throws NullPointerException if provided <code>definition</code> is null.
     */
    Request create(RequestDefinition definition) {
        Objects.requireNonNull(definition);

        return new Request.Builder()
                .url(buildUrl(definition))
                .headers(buildHeaders(definition))
                .method(definition.method(), buildRequestBody(definition))
                .build();
    }

    private HttpUrl buildUrl(RequestDefinition definition) {
        String path = definition.path();
        for (Parameter param : definition.pathParameters()) {
            path = path.replaceAll("\\{" + param.name() + "}", asUrlEncodedString(param.value()));
        }

        URL apiUrl = baseUrl.getUrl();
        HttpUrl.Builder httpUrlBuilder = new HttpUrl.Builder()
                .scheme(apiUrl.getProtocol())
                .host(apiUrl.getHost())
                .encodedPath(path);
        if (apiUrl.getPort() != -1) {
            httpUrlBuilder.port(apiUrl.getPort());
        }

        definition
                .queryParameters()
                .forEach(param -> httpUrlBuilder.addEncodedQueryParameter(
                        urlEncode(param.name()), asUrlEncodedString(param.value())));

        return httpUrlBuilder.build();
    }

    private Headers buildHeaders(RequestDefinition definition) {
        Headers.Builder headersBuilder = new Headers.Builder();
        definition.headerParameters().forEach(param -> headersBuilder.set(param.name(), asString(param.value())));
        if (definition.requiresAuthentication()) {
            headersBuilder.set("Authorization", apiKey.getAuthorizationHeaderValue());
        }
        headersBuilder.set("User-Agent", USER_AGENT_HEADER_VALUE);
        definition.accept().ifPresent(accept -> headersBuilder.set("Accept", accept));
        definition.contentType().ifPresent(contentType -> headersBuilder.set("Content-Type", contentType));
        return headersBuilder.build();
    }

    private RequestBody buildRequestBody(RequestDefinition definition) {
        MediaType requestMediaType =
                definition.contentType().map(MediaTypeRegistry::parse).orElse(MediaTypeRegistry.JSON);

        if (MediaTypeRegistry.FORM.equals(requestMediaType)) {
            return buildRequestBodyFormEncoding(definition.formParameters());
        }
        if (MediaTypeRegistry.MULTIPART.equals(requestMediaType)) {
            return buildRequestBodyMultipart(definition.formParameters());
        }

        if (definition.body().isEmpty()) {
            if (HttpMethod.requiresRequestBody(definition.method())) {
                return RequestBody.create("", requestMediaType);
            }
            return null;
        }
        if (!HttpMethod.permitsRequestBody(definition.method())) {
            throw InternalException.becauseBodyWasDefinedForMethodThatDoesNotPermitIt();
        }

        Object bodyRepresentation = definition.body().get();
        if (bodyRepresentation instanceof byte[]) {
            return RequestBody.create((byte[]) bodyRepresentation, MediaTypeRegistry.OCTET_STREAM);
        }
        if (bodyRepresentation instanceof File) {
            File file = (File) bodyRepresentation;
            return RequestBody.create(file, guessMediaType(file));
        }
        if (MediaTypeRegistry.JSON.equals(requestMediaType)) {
            try {
                return RequestBody.create(json.serialize(bodyRepresentation), requestMediaType);
            } catch (JSONException jsonException) {
                throw InternalException.becauseRequestBodySerializationFailed(jsonException);
            }
        }
        throw InternalException.becauseRequestBodyCanNotBeProcessed();
    }

    private RequestBody buildRequestBodyFormEncoding(List<Parameter> formParams) {
        FormBody.Builder formBuilder = new FormBody.Builder();
        formParams.forEach(param -> formBuilder.add(param.name(), asString(param.value())));
        return formBuilder.build();
    }

    private RequestBody buildRequestBodyMultipart(List<Parameter> formParams) {
        MultipartBody.Builder multipartBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        formParams.stream()
                .flatMap(param -> {
                    if (param.value() instanceof Collection) {
                        return ((Collection<?>) param.value())
                                .stream().map(paramValue -> new Parameter(param.name(), paramValue));
                    }
                    return Stream.of(param);
                })
                .forEach(param -> {
                    if (param.value() instanceof File) {
                        File file = (File) param.value();
                        MediaType mediaType = guessMediaType(file);
                        multipartBuilder.addFormDataPart(
                                param.name(), file.getName(), RequestBody.create(file, mediaType));
                    } else {
                        multipartBuilder.addFormDataPart(param.name(), asString(param.value()));
                    }
                });
        return multipartBuilder.build();
    }

    private MediaType guessMediaType(File file) {
        return Optional.of(file.getName())
                .map(URLConnection::guessContentTypeFromName)
                .map(MediaTypeRegistry::parse)
                .orElse(MediaTypeRegistry.OCTET_STREAM);
    }

    private static String urlEncode(String string) {
        return URLEncoder.encode(string, StandardCharsets.UTF_8).replace("+", "%20");
    }

    private String asString(Object parameter) {
        if (parameter instanceof Collection) {
            return ((Collection<?>) parameter)
                    .stream()
                            .map(param -> singularStringRepresentation(param, false))
                            .collect(Collectors.joining(","));
        }
        return singularStringRepresentation(parameter, false);
    }

    private String asUrlEncodedString(Object parameter) {
        if (parameter instanceof Collection) {
            return ((Collection<?>) parameter)
                    .stream()
                            .map(param -> singularStringRepresentation(param, true))
                            .collect(Collectors.joining(","));
        }
        return singularStringRepresentation(parameter, true);
    }

    private String singularStringRepresentation(Object parameter, boolean encode) {
        if (parameter == null) {
            return "";
        }
        String stringRepresentation;
        if (parameter instanceof OffsetDateTime) {
            stringRepresentation = json.dateTimeFormatter().format((OffsetDateTime) parameter);
        } else {
            stringRepresentation = parameter.toString();
        }
        return (encode) ? urlEncode(stringRepresentation) : stringRepresentation;
    }

    private static final class MediaTypeRegistry {

        private static final MediaType JSON = MediaType.get("application/json");
        private static final MediaType OCTET_STREAM = MediaType.get("application/octet-stream");
        private static final MediaType MULTIPART = MediaType.get("multipart/form-data");
        private static final MediaType FORM = MediaType.get("application/x-www-form-urlencoded");

        private static final Map<String, MediaType> COMMON_EXPECTED_TYPES = Map.of(
                "application/json", JSON,
                "application/octet-stream", OCTET_STREAM,
                "multipart/form-data", MULTIPART,
                "application/x-www-form-urlencoded", FORM);

        private MediaTypeRegistry() {}

        static MediaType parse(String mediaType) {
            MediaType commonType = COMMON_EXPECTED_TYPES.get(mediaType);
            if (commonType != null) {
                return commonType;
            }
            return MediaType.parse(mediaType);
        }
    }
}
