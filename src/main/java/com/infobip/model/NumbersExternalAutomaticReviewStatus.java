/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current status of the AI campaign review.
 */
public enum NumbersExternalAutomaticReviewStatus {
    PROCESSING("PROCESSING"),
    COMPLIANT("COMPLIANT"),
    NON_COMPLIANT("NON_COMPLIANT");

    private final String value;

    NumbersExternalAutomaticReviewStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static NumbersExternalAutomaticReviewStatus fromValue(String value) {
        for (NumbersExternalAutomaticReviewStatus enumElement : NumbersExternalAutomaticReviewStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
