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
 * Represents CallsDialogSayRequest model.
 */
public class CallsDialogSayRequest {

    private String text;

    private CallsLanguage language;

    private Double speechRate;

    private Integer loopCount;

    private CallsVoicePreferences preferences;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to read.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link CallsDialogSayRequest instance}.
     */
    public CallsDialogSayRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to read.
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
     * Text to read.
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
     * @return This {@link CallsDialogSayRequest instance}.
     */
    public CallsDialogSayRequest language(CallsLanguage language) {
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
     * Sets speechRate.
     * <p>
     * Field description:
     * Speech rate. Must be within &#x60;[0.5 - 2.0]&#x60; range, default value is &#x60;1&#x60;.
     *
     * @param speechRate
     * @return This {@link CallsDialogSayRequest instance}.
     */
    public CallsDialogSayRequest speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }

    /**
     * Returns speechRate.
     * <p>
     * Field description:
     * Speech rate. Must be within &#x60;[0.5 - 2.0]&#x60; range, default value is &#x60;1&#x60;.
     *
     * @return speechRate
     */
    @JsonProperty("speechRate")
    public Double getSpeechRate() {
        return speechRate;
    }

    /**
     * Sets speechRate.
     * <p>
     * Field description:
     * Speech rate. Must be within &#x60;[0.5 - 2.0]&#x60; range, default value is &#x60;1&#x60;.
     *
     * @param speechRate
     */
    @JsonProperty("speechRate")
    public void setSpeechRate(Double speechRate) {
        this.speechRate = speechRate;
    }

    /**
     * Sets loopCount.
     * <p>
     * Field description:
     * Number of times to read the text.
     *
     * @param loopCount
     * @return This {@link CallsDialogSayRequest instance}.
     */
    public CallsDialogSayRequest loopCount(Integer loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    /**
     * Returns loopCount.
     * <p>
     * Field description:
     * Number of times to read the text.
     *
     * @return loopCount
     */
    @JsonProperty("loopCount")
    public Integer getLoopCount() {
        return loopCount;
    }

    /**
     * Sets loopCount.
     * <p>
     * Field description:
     * Number of times to read the text.
     *
     * @param loopCount
     */
    @JsonProperty("loopCount")
    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
    }

    /**
     * Sets preferences.
     *
     * @param preferences
     * @return This {@link CallsDialogSayRequest instance}.
     */
    public CallsDialogSayRequest preferences(CallsVoicePreferences preferences) {
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
        CallsDialogSayRequest callsDialogSayRequest = (CallsDialogSayRequest) o;
        return Objects.equals(this.text, callsDialogSayRequest.text)
                && Objects.equals(this.language, callsDialogSayRequest.language)
                && Objects.equals(this.speechRate, callsDialogSayRequest.speechRate)
                && Objects.equals(this.loopCount, callsDialogSayRequest.loopCount)
                && Objects.equals(this.preferences, callsDialogSayRequest.preferences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, language, speechRate, loopCount, preferences);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogSayRequest {")
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
                .append("    loopCount: ")
                .append(toIndentedString(loopCount))
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
