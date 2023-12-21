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
 * Status of the sender.
 */
public enum WhatsAppSenderStatus {
    BANNED("BANNED"),
    CONNECTED("CONNECTED"),
    DELETED("DELETED"),
    DISCONNECTED("DISCONNECTED"),
    FLAGGED("FLAGGED"),
    MIGRATED("MIGRATED"),
    PENDING("PENDING"),
    RATE_LIMITED("RATE_LIMITED"),
    RESTRICTED("RESTRICTED"),
    UNKNOWN("UNKNOWN"),
    UNVERIFIED("UNVERIFIED");

    private final String value;

    WhatsAppSenderStatus(String value) {
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
    public static WhatsAppSenderStatus fromValue(String value) {
        for (WhatsAppSenderStatus enumElement : WhatsAppSenderStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
