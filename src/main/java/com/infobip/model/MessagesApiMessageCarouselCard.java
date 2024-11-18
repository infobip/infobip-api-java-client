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
 * Carousel cards.
 */
public class MessagesApiMessageCarouselCard {

    private MessagesApiMessageCarouselCardBody body;

    private List<MessagesApiMessageButton> buttons = null;

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link MessagesApiMessageCarouselCard instance}.
     */
    public MessagesApiMessageCarouselCard body(MessagesApiMessageCarouselCardBody body) {
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
    public MessagesApiMessageCarouselCardBody getBody() {
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
    public void setBody(MessagesApiMessageCarouselCardBody body) {
        this.body = body;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons of a card.
     *
     * @param buttons
     * @return This {@link MessagesApiMessageCarouselCard instance}.
     */
    public MessagesApiMessageCarouselCard buttons(List<MessagesApiMessageButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * List of buttons of a card.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageCarouselCard instance}.
     */
    public MessagesApiMessageCarouselCard addButtonsItem(MessagesApiMessageButton buttonsItem) {
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
     * List of buttons of a card.
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
     * List of buttons of a card.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<MessagesApiMessageButton> buttons) {
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
        MessagesApiMessageCarouselCard messagesApiMessageCarouselCard = (MessagesApiMessageCarouselCard) o;
        return Objects.equals(this.body, messagesApiMessageCarouselCard.body)
                && Objects.equals(this.buttons, messagesApiMessageCarouselCard.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageCarouselCard {")
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
