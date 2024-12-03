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
 * Represents CallsSayOptions model.
 */
public class CallsSayOptions {

    private String language;

    private CallsVoiceOptions voice;

    private Double speechRate;

    /**
     * Sets language.
     * <p>
     * Field description:
     * Must be defined for correct pronunciation.
     *
     * @param language
     * @return This {@link CallsSayOptions instance}.
     */
    public CallsSayOptions language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * Must be defined for correct pronunciation.
     *
     * @return language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * Must be defined for correct pronunciation.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Sets voice.
     *
     * @param voice
     * @return This {@link CallsSayOptions instance}.
     */
    public CallsSayOptions voice(CallsVoiceOptions voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Returns voice.
     *
     * @return voice
     */
    @JsonProperty("voice")
    public CallsVoiceOptions getVoice() {
        return voice;
    }

    /**
     * Sets voice.
     *
     * @param voice
     */
    @JsonProperty("voice")
    public void setVoice(CallsVoiceOptions voice) {
        this.voice = voice;
    }

    /**
     * Sets speechRate.
     * <p>
     * Field description:
     * Must be within [0.5 - 2.0] range, default value is 1.
     *
     * @param speechRate
     * @return This {@link CallsSayOptions instance}.
     */
    public CallsSayOptions speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }

    /**
     * Returns speechRate.
     * <p>
     * Field description:
     * Must be within [0.5 - 2.0] range, default value is 1.
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
     * Must be within [0.5 - 2.0] range, default value is 1.
     *
     * @param speechRate
     */
    @JsonProperty("speechRate")
    public void setSpeechRate(Double speechRate) {
        this.speechRate = speechRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSayOptions callsSayOptions = (CallsSayOptions) o;
        return Objects.equals(this.language, callsSayOptions.language)
                && Objects.equals(this.voice, callsSayOptions.voice)
                && Objects.equals(this.speechRate, callsSayOptions.speechRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, voice, speechRate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSayOptions {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    voice: ")
                .append(toIndentedString(voice))
                .append(newLine)
                .append("    speechRate: ")
                .append(toIndentedString(speechRate))
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
