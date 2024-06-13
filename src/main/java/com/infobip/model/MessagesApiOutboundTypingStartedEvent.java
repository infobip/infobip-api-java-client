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
 * Represents MessagesApiOutboundTypingStartedEvent model.
 */
public class MessagesApiOutboundTypingStartedEvent extends MessagesApiOutboundEvent {

    private MessagesApiOutboundEventChannel channel;

    private String sender;

    private List<MessagesApiToDestination> destinations = new ArrayList<>();

    private MessagesApiEventOptions options;

    /**
     * Constructs a new {@link MessagesApiOutboundTypingStartedEvent} instance.
     */
    public MessagesApiOutboundTypingStartedEvent() {
        super("TYPING_STARTED");
    }

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiOutboundTypingStartedEvent instance}.
     */
    public MessagesApiOutboundTypingStartedEvent channel(MessagesApiOutboundEventChannel channel) {
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
    public MessagesApiOutboundEventChannel getChannel() {
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
    public void setChannel(MessagesApiOutboundEventChannel channel) {
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
     * @return This {@link MessagesApiOutboundTypingStartedEvent instance}.
     */
    public MessagesApiOutboundTypingStartedEvent sender(String sender) {
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
     * Array of destination objects for where events are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link MessagesApiOutboundTypingStartedEvent instance}.
     */
    public MessagesApiOutboundTypingStartedEvent destinations(List<MessagesApiToDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * Array of destination objects for where events are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link MessagesApiOutboundTypingStartedEvent instance}.
     */
    public MessagesApiOutboundTypingStartedEvent addDestinationsItem(MessagesApiToDestination destinationsItem) {
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
     * Array of destination objects for where events are being sent. A valid destination is required.
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
     * Array of destination objects for where events are being sent. A valid destination is required.
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
     * Sets options.
     *
     * @param options
     * @return This {@link MessagesApiOutboundTypingStartedEvent instance}.
     */
    public MessagesApiOutboundTypingStartedEvent options(MessagesApiEventOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public MessagesApiEventOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(MessagesApiEventOptions options) {
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
        MessagesApiOutboundTypingStartedEvent messagesApiOutboundTypingStartedEvent =
                (MessagesApiOutboundTypingStartedEvent) o;
        return Objects.equals(this.channel, messagesApiOutboundTypingStartedEvent.channel)
                && Objects.equals(this.sender, messagesApiOutboundTypingStartedEvent.sender)
                && Objects.equals(this.destinations, messagesApiOutboundTypingStartedEvent.destinations)
                && Objects.equals(this.options, messagesApiOutboundTypingStartedEvent.options)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, sender, destinations, options, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiOutboundTypingStartedEvent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
