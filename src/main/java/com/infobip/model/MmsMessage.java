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
 * An array of message objects of a single message or multiple messages sent under one bulk ID.
 */
public class MmsMessage {

    private String sender;

    private List<MmsDestination> destinations = new ArrayList<>();

    private MmsOutboundContent content;

    private MmsMessageOptions options;

    private MmsWebhooks webhooks;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link MmsMessage instance}.
     */
    public MmsMessage sender(String sender) {
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
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link MmsMessage instance}.
     */
    public MmsMessage destinations(List<MmsDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link MmsMessage instance}.
     */
    public MmsMessage addDestinationsItem(MmsDestination destinationsItem) {
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
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @return destinations
     */
    @JsonProperty("destinations")
    public List<MmsDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     */
    @JsonProperty("destinations")
    public void setDestinations(List<MmsDestination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link MmsMessage instance}.
     */
    public MmsMessage content(MmsOutboundContent content) {
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
    public MmsOutboundContent getContent() {
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
    public void setContent(MmsOutboundContent content) {
        this.content = content;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link MmsMessage instance}.
     */
    public MmsMessage options(MmsMessageOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public MmsMessageOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(MmsMessageOptions options) {
        this.options = options;
    }

    /**
     * Sets webhooks.
     *
     * @param webhooks
     * @return This {@link MmsMessage instance}.
     */
    public MmsMessage webhooks(MmsWebhooks webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    /**
     * Returns webhooks.
     *
     * @return webhooks
     */
    @JsonProperty("webhooks")
    public MmsWebhooks getWebhooks() {
        return webhooks;
    }

    /**
     * Sets webhooks.
     *
     * @param webhooks
     */
    @JsonProperty("webhooks")
    public void setWebhooks(MmsWebhooks webhooks) {
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
        MmsMessage mmsMessage = (MmsMessage) o;
        return Objects.equals(this.sender, mmsMessage.sender)
                && Objects.equals(this.destinations, mmsMessage.destinations)
                && Objects.equals(this.content, mmsMessage.content)
                && Objects.equals(this.options, mmsMessage.options)
                && Objects.equals(this.webhooks, mmsMessage.webhooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, destinations, content, options, webhooks);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsMessage {")
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
