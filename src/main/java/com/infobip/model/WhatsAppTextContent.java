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
public class WhatsAppTextContent {

    private String text;

    private Boolean previewUrl;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppTextContent instance}.
     */
    public WhatsAppTextContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent.
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
     * Content of the message being sent.
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
     * Sets previewUrl.
     * <p>
     * Field description:
     * Allows for URL preview from within the message. If set to &#x60;true&#x60;, the message content must contain a URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Defaults to &#x60;false&#x60;.
     *
     * @param previewUrl
     * @return This {@link WhatsAppTextContent instance}.
     */
    public WhatsAppTextContent previewUrl(Boolean previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    /**
     * Returns previewUrl.
     * <p>
     * Field description:
     * Allows for URL preview from within the message. If set to &#x60;true&#x60;, the message content must contain a URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Defaults to &#x60;false&#x60;.
     *
     * @return previewUrl
     */
    @JsonProperty("previewUrl")
    public Boolean getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Sets previewUrl.
     * <p>
     * Field description:
     * Allows for URL preview from within the message. If set to &#x60;true&#x60;, the message content must contain a URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Defaults to &#x60;false&#x60;.
     *
     * @param previewUrl
     */
    @JsonProperty("previewUrl")
    public void setPreviewUrl(Boolean previewUrl) {
        this.previewUrl = previewUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTextContent whatsAppTextContent = (WhatsAppTextContent) o;
        return Objects.equals(this.text, whatsAppTextContent.text)
                && Objects.equals(this.previewUrl, whatsAppTextContent.previewUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, previewUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTextContent {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    previewUrl: ")
                .append(toIndentedString(previewUrl))
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
