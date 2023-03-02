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
 * Represents SmsLanguage model.
 */
public class SmsLanguage {

    private String languageCode;

    /**
     * Sets languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set. Possible values: &#x60;TR&#x60; for Turkish, &#x60;ES&#x60; for Spanish, &#x60;PT&#x60; for Portuguese, or &#x60;AUTODETECT&#x60; to let platform select the character set based on message content.
     *
     * @param languageCode
     * @return This {@link SmsLanguage instance}.
     */
    public SmsLanguage languageCode(String languageCode) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsLanguage smsLanguage = (SmsLanguage) o;
        return Objects.equals(this.languageCode, smsLanguage.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsLanguage {")
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
