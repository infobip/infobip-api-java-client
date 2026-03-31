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
 * The type of number.
 */
public enum NumberType {
    VIRTUAL_LONG_NUMBER("VIRTUAL_LONG_NUMBER"),
    SHORT_CODE("SHORT_CODE"),
    SIM_HOSTING("SIM_HOSTING"),
    VIRTUAL_SIM_HOSTING("VIRTUAL_SIM_HOSTING"),
    VIRTUAL_LONG_NUMBER_CALL_TRIGGER("VIRTUAL_LONG_NUMBER_CALL_TRIGGER"),
    SHORT_CODE_USSD("SHORT_CODE_USSD"),
    WHATSAPP("WHATSAPP"),
    VIBER("VIBER"),
    VIBER_VOICE("VIBER_VOICE"),
    FACEBOOK("FACEBOOK"),
    RCS("RCS"),
    TELEGRAM("TELEGRAM"),
    KAKAO_SANGDAM("KAKAO_SANGDAM"),
    OPEN_CHANNEL("OPEN_CHANNEL");

    private final String value;

    NumberType(String value) {
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
    public static NumberType fromValue(String value) {
        for (NumberType enumElement : NumberType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
