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
import com.infobip.*;
import com.infobip.model.*;
import java.util.List;
import java.util.Objects;

/**
 * Represents NumberMaskingApi API client.
 */
public class NumberMaskingApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of NumberMaskingApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public NumberMaskingApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition createNumberMaskingConfigurationDefinition(
            NumberMaskingSetupBody numberMaskingSetupBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/voice/masking/2/config")
                .body(numberMaskingSetupBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createNumberMaskingConfiguration request builder class.
     */
    public class CreateNumberMaskingConfigurationRequest {
        private final NumberMaskingSetupBody numberMaskingSetupBody;

        private CreateNumberMaskingConfigurationRequest(NumberMaskingSetupBody numberMaskingSetupBody) {
            this.numberMaskingSetupBody = Objects.requireNonNull(
                    numberMaskingSetupBody, "The required parameter 'numberMaskingSetupBody' is missing.");
        }

        /**
         * Executes the createNumberMaskingConfiguration request.
         *
         * @return NumberMaskingSetupResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingSetupResponse execute() throws ApiException {
            RequestDefinition createNumberMaskingConfigurationDefinition =
                    createNumberMaskingConfigurationDefinition(numberMaskingSetupBody);
            return apiClient.execute(
                    createNumberMaskingConfigurationDefinition,
                    new TypeReference<NumberMaskingSetupResponse>() {}.getType());
        }

        /**
         * Executes the createNumberMaskingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingSetupResponse> callback) {
            RequestDefinition createNumberMaskingConfigurationDefinition =
                    createNumberMaskingConfigurationDefinition(numberMaskingSetupBody);
            return apiClient.executeAsync(
                    createNumberMaskingConfigurationDefinition,
                    new TypeReference<NumberMaskingSetupResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create number masking configuration.
     * <p>
     * This method allows you to create masking configuration.
     *
     * @param numberMaskingSetupBody  (required)
     * @return CreateNumberMaskingConfigurationRequest
     */
    public CreateNumberMaskingConfigurationRequest createNumberMaskingConfiguration(
            NumberMaskingSetupBody numberMaskingSetupBody) {
        return new CreateNumberMaskingConfigurationRequest(numberMaskingSetupBody);
    }

    private RequestDefinition createNumberMaskingCredentialsDefinition(
            NumberMaskingCredentialsBody numberMaskingCredentialsBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/voice/masking/2/credentials")
                .body(numberMaskingCredentialsBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createNumberMaskingCredentials request builder class.
     */
    public class CreateNumberMaskingCredentialsRequest {
        private final NumberMaskingCredentialsBody numberMaskingCredentialsBody;

        private CreateNumberMaskingCredentialsRequest(NumberMaskingCredentialsBody numberMaskingCredentialsBody) {
            this.numberMaskingCredentialsBody = Objects.requireNonNull(
                    numberMaskingCredentialsBody, "The required parameter 'numberMaskingCredentialsBody' is missing.");
        }

        /**
         * Executes the createNumberMaskingCredentials request.
         *
         * @return NumberMaskingCredentialsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingCredentialsResponse execute() throws ApiException {
            RequestDefinition createNumberMaskingCredentialsDefinition =
                    createNumberMaskingCredentialsDefinition(numberMaskingCredentialsBody);
            return apiClient.execute(
                    createNumberMaskingCredentialsDefinition,
                    new TypeReference<NumberMaskingCredentialsResponse>() {}.getType());
        }

        /**
         * Executes the createNumberMaskingCredentials request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingCredentialsResponse> callback) {
            RequestDefinition createNumberMaskingCredentialsDefinition =
                    createNumberMaskingCredentialsDefinition(numberMaskingCredentialsBody);
            return apiClient.executeAsync(
                    createNumberMaskingCredentialsDefinition,
                    new TypeReference<NumberMaskingCredentialsResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create number masking credentials.
     * <p>
     * This method allows you to create Voice number masking credentials.
     *
     * @param numberMaskingCredentialsBody  (required)
     * @return CreateNumberMaskingCredentialsRequest
     */
    public CreateNumberMaskingCredentialsRequest createNumberMaskingCredentials(
            NumberMaskingCredentialsBody numberMaskingCredentialsBody) {
        return new CreateNumberMaskingCredentialsRequest(numberMaskingCredentialsBody);
    }

    private RequestDefinition deleteNumberMaskingConfigurationDefinition(String key) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/voice/masking/2/config/{key}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (key != null) {
            builder.addPathParameter(new Parameter("key", key));
        }
        return builder.build();
    }

    /**
     * deleteNumberMaskingConfiguration request builder class.
     */
    public class DeleteNumberMaskingConfigurationRequest {
        private final String key;

        private DeleteNumberMaskingConfigurationRequest(String key) {
            this.key = Objects.requireNonNull(key, "The required parameter 'key' is missing.");
        }

        /**
         * Executes the deleteNumberMaskingConfiguration request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteNumberMaskingConfigurationDefinition =
                    deleteNumberMaskingConfigurationDefinition(key);
            apiClient.execute(deleteNumberMaskingConfigurationDefinition);
        }

        /**
         * Executes the deleteNumberMaskingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteNumberMaskingConfigurationDefinition =
                    deleteNumberMaskingConfigurationDefinition(key);
            return apiClient.executeAsync(deleteNumberMaskingConfigurationDefinition, callback);
        }
    }

    /**
     * Delete number masking configuration.
     * <p>
     * This method allows you to delete a Voice number masking configuration.
     *
     * @param key Masking configuration identifier. (required)
     * @return DeleteNumberMaskingConfigurationRequest
     */
    public DeleteNumberMaskingConfigurationRequest deleteNumberMaskingConfiguration(String key) {
        return new DeleteNumberMaskingConfigurationRequest(key);
    }

    private RequestDefinition deleteNumberMaskingCredentialsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/voice/masking/2/credentials")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * deleteNumberMaskingCredentials request builder class.
     */
    public class DeleteNumberMaskingCredentialsRequest {

        private DeleteNumberMaskingCredentialsRequest() {}

        /**
         * Executes the deleteNumberMaskingCredentials request.
         *
         * @return Object The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public Object execute() throws ApiException {
            RequestDefinition deleteNumberMaskingCredentialsDefinition = deleteNumberMaskingCredentialsDefinition();
            return apiClient.execute(
                    deleteNumberMaskingCredentialsDefinition, new TypeReference<Object>() {}.getType());
        }

        /**
         * Executes the deleteNumberMaskingCredentials request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Object> callback) {
            RequestDefinition deleteNumberMaskingCredentialsDefinition = deleteNumberMaskingCredentialsDefinition();
            return apiClient.executeAsync(
                    deleteNumberMaskingCredentialsDefinition, new TypeReference<Object>() {}.getType(), callback);
        }
    }

    /**
     * Delete number masking credentials.
     * <p>
     * This method allows you to delete Voice number masking credentials.
     *
     * @return DeleteNumberMaskingCredentialsRequest
     */
    public DeleteNumberMaskingCredentialsRequest deleteNumberMaskingCredentials() {
        return new DeleteNumberMaskingCredentialsRequest();
    }

    private RequestDefinition getNumberMaskingConfigurationDefinition(String key) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/masking/2/config/{key}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (key != null) {
            builder.addPathParameter(new Parameter("key", key));
        }
        return builder.build();
    }

    /**
     * getNumberMaskingConfiguration request builder class.
     */
    public class GetNumberMaskingConfigurationRequest {
        private final String key;

        private GetNumberMaskingConfigurationRequest(String key) {
            this.key = Objects.requireNonNull(key, "The required parameter 'key' is missing.");
        }

        /**
         * Executes the getNumberMaskingConfiguration request.
         *
         * @return NumberMaskingSetupResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingSetupResponse execute() throws ApiException {
            RequestDefinition getNumberMaskingConfigurationDefinition = getNumberMaskingConfigurationDefinition(key);
            return apiClient.execute(
                    getNumberMaskingConfigurationDefinition,
                    new TypeReference<NumberMaskingSetupResponse>() {}.getType());
        }

        /**
         * Executes the getNumberMaskingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingSetupResponse> callback) {
            RequestDefinition getNumberMaskingConfigurationDefinition = getNumberMaskingConfigurationDefinition(key);
            return apiClient.executeAsync(
                    getNumberMaskingConfigurationDefinition,
                    new TypeReference<NumberMaskingSetupResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get number masking configuration.
     * <p>
     * This method allows you to get a Voice number masking configuration.
     *
     * @param key Masking configuration identifier. (required)
     * @return GetNumberMaskingConfigurationRequest
     */
    public GetNumberMaskingConfigurationRequest getNumberMaskingConfiguration(String key) {
        return new GetNumberMaskingConfigurationRequest(key);
    }

    private RequestDefinition getNumberMaskingConfigurationsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/masking/2/config")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * getNumberMaskingConfigurations request builder class.
     */
    public class GetNumberMaskingConfigurationsRequest {

        private GetNumberMaskingConfigurationsRequest() {}

        /**
         * Executes the getNumberMaskingConfigurations request.
         *
         * @return List&lt;NumberMaskingSetupResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<NumberMaskingSetupResponse> execute() throws ApiException {
            RequestDefinition getNumberMaskingConfigurationsDefinition = getNumberMaskingConfigurationsDefinition();
            return apiClient.execute(
                    getNumberMaskingConfigurationsDefinition,
                    new TypeReference<List<NumberMaskingSetupResponse>>() {}.getType());
        }

        /**
         * Executes the getNumberMaskingConfigurations request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<NumberMaskingSetupResponse>> callback) {
            RequestDefinition getNumberMaskingConfigurationsDefinition = getNumberMaskingConfigurationsDefinition();
            return apiClient.executeAsync(
                    getNumberMaskingConfigurationsDefinition,
                    new TypeReference<List<NumberMaskingSetupResponse>>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get number masking configurations.
     * <p>
     * This method allows you to get all voice number masking configurations.
     *
     * @return GetNumberMaskingConfigurationsRequest
     */
    public GetNumberMaskingConfigurationsRequest getNumberMaskingConfigurations() {
        return new GetNumberMaskingConfigurationsRequest();
    }

    private RequestDefinition getNumberMaskingCredentialsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/masking/2/credentials")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * getNumberMaskingCredentials request builder class.
     */
    public class GetNumberMaskingCredentialsRequest {

        private GetNumberMaskingCredentialsRequest() {}

        /**
         * Executes the getNumberMaskingCredentials request.
         *
         * @return NumberMaskingCredentialsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingCredentialsResponse execute() throws ApiException {
            RequestDefinition getNumberMaskingCredentialsDefinition = getNumberMaskingCredentialsDefinition();
            return apiClient.execute(
                    getNumberMaskingCredentialsDefinition,
                    new TypeReference<NumberMaskingCredentialsResponse>() {}.getType());
        }

        /**
         * Executes the getNumberMaskingCredentials request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingCredentialsResponse> callback) {
            RequestDefinition getNumberMaskingCredentialsDefinition = getNumberMaskingCredentialsDefinition();
            return apiClient.executeAsync(
                    getNumberMaskingCredentialsDefinition,
                    new TypeReference<NumberMaskingCredentialsResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get number masking credentials.
     * <p>
     * This method allows you to get Voice number masking credentials.
     *
     * @return GetNumberMaskingCredentialsRequest
     */
    public GetNumberMaskingCredentialsRequest getNumberMaskingCredentials() {
        return new GetNumberMaskingCredentialsRequest();
    }

    private RequestDefinition updateNumberMaskingConfigurationDefinition(
            String key, NumberMaskingSetupBody numberMaskingSetupBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/voice/masking/2/config/{key}")
                .body(numberMaskingSetupBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (key != null) {
            builder.addPathParameter(new Parameter("key", key));
        }
        return builder.build();
    }

    /**
     * updateNumberMaskingConfiguration request builder class.
     */
    public class UpdateNumberMaskingConfigurationRequest {
        private final String key;
        private final NumberMaskingSetupBody numberMaskingSetupBody;

        private UpdateNumberMaskingConfigurationRequest(String key, NumberMaskingSetupBody numberMaskingSetupBody) {
            this.key = Objects.requireNonNull(key, "The required parameter 'key' is missing.");
            this.numberMaskingSetupBody = Objects.requireNonNull(
                    numberMaskingSetupBody, "The required parameter 'numberMaskingSetupBody' is missing.");
        }

        /**
         * Executes the updateNumberMaskingConfiguration request.
         *
         * @return NumberMaskingSetupResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingSetupResponse execute() throws ApiException {
            RequestDefinition updateNumberMaskingConfigurationDefinition =
                    updateNumberMaskingConfigurationDefinition(key, numberMaskingSetupBody);
            return apiClient.execute(
                    updateNumberMaskingConfigurationDefinition,
                    new TypeReference<NumberMaskingSetupResponse>() {}.getType());
        }

        /**
         * Executes the updateNumberMaskingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingSetupResponse> callback) {
            RequestDefinition updateNumberMaskingConfigurationDefinition =
                    updateNumberMaskingConfigurationDefinition(key, numberMaskingSetupBody);
            return apiClient.executeAsync(
                    updateNumberMaskingConfigurationDefinition,
                    new TypeReference<NumberMaskingSetupResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update number masking configuration.
     * <p>
     * This method allows you to update a Voice number masking configuration.
     *
     * @param key Masking configuration identifier. (required)
     * @param numberMaskingSetupBody  (required)
     * @return UpdateNumberMaskingConfigurationRequest
     */
    public UpdateNumberMaskingConfigurationRequest updateNumberMaskingConfiguration(
            String key, NumberMaskingSetupBody numberMaskingSetupBody) {
        return new UpdateNumberMaskingConfigurationRequest(key, numberMaskingSetupBody);
    }

    private RequestDefinition updateNumberMaskingCredentialsDefinition(
            NumberMaskingCredentialsBody numberMaskingCredentialsBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/voice/masking/2/credentials")
                .body(numberMaskingCredentialsBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * updateNumberMaskingCredentials request builder class.
     */
    public class UpdateNumberMaskingCredentialsRequest {
        private final NumberMaskingCredentialsBody numberMaskingCredentialsBody;

        private UpdateNumberMaskingCredentialsRequest(NumberMaskingCredentialsBody numberMaskingCredentialsBody) {
            this.numberMaskingCredentialsBody = Objects.requireNonNull(
                    numberMaskingCredentialsBody, "The required parameter 'numberMaskingCredentialsBody' is missing.");
        }

        /**
         * Executes the updateNumberMaskingCredentials request.
         *
         * @return NumberMaskingCredentialsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingCredentialsResponse execute() throws ApiException {
            RequestDefinition updateNumberMaskingCredentialsDefinition =
                    updateNumberMaskingCredentialsDefinition(numberMaskingCredentialsBody);
            return apiClient.execute(
                    updateNumberMaskingCredentialsDefinition,
                    new TypeReference<NumberMaskingCredentialsResponse>() {}.getType());
        }

        /**
         * Executes the updateNumberMaskingCredentials request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingCredentialsResponse> callback) {
            RequestDefinition updateNumberMaskingCredentialsDefinition =
                    updateNumberMaskingCredentialsDefinition(numberMaskingCredentialsBody);
            return apiClient.executeAsync(
                    updateNumberMaskingCredentialsDefinition,
                    new TypeReference<NumberMaskingCredentialsResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update number masking credentials.
     * <p>
     * This method allows you to update Voice number masking credentials.
     *
     * @param numberMaskingCredentialsBody  (required)
     * @return UpdateNumberMaskingCredentialsRequest
     */
    public UpdateNumberMaskingCredentialsRequest updateNumberMaskingCredentials(
            NumberMaskingCredentialsBody numberMaskingCredentialsBody) {
        return new UpdateNumberMaskingCredentialsRequest(numberMaskingCredentialsBody);
    }

    private RequestDefinition uploadAudioFilesDefinition(NumberMaskingUploadBody numberMaskingUploadBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/voice/masking/1/upload")
                .body(numberMaskingUploadBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * uploadAudioFiles request builder class.
     */
    public class UploadAudioFilesRequest {
        private final NumberMaskingUploadBody numberMaskingUploadBody;

        private UploadAudioFilesRequest(NumberMaskingUploadBody numberMaskingUploadBody) {
            this.numberMaskingUploadBody = Objects.requireNonNull(
                    numberMaskingUploadBody, "The required parameter 'numberMaskingUploadBody' is missing.");
        }

        /**
         * Executes the uploadAudioFiles request.
         *
         * @return NumberMaskingUploadResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberMaskingUploadResponse execute() throws ApiException {
            RequestDefinition uploadAudioFilesDefinition = uploadAudioFilesDefinition(numberMaskingUploadBody);
            return apiClient.execute(
                    uploadAudioFilesDefinition, new TypeReference<NumberMaskingUploadResponse>() {}.getType());
        }

        /**
         * Executes the uploadAudioFiles request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberMaskingUploadResponse> callback) {
            RequestDefinition uploadAudioFilesDefinition = uploadAudioFilesDefinition(numberMaskingUploadBody);
            return apiClient.executeAsync(
                    uploadAudioFilesDefinition,
                    new TypeReference<NumberMaskingUploadResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Upload audio files.
     * <p>
     * This method allows uploading audio files that can be used on Infobip Voice platform. The method accepts either a URL or an uploaded audio file in the request body. Using both or neither will cause the request to be rejected.
     *
     * @param numberMaskingUploadBody  (required)
     * @return UploadAudioFilesRequest
     */
    public UploadAudioFilesRequest uploadAudioFiles(NumberMaskingUploadBody numberMaskingUploadBody) {
        return new UploadAudioFilesRequest(numberMaskingUploadBody);
    }
}
