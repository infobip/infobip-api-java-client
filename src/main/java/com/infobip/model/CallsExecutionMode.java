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
 * Indicates whether detection is performed before (&#x60;SYNC&#x60;) or after (&#x60;ASYNC&#x60;) bridging the call. &#x60;ASYNC&#x60; only applies if there is no announcement playing to the callee side, otherwise it behaves like &#x60;SYNC&#x60;.
 */
public enum CallsExecutionMode {
    SYNC("SYNC"),
    ASYNC("ASYNC");

    private final String value;

    CallsExecutionMode(String value) {
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
    public static CallsExecutionMode fromValue(String value) {
        for (CallsExecutionMode enumElement : CallsExecutionMode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
