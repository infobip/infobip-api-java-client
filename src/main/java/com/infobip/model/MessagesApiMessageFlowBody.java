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
 * Represents MessagesApiMessageFlowBody model.
 */
public class MessagesApiMessageFlowBody extends MessagesApiMessageBody {

    private String text;

    private String id;

    private String token;

    private String buttonText;

    private MessagesApiMessageFlowMode mode;

    private MessagesApiMessageFlowAction action;

    /**
     * Constructs a new {@link MessagesApiMessageFlowBody} instance.
     */
    public MessagesApiMessageFlowBody() {
        super("FLOW");
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
     * @return This {@link MessagesApiMessageFlowBody instance}.
     */
    public MessagesApiMessageFlowBody text(String text) {
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
     * Sets id.
     * <p>
     * Field description:
     * ID of the flow.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link MessagesApiMessageFlowBody instance}.
     */
    public MessagesApiMessageFlowBody id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * ID of the flow.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * ID of the flow.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets token.
     * <p>
     * Field description:
     * Token of the flow.
     * <p>
     * The field is required.
     *
     * @param token
     * @return This {@link MessagesApiMessageFlowBody instance}.
     */
    public MessagesApiMessageFlowBody token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Returns token.
     * <p>
     * Field description:
     * Token of the flow.
     * <p>
     * The field is required.
     *
     * @return token
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     * <p>
     * Field description:
     * Token of the flow.
     * <p>
     * The field is required.
     *
     * @param token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Sets buttonText.
     * <p>
     * Field description:
     * Button label text.
     * <p>
     * The field is required.
     *
     * @param buttonText
     * @return This {@link MessagesApiMessageFlowBody instance}.
     */
    public MessagesApiMessageFlowBody buttonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    /**
     * Returns buttonText.
     * <p>
     * Field description:
     * Button label text.
     * <p>
     * The field is required.
     *
     * @return buttonText
     */
    @JsonProperty("buttonText")
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Sets buttonText.
     * <p>
     * Field description:
     * Button label text.
     * <p>
     * The field is required.
     *
     * @param buttonText
     */
    @JsonProperty("buttonText")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     * Sets mode.
     *
     * @param mode
     * @return This {@link MessagesApiMessageFlowBody instance}.
     */
    public MessagesApiMessageFlowBody mode(MessagesApiMessageFlowMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Returns mode.
     *
     * @return mode
     */
    @JsonProperty("mode")
    public MessagesApiMessageFlowMode getMode() {
        return mode;
    }

    /**
     * Sets mode.
     *
     * @param mode
     */
    @JsonProperty("mode")
    public void setMode(MessagesApiMessageFlowMode mode) {
        this.mode = mode;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     * @return This {@link MessagesApiMessageFlowBody instance}.
     */
    public MessagesApiMessageFlowBody action(MessagesApiMessageFlowAction action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * The field is required.
     *
     * @return action
     */
    @JsonProperty("action")
    public MessagesApiMessageFlowAction getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(MessagesApiMessageFlowAction action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageFlowBody messagesApiMessageFlowBody = (MessagesApiMessageFlowBody) o;
        return Objects.equals(this.text, messagesApiMessageFlowBody.text)
                && Objects.equals(this.id, messagesApiMessageFlowBody.id)
                && Objects.equals(this.token, messagesApiMessageFlowBody.token)
                && Objects.equals(this.buttonText, messagesApiMessageFlowBody.buttonText)
                && Objects.equals(this.mode, messagesApiMessageFlowBody.mode)
                && Objects.equals(this.action, messagesApiMessageFlowBody.action)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, id, token, buttonText, mode, action, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageFlowBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    token: ")
                .append(toIndentedString(token))
                .append(newLine)
                .append("    buttonText: ")
                .append(toIndentedString(buttonText))
                .append(newLine)
                .append("    mode: ")
                .append(toIndentedString(mode))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
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
