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
import com.infobip.model.CallsAddress;
import com.infobip.model.CallsCnam;
import com.infobip.model.CallsEmergencyAddress;
import com.infobip.model.CallsEmergencyAddressStatus;
import com.infobip.model.CallsPublicCnamStatus;
import com.infobip.model.CallsValidateAddressResponse;
import com.infobip.model.NumbersAppealRequest;
import com.infobip.model.NumbersAttachNumberPoolRequest;
import com.infobip.model.NumbersBrand;
import com.infobip.model.NumbersBrandStatus;
import com.infobip.model.NumbersBrandVet;
import com.infobip.model.NumbersCampaign;
import com.infobip.model.NumbersDocumentMetadata;
import com.infobip.model.NumbersDownloadResponseModel;
import com.infobip.model.NumbersExternalAutomaticReviewResults;
import com.infobip.model.NumbersNetworkStatus;
import com.infobip.model.NumbersNumberConfigurationModel;
import com.infobip.model.NumbersNumberPoolAvailability;
import com.infobip.model.NumbersNumberPoolUsageApiPageResponse;
import com.infobip.model.NumbersNumberPreviews;
import com.infobip.model.NumbersNumberResponse;
import com.infobip.model.NumbersPageResponseBrand;
import com.infobip.model.NumbersPageResponseBrandVet;
import com.infobip.model.NumbersPageResponseCampaign;
import com.infobip.model.NumbersPriority;
import com.infobip.model.NumbersRegisterCampaignRequest;
import com.infobip.model.NumbersResponse;
import com.infobip.model.NumbersReviewSubmissionResponse;
import com.infobip.model.NumbersTenDlcAiReviewRequest;
import com.infobip.model.NumbersTollFreeUnifiedNumberCampaignApiModel;
import com.infobip.model.NumbersUpdateCampaignRegistrationRequest;
import com.infobip.model.NumbersUpdateOwnedNumberRequest;
import com.infobip.model.NumbersVetImportRequest;
import com.infobip.model.NumbersVoiceSetup;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents NumbersApi API client.
 */
public class NumbersApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of NumbersApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public NumbersApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition addNumbersDefinition(
            UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/add-numbers")
                .body(numbersUpdateCampaignRegistrationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * addNumbers request builder class.
     */
    public class AddNumbersRequest {
        private final UUID campaignId;
        private final NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest;

        private AddNumbersRequest(
                UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersUpdateCampaignRegistrationRequest = Objects.requireNonNull(
                    numbersUpdateCampaignRegistrationRequest,
                    "The required parameter 'numbersUpdateCampaignRegistrationRequest' is missing.");
        }

        /**
         * Executes the addNumbers request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition addNumbersDefinition =
                    addNumbersDefinition(campaignId, numbersUpdateCampaignRegistrationRequest);
            apiClient.execute(addNumbersDefinition);
        }

        /**
         * Executes the addNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition addNumbersDefinition =
                    addNumbersDefinition(campaignId, numbersUpdateCampaignRegistrationRequest);
            return apiClient.executeAsync(addNumbersDefinition, callback);
        }
    }

    /**
     * Add Numbers to Registered Campaign.
     * <p>
     * Adds numbers to campaign that has already been registered. If the campaign registration has not been completed or numbers size exceeds the limit, attempting to update via this api will result in a 400 Bad Request. Numbers which require OSR to be updated in advance could be identified by using Numbers API&#39;s \&quot;List owned number\&quot; GET endpoint.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersUpdateCampaignRegistrationRequest  (required)
     * @return AddNumbersRequest
     */
    public AddNumbersRequest addNumbers(
            UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
        return new AddNumbersRequest(campaignId, numbersUpdateCampaignRegistrationRequest);
    }

    private RequestDefinition appealCampaignDefinition(UUID campaignId, NumbersAppealRequest numbersAppealRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/appeal")
                .body(numbersAppealRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * appealCampaign request builder class.
     */
    public class AppealCampaignRequest {
        private final UUID campaignId;
        private final NumbersAppealRequest numbersAppealRequest;

        private AppealCampaignRequest(UUID campaignId, NumbersAppealRequest numbersAppealRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersAppealRequest = Objects.requireNonNull(
                    numbersAppealRequest, "The required parameter 'numbersAppealRequest' is missing.");
        }

        /**
         * Executes the appealCampaign request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition appealCampaignDefinition = appealCampaignDefinition(campaignId, numbersAppealRequest);
            apiClient.execute(appealCampaignDefinition);
        }

        /**
         * Executes the appealCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition appealCampaignDefinition = appealCampaignDefinition(campaignId, numbersAppealRequest);
            return apiClient.executeAsync(appealCampaignDefinition, callback);
        }
    }

    /**
     * Appeal Campaign.
     * <p>
     * Appeals a rejected 10DLC campaign within the Infobip platform. Campaigns are eligible for appeal if they were rejected within the past 3 months and can be appealed up to five times.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersAppealRequest  (required)
     * @return AppealCampaignRequest
     */
    public AppealCampaignRequest appealCampaign(UUID campaignId, NumbersAppealRequest numbersAppealRequest) {
        return new AppealCampaignRequest(campaignId, numbersAppealRequest);
    }

    private RequestDefinition attachNumberPoolDefinition(
            UUID campaignId, NumbersAttachNumberPoolRequest numbersAttachNumberPoolRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/number-pool/attach")
                .body(numbersAttachNumberPoolRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * attachNumberPool request builder class.
     */
    public class AttachNumberPoolRequest {
        private final UUID campaignId;
        private final NumbersAttachNumberPoolRequest numbersAttachNumberPoolRequest;

        private AttachNumberPoolRequest(
                UUID campaignId, NumbersAttachNumberPoolRequest numbersAttachNumberPoolRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersAttachNumberPoolRequest = Objects.requireNonNull(
                    numbersAttachNumberPoolRequest,
                    "The required parameter 'numbersAttachNumberPoolRequest' is missing.");
        }

        /**
         * Executes the attachNumberPool request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition attachNumberPoolDefinition =
                    attachNumberPoolDefinition(campaignId, numbersAttachNumberPoolRequest);
            apiClient.execute(attachNumberPoolDefinition);
        }

        /**
         * Executes the attachNumberPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition attachNumberPoolDefinition =
                    attachNumberPoolDefinition(campaignId, numbersAttachNumberPoolRequest);
            return apiClient.executeAsync(attachNumberPoolDefinition, callback);
        }
    }

    /**
     * Attach Number Pool to Campaign.
     * <p>
     * Associates an existing number pool with a campaign. Number pooling is required when a campaign utilizes more than 49 numbers. This is common in high-throughput environments such as call centers. Attaching a number pool ensures proper provisioning and compliance with carrier requirements.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersAttachNumberPoolRequest  (required)
     * @return AttachNumberPoolRequest
     */
    public AttachNumberPoolRequest attachNumberPool(
            UUID campaignId, NumbersAttachNumberPoolRequest numbersAttachNumberPoolRequest) {
        return new AttachNumberPoolRequest(campaignId, numbersAttachNumberPoolRequest);
    }

    private RequestDefinition brandAuthVerificationDefinition(UUID brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/brand-auth-verification")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * brandAuthVerification request builder class.
     */
    public class BrandAuthVerificationRequest {
        private final UUID brandId;

        private BrandAuthVerificationRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the brandAuthVerification request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition brandAuthVerificationDefinition = brandAuthVerificationDefinition(brandId);
            apiClient.execute(brandAuthVerificationDefinition);
        }

        /**
         * Executes the brandAuthVerification request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition brandAuthVerificationDefinition = brandAuthVerificationDefinition(brandId);
            return apiClient.executeAsync(brandAuthVerificationDefinition, callback);
        }
    }

    /**
     * Request Brand Authentication+ Verification.
     * <p>
     * Request brand authentication+ verification to finalize brand registration process. This operation can be executed for TENDLC_PUBLIC_COMPANY brand type only when Brand authentication is not in progress.
     *
     * @param brandId The ID of the desired brand. (required)
     * @return BrandAuthVerificationRequest
     */
    public BrandAuthVerificationRequest brandAuthVerification(UUID brandId) {
        return new BrandAuthVerificationRequest(brandId);
    }

    private RequestDefinition cancelNumberDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/numbers/1/numbers/{numberKey}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * cancelNumber request builder class.
     */
    public class CancelNumberRequest {
        private final String numberKey;

        private CancelNumberRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the cancelNumber request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition cancelNumberDefinition = cancelNumberDefinition(numberKey);
            apiClient.execute(cancelNumberDefinition);
        }

        /**
         * Executes the cancelNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition cancelNumberDefinition = cancelNumberDefinition(numberKey);
            return apiClient.executeAsync(cancelNumberDefinition, callback);
        }
    }

    /**
     * Cancel number.
     * <p>
     * This method will cancel your purchased number. The number you cancel will become available in the numbers pool for anyone to buy.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return CancelNumberRequest
     * @see <a href="https://www.infobip.com/docs/numbers/getting-started#cancelling-numbers-over-web-interface-numbers-over-web-interface">Read more about canceling a number</a>
     */
    public CancelNumberRequest cancelNumber(String numberKey) {
        return new CancelNumberRequest(numberKey);
    }

    private RequestDefinition createBrandDefinition(NumbersBrand numbersBrand) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number-registration/1/brands")
                .body(numbersBrand)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createBrand request builder class.
     */
    public class CreateBrandRequest {
        private final NumbersBrand numbersBrand;

        private CreateBrandRequest(NumbersBrand numbersBrand) {
            this.numbersBrand =
                    Objects.requireNonNull(numbersBrand, "The required parameter 'numbersBrand' is missing.");
        }

        /**
         * Executes the createBrand request.
         *
         * @return NumbersBrand The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrand execute() throws ApiException {
            RequestDefinition createBrandDefinition = createBrandDefinition(numbersBrand);
            return apiClient.execute(createBrandDefinition, new TypeReference<NumbersBrand>() {}.getType());
        }

        /**
         * Executes the createBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrand> callback) {
            RequestDefinition createBrandDefinition = createBrandDefinition(numbersBrand);
            return apiClient.executeAsync(
                    createBrandDefinition, new TypeReference<NumbersBrand>() {}.getType(), callback);
        }
    }

    /**
     * Create Brand.
     * <p>
     * Creates a brand within the Infobip platform. This operation does not register the brand with any registrars. Registration can be done using created brand&#39;s ID with the &#39;Register Brand&#39; endpoint.
     *
     * @param numbersBrand  (required)
     * @return CreateBrandRequest
     */
    public CreateBrandRequest createBrand(NumbersBrand numbersBrand) {
        return new CreateBrandRequest(numbersBrand);
    }

    private RequestDefinition createCampaignDefinition(NumbersCampaign numbersCampaign) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number-registration/1/campaigns")
                .body(numbersCampaign)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createCampaign request builder class.
     */
    public class CreateCampaignRequest {
        private final NumbersCampaign numbersCampaign;

        private CreateCampaignRequest(NumbersCampaign numbersCampaign) {
            this.numbersCampaign =
                    Objects.requireNonNull(numbersCampaign, "The required parameter 'numbersCampaign' is missing.");
        }

        /**
         * Executes the createCampaign request.
         *
         * @return NumbersCampaign The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersCampaign execute() throws ApiException {
            RequestDefinition createCampaignDefinition = createCampaignDefinition(numbersCampaign);
            return apiClient.execute(createCampaignDefinition, new TypeReference<NumbersCampaign>() {}.getType());
        }

        /**
         * Executes the createCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersCampaign> callback) {
            RequestDefinition createCampaignDefinition = createCampaignDefinition(numbersCampaign);
            return apiClient.executeAsync(
                    createCampaignDefinition, new TypeReference<NumbersCampaign>() {}.getType(), callback);
        }
    }

    /**
     * Create Campaign.
     * <p>
     * Creates a campaign within the Infobip platform. This operation does not register the campaign with any networks. Registration can be done using created campaign&#39;s ID with the &#39;Register Campaign&#39; endpoint.
     *
     * @param numbersCampaign  (required)
     * @return CreateCampaignRequest
     */
    public CreateCampaignRequest createCampaign(NumbersCampaign numbersCampaign) {
        return new CreateCampaignRequest(numbersCampaign);
    }

    private RequestDefinition createCnamDefinition(String numberKey, CallsCnam callsCnam) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/numbers/2/numbers/{numberKey}/voice/cnam")
                .body(callsCnam)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * createCnam request builder class.
     */
    public class CreateCnamRequest {
        private final String numberKey;
        private final CallsCnam callsCnam;

        private CreateCnamRequest(String numberKey, CallsCnam callsCnam) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.callsCnam = Objects.requireNonNull(callsCnam, "The required parameter 'callsCnam' is missing.");
        }

        /**
         * Executes the createCnam request.
         *
         * @return CallsCnam The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsCnam execute() throws ApiException {
            RequestDefinition createCnamDefinition = createCnamDefinition(numberKey, callsCnam);
            return apiClient.execute(createCnamDefinition, new TypeReference<CallsCnam>() {}.getType());
        }

        /**
         * Executes the createCnam request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsCnam> callback) {
            RequestDefinition createCnamDefinition = createCnamDefinition(numberKey, callsCnam);
            return apiClient.executeAsync(createCnamDefinition, new TypeReference<CallsCnam>() {}.getType(), callback);
        }
    }

    /**
     * Create CNAM.
     * <p>
     * Create CNAM configuration.  This is currently available only for United States and Canada numbers.
     *
     * @param numberKey Unique ID of a number. (required)
     * @param callsCnam  (required)
     * @return CreateCnamRequest
     */
    public CreateCnamRequest createCnam(String numberKey, CallsCnam callsCnam) {
        return new CreateCnamRequest(numberKey, callsCnam);
    }

    private RequestDefinition createEmergencyServiceDefinition(
            String numberKey, CallsEmergencyAddress callsEmergencyAddress) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/numbers/2/numbers/{numberKey}/voice/emergency-service")
                .body(callsEmergencyAddress)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * createEmergencyService request builder class.
     */
    public class CreateEmergencyServiceRequest {
        private final String numberKey;
        private final CallsEmergencyAddress callsEmergencyAddress;

        private CreateEmergencyServiceRequest(String numberKey, CallsEmergencyAddress callsEmergencyAddress) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.callsEmergencyAddress = Objects.requireNonNull(
                    callsEmergencyAddress, "The required parameter 'callsEmergencyAddress' is missing.");
        }

        /**
         * Executes the createEmergencyService request.
         *
         * @return CallsEmergencyAddress The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsEmergencyAddress execute() throws ApiException {
            RequestDefinition createEmergencyServiceDefinition =
                    createEmergencyServiceDefinition(numberKey, callsEmergencyAddress);
            return apiClient.execute(
                    createEmergencyServiceDefinition, new TypeReference<CallsEmergencyAddress>() {}.getType());
        }

        /**
         * Executes the createEmergencyService request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsEmergencyAddress> callback) {
            RequestDefinition createEmergencyServiceDefinition =
                    createEmergencyServiceDefinition(numberKey, callsEmergencyAddress);
            return apiClient.executeAsync(
                    createEmergencyServiceDefinition,
                    new TypeReference<CallsEmergencyAddress>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create Emergency Service Address.
     * <p>
     * Create Emergency Service Address  Emergency Service Address allows you to set any physical address in the United States as your address to be transmitted on emergency number calls. This means your calls to the emergency number will route to the closest PSAP (Public Safety Answering Point) to your registered address on our system.   That address will also appear on the emergency services operator’s screen when you call.
     *
     * @param numberKey Unique ID of a number. (required)
     * @param callsEmergencyAddress  (required)
     * @return CreateEmergencyServiceRequest
     */
    public CreateEmergencyServiceRequest createEmergencyService(
            String numberKey, CallsEmergencyAddress callsEmergencyAddress) {
        return new CreateEmergencyServiceRequest(numberKey, callsEmergencyAddress);
    }

    private RequestDefinition createRecordingConfigurationDefinition(
            NumbersNumberConfigurationModel numbersNumberConfigurationModel) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/voice/recording/1/configuration/numbers")
                .body(numbersNumberConfigurationModel)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createRecordingConfiguration request builder class.
     */
    public class CreateRecordingConfigurationRequest {
        private final NumbersNumberConfigurationModel numbersNumberConfigurationModel;

        private CreateRecordingConfigurationRequest(NumbersNumberConfigurationModel numbersNumberConfigurationModel) {
            this.numbersNumberConfigurationModel = Objects.requireNonNull(
                    numbersNumberConfigurationModel,
                    "The required parameter 'numbersNumberConfigurationModel' is missing.");
        }

        /**
         * Executes the createRecordingConfiguration request.
         *
         * @return NumbersNumberConfigurationModel The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberConfigurationModel execute() throws ApiException {
            RequestDefinition createRecordingConfigurationDefinition =
                    createRecordingConfigurationDefinition(numbersNumberConfigurationModel);
            return apiClient.execute(
                    createRecordingConfigurationDefinition,
                    new TypeReference<NumbersNumberConfigurationModel>() {}.getType());
        }

        /**
         * Executes the createRecordingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberConfigurationModel> callback) {
            RequestDefinition createRecordingConfigurationDefinition =
                    createRecordingConfigurationDefinition(numbersNumberConfigurationModel);
            return apiClient.executeAsync(
                    createRecordingConfigurationDefinition,
                    new TypeReference<NumbersNumberConfigurationModel>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create voice recording configuration.
     * <p>
     * This method allows you to set up recording configuration for the Voice number that has a &#x60;Forward to phone&#x60; or &#x60;Forward to IP&#x60; action enabled. Once you purchase a Voice number and attach a voice action to it, you can make additional recording configuration. Enabling recording on a Voice number means that each call made on this number will be recorded.   By default, the recording is disabled on all numbers.    **NOTE** Changing an action on a number doesn&#39;t disable the recording feature.
     *
     * @param numbersNumberConfigurationModel  (required)
     * @return CreateRecordingConfigurationRequest
     */
    public CreateRecordingConfigurationRequest createRecordingConfiguration(
            NumbersNumberConfigurationModel numbersNumberConfigurationModel) {
        return new CreateRecordingConfigurationRequest(numbersNumberConfigurationModel);
    }

    private RequestDefinition createTollFreeCampaignDefinition(
            NumbersTollFreeUnifiedNumberCampaignApiModel numbersTollFreeUnifiedNumberCampaignApiModel) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/toll-free")
                .body(numbersTollFreeUnifiedNumberCampaignApiModel)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createTollFreeCampaign request builder class.
     */
    public class CreateTollFreeCampaignRequest {
        private final NumbersTollFreeUnifiedNumberCampaignApiModel numbersTollFreeUnifiedNumberCampaignApiModel;

        private CreateTollFreeCampaignRequest(
                NumbersTollFreeUnifiedNumberCampaignApiModel numbersTollFreeUnifiedNumberCampaignApiModel) {
            this.numbersTollFreeUnifiedNumberCampaignApiModel = Objects.requireNonNull(
                    numbersTollFreeUnifiedNumberCampaignApiModel,
                    "The required parameter 'numbersTollFreeUnifiedNumberCampaignApiModel' is missing.");
        }

        /**
         * Executes the createTollFreeCampaign request.
         *
         * @return NumbersTollFreeUnifiedNumberCampaignApiModel The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersTollFreeUnifiedNumberCampaignApiModel execute() throws ApiException {
            RequestDefinition createTollFreeCampaignDefinition =
                    createTollFreeCampaignDefinition(numbersTollFreeUnifiedNumberCampaignApiModel);
            return apiClient.execute(
                    createTollFreeCampaignDefinition,
                    new TypeReference<NumbersTollFreeUnifiedNumberCampaignApiModel>() {}.getType());
        }

        /**
         * Executes the createTollFreeCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersTollFreeUnifiedNumberCampaignApiModel> callback) {
            RequestDefinition createTollFreeCampaignDefinition =
                    createTollFreeCampaignDefinition(numbersTollFreeUnifiedNumberCampaignApiModel);
            return apiClient.executeAsync(
                    createTollFreeCampaignDefinition,
                    new TypeReference<NumbersTollFreeUnifiedNumberCampaignApiModel>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create Toll Free Campaign.
     * <p>
     * Creates a toll free campaign within the Infobip platform.
     *
     * @param numbersTollFreeUnifiedNumberCampaignApiModel  (required)
     * @return CreateTollFreeCampaignRequest
     */
    public CreateTollFreeCampaignRequest createTollFreeCampaign(
            NumbersTollFreeUnifiedNumberCampaignApiModel numbersTollFreeUnifiedNumberCampaignApiModel) {
        return new CreateTollFreeCampaignRequest(numbersTollFreeUnifiedNumberCampaignApiModel);
    }

    private RequestDefinition createVoiceSetupOnNumberDefinition(
            String numberKey, NumbersVoiceSetup numbersVoiceSetup) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/numbers/2/numbers/{numberKey}/voice")
                .body(numbersVoiceSetup)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * createVoiceSetupOnNumber request builder class.
     */
    public class CreateVoiceSetupOnNumberRequest {
        private final String numberKey;
        private final NumbersVoiceSetup numbersVoiceSetup;

        private CreateVoiceSetupOnNumberRequest(String numberKey, NumbersVoiceSetup numbersVoiceSetup) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.numbersVoiceSetup =
                    Objects.requireNonNull(numbersVoiceSetup, "The required parameter 'numbersVoiceSetup' is missing.");
        }

        /**
         * Executes the createVoiceSetupOnNumber request.
         *
         * @return NumbersVoiceSetup The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersVoiceSetup execute() throws ApiException {
            RequestDefinition createVoiceSetupOnNumberDefinition =
                    createVoiceSetupOnNumberDefinition(numberKey, numbersVoiceSetup);
            return apiClient.execute(
                    createVoiceSetupOnNumberDefinition, new TypeReference<NumbersVoiceSetup>() {}.getType());
        }

        /**
         * Executes the createVoiceSetupOnNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersVoiceSetup> callback) {
            RequestDefinition createVoiceSetupOnNumberDefinition =
                    createVoiceSetupOnNumberDefinition(numberKey, numbersVoiceSetup);
            return apiClient.executeAsync(
                    createVoiceSetupOnNumberDefinition, new TypeReference<NumbersVoiceSetup>() {}.getType(), callback);
        }
    }

    /**
     * Create voice setup on number.
     * <p>
     * This method will create a new voice setup on a number. There can be only one voice action set for the number.
     *
     * @param numberKey Unique ID of a number. (required)
     * @param numbersVoiceSetup voiceSetupRequest (required)
     * @return CreateVoiceSetupOnNumberRequest
     */
    public CreateVoiceSetupOnNumberRequest createVoiceSetupOnNumber(
            String numberKey, NumbersVoiceSetup numbersVoiceSetup) {
        return new CreateVoiceSetupOnNumberRequest(numberKey, numbersVoiceSetup);
    }

    private RequestDefinition deleteBrandDefinition(UUID brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/number-registration/1/brands/{brandId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * deleteBrand request builder class.
     */
    public class DeleteBrandRequest {
        private final UUID brandId;

        private DeleteBrandRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the deleteBrand request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteBrandDefinition = deleteBrandDefinition(brandId);
            apiClient.execute(deleteBrandDefinition);
        }

        /**
         * Executes the deleteBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteBrandDefinition = deleteBrandDefinition(brandId);
            return apiClient.executeAsync(deleteBrandDefinition, callback);
        }
    }

    /**
     * Delete Brand.
     * <p>
     * Removes a previously created brand by its ID. This operation is only supported if all associated campaigns are in a stage that allows deletion (applies to vetted and non-vetted brands).
     *
     * @param brandId The ID of the brand to delete. (required)
     * @return DeleteBrandRequest
     */
    public DeleteBrandRequest deleteBrand(UUID brandId) {
        return new DeleteBrandRequest(brandId);
    }

    private RequestDefinition deleteCampaignDefinition(UUID campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/number-registration/1/campaigns/{campaignId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * deleteCampaign request builder class.
     */
    public class DeleteCampaignRequest {
        private final UUID campaignId;

        private DeleteCampaignRequest(UUID campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the deleteCampaign request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteCampaignDefinition = deleteCampaignDefinition(campaignId);
            apiClient.execute(deleteCampaignDefinition);
        }

        /**
         * Executes the deleteCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteCampaignDefinition = deleteCampaignDefinition(campaignId);
            return apiClient.executeAsync(deleteCampaignDefinition, callback);
        }
    }

    /**
     * Delete Campaign.
     * <p>
     * Removes a previously created campaign by its ID. This operation is only supported for campaigns that are in DRAFT, DEREGISTERED or REJECTED stage.
     *
     * @param campaignId The ID of the campaign to delete. (required)
     * @return DeleteCampaignRequest
     */
    public DeleteCampaignRequest deleteCampaign(UUID campaignId) {
        return new DeleteCampaignRequest(campaignId);
    }

    private RequestDefinition deleteCnamDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/numbers/2/numbers/{numberKey}/voice/cnam")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * deleteCnam request builder class.
     */
    public class DeleteCnamRequest {
        private final String numberKey;

        private DeleteCnamRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the deleteCnam request.
         *
         * @return CallsCnam The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsCnam execute() throws ApiException {
            RequestDefinition deleteCnamDefinition = deleteCnamDefinition(numberKey);
            return apiClient.execute(deleteCnamDefinition, new TypeReference<CallsCnam>() {}.getType());
        }

        /**
         * Executes the deleteCnam request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsCnam> callback) {
            RequestDefinition deleteCnamDefinition = deleteCnamDefinition(numberKey);
            return apiClient.executeAsync(deleteCnamDefinition, new TypeReference<CallsCnam>() {}.getType(), callback);
        }
    }

    /**
     * Delete CNAM.
     * <p>
     * Delete CNAM configuration.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return DeleteCnamRequest
     */
    public DeleteCnamRequest deleteCnam(String numberKey) {
        return new DeleteCnamRequest(numberKey);
    }

    private RequestDefinition deleteEmergencyServiceDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/numbers/2/numbers/{numberKey}/voice/emergency-service")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * deleteEmergencyService request builder class.
     */
    public class DeleteEmergencyServiceRequest {
        private final String numberKey;

        private DeleteEmergencyServiceRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the deleteEmergencyService request.
         *
         * @return CallsEmergencyAddress The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsEmergencyAddress execute() throws ApiException {
            RequestDefinition deleteEmergencyServiceDefinition = deleteEmergencyServiceDefinition(numberKey);
            return apiClient.execute(
                    deleteEmergencyServiceDefinition, new TypeReference<CallsEmergencyAddress>() {}.getType());
        }

        /**
         * Executes the deleteEmergencyService request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsEmergencyAddress> callback) {
            RequestDefinition deleteEmergencyServiceDefinition = deleteEmergencyServiceDefinition(numberKey);
            return apiClient.executeAsync(
                    deleteEmergencyServiceDefinition,
                    new TypeReference<CallsEmergencyAddress>() {}.getType(),
                    callback);
        }
    }

    /**
     * Delete Emergency Service Address.
     * <p>
     * Delete a Emergency Service Address
     *
     * @param numberKey Unique ID of a number. (required)
     * @return DeleteEmergencyServiceRequest
     */
    public DeleteEmergencyServiceRequest deleteEmergencyService(String numberKey) {
        return new DeleteEmergencyServiceRequest(numberKey);
    }

    private RequestDefinition deleteVoiceSetupOnNumberDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/numbers/2/numbers/{numberKey}/voice")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * deleteVoiceSetupOnNumber request builder class.
     */
    public class DeleteVoiceSetupOnNumberRequest {
        private final String numberKey;

        private DeleteVoiceSetupOnNumberRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the deleteVoiceSetupOnNumber request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteVoiceSetupOnNumberDefinition = deleteVoiceSetupOnNumberDefinition(numberKey);
            apiClient.execute(deleteVoiceSetupOnNumberDefinition);
        }

        /**
         * Executes the deleteVoiceSetupOnNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteVoiceSetupOnNumberDefinition = deleteVoiceSetupOnNumberDefinition(numberKey);
            return apiClient.executeAsync(deleteVoiceSetupOnNumberDefinition, callback);
        }
    }

    /**
     * Delete voice setup on number.
     * <p>
     * This method removes voice setup from a number.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return DeleteVoiceSetupOnNumberRequest
     */
    public DeleteVoiceSetupOnNumberRequest deleteVoiceSetupOnNumber(String numberKey) {
        return new DeleteVoiceSetupOnNumberRequest(numberKey);
    }

    private RequestDefinition deregisterCampaignDefinition(UUID campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/deregister")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * deregisterCampaign request builder class.
     */
    public class DeregisterCampaignRequest {
        private final UUID campaignId;

        private DeregisterCampaignRequest(UUID campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the deregisterCampaign request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deregisterCampaignDefinition = deregisterCampaignDefinition(campaignId);
            apiClient.execute(deregisterCampaignDefinition);
        }

        /**
         * Executes the deregisterCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deregisterCampaignDefinition = deregisterCampaignDefinition(campaignId);
            return apiClient.executeAsync(deregisterCampaignDefinition, callback);
        }
    }

    /**
     * Deregister Campaign.
     * <p>
     * Deregisters the campaign with the given ID with all available networks.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @return DeregisterCampaignRequest
     */
    public DeregisterCampaignRequest deregisterCampaign(UUID campaignId) {
        return new DeregisterCampaignRequest(campaignId);
    }

    private RequestDefinition detachNumberPoolDefinition(UUID campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/number-pool/detach")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * detachNumberPool request builder class.
     */
    public class DetachNumberPoolRequest {
        private final UUID campaignId;

        private DetachNumberPoolRequest(UUID campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the detachNumberPool request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition detachNumberPoolDefinition = detachNumberPoolDefinition(campaignId);
            apiClient.execute(detachNumberPoolDefinition);
        }

        /**
         * Executes the detachNumberPool request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition detachNumberPoolDefinition = detachNumberPoolDefinition(campaignId);
            return apiClient.executeAsync(detachNumberPoolDefinition, callback);
        }
    }

    /**
     * Detach Number Pool from Campaign.
     * <p>
     * Detaches an existing number pool from the specified campaign. This operation is subject to validation: the campaign must have fewer than 50 assigned numbers at the time of detachment.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @return DetachNumberPoolRequest
     */
    public DetachNumberPoolRequest detachNumberPool(UUID campaignId) {
        return new DetachNumberPoolRequest(campaignId);
    }

    private RequestDefinition downloadDocumentContentDefinition(UUID documentId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/documents/{documentId}")
                .requiresAuthentication(true)
                .accept("application/octet-stream");

        if (documentId != null) {
            builder.addPathParameter(new Parameter("documentId", documentId));
        }
        return builder.build();
    }

    /**
     * downloadDocumentContent request builder class.
     */
    public class DownloadDocumentContentRequest {
        private final UUID documentId;

        private DownloadDocumentContentRequest(UUID documentId) {
            this.documentId = Objects.requireNonNull(documentId, "The required parameter 'documentId' is missing.");
        }

        /**
         * Executes the downloadDocumentContent request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition downloadDocumentContentDefinition = downloadDocumentContentDefinition(documentId);
            return apiClient.execute(downloadDocumentContentDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the downloadDocumentContent request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition downloadDocumentContentDefinition = downloadDocumentContentDefinition(documentId);
            return apiClient.executeAsync(
                    downloadDocumentContentDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Download Document.
     * <p>
     * Downloads a document file by its unique identifier. Access to the document is restricted based on account ownership.
     *
     * @param documentId Unique identifier for the document. (required)
     * @return DownloadDocumentContentRequest
     */
    public DownloadDocumentContentRequest downloadDocumentContent(UUID documentId) {
        return new DownloadDocumentContentRequest(documentId);
    }

    private RequestDefinition getAiReviewResultsDefinition(UUID requestUuid) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/automatic-review/{requestUuid}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (requestUuid != null) {
            builder.addPathParameter(new Parameter("requestUuid", requestUuid));
        }
        return builder.build();
    }

    /**
     * getAiReviewResults request builder class.
     */
    public class GetAiReviewResultsRequest {
        private final UUID requestUuid;

        private GetAiReviewResultsRequest(UUID requestUuid) {
            this.requestUuid = Objects.requireNonNull(requestUuid, "The required parameter 'requestUuid' is missing.");
        }

        /**
         * Executes the getAiReviewResults request.
         *
         * @return NumbersExternalAutomaticReviewResults The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersExternalAutomaticReviewResults execute() throws ApiException {
            RequestDefinition getAiReviewResultsDefinition = getAiReviewResultsDefinition(requestUuid);
            return apiClient.execute(
                    getAiReviewResultsDefinition,
                    new TypeReference<NumbersExternalAutomaticReviewResults>() {}.getType());
        }

        /**
         * Executes the getAiReviewResults request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersExternalAutomaticReviewResults> callback) {
            RequestDefinition getAiReviewResultsDefinition = getAiReviewResultsDefinition(requestUuid);
            return apiClient.executeAsync(
                    getAiReviewResultsDefinition,
                    new TypeReference<NumbersExternalAutomaticReviewResults>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get AI Review Results.
     * <p>
     * Retrieves the results of a campaign AI compliance review by its request UUID. Contact your account manager to learn more.
     *
     * @param requestUuid The UUID of the AI review request. (required)
     * @return GetAiReviewResultsRequest
     */
    public GetAiReviewResultsRequest getAiReviewResults(UUID requestUuid) {
        return new GetAiReviewResultsRequest(requestUuid);
    }

    private RequestDefinition getBrandDefinition(UUID brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/number-registration/1/brands/{brandId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * getBrand request builder class.
     */
    public class GetBrandRequest {
        private final UUID brandId;

        private GetBrandRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the getBrand request.
         *
         * @return NumbersBrand The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrand execute() throws ApiException {
            RequestDefinition getBrandDefinition = getBrandDefinition(brandId);
            return apiClient.execute(getBrandDefinition, new TypeReference<NumbersBrand>() {}.getType());
        }

        /**
         * Executes the getBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrand> callback) {
            RequestDefinition getBrandDefinition = getBrandDefinition(brandId);
            return apiClient.executeAsync(getBrandDefinition, new TypeReference<NumbersBrand>() {}.getType(), callback);
        }
    }

    /**
     * Get Brand.
     * <p>
     * Retrieves a previously created brand by its ID.
     *
     * @param brandId The ID of the desired brand. (required)
     * @return GetBrandRequest
     */
    public GetBrandRequest getBrand(UUID brandId) {
        return new GetBrandRequest(brandId);
    }

    private RequestDefinition getBrandEnhancedVetReportDefinition(UUID brandId, UUID vetId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/brands/{brandId}/vets/{vetId}/report")
                .requiresAuthentication(true)
                .accept("application/octet-stream");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        if (vetId != null) {
            builder.addPathParameter(new Parameter("vetId", vetId));
        }
        return builder.build();
    }

    /**
     * getBrandEnhancedVetReport request builder class.
     */
    public class GetBrandEnhancedVetReportRequest {
        private final UUID brandId;
        private final UUID vetId;

        private GetBrandEnhancedVetReportRequest(UUID brandId, UUID vetId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.vetId = Objects.requireNonNull(vetId, "The required parameter 'vetId' is missing.");
        }

        /**
         * Executes the getBrandEnhancedVetReport request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition getBrandEnhancedVetReportDefinition = getBrandEnhancedVetReportDefinition(brandId, vetId);
            return apiClient.execute(getBrandEnhancedVetReportDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the getBrandEnhancedVetReport request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition getBrandEnhancedVetReportDefinition = getBrandEnhancedVetReportDefinition(brandId, vetId);
            return apiClient.executeAsync(
                    getBrandEnhancedVetReportDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Get Brand Enhanced Vet Report.
     * <p>
     * Retrieves brand enhanced vet report by given vetId.
     *
     * @param brandId The ID of the desired brand. (required)
     * @param vetId The ID of the desired vet. (required)
     * @return GetBrandEnhancedVetReportRequest
     */
    public GetBrandEnhancedVetReportRequest getBrandEnhancedVetReport(UUID brandId, UUID vetId) {
        return new GetBrandEnhancedVetReportRequest(brandId, vetId);
    }

    private RequestDefinition getBrandRegistrarStatusesDefinition(UUID brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/brands/{brandId}/registrar-statuses")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * getBrandRegistrarStatuses request builder class.
     */
    public class GetBrandRegistrarStatusesRequest {
        private final UUID brandId;

        private GetBrandRegistrarStatusesRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the getBrandRegistrarStatuses request.
         *
         * @return List&lt;NumbersBrandStatus&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<NumbersBrandStatus> execute() throws ApiException {
            RequestDefinition getBrandRegistrarStatusesDefinition = getBrandRegistrarStatusesDefinition(brandId);
            return apiClient.execute(
                    getBrandRegistrarStatusesDefinition, new TypeReference<List<NumbersBrandStatus>>() {}.getType());
        }

        /**
         * Executes the getBrandRegistrarStatuses request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<NumbersBrandStatus>> callback) {
            RequestDefinition getBrandRegistrarStatusesDefinition = getBrandRegistrarStatusesDefinition(brandId);
            return apiClient.executeAsync(
                    getBrandRegistrarStatusesDefinition,
                    new TypeReference<List<NumbersBrandStatus>>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Brand Registrar Statuses.
     * <p>
     * Retrieves status of a registered brand for each registrar.
     *
     * @param brandId The ID of the desired brand. (required)
     * @return GetBrandRegistrarStatusesRequest
     */
    public GetBrandRegistrarStatusesRequest getBrandRegistrarStatuses(UUID brandId) {
        return new GetBrandRegistrarStatusesRequest(brandId);
    }

    private RequestDefinition getBrandVetDefinition(UUID brandId, UUID vetId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/brands/{brandId}/vets/{vetId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        if (vetId != null) {
            builder.addPathParameter(new Parameter("vetId", vetId));
        }
        return builder.build();
    }

    /**
     * getBrandVet request builder class.
     */
    public class GetBrandVetRequest {
        private final UUID brandId;
        private final UUID vetId;

        private GetBrandVetRequest(UUID brandId, UUID vetId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.vetId = Objects.requireNonNull(vetId, "The required parameter 'vetId' is missing.");
        }

        /**
         * Executes the getBrandVet request.
         *
         * @return NumbersBrandVet The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrandVet execute() throws ApiException {
            RequestDefinition getBrandVetDefinition = getBrandVetDefinition(brandId, vetId);
            return apiClient.execute(getBrandVetDefinition, new TypeReference<NumbersBrandVet>() {}.getType());
        }

        /**
         * Executes the getBrandVet request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrandVet> callback) {
            RequestDefinition getBrandVetDefinition = getBrandVetDefinition(brandId, vetId);
            return apiClient.executeAsync(
                    getBrandVetDefinition, new TypeReference<NumbersBrandVet>() {}.getType(), callback);
        }
    }

    /**
     * Get Brand Vet.
     * <p>
     * Retrieves brand vet done for the brand with the given ID.
     *
     * @param brandId The ID of the desired brand. (required)
     * @param vetId The ID of the desired vet. (required)
     * @return GetBrandVetRequest
     */
    public GetBrandVetRequest getBrandVet(UUID brandId, UUID vetId) {
        return new GetBrandVetRequest(brandId, vetId);
    }

    private RequestDefinition getBrandVetsDefinition(UUID brandId, Integer page, Integer size, List<String> sort) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/brands/{brandId}/vets")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        if (sort != null) {
            for (var parameterItem : sort) {
                builder.addQueryParameter(new Parameter("sort", parameterItem));
            }
        }
        return builder.build();
    }

    /**
     * getBrandVets request builder class.
     */
    public class GetBrandVetsRequest {
        private final UUID brandId;
        private Integer page;
        private Integer size;
        private List<String> sort;

        private GetBrandVetsRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Sets page.
         *
         * @param page Results page you want to retrieve (0..N). The default value is 0. (optional)
         * @return GetBrandVetsRequest
         */
        public GetBrandVetsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page (0..2000). The default value is 20. The maximum value is 2000. (optional)
         * @return GetBrandVetsRequest
         */
        public GetBrandVetsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Sets sort.
         *
         * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Sortable Properties: &#39;vetId&#39;, &#39;type&#39;, &#39;vettedDate&#39;, &#39;enhancedVettedDate&#39;. (optional)
         * @return GetBrandVetsRequest
         */
        public GetBrandVetsRequest sort(List<String> sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Executes the getBrandVets request.
         *
         * @return NumbersPageResponseBrandVet The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersPageResponseBrandVet execute() throws ApiException {
            RequestDefinition getBrandVetsDefinition = getBrandVetsDefinition(brandId, page, size, sort);
            return apiClient.execute(
                    getBrandVetsDefinition, new TypeReference<NumbersPageResponseBrandVet>() {}.getType());
        }

        /**
         * Executes the getBrandVets request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersPageResponseBrandVet> callback) {
            RequestDefinition getBrandVetsDefinition = getBrandVetsDefinition(brandId, page, size, sort);
            return apiClient.executeAsync(
                    getBrandVetsDefinition, new TypeReference<NumbersPageResponseBrandVet>() {}.getType(), callback);
        }
    }

    /**
     * Get Brand Vets.
     * <p>
     * Retrieves all vets done for the brand with the given ID.
     *
     * @param brandId The ID of the desired brand. (required)
     * @return GetBrandVetsRequest
     */
    public GetBrandVetsRequest getBrandVets(UUID brandId) {
        return new GetBrandVetsRequest(brandId);
    }

    private RequestDefinition getBrandsDefinition(
            List<UUID> id,
            List<String> type,
            String nameLike,
            List<String> referenceId,
            Integer page,
            Integer size,
            List<String> sort) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/number-registration/1/brands")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            for (var parameterItem : id) {
                builder.addQueryParameter(new Parameter("id", parameterItem));
            }
        }
        if (type != null) {
            for (var parameterItem : type) {
                builder.addQueryParameter(new Parameter("type", parameterItem));
            }
        }
        if (nameLike != null) {
            builder.addQueryParameter(new Parameter("nameLike", nameLike));
        }
        if (referenceId != null) {
            for (var parameterItem : referenceId) {
                builder.addQueryParameter(new Parameter("referenceId", parameterItem));
            }
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        if (sort != null) {
            for (var parameterItem : sort) {
                builder.addQueryParameter(new Parameter("sort", parameterItem));
            }
        }
        return builder.build();
    }

    /**
     * getBrands request builder class.
     */
    public class GetBrandsRequest {
        private List<UUID> id;
        private List<String> type;
        private String nameLike;
        private List<String> referenceId;
        private Integer page;
        private Integer size;
        private List<String> sort;

        private GetBrandsRequest() {}

        /**
         * Sets id.
         *
         * @param id Filters brands to those that match the supplied ID(s). (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest id(List<UUID> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets type.
         *
         * @param type Filters brands to those that match the supplied brand types(s). (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest type(List<String> type) {
            this.type = type;
            return this;
        }

        /**
         * Sets nameLike.
         *
         * @param nameLike Filters brands to those whose names contain the supplied name. (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest nameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }

        /**
         * Sets referenceId.
         *
         * @param referenceId Filters brands to those that match the supplied referenceId(s). (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest referenceId(List<String> referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page you want to retrieve (0..N). The default value is 0. (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page (0..2000). The default value is 20. The maximum value is 2000. (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Sets sort.
         *
         * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Sortable Properties: &#39;id&#39;, &#39;name&#39;, &#39;type&#39;, &#39;createdDate&#39;, &#39;lastModifiedDate&#39;. (optional)
         * @return GetBrandsRequest
         */
        public GetBrandsRequest sort(List<String> sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Executes the getBrands request.
         *
         * @return NumbersPageResponseBrand The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersPageResponseBrand execute() throws ApiException {
            RequestDefinition getBrandsDefinition =
                    getBrandsDefinition(id, type, nameLike, referenceId, page, size, sort);
            return apiClient.execute(getBrandsDefinition, new TypeReference<NumbersPageResponseBrand>() {}.getType());
        }

        /**
         * Executes the getBrands request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersPageResponseBrand> callback) {
            RequestDefinition getBrandsDefinition =
                    getBrandsDefinition(id, type, nameLike, referenceId, page, size, sort);
            return apiClient.executeAsync(
                    getBrandsDefinition, new TypeReference<NumbersPageResponseBrand>() {}.getType(), callback);
        }
    }

    /**
     * Get Brands.
     * <p>
     * Get a page of brands, using query parameters to filter results.
     *
     * @return GetBrandsRequest
     */
    public GetBrandsRequest getBrands() {
        return new GetBrandsRequest();
    }

    private RequestDefinition getCampaignDefinition(UUID campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/campaigns/{campaignId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * getCampaign request builder class.
     */
    public class GetCampaignRequest {
        private final UUID campaignId;

        private GetCampaignRequest(UUID campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the getCampaign request.
         *
         * @return NumbersCampaign The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersCampaign execute() throws ApiException {
            RequestDefinition getCampaignDefinition = getCampaignDefinition(campaignId);
            return apiClient.execute(getCampaignDefinition, new TypeReference<NumbersCampaign>() {}.getType());
        }

        /**
         * Executes the getCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersCampaign> callback) {
            RequestDefinition getCampaignDefinition = getCampaignDefinition(campaignId);
            return apiClient.executeAsync(
                    getCampaignDefinition, new TypeReference<NumbersCampaign>() {}.getType(), callback);
        }
    }

    /**
     * Get Campaign.
     * <p>
     * Retrieves a previously created campaign by its ID.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @return GetCampaignRequest
     */
    public GetCampaignRequest getCampaign(UUID campaignId) {
        return new GetCampaignRequest(campaignId);
    }

    private RequestDefinition getCampaignNetworkStatusesDefinition(UUID campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/campaigns/{campaignId}/network-statuses")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * getCampaignNetworkStatuses request builder class.
     */
    public class GetCampaignNetworkStatusesRequest {
        private final UUID campaignId;

        private GetCampaignNetworkStatusesRequest(UUID campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the getCampaignNetworkStatuses request.
         *
         * @return NumbersNetworkStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNetworkStatus execute() throws ApiException {
            RequestDefinition getCampaignNetworkStatusesDefinition = getCampaignNetworkStatusesDefinition(campaignId);
            return apiClient.execute(
                    getCampaignNetworkStatusesDefinition, new TypeReference<NumbersNetworkStatus>() {}.getType());
        }

        /**
         * Executes the getCampaignNetworkStatuses request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNetworkStatus> callback) {
            RequestDefinition getCampaignNetworkStatusesDefinition = getCampaignNetworkStatusesDefinition(campaignId);
            return apiClient.executeAsync(
                    getCampaignNetworkStatusesDefinition,
                    new TypeReference<NumbersNetworkStatus>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Campaign Network Statuses.
     * <p>
     * Retrieves status of a registered campaign for each network.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @return GetCampaignNetworkStatusesRequest
     */
    public GetCampaignNetworkStatusesRequest getCampaignNetworkStatuses(UUID campaignId) {
        return new GetCampaignNetworkStatusesRequest(campaignId);
    }

    private RequestDefinition getCampaignNumbersDefinition(UUID campaignId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/campaigns/{campaignId}/numbers")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * getCampaignNumbers request builder class.
     */
    public class GetCampaignNumbersRequest {
        private final UUID campaignId;

        private GetCampaignNumbersRequest(UUID campaignId) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
        }

        /**
         * Executes the getCampaignNumbers request.
         *
         * @return NumbersNumberPreviews The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberPreviews execute() throws ApiException {
            RequestDefinition getCampaignNumbersDefinition = getCampaignNumbersDefinition(campaignId);
            return apiClient.execute(
                    getCampaignNumbersDefinition, new TypeReference<NumbersNumberPreviews>() {}.getType());
        }

        /**
         * Executes the getCampaignNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberPreviews> callback) {
            RequestDefinition getCampaignNumbersDefinition = getCampaignNumbersDefinition(campaignId);
            return apiClient.executeAsync(
                    getCampaignNumbersDefinition, new TypeReference<NumbersNumberPreviews>() {}.getType(), callback);
        }
    }

    /**
     * Get Campaign numbers.
     * <p>
     * Retrieves all the numbers associated with a campaign, regardless of the stage, by its ID.
     *
     * @param campaignId The ID of the campaign for which the numbers should be fetched. (required)
     * @return GetCampaignNumbersRequest
     */
    public GetCampaignNumbersRequest getCampaignNumbers(UUID campaignId) {
        return new GetCampaignNumbersRequest(campaignId);
    }

    private RequestDefinition getCampaignPrioritiesDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/campaigns/priorities")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * getCampaignPriorities request builder class.
     */
    public class GetCampaignPrioritiesRequest {

        private GetCampaignPrioritiesRequest() {}

        /**
         * Executes the getCampaignPriorities request.
         *
         * @return NumbersPriority The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersPriority execute() throws ApiException {
            RequestDefinition getCampaignPrioritiesDefinition = getCampaignPrioritiesDefinition();
            return apiClient.execute(
                    getCampaignPrioritiesDefinition, new TypeReference<NumbersPriority>() {}.getType());
        }

        /**
         * Executes the getCampaignPriorities request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersPriority> callback) {
            RequestDefinition getCampaignPrioritiesDefinition = getCampaignPrioritiesDefinition();
            return apiClient.executeAsync(
                    getCampaignPrioritiesDefinition, new TypeReference<NumbersPriority>() {}.getType(), callback);
        }
    }

    /**
     * Get Campaign Priorities.
     * <p>
     * Retrieves campaign priority levels for your account(if applicable). Please contact your account manager to learn more about priorities.
     *
     * @return GetCampaignPrioritiesRequest
     */
    public GetCampaignPrioritiesRequest getCampaignPriorities() {
        return new GetCampaignPrioritiesRequest();
    }

    private RequestDefinition getCampaignsDefinition(
            List<UUID> id,
            List<UUID> brandId,
            List<String> type,
            String nameLike,
            List<String> referenceId,
            List<String> stage,
            List<String> number,
            Integer page,
            Integer size,
            List<String> sort) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/number-registration/1/campaigns")
                .requiresAuthentication(true)
                .accept("application/json");

        if (id != null) {
            for (var parameterItem : id) {
                builder.addQueryParameter(new Parameter("id", parameterItem));
            }
        }
        if (brandId != null) {
            for (var parameterItem : brandId) {
                builder.addQueryParameter(new Parameter("brandId", parameterItem));
            }
        }
        if (type != null) {
            for (var parameterItem : type) {
                builder.addQueryParameter(new Parameter("type", parameterItem));
            }
        }
        if (nameLike != null) {
            builder.addQueryParameter(new Parameter("nameLike", nameLike));
        }
        if (referenceId != null) {
            for (var parameterItem : referenceId) {
                builder.addQueryParameter(new Parameter("referenceId", parameterItem));
            }
        }
        if (stage != null) {
            for (var parameterItem : stage) {
                builder.addQueryParameter(new Parameter("stage", parameterItem));
            }
        }
        if (number != null) {
            for (var parameterItem : number) {
                builder.addQueryParameter(new Parameter("number", parameterItem));
            }
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        if (sort != null) {
            for (var parameterItem : sort) {
                builder.addQueryParameter(new Parameter("sort", parameterItem));
            }
        }
        return builder.build();
    }

    /**
     * getCampaigns request builder class.
     */
    public class GetCampaignsRequest {
        private List<UUID> id;
        private List<UUID> brandId;
        private List<String> type;
        private String nameLike;
        private List<String> referenceId;
        private List<String> stage;
        private List<String> number;
        private Integer page;
        private Integer size;
        private List<String> sort;

        private GetCampaignsRequest() {}

        /**
         * Sets id.
         *
         * @param id Filters campaigns to those that match the supplied ID(s). (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest id(List<UUID> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets brandId.
         *
         * @param brandId Filters campaigns to those that match the supplied brand ID(s). (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest brandId(List<UUID> brandId) {
            this.brandId = brandId;
            return this;
        }

        /**
         * Sets type.
         *
         * @param type Filters campaigns to those that match the supplied campaign type(s). (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest type(List<String> type) {
            this.type = type;
            return this;
        }

        /**
         * Sets nameLike.
         *
         * @param nameLike Filters campaigns to those whose names contain the supplied name. (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest nameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }

        /**
         * Sets referenceId.
         *
         * @param referenceId Filters campaigns to those that match the supplied referenceId(s). (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest referenceId(List<String> referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Sets stage.
         *
         * @param stage Filters campaigns to those that match the campaign stage(s). (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest stage(List<String> stage) {
            this.stage = stage;
            return this;
        }

        /**
         * Sets number.
         *
         * @param number Filters campaigns to those that match the number(s). (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest number(List<String> number) {
            this.number = number;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page you want to retrieve (0..N). The default value is 0. (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page (0..2000). The default value is 20. The maximum value is 2000. (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Sets sort.
         *
         * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Sortable Properties: &#39;id&#39;, &#39;name&#39;, &#39;type&#39;, &#39;createdDate&#39;, &#39;lastModifiedDate&#39;. (optional)
         * @return GetCampaignsRequest
         */
        public GetCampaignsRequest sort(List<String> sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Executes the getCampaigns request.
         *
         * @return NumbersPageResponseCampaign The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersPageResponseCampaign execute() throws ApiException {
            RequestDefinition getCampaignsDefinition =
                    getCampaignsDefinition(id, brandId, type, nameLike, referenceId, stage, number, page, size, sort);
            return apiClient.execute(
                    getCampaignsDefinition, new TypeReference<NumbersPageResponseCampaign>() {}.getType());
        }

        /**
         * Executes the getCampaigns request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersPageResponseCampaign> callback) {
            RequestDefinition getCampaignsDefinition =
                    getCampaignsDefinition(id, brandId, type, nameLike, referenceId, stage, number, page, size, sort);
            return apiClient.executeAsync(
                    getCampaignsDefinition, new TypeReference<NumbersPageResponseCampaign>() {}.getType(), callback);
        }
    }

    /**
     * Get Campaigns.
     * <p>
     * Gets a page of campaigns, using query parameters to filter results.
     *
     * @return GetCampaignsRequest
     */
    public GetCampaignsRequest getCampaigns() {
        return new GetCampaignsRequest();
    }

    private RequestDefinition getCnamDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/numbers/2/numbers/{numberKey}/voice/cnam")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * getCnam request builder class.
     */
    public class GetCnamRequest {
        private final String numberKey;

        private GetCnamRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the getCnam request.
         *
         * @return CallsCnam The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsCnam execute() throws ApiException {
            RequestDefinition getCnamDefinition = getCnamDefinition(numberKey);
            return apiClient.execute(getCnamDefinition, new TypeReference<CallsCnam>() {}.getType());
        }

        /**
         * Executes the getCnam request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsCnam> callback) {
            RequestDefinition getCnamDefinition = getCnamDefinition(numberKey);
            return apiClient.executeAsync(getCnamDefinition, new TypeReference<CallsCnam>() {}.getType(), callback);
        }
    }

    /**
     * Get CNAM.
     * <p>
     * Get CNAM configuration.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return GetCnamRequest
     */
    public GetCnamRequest getCnam(String numberKey) {
        return new GetCnamRequest(numberKey);
    }

    private RequestDefinition getCnamStatusDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/numbers/2/numbers/{numberKey}/voice/cnam/status")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * getCnamStatus request builder class.
     */
    public class GetCnamStatusRequest {
        private final String numberKey;

        private GetCnamStatusRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the getCnamStatus request.
         *
         * @return CallsPublicCnamStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsPublicCnamStatus execute() throws ApiException {
            RequestDefinition getCnamStatusDefinition = getCnamStatusDefinition(numberKey);
            return apiClient.execute(getCnamStatusDefinition, new TypeReference<CallsPublicCnamStatus>() {}.getType());
        }

        /**
         * Executes the getCnamStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsPublicCnamStatus> callback) {
            RequestDefinition getCnamStatusDefinition = getCnamStatusDefinition(numberKey);
            return apiClient.executeAsync(
                    getCnamStatusDefinition, new TypeReference<CallsPublicCnamStatus>() {}.getType(), callback);
        }
    }

    /**
     * Get CNAM status.
     * <p>
     * Get a CNAM configuration status.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return GetCnamStatusRequest
     */
    public GetCnamStatusRequest getCnamStatus(String numberKey) {
        return new GetCnamStatusRequest(numberKey);
    }

    private RequestDefinition getEmergencyServiceDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/numbers/2/numbers/{numberKey}/voice/emergency-service")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * getEmergencyService request builder class.
     */
    public class GetEmergencyServiceRequest {
        private final String numberKey;

        private GetEmergencyServiceRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the getEmergencyService request.
         *
         * @return CallsEmergencyAddress The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsEmergencyAddress execute() throws ApiException {
            RequestDefinition getEmergencyServiceDefinition = getEmergencyServiceDefinition(numberKey);
            return apiClient.execute(
                    getEmergencyServiceDefinition, new TypeReference<CallsEmergencyAddress>() {}.getType());
        }

        /**
         * Executes the getEmergencyService request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsEmergencyAddress> callback) {
            RequestDefinition getEmergencyServiceDefinition = getEmergencyServiceDefinition(numberKey);
            return apiClient.executeAsync(
                    getEmergencyServiceDefinition, new TypeReference<CallsEmergencyAddress>() {}.getType(), callback);
        }
    }

    /**
     * Get Emergency Service Address.
     * <p>
     * Get a Emergency Service Address
     *
     * @param numberKey Unique ID of a number. (required)
     * @return GetEmergencyServiceRequest
     */
    public GetEmergencyServiceRequest getEmergencyService(String numberKey) {
        return new GetEmergencyServiceRequest(numberKey);
    }

    private RequestDefinition getEmergencyServiceStatusDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/numbers/2/numbers/{numberKey}/voice/emergency-service/status")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * getEmergencyServiceStatus request builder class.
     */
    public class GetEmergencyServiceStatusRequest {
        private final String numberKey;

        private GetEmergencyServiceStatusRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the getEmergencyServiceStatus request.
         *
         * @return CallsEmergencyAddressStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsEmergencyAddressStatus execute() throws ApiException {
            RequestDefinition getEmergencyServiceStatusDefinition = getEmergencyServiceStatusDefinition(numberKey);
            return apiClient.execute(
                    getEmergencyServiceStatusDefinition, new TypeReference<CallsEmergencyAddressStatus>() {}.getType());
        }

        /**
         * Executes the getEmergencyServiceStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsEmergencyAddressStatus> callback) {
            RequestDefinition getEmergencyServiceStatusDefinition = getEmergencyServiceStatusDefinition(numberKey);
            return apiClient.executeAsync(
                    getEmergencyServiceStatusDefinition,
                    new TypeReference<CallsEmergencyAddressStatus>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Emergency Service Address status.
     * <p>
     * Get a Emergency Service Address status.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return GetEmergencyServiceStatusRequest
     */
    public GetEmergencyServiceStatusRequest getEmergencyServiceStatus(String numberKey) {
        return new GetEmergencyServiceStatusRequest(numberKey);
    }

    private RequestDefinition getOwnedNumberPoolsDefinition(
            NumbersNumberPoolAvailability availability, String registrarRecordId, Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/number-registration/1/number-pools")
                .requiresAuthentication(true)
                .accept("application/json");

        if (availability != null) {
            builder.addQueryParameter(new Parameter("availability", availability));
        }
        if (registrarRecordId != null) {
            builder.addQueryParameter(new Parameter("registrarRecordId", registrarRecordId));
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
     * getOwnedNumberPools request builder class.
     */
    public class GetOwnedNumberPoolsRequest {
        private NumbersNumberPoolAvailability availability;
        private String registrarRecordId;
        private Integer page;
        private Integer size;

        private GetOwnedNumberPoolsRequest() {}

        /**
         * Sets availability.
         *
         * @param availability Filters number pools to those that match the supplied availability. (optional)
         * @return GetOwnedNumberPoolsRequest
         */
        public GetOwnedNumberPoolsRequest availability(NumbersNumberPoolAvailability availability) {
            this.availability = availability;
            return this;
        }

        /**
         * Sets registrarRecordId.
         *
         * @param registrarRecordId Filters number pools to those that match the supplied referenceId. (optional)
         * @return GetOwnedNumberPoolsRequest
         */
        public GetOwnedNumberPoolsRequest registrarRecordId(String registrarRecordId) {
            this.registrarRecordId = registrarRecordId;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page you want to retrieve (0..N). The default value is 0. (optional)
         * @return GetOwnedNumberPoolsRequest
         */
        public GetOwnedNumberPoolsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page (0..2000). The default value is 10. The maximum value is 1000. (optional)
         * @return GetOwnedNumberPoolsRequest
         */
        public GetOwnedNumberPoolsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getOwnedNumberPools request.
         *
         * @return NumbersNumberPoolUsageApiPageResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberPoolUsageApiPageResponse execute() throws ApiException {
            RequestDefinition getOwnedNumberPoolsDefinition =
                    getOwnedNumberPoolsDefinition(availability, registrarRecordId, page, size);
            return apiClient.execute(
                    getOwnedNumberPoolsDefinition,
                    new TypeReference<NumbersNumberPoolUsageApiPageResponse>() {}.getType());
        }

        /**
         * Executes the getOwnedNumberPools request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberPoolUsageApiPageResponse> callback) {
            RequestDefinition getOwnedNumberPoolsDefinition =
                    getOwnedNumberPoolsDefinition(availability, registrarRecordId, page, size);
            return apiClient.executeAsync(
                    getOwnedNumberPoolsDefinition,
                    new TypeReference<NumbersNumberPoolUsageApiPageResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get Owned Number Pools.
     * <p>
     * Returns a paginated list of number pools owned by the authenticated account.
     *
     * @return GetOwnedNumberPoolsRequest
     */
    public GetOwnedNumberPoolsRequest getOwnedNumberPools() {
        return new GetOwnedNumberPoolsRequest();
    }

    private RequestDefinition getSingleOwnedNumberDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers/{numberKey}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * getSingleOwnedNumber request builder class.
     */
    public class GetSingleOwnedNumberRequest {
        private final String numberKey;

        private GetSingleOwnedNumberRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the getSingleOwnedNumber request.
         *
         * @return NumbersNumberResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberResponse execute() throws ApiException {
            RequestDefinition getSingleOwnedNumberDefinition = getSingleOwnedNumberDefinition(numberKey);
            return apiClient.execute(
                    getSingleOwnedNumberDefinition, new TypeReference<NumbersNumberResponse>() {}.getType());
        }

        /**
         * Executes the getSingleOwnedNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberResponse> callback) {
            RequestDefinition getSingleOwnedNumberDefinition = getSingleOwnedNumberDefinition(numberKey);
            return apiClient.executeAsync(
                    getSingleOwnedNumberDefinition, new TypeReference<NumbersNumberResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get single owned number.
     * <p>
     * Get information about an owned number using the unique ID of the number.
     *
     * @param numberKey The unique ID of the number for which information is requested. (required)
     * @return GetSingleOwnedNumberRequest
     */
    public GetSingleOwnedNumberRequest getSingleOwnedNumber(String numberKey) {
        return new GetSingleOwnedNumberRequest(numberKey);
    }

    private RequestDefinition getVoiceSetupOnNumberDefinition(String numberKey) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/2/numbers/{numberKey}/voice")
                .requiresAuthentication(true)
                .accept("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * getVoiceSetupOnNumber request builder class.
     */
    public class GetVoiceSetupOnNumberRequest {
        private final String numberKey;

        private GetVoiceSetupOnNumberRequest(String numberKey) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
        }

        /**
         * Executes the getVoiceSetupOnNumber request.
         *
         * @return NumbersVoiceSetup The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersVoiceSetup execute() throws ApiException {
            RequestDefinition getVoiceSetupOnNumberDefinition = getVoiceSetupOnNumberDefinition(numberKey);
            return apiClient.execute(
                    getVoiceSetupOnNumberDefinition, new TypeReference<NumbersVoiceSetup>() {}.getType());
        }

        /**
         * Executes the getVoiceSetupOnNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersVoiceSetup> callback) {
            RequestDefinition getVoiceSetupOnNumberDefinition = getVoiceSetupOnNumberDefinition(numberKey);
            return apiClient.executeAsync(
                    getVoiceSetupOnNumberDefinition, new TypeReference<NumbersVoiceSetup>() {}.getType(), callback);
        }
    }

    /**
     * Get voice setup on number.
     * <p>
     * This method fetches the voice setup on a number.
     *
     * @param numberKey Unique ID of a number. (required)
     * @return GetVoiceSetupOnNumberRequest
     */
    public GetVoiceSetupOnNumberRequest getVoiceSetupOnNumber(String numberKey) {
        return new GetVoiceSetupOnNumberRequest(numberKey);
    }

    private RequestDefinition importExistingBrandVetDefinition(
            UUID brandId, NumbersVetImportRequest numbersVetImportRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/number-registration/1/brands/{brandId}/vets/import")
                .body(numbersVetImportRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * importExistingBrandVet request builder class.
     */
    public class ImportExistingBrandVetRequest {
        private final UUID brandId;
        private final NumbersVetImportRequest numbersVetImportRequest;

        private ImportExistingBrandVetRequest(UUID brandId, NumbersVetImportRequest numbersVetImportRequest) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.numbersVetImportRequest = Objects.requireNonNull(
                    numbersVetImportRequest, "The required parameter 'numbersVetImportRequest' is missing.");
        }

        /**
         * Executes the importExistingBrandVet request.
         *
         * @return NumbersBrandVet The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrandVet execute() throws ApiException {
            RequestDefinition importExistingBrandVetDefinition =
                    importExistingBrandVetDefinition(brandId, numbersVetImportRequest);
            return apiClient.execute(
                    importExistingBrandVetDefinition, new TypeReference<NumbersBrandVet>() {}.getType());
        }

        /**
         * Executes the importExistingBrandVet request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrandVet> callback) {
            RequestDefinition importExistingBrandVetDefinition =
                    importExistingBrandVetDefinition(brandId, numbersVetImportRequest);
            return apiClient.executeAsync(
                    importExistingBrandVetDefinition, new TypeReference<NumbersBrandVet>() {}.getType(), callback);
        }
    }

    /**
     * Import Existing Brand Vet.
     * <p>
     * Imports Existing Brand Vet provider
     *
     * @param brandId The ID of the desired brand. (required)
     * @param numbersVetImportRequest  (required)
     * @return ImportExistingBrandVetRequest
     */
    public ImportExistingBrandVetRequest importExistingBrandVet(
            UUID brandId, NumbersVetImportRequest numbersVetImportRequest) {
        return new ImportExistingBrandVetRequest(brandId, numbersVetImportRequest);
    }

    private RequestDefinition listOwnedNumbersDefinition(Integer limit, String number, Integer page) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/numbers/1/numbers")
                .requiresAuthentication(true)
                .accept("application/json");

        if (limit != null) {
            builder.addQueryParameter(new Parameter("limit", limit));
        }
        if (number != null) {
            builder.addQueryParameter(new Parameter("number", number));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        return builder.build();
    }

    /**
     * listOwnedNumbers request builder class.
     */
    public class ListOwnedNumbersRequest {
        private Integer limit;
        private String number;
        private Integer page;

        private ListOwnedNumbersRequest() {}

        /**
         * Sets limit.
         *
         * @param limit Number of records returned per page. (optional, default to 50)
         * @return ListOwnedNumbersRequest
         */
        public ListOwnedNumbersRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Sets number.
         *
         * @param number Searched number. (optional)
         * @return ListOwnedNumbersRequest
         */
        public ListOwnedNumbersRequest number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Page number. Use with &#x60;limit&#x60; for paging purposes. (optional, default to 0)
         * @return ListOwnedNumbersRequest
         */
        public ListOwnedNumbersRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Executes the listOwnedNumbers request.
         *
         * @return NumbersResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersResponse execute() throws ApiException {
            RequestDefinition listOwnedNumbersDefinition = listOwnedNumbersDefinition(limit, number, page);
            return apiClient.execute(listOwnedNumbersDefinition, new TypeReference<NumbersResponse>() {}.getType());
        }

        /**
         * Executes the listOwnedNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersResponse> callback) {
            RequestDefinition listOwnedNumbersDefinition = listOwnedNumbersDefinition(limit, number, page);
            return apiClient.executeAsync(
                    listOwnedNumbersDefinition, new TypeReference<NumbersResponse>() {}.getType(), callback);
        }
    }

    /**
     * List owned numbers.
     * <p>
     * Use this method to get all the owned numbers for this account.
     *
     * @return ListOwnedNumbersRequest
     */
    public ListOwnedNumbersRequest listOwnedNumbers() {
        return new ListOwnedNumbersRequest();
    }

    private RequestDefinition registerBrandDefinition(UUID brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/register")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * registerBrand request builder class.
     */
    public class RegisterBrandRequest {
        private final UUID brandId;

        private RegisterBrandRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the registerBrand request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition registerBrandDefinition = registerBrandDefinition(brandId);
            apiClient.execute(registerBrandDefinition);
        }

        /**
         * Executes the registerBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition registerBrandDefinition = registerBrandDefinition(brandId);
            return apiClient.executeAsync(registerBrandDefinition, callback);
        }
    }

    /**
     * Register Brand.
     * <p>
     * Registers the brand with the given ID with all available registrars. Each registered brand incurs a cost, consult your contract for pricing details. When registering brands of type TENDLC_PUBLIC_COMPANY brands, brand authentication+ verification are automatically triggered. This is only available for 10DLC Brands
     *
     * @param brandId The ID of the desired brand. (required)
     * @return RegisterBrandRequest
     */
    public RegisterBrandRequest registerBrand(UUID brandId) {
        return new RegisterBrandRequest(brandId);
    }

    private RequestDefinition registerCampaignDefinition(
            UUID campaignId, NumbersRegisterCampaignRequest numbersRegisterCampaignRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/register")
                .body(numbersRegisterCampaignRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * registerCampaign request builder class.
     */
    public class RegisterCampaignRequest {
        private final UUID campaignId;
        private final NumbersRegisterCampaignRequest numbersRegisterCampaignRequest;

        private RegisterCampaignRequest(
                UUID campaignId, NumbersRegisterCampaignRequest numbersRegisterCampaignRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersRegisterCampaignRequest = Objects.requireNonNull(
                    numbersRegisterCampaignRequest,
                    "The required parameter 'numbersRegisterCampaignRequest' is missing.");
        }

        /**
         * Executes the registerCampaign request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition registerCampaignDefinition =
                    registerCampaignDefinition(campaignId, numbersRegisterCampaignRequest);
            apiClient.execute(registerCampaignDefinition);
        }

        /**
         * Executes the registerCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition registerCampaignDefinition =
                    registerCampaignDefinition(campaignId, numbersRegisterCampaignRequest);
            return apiClient.executeAsync(registerCampaignDefinition, callback);
        }
    }

    /**
     * Submit Campaign.
     * <p>
     * Submits the campaign with the given ID for Infobip review. If a campaign gets approved by Infobip, it will get registered with carriers, and submitted for underlying connectivity provider&#39;s review. Each registered campaign incurs a cost, consult your contract for pricing information.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersRegisterCampaignRequest  (required)
     * @return RegisterCampaignRequest
     * @see <a href="https://www.infobip.com/docs/10dlc/10dlc-registration">Find out more</a>
     */
    public RegisterCampaignRequest registerCampaign(
            UUID campaignId, NumbersRegisterCampaignRequest numbersRegisterCampaignRequest) {
        return new RegisterCampaignRequest(campaignId, numbersRegisterCampaignRequest);
    }

    private RequestDefinition removeNumbersDefinition(
            UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/remove-numbers")
                .body(numbersUpdateCampaignRegistrationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * removeNumbers request builder class.
     */
    public class RemoveNumbersRequest {
        private final UUID campaignId;
        private final NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest;

        private RemoveNumbersRequest(
                UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersUpdateCampaignRegistrationRequest = Objects.requireNonNull(
                    numbersUpdateCampaignRegistrationRequest,
                    "The required parameter 'numbersUpdateCampaignRegistrationRequest' is missing.");
        }

        /**
         * Executes the removeNumbers request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition removeNumbersDefinition =
                    removeNumbersDefinition(campaignId, numbersUpdateCampaignRegistrationRequest);
            apiClient.execute(removeNumbersDefinition);
        }

        /**
         * Executes the removeNumbers request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition removeNumbersDefinition =
                    removeNumbersDefinition(campaignId, numbersUpdateCampaignRegistrationRequest);
            return apiClient.executeAsync(removeNumbersDefinition, callback);
        }
    }

    /**
     * Remove Numbers from Registered Campaign.
     * <p>
     * Removes numbers from campaign that has already been registered. If the campaign registration has not been completed or numbers size exceeds the limit, attempting to update via this api will result in a 400 Bad Request.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersUpdateCampaignRegistrationRequest  (required)
     * @return RemoveNumbersRequest
     */
    public RemoveNumbersRequest removeNumbers(
            UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
        return new RemoveNumbersRequest(campaignId, numbersUpdateCampaignRegistrationRequest);
    }

    private RequestDefinition removeRecordingConfigurationDefinition(String key) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/voice/recording/1/configuration/numbers/{key}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (key != null) {
            builder.addPathParameter(new Parameter("key", key));
        }
        return builder.build();
    }

    /**
     * removeRecordingConfiguration request builder class.
     */
    public class RemoveRecordingConfigurationRequest {
        private final String key;

        private RemoveRecordingConfigurationRequest(String key) {
            this.key = Objects.requireNonNull(key, "The required parameter 'key' is missing.");
        }

        /**
         * Executes the removeRecordingConfiguration request.
         *
         * @return NumbersDownloadResponseModel The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersDownloadResponseModel execute() throws ApiException {
            RequestDefinition removeRecordingConfigurationDefinition = removeRecordingConfigurationDefinition(key);
            return apiClient.execute(
                    removeRecordingConfigurationDefinition,
                    new TypeReference<NumbersDownloadResponseModel>() {}.getType());
        }

        /**
         * Executes the removeRecordingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersDownloadResponseModel> callback) {
            RequestDefinition removeRecordingConfigurationDefinition = removeRecordingConfigurationDefinition(key);
            return apiClient.executeAsync(
                    removeRecordingConfigurationDefinition,
                    new TypeReference<NumbersDownloadResponseModel>() {}.getType(),
                    callback);
        }
    }

    /**
     * Delete voice recording configuration.
     * <p>
     * This method allows you to delete Voice number recording configuration setup.
     *
     * @param key Key. (required)
     * @return RemoveRecordingConfigurationRequest
     */
    public RemoveRecordingConfigurationRequest removeRecordingConfiguration(String key) {
        return new RemoveRecordingConfigurationRequest(key);
    }

    private RequestDefinition resend2faMailBrandAuthDefinition(UUID brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/resend2fa")
                .requiresAuthentication(true)
                .accept("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * resend2faMailBrandAuth request builder class.
     */
    public class Resend2faMailBrandAuthRequest {
        private final UUID brandId;

        private Resend2faMailBrandAuthRequest(UUID brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the resend2faMailBrandAuth request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition resend2faMailBrandAuthDefinition = resend2faMailBrandAuthDefinition(brandId);
            apiClient.execute(resend2faMailBrandAuthDefinition);
        }

        /**
         * Executes the resend2faMailBrandAuth request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition resend2faMailBrandAuthDefinition = resend2faMailBrandAuthDefinition(brandId);
            return apiClient.executeAsync(resend2faMailBrandAuthDefinition, callback);
        }
    }

    /**
     * Resend 2FA Email For Brand Authentication.
     * <p>
     * Resend 2FA email to proceed with Brand authentication. This operation can be executed for TENDLC_PUBLIC_COMPANY brand type only when Brand authentication is in progress. In 2 hour time window can resend only one 2FA email.
     *
     * @param brandId The ID of the desired brand. (required)
     * @return Resend2faMailBrandAuthRequest
     */
    public Resend2faMailBrandAuthRequest resend2faMailBrandAuth(UUID brandId) {
        return new Resend2faMailBrandAuthRequest(brandId);
    }

    private RequestDefinition retrieveRecordingConfigurationDefinition(String key) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/voice/recording/1/configuration/numbers/{key}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (key != null) {
            builder.addPathParameter(new Parameter("key", key));
        }
        return builder.build();
    }

    /**
     * retrieveRecordingConfiguration request builder class.
     */
    public class RetrieveRecordingConfigurationRequest {
        private final String key;

        private RetrieveRecordingConfigurationRequest(String key) {
            this.key = Objects.requireNonNull(key, "The required parameter 'key' is missing.");
        }

        /**
         * Executes the retrieveRecordingConfiguration request.
         *
         * @return NumbersNumberConfigurationModel The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberConfigurationModel execute() throws ApiException {
            RequestDefinition retrieveRecordingConfigurationDefinition = retrieveRecordingConfigurationDefinition(key);
            return apiClient.execute(
                    retrieveRecordingConfigurationDefinition,
                    new TypeReference<NumbersNumberConfigurationModel>() {}.getType());
        }

        /**
         * Executes the retrieveRecordingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberConfigurationModel> callback) {
            RequestDefinition retrieveRecordingConfigurationDefinition = retrieveRecordingConfigurationDefinition(key);
            return apiClient.executeAsync(
                    retrieveRecordingConfigurationDefinition,
                    new TypeReference<NumbersNumberConfigurationModel>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get voice recording configuration.
     * <p>
     * This method allows you to read Voice number recording configuration setup.
     *
     * @param key Key. (required)
     * @return RetrieveRecordingConfigurationRequest
     */
    public RetrieveRecordingConfigurationRequest retrieveRecordingConfiguration(String key) {
        return new RetrieveRecordingConfigurationRequest(key);
    }

    private RequestDefinition submitCampaignInfoForAiReviewDefinition(NumbersTenDlcAiReviewRequest body) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number-registration/1/automatic-review")
                .body(body)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * submitCampaignInfoForAiReview request builder class.
     */
    public class SubmitCampaignInfoForAiReviewRequest {
        private final NumbersTenDlcAiReviewRequest body;

        private SubmitCampaignInfoForAiReviewRequest(NumbersTenDlcAiReviewRequest body) {
            this.body = Objects.requireNonNull(body, "The required parameter 'body' is missing.");
        }

        /**
         * Executes the submitCampaignInfoForAiReview request.
         *
         * @return NumbersReviewSubmissionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersReviewSubmissionResponse execute() throws ApiException {
            RequestDefinition submitCampaignInfoForAiReviewDefinition = submitCampaignInfoForAiReviewDefinition(body);
            return apiClient.execute(
                    submitCampaignInfoForAiReviewDefinition,
                    new TypeReference<NumbersReviewSubmissionResponse>() {}.getType());
        }

        /**
         * Executes the submitCampaignInfoForAiReview request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersReviewSubmissionResponse> callback) {
            RequestDefinition submitCampaignInfoForAiReviewDefinition = submitCampaignInfoForAiReviewDefinition(body);
            return apiClient.executeAsync(
                    submitCampaignInfoForAiReviewDefinition,
                    new TypeReference<NumbersReviewSubmissionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Submit Campaign Info for AI Review.
     * <p>
     * Submits new campaign information for automatic AI compliance review. Returns a request UUID that can be used to fetch the review results. Contact your account manager to learn more.
     *
     * @param body  (required)
     * @return SubmitCampaignInfoForAiReviewRequest
     */
    public SubmitCampaignInfoForAiReviewRequest submitCampaignInfoForAiReview(NumbersTenDlcAiReviewRequest body) {
        return new SubmitCampaignInfoForAiReviewRequest(body);
    }

    private RequestDefinition submitExistingCampaignForAiReviewDefinition(UUID campaignUuid) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/automatic-review/campaigns/{campaignUuid}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (campaignUuid != null) {
            builder.addPathParameter(new Parameter("campaignUuid", campaignUuid));
        }
        return builder.build();
    }

    /**
     * submitExistingCampaignForAiReview request builder class.
     */
    public class SubmitExistingCampaignForAiReviewRequest {
        private final UUID campaignUuid;

        private SubmitExistingCampaignForAiReviewRequest(UUID campaignUuid) {
            this.campaignUuid =
                    Objects.requireNonNull(campaignUuid, "The required parameter 'campaignUuid' is missing.");
        }

        /**
         * Executes the submitExistingCampaignForAiReview request.
         *
         * @return NumbersReviewSubmissionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersReviewSubmissionResponse execute() throws ApiException {
            RequestDefinition submitExistingCampaignForAiReviewDefinition =
                    submitExistingCampaignForAiReviewDefinition(campaignUuid);
            return apiClient.execute(
                    submitExistingCampaignForAiReviewDefinition,
                    new TypeReference<NumbersReviewSubmissionResponse>() {}.getType());
        }

        /**
         * Executes the submitExistingCampaignForAiReview request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersReviewSubmissionResponse> callback) {
            RequestDefinition submitExistingCampaignForAiReviewDefinition =
                    submitExistingCampaignForAiReviewDefinition(campaignUuid);
            return apiClient.executeAsync(
                    submitExistingCampaignForAiReviewDefinition,
                    new TypeReference<NumbersReviewSubmissionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Submit Existing Campaign for AI Review.
     * <p>
     * Submits an existing campaign for automatic AI compliance review. Returns a request UUID that can be used to fetch the review results. Contact your account manager to learn more.
     *
     * @param campaignUuid The UUID assigned to the campaign when it was created or imported into the infobip platform. This identifier is returned during campaign creation. (required)
     * @return SubmitExistingCampaignForAiReviewRequest
     */
    public SubmitExistingCampaignForAiReviewRequest submitExistingCampaignForAiReview(UUID campaignUuid) {
        return new SubmitExistingCampaignForAiReviewRequest(campaignUuid);
    }

    private RequestDefinition updateBrandDefinition(UUID brandId, NumbersBrand numbersBrand) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/number-registration/1/brands/{brandId}")
                .body(numbersBrand)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * updateBrand request builder class.
     */
    public class UpdateBrandRequest {
        private final UUID brandId;
        private final NumbersBrand numbersBrand;

        private UpdateBrandRequest(UUID brandId, NumbersBrand numbersBrand) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.numbersBrand =
                    Objects.requireNonNull(numbersBrand, "The required parameter 'numbersBrand' is missing.");
        }

        /**
         * Executes the updateBrand request.
         *
         * @return NumbersBrand The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrand execute() throws ApiException {
            RequestDefinition updateBrandDefinition = updateBrandDefinition(brandId, numbersBrand);
            return apiClient.execute(updateBrandDefinition, new TypeReference<NumbersBrand>() {}.getType());
        }

        /**
         * Executes the updateBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrand> callback) {
            RequestDefinition updateBrandDefinition = updateBrandDefinition(brandId, numbersBrand);
            return apiClient.executeAsync(
                    updateBrandDefinition, new TypeReference<NumbersBrand>() {}.getType(), callback);
        }
    }

    /**
     * Update Brand.
     * <p>
     * Updates a brand that has not yet been registered within the Infobip platform (response 200) or that has a successful or failed registration (response 202). This method will not support a brand update with pending registration status and will return a 400 Bad Request. Also for successfully registered brands, updates to the legalName, type, taxId, and taxIdIssuingCountry are restricted and will also return a 400 Bad Request.
     *
     * @param brandId The ID of the desired brand. (required)
     * @param numbersBrand  (required)
     * @return UpdateBrandRequest
     */
    public UpdateBrandRequest updateBrand(UUID brandId, NumbersBrand numbersBrand) {
        return new UpdateBrandRequest(brandId, numbersBrand);
    }

    private RequestDefinition updateBrandVetDefinition(UUID brandId, UUID vetId, NumbersBrandVet numbersBrandVet) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/number-registration/1/brands/{brandId}/vets/{vetId}")
                .body(numbersBrandVet)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        if (vetId != null) {
            builder.addPathParameter(new Parameter("vetId", vetId));
        }
        return builder.build();
    }

    /**
     * updateBrandVet request builder class.
     */
    public class UpdateBrandVetRequest {
        private final UUID brandId;
        private final UUID vetId;
        private final NumbersBrandVet numbersBrandVet;

        private UpdateBrandVetRequest(UUID brandId, UUID vetId, NumbersBrandVet numbersBrandVet) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.vetId = Objects.requireNonNull(vetId, "The required parameter 'vetId' is missing.");
            this.numbersBrandVet =
                    Objects.requireNonNull(numbersBrandVet, "The required parameter 'numbersBrandVet' is missing.");
        }

        /**
         * Executes the updateBrandVet request.
         *
         * @return NumbersBrandVet The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrandVet execute() throws ApiException {
            RequestDefinition updateBrandVetDefinition = updateBrandVetDefinition(brandId, vetId, numbersBrandVet);
            return apiClient.execute(updateBrandVetDefinition, new TypeReference<NumbersBrandVet>() {}.getType());
        }

        /**
         * Executes the updateBrandVet request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrandVet> callback) {
            RequestDefinition updateBrandVetDefinition = updateBrandVetDefinition(brandId, vetId, numbersBrandVet);
            return apiClient.executeAsync(
                    updateBrandVetDefinition, new TypeReference<NumbersBrandVet>() {}.getType(), callback);
        }
    }

    /**
     * Update Brand Vet.
     * <p>
     * Updates a brand vetting type. Provided vet must be current active standard vet and it may only be updated to an enhanced vet if it was performed within the last 30 days. All other attempts to update a vet are considered an error.
     *
     * @param brandId The ID of the desired brand. (required)
     * @param vetId The ID of the brand active vet. (required)
     * @param numbersBrandVet  (required)
     * @return UpdateBrandVetRequest
     */
    public UpdateBrandVetRequest updateBrandVet(UUID brandId, UUID vetId, NumbersBrandVet numbersBrandVet) {
        return new UpdateBrandVetRequest(brandId, vetId, numbersBrandVet);
    }

    private RequestDefinition updateCampaignDefinition(UUID campaignId, NumbersCampaign numbersCampaign) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/number-registration/1/campaigns/{campaignId}")
                .body(numbersCampaign)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * updateCampaign request builder class.
     */
    public class UpdateCampaignRequest {
        private final UUID campaignId;
        private final NumbersCampaign numbersCampaign;

        private UpdateCampaignRequest(UUID campaignId, NumbersCampaign numbersCampaign) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersCampaign =
                    Objects.requireNonNull(numbersCampaign, "The required parameter 'numbersCampaign' is missing.");
        }

        /**
         * Executes the updateCampaign request.
         *
         * @return NumbersCampaign The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersCampaign execute() throws ApiException {
            RequestDefinition updateCampaignDefinition = updateCampaignDefinition(campaignId, numbersCampaign);
            return apiClient.execute(updateCampaignDefinition, new TypeReference<NumbersCampaign>() {}.getType());
        }

        /**
         * Executes the updateCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersCampaign> callback) {
            RequestDefinition updateCampaignDefinition = updateCampaignDefinition(campaignId, numbersCampaign);
            return apiClient.executeAsync(
                    updateCampaignDefinition, new TypeReference<NumbersCampaign>() {}.getType(), callback);
        }
    }

    /**
     * Update Campaign.
     * <p>
     * Updates a campaign that has not yet been registered within the Infobip platform or has been rejected by Infobip. This operation is only supported for campaigns that are in DRAFT or REJECTED stage.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersCampaign  (required)
     * @return UpdateCampaignRequest
     */
    public UpdateCampaignRequest updateCampaign(UUID campaignId, NumbersCampaign numbersCampaign) {
        return new UpdateCampaignRequest(campaignId, numbersCampaign);
    }

    private RequestDefinition updateCnamDefinition(String numberKey, CallsCnam callsCnam) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/numbers/2/numbers/{numberKey}/voice/cnam")
                .body(callsCnam)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * updateCnam request builder class.
     */
    public class UpdateCnamRequest {
        private final String numberKey;
        private final CallsCnam callsCnam;

        private UpdateCnamRequest(String numberKey, CallsCnam callsCnam) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.callsCnam = Objects.requireNonNull(callsCnam, "The required parameter 'callsCnam' is missing.");
        }

        /**
         * Executes the updateCnam request.
         *
         * @return CallsCnam The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsCnam execute() throws ApiException {
            RequestDefinition updateCnamDefinition = updateCnamDefinition(numberKey, callsCnam);
            return apiClient.execute(updateCnamDefinition, new TypeReference<CallsCnam>() {}.getType());
        }

        /**
         * Executes the updateCnam request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsCnam> callback) {
            RequestDefinition updateCnamDefinition = updateCnamDefinition(numberKey, callsCnam);
            return apiClient.executeAsync(updateCnamDefinition, new TypeReference<CallsCnam>() {}.getType(), callback);
        }
    }

    /**
     * Update CNAM.
     * <p>
     * Update a CNAM configuration.
     *
     * @param numberKey Unique ID of a number. (required)
     * @param callsCnam  (required)
     * @return UpdateCnamRequest
     */
    public UpdateCnamRequest updateCnam(String numberKey, CallsCnam callsCnam) {
        return new UpdateCnamRequest(numberKey, callsCnam);
    }

    private RequestDefinition updateEmergencyServiceDefinition(
            String numberKey, CallsEmergencyAddress callsEmergencyAddress) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/numbers/2/numbers/{numberKey}/voice/emergency-service")
                .body(callsEmergencyAddress)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * updateEmergencyService request builder class.
     */
    public class UpdateEmergencyServiceRequest {
        private final String numberKey;
        private final CallsEmergencyAddress callsEmergencyAddress;

        private UpdateEmergencyServiceRequest(String numberKey, CallsEmergencyAddress callsEmergencyAddress) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.callsEmergencyAddress = Objects.requireNonNull(
                    callsEmergencyAddress, "The required parameter 'callsEmergencyAddress' is missing.");
        }

        /**
         * Executes the updateEmergencyService request.
         *
         * @return CallsEmergencyAddress The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsEmergencyAddress execute() throws ApiException {
            RequestDefinition updateEmergencyServiceDefinition =
                    updateEmergencyServiceDefinition(numberKey, callsEmergencyAddress);
            return apiClient.execute(
                    updateEmergencyServiceDefinition, new TypeReference<CallsEmergencyAddress>() {}.getType());
        }

        /**
         * Executes the updateEmergencyService request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsEmergencyAddress> callback) {
            RequestDefinition updateEmergencyServiceDefinition =
                    updateEmergencyServiceDefinition(numberKey, callsEmergencyAddress);
            return apiClient.executeAsync(
                    updateEmergencyServiceDefinition,
                    new TypeReference<CallsEmergencyAddress>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update Emergency Service Address.
     * <p>
     * Update a Emergency Service Address
     *
     * @param numberKey Unique ID of a number. (required)
     * @param callsEmergencyAddress  (required)
     * @return UpdateEmergencyServiceRequest
     */
    public UpdateEmergencyServiceRequest updateEmergencyService(
            String numberKey, CallsEmergencyAddress callsEmergencyAddress) {
        return new UpdateEmergencyServiceRequest(numberKey, callsEmergencyAddress);
    }

    private RequestDefinition updateOwnedNumberDefinition(
            String numberKey, NumbersUpdateOwnedNumberRequest numbersUpdateOwnedNumberRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/numbers/1/numbers/{numberKey}")
                .body(numbersUpdateOwnedNumberRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * updateOwnedNumber request builder class.
     */
    public class UpdateOwnedNumberRequest {
        private final String numberKey;
        private final NumbersUpdateOwnedNumberRequest numbersUpdateOwnedNumberRequest;

        private UpdateOwnedNumberRequest(
                String numberKey, NumbersUpdateOwnedNumberRequest numbersUpdateOwnedNumberRequest) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.numbersUpdateOwnedNumberRequest = Objects.requireNonNull(
                    numbersUpdateOwnedNumberRequest,
                    "The required parameter 'numbersUpdateOwnedNumberRequest' is missing.");
        }

        /**
         * Executes the updateOwnedNumber request.
         *
         * @return NumbersNumberResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberResponse execute() throws ApiException {
            RequestDefinition updateOwnedNumberDefinition =
                    updateOwnedNumberDefinition(numberKey, numbersUpdateOwnedNumberRequest);
            return apiClient.execute(
                    updateOwnedNumberDefinition, new TypeReference<NumbersNumberResponse>() {}.getType());
        }

        /**
         * Executes the updateOwnedNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberResponse> callback) {
            RequestDefinition updateOwnedNumberDefinition =
                    updateOwnedNumberDefinition(numberKey, numbersUpdateOwnedNumberRequest);
            return apiClient.executeAsync(
                    updateOwnedNumberDefinition, new TypeReference<NumbersNumberResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update owned number.
     * <p>
     * Use this method to update the application and the entity, if required, that is linked to a number.
     *
     * @param numberKey Unique ID of a number. (required)
     * @param numbersUpdateOwnedNumberRequest  (required)
     * @return UpdateOwnedNumberRequest
     */
    public UpdateOwnedNumberRequest updateOwnedNumber(
            String numberKey, NumbersUpdateOwnedNumberRequest numbersUpdateOwnedNumberRequest) {
        return new UpdateOwnedNumberRequest(numberKey, numbersUpdateOwnedNumberRequest);
    }

    private RequestDefinition updateRecordingConfigurationDefinition(
            NumbersNumberConfigurationModel numbersNumberConfigurationModel) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/voice/recording/1/configuration/numbers")
                .body(numbersNumberConfigurationModel)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * updateRecordingConfiguration request builder class.
     */
    public class UpdateRecordingConfigurationRequest {
        private final NumbersNumberConfigurationModel numbersNumberConfigurationModel;

        private UpdateRecordingConfigurationRequest(NumbersNumberConfigurationModel numbersNumberConfigurationModel) {
            this.numbersNumberConfigurationModel = Objects.requireNonNull(
                    numbersNumberConfigurationModel,
                    "The required parameter 'numbersNumberConfigurationModel' is missing.");
        }

        /**
         * Executes the updateRecordingConfiguration request.
         *
         * @return NumbersNumberConfigurationModel The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersNumberConfigurationModel execute() throws ApiException {
            RequestDefinition updateRecordingConfigurationDefinition =
                    updateRecordingConfigurationDefinition(numbersNumberConfigurationModel);
            return apiClient.execute(
                    updateRecordingConfigurationDefinition,
                    new TypeReference<NumbersNumberConfigurationModel>() {}.getType());
        }

        /**
         * Executes the updateRecordingConfiguration request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersNumberConfigurationModel> callback) {
            RequestDefinition updateRecordingConfigurationDefinition =
                    updateRecordingConfigurationDefinition(numbersNumberConfigurationModel);
            return apiClient.executeAsync(
                    updateRecordingConfigurationDefinition,
                    new TypeReference<NumbersNumberConfigurationModel>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update voice recording configuration.
     * <p>
     * This method allows you to update recording configuration on voice number.
     *
     * @param numbersNumberConfigurationModel  (required)
     * @return UpdateRecordingConfigurationRequest
     */
    public UpdateRecordingConfigurationRequest updateRecordingConfiguration(
            NumbersNumberConfigurationModel numbersNumberConfigurationModel) {
        return new UpdateRecordingConfigurationRequest(numbersNumberConfigurationModel);
    }

    private RequestDefinition updateRegisteredCampaignDefinition(
            UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/campaigns/{campaignId}/update-registration")
                .body(numbersUpdateCampaignRegistrationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (campaignId != null) {
            builder.addPathParameter(new Parameter("campaignId", campaignId));
        }
        return builder.build();
    }

    /**
     * updateRegisteredCampaign request builder class.
     */
    public class UpdateRegisteredCampaignRequest {
        private final UUID campaignId;
        private final NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest;

        private UpdateRegisteredCampaignRequest(
                UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
            this.campaignId = Objects.requireNonNull(campaignId, "The required parameter 'campaignId' is missing.");
            this.numbersUpdateCampaignRegistrationRequest = Objects.requireNonNull(
                    numbersUpdateCampaignRegistrationRequest,
                    "The required parameter 'numbersUpdateCampaignRegistrationRequest' is missing.");
        }

        /**
         * Executes the updateRegisteredCampaign request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition updateRegisteredCampaignDefinition =
                    updateRegisteredCampaignDefinition(campaignId, numbersUpdateCampaignRegistrationRequest);
            apiClient.execute(updateRegisteredCampaignDefinition);
        }

        /**
         * Executes the updateRegisteredCampaign request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition updateRegisteredCampaignDefinition =
                    updateRegisteredCampaignDefinition(campaignId, numbersUpdateCampaignRegistrationRequest);
            return apiClient.executeAsync(updateRegisteredCampaignDefinition, callback);
        }
    }

    /**
     * Update Registered Campaign.
     * <p>
     * Updates a campaign that has already been registered. If the campaign registration has not been completed, attempting to update via this api will result in a 400 Bad Request. Numbers which require OSR to be updated in advance could be identified by using Numbers API&#39;s \&quot;List owned number\&quot; GET endpoint.
     *
     * @param campaignId The ID of the desired campaign. (required)
     * @param numbersUpdateCampaignRegistrationRequest  (required)
     * @return UpdateRegisteredCampaignRequest
     */
    public UpdateRegisteredCampaignRequest updateRegisteredCampaign(
            UUID campaignId, NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest) {
        return new UpdateRegisteredCampaignRequest(campaignId, numbersUpdateCampaignRegistrationRequest);
    }

    private RequestDefinition updateVoiceSetupOnNumberDefinition(
            String numberKey, NumbersVoiceSetup numbersVoiceSetup) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/numbers/2/numbers/{numberKey}/voice")
                .body(numbersVoiceSetup)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * updateVoiceSetupOnNumber request builder class.
     */
    public class UpdateVoiceSetupOnNumberRequest {
        private final String numberKey;
        private final NumbersVoiceSetup numbersVoiceSetup;

        private UpdateVoiceSetupOnNumberRequest(String numberKey, NumbersVoiceSetup numbersVoiceSetup) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.numbersVoiceSetup =
                    Objects.requireNonNull(numbersVoiceSetup, "The required parameter 'numbersVoiceSetup' is missing.");
        }

        /**
         * Executes the updateVoiceSetupOnNumber request.
         *
         * @return NumbersVoiceSetup The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersVoiceSetup execute() throws ApiException {
            RequestDefinition updateVoiceSetupOnNumberDefinition =
                    updateVoiceSetupOnNumberDefinition(numberKey, numbersVoiceSetup);
            return apiClient.execute(
                    updateVoiceSetupOnNumberDefinition, new TypeReference<NumbersVoiceSetup>() {}.getType());
        }

        /**
         * Executes the updateVoiceSetupOnNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersVoiceSetup> callback) {
            RequestDefinition updateVoiceSetupOnNumberDefinition =
                    updateVoiceSetupOnNumberDefinition(numberKey, numbersVoiceSetup);
            return apiClient.executeAsync(
                    updateVoiceSetupOnNumberDefinition, new TypeReference<NumbersVoiceSetup>() {}.getType(), callback);
        }
    }

    /**
     * Update voice setup on number.
     * <p>
     * This method updates voice setup previously created on a number.
     *
     * @param numberKey Unique ID of a number. (required)
     * @param numbersVoiceSetup voiceSetup (required)
     * @return UpdateVoiceSetupOnNumberRequest
     */
    public UpdateVoiceSetupOnNumberRequest updateVoiceSetupOnNumber(
            String numberKey, NumbersVoiceSetup numbersVoiceSetup) {
        return new UpdateVoiceSetupOnNumberRequest(numberKey, numbersVoiceSetup);
    }

    private RequestDefinition uploadDocumentMetadataDefinition(File document) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number-registration/1/documents")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("multipart/form-data");

        if (document != null) {
            builder.addFormParameter(new Parameter("document", document));
        }
        return builder.build();
    }

    /**
     * uploadDocumentMetadata request builder class.
     */
    public class UploadDocumentMetadataRequest {
        private final File document;

        private UploadDocumentMetadataRequest(File document) {
            this.document = Objects.requireNonNull(document, "The required parameter 'document' is missing.");
        }

        /**
         * Executes the uploadDocumentMetadata request.
         *
         * @return NumbersDocumentMetadata The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersDocumentMetadata execute() throws ApiException {
            RequestDefinition uploadDocumentMetadataDefinition = uploadDocumentMetadataDefinition(document);
            return apiClient.execute(
                    uploadDocumentMetadataDefinition, new TypeReference<NumbersDocumentMetadata>() {}.getType());
        }

        /**
         * Executes the uploadDocumentMetadata request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersDocumentMetadata> callback) {
            RequestDefinition uploadDocumentMetadataDefinition = uploadDocumentMetadataDefinition(document);
            return apiClient.executeAsync(
                    uploadDocumentMetadataDefinition,
                    new TypeReference<NumbersDocumentMetadata>() {}.getType(),
                    callback);
        }
    }

    /**
     * Upload Document.
     * <p>
     * Uploads a document file to the system and returns the document metadata. The uploaded document can be used for 10DLC campaign registration purposes. Documents not attached to a campaign within 7 days will be automatically deleted. Supported file types: .bmp, .dib, .docx, .gif, .htm, .html, .jpeg, .jpg, .m2a, .m4a, .m4b, .m4p, .m4r, .m4v, .mp1, .mp2, .mp3, .mp4, .mpa, .oga, .ogg, .ogm, .ogv, .ogx, .odt, .pdf, .png, .raw, .rtf, .spx, .tif, .tiff, .txt, .wav, .webm, .xml, Maximum file size: 10MB.
     *
     * @param document The document file to be uploaded. (required)
     * @return UploadDocumentMetadataRequest
     */
    public UploadDocumentMetadataRequest uploadDocumentMetadata(File document) {
        return new UploadDocumentMetadataRequest(document);
    }

    private RequestDefinition validateEmergencyServiceDefinition(String numberKey, CallsAddress callsAddress) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/numbers/2/numbers/{numberKey}/voice/emergency-service/validate-address")
                .body(callsAddress)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (numberKey != null) {
            builder.addPathParameter(new Parameter("numberKey", numberKey));
        }
        return builder.build();
    }

    /**
     * validateEmergencyService request builder class.
     */
    public class ValidateEmergencyServiceRequest {
        private final String numberKey;
        private final CallsAddress callsAddress;

        private ValidateEmergencyServiceRequest(String numberKey, CallsAddress callsAddress) {
            this.numberKey = Objects.requireNonNull(numberKey, "The required parameter 'numberKey' is missing.");
            this.callsAddress =
                    Objects.requireNonNull(callsAddress, "The required parameter 'callsAddress' is missing.");
        }

        /**
         * Executes the validateEmergencyService request.
         *
         * @return CallsValidateAddressResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsValidateAddressResponse execute() throws ApiException {
            RequestDefinition validateEmergencyServiceDefinition =
                    validateEmergencyServiceDefinition(numberKey, callsAddress);
            return apiClient.execute(
                    validateEmergencyServiceDefinition, new TypeReference<CallsValidateAddressResponse>() {}.getType());
        }

        /**
         * Executes the validateEmergencyService request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsValidateAddressResponse> callback) {
            RequestDefinition validateEmergencyServiceDefinition =
                    validateEmergencyServiceDefinition(numberKey, callsAddress);
            return apiClient.executeAsync(
                    validateEmergencyServiceDefinition,
                    new TypeReference<CallsValidateAddressResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Validate Emergency Service Address.
     * <p>
     * Validate a Emergency Service Address
     *
     * @param numberKey Unique ID of a number. (required)
     * @param callsAddress  (required)
     * @return ValidateEmergencyServiceRequest
     */
    public ValidateEmergencyServiceRequest validateEmergencyService(String numberKey, CallsAddress callsAddress) {
        return new ValidateEmergencyServiceRequest(numberKey, callsAddress);
    }

    private RequestDefinition vetBrandDefinition(UUID brandId, NumbersBrandVet numbersBrandVet) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/vets")
                .body(numbersBrandVet)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }

    /**
     * vetBrand request builder class.
     */
    public class VetBrandRequest {
        private final UUID brandId;
        private final NumbersBrandVet numbersBrandVet;

        private VetBrandRequest(UUID brandId, NumbersBrandVet numbersBrandVet) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.numbersBrandVet =
                    Objects.requireNonNull(numbersBrandVet, "The required parameter 'numbersBrandVet' is missing.");
        }

        /**
         * Executes the vetBrand request.
         *
         * @return NumbersBrandVet The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public NumbersBrandVet execute() throws ApiException {
            RequestDefinition vetBrandDefinition = vetBrandDefinition(brandId, numbersBrandVet);
            return apiClient.execute(vetBrandDefinition, new TypeReference<NumbersBrandVet>() {}.getType());
        }

        /**
         * Executes the vetBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<NumbersBrandVet> callback) {
            RequestDefinition vetBrandDefinition = vetBrandDefinition(brandId, numbersBrandVet);
            return apiClient.executeAsync(
                    vetBrandDefinition, new TypeReference<NumbersBrandVet>() {}.getType(), callback);
        }
    }

    /**
     * Vet Brand.
     * <p>
     * Vets the brand with the given ID. Vetting a brand may only be performed once every 30 days. Can be created as vet type standard or enhanced. Each vet of a brand incurs a cost, consult your contract for pricing information.
     *
     * @param brandId The ID of the desired brand. (required)
     * @param numbersBrandVet  (required)
     * @return VetBrandRequest
     */
    public VetBrandRequest vetBrand(UUID brandId, NumbersBrandVet numbersBrandVet) {
        return new VetBrandRequest(brandId, numbersBrandVet);
    }
}
