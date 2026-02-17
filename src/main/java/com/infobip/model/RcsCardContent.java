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
 * Object containing contents of an RCS card. Must contain media or title to be valid.
 */
public class RcsCardContent {

    private String title;

    private String description;

    private RcsCardMedia media;

    private List<RcsSuggestion> suggestions = null;

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the card, displayed as bolded text.
     *
     * @param title
     * @return This {@link RcsCardContent instance}.
     */
    public RcsCardContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the card, displayed as bolded text.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the card, displayed as bolded text.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the card, displayed as regular text.
     *
     * @param description
     * @return This {@link RcsCardContent instance}.
     */
    public RcsCardContent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the card, displayed as regular text.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the card, displayed as regular text.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets media.
     *
     * @param media
     * @return This {@link RcsCardContent instance}.
     */
    public RcsCardContent media(RcsCardMedia media) {
        this.media = media;
        return this;
    }

    /**
     * Returns media.
     *
     * @return media
     */
    @JsonProperty("media")
    public RcsCardMedia getMedia() {
        return media;
    }

    /**
     * Sets media.
     *
     * @param media
     */
    @JsonProperty("media")
    public void setMedia(RcsCardMedia media) {
        this.media = media;
    }

    /**
     * Sets suggestions.
     * <p>
     * Field description:
     * List of button suggestions that will be sent in card.
     *
     * @param suggestions
     * @return This {@link RcsCardContent instance}.
     */
    public RcsCardContent suggestions(List<RcsSuggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    /**
     * Adds and item into suggestions.
     * <p>
     * Field description:
     * List of button suggestions that will be sent in card.
     *
     * @param suggestionsItem The item to be added to the list.
     * @return This {@link RcsCardContent instance}.
     */
    public RcsCardContent addSuggestionsItem(RcsSuggestion suggestionsItem) {
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
     * List of button suggestions that will be sent in card.
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
     * List of button suggestions that will be sent in card.
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
        RcsCardContent rcsCardContent = (RcsCardContent) o;
        return Objects.equals(this.title, rcsCardContent.title)
                && Objects.equals(this.description, rcsCardContent.description)
                && Objects.equals(this.media, rcsCardContent.media)
                && Objects.equals(this.suggestions, rcsCardContent.suggestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, media, suggestions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCardContent {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    media: ")
                .append(toIndentedString(media))
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
