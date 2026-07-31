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
 * Traffic type applied to the RCS message that the delivery report refers to. Null for not chargeable RCS messages.
 */
public enum RcsDlrTrafficType {
    BASIC("BASIC"),
    SINGLE("SINGLE"),
    RICH("RICH"),
    RICH_MEDIA("RICH_MEDIA"),
    P2A_CONVERSATION("P2A_CONVERSATION"),
    INTERACTIVE_SESSION("INTERACTIVE_SESSION");

    private final String value;

    RcsDlrTrafficType(String value) {
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
    public static RcsDlrTrafficType fromValue(String value) {
        for (RcsDlrTrafficType enumElement : RcsDlrTrafficType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
