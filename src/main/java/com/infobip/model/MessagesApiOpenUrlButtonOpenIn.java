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
 * Options available for RCS. Type of the URL open application. It is used to define how URL will be opened on a mobile phone. If it is not specified or if device does not support webviews, URL will be opened using browser. Following options are available: * &#x60;BROWSER&#x60;: Browser will be used on a mobile phone to open URL. * &#x60;WEBVIEW_FULL&#x60;: Integrated webview window will be used on a mobile phone to open URL. The web page takes up the full screen on a mobile phone. * &#x60;WEBVIEW_HALF&#x60;: Integrated webview window will be used on a mobile phone to open URL. The web page takes up half of the screen on a mobile phone. * &#x60;WEBVIEW_TALL&#x60;: Integrated webview window will be used on a mobile phone to open URL. The web page takes up three quarters of the screen on a mobile phone.
 */
public enum MessagesApiOpenUrlButtonOpenIn {
    BROWSER("BROWSER"),
    WEBVIEW_FULL("WEBVIEW_FULL"),
    WEBVIEW_HALF("WEBVIEW_HALF"),
    WEBVIEW_TALL("WEBVIEW_TALL");

    private final String value;

    MessagesApiOpenUrlButtonOpenIn(String value) {
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
    public static MessagesApiOpenUrlButtonOpenIn fromValue(String value) {
        for (MessagesApiOpenUrlButtonOpenIn enumElement : MessagesApiOpenUrlButtonOpenIn.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
