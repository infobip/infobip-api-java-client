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
 * Billing traffic type applied to the message. Null for not chargeable messages.
 */
public enum RcsTrafficType {
    BASIC("BASIC"),
    SINGLE("SINGLE"),
    RICH("RICH"),
    RICH_MEDIA("RICH_MEDIA"),
    A2P_CONVERSATION("A2P_CONVERSATION"),
    P2A_CONVERSATION("P2A_CONVERSATION");

    private final String value;

    RcsTrafficType(String value) {
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
    public static RcsTrafficType fromValue(String value) {
        for (RcsTrafficType enumElement : RcsTrafficType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
