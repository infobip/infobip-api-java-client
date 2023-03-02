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
 * Represents CallsConferenceRecording model.
 */
public class CallsConferenceRecording {

    private String conferenceId;

    private String conferenceName;

    private String applicationId;

    private List<CallsRecordingFile> composedFiles = null;

    private List<CallRecording> callRecordings = null;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Conference ID.
     *
     * @param conferenceId
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording conferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Returns conferenceId.
     * <p>
     * Field description:
     * Conference ID.
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
     * Conference ID.
     *
     * @param conferenceId
     */
    @JsonProperty("conferenceId")
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    /**
     * Sets conferenceName.
     * <p>
     * Field description:
     * Conference name.
     *
     * @param conferenceName
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording conferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    /**
     * Returns conferenceName.
     * <p>
     * Field description:
     * Conference name.
     *
     * @return conferenceName
     */
    @JsonProperty("conferenceName")
    public String getConferenceName() {
        return conferenceName;
    }

    /**
     * Sets conferenceName.
     * <p>
     * Field description:
     * Conference name.
     *
     * @param conferenceName
     */
    @JsonProperty("conferenceName")
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording applicationId(String applicationId) {
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
     * File(s) with a recording of all conference participants.
     *
     * @param composedFiles
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording composedFiles(List<CallsRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
        return this;
    }

    /**
     * Adds and item into composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of all conference participants.
     *
     * @param composedFilesItem The item to be added to the list.
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording addComposedFilesItem(CallsRecordingFile composedFilesItem) {
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
     * File(s) with a recording of all conference participants.
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
     * File(s) with a recording of all conference participants.
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
     * File(s) with a recording of one conference participant.
     *
     * @param callRecordings
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording callRecordings(List<CallRecording> callRecordings) {
        this.callRecordings = callRecordings;
        return this;
    }

    /**
     * Adds and item into callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of one conference participant.
     *
     * @param callRecordingsItem The item to be added to the list.
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording addCallRecordingsItem(CallRecording callRecordingsItem) {
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
     * File(s) with a recording of one conference participant.
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
     * File(s) with a recording of one conference participant.
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
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording startTime(OffsetDateTime startTime) {
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
     * @return This {@link CallsConferenceRecording instance}.
     */
    public CallsConferenceRecording endTime(OffsetDateTime endTime) {
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
        CallsConferenceRecording callsConferenceRecording = (CallsConferenceRecording) o;
        return Objects.equals(this.conferenceId, callsConferenceRecording.conferenceId)
                && Objects.equals(this.conferenceName, callsConferenceRecording.conferenceName)
                && Objects.equals(this.applicationId, callsConferenceRecording.applicationId)
                && Objects.equals(this.composedFiles, callsConferenceRecording.composedFiles)
                && Objects.equals(this.callRecordings, callsConferenceRecording.callRecordings)
                && Objects.equals(this.startTime, callsConferenceRecording.startTime)
                && Objects.equals(this.endTime, callsConferenceRecording.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conferenceId, conferenceName, applicationId, composedFiles, callRecordings, startTime, endTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceRecording {")
                .append(newLine)
                .append("    conferenceId: ")
                .append(toIndentedString(conferenceId))
                .append(newLine)
                .append("    conferenceName: ")
                .append(toIndentedString(conferenceName))
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
