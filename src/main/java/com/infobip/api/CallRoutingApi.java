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
import com.infobip.model.CallRoutingRouteRequest;
import com.infobip.model.CallRoutingRouteResponse;
import com.infobip.model.CallRoutingRouteResponsePage;
import java.util.Objects;

/**
 * Represents CallRoutingApi API client.
 */
public class CallRoutingApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of CallRoutingApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public CallRoutingApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition createCallRouteDefinition(CallRoutingRouteRequest callRoutingRouteRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/callrouting/1/routes")
                .body(callRoutingRouteRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createCallRoute request builder class.
     */
    public class CreateCallRouteRequest {
        private final CallRoutingRouteRequest callRoutingRouteRequest;

        private CreateCallRouteRequest(CallRoutingRouteRequest callRoutingRouteRequest) {
            this.callRoutingRouteRequest = Objects.requireNonNull(
                    callRoutingRouteRequest, "The required parameter 'callRoutingRouteRequest' is missing.");
        }

        /**
         * Executes the createCallRoute request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition createCallRouteDefinition = createCallRouteDefinition(callRoutingRouteRequest);
            return apiClient.execute(
                    createCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the createCallRoute request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition createCallRouteDefinition = createCallRouteDefinition(callRoutingRouteRequest);
            return apiClient.executeAsync(
                    createCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType(), callback);
        }
    }

    /**
     * Create a call route.
     * <p>
     * Create a new call route.
     *
     * @param callRoutingRouteRequest  (required)
     * @return CreateCallRouteRequest
     */
    public CreateCallRouteRequest createCallRoute(CallRoutingRouteRequest callRoutingRouteRequest) {
        return new CreateCallRouteRequest(callRoutingRouteRequest);
    }

    private RequestDefinition deleteCallRouteDefinition(String routeId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/callrouting/1/routes/{routeId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (routeId != null) {
            builder.addPathParameter(new Parameter("routeId", routeId));
        }
        return builder.build();
    }

    /**
     * deleteCallRoute request builder class.
     */
    public class DeleteCallRouteRequest {
        private final String routeId;

        private DeleteCallRouteRequest(String routeId) {
            this.routeId = Objects.requireNonNull(routeId, "The required parameter 'routeId' is missing.");
        }

        /**
         * Executes the deleteCallRoute request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition deleteCallRouteDefinition = deleteCallRouteDefinition(routeId);
            return apiClient.execute(
                    deleteCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the deleteCallRoute request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition deleteCallRouteDefinition = deleteCallRouteDefinition(routeId);
            return apiClient.executeAsync(
                    deleteCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType(), callback);
        }
    }

    /**
     * Delete a call route.
     * <p>
     * Delete an existing call route.
     *
     * @param routeId Route identifier (required)
     * @return DeleteCallRouteRequest
     */
    public DeleteCallRouteRequest deleteCallRoute(String routeId) {
        return new DeleteCallRouteRequest(routeId);
    }

    private RequestDefinition getCallRouteDefinition(String routeId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/callrouting/1/routes/{routeId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (routeId != null) {
            builder.addPathParameter(new Parameter("routeId", routeId));
        }
        return builder.build();
    }

    /**
     * getCallRoute request builder class.
     */
    public class GetCallRouteRequest {
        private final String routeId;

        private GetCallRouteRequest(String routeId) {
            this.routeId = Objects.requireNonNull(routeId, "The required parameter 'routeId' is missing.");
        }

        /**
         * Executes the getCallRoute request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition getCallRouteDefinition = getCallRouteDefinition(routeId);
            return apiClient.execute(
                    getCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the getCallRoute request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition getCallRouteDefinition = getCallRouteDefinition(routeId);
            return apiClient.executeAsync(
                    getCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get a call route.
     * <p>
     * Get an existing call route.
     *
     * @param routeId Route identifier (required)
     * @return GetCallRouteRequest
     */
    public GetCallRouteRequest getCallRoute(String routeId) {
        return new GetCallRouteRequest(routeId);
    }

    private RequestDefinition getCallRoutesDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/callrouting/1/routes")
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
     * getCallRoutes request builder class.
     */
    public class GetCallRoutesRequest {
        private Integer page;
        private Integer size;

        private GetCallRoutesRequest() {}

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetCallRoutesRequest
         */
        public GetCallRoutesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetCallRoutesRequest
         */
        public GetCallRoutesRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getCallRoutes request.
         *
         * @return CallRoutingRouteResponsePage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponsePage execute() throws ApiException {
            RequestDefinition getCallRoutesDefinition = getCallRoutesDefinition(page, size);
            return apiClient.execute(
                    getCallRoutesDefinition, new TypeReference<CallRoutingRouteResponsePage>() {}.getType());
        }

        /**
         * Executes the getCallRoutes request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponsePage> callback) {
            RequestDefinition getCallRoutesDefinition = getCallRoutesDefinition(page, size);
            return apiClient.executeAsync(
                    getCallRoutesDefinition, new TypeReference<CallRoutingRouteResponsePage>() {}.getType(), callback);
        }
    }

    /**
     * Get call routes.
     * <p>
     * Get existing call routes with pagination.
     *
     * @return GetCallRoutesRequest
     */
    public GetCallRoutesRequest getCallRoutes() {
        return new GetCallRoutesRequest();
    }

    private RequestDefinition updateCallRouteDefinition(
            String routeId, CallRoutingRouteRequest callRoutingRouteRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/callrouting/1/routes/{routeId}")
                .body(callRoutingRouteRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (routeId != null) {
            builder.addPathParameter(new Parameter("routeId", routeId));
        }
        return builder.build();
    }

    /**
     * updateCallRoute request builder class.
     */
    public class UpdateCallRouteRequest {
        private final String routeId;
        private final CallRoutingRouteRequest callRoutingRouteRequest;

        private UpdateCallRouteRequest(String routeId, CallRoutingRouteRequest callRoutingRouteRequest) {
            this.routeId = Objects.requireNonNull(routeId, "The required parameter 'routeId' is missing.");
            this.callRoutingRouteRequest = Objects.requireNonNull(
                    callRoutingRouteRequest, "The required parameter 'callRoutingRouteRequest' is missing.");
        }

        /**
         * Executes the updateCallRoute request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition updateCallRouteDefinition = updateCallRouteDefinition(routeId, callRoutingRouteRequest);
            return apiClient.execute(
                    updateCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the updateCallRoute request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition updateCallRouteDefinition = updateCallRouteDefinition(routeId, callRoutingRouteRequest);
            return apiClient.executeAsync(
                    updateCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update a call route.
     * <p>
     * Update an already existing call route. Fields that are not sent in the request body will take default values and overwrite existing ones.
     *
     * @param routeId Route identifier (required)
     * @param callRoutingRouteRequest  (required)
     * @return UpdateCallRouteRequest
     */
    public UpdateCallRouteRequest updateCallRoute(String routeId, CallRoutingRouteRequest callRoutingRouteRequest) {
        return new UpdateCallRouteRequest(routeId, callRoutingRouteRequest);
    }
}
