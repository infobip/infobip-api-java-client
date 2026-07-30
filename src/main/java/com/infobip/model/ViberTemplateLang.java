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
 * Language code for the template body.
 */
public enum ViberTemplateLang {
    AR("ar"),
    HY("hy"),
    BE("be"),
    BS("bs"),
    BG("bg"),
    MY("my"),
    HR("hr"),
    CS("cs"),
    DA("da"),
    NL("nl"),
    EN("en"),
    FI("fi"),
    FR("fr"),
    KA("ka"),
    DE("de"),
    EL("el"),
    HE("he"),
    HU("hu"),
    ID("id"),
    IT("it"),
    JA("ja"),
    NE("ne"),
    NO("no"),
    FA("fa"),
    PL("pl"),
    RO("ro"),
    RU("ru"),
    SR("sr"),
    SK("sk"),
    SL("sl"),
    ES("es"),
    SV("sv"),
    TH("th"),
    TR("tr"),
    UK("uk"),
    VI("vi"),
    ZH_HANS("zh-Hans"),
    ZH_HANT("zh-Hant"),
    PT_BR("pt_BR"),
    PT_PT("pt_PT"),
    FR_FR("fr_FR"),
    ES_ES("es_ES");

    private final String value;

    ViberTemplateLang(String value) {
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
    public static ViberTemplateLang fromValue(String value) {
        for (ViberTemplateLang enumElement : ViberTemplateLang.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
