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
import com.infobip.Parameter;
import com.infobip.RequestDefinition;
import com.infobip.model.ViberBulkMessageInfo;
import com.infobip.model.ViberBulkTextMessage;
import com.infobip.model.ViberFileMessage;
import com.infobip.model.ViberImageMessage;
import com.infobip.model.ViberLogsResponse;
import com.infobip.model.ViberMessageGeneralStatus;
import com.infobip.model.ViberRequest;
import com.infobip.model.ViberResponseEnvelopeMessageResponseMessageResponseDetails;
import com.infobip.model.ViberSingleMessageInfo;
import com.infobip.model.ViberVideoMessage;
import com.infobip.model.ViberWebhookReportsResponse;
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

    private RequestDefinition getOutboundViberMessageDeliveryReportsDefinition(
            String bulkId, String messageId, Integer limit, String entityId, String applicationId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/viber/2/reports")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        if (messageId != null) {
            builder.addQueryParameter(new Parameter("messageId", messageId));
        }
        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        if (entityId != null) {
            builder.addQueryParameter(new Parameter("entityId", entityId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        return builder.build();
    }

    /**
     * getOutboundViberMessageDeliveryReports request builder class.
     */
    public class GetOutboundViberMessageDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;
        private String entityId;
        private String applicationId;

        private GetOutboundViberMessageDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID that uniquely identifies the request. Bulk ID will be received only when you send a message to more than one destination address. (optional)
         * @return GetOutboundViberMessageDeliveryReportsRequest
         */
        public GetOutboundViberMessageDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent. (optional)
         * @return GetOutboundViberMessageDeliveryReportsRequest
         */
        public GetOutboundViberMessageDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports to be returned. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access reports for the last 48h (optional, default to 50)
         * @return GetOutboundViberMessageDeliveryReportsRequest
         */
        public GetOutboundViberMessageDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundViberMessageDeliveryReportsRequest
         */
        public GetOutboundViberMessageDeliveryReportsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundViberMessageDeliveryReportsRequest
         */
        public GetOutboundViberMessageDeliveryReportsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Executes the getOutboundViberMessageDeliveryReports request.
         *
         * @return ViberWebhookReportsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberWebhookReportsResponse execute() throws ApiException {
            RequestDefinition getOutboundViberMessageDeliveryReportsDefinition =
                    getOutboundViberMessageDeliveryReportsDefinition(bulkId, messageId, limit, entityId, applicationId);
            return apiClient.execute(
                    getOutboundViberMessageDeliveryReportsDefinition,
                    new TypeReference<ViberWebhookReportsResponse>() {}.getType());
        }

        /**
         * Executes the getOutboundViberMessageDeliveryReports request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ViberWebhookReportsResponse> callback) {
            RequestDefinition getOutboundViberMessageDeliveryReportsDefinition =
                    getOutboundViberMessageDeliveryReportsDefinition(bulkId, messageId, limit, entityId, applicationId);
            return apiClient.executeAsync(
                    getOutboundViberMessageDeliveryReportsDefinition,
                    new TypeReference<ViberWebhookReportsResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Viber delivery reports.
     * <p>
     * If you are unable to receive real-time delivery reports towards your endpoint for various reasons, we offer you an API method to fetch batches of delivery reports to confirm whether specific messages have been delivered. Each request towards this endpoint will return batches of the latest delivery reports. Please note they will be returned only once.
     *
     * @return GetOutboundViberMessageDeliveryReportsRequest
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    public GetOutboundViberMessageDeliveryReportsRequest getOutboundViberMessageDeliveryReports() {
        return new GetOutboundViberMessageDeliveryReportsRequest();
    }

    private RequestDefinition getOutboundViberMessageLogsDefinition(
            String sender,
            String destination,
            String bulkId,
            String messageId,
            ViberMessageGeneralStatus generalStatus,
            String sentSince,
            String sentUntil,
            String limit,
            String entityId,
            String applicationId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/viber/2/logs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sender != null) {
            builder.addQueryParameter(new Parameter("sender", sender));
        }
        if (destination != null) {
            builder.addQueryParameter(new Parameter("destination", destination));
        }
        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        if (messageId != null) {
            builder.addQueryParameter(new Parameter("messageId", messageId));
        }
        if (generalStatus != null) {
            builder.addQueryParameter(new Parameter("generalStatus", generalStatus));
        }
        if (sentSince != null) {
            builder.addQueryParameter(new Parameter("sentSince", sentSince));
        }
        if (sentUntil != null) {
            builder.addQueryParameter(new Parameter("sentUntil", sentUntil));
        }
        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        if (entityId != null) {
            builder.addQueryParameter(new Parameter("entityId", entityId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        return builder.build();
    }

    /**
     * getOutboundViberMessageLogs request builder class.
     */
    public class GetOutboundViberMessageLogsRequest {
        private String sender;
        private String destination;
        private String bulkId;
        private String messageId;
        private ViberMessageGeneralStatus generalStatus;
        private String sentSince;
        private String sentUntil;
        private String limit;
        private String entityId;
        private String applicationId;

        private GetOutboundViberMessageLogsRequest() {}

        /**
         * Sets sender.
         *
         * @param sender The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest sender(String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets destination.
         *
         * @param destination Message destination address. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus  (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest generalStatus(ViberMessageGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it together with sentUntil to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest sentSince(String sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it together with sentBefore to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest sentUntil(String sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access logs for the last 48h. If you want to fetch more than 1000 logs allowed per call, use sentBefore and sentUntil to retrieve them in pages. (optional, default to 50)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest limit(String limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Executes the getOutboundViberMessageLogs request.
         *
         * @return ViberLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberLogsResponse execute() throws ApiException {
            RequestDefinition getOutboundViberMessageLogsDefinition = getOutboundViberMessageLogsDefinition(
                    sender,
                    destination,
                    bulkId,
                    messageId,
                    generalStatus,
                    sentSince,
                    sentUntil,
                    limit,
                    entityId,
                    applicationId);
            return apiClient.execute(
                    getOutboundViberMessageLogsDefinition, new TypeReference<ViberLogsResponse>() {}.getType());
        }

        /**
         * Executes the getOutboundViberMessageLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ViberLogsResponse> callback) {
            RequestDefinition getOutboundViberMessageLogsDefinition = getOutboundViberMessageLogsDefinition(
                    sender,
                    destination,
                    bulkId,
                    messageId,
                    generalStatus,
                    sentSince,
                    sentUntil,
                    limit,
                    entityId,
                    applicationId);
            return apiClient.executeAsync(
                    getOutboundViberMessageLogsDefinition,
                    new TypeReference<ViberLogsResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Viber message logs.
     * <p>
     * Use this method for displaying logs for example in the user interface. Available are the logs for the last 48 hours.
     *
     * @return GetOutboundViberMessageLogsRequest
     */
    public GetOutboundViberMessageLogsRequest getOutboundViberMessageLogs() {
        return new GetOutboundViberMessageLogsRequest();
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
         * @deprecated
         */
        @Deprecated
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
         * @deprecated
         */
        @Deprecated
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
     * @deprecated
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    @Deprecated
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
         * @deprecated
         */
        @Deprecated
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
         * @deprecated
         */
        @Deprecated
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
     * @deprecated
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    @Deprecated
    public SendViberImageMessageRequest sendViberImageMessage(ViberImageMessage viberImageMessage) {
        return new SendViberImageMessageRequest(viberImageMessage);
    }

    private RequestDefinition sendViberMessagesDefinition(ViberRequest viberRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/viber/2/messages")
                .body(viberRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendViberMessages request builder class.
     */
    public class SendViberMessagesRequest {
        private final ViberRequest viberRequest;

        private SendViberMessagesRequest(ViberRequest viberRequest) {
            this.viberRequest =
                    Objects.requireNonNull(viberRequest, "The required parameter 'viberRequest' is missing.");
        }

        /**
         * Executes the sendViberMessages request.
         *
         * @return ViberResponseEnvelopeMessageResponseMessageResponseDetails The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ViberResponseEnvelopeMessageResponseMessageResponseDetails execute() throws ApiException {
            RequestDefinition sendViberMessagesDefinition = sendViberMessagesDefinition(viberRequest);
            return apiClient.execute(
                    sendViberMessagesDefinition,
                    new TypeReference<ViberResponseEnvelopeMessageResponseMessageResponseDetails>() {}.getType());
        }

        /**
         * Executes the sendViberMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(
                ApiCallback<ViberResponseEnvelopeMessageResponseMessageResponseDetails> callback) {
            RequestDefinition sendViberMessagesDefinition = sendViberMessagesDefinition(viberRequest);
            return apiClient.executeAsync(
                    sendViberMessagesDefinition,
                    new TypeReference<ViberResponseEnvelopeMessageResponseMessageResponseDetails>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send Viber messages.
     * <p>
     * Send text, image, video or file messages to a multiple recipients.
     *
     * @param viberRequest  (required)
     * @return SendViberMessagesRequest
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    public SendViberMessagesRequest sendViberMessages(ViberRequest viberRequest) {
        return new SendViberMessagesRequest(viberRequest);
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
         * @deprecated
         */
        @Deprecated
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
         * @deprecated
         */
        @Deprecated
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
     * @deprecated
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    @Deprecated
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
         * @deprecated
         */
        @Deprecated
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
         * @deprecated
         */
        @Deprecated
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
     * @deprecated
     * @see <a href="https://www.infobip.com/docs/viber">Learn more about Viber channel and use cases</a>
     */
    @Deprecated
    public SendViberVideoMessageRequest sendViberVideoMessage(ViberVideoMessage viberVideoMessage) {
        return new SendViberVideoMessageRequest(viberVideoMessage);
    }
}
