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

/**
 * Represents API error request body model.
 */
final class ApiExceptionWrapper {

    private ApiError requestError;

    /**
     * Represents API error request body sub-model.
     */
    static final class ApiError {

        private ApiExceptionDetails serviceException;

        /**
         * Returns request error details model.
         *
         * @return {@link ApiExceptionDetails} model.
         */
        ApiExceptionDetails getServiceException() {
            return serviceException;
        }

        void setServiceException(ApiExceptionDetails serviceException) {
            this.serviceException = serviceException;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ApiError apiError = (ApiError) o;
            return Objects.equals(serviceException, apiError.serviceException);
        }

        @Override
        public int hashCode() {
            return Objects.hash(serviceException);
        }

        @Override
        public String toString() {
            return "ApiError{" + "serviceException=" + serviceException + '}';
        }
    }

    /**
     * Returns request error details model.
     *
     * @return {@link ApiExceptionDetails} model.
     */
    ApiExceptionDetails getDetails() {
        if (requestError == null) {
            return null;
        }
        return requestError.getServiceException();
    }

    /**
     * Returns request error model.
     *
     * @return {@link ApiError} model.
     */
    ApiError getRequestError() {
        return requestError;
    }

    void setRequestError(ApiError requestError) {
        this.requestError = requestError;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiExceptionWrapper that = (ApiExceptionWrapper) o;
        return Objects.equals(requestError, that.requestError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestError);
    }

    @Override
    public String toString() {
        return "ApiExceptionWrapper{" + "requestError=" + requestError + '}';
    }
}
