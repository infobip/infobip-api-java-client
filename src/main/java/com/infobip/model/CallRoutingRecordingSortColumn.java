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
 * Represents CallRoutingRecordingSortColumn enumeration.
 */
public enum CallRoutingRecordingSortColumn {
    ENDPOINT_TYPE("ENDPOINT_TYPE"),
    ROUTE_ID("ROUTE_ID"),
    CORRELATION_ID("CORRELATION_ID"),
    START_TIME("START_TIME"),
    END_TIME("END_TIME");

    private final String value;

    CallRoutingRecordingSortColumn(String value) {
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
    public static CallRoutingRecordingSortColumn fromValue(String value) {
        for (CallRoutingRecordingSortColumn enumElement : CallRoutingRecordingSortColumn.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
