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
 * Represents SmsPreviewLanguage model.
 */
public class SmsPreviewLanguage {

    private String languageCode;

    /**
     * Sets languageCode.
     * <p>
     * Field description:
     * [Language code](https://www.infobip.com/docs/sms/language#national-language-identifier) for the correct character set. &#x60;AUTODETECT&#x60; lets the platform select the character set based on message content only for supported languages.
     *
     * @param languageCode
     * @return This {@link SmsPreviewLanguage instance}.
     */
    public SmsPreviewLanguage languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Returns languageCode.
     * <p>
     * Field description:
     * [Language code](https://www.infobip.com/docs/sms/language#national-language-identifier) for the correct character set. &#x60;AUTODETECT&#x60; lets the platform select the character set based on message content only for supported languages.
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
     * [Language code](https://www.infobip.com/docs/sms/language#national-language-identifier) for the correct character set. &#x60;AUTODETECT&#x60; lets the platform select the character set based on message content only for supported languages.
     *
     * @param languageCode
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsPreviewLanguage smsPreviewLanguage = (SmsPreviewLanguage) o;
        return Objects.equals(this.languageCode, smsPreviewLanguage.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsPreviewLanguage {")
                .append(newLine)
                .append("    languageCode: ")
                .append(toIndentedString(languageCode))
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
