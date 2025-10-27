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
import com.infobip.model.CallsIpCoreGeneralStatus;
import com.infobip.model.CallsLaunchScenarioRequest;
import com.infobip.model.CallsLogsResponse;
import com.infobip.model.CallsMultiBody;
import com.infobip.model.CallsRecordedAudioFilesResponse;
import com.infobip.model.CallsReportResponse;
import com.infobip.model.CallsSearchResponse;
import com.infobip.model.CallsSingleBody;
import com.infobip.model.CallsUpdateScenarioRequest;
import com.infobip.model.CallsUpdateScenarioResponse;
import com.infobip.model.CallsUpdateStatusRequest;
import com.infobip.model.CallsVoiceResponse;
import java.io.File;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
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

    private RequestDefinition createAVoiceIvrScenarioDefinition(CallsUpdateScenarioRequest callsUpdateScenarioRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/voice/ivr/1/scenarios")
                .body(callsUpdateScenarioRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createAVoiceIvrScenario request builder class.
     */
    public class CreateAVoiceIvrScenarioRequest {
        private final CallsUpdateScenarioRequest callsUpdateScenarioRequest;

        private CreateAVoiceIvrScenarioRequest(CallsUpdateScenarioRequest callsUpdateScenarioRequest) {
            this.callsUpdateScenarioRequest = Objects.requireNonNull(
                    callsUpdateScenarioRequest, "The required parameter 'callsUpdateScenarioRequest' is missing.");
        }

        /**
         * Executes the createAVoiceIvrScenario request.
         *
         * @return CallsUpdateScenarioResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsUpdateScenarioResponse execute() throws ApiException {
            RequestDefinition createAVoiceIvrScenarioDefinition =
                    createAVoiceIvrScenarioDefinition(callsUpdateScenarioRequest);
            return apiClient.execute(
                    createAVoiceIvrScenarioDefinition, new TypeReference<CallsUpdateScenarioResponse>() {}.getType());
        }

        /**
         * Executes the createAVoiceIvrScenario request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsUpdateScenarioResponse> callback) {
            RequestDefinition createAVoiceIvrScenarioDefinition =
                    createAVoiceIvrScenarioDefinition(callsUpdateScenarioRequest);
            return apiClient.executeAsync(
                    createAVoiceIvrScenarioDefinition,
                    new TypeReference<CallsUpdateScenarioResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create Voice IVR Scenarios.
     * <p>
     * This method allows you to create a Voice IVR Scenario. The IVR scenario will be removed if not used for more than 1 year.
     *
     * @param callsUpdateScenarioRequest  (required)
     * @return CreateAVoiceIvrScenarioRequest
     */
    public CreateAVoiceIvrScenarioRequest createAVoiceIvrScenario(
            CallsUpdateScenarioRequest callsUpdateScenarioRequest) {
        return new CreateAVoiceIvrScenarioRequest(callsUpdateScenarioRequest);
    }

    private RequestDefinition deleteAVoiceIvrScenarioDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/voice/ivr/1/scenarios/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * deleteAVoiceIvrScenario request builder class.
     */
    public class DeleteAVoiceIvrScenarioRequest {
        private final String id;

        private DeleteAVoiceIvrScenarioRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the deleteAVoiceIvrScenario request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteAVoiceIvrScenarioDefinition = deleteAVoiceIvrScenarioDefinition(id);
            apiClient.execute(deleteAVoiceIvrScenarioDefinition);
        }

        /**
         * Executes the deleteAVoiceIvrScenario request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteAVoiceIvrScenarioDefinition = deleteAVoiceIvrScenarioDefinition(id);
            return apiClient.executeAsync(deleteAVoiceIvrScenarioDefinition, callback);
        }
    }

    /**
     * Delete Voice IVR Scenarios.
     * <p>
     * This method allows you to delete a Voice IVR Scenario.
     *
     * @param id Scenario identifier (for example E83E787CF2613450157ADA3476171E3F). (required)
     * @return DeleteAVoiceIvrScenarioRequest
     */
    public DeleteAVoiceIvrScenarioRequest deleteAVoiceIvrScenario(String id) {
        return new DeleteAVoiceIvrScenarioRequest(id);
    }

    private RequestDefinition downloadVoiceIvrRecordedFileDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/ivr/1/files/{id}")
                .requiresAuthentication(true)
                .accept("application/octet-stream");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * downloadVoiceIvrRecordedFile request builder class.
     */
    public class DownloadVoiceIvrRecordedFileRequest {
        private final String id;

        private DownloadVoiceIvrRecordedFileRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the downloadVoiceIvrRecordedFile request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition downloadVoiceIvrRecordedFileDefinition = downloadVoiceIvrRecordedFileDefinition(id);
            return apiClient.execute(downloadVoiceIvrRecordedFileDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the downloadVoiceIvrRecordedFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition downloadVoiceIvrRecordedFileDefinition = downloadVoiceIvrRecordedFileDefinition(id);
            return apiClient.executeAsync(
                    downloadVoiceIvrRecordedFileDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Download Voice IVR Recorded File..
     * <p>
     * This method allows you to download Voice IVR Recorded Audio File. The returned audio data is encoded as PCM 16bit 8kHz WAVE audio. The files are available on Infobip servers for 2 months.
     *
     * @param id File ID to download. (required)
     * @return DownloadVoiceIvrRecordedFileRequest
     */
    public DownloadVoiceIvrRecordedFileRequest downloadVoiceIvrRecordedFile(String id) {
        return new DownloadVoiceIvrRecordedFileRequest(id);
    }

    private RequestDefinition getAVoiceIvrScenarioDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/ivr/1/scenarios/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getAVoiceIvrScenario request builder class.
     */
    public class GetAVoiceIvrScenarioRequest {
        private final String id;

        private GetAVoiceIvrScenarioRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getAVoiceIvrScenario request.
         *
         * @return CallsUpdateScenarioResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsUpdateScenarioResponse execute() throws ApiException {
            RequestDefinition getAVoiceIvrScenarioDefinition = getAVoiceIvrScenarioDefinition(id);
            return apiClient.execute(
                    getAVoiceIvrScenarioDefinition, new TypeReference<CallsUpdateScenarioResponse>() {}.getType());
        }

        /**
         * Executes the getAVoiceIvrScenario request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsUpdateScenarioResponse> callback) {
            RequestDefinition getAVoiceIvrScenarioDefinition = getAVoiceIvrScenarioDefinition(id);
            return apiClient.executeAsync(
                    getAVoiceIvrScenarioDefinition,
                    new TypeReference<CallsUpdateScenarioResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get a Voice IVR Scenario.
     * <p>
     * This method allows you to get a Voice IVR Scenario.
     *
     * @param id Scenario identifier. (required)
     * @return GetAVoiceIvrScenarioRequest
     */
    public GetAVoiceIvrScenarioRequest getAVoiceIvrScenario(String id) {
        return new GetAVoiceIvrScenarioRequest(id);
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

    private RequestDefinition getSentVoiceLogsDefinition(
            String from,
            String to,
            List<String> bulkId,
            List<String> messageId,
            CallsIpCoreGeneralStatus generalStatus,
            OffsetDateTime sentSince,
            OffsetDateTime sentUntil,
            Integer limit,
            String mcc,
            String mnc) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/tts/3/logs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (from != null) {
            builder.addQueryParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addQueryParameter(new Parameter("to", to));
        }
        if (bulkId != null) {
            for (var parameterItem : bulkId) {
                builder.addQueryParameter(new Parameter("bulkId", parameterItem));
            }
        }
        if (messageId != null) {
            for (var parameterItem : messageId) {
                builder.addQueryParameter(new Parameter("messageId", parameterItem));
            }
        }
        if (generalStatus != null) {
            builder.addQueryParameter(new Parameter("generalStatus", generalStatus));
        }
        if (sentSince != null) {
            builder.addQueryParameter(new Parameter("sentSince", sentSince));
        }
        if (sentUntil != null) {
            builder.addQueryParameter(new Parameter("sentUntil", sentUntil));
        }
        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        if (mcc != null) {
            builder.addQueryParameter(new Parameter("mcc", mcc));
        }
        if (mnc != null) {
            builder.addQueryParameter(new Parameter("mnc", mnc));
        }
        return builder.build();
    }

    /**
     * getSentVoiceLogs request builder class.
     */
    public class GetSentVoiceLogsRequest {
        private String from;
        private String to;
        private List<String> bulkId;
        private List<String> messageId;
        private CallsIpCoreGeneralStatus generalStatus;
        private OffsetDateTime sentSince;
        private OffsetDateTime sentUntil;
        private Integer limit;
        private String mcc;
        private String mnc;

        private GetSentVoiceLogsRequest() {}

        /**
         * Sets from.
         *
         * @param from The sender ID which can be alphanumeric or numeric. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets to.
         *
         * @param to Destination address of the voice message. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID which uniquely identifies the request. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus Sent voice message status group. Indicates whether the message has been successfully sent, not sent, delivered, not delivered, waiting for delivery or any other possible status. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest generalStatus(CallsIpCoreGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince Lower limit on date and time of sending a Voice message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil Upper limit on date and time of sending a Voice message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximal number of messages in the returned logs. Default value is 50. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets mcc.
         *
         * @param mcc Mobile country code. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest mcc(String mcc) {
            this.mcc = mcc;
            return this;
        }

        /**
         * Sets mnc.
         *
         * @param mnc Mobile network code. (optional)
         * @return GetSentVoiceLogsRequest
         */
        public GetSentVoiceLogsRequest mnc(String mnc) {
            this.mnc = mnc;
            return this;
        }

        /**
         * Executes the getSentVoiceLogs request.
         *
         * @return CallsLogsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsLogsResponse execute() throws ApiException {
            RequestDefinition getSentVoiceLogsDefinition = getSentVoiceLogsDefinition(
                    from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
            return apiClient.execute(getSentVoiceLogsDefinition, new TypeReference<CallsLogsResponse>() {}.getType());
        }

        /**
         * Executes the getSentVoiceLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsLogsResponse> callback) {
            RequestDefinition getSentVoiceLogsDefinition = getSentVoiceLogsDefinition(
                    from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
            return apiClient.executeAsync(
                    getSentVoiceLogsDefinition, new TypeReference<CallsLogsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get sent Voice logs.
     * <p>
     * This method allows you to get logs of sent Voice messages. Voice logs are available for the last 48 hours!
     *
     * @return GetSentVoiceLogsRequest
     */
    public GetSentVoiceLogsRequest getSentVoiceLogs() {
        return new GetSentVoiceLogsRequest();
    }

    private RequestDefinition getVoiceDeliveryReportsDefinition(String bulkId, String messageId, Integer limit) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/1/reports")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addQueryParameter(new Parameter("bulkId", bulkId));
        }
        if (messageId != null) {
            builder.addQueryParameter(new Parameter("messageId", messageId));
        }
        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        return builder.build();
    }

    /**
     * getVoiceDeliveryReports request builder class.
     */
    public class GetVoiceDeliveryReportsRequest {
        private String bulkId;
        private String messageId;
        private Integer limit;

        private GetVoiceDeliveryReportsRequest() {}

        /**
         * Sets bulkId.
         *
         * @param bulkId The ID that uniquely identifies the request. Bulk ID will be received only when you send a message to more than one destination addresses. (optional)
         * @return GetVoiceDeliveryReportsRequest
         */
        public GetVoiceDeliveryReportsRequest bulkId(String bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The ID that uniquely identifies the message sent. (optional)
         * @return GetVoiceDeliveryReportsRequest
         */
        public GetVoiceDeliveryReportsRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit The maximum number of returned delivery reports. Default value is 50. (optional)
         * @return GetVoiceDeliveryReportsRequest
         */
        public GetVoiceDeliveryReportsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Executes the getVoiceDeliveryReports request.
         *
         * @return CallsReportResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsReportResponse execute() throws ApiException {
            RequestDefinition getVoiceDeliveryReportsDefinition =
                    getVoiceDeliveryReportsDefinition(bulkId, messageId, limit);
            return apiClient.execute(
                    getVoiceDeliveryReportsDefinition, new TypeReference<CallsReportResponse>() {}.getType());
        }

        /**
         * Executes the getVoiceDeliveryReports request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsReportResponse> callback) {
            RequestDefinition getVoiceDeliveryReportsDefinition =
                    getVoiceDeliveryReportsDefinition(bulkId, messageId, limit);
            return apiClient.executeAsync(
                    getVoiceDeliveryReportsDefinition, new TypeReference<CallsReportResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get Voice Delivery Reports.
     * <p>
     * This method allows you to get delivery reports for sent Voice messages, outbound IVR or Click-to-call (without notifyUrl request parameter). Delivery reports are returned only once. Additional delivery report request will return an empty collection.
     *
     * @return GetVoiceDeliveryReportsRequest
     */
    public GetVoiceDeliveryReportsRequest getVoiceDeliveryReports() {
        return new GetVoiceDeliveryReportsRequest();
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

    private RequestDefinition searchVoiceIvrRecordedFilesDefinition(
            Integer page, Integer pageSize, String messageId, String number) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/ivr/1/files")
                .requiresAuthentication(true)
                .accept("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (pageSize != null) {
            builder.addQueryParameter(new Parameter("pageSize", pageSize));
        }
        if (messageId != null) {
            builder.addQueryParameter(new Parameter("messageId", messageId));
        }
        if (number != null) {
            builder.addQueryParameter(new Parameter("number", number));
        }
        return builder.build();
    }

    /**
     * searchVoiceIvrRecordedFiles request builder class.
     */
    public class SearchVoiceIvrRecordedFilesRequest {
        private Integer page;
        private Integer pageSize;
        private String messageId;
        private String number;

        private SearchVoiceIvrRecordedFilesRequest() {}

        /**
         * Sets page.
         *
         * @param page Page number you want to see. (optional)
         * @return SearchVoiceIvrRecordedFilesRequest
         */
        public SearchVoiceIvrRecordedFilesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets pageSize.
         *
         * @param pageSize Size of the page you want to see. (optional)
         * @return SearchVoiceIvrRecordedFilesRequest
         */
        public SearchVoiceIvrRecordedFilesRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId The message ID to search by. (optional)
         * @return SearchVoiceIvrRecordedFilesRequest
         */
        public SearchVoiceIvrRecordedFilesRequest messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets number.
         *
         * @param number The called phone number to search by. (optional)
         * @return SearchVoiceIvrRecordedFilesRequest
         */
        public SearchVoiceIvrRecordedFilesRequest number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Executes the searchVoiceIvrRecordedFiles request.
         *
         * @return CallsRecordedAudioFilesResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsRecordedAudioFilesResponse execute() throws ApiException {
            RequestDefinition searchVoiceIvrRecordedFilesDefinition =
                    searchVoiceIvrRecordedFilesDefinition(page, pageSize, messageId, number);
            return apiClient.execute(
                    searchVoiceIvrRecordedFilesDefinition,
                    new TypeReference<CallsRecordedAudioFilesResponse>() {}.getType());
        }

        /**
         * Executes the searchVoiceIvrRecordedFiles request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsRecordedAudioFilesResponse> callback) {
            RequestDefinition searchVoiceIvrRecordedFilesDefinition =
                    searchVoiceIvrRecordedFilesDefinition(page, pageSize, messageId, number);
            return apiClient.executeAsync(
                    searchVoiceIvrRecordedFilesDefinition,
                    new TypeReference<CallsRecordedAudioFilesResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Search Voice IVR Recorded Files.
     * <p>
     * This method allows you to search Voice IVR Recorded Audio Files.
     *
     * @return SearchVoiceIvrRecordedFilesRequest
     */
    public SearchVoiceIvrRecordedFilesRequest searchVoiceIvrRecordedFiles() {
        return new SearchVoiceIvrRecordedFilesRequest();
    }

    private RequestDefinition searchVoiceIvrScenariosDefinition(
            Integer page,
            Integer pageSize,
            String name,
            String label,
            LocalDate lastUsageDateSince,
            LocalDate lastUsageDateUntil) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/voice/ivr/1/scenarios")
                .requiresAuthentication(true)
                .accept("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (pageSize != null) {
            builder.addQueryParameter(new Parameter("pageSize", pageSize));
        }
        if (name != null) {
            builder.addQueryParameter(new Parameter("name", name));
        }
        if (label != null) {
            builder.addQueryParameter(new Parameter("label", label));
        }
        if (lastUsageDateSince != null) {
            builder.addQueryParameter(new Parameter("lastUsageDateSince", lastUsageDateSince));
        }
        if (lastUsageDateUntil != null) {
            builder.addQueryParameter(new Parameter("lastUsageDateUntil", lastUsageDateUntil));
        }
        return builder.build();
    }

    /**
     * searchVoiceIvrScenarios request builder class.
     */
    public class SearchVoiceIvrScenariosRequest {
        private Integer page;
        private Integer pageSize;
        private String name;
        private String label;
        private LocalDate lastUsageDateSince;
        private LocalDate lastUsageDateUntil;

        private SearchVoiceIvrScenariosRequest() {}

        /**
         * Sets page.
         *
         * @param page Page number you want to see. Default is 1. (optional)
         * @return SearchVoiceIvrScenariosRequest
         */
        public SearchVoiceIvrScenariosRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets pageSize.
         *
         * @param pageSize Size of the page you want to see. Default is 50. (optional)
         * @return SearchVoiceIvrScenariosRequest
         */
        public SearchVoiceIvrScenariosRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sets name.
         *
         * @param name The name to search by. (optional)
         * @return SearchVoiceIvrScenariosRequest
         */
        public SearchVoiceIvrScenariosRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets label.
         *
         * @param label The label of scenario to search by. (optional)
         * @return SearchVoiceIvrScenariosRequest
         */
        public SearchVoiceIvrScenariosRequest label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Sets lastUsageDateSince.
         *
         * @param lastUsageDateSince Lower limit of last usage date in &#x60;yyyy-MM-dd&#x60; format. Note: For scenarios where &#x60;lastUsageDate&#x60; is &#x60;null&#x60;, filtering matches &#x60;createTime&#x60;. (optional)
         * @return SearchVoiceIvrScenariosRequest
         */
        public SearchVoiceIvrScenariosRequest lastUsageDateSince(LocalDate lastUsageDateSince) {
            this.lastUsageDateSince = lastUsageDateSince;
            return this;
        }

        /**
         * Sets lastUsageDateUntil.
         *
         * @param lastUsageDateUntil Upper limit of last usage date in &#x60;yyyy-MM-dd&#x60; format. Note: For scenarios where &#x60;lastUsageDate&#x60; is &#x60;null&#x60;, filtering matches &#x60;createTime&#x60;. (optional)
         * @return SearchVoiceIvrScenariosRequest
         */
        public SearchVoiceIvrScenariosRequest lastUsageDateUntil(LocalDate lastUsageDateUntil) {
            this.lastUsageDateUntil = lastUsageDateUntil;
            return this;
        }

        /**
         * Executes the searchVoiceIvrScenarios request.
         *
         * @return List&lt;CallsSearchResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<CallsSearchResponse> execute() throws ApiException {
            RequestDefinition searchVoiceIvrScenariosDefinition = searchVoiceIvrScenariosDefinition(
                    page, pageSize, name, label, lastUsageDateSince, lastUsageDateUntil);
            return apiClient.execute(
                    searchVoiceIvrScenariosDefinition, new TypeReference<List<CallsSearchResponse>>() {}.getType());
        }

        /**
         * Executes the searchVoiceIvrScenarios request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<CallsSearchResponse>> callback) {
            RequestDefinition searchVoiceIvrScenariosDefinition = searchVoiceIvrScenariosDefinition(
                    page, pageSize, name, label, lastUsageDateSince, lastUsageDateUntil);
            return apiClient.executeAsync(
                    searchVoiceIvrScenariosDefinition,
                    new TypeReference<List<CallsSearchResponse>>() {}.getType(),
                    callback);
        }
    }

    /**
     * Search Voice IVR Scenarios.
     * <p>
     * This method allows you to search Voice IVR Scenarios by name. To get a list of all IVR Scenarios, make a request without any parameters.
     *
     * @return SearchVoiceIvrScenariosRequest
     */
    public SearchVoiceIvrScenariosRequest searchVoiceIvrScenarios() {
        return new SearchVoiceIvrScenariosRequest();
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

    private RequestDefinition sendVoiceMessagesWithAnIvrScenarioDefinition(
            CallsLaunchScenarioRequest callsLaunchScenarioRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/voice/ivr/1/messages")
                .body(callsLaunchScenarioRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendVoiceMessagesWithAnIvrScenario request builder class.
     */
    public class SendVoiceMessagesWithAnIvrScenarioRequest {
        private final CallsLaunchScenarioRequest callsLaunchScenarioRequest;

        private SendVoiceMessagesWithAnIvrScenarioRequest(CallsLaunchScenarioRequest callsLaunchScenarioRequest) {
            this.callsLaunchScenarioRequest = Objects.requireNonNull(
                    callsLaunchScenarioRequest, "The required parameter 'callsLaunchScenarioRequest' is missing.");
        }

        /**
         * Executes the sendVoiceMessagesWithAnIvrScenario request.
         *
         * @return CallsVoiceResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsVoiceResponse execute() throws ApiException {
            RequestDefinition sendVoiceMessagesWithAnIvrScenarioDefinition =
                    sendVoiceMessagesWithAnIvrScenarioDefinition(callsLaunchScenarioRequest);
            return apiClient.execute(
                    sendVoiceMessagesWithAnIvrScenarioDefinition, new TypeReference<CallsVoiceResponse>() {}.getType());
        }

        /**
         * Executes the sendVoiceMessagesWithAnIvrScenario request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsVoiceResponse> callback) {
            RequestDefinition sendVoiceMessagesWithAnIvrScenarioDefinition =
                    sendVoiceMessagesWithAnIvrScenarioDefinition(callsLaunchScenarioRequest);
            return apiClient.executeAsync(
                    sendVoiceMessagesWithAnIvrScenarioDefinition,
                    new TypeReference<CallsVoiceResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Launch IVR Scenario.
     * <p>
     * This method allows you to start an outbound IVR toward a multiple destinations.
     *
     * @param callsLaunchScenarioRequest  (required)
     * @return SendVoiceMessagesWithAnIvrScenarioRequest
     */
    public SendVoiceMessagesWithAnIvrScenarioRequest sendVoiceMessagesWithAnIvrScenario(
            CallsLaunchScenarioRequest callsLaunchScenarioRequest) {
        return new SendVoiceMessagesWithAnIvrScenarioRequest(callsLaunchScenarioRequest);
    }

    private RequestDefinition updateVoiceIvrScenarioDefinition(
            String id, CallsUpdateScenarioRequest callsUpdateScenarioRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/voice/ivr/1/scenarios/{id}")
                .body(callsUpdateScenarioRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * updateVoiceIvrScenario request builder class.
     */
    public class UpdateVoiceIvrScenarioRequest {
        private final String id;
        private final CallsUpdateScenarioRequest callsUpdateScenarioRequest;

        private UpdateVoiceIvrScenarioRequest(String id, CallsUpdateScenarioRequest callsUpdateScenarioRequest) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
            this.callsUpdateScenarioRequest = Objects.requireNonNull(
                    callsUpdateScenarioRequest, "The required parameter 'callsUpdateScenarioRequest' is missing.");
        }

        /**
         * Executes the updateVoiceIvrScenario request.
         *
         * @return CallsUpdateScenarioResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsUpdateScenarioResponse execute() throws ApiException {
            RequestDefinition updateVoiceIvrScenarioDefinition =
                    updateVoiceIvrScenarioDefinition(id, callsUpdateScenarioRequest);
            return apiClient.execute(
                    updateVoiceIvrScenarioDefinition, new TypeReference<CallsUpdateScenarioResponse>() {}.getType());
        }

        /**
         * Executes the updateVoiceIvrScenario request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsUpdateScenarioResponse> callback) {
            RequestDefinition updateVoiceIvrScenarioDefinition =
                    updateVoiceIvrScenarioDefinition(id, callsUpdateScenarioRequest);
            return apiClient.executeAsync(
                    updateVoiceIvrScenarioDefinition,
                    new TypeReference<CallsUpdateScenarioResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update Voice IVR Scenarios.
     * <p>
     * This method allows you to update a Voice IVR Scenario. Changes may take up to 10 minutes to apply.
     *
     * @param id Scenario identifier. (required)
     * @param callsUpdateScenarioRequest  (required)
     * @return UpdateVoiceIvrScenarioRequest
     */
    public UpdateVoiceIvrScenarioRequest updateVoiceIvrScenario(
            String id, CallsUpdateScenarioRequest callsUpdateScenarioRequest) {
        return new UpdateVoiceIvrScenarioRequest(id, callsUpdateScenarioRequest);
    }
}
