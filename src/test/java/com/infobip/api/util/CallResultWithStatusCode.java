package com.infobip.api.util;

import com.infobip.ApiException;

public class CallResultWithStatusCode<T> {

    private final int statusCode;
    private final T data;
    private final ApiException exception;

    public CallResultWithStatusCode(int statusCode, T data, ApiException exception) {
        this.statusCode = statusCode;
        this.data = data;
        this.exception = exception;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public T getData() {
        return data;
    }

    public ApiException getException() {
        return exception;
    }
}
