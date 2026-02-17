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
 * Dialog recordings.
 */
public class CallsDialogRecordingLog {

    private List<CallsPublicRecordingFile> composedFiles = null;

    private List<CallsPublicRecording> callRecordings = null;

    /**
     * Sets composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of both dialog calls.
     *
     * @param composedFiles
     * @return This {@link CallsDialogRecordingLog instance}.
     */
    public CallsDialogRecordingLog composedFiles(List<CallsPublicRecordingFile> composedFiles) {
        this.composedFiles = composedFiles;
        return this;
    }

    /**
     * Adds and item into composedFiles.
     * <p>
     * Field description:
     * File(s) with a recording of both dialog calls.
     *
     * @param composedFilesItem The item to be added to the list.
     * @return This {@link CallsDialogRecordingLog instance}.
     */
    public CallsDialogRecordingLog addComposedFilesItem(CallsPublicRecordingFile composedFilesItem) {
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
     * File(s) with a recording of both dialog calls.
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
     * File(s) with a recording of both dialog calls.
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
     * File(s) with a recording of individual dialog calls.
     *
     * @param callRecordings
     * @return This {@link CallsDialogRecordingLog instance}.
     */
    public CallsDialogRecordingLog callRecordings(List<CallsPublicRecording> callRecordings) {
        this.callRecordings = callRecordings;
        return this;
    }

    /**
     * Adds and item into callRecordings.
     * <p>
     * Field description:
     * File(s) with a recording of individual dialog calls.
     *
     * @param callRecordingsItem The item to be added to the list.
     * @return This {@link CallsDialogRecordingLog instance}.
     */
    public CallsDialogRecordingLog addCallRecordingsItem(CallsPublicRecording callRecordingsItem) {
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
     * File(s) with a recording of individual dialog calls.
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
     * File(s) with a recording of individual dialog calls.
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
        CallsDialogRecordingLog callsDialogRecordingLog = (CallsDialogRecordingLog) o;
        return Objects.equals(this.composedFiles, callsDialogRecordingLog.composedFiles)
                && Objects.equals(this.callRecordings, callsDialogRecordingLog.callRecordings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(composedFiles, callRecordings);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecordingLog {")
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
