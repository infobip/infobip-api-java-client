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
 * Represents a single template message.
 */
public class MessagesApiTemplateMessage {

    private OutboundTemplateChannel channel;

    private String sender;

    private List<MessagesApiToDestination> destinations = new ArrayList<>();

    private MessagesApiTemplate template;

    private MessagesApiTemplateMessageContent content;

    private MessagesApiMessageOptions options;

    private Webhooks webhooks;

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage channel(OutboundTemplateChannel channel) {
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
    public OutboundTemplateChannel getChannel() {
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
    public void setChannel(OutboundTemplateChannel channel) {
        this.channel = channel;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
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
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
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
     * Sets destinations.
     * <p>
     * Field description:
     * Array of destination objects for where template messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage destinations(List<MessagesApiToDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * Array of destination objects for where template messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage addDestinationsItem(MessagesApiToDestination destinationsItem) {
        if (this.destinations == null) {
            this.destinations = new ArrayList<>();
        }
        this.destinations.add(destinationsItem);
        return this;
    }

    /**
     * Returns destinations.
     * <p>
     * Field description:
     * Array of destination objects for where template messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @return destinations
     */
    @JsonProperty("destinations")
    public List<MessagesApiToDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * Array of destination objects for where template messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     */
    @JsonProperty("destinations")
    public void setDestinations(List<MessagesApiToDestination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Sets template.
     * <p>
     * The field is required.
     *
     * @param template
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage template(MessagesApiTemplate template) {
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
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage content(MessagesApiTemplateMessageContent content) {
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
     * Sets options.
     *
     * @param options
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage options(MessagesApiMessageOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public MessagesApiMessageOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(MessagesApiMessageOptions options) {
        this.options = options;
    }

    /**
     * Sets webhooks.
     *
     * @param webhooks
     * @return This {@link MessagesApiTemplateMessage instance}.
     */
    public MessagesApiTemplateMessage webhooks(Webhooks webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    /**
     * Returns webhooks.
     *
     * @return webhooks
     */
    @JsonProperty("webhooks")
    public Webhooks getWebhooks() {
        return webhooks;
    }

    /**
     * Sets webhooks.
     *
     * @param webhooks
     */
    @JsonProperty("webhooks")
    public void setWebhooks(Webhooks webhooks) {
        this.webhooks = webhooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiTemplateMessage messagesApiTemplateMessage = (MessagesApiTemplateMessage) o;
        return Objects.equals(this.channel, messagesApiTemplateMessage.channel)
                && Objects.equals(this.sender, messagesApiTemplateMessage.sender)
                && Objects.equals(this.destinations, messagesApiTemplateMessage.destinations)
                && Objects.equals(this.template, messagesApiTemplateMessage.template)
                && Objects.equals(this.content, messagesApiTemplateMessage.content)
                && Objects.equals(this.options, messagesApiTemplateMessage.options)
                && Objects.equals(this.webhooks, messagesApiTemplateMessage.webhooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, sender, destinations, template, content, options, webhooks);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateMessage {")
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    destinations: ")
                .append(toIndentedString(destinations))
                .append(newLine)
                .append("    template: ")
                .append(toIndentedString(template))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    webhooks: ")
                .append(toIndentedString(webhooks))
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
