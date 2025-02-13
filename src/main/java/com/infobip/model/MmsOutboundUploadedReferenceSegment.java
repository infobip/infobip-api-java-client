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
 * Represents MmsOutboundUploadedReferenceSegment model.
 */
public class MmsOutboundUploadedReferenceSegment extends MmsOutboundSegment {

    private String contentId;

    private String uploadedContentId;

    /**
     * Constructs a new {@link MmsOutboundUploadedReferenceSegment} instance.
     */
    public MmsOutboundUploadedReferenceSegment() {
        super("UPLOADED_REFERENCE");
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @param contentId
     * @return This {@link MmsOutboundUploadedReferenceSegment instance}.
     */
    public MmsOutboundUploadedReferenceSegment contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @return contentId
     */
    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @param contentId
     */
    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * Sets uploadedContentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content.
     * <p>
     * The field is required.
     *
     * @param uploadedContentId
     * @return This {@link MmsOutboundUploadedReferenceSegment instance}.
     */
    public MmsOutboundUploadedReferenceSegment uploadedContentId(String uploadedContentId) {
        this.uploadedContentId = uploadedContentId;
        return this;
    }

    /**
     * Returns uploadedContentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content.
     * <p>
     * The field is required.
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
     * ID of previously uploaded binary content.
     * <p>
     * The field is required.
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
        MmsOutboundUploadedReferenceSegment mmsOutboundUploadedReferenceSegment =
                (MmsOutboundUploadedReferenceSegment) o;
        return Objects.equals(this.contentId, mmsOutboundUploadedReferenceSegment.contentId)
                && Objects.equals(this.uploadedContentId, mmsOutboundUploadedReferenceSegment.uploadedContentId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, uploadedContentId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsOutboundUploadedReferenceSegment {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
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
