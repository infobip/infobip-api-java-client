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
 * Represents MessagesApiWebhookEventContentType enumeration.
 */
public enum MessagesApiWebhookEventContentType {
    TEXT("TEXT"),
    SUBJECT("SUBJECT"),
    IMAGE("IMAGE"),
    AUDIO("AUDIO"),
    VIDEO("VIDEO"),
    DOCUMENT("DOCUMENT"),
    FILE("FILE"),
    BUTTON_REPLY("BUTTON_REPLY"),
    LIST_REPLY("LIST_REPLY"),
    LOCATION("LOCATION"),
    AUTHENTICATION_RESPONSE("AUTHENTICATION_RESPONSE"),
    FLOW_RESPONSE("FLOW_RESPONSE");

    private final String value;

    MessagesApiWebhookEventContentType(String value) {
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
    public static MessagesApiWebhookEventContentType fromValue(String value) {
        for (MessagesApiWebhookEventContentType enumElement : MessagesApiWebhookEventContentType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
