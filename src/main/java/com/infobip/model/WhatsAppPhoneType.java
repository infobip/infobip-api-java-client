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
 * Type of the phone number. Can be &#x60;CELL&#x60;, &#x60;MAIN&#x60;, &#x60;IPHONE&#x60;, &#x60;HOME&#x60; or &#x60;WORK&#x60;.
 */
public enum WhatsAppPhoneType {
    CELL("CELL"),
    MAIN("MAIN"),
    IPHONE("IPHONE"),
    HOME("HOME"),
    WORK("WORK");

    private final String value;

    WhatsAppPhoneType(String value) {
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
    public static WhatsAppPhoneType fromValue(String value) {
        for (WhatsAppPhoneType enumElement : WhatsAppPhoneType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
