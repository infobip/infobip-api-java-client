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
 * Current limit of the sender.
 */
public enum WhatsAppSenderLimit {
    LIMIT_NA("LIMIT_NA"),
    LIMIT_250("LIMIT_250"),
    LIMIT_1K("LIMIT_1K"),
    LIMIT_10K("LIMIT_10K"),
    LIMIT_100K("LIMIT_100K"),
    UNLIMITED("UNLIMITED");

    private final String value;

    WhatsAppSenderLimit(String value) {
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
    public static WhatsAppSenderLimit fromValue(String value) {
        for (WhatsAppSenderLimit enumElement : WhatsAppSenderLimit.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
