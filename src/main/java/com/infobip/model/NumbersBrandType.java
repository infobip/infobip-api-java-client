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
 * The type of brand.
 */
public enum NumbersBrandType {
    NON_PROFIT("TENDLC_NON_PROFIT"),
    PRIVATE_COMPANY("TENDLC_PRIVATE_COMPANY"),
    PUBLIC_COMPANY("TENDLC_PUBLIC_COMPANY"),
    GOVERNMENT("TENDLC_GOVERNMENT");

    private final String value;

    NumbersBrandType(String value) {
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
    public static NumbersBrandType fromValue(String value) {
        for (NumbersBrandType enumElement : NumbersBrandType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
