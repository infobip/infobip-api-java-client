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
import java.util.Objects;

/**
 * Represents WhatsAppWebhookInboundContactProfile model.
 */
public class WhatsAppWebhookInboundContactProfile {

    private String name;

    private String phoneNumber;

    private String userId;

    private String parentUserId;

    private String username;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Display name of the end user.
     *
     * @param name
     * @return This {@link WhatsAppWebhookInboundContactProfile instance}.
     */
    public WhatsAppWebhookInboundContactProfile name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Display name of the end user.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Display name of the end user.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Sender&#39;s phone number. May be absent if the user has enabled the Meta username feature and you have not exchanged messages with them in the last 30 days.
     *
     * @param phoneNumber
     * @return This {@link WhatsAppWebhookInboundContactProfile instance}.
     */
    public WhatsAppWebhookInboundContactProfile phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Sender&#39;s phone number. May be absent if the user has enabled the Meta username feature and you have not exchanged messages with them in the last 30 days.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Sender&#39;s phone number. May be absent if the user has enabled the Meta username feature and you have not exchanged messages with them in the last 30 days.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets userId.
     * <p>
     * Field description:
     * Business-scoped user ID (BSUID) assigned by Meta. Stable identifier for the end user, scoped to the receiving business.
     *
     * @param userId
     * @return This {@link WhatsAppWebhookInboundContactProfile instance}.
     */
    public WhatsAppWebhookInboundContactProfile userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Returns userId.
     * <p>
     * Field description:
     * Business-scoped user ID (BSUID) assigned by Meta. Stable identifier for the end user, scoped to the receiving business.
     *
     * @return userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Sets userId.
     * <p>
     * Field description:
     * Business-scoped user ID (BSUID) assigned by Meta. Stable identifier for the end user, scoped to the receiving business.
     *
     * @param userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Sets parentUserId.
     * <p>
     * Field description:
     * Business-scoped user ID valid across all phone numbers in a linked business portfolio. Present only for managed businesses with portfolio linking enabled.
     *
     * @param parentUserId
     * @return This {@link WhatsAppWebhookInboundContactProfile instance}.
     */
    public WhatsAppWebhookInboundContactProfile parentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }

    /**
     * Returns parentUserId.
     * <p>
     * Field description:
     * Business-scoped user ID valid across all phone numbers in a linked business portfolio. Present only for managed businesses with portfolio linking enabled.
     *
     * @return parentUserId
     */
    @JsonProperty("parentUserId")
    public String getParentUserId() {
        return parentUserId;
    }

    /**
     * Sets parentUserId.
     * <p>
     * Field description:
     * Business-scoped user ID valid across all phone numbers in a linked business portfolio. Present only for managed businesses with portfolio linking enabled.
     *
     * @param parentUserId
     */
    @JsonProperty("parentUserId")
    public void setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Meta username of the end user. Present only if the user has a Meta username.
     *
     * @param username
     * @return This {@link WhatsAppWebhookInboundContactProfile instance}.
     */
    public WhatsAppWebhookInboundContactProfile username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * Meta username of the end user. Present only if the user has a Meta username.
     *
     * @return username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Meta username of the end user. Present only if the user has a Meta username.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundContactProfile whatsAppWebhookInboundContactProfile =
                (WhatsAppWebhookInboundContactProfile) o;
        return Objects.equals(this.name, whatsAppWebhookInboundContactProfile.name)
                && Objects.equals(this.phoneNumber, whatsAppWebhookInboundContactProfile.phoneNumber)
                && Objects.equals(this.userId, whatsAppWebhookInboundContactProfile.userId)
                && Objects.equals(this.parentUserId, whatsAppWebhookInboundContactProfile.parentUserId)
                && Objects.equals(this.username, whatsAppWebhookInboundContactProfile.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, userId, parentUserId, username);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundContactProfile {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    userId: ")
                .append(toIndentedString(userId))
                .append(newLine)
                .append("    parentUserId: ")
                .append(toIndentedString(parentUserId))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
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
