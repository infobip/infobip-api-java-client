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
 * Action type related to error code.
 */
public enum CallsActionType {
    SEND_RINGING("SEND_RINGING"),
    PLAY("PLAY"),
    SAY("SAY"),
    SEND_DTMF("SEND_DTMF"),
    CAPTURE_DTMF("CAPTURE_DTMF"),
    CAPTURE_SPEECH("CAPTURE_SPEECH"),
    CALL_TRANSCRIPTION("CALL_TRANSCRIPTION"),
    CREATE_BULK("CREATE_BULK");

    private final String value;

    CallsActionType(String value) {
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
    public static CallsActionType fromValue(String value) {
        for (CallsActionType enumElement : CallsActionType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
