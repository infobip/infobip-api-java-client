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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Conference recordings.
 */
public class CallsConferenceRecordingLog {

    private List<CallsPublicRecordingFile> composedFiles = null;

    private List<CallsPublicRecording> callRecordings = null;

    /**
     * Sets composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of all conference participants.
     *
     * @param composedFiles
     * @return This {@link CallsConferenceRecordingLog instance}.
     */
    public CallsConferenceRecordingLog composedFiles(List<CallsPublicRecordingFile> composedFiles) {
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
     * @return This {@link CallsConferenceRecordingLog instance}.
     */
    public CallsConferenceRecordingLog addComposedFilesItem(CallsPublicRecordingFile composedFilesItem) {
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
     * @return This {@link CallsConferenceRecordingLog instance}.
     */
    public CallsConferenceRecordingLog callRecordings(List<CallsPublicRecording> callRecordings) {
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
     * @return This {@link CallsConferenceRecordingLog instance}.
     */
    public CallsConferenceRecordingLog addCallRecordingsItem(CallsPublicRecording callRecordingsItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConferenceRecordingLog callsConferenceRecordingLog = (CallsConferenceRecordingLog) o;
        return Objects.equals(this.composedFiles, callsConferenceRecordingLog.composedFiles)
                && Objects.equals(this.callRecordings, callsConferenceRecordingLog.callRecordings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(composedFiles, callRecordings);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceRecordingLog {")
                .append(newLine)
                .append("    composedFiles: ")
                .append(toIndentedString(composedFiles))
                .append(newLine)
                .append("    callRecordings: ")
                .append(toIndentedString(callRecordings))
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
