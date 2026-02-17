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
 * Represents CallsDialogHangupSource enumeration.
 */
public enum CallsDialogHangupSource {
    API("API"),
    PARENT_ENDPOINT("PARENT_ENDPOINT"),
    CHILD_ENDPOINT("CHILD_ENDPOINT"),
    PLATFORM("PLATFORM");

    private final String value;

    CallsDialogHangupSource(String value) {
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
    public static CallsDialogHangupSource fromValue(String value) {
        for (CallsDialogHangupSource enumElement : CallsDialogHangupSource.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
