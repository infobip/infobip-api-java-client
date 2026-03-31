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
 * Type of SMS messages you will send. - TRANSACTIONAL: Messages triggered by user actions or system events, such as one-time passwords (OTP/PIN), transaction alerts, password resets, or service notifications. - PROMOTIONAL: Messages sent for marketing or advertising purposes, such as promotions, offers, campaigns, or announcements.
 */
public enum ResourcesTrafficType {
    PROMOTIONAL("PROMOTIONAL"),
    TRANSACTIONAL("TRANSACTIONAL");

    private final String value;

    ResourcesTrafficType(String value) {
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
    public static ResourcesTrafficType fromValue(String value) {
        for (ResourcesTrafficType enumElement : ResourcesTrafficType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
