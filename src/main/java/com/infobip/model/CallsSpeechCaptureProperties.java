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
 * Represents CallsSpeechCaptureProperties model.
 */
public class CallsSpeechCaptureProperties {

    private String fullText;

    private String matchedKeyPhrase;

    private Double confidence;

    private CallsTerminationReason terminationReason;

    /**
     * Sets fullText.
     *
     * @param fullText
     * @return This {@link CallsSpeechCaptureProperties instance}.
     */
    public CallsSpeechCaptureProperties fullText(String fullText) {
        this.fullText = fullText;
        return this;
    }

    /**
     * Returns fullText.
     *
     * @return fullText
     */
    @JsonProperty("fullText")
    public String getFullText() {
        return fullText;
    }

    /**
     * Sets fullText.
     *
     * @param fullText
     */
    @JsonProperty("fullText")
    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    /**
     * Sets matchedKeyPhrase.
     *
     * @param matchedKeyPhrase
     * @return This {@link CallsSpeechCaptureProperties instance}.
     */
    public CallsSpeechCaptureProperties matchedKeyPhrase(String matchedKeyPhrase) {
        this.matchedKeyPhrase = matchedKeyPhrase;
        return this;
    }

    /**
     * Returns matchedKeyPhrase.
     *
     * @return matchedKeyPhrase
     */
    @JsonProperty("matchedKeyPhrase")
    public String getMatchedKeyPhrase() {
        return matchedKeyPhrase;
    }

    /**
     * Sets matchedKeyPhrase.
     *
     * @param matchedKeyPhrase
     */
    @JsonProperty("matchedKeyPhrase")
    public void setMatchedKeyPhrase(String matchedKeyPhrase) {
        this.matchedKeyPhrase = matchedKeyPhrase;
    }

    /**
     * Sets confidence.
     *
     * @param confidence
     * @return This {@link CallsSpeechCaptureProperties instance}.
     */
    public CallsSpeechCaptureProperties confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Returns confidence.
     *
     * @return confidence
     */
    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    /**
     * Sets confidence.
     *
     * @param confidence
     */
    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * Sets terminationReason.
     *
     * @param terminationReason
     * @return This {@link CallsSpeechCaptureProperties instance}.
     */
    public CallsSpeechCaptureProperties terminationReason(CallsTerminationReason terminationReason) {
        this.terminationReason = terminationReason;
        return this;
    }

    /**
     * Returns terminationReason.
     *
     * @return terminationReason
     */
    @JsonProperty("terminationReason")
    public CallsTerminationReason getTerminationReason() {
        return terminationReason;
    }

    /**
     * Sets terminationReason.
     *
     * @param terminationReason
     */
    @JsonProperty("terminationReason")
    public void setTerminationReason(CallsTerminationReason terminationReason) {
        this.terminationReason = terminationReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSpeechCaptureProperties callsSpeechCaptureProperties = (CallsSpeechCaptureProperties) o;
        return Objects.equals(this.fullText, callsSpeechCaptureProperties.fullText)
                && Objects.equals(this.matchedKeyPhrase, callsSpeechCaptureProperties.matchedKeyPhrase)
                && Objects.equals(this.confidence, callsSpeechCaptureProperties.confidence)
                && Objects.equals(this.terminationReason, callsSpeechCaptureProperties.terminationReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullText, matchedKeyPhrase, confidence, terminationReason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSpeechCaptureProperties {")
                .append(newLine)
                .append("    fullText: ")
                .append(toIndentedString(fullText))
                .append(newLine)
                .append("    matchedKeyPhrase: ")
                .append(toIndentedString(matchedKeyPhrase))
                .append(newLine)
                .append("    confidence: ")
                .append(toIndentedString(confidence))
                .append(newLine)
                .append("    terminationReason: ")
                .append(toIndentedString(terminationReason))
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
