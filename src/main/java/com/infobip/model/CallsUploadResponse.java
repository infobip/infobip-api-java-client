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
import java.util.Objects;

/**
 * Represents CallsUploadResponse model.
 */
public class CallsUploadResponse {

    private String fileId;

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * Id of the uploaded audio file.
     *
     * @param fileId
     * @return This {@link CallsUploadResponse instance}.
     */
    public CallsUploadResponse fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Returns fileId.
     * <p>
     * Field description:
     * Id of the uploaded audio file.
     *
     * @return fileId
     */
    @JsonProperty("fileId")
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * Id of the uploaded audio file.
     *
     * @param fileId
     */
    @JsonProperty("fileId")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsUploadResponse callsUploadResponse = (CallsUploadResponse) o;
        return Objects.equals(this.fileId, callsUploadResponse.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsUploadResponse {")
                .append(newLine)
                .append("    fileId: ")
                .append(toIndentedString(fileId))
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
