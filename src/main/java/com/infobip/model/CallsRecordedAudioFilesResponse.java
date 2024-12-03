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
 * Represents CallsRecordedAudioFilesResponse model.
 */
public class CallsRecordedAudioFilesResponse {

    private List<CallsRecordedIvrFile> files = null;

    /**
     * Sets files.
     * <p>
     * Field description:
     * Array of recorded files metadata, one for each recorded file.
     *
     * @param files
     * @return This {@link CallsRecordedAudioFilesResponse instance}.
     */
    public CallsRecordedAudioFilesResponse files(List<CallsRecordedIvrFile> files) {
        this.files = files;
        return this;
    }

    /**
     * Adds and item into files.
     * <p>
     * Field description:
     * Array of recorded files metadata, one for each recorded file.
     *
     * @param filesItem The item to be added to the list.
     * @return This {@link CallsRecordedAudioFilesResponse instance}.
     */
    public CallsRecordedAudioFilesResponse addFilesItem(CallsRecordedIvrFile filesItem) {
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
     * Array of recorded files metadata, one for each recorded file.
     *
     * @return files
     */
    @JsonProperty("files")
    public List<CallsRecordedIvrFile> getFiles() {
        return files;
    }

    /**
     * Sets files.
     * <p>
     * Field description:
     * Array of recorded files metadata, one for each recorded file.
     *
     * @param files
     */
    @JsonProperty("files")
    public void setFiles(List<CallsRecordedIvrFile> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordedAudioFilesResponse callsRecordedAudioFilesResponse = (CallsRecordedAudioFilesResponse) o;
        return Objects.equals(this.files, callsRecordedAudioFilesResponse.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(files);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordedAudioFilesResponse {")
                .append(newLine)
                .append("    files: ")
                .append(toIndentedString(files))
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
