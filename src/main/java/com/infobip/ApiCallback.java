/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.List;
import java.util.Map;

/**
 * The callback that can be used for asynchronous API calls.
 *
 * @param <T> The return type.
 */
public interface ApiCallback<T> {

    /**
     * The callback method invoked when the API call succeeds.
     *
     * @param result The deserialized response body returned by the server, <code>null</code> otherwise.
     * @param responseStatusCode The response HTTP status code if available, 0 otherwise.
     * @param responseHeaders Response headers if available, <code>null</code> otherwise.
     */
    void onSuccess(T result, int responseStatusCode, Map<String, List<String>> responseHeaders);

    /**
     * The callback method invoked when the API call fails or an error occurs during the
     * request or response processing.
     *
     * @param exception The exception describing the failure.
     * @param responseStatusCode The response HTTP status code if available, 0 otherwise.
     * @param responseHeaders Response headers if available, <code>null</code> otherwise.
     */
    void onFailure(ApiException exception, int responseStatusCode, Map<String, List<String>> responseHeaders);
}
