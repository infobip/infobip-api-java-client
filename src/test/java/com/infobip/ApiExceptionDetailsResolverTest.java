/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static org.assertj.core.api.BDDAssertions.then;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ApiExceptionDetailsResolverTest {

    private final ApiExceptionDetailsResolver apiExceptionDetailsResolver = new ApiExceptionDetailsResolver();

    @Test
    void shouldProperlyResolveDetails() {
        // given
        var givenApiExceptionDetails = getApiExceptionDetailsWithOldFields();
        var expectedViolation = new ApiExceptionDetails.Violation();
        expectedViolation.setProperty("message");
        expectedViolation.setViolation(
                givenApiExceptionDetails.getValidationErrors().get("message").get(0));
        var anotherExpectedViolation = new ApiExceptionDetails.Violation();
        anotherExpectedViolation.setProperty("message");
        anotherExpectedViolation.setViolation(
                givenApiExceptionDetails.getValidationErrors().get("message").get(1));

        // when
        var expectedApiExceptionDetails = apiExceptionDetailsResolver.resolveDetails(givenApiExceptionDetails);

        // then
        then(expectedApiExceptionDetails.getErrorCode()).isEqualTo("E400");
        then(expectedApiExceptionDetails.getDescription()).isEqualTo(givenApiExceptionDetails.getText());
        then(expectedApiExceptionDetails.getAction()).isNull();
        then(expectedApiExceptionDetails.getViolations()).containsExactly(expectedViolation, anotherExpectedViolation);
        then(expectedApiExceptionDetails.getResources()).isNull();
    }

    @Test
    void shouldProperlyResolveDetailsForForbiddenResponse() {
        // given
        var givenApiExceptionDetails = getApiExceptionDetailsForbiddenWithOldFields();
        var expectedViolation = new ApiExceptionDetails.Violation();
        expectedViolation.setProperty("message");
        expectedViolation.setViolation(
                givenApiExceptionDetails.getValidationErrors().get("message").get(0));
        var anotherExpectedViolation = new ApiExceptionDetails.Violation();
        anotherExpectedViolation.setProperty("message");
        anotherExpectedViolation.setViolation(
                givenApiExceptionDetails.getValidationErrors().get("message").get(1));

        // when
        var expectedApiExceptionDetails = apiExceptionDetailsResolver.resolveDetails(givenApiExceptionDetails);

        // then
        then(expectedApiExceptionDetails.getErrorCode()).isEqualTo("E403");
        then(expectedApiExceptionDetails.getDescription()).isEqualTo(givenApiExceptionDetails.getText());
        then(expectedApiExceptionDetails.getAction()).isNull();
        then(expectedApiExceptionDetails.getViolations()).containsExactly(expectedViolation, anotherExpectedViolation);
        then(expectedApiExceptionDetails.getResources()).isNull();
    }

    @Test
    void shouldNotResolveDetailsIfValuesAreNotProvided() {
        // given
        var givenApiExceptionDetails = getApiExceptionDetailsWithNewFields();

        // when
        var expectedApiExceptionDetails = apiExceptionDetailsResolver.resolveDetails(givenApiExceptionDetails);

        // then
        then(expectedApiExceptionDetails).isEqualTo(givenApiExceptionDetails);
    }

    @Test
    void shouldNotResolveDetailsIfDetailsAreNull() {
        // given
        ApiExceptionDetails givenApiExceptionDetails = null;

        // when
        var expectedApiExceptionDetails = apiExceptionDetailsResolver.resolveDetails(givenApiExceptionDetails);

        // then
        then(expectedApiExceptionDetails).isNull();
    }

    private ApiExceptionDetails getApiExceptionDetailsWithOldFields() {
        var apiExceptionDetails = new ApiExceptionDetails();
        apiExceptionDetails.setMessageId("BAD_REQUEST");
        apiExceptionDetails.setText("Bad request");
        apiExceptionDetails.setValidationErrors(Map.of("message", List.of("must not be empty", "must not be null")));
        return apiExceptionDetails;
    }

    private ApiExceptionDetails getApiExceptionDetailsForbiddenWithOldFields() {
        var apiExceptionDetails = new ApiExceptionDetails();
        apiExceptionDetails.setMessageId("FORBIDDEN");
        apiExceptionDetails.setText("Forbidden");
        apiExceptionDetails.setValidationErrors(Map.of("message", List.of("must not be empty", "must not be null")));
        return apiExceptionDetails;
    }

    private ApiExceptionDetails getApiExceptionDetailsWithNewFields() {
        var apiExceptionDetails = new ApiExceptionDetails();

        ApiExceptionDetails.Violation violation = new ApiExceptionDetails.Violation();
        violation.setProperty("messages[1].content.text");
        violation.setViolation("Must not be null.");

        ApiExceptionDetails.Resource resource = new ApiExceptionDetails.Resource();
        resource.setName("API endpoint documentation");
        resource.setUrl("https://www.infobip.com/docs/api/channels/sms/sms-messaging/outbound-sms/send-sms-message");

        ApiExceptionDetails.Resource anotherResource = new ApiExceptionDetails.Resource();
        anotherResource.setName("Error codes description");
        anotherResource.setUrl("https://www.infobip.com/docs/essentials/response-status-and-error-codes");

        apiExceptionDetails.setErrorCode("E500");
        apiExceptionDetails.setDescription("A detailed description of the error");
        apiExceptionDetails.setAction("Action that should be taken to recover from the error");
        apiExceptionDetails.setViolations(List.of(violation));
        apiExceptionDetails.setResources(List.of(resource, anotherResource));
        return apiExceptionDetails;
    }
}
