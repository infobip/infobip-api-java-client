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
 * SIP trunk location.
 */
public enum CallsSipTrunkLocation {
    SAO_PAULO("SAO_PAULO"),
    BOGOTA("BOGOTA"),
    FRANKFURT("FRANKFURT"),
    SWEDEN("SWEDEN"),
    JOHANNESBURG("JOHANNESBURG"),
    NEW_YORK("NEW_YORK"),
    PORTLAND("PORTLAND"),
    MOSCOW("MOSCOW"),
    SINGAPORE("SINGAPORE"),
    ISTANBUL("ISTANBUL"),
    KUALA_LUMPUR("KUALA_LUMPUR");

    private final String value;

    CallsSipTrunkLocation(String value) {
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
    public static CallsSipTrunkLocation fromValue(String value) {
        for (CallsSipTrunkLocation enumElement : CallsSipTrunkLocation.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
