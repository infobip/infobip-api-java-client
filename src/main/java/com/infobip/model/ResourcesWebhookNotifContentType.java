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
 * Type of resource.
 */
public enum ResourcesWebhookNotifContentType {
    ALPHANUMERIC_REGISTRATION("ALPHANUMERIC_REGISTRATION"),
    NUMBER_PURCHASE("NUMBER_PURCHASE"),
    RCS_SENDER_LAUNCH("RCS_SENDER_LAUNCH");

    private final String value;

    ResourcesWebhookNotifContentType(String value) {
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
    public static ResourcesWebhookNotifContentType fromValue(String value) {
        for (ResourcesWebhookNotifContentType enumElement : ResourcesWebhookNotifContentType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
