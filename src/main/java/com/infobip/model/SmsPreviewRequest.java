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
 * Represents SmsPreviewRequest model.
 */
public class SmsPreviewRequest {

    private String text;

    private String languageCode;

    private String transliteration;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link SmsPreviewRequest instance}.
     */
    public SmsPreviewRequest text(String text) {
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
     * Sets languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set. Possible values: &#x60;TR&#x60; for Turkish, &#x60;ES&#x60; for Spanish, &#x60;PT&#x60; for Portuguese, or &#x60;AUTODETECT&#x60; to let platform select the character set based on message content.
     *
     * @param languageCode
     * @return This {@link SmsPreviewRequest instance}.
     */
    public SmsPreviewRequest languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Returns languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set. Possible values: &#x60;TR&#x60; for Turkish, &#x60;ES&#x60; for Spanish, &#x60;PT&#x60; for Portuguese, or &#x60;AUTODETECT&#x60; to let platform select the character set based on message content.
     *
     * @return languageCode
     */
    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set. Possible values: &#x60;TR&#x60; for Turkish, &#x60;ES&#x60; for Spanish, &#x60;PT&#x60; for Portuguese, or &#x60;AUTODETECT&#x60; to let platform select the character set based on message content.
     *
     * @param languageCode
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, &#x60;NON_UNICDE&#x60;, &#x60;ALL&#x60; and &#x60;NONE&#x60;.
     *
     * @param transliteration
     * @return This {@link SmsPreviewRequest instance}.
     */
    public SmsPreviewRequest transliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    /**
     * Returns transliteration.
     * <p>
     * Field description:
     * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, &#x60;NON_UNICDE&#x60;, &#x60;ALL&#x60; and &#x60;NONE&#x60;.
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
     * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, &#x60;NON_UNICDE&#x60;, &#x60;ALL&#x60; and &#x60;NONE&#x60;.
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
        SmsPreviewRequest smsPreviewRequest = (SmsPreviewRequest) o;
        return Objects.equals(this.text, smsPreviewRequest.text)
                && Objects.equals(this.languageCode, smsPreviewRequest.languageCode)
                && Objects.equals(this.transliteration, smsPreviewRequest.transliteration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, languageCode, transliteration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsPreviewRequest {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    languageCode: ")
                .append(toIndentedString(languageCode))
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
