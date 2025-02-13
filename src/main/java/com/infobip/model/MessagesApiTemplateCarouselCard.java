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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Carousel cards.
 */
public class MessagesApiTemplateCarouselCard {

    private MessagesApiTemplateCarouselCardHeader header;

    private Map<String, String> body = null;

    private List<MessagesApiCarouselTemplateButton> buttons = null;

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     * @return This {@link MessagesApiTemplateCarouselCard instance}.
     */
    public MessagesApiTemplateCarouselCard header(MessagesApiTemplateCarouselCardHeader header) {
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
    public MessagesApiTemplateCarouselCardHeader getHeader() {
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
    public void setHeader(MessagesApiTemplateCarouselCardHeader header) {
        this.header = header;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * Body of a card.
     *
     * @param body
     * @return This {@link MessagesApiTemplateCarouselCard instance}.
     */
    public MessagesApiTemplateCarouselCard body(Map<String, String> body) {
        this.body = body;
        return this;
    }

    /**
     * Puts and entry into body.
     * <p>
     * Field description:
     * Body of a card.
     *
     * @param key The given key.
     * @param bodyItem The item to be associated with the given key.
     * @return This {@link MessagesApiTemplateCarouselCard instance}.
     */
    public MessagesApiTemplateCarouselCard putBodyItem(String key, String bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    /**
     * Returns body.
     * <p>
     * Field description:
     * Body of a card.
     *
     * @return body
     */
    @JsonProperty("body")
    public Map<String, String> getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * Body of a card.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(Map<String, String> body) {
        this.body = body;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons of a card.
     *
     * @param buttons
     * @return This {@link MessagesApiTemplateCarouselCard instance}.
     */
    public MessagesApiTemplateCarouselCard buttons(List<MessagesApiCarouselTemplateButton> buttons) {
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
     * @return This {@link MessagesApiTemplateCarouselCard instance}.
     */
    public MessagesApiTemplateCarouselCard addButtonsItem(MessagesApiCarouselTemplateButton buttonsItem) {
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
    public List<MessagesApiCarouselTemplateButton> getButtons() {
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
    public void setButtons(List<MessagesApiCarouselTemplateButton> buttons) {
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
        MessagesApiTemplateCarouselCard messagesApiTemplateCarouselCard = (MessagesApiTemplateCarouselCard) o;
        return Objects.equals(this.header, messagesApiTemplateCarouselCard.header)
                && Objects.equals(this.body, messagesApiTemplateCarouselCard.body)
                && Objects.equals(this.buttons, messagesApiTemplateCarouselCard.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateCarouselCard {")
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
