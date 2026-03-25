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
 * Current status of the resource request.
 */
public enum ResourcesResourceOrderStatus {
    PENDING("PENDING"),
    UPDATE_REQUESTED_BY_INTERNAL_REVIEWER("UPDATE_REQUESTED_BY_INTERNAL_REVIEWER"),
    CANCELED("CANCELED"),
    AUTOMATIC_VALIDATION("AUTOMATIC_VALIDATION"),
    UPDATE_REQUESTED("UPDATE_REQUESTED"),
    REJECTED("REJECTED"),
    COMPLETED("COMPLETED"),
    PENDING_REVIEW("PENDING_REVIEW"),
    IN_REVIEW("IN_REVIEW"),
    IN_PROGRESS("IN_PROGRESS");

    private final String value;

    ResourcesResourceOrderStatus(String value) {
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
    public static ResourcesResourceOrderStatus fromValue(String value) {
        for (ResourcesResourceOrderStatus enumElement : ResourcesResourceOrderStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
