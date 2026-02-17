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
 * Represents WebRtcParticipant model.
 */
public class WebRtcParticipant {

    private String callId;

    private WebRtcEndpoint endpoint;

    private OffsetDateTime startTime;

    private OffsetDateTime joinTime;

    private OffsetDateTime leaveTime;

    private Integer ringDuration;

    private Integer duration;

    private WebRtcCallDirection direction;

    private WebRtcState state;

    private WebRtcParticipantType type;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Id of the call leg of this participant.
     *
     * @param callId
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant callId(String callId) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant endpoint(WebRtcEndpoint endpoint) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant startTime(OffsetDateTime startTime) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant joinTime(OffsetDateTime joinTime) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant leaveTime(OffsetDateTime leaveTime) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant ringDuration(Integer ringDuration) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant duration(Integer duration) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant direction(WebRtcCallDirection direction) {
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
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant state(WebRtcState state) {
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
    public WebRtcState getState() {
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
    public void setState(WebRtcState state) {
        this.state = state;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WebRtcParticipant instance}.
     */
    public WebRtcParticipant type(WebRtcParticipantType type) {
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
        WebRtcParticipant webRtcParticipant = (WebRtcParticipant) o;
        return Objects.equals(this.callId, webRtcParticipant.callId)
                && Objects.equals(this.endpoint, webRtcParticipant.endpoint)
                && Objects.equals(this.startTime, webRtcParticipant.startTime)
                && Objects.equals(this.joinTime, webRtcParticipant.joinTime)
                && Objects.equals(this.leaveTime, webRtcParticipant.leaveTime)
                && Objects.equals(this.ringDuration, webRtcParticipant.ringDuration)
                && Objects.equals(this.duration, webRtcParticipant.duration)
                && Objects.equals(this.direction, webRtcParticipant.direction)
                && Objects.equals(this.state, webRtcParticipant.state)
                && Objects.equals(this.type, webRtcParticipant.type);
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
                .append("class WebRtcParticipant {")
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
