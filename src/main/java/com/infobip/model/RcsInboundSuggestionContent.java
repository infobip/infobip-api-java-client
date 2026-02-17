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
import java.util.Objects;

/**
 * Represents RcsInboundSuggestionContent model.
 */
public class RcsInboundSuggestionContent extends RcsInboundMessageContent {

    private String text;

    private String postbackData;

    /**
     * Constructs a new {@link RcsInboundSuggestionContent} instance.
     */
    public RcsInboundSuggestionContent() {
        super("SUGGESTION");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Incoming suggestion text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link RcsInboundSuggestionContent instance}.
     */
    public RcsInboundSuggestionContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Incoming suggestion text.
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
     * Incoming suggestion text.
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
     * Sets postbackData.
     * <p>
     * Field description:
     * PostbackData of incoming suggestion.
     * <p>
     * The field is required.
     *
     * @param postbackData
     * @return This {@link RcsInboundSuggestionContent instance}.
     */
    public RcsInboundSuggestionContent postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * PostbackData of incoming suggestion.
     * <p>
     * The field is required.
     *
     * @return postbackData
     */
    @JsonProperty("postbackData")
    public String getPostbackData() {
        return postbackData;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * PostbackData of incoming suggestion.
     * <p>
     * The field is required.
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsInboundSuggestionContent rcsInboundSuggestionContent = (RcsInboundSuggestionContent) o;
        return Objects.equals(this.text, rcsInboundSuggestionContent.text)
                && Objects.equals(this.postbackData, rcsInboundSuggestionContent.postbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, postbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsInboundSuggestionContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
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
