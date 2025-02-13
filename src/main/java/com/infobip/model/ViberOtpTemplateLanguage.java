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
 * Represents ViberOtpTemplateLanguage enumeration.
 */
public enum ViberOtpTemplateLanguage {
    ENGLISH("ENGLISH"),
    ARABIC("ARABIC"),
    BULGARIAN("BULGARIAN"),
    CROATIAN("CROATIAN"),
    CZECH("CZECH"),
    DANISH("DANISH"),
    GERMAN("GERMAN"),
    GREEK("GREEK"),
    SPANISH("SPANISH"),
    FINNISH("FINNISH"),
    FRENCH("FRENCH"),
    HEBREW("HEBREW"),
    BURMESE("BURMESE"),
    HUNGARIAN("HUNGARIAN"),
    INDONESIAN("INDONESIAN"),
    ITALIAN("ITALIAN"),
    JAPANESE("JAPANESE"),
    NORWEGIAN("NORWEGIAN"),
    DUTCH("DUTCH"),
    POLISH("POLISH"),
    PORTUGUESE_PORTUGAL("PORTUGUESE_PORTUGAL"),
    PORTUGUESE_BRAZIL("PORTUGUESE_BRAZIL"),
    ROMANIAN("ROMANIAN"),
    RUSSIAN("RUSSIAN"),
    SLOVAK("SLOVAK"),
    SERBIAN("SERBIAN"),
    SWEDISH("SWEDISH"),
    THAI("THAI"),
    TURKISH("TURKISH"),
    UKRAINIAN("UKRAINIAN"),
    VIETNAMESE("VIETNAMESE"),
    PERSIAN("PERSIAN"),
    BELARUSIAN("BELARUSIAN");

    private final String value;

    ViberOtpTemplateLanguage(String value) {
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
    public static ViberOtpTemplateLanguage fromValue(String value) {
        for (ViberOtpTemplateLanguage enumElement : ViberOtpTemplateLanguage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
