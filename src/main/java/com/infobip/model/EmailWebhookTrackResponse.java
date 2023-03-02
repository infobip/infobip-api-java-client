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
 * Represents EmailWebhookTrackResponse model.
 */
public class EmailWebhookTrackResponse {

    private String notificationType;

    private String domain;

    private String recipient;

    private String url;

    private Double sendDateTime;

    private String messageId;

    private String bulkId;

    private EmailWebhookRecipientInfo recipientInfo;

    private EmailWebhookGeoLocation geoLocation;

    /**
     * Sets notificationType.
     * <p>
     * Field description:
     * Tells the type of user event that took place. Possible events: &#x60;OPENED&#x60;, &#x60;CLICKED&#x60;, &#x60;COMPLAINED&#x60;, &#x60;UNSUBSCRIBED&#x60;.
     *
     * @param notificationType
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse notificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * Returns notificationType.
     * <p>
     * Field description:
     * Tells the type of user event that took place. Possible events: &#x60;OPENED&#x60;, &#x60;CLICKED&#x60;, &#x60;COMPLAINED&#x60;, &#x60;UNSUBSCRIBED&#x60;.
     *
     * @return notificationType
     */
    @JsonProperty("notificationType")
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets notificationType.
     * <p>
     * Field description:
     * Tells the type of user event that took place. Possible events: &#x60;OPENED&#x60;, &#x60;CLICKED&#x60;, &#x60;COMPLAINED&#x60;, &#x60;UNSUBSCRIBED&#x60;.
     *
     * @param notificationType
     */
    @JsonProperty("notificationType")
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * Sets domain.
     * <p>
     * Field description:
     * The sending domain used to send the email to the recipient.
     *
     * @param domain
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Returns domain.
     * <p>
     * Field description:
     * The sending domain used to send the email to the recipient.
     *
     * @return domain
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Sets domain.
     * <p>
     * Field description:
     * The sending domain used to send the email to the recipient.
     *
     * @param domain
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Sets recipient.
     * <p>
     * Field description:
     * Recipient of the email.
     *
     * @param recipient
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Returns recipient.
     * <p>
     * Field description:
     * Recipient of the email.
     *
     * @return recipient
     */
    @JsonProperty("recipient")
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets recipient.
     * <p>
     * Field description:
     * Recipient of the email.
     *
     * @param recipient
     */
    @JsonProperty("recipient")
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * The link the recipient has clicked. This attribute will only be present only if the event is of the type &#x60;CLICKED&#x60;.
     *
     * @param url
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * The link the recipient has clicked. This attribute will only be present only if the event is of the type &#x60;CLICKED&#x60;.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * The link the recipient has clicked. This attribute will only be present only if the event is of the type &#x60;CLICKED&#x60;.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets sendDateTime.
     * <p>
     * Field description:
     * The time at which the email was sent. Time is in milliseconds.
     *
     * @param sendDateTime
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse sendDateTime(Double sendDateTime) {
        this.sendDateTime = sendDateTime;
        return this;
    }

    /**
     * Returns sendDateTime.
     * <p>
     * Field description:
     * The time at which the email was sent. Time is in milliseconds.
     *
     * @return sendDateTime
     */
    @JsonProperty("sendDateTime")
    public Double getSendDateTime() {
        return sendDateTime;
    }

    /**
     * Sets sendDateTime.
     * <p>
     * Field description:
     * The time at which the email was sent. Time is in milliseconds.
     *
     * @param sendDateTime
     */
    @JsonProperty("sendDateTime")
    public void setSendDateTime(Double sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent to the recipient.
     *
     * @param messageId
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent to the recipient.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent to the recipient.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies a list of email messages. This is either defined by user in the request or auto generated.
     *
     * @param bulkId
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies a list of email messages. This is either defined by user in the request or auto generated.
     *
     * @return bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies a list of email messages. This is either defined by user in the request or auto generated.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets recipientInfo.
     *
     * @param recipientInfo
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse recipientInfo(EmailWebhookRecipientInfo recipientInfo) {
        this.recipientInfo = recipientInfo;
        return this;
    }

    /**
     * Returns recipientInfo.
     *
     * @return recipientInfo
     */
    @JsonProperty("recipientInfo")
    public EmailWebhookRecipientInfo getRecipientInfo() {
        return recipientInfo;
    }

    /**
     * Sets recipientInfo.
     *
     * @param recipientInfo
     */
    @JsonProperty("recipientInfo")
    public void setRecipientInfo(EmailWebhookRecipientInfo recipientInfo) {
        this.recipientInfo = recipientInfo;
    }

    /**
     * Sets geoLocation.
     *
     * @param geoLocation
     * @return This {@link EmailWebhookTrackResponse instance}.
     */
    public EmailWebhookTrackResponse geoLocation(EmailWebhookGeoLocation geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     * Returns geoLocation.
     *
     * @return geoLocation
     */
    @JsonProperty("geoLocation")
    public EmailWebhookGeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets geoLocation.
     *
     * @param geoLocation
     */
    @JsonProperty("geoLocation")
    public void setGeoLocation(EmailWebhookGeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailWebhookTrackResponse emailWebhookTrackResponse = (EmailWebhookTrackResponse) o;
        return Objects.equals(this.notificationType, emailWebhookTrackResponse.notificationType)
                && Objects.equals(this.domain, emailWebhookTrackResponse.domain)
                && Objects.equals(this.recipient, emailWebhookTrackResponse.recipient)
                && Objects.equals(this.url, emailWebhookTrackResponse.url)
                && Objects.equals(this.sendDateTime, emailWebhookTrackResponse.sendDateTime)
                && Objects.equals(this.messageId, emailWebhookTrackResponse.messageId)
                && Objects.equals(this.bulkId, emailWebhookTrackResponse.bulkId)
                && Objects.equals(this.recipientInfo, emailWebhookTrackResponse.recipientInfo)
                && Objects.equals(this.geoLocation, emailWebhookTrackResponse.geoLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                notificationType, domain, recipient, url, sendDateTime, messageId, bulkId, recipientInfo, geoLocation);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailWebhookTrackResponse {")
                .append(newLine)
                .append("    notificationType: ")
                .append(toIndentedString(notificationType))
                .append(newLine)
                .append("    domain: ")
                .append(toIndentedString(domain))
                .append(newLine)
                .append("    recipient: ")
                .append(toIndentedString(recipient))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    sendDateTime: ")
                .append(toIndentedString(sendDateTime))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    recipientInfo: ")
                .append(toIndentedString(recipientInfo))
                .append(newLine)
                .append("    geoLocation: ")
                .append(toIndentedString(geoLocation))
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
