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
 * Text language. Must be defined for correct pronunciation. For more details on available languages and voices, see our [documentation](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast).
 */
public enum CallsLanguage {
    AR("ar"),
    BN("bn"),
    BG("bg"),
    CA("ca"),
    ZH_CN("zh-cn"),
    ZH_TW("zh-tw"),
    HR("hr"),
    CS("cs"),
    DA("da"),
    NL("nl"),
    EN("en"),
    EN_AU("en-au"),
    EN_GB("en-gb"),
    EN_CA("en-ca"),
    EN_IN("en-in"),
    EN_IE("en-ie"),
    EN_GB_WLS("en-gb-wls"),
    EPO("epo"),
    FIL_PH("fil-ph"),
    FI("fi"),
    FR("fr"),
    FR_CA("fr-ca"),
    FR_CH("fr-ch"),
    DE("de"),
    DE_AT("de-at"),
    DE_CH("de-ch"),
    EL("el"),
    GU("gu"),
    HE("he"),
    HI("hi"),
    HU("hu"),
    IS("is"),
    ID("id"),
    IT("it"),
    JA("ja"),
    KN("kn"),
    KO("ko"),
    MS("ms"),
    ML("ml"),
    NO("no"),
    PL("pl"),
    PT_PT("pt-pt"),
    PT_BR("pt-br"),
    RO("ro"),
    RU("ru"),
    SK("sk"),
    SL("sl"),
    ES("es"),
    ES_GL("es-gl"),
    ES_MX("es-mx"),
    SV("sv"),
    TA("ta"),
    TE("te"),
    TH("th"),
    TR("tr"),
    UK("uk"),
    VI("vi"),
    WLS("wls"),
    AR_MA("ar-ma"),
    UR_PK("ur-pk"),
    MR_IN("mr-in");

    private final String value;

    CallsLanguage(String value) {
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
    public static CallsLanguage fromValue(String value) {
        for (CallsLanguage enumElement : CallsLanguage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
