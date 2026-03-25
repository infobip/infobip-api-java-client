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
 * Text language. Must be defined for correct pronunciation. More info about available languages and voices can be found [here](https://www.infobip.com/docs/voice-and-video/getting-started#text-to-speech).
 */
public enum CallsLanguage {
    AR("ar"),
    AR_MA("ar-ma"),
    BG("bg"),
    BN("bn"),
    CA("ca"),
    CS("cs"),
    DA("da"),
    DE("de"),
    DE_AT("de-at"),
    DE_CH("de-ch"),
    EL("el"),
    EN("en"),
    EN_AU("en-au"),
    EN_CA("en-ca"),
    EN_GB("en-gb"),
    EN_GB_WLS("en-gb-wls"),
    EN_IE("en-ie"),
    EN_IN("en-in"),
    ES("es"),
    ES_AR("es-ar"),
    ES_MX("es-mx"),
    FI("fi"),
    FIL_PH("fil-ph"),
    FR("fr"),
    FR_CA("fr-ca"),
    FR_CH("fr-ch"),
    GU("gu"),
    HE("he"),
    HI("hi"),
    HR("hr"),
    HU("hu"),
    ID("id"),
    IS("is"),
    IT("it"),
    JA("ja"),
    KK_KZ("kk-kz"),
    KN("kn"),
    KO("ko"),
    ML("ml"),
    MR_IN("mr-in"),
    MS("ms"),
    NL("nl"),
    FALSE("false"),
    PL("pl"),
    PT_BR("pt-br"),
    PT_PT("pt-pt"),
    RO("ro"),
    RU("ru"),
    SK("sk"),
    SL("sl"),
    SV("sv"),
    SW_KE("sw-ke"),
    SW_TZ("sw-tz"),
    TA("ta"),
    TE("te"),
    TH("th"),
    TR("tr"),
    UK("uk"),
    UR_PK("ur-pk"),
    UZ_UZ("uz-uz"),
    VI("vi"),
    WLS("wls"),
    ZH_CN("zh-cn"),
    ZH_TW("zh-tw");

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
