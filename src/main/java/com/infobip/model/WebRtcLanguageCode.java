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
 * Language code of the language you want to use.
 */
public enum WebRtcLanguageCode {
    AR_AE("ar-AE"),
    DE_DE("de-DE"),
    EN_US("en-US"),
    ES_LA("es-LA"),
    FR_FR("fr-FR"),
    IT_IT("it-IT"),
    JA_JP("ja-JP"),
    KO_KR("ko-KR"),
    PT_BR("pt-BR"),
    RU_RU("ru-RU"),
    SV_SE("sv-SE"),
    TR_TR("tr-TR"),
    ZH_HANS("zh-Hans"),
    ZH_TW("zh-TW");

    private final String value;

    WebRtcLanguageCode(String value) {
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
    public static WebRtcLanguageCode fromValue(String value) {
        for (WebRtcLanguageCode enumElement : WebRtcLanguageCode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
