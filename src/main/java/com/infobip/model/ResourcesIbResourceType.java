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
 * Resource type.
 */
public enum ResourcesIbResourceType {
    ALPHANUMERIC("ALPHANUMERIC"),
    NUMBER("NUMBER"),
    RCS_RESOURCE("RCS_RESOURCE"),
    VIBER_RESOURCE("VIBER_RESOURCE"),
    APPLE_RESOURCE("APPLE_RESOURCE"),
    OPEN_CHANNEL_RESOURCE("OPEN_CHANNEL_RESOURCE"),
    KAKAO_RESOURCE("KAKAO_RESOURCE"),
    FACEBOOK_RESOURCE("FACEBOOK_RESOURCE");

    private final String value;

    ResourcesIbResourceType(String value) {
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
    public static ResourcesIbResourceType fromValue(String value) {
        for (ResourcesIbResourceType enumElement : ResourcesIbResourceType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
