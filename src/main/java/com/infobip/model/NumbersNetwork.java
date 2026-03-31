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
 * The network with which the campaign has been registered.
 */
public enum NumbersNetwork {
    ATT("ATT"),
    T_MOBILE("T_MOBILE"),
    VERIZON("VERIZON"),
    US_CELLULAR("US_CELLULAR"),
    INTEROP("INTEROP"),
    CLEARSKY("CLEARSKY"),
    GOOGLE_VOICE("GOOGLE_VOICE");

    private final String value;

    NumbersNetwork(String value) {
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
    public static NumbersNetwork fromValue(String value) {
        for (NumbersNetwork enumElement : NumbersNetwork.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
