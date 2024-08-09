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
 * List of cards.
 */
public class WhatsAppCardApiData {

    private WhatsAppHeaderApiData header;

    private WhatsAppBodyApiData body;

    private List<WhatsAppButtonApiData> buttons = new ArrayList<>();

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     * @return This {@link WhatsAppCardApiData instance}.
     */
    public WhatsAppCardApiData header(WhatsAppHeaderApiData header) {
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
    public WhatsAppHeaderApiData getHeader() {
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
    public void setHeader(WhatsAppHeaderApiData header) {
        this.header = header;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppCardApiData instance}.
     */
    public WhatsAppCardApiData body(WhatsAppBodyApiData body) {
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
    public WhatsAppBodyApiData getBody() {
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
    public void setBody(WhatsAppBodyApiData body) {
        this.body = body;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Card buttons. Can contain 1 to 2 buttons.
     * <p>
     * The field is required.
     *
     * @param buttons
     * @return This {@link WhatsAppCardApiData instance}.
     */
    public WhatsAppCardApiData buttons(List<WhatsAppButtonApiData> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * Card buttons. Can contain 1 to 2 buttons.
     * <p>
     * The field is required.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppCardApiData instance}.
     */
    public WhatsAppCardApiData addButtonsItem(WhatsAppButtonApiData buttonsItem) {
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
     * Card buttons. Can contain 1 to 2 buttons.
     * <p>
     * The field is required.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<WhatsAppButtonApiData> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Card buttons. Can contain 1 to 2 buttons.
     * <p>
     * The field is required.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppButtonApiData> buttons) {
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
        WhatsAppCardApiData whatsAppCardApiData = (WhatsAppCardApiData) o;
        return Objects.equals(this.header, whatsAppCardApiData.header)
                && Objects.equals(this.body, whatsAppCardApiData.body)
                && Objects.equals(this.buttons, whatsAppCardApiData.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCardApiData {")
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
