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
import com.infobip.model.RcsOutboundRequest;
import com.infobip.model.RcsOutboundResponse;
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

    private RequestDefinition sendRcsOutboundMessageDefinition(RcsOutboundRequest rcsOutboundRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/rcs/1/message/outbound")
                .body(rcsOutboundRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendRcsOutboundMessage request builder class.
     */
    public class SendRcsOutboundMessageRequest {
        private final RcsOutboundRequest rcsOutboundRequest;

        private SendRcsOutboundMessageRequest(RcsOutboundRequest rcsOutboundRequest) {
            this.rcsOutboundRequest = Objects.requireNonNull(
                    rcsOutboundRequest, "The required parameter 'rcsOutboundRequest' is missing.");
        }

        /**
         * Executes the sendRcsOutboundMessage request.
         *
         * @return RcsOutboundResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public RcsOutboundResponse execute() throws ApiException {
            RequestDefinition sendRcsOutboundMessageDefinition = sendRcsOutboundMessageDefinition(rcsOutboundRequest);
            return apiClient.execute(
                    sendRcsOutboundMessageDefinition, new TypeReference<RcsOutboundResponse>() {}.getType());
        }

        /**
         * Executes the sendRcsOutboundMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<RcsOutboundResponse> callback) {
            RequestDefinition sendRcsOutboundMessageDefinition = sendRcsOutboundMessageDefinition(rcsOutboundRequest);
            return apiClient.executeAsync(
                    sendRcsOutboundMessageDefinition,
                    new TypeReference<RcsOutboundResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send RCS outbound message.
     * <p>
     * Send Rich Communication Services (RCS) messages with advanced features like rich cards, carousels, and suggested actions.
     * RCS enables a richer messaging experience compared to traditional SMS.
     *
     * @param rcsOutboundRequest  (required)
     * @return SendRcsOutboundMessageRequest
     * @see <a href="https://www.infobip.com/docs/rcs">Learn more about RCS messaging</a>
     */
    public SendRcsOutboundMessageRequest sendRcsOutboundMessage(RcsOutboundRequest rcsOutboundRequest) {
        return new SendRcsOutboundMessageRequest(rcsOutboundRequest);
    }
}
