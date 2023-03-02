/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.util;

import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.RequestDefinition;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;

public final class AsyncExecutor {

    private static final int CALL_TIMEOUT_IN_SECONDS = 30;

    private final ApiClient apiClient;

    private AsyncExecutor(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient);
    }

    public static AsyncExecutor using(ApiClient apiClient) {
        return new AsyncExecutor(apiClient);
    }

    public <T> AsyncCallResult<T> execute(RequestDefinition definition, Type returnType) {
        return execute(callback -> apiClient.executeAsync(definition, returnType, callback));
    }

    public AsyncCallResult<Void> execute(RequestDefinition definition) {
        return execute(callback -> apiClient.executeAsync(definition, callback));
    }

    @FunctionalInterface
    private interface AsyncApiClientCall<T> {
        Call execute(ApiCallback<T> callback);
    }

    private static <T> AsyncCallResult<T> execute(AsyncApiClientCall<T> asyncApiClientCall) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference<AsyncCallResult<T>> callResult = new AtomicReference<>();

        ApiCallback<T> callback = new ApiCallback<>() {
            @Override
            public void onSuccess(T result, int responseStatusCode, Map<String, List<String>> responseHeaders) {
                callResult.set(AsyncCallResult.success(result, responseStatusCode, responseHeaders));
                countDownLatch.countDown();
            }

            @Override
            public void onFailure(
                    ApiException exception, int responseStatusCode, Map<String, List<String>> responseHeaders) {
                callResult.set(AsyncCallResult.fail(exception, responseStatusCode, responseHeaders));
                countDownLatch.countDown();
            }
        };

        Call call = asyncApiClientCall.execute(callback);

        boolean countDownLatchUnlockedSuccessfully;
        try {
            countDownLatchUnlockedSuccessfully = countDownLatch.await(CALL_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException exception) {
            throw new RuntimeException("Async call was interrupted. The result can't be determined.");
        }
        if (!countDownLatchUnlockedSuccessfully) {
            throw new RuntimeException("Async call was not executed in defined time. The result can't be determined.");
        }
        if (!call.isExecuted()) {
            throw new RuntimeException("Async call was not executed. The result can't be determined.");
        }

        return callResult.get();
    }
}
