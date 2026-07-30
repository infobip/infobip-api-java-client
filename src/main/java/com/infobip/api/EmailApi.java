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
import com.google.common.annotations.Beta;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.Parameter;
import com.infobip.RequestDefinition;
import com.infobip.model.EmailAddDomainRequest;
import com.infobip.model.EmailAddSuppressionRequest;
import com.infobip.model.EmailAllDomainsResponse;
import com.infobip.model.EmailBulkRescheduleRequest;
import com.infobip.model.EmailBulkRescheduleResponse;
import com.infobip.model.EmailBulkScheduleResponse;
import com.infobip.model.EmailBulkStatusResponse;
import com.infobip.model.EmailBulkUpdateStatusRequest;
import com.infobip.model.EmailBulkUpdateStatusResponse;
import com.infobip.model.EmailDeleteSuppressionRequest;
import com.infobip.model.EmailDomainInfoPageResponse;
import com.infobip.model.EmailDomainIpPoolAssignApiRequest;
import com.infobip.model.EmailDomainIpPoolUpdateApiRequest;
import com.infobip.model.EmailDomainResponse;
import com.infobip.model.EmailIpDetailResponse;
import com.infobip.model.EmailIpDomainResponse;
import com.infobip.model.EmailIpPoolAssignIpApiRequest;
import com.infobip.model.EmailIpPoolCreateApiRequest;
import com.infobip.model.EmailIpPoolDetailResponse;
import com.infobip.model.EmailIpPoolResponse;
import com.infobip.model.EmailLogsResponse;
import com.infobip.model.EmailReportsResult;
import com.infobip.model.EmailRequest;
import com.infobip.model.EmailResponse;
import com.infobip.model.EmailSendMimeRequestSchema;
import com.infobip.model.EmailSendResponse;
import com.infobip.model.EmailSuppressionInfoPageResponse;
import com.infobip.model.EmailSuppressionType;
import com.infobip.model.EmailTrackingEventRequest;
import com.infobip.model.EmailValidationRequest;
import com.infobip.model.EmailValidationResponse;
import com.infobip.model.MessageGeneralStatus;
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
     * Add domain.
     * <p>
     * This method allows you to add new domains with a limit to create a maximum of 1000 domains in a day.
     *
     * @param emailAddDomainRequest  (required)
     * @return AddDomainRequest
     */
    public AddDomainRequest addDomain(EmailAddDomainRequest emailAddDomainRequest) {
        return new AddDomainRequest(emailAddDomainRequest);
    }

    private RequestDefinition addSuppressionsDefinition(EmailAddSuppressionRequest emailAddSuppressionRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/1/suppressions")
                .body(emailAddSuppressionRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * addSuppressions request builder class.
     */
    public class AddSuppressionsRequest {
        private final EmailAddSuppressionRequest emailAddSuppressionRequest;

        private AddSuppressionsRequest(EmailAddSuppressionRequest emailAddSuppressionRequest) {
            this.emailAddSuppressionRequest = Objects.requireNonNull(
                    emailAddSuppressionRequest, "The required parameter 'emailAddSuppressionRequest' is missing.");
        }

        /**
         * Executes the addSuppressions request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition addSuppressionsDefinition = addSuppressionsDefinition(emailAddSuppressionRequest);
            apiClient.execute(addSuppressionsDefinition);
        }

        /**
         * Executes the addSuppressions request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition addSuppressionsDefinition = addSuppressionsDefinition(emailAddSuppressionRequest);
            return apiClient.executeAsync(addSuppressionsDefinition, callback);
        }
    }

    /**
     * Add suppressions.
     * <p>
     * This method allows you to add email addresses to the suppression list. It accepts suppression requests, saves them asynchronously, and automatically ignores any duplicate entries.
     *
     * @param emailAddSuppressionRequest  (required)
     * @return AddSuppressionsRequest
     */
    public AddSuppressionsRequest addSuppressions(EmailAddSuppressionRequest emailAddSuppressionRequest) {
        return new AddSuppressionsRequest(emailAddSuppressionRequest);
    }

    private RequestDefinition assignIpToPoolDefinition(
            String poolId, EmailIpPoolAssignIpApiRequest emailIpPoolAssignIpApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/email/1/ip-management/pools/{poolId}/ips")
                .body(emailIpPoolAssignIpApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        return builder.build();
    }

    /**
     * assignIpToPool request builder class.
     */
    public class AssignIpToPoolRequest {
        private final String poolId;
        private final EmailIpPoolAssignIpApiRequest emailIpPoolAssignIpApiRequest;

        private AssignIpToPoolRequest(String poolId, EmailIpPoolAssignIpApiRequest emailIpPoolAssignIpApiRequest) {
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
            this.emailIpPoolAssignIpApiRequest = Objects.requireNonNull(
                    emailIpPoolAssignIpApiRequest,
                    "The required parameter 'emailIpPoolAssignIpApiRequest' is missing.");
        }

        /**
         * Executes the assignIpToPool request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition assignIpToPoolDefinition =
                    assignIpToPoolDefinition(poolId, emailIpPoolAssignIpApiRequest);
            apiClient.execute(assignIpToPoolDefinition);
        }

        /**
         * Executes the assignIpToPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition assignIpToPoolDefinition =
                    assignIpToPoolDefinition(poolId, emailIpPoolAssignIpApiRequest);
            return apiClient.executeAsync(assignIpToPoolDefinition, callback);
        }
    }

    /**
     * Assign IP to pool.
     * <p>
     * Assign provided dedicated IP to the provided IP pool.
     *
     * @param poolId IP pool identifier. (required)
     * @param emailIpPoolAssignIpApiRequest  (required)
     * @return AssignIpToPoolRequest
     */
    public AssignIpToPoolRequest assignIpToPool(
            String poolId, EmailIpPoolAssignIpApiRequest emailIpPoolAssignIpApiRequest) {
        return new AssignIpToPoolRequest(poolId, emailIpPoolAssignIpApiRequest);
    }

    private RequestDefinition assignPoolToDomainDefinition(
            Long domainId, EmailDomainIpPoolAssignApiRequest emailDomainIpPoolAssignApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/email/1/ip-management/domains/{domainId}/pools")
                .body(emailDomainIpPoolAssignApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (domainId != null) {
            builder.addPathParameter(new Parameter("domainId", domainId));
        }
        return builder.build();
    }

    /**
     * assignPoolToDomain request builder class.
     */
    public class AssignPoolToDomainRequest {
        private final Long domainId;
        private final EmailDomainIpPoolAssignApiRequest emailDomainIpPoolAssignApiRequest;

        private AssignPoolToDomainRequest(
                Long domainId, EmailDomainIpPoolAssignApiRequest emailDomainIpPoolAssignApiRequest) {
            this.domainId = Objects.requireNonNull(domainId, "The required parameter 'domainId' is missing.");
            this.emailDomainIpPoolAssignApiRequest = Objects.requireNonNull(
                    emailDomainIpPoolAssignApiRequest,
                    "The required parameter 'emailDomainIpPoolAssignApiRequest' is missing.");
        }

        /**
         * Executes the assignPoolToDomain request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition assignPoolToDomainDefinition =
                    assignPoolToDomainDefinition(domainId, emailDomainIpPoolAssignApiRequest);
            apiClient.execute(assignPoolToDomainDefinition);
        }

        /**
         * Executes the assignPoolToDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition assignPoolToDomainDefinition =
                    assignPoolToDomainDefinition(domainId, emailDomainIpPoolAssignApiRequest);
            return apiClient.executeAsync(assignPoolToDomainDefinition, callback);
        }
    }

    /**
     * Assign IP pool to domain.
     * <p>
     * Assign an IP pool to the provided domain.
     *
     * @param domainId Domain identifier. (required)
     * @param emailDomainIpPoolAssignApiRequest  (required)
     * @return AssignPoolToDomainRequest
     */
    public AssignPoolToDomainRequest assignPoolToDomain(
            Long domainId, EmailDomainIpPoolAssignApiRequest emailDomainIpPoolAssignApiRequest) {
        return new AssignPoolToDomainRequest(domainId, emailDomainIpPoolAssignApiRequest);
    }

    private RequestDefinition createIpPoolDefinition(EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/1/ip-management/pools")
                .body(emailIpPoolCreateApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createIpPool request builder class.
     */
    public class CreateIpPoolRequest {
        private final EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest;

        private CreateIpPoolRequest(EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest) {
            this.emailIpPoolCreateApiRequest = Objects.requireNonNull(
                    emailIpPoolCreateApiRequest, "The required parameter 'emailIpPoolCreateApiRequest' is missing.");
        }

        /**
         * Executes the createIpPool request.
         *
         * @return EmailIpPoolResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailIpPoolResponse execute() throws ApiException {
            RequestDefinition createIpPoolDefinition = createIpPoolDefinition(emailIpPoolCreateApiRequest);
            return apiClient.execute(createIpPoolDefinition, new TypeReference<EmailIpPoolResponse>() {}.getType());
        }

        /**
         * Executes the createIpPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailIpPoolResponse> callback) {
            RequestDefinition createIpPoolDefinition = createIpPoolDefinition(emailIpPoolCreateApiRequest);
            return apiClient.executeAsync(
                    createIpPoolDefinition, new TypeReference<EmailIpPoolResponse>() {}.getType(), callback);
        }
    }

    /**
     * Create IP pool.
     * <p>
     * Create a new IP pool.
     *
     * @param emailIpPoolCreateApiRequest  (required)
     * @return CreateIpPoolRequest
     */
    public CreateIpPoolRequest createIpPool(EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest) {
        return new CreateIpPoolRequest(emailIpPoolCreateApiRequest);
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
     * Delete domain.
     * <p>
     * This method allows you to delete an existing domain.
     *
     * @param domainName Domain name which needs to be deleted. (required)
     * @return DeleteDomainRequest
     */
    public DeleteDomainRequest deleteDomain(String domainName) {
        return new DeleteDomainRequest(domainName);
    }

    private RequestDefinition deleteIpPoolDefinition(String poolId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/email/1/ip-management/pools/{poolId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        return builder.build();
    }

    /**
     * deleteIpPool request builder class.
     */
    public class DeleteIpPoolRequest {
        private final String poolId;

        private DeleteIpPoolRequest(String poolId) {
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
        }

        /**
         * Executes the deleteIpPool request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteIpPoolDefinition = deleteIpPoolDefinition(poolId);
            apiClient.execute(deleteIpPoolDefinition);
        }

        /**
         * Executes the deleteIpPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteIpPoolDefinition = deleteIpPoolDefinition(poolId);
            return apiClient.executeAsync(deleteIpPoolDefinition, callback);
        }
    }

    /**
     * Delete IP pool.
     * <p>
     * Delete provided IP pool. Deleting an IP pool also deletes any assigned IPs and any assignments to domains.
     *
     * @param poolId IP pool identifier. (required)
     * @return DeleteIpPoolRequest
     */
    public DeleteIpPoolRequest deleteIpPool(String poolId) {
        return new DeleteIpPoolRequest(poolId);
    }

    private RequestDefinition deleteSuppressionsDefinition(
            EmailDeleteSuppressionRequest emailDeleteSuppressionRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/email/1/suppressions")
                .body(emailDeleteSuppressionRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * deleteSuppressions request builder class.
     */
    public class DeleteSuppressionsRequest {
        private final EmailDeleteSuppressionRequest emailDeleteSuppressionRequest;

        private DeleteSuppressionsRequest(EmailDeleteSuppressionRequest emailDeleteSuppressionRequest) {
            this.emailDeleteSuppressionRequest = Objects.requireNonNull(
                    emailDeleteSuppressionRequest,
                    "The required parameter 'emailDeleteSuppressionRequest' is missing.");
        }

        /**
         * Executes the deleteSuppressions request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteSuppressionsDefinition =
                    deleteSuppressionsDefinition(emailDeleteSuppressionRequest);
            apiClient.execute(deleteSuppressionsDefinition);
        }

        /**
         * Executes the deleteSuppressions request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteSuppressionsDefinition =
                    deleteSuppressionsDefinition(emailDeleteSuppressionRequest);
            return apiClient.executeAsync(deleteSuppressionsDefinition, callback);
        }
    }

    /**
     * Delete suppressions.
     * <p>
     * This method allows you to delete email addresses from the suppression list. It accepts delete suppression requests and asynchronously deletes them.
     *
     * @param emailDeleteSuppressionRequest  (required)
     * @return DeleteSuppressionsRequest
     */
    public DeleteSuppressionsRequest deleteSuppressions(EmailDeleteSuppressionRequest emailDeleteSuppressionRequest) {
        return new DeleteSuppressionsRequest(emailDeleteSuppressionRequest);
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
     * Get domains.
     * <p>
     * This API is to get all domain associated with the account. It also provides details of the retrieved domain like the DNS records, Tracking details, Active/Blocked status,etc.
     *
     * @return GetAllDomainsRequest
     */
    public GetAllDomainsRequest getAllDomains() {
        return new GetAllDomainsRequest();
    }

    private RequestDefinition getAllIpsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/ip-management/ips")
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
         * @return List&lt;EmailIpDetailResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<EmailIpDetailResponse> execute() throws ApiException {
            RequestDefinition getAllIpsDefinition = getAllIpsDefinition();
            return apiClient.execute(
                    getAllIpsDefinition, new TypeReference<List<EmailIpDetailResponse>>() {}.getType());
        }

        /**
         * Executes the getAllIps request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<EmailIpDetailResponse>> callback) {
            RequestDefinition getAllIpsDefinition = getAllIpsDefinition();
            return apiClient.executeAsync(
                    getAllIpsDefinition, new TypeReference<List<EmailIpDetailResponse>>() {}.getType(), callback);
        }
    }

    /**
     * Get IPs.
     * <p>
     * Returns all the dedicated IP addresses owned by this account.
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

    private RequestDefinition getDomainsDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/suppressions/domains")
                .requiresAuthentication(true)
                .accept("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getDomains request builder class.
     */
    public class GetDomainsRequest {
        private Integer page;
        private Integer size;

        private GetDomainsRequest() {}

        /**
         * Sets page.
         *
         * @param page Requested page number. (optional, default to 0)
         * @return GetDomainsRequest
         */
        public GetDomainsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Requested page size. (optional, default to 100)
         * @return GetDomainsRequest
         */
        public GetDomainsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getDomains request.
         *
         * @return EmailDomainInfoPageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailDomainInfoPageResponse execute() throws ApiException {
            RequestDefinition getDomainsDefinition = getDomainsDefinition(page, size);
            return apiClient.execute(
                    getDomainsDefinition, new TypeReference<EmailDomainInfoPageResponse>() {}.getType());
        }

        /**
         * Executes the getDomains request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailDomainInfoPageResponse> callback) {
            RequestDefinition getDomainsDefinition = getDomainsDefinition(page, size);
            return apiClient.executeAsync(
                    getDomainsDefinition, new TypeReference<EmailDomainInfoPageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get suppression domains.
     * <p>
     * This method allows you to get domains that can be managed for suppressions and are either owned or have granted permissions.
     *
     * @return GetDomainsRequest
     */
    public GetDomainsRequest getDomains() {
        return new GetDomainsRequest();
    }

    private RequestDefinition getEmailDeliveryReportsDefinition(
            String bulkId,
            String messageId,
            Integer limit,
            String entityId,
            String applicationId,
            String campaignReferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/4/reports")
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
     * getEmailDeliveryReports request builder class.
     */
    public class GetEmailDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;
        private String entityId;
        private String applicationId;
        private String campaignReferenceId;

        private GetEmailDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID that uniquely identifies the request. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of delivery reports to be returned. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access reports for the last 48h. (optional, default to 50)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Executes the getEmailDeliveryReports request.
         *
         * @return EmailReportsResult The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailReportsResult execute() throws ApiException {
            RequestDefinition getEmailDeliveryReportsDefinition = getEmailDeliveryReportsDefinition(
                    bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
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
            RequestDefinition getEmailDeliveryReportsDefinition = getEmailDeliveryReportsDefinition(
                    bulkId, messageId, limit, entityId, applicationId, campaignReferenceId);
            return apiClient.executeAsync(
                    getEmailDeliveryReportsDefinition, new TypeReference<EmailReportsResult>() {}.getType(), callback);
        }
    }

    /**
     * Get email delivery reports.
     * <p>
     * Get one-time delivery reports for all sent emails.
     *
     * @return GetEmailDeliveryReportsRequest
     * @see <a href="https://www.infobip.com/docs/email">Learn more about EMAIL channel and use cases</a>
     */
    public GetEmailDeliveryReportsRequest getEmailDeliveryReports() {
        return new GetEmailDeliveryReportsRequest();
    }

    private RequestDefinition getEmailLogsDefinition(
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
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/4/logs")
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
     * getEmailLogs request builder class.
     */
    public class GetEmailLogsRequest {
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

        private GetEmailLogsRequest() {}

        /**
         * Sets sender.
         *
         * @param sender The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest sender(String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets destination.
         *
         * @param destination Message destination address. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId Unique message ID for which a log is requested. May contain multiple comma-separated values. Maximum length 2048 characters. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus  (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest generalStatus(MessageGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include messages sent after this date. Use it alongside sentUntil to specify a time range for the logs, but only up to the maximum limit of 1000 logs per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include messages sent before this date. Use it alongside sentSince to specify a time range for the logs, but only up to the maximum limit of 1000 logs per call. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of messages to include in logs. If not set, the latest 50 records are returned. Maximum limit value is 1000 and you can only access logs for the last 48h. (optional, default to 50)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets entityId.
         *
         * @param entityId Entity id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application id used to send the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management). (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId ID of a campaign that was sent in the message. May contain multiple comma-separated values. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest campaignReferenceId(List<String> campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
            return this;
        }

        /**
         * Sets useCursor.
         *
         * @param useCursor Flag used to enable cursor-based pagination. When set to true, the system will use the cursor to fetch the next set of logs. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest useCursor(Boolean useCursor) {
            this.useCursor = useCursor;
            return this;
        }

        /**
         * Sets cursor.
         *
         * @param cursor Value which represents the current position in the data set. For the first request, this field shouldn&#39;t be defined. In subsequent requests, use the &#x60;nextCursor&#x60; value returned from the previous response to continue fetching data. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest cursor(String cursor) {
            this.cursor = cursor;
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
                    getEmailLogsDefinition, new TypeReference<EmailLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get email message logs.
     * <p>
     * Use this method for displaying logs for example in the user interface. Available are the logs for the last 48 hours.
     *
     * @return GetEmailLogsRequest
     */
    public GetEmailLogsRequest getEmailLogs() {
        return new GetEmailLogsRequest();
    }

    private RequestDefinition getIpDetailsDefinition(String ipId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/ip-management/ips/{ipId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (ipId != null) {
            builder.addPathParameter(new Parameter("ipId", ipId));
        }
        return builder.build();
    }

    /**
     * getIpDetails request builder class.
     */
    public class GetIpDetailsRequest {
        private final String ipId;

        private GetIpDetailsRequest(String ipId) {
            this.ipId = Objects.requireNonNull(ipId, "The required parameter 'ipId' is missing.");
        }

        /**
         * Executes the getIpDetails request.
         *
         * @return EmailIpDetailResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailIpDetailResponse execute() throws ApiException {
            RequestDefinition getIpDetailsDefinition = getIpDetailsDefinition(ipId);
            return apiClient.execute(getIpDetailsDefinition, new TypeReference<EmailIpDetailResponse>() {}.getType());
        }

        /**
         * Executes the getIpDetails request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailIpDetailResponse> callback) {
            RequestDefinition getIpDetailsDefinition = getIpDetailsDefinition(ipId);
            return apiClient.executeAsync(
                    getIpDetailsDefinition, new TypeReference<EmailIpDetailResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get IP.
     * <p>
     * Get detailed information about provided dedicated IP.
     *
     * @param ipId Dedicated IP identifier. (required)
     * @return GetIpDetailsRequest
     */
    public GetIpDetailsRequest getIpDetails(String ipId) {
        return new GetIpDetailsRequest(ipId);
    }

    private RequestDefinition getIpDomainDefinition(Long domainId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/email/1/ip-management/domains/{domainId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainId != null) {
            builder.addPathParameter(new Parameter("domainId", domainId));
        }
        return builder.build();
    }

    /**
     * getIpDomain request builder class.
     */
    public class GetIpDomainRequest {
        private final Long domainId;

        private GetIpDomainRequest(Long domainId) {
            this.domainId = Objects.requireNonNull(domainId, "The required parameter 'domainId' is missing.");
        }

        /**
         * Executes the getIpDomain request.
         *
         * @return EmailIpDomainResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailIpDomainResponse execute() throws ApiException {
            RequestDefinition getIpDomainDefinition = getIpDomainDefinition(domainId);
            return apiClient.execute(getIpDomainDefinition, new TypeReference<EmailIpDomainResponse>() {}.getType());
        }

        /**
         * Executes the getIpDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailIpDomainResponse> callback) {
            RequestDefinition getIpDomainDefinition = getIpDomainDefinition(domainId);
            return apiClient.executeAsync(
                    getIpDomainDefinition, new TypeReference<EmailIpDomainResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get domain.
     * <p>
     * Get detailed information for provided domain such as assigned pools and their IPs.
     *
     * @param domainId Domain identifier. (required)
     * @return GetIpDomainRequest
     */
    public GetIpDomainRequest getIpDomain(Long domainId) {
        return new GetIpDomainRequest(domainId);
    }

    private RequestDefinition getIpPoolDefinition(String poolId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/ip-management/pools/{poolId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        return builder.build();
    }

    /**
     * getIpPool request builder class.
     */
    public class GetIpPoolRequest {
        private final String poolId;

        private GetIpPoolRequest(String poolId) {
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
        }

        /**
         * Executes the getIpPool request.
         *
         * @return EmailIpPoolDetailResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailIpPoolDetailResponse execute() throws ApiException {
            RequestDefinition getIpPoolDefinition = getIpPoolDefinition(poolId);
            return apiClient.execute(getIpPoolDefinition, new TypeReference<EmailIpPoolDetailResponse>() {}.getType());
        }

        /**
         * Executes the getIpPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailIpPoolDetailResponse> callback) {
            RequestDefinition getIpPoolDefinition = getIpPoolDefinition(poolId);
            return apiClient.executeAsync(
                    getIpPoolDefinition, new TypeReference<EmailIpPoolDetailResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get IP pool.
     * <p>
     * Get detailed information about a provided IP pool.
     *
     * @param poolId IP pool identifier. (required)
     * @return GetIpPoolRequest
     */
    public GetIpPoolRequest getIpPool(String poolId) {
        return new GetIpPoolRequest(poolId);
    }

    private RequestDefinition getIpPoolsDefinition(String name) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/ip-management/pools")
                .requiresAuthentication(true)
                .accept("application/json");

        if (name != null) {
            builder.addQueryParameter(new Parameter("name", name));
        }
        return builder.build();
    }

    /**
     * getIpPools request builder class.
     */
    public class GetIpPoolsRequest {
        private String name;

        private GetIpPoolsRequest() {}

        /**
         * Sets name.
         *
         * @param name IP pool name. (optional)
         * @return GetIpPoolsRequest
         */
        public GetIpPoolsRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Executes the getIpPools request.
         *
         * @return List&lt;EmailIpPoolDetailResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<EmailIpPoolDetailResponse> execute() throws ApiException {
            RequestDefinition getIpPoolsDefinition = getIpPoolsDefinition(name);
            return apiClient.execute(
                    getIpPoolsDefinition, new TypeReference<List<EmailIpPoolDetailResponse>>() {}.getType());
        }

        /**
         * Executes the getIpPools request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<EmailIpPoolDetailResponse>> callback) {
            RequestDefinition getIpPoolsDefinition = getIpPoolsDefinition(name);
            return apiClient.executeAsync(
                    getIpPoolsDefinition, new TypeReference<List<EmailIpPoolDetailResponse>>() {}.getType(), callback);
        }
    }

    /**
     * Get IP pools.
     * <p>
     * Returns all the pools that are owned (created) by this account.
     *
     * @return GetIpPoolsRequest
     */
    public GetIpPoolsRequest getIpPools() {
        return new GetIpPoolsRequest();
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
     * Get scheduled bulk statuses.
     * <p>
     * See the status of scheduled email messages.
     *
     * @param bulkId The ID that uniquely identifies the sent bulk. (required)
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
     * Get scheduled bulks.
     * <p>
     * See the scheduled time of your Email messages.
     *
     * @param bulkId The ID that uniquely identifies the sent bulk. (required)
     * @return GetScheduledEmailsRequest
     */
    public GetScheduledEmailsRequest getScheduledEmails(String bulkId) {
        return new GetScheduledEmailsRequest(bulkId);
    }

    private RequestDefinition getSuppressionsDefinition(
            String domainName,
            EmailSuppressionType type,
            String emailAddress,
            String recipientDomain,
            OffsetDateTime createdDateFrom,
            OffsetDateTime createdDateTo,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/suppressions")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainName != null) {
            builder.addQueryParameter(new Parameter("domainName", domainName));
        }
        if (type != null) {
            builder.addQueryParameter(new Parameter("type", type));
        }
        if (emailAddress != null) {
            builder.addQueryParameter(new Parameter("emailAddress", emailAddress));
        }
        if (recipientDomain != null) {
            builder.addQueryParameter(new Parameter("recipientDomain", recipientDomain));
        }
        if (createdDateFrom != null) {
            builder.addQueryParameter(new Parameter("createdDateFrom", createdDateFrom));
        }
        if (createdDateTo != null) {
            builder.addQueryParameter(new Parameter("createdDateTo", createdDateTo));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getSuppressions request builder class.
     */
    public class GetSuppressionsRequest {
        private final String domainName;
        private final EmailSuppressionType type;
        private String emailAddress;
        private String recipientDomain;
        private OffsetDateTime createdDateFrom;
        private OffsetDateTime createdDateTo;
        private Integer page;
        private Integer size;

        private GetSuppressionsRequest(String domainName, EmailSuppressionType type) {
            this.domainName = Objects.requireNonNull(domainName, "The required parameter 'domainName' is missing.");
            this.type = Objects.requireNonNull(type, "The required parameter 'type' is missing.");
        }

        /**
         * Sets emailAddress.
         *
         * @param emailAddress Email address that is suppressed. (optional)
         * @return GetSuppressionsRequest
         */
        public GetSuppressionsRequest emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Sets recipientDomain.
         *
         * @param recipientDomain Recipient domain that is suppressed. (optional)
         * @return GetSuppressionsRequest
         */
        public GetSuppressionsRequest recipientDomain(String recipientDomain) {
            this.recipientDomain = recipientDomain;
            return this;
        }

        /**
         * Sets createdDateFrom.
         *
         * @param createdDateFrom Start date for searching suppressions. (optional)
         * @return GetSuppressionsRequest
         */
        public GetSuppressionsRequest createdDateFrom(OffsetDateTime createdDateFrom) {
            this.createdDateFrom = createdDateFrom;
            return this;
        }

        /**
         * Sets createdDateTo.
         *
         * @param createdDateTo End date for searching suppressions. (optional)
         * @return GetSuppressionsRequest
         */
        public GetSuppressionsRequest createdDateTo(OffsetDateTime createdDateTo) {
            this.createdDateTo = createdDateTo;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Requested page number. (optional, default to 0)
         * @return GetSuppressionsRequest
         */
        public GetSuppressionsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Requested page size. (optional, default to 100)
         * @return GetSuppressionsRequest
         */
        public GetSuppressionsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getSuppressions request.
         *
         * @return EmailSuppressionInfoPageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailSuppressionInfoPageResponse execute() throws ApiException {
            RequestDefinition getSuppressionsDefinition = getSuppressionsDefinition(
                    domainName, type, emailAddress, recipientDomain, createdDateFrom, createdDateTo, page, size);
            return apiClient.execute(
                    getSuppressionsDefinition, new TypeReference<EmailSuppressionInfoPageResponse>() {}.getType());
        }

        /**
         * Executes the getSuppressions request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailSuppressionInfoPageResponse> callback) {
            RequestDefinition getSuppressionsDefinition = getSuppressionsDefinition(
                    domainName, type, emailAddress, recipientDomain, createdDateFrom, createdDateTo, page, size);
            return apiClient.executeAsync(
                    getSuppressionsDefinition,
                    new TypeReference<EmailSuppressionInfoPageResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get suppressions.
     * <p>
     * This method retrieves the suppressions for domains that are owned or have permissions granted.
     *
     * @param domainName Name of the requested domain. (required)
     * @param type Type of suppression. (required)
     * @return GetSuppressionsRequest
     */
    public GetSuppressionsRequest getSuppressions(String domainName, EmailSuppressionType type) {
        return new GetSuppressionsRequest(domainName, type);
    }

    private RequestDefinition removeIpFromPoolDefinition(String poolId, String ipId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/email/1/ip-management/pools/{poolId}/ips/{ipId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        if (ipId != null) {
            builder.addPathParameter(new Parameter("ipId", ipId));
        }
        return builder.build();
    }

    /**
     * removeIpFromPool request builder class.
     */
    public class RemoveIpFromPoolRequest {
        private final String poolId;
        private final String ipId;

        private RemoveIpFromPoolRequest(String poolId, String ipId) {
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
            this.ipId = Objects.requireNonNull(ipId, "The required parameter 'ipId' is missing.");
        }

        /**
         * Executes the removeIpFromPool request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition removeIpFromPoolDefinition = removeIpFromPoolDefinition(poolId, ipId);
            apiClient.execute(removeIpFromPoolDefinition);
        }

        /**
         * Executes the removeIpFromPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition removeIpFromPoolDefinition = removeIpFromPoolDefinition(poolId, ipId);
            return apiClient.executeAsync(removeIpFromPoolDefinition, callback);
        }
    }

    /**
     * Unassign IP from pool.
     * <p>
     * Unassign provided IP from the specific pool.
     *
     * @param poolId IP pool identifier. (required)
     * @param ipId Dedicated IP identifier. (required)
     * @return RemoveIpFromPoolRequest
     */
    public RemoveIpFromPoolRequest removeIpFromPool(String poolId, String ipId) {
        return new RemoveIpFromPoolRequest(poolId, ipId);
    }

    private RequestDefinition removeIpPoolFromDomainDefinition(Long domainId, String poolId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/email/1/ip-management/domains/{domainId}/pools/{poolId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (domainId != null) {
            builder.addPathParameter(new Parameter("domainId", domainId));
        }
        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        return builder.build();
    }

    /**
     * removeIpPoolFromDomain request builder class.
     */
    public class RemoveIpPoolFromDomainRequest {
        private final Long domainId;
        private final String poolId;

        private RemoveIpPoolFromDomainRequest(Long domainId, String poolId) {
            this.domainId = Objects.requireNonNull(domainId, "The required parameter 'domainId' is missing.");
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
        }

        /**
         * Executes the removeIpPoolFromDomain request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition removeIpPoolFromDomainDefinition = removeIpPoolFromDomainDefinition(domainId, poolId);
            apiClient.execute(removeIpPoolFromDomainDefinition);
        }

        /**
         * Executes the removeIpPoolFromDomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition removeIpPoolFromDomainDefinition = removeIpPoolFromDomainDefinition(domainId, poolId);
            return apiClient.executeAsync(removeIpPoolFromDomainDefinition, callback);
        }
    }

    /**
     * Unassign IP pool from domain.
     * <p>
     * Unassign a specified pool from the provided domain.
     *
     * @param domainId Domain identifier. (required)
     * @param poolId IP pool identifier. (required)
     * @return RemoveIpPoolFromDomainRequest
     */
    public RemoveIpPoolFromDomainRequest removeIpPoolFromDomain(Long domainId, String poolId) {
        return new RemoveIpPoolFromDomainRequest(domainId, poolId);
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
     * Reschedule messages.
     * <p>
     * Change the date and time for sending scheduled messages.
     *
     * @param bulkId The ID that uniquely identifies the sent bulk. (required)
     * @param emailBulkRescheduleRequest  (required)
     * @return RescheduleEmailsRequest
     */
    public RescheduleEmailsRequest rescheduleEmails(
            String bulkId, EmailBulkRescheduleRequest emailBulkRescheduleRequest) {
        return new RescheduleEmailsRequest(bulkId, emailBulkRescheduleRequest);
    }

    private RequestDefinition sendEmailDefinition(EmailRequest emailRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/4/messages")
                .body(emailRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendEmail request builder class.
     */
    public class SendEmailRequest {
        private final EmailRequest emailRequest;

        private SendEmailRequest(EmailRequest emailRequest) {
            this.emailRequest =
                    Objects.requireNonNull(emailRequest, "The required parameter 'emailRequest' is missing.");
        }

        /**
         * Executes the sendEmail request.
         *
         * @return EmailResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailResponse execute() throws ApiException {
            RequestDefinition sendEmailDefinition = sendEmailDefinition(emailRequest);
            return apiClient.execute(sendEmailDefinition, new TypeReference<EmailResponse>() {}.getType());
        }

        /**
         * Executes the sendEmail request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailResponse> callback) {
            RequestDefinition sendEmailDefinition = sendEmailDefinition(emailRequest);
            return apiClient.executeAsync(
                    sendEmailDefinition, new TypeReference<EmailResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send email messages.
     * <p>
     * 99% of all use cases can be achieved by using this API method. Everything from sending a simple single message to a single destination, up to batch sending of personalized messages to the thousands of recipients with a single API request. Scheduling and every advanced feature you can think of is supported.
     *
     * @param emailRequest  (required)
     * @return SendEmailRequest
     * @see <a href="https://www.infobip.com/docs/email">Learn more about Email channel and use cases</a>
     */
    @Beta
    public SendEmailRequest sendEmail(EmailRequest emailRequest) {
        return new SendEmailRequest(emailRequest);
    }

    private RequestDefinition sendMimeEmailDefinition(EmailSendMimeRequestSchema emailSendMimeRequestSchema) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/email/4/mime")
                .body(emailSendMimeRequestSchema)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendMimeEmail request builder class.
     */
    public class SendMimeEmailRequest {
        private final EmailSendMimeRequestSchema emailSendMimeRequestSchema;

        private SendMimeEmailRequest(EmailSendMimeRequestSchema emailSendMimeRequestSchema) {
            this.emailSendMimeRequestSchema = Objects.requireNonNull(
                    emailSendMimeRequestSchema, "The required parameter 'emailSendMimeRequestSchema' is missing.");
        }

        /**
         * Executes the sendMimeEmail request.
         *
         * @return EmailSendResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailSendResponse execute() throws ApiException {
            RequestDefinition sendMimeEmailDefinition = sendMimeEmailDefinition(emailSendMimeRequestSchema);
            return apiClient.execute(sendMimeEmailDefinition, new TypeReference<EmailSendResponse>() {}.getType());
        }

        /**
         * Executes the sendMimeEmail request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailSendResponse> callback) {
            RequestDefinition sendMimeEmailDefinition = sendMimeEmailDefinition(emailSendMimeRequestSchema);
            return apiClient.executeAsync(
                    sendMimeEmailDefinition, new TypeReference<EmailSendResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send MIME email.
     * <p>
     * Send an email where you can specify the content as MIME message.
     *
     * @param emailSendMimeRequestSchema  (required)
     * @return SendMimeEmailRequest
     */
    public SendMimeEmailRequest sendMimeEmail(EmailSendMimeRequestSchema emailSendMimeRequestSchema) {
        return new SendMimeEmailRequest(emailSendMimeRequestSchema);
    }

    private RequestDefinition updateDomainPoolPriorityDefinition(
            Long domainId, String poolId, EmailDomainIpPoolUpdateApiRequest emailDomainIpPoolUpdateApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/email/1/ip-management/domains/{domainId}/pools/{poolId}")
                .body(emailDomainIpPoolUpdateApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (domainId != null) {
            builder.addPathParameter(new Parameter("domainId", domainId));
        }
        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        return builder.build();
    }

    /**
     * updateDomainPoolPriority request builder class.
     */
    public class UpdateDomainPoolPriorityRequest {
        private final Long domainId;
        private final String poolId;
        private final EmailDomainIpPoolUpdateApiRequest emailDomainIpPoolUpdateApiRequest;

        private UpdateDomainPoolPriorityRequest(
                Long domainId, String poolId, EmailDomainIpPoolUpdateApiRequest emailDomainIpPoolUpdateApiRequest) {
            this.domainId = Objects.requireNonNull(domainId, "The required parameter 'domainId' is missing.");
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
            this.emailDomainIpPoolUpdateApiRequest = Objects.requireNonNull(
                    emailDomainIpPoolUpdateApiRequest,
                    "The required parameter 'emailDomainIpPoolUpdateApiRequest' is missing.");
        }

        /**
         * Executes the updateDomainPoolPriority request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition updateDomainPoolPriorityDefinition =
                    updateDomainPoolPriorityDefinition(domainId, poolId, emailDomainIpPoolUpdateApiRequest);
            apiClient.execute(updateDomainPoolPriorityDefinition);
        }

        /**
         * Executes the updateDomainPoolPriority request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition updateDomainPoolPriorityDefinition =
                    updateDomainPoolPriorityDefinition(domainId, poolId, emailDomainIpPoolUpdateApiRequest);
            return apiClient.executeAsync(updateDomainPoolPriorityDefinition, callback);
        }
    }

    /**
     * Update IP pool sending priority.
     * <p>
     * Update specified pool&#39;s sending priority for the provided domain.
     *
     * @param domainId Domain identifier. (required)
     * @param poolId IP pool identifier. (required)
     * @param emailDomainIpPoolUpdateApiRequest  (required)
     * @return UpdateDomainPoolPriorityRequest
     */
    public UpdateDomainPoolPriorityRequest updateDomainPoolPriority(
            Long domainId, String poolId, EmailDomainIpPoolUpdateApiRequest emailDomainIpPoolUpdateApiRequest) {
        return new UpdateDomainPoolPriorityRequest(domainId, poolId, emailDomainIpPoolUpdateApiRequest);
    }

    private RequestDefinition updateIpPoolDefinition(
            String poolId, EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/email/1/ip-management/pools/{poolId}")
                .body(emailIpPoolCreateApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (poolId != null) {
            builder.addPathParameter(new Parameter("poolId", poolId));
        }
        return builder.build();
    }

    /**
     * updateIpPool request builder class.
     */
    public class UpdateIpPoolRequest {
        private final String poolId;
        private final EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest;

        private UpdateIpPoolRequest(String poolId, EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest) {
            this.poolId = Objects.requireNonNull(poolId, "The required parameter 'poolId' is missing.");
            this.emailIpPoolCreateApiRequest = Objects.requireNonNull(
                    emailIpPoolCreateApiRequest, "The required parameter 'emailIpPoolCreateApiRequest' is missing.");
        }

        /**
         * Executes the updateIpPool request.
         *
         * @return EmailIpPoolResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public EmailIpPoolResponse execute() throws ApiException {
            RequestDefinition updateIpPoolDefinition = updateIpPoolDefinition(poolId, emailIpPoolCreateApiRequest);
            return apiClient.execute(updateIpPoolDefinition, new TypeReference<EmailIpPoolResponse>() {}.getType());
        }

        /**
         * Executes the updateIpPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<EmailIpPoolResponse> callback) {
            RequestDefinition updateIpPoolDefinition = updateIpPoolDefinition(poolId, emailIpPoolCreateApiRequest);
            return apiClient.executeAsync(
                    updateIpPoolDefinition, new TypeReference<EmailIpPoolResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update IP pool.
     * <p>
     * Update a provided IP pool.
     *
     * @param poolId IP pool identifier. (required)
     * @param emailIpPoolCreateApiRequest  (required)
     * @return UpdateIpPoolRequest
     */
    public UpdateIpPoolRequest updateIpPool(String poolId, EmailIpPoolCreateApiRequest emailIpPoolCreateApiRequest) {
        return new UpdateIpPoolRequest(poolId, emailIpPoolCreateApiRequest);
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
     * Update scheduled message statuses.
     * <p>
     * Change status or completely cancel sending of scheduled messages.
     *
     * @param bulkId The ID that uniquely identifies the sent bulk. (required)
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
     * Update domain tracking events.
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
     * Validate email address.
     * <p>
     * This method lets you request validation of a single email address in real-time, helping you to identify and remove poor-quality emails from your list.
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
     * Verify domain.
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
