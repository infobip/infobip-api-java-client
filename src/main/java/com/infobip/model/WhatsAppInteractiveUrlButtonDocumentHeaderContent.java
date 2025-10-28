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
 * Represents WhatsAppInteractiveUrlButtonDocumentHeaderContent model.
 */
public class WhatsAppInteractiveUrlButtonDocumentHeaderContent extends WhatsAppInteractiveUrlButtonHeaderContent {

    private String mediaUrl;

    private String filename;

    /**
     * Constructs a new {@link WhatsAppInteractiveUrlButtonDocumentHeaderContent} instance.
     */
    public WhatsAppInteractiveUrlButtonDocumentHeaderContent() {
        super("DOCUMENT");
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a document sent in the header of a message containing one or more [interactive elements](https://www.infobip.com/docs/whatsapp/message-types-and-templates/free-form-messages#available-interactive-formats). Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported document types are &#x60;PDF&#x60;, &#x60;TXT&#x60;, &#x60;XLS&#x60;, &#x60;XLSX&#x60;, &#x60;DOC&#x60;, &#x60;DOCX&#x60;, &#x60;PPT&#x60;, &#x60;PPTX&#x60;. Maximum document size is 100MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link WhatsAppInteractiveUrlButtonDocumentHeaderContent instance}.
     */
    public WhatsAppInteractiveUrlButtonDocumentHeaderContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of a document sent in the header of a message containing one or more [interactive elements](https://www.infobip.com/docs/whatsapp/message-types-and-templates/free-form-messages#available-interactive-formats). Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported document types are &#x60;PDF&#x60;, &#x60;TXT&#x60;, &#x60;XLS&#x60;, &#x60;XLSX&#x60;, &#x60;DOC&#x60;, &#x60;DOCX&#x60;, &#x60;PPT&#x60;, &#x60;PPTX&#x60;. Maximum document size is 100MB.
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
     * URL of a document sent in the header of a message containing one or more [interactive elements](https://www.infobip.com/docs/whatsapp/message-types-and-templates/free-form-messages#available-interactive-formats). Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported document types are &#x60;PDF&#x60;, &#x60;TXT&#x60;, &#x60;XLS&#x60;, &#x60;XLSX&#x60;, &#x60;DOC&#x60;, &#x60;DOCX&#x60;, &#x60;PPT&#x60;, &#x60;PPTX&#x60;. Maximum document size is 100MB.
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
     * Sets filename.
     * <p>
     * Field description:
     * Filename of the document.
     *
     * @param filename
     * @return This {@link WhatsAppInteractiveUrlButtonDocumentHeaderContent instance}.
     */
    public WhatsAppInteractiveUrlButtonDocumentHeaderContent filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Returns filename.
     * <p>
     * Field description:
     * Filename of the document.
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
     * Filename of the document.
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
        WhatsAppInteractiveUrlButtonDocumentHeaderContent whatsAppInteractiveUrlButtonDocumentHeaderContent =
                (WhatsAppInteractiveUrlButtonDocumentHeaderContent) o;
        return Objects.equals(this.mediaUrl, whatsAppInteractiveUrlButtonDocumentHeaderContent.mediaUrl)
                && Objects.equals(this.filename, whatsAppInteractiveUrlButtonDocumentHeaderContent.filename)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaUrl, filename, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveUrlButtonDocumentHeaderContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
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
