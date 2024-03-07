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
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents MessagesApiRequestMessagesInner model.
 */
@JsonTypeName("MessagesApiRequest_messages_inner")
public class MessagesApiRequestMessagesInner {

    private OutboundTemplateChannel channel;

    private String sender;

    private List<MessagesApiToDestination> destinations = new ArrayList<>();

    private MessagesApiTemplateMessageContent content;

    private MessagesApiMessageOptions options;

    private Webhooks webhooks;

    private List<MessagesApiFailover> failover = null;

    private MessagesApiTemplate template;

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner channel(OutboundTemplateChannel channel) {
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
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner sender(String sender) {
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
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner destinations(List<MessagesApiToDestination> destinations) {
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
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner addDestinationsItem(MessagesApiToDestination destinationsItem) {
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
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner content(MessagesApiTemplateMessageContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public MessagesApiTemplateMessageContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
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
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner options(MessagesApiMessageOptions options) {
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
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner webhooks(Webhooks webhooks) {
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

    /**
     * Sets failover.
     * <p>
     * Field description:
     * Provides options for configuring a message failover. When message fails it will be sent over channels in order specified in an array. Make sure to provide correct sender and destinations specified as &#x60;Channels Destination&#x60; for each channel.
     *
     * @param failover
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner failover(List<MessagesApiFailover> failover) {
        this.failover = failover;
        return this;
    }

    /**
     * Adds and item into failover.
     * <p>
     * Field description:
     * Provides options for configuring a message failover. When message fails it will be sent over channels in order specified in an array. Make sure to provide correct sender and destinations specified as &#x60;Channels Destination&#x60; for each channel.
     *
     * @param failoverItem The item to be added to the list.
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner addFailoverItem(MessagesApiFailover failoverItem) {
        if (this.failover == null) {
            this.failover = new ArrayList<>();
        }
        this.failover.add(failoverItem);
        return this;
    }

    /**
     * Returns failover.
     * <p>
     * Field description:
     * Provides options for configuring a message failover. When message fails it will be sent over channels in order specified in an array. Make sure to provide correct sender and destinations specified as &#x60;Channels Destination&#x60; for each channel.
     *
     * @return failover
     */
    @JsonProperty("failover")
    public List<MessagesApiFailover> getFailover() {
        return failover;
    }

    /**
     * Sets failover.
     * <p>
     * Field description:
     * Provides options for configuring a message failover. When message fails it will be sent over channels in order specified in an array. Make sure to provide correct sender and destinations specified as &#x60;Channels Destination&#x60; for each channel.
     *
     * @param failover
     */
    @JsonProperty("failover")
    public void setFailover(List<MessagesApiFailover> failover) {
        this.failover = failover;
    }

    /**
     * Sets template.
     * <p>
     * The field is required.
     *
     * @param template
     * @return This {@link MessagesApiRequestMessagesInner instance}.
     */
    public MessagesApiRequestMessagesInner template(MessagesApiTemplate template) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiRequestMessagesInner messagesApiRequestMessagesInner = (MessagesApiRequestMessagesInner) o;
        return Objects.equals(this.channel, messagesApiRequestMessagesInner.channel)
                && Objects.equals(this.sender, messagesApiRequestMessagesInner.sender)
                && Objects.equals(this.destinations, messagesApiRequestMessagesInner.destinations)
                && Objects.equals(this.content, messagesApiRequestMessagesInner.content)
                && Objects.equals(this.options, messagesApiRequestMessagesInner.options)
                && Objects.equals(this.webhooks, messagesApiRequestMessagesInner.webhooks)
                && Objects.equals(this.failover, messagesApiRequestMessagesInner.failover)
                && Objects.equals(this.template, messagesApiRequestMessagesInner.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, sender, destinations, content, options, webhooks, failover, template);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiRequestMessagesInner {")
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
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    webhooks: ")
                .append(toIndentedString(webhooks))
                .append(newLine)
                .append("    failover: ")
                .append(toIndentedString(failover))
                .append(newLine)
                .append("    template: ")
                .append(toIndentedString(template))
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
