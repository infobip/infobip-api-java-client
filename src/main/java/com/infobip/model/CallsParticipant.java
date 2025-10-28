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
 * Represents CallsParticipant model.
 */
public class CallsParticipant {

    private String callId;

    private CallEndpoint endpoint;

    private CallsParticipantState state;

    private OffsetDateTime joinTime;

    private OffsetDateTime leaveTime;

    private CallsMediaProperties media;

    private CallsRole role;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Participant call ID.
     *
     * @param callId
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Participant call ID.
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
     * Participant call ID.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant endpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     * <p>
     * The field is required.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public CallEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant state(CallsParticipantState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public CallsParticipantState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(CallsParticipantState state) {
        this.state = state;
    }

    /**
     * Sets joinTime.
     * <p>
     * Field description:
     * Date and time when the participant has joined.
     *
     * @param joinTime
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant joinTime(OffsetDateTime joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /**
     * Returns joinTime.
     * <p>
     * Field description:
     * Date and time when the participant has joined.
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
     * Date and time when the participant has joined.
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
     * Date and time when the participant has left.
     *
     * @param leaveTime
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant leaveTime(OffsetDateTime leaveTime) {
        this.leaveTime = leaveTime;
        return this;
    }

    /**
     * Returns leaveTime.
     * <p>
     * Field description:
     * Date and time when the participant has left.
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
     * Date and time when the participant has left.
     *
     * @param leaveTime
     */
    @JsonProperty("leaveTime")
    public void setLeaveTime(OffsetDateTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * Sets media.
     *
     * @param media
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant media(CallsMediaProperties media) {
        this.media = media;
        return this;
    }

    /**
     * Returns media.
     *
     * @return media
     */
    @JsonProperty("media")
    public CallsMediaProperties getMedia() {
        return media;
    }

    /**
     * Sets media.
     *
     * @param media
     */
    @JsonProperty("media")
    public void setMedia(CallsMediaProperties media) {
        this.media = media;
    }

    /**
     * Sets role.
     *
     * @param role
     * @return This {@link CallsParticipant instance}.
     */
    public CallsParticipant role(CallsRole role) {
        this.role = role;
        return this;
    }

    /**
     * Returns role.
     *
     * @return role
     */
    @JsonProperty("role")
    public CallsRole getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role
     */
    @JsonProperty("role")
    public void setRole(CallsRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsParticipant callsParticipant = (CallsParticipant) o;
        return Objects.equals(this.callId, callsParticipant.callId)
                && Objects.equals(this.endpoint, callsParticipant.endpoint)
                && Objects.equals(this.state, callsParticipant.state)
                && Objects.equals(this.joinTime, callsParticipant.joinTime)
                && Objects.equals(this.leaveTime, callsParticipant.leaveTime)
                && Objects.equals(this.media, callsParticipant.media)
                && Objects.equals(this.role, callsParticipant.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callId, endpoint, state, joinTime, leaveTime, media, role);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsParticipant {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    joinTime: ")
                .append(toIndentedString(joinTime))
                .append(newLine)
                .append("    leaveTime: ")
                .append(toIndentedString(leaveTime))
                .append(newLine)
                .append("    media: ")
                .append(toIndentedString(media))
                .append(newLine)
                .append("    role: ")
                .append(toIndentedString(role))
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
