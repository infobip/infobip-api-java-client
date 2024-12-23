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
 * Configuration of a single failover step
 */
public class MessagesApiFailover implements MessagesApiBaseFailover {

    private MessagesApiOutboundMessageChannel channel;

    private String sender;

    private MessagesApiMessageContent content;

    private ValidityPeriod validityPeriod;

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiFailover instance}.
     */
    public MessagesApiFailover channel(MessagesApiOutboundMessageChannel channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     * <p>
     * The field is required.
     *
     * @return channel
     */
    @JsonProperty("channel")
    public MessagesApiOutboundMessageChannel getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(MessagesApiOutboundMessageChannel channel) {
        this.channel = channel;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender for channel specified above.
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link MessagesApiFailover instance}.
     */
    public MessagesApiFailover sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Sender for channel specified above.
     * <p>
     * The field is required.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender for channel specified above.
     * <p>
     * The field is required.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets content.
     *
     * @param content
     * @return This {@link MessagesApiFailover instance}.
     */
    public MessagesApiFailover content(MessagesApiMessageContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public MessagesApiMessageContent getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(MessagesApiMessageContent content) {
        this.content = content;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link MessagesApiFailover instance}.
     */
    public MessagesApiFailover validityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public ValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiFailover messagesApiFailover = (MessagesApiFailover) o;
        return Objects.equals(this.channel, messagesApiFailover.channel)
                && Objects.equals(this.sender, messagesApiFailover.sender)
                && Objects.equals(this.content, messagesApiFailover.content)
                && Objects.equals(this.validityPeriod, messagesApiFailover.validityPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, sender, content, validityPeriod);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiFailover {")
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
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
