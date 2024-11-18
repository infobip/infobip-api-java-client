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
 * Represents MessagesApiMessageRequestLocationButton model.
 */
public class MessagesApiMessageRequestLocationButton extends MessagesApiMessageButton {

    private String text;

    private String postbackData;

    /**
     * Constructs a new {@link MessagesApiMessageRequestLocationButton} instance.
     */
    public MessagesApiMessageRequestLocationButton() {
        super("REQUEST_LOCATION");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     *
     * @param text
     * @return This {@link MessagesApiMessageRequestLocationButton instance}.
     */
    public MessagesApiMessageRequestLocationButton text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
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
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when user reply to a message.
     *
     * @param postbackData
     * @return This {@link MessagesApiMessageRequestLocationButton instance}.
     */
    public MessagesApiMessageRequestLocationButton postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when user reply to a message.
     *
     * @return postbackData
     */
    @JsonProperty("postbackData")
    public String getPostbackData() {
        return postbackData;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when user reply to a message.
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageRequestLocationButton messagesApiMessageRequestLocationButton =
                (MessagesApiMessageRequestLocationButton) o;
        return Objects.equals(this.text, messagesApiMessageRequestLocationButton.text)
                && Objects.equals(this.postbackData, messagesApiMessageRequestLocationButton.postbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, postbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageRequestLocationButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
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
