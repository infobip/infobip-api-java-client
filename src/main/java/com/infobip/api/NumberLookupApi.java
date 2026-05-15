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
import com.infobip.model.MessageGeneralStatus;
import com.infobip.model.NumberLookupLogResponse;
import com.infobip.model.NumberLookupNotifyRequest;
import com.infobip.model.NumberLookupQueryRequest;
import com.infobip.model.NumberLookupResponse;
import com.infobip.model.NumberLookupResponseAsync;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents NumberLookupApi API client.
 */
public class NumberLookupApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of NumberLookupApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public NumberLookupApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition getNumberContextLogsDefinition(
            String to,
            List<String> bulkId,
            List<String> messageId,
            MessageGeneralStatus generalStatus,
            OffsetDateTime sentSince,
            OffsetDateTime sentUntil,
            Integer limit,
            String mcc,
            String mnc) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/number/1/logs")
                .requiresAuthentication(true)
                .accept("application/json");

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
     * getNumberContextLogs request builder class.
     */
    public class GetNumberContextLogsRequest {
        private String to;
        private List<String> bulkId;
        private List<String> messageId;
        private MessageGeneralStatus generalStatus;
        private OffsetDateTime sentSince;
        private OffsetDateTime sentUntil;
        private Integer limit;
        private String mcc;
        private String mnc;

        private GetNumberContextLogsRequest() {}

        /**
         * Sets to.
         *
         * @param to Destination address. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets bulkId.
         *
         * @param bulkId Bulk ID for which log is requested. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest bulkId(List<String> bulkId) {
            this.bulkId = bulkId;
            return this;
        }

        /**
         * Sets messageId.
         *
         * @param messageId NC lookup ID for which log is requested. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest messageId(List<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Sets generalStatus.
         *
         * @param generalStatus Requested Number Context [status](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes). (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest generalStatus(MessageGeneralStatus generalStatus) {
            this.generalStatus = generalStatus;
            return this;
        }

        /**
         * Sets sentSince.
         *
         * @param sentSince The logs will only include NC lookups sent after this date. Use it alongside &#x60;sentUntil&#x60; to specify a time range for the logs, but only up to the maximum limit of 1000 logs per call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest sentSince(OffsetDateTime sentSince) {
            this.sentSince = sentSince;
            return this;
        }

        /**
         * Sets sentUntil.
         *
         * @param sentUntil The logs will only include NC lookups sent before this date. Use it alongside &#x60;sentSince&#x60; to specify a time range for the logs, but only up to the maximum limit of 1000 logs per call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest sentUntil(OffsetDateTime sentUntil) {
            this.sentUntil = sentUntil;
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit Maximum number of Number Context lookups in returned logs. If not set, the latest 50 records are returned. Maximum limit value is &#x60;1000&#x60; and you can only access logs for the last 48h. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets mcc.
         *
         * @param mcc Mobile Country Code. (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest mcc(String mcc) {
            this.mcc = mcc;
            return this;
        }

        /**
         * Sets mnc.
         *
         * @param mnc Mobile Network Code. Mobile Country Code is required if this property is used.  (optional)
         * @return GetNumberContextLogsRequest
         */
        public GetNumberContextLogsRequest mnc(String mnc) {
            this.mnc = mnc;
            return this;
        }

        /**
         * Executes the getNumberContextLogs request.
         *
         * @return NumberLookupLogResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberLookupLogResponse execute() throws ApiException {
            RequestDefinition getNumberContextLogsDefinition = getNumberContextLogsDefinition(
                    to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
            return apiClient.execute(
                    getNumberContextLogsDefinition, new TypeReference<NumberLookupLogResponse>() {}.getType());
        }

        /**
         * Executes the getNumberContextLogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberLookupLogResponse> callback) {
            RequestDefinition getNumberContextLogsDefinition = getNumberContextLogsDefinition(
                    to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
            return apiClient.executeAsync(
                    getNumberContextLogsDefinition,
                    new TypeReference<NumberLookupLogResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Number Context logs.
     * <p>
     * This method allows you to get logs of sent Number Context requests.
     *
     * @return GetNumberContextLogsRequest
     */
    public GetNumberContextLogsRequest getNumberContextLogs() {
        return new GetNumberContextLogsRequest();
    }

    private RequestDefinition numberContextLookupDefinition(NumberLookupQueryRequest numberLookupQueryRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number/1/query")
                .body(numberLookupQueryRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * numberContextLookup request builder class.
     */
    public class NumberContextLookupRequest {
        private final NumberLookupQueryRequest numberLookupQueryRequest;

        private NumberContextLookupRequest(NumberLookupQueryRequest numberLookupQueryRequest) {
            this.numberLookupQueryRequest = Objects.requireNonNull(
                    numberLookupQueryRequest, "The required parameter 'numberLookupQueryRequest' is missing.");
        }

        /**
         * Executes the numberContextLookup request.
         *
         * @return NumberLookupResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberLookupResponse execute() throws ApiException {
            RequestDefinition numberContextLookupDefinition = numberContextLookupDefinition(numberLookupQueryRequest);
            return apiClient.execute(
                    numberContextLookupDefinition, new TypeReference<NumberLookupResponse>() {}.getType());
        }

        /**
         * Executes the numberContextLookup request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberLookupResponse> callback) {
            RequestDefinition numberContextLookupDefinition = numberContextLookupDefinition(numberLookupQueryRequest);
            return apiClient.executeAsync(
                    numberContextLookupDefinition, new TypeReference<NumberLookupResponse>() {}.getType(), callback);
        }
    }

    /**
     * Number Context lookup.
     * <p>
     * This method allows you to get Number Context information for the requested phone numbers. For package change, contact your account manager or [support](https://www.infobip.com/contact).
     *
     * @param numberLookupQueryRequest  (required)
     * @return NumberContextLookupRequest
     */
    public NumberContextLookupRequest numberContextLookup(NumberLookupQueryRequest numberLookupQueryRequest) {
        return new NumberContextLookupRequest(numberLookupQueryRequest);
    }

    private RequestDefinition numberContextLookupAsyncDefinition(NumberLookupNotifyRequest numberLookupNotifyRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number/1/notify")
                .body(numberLookupNotifyRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * numberContextLookupAsync request builder class.
     */
    public class NumberContextLookupAsyncRequest {
        private final NumberLookupNotifyRequest numberLookupNotifyRequest;

        private NumberContextLookupAsyncRequest(NumberLookupNotifyRequest numberLookupNotifyRequest) {
            this.numberLookupNotifyRequest = Objects.requireNonNull(
                    numberLookupNotifyRequest, "The required parameter 'numberLookupNotifyRequest' is missing.");
        }

        /**
         * Executes the numberContextLookupAsync request.
         *
         * @return NumberLookupResponseAsync The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumberLookupResponseAsync execute() throws ApiException {
            RequestDefinition numberContextLookupAsyncDefinition =
                    numberContextLookupAsyncDefinition(numberLookupNotifyRequest);
            return apiClient.execute(
                    numberContextLookupAsyncDefinition, new TypeReference<NumberLookupResponseAsync>() {}.getType());
        }

        /**
         * Executes the numberContextLookupAsync request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumberLookupResponseAsync> callback) {
            RequestDefinition numberContextLookupAsyncDefinition =
                    numberContextLookupAsyncDefinition(numberLookupNotifyRequest);
            return apiClient.executeAsync(
                    numberContextLookupAsyncDefinition,
                    new TypeReference<NumberLookupResponseAsync>() {}.getType(),
                    callback);
        }
    }

    /**
     * Number Context lookup (async).
     * <p>
     * This method allows you to get number context information for requested phone numbers and receive information at some endpoint asynchronously. Information may vary per country and your package. For package change, contact your account manager or [support](https://www.infobip.com/contact).
     *
     * @param numberLookupNotifyRequest  (required)
     * @return NumberContextLookupAsyncRequest
     */
    public NumberContextLookupAsyncRequest numberContextLookupAsync(
            NumberLookupNotifyRequest numberLookupNotifyRequest) {
        return new NumberContextLookupAsyncRequest(numberLookupNotifyRequest);
    }
}
