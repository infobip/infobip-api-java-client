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
 * Template carousel.
 */
public class WhatsAppCarouselApiData {

    private List<WhatsAppCardApiData> cards = new ArrayList<>();

    /**
     * Sets cards.
     * <p>
     * Field description:
     * List of cards.
     * <p>
     * The field is required.
     *
     * @param cards
     * @return This {@link WhatsAppCarouselApiData instance}.
     */
    public WhatsAppCarouselApiData cards(List<WhatsAppCardApiData> cards) {
        this.cards = cards;
        return this;
    }

    /**
     * Adds and item into cards.
     * <p>
     * Field description:
     * List of cards.
     * <p>
     * The field is required.
     *
     * @param cardsItem The item to be added to the list.
     * @return This {@link WhatsAppCarouselApiData instance}.
     */
    public WhatsAppCarouselApiData addCardsItem(WhatsAppCardApiData cardsItem) {
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
     * List of cards.
     * <p>
     * The field is required.
     *
     * @return cards
     */
    @JsonProperty("cards")
    public List<WhatsAppCardApiData> getCards() {
        return cards;
    }

    /**
     * Sets cards.
     * <p>
     * Field description:
     * List of cards.
     * <p>
     * The field is required.
     *
     * @param cards
     */
    @JsonProperty("cards")
    public void setCards(List<WhatsAppCardApiData> cards) {
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
        WhatsAppCarouselApiData whatsAppCarouselApiData = (WhatsAppCarouselApiData) o;
        return Objects.equals(this.cards, whatsAppCarouselApiData.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCarouselApiData {")
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
