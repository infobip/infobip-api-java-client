package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.*;
import com.infobip.model.*;
import java.util.Objects;
import okhttp3.Call;

/**
 * Represents BrandApi API client.
 */
public class BrandApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of BrandApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public BrandApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition createBrandDefinition(BrandRequest BrandRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/number-registration/1/brands")
                .body(BrandRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }
    /**
     * createBrand request builder class.
     */
    public class CreateBrandRequest {

        private final BrandRequest request;

        private CreateBrandRequest(BrandRequest request) {
            this.request = Objects.requireNonNull(request, "The required parameter 'BrandRequest' is missing.");
        }

        /**
         * Executes the createBrand request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public BrandResponse execute() throws ApiException {
            RequestDefinition createBrandDefinition = createBrandDefinition(request);
            return apiClient.execute(createBrandDefinition, new TypeReference<BrandResponse>() {}.getType());
        }

        /**
         * Executes the createBrand request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition createBrandsDefinition = createBrandDefinition(request);
            return apiClient.executeAsync(
                    createBrandsDefinition, new TypeReference<BrandResponse>() {}.getType(), callback);
        }
    }
    /**
     * Create Brand.
     * <p>
     * create Brand.
     *
     * @param BrandRequest  (required)
     * @return CreateBrandRequest
     */
    public CreateBrandRequest createBrand(BrandRequest BrandRequest) {
        return new CreateBrandRequest(BrandRequest);
    }

    private RequestDefinition getBrandsDefinition(String brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/number-registration/1/brands/{brandId}")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }
    /**
     * getBrands request builder class.
     */
    public class GetBrandsRequest {

        private final String brandId;

        private GetBrandsRequest(String brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the getBrands request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public BrandResponse execute() throws ApiException {
            RequestDefinition getBrandsDefinition = getBrandsDefinition(brandId);
            return apiClient.execute(getBrandsDefinition, new TypeReference<BrandResponse>() {}.getType());
        }

        /**
         * Executes the getBrands request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition getBrandsDefinition = getBrandsDefinition(brandId);
            return apiClient.executeAsync(
                    getBrandsDefinition, new TypeReference<BrandResponse>() {}.getType(), callback);
        }
    }
    /**
     * Get Brands.
     * <p>
     * Get Brands.
     *
     * @param brandId  (required)
     * @return GetBrandsRequest
     */
    public GetBrandsRequest getBrands(String brandId) {
        return new GetBrandsRequest(brandId);
    }

    private RequestDefinition deleteBrandDefinition(String brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/number-registration/1/brands/{brandId}")
                .requiresAuthentication(true)
                .contentType("application/json");
        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }
    /**
     * deleteBrand request builder class.
     */
    public class DeleteBrandRequest {

        private final String brandId;

        private DeleteBrandRequest(String brandId) {
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
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteBrandDefinition = deleteBrandDefinition(brandId);
            return apiClient.executeAsync(deleteBrandDefinition, callback);
        }
    }
    /**
     * Delete Brands.
     * <p>
     * Delete Brands.
     *
     * @param brandId  (required)
     * @return DeleteBrandRequest
     */
    public DeleteBrandRequest deleteBrand(String brandId) {
        return new DeleteBrandRequest(brandId);
    }

    private RequestDefinition registerBrandDefinition(String brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/register")
                .accept("application/json")
                .requiresAuthentication(true);

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }
    /**
     * registerBrand request builder class.
     */
    public class RegisterBrandRequest {

        private final String brandId;

        private RegisterBrandRequest(String brandId) {
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
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition registerBrandDefinition = registerBrandDefinition(brandId);
            return apiClient.executeAsync(registerBrandDefinition, callback);
        }
    }
    /**
     * Register Brands.
     * <p>
     * Register Brands.
     *
     * @param brandId  (required)
     * @return RegisterBrand
     */
    public RegisterBrandRequest registerBrand(String brandId) {
        return new RegisterBrandRequest(brandId);
    }

    private RequestDefinition getBrandRegistrarStatusesDefinition(String brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/brands/{brandId}/registrar-statuses")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }
    /**
     * getBrandRegistrarStatuses request builder class.
     */
    public class GetBrandRegistrarStatusesRequest {

        private final String brandId;

        private GetBrandRegistrarStatusesRequest(String brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the getBrandRegistrarStatuses request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public GetBrandRegistrarStatusesResponse execute() throws ApiException {
            RequestDefinition getBrandRegistrarStatusesDefinition = getBrandRegistrarStatusesDefinition(brandId);
            return apiClient.execute(
                    getBrandRegistrarStatusesDefinition,
                    new TypeReference<GetBrandRegistrarStatusesResponse>() {}.getType());
        }

        /**
         * Executes the getBrandRegistrarStatuses request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition getBrandRegistrarStatusesDefinition = getBrandRegistrarStatusesDefinition(brandId);
            return apiClient.executeAsync(
                    getBrandRegistrarStatusesDefinition,
                    new TypeReference<GetBrandRegistrarStatusesResponse>() {}.getType(),
                    callback);
        }
    }
    /**
     * Get BrandRegistrarStatuses.
     * <p>
     * Get BrandRegistrarStatuses.
     *
     * @param brandId  (required)
     * @return GGetBrandRegistrarStatusesRequest
     */
    public GetBrandRegistrarStatusesRequest getBrandRegistrarStatuses(String brandId) {
        return new GetBrandRegistrarStatusesRequest(brandId);
    }

    private RequestDefinition vetBrandDefinition(BrandVetRequest brandVetRequest, String brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/vets")
                .body(brandVetRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }

        return builder.build();
    }
    /**
     * VetBrand request builder class.
     */
    public class VetBrandRequest {

        private final BrandVetRequest request;
        private final String brandId;

        private VetBrandRequest(BrandVetRequest request, String brandId) {
            this.request = Objects.requireNonNull(request, "The required parameter 'BrandVetRequest' is missing.");
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the BrandVet request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public BrandVetResponse execute() throws ApiException {
            RequestDefinition vetBrandDefinition = vetBrandDefinition(request, brandId);
            return apiClient.execute(vetBrandDefinition, new TypeReference<BrandVetResponse>() {}.getType());
        }

        /**
         * Executes the BrandVet request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition vetBrandDefinition = vetBrandDefinition(request, brandId);
            return apiClient.executeAsync(
                    vetBrandDefinition, new TypeReference<BrandVetResponse>() {}.getType(), callback);
        }
    }
    /**
     * vet Brand.
     * <p>
     * vet Brand.
     *
     * @param brandVetRequest  (required)
     * @param brandId  (required)
     * @return VetBrandRequest
     */
    public VetBrandRequest vetBrand(BrandVetRequest brandVetRequest, String brandId) {
        return new VetBrandRequest(brandVetRequest, brandId);
    }

    private RequestDefinition getBrandVetDefinition(String brandId, String vetId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/number-registration/1/brands/{brandId}/vets/{vetId}")
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
     * getBrandVet request builder class.
     */
    public class GetBrandVetRequest {

        private final String brandId;
        private final String vetId;

        private GetBrandVetRequest(String brandId, String vetId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
            this.vetId = Objects.requireNonNull(vetId, "The required parameter 'vetId' is missing.");
        }

        /**
         * Executes the getBrandVet request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public BrandVetResponse execute() throws ApiException {
            RequestDefinition getBrandVetDefinition = getBrandVetDefinition(brandId, vetId);
            return apiClient.execute(getBrandVetDefinition, new TypeReference<BrandVetResponse>() {}.getType());
        }

        /**
         * Executes the getBrandVet request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition getBrandVetDefinition = getBrandVetDefinition(brandId, vetId);
            return apiClient.executeAsync(
                    getBrandVetDefinition, new TypeReference<BrandVetResponse>() {}.getType(), callback);
        }
    }
    /**
     * Get Brand Vet.
     * <p>
     * Get Brand Vet.
     *
     * @param brandId  (required)
     * @return GetBrandsRequest
     */
    public GetBrandVetRequest getBrandVet(String brandId, String vetId) {
        return new GetBrandVetRequest(brandId, vetId);
    }

    private RequestDefinition resend2faDefinition(String brandId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/number-registration/1/brands/{brandId}/resend2fa")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");
        if (brandId != null) {
            builder.addPathParameter(new Parameter("brandId", brandId));
        }
        return builder.build();
    }
    /**
     * resend2fa request builder class.
     */
    public class Resend2faRequest {

        private final String brandId;

        private Resend2faRequest(String brandId) {
            this.brandId = Objects.requireNonNull(brandId, "The required parameter 'brandId' is missing.");
        }

        /**
         * Executes the resend2fa request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition resend2faDefinition = resend2faDefinition(brandId);
            apiClient.execute(resend2faDefinition);
        }

        /**
         * Executes the resend2fa request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link Call} associated with the API request.
         */
        public Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition resend2faDefinition = resend2faDefinition(brandId);
            return apiClient.executeAsync(resend2faDefinition, callback);
        }
    }
    /**
     * Resend2fa.
     * <p>
     * Resend2fa.
     *
     * @param brandId  (required)
     * @return Resend2faRequest
     */
    public Resend2faRequest resend2fa(String brandId) {
        return new Resend2faRequest(brandId);
    }
}
