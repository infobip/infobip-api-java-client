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
 * Represents MessagesApiMessageButtonType enumeration.
 */
public enum MessagesApiMessageButtonType {
    REPLY("REPLY"),
    OPEN_URL("OPEN_URL"),
    DIAL_PHONE("DIAL_PHONE"),
    SHOW_LOCATION("SHOW_LOCATION"),
    REQUEST_LOCATION("REQUEST_LOCATION"),
    ADD_CALENDAR_EVENT("ADD_CALENDAR_EVENT");

    private final String value;

    MessagesApiMessageButtonType(String value) {
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
    public static MessagesApiMessageButtonType fromValue(String value) {
        for (MessagesApiMessageButtonType enumElement : MessagesApiMessageButtonType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
