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
 * The content object to build a message that will be sent.
 */
public class WhatsAppContactsContent {

    private List<WhatsAppContactContent> contacts = new ArrayList<>();

    /**
     * Sets contacts.
     * <p>
     * Field description:
     * An array of contacts sent in a WhatsApp message.
     * <p>
     * The field is required.
     *
     * @param contacts
     * @return This {@link WhatsAppContactsContent instance}.
     */
    public WhatsAppContactsContent contacts(List<WhatsAppContactContent> contacts) {
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
     * @return This {@link WhatsAppContactsContent instance}.
     */
    public WhatsAppContactsContent addContactsItem(WhatsAppContactContent contactsItem) {
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
    public List<WhatsAppContactContent> getContacts() {
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
    public void setContacts(List<WhatsAppContactContent> contacts) {
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
        WhatsAppContactsContent whatsAppContactsContent = (WhatsAppContactsContent) o;
        return Objects.equals(this.contacts, whatsAppContactsContent.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppContactsContent {")
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
