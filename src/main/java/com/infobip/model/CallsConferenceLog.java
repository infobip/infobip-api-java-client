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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallsConferenceLog model.
 */
public class CallsConferenceLog {

    private String conferenceId;

    private String name;

    private CallsPlatform platform;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private Long duration;

    private List<CallsParticipantSession> sessions = null;

    private CallsConferenceRecordingLog recording;

    private CallsErrorCodeInfo errorCode;

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Unique conference ID.
     *
     * @param conferenceId
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog conferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Returns conferenceId.
     * <p>
     * Field description:
     * Unique conference ID.
     *
     * @return conferenceId
     */
    @JsonProperty("conferenceId")
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Unique conference ID.
     *
     * @param conferenceId
     */
    @JsonProperty("conferenceId")
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, requested or autogenerated on creation.
     *
     * @param name
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Conference name, requested or autogenerated on creation.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, requested or autogenerated on creation.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog platform(CallsPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public CallsPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(CallsPlatform platform) {
        this.platform = platform;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time for when the conference has been created.
     *
     * @param startTime
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time for when the conference has been created.
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
     * Date and time for when the conference has been created.
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
     * Date and time for when the conference ended.
     *
     * @param endTime
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time for when the conference ended.
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
     * Date and time for when the conference ended.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Conference duration in seconds.
     *
     * @param duration
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Conference duration in seconds.
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Conference duration in seconds.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Sets sessions.
     * <p>
     * Field description:
     * List of participant sessions.
     *
     * @param sessions
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog sessions(List<CallsParticipantSession> sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * Adds and item into sessions.
     * <p>
     * Field description:
     * List of participant sessions.
     *
     * @param sessionsItem The item to be added to the list.
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog addSessionsItem(CallsParticipantSession sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    /**
     * Returns sessions.
     * <p>
     * Field description:
     * List of participant sessions.
     *
     * @return sessions
     */
    @JsonProperty("sessions")
    public List<CallsParticipantSession> getSessions() {
        return sessions;
    }

    /**
     * Sets sessions.
     * <p>
     * Field description:
     * List of participant sessions.
     *
     * @param sessions
     */
    @JsonProperty("sessions")
    public void setSessions(List<CallsParticipantSession> sessions) {
        this.sessions = sessions;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog recording(CallsConferenceRecordingLog recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallsConferenceRecordingLog getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallsConferenceRecordingLog recording) {
        this.recording = recording;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link CallsConferenceLog instance}.
     */
    public CallsConferenceLog errorCode(CallsErrorCodeInfo errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public CallsErrorCodeInfo getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(CallsErrorCodeInfo errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConferenceLog callsConferenceLog = (CallsConferenceLog) o;
        return Objects.equals(this.conferenceId, callsConferenceLog.conferenceId)
                && Objects.equals(this.name, callsConferenceLog.name)
                && Objects.equals(this.platform, callsConferenceLog.platform)
                && Objects.equals(this.startTime, callsConferenceLog.startTime)
                && Objects.equals(this.endTime, callsConferenceLog.endTime)
                && Objects.equals(this.duration, callsConferenceLog.duration)
                && Objects.equals(this.sessions, callsConferenceLog.sessions)
                && Objects.equals(this.recording, callsConferenceLog.recording)
                && Objects.equals(this.errorCode, callsConferenceLog.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceId, name, platform, startTime, endTime, duration, sessions, recording, errorCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceLog {")
                .append(newLine)
                .append("    conferenceId: ")
                .append(toIndentedString(conferenceId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    sessions: ")
                .append(toIndentedString(sessions))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
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
