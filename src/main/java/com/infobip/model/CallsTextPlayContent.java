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
 * Represents CallsTextPlayContent model.
 */
public class CallsTextPlayContent extends CallsPlayContent {

    private String text;

    private CallsLanguage language;

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
     * Field description:
     * Text to read. Use the Speech Synthesis Markup Language (SSML) in a request to fine-tune your output.
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
     * Field description:
     * Text to read. Use the Speech Synthesis Markup Language (SSML) in a request to fine-tune your output.
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
     * Text to read. Use the Speech Synthesis Markup Language (SSML) in a request to fine-tune your output.
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
    public CallsTextPlayContent language(CallsLanguage language) {
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
     * @return This {@link CallsTextPlayContent instance}.
     */
    public CallsTextPlayContent speechRate(Double speechRate) {
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
