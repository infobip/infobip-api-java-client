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
import com.infobip.RequestDefinition;
import com.infobip.model.CapabilityCheckRequest;
import com.infobip.model.CapabilityCheckResponse;
import java.util.Objects;

/**
 * Represents CapabilityCheckApi API client.
 */
public class CapabilityCheckApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of CapabilityCheckApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public CapabilityCheckApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition checkCapabilitiesDefinition(CapabilityCheckRequest capabilityCheckRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number/1/capability-check")
                .body(capabilityCheckRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * checkCapabilities request builder class.
     */
    public class CheckCapabilitiesRequest {
        private final CapabilityCheckRequest capabilityCheckRequest;

        private CheckCapabilitiesRequest(CapabilityCheckRequest capabilityCheckRequest) {
            this.capabilityCheckRequest = Objects.requireNonNull(
                    capabilityCheckRequest, "The required parameter 'capabilityCheckRequest' is missing.");
        }

        /**
         * Executes the checkCapabilities request.
         *
         * @return CapabilityCheckResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CapabilityCheckResponse execute() throws ApiException {
            RequestDefinition checkCapabilitiesDefinition = checkCapabilitiesDefinition(capabilityCheckRequest);
            return apiClient.execute(
                    checkCapabilitiesDefinition, new TypeReference<CapabilityCheckResponse>() {}.getType());
        }

        /**
         * Executes the checkCapabilities request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CapabilityCheckResponse> callback) {
            RequestDefinition checkCapabilitiesDefinition = checkCapabilitiesDefinition(capabilityCheckRequest);
            return apiClient.executeAsync(
                    checkCapabilitiesDefinition, new TypeReference<CapabilityCheckResponse>() {}.getType(), callback);
        }
    }

    /**
     * Check capabilities.
     * <p>
     * Check the capabilities of phone numbers to determine which channels and features are supported for each number.
     *
     * @param capabilityCheckRequest  (required)
     * @return CheckCapabilitiesRequest
     * @see <a href="https://www.infobip.com/docs">Learn more about Infobip capabilities</a>
     */
    public CheckCapabilitiesRequest checkCapabilities(CapabilityCheckRequest capabilityCheckRequest) {
        return new CheckCapabilitiesRequest(capabilityCheckRequest);
    }
}
