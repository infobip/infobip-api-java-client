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
 * Type of the message content. Select the type from the dropbox to view their parameters.
 */
public enum WhatsAppWebhookType {
    TEXT("TEXT"),
    IMAGE("IMAGE"),
    DOCUMENT("DOCUMENT"),
    STICKER("STICKER"),
    LOCATION("LOCATION"),
    CONTACT("CONTACT"),
    VIDEO("VIDEO"),
    VOICE("VOICE"),
    AUDIO("AUDIO"),
    BUTTON("BUTTON"),
    INTERACTIVE_BUTTON_REPLY("INTERACTIVE_BUTTON_REPLY"),
    INTERACTIVE_LIST_REPLY("INTERACTIVE_LIST_REPLY"),
    INTERACTIVE_PAYMENT_CONFIRMATION("INTERACTIVE_PAYMENT_CONFIRMATION"),
    ORDER("ORDER"),
    UNSUPPORTED("UNSUPPORTED");

    private final String value;

    WhatsAppWebhookType(String value) {
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
    public static WhatsAppWebhookType fromValue(String value) {
        for (WhatsAppWebhookType enumElement : WhatsAppWebhookType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
