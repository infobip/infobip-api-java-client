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
 * Represents ViberOutboundTextContent model.
 */
public class ViberOutboundTextContent extends ViberOutboundContent {

    private String text;

    private ViberButton button;

    /**
     * Constructs a new {@link ViberOutboundTextContent} instance.
     */
    public ViberOutboundTextContent() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent. If sending a template, see the [guidance and compliance rules](https://www.infobip.com/docs/viber/business-messages/api#message-template-business-messages-api).
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link ViberOutboundTextContent instance}.
     */
    public ViberOutboundTextContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent. If sending a template, see the [guidance and compliance rules](https://www.infobip.com/docs/viber/business-messages/api#message-template-business-messages-api).
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
     * Content of the message being sent. If sending a template, see the [guidance and compliance rules](https://www.infobip.com/docs/viber/business-messages/api#message-template-business-messages-api).
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
     * Sets button.
     *
     * @param button
     * @return This {@link ViberOutboundTextContent instance}.
     */
    public ViberOutboundTextContent button(ViberButton button) {
        this.button = button;
        return this;
    }

    /**
     * Returns button.
     *
     * @return button
     */
    @JsonProperty("button")
    public ViberButton getButton() {
        return button;
    }

    /**
     * Sets button.
     *
     * @param button
     */
    @JsonProperty("button")
    public void setButton(ViberButton button) {
        this.button = button;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberOutboundTextContent viberOutboundTextContent = (ViberOutboundTextContent) o;
        return Objects.equals(this.text, viberOutboundTextContent.text)
                && Objects.equals(this.button, viberOutboundTextContent.button)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, button, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundTextContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    button: ")
                .append(toIndentedString(button))
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
