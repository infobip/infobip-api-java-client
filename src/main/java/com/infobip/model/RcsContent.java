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
 * Represents RcsContent model.
 */
public class RcsContent {

    private String text;

    private String mediaUrl;

    private RcsCard card;

    private List<RcsCard> carousel;

    private List<RcsSuggestedAction> suggestedActions;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text content of the RCS message.
     *
     * @param text
     * @return This {@link RcsContent instance}.
     */
    public RcsContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text content of the RCS message.
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
     * Text content of the RCS message.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the media file to attach (image, video, audio).
     *
     * @param mediaUrl
     * @return This {@link RcsContent instance}.
     */
    public RcsContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of the media file to attach (image, video, audio).
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the media file to attach (image, video, audio).
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Sets card.
     * <p>
     * Field description:
     * Rich card content.
     *
     * @param card
     * @return This {@link RcsContent instance}.
     */
    public RcsContent card(RcsCard card) {
        this.card = card;
        return this;
    }

    /**
     * Returns card.
     * <p>
     * Field description:
     * Rich card content.
     *
     * @return card
     */
    @JsonProperty("card")
    public RcsCard getCard() {
        return card;
    }

    /**
     * Sets card.
     * <p>
     * Field description:
     * Rich card content.
     *
     * @param card
     */
    @JsonProperty("card")
    public void setCard(RcsCard card) {
        this.card = card;
    }

    /**
     * Sets carousel.
     * <p>
     * Field description:
     * Carousel of rich cards.
     *
     * @param carousel
     * @return This {@link RcsContent instance}.
     */
    public RcsContent carousel(List<RcsCard> carousel) {
        this.carousel = carousel;
        return this;
    }

    /**
     * Adds and item into carousel.
     * <p>
     * Field description:
     * Carousel of rich cards.
     *
     * @param carouselItem The item to be added to the list.
     * @return This {@link RcsContent instance}.
     */
    public RcsContent addCarouselItem(RcsCard carouselItem) {
        if (this.carousel == null) {
            this.carousel = new ArrayList<>();
        }
        this.carousel.add(carouselItem);
        return this;
    }

    /**
     * Returns carousel.
     * <p>
     * Field description:
     * Carousel of rich cards.
     *
     * @return carousel
     */
    @JsonProperty("carousel")
    public List<RcsCard> getCarousel() {
        return carousel;
    }

    /**
     * Sets carousel.
     * <p>
     * Field description:
     * Carousel of rich cards.
     *
     * @param carousel
     */
    @JsonProperty("carousel")
    public void setCarousel(List<RcsCard> carousel) {
        this.carousel = carousel;
    }

    /**
     * Sets suggestedActions.
     * <p>
     * Field description:
     * List of suggested actions for the user.
     *
     * @param suggestedActions
     * @return This {@link RcsContent instance}.
     */
    public RcsContent suggestedActions(List<RcsSuggestedAction> suggestedActions) {
        this.suggestedActions = suggestedActions;
        return this;
    }

    /**
     * Adds and item into suggestedActions.
     * <p>
     * Field description:
     * List of suggested actions for the user.
     *
     * @param suggestedActionsItem The item to be added to the list.
     * @return This {@link RcsContent instance}.
     */
    public RcsContent addSuggestedActionsItem(RcsSuggestedAction suggestedActionsItem) {
        if (this.suggestedActions == null) {
            this.suggestedActions = new ArrayList<>();
        }
        this.suggestedActions.add(suggestedActionsItem);
        return this;
    }

    /**
     * Returns suggestedActions.
     * <p>
     * Field description:
     * List of suggested actions for the user.
     *
     * @return suggestedActions
     */
    @JsonProperty("suggestedActions")
    public List<RcsSuggestedAction> getSuggestedActions() {
        return suggestedActions;
    }

    /**
     * Sets suggestedActions.
     * <p>
     * Field description:
     * List of suggested actions for the user.
     *
     * @param suggestedActions
     */
    @JsonProperty("suggestedActions")
    public void setSuggestedActions(List<RcsSuggestedAction> suggestedActions) {
        this.suggestedActions = suggestedActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsContent rcsContent = (RcsContent) o;
        return Objects.equals(this.text, rcsContent.text)
                && Objects.equals(this.mediaUrl, rcsContent.mediaUrl)
                && Objects.equals(this.card, rcsContent.card)
                && Objects.equals(this.carousel, rcsContent.carousel)
                && Objects.equals(this.suggestedActions, rcsContent.suggestedActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, mediaUrl, card, carousel, suggestedActions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsContent {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    card: ")
                .append(toIndentedString(card))
                .append(newLine)
                .append("    carousel: ")
                .append(toIndentedString(carousel))
                .append(newLine)
                .append("    suggestedActions: ")
                .append(toIndentedString(suggestedActions))
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
