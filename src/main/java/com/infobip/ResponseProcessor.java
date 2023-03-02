/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import com.infobip.ApiException.RequestContext;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.*;
import okhttp3.*;

/**
 * Response processor class. It should only be used internally by {@link ApiClient}.
 */
final class ResponseProcessor {

    private final Downloader downloader;
    private final JSON json;
    private final DeprecationChecker deprecationChecker;

    /**
     * {@link ResponseProcessor} constructor.
     *
     * @param downloader The {@link Downloader} instance.
     * @param json The {@link JSON} instance.
     * @param deprecationChecker The {@link DeprecationChecker} instance.
     * @throws NullPointerException if either of the arguments is null.
     */
    ResponseProcessor(Downloader downloader, JSON json, DeprecationChecker deprecationChecker) {
        this.downloader = Objects.requireNonNull(downloader);
        this.json = Objects.requireNonNull(json);
        this.deprecationChecker = Objects.requireNonNull(deprecationChecker);
    }

    /**
     * Process given {@link Response} by interpreting it as an instance
     * of type specified by the <code>returnType</code> argument or
     * throws {@link ApiException} in the case of failure.
     *
     * @param response The given {@link Response}.
     * @param returnType The API response body deserialization type.
     * @return The API response deserialized in the type specified by the <code>returnType</code> argument.
     * @param <T> The resulting type.
     * @throws ApiException if the response was not successful or the deserialization failed.
     * @throws NullPointerException if the response is null.
     */
    <T> T processResponse(Response response, Type returnType) throws ApiException {
        Objects.requireNonNull(response);
        deprecationChecker.notice(response);

        if (response.isSuccessful()) {
            if (returnType == null) {
                ResponseBody responseBody = response.body();
                if (responseBody != null) {
                    responseBody.close();
                }
                return null;
            }
            try {
                return deserialize(response, returnType);
            } catch (Exception exception) {
                throw ApiException.becauseOfUnsuccessfulResponseBodyReading(
                        RequestContext.tryToReadFrom(response), exception);
            }
        }

        String rawResponseBody = null;
        ApiExceptionDetails details = null;
        ResponseBody responseBody = response.body();
        if (responseBody != null) {
            try {
                rawResponseBody = responseBody.string();
                ApiExceptionWrapper wrapper = json.deserialize(rawResponseBody, ApiExceptionWrapper.class);
                details = wrapper.getDetails();
            } catch (Exception e) {
                // ignored, best effort
            }
        }
        throw ApiException.becauseApiRequestFailed(RequestContext.tryToReadFrom(response), rawResponseBody, details);
    }

    /**
     * The {@link Downloader} instance used by the processor.
     *
     * @return {@link Downloader} used by the processor
     */
    Downloader downloader() {
        return downloader;
    }

    /**
     * The {@link JSON} instance used for response deserialization by the processor.
     *
     * @return {@link JSON} used for response deserialization
     */
    JSON json() {
        return json;
    }

    @SuppressWarnings("unchecked")
    private <T> T deserialize(Response response, Type returnType) throws IOException {
        ResponseBody responseBody = response.body();
        if (responseBody == null) {
            return null;
        }
        if (File.class == returnType) {
            return (T) downloader.downloadFile(response);
        }
        if (byte[].class == returnType) {
            return (T) responseBody.bytes();
        }
        if (String.class == returnType) {
            return (T) responseBody.string();
        }
        try (InputStream responseBodyStream = responseBody.byteStream()) {
            return json.deserialize(responseBodyStream, returnType);
        }
    }
}
