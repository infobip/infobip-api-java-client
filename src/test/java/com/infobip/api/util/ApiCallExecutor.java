package com.infobip.api.util;

import com.infobip.ApiCallback;
import com.infobip.ApiException;
import okhttp3.Call;
import org.awaitility.Awaitility;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class ApiCallExecutor {

    private static final int ASYNC_CALL_TIMEOUT_SECONDS = 5;
    private static final int ASYNC_CALL_POLL_INTERVAL_MILLIS = 1;

    public <T> CallResult<T> execute(ApiCall<T> call) {
        try {
            T response = call.execute();
            return CallResult.success(response);
        } catch (ApiException exception) {
            return CallResult.fail(exception);
        }
    }

    public <T> CallResultWithStatusCode<T> execute(AsyncApiCall<T> call) throws InterruptedException {
        AtomicReference<CallResultWithStatusCode<T>> callResultReference = new AtomicReference<>();

        ApiCallback<T> apiCallback = new ApiCallback<>() {
            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                callResultReference.set(new CallResultWithStatusCode<>(statusCode, null, e));
            }

            @Override
            public void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders) {
                callResultReference.set(new CallResultWithStatusCode<>(statusCode, result, null));
            }
        };

        try {
            Call asyncCall = call.execute(apiCallback);
            Awaitility.await()
                    .atMost(Duration.ofSeconds(ASYNC_CALL_TIMEOUT_SECONDS))
                    .pollInterval(Duration.ofMillis(ASYNC_CALL_POLL_INTERVAL_MILLIS))
                    .until(() -> asyncCall.isExecuted() && callResultReference.get() != null);
        } catch (ApiException exception) {
            return new CallResultWithStatusCode<>(exception.responseStatusCode(), null, exception);
        }

        return callResultReference.get();
    }
}
