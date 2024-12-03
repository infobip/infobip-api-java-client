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
 * Machine Detection action detects answering machines at the beginning of the call. This action sets &#x60;machineAnswered&#x60; variable upon completion to &#x60;true&#x60;  or &#x60;false&#x60;. Machine Detection introduces a delay of approximately 4s. This is the minimum time needed for machine detection. Machine Detection action has to be followed by a condition action that uses the value of &#x60;machineAnswered&#x60; for branching into the &#39;human answered&#39; block and the &#39;answering machine answered&#39; block. The &#39;answering machine&#39; block can have a Say/Play/PlayFromRecording action or a Hangup action. If answering machine is detected, and a Say/Play/Play from Recording action is up next - the voice message will start playing into the voice mail only after the answering machine is finished with its greeting.
 */
public enum CallsMachineDetection {
    MACHINEDETECTION("machineDetection");

    private final String value;

    CallsMachineDetection(String value) {
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
    public static CallsMachineDetection fromValue(String value) {
        for (CallsMachineDetection enumElement : CallsMachineDetection.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
