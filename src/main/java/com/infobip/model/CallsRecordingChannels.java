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
 * Audio channel mode. If set to &#x60;STEREO&#x60;, incoming audio from the endpoint is recorded on the left channel and outgoing audio on the right channel.
 */
public enum CallsRecordingChannels {
    MONO("MONO"),
    STEREO("STEREO");

    private final String value;

    CallsRecordingChannels(String value) {
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
    public static CallsRecordingChannels fromValue(String value) {
        for (CallsRecordingChannels enumElement : CallsRecordingChannels.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
