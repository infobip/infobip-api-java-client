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
 * The transliteration of your sent message from one script to another. [Transliteration](https://www.infobip.com/docs/sms/language#sms-transliteration) is used to replace characters which are not recognized as part of your defaulted alphabet. &#x60;ALL&#x60; means that the transliteration process will recognize all supported languages.
 */
public enum SmsTransliterationCode {
    NONE("NONE"),
    TURKISH("TURKISH"),
    GREEK("GREEK"),
    CYRILLIC("CYRILLIC"),
    SERBIAN_CYRILLIC("SERBIAN_CYRILLIC"),
    CENTRAL_EUROPEAN("CENTRAL_EUROPEAN"),
    BALTIC("BALTIC"),
    NON_UNICODE("NON_UNICODE"),
    PORTUGUESE("PORTUGUESE"),
    COLOMBIAN("COLOMBIAN"),
    BULGARIAN_CYRILLIC("BULGARIAN_CYRILLIC"),
    ALL("ALL");

    private final String value;

    SmsTransliterationCode(String value) {
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
    public static SmsTransliterationCode fromValue(String value) {
        for (SmsTransliterationCode enumElement : SmsTransliterationCode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
