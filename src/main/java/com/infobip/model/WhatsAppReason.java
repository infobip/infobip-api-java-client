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
 * Template rejection reason.
 */
public enum WhatsAppReason {
    ABUSIVE_CONTENT("ABUSIVE_CONTENT"),
    INCORRECT_CATEGORY("INCORRECT_CATEGORY"),
    INVALID_FORMAT("INVALID_FORMAT"),
    NONE("NONE"),
    SCAM("SCAM"),
    UNKNOWN("UNKNOWN");

    private final String value;

    WhatsAppReason(String value) {
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
    public static WhatsAppReason fromValue(String value) {
        for (WhatsAppReason enumElement : WhatsAppReason.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
