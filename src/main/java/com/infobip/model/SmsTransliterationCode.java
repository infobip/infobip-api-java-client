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
 * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, and &#x60;NON_UNICODE&#x60;.
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
