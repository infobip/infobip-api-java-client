package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

public class FormsApiTest extends ApiTest {

    private static final String FORMS = "/forms/1/forms";
    private static final String FORM = "/forms/1/forms/{id}";
    private static final String FORMS_VIEWS = "/forms/1/forms/{id}/views";
    private static final String FORMS_SUBMIT = "/forms/1/forms/{id}/data";

    @Test
    void shouldGetAllForms() {
        String givenFormId1 = "f23f0f7c-9898-4feb-8f21-5afe2c29db7e";
        String givenFormName1 = "Test form";
        int givenOffset = 0;
        int givenLimit = 25;
        long givenTotal = 1;
        boolean givenResubmitEnabled = true;
        FormsType givenFormType = FormsType.OPT_IN;
        FormsStatus givenFormStatus = FormsStatus.ACTIVE;
        String givenCreatedAt = "2023-02-09T12:00:00+01:00";
        OffsetDateTime givenCreatedAtDateTime = OffsetDateTime.parse(givenCreatedAt);
        String givenUpdatedAt = "2023-02-09T12:00:00+01:00";
        OffsetDateTime givenUpdatedAtDateTime = OffsetDateTime.parse(givenUpdatedAt);
        FormsComponentType givenComponent = FormsComponentType.TEXT;
        String givenFieldId = "last_name";
        String givenPersonField = "";
        String givenLabel = "";
        boolean givenIsHidden = true;
        boolean givenIsRequired = true;
        String givenPlaceholder = "";

        String givenResponse = String.format(
                "{\n" + "  \"forms\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"elements\": [\n"
                        + "        {\n"
                        + "          \"component\": \"%s\",\n"
                        + "          \"fieldId\": \"%s\",\n"
                        + "          \"personField\": \"%s\",\n"
                        + "          \"label\": \"%s\",\n"
                        + "          \"isRequired\": %b,\n"
                        + "          \"isHidden\": %b,\n"
                        + "          \"placeholder\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"createdAt\": \"%s\",\n"
                        + "      \"updatedAt\": \"%s\",\n"
                        + "      \"resubmitEnabled\": %b,\n"
                        + "      \"formType\": \"%s\",\n"
                        + "      \"formStatus\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"offset\": %d,\n"
                        + "  \"limit\": %d,\n"
                        + "  \"total\": %d\n"
                        + "}",
                givenFormId1,
                givenFormName1,
                givenComponent,
                givenFieldId,
                givenPersonField,
                givenLabel,
                givenIsRequired,
                givenIsHidden,
                givenPlaceholder,
                givenCreatedAt,
                givenUpdatedAt,
                givenResubmitEnabled,
                givenFormType,
                givenFormStatus,
                givenOffset,
                givenLimit,
                givenTotal);

        setUpGetRequest(FORMS, Map.of(), givenResponse, 200);

        FormsApi api = new FormsApi(getApiClient());

        FormsResponse expectedResponse = new FormsResponse()
                .forms(List.of(new FormsResponseContent()
                        .id(givenFormId1)
                        .name(givenFormName1)
                        .elements(List.of(new FormsElement()
                                .component(givenComponent)
                                .fieldId(givenFieldId)
                                .personField(givenPersonField)
                                .label(givenLabel)
                                .isRequired(givenIsRequired)
                                .isHidden(givenIsHidden)
                                .placeholder(givenPlaceholder)))
                        .createdAt(givenCreatedAtDateTime)
                        .updatedAt(givenUpdatedAtDateTime)
                        .resubmitEnabled(givenResubmitEnabled)
                        .formType(givenFormType)
                        .formStatus(givenFormStatus)))
                .offset(givenOffset)
                .limit(givenLimit)
                .total(givenTotal);

        Consumer<FormsResponse> assertions = (response) -> {
            then(response).isEqualTo(expectedResponse);
        };

        var call = api.getForms();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetFormById() {
        String givenFormId = "f23f0f7c-9898-4feb-8f21-5afe2c29db7e";
        String givenFormName = "Test form";
        boolean givenResubmitEnabled = true;
        FormsType givenFormType = FormsType.OPT_IN;
        FormsStatus givenFormStatus = FormsStatus.ACTIVE;
        String givenCreatedAt = "2023-02-09T12:00:00+01:00";
        OffsetDateTime givenCreatedAtDateTime = OffsetDateTime.parse(givenCreatedAt);
        String givenUpdatedAt = "2023-02-09T12:00:00+01:00";
        OffsetDateTime givenUpdatedAtDateTime = OffsetDateTime.parse(givenUpdatedAt);
        FormsComponentType givenComponent = FormsComponentType.TEXT;
        String givenFieldId = "last_name";
        String givenPersonField = "";
        String givenLabel = "";
        boolean givenIsHidden = true;
        boolean givenIsRequired = true;
        String givenPlaceholder = "";

        String givenResponse = String.format(
                "    {\n" + "      \"id\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"elements\": [\n"
                        + "        {\n"
                        + "          \"component\": \"%s\",\n"
                        + "          \"fieldId\": \"%s\",\n"
                        + "          \"personField\": \"%s\",\n"
                        + "          \"label\": \"%s\",\n"
                        + "          \"isRequired\": %b,\n"
                        + "          \"isHidden\": %b,\n"
                        + "          \"placeholder\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"createdAt\": \"%s\",\n"
                        + "      \"updatedAt\": \"%s\",\n"
                        + "      \"resubmitEnabled\": %b,\n"
                        + "      \"formType\": \"%s\",\n"
                        + "      \"formStatus\": \"%s\"\n"
                        + "    }",
                givenFormId,
                givenFormName,
                givenComponent,
                givenFieldId,
                givenPersonField,
                givenLabel,
                givenIsRequired,
                givenIsHidden,
                givenPlaceholder,
                givenCreatedAt,
                givenUpdatedAt,
                givenResubmitEnabled,
                givenFormType,
                givenFormStatus);

        setUpGetRequest(FORM.replace("{id}", givenFormId), Map.of(), givenResponse, 200);

        FormsApi api = new FormsApi(getApiClient());

        FormsResponseContent expectedResponse = new FormsResponseContent()
                .id(givenFormId)
                .name(givenFormName)
                .elements(List.of(new FormsElement()
                        .component(givenComponent)
                        .fieldId(givenFieldId)
                        .personField(givenPersonField)
                        .label(givenLabel)
                        .isRequired(givenIsRequired)
                        .isHidden(givenIsHidden)
                        .placeholder(givenPlaceholder)))
                .createdAt(givenCreatedAtDateTime)
                .updatedAt(givenUpdatedAtDateTime)
                .resubmitEnabled(givenResubmitEnabled)
                .formType(givenFormType)
                .formStatus(givenFormStatus);

        Consumer<FormsResponseContent> assertions = (response) -> {
            then(response).isEqualTo(expectedResponse);
        };

        var call = api.getForm(givenFormId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldIncrementFormViewCount() {
        String formId = "12345";
        String givenStatus = "OK";

        String givenResponse = String.format("{\n" + "  \"status\": \"%s\"\n" + "}", givenStatus);

        setUpEmptyPostRequest(FORMS_VIEWS.replace("{id}", formId), Map.of(), givenResponse, 200);

        FormsApi formsApi = new FormsApi(getApiClient());

        Consumer<FormsStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = formsApi.incrementViewCount(formId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSubmitFormData() {
        String formId = "12345";
        String givenStatus = "OK";

        String givenResponse = String.format("{\n" + "  \"status\": \"%s\"\n" + "}", givenStatus);

        var givenNumber = 26;
        var givenBoolean = true;

        var requestBody =
                String.format("{\n" + "  \"number\": %d,\n" + "  \"boolean\": %b\n" + "}", givenNumber, givenBoolean);

        setUpPostRequest(FORMS_SUBMIT.replace("{id}", formId), requestBody, givenResponse, 200);

        FormsApi formsApi = new FormsApi(getApiClient());

        Map<String, Object> formDataRequest = Map.of(
                "number", givenNumber,
                "boolean", givenBoolean);

        Consumer<FormsStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = formsApi.submitFormData(formId, formDataRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
