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
 * Call state.
 */
public enum CallState {
    CALLING("CALLING"),
    RINGING("RINGING"),
    PRE_ESTABLISHED("PRE_ESTABLISHED"),
    ESTABLISHED("ESTABLISHED"),
    FINISHED("FINISHED"),
    FAILED("FAILED"),
    CANCELLED("CANCELLED"),
    NO_ANSWER("NO_ANSWER"),
    BUSY("BUSY");

    private final String value;

    CallState(String value) {
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
    public static CallState fromValue(String value) {
        for (CallState enumElement : CallState.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
