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
public class MessagesApiTemplateMessageContent {

    private MessagesApiTemplateHeader header;

    private MessagesApiTemplateBody body;

    private List<MessagesApiTemplateButton> buttons = null;

    private String expirationTime;

    /**
     * Sets header.
     *
     * @param header
     * @return This {@link MessagesApiTemplateMessageContent instance}.
     */
    public MessagesApiTemplateMessageContent header(MessagesApiTemplateHeader header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     *
     * @return header
     */
    @JsonProperty("header")
    public MessagesApiTemplateHeader getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(MessagesApiTemplateHeader header) {
        this.header = header;
    }

    /**
     * Sets body.
     *
     * @param body
     * @return This {@link MessagesApiTemplateMessageContent instance}.
     */
    public MessagesApiTemplateMessageContent body(MessagesApiTemplateBody body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     *
     * @return body
     */
    @JsonProperty("body")
    public MessagesApiTemplateBody getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(MessagesApiTemplateBody body) {
        this.body = body;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons of a template message.
     *
     * @param buttons
     * @return This {@link MessagesApiTemplateMessageContent instance}.
     */
    public MessagesApiTemplateMessageContent buttons(List<MessagesApiTemplateButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * List of buttons of a template message.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link MessagesApiTemplateMessageContent instance}.
     */
    public MessagesApiTemplateMessageContent addButtonsItem(MessagesApiTemplateButton buttonsItem) {
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
     * List of buttons of a template message.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<MessagesApiTemplateButton> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons of a template message.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<MessagesApiTemplateButton> buttons) {
        this.buttons = buttons;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Expiration time of a limited-time offer template message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param expirationTime
     * @return This {@link MessagesApiTemplateMessageContent instance}.
     */
    public MessagesApiTemplateMessageContent expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Returns expirationTime.
     * <p>
     * Field description:
     * Expiration time of a limited-time offer template message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @return expirationTime
     */
    @JsonProperty("expirationTime")
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Expiration time of a limited-time offer template message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param expirationTime
     */
    @JsonProperty("expirationTime")
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiTemplateMessageContent messagesApiTemplateMessageContent = (MessagesApiTemplateMessageContent) o;
        return Objects.equals(this.header, messagesApiTemplateMessageContent.header)
                && Objects.equals(this.body, messagesApiTemplateMessageContent.body)
                && Objects.equals(this.buttons, messagesApiTemplateMessageContent.buttons)
                && Objects.equals(this.expirationTime, messagesApiTemplateMessageContent.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, buttons, expirationTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateMessageContent {")
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
                .append("    expirationTime: ")
                .append(toIndentedString(expirationTime))
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
