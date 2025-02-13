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
 * Represents layout during the call.When GRID layout is selected, multiple video streams are displayed simultaneously and user can spotlight specific video stream.When SOLO layout is selected, an user can see only his video streams.If there are more than one layout in this list, the first one will be initially selected, and users can change it during the call.The default layout will be set to GRID.
 */
public enum WebRtcLayout {
    SOLO("SOLO"),
    GRID("GRID");

    private final String value;

    WebRtcLayout(String value) {
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
    public static WebRtcLayout fromValue(String value) {
        for (WebRtcLayout enumElement : WebRtcLayout.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
