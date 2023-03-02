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
 * The content object to build a message that will be sent.
 */
public class WhatsAppDocumentContent {

    private String mediaUrl;

    private String caption;

    private String filename;

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a document sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Maximum document size is 100MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link WhatsAppDocumentContent instance}.
     */
    public WhatsAppDocumentContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of a document sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Maximum document size is 100MB.
     * <p>
     * The field is required.
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a document sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Maximum document size is 100MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Sets caption.
     * <p>
     * Field description:
     * Caption of the document.
     *
     * @param caption
     * @return This {@link WhatsAppDocumentContent instance}.
     */
    public WhatsAppDocumentContent caption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Returns caption.
     * <p>
     * Field description:
     * Caption of the document.
     *
     * @return caption
     */
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     * <p>
     * Field description:
     * Caption of the document.
     *
     * @param caption
     */
    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Sets filename.
     * <p>
     * Field description:
     * File name of the document.
     *
     * @param filename
     * @return This {@link WhatsAppDocumentContent instance}.
     */
    public WhatsAppDocumentContent filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Returns filename.
     * <p>
     * Field description:
     * File name of the document.
     *
     * @return filename
     */
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    /**
     * Sets filename.
     * <p>
     * Field description:
     * File name of the document.
     *
     * @param filename
     */
    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppDocumentContent whatsAppDocumentContent = (WhatsAppDocumentContent) o;
        return Objects.equals(this.mediaUrl, whatsAppDocumentContent.mediaUrl)
                && Objects.equals(this.caption, whatsAppDocumentContent.caption)
                && Objects.equals(this.filename, whatsAppDocumentContent.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaUrl, caption, filename);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppDocumentContent {")
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    caption: ")
                .append(toIndentedString(caption))
                .append(newLine)
                .append("    filename: ")
                .append(toIndentedString(filename))
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
