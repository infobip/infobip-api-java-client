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
 * Represents CallsDialogRecordingResponse model.
 */
public class CallsDialogRecordingResponse {

    private String dialogId;

    private String applicationId;

    private List<CallsRecordingFile> composedFiles = null;

    private List<CallRecording> callRecordings = null;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @param dialogId
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse dialogId(String dialogId) {
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
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse applicationId(String applicationId) {
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
     * Sets composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of both dialog participants.
     *
     * @param composedFiles
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse composedFiles(List<CallsRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
        return this;
    }

    /**
     * Adds and item into composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of both dialog participants.
     *
     * @param composedFilesItem The item to be added to the list.
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse addComposedFilesItem(CallsRecordingFile composedFilesItem) {
        if (this.composedFiles == null) {
            this.composedFiles = new ArrayList<>();
        }
        this.composedFiles.add(composedFilesItem);
        return this;
    }

    /**
     * Returns composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of both dialog participants.
     *
     * @return composedFiles
     */
    @JsonProperty("composedFiles")
    public List<CallsRecordingFile> getComposedFiles() {
        return composedFiles;
    }

    /**
     * Sets composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of both dialog participants.
     *
     * @param composedFiles
     */
    @JsonProperty("composedFiles")
    public void setComposedFiles(List<CallsRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
    }

    /**
     * Sets callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of one dialog participant.
     *
     * @param callRecordings
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse callRecordings(List<CallRecording> callRecordings) {
        this.callRecordings = callRecordings;
        return this;
    }

    /**
     * Adds and item into callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of one dialog participant.
     *
     * @param callRecordingsItem The item to be added to the list.
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse addCallRecordingsItem(CallRecording callRecordingsItem) {
        if (this.callRecordings == null) {
            this.callRecordings = new ArrayList<>();
        }
        this.callRecordings.add(callRecordingsItem);
        return this;
    }

    /**
     * Returns callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of one dialog participant.
     *
     * @return callRecordings
     */
    @JsonProperty("callRecordings")
    public List<CallRecording> getCallRecordings() {
        return callRecordings;
    }

    /**
     * Sets callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of one dialog participant.
     *
     * @param callRecordings
     */
    @JsonProperty("callRecordings")
    public void setCallRecordings(List<CallRecording> callRecordings) {
        this.callRecordings = callRecordings;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the (first) recording started.
     *
     * @param startTime
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time when the (first) recording started.
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
     * Date and time when the (first) recording started.
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
     * Date and time when the (last) recording ended.
     *
     * @param endTime
     * @return This {@link CallsDialogRecordingResponse instance}.
     */
    public CallsDialogRecordingResponse endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time when the (last) recording ended.
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
     * Date and time when the (last) recording ended.
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
        CallsDialogRecordingResponse callsDialogRecordingResponse = (CallsDialogRecordingResponse) o;
        return Objects.equals(this.dialogId, callsDialogRecordingResponse.dialogId)
                && Objects.equals(this.applicationId, callsDialogRecordingResponse.applicationId)
                && Objects.equals(this.composedFiles, callsDialogRecordingResponse.composedFiles)
                && Objects.equals(this.callRecordings, callsDialogRecordingResponse.callRecordings)
                && Objects.equals(this.startTime, callsDialogRecordingResponse.startTime)
                && Objects.equals(this.endTime, callsDialogRecordingResponse.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialogId, applicationId, composedFiles, callRecordings, startTime, endTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecordingResponse {")
                .append(newLine)
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    composedFiles: ")
                .append(toIndentedString(composedFiles))
                .append(newLine)
                .append("    callRecordings: ")
                .append(toIndentedString(callRecordings))
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
