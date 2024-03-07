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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Content of the message.
 */
public class MessagesApiMessageContent {

    private MessagesApiMessageHeader header;

    private MessagesApiMessageBody body;

    private List<MessagesApiMessageButton> buttons = null;

    private MessagesApiMessageConfirmationBody confirmationBody;

    /**
     * Sets header.
     *
     * @param header
     * @return This {@link MessagesApiMessageContent instance}.
     */
    public MessagesApiMessageContent header(MessagesApiMessageHeader header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     *
     * @return header
     */
    @JsonProperty("header")
    public MessagesApiMessageHeader getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(MessagesApiMessageHeader header) {
        this.header = header;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link MessagesApiMessageContent instance}.
     */
    public MessagesApiMessageContent body(MessagesApiMessageBody body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     * <p>
     * The field is required.
     *
     * @return body
     */
    @JsonProperty("body")
    public MessagesApiMessageBody getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(MessagesApiMessageBody body) {
        this.body = body;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons for the message.
     *
     * @param buttons
     * @return This {@link MessagesApiMessageContent instance}.
     */
    public MessagesApiMessageContent buttons(List<MessagesApiMessageButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * List of buttons for the message.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageContent instance}.
     */
    public MessagesApiMessageContent addButtonsItem(MessagesApiMessageButton buttonsItem) {
        if (this.buttons == null) {
            this.buttons = new ArrayList<>();
        }
        this.buttons.add(buttonsItem);
        return this;
    }

    /**
     * Returns buttons.
     * <p>
     * Field description:
     * List of buttons for the message.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<MessagesApiMessageButton> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons for the message.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<MessagesApiMessageButton> buttons) {
        this.buttons = buttons;
    }

    /**
     * Sets confirmationBody.
     *
     * @param confirmationBody
     * @return This {@link MessagesApiMessageContent instance}.
     */
    public MessagesApiMessageContent confirmationBody(MessagesApiMessageConfirmationBody confirmationBody) {
        this.confirmationBody = confirmationBody;
        return this;
    }

    /**
     * Returns confirmationBody.
     *
     * @return confirmationBody
     */
    @JsonProperty("confirmationBody")
    public MessagesApiMessageConfirmationBody getConfirmationBody() {
        return confirmationBody;
    }

    /**
     * Sets confirmationBody.
     *
     * @param confirmationBody
     */
    @JsonProperty("confirmationBody")
    public void setConfirmationBody(MessagesApiMessageConfirmationBody confirmationBody) {
        this.confirmationBody = confirmationBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageContent messagesApiMessageContent = (MessagesApiMessageContent) o;
        return Objects.equals(this.header, messagesApiMessageContent.header)
                && Objects.equals(this.body, messagesApiMessageContent.body)
                && Objects.equals(this.buttons, messagesApiMessageContent.buttons)
                && Objects.equals(this.confirmationBody, messagesApiMessageContent.confirmationBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, buttons, confirmationBody);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageContent {")
                .append(newLine)
                .append("    header: ")
                .append(toIndentedString(header))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    buttons: ")
                .append(toIndentedString(buttons))
                .append(newLine)
                .append("    confirmationBody: ")
                .append(toIndentedString(confirmationBody))
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
