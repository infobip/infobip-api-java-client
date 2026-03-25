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
 * Represents NumbersTollFreeMessageVolume enumeration.
 */
public enum NumbersTollFreeMessageVolume {
    TEN("TEN"),
    HUNDRED("HUNDRED"),
    THOUSAND("THOUSAND"),
    TEN_THOUSAND("TEN_THOUSAND"),
    HUNDRED_THOUSAND("HUNDRED_THOUSAND"),
    TWO_HUNDRED_FIFTY_THOUSAND("TWO_HUNDRED_FIFTY_THOUSAND"),
    FIVE_HUNDRED_THOUSAND("FIVE_HUNDRED_THOUSAND"),
    SEVEN_HUNDRED_FIFTY_THOUSAND("SEVEN_HUNDRED_FIFTY_THOUSAND"),
    ONE_MILLION("ONE_MILLION"),
    FIVE_MILLION("FIVE_MILLION"),
    TEN_MILLION_PLUS("TEN_MILLION_PLUS");

    private final String value;

    NumbersTollFreeMessageVolume(String value) {
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
    public static NumbersTollFreeMessageVolume fromValue(String value) {
        for (NumbersTollFreeMessageVolume enumElement : NumbersTollFreeMessageVolume.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
