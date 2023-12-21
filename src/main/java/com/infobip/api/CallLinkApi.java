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
import com.infobip.model.WebRtcCallLink;
import com.infobip.model.WebRtcCallLinkConfig;
import com.infobip.model.WebRtcCallLinkConfigPage;
import com.infobip.model.WebRtcCallLinkConfigRequest;
import com.infobip.model.WebRtcCallLinkPage;
import com.infobip.model.WebRtcCallLinkRequest;
import com.infobip.model.WebRtcCallLinkResponse;
import com.infobip.model.WebRtcImagePage;
import com.infobip.model.WebRtcImageResponse;
import com.infobip.model.WebRtcImageType;
import com.infobip.model.WebRtcSubdomain;
import com.infobip.model.WebRtcSubdomainRequest;
import com.infobip.model.WebRtcSubdomainResponse;
import java.io.File;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallLinkApi API client.
 */
public class CallLinkApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of CallLinkApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public CallLinkApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition createCallLinkDefinition(WebRtcCallLinkRequest webRtcCallLinkRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/call-link/1/links")
                .body(webRtcCallLinkRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createCallLink request builder class.
     */
    public class CreateCallLinkRequest {
        private final WebRtcCallLinkRequest webRtcCallLinkRequest;

        private CreateCallLinkRequest(WebRtcCallLinkRequest webRtcCallLinkRequest) {
            this.webRtcCallLinkRequest = Objects.requireNonNull(
                    webRtcCallLinkRequest, "The required parameter 'webRtcCallLinkRequest' is missing.");
        }

        /**
         * Executes the createCallLink request.
         *
         * @return WebRtcCallLinkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkResponse execute() throws ApiException {
            RequestDefinition createCallLinkDefinition = createCallLinkDefinition(webRtcCallLinkRequest);
            return apiClient.execute(
                    createCallLinkDefinition, new TypeReference<WebRtcCallLinkResponse>() {}.getType());
        }

        /**
         * Executes the createCallLink request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkResponse> callback) {
            RequestDefinition createCallLinkDefinition = createCallLinkDefinition(webRtcCallLinkRequest);
            return apiClient.executeAsync(
                    createCallLinkDefinition, new TypeReference<WebRtcCallLinkResponse>() {}.getType(), callback);
        }
    }

    /**
     * Create call link.
     * <p>
     * Create a link to send to someone who will then initiate a call.
     *
     * @param webRtcCallLinkRequest  (required)
     * @return CreateCallLinkRequest
     */
    public CreateCallLinkRequest createCallLink(WebRtcCallLinkRequest webRtcCallLinkRequest) {
        return new CreateCallLinkRequest(webRtcCallLinkRequest);
    }

    private RequestDefinition createConfigDefinition(WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/call-link/1/configs")
                .body(webRtcCallLinkConfigRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createConfig request builder class.
     */
    public class CreateConfigRequest {
        private final WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest;

        private CreateConfigRequest(WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
            this.webRtcCallLinkConfigRequest = Objects.requireNonNull(
                    webRtcCallLinkConfigRequest, "The required parameter 'webRtcCallLinkConfigRequest' is missing.");
        }

        /**
         * Executes the createConfig request.
         *
         * @return WebRtcCallLinkConfig The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkConfig execute() throws ApiException {
            RequestDefinition createConfigDefinition = createConfigDefinition(webRtcCallLinkConfigRequest);
            return apiClient.execute(createConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType());
        }

        /**
         * Executes the createConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkConfig> callback) {
            RequestDefinition createConfigDefinition = createConfigDefinition(webRtcCallLinkConfigRequest);
            return apiClient.executeAsync(
                    createConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType(), callback);
        }
    }

    /**
     * Create configuration.
     * <p>
     * Use this method to add a new call link configuration.
     *
     * @param webRtcCallLinkConfigRequest  (required)
     * @return CreateConfigRequest
     */
    public CreateConfigRequest createConfig(WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
        return new CreateConfigRequest(webRtcCallLinkConfigRequest);
    }

    private RequestDefinition createSubdomainDefinition(WebRtcSubdomainRequest webRtcSubdomainRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/call-link/1/subdomains")
                .body(webRtcSubdomainRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createSubdomain request builder class.
     */
    public class CreateSubdomainRequest {
        private final WebRtcSubdomainRequest webRtcSubdomainRequest;

        private CreateSubdomainRequest(WebRtcSubdomainRequest webRtcSubdomainRequest) {
            this.webRtcSubdomainRequest = Objects.requireNonNull(
                    webRtcSubdomainRequest, "The required parameter 'webRtcSubdomainRequest' is missing.");
        }

        /**
         * Executes the createSubdomain request.
         *
         * @return WebRtcSubdomain The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcSubdomain execute() throws ApiException {
            RequestDefinition createSubdomainDefinition = createSubdomainDefinition(webRtcSubdomainRequest);
            return apiClient.execute(createSubdomainDefinition, new TypeReference<WebRtcSubdomain>() {}.getType());
        }

        /**
         * Executes the createSubdomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcSubdomain> callback) {
            RequestDefinition createSubdomainDefinition = createSubdomainDefinition(webRtcSubdomainRequest);
            return apiClient.executeAsync(
                    createSubdomainDefinition, new TypeReference<WebRtcSubdomain>() {}.getType(), callback);
        }
    }

    /**
     * Create subdomain.
     * <p>
     * Use this method to add a new call link subdomain. Maximum number of domains is 3. Cannot contain \&quot;.\&quot;.
     *
     * @param webRtcSubdomainRequest  (required)
     * @return CreateSubdomainRequest
     */
    public CreateSubdomainRequest createSubdomain(WebRtcSubdomainRequest webRtcSubdomainRequest) {
        return new CreateSubdomainRequest(webRtcSubdomainRequest);
    }

    private RequestDefinition deleteCallLinkDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/call-link/1/links/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * deleteCallLink request builder class.
     */
    public class DeleteCallLinkRequest {
        private final String id;

        private DeleteCallLinkRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the deleteCallLink request.
         *
         * @return WebRtcCallLink The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLink execute() throws ApiException {
            RequestDefinition deleteCallLinkDefinition = deleteCallLinkDefinition(id);
            return apiClient.execute(deleteCallLinkDefinition, new TypeReference<WebRtcCallLink>() {}.getType());
        }

        /**
         * Executes the deleteCallLink request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLink> callback) {
            RequestDefinition deleteCallLinkDefinition = deleteCallLinkDefinition(id);
            return apiClient.executeAsync(
                    deleteCallLinkDefinition, new TypeReference<WebRtcCallLink>() {}.getType(), callback);
        }
    }

    /**
     * Delete call link.
     * <p>
     * Use this method to delete a call link by its ID.
     *
     * @param id ID of a call link to delete. (required)
     * @return DeleteCallLinkRequest
     */
    public DeleteCallLinkRequest deleteCallLink(String id) {
        return new DeleteCallLinkRequest(id);
    }

    private RequestDefinition deleteConfigDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/call-link/1/configs/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * deleteConfig request builder class.
     */
    public class DeleteConfigRequest {
        private final String id;

        private DeleteConfigRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the deleteConfig request.
         *
         * @return WebRtcCallLinkConfig The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkConfig execute() throws ApiException {
            RequestDefinition deleteConfigDefinition = deleteConfigDefinition(id);
            return apiClient.execute(deleteConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType());
        }

        /**
         * Executes the deleteConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkConfig> callback) {
            RequestDefinition deleteConfigDefinition = deleteConfigDefinition(id);
            return apiClient.executeAsync(
                    deleteConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType(), callback);
        }
    }

    /**
     * Delete configuration.
     * <p>
     * Use this method to delete a call link configuration by its ID.
     *
     * @param id ID of a call link configuration to delete. (required)
     * @return DeleteConfigRequest
     */
    public DeleteConfigRequest deleteConfig(String id) {
        return new DeleteConfigRequest(id);
    }

    private RequestDefinition deleteImageDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/call-link/1/images/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * deleteImage request builder class.
     */
    public class DeleteImageRequest {
        private final String id;

        private DeleteImageRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the deleteImage request.
         *
         * @return WebRtcImageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcImageResponse execute() throws ApiException {
            RequestDefinition deleteImageDefinition = deleteImageDefinition(id);
            return apiClient.execute(deleteImageDefinition, new TypeReference<WebRtcImageResponse>() {}.getType());
        }

        /**
         * Executes the deleteImage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcImageResponse> callback) {
            RequestDefinition deleteImageDefinition = deleteImageDefinition(id);
            return apiClient.executeAsync(
                    deleteImageDefinition, new TypeReference<WebRtcImageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Delete image.
     * <p>
     * Use this method to delete a call link configuration image.
     *
     * @param id ID of an image to delete. (required)
     * @return DeleteImageRequest
     */
    public DeleteImageRequest deleteImage(String id) {
        return new DeleteImageRequest(id);
    }

    private RequestDefinition deleteSubdomainDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/call-link/1/subdomains/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * deleteSubdomain request builder class.
     */
    public class DeleteSubdomainRequest {
        private final String id;

        private DeleteSubdomainRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the deleteSubdomain request.
         *
         * @return WebRtcSubdomain The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcSubdomain execute() throws ApiException {
            RequestDefinition deleteSubdomainDefinition = deleteSubdomainDefinition(id);
            return apiClient.execute(deleteSubdomainDefinition, new TypeReference<WebRtcSubdomain>() {}.getType());
        }

        /**
         * Executes the deleteSubdomain request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcSubdomain> callback) {
            RequestDefinition deleteSubdomainDefinition = deleteSubdomainDefinition(id);
            return apiClient.executeAsync(
                    deleteSubdomainDefinition, new TypeReference<WebRtcSubdomain>() {}.getType(), callback);
        }
    }

    /**
     * Delete subdomain.
     * <p>
     * Use this method to delete a subdomain by its ID.
     *
     * @param id ID of a call link subdomain to delete. (required)
     * @return DeleteSubdomainRequest
     */
    public DeleteSubdomainRequest deleteSubdomain(String id) {
        return new DeleteSubdomainRequest(id);
    }

    private RequestDefinition getCallLinkDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/links/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getCallLink request builder class.
     */
    public class GetCallLinkRequest {
        private final String id;

        private GetCallLinkRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getCallLink request.
         *
         * @return WebRtcCallLink The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLink execute() throws ApiException {
            RequestDefinition getCallLinkDefinition = getCallLinkDefinition(id);
            return apiClient.execute(getCallLinkDefinition, new TypeReference<WebRtcCallLink>() {}.getType());
        }

        /**
         * Executes the getCallLink request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLink> callback) {
            RequestDefinition getCallLinkDefinition = getCallLinkDefinition(id);
            return apiClient.executeAsync(
                    getCallLinkDefinition, new TypeReference<WebRtcCallLink>() {}.getType(), callback);
        }
    }

    /**
     * Get call link.
     * <p>
     * Use this method to get a call link by its ID.
     *
     * @param id ID of a call link. (required)
     * @return GetCallLinkRequest
     */
    public GetCallLinkRequest getCallLink(String id) {
        return new GetCallLinkRequest(id);
    }

    private RequestDefinition getCallLinksDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/links")
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
     * getCallLinks request builder class.
     */
    public class GetCallLinksRequest {
        private Integer page;
        private Integer size;

        private GetCallLinksRequest() {}

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetCallLinksRequest
         */
        public GetCallLinksRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetCallLinksRequest
         */
        public GetCallLinksRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getCallLinks request.
         *
         * @return WebRtcCallLinkPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkPage execute() throws ApiException {
            RequestDefinition getCallLinksDefinition = getCallLinksDefinition(page, size);
            return apiClient.execute(getCallLinksDefinition, new TypeReference<WebRtcCallLinkPage>() {}.getType());
        }

        /**
         * Executes the getCallLinks request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkPage> callback) {
            RequestDefinition getCallLinksDefinition = getCallLinksDefinition(page, size);
            return apiClient.executeAsync(
                    getCallLinksDefinition, new TypeReference<WebRtcCallLinkPage>() {}.getType(), callback);
        }
    }

    /**
     * Get call links.
     * <p>
     * Use this method to retrieve all call links.
     *
     * @return GetCallLinksRequest
     */
    public GetCallLinksRequest getCallLinks() {
        return new GetCallLinksRequest();
    }

    private RequestDefinition getConfigDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/configs/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getConfig request builder class.
     */
    public class GetConfigRequest {
        private final String id;

        private GetConfigRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getConfig request.
         *
         * @return WebRtcCallLinkConfig The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkConfig execute() throws ApiException {
            RequestDefinition getConfigDefinition = getConfigDefinition(id);
            return apiClient.execute(getConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType());
        }

        /**
         * Executes the getConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkConfig> callback) {
            RequestDefinition getConfigDefinition = getConfigDefinition(id);
            return apiClient.executeAsync(
                    getConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType(), callback);
        }
    }

    /**
     * Get configuration.
     * <p>
     * Use this method to retrieve a call link configuration by its ID.
     *
     * @param id ID of a call link configuration to load. (required)
     * @return GetConfigRequest
     */
    public GetConfigRequest getConfig(String id) {
        return new GetConfigRequest(id);
    }

    private RequestDefinition getConfigsDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/configs")
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
     * getConfigs request builder class.
     */
    public class GetConfigsRequest {
        private Integer page;
        private Integer size;

        private GetConfigsRequest() {}

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetConfigsRequest
         */
        public GetConfigsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetConfigsRequest
         */
        public GetConfigsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getConfigs request.
         *
         * @return WebRtcCallLinkConfigPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkConfigPage execute() throws ApiException {
            RequestDefinition getConfigsDefinition = getConfigsDefinition(page, size);
            return apiClient.execute(getConfigsDefinition, new TypeReference<WebRtcCallLinkConfigPage>() {}.getType());
        }

        /**
         * Executes the getConfigs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkConfigPage> callback) {
            RequestDefinition getConfigsDefinition = getConfigsDefinition(page, size);
            return apiClient.executeAsync(
                    getConfigsDefinition, new TypeReference<WebRtcCallLinkConfigPage>() {}.getType(), callback);
        }
    }

    /**
     * Get configurations.
     * <p>
     * Use this method to retrieve all call link configurations.
     *
     * @return GetConfigsRequest
     */
    public GetConfigsRequest getConfigs() {
        return new GetConfigsRequest();
    }

    private RequestDefinition getImageDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/images/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getImage request builder class.
     */
    public class GetImageRequest {
        private final String id;

        private GetImageRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getImage request.
         *
         * @return WebRtcImageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcImageResponse execute() throws ApiException {
            RequestDefinition getImageDefinition = getImageDefinition(id);
            return apiClient.execute(getImageDefinition, new TypeReference<WebRtcImageResponse>() {}.getType());
        }

        /**
         * Executes the getImage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcImageResponse> callback) {
            RequestDefinition getImageDefinition = getImageDefinition(id);
            return apiClient.executeAsync(
                    getImageDefinition, new TypeReference<WebRtcImageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get image.
     * <p>
     * Use this method to get an image.
     *
     * @param id ID of an image. (required)
     * @return GetImageRequest
     */
    public GetImageRequest getImage(String id) {
        return new GetImageRequest(id);
    }

    private RequestDefinition getImagesDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/images")
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
     * getImages request builder class.
     */
    public class GetImagesRequest {
        private Integer page;
        private Integer size;

        private GetImagesRequest() {}

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetImagesRequest
         */
        public GetImagesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetImagesRequest
         */
        public GetImagesRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getImages request.
         *
         * @return WebRtcImagePage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcImagePage execute() throws ApiException {
            RequestDefinition getImagesDefinition = getImagesDefinition(page, size);
            return apiClient.execute(getImagesDefinition, new TypeReference<WebRtcImagePage>() {}.getType());
        }

        /**
         * Executes the getImages request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcImagePage> callback) {
            RequestDefinition getImagesDefinition = getImagesDefinition(page, size);
            return apiClient.executeAsync(
                    getImagesDefinition, new TypeReference<WebRtcImagePage>() {}.getType(), callback);
        }
    }

    /**
     * Get images.
     * <p>
     * Use this method to retrieve all images.
     *
     * @return GetImagesRequest
     */
    public GetImagesRequest getImages() {
        return new GetImagesRequest();
    }

    private RequestDefinition getSubdomainsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/call-link/1/subdomains")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * getSubdomains request builder class.
     */
    public class GetSubdomainsRequest {

        private GetSubdomainsRequest() {}

        /**
         * Executes the getSubdomains request.
         *
         * @return List&lt;WebRtcSubdomainResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<WebRtcSubdomainResponse> execute() throws ApiException {
            RequestDefinition getSubdomainsDefinition = getSubdomainsDefinition();
            return apiClient.execute(
                    getSubdomainsDefinition, new TypeReference<List<WebRtcSubdomainResponse>>() {}.getType());
        }

        /**
         * Executes the getSubdomains request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<WebRtcSubdomainResponse>> callback) {
            RequestDefinition getSubdomainsDefinition = getSubdomainsDefinition();
            return apiClient.executeAsync(
                    getSubdomainsDefinition, new TypeReference<List<WebRtcSubdomainResponse>>() {}.getType(), callback);
        }
    }

    /**
     * Get subdomains.
     * <p>
     * Use this method to get all subdomains.
     *
     * @return GetSubdomainsRequest
     */
    public GetSubdomainsRequest getSubdomains() {
        return new GetSubdomainsRequest();
    }

    private RequestDefinition patchConfigDefinition(
            String id, WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PATCH", "/call-link/1/configs/{id}")
                .body(webRtcCallLinkConfigRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * patchConfig request builder class.
     */
    public class PatchConfigRequest {
        private final String id;
        private final WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest;

        private PatchConfigRequest(String id, WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
            this.webRtcCallLinkConfigRequest = Objects.requireNonNull(
                    webRtcCallLinkConfigRequest, "The required parameter 'webRtcCallLinkConfigRequest' is missing.");
        }

        /**
         * Executes the patchConfig request.
         *
         * @return WebRtcCallLinkConfig The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkConfig execute() throws ApiException {
            RequestDefinition patchConfigDefinition = patchConfigDefinition(id, webRtcCallLinkConfigRequest);
            return apiClient.execute(patchConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType());
        }

        /**
         * Executes the patchConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkConfig> callback) {
            RequestDefinition patchConfigDefinition = patchConfigDefinition(id, webRtcCallLinkConfigRequest);
            return apiClient.executeAsync(
                    patchConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType(), callback);
        }
    }

    /**
     * Partial configuration update.
     * <p>
     * Use this method to update a call link configuration. New values for configuration attributes replace the existing ones. If no value is passed in the request, the attribute keeps its value.
     *
     * @param id ID of a call link configuration to update. (required)
     * @param webRtcCallLinkConfigRequest  (required)
     * @return PatchConfigRequest
     */
    public PatchConfigRequest patchConfig(String id, WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
        return new PatchConfigRequest(id, webRtcCallLinkConfigRequest);
    }

    private RequestDefinition updateConfigDefinition(
            String id, WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/call-link/1/configs/{id}")
                .body(webRtcCallLinkConfigRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * updateConfig request builder class.
     */
    public class UpdateConfigRequest {
        private final String id;
        private final WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest;

        private UpdateConfigRequest(String id, WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
            this.webRtcCallLinkConfigRequest = Objects.requireNonNull(
                    webRtcCallLinkConfigRequest, "The required parameter 'webRtcCallLinkConfigRequest' is missing.");
        }

        /**
         * Executes the updateConfig request.
         *
         * @return WebRtcCallLinkConfig The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcCallLinkConfig execute() throws ApiException {
            RequestDefinition updateConfigDefinition = updateConfigDefinition(id, webRtcCallLinkConfigRequest);
            return apiClient.execute(updateConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType());
        }

        /**
         * Executes the updateConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcCallLinkConfig> callback) {
            RequestDefinition updateConfigDefinition = updateConfigDefinition(id, webRtcCallLinkConfigRequest);
            return apiClient.executeAsync(
                    updateConfigDefinition, new TypeReference<WebRtcCallLinkConfig>() {}.getType(), callback);
        }
    }

    /**
     * Update a configuration.
     * <p>
     * Use this method to overwrite a call link configuration. New values for configuration attributes replace the existing ones. If no value is passed, the attribute is set to empty or to default, if available.
     *
     * @param id ID of a call link configuration to update. (required)
     * @param webRtcCallLinkConfigRequest  (required)
     * @return UpdateConfigRequest
     */
    public UpdateConfigRequest updateConfig(String id, WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest) {
        return new UpdateConfigRequest(id, webRtcCallLinkConfigRequest);
    }

    private RequestDefinition uploadImageDefinition(WebRtcImageType type, File _file) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/call-link/1/images/upload/{type}")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("multipart/form-data");

        if (type != null) {
            builder.addPathParameter(new Parameter("type", type));
        }
        if (_file != null) {
            builder.addFormParameter(new Parameter("file", _file));
        }
        return builder.build();
    }

    /**
     * uploadImage request builder class.
     */
    public class UploadImageRequest {
        private final WebRtcImageType type;
        private final File _file;

        private UploadImageRequest(WebRtcImageType type, File _file) {
            this.type = Objects.requireNonNull(type, "The required parameter 'type' is missing.");
            this._file = Objects.requireNonNull(_file, "The required parameter '_file' is missing.");
        }

        /**
         * Executes the uploadImage request.
         *
         * @return WebRtcImageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcImageResponse execute() throws ApiException {
            RequestDefinition uploadImageDefinition = uploadImageDefinition(type, _file);
            return apiClient.execute(uploadImageDefinition, new TypeReference<WebRtcImageResponse>() {}.getType());
        }

        /**
         * Executes the uploadImage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcImageResponse> callback) {
            RequestDefinition uploadImageDefinition = uploadImageDefinition(type, _file);
            return apiClient.executeAsync(
                    uploadImageDefinition, new TypeReference<WebRtcImageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Upload image.
     * <p>
     * Use this method to upload an image.
     *
     * @param type Image type, LOGO or BACKGROUND. (required)
     * @param _file Multipart file data of an image. Max file size of LOGO type is 1MB with max resolution of 100x100. Max file size of BACKGROUND type is 10MB with max resolution of 2000x2000. Acceptable file formats are: .jpeg, .jpg and .png. (required)
     * @return UploadImageRequest
     */
    public UploadImageRequest uploadImage(WebRtcImageType type, File _file) {
        return new UploadImageRequest(type, _file);
    }
}
