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
import com.infobip.model.SmsAdvancedBinaryRequest;
import com.infobip.model.SmsAdvancedTextualRequest;
import com.infobip.model.SmsBulkRequest;
import com.infobip.model.SmsBulkResponse;
import com.infobip.model.SmsBulkStatusResponse;
import com.infobip.model.SmsDeliveryResult;
import com.infobip.model.SmsInboundMessageResult;
import com.infobip.model.SmsLogsResponse;
import com.infobip.model.SmsPreviewRequest;
import com.infobip.model.SmsPreviewResponse;
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

    private RequestDefinition getInboundSmsMessagesDefinition(Integer limit, String applicationId, String entityId) {
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
        return builder.build();
    }

    /**
     * getInboundSmsMessages request builder class.
     */
    public class GetInboundSmsMessagesRequest {
        private Integer limit;
        private String applicationId;
        private String entityId;

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
         * Executes the getInboundSmsMessages request.
         *
         * @return SmsInboundMessageResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsInboundMessageResult execute() throws ApiException {
            RequestDefinition getInboundSmsMessagesDefinition =
                    getInboundSmsMessagesDefinition(limit, applicationId, entityId);
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
                    getInboundSmsMessagesDefinition(limit, applicationId, entityId);
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
            String bulkId, String messageId, Integer limit, String applicationId, String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/1/reports")
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
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (entityId != null) {
            builder.addQueryParameter(new Parameter("entityId", entityId));
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
        private String applicationId;
        private String entityId;

        private GetOutboundSmsMessageDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a report is requested. (optional)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports to be returned. If not set, the latest 50 records are returned. Maximum limit value is &#x60;1000&#x60; and you can only access reports for the last 48h. (optional, default to 50)
         * @return GetOutboundSmsMessageDeliveryReportsRequest
         */
        public GetOutboundSmsMessageDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
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
         * Executes the getOutboundSmsMessageDeliveryReports request.
         *
         * @return SmsDeliveryResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsDeliveryResult execute() throws ApiException {
            RequestDefinition getOutboundSmsMessageDeliveryReportsDefinition =
                    getOutboundSmsMessageDeliveryReportsDefinition(bulkId, messageId, limit, applicationId, entityId);
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
                    getOutboundSmsMessageDeliveryReportsDefinition(bulkId, messageId, limit, applicationId, entityId);
            return apiClient.executeAsync(
                    getOutboundSmsMessageDeliveryReportsDefinition,
                    new TypeReference<SmsDeliveryResult>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get outbound SMS message delivery reports.
     * <p>
     * If you are for any reason unable to receive real-time delivery reports on your endpoint, you can use this API method to learn if and when the message has been delivered to the recipient. Each request will return a batch of delivery reports - only once. The following API request will return only new reports that arrived since the last API request in the last 48 hours.
     *
     * @return GetOutboundSmsMessageDeliveryReportsRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public GetOutboundSmsMessageDeliveryReportsRequest getOutboundSmsMessageDeliveryReports() {
        return new GetOutboundSmsMessageDeliveryReportsRequest();
    }

    private RequestDefinition getOutboundSmsMessageLogsDefinition(
            String from,
            String to,
            List<String> bulkId,
            List<String> messageId,
            String generalStatus,
            OffsetDateTime sentSince,
            OffsetDateTime sentUntil,
            Integer limit,
            String mcc,
            String mnc,
            String applicationId,
            String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/sms/1/logs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (from != null) {
            builder.addQueryParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addQueryParameter(new Parameter("to", to));
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
        if (mcc != null) {
            builder.addQueryParameter(new Parameter("mcc", mcc));
        }
        if (mnc != null) {
            builder.addQueryParameter(new Parameter("mnc", mnc));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (entityId != null) {
            builder.addQueryParameter(new Parameter("entityId", entityId));
        }
        return builder.build();
    }

    /**
     * getOutboundSmsMessageLogs request builder class.
     */
    public class GetOutboundSmsMessageLogsRequest {
        private String from;
        private String to;
        private List<String> bulkId;
        private List<String> messageId;
        private String generalStatus;
        private OffsetDateTime sentSince;
        private OffsetDateTime sentUntil;
        private Integer limit;
        private String mcc;
        private String mnc;
        private String applicationId;
        private String entityId;

        private GetOutboundSmsMessageLogsRequest() {}

        /**
         * Sets from.
         *
         * @param from The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets to.
         *
         * @param to Message destination address. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus Sent [message status](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes). Possible values: &#x60;ACCEPTED&#x60;, &#x60;PENDING&#x60;, &#x60;UNDELIVERABLE&#x60;, &#x60;DELIVERED&#x60;, &#x60;REJECTED&#x60;, &#x60;EXPIRED&#x60;. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest generalStatus(String generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it together with &#x60;sentUntil&#x60; to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it together with &#x60;sentBefore&#x60; to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is &#x60;1000&#x60; and you can only access logs for the last 48h. If you want to fetch more than 1000 logs allowed per call, use &#x60;sentBefore&#x60; and &#x60;sentUntil&#x60; to retrieve them in pages. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

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
         * @param mnc Mobile Network Code. (optional)
         * @return GetOutboundSmsMessageLogsRequest
         */
        public GetOutboundSmsMessageLogsRequest mnc(String mnc) {
            this.mnc = mnc;
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
         * Executes the getOutboundSmsMessageLogs request.
         *
         * @return SmsLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsLogsResponse execute() throws ApiException {
            RequestDefinition getOutboundSmsMessageLogsDefinition = getOutboundSmsMessageLogsDefinition(
                    from,
                    to,
                    bulkId,
                    messageId,
                    generalStatus,
                    sentSince,
                    sentUntil,
                    limit,
                    mcc,
                    mnc,
                    applicationId,
                    entityId);
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
                    from,
                    to,
                    bulkId,
                    messageId,
                    generalStatus,
                    sentSince,
                    sentUntil,
                    limit,
                    mcc,
                    mnc,
                    applicationId,
                    entityId);
            return apiClient.executeAsync(
                    getOutboundSmsMessageLogsDefinition, new TypeReference<SmsLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get outbound SMS message logs.
     * <p>
     * Use this method for displaying logs for example in the user interface. Available are the logs for the last 48 hours and you can only retrieve maximum of 1000 logs per call. See [message delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) if your use case is to verify message delivery.
     *
     * @return GetOutboundSmsMessageLogsRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
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

    private RequestDefinition sendBinarySmsMessageDefinition(SmsAdvancedBinaryRequest smsAdvancedBinaryRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/sms/2/binary/advanced")
                .body(smsAdvancedBinaryRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendBinarySmsMessage request builder class.
     */
    public class SendBinarySmsMessageRequest {
        private final SmsAdvancedBinaryRequest smsAdvancedBinaryRequest;

        private SendBinarySmsMessageRequest(SmsAdvancedBinaryRequest smsAdvancedBinaryRequest) {
            this.smsAdvancedBinaryRequest = Objects.requireNonNull(
                    smsAdvancedBinaryRequest, "The required parameter 'smsAdvancedBinaryRequest' is missing.");
        }

        /**
         * Executes the sendBinarySmsMessage request.
         *
         * @return SmsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsResponse execute() throws ApiException {
            RequestDefinition sendBinarySmsMessageDefinition = sendBinarySmsMessageDefinition(smsAdvancedBinaryRequest);
            return apiClient.execute(sendBinarySmsMessageDefinition, new TypeReference<SmsResponse>() {}.getType());
        }

        /**
         * Executes the sendBinarySmsMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsResponse> callback) {
            RequestDefinition sendBinarySmsMessageDefinition = sendBinarySmsMessageDefinition(smsAdvancedBinaryRequest);
            return apiClient.executeAsync(
                    sendBinarySmsMessageDefinition, new TypeReference<SmsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send binary SMS message.
     * <p>
     * Send single or multiple binary messages to one or more destination address. The API response will not contain the final delivery status, use [Delivery Reports](https://www.infobip.com/docs/api/channels/sms/sms-messaging/logs-and-status-reports/receive-outbound-sms-message-report) instead.
     *
     * @param smsAdvancedBinaryRequest  (required)
     * @return SendBinarySmsMessageRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public SendBinarySmsMessageRequest sendBinarySmsMessage(SmsAdvancedBinaryRequest smsAdvancedBinaryRequest) {
        return new SendBinarySmsMessageRequest(smsAdvancedBinaryRequest);
    }

    private RequestDefinition sendSmsMessageDefinition(SmsAdvancedTextualRequest smsAdvancedTextualRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/sms/2/text/advanced")
                .body(smsAdvancedTextualRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendSmsMessage request builder class.
     */
    public class SendSmsMessageRequest {
        private final SmsAdvancedTextualRequest smsAdvancedTextualRequest;

        private SendSmsMessageRequest(SmsAdvancedTextualRequest smsAdvancedTextualRequest) {
            this.smsAdvancedTextualRequest = Objects.requireNonNull(
                    smsAdvancedTextualRequest, "The required parameter 'smsAdvancedTextualRequest' is missing.");
        }

        /**
         * Executes the sendSmsMessage request.
         *
         * @return SmsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public SmsResponse execute() throws ApiException {
            RequestDefinition sendSmsMessageDefinition = sendSmsMessageDefinition(smsAdvancedTextualRequest);
            return apiClient.execute(sendSmsMessageDefinition, new TypeReference<SmsResponse>() {}.getType());
        }

        /**
         * Executes the sendSmsMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<SmsResponse> callback) {
            RequestDefinition sendSmsMessageDefinition = sendSmsMessageDefinition(smsAdvancedTextualRequest);
            return apiClient.executeAsync(
                    sendSmsMessageDefinition, new TypeReference<SmsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send SMS message.
     * <p>
     * Use this endpoint to send an SMS and set up a rich set of features, such as batch sending with a single API request, scheduling, URL tracking, language and transliteration configuration, etc. The API response will not contain the final delivery status, use [Delivery Reports](https://www.infobip.com/docs/api/channels/sms/sms-messaging/logs-and-status-reports/receive-outbound-sms-message-report) instead.
     *
     * @param smsAdvancedTextualRequest  (required)
     * @return SendSmsMessageRequest
     * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
     */
    public SendSmsMessageRequest sendSmsMessage(SmsAdvancedTextualRequest smsAdvancedTextualRequest) {
        return new SendSmsMessageRequest(smsAdvancedTextualRequest);
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
