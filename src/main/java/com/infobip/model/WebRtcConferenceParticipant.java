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
 * List of participants of the call.
 */
public class WebRtcConferenceParticipant {

    private String callId;

    private WebRtcEndpoint endpoint;

    private OffsetDateTime startTime;

    private OffsetDateTime joinTime;

    private OffsetDateTime leaveTime;

    private Integer ringDuration;

    private Integer duration;

    private WebRtcCallDirection direction;

    private WebRtcConferenceFinalState state;

    private WebRtcParticipantType type;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Id of the call leg of this participant.
     *
     * @param callId
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Id of the call leg of this participant.
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
     * Id of the call leg of this participant.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant endpoint(WebRtcEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public WebRtcEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(WebRtcEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time the call started. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param startTime
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time the call started. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
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
     * Date and time the call started. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets joinTime.
     * <p>
     * Field description:
     * Date and time the participant joined the call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param joinTime
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant joinTime(OffsetDateTime joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    /**
     * Returns joinTime.
     * <p>
     * Field description:
     * Date and time the participant joined the call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
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
     * Date and time the participant joined the call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
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
     * Date and time the participant left the call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param leaveTime
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant leaveTime(OffsetDateTime leaveTime) {
        this.leaveTime = leaveTime;
        return this;
    }

    /**
     * Returns leaveTime.
     * <p>
     * Field description:
     * Date and time the participant left the call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
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
     * Date and time the participant left the call. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param leaveTime
     */
    @JsonProperty("leaveTime")
    public void setLeaveTime(OffsetDateTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * Sets ringDuration.
     * <p>
     * Field description:
     * Number of seconds needed for the participant to answer the call.
     *
     * @param ringDuration
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant ringDuration(Integer ringDuration) {
        this.ringDuration = ringDuration;
        return this;
    }

    /**
     * Returns ringDuration.
     * <p>
     * Field description:
     * Number of seconds needed for the participant to answer the call.
     *
     * @return ringDuration
     */
    @JsonProperty("ringDuration")
    public Integer getRingDuration() {
        return ringDuration;
    }

    /**
     * Sets ringDuration.
     * <p>
     * Field description:
     * Number of seconds needed for the participant to answer the call.
     *
     * @param ringDuration
     */
    @JsonProperty("ringDuration")
    public void setRingDuration(Integer ringDuration) {
        this.ringDuration = ringDuration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Number of seconds the participant spent in the call.
     *
     * @param duration
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Number of seconds the participant spent in the call.
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Number of seconds the participant spent in the call.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Sets direction.
     *
     * @param direction
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant direction(WebRtcCallDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Returns direction.
     *
     * @return direction
     */
    @JsonProperty("direction")
    public WebRtcCallDirection getDirection() {
        return direction;
    }

    /**
     * Sets direction.
     *
     * @param direction
     */
    @JsonProperty("direction")
    public void setDirection(WebRtcCallDirection direction) {
        this.direction = direction;
    }

    /**
     * Sets state.
     * <p>
     * The field is required.
     *
     * @param state
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant state(WebRtcConferenceFinalState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     * <p>
     * The field is required.
     *
     * @return state
     */
    @JsonProperty("state")
    public WebRtcConferenceFinalState getState() {
        return state;
    }

    /**
     * Sets state.
     * <p>
     * The field is required.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(WebRtcConferenceFinalState state) {
        this.state = state;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WebRtcConferenceParticipant instance}.
     */
    public WebRtcConferenceParticipant type(WebRtcParticipantType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WebRtcParticipantType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WebRtcParticipantType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcConferenceParticipant webRtcConferenceParticipant = (WebRtcConferenceParticipant) o;
        return Objects.equals(this.callId, webRtcConferenceParticipant.callId)
                && Objects.equals(this.endpoint, webRtcConferenceParticipant.endpoint)
                && Objects.equals(this.startTime, webRtcConferenceParticipant.startTime)
                && Objects.equals(this.joinTime, webRtcConferenceParticipant.joinTime)
                && Objects.equals(this.leaveTime, webRtcConferenceParticipant.leaveTime)
                && Objects.equals(this.ringDuration, webRtcConferenceParticipant.ringDuration)
                && Objects.equals(this.duration, webRtcConferenceParticipant.duration)
                && Objects.equals(this.direction, webRtcConferenceParticipant.direction)
                && Objects.equals(this.state, webRtcConferenceParticipant.state)
                && Objects.equals(this.type, webRtcConferenceParticipant.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                callId, endpoint, startTime, joinTime, leaveTime, ringDuration, duration, direction, state, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcConferenceParticipant {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    joinTime: ")
                .append(toIndentedString(joinTime))
                .append(newLine)
                .append("    leaveTime: ")
                .append(toIndentedString(leaveTime))
                .append(newLine)
                .append("    ringDuration: ")
                .append(toIndentedString(ringDuration))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    direction: ")
                .append(toIndentedString(direction))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
