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
 * Represents CallRoutingRecordingLocation enumeration.
 */
public enum CallRoutingRecordingLocation {
    SAO_PAULO("SAO_PAULO"),
    BOGOTA("BOGOTA"),
    FRANKFURT("FRANKFURT"),
    JOHANNESBURG("JOHANNESBURG"),
    JOHANNESBURG_1("JOHANNESBURG_1"),
    NEW_YORK("NEW_YORK"),
    PORTLAND("PORTLAND"),
    MOSCOW("MOSCOW"),
    SINGAPORE("SINGAPORE"),
    ISTANBUL("ISTANBUL"),
    KUALA_LUMPUR("KUALA_LUMPUR"),
    JAKARTA("JAKARTA"),
    MUMBAI("MUMBAI"),
    HONG_KONG_1("HONG_KONG_1"),
    HONG_KONG("HONG_KONG"),
    RIYADH("RIYADH"),
    CHENNAI("CHENNAI");

    private final String value;

    CallRoutingRecordingLocation(String value) {
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
    public static CallRoutingRecordingLocation fromValue(String value) {
        for (CallRoutingRecordingLocation enumElement : CallRoutingRecordingLocation.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
