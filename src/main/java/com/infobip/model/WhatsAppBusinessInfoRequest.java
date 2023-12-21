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
 * Represents WhatsAppBusinessInfoRequest model.
 */
public class WhatsAppBusinessInfoRequest {

    private String about;

    private String address;

    private String description;

    private String email;

    private WhatsAppBusinessVertical vertical;

    private List<String> websites = null;

    private String logoUrl;

    /**
     * Sets about.
     * <p>
     * Field description:
     * Manages the content of the sender\\&#39;s **About** section.
     *
     * @param about
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest about(String about) {
        this.about = about;
        return this;
    }

    /**
     * Returns about.
     * <p>
     * Field description:
     * Manages the content of the sender\\&#39;s **About** section.
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
     *
     * @param address
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * Field description:
     * Street address of the business.
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
     *
     * @param description
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the business.
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
     *
     * @param email
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Returns email.
     * <p>
     * Field description:
     * Email of the business.
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
     *
     * @param email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets vertical.
     *
     * @param vertical
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest vertical(WhatsAppBusinessVertical vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Returns vertical.
     *
     * @return vertical
     */
    @JsonProperty("vertical")
    public WhatsAppBusinessVertical getVertical() {
        return vertical;
    }

    /**
     * Sets vertical.
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
     *
     * @param websites
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest websites(List<String> websites) {
        this.websites = websites;
        return this;
    }

    /**
     * Adds and item into websites.
     * <p>
     * Field description:
     * Websites of the business.
     *
     * @param websitesItem The item to be added to the list.
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest addWebsitesItem(String websitesItem) {
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
     *
     * @param websites
     */
    @JsonProperty("websites")
    public void setWebsites(List<String> websites) {
        this.websites = websites;
    }

    /**
     * Sets logoUrl.
     * <p>
     * Field description:
     * URL of the business&#39; logo. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported logo types are &#x60;JPEG&#x60;, &#x60;PNG&#x60;. Log file should be at least 192x192 pixels and at most 640x640 pixels.
     *
     * @param logoUrl
     * @return This {@link WhatsAppBusinessInfoRequest instance}.
     */
    public WhatsAppBusinessInfoRequest logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * Returns logoUrl.
     * <p>
     * Field description:
     * URL of the business&#39; logo. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported logo types are &#x60;JPEG&#x60;, &#x60;PNG&#x60;. Log file should be at least 192x192 pixels and at most 640x640 pixels.
     *
     * @return logoUrl
     */
    @JsonProperty("logoUrl")
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets logoUrl.
     * <p>
     * Field description:
     * URL of the business&#39; logo. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported logo types are &#x60;JPEG&#x60;, &#x60;PNG&#x60;. Log file should be at least 192x192 pixels and at most 640x640 pixels.
     *
     * @param logoUrl
     */
    @JsonProperty("logoUrl")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppBusinessInfoRequest whatsAppBusinessInfoRequest = (WhatsAppBusinessInfoRequest) o;
        return Objects.equals(this.about, whatsAppBusinessInfoRequest.about)
                && Objects.equals(this.address, whatsAppBusinessInfoRequest.address)
                && Objects.equals(this.description, whatsAppBusinessInfoRequest.description)
                && Objects.equals(this.email, whatsAppBusinessInfoRequest.email)
                && Objects.equals(this.vertical, whatsAppBusinessInfoRequest.vertical)
                && Objects.equals(this.websites, whatsAppBusinessInfoRequest.websites)
                && Objects.equals(this.logoUrl, whatsAppBusinessInfoRequest.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(about, address, description, email, vertical, websites, logoUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppBusinessInfoRequest {")
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
                .append("    logoUrl: ")
                .append(toIndentedString(logoUrl))
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
