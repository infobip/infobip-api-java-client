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
 * Hangup source identifies who terminated the call: the PLATFORM, the API, or one of the participants (CALLER or CALLEE).
 */
public enum WebRtcHangupSource {
    CALLER("CALLER"),
    CALLEE("CALLEE"),
    API("API"),
    PLATFORM("PLATFORM");

    private final String value;

    WebRtcHangupSource(String value) {
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
    public static WebRtcHangupSource fromValue(String value) {
        for (WebRtcHangupSource enumElement : WebRtcHangupSource.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
