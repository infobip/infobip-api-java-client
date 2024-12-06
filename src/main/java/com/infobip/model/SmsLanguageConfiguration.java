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
 * Sets up additional configuration that changes the original message content you can preview with this call.
 */
public class SmsLanguageConfiguration {

    private SmsPreviewLanguage language;

    private String transliteration;

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link SmsLanguageConfiguration instance}.
     */
    public SmsLanguageConfiguration language(SmsPreviewLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     *
     * @return language
     */
    @JsonProperty("language")
    public SmsPreviewLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(SmsPreviewLanguage language) {
        this.language = language;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * Conversion of a message text from one script to another. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60; and &#x60;NON_UNICODE&#x60;.
     *
     * @param transliteration
     * @return This {@link SmsLanguageConfiguration instance}.
     */
    public SmsLanguageConfiguration transliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    /**
     * Returns transliteration.
     * <p>
     * Field description:
     * Conversion of a message text from one script to another. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60; and &#x60;NON_UNICODE&#x60;.
     *
     * @return transliteration
     */
    @JsonProperty("transliteration")
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * Conversion of a message text from one script to another. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60; and &#x60;NON_UNICODE&#x60;.
     *
     * @param transliteration
     */
    @JsonProperty("transliteration")
    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsLanguageConfiguration smsLanguageConfiguration = (SmsLanguageConfiguration) o;
        return Objects.equals(this.language, smsLanguageConfiguration.language)
                && Objects.equals(this.transliteration, smsLanguageConfiguration.transliteration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, transliteration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsLanguageConfiguration {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    transliteration: ")
                .append(toIndentedString(transliteration))
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
