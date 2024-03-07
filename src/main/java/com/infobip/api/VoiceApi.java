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
import com.infobip.model.CallsAdvancedBody;
import com.infobip.model.CallsBulkRequest;
import com.infobip.model.CallsBulkResponse;
import com.infobip.model.CallsBulkStatusResponse;
import com.infobip.model.CallsGetVoicesResponse;
import com.infobip.model.CallsMultiBody;
import com.infobip.model.CallsSingleBody;
import com.infobip.model.CallsUpdateStatusRequest;
import com.infobip.model.CallsVoiceResponse;
import java.util.Objects;

/**
 * Represents VoiceApi API client.
 */
public class VoiceApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of VoiceApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public VoiceApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition getSentBulksDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/tts/3/bulks")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getSentBulks request builder class.
     */
    public class GetSentBulksRequest {
        private final String bulkId;

        private GetSentBulksRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getSentBulks request.
         *
         * @return CallsBulkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsBulkResponse execute() throws ApiException {
            RequestDefinition getSentBulksDefinition = getSentBulksDefinition(bulkId);
            return apiClient.execute(getSentBulksDefinition, new TypeReference<CallsBulkResponse>() {}.getType());
        }

        /**
         * Executes the getSentBulks request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsBulkResponse> callback) {
            RequestDefinition getSentBulksDefinition = getSentBulksDefinition(bulkId);
            return apiClient.executeAsync(
                    getSentBulksDefinition, new TypeReference<CallsBulkResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get sent bulks.
     * <p>
     * This method will return information about the scheduled time for a unique bulk message. Canceling and rescheduling are supported only when the Fully featured voice message request contains at least one message and the message bulkId is unique.
     *
     * @param bulkId Unique ID of the bulk. (required)
     * @return GetSentBulksRequest
     */
    public GetSentBulksRequest getSentBulks(String bulkId) {
        return new GetSentBulksRequest(bulkId);
    }

    private RequestDefinition getSentBulksStatusDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/tts/3/bulks/status")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getSentBulksStatus request builder class.
     */
    public class GetSentBulksStatusRequest {
        private final String bulkId;

        private GetSentBulksStatusRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getSentBulksStatus request.
         *
         * @return CallsBulkStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsBulkStatusResponse execute() throws ApiException {
            RequestDefinition getSentBulksStatusDefinition = getSentBulksStatusDefinition(bulkId);
            return apiClient.execute(
                    getSentBulksStatusDefinition, new TypeReference<CallsBulkStatusResponse>() {}.getType());
        }

        /**
         * Executes the getSentBulksStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsBulkStatusResponse> callback) {
            RequestDefinition getSentBulksStatusDefinition = getSentBulksStatusDefinition(bulkId);
            return apiClient.executeAsync(
                    getSentBulksStatusDefinition, new TypeReference<CallsBulkStatusResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get sent bulk&#39;s status.
     * <p>
     * This method allows you to get status of scheduled TTS bulk.
     *
     * @param bulkId Unique ID of the bulk. (required)
     * @return GetSentBulksStatusRequest
     */
    public GetSentBulksStatusRequest getSentBulksStatus(String bulkId) {
        return new GetSentBulksStatusRequest(bulkId);
    }

    private RequestDefinition getVoicesDefinition(String language, Boolean includeNeural) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/tts/3/voices/{language}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (language != null) {
            builder.addPathParameter(new Parameter("language", language));
        }
        if (includeNeural != null) {
            builder.addQueryParameter(new Parameter("includeNeural", includeNeural));
        }
        return builder.build();
    }

    /**
     * getVoices request builder class.
     */
    public class GetVoicesRequest {
        private final String language;
        private Boolean includeNeural;

        private GetVoicesRequest(String language) {
            this.language = Objects.requireNonNull(language, "The required parameter 'language' is missing.");
        }

        /**
         * Sets includeNeural.
         *
         * @param includeNeural Indicates whether neural voices should be included in the response. If set to &#x60;false&#x60; or omitted, only standard voices will be included in the response. If set to &#x60;true&#x60;, both standard and neural voices will be included in the response.  (optional, default to false)
         * @return GetVoicesRequest
         */
        public GetVoicesRequest includeNeural(Boolean includeNeural) {
            this.includeNeural = includeNeural;
            return this;
        }

        /**
         * Executes the getVoices request.
         *
         * @return CallsGetVoicesResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsGetVoicesResponse execute() throws ApiException {
            RequestDefinition getVoicesDefinition = getVoicesDefinition(language, includeNeural);
            return apiClient.execute(getVoicesDefinition, new TypeReference<CallsGetVoicesResponse>() {}.getType());
        }

        /**
         * Executes the getVoices request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsGetVoicesResponse> callback) {
            RequestDefinition getVoicesDefinition = getVoicesDefinition(language, includeNeural);
            return apiClient.executeAsync(
                    getVoicesDefinition, new TypeReference<CallsGetVoicesResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get Voices.
     * <p>
     * This method allows you to retrieve all voices for the given language
     *
     * @param language Represents the language abbreviation. (e.g. &#x60;en&#x60;). You can find the list of supported languages in corresponding section for sending voice message. (required)
     * @return GetVoicesRequest
     */
    public GetVoicesRequest getVoices(String language) {
        return new GetVoicesRequest(language);
    }

    private RequestDefinition manageSentBulksStatusDefinition(
            String bulkId, CallsUpdateStatusRequest callsUpdateStatusRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/tts/3/bulks/status")
                .body(callsUpdateStatusRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * manageSentBulksStatus request builder class.
     */
    public class ManageSentBulksStatusRequest {
        private final String bulkId;
        private final CallsUpdateStatusRequest callsUpdateStatusRequest;

        private ManageSentBulksStatusRequest(String bulkId, CallsUpdateStatusRequest callsUpdateStatusRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.callsUpdateStatusRequest = Objects.requireNonNull(
                    callsUpdateStatusRequest, "The required parameter 'callsUpdateStatusRequest' is missing.");
        }

        /**
         * Executes the manageSentBulksStatus request.
         *
         * @return CallsBulkStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsBulkStatusResponse execute() throws ApiException {
            RequestDefinition manageSentBulksStatusDefinition =
                    manageSentBulksStatusDefinition(bulkId, callsUpdateStatusRequest);
            return apiClient.execute(
                    manageSentBulksStatusDefinition, new TypeReference<CallsBulkStatusResponse>() {}.getType());
        }

        /**
         * Executes the manageSentBulksStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsBulkStatusResponse> callback) {
            RequestDefinition manageSentBulksStatusDefinition =
                    manageSentBulksStatusDefinition(bulkId, callsUpdateStatusRequest);
            return apiClient.executeAsync(
                    manageSentBulksStatusDefinition,
                    new TypeReference<CallsBulkStatusResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Manage sent bulk&#39;s status.
     * <p>
     * This method allows you to manage statuses of scheduled TTS bulk. Messages scheduled with the sendAt or sending speed parameter can be paused, resumed or canceled by changing the message status, or rescheduled using the bulkId parameter as an identifier. Only voice messages that were not already sent can be canceled.
     *
     * @param bulkId Unique ID of the bulk. (required)
     * @param callsUpdateStatusRequest  (required)
     * @return ManageSentBulksStatusRequest
     */
    public ManageSentBulksStatusRequest manageSentBulksStatus(
            String bulkId, CallsUpdateStatusRequest callsUpdateStatusRequest) {
        return new ManageSentBulksStatusRequest(bulkId, callsUpdateStatusRequest);
    }

    private RequestDefinition rescheduleSentBulkDefinition(String bulkId, CallsBulkRequest callsBulkRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/tts/3/bulks")
                .body(callsBulkRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * rescheduleSentBulk request builder class.
     */
    public class RescheduleSentBulkRequest {
        private final String bulkId;
        private final CallsBulkRequest callsBulkRequest;

        private RescheduleSentBulkRequest(String bulkId, CallsBulkRequest callsBulkRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.callsBulkRequest =
                    Objects.requireNonNull(callsBulkRequest, "The required parameter 'callsBulkRequest' is missing.");
        }

        /**
         * Executes the rescheduleSentBulk request.
         *
         * @return CallsBulkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsBulkResponse execute() throws ApiException {
            RequestDefinition rescheduleSentBulkDefinition = rescheduleSentBulkDefinition(bulkId, callsBulkRequest);
            return apiClient.execute(rescheduleSentBulkDefinition, new TypeReference<CallsBulkResponse>() {}.getType());
        }

        /**
         * Executes the rescheduleSentBulk request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsBulkResponse> callback) {
            RequestDefinition rescheduleSentBulkDefinition = rescheduleSentBulkDefinition(bulkId, callsBulkRequest);
            return apiClient.executeAsync(
                    rescheduleSentBulkDefinition, new TypeReference<CallsBulkResponse>() {}.getType(), callback);
        }
    }

    /**
     * Reschedule sent bulk.
     * <p>
     * This method allows you to reschedule scheduled TTS bulk. Messages scheduled with the sendAt or Sending speed parameter can be paused, resumed or canceled by changing the message status, or rescheduled using the bulkId parameter as an identifier.
     *
     * @param bulkId Unique ID of the bulk. (required)
     * @param callsBulkRequest  (required)
     * @return RescheduleSentBulkRequest
     */
    public RescheduleSentBulkRequest rescheduleSentBulk(String bulkId, CallsBulkRequest callsBulkRequest) {
        return new RescheduleSentBulkRequest(bulkId, callsBulkRequest);
    }

    private RequestDefinition sendAdvancedVoiceTtsDefinition(CallsAdvancedBody callsAdvancedBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/tts/3/advanced")
                .body(callsAdvancedBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendAdvancedVoiceTts request builder class.
     */
    public class SendAdvancedVoiceTtsRequest {
        private final CallsAdvancedBody callsAdvancedBody;

        private SendAdvancedVoiceTtsRequest(CallsAdvancedBody callsAdvancedBody) {
            this.callsAdvancedBody =
                    Objects.requireNonNull(callsAdvancedBody, "The required parameter 'callsAdvancedBody' is missing.");
        }

        /**
         * Executes the sendAdvancedVoiceTts request.
         *
         * @return CallsVoiceResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsVoiceResponse execute() throws ApiException {
            RequestDefinition sendAdvancedVoiceTtsDefinition = sendAdvancedVoiceTtsDefinition(callsAdvancedBody);
            return apiClient.execute(
                    sendAdvancedVoiceTtsDefinition, new TypeReference<CallsVoiceResponse>() {}.getType());
        }

        /**
         * Executes the sendAdvancedVoiceTts request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsVoiceResponse> callback) {
            RequestDefinition sendAdvancedVoiceTtsDefinition = sendAdvancedVoiceTtsDefinition(callsAdvancedBody);
            return apiClient.executeAsync(
                    sendAdvancedVoiceTtsDefinition, new TypeReference<CallsVoiceResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send advanced voice message.
     * <p>
     * This method allows you to send advanced voice messages to one or more destination addresses.
     *
     * @param callsAdvancedBody  (required)
     * @return SendAdvancedVoiceTtsRequest
     * @see <a href="https://www.infobip.com/docs/voice-and-video/voice-messages">Learn more about voice messages</a>
     */
    public SendAdvancedVoiceTtsRequest sendAdvancedVoiceTts(CallsAdvancedBody callsAdvancedBody) {
        return new SendAdvancedVoiceTtsRequest(callsAdvancedBody);
    }

    private RequestDefinition sendMultipleVoiceTtsDefinition(CallsMultiBody callsMultiBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/tts/3/multi")
                .body(callsMultiBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendMultipleVoiceTts request builder class.
     */
    public class SendMultipleVoiceTtsRequest {
        private final CallsMultiBody callsMultiBody;

        private SendMultipleVoiceTtsRequest(CallsMultiBody callsMultiBody) {
            this.callsMultiBody =
                    Objects.requireNonNull(callsMultiBody, "The required parameter 'callsMultiBody' is missing.");
        }

        /**
         * Executes the sendMultipleVoiceTts request.
         *
         * @return CallsVoiceResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsVoiceResponse execute() throws ApiException {
            RequestDefinition sendMultipleVoiceTtsDefinition = sendMultipleVoiceTtsDefinition(callsMultiBody);
            return apiClient.execute(
                    sendMultipleVoiceTtsDefinition, new TypeReference<CallsVoiceResponse>() {}.getType());
        }

        /**
         * Executes the sendMultipleVoiceTts request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsVoiceResponse> callback) {
            RequestDefinition sendMultipleVoiceTtsDefinition = sendMultipleVoiceTtsDefinition(callsMultiBody);
            return apiClient.executeAsync(
                    sendMultipleVoiceTtsDefinition, new TypeReference<CallsVoiceResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send multiple voice messages.
     * <p>
     * This method allows you to send multiple voice messages to one or more destination addresses.
     *
     * @param callsMultiBody  (required)
     * @return SendMultipleVoiceTtsRequest
     * @see <a href="https://www.infobip.com/docs/voice-and-video/voice-messages">Learn more about voice messages</a>
     */
    public SendMultipleVoiceTtsRequest sendMultipleVoiceTts(CallsMultiBody callsMultiBody) {
        return new SendMultipleVoiceTtsRequest(callsMultiBody);
    }

    private RequestDefinition sendSingleVoiceTtsDefinition(CallsSingleBody callsSingleBody) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/tts/3/single")
                .body(callsSingleBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendSingleVoiceTts request builder class.
     */
    public class SendSingleVoiceTtsRequest {
        private final CallsSingleBody callsSingleBody;

        private SendSingleVoiceTtsRequest(CallsSingleBody callsSingleBody) {
            this.callsSingleBody =
                    Objects.requireNonNull(callsSingleBody, "The required parameter 'callsSingleBody' is missing.");
        }

        /**
         * Executes the sendSingleVoiceTts request.
         *
         * @return CallsVoiceResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsVoiceResponse execute() throws ApiException {
            RequestDefinition sendSingleVoiceTtsDefinition = sendSingleVoiceTtsDefinition(callsSingleBody);
            return apiClient.execute(
                    sendSingleVoiceTtsDefinition, new TypeReference<CallsVoiceResponse>() {}.getType());
        }

        /**
         * Executes the sendSingleVoiceTts request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsVoiceResponse> callback) {
            RequestDefinition sendSingleVoiceTtsDefinition = sendSingleVoiceTtsDefinition(callsSingleBody);
            return apiClient.executeAsync(
                    sendSingleVoiceTtsDefinition, new TypeReference<CallsVoiceResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send single voice message.
     * <p>
     * This method allows you to send single voice message to one or more destination addresses.
     *
     * @param callsSingleBody  (required)
     * @return SendSingleVoiceTtsRequest
     * @see <a href="https://www.infobip.com/docs/voice-and-video/voice-messages">Learn more about voice messages</a>
     */
    public SendSingleVoiceTtsRequest sendSingleVoiceTts(CallsSingleBody callsSingleBody) {
        return new SendSingleVoiceTtsRequest(callsSingleBody);
    }
}
