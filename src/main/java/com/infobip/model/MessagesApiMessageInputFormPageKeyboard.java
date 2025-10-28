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
 * Type of keyboard to be shown.
 */
public enum MessagesApiMessageInputFormPageKeyboard {
    DEFAULT("DEFAULT"),
    ASCII_CAPABLE("ASCII_CAPABLE"),
    NUMBERS_AND_PUNCTUATION("NUMBERS_AND_PUNCTUATION"),
    URL("URL"),
    NUMBER_PAD("NUMBER_PAD"),
    PHONE_PAD("PHONE_PAD"),
    NAME_PHONE_PAD("NAME_PHONE_PAD"),
    EMAIL_ADDRESS("EMAIL_ADDRESS"),
    DECIMAL_PAD("DECIMAL_PAD"),
    TWITTER_KEYBOARD("TWITTER_KEYBOARD"),
    WEB_SEARCH("WEB_SEARCH");

    private final String value;

    MessagesApiMessageInputFormPageKeyboard(String value) {
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
    public static MessagesApiMessageInputFormPageKeyboard fromValue(String value) {
        for (MessagesApiMessageInputFormPageKeyboard enumElement : MessagesApiMessageInputFormPageKeyboard.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
