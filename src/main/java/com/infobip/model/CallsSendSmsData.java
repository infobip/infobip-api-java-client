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
 * Represents CallsSendSmsData model.
 */
public class CallsSendSmsData {

    private String text;

    private String from;

    private String to;

    /**
     * Sets text.
     * <p>
     * Field description:
     * The text of the message that will be sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link CallsSendSmsData instance}.
     */
    public CallsSendSmsData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * The text of the message that will be sent.
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
     * The text of the message that will be sent.
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
     * Sets from.
     * <p>
     * Field description:
     * Represents sender ID and it can be alphanumeric or numeric; alphanumeric sender ID length should be between 3 and 11 characters; numeric sender ID length should be between 3 and 14 characters; the parameter can be constructed using variables
     *
     * @param from
     * @return This {@link CallsSendSmsData instance}.
     */
    public CallsSendSmsData from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Represents sender ID and it can be alphanumeric or numeric; alphanumeric sender ID length should be between 3 and 11 characters; numeric sender ID length should be between 3 and 14 characters; the parameter can be constructed using variables
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Represents sender ID and it can be alphanumeric or numeric; alphanumeric sender ID length should be between 3 and 11 characters; numeric sender ID length should be between 3 and 14 characters; the parameter can be constructed using variables
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Must be a valid E164 MSISDN; the parameter can be constructed using variables
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link CallsSendSmsData instance}.
     */
    public CallsSendSmsData to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Must be a valid E164 MSISDN; the parameter can be constructed using variables
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Must be a valid E164 MSISDN; the parameter can be constructed using variables
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSendSmsData callsSendSmsData = (CallsSendSmsData) o;
        return Objects.equals(this.text, callsSendSmsData.text)
                && Objects.equals(this.from, callsSendSmsData.from)
                && Objects.equals(this.to, callsSendSmsData.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, from, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSendSmsData {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
