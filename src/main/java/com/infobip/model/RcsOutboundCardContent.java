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
 * Represents RcsOutboundCardContent model.
 */
public class RcsOutboundCardContent extends RcsOutboundMessageContent {

    private RcsOrientation orientation;

    private RcsAlignment alignment;

    private RcsCardContent content;

    private List<RcsSuggestion> suggestions = null;

    /**
     * Constructs a new {@link RcsOutboundCardContent} instance.
     */
    public RcsOutboundCardContent() {
        super("CARD");
    }

    /**
     * Sets orientation.
     * <p>
     * The field is required.
     *
     * @param orientation
     * @return This {@link RcsOutboundCardContent instance}.
     */
    public RcsOutboundCardContent orientation(RcsOrientation orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Returns orientation.
     * <p>
     * The field is required.
     *
     * @return orientation
     */
    @JsonProperty("orientation")
    public RcsOrientation getOrientation() {
        return orientation;
    }

    /**
     * Sets orientation.
     * <p>
     * The field is required.
     *
     * @param orientation
     */
    @JsonProperty("orientation")
    public void setOrientation(RcsOrientation orientation) {
        this.orientation = orientation;
    }

    /**
     * Sets alignment.
     * <p>
     * The field is required.
     *
     * @param alignment
     * @return This {@link RcsOutboundCardContent instance}.
     */
    public RcsOutboundCardContent alignment(RcsAlignment alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Returns alignment.
     * <p>
     * The field is required.
     *
     * @return alignment
     */
    @JsonProperty("alignment")
    public RcsAlignment getAlignment() {
        return alignment;
    }

    /**
     * Sets alignment.
     * <p>
     * The field is required.
     *
     * @param alignment
     */
    @JsonProperty("alignment")
    public void setAlignment(RcsAlignment alignment) {
        this.alignment = alignment;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link RcsOutboundCardContent instance}.
     */
    public RcsOutboundCardContent content(RcsCardContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public RcsCardContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(RcsCardContent content) {
        this.content = content;
    }

    /**
     * Sets suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @param suggestions
     * @return This {@link RcsOutboundCardContent instance}.
     */
    public RcsOutboundCardContent suggestions(List<RcsSuggestion> suggestions) {
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
     * @return This {@link RcsOutboundCardContent instance}.
     */
    public RcsOutboundCardContent addSuggestionsItem(RcsSuggestion suggestionsItem) {
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
        RcsOutboundCardContent rcsOutboundCardContent = (RcsOutboundCardContent) o;
        return Objects.equals(this.orientation, rcsOutboundCardContent.orientation)
                && Objects.equals(this.alignment, rcsOutboundCardContent.alignment)
                && Objects.equals(this.content, rcsOutboundCardContent.content)
                && Objects.equals(this.suggestions, rcsOutboundCardContent.suggestions)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation, alignment, content, suggestions, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundCardContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    orientation: ")
                .append(toIndentedString(orientation))
                .append(newLine)
                .append("    alignment: ")
                .append(toIndentedString(alignment))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
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
