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
 * Status of the authentication attempt.
 */
public enum WhatsAppInThreadAuthenticationStatus {
    UNSUPPORTED("UNSUPPORTED"),
    VERIFIED("VERIFIED"),
    INTERACTION_CANCELED("INTERACTION_CANCELED"),
    VERIFICATION_FAILED("VERIFICATION_FAILED"),
    UNKNOWN("UNKNOWN");

    private final String value;

    WhatsAppInThreadAuthenticationStatus(String value) {
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
    public static WhatsAppInThreadAuthenticationStatus fromValue(String value) {
        for (WhatsAppInThreadAuthenticationStatus enumElement : WhatsAppInThreadAuthenticationStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
