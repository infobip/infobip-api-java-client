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
 * An array of contacts sent in a WhatsApp message.
 */
public class WhatsAppContactContent {

    private List<WhatsAppAddressContent> addresses = null;

    private String birthday;

    private List<WhatsAppEmailContent> emails = null;

    private WhatsAppNameContent name;

    private WhatsAppOrganizationContent org;

    private List<WhatsAppPhoneContent> phones = null;

    private List<WhatsAppUrlContent> urls = null;

    /**
     * Sets addresses.
     * <p>
     * Field description:
     * Array of addresses information.
     *
     * @param addresses
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent addresses(List<WhatsAppAddressContent> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Adds and item into addresses.
     * <p>
     * Field description:
     * Array of addresses information.
     *
     * @param addressesItem The item to be added to the list.
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent addAddressesItem(WhatsAppAddressContent addressesItem) {
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
     * Array of addresses information.
     *
     * @return addresses
     */
    @JsonProperty("addresses")
    public List<WhatsAppAddressContent> getAddresses() {
        return addresses;
    }

    /**
     * Sets addresses.
     * <p>
     * Field description:
     * Array of addresses information.
     *
     * @param addresses
     */
    @JsonProperty("addresses")
    public void setAddresses(List<WhatsAppAddressContent> addresses) {
        this.addresses = addresses;
    }

    /**
     * Sets birthday.
     * <p>
     * Field description:
     * Date of birth in &#x60;YYYY-MM-DD&#x60; format.
     *
     * @param birthday
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Returns birthday.
     * <p>
     * Field description:
     * Date of birth in &#x60;YYYY-MM-DD&#x60; format.
     *
     * @return birthday
     */
    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets birthday.
     * <p>
     * Field description:
     * Date of birth in &#x60;YYYY-MM-DD&#x60; format.
     *
     * @param birthday
     */
    @JsonProperty("birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Sets emails.
     * <p>
     * Field description:
     * Array of emails information.
     *
     * @param emails
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent emails(List<WhatsAppEmailContent> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Adds and item into emails.
     * <p>
     * Field description:
     * Array of emails information.
     *
     * @param emailsItem The item to be added to the list.
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent addEmailsItem(WhatsAppEmailContent emailsItem) {
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
     * Array of emails information.
     *
     * @return emails
     */
    @JsonProperty("emails")
    public List<WhatsAppEmailContent> getEmails() {
        return emails;
    }

    /**
     * Sets emails.
     * <p>
     * Field description:
     * Array of emails information.
     *
     * @param emails
     */
    @JsonProperty("emails")
    public void setEmails(List<WhatsAppEmailContent> emails) {
        this.emails = emails;
    }

    /**
     * Sets name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent name(WhatsAppNameContent name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public WhatsAppNameContent getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(WhatsAppNameContent name) {
        this.name = name;
    }

    /**
     * Sets org.
     *
     * @param org
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent org(WhatsAppOrganizationContent org) {
        this.org = org;
        return this;
    }

    /**
     * Returns org.
     *
     * @return org
     */
    @JsonProperty("org")
    public WhatsAppOrganizationContent getOrg() {
        return org;
    }

    /**
     * Sets org.
     *
     * @param org
     */
    @JsonProperty("org")
    public void setOrg(WhatsAppOrganizationContent org) {
        this.org = org;
    }

    /**
     * Sets phones.
     * <p>
     * Field description:
     * Array of phones information.
     *
     * @param phones
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent phones(List<WhatsAppPhoneContent> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Adds and item into phones.
     * <p>
     * Field description:
     * Array of phones information.
     *
     * @param phonesItem The item to be added to the list.
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent addPhonesItem(WhatsAppPhoneContent phonesItem) {
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
     * Array of phones information.
     *
     * @return phones
     */
    @JsonProperty("phones")
    public List<WhatsAppPhoneContent> getPhones() {
        return phones;
    }

    /**
     * Sets phones.
     * <p>
     * Field description:
     * Array of phones information.
     *
     * @param phones
     */
    @JsonProperty("phones")
    public void setPhones(List<WhatsAppPhoneContent> phones) {
        this.phones = phones;
    }

    /**
     * Sets urls.
     * <p>
     * Field description:
     * Array of urls information.
     *
     * @param urls
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent urls(List<WhatsAppUrlContent> urls) {
        this.urls = urls;
        return this;
    }

    /**
     * Adds and item into urls.
     * <p>
     * Field description:
     * Array of urls information.
     *
     * @param urlsItem The item to be added to the list.
     * @return This {@link WhatsAppContactContent instance}.
     */
    public WhatsAppContactContent addUrlsItem(WhatsAppUrlContent urlsItem) {
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
     * Array of urls information.
     *
     * @return urls
     */
    @JsonProperty("urls")
    public List<WhatsAppUrlContent> getUrls() {
        return urls;
    }

    /**
     * Sets urls.
     * <p>
     * Field description:
     * Array of urls information.
     *
     * @param urls
     */
    @JsonProperty("urls")
    public void setUrls(List<WhatsAppUrlContent> urls) {
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
        WhatsAppContactContent whatsAppContactContent = (WhatsAppContactContent) o;
        return Objects.equals(this.addresses, whatsAppContactContent.addresses)
                && Objects.equals(this.birthday, whatsAppContactContent.birthday)
                && Objects.equals(this.emails, whatsAppContactContent.emails)
                && Objects.equals(this.name, whatsAppContactContent.name)
                && Objects.equals(this.org, whatsAppContactContent.org)
                && Objects.equals(this.phones, whatsAppContactContent.phones)
                && Objects.equals(this.urls, whatsAppContactContent.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, birthday, emails, name, org, phones, urls);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppContactContent {")
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
