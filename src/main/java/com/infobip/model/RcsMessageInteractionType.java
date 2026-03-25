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
 * The interaction type of the message that was sent. Note: this describes the message structure, not the billing category, which may differ.
 */
public enum RcsMessageInteractionType {
    BASIC_MESSAGE("BASIC_MESSAGE"),
    SINGLE_MESSAGE("SINGLE_MESSAGE"),
    RICH_MESSAGE("RICH_MESSAGE"),
    RICH_MEDIA_MESSAGE("RICH_MEDIA_MESSAGE");

    private final String value;

    RcsMessageInteractionType(String value) {
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
    public static RcsMessageInteractionType fromValue(String value) {
        for (RcsMessageInteractionType enumElement : RcsMessageInteractionType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
