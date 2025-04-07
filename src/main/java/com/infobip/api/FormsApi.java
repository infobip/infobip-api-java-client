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
import com.infobip.model.FormsResponse;
import com.infobip.model.FormsResponseContent;
import com.infobip.model.FormsStatus;
import com.infobip.model.FormsStatusResponse;
import java.util.Map;
import java.util.Objects;

/**
 * Represents FormsApi API client.
 */
public class FormsApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of FormsApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public FormsApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition getFormDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/forms/1/forms/{id}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * getForm request builder class.
     */
    public class GetFormRequest {
        private final String id;

        private GetFormRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the getForm request.
         *
         * @return FormsResponseContent The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public FormsResponseContent execute() throws ApiException {
            RequestDefinition getFormDefinition = getFormDefinition(id);
            return apiClient.execute(getFormDefinition, new TypeReference<FormsResponseContent>() {}.getType());
        }

        /**
         * Executes the getForm request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<FormsResponseContent> callback) {
            RequestDefinition getFormDefinition = getFormDefinition(id);
            return apiClient.executeAsync(
                    getFormDefinition, new TypeReference<FormsResponseContent>() {}.getType(), callback);
        }
    }

    /**
     * Get form.
     * <p>
     * Use this method to get a form by its ID.
     *
     * @param id ID of a form (required)
     * @return GetFormRequest
     */
    public GetFormRequest getForm(String id) {
        return new GetFormRequest(id);
    }

    private RequestDefinition getFormsDefinition(
            Integer offset, Integer limit, String formType, FormsStatus formStatus) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/forms/1/forms")
                .requiresAuthentication(true)
                .accept("application/json");

        if (offset != null) {
            builder.addQueryParameter(new Parameter("offset", offset));
        }
        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        if (formType != null) {
            builder.addQueryParameter(new Parameter("formType", formType));
        }
        if (formStatus != null) {
            builder.addQueryParameter(new Parameter("formStatus", formStatus));
        }
        return builder.build();
    }

    /**
     * getForms request builder class.
     */
    public class GetFormsRequest {
        private Integer offset;
        private Integer limit;
        private String formType;
        private FormsStatus formStatus;

        private GetFormsRequest() {}

        /**
         * Sets offset.
         *
         * @param offset Skip first {offset} forms of the list. (optional, default to 0)
         * @return GetFormsRequest
         */
        public GetFormsRequest offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit The maximum number of returned forms. Maximum value is &#x60;100&#x60;. (optional, default to 25)
         * @return GetFormsRequest
         */
        public GetFormsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets formType.
         *
         * @param formType The type of returned forms. (optional)
         * @return GetFormsRequest
         */
        public GetFormsRequest formType(String formType) {
            this.formType = formType;
            return this;
        }

        /**
         * Sets formStatus.
         *
         * @param formStatus The status of returned forms. (optional)
         * @return GetFormsRequest
         */
        public GetFormsRequest formStatus(FormsStatus formStatus) {
            this.formStatus = formStatus;
            return this;
        }

        /**
         * Executes the getForms request.
         *
         * @return FormsResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public FormsResponse execute() throws ApiException {
            RequestDefinition getFormsDefinition = getFormsDefinition(offset, limit, formType, formStatus);
            return apiClient.execute(getFormsDefinition, new TypeReference<FormsResponse>() {}.getType());
        }

        /**
         * Executes the getForms request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<FormsResponse> callback) {
            RequestDefinition getFormsDefinition = getFormsDefinition(offset, limit, formType, formStatus);
            return apiClient.executeAsync(
                    getFormsDefinition, new TypeReference<FormsResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get forms.
     * <p>
     * Use this method to get a list of forms.
     *
     * @return GetFormsRequest
     */
    public GetFormsRequest getForms() {
        return new GetFormsRequest();
    }

    private RequestDefinition incrementViewCountDefinition(String id) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/forms/1/forms/{id}/views")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        return builder.build();
    }

    /**
     * incrementViewCount request builder class.
     */
    public class IncrementViewCountRequest {
        private final String id;

        private IncrementViewCountRequest(String id) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
        }

        /**
         * Executes the incrementViewCount request.
         *
         * @return FormsStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public FormsStatusResponse execute() throws ApiException {
            RequestDefinition incrementViewCountDefinition = incrementViewCountDefinition(id);
            return apiClient.execute(
                    incrementViewCountDefinition, new TypeReference<FormsStatusResponse>() {}.getType());
        }

        /**
         * Executes the incrementViewCount request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<FormsStatusResponse> callback) {
            RequestDefinition incrementViewCountDefinition = incrementViewCountDefinition(id);
            return apiClient.executeAsync(
                    incrementViewCountDefinition, new TypeReference<FormsStatusResponse>() {}.getType(), callback);
        }
    }

    /**
     * Increment form view count.
     * <p>
     * Use this method to increase the view counter of a specific form. It&#39;s used for proper statistics calculation. Statistics are available on the form performance page on the Portal.
     *
     * @param id ID of a form (required)
     * @return IncrementViewCountRequest
     */
    public IncrementViewCountRequest incrementViewCount(String id) {
        return new IncrementViewCountRequest(id);
    }

    private RequestDefinition submitFormDataDefinition(
            String id, Map<String, Object> requestBody, String ibSubmissionSource, String ibSubmissionFormCampaign) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/forms/1/forms/{id}/data")
                .body(requestBody)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (id != null) {
            builder.addPathParameter(new Parameter("id", id));
        }
        if (ibSubmissionSource != null) {
            builder.addHeaderParameter(new Parameter("ib-submission-source", ibSubmissionSource));
        }
        if (ibSubmissionFormCampaign != null) {
            builder.addHeaderParameter(new Parameter("ib-submission-form-campaign", ibSubmissionFormCampaign));
        }
        return builder.build();
    }

    /**
     * submitFormData request builder class.
     */
    public class SubmitFormDataRequest {
        private final String id;
        private final Map<String, Object> requestBody;
        private String ibSubmissionSource;
        private String ibSubmissionFormCampaign;

        private SubmitFormDataRequest(String id, Map<String, Object> requestBody) {
            this.id = Objects.requireNonNull(id, "The required parameter 'id' is missing.");
            this.requestBody = Objects.requireNonNull(requestBody, "The required parameter 'requestBody' is missing.");
        }

        /**
         * Sets ibSubmissionSource.
         *
         * @param ibSubmissionSource By sending source information you will be able to see Analytics by Source – It reflects the submission rates by source if your form is present in numerous places. (optional)
         * @return SubmitFormDataRequest
         */
        public SubmitFormDataRequest ibSubmissionSource(String ibSubmissionSource) {
            this.ibSubmissionSource = ibSubmissionSource;
            return this;
        }

        /**
         * Sets ibSubmissionFormCampaign.
         *
         * @param ibSubmissionFormCampaign By sending campaign information you will be able to see Analytics by Campaign – It reflects the submission rates by campaign if your form is included in multiple campaigns. (optional)
         * @return SubmitFormDataRequest
         */
        public SubmitFormDataRequest ibSubmissionFormCampaign(String ibSubmissionFormCampaign) {
            this.ibSubmissionFormCampaign = ibSubmissionFormCampaign;
            return this;
        }

        /**
         * Executes the submitFormData request.
         *
         * @return FormsStatusResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public FormsStatusResponse execute() throws ApiException {
            RequestDefinition submitFormDataDefinition =
                    submitFormDataDefinition(id, requestBody, ibSubmissionSource, ibSubmissionFormCampaign);
            return apiClient.execute(submitFormDataDefinition, new TypeReference<FormsStatusResponse>() {}.getType());
        }

        /**
         * Executes the submitFormData request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<FormsStatusResponse> callback) {
            RequestDefinition submitFormDataDefinition =
                    submitFormDataDefinition(id, requestBody, ibSubmissionSource, ibSubmissionFormCampaign);
            return apiClient.executeAsync(
                    submitFormDataDefinition, new TypeReference<FormsStatusResponse>() {}.getType(), callback);
        }
    }

    /**
     * Submit form data.
     * <p>
     * Use this method to submit form data.
     *
     * @param id ID of a form (required)
     * @param requestBody Form Data (required)
     * @return SubmitFormDataRequest
     */
    public SubmitFormDataRequest submitFormData(String id, Map<String, Object> requestBody) {
        return new SubmitFormDataRequest(id, requestBody);
    }
}
