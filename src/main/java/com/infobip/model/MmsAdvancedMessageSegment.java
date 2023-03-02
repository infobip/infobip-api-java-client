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
 * Content of the message being sent.
 */
public class MmsAdvancedMessageSegment {

    private String contentId;

    private String text;

    private String contentType;

    private String contentUrl;

    private String contentBase64;

    private String smil;

    private String uploadedContentId;

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. [a-zA-Z] up to 20 characters.
     *
     * @param contentId
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. [a-zA-Z] up to 20 characters.
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
     * Unique identifier within single message. [a-zA-Z] up to 20 characters.
     *
     * @param contentId
     */
    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Message text.
     *
     * @param text
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Message text.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Message text.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#39;image/png&#39;.
     *
     * @param contentType
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#39;image/png&#39;.
     *
     * @return contentType
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#39;image/png&#39;.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets contentUrl.
     * <p>
     * Field description:
     * URL of externally hosted content.
     *
     * @param contentUrl
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment contentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Returns contentUrl.
     * <p>
     * Field description:
     * URL of externally hosted content.
     *
     * @return contentUrl
     */
    @JsonProperty("contentUrl")
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets contentUrl.
     * <p>
     * Field description:
     * URL of externally hosted content.
     *
     * @param contentUrl
     */
    @JsonProperty("contentUrl")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * Sets contentBase64.
     * <p>
     * Field description:
     * Content in Base64 format.
     *
     * @param contentBase64
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment contentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }

    /**
     * Returns contentBase64.
     * <p>
     * Field description:
     * Content in Base64 format.
     *
     * @return contentBase64
     */
    @JsonProperty("contentBase64")
    public String getContentBase64() {
        return contentBase64;
    }

    /**
     * Sets contentBase64.
     * <p>
     * Field description:
     * Content in Base64 format.
     *
     * @param contentBase64
     */
    @JsonProperty("contentBase64")
    public void setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
    }

    /**
     * Sets smil.
     * <p>
     * Field description:
     * Message segment as SMIL format.
     *
     * @param smil
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment smil(String smil) {
        this.smil = smil;
        return this;
    }

    /**
     * Returns smil.
     * <p>
     * Field description:
     * Message segment as SMIL format.
     *
     * @return smil
     */
    @JsonProperty("smil")
    public String getSmil() {
        return smil;
    }

    /**
     * Sets smil.
     * <p>
     * Field description:
     * Message segment as SMIL format.
     *
     * @param smil
     */
    @JsonProperty("smil")
    public void setSmil(String smil) {
        this.smil = smil;
    }

    /**
     * Sets uploadedContentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content.
     *
     * @param uploadedContentId
     * @return This {@link MmsAdvancedMessageSegment instance}.
     */
    public MmsAdvancedMessageSegment uploadedContentId(String uploadedContentId) {
        this.uploadedContentId = uploadedContentId;
        return this;
    }

    /**
     * Returns uploadedContentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content.
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
        MmsAdvancedMessageSegment mmsAdvancedMessageSegment = (MmsAdvancedMessageSegment) o;
        return Objects.equals(this.contentId, mmsAdvancedMessageSegment.contentId)
                && Objects.equals(this.text, mmsAdvancedMessageSegment.text)
                && Objects.equals(this.contentType, mmsAdvancedMessageSegment.contentType)
                && Objects.equals(this.contentUrl, mmsAdvancedMessageSegment.contentUrl)
                && Objects.equals(this.contentBase64, mmsAdvancedMessageSegment.contentBase64)
                && Objects.equals(this.smil, mmsAdvancedMessageSegment.smil)
                && Objects.equals(this.uploadedContentId, mmsAdvancedMessageSegment.uploadedContentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, text, contentType, contentUrl, contentBase64, smil, uploadedContentId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsAdvancedMessageSegment {")
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    contentUrl: ")
                .append(toIndentedString(contentUrl))
                .append(newLine)
                .append("    contentBase64: ")
                .append(toIndentedString(contentBase64))
                .append(newLine)
                .append("    smil: ")
                .append(toIndentedString(smil))
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
