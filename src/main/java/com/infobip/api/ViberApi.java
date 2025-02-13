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
import com.infobip.model.MessageGeneralStatus;
import com.infobip.model.MessageResponse;
import com.infobip.model.ViberLogsResponse;
import com.infobip.model.ViberRequest;
import com.infobip.model.ViberWebhookReportsResponse;
import java.time.OffsetDateTime;
import java.util.List;
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
            String bulkId,
            String messageId,
            Integer limit,
            String entityId,
            String applicationId,
            String campaignReferenceId) {
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
        if (campaignReferenceId != null) {
            builder.addQueryParameter(new Parameter("campaignReferenceId", campaignReferenceId));
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
        private String campaignReferenceId;

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
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. (optional)
         * @return GetOutboundViberMessageDeliveryReportsRequest
         */
        public GetOutboundViberMessageDeliveryReportsRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
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
                    getOutboundViberMessageDeliveryReportsDefinition(
                            bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
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
                    getOutboundViberMessageDeliveryReportsDefinition(
                            bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
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
            List<String> bulkId,
            List<String> messageId,
            MessageGeneralStatus generalStatus,
            OffsetDateTime sentSince,
            OffsetDateTime sentUntil,
            Integer limit,
            String entityId,
            String applicationId,
            List<String> campaignReferenceId) {
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
            for (var parameterItem : bulkId) {
                builder.addQueryParameter(new Parameter("bulkId", parameterItem));
            }
        }
        if (messageId != null) {
            for (var parameterItem : messageId) {
                builder.addQueryParameter(new Parameter("messageId", parameterItem));
            }
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
        if (campaignReferenceId != null) {
            for (var parameterItem : campaignReferenceId) {
                builder.addQueryParameter(new Parameter("campaignReferenceId", parameterItem));
            }
        }
        return builder.build();
    }

    /**
     * getOutboundViberMessageLogs request builder class.
     */
    public class GetOutboundViberMessageLogsRequest {
        private String sender;
        private String destination;
        private List<String> bulkId;
        private List<String> messageId;
        private MessageGeneralStatus generalStatus;
        private OffsetDateTime sentSince;
        private OffsetDateTime sentUntil;
        private Integer limit;
        private String entityId;
        private String applicationId;
        private List<String> campaignReferenceId;

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
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus  (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest generalStatus(MessageGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it together with sentUntil to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it together with sentSince to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access logs for the last 48h. If you want to fetch more than 1000 logs allowed per call, use sentBefore and sentUntil to retrieve them in pages. (optional, default to 50)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest limit(Integer limit) {
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
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. May contain multiple comma-separated values. (optional)
         * @return GetOutboundViberMessageLogsRequest
         */
        public GetOutboundViberMessageLogsRequest campaignReferenceId(List<String> campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
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
                    applicationId,
                    campaignReferenceId);
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
                    applicationId,
                    campaignReferenceId);
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
         * @return MessageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MessageResponse execute() throws ApiException {
            RequestDefinition sendViberMessagesDefinition = sendViberMessagesDefinition(viberRequest);
            return apiClient.execute(sendViberMessagesDefinition, new TypeReference<MessageResponse>() {}.getType());
        }

        /**
         * Executes the sendViberMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MessageResponse> callback) {
            RequestDefinition sendViberMessagesDefinition = sendViberMessagesDefinition(viberRequest);
            return apiClient.executeAsync(
                    sendViberMessagesDefinition, new TypeReference<MessageResponse>() {}.getType(), callback);
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
}
