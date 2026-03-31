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
 * The current status of sender&#39;s calling permission.&lt;br&gt;&#x60;NO_PERMISSION&#x60; - The end user has not granted calling permission to the sender.&lt;br&gt;&#x60;TEMPORARY&#x60; - The end user has granted a temporary calling permission to the sender.&lt;br&gt;&#x60;PERMANENT&#x60; - The end user has granted permanent calling permission to the sender.
 */
public enum WhatsAppCallingPermissionStatus {
    NO_PERMISSION("NO_PERMISSION"),
    TEMPORARY("TEMPORARY"),
    PERMANENT("PERMANENT");

    private final String value;

    WhatsAppCallingPermissionStatus(String value) {
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
    public static WhatsAppCallingPermissionStatus fromValue(String value) {
        for (WhatsAppCallingPermissionStatus enumElement : WhatsAppCallingPermissionStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
