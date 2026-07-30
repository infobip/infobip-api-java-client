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
public class EmailMessage {

    private String sender;

    private List<EmailGroupDestination> destinations = new ArrayList<>();

    private EmailMessageContent content;

    private EmailMessageOptions options;

    private EmailWebhooks webhooks;

    private EmailIps ips;

    private List<EmailPlaceholderMasking> placeholdersMasking = null;

    private EmailStorage storage;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Email address with optional sender name.    Note: This field is required if &#x60;templateId&#x60; is not present.
     *
     * @param sender
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Email address with optional sender name.    Note: This field is required if &#x60;templateId&#x60; is not present.
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
     * Email address with optional sender name.    Note: This field is required if &#x60;templateId&#x60; is not present.
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
     * An array of destination objects for where messages are being sent. A valid destination is required.   Note: Maximum number of recipients is 1000 overall including &#x60;to&#x60;, &#x60;cc&#x60; and &#x60;bcc&#x60; field.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage destinations(List<EmailGroupDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.   Note: Maximum number of recipients is 1000 overall including &#x60;to&#x60;, &#x60;cc&#x60; and &#x60;bcc&#x60; field.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage addDestinationsItem(EmailGroupDestination destinationsItem) {
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
     * An array of destination objects for where messages are being sent. A valid destination is required.   Note: Maximum number of recipients is 1000 overall including &#x60;to&#x60;, &#x60;cc&#x60; and &#x60;bcc&#x60; field.
     * <p>
     * The field is required.
     *
     * @return destinations
     */
    @JsonProperty("destinations")
    public List<EmailGroupDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.   Note: Maximum number of recipients is 1000 overall including &#x60;to&#x60;, &#x60;cc&#x60; and &#x60;bcc&#x60; field.
     * <p>
     * The field is required.
     *
     * @param destinations
     */
    @JsonProperty("destinations")
    public void setDestinations(List<EmailGroupDestination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage content(EmailMessageContent content) {
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
    public EmailMessageContent getContent() {
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
    public void setContent(EmailMessageContent content) {
        this.content = content;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage options(EmailMessageOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public EmailMessageOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(EmailMessageOptions options) {
        this.options = options;
    }

    /**
     * Sets webhooks.
     *
     * @param webhooks
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage webhooks(EmailWebhooks webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    /**
     * Returns webhooks.
     *
     * @return webhooks
     */
    @JsonProperty("webhooks")
    public EmailWebhooks getWebhooks() {
        return webhooks;
    }

    /**
     * Sets webhooks.
     *
     * @param webhooks
     */
    @JsonProperty("webhooks")
    public void setWebhooks(EmailWebhooks webhooks) {
        this.webhooks = webhooks;
    }

    /**
     * Sets ips.
     *
     * @param ips
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage ips(EmailIps ips) {
        this.ips = ips;
        return this;
    }

    /**
     * Returns ips.
     *
     * @return ips
     */
    @JsonProperty("ips")
    public EmailIps getIps() {
        return ips;
    }

    /**
     * Sets ips.
     *
     * @param ips
     */
    @JsonProperty("ips")
    public void setIps(EmailIps ips) {
        this.ips = ips;
    }

    /**
     * Sets placeholdersMasking.
     * <p>
     * Field description:
     * Options to full or partially mask placeholders.
     *
     * @param placeholdersMasking
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage placeholdersMasking(List<EmailPlaceholderMasking> placeholdersMasking) {
        this.placeholdersMasking = placeholdersMasking;
        return this;
    }

    /**
     * Adds and item into placeholdersMasking.
     * <p>
     * Field description:
     * Options to full or partially mask placeholders.
     *
     * @param placeholdersMaskingItem The item to be added to the list.
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage addPlaceholdersMaskingItem(EmailPlaceholderMasking placeholdersMaskingItem) {
        if (this.placeholdersMasking == null) {
            this.placeholdersMasking = new ArrayList<>();
        }
        this.placeholdersMasking.add(placeholdersMaskingItem);
        return this;
    }

    /**
     * Returns placeholdersMasking.
     * <p>
     * Field description:
     * Options to full or partially mask placeholders.
     *
     * @return placeholdersMasking
     */
    @JsonProperty("placeholdersMasking")
    public List<EmailPlaceholderMasking> getPlaceholdersMasking() {
        return placeholdersMasking;
    }

    /**
     * Sets placeholdersMasking.
     * <p>
     * Field description:
     * Options to full or partially mask placeholders.
     *
     * @param placeholdersMasking
     */
    @JsonProperty("placeholdersMasking")
    public void setPlaceholdersMasking(List<EmailPlaceholderMasking> placeholdersMasking) {
        this.placeholdersMasking = placeholdersMasking;
    }

    /**
     * Sets storage.
     *
     * @param storage
     * @return This {@link EmailMessage instance}.
     */
    public EmailMessage storage(EmailStorage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Returns storage.
     *
     * @return storage
     */
    @JsonProperty("storage")
    public EmailStorage getStorage() {
        return storage;
    }

    /**
     * Sets storage.
     *
     * @param storage
     */
    @JsonProperty("storage")
    public void setStorage(EmailStorage storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailMessage emailMessage = (EmailMessage) o;
        return Objects.equals(this.sender, emailMessage.sender)
                && Objects.equals(this.destinations, emailMessage.destinations)
                && Objects.equals(this.content, emailMessage.content)
                && Objects.equals(this.options, emailMessage.options)
                && Objects.equals(this.webhooks, emailMessage.webhooks)
                && Objects.equals(this.ips, emailMessage.ips)
                && Objects.equals(this.placeholdersMasking, emailMessage.placeholdersMasking)
                && Objects.equals(this.storage, emailMessage.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, destinations, content, options, webhooks, ips, placeholdersMasking, storage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailMessage {")
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
                .append("    ips: ")
                .append(toIndentedString(ips))
                .append(newLine)
                .append("    placeholdersMasking: ")
                .append(toIndentedString(placeholdersMasking))
                .append(newLine)
                .append("    storage: ")
                .append(toIndentedString(storage))
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
