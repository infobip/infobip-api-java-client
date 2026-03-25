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
 * Type of numbers.
 */
public enum ResourcesResourceNumberType {
    SHORT_CODE("SHORT_CODE"),
    VIRTUAL_LONG_NUMBER("VIRTUAL_LONG_NUMBER"),
    TEN_DIGIT_LONG_CODE("TEN_DIGIT_LONG_CODE"),
    TOLL_FREE_NUMBER("TOLL_FREE_NUMBER");

    private final String value;

    ResourcesResourceNumberType(String value) {
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
    public static ResourcesResourceNumberType fromValue(String value) {
        for (ResourcesResourceNumberType enumElement : ResourcesResourceNumberType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
