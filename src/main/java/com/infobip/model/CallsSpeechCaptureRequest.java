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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents CallsSpeechCaptureRequest model.
 */
public class CallsSpeechCaptureRequest {

    private CallTranscriptionLanguage language;

    private Integer timeout;

    private Integer maxSilence;

    private Set<String> keyPhrases = new LinkedHashSet<>();

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link CallsSpeechCaptureRequest instance}.
     */
    public CallsSpeechCaptureRequest language(CallTranscriptionLanguage language) {
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
     * Sets timeout.
     * <p>
     * Field description:
     * The maximum duration of speech capture.
     * <p>
     * The field is required.
     *
     * @param timeout
     * @return This {@link CallsSpeechCaptureRequest instance}.
     */
    public CallsSpeechCaptureRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * The maximum duration of speech capture.
     * <p>
     * The field is required.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The maximum duration of speech capture.
     * <p>
     * The field is required.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets maxSilence.
     * <p>
     * Field description:
     * The silence duration before terminating the speech capture after speech has been detected.
     *
     * @param maxSilence
     * @return This {@link CallsSpeechCaptureRequest instance}.
     */
    public CallsSpeechCaptureRequest maxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
        return this;
    }

    /**
     * Returns maxSilence.
     * <p>
     * Field description:
     * The silence duration before terminating the speech capture after speech has been detected.
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
     * The silence duration before terminating the speech capture after speech has been detected.
     *
     * @param maxSilence
     */
    @JsonProperty("maxSilence")
    public void setMaxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
    }

    /**
     * Sets keyPhrases.
     * <p>
     * Field description:
     * Array of key-phrases used for matching capturing speech.
     * <p>
     * The field is required.
     *
     * @param keyPhrases
     * @return This {@link CallsSpeechCaptureRequest instance}.
     */
    public CallsSpeechCaptureRequest keyPhrases(Set<String> keyPhrases) {
        this.keyPhrases = keyPhrases;
        return this;
    }

    /**
     * Adds and item into keyPhrases.
     * <p>
     * Field description:
     * Array of key-phrases used for matching capturing speech.
     * <p>
     * The field is required.
     *
     * @param keyPhrasesItem The item to be added to the list.
     * @return This {@link CallsSpeechCaptureRequest instance}.
     */
    public CallsSpeechCaptureRequest addKeyPhrasesItem(String keyPhrasesItem) {
        if (this.keyPhrases == null) {
            this.keyPhrases = new LinkedHashSet<>();
        }
        this.keyPhrases.add(keyPhrasesItem);
        return this;
    }

    /**
     * Returns keyPhrases.
     * <p>
     * Field description:
     * Array of key-phrases used for matching capturing speech.
     * <p>
     * The field is required.
     *
     * @return keyPhrases
     */
    @JsonProperty("keyPhrases")
    public Set<String> getKeyPhrases() {
        return keyPhrases;
    }

    /**
     * Sets keyPhrases.
     * <p>
     * Field description:
     * Array of key-phrases used for matching capturing speech.
     * <p>
     * The field is required.
     *
     * @param keyPhrases
     */
    @JsonProperty("keyPhrases")
    public void setKeyPhrases(Set<String> keyPhrases) {
        this.keyPhrases = keyPhrases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSpeechCaptureRequest callsSpeechCaptureRequest = (CallsSpeechCaptureRequest) o;
        return Objects.equals(this.language, callsSpeechCaptureRequest.language)
                && Objects.equals(this.timeout, callsSpeechCaptureRequest.timeout)
                && Objects.equals(this.maxSilence, callsSpeechCaptureRequest.maxSilence)
                && Objects.equals(this.keyPhrases, callsSpeechCaptureRequest.keyPhrases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, timeout, maxSilence, keyPhrases);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSpeechCaptureRequest {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    maxSilence: ")
                .append(toIndentedString(maxSilence))
                .append(newLine)
                .append("    keyPhrases: ")
                .append(toIndentedString(keyPhrases))
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
