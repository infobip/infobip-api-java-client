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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents CallsTextPlayContent model.
 */
public class CallsTextPlayContent extends CallsPlayContent {

    private String text;

    /**
     * Represents language enumeration.
     */
    public enum LanguageEnum {
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
        WLS("wls");

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            for (LanguageEnum enumElement : LanguageEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private LanguageEnum language;

    private Double speechRate;

    private CallsVoicePreferences preferences;

    /**
     * Constructs a new {@link CallsTextPlayContent} instance.
     */
    public CallsTextPlayContent() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link CallsTextPlayContent instance}.
     */
    public CallsTextPlayContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link CallsTextPlayContent instance}.
     */
    public CallsTextPlayContent language(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * The field is required.
     *
     * @return language
     */
    @JsonProperty("language")
    public LanguageEnum getLanguage() {
        return language;
    }

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    /**
     * Sets speechRate.
     *
     * @param speechRate
     * @return This {@link CallsTextPlayContent instance}.
     */
    public CallsTextPlayContent speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }

    /**
     * Returns speechRate.
     *
     * @return speechRate
     */
    @JsonProperty("speechRate")
    public Double getSpeechRate() {
        return speechRate;
    }

    /**
     * Sets speechRate.
     *
     * @param speechRate
     */
    @JsonProperty("speechRate")
    public void setSpeechRate(Double speechRate) {
        this.speechRate = speechRate;
    }

    /**
     * Sets preferences.
     *
     * @param preferences
     * @return This {@link CallsTextPlayContent instance}.
     */
    public CallsTextPlayContent preferences(CallsVoicePreferences preferences) {
        this.preferences = preferences;
        return this;
    }

    /**
     * Returns preferences.
     *
     * @return preferences
     */
    @JsonProperty("preferences")
    public CallsVoicePreferences getPreferences() {
        return preferences;
    }

    /**
     * Sets preferences.
     *
     * @param preferences
     */
    @JsonProperty("preferences")
    public void setPreferences(CallsVoicePreferences preferences) {
        this.preferences = preferences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsTextPlayContent callsTextPlayContent = (CallsTextPlayContent) o;
        return Objects.equals(this.text, callsTextPlayContent.text)
                && Objects.equals(this.language, callsTextPlayContent.language)
                && Objects.equals(this.speechRate, callsTextPlayContent.speechRate)
                && Objects.equals(this.preferences, callsTextPlayContent.preferences)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, language, speechRate, preferences, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsTextPlayContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    speechRate: ")
                .append(toIndentedString(speechRate))
                .append(newLine)
                .append("    preferences: ")
                .append(toIndentedString(preferences))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
