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
 * Type of the webview&#39;s view mode. It must be defined when &#x60;application&#x60; is set to &#x60;WEBVIEW&#x60;. Following options are available: * &#x60;FULL&#x60;: The web page takes up the full screen on a mobile phone. * &#x60;HALF&#x60;: The web page takes up half of the screen on a mobile phone. * &#x60;TALL&#x60;: The web page takes up three quarters of the screen on a mobile phone.
 */
public enum RcsWebviewViewModeType {
    FULL("FULL"),
    HALF("HALF"),
    TALL("TALL");

    private final String value;

    RcsWebviewViewModeType(String value) {
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
    public static RcsWebviewViewModeType fromValue(String value) {
        for (RcsWebviewViewModeType enumElement : RcsWebviewViewModeType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
