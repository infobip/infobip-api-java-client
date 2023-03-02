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
 * The language code which message is written in used when sending text-to-speech messages. If not defined, it will default to English (&#x60;en&#x60;).
 */
public enum TfaLanguage {
    EN("en"),
    ES("es"),
    CA("ca"),
    DA("da"),
    NL("nl"),
    FR("fr"),
    DE("de"),
    IT("it"),
    JA("ja"),
    KO("ko"),
    NO("no"),
    PL("pl"),
    RU("ru"),
    SV("sv"),
    FI("fi"),
    HR("hr"),
    SL("sl"),
    RO("ro"),
    PT_PT("pt-pt"),
    PT_BR("pt-br"),
    ZH_CN("zh-cn"),
    ZH_TW("zh-tw");

    private final String value;

    TfaLanguage(String value) {
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
    public static TfaLanguage fromValue(String value) {
        for (TfaLanguage enumElement : TfaLanguage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
