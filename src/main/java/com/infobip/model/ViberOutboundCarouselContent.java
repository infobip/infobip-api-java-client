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
 * Represents ViberOutboundCarouselContent model.
 */
public class ViberOutboundCarouselContent extends ViberOutboundContent {

    private String text;

    private List<ViberCarouselCard> cards = new ArrayList<>();

    /**
     * Constructs a new {@link ViberOutboundCarouselContent} instance.
     */
    public ViberOutboundCarouselContent() {
        super("CAROUSEL");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the carousel.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link ViberOutboundCarouselContent instance}.
     */
    public ViberOutboundCarouselContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed alongside the carousel.
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
     * Text to be displayed alongside the carousel.
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
     * Sets cards.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @param cards
     * @return This {@link ViberOutboundCarouselContent instance}.
     */
    public ViberOutboundCarouselContent cards(List<ViberCarouselCard> cards) {
        this.cards = cards;
        return this;
    }

    /**
     * Adds and item into cards.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @param cardsItem The item to be added to the list.
     * @return This {@link ViberOutboundCarouselContent instance}.
     */
    public ViberOutboundCarouselContent addCardsItem(ViberCarouselCard cardsItem) {
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
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @return cards
     */
    @JsonProperty("cards")
    public List<ViberCarouselCard> getCards() {
        return cards;
    }

    /**
     * Sets cards.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @param cards
     */
    @JsonProperty("cards")
    public void setCards(List<ViberCarouselCard> cards) {
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
        ViberOutboundCarouselContent viberOutboundCarouselContent = (ViberOutboundCarouselContent) o;
        return Objects.equals(this.text, viberOutboundCarouselContent.text)
                && Objects.equals(this.cards, viberOutboundCarouselContent.cards)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, cards, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundCarouselContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
