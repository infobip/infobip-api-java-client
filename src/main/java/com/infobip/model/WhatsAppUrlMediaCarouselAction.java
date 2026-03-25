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
 * Represents WhatsAppUrlMediaCarouselAction model.
 */
public class WhatsAppUrlMediaCarouselAction extends WhatsAppInteractiveMediaCarouselAction {

    private List<WhatsAppUrlMediaCarouselCard> cards = new ArrayList<>();

    /**
     * Constructs a new {@link WhatsAppUrlMediaCarouselAction} instance.
     */
    public WhatsAppUrlMediaCarouselAction() {
        super("URL");
    }

    /**
     * Sets cards.
     * <p>
     * Field description:
     * Carousel cards. Should be defined in the correct order.It can have between two and ten cards.
     * <p>
     * The field is required.
     *
     * @param cards
     * @return This {@link WhatsAppUrlMediaCarouselAction instance}.
     */
    public WhatsAppUrlMediaCarouselAction cards(List<WhatsAppUrlMediaCarouselCard> cards) {
        this.cards = cards;
        return this;
    }

    /**
     * Adds and item into cards.
     * <p>
     * Field description:
     * Carousel cards. Should be defined in the correct order.It can have between two and ten cards.
     * <p>
     * The field is required.
     *
     * @param cardsItem The item to be added to the list.
     * @return This {@link WhatsAppUrlMediaCarouselAction instance}.
     */
    public WhatsAppUrlMediaCarouselAction addCardsItem(WhatsAppUrlMediaCarouselCard cardsItem) {
        if (this.cards == null) {
            this.cards = new ArrayList<>();
        }
        this.cards.add(cardsItem);
        return this;
    }

    /**
     * Returns cards.
     * <p>
     * Field description:
     * Carousel cards. Should be defined in the correct order.It can have between two and ten cards.
     * <p>
     * The field is required.
     *
     * @return cards
     */
    @JsonProperty("cards")
    public List<WhatsAppUrlMediaCarouselCard> getCards() {
        return cards;
    }

    /**
     * Sets cards.
     * <p>
     * Field description:
     * Carousel cards. Should be defined in the correct order.It can have between two and ten cards.
     * <p>
     * The field is required.
     *
     * @param cards
     */
    @JsonProperty("cards")
    public void setCards(List<WhatsAppUrlMediaCarouselCard> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppUrlMediaCarouselAction whatsAppUrlMediaCarouselAction = (WhatsAppUrlMediaCarouselAction) o;
        return Objects.equals(this.cards, whatsAppUrlMediaCarouselAction.cards) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppUrlMediaCarouselAction {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    cards: ")
                .append(toIndentedString(cards))
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
