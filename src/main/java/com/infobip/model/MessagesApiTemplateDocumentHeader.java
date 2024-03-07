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
 * Represents MessagesApiTemplateDocumentHeader model.
 */
public class MessagesApiTemplateDocumentHeader extends MessagesApiTemplateHeader {

    private String url;

    private String filename;

    /**
     * Constructs a new {@link MessagesApiTemplateDocumentHeader} instance.
     */
    public MessagesApiTemplateDocumentHeader() {
        super("DOCUMENT");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of a document.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link MessagesApiTemplateDocumentHeader instance}.
     */
    public MessagesApiTemplateDocumentHeader url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of a document.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of a document.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets filename.
     * <p>
     * Field description:
     * Name of the file which will be used to display in message.
     * <p>
     * The field is required.
     *
     * @param filename
     * @return This {@link MessagesApiTemplateDocumentHeader instance}.
     */
    public MessagesApiTemplateDocumentHeader filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Returns filename.
     * <p>
     * Field description:
     * Name of the file which will be used to display in message.
     * <p>
     * The field is required.
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
     * Name of the file which will be used to display in message.
     * <p>
     * The field is required.
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
        MessagesApiTemplateDocumentHeader messagesApiTemplateDocumentHeader = (MessagesApiTemplateDocumentHeader) o;
        return Objects.equals(this.url, messagesApiTemplateDocumentHeader.url)
                && Objects.equals(this.filename, messagesApiTemplateDocumentHeader.filename)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, filename, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateDocumentHeader {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
