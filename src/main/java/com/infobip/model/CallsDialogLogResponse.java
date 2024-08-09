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
 * Represents CallsDialogLogResponse model.
 */
public class CallsDialogLogResponse {

    private String dialogId;

    private String applicationId;

    private CallsDialogState state;

    private OffsetDateTime startTime;

    private OffsetDateTime establishTime;

    private OffsetDateTime endTime;

    private String parentCallId;

    private String childCallId;

    private Long duration;

    private CallsDialogRecordingLog recording;

    private CallsErrorCodeInfo errorCode;

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @param dialogId
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse dialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }

    /**
     * Returns dialogId.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @return dialogId
     */
    @JsonProperty("dialogId")
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @param dialogId
     */
    @JsonProperty("dialogId")
    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse state(CallsDialogState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public CallsDialogState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(CallsDialogState state) {
        this.state = state;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been created.
     *
     * @param startTime
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been created.
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
     * Date and time for when the dialog has been created.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets establishTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been established.
     *
     * @param establishTime
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse establishTime(OffsetDateTime establishTime) {
        this.establishTime = establishTime;
        return this;
    }

    /**
     * Returns establishTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been established.
     *
     * @return establishTime
     */
    @JsonProperty("establishTime")
    public OffsetDateTime getEstablishTime() {
        return establishTime;
    }

    /**
     * Sets establishTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been established.
     *
     * @param establishTime
     */
    @JsonProperty("establishTime")
    public void setEstablishTime(OffsetDateTime establishTime) {
        this.establishTime = establishTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been finished.
     *
     * @param endTime
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been finished.
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
     * Date and time for when the dialog has been finished.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * Unique parent call ID.
     *
     * @param parentCallId
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse parentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Returns parentCallId.
     * <p>
     * Field description:
     * Unique parent call ID.
     *
     * @return parentCallId
     */
    @JsonProperty("parentCallId")
    public String getParentCallId() {
        return parentCallId;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * Unique parent call ID.
     *
     * @param parentCallId
     */
    @JsonProperty("parentCallId")
    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    /**
     * Sets childCallId.
     * <p>
     * Field description:
     * Unique child call ID.
     *
     * @param childCallId
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse childCallId(String childCallId) {
        this.childCallId = childCallId;
        return this;
    }

    /**
     * Returns childCallId.
     * <p>
     * Field description:
     * Unique child call ID.
     *
     * @return childCallId
     */
    @JsonProperty("childCallId")
    public String getChildCallId() {
        return childCallId;
    }

    /**
     * Sets childCallId.
     * <p>
     * Field description:
     * Unique child call ID.
     *
     * @param childCallId
     */
    @JsonProperty("childCallId")
    public void setChildCallId(String childCallId) {
        this.childCallId = childCallId;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Dialog duration in seconds.
     *
     * @param duration
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Dialog duration in seconds.
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
     * Dialog duration in seconds.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse recording(CallsDialogRecordingLog recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallsDialogRecordingLog getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallsDialogRecordingLog recording) {
        this.recording = recording;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link CallsDialogLogResponse instance}.
     */
    public CallsDialogLogResponse errorCode(CallsErrorCodeInfo errorCode) {
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
        CallsDialogLogResponse callsDialogLogResponse = (CallsDialogLogResponse) o;
        return Objects.equals(this.dialogId, callsDialogLogResponse.dialogId)
                && Objects.equals(this.applicationId, callsDialogLogResponse.applicationId)
                && Objects.equals(this.state, callsDialogLogResponse.state)
                && Objects.equals(this.startTime, callsDialogLogResponse.startTime)
                && Objects.equals(this.establishTime, callsDialogLogResponse.establishTime)
                && Objects.equals(this.endTime, callsDialogLogResponse.endTime)
                && Objects.equals(this.parentCallId, callsDialogLogResponse.parentCallId)
                && Objects.equals(this.childCallId, callsDialogLogResponse.childCallId)
                && Objects.equals(this.duration, callsDialogLogResponse.duration)
                && Objects.equals(this.recording, callsDialogLogResponse.recording)
                && Objects.equals(this.errorCode, callsDialogLogResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                dialogId,
                applicationId,
                state,
                startTime,
                establishTime,
                endTime,
                parentCallId,
                childCallId,
                duration,
                recording,
                errorCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogLogResponse {")
                .append(newLine)
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    establishTime: ")
                .append(toIndentedString(establishTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    parentCallId: ")
                .append(toIndentedString(parentCallId))
                .append(newLine)
                .append("    childCallId: ")
                .append(toIndentedString(childCallId))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
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
