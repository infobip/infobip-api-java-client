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
 * Represents ViberImageMessage model.
 */
public class ViberImageMessage {

    private String from;

    private String to;

    private String messageId;

    private ViberImageContent content;

    private String callbackData;

    private String trackingData;

    private Boolean applySessionRate;

    private ViberLabel label;

    private ViberSmsFailover smsFailover;

    private String notifyUrl;

    private ViberUrlOptions urlOptions;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered Viber Sender name.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage from(String from) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage to(String to) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage messageId(String messageId) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage content(ViberImageContent content) {
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
    public ViberImageContent getContent() {
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
    public void setContent(ViberImageContent content) {
        this.content = content;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be included in Delivery Report.
     *
     * @param callbackData
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage callbackData(String callbackData) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage trackingData(String trackingData) {
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
     * Defines if the message should be charged using Viber&#39;s session rate if applicable.
     *
     * @param applySessionRate
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage applySessionRate(Boolean applySessionRate) {
        this.applySessionRate = applySessionRate;
        return this;
    }

    /**
     * Returns applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable.
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
     * Defines if the message should be charged using Viber&#39;s session rate if applicable.
     *
     * @param applySessionRate
     */
    @JsonProperty("applySessionRate")
    public void setApplySessionRate(Boolean applySessionRate) {
        this.applySessionRate = applySessionRate;
    }

    /**
     * Sets label.
     *
     * @param label
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage label(ViberLabel label) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage smsFailover(ViberSmsFailover smsFailover) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage notifyUrl(String notifyUrl) {
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
     * @return This {@link ViberImageMessage instance}.
     */
    public ViberImageMessage urlOptions(ViberUrlOptions urlOptions) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberImageMessage viberImageMessage = (ViberImageMessage) o;
        return Objects.equals(this.from, viberImageMessage.from)
                && Objects.equals(this.to, viberImageMessage.to)
                && Objects.equals(this.messageId, viberImageMessage.messageId)
                && Objects.equals(this.content, viberImageMessage.content)
                && Objects.equals(this.callbackData, viberImageMessage.callbackData)
                && Objects.equals(this.trackingData, viberImageMessage.trackingData)
                && Objects.equals(this.applySessionRate, viberImageMessage.applySessionRate)
                && Objects.equals(this.label, viberImageMessage.label)
                && Objects.equals(this.smsFailover, viberImageMessage.smsFailover)
                && Objects.equals(this.notifyUrl, viberImageMessage.notifyUrl)
                && Objects.equals(this.urlOptions, viberImageMessage.urlOptions);
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
                label,
                smsFailover,
                notifyUrl,
                urlOptions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberImageMessage {")
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
