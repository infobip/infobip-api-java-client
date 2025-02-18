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
 * Represents MessagesApiTemplateButtonType enumeration.
 */
public enum MessagesApiTemplateButtonType {
    QUICK_REPLY("QUICK_REPLY"),
    OPEN_URL("OPEN_URL"),
    PHONE_NUMBER("PHONE_NUMBER"),
    FLOW("FLOW"),
    COPY_CODE("COPY_CODE"),
    CATALOG("CATALOG"),
    MULTI_PRODUCT("MULTI_PRODUCT");

    private final String value;

    MessagesApiTemplateButtonType(String value) {
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
    public static MessagesApiTemplateButtonType fromValue(String value) {
        for (MessagesApiTemplateButtonType enumElement : MessagesApiTemplateButtonType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
