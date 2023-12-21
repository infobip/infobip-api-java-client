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
 * Preferred presentation of anonymized calls.
 */
public enum CallsAnonymizationType {
    NONE("NONE"),
    REMOTE_PARTY_ID("REMOTE_PARTY_ID"),
    ASSERTED_IDENTITY("ASSERTED_IDENTITY"),
    PREFERRED_IDENTITY("PREFERRED_IDENTITY");

    private final String value;

    CallsAnonymizationType(String value) {
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
    public static CallsAnonymizationType fromValue(String value) {
        for (CallsAnonymizationType enumElement : CallsAnonymizationType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
