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
 * In the case of a video call on mobile phones camera will be back or front depending on this value. It is &#39;FRONT&#39; by default.
 */
public enum WebRtcCameraFacingMode {
    FRONT("FRONT"),
    BACK("BACK");

    private final String value;

    WebRtcCameraFacingMode(String value) {
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
    public static WebRtcCameraFacingMode fromValue(String value) {
        for (WebRtcCameraFacingMode enumElement : WebRtcCameraFacingMode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
