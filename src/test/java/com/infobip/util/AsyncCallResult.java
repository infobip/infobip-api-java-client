/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.util;

import com.infobip.ApiException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public final class AsyncCallResult<T> {

    private final T result;
    private final ApiException exception;
    private final int responseStatusCode;
    private final Map<String, List<String>> responseHeaders;

    private AsyncCallResult(
            T result, ApiException exception, int responseStatusCode, Map<String, List<String>> responseHeaders) {
        this.result = result;
        this.exception = exception;
        this.responseStatusCode = responseStatusCode;
        this.responseHeaders = (responseHeaders != null) ? responseHeaders : Map.of();
    }

    public static <T> AsyncCallResult<T> success(
            T result, int responseStatusCode, Map<String, List<String>> responseHeaders) {
        return new AsyncCallResult<>(result, null, responseStatusCode, responseHeaders);
    }

    public static <T> AsyncCallResult<T> fail(
            ApiException exception, int responseStatusCode, Map<String, List<String>> responseHeaders) {
        return new AsyncCallResult<>(null, exception, responseStatusCode, responseHeaders);
    }

    public Optional<T> result() {
        return Optional.ofNullable(result);
    }

    public Optional<ApiException> exception() {
        return Optional.ofNullable(exception);
    }

    public int responseStatusCode() {
        return responseStatusCode;
    }

    public Map<String, List<String>> responseHeaders() {
        return responseHeaders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AsyncCallResult<?> that = (AsyncCallResult<?>) o;
        return responseStatusCode == that.responseStatusCode
                && Objects.equals(result, that.result)
                && Objects.equals(exception, that.exception)
                && responseHeaders.equals(that.responseHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, exception, responseStatusCode, responseHeaders);
    }
}
