/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.Objects;
import okhttp3.Response;

/**
 * The exception that may be thrown when calling Infobip API using {@link ApiClient} class.
 * <p>
 * If you encounter this exception, please explore the information like message, cause, response status code or response body.
 * If you are having issues interpreting the error, feel free to contact us on support@infobip.com.
 */
public final class ApiException extends Exception {

    private static final String SUPPORT_EMAIL = "support@infobip.com";

    private static final String OFFICIAL_MESSAGE =
            "If you are having trouble interpreting the error, contact " + SUPPORT_EMAIL
                    + " or open an issue on our Github repo." + "Include all details you find relevant. "
                    + "Thank you for using our library!";

    private final int responseStatusCode;
    private final String rawResponseBody;
    private final ApiExceptionDetails details;

    /**
     * {@link ApiException} builder class.
     */
    public static final class Builder {
        private String message;
        private Throwable cause;
        private int responseStatusCode;
        private String rawResponseBody;
        private ApiExceptionDetails details;

        private Builder() {}

        /**
         * Sets the exception message.
         *
         * @param message The exception message.
         * @return This {@link Builder}.
         */
        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the exception cause.
         *
         * @param cause The exception cause.
         * @return This {@link Builder}.
         */
        public Builder withCause(Throwable cause) {
            this.cause = cause;
            return this;
        }

        /**
         * Sets the response HTTP status code.
         *
         * @param responseStatusCode The response status code.
         * @return This {@link Builder}.
         */
        public Builder withResponseStatusCode(int responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }

        /**
         * Sets the raw response body received from the server.
         *
         * @param rawResponseBody The raw response body as {@link String}.
         * @return This {@link Builder}.
         */
        public Builder withRawResponseBody(String rawResponseBody) {
            this.rawResponseBody = rawResponseBody;
            return this;
        }

        /**
         * Sets the {@link ApiExceptionDetails}. Details are usually parsed from the response body..
         *
         * @param details The {@link ApiExceptionDetails} abstraction.
         * @return This {@link Builder}.
         */
        public Builder withDetails(ApiExceptionDetails details) {
            this.details = details;
            return this;
        }

        public ApiException build() {
            return new ApiException(this);
        }
    }

    private ApiException(Builder builder) {
        super(builder.message, builder.cause);
        this.responseStatusCode = builder.responseStatusCode;
        this.rawResponseBody = builder.rawResponseBody;
        this.details = builder.details;
    }

    /**
     * Returns the {@link Builder} instance.
     *
     * @return {@link Builder} instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the received HTTP status code or 0 if there was no response.
     *
     * @return The received HTTP status code.
     */
    public int responseStatusCode() {
        return responseStatusCode;
    }

    /**
     * Returns the raw HTTP response body received from the server or <code>null</code> if there was no response.
     *
     * @return The received response body.
     */
    public String rawResponseBody() {
        return rawResponseBody;
    }

    /**
     * Returns request error details model or <code>null</code> if details could not be extracted from response.
     *
     * @return The parsed {@link ApiExceptionDetails} model.
     */
    public ApiExceptionDetails details() {
        return details;
    }

    static ApiException becauseApiRequestFailed(
            RequestContext context, String rawResponseBody, ApiExceptionDetails details) {
        int responseStatusCode = context.getResponseStatusCode();
        String message = String.format(
                "Infobip API returned %d when calling %s %s. " + "Check the response body for details. "
                        + "If you are having trouble interpreting the response, contact %s. "
                        + "Include all details you find relevant. "
                        + "Thank you for using our library!",
                responseStatusCode, context.getMethod(), context.getEncodedPath(), SUPPORT_EMAIL);
        return ApiException.builder()
                .withMessage(message)
                .withResponseStatusCode(responseStatusCode)
                .withRawResponseBody(rawResponseBody)
                .withDetails(details)
                .build();
    }

    static ApiException becauseOfUnsuccessfulResponseBodyReading(RequestContext context, Throwable cause) {
        int responseStatusCode = context.getResponseStatusCode();
        String message = String.format(
                "There was an error when reading the response body. "
                        + "Infobip API responded with status code %d upon calling %s %s. "
                        + "This can happen due to a response timeout, networking issues or an invalid deserialization definition. "
                        + "Check the exception's root cause for more details. %s",
                responseStatusCode, context.getMethod(), context.getEncodedPath(), OFFICIAL_MESSAGE);
        return ApiException.builder()
                .withMessage(message)
                .withCause(cause)
                .withResponseStatusCode(responseStatusCode)
                .build();
    }

    static ApiException becauseCallExecutionFailed(String method, String encodedPath, Throwable cause) {
        String message = String.format(
                "There was an error when executing the API call %s %s. "
                        + "This can happen due to a response timeout, networking issues or something similar. "
                        + "Check the exception's root cause for more details. %s",
                method, encodedPath, OFFICIAL_MESSAGE);
        return ApiException.builder().withMessage(message).withCause(cause).build();
    }

    static ApiException wrapErrorDuringResponseProcessing(RequestContext context, Throwable cause) {
        int responseStatusCode = context.getResponseStatusCode();
        String message = String.format(
                "There was an unexpected error during the response processing. "
                        + "Infobip API responded with status code %d when calling %s %s. "
                        + "Check the exception's root cause for more details. %s",
                responseStatusCode, context.getMethod(), context.getEncodedPath(), OFFICIAL_MESSAGE);
        return ApiException.builder()
                .withMessage(message)
                .withCause(cause)
                .withResponseStatusCode(responseStatusCode)
                .build();
    }

    /**
     * The request context abstraction that may be used for enriching the exception model.
     */
    static class RequestContext {

        private static final RequestContext EMPTY = new RequestContext(null, null, 0);

        private final String method;

        private final String encodedPath;
        private final int responseStatusCode;

        private RequestContext(String method, String encodedPath, int responseStatusCode) {
            this.method = method;
            this.encodedPath = encodedPath;
            this.responseStatusCode = responseStatusCode;
        }

        /**
         * Tries to read the required context from the {@link Response} instance.
         * <p>
         * The information provided in the context may be used for enriching the exception model.
         * If the response is <code>null</code>, empty context is returned.
         * The method will not try to consume the response body in any way.
         *
         * @param response {@link Response} instance.
         * @return The request context {@link RequestContext} instance.
         */
        static RequestContext tryToReadFrom(Response response) {
            if (response == null) {
                return EMPTY;
            }
            return new RequestContext(
                    response.request().method(), response.request().url().encodedPath(), response.code());
        }

        /**
         * Returns the request HTTP method or <code>null</code> if the method is not provided.
         *
         * @return HTTP method.
         */
        String getMethod() {
            return method;
        }

        /**
         * Returns the encoded request path or <code>null</code> if the path is not provided.
         *
         * @return Encoded path.
         */
        String getEncodedPath() {
            return encodedPath;
        }

        /**
         * Returns the received HTTP status code or 0 if there was no response.
         *
         * @return HTTP status code.
         */
        int getResponseStatusCode() {
            return responseStatusCode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            RequestContext that = (RequestContext) o;
            return responseStatusCode == that.responseStatusCode
                    && Objects.equals(method, that.method)
                    && Objects.equals(encodedPath, that.encodedPath);
        }

        @Override
        public int hashCode() {
            return Objects.hash(method, encodedPath, responseStatusCode);
        }

        @Override
        public String toString() {
            return "RequestContext{" + "method='"
                    + method + '\'' + ", encodedPath='"
                    + encodedPath + '\'' + ", responseStatusCode="
                    + responseStatusCode + '}';
        }
    }
}
