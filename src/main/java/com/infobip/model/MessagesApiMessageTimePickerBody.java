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
 * Represents MessagesApiMessageTimePickerBody model.
 */
public class MessagesApiMessageTimePickerBody extends MessagesApiMessageBody {

    private String text;

    private String subtext;

    private String imageUrl;

    private MessagesApiMessageTimePickerEvent event;

    /**
     * Constructs a new {@link MessagesApiMessageTimePickerBody} instance.
     */
    public MessagesApiMessageTimePickerBody() {
        super("TIME_PICKER");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageTimePickerBody instance}.
     */
    public MessagesApiMessageTimePickerBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be sent.
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
     * Text to be sent.
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
     * Sets subtext.
     * <p>
     * Field description:
     * Subtext to be sent.
     *
     * @param subtext
     * @return This {@link MessagesApiMessageTimePickerBody instance}.
     */
    public MessagesApiMessageTimePickerBody subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    /**
     * Returns subtext.
     * <p>
     * Field description:
     * Subtext to be sent.
     *
     * @return subtext
     */
    @JsonProperty("subtext")
    public String getSubtext() {
        return subtext;
    }

    /**
     * Sets subtext.
     * <p>
     * Field description:
     * Subtext to be sent.
     *
     * @param subtext
     */
    @JsonProperty("subtext")
    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of the image.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageTimePickerBody instance}.
     */
    public MessagesApiMessageTimePickerBody imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * URL of the image.
     *
     * @return imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of the image.
     *
     * @param imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Sets event.
     * <p>
     * The field is required.
     *
     * @param event
     * @return This {@link MessagesApiMessageTimePickerBody instance}.
     */
    public MessagesApiMessageTimePickerBody event(MessagesApiMessageTimePickerEvent event) {
        this.event = event;
        return this;
    }

    /**
     * Returns event.
     * <p>
     * The field is required.
     *
     * @return event
     */
    @JsonProperty("event")
    public MessagesApiMessageTimePickerEvent getEvent() {
        return event;
    }

    /**
     * Sets event.
     * <p>
     * The field is required.
     *
     * @param event
     */
    @JsonProperty("event")
    public void setEvent(MessagesApiMessageTimePickerEvent event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageTimePickerBody messagesApiMessageTimePickerBody = (MessagesApiMessageTimePickerBody) o;
        return Objects.equals(this.text, messagesApiMessageTimePickerBody.text)
                && Objects.equals(this.subtext, messagesApiMessageTimePickerBody.subtext)
                && Objects.equals(this.imageUrl, messagesApiMessageTimePickerBody.imageUrl)
                && Objects.equals(this.event, messagesApiMessageTimePickerBody.event)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, subtext, imageUrl, event, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageTimePickerBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    subtext: ")
                .append(toIndentedString(subtext))
                .append(newLine)
                .append("    imageUrl: ")
                .append(toIndentedString(imageUrl))
                .append(newLine)
                .append("    event: ")
                .append(toIndentedString(event))
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
