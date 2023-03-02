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
 * Allows you to specify buttons sent in the message.
 */
public class WhatsAppInteractiveButtonsActionContent {

    private List<WhatsAppInteractiveButtonContent> buttons = new ArrayList<>();

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * An array of buttons sent in a message. It can have up to three buttons.
     * <p>
     * The field is required.
     *
     * @param buttons
     * @return This {@link WhatsAppInteractiveButtonsActionContent instance}.
     */
    public WhatsAppInteractiveButtonsActionContent buttons(List<WhatsAppInteractiveButtonContent> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * An array of buttons sent in a message. It can have up to three buttons.
     * <p>
     * The field is required.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveButtonsActionContent instance}.
     */
    public WhatsAppInteractiveButtonsActionContent addButtonsItem(WhatsAppInteractiveButtonContent buttonsItem) {
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
     * An array of buttons sent in a message. It can have up to three buttons.
     * <p>
     * The field is required.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<WhatsAppInteractiveButtonContent> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * An array of buttons sent in a message. It can have up to three buttons.
     * <p>
     * The field is required.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppInteractiveButtonContent> buttons) {
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
        WhatsAppInteractiveButtonsActionContent whatsAppInteractiveButtonsActionContent =
                (WhatsAppInteractiveButtonsActionContent) o;
        return Objects.equals(this.buttons, whatsAppInteractiveButtonsActionContent.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveButtonsActionContent {")
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
