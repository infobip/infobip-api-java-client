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
import com.infobip.model.SmsBulkRequest;
import com.infobip.model.SmsBulkResponse;
import com.infobip.model.SmsBulkStatusResponse;
import com.infobip.model.SmsDeliveryResult;
import com.infobip.model.SmsInboundMessageResult;
import com.infobip.model.SmsLogsResponse;
import com.infobip.model.SmsPreviewRequest;
import com.infobip.model.SmsPreviewResponse;
import com.infobip.model.SmsRequest;
import com.infobip.model.SmsResponse;
import com.infobip.model.SmsUpdateStatusRequest;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents SmsApi API client.
 */
public class SmsApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of SmsApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public SmsApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition getInboundSmsMessagesDefinition(
            Integer limit, String applicationId, String entityId, String campaignReferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/1/inbox/reports")
                .requiresAuthentication(true)
                .accept("application/json");

        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (entityId != null) {
            builder.addQueryParameter(new Parameter("entityId", entityId));
        }
        if (campaignReferenceId != null) {
            builder.addQueryParameter(new Parameter("campaignReferenceId", campaignReferenceId));
        }
        return builder.build();
    }

    /**
     * getInboundSmsMessages request builder class.
     */
    public class GetInboundSmsMessagesRequest {
        private Integer limit;
        private String applicationId;
        private String entityId;
        private String campaignReferenceId;

        private GetInboundSmsMessagesRequest() {}

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to be returned in a response. If not set, the latest 50 records are returned. Maximum limit value is &#x60;1000&#x60; and you can only access messages for the last 48h. (optional)
         * @return GetInboundSmsMessagesRequest
         */
        public GetInboundSmsMessagesRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id that the message is linked to. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetInboundSmsMessagesRequest
         */
        public GetInboundSmsMessagesRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id that the message is linked to. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetInboundSmsMessagesRequest
         */
        public GetInboundSmsMessagesRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. (optional)
         * @return GetInboundSmsMessagesRequest
         */
        public GetInboundSmsMessagesRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Executes the getInboundSmsMessages request.
         *
         * @return SmsInboundMessageResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsInboundMessageResult execute() throws ApiException {
            RequestDefinition getInboundSmsMessagesDefinition =
                    getInboundSmsMessagesDefinition(limit, applicationId, entityId, campaignReferenceId);
            return apiClient.execute(
                    getInboundSmsMessagesDefinition, new TypeReference<SmsInboundMessageResult>() {}.getType());
        }

        /**
         * Executes the getInboundSmsMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsInboundMessageResult> callback) {
            RequestDefinition getInboundSmsMessagesDefinition =
                    getInboundSmsMessagesDefinition(limit, applicationId, entityId, campaignReferenceId);
            return apiClient.executeAsync(
                    getInboundSmsMessagesDefinition,
                    new TypeReference<SmsInboundMessageResult>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get inbound SMS messages.
     * <p>
     * If for some reason you are unable to receive incoming SMS to the endpoint of your choice in real time, you can use this API call to fetch messages. Each request will return a batch of received messages - only once. The API request will only return new messages that arrived since the last API request.
     *
     * @return GetInboundSmsMessagesRequest
     */
    public GetInboundSmsMessagesRequest getInboundSmsMessages() {
        return new GetInboundSmsMessagesRequest();
    }

    private RequestDefinition getOutboundSmsMessageDeliveryReportsDefinition(
            String bulkId,
            String messageId,
            Integer limit,
            String entityId,
            String applicationId,
            String campaignReferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/3/reports")
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
     * getOutboundSmsMessageDeliveryReports request builder class.
     */
    public class GetOutboundSmsMessageDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;
        private String entityId;
        private String applicationId;
        private String campaignReferenceId;

        private GetOutboundSmsMessageDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID that uniquely identifies the request. Bulk ID will be received only when you send a message to more than one destination address. (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent. (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports to be returned. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access reports for the last 48h (optional, default to 50)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Executes the getOutboundSmsMessageDeliveryReports request.
         *
         * @return SmsDeliveryResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsDeliveryResult execute() throws ApiException {
            RequestDefinition getOutboundSmsMessageDeliveryReportsDefinition =
                    getOutboundSmsMessageDeliveryReportsDefinition(
                            bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
            return apiClient.execute(
                    getOutboundSmsMessageDeliveryReportsDefinition,
                    new TypeReference<SmsDeliveryResult>() {}.getType());
        }

        /**
         * Executes the getOutboundSmsMessageDeliveryReports request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsDeliveryResult> callback) {
            RequestDefinition getOutboundSmsMessageDeliveryReportsDefinition =
                    getOutboundSmsMessageDeliveryReportsDefinition(
                            bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
            return apiClient.executeAsync(
                    getOutboundSmsMessageDeliveryReportsDefinition,
                    new TypeReference<SmsDeliveryResult>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get outbound SMS message delivery reports.
     * <p>
     * If you are unable to receive real-time message delivery reports towards your endpoint for various reasons, we offer you an API method to fetch batches of message reports to confirm whether specific messages have been delivered. Each request towards this endpoint will return batches of the latest message reports. Please note they will be returned only once.
     *
     * @return GetOutboundSmsMessageDeliveryReportsRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about the SMS channel and its use cases</a>
     */
    public GetOutboundSmsMessageDeliveryReportsRequest getOutboundSmsMessageDeliveryReports() {
        return new GetOutboundSmsMessageDeliveryReportsRequest();
    }

    private RequestDefinition getOutboundSmsMessageLogsDefinition(
            String mcc,
            String mnc,
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
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/3/logs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (mcc != null) {
            builder.addQueryParameter(new Parameter("mcc", mcc));
        }
        if (mnc != null) {
            builder.addQueryParameter(new Parameter("mnc", mnc));
        }
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
     * getOutboundSmsMessageLogs request builder class.
     */
    public class GetOutboundSmsMessageLogsRequest {
        private String mcc;
        private String mnc;
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

        private GetOutboundSmsMessageLogsRequest() {}

        /**
         * Sets mcc.
         *
         * @param mcc Mobile Country Code. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest mcc(String mcc) {
            this.mcc = mcc;
            return this;
        }

        /**
         * Sets mnc.
         *
         * @param mnc Mobile Network Code. Mobile Country Code is required if this property is used. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest mnc(String mnc) {
            this.mnc = mnc;
            return this;
        }

        /**
         * Sets sender.
         *
         * @param sender The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest sender(String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets destination.
         *
         * @param destination Message destination address. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus  (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest generalStatus(MessageGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it together with sentUntil to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it together with sentSince to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access logs for the last 48h. If you want to fetch more than 1000 logs allowed per call, use sentBefore and sentUntil to retrieve them in pages. (optional, default to 50)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. May contain multiple comma-separated values. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest campaignReferenceId(List<String> campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Executes the getOutboundSmsMessageLogs request.
         *
         * @return SmsLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsLogsResponse execute() throws ApiException {
            RequestDefinition getOutboundSmsMessageLogsDefinition = getOutboundSmsMessageLogsDefinition(
                    mcc,
                    mnc,
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
                    getOutboundSmsMessageLogsDefinition, new TypeReference<SmsLogsResponse>() {}.getType());
        }

        /**
         * Executes the getOutboundSmsMessageLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsLogsResponse> callback) {
            RequestDefinition getOutboundSmsMessageLogsDefinition = getOutboundSmsMessageLogsDefinition(
                    mcc,
                    mnc,
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
                    getOutboundSmsMessageLogsDefinition, new TypeReference<SmsLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get outbound SMS message logs.
     * <p>
     * Use this method for displaying logs, for example, in the user interface. Available are the logs for the last 48 hours and you can only retrieve maximum of 1000 logs per call. See [message delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports-v3) if your use case is to verify message delivery.
     *
     * @return GetOutboundSmsMessageLogsRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about the SMS channel and its use cases</a>
     */
    public GetOutboundSmsMessageLogsRequest getOutboundSmsMessageLogs() {
        return new GetOutboundSmsMessageLogsRequest();
    }

    private RequestDefinition getScheduledSmsMessagesDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/1/bulks")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getScheduledSmsMessages request builder class.
     */
    public class GetScheduledSmsMessagesRequest {
        private final String bulkId;

        private GetScheduledSmsMessagesRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getScheduledSmsMessages request.
         *
         * @return SmsBulkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsBulkResponse execute() throws ApiException {
            RequestDefinition getScheduledSmsMessagesDefinition = getScheduledSmsMessagesDefinition(bulkId);
            return apiClient.execute(
                    getScheduledSmsMessagesDefinition, new TypeReference<SmsBulkResponse>() {}.getType());
        }

        /**
         * Executes the getScheduledSmsMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsBulkResponse> callback) {
            RequestDefinition getScheduledSmsMessagesDefinition = getScheduledSmsMessagesDefinition(bulkId);
            return apiClient.executeAsync(
                    getScheduledSmsMessagesDefinition, new TypeReference<SmsBulkResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get scheduled SMS messages.
     * <p>
     * See all scheduled messages and their scheduled date and time. To schedule a message, use the &#x60;sendAt&#x60; field when [sending a message](https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message).
     *
     * @param bulkId  (required)
     * @return GetScheduledSmsMessagesRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public GetScheduledSmsMessagesRequest getScheduledSmsMessages(String bulkId) {
        return new GetScheduledSmsMessagesRequest(bulkId);
    }

    private RequestDefinition getScheduledSmsMessagesStatusDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/1/bulks/status")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getScheduledSmsMessagesStatus request builder class.
     */
    public class GetScheduledSmsMessagesStatusRequest {
        private final String bulkId;

        private GetScheduledSmsMessagesStatusRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getScheduledSmsMessagesStatus request.
         *
         * @return SmsBulkStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsBulkStatusResponse execute() throws ApiException {
            RequestDefinition getScheduledSmsMessagesStatusDefinition = getScheduledSmsMessagesStatusDefinition(bulkId);
            return apiClient.execute(
                    getScheduledSmsMessagesStatusDefinition, new TypeReference<SmsBulkStatusResponse>() {}.getType());
        }

        /**
         * Executes the getScheduledSmsMessagesStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsBulkStatusResponse> callback) {
            RequestDefinition getScheduledSmsMessagesStatusDefinition = getScheduledSmsMessagesStatusDefinition(bulkId);
            return apiClient.executeAsync(
                    getScheduledSmsMessagesStatusDefinition,
                    new TypeReference<SmsBulkStatusResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get scheduled SMS messages status.
     * <p>
     * See the status of scheduled messages. To schedule a message, use the &#x60;sendAt&#x60; field when [sending a message](https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message).
     *
     * @param bulkId  (required)
     * @return GetScheduledSmsMessagesStatusRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public GetScheduledSmsMessagesStatusRequest getScheduledSmsMessagesStatus(String bulkId) {
        return new GetScheduledSmsMessagesStatusRequest(bulkId);
    }

    private RequestDefinition previewSmsMessageDefinition(SmsPreviewRequest smsPreviewRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/sms/1/preview")
                .body(smsPreviewRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * previewSmsMessage request builder class.
     */
    public class PreviewSmsMessageRequest {
        private final SmsPreviewRequest smsPreviewRequest;

        private PreviewSmsMessageRequest(SmsPreviewRequest smsPreviewRequest) {
            this.smsPreviewRequest =
                    Objects.requireNonNull(smsPreviewRequest, "The required parameter 'smsPreviewRequest' is missing.");
        }

        /**
         * Executes the previewSmsMessage request.
         *
         * @return SmsPreviewResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsPreviewResponse execute() throws ApiException {
            RequestDefinition previewSmsMessageDefinition = previewSmsMessageDefinition(smsPreviewRequest);
            return apiClient.execute(previewSmsMessageDefinition, new TypeReference<SmsPreviewResponse>() {}.getType());
        }

        /**
         * Executes the previewSmsMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsPreviewResponse> callback) {
            RequestDefinition previewSmsMessageDefinition = previewSmsMessageDefinition(smsPreviewRequest);
            return apiClient.executeAsync(
                    previewSmsMessageDefinition, new TypeReference<SmsPreviewResponse>() {}.getType(), callback);
        }
    }

    /**
     * Preview SMS message.
     * <p>
     * Avoid unpleasant surprises and check how different message configurations will affect your message text, number of characters and message parts.
     *
     * @param smsPreviewRequest  (required)
     * @return PreviewSmsMessageRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public PreviewSmsMessageRequest previewSmsMessage(SmsPreviewRequest smsPreviewRequest) {
        return new PreviewSmsMessageRequest(smsPreviewRequest);
    }

    private RequestDefinition rescheduleSmsMessagesDefinition(String bulkId, SmsBulkRequest smsBulkRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/sms/1/bulks")
                .body(smsBulkRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * rescheduleSmsMessages request builder class.
     */
    public class RescheduleSmsMessagesRequest {
        private final String bulkId;
        private final SmsBulkRequest smsBulkRequest;

        private RescheduleSmsMessagesRequest(String bulkId, SmsBulkRequest smsBulkRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.smsBulkRequest =
                    Objects.requireNonNull(smsBulkRequest, "The required parameter 'smsBulkRequest' is missing.");
        }

        /**
         * Executes the rescheduleSmsMessages request.
         *
         * @return SmsBulkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsBulkResponse execute() throws ApiException {
            RequestDefinition rescheduleSmsMessagesDefinition = rescheduleSmsMessagesDefinition(bulkId, smsBulkRequest);
            return apiClient.execute(
                    rescheduleSmsMessagesDefinition, new TypeReference<SmsBulkResponse>() {}.getType());
        }

        /**
         * Executes the rescheduleSmsMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsBulkResponse> callback) {
            RequestDefinition rescheduleSmsMessagesDefinition = rescheduleSmsMessagesDefinition(bulkId, smsBulkRequest);
            return apiClient.executeAsync(
                    rescheduleSmsMessagesDefinition, new TypeReference<SmsBulkResponse>() {}.getType(), callback);
        }
    }

    /**
     * Reschedule SMS messages.
     * <p>
     * Change the date and time of already scheduled messages. To schedule a message, use the &#x60;sendAt&#x60; field when [sending a message](https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message).
     *
     * @param bulkId  (required)
     * @param smsBulkRequest  (required)
     * @return RescheduleSmsMessagesRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public RescheduleSmsMessagesRequest rescheduleSmsMessages(String bulkId, SmsBulkRequest smsBulkRequest) {
        return new RescheduleSmsMessagesRequest(bulkId, smsBulkRequest);
    }

    private RequestDefinition sendSmsMessagesDefinition(SmsRequest smsRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/sms/3/messages")
                .body(smsRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendSmsMessages request builder class.
     */
    public class SendSmsMessagesRequest {
        private final SmsRequest smsRequest;

        private SendSmsMessagesRequest(SmsRequest smsRequest) {
            this.smsRequest = Objects.requireNonNull(smsRequest, "The required parameter 'smsRequest' is missing.");
        }

        /**
         * Executes the sendSmsMessages request.
         *
         * @return SmsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsResponse execute() throws ApiException {
            RequestDefinition sendSmsMessagesDefinition = sendSmsMessagesDefinition(smsRequest);
            return apiClient.execute(sendSmsMessagesDefinition, new TypeReference<SmsResponse>() {}.getType());
        }

        /**
         * Executes the sendSmsMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsResponse> callback) {
            RequestDefinition sendSmsMessagesDefinition = sendSmsMessagesDefinition(smsRequest);
            return apiClient.executeAsync(
                    sendSmsMessagesDefinition, new TypeReference<SmsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send SMS message.
     * <p>
     * With this API method, you can do anything from sending a basic message to one person, all the way to sending customized messages to thousands of recipients in one go. It comes with a range of useful features like transliteration, scheduling, and tracking in a unified way.\\ If utilizing Message Delivery Reports webhook, please consult the documentation provided at [Receive outbound SMS message reports](#channels/sms/receive-outbound-sms-message-report-v3).\\ This endpoint is the successor of [Send SMS message](#channels/sms/send-sms-message) and [Send binary SMS message](#channels/sms/send-binary-sms-message).
     *
     * @param smsRequest  (required)
     * @return SendSmsMessagesRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about the SMS channel and its use cases</a>
     */
    public SendSmsMessagesRequest sendSmsMessages(SmsRequest smsRequest) {
        return new SendSmsMessagesRequest(smsRequest);
    }

    private RequestDefinition updateScheduledSmsMessagesStatusDefinition(
            String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/sms/1/bulks/status")
                .body(smsUpdateStatusRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * updateScheduledSmsMessagesStatus request builder class.
     */
    public class UpdateScheduledSmsMessagesStatusRequest {
        private final String bulkId;
        private final SmsUpdateStatusRequest smsUpdateStatusRequest;

        private UpdateScheduledSmsMessagesStatusRequest(String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.smsUpdateStatusRequest = Objects.requireNonNull(
                    smsUpdateStatusRequest, "The required parameter 'smsUpdateStatusRequest' is missing.");
        }

        /**
         * Executes the updateScheduledSmsMessagesStatus request.
         *
         * @return SmsBulkStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsBulkStatusResponse execute() throws ApiException {
            RequestDefinition updateScheduledSmsMessagesStatusDefinition =
                    updateScheduledSmsMessagesStatusDefinition(bulkId, smsUpdateStatusRequest);
            return apiClient.execute(
                    updateScheduledSmsMessagesStatusDefinition,
                    new TypeReference<SmsBulkStatusResponse>() {}.getType());
        }

        /**
         * Executes the updateScheduledSmsMessagesStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsBulkStatusResponse> callback) {
            RequestDefinition updateScheduledSmsMessagesStatusDefinition =
                    updateScheduledSmsMessagesStatusDefinition(bulkId, smsUpdateStatusRequest);
            return apiClient.executeAsync(
                    updateScheduledSmsMessagesStatusDefinition,
                    new TypeReference<SmsBulkStatusResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update scheduled SMS messages status.
     * <p>
     * Change the status or completely cancel sending of scheduled messages. To schedule a message, use the &#x60;sendAt&#x60; field when [sending a message](https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message).
     *
     * @param bulkId  (required)
     * @param smsUpdateStatusRequest  (required)
     * @return UpdateScheduledSmsMessagesStatusRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public UpdateScheduledSmsMessagesStatusRequest updateScheduledSmsMessagesStatus(
            String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest) {
        return new UpdateScheduledSmsMessagesStatusRequest(bulkId, smsUpdateStatusRequest);
    }
}
