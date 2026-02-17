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
 * [Language code](https://www.infobip.com/docs/sms/language#national-language-identifier) for the correct character set. &#x60;AUTODETECT&#x60; lets the platform select the character set based on message content only for supported languages.
 */
public enum SmsLanguageCode {
    NONE("NONE"),
    TR("TR"),
    ES("ES"),
    PT("PT"),
    AUTODETECT("AUTODETECT");

    private final String value;

    SmsLanguageCode(String value) {
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
    public static SmsLanguageCode fromValue(String value) {
        for (SmsLanguageCode enumElement : SmsLanguageCode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
