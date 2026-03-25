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
 * Indicates the channel supported by the resource.
 */
public enum ResourcesResourceCapabilityChannel {
    SMS("SMS"),
    MMS("MMS"),
    RCS("RCS"),
    VIBER_BM("VIBER_BM"),
    VIBER_BOT("VIBER_BOT"),
    APPLE_MB("APPLE_MB"),
    OPEN_CHANNEL("OPEN_CHANNEL"),
    KAKAO_CHINGU("KAKAO_CHINGU"),
    KAKAO_ALIM("KAKAO_ALIM"),
    KAKAO_SANGDAM("KAKAO_SANGDAM"),
    FACEBOOK_POSTS("FACEBOOK_POSTS"),
    MESSENGER("MESSENGER");

    private final String value;

    ResourcesResourceCapabilityChannel(String value) {
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
    public static ResourcesResourceCapabilityChannel fromValue(String value) {
        for (ResourcesResourceCapabilityChannel enumElement : ResourcesResourceCapabilityChannel.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
