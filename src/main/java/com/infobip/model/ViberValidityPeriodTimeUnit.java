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
 * Message failover validity period time unit. Required if &#39;validityPeriod&#39; is set. Allowed values: SECONDS, MINUTES, HOURS, DAYS.
 */
public enum ViberValidityPeriodTimeUnit {
    SECONDS("SECONDS"),
    MINUTES("MINUTES"),
    HOURS("HOURS"),
    DAYS("DAYS");

    private final String value;

    ViberValidityPeriodTimeUnit(String value) {
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
    public static ViberValidityPeriodTimeUnit fromValue(String value) {
        for (ViberValidityPeriodTimeUnit enumElement : ViberValidityPeriodTimeUnit.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
