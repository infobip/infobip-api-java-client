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
 * Opens the user&#39;s default dialer app with the agent-specified phone number filled in.
 */
public class RcsDialPhoneSuggestion extends RcsSuggestion {

    private String text;

    private String postbackData;

    private String phoneNumber;

    /**
     * Constructs a new {@link RcsDialPhoneSuggestion} instance.
     */
    public RcsDialPhoneSuggestion() {
        super("DIAL_PHONE");
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
     * @return This {@link RcsDialPhoneSuggestion instance}.
     */
    public RcsDialPhoneSuggestion text(String text) {
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
     * @return This {@link RcsDialPhoneSuggestion instance}.
     */
    public RcsDialPhoneSuggestion postbackData(String postbackData) {
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

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Valid phone number.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link RcsDialPhoneSuggestion instance}.
     */
    public RcsDialPhoneSuggestion phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Valid phone number.
     * <p>
     * The field is required.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Valid phone number.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsDialPhoneSuggestion rcsDialPhoneSuggestion = (RcsDialPhoneSuggestion) o;
        return Objects.equals(this.text, rcsDialPhoneSuggestion.text)
                && Objects.equals(this.postbackData, rcsDialPhoneSuggestion.postbackData)
                && Objects.equals(this.phoneNumber, rcsDialPhoneSuggestion.phoneNumber)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, postbackData, phoneNumber, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsDialPhoneSuggestion {")
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
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
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
