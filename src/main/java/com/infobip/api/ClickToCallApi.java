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
import com.infobip.model.CallsClickToCallMessageBody;
import com.infobip.model.CallsVoiceResponse;
import java.util.Objects;

/**
 * Represents ClickToCallApi API client.
 */
public class ClickToCallApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of ClickToCallApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public ClickToCallApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition sendClickToCallMessageDefinition(
            CallsClickToCallMessageBody callsClickToCallMessageBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/voice/ctc/1/send")
                .body(callsClickToCallMessageBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendClickToCallMessage request builder class.
     */
    public class SendClickToCallMessageRequest {
        private final CallsClickToCallMessageBody callsClickToCallMessageBody;

        private SendClickToCallMessageRequest(CallsClickToCallMessageBody callsClickToCallMessageBody) {
            this.callsClickToCallMessageBody = Objects.requireNonNull(
                    callsClickToCallMessageBody, "The required parameter 'callsClickToCallMessageBody' is missing.");
        }

        /**
         * Executes the sendClickToCallMessage request.
         *
         * @return CallsVoiceResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsVoiceResponse execute() throws ApiException {
            RequestDefinition sendClickToCallMessageDefinition =
                    sendClickToCallMessageDefinition(callsClickToCallMessageBody);
            return apiClient.execute(
                    sendClickToCallMessageDefinition, new TypeReference<CallsVoiceResponse>() {}.getType());
        }

        /**
         * Executes the sendClickToCallMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsVoiceResponse> callback) {
            RequestDefinition sendClickToCallMessageDefinition =
                    sendClickToCallMessageDefinition(callsClickToCallMessageBody);
            return apiClient.executeAsync(
                    sendClickToCallMessageDefinition, new TypeReference<CallsVoiceResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send click-to-call message.
     * <p>
     * This method allows you to send click-to-call voice messages.
     *
     * @param callsClickToCallMessageBody  (required)
     * @return SendClickToCallMessageRequest
     * @see <a href="https://www.infobip.com/docs/voice-and-video/click-to-call">Learn more about click-to-call</a>
     */
    public SendClickToCallMessageRequest sendClickToCallMessage(
            CallsClickToCallMessageBody callsClickToCallMessageBody) {
        return new SendClickToCallMessageRequest(callsClickToCallMessageBody);
    }
}
