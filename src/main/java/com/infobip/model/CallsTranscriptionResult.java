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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents CallsTranscriptionResult model.
 */
public class CallsTranscriptionResult {

    private CallsResultType type;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private String text;

    private Double confidence;

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link CallsTranscriptionResult instance}.
     */
    public CallsTranscriptionResult type(CallsResultType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsResultType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(CallsResultType type) {
        this.type = type;
    }

    /**
     * Sets startTime.
     *
     * @param startTime
     * @return This {@link CallsTranscriptionResult instance}.
     */
    public CallsTranscriptionResult startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     *
     * @param endTime
     * @return This {@link CallsTranscriptionResult instance}.
     */
    public CallsTranscriptionResult endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets text.
     *
     * @param text
     * @return This {@link CallsTranscriptionResult instance}.
     */
    public CallsTranscriptionResult text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets confidence.
     *
     * @param confidence
     * @return This {@link CallsTranscriptionResult instance}.
     */
    public CallsTranscriptionResult confidence(Double confidence) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsTranscriptionResult callsTranscriptionResult = (CallsTranscriptionResult) o;
        return Objects.equals(this.type, callsTranscriptionResult.type)
                && Objects.equals(this.startTime, callsTranscriptionResult.startTime)
                && Objects.equals(this.endTime, callsTranscriptionResult.endTime)
                && Objects.equals(this.text, callsTranscriptionResult.text)
                && Objects.equals(this.confidence, callsTranscriptionResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, startTime, endTime, text, confidence);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsTranscriptionResult {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    confidence: ")
                .append(toIndentedString(confidence))
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
