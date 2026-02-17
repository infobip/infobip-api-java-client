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
 * Recording metadata
 */
public class CallRoutingRecordingMetadata {

    private List<CallRoutingRecordedFile> composedFiles = null;

    private List<CallRoutingCallRecording> callRecordings = null;

    /**
     * Sets composedFiles.
     * <p>
     * Field description:
     * Composed recording files.
     *
     * @param composedFiles
     * @return This {@link CallRoutingRecordingMetadata instance}.
     */
    public CallRoutingRecordingMetadata composedFiles(List<CallRoutingRecordedFile> composedFiles) {
        this.composedFiles = composedFiles;
        return this;
    }

    /**
     * Adds and item into composedFiles.
     * <p>
     * Field description:
     * Composed recording files.
     *
     * @param composedFilesItem The item to be added to the list.
     * @return This {@link CallRoutingRecordingMetadata instance}.
     */
    public CallRoutingRecordingMetadata addComposedFilesItem(CallRoutingRecordedFile composedFilesItem) {
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
     * Composed recording files.
     *
     * @return composedFiles
     */
    @JsonProperty("composedFiles")
    public List<CallRoutingRecordedFile> getComposedFiles() {
        return composedFiles;
    }

    /**
     * Sets composedFiles.
     * <p>
     * Field description:
     * Composed recording files.
     *
     * @param composedFiles
     */
    @JsonProperty("composedFiles")
    public void setComposedFiles(List<CallRoutingRecordedFile> composedFiles) {
        this.composedFiles = composedFiles;
    }

    /**
     * Sets callRecordings.
     * <p>
     * Field description:
     * Call recording data.
     *
     * @param callRecordings
     * @return This {@link CallRoutingRecordingMetadata instance}.
     */
    public CallRoutingRecordingMetadata callRecordings(List<CallRoutingCallRecording> callRecordings) {
        this.callRecordings = callRecordings;
        return this;
    }

    /**
     * Adds and item into callRecordings.
     * <p>
     * Field description:
     * Call recording data.
     *
     * @param callRecordingsItem The item to be added to the list.
     * @return This {@link CallRoutingRecordingMetadata instance}.
     */
    public CallRoutingRecordingMetadata addCallRecordingsItem(CallRoutingCallRecording callRecordingsItem) {
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
     * Call recording data.
     *
     * @return callRecordings
     */
    @JsonProperty("callRecordings")
    public List<CallRoutingCallRecording> getCallRecordings() {
        return callRecordings;
    }

    /**
     * Sets callRecordings.
     * <p>
     * Field description:
     * Call recording data.
     *
     * @param callRecordings
     */
    @JsonProperty("callRecordings")
    public void setCallRecordings(List<CallRoutingCallRecording> callRecordings) {
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
        CallRoutingRecordingMetadata callRoutingRecordingMetadata = (CallRoutingRecordingMetadata) o;
        return Objects.equals(this.composedFiles, callRoutingRecordingMetadata.composedFiles)
                && Objects.equals(this.callRecordings, callRoutingRecordingMetadata.callRecordings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(composedFiles, callRecordings);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecordingMetadata {")
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
