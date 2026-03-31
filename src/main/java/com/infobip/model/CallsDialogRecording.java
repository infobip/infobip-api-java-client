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
 * Represents CallsDialogRecording model.
 */
public class CallsDialogRecording {

    private String dialogId;

    private String callsConfigurationId;

    private String applicationId;

    private String entityId;

    private List<CallsRecordingFile> composedFiles = null;

    private List<CallRecording> callRecordings = null;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Sets dialogId.
     *
     * @param dialogId
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording dialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }

    /**
     * Returns dialogId.
     *
     * @return dialogId
     */
    @JsonProperty("dialogId")
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Sets dialogId.
     *
     * @param dialogId
     */
    @JsonProperty("dialogId")
    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    /**
     * Sets callsConfigurationId.
     *
     * @param callsConfigurationId
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets composedFiles.
     *
     * @param composedFiles
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording composedFiles(List<CallsRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
        return this;
    }

    /**
     * Adds and item into composedFiles.
     *
     * @param composedFilesItem The item to be added to the list.
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording addComposedFilesItem(CallsRecordingFile composedFilesItem) {
        if (this.composedFiles == null) {
            this.composedFiles = new ArrayList<>();
        }
        this.composedFiles.add(composedFilesItem);
        return this;
    }

    /**
     * Returns composedFiles.
     *
     * @return composedFiles
     */
    @JsonProperty("composedFiles")
    public List<CallsRecordingFile> getComposedFiles() {
        return composedFiles;
    }

    /**
     * Sets composedFiles.
     *
     * @param composedFiles
     */
    @JsonProperty("composedFiles")
    public void setComposedFiles(List<CallsRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
    }

    /**
     * Sets callRecordings.
     *
     * @param callRecordings
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording callRecordings(List<CallRecording> callRecordings) {
        this.callRecordings = callRecordings;
        return this;
    }

    /**
     * Adds and item into callRecordings.
     *
     * @param callRecordingsItem The item to be added to the list.
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording addCallRecordingsItem(CallRecording callRecordingsItem) {
        if (this.callRecordings == null) {
            this.callRecordings = new ArrayList<>();
        }
        this.callRecordings.add(callRecordingsItem);
        return this;
    }

    /**
     * Returns callRecordings.
     *
     * @return callRecordings
     */
    @JsonProperty("callRecordings")
    public List<CallRecording> getCallRecordings() {
        return callRecordings;
    }

    /**
     * Sets callRecordings.
     *
     * @param callRecordings
     */
    @JsonProperty("callRecordings")
    public void setCallRecordings(List<CallRecording> callRecordings) {
        this.callRecordings = callRecordings;
    }

    /**
     * Sets startTime.
     *
     * @param startTime
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     *
     * @param endTime
     * @return This {@link CallsDialogRecording instance}.
     */
    public CallsDialogRecording endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
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
        CallsDialogRecording callsDialogRecording = (CallsDialogRecording) o;
        return Objects.equals(this.dialogId, callsDialogRecording.dialogId)
                && Objects.equals(this.callsConfigurationId, callsDialogRecording.callsConfigurationId)
                && Objects.equals(this.applicationId, callsDialogRecording.applicationId)
                && Objects.equals(this.entityId, callsDialogRecording.entityId)
                && Objects.equals(this.composedFiles, callsDialogRecording.composedFiles)
                && Objects.equals(this.callRecordings, callsDialogRecording.callRecordings)
                && Objects.equals(this.startTime, callsDialogRecording.startTime)
                && Objects.equals(this.endTime, callsDialogRecording.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                dialogId,
                callsConfigurationId,
                applicationId,
                entityId,
                composedFiles,
                callRecordings,
                startTime,
                endTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecording {")
                .append(newLine)
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
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
