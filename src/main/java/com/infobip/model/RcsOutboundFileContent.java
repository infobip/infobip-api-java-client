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
 * Represents RcsOutboundFileContent model.
 */
public class RcsOutboundFileContent extends RcsOutboundMessageContent {

    private RcsResourceSchema _file;

    private RcsResource thumbnail;

    private List<RcsSuggestion> suggestions = null;

    /**
     * Constructs a new {@link RcsOutboundFileContent} instance.
     */
    public RcsOutboundFileContent() {
        super("FILE");
    }

    /**
     * Sets _file.
     * <p>
     * The field is required.
     *
     * @param _file
     * @return This {@link RcsOutboundFileContent instance}.
     */
    public RcsOutboundFileContent _file(RcsResourceSchema _file) {
        this._file = _file;
        return this;
    }

    /**
     * Returns _file.
     * <p>
     * The field is required.
     *
     * @return _file
     */
    @JsonProperty("file")
    public RcsResourceSchema getFile() {
        return _file;
    }

    /**
     * Sets _file.
     * <p>
     * The field is required.
     *
     * @param _file
     */
    @JsonProperty("file")
    public void setFile(RcsResourceSchema _file) {
        this._file = _file;
    }

    /**
     * Sets thumbnail.
     *
     * @param thumbnail
     * @return This {@link RcsOutboundFileContent instance}.
     */
    public RcsOutboundFileContent thumbnail(RcsResource thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Returns thumbnail.
     *
     * @return thumbnail
     */
    @JsonProperty("thumbnail")
    public RcsResource getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets thumbnail.
     *
     * @param thumbnail
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(RcsResource thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * Sets suggestions.
     * <p>
     * Field description:
     * List of suggestions.
     *
     * @param suggestions
     * @return This {@link RcsOutboundFileContent instance}.
     */
    public RcsOutboundFileContent suggestions(List<RcsSuggestion> suggestions) {
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
     * @return This {@link RcsOutboundFileContent instance}.
     */
    public RcsOutboundFileContent addSuggestionsItem(RcsSuggestion suggestionsItem) {
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
        RcsOutboundFileContent rcsOutboundFileContent = (RcsOutboundFileContent) o;
        return Objects.equals(this._file, rcsOutboundFileContent._file)
                && Objects.equals(this.thumbnail, rcsOutboundFileContent.thumbnail)
                && Objects.equals(this.suggestions, rcsOutboundFileContent.suggestions)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_file, thumbnail, suggestions, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundFileContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    _file: ")
                .append(toIndentedString(_file))
                .append(newLine)
                .append("    thumbnail: ")
                .append(toIndentedString(thumbnail))
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
