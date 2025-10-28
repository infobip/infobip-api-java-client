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
 * Indicates whether end of the message detection is enabled for the call. &#x60;ALWAYS&#x60; specifies that after detection of &#x60;MACHINE&#x60; the script will always wait for the end of the message before executing actions defined in &#x60;onMachineDetected&#x60;. &#x60;NEVER&#x60; specifies that after detection of &#x60;MACHINE&#x60; actions defined in &#x60;onMachineDetected&#x60; will be executed immediately. &#x60;ON_DETECTING&#x60; specifies that end of the message will be respected as long as actions in &#x60;onDetecting&#x60; are in progress, once these actions finish the script jumps to &#x60;onMachineDetected&#x60; section immediately.
 */
public enum CallsWaitForEom {
    ALWAYS("ALWAYS"),
    NEVER("NEVER"),
    ON_DETECTING("ON_DETECTING");

    private final String value;

    CallsWaitForEom(String value) {
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
    public static CallsWaitForEom fromValue(String value) {
        for (CallsWaitForEom enumElement : CallsWaitForEom.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
