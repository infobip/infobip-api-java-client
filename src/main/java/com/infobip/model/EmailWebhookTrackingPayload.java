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
 * Represents EmailWebhookTrackingPayload model.
 */
public class EmailWebhookTrackingPayload {

    private String notificationType;

    private String domain;

    private String recipient;

    private String url;

    private Double sendDateTime;

    private Double messageId;

    private String bulkId;

    private String callbackData;

    private EmailWebhookRecipientInfo recipientInfo;

    private EmailWebhookGeoLocation geoLocation;

    private String campaignReferenceId;

    private String entityId;

    private String applicationId;

    /**
     * Sets notificationType.
     * <p>
     * Field description:
     * Tells the type of user event that took place. Possible events: &#x60;OPENED&#x60;, &#x60;CLICKED&#x60;, &#x60;COMPLAINED&#x60;, &#x60;UNSUBSCRIBED&#x60;.
     *
     * @param notificationType
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload notificationType(String notificationType) {
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
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload domain(String domain) {
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
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload recipient(String recipient) {
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
     * The link the recipient has clicked. This attribute will only be present if the event is of the type &#x60;CLICKED&#x60;.
     *
     * @param url
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * The link the recipient has clicked. This attribute will only be present if the event is of the type &#x60;CLICKED&#x60;.
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
     * The link the recipient has clicked. This attribute will only be present if the event is of the type &#x60;CLICKED&#x60;.
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
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload sendDateTime(Double sendDateTime) {
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
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload messageId(Double messageId) {
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
    public Double getMessageId() {
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
    public void setMessageId(Double messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies a list of email messages. This is either defined by user in the request or auto generated.
     *
     * @param bulkId
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload bulkId(String bulkId) {
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
     * Sets callbackData.
     * <p>
     * Field description:
     * The callback data sent through the callbackData field in your fully featured Email message.
     *
     * @param callbackData
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * The callback data sent through the callbackData field in your fully featured Email message.
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * The callback data sent through the callbackData field in your fully featured Email message.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets recipientInfo.
     *
     * @param recipientInfo
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload recipientInfo(EmailWebhookRecipientInfo recipientInfo) {
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
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload geoLocation(EmailWebhookGeoLocation geoLocation) {
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

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the message.
     *
     * @param campaignReferenceId
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload campaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
        return this;
    }

    /**
     * Returns campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the message.
     *
     * @return campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public String getCampaignReferenceId() {
        return campaignReferenceId;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the message.
     *
     * @param campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public void setCampaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Used when specifying an application in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link EmailWebhookTrackingPayload instance}.
     */
    public EmailWebhookTrackingPayload applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Used when specifying an application in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Used when specifying an application in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailWebhookTrackingPayload emailWebhookTrackingPayload = (EmailWebhookTrackingPayload) o;
        return Objects.equals(this.notificationType, emailWebhookTrackingPayload.notificationType)
                && Objects.equals(this.domain, emailWebhookTrackingPayload.domain)
                && Objects.equals(this.recipient, emailWebhookTrackingPayload.recipient)
                && Objects.equals(this.url, emailWebhookTrackingPayload.url)
                && Objects.equals(this.sendDateTime, emailWebhookTrackingPayload.sendDateTime)
                && Objects.equals(this.messageId, emailWebhookTrackingPayload.messageId)
                && Objects.equals(this.bulkId, emailWebhookTrackingPayload.bulkId)
                && Objects.equals(this.callbackData, emailWebhookTrackingPayload.callbackData)
                && Objects.equals(this.recipientInfo, emailWebhookTrackingPayload.recipientInfo)
                && Objects.equals(this.geoLocation, emailWebhookTrackingPayload.geoLocation)
                && Objects.equals(this.campaignReferenceId, emailWebhookTrackingPayload.campaignReferenceId)
                && Objects.equals(this.entityId, emailWebhookTrackingPayload.entityId)
                && Objects.equals(this.applicationId, emailWebhookTrackingPayload.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                notificationType,
                domain,
                recipient,
                url,
                sendDateTime,
                messageId,
                bulkId,
                callbackData,
                recipientInfo,
                geoLocation,
                campaignReferenceId,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailWebhookTrackingPayload {")
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
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    recipientInfo: ")
                .append(toIndentedString(recipientInfo))
                .append(newLine)
                .append("    geoLocation: ")
                .append(toIndentedString(geoLocation))
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
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
