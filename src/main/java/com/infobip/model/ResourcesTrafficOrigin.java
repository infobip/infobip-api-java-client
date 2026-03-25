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
 * The location from which outbound messages are sent, relative to the country associated with the sender. - LOCAL: Indicates that the business sending the messages is headquartered in the same country as the sender being launched. - INTERNATIONAL: Indicates that the business is headquartered outside the country associated with the sender being launched.
 */
public enum ResourcesTrafficOrigin {
    LOCAL("LOCAL"),
    INTERNATIONAL("INTERNATIONAL");

    private final String value;

    ResourcesTrafficOrigin(String value) {
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
    public static ResourcesTrafficOrigin fromValue(String value) {
        for (ResourcesTrafficOrigin enumElement : ResourcesTrafficOrigin.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
