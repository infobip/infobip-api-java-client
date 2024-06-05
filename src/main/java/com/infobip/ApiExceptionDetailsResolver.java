/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ApiExceptionDetailsResolver {

    private static final Map<String, String> errorCodes = Map.of(
            "BAD_REQUEST", "E400",
            "UNAUTHORIZED", "E401",
            "FORBIDDEN", "E403",
            "NOT_FOUND", "E404",
            "TOO_MANY_REQUESTS", "E429",
            "GENERAL_ERROR", "E500");

    ApiExceptionDetailsResolver() {}

    ApiExceptionDetails resolveDetails(ApiExceptionDetails apiExceptionDetails) {
        if (apiExceptionDetails != null) {
            var newApiExceptionDetails = new ApiExceptionDetails();
            newApiExceptionDetails.setMessageId(apiExceptionDetails.getMessageId());
            newApiExceptionDetails.setText(apiExceptionDetails.getText());
            newApiExceptionDetails.setValidationErrors(apiExceptionDetails.getValidationErrors());
            mapMessageIdToErrorCode(apiExceptionDetails, newApiExceptionDetails);
            mapTextToDescription(apiExceptionDetails, newApiExceptionDetails);
            newApiExceptionDetails.setAction(apiExceptionDetails.getAction());
            mapValidationErrorsToViolations(apiExceptionDetails, newApiExceptionDetails);
            newApiExceptionDetails.setResources(apiExceptionDetails.getResources());
            return newApiExceptionDetails;
        } else {
            return null;
        }
    }

    private void mapValidationErrorsToViolations(
            ApiExceptionDetails apiExceptionDetails, ApiExceptionDetails newApiExceptionDetails) {
        if (apiExceptionDetails.getValidationErrors() != null) {
            List<ApiExceptionDetails.Violation> violations = new ArrayList<>();
            apiExceptionDetails
                    .getValidationErrors()
                    .forEach((k, v) -> v.forEach(e -> {
                        var apiExceptionViolation = new ApiExceptionDetails.Violation();
                        apiExceptionViolation.setProperty(k);
                        apiExceptionViolation.setViolation(e);
                        violations.add(apiExceptionViolation);
                    }));
            newApiExceptionDetails.setViolations(violations);
        } else {
            newApiExceptionDetails.setViolations(apiExceptionDetails.getViolations());
        }
    }

    private void mapTextToDescription(
            ApiExceptionDetails apiExceptionDetails, ApiExceptionDetails newApiExceptionDetails) {
        if (apiExceptionDetails.getText() != null) {
            newApiExceptionDetails.setDescription(apiExceptionDetails.getText());
        } else {
            newApiExceptionDetails.setDescription(apiExceptionDetails.getDescription());
        }
    }

    private void mapMessageIdToErrorCode(
            ApiExceptionDetails apiExceptionDetails, ApiExceptionDetails newApiExceptionDetails) {
        if (apiExceptionDetails.getMessageId() != null) {
            newApiExceptionDetails.setErrorCode(errorCodes.get(apiExceptionDetails.getMessageId()));
        } else {
            newApiExceptionDetails.setErrorCode(apiExceptionDetails.getErrorCode());
        }
    }
}
