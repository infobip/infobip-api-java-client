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
 * Represents CallsSpeechOptions model.
 */
public class CallsSpeechOptions {

    private String language;

    private List<String> keyPhrases = null;

    private Integer maxSilence;

    /**
     * Sets language.
     * <p>
     * Field description:
     * Language used in speech that needs to be captured. For full list of supported languages see [LINK](https://www.infobip.com/docs/voice-and-video/interactive-voice-response-ivr#speech-recognition-supported-languages-ivr-over-api).
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link CallsSpeechOptions instance}.
     */
    public CallsSpeechOptions language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * Language used in speech that needs to be captured. For full list of supported languages see [LINK](https://www.infobip.com/docs/voice-and-video/interactive-voice-response-ivr#speech-recognition-supported-languages-ivr-over-api).
     * <p>
     * The field is required.
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
     * Language used in speech that needs to be captured. For full list of supported languages see [LINK](https://www.infobip.com/docs/voice-and-video/interactive-voice-response-ivr#speech-recognition-supported-languages-ivr-over-api).
     * <p>
     * The field is required.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Sets keyPhrases.
     * <p>
     * Field description:
     * Array of keyphrases used for matching capturing speech. If full captured text contains one of the specified phrases, that phrase will be set in variable specified in capture parameter. If keyphrases are not set or no matching is done, variable will be set to empty string. Every keyphrase can contain up to 5 words and number of keyphrases is not limited.
     *
     * @param keyPhrases
     * @return This {@link CallsSpeechOptions instance}.
     */
    public CallsSpeechOptions keyPhrases(List<String> keyPhrases) {
        this.keyPhrases = keyPhrases;
        return this;
    }

    /**
     * Adds and item into keyPhrases.
     * <p>
     * Field description:
     * Array of keyphrases used for matching capturing speech. If full captured text contains one of the specified phrases, that phrase will be set in variable specified in capture parameter. If keyphrases are not set or no matching is done, variable will be set to empty string. Every keyphrase can contain up to 5 words and number of keyphrases is not limited.
     *
     * @param keyPhrasesItem The item to be added to the list.
     * @return This {@link CallsSpeechOptions instance}.
     */
    public CallsSpeechOptions addKeyPhrasesItem(String keyPhrasesItem) {
        if (this.keyPhrases == null) {
            this.keyPhrases = new ArrayList<>();
        }
        this.keyPhrases.add(keyPhrasesItem);
        return this;
    }

    /**
     * Returns keyPhrases.
     * <p>
     * Field description:
     * Array of keyphrases used for matching capturing speech. If full captured text contains one of the specified phrases, that phrase will be set in variable specified in capture parameter. If keyphrases are not set or no matching is done, variable will be set to empty string. Every keyphrase can contain up to 5 words and number of keyphrases is not limited.
     *
     * @return keyPhrases
     */
    @JsonProperty("keyPhrases")
    public List<String> getKeyPhrases() {
        return keyPhrases;
    }

    /**
     * Sets keyPhrases.
     * <p>
     * Field description:
     * Array of keyphrases used for matching capturing speech. If full captured text contains one of the specified phrases, that phrase will be set in variable specified in capture parameter. If keyphrases are not set or no matching is done, variable will be set to empty string. Every keyphrase can contain up to 5 words and number of keyphrases is not limited.
     *
     * @param keyPhrases
     */
    @JsonProperty("keyPhrases")
    public void setKeyPhrases(List<String> keyPhrases) {
        this.keyPhrases = keyPhrases;
    }

    /**
     * Sets maxSilence.
     * <p>
     * Field description:
     * If used, this parameter defines the number of seconds of silence that will stop capturing. For example value of 3 defines that capturing stops as soon as 3 seconds of silence is detected or when timeout expires, whichever happens first. Minimum value is 1 and maximum value is 5.
     *
     * @param maxSilence
     * @return This {@link CallsSpeechOptions instance}.
     */
    public CallsSpeechOptions maxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
        return this;
    }

    /**
     * Returns maxSilence.
     * <p>
     * Field description:
     * If used, this parameter defines the number of seconds of silence that will stop capturing. For example value of 3 defines that capturing stops as soon as 3 seconds of silence is detected or when timeout expires, whichever happens first. Minimum value is 1 and maximum value is 5.
     *
     * @return maxSilence
     */
    @JsonProperty("maxSilence")
    public Integer getMaxSilence() {
        return maxSilence;
    }

    /**
     * Sets maxSilence.
     * <p>
     * Field description:
     * If used, this parameter defines the number of seconds of silence that will stop capturing. For example value of 3 defines that capturing stops as soon as 3 seconds of silence is detected or when timeout expires, whichever happens first. Minimum value is 1 and maximum value is 5.
     *
     * @param maxSilence
     */
    @JsonProperty("maxSilence")
    public void setMaxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSpeechOptions callsSpeechOptions = (CallsSpeechOptions) o;
        return Objects.equals(this.language, callsSpeechOptions.language)
                && Objects.equals(this.keyPhrases, callsSpeechOptions.keyPhrases)
                && Objects.equals(this.maxSilence, callsSpeechOptions.maxSilence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, keyPhrases, maxSilence);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSpeechOptions {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    keyPhrases: ")
                .append(toIndentedString(keyPhrases))
                .append(newLine)
                .append("    maxSilence: ")
                .append(toIndentedString(maxSilence))
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
