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
 * Represents MessagesApiMessageDocumentBody model.
 */
public class MessagesApiMessageDocumentBody extends MessagesApiMessageBody {

    private String url;

    private String text;

    private String filename;

    /**
     * Constructs a new {@link MessagesApiMessageDocumentBody} instance.
     */
    public MessagesApiMessageDocumentBody() {
        super("DOCUMENT");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the document.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link MessagesApiMessageDocumentBody instance}.
     */
    public MessagesApiMessageDocumentBody url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the document.
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
     * URL of the document.
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
     * Sets text.
     * <p>
     * Field description:
     * Document caption.
     *
     * @param text
     * @return This {@link MessagesApiMessageDocumentBody instance}.
     */
    public MessagesApiMessageDocumentBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Document caption.
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
     * Document caption.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets filename.
     * <p>
     * Field description:
     * Document filename.
     *
     * @param filename
     * @return This {@link MessagesApiMessageDocumentBody instance}.
     */
    public MessagesApiMessageDocumentBody filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Returns filename.
     * <p>
     * Field description:
     * Document filename.
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
     * Document filename.
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
        MessagesApiMessageDocumentBody messagesApiMessageDocumentBody = (MessagesApiMessageDocumentBody) o;
        return Objects.equals(this.url, messagesApiMessageDocumentBody.url)
                && Objects.equals(this.text, messagesApiMessageDocumentBody.text)
                && Objects.equals(this.filename, messagesApiMessageDocumentBody.filename)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, text, filename, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageDocumentBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
