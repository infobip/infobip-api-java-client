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
 * Represents WhatsAppBusinessInfoResponse model.
 */
public class WhatsAppBusinessInfoResponse {

    private String about;

    private String address;

    private String description;

    private String email;

    private WhatsAppBusinessVertical vertical;

    private List<String> websites = new ArrayList<>();

    private String displayName;

    /**
     * Sets about.
     * <p>
     * Field description:
     * Manages the content of the sender\\&#39;s **About** section.
     * <p>
     * The field is required.
     *
     * @param about
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse about(String about) {
        this.about = about;
        return this;
    }

    /**
     * Returns about.
     * <p>
     * Field description:
     * Manages the content of the sender\\&#39;s **About** section.
     * <p>
     * The field is required.
     *
     * @return about
     */
    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    /**
     * Sets about.
     * <p>
     * Field description:
     * Manages the content of the sender\\&#39;s **About** section.
     * <p>
     * The field is required.
     *
     * @param about
     */
    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Street address of the business.
     * <p>
     * The field is required.
     *
     * @param address
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * Field description:
     * Street address of the business.
     * <p>
     * The field is required.
     *
     * @return address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Street address of the business.
     * <p>
     * The field is required.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the business.
     * <p>
     * The field is required.
     *
     * @param description
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the business.
     * <p>
     * The field is required.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the business.
     * <p>
     * The field is required.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets email.
     * <p>
     * Field description:
     * Email of the business.
     * <p>
     * The field is required.
     *
     * @param email
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Returns email.
     * <p>
     * Field description:
     * Email of the business.
     * <p>
     * The field is required.
     *
     * @return email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     * <p>
     * Field description:
     * Email of the business.
     * <p>
     * The field is required.
     *
     * @param email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets vertical.
     * <p>
     * The field is required.
     *
     * @param vertical
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse vertical(WhatsAppBusinessVertical vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Returns vertical.
     * <p>
     * The field is required.
     *
     * @return vertical
     */
    @JsonProperty("vertical")
    public WhatsAppBusinessVertical getVertical() {
        return vertical;
    }

    /**
     * Sets vertical.
     * <p>
     * The field is required.
     *
     * @param vertical
     */
    @JsonProperty("vertical")
    public void setVertical(WhatsAppBusinessVertical vertical) {
        this.vertical = vertical;
    }

    /**
     * Sets websites.
     * <p>
     * Field description:
     * Websites of the business.
     * <p>
     * The field is required.
     *
     * @param websites
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse websites(List<String> websites) {
        this.websites = websites;
        return this;
    }

    /**
     * Adds and item into websites.
     * <p>
     * Field description:
     * Websites of the business.
     * <p>
     * The field is required.
     *
     * @param websitesItem The item to be added to the list.
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse addWebsitesItem(String websitesItem) {
        if (this.websites == null) {
            this.websites = new ArrayList<>();
        }
        this.websites.add(websitesItem);
        return this;
    }

    /**
     * Returns websites.
     * <p>
     * Field description:
     * Websites of the business.
     * <p>
     * The field is required.
     *
     * @return websites
     */
    @JsonProperty("websites")
    public List<String> getWebsites() {
        return websites;
    }

    /**
     * Sets websites.
     * <p>
     * Field description:
     * Websites of the business.
     * <p>
     * The field is required.
     *
     * @param websites
     */
    @JsonProperty("websites")
    public void setWebsites(List<String> websites) {
        this.websites = websites;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name of the phone number.
     * <p>
     * The field is required.
     *
     * @param displayName
     * @return This {@link WhatsAppBusinessInfoResponse instance}.
     */
    public WhatsAppBusinessInfoResponse displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Display name of the phone number.
     * <p>
     * The field is required.
     *
     * @return displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name of the phone number.
     * <p>
     * The field is required.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppBusinessInfoResponse whatsAppBusinessInfoResponse = (WhatsAppBusinessInfoResponse) o;
        return Objects.equals(this.about, whatsAppBusinessInfoResponse.about)
                && Objects.equals(this.address, whatsAppBusinessInfoResponse.address)
                && Objects.equals(this.description, whatsAppBusinessInfoResponse.description)
                && Objects.equals(this.email, whatsAppBusinessInfoResponse.email)
                && Objects.equals(this.vertical, whatsAppBusinessInfoResponse.vertical)
                && Objects.equals(this.websites, whatsAppBusinessInfoResponse.websites)
                && Objects.equals(this.displayName, whatsAppBusinessInfoResponse.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(about, address, description, email, vertical, websites, displayName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppBusinessInfoResponse {")
                .append(newLine)
                .append("    about: ")
                .append(toIndentedString(about))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    email: ")
                .append(toIndentedString(email))
                .append(newLine)
                .append("    vertical: ")
                .append(toIndentedString(vertical))
                .append(newLine)
                .append("    websites: ")
                .append(toIndentedString(websites))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
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
