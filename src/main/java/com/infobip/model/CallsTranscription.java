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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallsTranscription model.
 */
public class CallsTranscription {

    private CallTranscriptionLanguage language;

    private Boolean sendInterimResults;

    private List<String> customDictionary = null;

    private Boolean advancedFormatting;

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link CallsTranscription instance}.
     */
    public CallsTranscription language(CallTranscriptionLanguage language) {
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
    public CallTranscriptionLanguage getLanguage() {
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
    public void setLanguage(CallTranscriptionLanguage language) {
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

    /**
     * Sets customDictionary.
     * <p>
     * Field description:
     * Array of custom words used for more accurate transcription.
     *
     * @param customDictionary
     * @return This {@link CallsTranscription instance}.
     */
    public CallsTranscription customDictionary(List<String> customDictionary) {
        this.customDictionary = customDictionary;
        return this;
    }

    /**
     * Adds and item into customDictionary.
     * <p>
     * Field description:
     * Array of custom words used for more accurate transcription.
     *
     * @param customDictionaryItem The item to be added to the list.
     * @return This {@link CallsTranscription instance}.
     */
    public CallsTranscription addCustomDictionaryItem(String customDictionaryItem) {
        if (this.customDictionary == null) {
            this.customDictionary = new ArrayList<>();
        }
        this.customDictionary.add(customDictionaryItem);
        return this;
    }

    /**
     * Returns customDictionary.
     * <p>
     * Field description:
     * Array of custom words used for more accurate transcription.
     *
     * @return customDictionary
     */
    @JsonProperty("customDictionary")
    public List<String> getCustomDictionary() {
        return customDictionary;
    }

    /**
     * Sets customDictionary.
     * <p>
     * Field description:
     * Array of custom words used for more accurate transcription.
     *
     * @param customDictionary
     */
    @JsonProperty("customDictionary")
    public void setCustomDictionary(List<String> customDictionary) {
        this.customDictionary = customDictionary;
    }

    /**
     * Sets advancedFormatting.
     * <p>
     * Field description:
     * Toggles enhanced text formatting features like punctuation, proper casing, numeral normalization, and disfluency filtering. Defaults to &#x60;false&#x60;.
     *
     * @param advancedFormatting
     * @return This {@link CallsTranscription instance}.
     */
    public CallsTranscription advancedFormatting(Boolean advancedFormatting) {
        this.advancedFormatting = advancedFormatting;
        return this;
    }

    /**
     * Returns advancedFormatting.
     * <p>
     * Field description:
     * Toggles enhanced text formatting features like punctuation, proper casing, numeral normalization, and disfluency filtering. Defaults to &#x60;false&#x60;.
     *
     * @return advancedFormatting
     */
    @JsonProperty("advancedFormatting")
    public Boolean getAdvancedFormatting() {
        return advancedFormatting;
    }

    /**
     * Sets advancedFormatting.
     * <p>
     * Field description:
     * Toggles enhanced text formatting features like punctuation, proper casing, numeral normalization, and disfluency filtering. Defaults to &#x60;false&#x60;.
     *
     * @param advancedFormatting
     */
    @JsonProperty("advancedFormatting")
    public void setAdvancedFormatting(Boolean advancedFormatting) {
        this.advancedFormatting = advancedFormatting;
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
                && Objects.equals(this.sendInterimResults, callsTranscription.sendInterimResults)
                && Objects.equals(this.customDictionary, callsTranscription.customDictionary)
                && Objects.equals(this.advancedFormatting, callsTranscription.advancedFormatting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, sendInterimResults, customDictionary, advancedFormatting);
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
                .append("    customDictionary: ")
                .append(toIndentedString(customDictionary))
                .append(newLine)
                .append("    advancedFormatting: ")
                .append(toIndentedString(advancedFormatting))
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
