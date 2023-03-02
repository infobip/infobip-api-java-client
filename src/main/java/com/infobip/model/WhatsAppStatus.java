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
 * Status of the template.
 */
public enum WhatsAppStatus {
    APPROVED("APPROVED"),
    IN_APPEAL("IN_APPEAL"),
    PENDING("PENDING"),
    REJECTED("REJECTED"),
    PENDING_DELETION("PENDING_DELETION"),
    DELETED("DELETED"),
    REINSTATED("REINSTATED"),
    FLAGGED("FLAGGED"),
    FIRST_PAUSED("FIRST_PAUSED"),
    SECOND_PAUSED("SECOND_PAUSED"),
    DISABLED("DISABLED");

    private final String value;

    WhatsAppStatus(String value) {
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
    public static WhatsAppStatus fromValue(String value) {
        for (WhatsAppStatus enumElement : WhatsAppStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
