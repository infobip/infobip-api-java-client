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
 * Represents RcsOutboundTextContent model.
 */
public class RcsOutboundTextContent extends RcsOutboundMessageContent {

    private String text;

    private List<RcsSuggestion> suggestions = null;

    /**
     * Constructs a new {@link RcsOutboundTextContent} instance.
     */
    public RcsOutboundTextContent() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Message text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link RcsOutboundTextContent instance}.
     */
    public RcsOutboundTextContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Message text.
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
     * Message text.
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
     * Sets suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @param suggestions
     * @return This {@link RcsOutboundTextContent instance}.
     */
    public RcsOutboundTextContent suggestions(List<RcsSuggestion> suggestions) {
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
     * @return This {@link RcsOutboundTextContent instance}.
     */
    public RcsOutboundTextContent addSuggestionsItem(RcsSuggestion suggestionsItem) {
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
        RcsOutboundTextContent rcsOutboundTextContent = (RcsOutboundTextContent) o;
        return Objects.equals(this.text, rcsOutboundTextContent.text)
                && Objects.equals(this.suggestions, rcsOutboundTextContent.suggestions)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, suggestions, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundTextContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
