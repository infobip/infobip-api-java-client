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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The list of the results for this page.
 */
public class CallLog {

    private String callId;

    private CallEndpoint endpoint;

    private String from;

    private String to;

    private CallDirection direction;

    private CallState state;

    private OffsetDateTime startTime;

    private OffsetDateTime answerTime;

    private OffsetDateTime endTime;

    private String parentCallId;

    private CallsMachineDetectionProperties machineDetection;

    private Long ringDuration;

    private List<String> applicationIds = null;

    private List<String> conferenceIds = null;

    private Long duration;

    private Boolean hasCameraVideo;

    private Boolean hasScreenshareVideo;

    private CallsErrorCodeInfo errorCode;

    private Map<String, String> customData = null;

    private String dialogId;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Unique call ID.
     *
     * @param callId
     * @return This {@link CallLog instance}.
     */
    public CallLog callId(String callId) {
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
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link CallLog instance}.
     */
    public CallLog endpoint(CallEndpoint endpoint) {
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
     * Sets from.
     * <p>
     * Field description:
     * Caller ID.
     *
     * @param from
     * @return This {@link CallLog instance}.
     */
    public CallLog from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller ID.
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
     * Caller ID.
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
     * Callee ID.
     *
     * @param to
     * @return This {@link CallLog instance}.
     */
    public CallLog to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Callee ID.
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
     * Callee ID.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets direction.
     *
     * @param direction
     * @return This {@link CallLog instance}.
     */
    public CallLog direction(CallDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Returns direction.
     *
     * @return direction
     */
    @JsonProperty("direction")
    public CallDirection getDirection() {
        return direction;
    }

    /**
     * Sets direction.
     *
     * @param direction
     */
    @JsonProperty("direction")
    public void setDirection(CallDirection direction) {
        this.direction = direction;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link CallLog instance}.
     */
    public CallLog state(CallState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public CallState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(CallState state) {
        this.state = state;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time for when the call has been created.
     *
     * @param startTime
     * @return This {@link CallLog instance}.
     */
    public CallLog startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time for when the call has been created.
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
     * Date and time for when the call has been created.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets answerTime.
     * <p>
     * Field description:
     * Date and time for when the call has been answered.
     *
     * @param answerTime
     * @return This {@link CallLog instance}.
     */
    public CallLog answerTime(OffsetDateTime answerTime) {
        this.answerTime = answerTime;
        return this;
    }

    /**
     * Returns answerTime.
     * <p>
     * Field description:
     * Date and time for when the call has been answered.
     *
     * @return answerTime
     */
    @JsonProperty("answerTime")
    public OffsetDateTime getAnswerTime() {
        return answerTime;
    }

    /**
     * Sets answerTime.
     * <p>
     * Field description:
     * Date and time for when the call has been answered.
     *
     * @param answerTime
     */
    @JsonProperty("answerTime")
    public void setAnswerTime(OffsetDateTime answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time for when the call has been finished.
     *
     * @param endTime
     * @return This {@link CallLog instance}.
     */
    public CallLog endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time for when the call has been finished.
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
     * Date and time for when the call has been finished.
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
     * Parent call ID.
     *
     * @param parentCallId
     * @return This {@link CallLog instance}.
     */
    public CallLog parentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Returns parentCallId.
     * <p>
     * Field description:
     * Parent call ID.
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
     * Parent call ID.
     *
     * @param parentCallId
     */
    @JsonProperty("parentCallId")
    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     * @return This {@link CallLog instance}.
     */
    public CallLog machineDetection(CallsMachineDetectionProperties machineDetection) {
        this.machineDetection = machineDetection;
        return this;
    }

    /**
     * Returns machineDetection.
     *
     * @return machineDetection
     */
    @JsonProperty("machineDetection")
    public CallsMachineDetectionProperties getMachineDetection() {
        return machineDetection;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     */
    @JsonProperty("machineDetection")
    public void setMachineDetection(CallsMachineDetectionProperties machineDetection) {
        this.machineDetection = machineDetection;
    }

    /**
     * Sets ringDuration.
     * <p>
     * Field description:
     * Ringing duration in seconds.
     *
     * @param ringDuration
     * @return This {@link CallLog instance}.
     */
    public CallLog ringDuration(Long ringDuration) {
        this.ringDuration = ringDuration;
        return this;
    }

    /**
     * Returns ringDuration.
     * <p>
     * Field description:
     * Ringing duration in seconds.
     *
     * @return ringDuration
     */
    @JsonProperty("ringDuration")
    public Long getRingDuration() {
        return ringDuration;
    }

    /**
     * Sets ringDuration.
     * <p>
     * Field description:
     * Ringing duration in seconds.
     *
     * @param ringDuration
     */
    @JsonProperty("ringDuration")
    public void setRingDuration(Long ringDuration) {
        this.ringDuration = ringDuration;
    }

    /**
     * Sets applicationIds.
     * <p>
     * Field description:
     * IDs of the applications used during the call.
     *
     * @param applicationIds
     * @return This {@link CallLog instance}.
     */
    public CallLog applicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }

    /**
     * Adds and item into applicationIds.
     * <p>
     * Field description:
     * IDs of the applications used during the call.
     *
     * @param applicationIdsItem The item to be added to the list.
     * @return This {@link CallLog instance}.
     */
    public CallLog addApplicationIdsItem(String applicationIdsItem) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        this.applicationIds.add(applicationIdsItem);
        return this;
    }

    /**
     * Returns applicationIds.
     * <p>
     * Field description:
     * IDs of the applications used during the call.
     *
     * @return applicationIds
     */
    @JsonProperty("applicationIds")
    public List<String> getApplicationIds() {
        return applicationIds;
    }

    /**
     * Sets applicationIds.
     * <p>
     * Field description:
     * IDs of the applications used during the call.
     *
     * @param applicationIds
     */
    @JsonProperty("applicationIds")
    public void setApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
    }

    /**
     * Sets conferenceIds.
     * <p>
     * Field description:
     * IDs of the conferences where the call was a participant.
     *
     * @param conferenceIds
     * @return This {@link CallLog instance}.
     */
    public CallLog conferenceIds(List<String> conferenceIds) {
        this.conferenceIds = conferenceIds;
        return this;
    }

    /**
     * Adds and item into conferenceIds.
     * <p>
     * Field description:
     * IDs of the conferences where the call was a participant.
     *
     * @param conferenceIdsItem The item to be added to the list.
     * @return This {@link CallLog instance}.
     */
    public CallLog addConferenceIdsItem(String conferenceIdsItem) {
        if (this.conferenceIds == null) {
            this.conferenceIds = new ArrayList<>();
        }
        this.conferenceIds.add(conferenceIdsItem);
        return this;
    }

    /**
     * Returns conferenceIds.
     * <p>
     * Field description:
     * IDs of the conferences where the call was a participant.
     *
     * @return conferenceIds
     */
    @JsonProperty("conferenceIds")
    public List<String> getConferenceIds() {
        return conferenceIds;
    }

    /**
     * Sets conferenceIds.
     * <p>
     * Field description:
     * IDs of the conferences where the call was a participant.
     *
     * @param conferenceIds
     */
    @JsonProperty("conferenceIds")
    public void setConferenceIds(List<String> conferenceIds) {
        this.conferenceIds = conferenceIds;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Call duration in seconds.
     *
     * @param duration
     * @return This {@link CallLog instance}.
     */
    public CallLog duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Call duration in seconds.
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
     * Call duration in seconds.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Sets hasCameraVideo.
     * <p>
     * Field description:
     * Indicates if camera was enabled during the call.
     *
     * @param hasCameraVideo
     * @return This {@link CallLog instance}.
     */
    public CallLog hasCameraVideo(Boolean hasCameraVideo) {
        this.hasCameraVideo = hasCameraVideo;
        return this;
    }

    /**
     * Returns hasCameraVideo.
     * <p>
     * Field description:
     * Indicates if camera was enabled during the call.
     *
     * @return hasCameraVideo
     */
    @JsonProperty("hasCameraVideo")
    public Boolean getHasCameraVideo() {
        return hasCameraVideo;
    }

    /**
     * Sets hasCameraVideo.
     * <p>
     * Field description:
     * Indicates if camera was enabled during the call.
     *
     * @param hasCameraVideo
     */
    @JsonProperty("hasCameraVideo")
    public void setHasCameraVideo(Boolean hasCameraVideo) {
        this.hasCameraVideo = hasCameraVideo;
    }

    /**
     * Sets hasScreenshareVideo.
     * <p>
     * Field description:
     * Indicates if screen sharing was enabled during the call.
     *
     * @param hasScreenshareVideo
     * @return This {@link CallLog instance}.
     */
    public CallLog hasScreenshareVideo(Boolean hasScreenshareVideo) {
        this.hasScreenshareVideo = hasScreenshareVideo;
        return this;
    }

    /**
     * Returns hasScreenshareVideo.
     * <p>
     * Field description:
     * Indicates if screen sharing was enabled during the call.
     *
     * @return hasScreenshareVideo
     */
    @JsonProperty("hasScreenshareVideo")
    public Boolean getHasScreenshareVideo() {
        return hasScreenshareVideo;
    }

    /**
     * Sets hasScreenshareVideo.
     * <p>
     * Field description:
     * Indicates if screen sharing was enabled during the call.
     *
     * @param hasScreenshareVideo
     */
    @JsonProperty("hasScreenshareVideo")
    public void setHasScreenshareVideo(Boolean hasScreenshareVideo) {
        this.hasScreenshareVideo = hasScreenshareVideo;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link CallLog instance}.
     */
    public CallLog errorCode(CallsErrorCodeInfo errorCode) {
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

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallLog instance}.
     */
    public CallLog customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallLog instance}.
     */
    public CallLog putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Dialog ID.
     *
     * @param dialogId
     * @return This {@link CallLog instance}.
     */
    public CallLog dialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }

    /**
     * Returns dialogId.
     * <p>
     * Field description:
     * Dialog ID.
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
     * Dialog ID.
     *
     * @param dialogId
     */
    @JsonProperty("dialogId")
    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallLog callLog = (CallLog) o;
        return Objects.equals(this.callId, callLog.callId)
                && Objects.equals(this.endpoint, callLog.endpoint)
                && Objects.equals(this.from, callLog.from)
                && Objects.equals(this.to, callLog.to)
                && Objects.equals(this.direction, callLog.direction)
                && Objects.equals(this.state, callLog.state)
                && Objects.equals(this.startTime, callLog.startTime)
                && Objects.equals(this.answerTime, callLog.answerTime)
                && Objects.equals(this.endTime, callLog.endTime)
                && Objects.equals(this.parentCallId, callLog.parentCallId)
                && Objects.equals(this.machineDetection, callLog.machineDetection)
                && Objects.equals(this.ringDuration, callLog.ringDuration)
                && Objects.equals(this.applicationIds, callLog.applicationIds)
                && Objects.equals(this.conferenceIds, callLog.conferenceIds)
                && Objects.equals(this.duration, callLog.duration)
                && Objects.equals(this.hasCameraVideo, callLog.hasCameraVideo)
                && Objects.equals(this.hasScreenshareVideo, callLog.hasScreenshareVideo)
                && Objects.equals(this.errorCode, callLog.errorCode)
                && Objects.equals(this.customData, callLog.customData)
                && Objects.equals(this.dialogId, callLog.dialogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                callId,
                endpoint,
                from,
                to,
                direction,
                state,
                startTime,
                answerTime,
                endTime,
                parentCallId,
                machineDetection,
                ringDuration,
                applicationIds,
                conferenceIds,
                duration,
                hasCameraVideo,
                hasScreenshareVideo,
                errorCode,
                customData,
                dialogId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallLog {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    direction: ")
                .append(toIndentedString(direction))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    answerTime: ")
                .append(toIndentedString(answerTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    parentCallId: ")
                .append(toIndentedString(parentCallId))
                .append(newLine)
                .append("    machineDetection: ")
                .append(toIndentedString(machineDetection))
                .append(newLine)
                .append("    ringDuration: ")
                .append(toIndentedString(ringDuration))
                .append(newLine)
                .append("    applicationIds: ")
                .append(toIndentedString(applicationIds))
                .append(newLine)
                .append("    conferenceIds: ")
                .append(toIndentedString(conferenceIds))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    hasCameraVideo: ")
                .append(toIndentedString(hasCameraVideo))
                .append(newLine)
                .append("    hasScreenshareVideo: ")
                .append(toIndentedString(hasScreenshareVideo))
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
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
