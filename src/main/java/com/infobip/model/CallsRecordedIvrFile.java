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
 * Array of recorded files metadata, one for each recorded file.
 */
public class CallsRecordedIvrFile {

    private String messageId;

    private String from;

    private String to;

    private String scenarioId;

    private String groupId;

    private String url;

    private OffsetDateTime recordedAt;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent message.
     *
     * @param messageId
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent message.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent message.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID.
     *
     * @param from
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Numeric sender ID.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Destination address.
     *
     * @param to
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Destination address.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Destination address.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets scenarioId.
     * <p>
     * Field description:
     * Scenario key.
     *
     * @param scenarioId
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile scenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }

    /**
     * Returns scenarioId.
     * <p>
     * Field description:
     * Scenario key.
     *
     * @return scenarioId
     */
    @JsonProperty("scenarioId")
    public String getScenarioId() {
        return scenarioId;
    }

    /**
     * Sets scenarioId.
     * <p>
     * Field description:
     * Scenario key.
     *
     * @param scenarioId
     */
    @JsonProperty("scenarioId")
    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Differentiates recordings made by separate Record actions.
     *
     * @param groupId
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Returns groupId.
     * <p>
     * Field description:
     * Differentiates recordings made by separate Record actions.
     *
     * @return groupId
     */
    @JsonProperty("groupId")
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Differentiates recordings made by separate Record actions.
     *
     * @param groupId
     */
    @JsonProperty("groupId")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Relative URL path to the recorded file. To download the audio, just perform a GET request using the relative URL of a specific file. The returned audio data is encoded as PCM 16bit 8kHz WAVE audio. The files are available on Infobip servers for 2 months.
     *
     * @param url
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Relative URL path to the recorded file. To download the audio, just perform a GET request using the relative URL of a specific file. The returned audio data is encoded as PCM 16bit 8kHz WAVE audio. The files are available on Infobip servers for 2 months.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Relative URL path to the recorded file. To download the audio, just perform a GET request using the relative URL of a specific file. The returned audio data is encoded as PCM 16bit 8kHz WAVE audio. The files are available on Infobip servers for 2 months.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets recordedAt.
     * <p>
     * Field description:
     * The time the recording took place.
     *
     * @param recordedAt
     * @return This {@link CallsRecordedIvrFile instance}.
     */
    public CallsRecordedIvrFile recordedAt(OffsetDateTime recordedAt) {
        this.recordedAt = recordedAt;
        return this;
    }

    /**
     * Returns recordedAt.
     * <p>
     * Field description:
     * The time the recording took place.
     *
     * @return recordedAt
     */
    @JsonProperty("recordedAt")
    public OffsetDateTime getRecordedAt() {
        return recordedAt;
    }

    /**
     * Sets recordedAt.
     * <p>
     * Field description:
     * The time the recording took place.
     *
     * @param recordedAt
     */
    @JsonProperty("recordedAt")
    public void setRecordedAt(OffsetDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordedIvrFile callsRecordedIvrFile = (CallsRecordedIvrFile) o;
        return Objects.equals(this.messageId, callsRecordedIvrFile.messageId)
                && Objects.equals(this.from, callsRecordedIvrFile.from)
                && Objects.equals(this.to, callsRecordedIvrFile.to)
                && Objects.equals(this.scenarioId, callsRecordedIvrFile.scenarioId)
                && Objects.equals(this.groupId, callsRecordedIvrFile.groupId)
                && Objects.equals(this.url, callsRecordedIvrFile.url)
                && Objects.equals(this.recordedAt, callsRecordedIvrFile.recordedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, from, to, scenarioId, groupId, url, recordedAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordedIvrFile {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    scenarioId: ")
                .append(toIndentedString(scenarioId))
                .append(newLine)
                .append("    groupId: ")
                .append(toIndentedString(groupId))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    recordedAt: ")
                .append(toIndentedString(recordedAt))
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
