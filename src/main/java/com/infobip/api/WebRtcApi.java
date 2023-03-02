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
import com.infobip.model.WebRtcPushConfigurationPageResponse;
import com.infobip.model.WebRtcPushConfigurationRequest;
import com.infobip.model.WebRtcPushConfigurationResponse;
import com.infobip.model.WebRtcTokenRequestModel;
import com.infobip.model.WebRtcTokenResponseModel;
import java.util.Objects;

/**
 * Represents WebRtcApi API client.
 */
public class WebRtcApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of WebRtcApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public WebRtcApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition deletePushConfigurationDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/webrtc/1/webrtc-push-config/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * deletePushConfiguration request builder class.
     */
    public class DeletePushConfigurationRequest {
        private final String id;

        private DeletePushConfigurationRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the deletePushConfiguration request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deletePushConfigurationDefinition = deletePushConfigurationDefinition(id);
            apiClient.execute(deletePushConfigurationDefinition);
        }

        /**
         * Executes the deletePushConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deletePushConfigurationDefinition = deletePushConfigurationDefinition(id);
            return apiClient.executeAsync(deletePushConfigurationDefinition, callback);
        }
    }

    /**
     * Delete WebRTC push configuration.
     * <p>
     * Delete WebRTC push configuration for the given id.
     *
     * @param id Id of the WebRTC push configuration to delete. (required)
     * @return DeletePushConfigurationRequest
     */
    public DeletePushConfigurationRequest deletePushConfiguration(String id) {
        return new DeletePushConfigurationRequest(id);
    }

    private RequestDefinition generateWebRtcTokenDefinition(WebRtcTokenRequestModel webRtcTokenRequestModel) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/webrtc/1/token")
                .body(webRtcTokenRequestModel)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * generateWebRtcToken request builder class.
     */
    public class GenerateWebRtcTokenRequest {
        private final WebRtcTokenRequestModel webRtcTokenRequestModel;

        private GenerateWebRtcTokenRequest(WebRtcTokenRequestModel webRtcTokenRequestModel) {
            this.webRtcTokenRequestModel = Objects.requireNonNull(
                    webRtcTokenRequestModel, "The required parameter 'webRtcTokenRequestModel' is missing.");
        }

        /**
         * Executes the generateWebRtcToken request.
         *
         * @return WebRtcTokenResponseModel The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcTokenResponseModel execute() throws ApiException {
            RequestDefinition generateWebRtcTokenDefinition = generateWebRtcTokenDefinition(webRtcTokenRequestModel);
            return apiClient.execute(
                    generateWebRtcTokenDefinition, new TypeReference<WebRtcTokenResponseModel>() {}.getType());
        }

        /**
         * Executes the generateWebRtcToken request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcTokenResponseModel> callback) {
            RequestDefinition generateWebRtcTokenDefinition = generateWebRtcTokenDefinition(webRtcTokenRequestModel);
            return apiClient.executeAsync(
                    generateWebRtcTokenDefinition,
                    new TypeReference<WebRtcTokenResponseModel>() {}.getType(),
                    callback);
        }
    }

    /**
     * Generate WebRTC Token.
     * <p>
     * This endpoint allows you to generate token for WebRTC channel.
     *
     * @param webRtcTokenRequestModel  (required)
     * @return GenerateWebRtcTokenRequest
     */
    public GenerateWebRtcTokenRequest generateWebRtcToken(WebRtcTokenRequestModel webRtcTokenRequestModel) {
        return new GenerateWebRtcTokenRequest(webRtcTokenRequestModel);
    }

    private RequestDefinition getPushConfigurationDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/webrtc/1/webrtc-push-config/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getPushConfiguration request builder class.
     */
    public class GetPushConfigurationRequest {
        private final String id;

        private GetPushConfigurationRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getPushConfiguration request.
         *
         * @return WebRtcPushConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcPushConfigurationResponse execute() throws ApiException {
            RequestDefinition getPushConfigurationDefinition = getPushConfigurationDefinition(id);
            return apiClient.execute(
                    getPushConfigurationDefinition, new TypeReference<WebRtcPushConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the getPushConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcPushConfigurationResponse> callback) {
            RequestDefinition getPushConfigurationDefinition = getPushConfigurationDefinition(id);
            return apiClient.executeAsync(
                    getPushConfigurationDefinition,
                    new TypeReference<WebRtcPushConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get WebRTC push configuration.
     * <p>
     * Get a single WebRTC push configuration and its details.
     *
     * @param id Id of the WebRTC push configuration to get. (required)
     * @return GetPushConfigurationRequest
     */
    public GetPushConfigurationRequest getPushConfiguration(String id) {
        return new GetPushConfigurationRequest(id);
    }

    private RequestDefinition getPushConfigurationsDefinition(Integer page, Integer size, String applicationId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/webrtc/1/webrtc-push-config")
                .requiresAuthentication(true)
                .accept("application/json");

        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
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
     * getPushConfigurations request builder class.
     */
    public class GetPushConfigurationsRequest {
        private final Integer page;
        private final Integer size;
        private String applicationId;

        private GetPushConfigurationsRequest(Integer page, Integer size) {
            this.page = Objects.requireNonNull(page, "The required parameter 'page' is missing.");
            this.size = Objects.requireNonNull(size, "The required parameter 'size' is missing.");
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Id of the application to associate the push configuration with. (optional)
         * @return GetPushConfigurationsRequest
         */
        public GetPushConfigurationsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Executes the getPushConfigurations request.
         *
         * @return WebRtcPushConfigurationPageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcPushConfigurationPageResponse execute() throws ApiException {
            RequestDefinition getPushConfigurationsDefinition =
                    getPushConfigurationsDefinition(page, size, applicationId);
            return apiClient.execute(
                    getPushConfigurationsDefinition,
                    new TypeReference<WebRtcPushConfigurationPageResponse>() {}.getType());
        }

        /**
         * Executes the getPushConfigurations request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcPushConfigurationPageResponse> callback) {
            RequestDefinition getPushConfigurationsDefinition =
                    getPushConfigurationsDefinition(page, size, applicationId);
            return apiClient.executeAsync(
                    getPushConfigurationsDefinition,
                    new TypeReference<WebRtcPushConfigurationPageResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get WebRTC push configurations.
     * <p>
     * Get a page of WebRTC push configurations matching the query criteria.
     *
     * @param page Results page to retrieve (0..N). (required)
     * @param size Number of records per page. (required)
     * @return GetPushConfigurationsRequest
     */
    public GetPushConfigurationsRequest getPushConfigurations(Integer page, Integer size) {
        return new GetPushConfigurationsRequest(page, size);
    }

    private RequestDefinition savePushConfigurationDefinition(
            WebRtcPushConfigurationRequest webRtcPushConfigurationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/webrtc/1/webrtc-push-config")
                .body(webRtcPushConfigurationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * savePushConfiguration request builder class.
     */
    public class SavePushConfigurationRequest {
        private final WebRtcPushConfigurationRequest webRtcPushConfigurationRequest;

        private SavePushConfigurationRequest(WebRtcPushConfigurationRequest webRtcPushConfigurationRequest) {
            this.webRtcPushConfigurationRequest = Objects.requireNonNull(
                    webRtcPushConfigurationRequest,
                    "The required parameter 'webRtcPushConfigurationRequest' is missing.");
        }

        /**
         * Executes the savePushConfiguration request.
         *
         * @return WebRtcPushConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcPushConfigurationResponse execute() throws ApiException {
            RequestDefinition savePushConfigurationDefinition =
                    savePushConfigurationDefinition(webRtcPushConfigurationRequest);
            return apiClient.execute(
                    savePushConfigurationDefinition, new TypeReference<WebRtcPushConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the savePushConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcPushConfigurationResponse> callback) {
            RequestDefinition savePushConfigurationDefinition =
                    savePushConfigurationDefinition(webRtcPushConfigurationRequest);
            return apiClient.executeAsync(
                    savePushConfigurationDefinition,
                    new TypeReference<WebRtcPushConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create WebRTC push configuration.
     * <p>
     * Create and configure a new WebRTC push configuration.
     *
     * @param webRtcPushConfigurationRequest  (required)
     * @return SavePushConfigurationRequest
     */
    public SavePushConfigurationRequest savePushConfiguration(
            WebRtcPushConfigurationRequest webRtcPushConfigurationRequest) {
        return new SavePushConfigurationRequest(webRtcPushConfigurationRequest);
    }

    private RequestDefinition updatePushConfigurationDefinition(
            String id, WebRtcPushConfigurationRequest webRtcPushConfigurationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/webrtc/1/webrtc-push-config/{id}")
                .body(webRtcPushConfigurationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * updatePushConfiguration request builder class.
     */
    public class UpdatePushConfigurationRequest {
        private final String id;
        private final WebRtcPushConfigurationRequest webRtcPushConfigurationRequest;

        private UpdatePushConfigurationRequest(
                String id, WebRtcPushConfigurationRequest webRtcPushConfigurationRequest) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
            this.webRtcPushConfigurationRequest = Objects.requireNonNull(
                    webRtcPushConfigurationRequest,
                    "The required parameter 'webRtcPushConfigurationRequest' is missing.");
        }

        /**
         * Executes the updatePushConfiguration request.
         *
         * @return WebRtcPushConfigurationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WebRtcPushConfigurationResponse execute() throws ApiException {
            RequestDefinition updatePushConfigurationDefinition =
                    updatePushConfigurationDefinition(id, webRtcPushConfigurationRequest);
            return apiClient.execute(
                    updatePushConfigurationDefinition,
                    new TypeReference<WebRtcPushConfigurationResponse>() {}.getType());
        }

        /**
         * Executes the updatePushConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WebRtcPushConfigurationResponse> callback) {
            RequestDefinition updatePushConfigurationDefinition =
                    updatePushConfigurationDefinition(id, webRtcPushConfigurationRequest);
            return apiClient.executeAsync(
                    updatePushConfigurationDefinition,
                    new TypeReference<WebRtcPushConfigurationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update WebRTC push configuration.
     * <p>
     * Change details of an existing WebRTC push configuration.
     *
     * @param id Id of the WebRTC push configuration to update. (required)
     * @param webRtcPushConfigurationRequest  (required)
     * @return UpdatePushConfigurationRequest
     */
    public UpdatePushConfigurationRequest updatePushConfiguration(
            String id, WebRtcPushConfigurationRequest webRtcPushConfigurationRequest) {
        return new UpdatePushConfigurationRequest(id, webRtcPushConfigurationRequest);
    }
}
