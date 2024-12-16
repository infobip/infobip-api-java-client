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
 * Represents FormsComponentType enumeration.
 */
public enum FormsComponentType {
    TEXT("TEXT"),
    TEXTAREA("TEXTAREA"),
    NUMBER("NUMBER"),
    DROPDOWN("DROPDOWN"),
    CHECKBOX("CHECKBOX"),
    CHECKBOX_GROUP("CHECKBOX_GROUP"),
    RADIOBUTTON("RADIOBUTTON"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    EMAIL("EMAIL"),
    MSISDN("MSISDN"),
    SUBMIT_BUTTON("SUBMIT_BUTTON"),
    TITLE("TITLE"),
    DESCRIPTION("DESCRIPTION"),
    APPLE_SPLASH("APPLE_SPLASH"),
    APPLE_BOOLEAN("APPLE_BOOLEAN"),
    WHATSAPP_SCREEN("WHATSAPP_SCREEN"),
    WHATSAPP_HEADING("WHATSAPP_HEADING"),
    WHATSAPP_SUBHEADING("WHATSAPP_SUBHEADING"),
    WHATSAPP_BODY("WHATSAPP_BODY");

    private final String value;

    FormsComponentType(String value) {
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
    public static FormsComponentType fromValue(String value) {
        for (FormsComponentType enumElement : FormsComponentType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
