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
 * Represents CallsFilePlayContent model.
 */
public class CallsFilePlayContent extends CallsPlayContent {

    private String fileId;

    /**
     * Constructs a new {@link CallsFilePlayContent} instance.
     */
    public CallsFilePlayContent() {
        super("FILE");
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * ID of the previously uploaded audio file.
     * <p>
     * The field is required.
     *
     * @param fileId
     * @return This {@link CallsFilePlayContent instance}.
     */
    public CallsFilePlayContent fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Returns fileId.
     * <p>
     * Field description:
     * ID of the previously uploaded audio file.
     * <p>
     * The field is required.
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
     * ID of the previously uploaded audio file.
     * <p>
     * The field is required.
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
        CallsFilePlayContent callsFilePlayContent = (CallsFilePlayContent) o;
        return Objects.equals(this.fileId, callsFilePlayContent.fileId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsFilePlayContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
