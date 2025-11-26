package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infobip.model.*;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class BrandsApiTest extends ApiTest {

    @Test
    void shouldCreateBrand() throws Exception {

        String givenRequest = "{\n" + "  \"name\": \"Example Brand\",\n"
                + "  \"applicationId\": \"app-123\",\n"
                + "  \"entityId\": \"entity-456\",\n"
                + "  \"website\": \"https://example.com\",\n"
                + "  \"type\": \"BUSINESS\",\n"
                + "  \"referenceId\": \"ref-789\",\n"
                + "  \"legalName\": \"Example Legal Name\",\n"
                + "  \"address\": {\n"
                + "    \"state\": \"ON\",\n"
                + "    \"street\": \"Sample City\",\n"
                + "    \"zipCode\": \"12345\",\n"
                + "    \"city\": \"US\"\n"
                + "  },\n"
                + "  \"countryCode\": \"US\",\n"
                + "  \"supportEmail\": \"support@example.com\",\n"
                + "  \"supportPhone\": \"+1234567890\",\n"
                + "  \"vertical\": \"TECH\",\n"
                + "  \"taxId\": \"TAX123456\",\n"
                + "  \"taxIdIssuingCountry\": \"US\",\n"
                + "  \"alternateBusinessId\": {\n"
                + "    \"id\": \"alt-001\"\n"
                + "  },\n"
                + "  \"stockExchange\": \"NASDAQ\",\n"
                + "  \"stockSymbol\": \"EXMPL\",\n"
                + "  \"businessContactEmail\": \"contact@example.com\"\n"
                + "}";

        String givenResponse = "{\n" + "  \"id\": \"string\",\n"
                + "  \"applicationId\": \"string\",\n"
                + "  \"entityId\": \"string\",\n"
                + "  \"name\": \"string\",\n"
                + "  \"stage\": \"string\",\n"
                + "  \"website\": \"string\",\n"
                + "  \"createdDate\": \"2023-01-01T12:00:00\",\n"
                + "  \"lastModifiedDate\": \"2023-01-02T12:00:00\",\n"
                + "  \"referenceId\": \"string\",\n"
                + "  \"legalName\": \"string\",\n"
                + "  \"countryCode\": \"string\",\n"
                + "  \"supportEmail\": \"string\",\n"
                + "  \"supportPhone\": \"string\",\n"
                + "  \"vertical\": \"string\",\n"
                + "  \"taxId\": \"string\",\n"
                + "  \"taxIdIssuingCountry\": \"string\",\n"
                + "  \"type\": \"string\",\n"
                + "  \"stockExchange\": \"string\",\n"
                + "  \"stockSymbol\": \"string\",\n"
                + "  \"businessContactEmail\": \"string\"\n"
                + "}";
        setUpPostRequest("/number-registration/1/brands", givenRequest, givenResponse, 200);
        Consumer<BrandResponse> assertions = (brandResponse) -> {
            then(brandResponse.getId()).isEqualTo("string");
            then(brandResponse.getApplicationId()).isEqualTo("string");
            then(brandResponse.getEntityId()).isEqualTo("string");
            then(brandResponse.getName()).isEqualTo("string");
            then(brandResponse.getStage()).isEqualTo("string");
            then(brandResponse.getWebsite()).isEqualTo("string");
            then(brandResponse.getCreatedDate()).isEqualTo(LocalDateTime.parse("2023-01-01T12:00:00"));
            then(brandResponse.getLastModifiedDate()).isEqualTo(LocalDateTime.parse("2023-01-02T12:00:00"));
            then(brandResponse.getReferenceId()).isEqualTo("string");
            then(brandResponse.getLegalName()).isEqualTo("string");
            then(brandResponse.getCountryCode()).isEqualTo("string");
            then(brandResponse.getSupportEmail()).isEqualTo("string");
            then(brandResponse.getSupportPhone()).isEqualTo("string");
            then(brandResponse.getVertical()).isEqualTo("string");
            then(brandResponse.getTaxId()).isEqualTo("string");
            then(brandResponse.getTaxIdIssuingCountry()).isEqualTo("string");
            then(brandResponse.getType()).isEqualTo("string");
            then(brandResponse.getStockExchange()).isEqualTo("string");
            then(brandResponse.getStockSymbol()).isEqualTo("string");
            then(brandResponse.getBusinessContactEmail()).isEqualTo("string");
        };
        BrandApi api = new BrandApi(getApiClient());
        ObjectMapper objectMapper = new ObjectMapper();
        BrandRequest brandRequest = objectMapper.readValue(givenRequest, BrandRequest.class);
        var call = api.createBrand(brandRequest);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldGetBrandById() {

        String brandId = "brand-123";
        String givenResponse = "{\n" + "  \"id\": \"brand-123\",\n"
                + "  \"applicationId\": \"app-123\",\n"
                + "  \"entityId\": \"entity-456\",\n"
                + "  \"name\": \"Example Brand\",\n"
                + "  \"stage\": \"ACTIVE\",\n"
                + "  \"website\": \"https://example.com\",\n"
                + "  \"createdDate\": \"2023-01-01T12:00:00\",\n"
                + "  \"lastModifiedDate\": \"2023-01-02T12:00:00\",\n"
                + "  \"referenceId\": \"ref-789\",\n"
                + "  \"legalName\": \"Example Legal Name\",\n"
                + "  \"countryCode\": \"US\",\n"
                + "  \"supportEmail\": \"support@example.com\",\n"
                + "  \"supportPhone\": \"+1234567890\",\n"
                + "  \"vertical\": \"TECH\",\n"
                + "  \"taxId\": \"TAX123456\",\n"
                + "  \"taxIdIssuingCountry\": \"US\",\n"
                + "  \"type\": \"BUSINESS\",\n"
                + "  \"stockExchange\": \"NASDAQ\",\n"
                + "  \"stockSymbol\": \"EXMPL\",\n"
                + "  \"businessContactEmail\": \"contact@example.com\"\n"
                + "}";

        setUpSuccessGetRequest("/number-registration/1/brands/brand-123", Map.of(), givenResponse);

        Consumer<BrandResponse> assertions = (brandResponse) -> {
            then(brandResponse.getId()).isEqualTo("brand-123");
            then(brandResponse.getApplicationId()).isEqualTo("app-123");
            then(brandResponse.getEntityId()).isEqualTo("entity-456");
            then(brandResponse.getName()).isEqualTo("Example Brand");
            then(brandResponse.getStage()).isEqualTo("ACTIVE");
            then(brandResponse.getWebsite()).isEqualTo("https://example.com");
            then(brandResponse.getCreatedDate()).isEqualTo(LocalDateTime.parse("2023-01-01T12:00:00"));
            then(brandResponse.getLastModifiedDate()).isEqualTo(LocalDateTime.parse("2023-01-02T12:00:00"));
            then(brandResponse.getReferenceId()).isEqualTo("ref-789");
            then(brandResponse.getLegalName()).isEqualTo("Example Legal Name");
            then(brandResponse.getCountryCode()).isEqualTo("US");
            then(brandResponse.getSupportEmail()).isEqualTo("support@example.com");
            then(brandResponse.getSupportPhone()).isEqualTo("+1234567890");
            then(brandResponse.getVertical()).isEqualTo("TECH");
            then(brandResponse.getTaxId()).isEqualTo("TAX123456");
            then(brandResponse.getTaxIdIssuingCountry()).isEqualTo("US");
            then(brandResponse.getType()).isEqualTo("BUSINESS");
            then(brandResponse.getStockExchange()).isEqualTo("NASDAQ");
            then(brandResponse.getStockSymbol()).isEqualTo("EXMPL");
            then(brandResponse.getBusinessContactEmail()).isEqualTo("contact@example.com");
        };

        BrandApi api = new BrandApi(getApiClient());
        var call = api.getBrands(brandId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldDeleteBrandById() {
        String brandId = "brand-123";
        setUpNoResponseBodyDeleteRequest("/number-registration/1/brands/brand-123", Map.of(), 200);

        BrandApi api = new BrandApi(getApiClient());
        var call = api.deleteBrand(brandId);

        // No response body to assert, just ensure no exception is thrown
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }

    @Test
    void shouldRegisterBrandById() {

        String brandId = "brand-123";
        setUpNoBodyPostRequest("/number-registration/1/brands/brand-123/register", Map.of(), 200);

        BrandApi api = new BrandApi(getApiClient());
        var call = api.registerBrand(brandId);

        // No response body to assert, just ensure no exception is thrown
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }

    @Test
    void shouldGetBrandRegistrarStatuses() {
        String brandId = "brand-123";
        String givenResponse = "{\n" + "      \"registrar\": \"SOME_REGISTRAR\",\n"
                + "      \"state\": \"APPROVED\",\n"
                + "      \"brandIdentityStatus\": \"test\"\n"
                + "}";

        setUpSuccessGetRequest("/number-registration/1/brands/brand-123/registrar-statuses", Map.of(), givenResponse);

        Consumer<GetBrandRegistrarStatusesResponse> assertions = (response) -> {
            then(response.getRegistrar()).isEqualTo("SOME_REGISTRAR");
            then(response.getState()).isEqualTo("APPROVED");
            then(response.getBrandIdentityStatus()).isEqualTo("test");
        };

        BrandApi api = new BrandApi(getApiClient());
        var call = api.getBrandRegistrarStatuses(brandId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldVetBrand() throws JsonProcessingException {

        String brandId = "brand-123";
        String givenRequest = "{\n" + "  \"status\": \"STANDARD\",\n" + "  \"type\": \"Some info\"\n" + "}";
        String givenResponse = "{\n" + "  \"vetId\": \"vet-456\",\n"
                + "  \"brandId\": \"brand-123\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"createdDate\": \"2023-01-01T12:00:00\"\n"
                + "}";

        setUpPostRequest("/number-registration/1/brands/brand-123/vets", givenRequest, givenResponse, 200);

        Consumer<BrandVetResponse> assertions = (vetResponse) -> {
            then(vetResponse.getVetId()).isEqualTo("vet-456");
            then(vetResponse.getBrandId()).isEqualTo("brand-123");
            then(vetResponse.getStatus()).isEqualTo("APPROVED");
        };

        ObjectMapper objectMapper = new ObjectMapper();
        BrandVetRequest vetRequest = objectMapper.readValue(givenRequest, BrandVetRequest.class);

        BrandApi api = new BrandApi(getApiClient());
        var call = api.vetBrand(vetRequest, brandId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldGetBrandVetById() {

        String brandId = "brand-123";
        String vetId = "vet-456";
        String givenResponse = "{\n" + "  \"vetId\": \"vet-456\",\n"
                + "  \"brandId\": \"brand-123\",\n"
                + "  \"status\": \"APPROVED\"\n"
                + "}";

        setUpSuccessGetRequest("/number-registration/1/brands/brand-123/vets/vet-456", Map.of(), givenResponse);

        Consumer<BrandVetResponse> assertions = (vetResponse) -> {
            then(vetResponse.getVetId()).isEqualTo("vet-456");
            then(vetResponse.getBrandId()).isEqualTo("brand-123");
            then(vetResponse.getStatus()).isEqualTo("APPROVED");
        };

        BrandApi api = new BrandApi(getApiClient());
        var call = api.getBrandVet(brandId, vetId);
        testSuccessfulCall(call::execute, assertions);
    }

    @Test
    void shouldResend2fa() {
        String brandId = "brand-123";
        setUpNoBodyPostRequest("/number-registration/1/brands/brand-123/resend2fa", Map.of(), 200);

        BrandApi api = new BrandApi(getApiClient());
        var call = api.resend2fa(brandId);

        // No response body to assert, just ensure no exception is thrown
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }
}
