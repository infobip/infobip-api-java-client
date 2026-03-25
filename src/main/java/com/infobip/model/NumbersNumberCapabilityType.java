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
 * An array of communication channels the number can support.
 */
public enum NumbersNumberCapabilityType {
    SMS("SMS"),
    VOICE("VOICE"),
    MMS("MMS"),
    WHATSAPP("WHATSAPP"),
    WHATSAPP_VOICE("WHATSAPP_VOICE");

    private final String value;

    NumbersNumberCapabilityType(String value) {
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
    public static NumbersNumberCapabilityType fromValue(String value) {
        for (NumbersNumberCapabilityType enumElement : NumbersNumberCapabilityType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
