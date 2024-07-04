package com.infobip.api.util;

import com.infobip.ApiCallback;
import com.infobip.ApiException;
import okhttp3.Call;

@FunctionalInterface
public interface AsyncApiCall<T> {
    Call execute(ApiCallback<T> callback) throws ApiException;
}
