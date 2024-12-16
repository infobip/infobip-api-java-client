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
 * Type of unique ID
 */
public enum FlowPersonUniqueFieldType {
    EMAIL("EMAIL"),
    PHONE("PHONE"),
    FACEBOOK("FACEBOOK"),
    LINE("LINE"),
    APPLE_BUSINESS_CHAT("APPLE_BUSINESS_CHAT");

    private final String value;

    FlowPersonUniqueFieldType(String value) {
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
    public static FlowPersonUniqueFieldType fromValue(String value) {
        for (FlowPersonUniqueFieldType enumElement : FlowPersonUniqueFieldType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
