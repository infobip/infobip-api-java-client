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
import com.infobip.model.EmailAddDomainRequest;
import com.infobip.model.EmailAllDomainsResponse;
import com.infobip.model.EmailBulkRescheduleRequest;
import com.infobip.model.EmailBulkRescheduleResponse;
import com.infobip.model.EmailBulkScheduleResponse;
import com.infobip.model.EmailBulkStatusResponse;
import com.infobip.model.EmailBulkUpdateStatusRequest;
import com.infobip.model.EmailBulkUpdateStatusResponse;
import com.infobip.model.EmailDomainIpRequest;
import com.infobip.model.EmailDomainIpResponse;
import com.infobip.model.EmailDomainResponse;
import com.infobip.model.EmailLogsResponse;
import com.infobip.model.EmailReportsResult;
import com.infobip.model.EmailReturnPathAddressRequest;
import com.infobip.model.EmailSendResponse;
import com.infobip.model.EmailSimpleApiResponse;
import com.infobip.model.EmailTrackingEventRequest;
import com.infobip.model.EmailValidationRequest;
import com.infobip.model.EmailValidationResponse;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents EmailApi API client.
 */
public class EmailApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of EmailApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public EmailApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition addDomainDefinition(EmailAddDomainRequest emailAddDomainRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/1/domains")
                .body(emailAddDomainRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * addDomain request builder class.
     */
    public class AddDomainRequest {
        private final EmailAddDomainRequest emailAddDomainRequest;

        private AddDomainRequest(EmailAddDomainRequest emailAddDomainRequest) {
            this.emailAddDomainRequest = Objects.requireNonNull(
                    emailAddDomainRequest, "The required parameter 'emailAddDomainRequest' is missing.");
        }

        /**
         * Executes the addDomain request.
         *
         * @return EmailDomainResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainResponse execute() throws ApiException {
            RequestDefinition addDomainDefinition = addDomainDefinition(emailAddDomainRequest);
            return apiClient.execute(addDomainDefinition, new TypeReference<EmailDomainResponse>() {}.getType());
        }

        /**
         * Executes the addDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainResponse> callback) {
            RequestDefinition addDomainDefinition = addDomainDefinition(emailAddDomainRequest);
            return apiClient.executeAsync(
                    addDomainDefinition, new TypeReference<EmailDomainResponse>() {}.getType(), callback);
        }
    }

    /**
     * Add new domain.
     * <p>
     * This method allows you to add new domains with a limit to create a maximum of 1000 domains in a day.
     *
     * @param emailAddDomainRequest  (required)
     * @return AddDomainRequest
     */
    public AddDomainRequest addDomain(EmailAddDomainRequest emailAddDomainRequest) {
        return new AddDomainRequest(emailAddDomainRequest);
    }

    private RequestDefinition assignIpToDomainDefinition(EmailDomainIpRequest emailDomainIpRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/1/domain-ips")
                .body(emailDomainIpRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * assignIpToDomain request builder class.
     */
    public class AssignIpToDomainRequest {
        private final EmailDomainIpRequest emailDomainIpRequest;

        private AssignIpToDomainRequest(EmailDomainIpRequest emailDomainIpRequest) {
            this.emailDomainIpRequest = Objects.requireNonNull(
                    emailDomainIpRequest, "The required parameter 'emailDomainIpRequest' is missing.");
        }

        /**
         * Executes the assignIpToDomain request.
         *
         * @return EmailSimpleApiResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailSimpleApiResponse execute() throws ApiException {
            RequestDefinition assignIpToDomainDefinition = assignIpToDomainDefinition(emailDomainIpRequest);
            return apiClient.execute(
                    assignIpToDomainDefinition, new TypeReference<EmailSimpleApiResponse>() {}.getType());
        }

        /**
         * Executes the assignIpToDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailSimpleApiResponse> callback) {
            RequestDefinition assignIpToDomainDefinition = assignIpToDomainDefinition(emailDomainIpRequest);
            return apiClient.executeAsync(
                    assignIpToDomainDefinition, new TypeReference<EmailSimpleApiResponse>() {}.getType(), callback);
        }
    }

    /**
     * Assign dedicated ip address to the provided domain for the account id.
     * <p>
     * Assign dedicated ip address to the provided domain for the account id.
     *
     * @param emailDomainIpRequest  (required)
     * @return AssignIpToDomainRequest
     */
    public AssignIpToDomainRequest assignIpToDomain(EmailDomainIpRequest emailDomainIpRequest) {
        return new AssignIpToDomainRequest(emailDomainIpRequest);
    }

    private RequestDefinition deleteDomainDefinition(String domainName) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/email/1/domains/{domainName}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainName != null) {
            builder.addPathParameter(new Parameter("domainName", domainName));
        }
        return builder.build();
    }

    /**
     * deleteDomain request builder class.
     */
    public class DeleteDomainRequest {
        private final String domainName;

        private DeleteDomainRequest(String domainName) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
        }

        /**
         * Executes the deleteDomain request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteDomainDefinition = deleteDomainDefinition(domainName);
            apiClient.execute(deleteDomainDefinition);
        }

        /**
         * Executes the deleteDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteDomainDefinition = deleteDomainDefinition(domainName);
            return apiClient.executeAsync(deleteDomainDefinition, callback);
        }
    }

    /**
     * Delete existing domain.
     * <p>
     * This method allows you to delete an existing domain.
     *
     * @param domainName Domain name which needs to be deleted. (required)
     * @return DeleteDomainRequest
     */
    public DeleteDomainRequest deleteDomain(String domainName) {
        return new DeleteDomainRequest(domainName);
    }

    private RequestDefinition getAllDomainIpsDefinition(String domainName) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/domain-ips")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainName != null) {
            builder.addQueryParameter(new Parameter("domainName", domainName));
        }
        return builder.build();
    }

    /**
     * getAllDomainIps request builder class.
     */
    public class GetAllDomainIpsRequest {
        private final String domainName;

        private GetAllDomainIpsRequest(String domainName) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
        }

        /**
         * Executes the getAllDomainIps request.
         *
         * @return EmailDomainIpResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainIpResponse execute() throws ApiException {
            RequestDefinition getAllDomainIpsDefinition = getAllDomainIpsDefinition(domainName);
            return apiClient.execute(
                    getAllDomainIpsDefinition, new TypeReference<EmailDomainIpResponse>() {}.getType());
        }

        /**
         * Executes the getAllDomainIps request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainIpResponse> callback) {
            RequestDefinition getAllDomainIpsDefinition = getAllDomainIpsDefinition(domainName);
            return apiClient.executeAsync(
                    getAllDomainIpsDefinition, new TypeReference<EmailDomainIpResponse>() {}.getType(), callback);
        }
    }

    /**
     * List all dedicated ips for domain and for provided account id.
     * <p>
     * Fetch all dedicated ips for domain and provided account id.
     *
     * @param domainName Name of the domain. (required)
     * @return GetAllDomainIpsRequest
     */
    public GetAllDomainIpsRequest getAllDomainIps(String domainName) {
        return new GetAllDomainIpsRequest(domainName);
    }

    private RequestDefinition getAllDomainsDefinition(Integer size, Integer page) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/domains")
                .requiresAuthentication(true)
                .accept("application/json");

        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        return builder.build();
    }

    /**
     * getAllDomains request builder class.
     */
    public class GetAllDomainsRequest {
        private Integer size;
        private Integer page;

        private GetAllDomainsRequest() {}

        /**
         * Sets size.
         *
         * @param size Maximum number of domains to be viewed per page. Default value is 10 with a maximum of 20 records per page. (optional, default to 10)
         * @return GetAllDomainsRequest
         */
        public GetAllDomainsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Page number you want to see. Default is 0. (optional, default to 0)
         * @return GetAllDomainsRequest
         */
        public GetAllDomainsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Executes the getAllDomains request.
         *
         * @return EmailAllDomainsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailAllDomainsResponse execute() throws ApiException {
            RequestDefinition getAllDomainsDefinition = getAllDomainsDefinition(size, page);
            return apiClient.execute(
                    getAllDomainsDefinition, new TypeReference<EmailAllDomainsResponse>() {}.getType());
        }

        /**
         * Executes the getAllDomains request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailAllDomainsResponse> callback) {
            RequestDefinition getAllDomainsDefinition = getAllDomainsDefinition(size, page);
            return apiClient.executeAsync(
                    getAllDomainsDefinition, new TypeReference<EmailAllDomainsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get all domains for the account.
     * <p>
     * This API is to get all domain associated with the account. It also provides details of the retrieved domain like the DNS records, Tracking details, Active/Blocked status,etc.
     *
     * @return GetAllDomainsRequest
     */
    public GetAllDomainsRequest getAllDomains() {
        return new GetAllDomainsRequest();
    }

    private RequestDefinition getAllIpsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/ips")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * getAllIps request builder class.
     */
    public class GetAllIpsRequest {

        private GetAllIpsRequest() {}

        /**
         * Executes the getAllIps request.
         *
         * @return EmailDomainIpResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainIpResponse execute() throws ApiException {
            RequestDefinition getAllIpsDefinition = getAllIpsDefinition();
            return apiClient.execute(getAllIpsDefinition, new TypeReference<EmailDomainIpResponse>() {}.getType());
        }

        /**
         * Executes the getAllIps request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainIpResponse> callback) {
            RequestDefinition getAllIpsDefinition = getAllIpsDefinition();
            return apiClient.executeAsync(
                    getAllIpsDefinition, new TypeReference<EmailDomainIpResponse>() {}.getType(), callback);
        }
    }

    /**
     * List all dedicated ips for provided account id.
     * <p>
     * Fetch all dedicated ips for the provided account id.
     *
     * @return GetAllIpsRequest
     */
    public GetAllIpsRequest getAllIps() {
        return new GetAllIpsRequest();
    }

    private RequestDefinition getDomainDetailsDefinition(String domainName) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/domains/{domainName}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainName != null) {
            builder.addPathParameter(new Parameter("domainName", domainName));
        }
        return builder.build();
    }

    /**
     * getDomainDetails request builder class.
     */
    public class GetDomainDetailsRequest {
        private final String domainName;

        private GetDomainDetailsRequest(String domainName) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
        }

        /**
         * Executes the getDomainDetails request.
         *
         * @return EmailDomainResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainResponse execute() throws ApiException {
            RequestDefinition getDomainDetailsDefinition = getDomainDetailsDefinition(domainName);
            return apiClient.execute(getDomainDetailsDefinition, new TypeReference<EmailDomainResponse>() {}.getType());
        }

        /**
         * Executes the getDomainDetails request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainResponse> callback) {
            RequestDefinition getDomainDetailsDefinition = getDomainDetailsDefinition(domainName);
            return apiClient.executeAsync(
                    getDomainDetailsDefinition, new TypeReference<EmailDomainResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get domain details.
     * <p>
     * This API provides with the details of the domain like the DNS records, Tracking details, Active/Blocked status,etc.
     *
     * @param domainName Domain for which the details need to be viewed. (required)
     * @return GetDomainDetailsRequest
     */
    public GetDomainDetailsRequest getDomainDetails(String domainName) {
        return new GetDomainDetailsRequest(domainName);
    }

    private RequestDefinition getEmailDeliveryReportsDefinition(
            String bulkId, String messageId, Integer limit, String applicationId, String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/reports")
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
     * getEmailDeliveryReports request builder class.
     */
    public class GetEmailDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;
        private String applicationId;
        private String entityId;

        private GetEmailDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId Bulk ID for which report is requested. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the sent email. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of reports. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId [Application](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#application) identifier used for filtering. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId [Entity](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#entity) identifier used for filtering. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Executes the getEmailDeliveryReports request.
         *
         * @return EmailReportsResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailReportsResult execute() throws ApiException {
            RequestDefinition getEmailDeliveryReportsDefinition =
                    getEmailDeliveryReportsDefinition(bulkId, messageId, limit, applicationId, entityId);
            return apiClient.execute(
                    getEmailDeliveryReportsDefinition, new TypeReference<EmailReportsResult>() {}.getType());
        }

        /**
         * Executes the getEmailDeliveryReports request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailReportsResult> callback) {
            RequestDefinition getEmailDeliveryReportsDefinition =
                    getEmailDeliveryReportsDefinition(bulkId, messageId, limit, applicationId, entityId);
            return apiClient.executeAsync(
                    getEmailDeliveryReportsDefinition, new TypeReference<EmailReportsResult>() {}.getType(), callback);
        }
    }

    /**
     * Email delivery reports.
     * <p>
     * Get one-time delivery reports for all sent emails.
     *
     * @return GetEmailDeliveryReportsRequest
     */
    public GetEmailDeliveryReportsRequest getEmailDeliveryReports() {
        return new GetEmailDeliveryReportsRequest();
    }

    private RequestDefinition getEmailLogsDefinition(
            String messageId,
            String from,
            String to,
            String bulkId,
            String generalStatus,
            OffsetDateTime sentSince,
            OffsetDateTime sentUntil,
            Integer limit,
            String applicationId,
            String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/logs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (messageId != null) {
            builder.addQueryParameter(new Parameter("messageId", messageId));
        }
        if (from != null) {
            builder.addQueryParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addQueryParameter(new Parameter("to", to));
        }
        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
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
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (entityId != null) {
            builder.addQueryParameter(new Parameter("entityId", entityId));
        }
        return builder.build();
    }

    /**
     * getEmailLogs request builder class.
     */
    public class GetEmailLogsRequest {
        private String messageId;
        private String from;
        private String to;
        private String bulkId;
        private String generalStatus;
        private OffsetDateTime sentSince;
        private OffsetDateTime sentUntil;
        private Integer limit;
        private String applicationId;
        private String entityId;

        private GetEmailLogsRequest() {}

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the sent email. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets from.
         *
         * @param from From email address. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets to.
         *
         * @param to The recipient email address. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Bulk ID that uniquely identifies the request. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus Indicates whether the initiated email has been successfully sent, not sent, delivered, not delivered, waiting for delivery or any other possible status. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest generalStatus(String generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince Tells when the email was initiated. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil Tells when the email request was processed by Infobip.Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of logs. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId [Application](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#application) identifier used for filtering. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId [Entity](https://www.infobip.com/docs/cpaas-x/application-and-entity-management#entity) identifier used for filtering. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Executes the getEmailLogs request.
         *
         * @return EmailLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailLogsResponse execute() throws ApiException {
            RequestDefinition getEmailLogsDefinition = getEmailLogsDefinition(
                    messageId, from, to, bulkId, generalStatus, sentSince, sentUntil, limit, applicationId, entityId);
            return apiClient.execute(getEmailLogsDefinition, new TypeReference<EmailLogsResponse>() {}.getType());
        }

        /**
         * Executes the getEmailLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailLogsResponse> callback) {
            RequestDefinition getEmailLogsDefinition = getEmailLogsDefinition(
                    messageId, from, to, bulkId, generalStatus, sentSince, sentUntil, limit, applicationId, entityId);
            return apiClient.executeAsync(
                    getEmailLogsDefinition, new TypeReference<EmailLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get email logs.
     * <p>
     * This method allows you to get logs for sent emails using their messageId. Email logs are available for the last 48 hours.
     *
     * @return GetEmailLogsRequest
     */
    public GetEmailLogsRequest getEmailLogs() {
        return new GetEmailLogsRequest();
    }

    private RequestDefinition getScheduledEmailStatusesDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/bulks/status")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getScheduledEmailStatuses request builder class.
     */
    public class GetScheduledEmailStatusesRequest {
        private final String bulkId;

        private GetScheduledEmailStatusesRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getScheduledEmailStatuses request.
         *
         * @return EmailBulkStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailBulkStatusResponse execute() throws ApiException {
            RequestDefinition getScheduledEmailStatusesDefinition = getScheduledEmailStatusesDefinition(bulkId);
            return apiClient.execute(
                    getScheduledEmailStatusesDefinition, new TypeReference<EmailBulkStatusResponse>() {}.getType());
        }

        /**
         * Executes the getScheduledEmailStatuses request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailBulkStatusResponse> callback) {
            RequestDefinition getScheduledEmailStatusesDefinition = getScheduledEmailStatusesDefinition(bulkId);
            return apiClient.executeAsync(
                    getScheduledEmailStatusesDefinition,
                    new TypeReference<EmailBulkStatusResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get sent email bulks status.
     * <p>
     * See the status of scheduled email messages.
     *
     * @param bulkId The ID uniquely identifies the sent email request. (required)
     * @return GetScheduledEmailStatusesRequest
     */
    public GetScheduledEmailStatusesRequest getScheduledEmailStatuses(String bulkId) {
        return new GetScheduledEmailStatusesRequest(bulkId);
    }

    private RequestDefinition getScheduledEmailsDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/bulks")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getScheduledEmails request builder class.
     */
    public class GetScheduledEmailsRequest {
        private final String bulkId;

        private GetScheduledEmailsRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getScheduledEmails request.
         *
         * @return EmailBulkScheduleResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailBulkScheduleResponse execute() throws ApiException {
            RequestDefinition getScheduledEmailsDefinition = getScheduledEmailsDefinition(bulkId);
            return apiClient.execute(
                    getScheduledEmailsDefinition, new TypeReference<EmailBulkScheduleResponse>() {}.getType());
        }

        /**
         * Executes the getScheduledEmails request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailBulkScheduleResponse> callback) {
            RequestDefinition getScheduledEmailsDefinition = getScheduledEmailsDefinition(bulkId);
            return apiClient.executeAsync(
                    getScheduledEmailsDefinition,
                    new TypeReference<EmailBulkScheduleResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get sent email bulks.
     * <p>
     * See the scheduled time of your Email messages.
     *
     * @param bulkId The ID uniquely identifies the sent email request. (required)
     * @return GetScheduledEmailsRequest
     */
    public GetScheduledEmailsRequest getScheduledEmails(String bulkId) {
        return new GetScheduledEmailsRequest(bulkId);
    }

    private RequestDefinition removeIpFromDomainDefinition(String domainName, String ipAddress) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/email/1/domain-ips")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainName != null) {
            builder.addQueryParameter(new Parameter("domainName", domainName));
        }
        if (ipAddress != null) {
            builder.addQueryParameter(new Parameter("ipAddress", ipAddress));
        }
        return builder.build();
    }

    /**
     * removeIpFromDomain request builder class.
     */
    public class RemoveIpFromDomainRequest {
        private final String domainName;
        private final String ipAddress;

        private RemoveIpFromDomainRequest(String domainName, String ipAddress) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
            this.ipAddress = Objects.requireNonNull(ipAddress, "The required parameter 'ipAddress' is missing.");
        }

        /**
         * Executes the removeIpFromDomain request.
         *
         * @return EmailSimpleApiResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailSimpleApiResponse execute() throws ApiException {
            RequestDefinition removeIpFromDomainDefinition = removeIpFromDomainDefinition(domainName, ipAddress);
            return apiClient.execute(
                    removeIpFromDomainDefinition, new TypeReference<EmailSimpleApiResponse>() {}.getType());
        }

        /**
         * Executes the removeIpFromDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailSimpleApiResponse> callback) {
            RequestDefinition removeIpFromDomainDefinition = removeIpFromDomainDefinition(domainName, ipAddress);
            return apiClient.executeAsync(
                    removeIpFromDomainDefinition, new TypeReference<EmailSimpleApiResponse>() {}.getType(), callback);
        }
    }

    /**
     * Remove dedicated ip address from the provided domain.
     * <p>
     * Remove dedicated ip address from the provided domain.
     *
     * @param domainName Name of the domain. (required)
     * @param ipAddress Dedicated ip address. (required)
     * @return RemoveIpFromDomainRequest
     */
    public RemoveIpFromDomainRequest removeIpFromDomain(String domainName, String ipAddress) {
        return new RemoveIpFromDomainRequest(domainName, ipAddress);
    }

    private RequestDefinition rescheduleEmailsDefinition(
            String bulkId, EmailBulkRescheduleRequest emailBulkRescheduleRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/email/1/bulks")
                .body(emailBulkRescheduleRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * rescheduleEmails request builder class.
     */
    public class RescheduleEmailsRequest {
        private final String bulkId;
        private final EmailBulkRescheduleRequest emailBulkRescheduleRequest;

        private RescheduleEmailsRequest(String bulkId, EmailBulkRescheduleRequest emailBulkRescheduleRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.emailBulkRescheduleRequest = Objects.requireNonNull(
                    emailBulkRescheduleRequest, "The required parameter 'emailBulkRescheduleRequest' is missing.");
        }

        /**
         * Executes the rescheduleEmails request.
         *
         * @return EmailBulkRescheduleResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailBulkRescheduleResponse execute() throws ApiException {
            RequestDefinition rescheduleEmailsDefinition =
                    rescheduleEmailsDefinition(bulkId, emailBulkRescheduleRequest);
            return apiClient.execute(
                    rescheduleEmailsDefinition, new TypeReference<EmailBulkRescheduleResponse>() {}.getType());
        }

        /**
         * Executes the rescheduleEmails request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailBulkRescheduleResponse> callback) {
            RequestDefinition rescheduleEmailsDefinition =
                    rescheduleEmailsDefinition(bulkId, emailBulkRescheduleRequest);
            return apiClient.executeAsync(
                    rescheduleEmailsDefinition,
                    new TypeReference<EmailBulkRescheduleResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Reschedule Email messages.
     * <p>
     * Change the date and time for sending scheduled messages.
     *
     * @param bulkId  (required)
     * @param emailBulkRescheduleRequest  (required)
     * @return RescheduleEmailsRequest
     */
    public RescheduleEmailsRequest rescheduleEmails(
            String bulkId, EmailBulkRescheduleRequest emailBulkRescheduleRequest) {
        return new RescheduleEmailsRequest(bulkId, emailBulkRescheduleRequest);
    }

    private RequestDefinition sendEmailDefinition(
            List<String> to,
            String from,
            List<String> cc,
            List<String> bcc,
            String subject,
            String text,
            String html,
            String ampHtml,
            Long templateId,
            List<File> attachment,
            List<File> inlineImage,
            Boolean intermediateReport,
            String notifyUrl,
            String notifyContentType,
            String callbackData,
            Boolean track,
            Boolean trackClicks,
            Boolean trackOpens,
            String trackingUrl,
            String bulkId,
            String messageId,
            String replyTo,
            String defaultPlaceholders,
            Boolean preserveRecipients,
            OffsetDateTime sendAt,
            String landingPagePlaceholders,
            String landingPageId,
            String templateLanguageVersion,
            String applicationId,
            String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/3/send")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("multipart/form-data");

        if (from != null) {
            builder.addFormParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addFormParameter(new Parameter("to", to));
        }
        if (cc != null) {
            builder.addFormParameter(new Parameter("cc", cc));
        }
        if (bcc != null) {
            builder.addFormParameter(new Parameter("bcc", bcc));
        }
        if (subject != null) {
            builder.addFormParameter(new Parameter("subject", subject));
        }
        if (text != null) {
            builder.addFormParameter(new Parameter("text", text));
        }
        if (html != null) {
            builder.addFormParameter(new Parameter("html", html));
        }
        if (ampHtml != null) {
            builder.addFormParameter(new Parameter("ampHtml", ampHtml));
        }
        if (templateId != null) {
            builder.addFormParameter(new Parameter("templateId", templateId));
        }
        if (attachment != null) {
            builder.addFormParameter(new Parameter("attachment", attachment));
        }
        if (inlineImage != null) {
            builder.addFormParameter(new Parameter("inlineImage", inlineImage));
        }
        if (intermediateReport != null) {
            builder.addFormParameter(new Parameter("intermediateReport", intermediateReport));
        }
        if (notifyUrl != null) {
            builder.addFormParameter(new Parameter("notifyUrl", notifyUrl));
        }
        if (notifyContentType != null) {
            builder.addFormParameter(new Parameter("notifyContentType", notifyContentType));
        }
        if (callbackData != null) {
            builder.addFormParameter(new Parameter("callbackData", callbackData));
        }
        if (track != null) {
            builder.addFormParameter(new Parameter("track", track));
        }
        if (trackClicks != null) {
            builder.addFormParameter(new Parameter("trackClicks", trackClicks));
        }
        if (trackOpens != null) {
            builder.addFormParameter(new Parameter("trackOpens", trackOpens));
        }
        if (trackingUrl != null) {
            builder.addFormParameter(new Parameter("trackingUrl", trackingUrl));
        }
        if (bulkId != null) {
            builder.addFormParameter(new Parameter("bulkId", bulkId));
        }
        if (messageId != null) {
            builder.addFormParameter(new Parameter("messageId", messageId));
        }
        if (replyTo != null) {
            builder.addFormParameter(new Parameter("replyTo", replyTo));
        }
        if (defaultPlaceholders != null) {
            builder.addFormParameter(new Parameter("defaultPlaceholders", defaultPlaceholders));
        }
        if (preserveRecipients != null) {
            builder.addFormParameter(new Parameter("preserveRecipients", preserveRecipients));
        }
        if (sendAt != null) {
            builder.addFormParameter(new Parameter("sendAt", sendAt));
        }
        if (landingPagePlaceholders != null) {
            builder.addFormParameter(new Parameter("landingPagePlaceholders", landingPagePlaceholders));
        }
        if (landingPageId != null) {
            builder.addFormParameter(new Parameter("landingPageId", landingPageId));
        }
        if (templateLanguageVersion != null) {
            builder.addFormParameter(new Parameter("templateLanguageVersion", templateLanguageVersion));
        }
        if (applicationId != null) {
            builder.addFormParameter(new Parameter("applicationId", applicationId));
        }
        if (entityId != null) {
            builder.addFormParameter(new Parameter("entityId", entityId));
        }
        return builder.build();
    }

    /**
     * sendEmail request builder class.
     */
    public class SendEmailRequest {
        private final List<String> to;
        private String from;
        private List<String> cc;
        private List<String> bcc;
        private String subject;
        private String text;
        private String html;
        private String ampHtml;
        private Long templateId;
        private List<File> attachment;
        private List<File> inlineImage;
        private Boolean intermediateReport;
        private String notifyUrl;
        private String notifyContentType;
        private String callbackData;
        private Boolean track;
        private Boolean trackClicks;
        private Boolean trackOpens;
        private String trackingUrl;
        private String bulkId;
        private String messageId;
        private String replyTo;
        private String defaultPlaceholders;
        private Boolean preserveRecipients;
        private OffsetDateTime sendAt;
        private String landingPagePlaceholders;
        private String landingPageId;
        private String templateLanguageVersion;
        private String applicationId;
        private String entityId;

        private SendEmailRequest(List<String> to) {
            this.to = Objects.requireNonNull(to, "The required parameter 'to' is missing.");
        }

        /**
         * Sets from.
         *
         * @param from Email address with optional sender name.  Note: This field is required if &#x60;templateId&#x60; is not present. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets cc.
         *
         * @param cc CC recipient email address.  Note: Maximum number of recipients per request is 1000 overall including to, cc and bcc field. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest cc(List<String> cc) {
            this.cc = cc;
            return this;
        }

        /**
         * Sets bcc.
         *
         * @param bcc BCC recipient email address.  Note: Maximum number of recipients per request is 1000 overall including to, cc and bcc field. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest bcc(List<String> bcc) {
            this.bcc = bcc;
            return this;
        }

        /**
         * Sets subject.
         *
         * @param subject Message subject.  Note: This field is required if &#x60;templateId&#x60; is not present. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Sets text.
         *
         * @param text Body of the message. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Sets html.
         *
         * @param html HTML body of the message. If &#x60;html&#x60; and &#x60;text&#x60; fields are present, the &#x60;text&#x60; field will be ignored and &#x60;html&#x60; will be delivered as a message body. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest html(String html) {
            this.html = html;
            return this;
        }

        /**
         * Sets ampHtml.
         *
         * @param ampHtml Amp HTML body of the message. If &#x60;ampHtml&#x60; is present, &#x60;html&#x60; is mandatory. Amp HTML is not supported by all the email clients. Please check this link for configuring gmail client https://developers.google.com/gmail/ampemail/. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest ampHtml(String ampHtml) {
            this.ampHtml = ampHtml;
            return this;
        }

        /**
         * Sets templateId.
         *
         * @param templateId Template ID used for generating email content. The template is created over Infobip web interface. If &#x60;templateId&#x60; is present, then &#x60;html&#x60; and &#x60;text&#x60; values are ignored.  Note: &#x60;templateId&#x60; only supports the value of &#x60;Broadcast&#x60;. &#x60;Content&#x60; and &#x60;Flow&#x60; are not supported. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * Sets attachment.
         *
         * @param attachment File attachment. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest attachment(List<File> attachment) {
            this.attachment = attachment;
            return this;
        }

        /**
         * Sets inlineImage.
         *
         * @param inlineImage Allows for inserting an image file inside the HTML code of the email by using &#x60;cid:FILENAME&#x60; instead of providing an external link to the image. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest inlineImage(List<File> inlineImage) {
            this.inlineImage = inlineImage;
            return this;
        }

        /**
         * Sets intermediateReport.
         *
         * @param intermediateReport The real-time Intermediate delivery report that will be sent on your callback server. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest intermediateReport(Boolean intermediateReport) {
            this.intermediateReport = intermediateReport;
            return this;
        }

        /**
         * Sets notifyUrl.
         *
         * @param notifyUrl The URL on your callback server on which the Delivery report will be sent. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest notifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * Sets notifyContentType.
         *
         * @param notifyContentType Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest notifyContentType(String notifyContentType) {
            this.notifyContentType = notifyContentType;
            return this;
        }

        /**
         * Sets callbackData.
         *
         * @param callbackData Additional client data that will be sent on the notifyUrl. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest callbackData(String callbackData) {
            this.callbackData = callbackData;
            return this;
        }

        /**
         * Sets track.
         *
         * @param track Enable or disable open and click tracking. Passing true will only enable tracking and the statistics would be visible in the web interface alone. This can be explicitly overridden by &#x60;trackClicks&#x60; and &#x60;trackOpens&#x60;. (optional, default to true)
         * @return SendEmailRequest
         */
        public SendEmailRequest track(Boolean track) {
            this.track = track;
            return this;
        }

        /**
         * Sets trackClicks.
         *
         * @param trackClicks This parameter enables or disables track click feature. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest trackClicks(Boolean trackClicks) {
            this.trackClicks = trackClicks;
            return this;
        }

        /**
         * Sets trackOpens.
         *
         * @param trackOpens This parameter enables or disables track open feature. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest trackOpens(Boolean trackOpens) {
            this.trackOpens = trackOpens;
            return this;
        }

        /**
         * Sets trackingUrl.
         *
         * @param trackingUrl The URL on your callback server on which the open and click notifications will be sent. See [Tracking Notifications](https://www.infobip.com/docs/email/send-email-over-api#tracking-notifications) for details. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest trackingUrl(String trackingUrl) {
            this.trackingUrl = trackingUrl;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID uniquely identifies the sent email request. This filter will enable you to query delivery reports for all the messages using just one request. You will receive a &#x60;bulkId&#x60; in the response after sending an email request. If you don&#39;t set your own &#x60;bulkId&#x60;, unique ID will be generated by our system and returned in the API response. (Optional Field) (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent to a recipient. (Optional Field) (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets replyTo.
         *
         * @param replyTo Email address to which recipients of the email can reply. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest replyTo(String replyTo) {
            this.replyTo = replyTo;
            return this;
        }

        /**
         * Sets defaultPlaceholders.
         *
         * @param defaultPlaceholders General placeholder, given in a form of json example: &#x60;defaultPlaceholders&#x3D;{\\\&quot;ph1\\\&quot;: \\\&quot;Success\\\&quot;}&#x60;, which will replace given key &#x60;{{ph1}}&#x60; with given value &#x60;Success&#x60; anywhere in the email (subject, text, html...). In case of more destinations in &#x60;To&#x60; field, this placeholder will resolve the same value for key &#x60;ph1&#x60;. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest defaultPlaceholders(String defaultPlaceholders) {
            this.defaultPlaceholders = defaultPlaceholders;
            return this;
        }

        /**
         * Sets preserveRecipients.
         *
         * @param preserveRecipients If set to &#x60;true&#x60;, the &#x60;to&#x60; recipients will see the list of all other recipients to get the email and the response will return only one &#x60;messageId&#x60;. Otherwise, each recipient will see just their own email and the response will return a unique &#x60;messageId&#x60; for each email recipient. (optional, default to false)
         * @return SendEmailRequest
         */
        public SendEmailRequest preserveRecipients(Boolean preserveRecipients) {
            this.preserveRecipients = preserveRecipients;
            return this;
        }

        /**
         * Sets sendAt.
         *
         * @param sendAt To schedule message at a given time. Time provided should be in UTC in the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; and cannot exceed 30 days in the future.  (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest sendAt(OffsetDateTime sendAt) {
            this.sendAt = sendAt;
            return this;
        }

        /**
         * Sets landingPagePlaceholders.
         *
         * @param landingPagePlaceholders Personalize opt out landing page by inserting placeholders. Insert placeholder or tag while designing landing page. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest landingPagePlaceholders(String landingPagePlaceholders) {
            this.landingPagePlaceholders = landingPagePlaceholders;
            return this;
        }

        /**
         * Sets landingPageId.
         *
         * @param landingPageId The ID of an opt out landing page to be used and displayed once an end user clicks the unsubscribe link. If not present, default opt out landing page will be displayed. Create a landing page in your Infobip account and use its ID, e.g., &#x60;#1_23456&#x60;. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest landingPageId(String landingPageId) {
            this.landingPageId = landingPageId;
            return this;
        }

        /**
         * Sets templateLanguageVersion.
         *
         * @param templateLanguageVersion Specifies template language version that will be used in the current message template. Use version 1 for previous version of template language. Use version 2 for features of the new template language. If not present version 1 will be used as default version.  (optional, default to 1)
         * @return SendEmailRequest
         */
        public SendEmailRequest templateLanguageVersion(String templateLanguageVersion) {
            this.templateLanguageVersion = templateLanguageVersion;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Required for application use in a send request for outbound traffic. Returned in notification events. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Required for entity use in a send request for outbound traffic. Returned in notification events. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Executes the sendEmail request.
         *
         * @return EmailSendResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailSendResponse execute() throws ApiException {
            RequestDefinition sendEmailDefinition = sendEmailDefinition(
                    to,
                    from,
                    cc,
                    bcc,
                    subject,
                    text,
                    html,
                    ampHtml,
                    templateId,
                    attachment,
                    inlineImage,
                    intermediateReport,
                    notifyUrl,
                    notifyContentType,
                    callbackData,
                    track,
                    trackClicks,
                    trackOpens,
                    trackingUrl,
                    bulkId,
                    messageId,
                    replyTo,
                    defaultPlaceholders,
                    preserveRecipients,
                    sendAt,
                    landingPagePlaceholders,
                    landingPageId,
                    templateLanguageVersion,
                    applicationId,
                    entityId);
            return apiClient.execute(sendEmailDefinition, new TypeReference<EmailSendResponse>() {}.getType());
        }

        /**
         * Executes the sendEmail request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailSendResponse> callback) {
            RequestDefinition sendEmailDefinition = sendEmailDefinition(
                    to,
                    from,
                    cc,
                    bcc,
                    subject,
                    text,
                    html,
                    ampHtml,
                    templateId,
                    attachment,
                    inlineImage,
                    intermediateReport,
                    notifyUrl,
                    notifyContentType,
                    callbackData,
                    track,
                    trackClicks,
                    trackOpens,
                    trackingUrl,
                    bulkId,
                    messageId,
                    replyTo,
                    defaultPlaceholders,
                    preserveRecipients,
                    sendAt,
                    landingPagePlaceholders,
                    landingPageId,
                    templateLanguageVersion,
                    applicationId,
                    entityId);
            return apiClient.executeAsync(
                    sendEmailDefinition, new TypeReference<EmailSendResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send fully featured email.
     * <p>
     * Send an email or multiple emails to a recipient or multiple recipients with CC/BCC enabled.
     *
     * @param to Email address of the recipient in a form of &#x60;To&#x3D;\\\&quot;john.smith@somecompany.com\\\&quot;&#x60;. As optional feature on this field, a specific placeholder can be defined whose value will apply only for this destination. Given &#x60;To&#x60; value should look like: &#x60;To&#x3D; {\\\&quot;to\\\&quot;: \\\&quot;john.smith@somecompany.com\\\&quot;,\\\&quot;placeholders\\\&quot;: {\\\&quot;name\\\&quot;: \\\&quot;John\\\&quot;}}&#x60; &#x60;To&#x3D; {\\\&quot;to\\\&quot;: \\\&quot;alice.grey@somecompany.com\\\&quot;,\\\&quot;placeholders\\\&quot;: {\\\&quot;name\\\&quot;: \\\&quot;Alice\\\&quot;}}&#x60;.  Note: Maximum number of recipients per request is 1000 overall including to, cc and bcc field. (required)
     * @return SendEmailRequest
     */
    public SendEmailRequest sendEmail(List<String> to) {
        return new SendEmailRequest(to);
    }

    private RequestDefinition updateReturnPathDefinition(
            String domainName, EmailReturnPathAddressRequest emailReturnPathAddressRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/email/1/domains/{domainName}/return-path")
                .body(emailReturnPathAddressRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (domainName != null) {
            builder.addPathParameter(new Parameter("domainName", domainName));
        }
        return builder.build();
    }

    /**
     * updateReturnPath request builder class.
     */
    public class UpdateReturnPathRequest {
        private final String domainName;
        private final EmailReturnPathAddressRequest emailReturnPathAddressRequest;

        private UpdateReturnPathRequest(
                String domainName, EmailReturnPathAddressRequest emailReturnPathAddressRequest) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
            this.emailReturnPathAddressRequest = Objects.requireNonNull(
                    emailReturnPathAddressRequest,
                    "The required parameter 'emailReturnPathAddressRequest' is missing.");
        }

        /**
         * Executes the updateReturnPath request.
         *
         * @return EmailDomainResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainResponse execute() throws ApiException {
            RequestDefinition updateReturnPathDefinition =
                    updateReturnPathDefinition(domainName, emailReturnPathAddressRequest);
            return apiClient.execute(updateReturnPathDefinition, new TypeReference<EmailDomainResponse>() {}.getType());
        }

        /**
         * Executes the updateReturnPath request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainResponse> callback) {
            RequestDefinition updateReturnPathDefinition =
                    updateReturnPathDefinition(domainName, emailReturnPathAddressRequest);
            return apiClient.executeAsync(
                    updateReturnPathDefinition, new TypeReference<EmailDomainResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update return path.
     * <p>
     * API to update return path for the provided domain. The mailbox used for return path should be based on the same domain.
     *
     * @param domainName Domain for which the return path address needs to be updated. (required)
     * @param emailReturnPathAddressRequest  (required)
     * @return UpdateReturnPathRequest
     */
    public UpdateReturnPathRequest updateReturnPath(
            String domainName, EmailReturnPathAddressRequest emailReturnPathAddressRequest) {
        return new UpdateReturnPathRequest(domainName, emailReturnPathAddressRequest);
    }

    private RequestDefinition updateScheduledEmailStatusesDefinition(
            String bulkId, EmailBulkUpdateStatusRequest emailBulkUpdateStatusRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/email/1/bulks/status")
                .body(emailBulkUpdateStatusRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * updateScheduledEmailStatuses request builder class.
     */
    public class UpdateScheduledEmailStatusesRequest {
        private final String bulkId;
        private final EmailBulkUpdateStatusRequest emailBulkUpdateStatusRequest;

        private UpdateScheduledEmailStatusesRequest(
                String bulkId, EmailBulkUpdateStatusRequest emailBulkUpdateStatusRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.emailBulkUpdateStatusRequest = Objects.requireNonNull(
                    emailBulkUpdateStatusRequest, "The required parameter 'emailBulkUpdateStatusRequest' is missing.");
        }

        /**
         * Executes the updateScheduledEmailStatuses request.
         *
         * @return EmailBulkUpdateStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailBulkUpdateStatusResponse execute() throws ApiException {
            RequestDefinition updateScheduledEmailStatusesDefinition =
                    updateScheduledEmailStatusesDefinition(bulkId, emailBulkUpdateStatusRequest);
            return apiClient.execute(
                    updateScheduledEmailStatusesDefinition,
                    new TypeReference<EmailBulkUpdateStatusResponse>() {}.getType());
        }

        /**
         * Executes the updateScheduledEmailStatuses request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailBulkUpdateStatusResponse> callback) {
            RequestDefinition updateScheduledEmailStatusesDefinition =
                    updateScheduledEmailStatusesDefinition(bulkId, emailBulkUpdateStatusRequest);
            return apiClient.executeAsync(
                    updateScheduledEmailStatusesDefinition,
                    new TypeReference<EmailBulkUpdateStatusResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update scheduled Email messages status.
     * <p>
     * Change status or completely cancel sending of scheduled messages.
     *
     * @param bulkId The ID uniquely identifies the sent email request. (required)
     * @param emailBulkUpdateStatusRequest  (required)
     * @return UpdateScheduledEmailStatusesRequest
     */
    public UpdateScheduledEmailStatusesRequest updateScheduledEmailStatuses(
            String bulkId, EmailBulkUpdateStatusRequest emailBulkUpdateStatusRequest) {
        return new UpdateScheduledEmailStatusesRequest(bulkId, emailBulkUpdateStatusRequest);
    }

    private RequestDefinition updateTrackingEventsDefinition(
            String domainName, EmailTrackingEventRequest emailTrackingEventRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/email/1/domains/{domainName}/tracking")
                .body(emailTrackingEventRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (domainName != null) {
            builder.addPathParameter(new Parameter("domainName", domainName));
        }
        return builder.build();
    }

    /**
     * updateTrackingEvents request builder class.
     */
    public class UpdateTrackingEventsRequest {
        private final String domainName;
        private final EmailTrackingEventRequest emailTrackingEventRequest;

        private UpdateTrackingEventsRequest(String domainName, EmailTrackingEventRequest emailTrackingEventRequest) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
            this.emailTrackingEventRequest = Objects.requireNonNull(
                    emailTrackingEventRequest, "The required parameter 'emailTrackingEventRequest' is missing.");
        }

        /**
         * Executes the updateTrackingEvents request.
         *
         * @return EmailDomainResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainResponse execute() throws ApiException {
            RequestDefinition updateTrackingEventsDefinition =
                    updateTrackingEventsDefinition(domainName, emailTrackingEventRequest);
            return apiClient.execute(
                    updateTrackingEventsDefinition, new TypeReference<EmailDomainResponse>() {}.getType());
        }

        /**
         * Executes the updateTrackingEvents request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainResponse> callback) {
            RequestDefinition updateTrackingEventsDefinition =
                    updateTrackingEventsDefinition(domainName, emailTrackingEventRequest);
            return apiClient.executeAsync(
                    updateTrackingEventsDefinition, new TypeReference<EmailDomainResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update tracking events.
     * <p>
     * API to update tracking events for the provided domain. Tracking events can be updated only for CLICKS, OPENS and UNSUBSCRIBES.
     *
     * @param domainName Domain for which the tracking events need to be updated. (required)
     * @param emailTrackingEventRequest  (required)
     * @return UpdateTrackingEventsRequest
     */
    public UpdateTrackingEventsRequest updateTrackingEvents(
            String domainName, EmailTrackingEventRequest emailTrackingEventRequest) {
        return new UpdateTrackingEventsRequest(domainName, emailTrackingEventRequest);
    }

    private RequestDefinition validateEmailAddressesDefinition(EmailValidationRequest emailValidationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/2/validation")
                .body(emailValidationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * validateEmailAddresses request builder class.
     */
    public class ValidateEmailAddressesRequest {
        private final EmailValidationRequest emailValidationRequest;

        private ValidateEmailAddressesRequest(EmailValidationRequest emailValidationRequest) {
            this.emailValidationRequest = Objects.requireNonNull(
                    emailValidationRequest, "The required parameter 'emailValidationRequest' is missing.");
        }

        /**
         * Executes the validateEmailAddresses request.
         *
         * @return EmailValidationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailValidationResponse execute() throws ApiException {
            RequestDefinition validateEmailAddressesDefinition =
                    validateEmailAddressesDefinition(emailValidationRequest);
            return apiClient.execute(
                    validateEmailAddressesDefinition, new TypeReference<EmailValidationResponse>() {}.getType());
        }

        /**
         * Executes the validateEmailAddresses request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailValidationResponse> callback) {
            RequestDefinition validateEmailAddressesDefinition =
                    validateEmailAddressesDefinition(emailValidationRequest);
            return apiClient.executeAsync(
                    validateEmailAddressesDefinition,
                    new TypeReference<EmailValidationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Validate email addresses.
     * <p>
     * Run validation to identify poor quality emails to clean up your recipient list.
     *
     * @param emailValidationRequest  (required)
     * @return ValidateEmailAddressesRequest
     */
    public ValidateEmailAddressesRequest validateEmailAddresses(EmailValidationRequest emailValidationRequest) {
        return new ValidateEmailAddressesRequest(emailValidationRequest);
    }

    private RequestDefinition verifyDomainDefinition(String domainName) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/1/domains/{domainName}/verify")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainName != null) {
            builder.addPathParameter(new Parameter("domainName", domainName));
        }
        return builder.build();
    }

    /**
     * verifyDomain request builder class.
     */
    public class VerifyDomainRequest {
        private final String domainName;

        private VerifyDomainRequest(String domainName) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
        }

        /**
         * Executes the verifyDomain request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition verifyDomainDefinition = verifyDomainDefinition(domainName);
            apiClient.execute(verifyDomainDefinition);
        }

        /**
         * Executes the verifyDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition verifyDomainDefinition = verifyDomainDefinition(domainName);
            return apiClient.executeAsync(verifyDomainDefinition, callback);
        }
    }

    /**
     * Verify Domain.
     * <p>
     * API request to verify records(TXT, MX, DKIM) associated with the provided domain.
     *
     * @param domainName Name of the domain that has to be verified. (required)
     * @return VerifyDomainRequest
     */
    public VerifyDomainRequest verifyDomain(String domainName) {
        return new VerifyDomainRequest(domainName);
    }
}
