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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents WhatsAppWebhookContact model.
 */
public class WhatsAppWebhookContact {

    private List<WhatsAppWebhookAddress> addresses = null;

    private OffsetDateTime birthday;

    private List<WhatsAppWebhookEmail> emails = null;

    private WhatsAppWebhookName name;

    private WhatsAppWebhookOrganization org;

    private List<WhatsAppWebhookPhone> phones = null;

    private List<WhatsAppWebhookUrl> urls = null;

    /**
     * Sets addresses.
     * <p>
     * Field description:
     * Address information.
     *
     * @param addresses
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact addresses(List<WhatsAppWebhookAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Adds and item into addresses.
     * <p>
     * Field description:
     * Address information.
     *
     * @param addressesItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact addAddressesItem(WhatsAppWebhookAddress addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Returns addresses.
     * <p>
     * Field description:
     * Address information.
     *
     * @return addresses
     */
    @JsonProperty("addresses")
    public List<WhatsAppWebhookAddress> getAddresses() {
        return addresses;
    }

    /**
     * Sets addresses.
     * <p>
     * Field description:
     * Address information.
     *
     * @param addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<WhatsAppWebhookAddress> addresses) {
        this.addresses = addresses;
    }

    /**
     * Sets birthday.
     * <p>
     * Field description:
     * Birthday information, YYYY-MM-DD formatted string.
     *
     * @param birthday
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact birthday(OffsetDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Returns birthday.
     * <p>
     * Field description:
     * Birthday information, YYYY-MM-DD formatted string.
     *
     * @return birthday
     */
    @JsonProperty("birthday")
    public OffsetDateTime getBirthday() {
        return birthday;
    }

    /**
     * Sets birthday.
     * <p>
     * Field description:
     * Birthday information, YYYY-MM-DD formatted string.
     *
     * @param birthday
     */
    @JsonProperty("birthday")
    public void setBirthday(OffsetDateTime birthday) {
        this.birthday = birthday;
    }

    /**
     * Sets emails.
     * <p>
     * Field description:
     * Email information.
     *
     * @param emails
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact emails(List<WhatsAppWebhookEmail> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Adds and item into emails.
     * <p>
     * Field description:
     * Email information.
     *
     * @param emailsItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact addEmailsItem(WhatsAppWebhookEmail emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
     * Returns emails.
     * <p>
     * Field description:
     * Email information.
     *
     * @return emails
     */
    @JsonProperty("emails")
    public List<WhatsAppWebhookEmail> getEmails() {
        return emails;
    }

    /**
     * Sets emails.
     * <p>
     * Field description:
     * Email information.
     *
     * @param emails
     */
    @JsonProperty("emails")
    public void setEmails(List<WhatsAppWebhookEmail> emails) {
        this.emails = emails;
    }

    /**
     * Sets name.
     *
     * @param name
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact name(WhatsAppWebhookName name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     *
     * @return name
     */
    @JsonProperty("name")
    public WhatsAppWebhookName getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(WhatsAppWebhookName name) {
        this.name = name;
    }

    /**
     * Sets org.
     *
     * @param org
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact org(WhatsAppWebhookOrganization org) {
        this.org = org;
        return this;
    }

    /**
     * Returns org.
     *
     * @return org
     */
    @JsonProperty("org")
    public WhatsAppWebhookOrganization getOrg() {
        return org;
    }

    /**
     * Sets org.
     *
     * @param org
     */
    @JsonProperty("org")
    public void setOrg(WhatsAppWebhookOrganization org) {
        this.org = org;
    }

    /**
     * Sets phones.
     * <p>
     * Field description:
     * Phone information.
     *
     * @param phones
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact phones(List<WhatsAppWebhookPhone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Adds and item into phones.
     * <p>
     * Field description:
     * Phone information.
     *
     * @param phonesItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact addPhonesItem(WhatsAppWebhookPhone phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    /**
     * Returns phones.
     * <p>
     * Field description:
     * Phone information.
     *
     * @return phones
     */
    @JsonProperty("phones")
    public List<WhatsAppWebhookPhone> getPhones() {
        return phones;
    }

    /**
     * Sets phones.
     * <p>
     * Field description:
     * Phone information.
     *
     * @param phones
     */
    @JsonProperty("phones")
    public void setPhones(List<WhatsAppWebhookPhone> phones) {
        this.phones = phones;
    }

    /**
     * Sets urls.
     * <p>
     * Field description:
     * URL information.
     *
     * @param urls
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact urls(List<WhatsAppWebhookUrl> urls) {
        this.urls = urls;
        return this;
    }

    /**
     * Adds and item into urls.
     * <p>
     * Field description:
     * URL information.
     *
     * @param urlsItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookContact instance}.
     */
    public WhatsAppWebhookContact addUrlsItem(WhatsAppWebhookUrl urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    /**
     * Returns urls.
     * <p>
     * Field description:
     * URL information.
     *
     * @return urls
     */
    @JsonProperty("urls")
    public List<WhatsAppWebhookUrl> getUrls() {
        return urls;
    }

    /**
     * Sets urls.
     * <p>
     * Field description:
     * URL information.
     *
     * @param urls
     */
    @JsonProperty("urls")
    public void setUrls(List<WhatsAppWebhookUrl> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookContact whatsAppWebhookContact = (WhatsAppWebhookContact) o;
        return Objects.equals(this.addresses, whatsAppWebhookContact.addresses)
                && Objects.equals(this.birthday, whatsAppWebhookContact.birthday)
                && Objects.equals(this.emails, whatsAppWebhookContact.emails)
                && Objects.equals(this.name, whatsAppWebhookContact.name)
                && Objects.equals(this.org, whatsAppWebhookContact.org)
                && Objects.equals(this.phones, whatsAppWebhookContact.phones)
                && Objects.equals(this.urls, whatsAppWebhookContact.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, birthday, emails, name, org, phones, urls);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookContact {")
                .append(newLine)
                .append("    addresses: ")
                .append(toIndentedString(addresses))
                .append(newLine)
                .append("    birthday: ")
                .append(toIndentedString(birthday))
                .append(newLine)
                .append("    emails: ")
                .append(toIndentedString(emails))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    org: ")
                .append(toIndentedString(org))
                .append(newLine)
                .append("    phones: ")
                .append(toIndentedString(phones))
                .append(newLine)
                .append("    urls: ")
                .append(toIndentedString(urls))
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
