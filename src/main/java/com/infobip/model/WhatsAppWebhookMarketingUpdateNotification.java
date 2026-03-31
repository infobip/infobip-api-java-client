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
 * Content of the notification.
 */
public class WhatsAppWebhookMarketingUpdateNotification {

    private String sender;

    private String from;

    private String notificationMessagesStatus;

    private String description;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Registered WhatsApp sender number.
     *
     * @param sender
     * @return This {@link WhatsAppWebhookMarketingUpdateNotification instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotification sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Registered WhatsApp sender number.
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
     * Registered WhatsApp sender number.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @param from
     * @return This {@link WhatsAppWebhookMarketingUpdateNotification instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotification from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets notificationMessagesStatus.
     * <p>
     * Field description:
     * Status of marketing update notification.
     *
     * @param notificationMessagesStatus
     * @return This {@link WhatsAppWebhookMarketingUpdateNotification instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotification notificationMessagesStatus(String notificationMessagesStatus) {
        this.notificationMessagesStatus = notificationMessagesStatus;
        return this;
    }

    /**
     * Returns notificationMessagesStatus.
     * <p>
     * Field description:
     * Status of marketing update notification.
     *
     * @return notificationMessagesStatus
     */
    @JsonProperty("notificationMessagesStatus")
    public String getNotificationMessagesStatus() {
        return notificationMessagesStatus;
    }

    /**
     * Sets notificationMessagesStatus.
     * <p>
     * Field description:
     * Status of marketing update notification.
     *
     * @param notificationMessagesStatus
     */
    @JsonProperty("notificationMessagesStatus")
    public void setNotificationMessagesStatus(String notificationMessagesStatus) {
        this.notificationMessagesStatus = notificationMessagesStatus;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of marketing update notification.
     *
     * @param description
     * @return This {@link WhatsAppWebhookMarketingUpdateNotification instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotification description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of marketing update notification.
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
     * Description of marketing update notification.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookMarketingUpdateNotification whatsAppWebhookMarketingUpdateNotification =
                (WhatsAppWebhookMarketingUpdateNotification) o;
        return Objects.equals(this.sender, whatsAppWebhookMarketingUpdateNotification.sender)
                && Objects.equals(this.from, whatsAppWebhookMarketingUpdateNotification.from)
                && Objects.equals(
                        this.notificationMessagesStatus,
                        whatsAppWebhookMarketingUpdateNotification.notificationMessagesStatus)
                && Objects.equals(this.description, whatsAppWebhookMarketingUpdateNotification.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, from, notificationMessagesStatus, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookMarketingUpdateNotification {")
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    notificationMessagesStatus: ")
                .append(toIndentedString(notificationMessagesStatus))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
