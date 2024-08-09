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
 * Represents MessagesApiMessageOpenUrlButton model.
 */
public class MessagesApiMessageOpenUrlButton extends MessagesApiMessageButton {

    private String text;

    private String url;

    /**
     * Constructs a new {@link MessagesApiMessageOpenUrlButton} instance.
     */
    public MessagesApiMessageOpenUrlButton() {
        super("OPEN_URL");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageOpenUrlButton instance}.
     */
    public MessagesApiMessageOpenUrlButton text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     * <p>
     * The field is required.
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
     * Text to be displayed on the button.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL to be opened when clicked on the button.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link MessagesApiMessageOpenUrlButton instance}.
     */
    public MessagesApiMessageOpenUrlButton url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL to be opened when clicked on the button.
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
     * URL to be opened when clicked on the button.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOpenUrlButton messagesApiMessageOpenUrlButton = (MessagesApiMessageOpenUrlButton) o;
        return Objects.equals(this.text, messagesApiMessageOpenUrlButton.text)
                && Objects.equals(this.url, messagesApiMessageOpenUrlButton.url)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOpenUrlButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
