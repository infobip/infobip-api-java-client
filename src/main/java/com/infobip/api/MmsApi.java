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
import com.infobip.model.MmsAdvancedRequest;
import com.infobip.model.MmsGeneralStatus;
import com.infobip.model.MmsInboundReportResponse;
import com.infobip.model.MmsLogsResponse;
import com.infobip.model.MmsReportResponse;
import com.infobip.model.MmsSendResult;
import com.infobip.model.MmsUploadBinaryResult;
import java.io.File;
import java.util.Objects;

/**
 * Represents MmsApi API client.
 */
public class MmsApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of MmsApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public MmsApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition getInboundMmsMessagesDefinition(Integer limit, String applicationId, String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/mms/1/inbox/reports")
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
     * getInboundMmsMessages request builder class.
     */
    public class GetInboundMmsMessagesRequest {
        private Integer limit;
        private String applicationId;
        private String entityId;

        private GetInboundMmsMessagesRequest() {}

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports that will be returned. (optional)
         * @return GetInboundMmsMessagesRequest
         */
        public GetInboundMmsMessagesRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId [Application](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#application) identifier used for filtering. (optional)
         * @return GetInboundMmsMessagesRequest
         */
        public GetInboundMmsMessagesRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId [Entity](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#entity) identifier used for filtering. (optional)
         * @return GetInboundMmsMessagesRequest
         */
        public GetInboundMmsMessagesRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Executes the getInboundMmsMessages request.
         *
         * @return MmsInboundReportResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MmsInboundReportResponse execute() throws ApiException {
            RequestDefinition getInboundMmsMessagesDefinition =
                    getInboundMmsMessagesDefinition(limit, applicationId, entityId);
            return apiClient.execute(
                    getInboundMmsMessagesDefinition, new TypeReference<MmsInboundReportResponse>() {}.getType());
        }

        /**
         * Executes the getInboundMmsMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MmsInboundReportResponse> callback) {
            RequestDefinition getInboundMmsMessagesDefinition =
                    getInboundMmsMessagesDefinition(limit, applicationId, entityId);
            return apiClient.executeAsync(
                    getInboundMmsMessagesDefinition,
                    new TypeReference<MmsInboundReportResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get inbound MMS messages.
     * <p>
     * If for some reason you are unable to receive incoming MMS at the endpoint of your choice in real time, you can use this API call to fetch messages. Each request will return a batch of received messages - only once. The following API request will return only new messages that arrived since the last API request.
     *
     * @return GetInboundMmsMessagesRequest
     */
    public GetInboundMmsMessagesRequest getInboundMmsMessages() {
        return new GetInboundMmsMessagesRequest();
    }

    private RequestDefinition getOutboundMmsMessageDeliveryReportsDefinition(
            String bulkId, String messageId, Integer limit, String applicationId, String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/mms/1/reports")
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
     * getOutboundMmsMessageDeliveryReports request builder class.
     */
    public class GetOutboundMmsMessageDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;
        private String applicationId;
        private String entityId;

        private GetOutboundMmsMessageDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId ID of bulk for which a delivery report is requested. (optional)
         * @return GetOutboundMmsMessageDeliveryReportsRequest
         */
        public GetOutboundMmsMessageDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId ID of MMS for which a delivery report is requested. (optional)
         * @return GetOutboundMmsMessageDeliveryReportsRequest
         */
        public GetOutboundMmsMessageDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports that will be returned. (optional)
         * @return GetOutboundMmsMessageDeliveryReportsRequest
         */
        public GetOutboundMmsMessageDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId [Application](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#application) identifier used for filtering. (optional)
         * @return GetOutboundMmsMessageDeliveryReportsRequest
         */
        public GetOutboundMmsMessageDeliveryReportsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId [Entity](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#entity) identifier used for filtering. (optional)
         * @return GetOutboundMmsMessageDeliveryReportsRequest
         */
        public GetOutboundMmsMessageDeliveryReportsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Executes the getOutboundMmsMessageDeliveryReports request.
         *
         * @return MmsReportResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MmsReportResponse execute() throws ApiException {
            RequestDefinition getOutboundMmsMessageDeliveryReportsDefinition =
                    getOutboundMmsMessageDeliveryReportsDefinition(bulkId, messageId, limit, applicationId, entityId);
            return apiClient.execute(
                    getOutboundMmsMessageDeliveryReportsDefinition,
                    new TypeReference<MmsReportResponse>() {}.getType());
        }

        /**
         * Executes the getOutboundMmsMessageDeliveryReports request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MmsReportResponse> callback) {
            RequestDefinition getOutboundMmsMessageDeliveryReportsDefinition =
                    getOutboundMmsMessageDeliveryReportsDefinition(bulkId, messageId, limit, applicationId, entityId);
            return apiClient.executeAsync(
                    getOutboundMmsMessageDeliveryReportsDefinition,
                    new TypeReference<MmsReportResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get outbound MMS message delivery reports.
     * <p>
     * If you are unable to receive real-time delivery reports towards your endpoint for various reasons, we offer you an API method to fetch batches of delivery reports to confirm whether specific messages have been delivered. Each request towards this endpoint will return batches of the latest delivery reports. Please note they will be returned only once.
     *
     * @return GetOutboundMmsMessageDeliveryReportsRequest
     */
    public GetOutboundMmsMessageDeliveryReportsRequest getOutboundMmsMessageDeliveryReports() {
        return new GetOutboundMmsMessageDeliveryReportsRequest();
    }

    private RequestDefinition getOutboundMmsMessageLogsDefinition(
            String from,
            String to,
            String bulkId,
            String messageId,
            MmsGeneralStatus generalStatus,
            String sentSince,
            String sentUntil,
            Double limit,
            String mcc,
            String mnc,
            String applicationId,
            String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/mms/1/logs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (from != null) {
            builder.addQueryParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addQueryParameter(new Parameter("to", to));
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
     * getOutboundMmsMessageLogs request builder class.
     */
    public class GetOutboundMmsMessageLogsRequest {
        private String from;
        private String to;
        private String bulkId;
        private String messageId;
        private MmsGeneralStatus generalStatus;
        private String sentSince;
        private String sentUntil;
        private Double limit;
        private String mcc;
        private String mnc;
        private String applicationId;
        private String entityId;

        private GetOutboundMmsMessageLogsRequest() {}

        /**
         * Sets from.
         *
         * @param from The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets to.
         *
         * @param to Message destination address. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus Sent [message status](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes). (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest generalStatus(MmsGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it together with sentUntil to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest sentSince(String sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it together with sentBefore to return a time range or if you want to fetch more than 1000 logs allowed per call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest sentUntil(String sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access logs for the last 48h. If you have more than 1000 logs in that period, you can retrieve remaining logs by using sentBefore and sentUntil. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest limit(Double limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets mcc.
         *
         * @param mcc Mobile Country Code. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest mcc(String mcc) {
            this.mcc = mcc;
            return this;
        }

        /**
         * Sets mnc.
         *
         * @param mnc Mobile Network Code. (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest mnc(String mnc) {
            this.mnc = mnc;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId The application used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId The entity used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundMmsMessageLogsRequest
         */
        public GetOutboundMmsMessageLogsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Executes the getOutboundMmsMessageLogs request.
         *
         * @return MmsLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MmsLogsResponse execute() throws ApiException {
            RequestDefinition getOutboundMmsMessageLogsDefinition = getOutboundMmsMessageLogsDefinition(
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
                    getOutboundMmsMessageLogsDefinition, new TypeReference<MmsLogsResponse>() {}.getType());
        }

        /**
         * Executes the getOutboundMmsMessageLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MmsLogsResponse> callback) {
            RequestDefinition getOutboundMmsMessageLogsDefinition = getOutboundMmsMessageLogsDefinition(
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
                    getOutboundMmsMessageLogsDefinition, new TypeReference<MmsLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get outbound MMS message logs.
     * <p>
     * Use this method for displaying logs for example in the user interface. Available are the logs for the last 48 hours and you can only retrieve maximum of 1000 logs per call. See [message delivery reports](#channels/mms/get-outbound-mms-message-delivery-reports) if your use case is to verify message delivery.
     *
     * @return GetOutboundMmsMessageLogsRequest
     * @see <a href="https://www.infobip.com/docs/mms">Learn more about MMS channel and use cases</a>
     */
    public GetOutboundMmsMessageLogsRequest getOutboundMmsMessageLogs() {
        return new GetOutboundMmsMessageLogsRequest();
    }

    private RequestDefinition sendMmsMessageDefinition(MmsAdvancedRequest mmsAdvancedRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/mms/1/advanced")
                .body(mmsAdvancedRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendMmsMessage request builder class.
     */
    public class SendMmsMessageRequest {
        private final MmsAdvancedRequest mmsAdvancedRequest;

        private SendMmsMessageRequest(MmsAdvancedRequest mmsAdvancedRequest) {
            this.mmsAdvancedRequest = Objects.requireNonNull(
                    mmsAdvancedRequest, "The required parameter 'mmsAdvancedRequest' is missing.");
        }

        /**
         * Executes the sendMmsMessage request.
         *
         * @return MmsSendResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MmsSendResult execute() throws ApiException {
            RequestDefinition sendMmsMessageDefinition = sendMmsMessageDefinition(mmsAdvancedRequest);
            return apiClient.execute(sendMmsMessageDefinition, new TypeReference<MmsSendResult>() {}.getType());
        }

        /**
         * Executes the sendMmsMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MmsSendResult> callback) {
            RequestDefinition sendMmsMessageDefinition = sendMmsMessageDefinition(mmsAdvancedRequest);
            return apiClient.executeAsync(
                    sendMmsMessageDefinition, new TypeReference<MmsSendResult>() {}.getType(), callback);
        }
    }

    /**
     * Send MMS message.
     * <p>
     * This method allows you to send one MMS or bulk MMS to a recipient or multiple recipients in one request.
     *
     * @param mmsAdvancedRequest  (required)
     * @return SendMmsMessageRequest
     * @see <a href="https://www.infobip.com/docs/mms">Learn more about MMS channel and use cases</a>
     */
    public SendMmsMessageRequest sendMmsMessage(MmsAdvancedRequest mmsAdvancedRequest) {
        return new SendMmsMessageRequest(mmsAdvancedRequest);
    }

    private RequestDefinition uploadBinaryDefinition(
            String xContentId, String xMediaType, File body, Long xValidityPeriodMinutes) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/mms/1/content")
                .body(body)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/octet-stream");

        if (xContentId != null) {
            builder.addHeaderParameter(new Parameter("X-Content-Id", xContentId));
        }
        if (xMediaType != null) {
            builder.addHeaderParameter(new Parameter("X-Media-Type", xMediaType));
        }
        if (xValidityPeriodMinutes != null) {
            builder.addHeaderParameter(new Parameter("X-Validity-Period-Minutes", xValidityPeriodMinutes));
        }
        return builder.build();
    }

    /**
     * uploadBinary request builder class.
     */
    public class UploadBinaryRequest {
        private final String xContentId;
        private final String xMediaType;
        private final File body;
        private Long xValidityPeriodMinutes;

        private UploadBinaryRequest(String xContentId, String xMediaType, File body) {
            this.xContentId = Objects.requireNonNull(xContentId, "The required parameter 'xContentId' is missing.");
            this.xMediaType = Objects.requireNonNull(xMediaType, "The required parameter 'xMediaType' is missing.");
            this.body = Objects.requireNonNull(body, "The required parameter 'body' is missing.");
        }

        /**
         * Sets xValidityPeriodMinutes.
         *
         * @param xValidityPeriodMinutes Validity period in minutes after which the content will be deleted. (default: 69120 minutes). (optional, default to 69120)
         * @return UploadBinaryRequest
         */
        public UploadBinaryRequest xValidityPeriodMinutes(Long xValidityPeriodMinutes) {
            this.xValidityPeriodMinutes = xValidityPeriodMinutes;
            return this;
        }

        /**
         * Executes the uploadBinary request.
         *
         * @return MmsUploadBinaryResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MmsUploadBinaryResult execute() throws ApiException {
            RequestDefinition uploadBinaryDefinition =
                    uploadBinaryDefinition(xContentId, xMediaType, body, xValidityPeriodMinutes);
            return apiClient.execute(uploadBinaryDefinition, new TypeReference<MmsUploadBinaryResult>() {}.getType());
        }

        /**
         * Executes the uploadBinary request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MmsUploadBinaryResult> callback) {
            RequestDefinition uploadBinaryDefinition =
                    uploadBinaryDefinition(xContentId, xMediaType, body, xValidityPeriodMinutes);
            return apiClient.executeAsync(
                    uploadBinaryDefinition, new TypeReference<MmsUploadBinaryResult>() {}.getType(), callback);
        }
    }

    /**
     * Upload binary content.
     * <p>
     * This method allows you to upload binary content that you can reference when sending MMS messages.
     *
     * @param xContentId ContentId that uniquely identifies the binary content. (required)
     * @param xMediaType Content mime type. Should be populated by standard MIME types (IANA media types). (required)
     * @param body  (required)
     * @return UploadBinaryRequest
     */
    public UploadBinaryRequest uploadBinary(String xContentId, String xMediaType, File body) {
        return new UploadBinaryRequest(xContentId, xMediaType, body);
    }
}
