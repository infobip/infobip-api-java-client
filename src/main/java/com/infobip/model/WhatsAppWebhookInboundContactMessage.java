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

    private List<WhatsAppWebhookContact> contacts = null;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundContactMessage} instance.
     */
    public WhatsAppWebhookInboundContactMessage() {
        super("CONTACT");
    }

    /**
     * Sets contacts.
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
     *
     * @return contacts
     */
    @JsonProperty("contacts")
    public List<WhatsAppWebhookContact> getContacts() {
        return contacts;
    }

    /**
     * Sets contacts.
     *
     * @param contacts
     */
    @JsonProperty("contacts")
    public void setContacts(List<WhatsAppWebhookContact> contacts) {
        this.contacts = contacts;
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
        return Objects.equals(this.contacts, whatsAppWebhookInboundContactMessage.contacts) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts, super.hashCode());
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
