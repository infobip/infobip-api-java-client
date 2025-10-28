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
 * Template language, one template with same name can have multiple transliterations.
 */
public enum WhatsAppLanguage {
    AF("af"),
    SQ("sq"),
    AR("ar"),
    AR_EG("ar_EG"),
    AR_AE("ar_AE"),
    AR_LB("ar_LB"),
    AR_MA("ar_MA"),
    AR_QA("ar_QA"),
    AZ("az"),
    BN("bn"),
    BN_IN("bn_IN"),
    BG("bg"),
    CA("ca"),
    ZH_CN("zh_CN"),
    ZH_HK("zh_HK"),
    ZH_TW("zh_TW"),
    HR("hr"),
    CS("cs"),
    DA("da"),
    NL("nl"),
    NL_BE("nl_BE"),
    EN("en"),
    EN_GB("en_GB"),
    EN_US("en_US"),
    EN_AE("en_AE"),
    EN_AU("en_AU"),
    EN_CA("en_CA"),
    EN_GH("en_GH"),
    EN_IE("en_IE"),
    EN_IN("en_IN"),
    EN_JM("en_JM"),
    EN_MY("en_MY"),
    EN_NZ("en_NZ"),
    EN_QA("en_QA"),
    EN_SG("en_SG"),
    EN_UG("en_UG"),
    EN_ZA("en_ZA"),
    ET("et"),
    FIL("fil"),
    FI("fi"),
    FR("fr"),
    FR_BE("fr_BE"),
    FR_CA("fr_CA"),
    FR_CH("fr_CH"),
    FR_CI("fr_CI"),
    FR_MA("fr_MA"),
    KA("ka"),
    DE("de"),
    DE_AT("de_AT"),
    DE_CH("de_CH"),
    EL("el"),
    GU("gu"),
    HA("ha"),
    HE("he"),
    HI("hi"),
    HU("hu"),
    ID("id"),
    GA("ga"),
    IT("it"),
    JA("ja"),
    KN("kn"),
    KK("kk"),
    RW_RW("rw_RW"),
    KO("ko"),
    KY_KG("ky_KG"),
    LO("lo"),
    LV("lv"),
    LT("lt"),
    MK("mk"),
    MS("ms"),
    ML("ml"),
    MR("mr"),
    NB("nb"),
    FA("fa"),
    PL("pl"),
    PT_BR("pt_BR"),
    PT_PT("pt_PT"),
    PA("pa"),
    RO("ro"),
    RU("ru"),
    SR("sr"),
    SI_LK("si_LK"),
    SK("sk"),
    SL("sl"),
    ES("es"),
    ES_AR("es_AR"),
    ES_CL("es_CL"),
    ES_CO("es_CO"),
    ES_CR("es_CR"),
    ES_DO("es_DO"),
    ES_EC("es_EC"),
    ES_HN("es_HN"),
    ES_MX("es_MX"),
    ES_PA("es_PA"),
    ES_PE("es_PE"),
    ES_ES("es_ES"),
    ES_UY("es_UY"),
    SW("sw"),
    SV("sv"),
    TA("ta"),
    TE("te"),
    TH("th"),
    TR("tr"),
    UK("uk"),
    UR("ur"),
    UZ("uz"),
    VI("vi"),
    ZU("zu"),
    UNKNOWN("unknown");

    private final String value;

    WhatsAppLanguage(String value) {
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
    public static WhatsAppLanguage fromValue(String value) {
        for (WhatsAppLanguage enumElement : WhatsAppLanguage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
