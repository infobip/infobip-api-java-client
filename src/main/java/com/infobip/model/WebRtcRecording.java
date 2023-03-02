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
 * Whether to allow recording calls during the session. Possible values are &#x60;ALWAYS&#x60;, &#x60;ON_DEMAND&#x60; and &#x60;DISABLED&#x60;. If want to set &#x60;ALWAYS&#x60; or &#x60;ON_DEMAND&#x60;, the capability must be enabled on account level (please contact your account manager for this).
 */
public enum WebRtcRecording {
    ALWAYS("ALWAYS"),
    ON_DEMAND("ON_DEMAND"),
    DISABLED("DISABLED");

    private final String value;

    WebRtcRecording(String value) {
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
    public static WebRtcRecording fromValue(String value) {
        for (WebRtcRecording enumElement : WebRtcRecording.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
