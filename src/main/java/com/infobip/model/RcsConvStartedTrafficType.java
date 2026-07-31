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
 * Traffic type applied to the inbound or outbound RCS message. Null for non chargeable RCS messages.
 */
public enum RcsConvStartedTrafficType {
    A2P_CONVERSATION("A2P_CONVERSATION"),
    INTERACTIVE_SESSION("INTERACTIVE_SESSION");

    private final String value;

    RcsConvStartedTrafficType(String value) {
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
    public static RcsConvStartedTrafficType fromValue(String value) {
        for (RcsConvStartedTrafficType enumElement : RcsConvStartedTrafficType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
