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
 * Represents WhatsAppWebhookInboundContactMessage model.
 */
public class WhatsAppWebhookInboundContactMessage extends WhatsAppWebhookInboundMessage {

    private List<WhatsAppWebhookContact> contacts = new ArrayList<>();

    private WhatsAppContext context;

    private WhatsAppWebhookReferral referral;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundContactMessage} instance.
     */
    public WhatsAppWebhookInboundContactMessage() {
        super("CONTACT");
    }

    /**
     * Sets contacts.
     * <p>
     * Field description:
     * An array of contacts sent in a WhatsApp message.
     * <p>
     * The field is required.
     *
     * @param contacts
     * @return This {@link WhatsAppWebhookInboundContactMessage instance}.
     */
    public WhatsAppWebhookInboundContactMessage contacts(List<WhatsAppWebhookContact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * Adds and item into contacts.
     * <p>
     * Field description:
     * An array of contacts sent in a WhatsApp message.
     * <p>
     * The field is required.
     *
     * @param contactsItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookInboundContactMessage instance}.
     */
    public WhatsAppWebhookInboundContactMessage addContactsItem(WhatsAppWebhookContact contactsItem) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contactsItem);
        return this;
    }

    /**
     * Returns contacts.
     * <p>
     * Field description:
     * An array of contacts sent in a WhatsApp message.
     * <p>
     * The field is required.
     *
     * @return contacts
     */
    @JsonProperty("contacts")
    public List<WhatsAppWebhookContact> getContacts() {
        return contacts;
    }

    /**
     * Sets contacts.
     * <p>
     * Field description:
     * An array of contacts sent in a WhatsApp message.
     * <p>
     * The field is required.
     *
     * @param contacts
     */
    @JsonProperty("contacts")
    public void setContacts(List<WhatsAppWebhookContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundContactMessage instance}.
     */
    public WhatsAppWebhookInboundContactMessage context(WhatsAppContext context) {
        this.context = context;
        return this;
    }

    /**
     * Returns context.
     *
     * @return context
     */
    @JsonProperty("context")
    public WhatsAppContext getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context
     */
    @JsonProperty("context")
    public void setContext(WhatsAppContext context) {
        this.context = context;
    }

    /**
     * Sets referral.
     *
     * @param referral
     * @return This {@link WhatsAppWebhookInboundContactMessage instance}.
     */
    public WhatsAppWebhookInboundContactMessage referral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
        return this;
    }

    /**
     * Returns referral.
     *
     * @return referral
     */
    @JsonProperty("referral")
    public WhatsAppWebhookReferral getReferral() {
        return referral;
    }

    /**
     * Sets referral.
     *
     * @param referral
     */
    @JsonProperty("referral")
    public void setReferral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundContactMessage whatsAppWebhookInboundContactMessage =
                (WhatsAppWebhookInboundContactMessage) o;
        return Objects.equals(this.contacts, whatsAppWebhookInboundContactMessage.contacts)
                && Objects.equals(this.context, whatsAppWebhookInboundContactMessage.context)
                && Objects.equals(this.referral, whatsAppWebhookInboundContactMessage.referral)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts, context, referral, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundContactMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    contacts: ")
                .append(toIndentedString(contacts))
                .append(newLine)
                .append("    context: ")
                .append(toIndentedString(context))
                .append(newLine)
                .append("    referral: ")
                .append(toIndentedString(referral))
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
