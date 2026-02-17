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
import com.infobip.model.EmailSendResponse;
import com.infobip.model.EmailSuppressionInfoPageResponse;
import com.infobip.model.EmailSuppressionType;
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
            String campaignReferenceId,
            Integer limit,
            String applicationId,
            String entityId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/email/1/reports")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        if (messageId != null) {
            builder.addQueryParameter(new Parameter("messageId", messageId));
        }
        if (campaignReferenceId != null) {
            builder.addQueryParameter(new Parameter("campaignReferenceId", campaignReferenceId));
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
        private String campaignReferenceId;
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
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId The ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns. (optional)
         * @return GetEmailDeliveryReportsRequest
         */
        public GetEmailDeliveryReportsRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
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
            RequestDefinition getEmailDeliveryReportsDefinition = getEmailDeliveryReportsDefinition(
                    bulkId, messageId, campaignReferenceId, limit, applicationId, entityId);
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
                    bulkId, messageId, campaignReferenceId, limit, applicationId, entityId);
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
            String campaignReferenceId,
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
        if (campaignReferenceId != null) {
            builder.addQueryParameter(new Parameter("campaignReferenceId", campaignReferenceId));
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
        private String campaignReferenceId;
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
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId The ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns. (optional)
         * @return GetEmailLogsRequest
         */
        public GetEmailLogsRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
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
                    messageId,
                    from,
                    to,
                    bulkId,
                    campaignReferenceId,
                    generalStatus,
                    sentSince,
                    sentUntil,
                    limit,
                    applicationId,
                    entityId);
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
                    messageId,
                    from,
                    to,
                    bulkId,
                    campaignReferenceId,
                    generalStatus,
                    sentSince,
                    sentUntil,
                    limit,
                    applicationId,
                    entityId);
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
     * Get sent email bulks status.
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
     * Get sent email bulks.
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
     * Reschedule Email messages.
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
            String trackingPixelPosition,
            String trackingUrl,
            String bulkId,
            String messageId,
            String campaignReferenceId,
            String replyTo,
            String defaultPlaceholders,
            Boolean preserveRecipients,
            OffsetDateTime sendAt,
            String landingPagePlaceholders,
            String landingPageId,
            String templateLanguageVersion,
            String clientPriority,
            String applicationId,
            String entityId,
            String headers,
            String ipPoolId) {
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
        if (trackingPixelPosition != null) {
            builder.addFormParameter(new Parameter("trackingPixelPosition", trackingPixelPosition));
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
        if (campaignReferenceId != null) {
            builder.addFormParameter(new Parameter("campaignReferenceId", campaignReferenceId));
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
        if (clientPriority != null) {
            builder.addFormParameter(new Parameter("clientPriority", clientPriority));
        }
        if (applicationId != null) {
            builder.addFormParameter(new Parameter("applicationId", applicationId));
        }
        if (entityId != null) {
            builder.addFormParameter(new Parameter("entityId", entityId));
        }
        if (headers != null) {
            builder.addFormParameter(new Parameter("headers", headers));
        }
        if (ipPoolId != null) {
            builder.addFormParameter(new Parameter("ipPoolId", ipPoolId));
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
        private String trackingPixelPosition;
        private String trackingUrl;
        private String bulkId;
        private String messageId;
        private String campaignReferenceId;
        private String replyTo;
        private String defaultPlaceholders;
        private Boolean preserveRecipients;
        private OffsetDateTime sendAt;
        private String landingPagePlaceholders;
        private String landingPageId;
        private String templateLanguageVersion;
        private String clientPriority;
        private String applicationId;
        private String entityId;
        private String headers;
        private String ipPoolId;

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
         * @param cc CC recipient email address. As optional feature on this field, a specific placeholder can be defined whose value will apply only for this destination.  Note: Maximum number of recipients per request is 1000 overall including to, cc and bcc field. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest cc(List<String> cc) {
            this.cc = cc;
            return this;
        }

        /**
         * Sets bcc.
         *
         * @param bcc BCC recipient email address. As optional feature on this field, a specific placeholder can be defined whose value will apply only for this destination.  Note: Maximum number of recipients per request is 1000 overall including to, cc and bcc field. (optional)
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
         * @param templateId Template ID used for generating email content. The template is created over Infobip web interface or via the [Infobip Templates API](https://www.infobip.com/docs/api/channels/email/templates). If &#x60;templateId&#x60; is present, then &#x60;html&#x60; and &#x60;text&#x60; values are ignored.  Note: &#x60;templateId&#x60; only supports the value of &#x60;Broadcast&#x60;. &#x60;Content&#x60; and &#x60;Flow&#x60; are not supported. (optional)
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
         * @param track Enable or disable open and click tracking. Passing true will only enable tracking and the statistics would be visible in the web interface alone. This can be explicitly overridden by &#x60;trackClicks&#x60; and &#x60;trackOpens&#x60;. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest track(Boolean track) {
            this.track = track;
            return this;
        }

        /**
         * Sets trackClicks.
         *
         * @param trackClicks This parameter enables or disables track click feature.  Note: Option to disable click tracking per URL is available. For detailed usage, please refer to the [documentation](https://www.infobip.com/docs/email/email-tracking-and-analytics/email-tracking-types#disable-click-tracking-on-urls-url-clicks). (optional)
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
         * Sets trackingPixelPosition.
         *
         * @param trackingPixelPosition This parameter specifies the position of the open tracking pixel within the email content. Allowed values are &#x60;TOP&#x60; and &#x60;BOTTOM&#x60;. If no value is provided, the default is &#x60;TOP&#x60;. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest trackingPixelPosition(String trackingPixelPosition) {
            this.trackingPixelPosition = trackingPixelPosition;
            return this;
        }

        /**
         * Sets trackingUrl.
         *
         * @param trackingUrl The URL on your callback server on which the open and click notifications will be sent. See [Tracking Notifications](https://www.infobip.com/docs/email/email-over-api/tracking-notifications) for details. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest trackingUrl(String trackingUrl) {
            this.trackingUrl = trackingUrl;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID that uniquely identifies the sent bulk. This filter will enable you to query delivery reports for all the messages using just one request. You will receive a &#x60;bulkId&#x60; in the response after sending an email request. If you don&#39;t set your own &#x60;bulkId&#x60;, unique ID will be generated by our system and returned in the API response. (Optional Field) (optional)
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
         * Sets campaignReferenceId.
         *
         * @param campaignReferenceId The ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest campaignReferenceId(String campaignReferenceId) {
            this.campaignReferenceId = campaignReferenceId;
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
         * @param landingPageId The ID of an opt out landing page to be used and displayed once an end user clicks the unsubscribe link. If not present, default opt out landing page will be displayed. Create a landing page in your Infobip account and use its ID, e.g., &#x60;1_23456&#x60;. (optional)
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
         * Sets clientPriority.
         *
         * @param clientPriority Adds a priority rating to this email message. Allowed values are &#x60;HIGH&#x60;, &#x60;STANDARD&#x60; and &#x60;LOW&#x60;. Messages with a higher priority value sent by your account are prioritized over messages with a lower priority value sent by your account. If no priority value is provided, messages will be treated with &#x60;STANDARD&#x60; priority by default.  (optional, default to STANDARD)
         * @return SendEmailRequest
         */
        public SendEmailRequest clientPriority(String clientPriority) {
            this.clientPriority = clientPriority;
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
         * Sets headers.
         *
         * @param headers Additional email headers for customization that can be provided in a form of JSON. For example, you can override List-Unsubscribe header and provide your own custom one: &#x60;headers&#x3D;{\\\&quot;List-Unsubscribe\\\&quot;: \\\&quot;your unsubscribe link\\\&quot;, \\\&quot;X-CustomHeader\\\&quot;: \\\&quot;Header value\\\&quot;}&#x60;.  There are a few exceptions of headers which are not adjustable through this option: &#x60;To&#x60;, &#x60;Cc&#x60;, &#x60;Bcc&#x60;, &#x60;From&#x60;, &#x60;Subject&#x60;,&#x60;Content-Type&#x60;, &#x60;DKIM-Signature&#x60;, &#x60;Content-Transfer-Encoding&#x60;, &#x60;Return-Path&#x60;, &#x60;MIME-Version&#x60; (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest headers(String headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Sets ipPoolId.
         *
         * @param ipPoolId The ID of the IP Pool which will be used for sending. (optional)
         * @return SendEmailRequest
         */
        public SendEmailRequest ipPoolId(String ipPoolId) {
            this.ipPoolId = ipPoolId;
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
                    trackingPixelPosition,
                    trackingUrl,
                    bulkId,
                    messageId,
                    campaignReferenceId,
                    replyTo,
                    defaultPlaceholders,
                    preserveRecipients,
                    sendAt,
                    landingPagePlaceholders,
                    landingPageId,
                    templateLanguageVersion,
                    clientPriority,
                    applicationId,
                    entityId,
                    headers,
                    ipPoolId);
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
                    trackingPixelPosition,
                    trackingUrl,
                    bulkId,
                    messageId,
                    campaignReferenceId,
                    replyTo,
                    defaultPlaceholders,
                    preserveRecipients,
                    sendAt,
                    landingPagePlaceholders,
                    landingPageId,
                    templateLanguageVersion,
                    clientPriority,
                    applicationId,
                    entityId,
                    headers,
                    ipPoolId);
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
     * Update scheduled Email messages status.
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
