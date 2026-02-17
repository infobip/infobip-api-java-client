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
 * Represents CallsPublicConferenceRecording model.
 */
public class CallsPublicConferenceRecording {

    private String conferenceId;

    private String conferenceName;

    private String callsConfigurationId;

    private Platform platform;

    private List<CallsPublicRecordingFile> composedFiles = null;

    private List<CallsPublicRecording> callRecordings = null;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Conference ID.
     *
     * @param conferenceId
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording conferenceId(String conferenceId) {
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
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording conferenceName(String conferenceName) {
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
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @param callsConfigurationId
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording callsConfigurationId(String callsConfigurationId) {
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
     * Sets platform.
     *
     * @param platform
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * Sets composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of all conference participants.
     *
     * @param composedFiles
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording composedFiles(List<CallsPublicRecordingFile> composedFiles) {
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
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording addComposedFilesItem(CallsPublicRecordingFile composedFilesItem) {
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
    public List<CallsPublicRecordingFile> getComposedFiles() {
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
    public void setComposedFiles(List<CallsPublicRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
    }

    /**
     * Sets callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of one conference participant.
     *
     * @param callRecordings
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording callRecordings(List<CallsPublicRecording> callRecordings) {
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
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording addCallRecordingsItem(CallsPublicRecording callRecordingsItem) {
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
    public List<CallsPublicRecording> getCallRecordings() {
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
    public void setCallRecordings(List<CallsPublicRecording> callRecordings) {
        this.callRecordings = callRecordings;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the (first) recording started.
     *
     * @param startTime
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording startTime(OffsetDateTime startTime) {
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
     * @return This {@link CallsPublicConferenceRecording instance}.
     */
    public CallsPublicConferenceRecording endTime(OffsetDateTime endTime) {
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
        CallsPublicConferenceRecording callsPublicConferenceRecording = (CallsPublicConferenceRecording) o;
        return Objects.equals(this.conferenceId, callsPublicConferenceRecording.conferenceId)
                && Objects.equals(this.conferenceName, callsPublicConferenceRecording.conferenceName)
                && Objects.equals(this.callsConfigurationId, callsPublicConferenceRecording.callsConfigurationId)
                && Objects.equals(this.platform, callsPublicConferenceRecording.platform)
                && Objects.equals(this.composedFiles, callsPublicConferenceRecording.composedFiles)
                && Objects.equals(this.callRecordings, callsPublicConferenceRecording.callRecordings)
                && Objects.equals(this.startTime, callsPublicConferenceRecording.startTime)
                && Objects.equals(this.endTime, callsPublicConferenceRecording.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conferenceId,
                conferenceName,
                callsConfigurationId,
                platform,
                composedFiles,
                callRecordings,
                startTime,
                endTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicConferenceRecording {")
                .append(newLine)
                .append("    conferenceId: ")
                .append(toIndentedString(conferenceId))
                .append(newLine)
                .append("    conferenceName: ")
                .append(toIndentedString(conferenceName))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
