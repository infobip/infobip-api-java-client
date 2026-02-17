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
 * Opens the RCS app&#39;s location chooser so the user can pick a location to send back to the agent.
 */
public class RcsRequestLocationSuggestion extends RcsSuggestion {

    private String text;

    private String postbackData;

    /**
     * Constructs a new {@link RcsRequestLocationSuggestion} instance.
     */
    public RcsRequestLocationSuggestion() {
        super("REQUEST_LOCATION");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Suggestion text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link RcsRequestLocationSuggestion instance}.
     */
    public RcsRequestLocationSuggestion text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Suggestion text.
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
     * Suggestion text.
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
     * Value which is going to be sent as a reply to a suggestion.
     * <p>
     * The field is required.
     *
     * @param postbackData
     * @return This {@link RcsRequestLocationSuggestion instance}.
     */
    public RcsRequestLocationSuggestion postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Value which is going to be sent as a reply to a suggestion.
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
     * Value which is going to be sent as a reply to a suggestion.
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
        RcsRequestLocationSuggestion rcsRequestLocationSuggestion = (RcsRequestLocationSuggestion) o;
        return Objects.equals(this.text, rcsRequestLocationSuggestion.text)
                && Objects.equals(this.postbackData, rcsRequestLocationSuggestion.postbackData)
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
                .append("class RcsRequestLocationSuggestion {")
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
