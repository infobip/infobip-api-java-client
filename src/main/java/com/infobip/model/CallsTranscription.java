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
 * Represents CallsTranscription model.
 */
public class CallsTranscription {

    private CallsLanguage language;

    private Boolean sendInterimResults;

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link CallsTranscription instance}.
     */
    public CallsTranscription language(CallsLanguage language) {
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
    public CallsLanguage getLanguage() {
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
    public void setLanguage(CallsLanguage language) {
        this.language = language;
    }

    /**
     * Sets sendInterimResults.
     * <p>
     * Field description:
     * Flag indicating whether interim transcription results should be sent.
     *
     * @param sendInterimResults
     * @return This {@link CallsTranscription instance}.
     */
    public CallsTranscription sendInterimResults(Boolean sendInterimResults) {
        this.sendInterimResults = sendInterimResults;
        return this;
    }

    /**
     * Returns sendInterimResults.
     * <p>
     * Field description:
     * Flag indicating whether interim transcription results should be sent.
     *
     * @return sendInterimResults
     */
    @JsonProperty("sendInterimResults")
    public Boolean getSendInterimResults() {
        return sendInterimResults;
    }

    /**
     * Sets sendInterimResults.
     * <p>
     * Field description:
     * Flag indicating whether interim transcription results should be sent.
     *
     * @param sendInterimResults
     */
    @JsonProperty("sendInterimResults")
    public void setSendInterimResults(Boolean sendInterimResults) {
        this.sendInterimResults = sendInterimResults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsTranscription callsTranscription = (CallsTranscription) o;
        return Objects.equals(this.language, callsTranscription.language)
                && Objects.equals(this.sendInterimResults, callsTranscription.sendInterimResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, sendInterimResults);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsTranscription {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    sendInterimResults: ")
                .append(toIndentedString(sendInterimResults))
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
