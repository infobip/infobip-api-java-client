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
 * List of participant sessions.
 */
public class CallsParticipantSession {

    private String callId;

    private OffsetDateTime joinTime;

    private OffsetDateTime leaveTime;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Unique call ID.
     *
     * @param callId
     * @return This {@link CallsParticipantSession instance}.
     */
    public CallsParticipantSession callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Unique call ID.
     *
     * @return callId
     */
    @JsonProperty("callId")
    public String getCallId() {
        return callId;
    }

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Unique call ID.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets joinTime.
     * <p>
     * Field description:
     * Date and time for when the participant joined the conference.
     *
     * @param joinTime
     * @return This {@link CallsParticipantSession instance}.
     */
    public CallsParticipantSession joinTime(OffsetDateTime joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /**
     * Returns joinTime.
     * <p>
     * Field description:
     * Date and time for when the participant joined the conference.
     *
     * @return joinTime
     */
    @JsonProperty("joinTime")
    public OffsetDateTime getJoinTime() {
        return joinTime;
    }

    /**
     * Sets joinTime.
     * <p>
     * Field description:
     * Date and time for when the participant joined the conference.
     *
     * @param joinTime
     */
    @JsonProperty("joinTime")
    public void setJoinTime(OffsetDateTime joinTime) {
        this.joinTime = joinTime;
    }

    /**
     * Sets leaveTime.
     * <p>
     * Field description:
     * Date and time for when the participant left the conference.
     *
     * @param leaveTime
     * @return This {@link CallsParticipantSession instance}.
     */
    public CallsParticipantSession leaveTime(OffsetDateTime leaveTime) {
        this.leaveTime = leaveTime;
        return this;
    }

    /**
     * Returns leaveTime.
     * <p>
     * Field description:
     * Date and time for when the participant left the conference.
     *
     * @return leaveTime
     */
    @JsonProperty("leaveTime")
    public OffsetDateTime getLeaveTime() {
        return leaveTime;
    }

    /**
     * Sets leaveTime.
     * <p>
     * Field description:
     * Date and time for when the participant left the conference.
     *
     * @param leaveTime
     */
    @JsonProperty("leaveTime")
    public void setLeaveTime(OffsetDateTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsParticipantSession callsParticipantSession = (CallsParticipantSession) o;
        return Objects.equals(this.callId, callsParticipantSession.callId)
                && Objects.equals(this.joinTime, callsParticipantSession.joinTime)
                && Objects.equals(this.leaveTime, callsParticipantSession.leaveTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callId, joinTime, leaveTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsParticipantSession {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    joinTime: ")
                .append(toIndentedString(joinTime))
                .append(newLine)
                .append("    leaveTime: ")
                .append(toIndentedString(leaveTime))
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
