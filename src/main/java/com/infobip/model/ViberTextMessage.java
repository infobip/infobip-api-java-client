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
 * An array of messages being sent.
 */
public class ViberTextMessage {

    private String from;

    private String to;

    private String messageId;

    private ViberTextContent content;

    private String callbackData;

    private String trackingData;

    private Boolean applySessionRate;

    private Boolean toPrimaryDeviceOnly;

    private ViberLabel label;

    private ViberSmsFailover smsFailover;

    private String notifyUrl;

    private ViberUrlOptions urlOptions;

    private String entityId;

    private String applicationId;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered Viber Sender name.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Registered Viber Sender name.
     * <p>
     * The field is required.
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
     * Registered Viber Sender name.
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format and must be internationally reachable (Example: &#x60;385977666618&#x60;).
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format and must be internationally reachable (Example: &#x60;385977666618&#x60;).
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format and must be internationally reachable (Example: &#x60;385977666618&#x60;).
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
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
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage content(ViberTextContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public ViberTextContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(ViberTextContent content) {
        this.content = content;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be included in Delivery Report.
     *
     * @param callbackData
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be included in Delivery Report.
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
     * Custom client&#39;s data that will be included in Delivery Report.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be passed back with user&#39;s reply.
     *
     * @param trackingData
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage trackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     * Returns trackingData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be passed back with user&#39;s reply.
     *
     * @return trackingData
     */
    @JsonProperty("trackingData")
    public String getTrackingData() {
        return trackingData;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be passed back with user&#39;s reply.
     *
     * @param trackingData
     */
    @JsonProperty("trackingData")
    public void setTrackingData(String trackingData) {
        this.trackingData = trackingData;
    }

    /**
     * Sets applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable. The session rate is not supported for text messages with buttons.
     *
     * @param applySessionRate
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage applySessionRate(Boolean applySessionRate) {
        this.applySessionRate = applySessionRate;
        return this;
    }

    /**
     * Returns applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable. The session rate is not supported for text messages with buttons.
     *
     * @return applySessionRate
     */
    @JsonProperty("applySessionRate")
    public Boolean getApplySessionRate() {
        return applySessionRate;
    }

    /**
     * Sets applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable. The session rate is not supported for text messages with buttons.
     *
     * @param applySessionRate
     */
    @JsonProperty("applySessionRate")
    public void setApplySessionRate(Boolean applySessionRate) {
        this.applySessionRate = applySessionRate;
    }

    /**
     * Sets toPrimaryDeviceOnly.
     * <p>
     * Field description:
     * Defines if the message should be sent only to the end user&#39;s [primary device](https://www.infobip.com/docs/viber/business-messages/api) (phone or tablet).
     *
     * @param toPrimaryDeviceOnly
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage toPrimaryDeviceOnly(Boolean toPrimaryDeviceOnly) {
        this.toPrimaryDeviceOnly = toPrimaryDeviceOnly;
        return this;
    }

    /**
     * Returns toPrimaryDeviceOnly.
     * <p>
     * Field description:
     * Defines if the message should be sent only to the end user&#39;s [primary device](https://www.infobip.com/docs/viber/business-messages/api) (phone or tablet).
     *
     * @return toPrimaryDeviceOnly
     */
    @JsonProperty("toPrimaryDeviceOnly")
    public Boolean getToPrimaryDeviceOnly() {
        return toPrimaryDeviceOnly;
    }

    /**
     * Sets toPrimaryDeviceOnly.
     * <p>
     * Field description:
     * Defines if the message should be sent only to the end user&#39;s [primary device](https://www.infobip.com/docs/viber/business-messages/api) (phone or tablet).
     *
     * @param toPrimaryDeviceOnly
     */
    @JsonProperty("toPrimaryDeviceOnly")
    public void setToPrimaryDeviceOnly(Boolean toPrimaryDeviceOnly) {
        this.toPrimaryDeviceOnly = toPrimaryDeviceOnly;
    }

    /**
     * Sets label.
     *
     * @param label
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage label(ViberLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Returns label.
     *
     * @return label
     */
    @JsonProperty("label")
    public ViberLabel getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(ViberLabel label) {
        this.label = label;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage smsFailover(ViberSmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }

    /**
     * Returns smsFailover.
     *
     * @return smsFailover
     */
    @JsonProperty("smsFailover")
    public ViberSmsFailover getSmsFailover() {
        return smsFailover;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     */
    @JsonProperty("smsFailover")
    public void setSmsFailover(ViberSmsFailover smsFailover) {
        this.smsFailover = smsFailover;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/viber/receive-viber-delivery-reports), [Seen report format](#channels/viber/receive-viber-seen-reports).
     *
     * @param notifyUrl
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/viber/receive-viber-delivery-reports), [Seen report format](#channels/viber/receive-viber-seen-reports).
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/viber/receive-viber-delivery-reports), [Seen report format](#channels/viber/receive-viber-seen-reports).
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets urlOptions.
     *
     * @param urlOptions
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage urlOptions(ViberUrlOptions urlOptions) {
        this.urlOptions = urlOptions;
        return this;
    }

    /**
     * Returns urlOptions.
     *
     * @return urlOptions
     */
    @JsonProperty("urlOptions")
    public ViberUrlOptions getUrlOptions() {
        return urlOptions;
    }

    /**
     * Sets urlOptions.
     *
     * @param urlOptions
     */
    @JsonProperty("urlOptions")
    public void setUrlOptions(ViberUrlOptions urlOptions) {
        this.urlOptions = urlOptions;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Required for application use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link ViberTextMessage instance}.
     */
    public ViberTextMessage applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Required for application use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Required for application use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
        ViberTextMessage viberTextMessage = (ViberTextMessage) o;
        return Objects.equals(this.from, viberTextMessage.from)
                && Objects.equals(this.to, viberTextMessage.to)
                && Objects.equals(this.messageId, viberTextMessage.messageId)
                && Objects.equals(this.content, viberTextMessage.content)
                && Objects.equals(this.callbackData, viberTextMessage.callbackData)
                && Objects.equals(this.trackingData, viberTextMessage.trackingData)
                && Objects.equals(this.applySessionRate, viberTextMessage.applySessionRate)
                && Objects.equals(this.toPrimaryDeviceOnly, viberTextMessage.toPrimaryDeviceOnly)
                && Objects.equals(this.label, viberTextMessage.label)
                && Objects.equals(this.smsFailover, viberTextMessage.smsFailover)
                && Objects.equals(this.notifyUrl, viberTextMessage.notifyUrl)
                && Objects.equals(this.urlOptions, viberTextMessage.urlOptions)
                && Objects.equals(this.entityId, viberTextMessage.entityId)
                && Objects.equals(this.applicationId, viberTextMessage.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                to,
                messageId,
                content,
                callbackData,
                trackingData,
                applySessionRate,
                toPrimaryDeviceOnly,
                label,
                smsFailover,
                notifyUrl,
                urlOptions,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberTextMessage {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    trackingData: ")
                .append(toIndentedString(trackingData))
                .append(newLine)
                .append("    applySessionRate: ")
                .append(toIndentedString(applySessionRate))
                .append(newLine)
                .append("    toPrimaryDeviceOnly: ")
                .append(toIndentedString(toPrimaryDeviceOnly))
                .append(newLine)
                .append("    label: ")
                .append(toIndentedString(label))
                .append(newLine)
                .append("    smsFailover: ")
                .append(toIndentedString(smsFailover))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    urlOptions: ")
                .append(toIndentedString(urlOptions))
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
