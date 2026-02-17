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
import com.infobip.model.RcsCapabilityCheckAsyncRequest;
import com.infobip.model.RcsCapabilityCheckAsyncResponse;
import com.infobip.model.RcsCapabilityCheckSyncRequest;
import com.infobip.model.RcsCapabilityCheckSyncResponse;
import com.infobip.model.RcsDeliveryReports;
import com.infobip.model.RcsEventRequest;
import com.infobip.model.RcsLogsResponse;
import com.infobip.model.RcsMessageRequest;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents RcsApi API client.
 */
public class RcsApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of RcsApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public RcsApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition capabilityCheckRcsDestinationsNotifyDefinition(
            RcsCapabilityCheckAsyncRequest rcsCapabilityCheckAsyncRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/rcs/2/capability-check/notify")
                .body(rcsCapabilityCheckAsyncRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * capabilityCheckRcsDestinationsNotify request builder class.
     */
    public class CapabilityCheckRcsDestinationsNotifyRequest {
        private final RcsCapabilityCheckAsyncRequest rcsCapabilityCheckAsyncRequest;

        private CapabilityCheckRcsDestinationsNotifyRequest(
                RcsCapabilityCheckAsyncRequest rcsCapabilityCheckAsyncRequest) {
            this.rcsCapabilityCheckAsyncRequest = Objects.requireNonNull(
                    rcsCapabilityCheckAsyncRequest,
                    "The required parameter 'rcsCapabilityCheckAsyncRequest' is missing.");
        }

        /**
         * Executes the capabilityCheckRcsDestinationsNotify request.
         *
         * @return RcsCapabilityCheckAsyncResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public RcsCapabilityCheckAsyncResponse execute() throws ApiException {
            RequestDefinition capabilityCheckRcsDestinationsNotifyDefinition =
                    capabilityCheckRcsDestinationsNotifyDefinition(rcsCapabilityCheckAsyncRequest);
            return apiClient.execute(
                    capabilityCheckRcsDestinationsNotifyDefinition,
                    new TypeReference<RcsCapabilityCheckAsyncResponse>() {}.getType());
        }

        /**
         * Executes the capabilityCheckRcsDestinationsNotify request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<RcsCapabilityCheckAsyncResponse> callback) {
            RequestDefinition capabilityCheckRcsDestinationsNotifyDefinition =
                    capabilityCheckRcsDestinationsNotifyDefinition(rcsCapabilityCheckAsyncRequest);
            return apiClient.executeAsync(
                    capabilityCheckRcsDestinationsNotifyDefinition,
                    new TypeReference<RcsCapabilityCheckAsyncResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Check RCS capability (async).
     * <p>
     * Use this endpoint to verify whether the phone numbers in a given list can receive RCS messages from the specified sender. You can check up to 10,000 phone numbers in a single request. The [Capability Check result](#channels/rcs/receive-capability-check-result) returns asynchronously and provides the capability status for each phone number individually.  Ensure the sender is configured and launched on the mobile network/carrier that manages the phone numbers being tested for RCS capability. If the sender is not launched on the network, the capability check request will always return a negative status for the tested phone numbers.
     *
     * @param rcsCapabilityCheckAsyncRequest The request body contains the sender and a list of phone numbers to check for RCS capability. (required)
     * @return CapabilityCheckRcsDestinationsNotifyRequest
     */
    public CapabilityCheckRcsDestinationsNotifyRequest capabilityCheckRcsDestinationsNotify(
            RcsCapabilityCheckAsyncRequest rcsCapabilityCheckAsyncRequest) {
        return new CapabilityCheckRcsDestinationsNotifyRequest(rcsCapabilityCheckAsyncRequest);
    }

    private RequestDefinition capabilityCheckRcsDestinationsQueryDefinition(
            RcsCapabilityCheckSyncRequest rcsCapabilityCheckSyncRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/rcs/2/capability-check/query")
                .body(rcsCapabilityCheckSyncRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * capabilityCheckRcsDestinationsQuery request builder class.
     */
    public class CapabilityCheckRcsDestinationsQueryRequest {
        private final RcsCapabilityCheckSyncRequest rcsCapabilityCheckSyncRequest;

        private CapabilityCheckRcsDestinationsQueryRequest(
                RcsCapabilityCheckSyncRequest rcsCapabilityCheckSyncRequest) {
            this.rcsCapabilityCheckSyncRequest = Objects.requireNonNull(
                    rcsCapabilityCheckSyncRequest,
                    "The required parameter 'rcsCapabilityCheckSyncRequest' is missing.");
        }

        /**
         * Executes the capabilityCheckRcsDestinationsQuery request.
         *
         * @return RcsCapabilityCheckSyncResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public RcsCapabilityCheckSyncResponse execute() throws ApiException {
            RequestDefinition capabilityCheckRcsDestinationsQueryDefinition =
                    capabilityCheckRcsDestinationsQueryDefinition(rcsCapabilityCheckSyncRequest);
            return apiClient.execute(
                    capabilityCheckRcsDestinationsQueryDefinition,
                    new TypeReference<RcsCapabilityCheckSyncResponse>() {}.getType());
        }

        /**
         * Executes the capabilityCheckRcsDestinationsQuery request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<RcsCapabilityCheckSyncResponse> callback) {
            RequestDefinition capabilityCheckRcsDestinationsQueryDefinition =
                    capabilityCheckRcsDestinationsQueryDefinition(rcsCapabilityCheckSyncRequest);
            return apiClient.executeAsync(
                    capabilityCheckRcsDestinationsQueryDefinition,
                    new TypeReference<RcsCapabilityCheckSyncResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Check RCS capability.
     * <p>
     * Use this endpoint to verify whether the phone numbers in a given list can receive RCS messages from the specified sender. You can check up to 500 phone numbers in a single request; however, for improved efficiency, performance, and response time, we recommend using smaller batches of 1 to 10 numbers in a single request. This synchronous API is typically used for routing purposes when verifying a number’s RCS capability immediately before sending a message. This API supports up to a 100 requests per second. For bulk database cleanup, we recommend to use the asynchronous Capability Check (CapCheck) API.  The response will provide the list of capability statuses for each phone number individually. Ensure the sender is configured and launched on the mobile network/carrier that manages the phone numbers being tested for RCS capability. If the sender is not launched on the network, the capability check request will always return a negative status for the tested phone numbers.
     *
     * @param rcsCapabilityCheckSyncRequest  (required)
     * @return CapabilityCheckRcsDestinationsQueryRequest
     */
    public CapabilityCheckRcsDestinationsQueryRequest capabilityCheckRcsDestinationsQuery(
            RcsCapabilityCheckSyncRequest rcsCapabilityCheckSyncRequest) {
        return new CapabilityCheckRcsDestinationsQueryRequest(rcsCapabilityCheckSyncRequest);
    }

    private RequestDefinition getOutboundRcsMessageDeliveryReportsDefinition(
            String bulkId,
            String messageId,
            Integer limit,
            String entityId,
            String applicationId,
            String campaignReferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/rcs/2/reports")
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
     * getOutboundRcsMessageDeliveryReports request builder class.
     */
    public class GetOutboundRcsMessageDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;
        private String entityId;
        private String applicationId;
        private String campaignReferenceId;

        private GetOutboundRcsMessageDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID that uniquely identifies the request. Bulk ID will be received only when you send a message to more than one destination address. (optional)
         * @return GetOutboundRcsMessageDeliveryReportsRequest
         */
        public GetOutboundRcsMessageDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent. (optional)
         * @return GetOutboundRcsMessageDeliveryReportsRequest
         */
        public GetOutboundRcsMessageDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports to be returned. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access reports for the last 48h (optional, default to 50)
         * @return GetOutboundRcsMessageDeliveryReportsRequest
         */
        public GetOutboundRcsMessageDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundRcsMessageDeliveryReportsRequest
         */
        public GetOutboundRcsMessageDeliveryReportsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundRcsMessageDeliveryReportsRequest
         */
        public GetOutboundRcsMessageDeliveryReportsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. (optional)
         * @return GetOutboundRcsMessageDeliveryReportsRequest
         */
        public GetOutboundRcsMessageDeliveryReportsRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Executes the getOutboundRcsMessageDeliveryReports request.
         *
         * @return RcsDeliveryReports The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public RcsDeliveryReports execute() throws ApiException {
            RequestDefinition getOutboundRcsMessageDeliveryReportsDefinition =
                    getOutboundRcsMessageDeliveryReportsDefinition(
                            bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
            return apiClient.execute(
                    getOutboundRcsMessageDeliveryReportsDefinition,
                    new TypeReference<RcsDeliveryReports>() {}.getType());
        }

        /**
         * Executes the getOutboundRcsMessageDeliveryReports request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<RcsDeliveryReports> callback) {
            RequestDefinition getOutboundRcsMessageDeliveryReportsDefinition =
                    getOutboundRcsMessageDeliveryReportsDefinition(
                            bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
            return apiClient.executeAsync(
                    getOutboundRcsMessageDeliveryReportsDefinition,
                    new TypeReference<RcsDeliveryReports>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get RCS delivery reports.
     * <p>
     * If you are unable to receive real-time delivery reports towards your endpoint for various reasons, we offer you an API method to fetch batches of delivery reports to confirm whether specific messages have been delivered. Each request towards this endpoint will return batches of the latest delivery reports. Please note they will be returned only once.
     *
     * @return GetOutboundRcsMessageDeliveryReportsRequest
     * @see <a href="https://www.infobip.com/docs/rcs">Learn more about RCS channel and use cases</a>
     */
    public GetOutboundRcsMessageDeliveryReportsRequest getOutboundRcsMessageDeliveryReports() {
        return new GetOutboundRcsMessageDeliveryReportsRequest();
    }

    private RequestDefinition getOutboundRcsMessageLogsDefinition(
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
            List<String> campaignReferenceId,
            Boolean useCursor,
            String cursor) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/rcs/2/logs")
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
        if (useCursor != null) {
            builder.addQueryParameter(new Parameter("useCursor", useCursor));
        }
        if (cursor != null) {
            builder.addQueryParameter(new Parameter("cursor", cursor));
        }
        return builder.build();
    }

    /**
     * getOutboundRcsMessageLogs request builder class.
     */
    public class GetOutboundRcsMessageLogsRequest {
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
        private Boolean useCursor;
        private String cursor;

        private GetOutboundRcsMessageLogsRequest() {}

        /**
         * Sets sender.
         *
         * @param sender The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest sender(String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets destination.
         *
         * @param destination Message destination address. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus  (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest generalStatus(MessageGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it alongside sentUntil to specify a time range for the logs, but only up to the maximum limit of 1000 logs per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it alongside sentSince to specify a time range for the logs, but only up to the maximum limit of 1000 logs per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access logs for the last 48h. (optional, default to 50)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. May contain multiple comma-separated values. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest campaignReferenceId(List<String> campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Sets useCursor.
         *
         * @param useCursor Flag used to enable cursor-based pagination. When set to true, the system will use the cursor to fetch the next set of logs. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest useCursor(Boolean useCursor) {
            this.useCursor = useCursor;
            return this;
        }

        /**
         * Sets cursor.
         *
         * @param cursor Value which represents the current position in the data set. For the first request, this field shouldn&#39;t be defined. In subsequent requests, use the &#x60;nextCursor&#x60; value returned from the previous response to continue fetching data. (optional)
         * @return GetOutboundRcsMessageLogsRequest
         */
        public GetOutboundRcsMessageLogsRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Executes the getOutboundRcsMessageLogs request.
         *
         * @return RcsLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public RcsLogsResponse execute() throws ApiException {
            RequestDefinition getOutboundRcsMessageLogsDefinition = getOutboundRcsMessageLogsDefinition(
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
                    campaignReferenceId,
                    useCursor,
                    cursor);
            return apiClient.execute(
                    getOutboundRcsMessageLogsDefinition, new TypeReference<RcsLogsResponse>() {}.getType());
        }

        /**
         * Executes the getOutboundRcsMessageLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<RcsLogsResponse> callback) {
            RequestDefinition getOutboundRcsMessageLogsDefinition = getOutboundRcsMessageLogsDefinition(
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
                    campaignReferenceId,
                    useCursor,
                    cursor);
            return apiClient.executeAsync(
                    getOutboundRcsMessageLogsDefinition, new TypeReference<RcsLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get RCS message logs.
     * <p>
     * Use this method for displaying logs for example in the user interface. Available are the logs for the last 48 hours.
     *
     * @return GetOutboundRcsMessageLogsRequest
     */
    public GetOutboundRcsMessageLogsRequest getOutboundRcsMessageLogs() {
        return new GetOutboundRcsMessageLogsRequest();
    }

    private RequestDefinition sendRcsEventsDefinition(RcsEventRequest rcsEventRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/rcs/1/events")
                .body(rcsEventRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendRcsEvents request builder class.
     */
    public class SendRcsEventsRequest {
        private final RcsEventRequest rcsEventRequest;

        private SendRcsEventsRequest(RcsEventRequest rcsEventRequest) {
            this.rcsEventRequest =
                    Objects.requireNonNull(rcsEventRequest, "The required parameter 'rcsEventRequest' is missing.");
        }

        /**
         * Executes the sendRcsEvents request.
         *
         * @return MessageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MessageResponse execute() throws ApiException {
            RequestDefinition sendRcsEventsDefinition = sendRcsEventsDefinition(rcsEventRequest);
            return apiClient.execute(sendRcsEventsDefinition, new TypeReference<MessageResponse>() {}.getType());
        }

        /**
         * Executes the sendRcsEvents request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MessageResponse> callback) {
            RequestDefinition sendRcsEventsDefinition = sendRcsEventsDefinition(rcsEventRequest);
            return apiClient.executeAsync(
                    sendRcsEventsDefinition, new TypeReference<MessageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send RCS events.
     * <p>
     * Send RCS events to multiple recipients. Maximum request size is 10MB.
     *
     * @param rcsEventRequest  (required)
     * @return SendRcsEventsRequest
     * @see <a href="https://www.infobip.com/docs/rcs">Learn more about RCS channel and use cases</a>
     */
    public SendRcsEventsRequest sendRcsEvents(RcsEventRequest rcsEventRequest) {
        return new SendRcsEventsRequest(rcsEventRequest);
    }

    private RequestDefinition sendRcsMessagesDefinition(RcsMessageRequest rcsMessageRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/rcs/2/messages")
                .body(rcsMessageRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendRcsMessages request builder class.
     */
    public class SendRcsMessagesRequest {
        private final RcsMessageRequest rcsMessageRequest;

        private SendRcsMessagesRequest(RcsMessageRequest rcsMessageRequest) {
            this.rcsMessageRequest =
                    Objects.requireNonNull(rcsMessageRequest, "The required parameter 'rcsMessageRequest' is missing.");
        }

        /**
         * Executes the sendRcsMessages request.
         *
         * @return MessageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MessageResponse execute() throws ApiException {
            RequestDefinition sendRcsMessagesDefinition = sendRcsMessagesDefinition(rcsMessageRequest);
            return apiClient.execute(sendRcsMessagesDefinition, new TypeReference<MessageResponse>() {}.getType());
        }

        /**
         * Executes the sendRcsMessages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MessageResponse> callback) {
            RequestDefinition sendRcsMessagesDefinition = sendRcsMessagesDefinition(rcsMessageRequest);
            return apiClient.executeAsync(
                    sendRcsMessagesDefinition, new TypeReference<MessageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send RCS messages.
     * <p>
     * Send RCS messages or RCS template messages to multiple recipients. Maximum request size is 10MB. Including some fields will affect [billing type](https://www.infobip.com/docs/rcs/billing-types).
     *
     * @param rcsMessageRequest  (required)
     * @return SendRcsMessagesRequest
     * @see <a href="https://www.infobip.com/docs/rcs">Learn more about RCS channel and use cases</a>
     */
    public SendRcsMessagesRequest sendRcsMessages(RcsMessageRequest rcsMessageRequest) {
        return new SendRcsMessagesRequest(rcsMessageRequest);
    }
}
