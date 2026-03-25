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
 * Name of calling permission related action.&lt;br&gt;&#x60;START_CALL&#x60; - The action of establishing a new call with the end user.&lt;br&gt;&#x60;SEND_CALL_PERMISSION_REQUEST&#x60; - The action of sending new call permissions request messages to end user.
 */
public enum WhatsAppCallingPermissionActionName {
    START_CALL("START_CALL"),
    SEND_CALL_PERMISSION_REQUEST("SEND_CALL_PERMISSION_REQUEST");

    private final String value;

    WhatsAppCallingPermissionActionName(String value) {
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
    public static WhatsAppCallingPermissionActionName fromValue(String value) {
        for (WhatsAppCallingPermissionActionName enumElement : WhatsAppCallingPermissionActionName.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
