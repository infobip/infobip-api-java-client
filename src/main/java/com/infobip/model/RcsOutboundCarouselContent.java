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
 * Represents RcsOutboundCarouselContent model.
 */
public class RcsOutboundCarouselContent extends RcsOutboundMessageContent {

    private RcsWidth cardWidth;

    private List<RcsCardContent> contents = new ArrayList<>();

    private List<RcsSuggestion> suggestions = null;

    /**
     * Constructs a new {@link RcsOutboundCarouselContent} instance.
     */
    public RcsOutboundCarouselContent() {
        super("CAROUSEL");
    }

    /**
     * Sets cardWidth.
     * <p>
     * The field is required.
     *
     * @param cardWidth
     * @return This {@link RcsOutboundCarouselContent instance}.
     */
    public RcsOutboundCarouselContent cardWidth(RcsWidth cardWidth) {
        this.cardWidth = cardWidth;
        return this;
    }

    /**
     * Returns cardWidth.
     * <p>
     * The field is required.
     *
     * @return cardWidth
     */
    @JsonProperty("cardWidth")
    public RcsWidth getCardWidth() {
        return cardWidth;
    }

    /**
     * Sets cardWidth.
     * <p>
     * The field is required.
     *
     * @param cardWidth
     */
    @JsonProperty("cardWidth")
    public void setCardWidth(RcsWidth cardWidth) {
        this.cardWidth = cardWidth;
    }

    /**
     * Sets contents.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @param contents
     * @return This {@link RcsOutboundCarouselContent instance}.
     */
    public RcsOutboundCarouselContent contents(List<RcsCardContent> contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Adds and item into contents.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @param contentsItem The item to be added to the list.
     * @return This {@link RcsOutboundCarouselContent instance}.
     */
    public RcsOutboundCarouselContent addContentsItem(RcsCardContent contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    /**
     * Returns contents.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @return contents
     */
    @JsonProperty("contents")
    public List<RcsCardContent> getContents() {
        return contents;
    }

    /**
     * Sets contents.
     * <p>
     * Field description:
     * An array of cards contained within the carousel.
     * <p>
     * The field is required.
     *
     * @param contents
     */
    @JsonProperty("contents")
    public void setContents(List<RcsCardContent> contents) {
        this.contents = contents;
    }

    /**
     * Sets suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @param suggestions
     * @return This {@link RcsOutboundCarouselContent instance}.
     */
    public RcsOutboundCarouselContent suggestions(List<RcsSuggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    /**
     * Adds and item into suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @param suggestionsItem The item to be added to the list.
     * @return This {@link RcsOutboundCarouselContent instance}.
     */
    public RcsOutboundCarouselContent addSuggestionsItem(RcsSuggestion suggestionsItem) {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<>();
        }
        this.suggestions.add(suggestionsItem);
        return this;
    }

    /**
     * Returns suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @return suggestions
     */
    @JsonProperty("suggestions")
    public List<RcsSuggestion> getSuggestions() {
        return suggestions;
    }

    /**
     * Sets suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @param suggestions
     */
    @JsonProperty("suggestions")
    public void setSuggestions(List<RcsSuggestion> suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsOutboundCarouselContent rcsOutboundCarouselContent = (RcsOutboundCarouselContent) o;
        return Objects.equals(this.cardWidth, rcsOutboundCarouselContent.cardWidth)
                && Objects.equals(this.contents, rcsOutboundCarouselContent.contents)
                && Objects.equals(this.suggestions, rcsOutboundCarouselContent.suggestions)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardWidth, contents, suggestions, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundCarouselContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    cardWidth: ")
                .append(toIndentedString(cardWidth))
                .append(newLine)
                .append("    contents: ")
                .append(toIndentedString(contents))
                .append(newLine)
                .append("    suggestions: ")
                .append(toIndentedString(suggestions))
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
