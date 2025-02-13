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
 * Represents CallTranscriptionLanguage enumeration.
 */
public enum CallTranscriptionLanguage {
    AF_ZA("af-ZA"),
    SQ_AL("sq-AL"),
    AM_ET("am-ET"),
    AR_KW("ar-KW"),
    AR_AE("ar-AE"),
    AR_BH("ar-BH"),
    AR_DZ("ar-DZ"),
    AR_EG("ar-EG"),
    AR_IL("ar-IL"),
    AR_IQ("ar-IQ"),
    AR_JO("ar-JO"),
    AR_LB("ar-LB"),
    AR_LY("ar-LY"),
    AR_MA("ar-MA"),
    AR_OM("ar-OM"),
    AR_PS("ar-PS"),
    AR_QA("ar-QA"),
    AR_SA("ar-SA"),
    AR_SY("ar-SY"),
    AR_TN("ar-TN"),
    AR_YE("ar-YE"),
    HY_AM("hy-AM"),
    AZ_AZ("az-AZ"),
    EU_ES("eu-ES"),
    BN_IN("bn-IN"),
    BN_BD("bn-BD"),
    BS_BA("bs-BA"),
    BG_BG("bg-BG"),
    MY_MM("my-MM"),
    CA_ES("ca-ES"),
    ZH_CN("zh-CN"),
    ZH_HK("zh-HK"),
    ZH_TW("zh-TW"),
    HR_HR("hr-HR"),
    CS_CZ("cs-CZ"),
    DA_DK("da-DK"),
    NL_NL("nl-NL"),
    NL_BE("nl-BE"),
    EN_AU("en-AU"),
    EN_CA("en-CA"),
    EN_GB("en-GB"),
    EN_GH("en-GH"),
    EN_HK("en-HK"),
    EN_IE("en-IE"),
    EN_IN("en-IN"),
    EN_KE("en-KE"),
    EN_NG("en-NG"),
    EN_NZ("en-NZ"),
    EN_PH("en-PH"),
    EN_PK("en-PK"),
    EN_SG("en-SG"),
    EN_TZ("en-TZ"),
    EN_US("en-US"),
    EN_ZA("en-ZA"),
    ET_EE("et-EE"),
    FIL_PH("fil-PH"),
    FI_FI("fi-FI"),
    FR_BE("fr-BE"),
    FR_CA("fr-CA"),
    FR_CH("fr-CH"),
    FR_FR("fr-FR"),
    GL_ES("gl-ES"),
    KA_GE("ka-GE"),
    DE_AT("de-AT"),
    DE_CH("de-CH"),
    DE_DE("de-DE"),
    EL_GR("el-GR"),
    GU_IN("gu-IN"),
    HE_IL("he-IL"),
    HI_IN("hi-IN"),
    HU_HU("hu-HU"),
    IS_IS("is-IS"),
    ID_ID("id-ID"),
    GA_IE("ga-IE"),
    IT_CH("it-CH"),
    IT_IT("it-IT"),
    JA_JP("ja-JP"),
    JV_ID("jv-ID"),
    KN_IN("kn-IN"),
    KK_KZ("kk-KZ"),
    KM_KH("km-KH"),
    KO_KR("ko-KR"),
    LO_LA("lo-LA"),
    LV_LV("lv-LV"),
    LT_LT("lt-LT"),
    MK_MK("mk-MK"),
    MS_MY("ms-MY"),
    ML_IN("ml-IN"),
    MT_MT("mt-MT"),
    MR_IN("mr-IN"),
    MN_MN("mn-MN"),
    NE_NP("ne-NP"),
    NO_NO("no-NO"),
    FA_IR("fa-IR"),
    PL_PL("pl-PL"),
    PT_PT("pt-PT"),
    PT_BR("pt-BR"),
    PA_GURU_IN("pa-Guru-IN"),
    RO_RO("ro-RO"),
    RU_RU("ru-RU"),
    SR_RS("sr-RS"),
    SI_LK("si-LK"),
    SK_SK("sk-SK"),
    SL_SI("sl-SI"),
    ES_BO("es-BO"),
    ES_AR("es-AR"),
    ES_CL("es-CL"),
    ES_CO("es-CO"),
    ES_CR("es-CR"),
    ES_CU("es-CU"),
    ES_DO("es-DO"),
    ES_EC("es-EC"),
    ES_ES("es-ES"),
    ES_GQ("es-GQ"),
    ES_GT("es-GT"),
    ES_HN("es-HN"),
    ES_MX("es-MX"),
    ES_NI("es-NI"),
    ES_PA("es-PA"),
    ES_PE("es-PE"),
    ES_PR("es-PR"),
    ES_PY("es-PY"),
    ES_SV("es-SV"),
    ES_US("es-US"),
    ES_UY("es-UY"),
    ES_VE("es-VE"),
    SU_ID("su-ID"),
    SW_TZ("sw-TZ"),
    SW_KE("sw-KE"),
    SV_SE("sv-SE"),
    TA_IN("ta-IN"),
    TA_LK("ta-LK"),
    TA_MY("ta-MY"),
    TA_SG("ta-SG"),
    TE_IN("te-IN"),
    TH_TH("th-TH"),
    TR_TR("tr-TR"),
    UK_UA("uk-UA"),
    UR_IN("ur-IN"),
    UR_PK("ur-PK"),
    UZ_UZ("uz-UZ"),
    VI_VN("vi-VN"),
    ZU_ZA("zu-ZA");

    private final String value;

    CallTranscriptionLanguage(String value) {
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
    public static CallTranscriptionLanguage fromValue(String value) {
        for (CallTranscriptionLanguage enumElement : CallTranscriptionLanguage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
