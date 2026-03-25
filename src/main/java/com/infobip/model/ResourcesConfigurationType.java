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
 * Channel type.
 */
public enum ResourcesConfigurationType {
    SMS("SMS"),
    MMS("MMS"),
    WHATSAPP("WHATSAPP"),
    RCS("RCS"),
    VIBER_BM("VIBER_BM"),
    APPLE_MB("APPLE_MB"),
    LINE_OA("LINE_OA"),
    KAKAO_SANGDAM("KAKAO_SANGDAM"),
    MESSENGER("MESSENGER"),
    INSTAGRAM_DM("INSTAGRAM_DM"),
    ZALO_ZNS("ZALO_ZNS"),
    TELEGRAM("TELEGRAM"),
    VIBER_BOT("VIBER_BOT"),
    EMAIL("EMAIL"),
    ZALO_FOLLOWER("ZALO_FOLLOWER"),
    OPEN_CHANNEL("OPEN_CHANNEL"),
    TIKTOK_BM("TIKTOK_BM");

    private final String value;

    ResourcesConfigurationType(String value) {
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
    public static ResourcesConfigurationType fromValue(String value) {
        for (ResourcesConfigurationType enumElement : ResourcesConfigurationType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
