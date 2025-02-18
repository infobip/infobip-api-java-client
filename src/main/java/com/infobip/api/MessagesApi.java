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
import com.infobip.model.MessageResponse;
import com.infobip.model.MessagesApiEventRequest;
import com.infobip.model.MessagesApiRequest;
import com.infobip.model.MessagesApiValidationOkResponse;
import java.util.Objects;

/**
 * Represents MessagesApi API client.
 */
public class MessagesApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of MessagesApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public MessagesApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition sendMessagesApiEventsDefinition(MessagesApiEventRequest messagesApiEventRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/messages-api/1/events")
                .body(messagesApiEventRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendMessagesApiEvents request builder class.
     */
    public class SendMessagesApiEventsRequest {
        private final MessagesApiEventRequest messagesApiEventRequest;

        private SendMessagesApiEventsRequest(MessagesApiEventRequest messagesApiEventRequest) {
            this.messagesApiEventRequest = Objects.requireNonNull(
                    messagesApiEventRequest, "The required parameter 'messagesApiEventRequest' is missing.");
        }

        /**
         * Executes the sendMessagesApiEvents request.
         *
         * @return MessageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MessageResponse execute() throws ApiException {
            RequestDefinition sendMessagesApiEventsDefinition =
                    sendMessagesApiEventsDefinition(messagesApiEventRequest);
            return apiClient.execute(
                    sendMessagesApiEventsDefinition, new TypeReference<MessageResponse>() {}.getType());
        }

        /**
         * Executes the sendMessagesApiEvents request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MessageResponse> callback) {
            RequestDefinition sendMessagesApiEventsDefinition =
                    sendMessagesApiEventsDefinition(messagesApiEventRequest);
            return apiClient.executeAsync(
                    sendMessagesApiEventsDefinition, new TypeReference<MessageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send a Messages API event.
     * <p>
     * Send one or more events to multiple recipients.&lt;br/&gt;An event is an interaction with end-user&#39;s device which does not impact messaging content of conversation.&lt;br/&gt;Examples of events are: TYPING_STARTED, TYPING_STOPPED.
     *
     * @param messagesApiEventRequest  (required)
     * @return SendMessagesApiEventsRequest
     * @see <a href="https://www.infobip.com/docs/messages-api">Learn more about the Messages API and use cases</a>
     */
    public SendMessagesApiEventsRequest sendMessagesApiEvents(MessagesApiEventRequest messagesApiEventRequest) {
        return new SendMessagesApiEventsRequest(messagesApiEventRequest);
    }

    private RequestDefinition sendMessagesApiMessageDefinition(MessagesApiRequest messagesApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/messages-api/1/messages")
                .body(messagesApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendMessagesApiMessage request builder class.
     */
    public class SendMessagesApiMessageRequest {
        private final MessagesApiRequest messagesApiRequest;

        private SendMessagesApiMessageRequest(MessagesApiRequest messagesApiRequest) {
            this.messagesApiRequest = Objects.requireNonNull(
                    messagesApiRequest, "The required parameter 'messagesApiRequest' is missing.");
        }

        /**
         * Executes the sendMessagesApiMessage request.
         *
         * @return MessageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MessageResponse execute() throws ApiException {
            RequestDefinition sendMessagesApiMessageDefinition = sendMessagesApiMessageDefinition(messagesApiRequest);
            return apiClient.execute(
                    sendMessagesApiMessageDefinition, new TypeReference<MessageResponse>() {}.getType());
        }

        /**
         * Executes the sendMessagesApiMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MessageResponse> callback) {
            RequestDefinition sendMessagesApiMessageDefinition = sendMessagesApiMessageDefinition(messagesApiRequest);
            return apiClient.executeAsync(
                    sendMessagesApiMessageDefinition, new TypeReference<MessageResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send a Messages API message.
     * <p>
     * Send messages at scale through multiple channels, utilizing various message types.
     *
     * @param messagesApiRequest  (required)
     * @return SendMessagesApiMessageRequest
     * @see <a href="https://www.infobip.com/docs/messages-api">Learn more about the Messages API and use cases</a>
     */
    public SendMessagesApiMessageRequest sendMessagesApiMessage(MessagesApiRequest messagesApiRequest) {
        return new SendMessagesApiMessageRequest(messagesApiRequest);
    }

    private RequestDefinition validateMessagesApiMessageDefinition(MessagesApiRequest messagesApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/messages-api/1/messages/validate")
                .body(messagesApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * validateMessagesApiMessage request builder class.
     */
    public class ValidateMessagesApiMessageRequest {
        private final MessagesApiRequest messagesApiRequest;

        private ValidateMessagesApiMessageRequest(MessagesApiRequest messagesApiRequest) {
            this.messagesApiRequest = Objects.requireNonNull(
                    messagesApiRequest, "The required parameter 'messagesApiRequest' is missing.");
        }

        /**
         * Executes the validateMessagesApiMessage request.
         *
         * @return MessagesApiValidationOkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public MessagesApiValidationOkResponse execute() throws ApiException {
            RequestDefinition validateMessagesApiMessageDefinition =
                    validateMessagesApiMessageDefinition(messagesApiRequest);
            return apiClient.execute(
                    validateMessagesApiMessageDefinition,
                    new TypeReference<MessagesApiValidationOkResponse>() {}.getType());
        }

        /**
         * Executes the validateMessagesApiMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<MessagesApiValidationOkResponse> callback) {
            RequestDefinition validateMessagesApiMessageDefinition =
                    validateMessagesApiMessageDefinition(messagesApiRequest);
            return apiClient.executeAsync(
                    validateMessagesApiMessageDefinition,
                    new TypeReference<MessagesApiValidationOkResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Validate a Messages API message.
     * <p>
     * Perform a detailed validation of Messages API messages. This endpoint executes more specific checks than the &#x60;/messages&#x60; endpoint such as: possible channel-specific validations, verification of each failover step and unknown fields. Returns &#x60;200 OK&#x60; when the request would be accepted by the platform or &#x60;400 BAD_REQUEST&#x60; when it may fail at any point. Use this endpoint to validate messages before sending them to catch potential issues early.
     *
     * @param messagesApiRequest  (required)
     * @return ValidateMessagesApiMessageRequest
     * @see <a href="https://www.infobip.com/docs/messages-api">Learn more about the Messages API and use cases</a>
     */
    public ValidateMessagesApiMessageRequest validateMessagesApiMessage(MessagesApiRequest messagesApiRequest) {
        return new ValidateMessagesApiMessageRequest(messagesApiRequest);
    }
}
