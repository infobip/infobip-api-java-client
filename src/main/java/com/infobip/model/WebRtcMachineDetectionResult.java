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
 * Machine detection indicates whether the call was answered by a machine (MACHINE) or a human (HUMAN). If machine detection was not enabled or did not return a conclusive result, it will return null (NULL).
 */
public enum WebRtcMachineDetectionResult {
    MACHINE("MACHINE"),
    HUMAN("HUMAN"),
    NULL("NULL");

    private final String value;

    WebRtcMachineDetectionResult(String value) {
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
    public static WebRtcMachineDetectionResult fromValue(String value) {
        for (WebRtcMachineDetectionResult enumElement : WebRtcMachineDetectionResult.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
