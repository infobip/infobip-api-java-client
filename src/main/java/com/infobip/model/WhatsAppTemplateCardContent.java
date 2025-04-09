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
 * Carousel cards. Should be defined in the correct order. It can have between one and ten cards.
 */
public class WhatsAppTemplateCardContent {

    private WhatsAppTemplateHeaderContent header;

    private WhatsAppTemplateBodyContent body;

    private List<WhatsAppTemplateButtonContent> buttons = null;

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     * @return This {@link WhatsAppTemplateCardContent instance}.
     */
    public WhatsAppTemplateCardContent header(WhatsAppTemplateHeaderContent header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     * <p>
     * The field is required.
     *
     * @return header
     */
    @JsonProperty("header")
    public WhatsAppTemplateHeaderContent getHeader() {
        return header;
    }

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(WhatsAppTemplateHeaderContent header) {
        this.header = header;
    }

    /**
     * Sets body.
     *
     * @param body
     * @return This {@link WhatsAppTemplateCardContent instance}.
     */
    public WhatsAppTemplateCardContent body(WhatsAppTemplateBodyContent body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     *
     * @return body
     */
    @JsonProperty("body")
    public WhatsAppTemplateBodyContent getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(WhatsAppTemplateBodyContent body) {
        this.body = body;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Card buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60; or &#x60;dynamic URL&#x60; buttons have been registered.
     *
     * @param buttons
     * @return This {@link WhatsAppTemplateCardContent instance}.
     */
    public WhatsAppTemplateCardContent buttons(List<WhatsAppTemplateButtonContent> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * Card buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60; or &#x60;dynamic URL&#x60; buttons have been registered.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppTemplateCardContent instance}.
     */
    public WhatsAppTemplateCardContent addButtonsItem(WhatsAppTemplateButtonContent buttonsItem) {
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
     * Card buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60; or &#x60;dynamic URL&#x60; buttons have been registered.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<WhatsAppTemplateButtonContent> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Card buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60; or &#x60;dynamic URL&#x60; buttons have been registered.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppTemplateButtonContent> buttons) {
        this.buttons = buttons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateCardContent whatsAppTemplateCardContent = (WhatsAppTemplateCardContent) o;
        return Objects.equals(this.header, whatsAppTemplateCardContent.header)
                && Objects.equals(this.body, whatsAppTemplateCardContent.body)
                && Objects.equals(this.buttons, whatsAppTemplateCardContent.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateCardContent {")
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
