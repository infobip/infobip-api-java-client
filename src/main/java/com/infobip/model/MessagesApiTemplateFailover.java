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
public class MessagesApiTemplateFailover implements MessagesApiBaseFailover {

    private MessagesApiOutboundTemplateChannel channel;

    private String sender;

    private MessagesApiTemplate template;

    private MessagesApiTemplateMessageContent content;

    private MessagesApiValidityPeriod validityPeriod;

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiTemplateFailover instance}.
     */
    public MessagesApiTemplateFailover channel(MessagesApiOutboundTemplateChannel channel) {
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
    public MessagesApiOutboundTemplateChannel getChannel() {
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
    public void setChannel(MessagesApiOutboundTemplateChannel channel) {
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
     * @return This {@link MessagesApiTemplateFailover instance}.
     */
    public MessagesApiTemplateFailover sender(String sender) {
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
     * Sets template.
     * <p>
     * The field is required.
     *
     * @param template
     * @return This {@link MessagesApiTemplateFailover instance}.
     */
    public MessagesApiTemplateFailover template(MessagesApiTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Returns template.
     * <p>
     * The field is required.
     *
     * @return template
     */
    @JsonProperty("template")
    public MessagesApiTemplate getTemplate() {
        return template;
    }

    /**
     * Sets template.
     * <p>
     * The field is required.
     *
     * @param template
     */
    @JsonProperty("template")
    public void setTemplate(MessagesApiTemplate template) {
        this.template = template;
    }

    /**
     * Sets content.
     *
     * @param content
     * @return This {@link MessagesApiTemplateFailover instance}.
     */
    public MessagesApiTemplateFailover content(MessagesApiTemplateMessageContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public MessagesApiTemplateMessageContent getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(MessagesApiTemplateMessageContent content) {
        this.content = content;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link MessagesApiTemplateFailover instance}.
     */
    public MessagesApiTemplateFailover validityPeriod(MessagesApiValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public MessagesApiValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(MessagesApiValidityPeriod validityPeriod) {
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
        MessagesApiTemplateFailover messagesApiTemplateFailover = (MessagesApiTemplateFailover) o;
        return Objects.equals(this.channel, messagesApiTemplateFailover.channel)
                && Objects.equals(this.sender, messagesApiTemplateFailover.sender)
                && Objects.equals(this.template, messagesApiTemplateFailover.template)
                && Objects.equals(this.content, messagesApiTemplateFailover.content)
                && Objects.equals(this.validityPeriod, messagesApiTemplateFailover.validityPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, sender, template, content, validityPeriod);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateFailover {")
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    template: ")
                .append(toIndentedString(template))
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
