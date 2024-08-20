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
 * Represents SmsRequestEnvelope model.
 */
public class SmsRequestEnvelope {

    private List<SmsMessage> messages = new ArrayList<>();

    private SmsMessageRequestOptions options;

    /**
     * Sets messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @param messages
     * @return This {@link SmsRequestEnvelope instance}.
     */
    public SmsRequestEnvelope messages(List<SmsMessage> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link SmsRequestEnvelope instance}.
     */
    public SmsRequestEnvelope addMessagesItem(SmsMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * Returns messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<SmsMessage> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<SmsMessage> messages) {
        this.messages = messages;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link SmsRequestEnvelope instance}.
     */
    public SmsRequestEnvelope options(SmsMessageRequestOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public SmsMessageRequestOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(SmsMessageRequestOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsRequestEnvelope smsRequestEnvelope = (SmsRequestEnvelope) o;
        return Objects.equals(this.messages, smsRequestEnvelope.messages)
                && Objects.equals(this.options, smsRequestEnvelope.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsRequestEnvelope {")
                .append(newLine)
                .append("    messages: ")
                .append(toIndentedString(messages))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
