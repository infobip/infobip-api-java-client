package com.infobip.api.util;

import com.infobip.ApiException;

public class CallResult<T> {

    private final T result;
    private final ApiException exception;

    public CallResult(T result, ApiException exception) {
        this.result = result;
        this.exception = exception;
    }

    public static <T> CallResult<T> success(T result) {
        return new CallResult<>(result, null);
    }

    public static <T> CallResult<T> fail(ApiException exception) {
        return new CallResult<>(null, exception);
    }

    public T getResult() {
        return result;
    }

    public ApiException getException() {
        return exception;
    }

}
