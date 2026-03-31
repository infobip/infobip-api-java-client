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
 * Conversation details including type, ID, and time window.
 */
public class RcsConversationStartedInfo {

    private RcsConversationType type;

    private String id;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link RcsConversationStartedInfo instance}.
     */
    public RcsConversationStartedInfo type(RcsConversationType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public RcsConversationType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(RcsConversationType type) {
        this.type = type;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique conversation identifier.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link RcsConversationStartedInfo instance}.
     */
    public RcsConversationStartedInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique conversation identifier.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique conversation identifier.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Conversation start time.
     * <p>
     * The field is required.
     *
     * @param startTime
     * @return This {@link RcsConversationStartedInfo instance}.
     */
    public RcsConversationStartedInfo startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Conversation start time.
     * <p>
     * The field is required.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Conversation start time.
     * <p>
     * The field is required.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Conversation end time.
     * <p>
     * The field is required.
     *
     * @param endTime
     * @return This {@link RcsConversationStartedInfo instance}.
     */
    public RcsConversationStartedInfo endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Conversation end time.
     * <p>
     * The field is required.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Conversation end time.
     * <p>
     * The field is required.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsConversationStartedInfo rcsConversationStartedInfo = (RcsConversationStartedInfo) o;
        return Objects.equals(this.type, rcsConversationStartedInfo.type)
                && Objects.equals(this.id, rcsConversationStartedInfo.id)
                && Objects.equals(this.startTime, rcsConversationStartedInfo.startTime)
                && Objects.equals(this.endTime, rcsConversationStartedInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, startTime, endTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsConversationStartedInfo {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
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
