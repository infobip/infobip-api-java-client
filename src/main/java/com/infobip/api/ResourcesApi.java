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
import com.infobip.model.GetResourceRequest200Response;
import com.infobip.model.ResourcesConfigurationType;
import com.infobip.model.ResourcesDocumentIdentifier;
import com.infobip.model.ResourcesIbResourceCoverageInfo;
import com.infobip.model.ResourcesIbResourceCoverageKey;
import com.infobip.model.ResourcesIbResourcesFilter;
import com.infobip.model.ResourcesIbResourcesResponse;
import com.infobip.model.ResourcesMoConfigurationRequest;
import com.infobip.model.ResourcesMoConfigurationResponse;
import com.infobip.model.ResourcesPageResourceOrderApiDoc;
import com.infobip.model.ResourcesRequirementSpecs;
import com.infobip.model.ResourcesRequirementsLookupBody;
import com.infobip.model.ResourcesResourceOrderIdentifier;
import com.infobip.model.ResourcesResourceOrderStatus;
import com.infobip.model.ResourcesSubmitResourceRequestBody;
import com.infobip.model.ResourcesUpdateResourceOrderRequest;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents ResourcesApi API client.
 */
public class ResourcesApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of ResourcesApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public ResourcesApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition cancelResourceRequestDefinition(UUID id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/resources/1/requests/{id}/cancel")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * cancelResourceRequest request builder class.
     */
    public class CancelResourceRequestRequest {
        private final UUID id;

        private CancelResourceRequestRequest(UUID id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the cancelResourceRequest request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition cancelResourceRequestDefinition = cancelResourceRequestDefinition(id);
            apiClient.execute(cancelResourceRequestDefinition);
        }

        /**
         * Executes the cancelResourceRequest request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition cancelResourceRequestDefinition = cancelResourceRequestDefinition(id);
            return apiClient.executeAsync(cancelResourceRequestDefinition, callback);
        }
    }

    /**
     * Cancel resource request.
     * <p>
     * **Available to selected accounts only. If you want to start using this request, reach out to support@infobip.com or your Infobip account team.**  Cancels an existing resource request with Infobip. Resource request may only be canceled when in UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER status. Limited to ALPHANUMERIC_REGISTRATION, NUMBER_PURCHASE and RCS_SENDER_LAUNCH requests only.
     *
     * @param id The ID of the resource request. (required)
     * @return CancelResourceRequestRequest
     */
    @Beta
    public CancelResourceRequestRequest cancelResourceRequest(UUID id) {
        return new CancelResourceRequestRequest(id);
    }

    private RequestDefinition deleteDocumentDefinition(String documentId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/resources/1/documents/{documentId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (documentId != null) {
            builder.addPathParameter(new Parameter("documentId", documentId));
        }
        return builder.build();
    }

    /**
     * deleteDocument request builder class.
     */
    public class DeleteDocumentRequest {
        private final String documentId;

        private DeleteDocumentRequest(String documentId) {
            this.documentId = Objects.requireNonNull(documentId, "The required parameter 'documentId' is missing.");
        }

        /**
         * Executes the deleteDocument request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteDocumentDefinition = deleteDocumentDefinition(documentId);
            apiClient.execute(deleteDocumentDefinition);
        }

        /**
         * Executes the deleteDocument request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteDocumentDefinition = deleteDocumentDefinition(documentId);
            return apiClient.executeAsync(deleteDocumentDefinition, callback);
        }
    }

    /**
     * Delete document.
     * <p>
     * Delete a document you have previously uploaded.
     *
     * @param documentId The ID of the document for deletion. (required)
     * @return DeleteDocumentRequest
     */
    @Beta
    public DeleteDocumentRequest deleteDocument(String documentId) {
        return new DeleteDocumentRequest(documentId);
    }

    private RequestDefinition deleteInboundConfigurationDefinition(String configurationKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/resource-management/1/inbound-message-configurations/{configurationKey}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (configurationKey != null) {
            builder.addPathParameter(new Parameter("configurationKey", configurationKey));
        }
        return builder.build();
    }

    /**
     * deleteInboundConfiguration request builder class.
     */
    public class DeleteInboundConfigurationRequest {
        private final String configurationKey;

        private DeleteInboundConfigurationRequest(String configurationKey) {
            this.configurationKey =
                    Objects.requireNonNull(configurationKey, "The required parameter 'configurationKey' is missing.");
        }

        /**
         * Executes the deleteInboundConfiguration request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteInboundConfigurationDefinition =
                    deleteInboundConfigurationDefinition(configurationKey);
            apiClient.execute(deleteInboundConfigurationDefinition);
        }

        /**
         * Executes the deleteInboundConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteInboundConfigurationDefinition =
                    deleteInboundConfigurationDefinition(configurationKey);
            return apiClient.executeAsync(deleteInboundConfigurationDefinition, callback);
        }
    }

    /**
     * Delete inbound configuration.
     * <p>
     * This method will delete the configuration.
     *
     * @param configurationKey Unique ID of configuration. (required)
     * @return DeleteInboundConfigurationRequest
     * @see <a href="https://www.infobip.com/docs/numbers/keywords-and-actions">Read more about keywords</a>
     */
    public DeleteInboundConfigurationRequest deleteInboundConfiguration(String configurationKey) {
        return new DeleteInboundConfigurationRequest(configurationKey);
    }

    private RequestDefinition downloadDocumentDefinition(String documentId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/resources/1/documents/{documentId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (documentId != null) {
            builder.addPathParameter(new Parameter("documentId", documentId));
        }
        return builder.build();
    }

    /**
     * downloadDocument request builder class.
     */
    public class DownloadDocumentRequest {
        private final String documentId;

        private DownloadDocumentRequest(String documentId) {
            this.documentId = Objects.requireNonNull(documentId, "The required parameter 'documentId' is missing.");
        }

        /**
         * Executes the downloadDocument request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition downloadDocumentDefinition = downloadDocumentDefinition(documentId);
            return apiClient.execute(downloadDocumentDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the downloadDocument request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition downloadDocumentDefinition = downloadDocumentDefinition(documentId);
            return apiClient.executeAsync(downloadDocumentDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Download document.
     * <p>
     * Download a requirement supporting document (template or sample) or a document you have previously uploaded.
     *
     * @param documentId The ID of the desired document. (required)
     * @return DownloadDocumentRequest
     */
    @Beta
    public DownloadDocumentRequest downloadDocument(String documentId) {
        return new DownloadDocumentRequest(documentId);
    }

    private RequestDefinition getInboundConfigurationsDefinition(
            ResourcesConfigurationType channel,
            String configurationKey,
            String number,
            String numberKey,
            String resource,
            String resourceKey,
            String keyword,
            String countryCode) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/resource-management/1/inbound-message-configurations")
                .requiresAuthentication(true)
                .accept("application/json");

        if (configurationKey != null) {
            builder.addQueryParameter(new Parameter("configurationKey", configurationKey));
        }
        if (number != null) {
            builder.addQueryParameter(new Parameter("number", number));
        }
        if (numberKey != null) {
            builder.addQueryParameter(new Parameter("numberKey", numberKey));
        }
        if (resource != null) {
            builder.addQueryParameter(new Parameter("resource", resource));
        }
        if (resourceKey != null) {
            builder.addQueryParameter(new Parameter("resourceKey", resourceKey));
        }
        if (keyword != null) {
            builder.addQueryParameter(new Parameter("keyword", keyword));
        }
        if (channel != null) {
            builder.addQueryParameter(new Parameter("channel", channel));
        }
        if (countryCode != null) {
            builder.addQueryParameter(new Parameter("countryCode", countryCode));
        }
        return builder.build();
    }

    /**
     * getInboundConfigurations request builder class.
     */
    public class GetInboundConfigurationsRequest {
        private final ResourcesConfigurationType channel;
        private String configurationKey;
        private String number;
        private String numberKey;
        private String resource;
        private String resourceKey;
        private String keyword;
        private String countryCode;

        private GetInboundConfigurationsRequest(ResourcesConfigurationType channel) {
            this.channel = Objects.requireNonNull(channel, "The required parameter 'channel' is missing.");
        }

        /**
         * Sets configurationKey.
         *
         * @param configurationKey Unique ID of configuration. (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest configurationKey(String configurationKey) {
            this.configurationKey = configurationKey;
            return this;
        }

        /**
         * Sets number.
         *
         * @param number  (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Sets numberKey.
         *
         * @param numberKey Unique ID of a number. (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest numberKey(String numberKey) {
            this.numberKey = numberKey;
            return this;
        }

        /**
         * Sets resource.
         *
         * @param resource  (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets resourceKey.
         *
         * @param resourceKey Unique ID of a resource. (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest resourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }

        /**
         * Sets keyword.
         *
         * @param keyword Configuration keyword. (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * Sets countryCode.
         *
         * @param countryCode Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types). (optional)
         * @return GetInboundConfigurationsRequest
         */
        public GetInboundConfigurationsRequest countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Executes the getInboundConfigurations request.
         *
         * @return List&lt;ResourcesMoConfigurationResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<ResourcesMoConfigurationResponse> execute() throws ApiException {
            RequestDefinition getInboundConfigurationsDefinition = getInboundConfigurationsDefinition(
                    channel, configurationKey, number, numberKey, resource, resourceKey, keyword, countryCode);
            return apiClient.execute(
                    getInboundConfigurationsDefinition,
                    new TypeReference<List<ResourcesMoConfigurationResponse>>() {}.getType());
        }

        /**
         * Executes the getInboundConfigurations request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<ResourcesMoConfigurationResponse>> callback) {
            RequestDefinition getInboundConfigurationsDefinition = getInboundConfigurationsDefinition(
                    channel, configurationKey, number, numberKey, resource, resourceKey, keyword, countryCode);
            return apiClient.executeAsync(
                    getInboundConfigurationsDefinition,
                    new TypeReference<List<ResourcesMoConfigurationResponse>>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get inbound configurations.
     * <p>
     * Get all configurations using a filter.&lt;br/&gt; If you want configuration for a specific number or resource, then one of the following parameters is required: &lt;code&gt;number, numberKey, resource&lt;/code&gt; or &lt;code&gt;resourceKey&lt;/code&gt;.&lt;br/&gt; If you are using &lt;code&gt;configurationKey&lt;/code&gt; none of previously mentioned parameters are needed.
     *
     * @param channel Required if &lt;code&gt;number, numberKey, resource&lt;/code&gt; or &lt;code&gt;resourceKey&lt;/code&gt; present. (required)
     * @return GetInboundConfigurationsRequest
     * @see <a href="https://www.infobip.com/docs/numbers/keywords-and-actions">Read more about keywords</a>
     */
    public GetInboundConfigurationsRequest getInboundConfigurations(ResourcesConfigurationType channel) {
        return new GetInboundConfigurationsRequest(channel);
    }

    private RequestDefinition getResourceRequestDefinition(UUID id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/resources/1/requests/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getResourceRequest request builder class.
     */
    public class GetResourceRequestRequest {
        private final UUID id;

        private GetResourceRequestRequest(UUID id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getResourceRequest request.
         *
         * @return GetResourceRequest200Response The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetResourceRequest200Response execute() throws ApiException {
            RequestDefinition getResourceRequestDefinition = getResourceRequestDefinition(id);
            return apiClient.execute(
                    getResourceRequestDefinition, new TypeReference<GetResourceRequest200Response>() {}.getType());
        }

        /**
         * Executes the getResourceRequest request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<GetResourceRequest200Response> callback) {
            RequestDefinition getResourceRequestDefinition = getResourceRequestDefinition(id);
            return apiClient.executeAsync(
                    getResourceRequestDefinition,
                    new TypeReference<GetResourceRequest200Response>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get resource request.
     * <p>
     * Retrieves a previously submitted resource request by its ID.
     *
     * @param id The ID of the desired resource. (required)
     * @return GetResourceRequestRequest
     */
    @Beta
    public GetResourceRequestRequest getResourceRequest(UUID id) {
        return new GetResourceRequestRequest(id);
    }

    private RequestDefinition getResourceRequestsDefinition(
            List<String> countryCode,
            List<ResourcesResourceOrderStatus> status,
            List<String> type,
            Integer page,
            Integer size,
            List<String> sort) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/resources/1/requests")
                .requiresAuthentication(true)
                .accept("application/json");

        if (countryCode != null) {
            for (var parameterItem : countryCode) {
                builder.addQueryParameter(new Parameter("countryCode", parameterItem));
            }
        }
        if (status != null) {
            for (var parameterItem : status) {
                builder.addQueryParameter(new Parameter("status", parameterItem));
            }
        }
        if (type != null) {
            for (var parameterItem : type) {
                builder.addQueryParameter(new Parameter("type", parameterItem));
            }
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        if (sort != null) {
            for (var parameterItem : sort) {
                builder.addQueryParameter(new Parameter("sort", parameterItem));
            }
        }
        return builder.build();
    }

    /**
     * getResourceRequests request builder class.
     */
    public class GetResourceRequestsRequest {
        private List<String> countryCode;
        private List<ResourcesResourceOrderStatus> status;
        private List<String> type;
        private Integer page;
        private Integer size;
        private List<String> sort;

        private GetResourceRequestsRequest() {}

        /**
         * Sets countryCode.
         *
         * @param countryCode Filters resources to those that match the supplied country code. (optional)
         * @return GetResourceRequestsRequest
         */
        public GetResourceRequestsRequest countryCode(List<String> countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Sets status.
         *
         * @param status Filters resources to those that match the resource request status. (optional)
         * @return GetResourceRequestsRequest
         */
        public GetResourceRequestsRequest status(List<ResourcesResourceOrderStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets type.
         *
         * @param type Filters resources to those that match the supplied resource type. (optional)
         * @return GetResourceRequestsRequest
         */
        public GetResourceRequestsRequest type(List<String> type) {
            this.type = type;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page you want to retrieve (0..N). The default value is 0. (optional)
         * @return GetResourceRequestsRequest
         */
        public GetResourceRequestsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page (0..2000). The default value is 20. The maximum value is 2000. (optional)
         * @return GetResourceRequestsRequest
         */
        public GetResourceRequestsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Sets sort.
         *
         * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is descending by last modified date. Sortable Properties: &#39;status&#39;, &#39;requestedDate&#39;. (optional)
         * @return GetResourceRequestsRequest
         */
        public GetResourceRequestsRequest sort(List<String> sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Executes the getResourceRequests request.
         *
         * @return ResourcesPageResourceOrderApiDoc The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesPageResourceOrderApiDoc execute() throws ApiException {
            RequestDefinition getResourceRequestsDefinition =
                    getResourceRequestsDefinition(countryCode, status, type, page, size, sort);
            return apiClient.execute(
                    getResourceRequestsDefinition, new TypeReference<ResourcesPageResourceOrderApiDoc>() {}.getType());
        }

        /**
         * Executes the getResourceRequests request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesPageResourceOrderApiDoc> callback) {
            RequestDefinition getResourceRequestsDefinition =
                    getResourceRequestsDefinition(countryCode, status, type, page, size, sort);
            return apiClient.executeAsync(
                    getResourceRequestsDefinition,
                    new TypeReference<ResourcesPageResourceOrderApiDoc>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get resource requests.
     * <p>
     * Gets a page of resource requests, using query parameters to filter results.
     *
     * @return GetResourceRequestsRequest
     */
    @Beta
    public GetResourceRequestsRequest getResourceRequests() {
        return new GetResourceRequestsRequest();
    }

    private RequestDefinition listResourcesDefinition(
            ResourcesIbResourcesFilter resourcesIbResourcesFilter, Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/resources/1/resources")
                .body(resourcesIbResourcesFilter)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * listResources request builder class.
     */
    public class ListResourcesRequest {
        private final ResourcesIbResourcesFilter resourcesIbResourcesFilter;
        private Integer page;
        private Integer size;

        private ListResourcesRequest(ResourcesIbResourcesFilter resourcesIbResourcesFilter) {
            this.resourcesIbResourcesFilter = Objects.requireNonNull(
                    resourcesIbResourcesFilter, "The required parameter 'resourcesIbResourcesFilter' is missing.");
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return ListResourcesRequest
         */
        public ListResourcesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of items per page. (optional, default to 20)
         * @return ListResourcesRequest
         */
        public ListResourcesRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the listResources request.
         *
         * @return ResourcesIbResourcesResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesIbResourcesResponse execute() throws ApiException {
            RequestDefinition listResourcesDefinition = listResourcesDefinition(resourcesIbResourcesFilter, page, size);
            return apiClient.execute(
                    listResourcesDefinition, new TypeReference<ResourcesIbResourcesResponse>() {}.getType());
        }

        /**
         * Executes the listResources request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesIbResourcesResponse> callback) {
            RequestDefinition listResourcesDefinition = listResourcesDefinition(resourcesIbResourcesFilter, page, size);
            return apiClient.executeAsync(
                    listResourcesDefinition, new TypeReference<ResourcesIbResourcesResponse>() {}.getType(), callback);
        }
    }

    /**
     * Search resources.
     * <p>
     * Search resources already owned by your account, such as senders and usable numbers, using filters. This endpoint does not return available resources for purchase or request, it only lists resources that are currently assigned to you.&lt;br/&gt; Pagination is supported; however, if no pagination arguments are supplied, the full unpaginated result set will be returned.
     *
     * @param resourcesIbResourcesFilter  (required)
     * @return ListResourcesRequest
     */
    public ListResourcesRequest listResources(ResourcesIbResourcesFilter resourcesIbResourcesFilter) {
        return new ListResourcesRequest(resourcesIbResourcesFilter);
    }

    private RequestDefinition lookupResourceCoverageDefinition(
            ResourcesIbResourceCoverageKey resourcesIbResourceCoverageKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/resources/1/coverage-lookup")
                .body(resourcesIbResourceCoverageKey)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * lookupResourceCoverage request builder class.
     */
    public class LookupResourceCoverageRequest {
        private final ResourcesIbResourceCoverageKey resourcesIbResourceCoverageKey;

        private LookupResourceCoverageRequest(ResourcesIbResourceCoverageKey resourcesIbResourceCoverageKey) {
            this.resourcesIbResourceCoverageKey = Objects.requireNonNull(
                    resourcesIbResourceCoverageKey,
                    "The required parameter 'resourcesIbResourceCoverageKey' is missing.");
        }

        /**
         * Executes the lookupResourceCoverage request.
         *
         * @return ResourcesIbResourceCoverageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesIbResourceCoverageInfo execute() throws ApiException {
            RequestDefinition lookupResourceCoverageDefinition =
                    lookupResourceCoverageDefinition(resourcesIbResourceCoverageKey);
            return apiClient.execute(
                    lookupResourceCoverageDefinition,
                    new TypeReference<ResourcesIbResourceCoverageInfo>() {}.getType());
        }

        /**
         * Executes the lookupResourceCoverage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesIbResourceCoverageInfo> callback) {
            RequestDefinition lookupResourceCoverageDefinition =
                    lookupResourceCoverageDefinition(resourcesIbResourceCoverageKey);
            return apiClient.executeAsync(
                    lookupResourceCoverageDefinition,
                    new TypeReference<ResourcesIbResourceCoverageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Lookup coverage for a resource.
     * <p>
     * Look up the coverage for a single resource by specifying the resource type, identifier (such as sender name or phone number), and associated country code.&lt;br/&gt;
     *
     * @param resourcesIbResourceCoverageKey  (required)
     * @return LookupResourceCoverageRequest
     */
    public LookupResourceCoverageRequest lookupResourceCoverage(
            ResourcesIbResourceCoverageKey resourcesIbResourceCoverageKey) {
        return new LookupResourceCoverageRequest(resourcesIbResourceCoverageKey);
    }

    private RequestDefinition manageInboundConfigurationDefinition(
            ResourcesMoConfigurationRequest resourcesMoConfigurationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/resource-management/1/inbound-message-configurations")
                .body(resourcesMoConfigurationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * manageInboundConfiguration request builder class.
     */
    public class ManageInboundConfigurationRequest {
        private final ResourcesMoConfigurationRequest resourcesMoConfigurationRequest;

        private ManageInboundConfigurationRequest(ResourcesMoConfigurationRequest resourcesMoConfigurationRequest) {
            this.resourcesMoConfigurationRequest = Objects.requireNonNull(
                    resourcesMoConfigurationRequest,
                    "The required parameter 'resourcesMoConfigurationRequest' is missing.");
        }

        /**
         * Executes the manageInboundConfiguration request.
         *
         * @return ResourcesMoConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesMoConfigurationResponse execute() throws ApiException {
            RequestDefinition manageInboundConfigurationDefinition =
                    manageInboundConfigurationDefinition(resourcesMoConfigurationRequest);
            return apiClient.execute(
                    manageInboundConfigurationDefinition,
                    new TypeReference<ResourcesMoConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the manageInboundConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesMoConfigurationResponse> callback) {
            RequestDefinition manageInboundConfigurationDefinition =
                    manageInboundConfigurationDefinition(resourcesMoConfigurationRequest);
            return apiClient.executeAsync(
                    manageInboundConfigurationDefinition,
                    new TypeReference<ResourcesMoConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Manage inbound configuration.
     * <p>
     * Create and update configuration details for incoming messages. Each action type and channel will require different parameters.
     *
     * @param resourcesMoConfigurationRequest  (required)
     * @return ManageInboundConfigurationRequest
     * @see <a href="https://www.infobip.com/docs/numbers/keywords-and-actions">Read more about keywords</a>
     */
    public ManageInboundConfigurationRequest manageInboundConfiguration(
            ResourcesMoConfigurationRequest resourcesMoConfigurationRequest) {
        return new ManageInboundConfigurationRequest(resourcesMoConfigurationRequest);
    }

    private RequestDefinition resourcesRequirementsLookupDefinition(
            ResourcesRequirementsLookupBody resourcesRequirementsLookupBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/resources/1/requirements-lookup")
                .body(resourcesRequirementsLookupBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * resourcesRequirementsLookup request builder class.
     */
    public class ResourcesRequirementsLookupRequest {
        private final ResourcesRequirementsLookupBody resourcesRequirementsLookupBody;

        private ResourcesRequirementsLookupRequest(ResourcesRequirementsLookupBody resourcesRequirementsLookupBody) {
            this.resourcesRequirementsLookupBody = Objects.requireNonNull(
                    resourcesRequirementsLookupBody,
                    "The required parameter 'resourcesRequirementsLookupBody' is missing.");
        }

        /**
         * Executes the resourcesRequirementsLookup request.
         *
         * @return ResourcesRequirementSpecs The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesRequirementSpecs execute() throws ApiException {
            RequestDefinition resourcesRequirementsLookupDefinition =
                    resourcesRequirementsLookupDefinition(resourcesRequirementsLookupBody);
            return apiClient.execute(
                    resourcesRequirementsLookupDefinition, new TypeReference<ResourcesRequirementSpecs>() {}.getType());
        }

        /**
         * Executes the resourcesRequirementsLookup request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesRequirementSpecs> callback) {
            RequestDefinition resourcesRequirementsLookupDefinition =
                    resourcesRequirementsLookupDefinition(resourcesRequirementsLookupBody);
            return apiClient.executeAsync(
                    resourcesRequirementsLookupDefinition,
                    new TypeReference<ResourcesRequirementSpecs>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get resource requirements.
     * <p>
     * Get a list of requirements needed for requesting a specific resource.
     *
     * @param resourcesRequirementsLookupBody  (required)
     * @return ResourcesRequirementsLookupRequest
     */
    @Beta
    public ResourcesRequirementsLookupRequest resourcesRequirementsLookup(
            ResourcesRequirementsLookupBody resourcesRequirementsLookupBody) {
        return new ResourcesRequirementsLookupRequest(resourcesRequirementsLookupBody);
    }

    private RequestDefinition submitResourceRequestDefinition(
            ResourcesSubmitResourceRequestBody resourcesSubmitResourceRequestBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/resources/1/requests")
                .body(resourcesSubmitResourceRequestBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * submitResourceRequest request builder class.
     */
    public class SubmitResourceRequestRequest {
        private final ResourcesSubmitResourceRequestBody resourcesSubmitResourceRequestBody;

        private SubmitResourceRequestRequest(ResourcesSubmitResourceRequestBody resourcesSubmitResourceRequestBody) {
            this.resourcesSubmitResourceRequestBody = Objects.requireNonNull(
                    resourcesSubmitResourceRequestBody,
                    "The required parameter 'resourcesSubmitResourceRequestBody' is missing.");
        }

        /**
         * Executes the submitResourceRequest request.
         *
         * @return ResourcesResourceOrderIdentifier The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesResourceOrderIdentifier execute() throws ApiException {
            RequestDefinition submitResourceRequestDefinition =
                    submitResourceRequestDefinition(resourcesSubmitResourceRequestBody);
            return apiClient.execute(
                    submitResourceRequestDefinition,
                    new TypeReference<ResourcesResourceOrderIdentifier>() {}.getType());
        }

        /**
         * Executes the submitResourceRequest request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesResourceOrderIdentifier> callback) {
            RequestDefinition submitResourceRequestDefinition =
                    submitResourceRequestDefinition(resourcesSubmitResourceRequestBody);
            return apiClient.executeAsync(
                    submitResourceRequestDefinition,
                    new TypeReference<ResourcesResourceOrderIdentifier>() {}.getType(),
                    callback);
        }
    }

    /**
     * Submit resource request.
     * <p>
     * Submits a resource request with Infobip. Please note that costs may apply.
     *
     * @param resourcesSubmitResourceRequestBody  (required)
     * @return SubmitResourceRequestRequest
     */
    @Beta
    public SubmitResourceRequestRequest submitResourceRequest(
            ResourcesSubmitResourceRequestBody resourcesSubmitResourceRequestBody) {
        return new SubmitResourceRequestRequest(resourcesSubmitResourceRequestBody);
    }

    private RequestDefinition updateResourceRequestDefinition(
            UUID id, ResourcesUpdateResourceOrderRequest resourcesUpdateResourceOrderRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PATCH", "/resources/1/requests/{id}")
                .body(resourcesUpdateResourceOrderRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * updateResourceRequest request builder class.
     */
    public class UpdateResourceRequestRequest {
        private final UUID id;
        private final ResourcesUpdateResourceOrderRequest resourcesUpdateResourceOrderRequest;

        private UpdateResourceRequestRequest(
                UUID id, ResourcesUpdateResourceOrderRequest resourcesUpdateResourceOrderRequest) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
            this.resourcesUpdateResourceOrderRequest = Objects.requireNonNull(
                    resourcesUpdateResourceOrderRequest,
                    "The required parameter 'resourcesUpdateResourceOrderRequest' is missing.");
        }

        /**
         * Executes the updateResourceRequest request.
         *
         * @return GetResourceRequest200Response The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetResourceRequest200Response execute() throws ApiException {
            RequestDefinition updateResourceRequestDefinition =
                    updateResourceRequestDefinition(id, resourcesUpdateResourceOrderRequest);
            return apiClient.execute(
                    updateResourceRequestDefinition, new TypeReference<GetResourceRequest200Response>() {}.getType());
        }

        /**
         * Executes the updateResourceRequest request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<GetResourceRequest200Response> callback) {
            RequestDefinition updateResourceRequestDefinition =
                    updateResourceRequestDefinition(id, resourcesUpdateResourceOrderRequest);
            return apiClient.executeAsync(
                    updateResourceRequestDefinition,
                    new TypeReference<GetResourceRequest200Response>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update resource request.
     * <p>
     * **Available to selected accounts only. If you want to start using this request, reach out to support@infobip.com or your Infobip account team.**  Updates an existing resource request with Infobip. Resource request may only be updated when in UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER status. Limited to ALPHANUMERIC_REGISTRATION, NUMBER_PURCHASE and RCS_SENDER_LAUNCH requests only. **All requirements data must be provided within the request, not just the incorrect or changed ones.**
     *
     * @param id The ID of the resource request. (required)
     * @param resourcesUpdateResourceOrderRequest  (required)
     * @return UpdateResourceRequestRequest
     */
    @Beta
    public UpdateResourceRequestRequest updateResourceRequest(
            UUID id, ResourcesUpdateResourceOrderRequest resourcesUpdateResourceOrderRequest) {
        return new UpdateResourceRequestRequest(id, resourcesUpdateResourceOrderRequest);
    }

    private RequestDefinition uploadDocumentDefinition(File document) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/resources/1/documents")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("multipart/form-data");

        if (document != null) {
            builder.addFormParameter(new Parameter("document", document));
        }
        return builder.build();
    }

    /**
     * uploadDocument request builder class.
     */
    public class UploadDocumentRequest {
        private final File document;

        private UploadDocumentRequest(File document) {
            this.document = Objects.requireNonNull(document, "The required parameter 'document' is missing.");
        }

        /**
         * Executes the uploadDocument request.
         *
         * @return ResourcesDocumentIdentifier The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public ResourcesDocumentIdentifier execute() throws ApiException {
            RequestDefinition uploadDocumentDefinition = uploadDocumentDefinition(document);
            return apiClient.execute(
                    uploadDocumentDefinition, new TypeReference<ResourcesDocumentIdentifier>() {}.getType());
        }

        /**
         * Executes the uploadDocument request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<ResourcesDocumentIdentifier> callback) {
            RequestDefinition uploadDocumentDefinition = uploadDocumentDefinition(document);
            return apiClient.executeAsync(
                    uploadDocumentDefinition, new TypeReference<ResourcesDocumentIdentifier>() {}.getType(), callback);
        }
    }

    /**
     * Upload document.
     * <p>
     * Upload a document prior to providing it as a requirement within a resource request.
     *
     * @param document The document file you want to upload. Supported file formats: .doc, .docx, .jpg, .jpeg, .png, .pdf, .xls, .xlsx, .mp4, .avi, .mov, .webm (required)
     * @return UploadDocumentRequest
     */
    @Beta
    public UploadDocumentRequest uploadDocument(File document) {
        return new UploadDocumentRequest(document);
    }
}
