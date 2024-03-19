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
 * Represents CallRecording model.
 */
public class CallRecording {

    private String callId;

    private CallEndpoint endpoint;

    private CallDirection direction;

    private List<CallsRecordingFile> files = null;

    private CallsRecordingStatus status;

    private String reason;

    private String callsConfigurationId;

    private String applicationId;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Call ID.
     *
     * @param callId
     * @return This {@link CallRecording instance}.
     */
    public CallRecording callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Call ID.
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
     * Call ID.
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
     * @return This {@link CallRecording instance}.
     */
    public CallRecording endpoint(CallEndpoint endpoint) {
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
     * Sets direction.
     *
     * @param direction
     * @return This {@link CallRecording instance}.
     */
    public CallRecording direction(CallDirection direction) {
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
     * Sets files.
     * <p>
     * Field description:
     * Call recording files.
     *
     * @param files
     * @return This {@link CallRecording instance}.
     */
    public CallRecording files(List<CallsRecordingFile> files) {
        this.files = files;
        return this;
    }

    /**
     * Adds and item into files.
     * <p>
     * Field description:
     * Call recording files.
     *
     * @param filesItem The item to be added to the list.
     * @return This {@link CallRecording instance}.
     */
    public CallRecording addFilesItem(CallsRecordingFile filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    /**
     * Returns files.
     * <p>
     * Field description:
     * Call recording files.
     *
     * @return files
     */
    @JsonProperty("files")
    public List<CallsRecordingFile> getFiles() {
        return files;
    }

    /**
     * Sets files.
     * <p>
     * Field description:
     * Call recording files.
     *
     * @param files
     */
    @JsonProperty("files")
    public void setFiles(List<CallsRecordingFile> files) {
        this.files = files;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link CallRecording instance}.
     */
    public CallRecording status(CallsRecordingStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public CallsRecordingStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(CallsRecordingStatus status) {
        this.status = status;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason for recording failure.
     *
     * @param reason
     * @return This {@link CallRecording instance}.
     */
    public CallRecording reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Reason for recording failure.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason for recording failure.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @param callsConfigurationId
     * @return This {@link CallRecording instance}.
     */
    public CallRecording callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     * @return This {@link CallRecording instance}.
     */
    public CallRecording applicationId(String applicationId) {
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
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the (first) call recording started.
     *
     * @param startTime
     * @return This {@link CallRecording instance}.
     */
    public CallRecording startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time when the (first) call recording started.
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
     * Date and time when the (first) call recording started.
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
     * Date and time when the (last) call recording ended.
     *
     * @param endTime
     * @return This {@link CallRecording instance}.
     */
    public CallRecording endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time when the (last) call recording ended.
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
     * Date and time when the (last) call recording ended.
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
        CallRecording callRecording = (CallRecording) o;
        return Objects.equals(this.callId, callRecording.callId)
                && Objects.equals(this.endpoint, callRecording.endpoint)
                && Objects.equals(this.direction, callRecording.direction)
                && Objects.equals(this.files, callRecording.files)
                && Objects.equals(this.status, callRecording.status)
                && Objects.equals(this.reason, callRecording.reason)
                && Objects.equals(this.callsConfigurationId, callRecording.callsConfigurationId)
                && Objects.equals(this.applicationId, callRecording.applicationId)
                && Objects.equals(this.startTime, callRecording.startTime)
                && Objects.equals(this.endTime, callRecording.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                callId,
                endpoint,
                direction,
                files,
                status,
                reason,
                callsConfigurationId,
                applicationId,
                startTime,
                endTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRecording {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    direction: ")
                .append(toIndentedString(direction))
                .append(newLine)
                .append("    files: ")
                .append(toIndentedString(files))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
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
