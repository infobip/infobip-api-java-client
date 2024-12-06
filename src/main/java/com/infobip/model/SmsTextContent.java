/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents SmsTextContent model.
 */
public class SmsTextContent implements SmsMessageContent {

    private String text;

    private SmsTransliterationCode transliteration;

    private SmsLanguage language;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link SmsTextContent instance}.
     */
    public SmsTextContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent.
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
     * Field description:
     * Content of the message being sent.
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
     * Sets transliteration.
     *
     * @param transliteration
     * @return This {@link SmsTextContent instance}.
     */
    public SmsTextContent transliteration(SmsTransliterationCode transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    /**
     * Returns transliteration.
     *
     * @return transliteration
     */
    @JsonProperty("transliteration")
    public SmsTransliterationCode getTransliteration() {
        return transliteration;
    }

    /**
     * Sets transliteration.
     *
     * @param transliteration
     */
    @JsonProperty("transliteration")
    public void setTransliteration(SmsTransliterationCode transliteration) {
        this.transliteration = transliteration;
    }

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link SmsTextContent instance}.
     */
    public SmsTextContent language(SmsLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     *
     * @return language
     */
    @JsonProperty("language")
    public SmsLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(SmsLanguage language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsTextContent smsTextContent = (SmsTextContent) o;
        return Objects.equals(this.text, smsTextContent.text)
                && Objects.equals(this.transliteration, smsTextContent.transliteration)
                && Objects.equals(this.language, smsTextContent.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, transliteration, language);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsTextContent {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    transliteration: ")
                .append(toIndentedString(transliteration))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
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
