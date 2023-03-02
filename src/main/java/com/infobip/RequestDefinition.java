/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents the definition of an API call.
 */
public final class RequestDefinition {

    private final String method;
    private final String path;
    private final List<Parameter> pathParameters;
    private final List<Parameter> queryParameters;
    private final List<Parameter> headerParameters;
    private final List<Parameter> formParameters;
    private final Object body;
    private final boolean requiresAuthentication;
    private final String accept;
    private final String contentType;

    private RequestDefinition(Builder builder) {
        this.method = builder.method;
        this.path = builder.path;
        this.pathParameters = List.copyOf(builder.pathParameters);
        this.queryParameters = List.copyOf(builder.queryParameters);
        this.headerParameters = List.copyOf(builder.headerParameters);
        this.formParameters = List.copyOf(builder.formParameters);
        this.body = builder.body;
        this.requiresAuthentication = builder.requiresAuthentication;
        this.accept = builder.accept;
        this.contentType = builder.contentType;
    }

    /**
     * {@link RequestDefinition} builder class.
     */
    public static class Builder {
        private final String path;
        private final String method;
        private final List<Parameter> pathParameters = new ArrayList<>();
        private final List<Parameter> queryParameters = new ArrayList<>();
        private final List<Parameter> headerParameters = new ArrayList<>();
        private final List<Parameter> formParameters = new ArrayList<>();
        private boolean requiresAuthentication;
        private Object body;
        private String accept;
        private String contentType;

        private Builder(String method, String path) {
            this.method = Objects.requireNonNull(method);
            this.path = Objects.requireNonNull(path);
        }

        /**
         * Adds a path parameter.
         *
         * @param pathParameter The given form {@link Parameter}.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>pathParameter</code> is null.
         */
        public Builder addPathParameter(Parameter pathParameter) {
            pathParameters.add(Objects.requireNonNull(pathParameter));
            return this;
        }

        /**
         * Adds a query parameter.
         *
         * @param queryParameter The given form {@link Parameter}.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>queryParameter</code> is null.
         */
        public Builder addQueryParameter(Parameter queryParameter) {
            queryParameters.add(Objects.requireNonNull(queryParameter));
            return this;
        }

        /**
         * Adds a header parameter.
         *
         * @param headerParameter The given form {@link Parameter}.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>headerParameter</code> is null.
         */
        public Builder addHeaderParameter(Parameter headerParameter) {
            headerParameters.add(Objects.requireNonNull(headerParameter));
            return this;
        }

        /**
         * Adds a form parameter.
         *
         * @param formParameter The given form {@link Parameter}.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>formParameter</code> is null.
         */
        public Builder addFormParameter(Parameter formParameter) {
            formParameters.add(Objects.requireNonNull(formParameter));
            return this;
        }

        /**
         * Sets the flag if the authentication is required.
         *
         * @param requiresAuthentication The flag indicating if the authentication is required.
         * @return This {@link Builder}.
         */
        public Builder requiresAuthentication(boolean requiresAuthentication) {
            this.requiresAuthentication = requiresAuthentication;
            return this;
        }

        /**
         * Sets the response body.
         *
         * @param body The response body.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>body</code> is null.
         */
        public Builder body(Object body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        /**
         * Sets the Accept value.
         *
         * @param accept The Accept value.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>accept</code> is null.
         */
        public Builder accept(String accept) {
            this.accept = Objects.requireNonNull(accept);
            return this;
        }

        /**
         * Sets the Content-Type value.
         *
         * @param contentType The Content-Type value.
         * @return This {@link Builder}.
         * @throws NullPointerException if provided <code>contentType</code> is null.
         */
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        /**
         * Creates {@link RequestDefinition} from the given definition.
         *
         * @return A {@link RequestDefinition} instance.
         */
        public RequestDefinition build() {
            return new RequestDefinition(this);
        }
    }

    /**
     * Returns a {@link RequestDefinition} builder instance.
     *
     * @param method The given HTTP method.
     * @param path   The given path.
     * @return A {@link Builder} instance.
     * @throws NullPointerException if either of the arguments is null.
     */
    public static Builder builder(String method, String path) {
        return new Builder(method, path);
    }

    /**
     * Returns the defined HTTP method.
     *
     * @return The HTTP method.
     */
    public String method() {
        return method;
    }

    /**
     * Returns the defined path.
     *
     * @return The path.
     */
    public String path() {
        return path;
    }

    /**
     * Returns the list of path parameters.
     *
     * @return The list of path parameters.
     */
    public List<Parameter> pathParameters() {
        return pathParameters;
    }

    /**
     * Returns the list of query parameters.
     *
     * @return The list of query parameters.
     */
    public List<Parameter> queryParameters() {
        return queryParameters;
    }

    /**
     * Returns the list of header parameters.
     *
     * @return The list of header parameters.
     */
    public List<Parameter> headerParameters() {
        return headerParameters;
    }

    /**
     * Returns the list of form parameters.
     *
     * @return The list of form parameters.
     */
    public List<Parameter> formParameters() {
        return formParameters;
    }

    /**
     * Returns <code>true</code> if the authentication is required, <code>false</code> otherwise.
     *
     * @return The flag indication if the authentication is required.
     */
    public boolean requiresAuthentication() {
        return requiresAuthentication;
    }

    /**
     * Returns the request body model if defined.
     *
     * @return The request body model.
     */
    public Optional<Object> body() {
        return Optional.ofNullable(body);
    }

    /**
     * Returns the Accept value if defined.
     *
     * @return {@link Optional} Accept.
     */
    public Optional<String> accept() {
        return Optional.ofNullable(accept);
    }

    /**
     * Returns the Content-Type value if defined.
     *
     * @return {@link Optional} Content-Type.
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(contentType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestDefinition that = (RequestDefinition) o;
        return requiresAuthentication == that.requiresAuthentication
                && method.equals(that.method)
                && path.equals(that.path)
                && queryParameters.equals(that.queryParameters)
                && headerParameters.equals(that.headerParameters)
                && formParameters.equals(that.formParameters)
                && Objects.equals(body, that.body)
                && Objects.equals(accept, that.accept)
                && Objects.equals(contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                method,
                path,
                queryParameters,
                headerParameters,
                formParameters,
                body,
                requiresAuthentication,
                accept,
                contentType);
    }

    @Override
    public String toString() {
        return "RequestDefinition{" + "method='"
                + method + '\'' + ", path='"
                + path + '\'' + ", pathParameters="
                + pathParameters + ", queryParameters="
                + queryParameters + ", headerParameters="
                + headerParameters + ", formParameters="
                + formParameters + ", body="
                + body + ", requiresAuthentication="
                + requiresAuthentication + ", accept='"
                + accept + '\'' + ", contentType='"
                + contentType + '\'' + '}';
    }
}
