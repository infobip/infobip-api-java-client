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
 * Represents MmsUploadBinaryResult model.
 */
public class MmsUploadBinaryResult {

    private String uploadedContentId;

    /**
     * Sets uploadedContentId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the uploaded content.
     *
     * @param uploadedContentId
     * @return This {@link MmsUploadBinaryResult instance}.
     */
    public MmsUploadBinaryResult uploadedContentId(String uploadedContentId) {
        this.uploadedContentId = uploadedContentId;
        return this;
    }

    /**
     * Returns uploadedContentId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the uploaded content.
     *
     * @return uploadedContentId
     */
    @JsonProperty("uploadedContentId")
    public String getUploadedContentId() {
        return uploadedContentId;
    }

    /**
     * Sets uploadedContentId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the uploaded content.
     *
     * @param uploadedContentId
     */
    @JsonProperty("uploadedContentId")
    public void setUploadedContentId(String uploadedContentId) {
        this.uploadedContentId = uploadedContentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsUploadBinaryResult mmsUploadBinaryResult = (MmsUploadBinaryResult) o;
        return Objects.equals(this.uploadedContentId, mmsUploadBinaryResult.uploadedContentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadedContentId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsUploadBinaryResult {")
                .append(newLine)
                .append("    uploadedContentId: ")
                .append(toIndentedString(uploadedContentId))
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
