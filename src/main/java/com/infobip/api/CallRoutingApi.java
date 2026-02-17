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
import com.infobip.model.CallRoutingCallRoutingRecordingPage;
import com.infobip.model.CallRoutingRecordingApiResponse;
import com.infobip.model.CallRoutingRecordingLocation;
import com.infobip.model.CallRoutingRecordingSortColumn;
import com.infobip.model.CallRoutingRouteOrderRequest;
import com.infobip.model.CallRoutingRouteRequest;
import com.infobip.model.CallRoutingRouteResponse;
import com.infobip.model.CallRoutingRouteResponsePage;
import com.infobip.model.CallRoutingRouteSimulatorRequest;
import com.infobip.model.CallRoutingRouteStatusRequest;
import com.infobip.model.CallRoutingSortDirection;
import java.io.File;
import java.time.OffsetDateTime;
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

    private RequestDefinition deleteByCorrelationIdDefinition(
            String correlationId, CallRoutingRecordingLocation location) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/callrouting/1/recordings")
                .requiresAuthentication(true)
                .accept("application/json");

        if (correlationId != null) {
            builder.addQueryParameter(new Parameter("correlationId", correlationId));
        }
        if (location != null) {
            builder.addQueryParameter(new Parameter("location", location));
        }
        return builder.build();
    }

    /**
     * deleteByCorrelationId request builder class.
     */
    public class DeleteByCorrelationIdRequest {
        private final String correlationId;
        private CallRoutingRecordingLocation location;

        private DeleteByCorrelationIdRequest(String correlationId) {
            this.correlationId =
                    Objects.requireNonNull(correlationId, "The required parameter 'correlationId' is missing.");
        }

        /**
         * Sets location.
         *
         * @param location Recording location. (optional)
         * @return DeleteByCorrelationIdRequest
         */
        public DeleteByCorrelationIdRequest location(CallRoutingRecordingLocation location) {
            this.location = location;
            return this;
        }

        /**
         * Executes the deleteByCorrelationId request.
         *
         * @return CallRoutingRecordingApiResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRecordingApiResponse execute() throws ApiException {
            RequestDefinition deleteByCorrelationIdDefinition =
                    deleteByCorrelationIdDefinition(correlationId, location);
            return apiClient.execute(
                    deleteByCorrelationIdDefinition, new TypeReference<CallRoutingRecordingApiResponse>() {}.getType());
        }

        /**
         * Executes the deleteByCorrelationId request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRecordingApiResponse> callback) {
            RequestDefinition deleteByCorrelationIdDefinition =
                    deleteByCorrelationIdDefinition(correlationId, location);
            return apiClient.executeAsync(
                    deleteByCorrelationIdDefinition,
                    new TypeReference<CallRoutingRecordingApiResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Delete by correlation ID.
     * <p>
     * This method allows deleting call recordings based on correlation ID.
     *
     * @param correlationId Correlation ID to match. (required)
     * @return DeleteByCorrelationIdRequest
     */
    public DeleteByCorrelationIdRequest deleteByCorrelationId(String correlationId) {
        return new DeleteByCorrelationIdRequest(correlationId);
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

    private RequestDefinition getCallRoutesDefinition(String nameContains, Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/callrouting/1/routes")
                .requiresAuthentication(true)
                .accept("application/json");

        if (nameContains != null) {
            builder.addQueryParameter(new Parameter("nameContains", nameContains));
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
     * getCallRoutes request builder class.
     */
    public class GetCallRoutesRequest {
        private String nameContains;
        private Integer page;
        private Integer size;

        private GetCallRoutesRequest() {}

        /**
         * Sets nameContains.
         *
         * @param nameContains String contained in the name of the route, case-insensitive. (optional)
         * @return GetCallRoutesRequest
         */
        public GetCallRoutesRequest nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

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
            RequestDefinition getCallRoutesDefinition = getCallRoutesDefinition(nameContains, page, size);
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
            RequestDefinition getCallRoutesDefinition = getCallRoutesDefinition(nameContains, page, size);
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

    private RequestDefinition recordingFileDownloadDefinition(
            String fileId, CallRoutingRecordingLocation location, String range) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/callrouting/1/recordings/files/{fileId}")
                .requiresAuthentication(true)
                .accept("application/octet-stream");

        if (fileId != null) {
            builder.addPathParameter(new Parameter("fileId", fileId));
        }
        if (location != null) {
            builder.addQueryParameter(new Parameter("location", location));
        }
        if (range != null) {
            builder.addHeaderParameter(new Parameter("Range", range));
        }
        return builder.build();
    }

    /**
     * recordingFileDownload request builder class.
     */
    public class RecordingFileDownloadRequest {
        private final String fileId;
        private CallRoutingRecordingLocation location;
        private String range;

        private RecordingFileDownloadRequest(String fileId) {
            this.fileId = Objects.requireNonNull(fileId, "The required parameter 'fileId' is missing.");
        }

        /**
         * Sets location.
         *
         * @param location Recording location. (optional)
         * @return RecordingFileDownloadRequest
         */
        public RecordingFileDownloadRequest location(CallRoutingRecordingLocation location) {
            this.location = location;
            return this;
        }

        /**
         * Sets range.
         *
         * @param range Range header specifies range of bytes to be returned by the response. If range header is not specified, response will return a complete file. (optional)
         * @return RecordingFileDownloadRequest
         */
        public RecordingFileDownloadRequest range(String range) {
            this.range = range;
            return this;
        }

        /**
         * Executes the recordingFileDownload request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition recordingFileDownloadDefinition =
                    recordingFileDownloadDefinition(fileId, location, range);
            return apiClient.execute(recordingFileDownloadDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the recordingFileDownload request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition recordingFileDownloadDefinition =
                    recordingFileDownloadDefinition(fileId, location, range);
            return apiClient.executeAsync(
                    recordingFileDownloadDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Download recording file.
     * <p>
     * Download a recording file.
     *
     * @param fileId File ID to match. (required)
     * @return RecordingFileDownloadRequest
     */
    public RecordingFileDownloadRequest recordingFileDownload(String fileId) {
        return new RecordingFileDownloadRequest(fileId);
    }

    private RequestDefinition searchCallRoutingRecordingDefinition(
            CallRoutingRecordingSortColumn sortBy,
            CallRoutingSortDirection sortDirection,
            String endpointType,
            String phoneNumber,
            String sipTrunkId,
            String sipUsername,
            String webrtcIdentity,
            String routeId,
            String routeName,
            String correlationId,
            OffsetDateTime startTimeAfter,
            OffsetDateTime startTimeBefore,
            CallRoutingRecordingLocation location,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/callrouting/1/recordings")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sortBy != null) {
            builder.addQueryParameter(new Parameter("sortBy", sortBy));
        }
        if (sortDirection != null) {
            builder.addQueryParameter(new Parameter("sortDirection", sortDirection));
        }
        if (endpointType != null) {
            builder.addQueryParameter(new Parameter("endpointType", endpointType));
        }
        if (phoneNumber != null) {
            builder.addQueryParameter(new Parameter("phoneNumber", phoneNumber));
        }
        if (sipTrunkId != null) {
            builder.addQueryParameter(new Parameter("sipTrunkId", sipTrunkId));
        }
        if (sipUsername != null) {
            builder.addQueryParameter(new Parameter("sipUsername", sipUsername));
        }
        if (webrtcIdentity != null) {
            builder.addQueryParameter(new Parameter("webrtcIdentity", webrtcIdentity));
        }
        if (routeId != null) {
            builder.addQueryParameter(new Parameter("routeId", routeId));
        }
        if (routeName != null) {
            builder.addQueryParameter(new Parameter("routeName", routeName));
        }
        if (correlationId != null) {
            builder.addQueryParameter(new Parameter("correlationId", correlationId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (startTimeBefore != null) {
            builder.addQueryParameter(new Parameter("startTimeBefore", startTimeBefore));
        }
        if (location != null) {
            builder.addQueryParameter(new Parameter("location", location));
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
     * searchCallRoutingRecording request builder class.
     */
    public class SearchCallRoutingRecordingRequest {
        private CallRoutingRecordingSortColumn sortBy;
        private CallRoutingSortDirection sortDirection;
        private String endpointType;
        private String phoneNumber;
        private String sipTrunkId;
        private String sipUsername;
        private String webrtcIdentity;
        private String routeId;
        private String routeName;
        private String correlationId;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime startTimeBefore;
        private CallRoutingRecordingLocation location;
        private Integer page;
        private Integer size;

        private SearchCallRoutingRecordingRequest() {}

        /**
         * Sets sortBy.
         *
         * @param sortBy Field that will be used for sorting. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest sortBy(CallRoutingRecordingSortColumn sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Sets sortDirection.
         *
         * @param sortDirection Order in which files will be sorted based on sortBy field. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest sortDirection(CallRoutingSortDirection sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        /**
         * Sets endpointType.
         *
         * @param endpointType Endpoint type of at least one participant in the recorded call. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Sets phoneNumber.
         *
         * @param phoneNumber Phone number that was participant of the recorded call. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Sets sipTrunkId.
         *
         * @param sipTrunkId SIP Trunk ID that was participant of the recorded call. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest sipTrunkId(String sipTrunkId) {
            this.sipTrunkId = sipTrunkId;
            return this;
        }

        /**
         * Sets sipUsername.
         *
         * @param sipUsername Username on the SIP trunk that was participant of the recorded call. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest sipUsername(String sipUsername) {
            this.sipUsername = sipUsername;
            return this;
        }

        /**
         * Sets webrtcIdentity.
         *
         * @param webrtcIdentity WebRTC Identity that was participant of the recorded call. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest webrtcIdentity(String webrtcIdentity) {
            this.webrtcIdentity = webrtcIdentity;
            return this;
        }

        /**
         * Sets routeId.
         *
         * @param routeId Route ID that was used to establish the recorded call. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * Sets routeName.
         *
         * @param routeName Route name to be used to match recordings. Name will be matched comparing it to all route names. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest routeName(String routeName) {
            this.routeName = routeName;
            return this;
        }

        /**
         * Sets correlationId.
         *
         * @param correlationId Correlation ID to match. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest correlationId(String correlationId) {
            this.correlationId = correlationId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time when the (first) call recording started. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets startTimeBefore.
         *
         * @param startTimeBefore Date and time when the (last) call recording started. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest startTimeBefore(OffsetDateTime startTimeBefore) {
            this.startTimeBefore = startTimeBefore;
            return this;
        }

        /**
         * Sets location.
         *
         * @param location Recording location. (optional)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest location(CallRoutingRecordingLocation location) {
            this.location = location;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return SearchCallRoutingRecordingRequest
         */
        public SearchCallRoutingRecordingRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the searchCallRoutingRecording request.
         *
         * @return CallRoutingCallRoutingRecordingPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingCallRoutingRecordingPage execute() throws ApiException {
            RequestDefinition searchCallRoutingRecordingDefinition = searchCallRoutingRecordingDefinition(
                    sortBy,
                    sortDirection,
                    endpointType,
                    phoneNumber,
                    sipTrunkId,
                    sipUsername,
                    webrtcIdentity,
                    routeId,
                    routeName,
                    correlationId,
                    startTimeAfter,
                    startTimeBefore,
                    location,
                    page,
                    size);
            return apiClient.execute(
                    searchCallRoutingRecordingDefinition,
                    new TypeReference<CallRoutingCallRoutingRecordingPage>() {}.getType());
        }

        /**
         * Executes the searchCallRoutingRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingCallRoutingRecordingPage> callback) {
            RequestDefinition searchCallRoutingRecordingDefinition = searchCallRoutingRecordingDefinition(
                    sortBy,
                    sortDirection,
                    endpointType,
                    phoneNumber,
                    sipTrunkId,
                    sipUsername,
                    webrtcIdentity,
                    routeId,
                    routeName,
                    correlationId,
                    startTimeAfter,
                    startTimeBefore,
                    location,
                    page,
                    size);
            return apiClient.executeAsync(
                    searchCallRoutingRecordingDefinition,
                    new TypeReference<CallRoutingCallRoutingRecordingPage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get recordings.
     * <p>
     * This method allows searching and filtering based on various recording data properties.
     *
     * @return SearchCallRoutingRecordingRequest
     */
    public SearchCallRoutingRecordingRequest searchCallRoutingRecording() {
        return new SearchCallRoutingRecordingRequest();
    }

    private RequestDefinition setOrderCallRouteDefinition(
            String routeId, CallRoutingRouteOrderRequest callRoutingRouteOrderRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PATCH", "/callrouting/1/routes/{routeId}")
                .body(callRoutingRouteOrderRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (routeId != null) {
            builder.addPathParameter(new Parameter("routeId", routeId));
        }
        return builder.build();
    }

    /**
     * setOrderCallRoute request builder class.
     */
    public class SetOrderCallRouteRequest {
        private final String routeId;
        private final CallRoutingRouteOrderRequest callRoutingRouteOrderRequest;

        private SetOrderCallRouteRequest(String routeId, CallRoutingRouteOrderRequest callRoutingRouteOrderRequest) {
            this.routeId = Objects.requireNonNull(routeId, "The required parameter 'routeId' is missing.");
            this.callRoutingRouteOrderRequest = Objects.requireNonNull(
                    callRoutingRouteOrderRequest, "The required parameter 'callRoutingRouteOrderRequest' is missing.");
        }

        /**
         * Executes the setOrderCallRoute request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition setOrderCallRouteDefinition =
                    setOrderCallRouteDefinition(routeId, callRoutingRouteOrderRequest);
            return apiClient.execute(
                    setOrderCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the setOrderCallRoute request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition setOrderCallRouteDefinition =
                    setOrderCallRouteDefinition(routeId, callRoutingRouteOrderRequest);
            return apiClient.executeAsync(
                    setOrderCallRouteDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType(), callback);
        }
    }

    /**
     * Set order on call route.
     * <p>
     * Set order on existing call route.
     *
     * @param routeId Route identifier (required)
     * @param callRoutingRouteOrderRequest  (required)
     * @return SetOrderCallRouteRequest
     */
    public SetOrderCallRouteRequest setOrderCallRoute(
            String routeId, CallRoutingRouteOrderRequest callRoutingRouteOrderRequest) {
        return new SetOrderCallRouteRequest(routeId, callRoutingRouteOrderRequest);
    }

    private RequestDefinition simulateRouteSelectionDefinition(
            CallRoutingRouteSimulatorRequest callRoutingRouteSimulatorRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/callrouting/1/routes/simulate")
                .body(callRoutingRouteSimulatorRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * simulateRouteSelection request builder class.
     */
    public class SimulateRouteSelectionRequest {
        private final CallRoutingRouteSimulatorRequest callRoutingRouteSimulatorRequest;

        private SimulateRouteSelectionRequest(CallRoutingRouteSimulatorRequest callRoutingRouteSimulatorRequest) {
            this.callRoutingRouteSimulatorRequest = Objects.requireNonNull(
                    callRoutingRouteSimulatorRequest,
                    "The required parameter 'callRoutingRouteSimulatorRequest' is missing.");
        }

        /**
         * Executes the simulateRouteSelection request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition simulateRouteSelectionDefinition =
                    simulateRouteSelectionDefinition(callRoutingRouteSimulatorRequest);
            return apiClient.execute(
                    simulateRouteSelectionDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the simulateRouteSelection request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition simulateRouteSelectionDefinition =
                    simulateRouteSelectionDefinition(callRoutingRouteSimulatorRequest);
            return apiClient.executeAsync(
                    simulateRouteSelectionDefinition,
                    new TypeReference<CallRoutingRouteResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Simulate route selection.
     * <p>
     * Simulates which route will be selected upon predefined request.
     *
     * @param callRoutingRouteSimulatorRequest  (required)
     * @return SimulateRouteSelectionRequest
     */
    public SimulateRouteSelectionRequest simulateRouteSelection(
            CallRoutingRouteSimulatorRequest callRoutingRouteSimulatorRequest) {
        return new SimulateRouteSelectionRequest(callRoutingRouteSimulatorRequest);
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

    private RequestDefinition updateCallRouteStatusDefinition(
            String routeId, CallRoutingRouteStatusRequest callRoutingRouteStatusRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/callrouting/1/routes/{routeId}/status")
                .body(callRoutingRouteStatusRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (routeId != null) {
            builder.addPathParameter(new Parameter("routeId", routeId));
        }
        return builder.build();
    }

    /**
     * updateCallRouteStatus request builder class.
     */
    public class UpdateCallRouteStatusRequest {
        private final String routeId;
        private final CallRoutingRouteStatusRequest callRoutingRouteStatusRequest;

        private UpdateCallRouteStatusRequest(
                String routeId, CallRoutingRouteStatusRequest callRoutingRouteStatusRequest) {
            this.routeId = Objects.requireNonNull(routeId, "The required parameter 'routeId' is missing.");
            this.callRoutingRouteStatusRequest = Objects.requireNonNull(
                    callRoutingRouteStatusRequest,
                    "The required parameter 'callRoutingRouteStatusRequest' is missing.");
        }

        /**
         * Executes the updateCallRouteStatus request.
         *
         * @return CallRoutingRouteResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRoutingRouteResponse execute() throws ApiException {
            RequestDefinition updateCallRouteStatusDefinition =
                    updateCallRouteStatusDefinition(routeId, callRoutingRouteStatusRequest);
            return apiClient.execute(
                    updateCallRouteStatusDefinition, new TypeReference<CallRoutingRouteResponse>() {}.getType());
        }

        /**
         * Executes the updateCallRouteStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRoutingRouteResponse> callback) {
            RequestDefinition updateCallRouteStatusDefinition =
                    updateCallRouteStatusDefinition(routeId, callRoutingRouteStatusRequest);
            return apiClient.executeAsync(
                    updateCallRouteStatusDefinition,
                    new TypeReference<CallRoutingRouteResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update route status.
     * <p>
     * Update status of existing call route.
     *
     * @param routeId Route identifier (required)
     * @param callRoutingRouteStatusRequest  (required)
     * @return UpdateCallRouteStatusRequest
     */
    public UpdateCallRouteStatusRequest updateCallRouteStatus(
            String routeId, CallRoutingRouteStatusRequest callRoutingRouteStatusRequest) {
        return new UpdateCallRouteStatusRequest(routeId, callRoutingRouteStatusRequest);
    }
}
