/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.RequestDefinition;
import com.infobip.model.ViberBulkMessageInfo;
import com.infobip.model.ViberBulkTextMessage;
import com.infobip.model.ViberFileMessage;
import com.infobip.model.ViberImageMessage;
import com.infobip.model.ViberSingleMessageInfo;
import com.infobip.model.ViberVideoMessage;
import java.util.Objects;

/**
 * Represents ViberApi API client.
 */
public class ViberApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of ViberApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public ViberApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition sendViberFileMessageDefinition(ViberFileMessage viberFileMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/viber/1/message/file")
                .body(viberFileMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendViberFileMessage request builder class.
     */
    public class SendViberFileMessageRequest {
        private final ViberFileMessage viberFileMessage;

        private SendViberFileMessageRequest(ViberFileMessage viberFileMessage) {
            this.viberFileMessage =
                    Objects.requireNonNull(viberFileMessage, "The required parameter 'viberFileMessage' is missing.");
        }

        /**
         * Executes the sendViberFileMessage request.
         *
         * @return ViberSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendViberFileMessageDefinition = sendViberFileMessageDefinition(viberFileMessage);
            return apiClient.execute(
                    sendViberFileMessageDefinition, new TypeReference<ViberSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendViberFileMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ViberSingleMessageInfo> callback) {
            RequestDefinition sendViberFileMessageDefinition = sendViberFileMessageDefinition(viberFileMessage);
            return apiClient.executeAsync(
                    sendViberFileMessageDefinition, new TypeReference<ViberSingleMessageInfo>() {}.getType(), callback);
        }
    }

    /**
     * Send Viber file message.
     * <p>
     * Send a file message to a single recipient.
     *
     * @param viberFileMessage  (required)
     * @return SendViberFileMessageRequest
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    public SendViberFileMessageRequest sendViberFileMessage(ViberFileMessage viberFileMessage) {
        return new SendViberFileMessageRequest(viberFileMessage);
    }

    private RequestDefinition sendViberImageMessageDefinition(ViberImageMessage viberImageMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/viber/1/message/image")
                .body(viberImageMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendViberImageMessage request builder class.
     */
    public class SendViberImageMessageRequest {
        private final ViberImageMessage viberImageMessage;

        private SendViberImageMessageRequest(ViberImageMessage viberImageMessage) {
            this.viberImageMessage =
                    Objects.requireNonNull(viberImageMessage, "The required parameter 'viberImageMessage' is missing.");
        }

        /**
         * Executes the sendViberImageMessage request.
         *
         * @return ViberSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendViberImageMessageDefinition = sendViberImageMessageDefinition(viberImageMessage);
            return apiClient.execute(
                    sendViberImageMessageDefinition, new TypeReference<ViberSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendViberImageMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ViberSingleMessageInfo> callback) {
            RequestDefinition sendViberImageMessageDefinition = sendViberImageMessageDefinition(viberImageMessage);
            return apiClient.executeAsync(
                    sendViberImageMessageDefinition,
                    new TypeReference<ViberSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send Viber image message.
     * <p>
     * Send an image message to a single recipient.
     *
     * @param viberImageMessage  (required)
     * @return SendViberImageMessageRequest
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    public SendViberImageMessageRequest sendViberImageMessage(ViberImageMessage viberImageMessage) {
        return new SendViberImageMessageRequest(viberImageMessage);
    }

    private RequestDefinition sendViberTextMessageDefinition(ViberBulkTextMessage viberBulkTextMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/viber/1/message/text")
                .body(viberBulkTextMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendViberTextMessage request builder class.
     */
    public class SendViberTextMessageRequest {
        private final ViberBulkTextMessage viberBulkTextMessage;

        private SendViberTextMessageRequest(ViberBulkTextMessage viberBulkTextMessage) {
            this.viberBulkTextMessage = Objects.requireNonNull(
                    viberBulkTextMessage, "The required parameter 'viberBulkTextMessage' is missing.");
        }

        /**
         * Executes the sendViberTextMessage request.
         *
         * @return ViberBulkMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberBulkMessageInfo execute() throws ApiException {
            RequestDefinition sendViberTextMessageDefinition = sendViberTextMessageDefinition(viberBulkTextMessage);
            return apiClient.execute(
                    sendViberTextMessageDefinition, new TypeReference<ViberBulkMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendViberTextMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ViberBulkMessageInfo> callback) {
            RequestDefinition sendViberTextMessageDefinition = sendViberTextMessageDefinition(viberBulkTextMessage);
            return apiClient.executeAsync(
                    sendViberTextMessageDefinition, new TypeReference<ViberBulkMessageInfo>() {}.getType(), callback);
        }
    }

    /**
     * Send Viber text message(s).
     * <p>
     * Send one or many text message(s) possibly to multiple recipients.
     *
     * @param viberBulkTextMessage  (required)
     * @return SendViberTextMessageRequest
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    public SendViberTextMessageRequest sendViberTextMessage(ViberBulkTextMessage viberBulkTextMessage) {
        return new SendViberTextMessageRequest(viberBulkTextMessage);
    }

    private RequestDefinition sendViberVideoMessageDefinition(ViberVideoMessage viberVideoMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/viber/1/message/video")
                .body(viberVideoMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendViberVideoMessage request builder class.
     */
    public class SendViberVideoMessageRequest {
        private final ViberVideoMessage viberVideoMessage;

        private SendViberVideoMessageRequest(ViberVideoMessage viberVideoMessage) {
            this.viberVideoMessage =
                    Objects.requireNonNull(viberVideoMessage, "The required parameter 'viberVideoMessage' is missing.");
        }

        /**
         * Executes the sendViberVideoMessage request.
         *
         * @return ViberSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendViberVideoMessageDefinition = sendViberVideoMessageDefinition(viberVideoMessage);
            return apiClient.execute(
                    sendViberVideoMessageDefinition, new TypeReference<ViberSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendViberVideoMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ViberSingleMessageInfo> callback) {
            RequestDefinition sendViberVideoMessageDefinition = sendViberVideoMessageDefinition(viberVideoMessage);
            return apiClient.executeAsync(
                    sendViberVideoMessageDefinition,
                    new TypeReference<ViberSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send Viber video message.
     * <p>
     * Send a video message to a single recipient.
     *
     * @param viberVideoMessage  (required)
     * @return SendViberVideoMessageRequest
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    public SendViberVideoMessageRequest sendViberVideoMessage(ViberVideoMessage viberVideoMessage) {
        return new SendViberVideoMessageRequest(viberVideoMessage);
    }
}
