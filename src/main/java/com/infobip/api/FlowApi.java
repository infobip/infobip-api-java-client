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
import com.infobip.model.FlowAddFlowParticipantsRequest;
import com.infobip.model.FlowAddFlowParticipantsResponse;
import com.infobip.model.FlowParticipantsReportResponse;
import java.util.Objects;

/**
 * Represents FlowApi API client.
 */
public class FlowApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of FlowApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public FlowApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition addFlowParticipantsDefinition(
            Long campaignId, FlowAddFlowParticipantsRequest flowAddFlowParticipantsRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/moments/1/flows/{campaignId}/participants")
                .body(flowAddFlowParticipantsRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * addFlowParticipants request builder class.
     */
    public class AddFlowParticipantsRequest {
        private final Long campaignId;
        private final FlowAddFlowParticipantsRequest flowAddFlowParticipantsRequest;

        private AddFlowParticipantsRequest(
                Long campaignId, FlowAddFlowParticipantsRequest flowAddFlowParticipantsRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.flowAddFlowParticipantsRequest = Objects.requireNonNull(
                    flowAddFlowParticipantsRequest,
                    "The required parameter 'flowAddFlowParticipantsRequest' is missing.");
        }

        /**
         * Executes the addFlowParticipants request.
         *
         * @return FlowAddFlowParticipantsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public FlowAddFlowParticipantsResponse execute() throws ApiException {
            RequestDefinition addFlowParticipantsDefinition =
                    addFlowParticipantsDefinition(campaignId, flowAddFlowParticipantsRequest);
            return apiClient.execute(
                    addFlowParticipantsDefinition, new TypeReference<FlowAddFlowParticipantsResponse>() {}.getType());
        }

        /**
         * Executes the addFlowParticipants request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<FlowAddFlowParticipantsResponse> callback) {
            RequestDefinition addFlowParticipantsDefinition =
                    addFlowParticipantsDefinition(campaignId, flowAddFlowParticipantsRequest);
            return apiClient.executeAsync(
                    addFlowParticipantsDefinition,
                    new TypeReference<FlowAddFlowParticipantsResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Add participants to flow.
     * <p>
     * Use this endpoint to add participants to a flow, accommodating anywhere from 1 to 1000 persons.                  When participants are added, their profiles in People are automatically created, updated or merged based on the identifiers provided.&lt;br&gt;                 If identifiers are unique, a new profile is created.&lt;br&gt;                 If identifiers match an existing profile, then that profile is updated.&lt;br&gt;                 If identifiers refer to multiple existing profiles or are not unique within the request, profiles are merged.&lt;br&gt;                 To prevent unwanted merges, ensure each participant&#39;s identifiers                  (&lt;code&gt;identifyBy&lt;/code&gt;, &lt;code&gt;externalId&lt;/code&gt; and &lt;code&gt;contactInformation&lt;/code&gt;) are unique.
     *
     * @param campaignId Unique identifier of the flow that participant will be added to. (required)
     * @param flowAddFlowParticipantsRequest  (required)
     * @return AddFlowParticipantsRequest
     */
    public AddFlowParticipantsRequest addFlowParticipants(
            Long campaignId, FlowAddFlowParticipantsRequest flowAddFlowParticipantsRequest) {
        return new AddFlowParticipantsRequest(campaignId, flowAddFlowParticipantsRequest);
    }

    private RequestDefinition getFlowParticipantsAddedReportDefinition(Long campaignId, String operationId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/moments/1/flows/{campaignId}/participants/report")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        if (operationId != null) {
            builder.addQueryParameter(new Parameter("operationId", operationId));
        }
        return builder.build();
    }

    /**
     * getFlowParticipantsAddedReport request builder class.
     */
    public class GetFlowParticipantsAddedReportRequest {
        private final Long campaignId;
        private final String operationId;

        private GetFlowParticipantsAddedReportRequest(Long campaignId, String operationId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.operationId = Objects.requireNonNull(operationId, "The required parameter 'operationId' is missing.");
        }

        /**
         * Executes the getFlowParticipantsAddedReport request.
         *
         * @return FlowParticipantsReportResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public FlowParticipantsReportResponse execute() throws ApiException {
            RequestDefinition getFlowParticipantsAddedReportDefinition =
                    getFlowParticipantsAddedReportDefinition(campaignId, operationId);
            return apiClient.execute(
                    getFlowParticipantsAddedReportDefinition,
                    new TypeReference<FlowParticipantsReportResponse>() {}.getType());
        }

        /**
         * Executes the getFlowParticipantsAddedReport request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<FlowParticipantsReportResponse> callback) {
            RequestDefinition getFlowParticipantsAddedReportDefinition =
                    getFlowParticipantsAddedReportDefinition(campaignId, operationId);
            return apiClient.executeAsync(
                    getFlowParticipantsAddedReportDefinition,
                    new TypeReference<FlowParticipantsReportResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get a report on participants added to flow.
     * <p>
     * Use this API endpoint to fetch a report to confirm that all persons have been successfully added to the flow.                 Please note that report is stored for 30 days.
     *
     * @param campaignId Unique identifier of the flow that participant will be added to. (required)
     * @param operationId Unique identifier of the operation. (required)
     * @return GetFlowParticipantsAddedReportRequest
     */
    public GetFlowParticipantsAddedReportRequest getFlowParticipantsAddedReport(Long campaignId, String operationId) {
        return new GetFlowParticipantsAddedReportRequest(campaignId, operationId);
    }

    private RequestDefinition removePeopleFromFlowDefinition(
            Long campaignId, String phone, String email, String externalId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/communication/1/flows/{campaignId}/participants")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        if (phone != null) {
            builder.addQueryParameter(new Parameter("phone", phone));
        }
        if (email != null) {
            builder.addQueryParameter(new Parameter("email", email));
        }
        if (externalId != null) {
            builder.addQueryParameter(new Parameter("externalId", externalId));
        }
        return builder.build();
    }

    /**
     * removePeopleFromFlow request builder class.
     */
    public class RemovePeopleFromFlowRequest {
        private final Long campaignId;
        private String phone;
        private String email;
        private String externalId;

        private RemovePeopleFromFlowRequest(Long campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Sets phone.
         *
         * @param phone Person&#39;s phone number. (optional)
         * @return RemovePeopleFromFlowRequest
         */
        public RemovePeopleFromFlowRequest phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Sets email.
         *
         * @param email Person&#39;s email address. (optional)
         * @return RemovePeopleFromFlowRequest
         */
        public RemovePeopleFromFlowRequest email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets externalId.
         *
         * @param externalId Unique ID for the person from an external system. (optional)
         * @return RemovePeopleFromFlowRequest
         */
        public RemovePeopleFromFlowRequest externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Executes the removePeopleFromFlow request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition removePeopleFromFlowDefinition =
                    removePeopleFromFlowDefinition(campaignId, phone, email, externalId);
            apiClient.execute(removePeopleFromFlowDefinition);
        }

        /**
         * Executes the removePeopleFromFlow request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition removePeopleFromFlowDefinition =
                    removePeopleFromFlowDefinition(campaignId, phone, email, externalId);
            return apiClient.executeAsync(removePeopleFromFlowDefinition, callback);
        }
    }

    /**
     * Remove person from flow.
     * <p>
     * Removes a participant with given identifier from the flow.
     *
     * @param campaignId Unique identifier of the flow that person will be removed from. (required)
     * @return RemovePeopleFromFlowRequest
     */
    public RemovePeopleFromFlowRequest removePeopleFromFlow(Long campaignId) {
        return new RemovePeopleFromFlowRequest(campaignId);
    }
}
