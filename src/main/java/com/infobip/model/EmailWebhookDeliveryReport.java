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
import java.util.Objects;

/**
 * Represents EmailWebhookDeliveryReport model.
 */
public class EmailWebhookDeliveryReport {

    private String bulkId;

    private MessagePrice price;

    private MessageStatus status;

    private MessageError error;

    private String messageId;

    private OffsetDateTime doneAt;

    private Integer smsCount;

    private OffsetDateTime sentAt;

    private String browserLink;

    private String sendingIp;

    private String callbackData;

    private String to;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies a list of email messages. This is either defined by user in the request or auto generated.
     *
     * @param bulkId
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport bulkId(String bulkId) {
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
     * Sets price.
     *
     * @param price
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport price(MessagePrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public MessagePrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(MessagePrice price) {
        this.price = price;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport status(MessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public MessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    /**
     * Sets error.
     *
     * @param error
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport error(MessageError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     *
     * @return error
     */
    @JsonProperty("error")
    public MessageError getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(MessageError error) {
        this.error = error;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the email sent to the recipient.
     *
     * @param messageId
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the email sent to the recipient.
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
     * The ID that uniquely identifies the email sent to the recipient.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Delivery date and time.
     *
     * @param doneAt
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Delivery date and time.
     *
     * @return doneAt
     */
    @JsonProperty("doneAt")
    public OffsetDateTime getDoneAt() {
        return doneAt;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Delivery date and time.
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * The number of emails sent.
     *
     * @param smsCount
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport smsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    /**
     * Returns smsCount.
     * <p>
     * Field description:
     * The number of emails sent.
     *
     * @return smsCount
     */
    @JsonProperty("smsCount")
    public Integer getSmsCount() {
        return smsCount;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * The number of emails sent.
     *
     * @param smsCount
     */
    @JsonProperty("smsCount")
    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Send date and time. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Send date and time. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return sentAt
     */
    @JsonProperty("sentAt")
    public OffsetDateTime getSentAt() {
        return sentAt;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Send date and time. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets browserLink.
     * <p>
     * Field description:
     * Contains the link to the HTML sent to recipient. This will be present only if the _view in browser_ feature is used in the email. (Please note that this feature is not activated automatically for Email traffic sent over API. If you would like to utilize it please reach out to your Infobip person of contact.)
     *
     * @param browserLink
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport browserLink(String browserLink) {
        this.browserLink = browserLink;
        return this;
    }

    /**
     * Returns browserLink.
     * <p>
     * Field description:
     * Contains the link to the HTML sent to recipient. This will be present only if the _view in browser_ feature is used in the email. (Please note that this feature is not activated automatically for Email traffic sent over API. If you would like to utilize it please reach out to your Infobip person of contact.)
     *
     * @return browserLink
     */
    @JsonProperty("browserLink")
    public String getBrowserLink() {
        return browserLink;
    }

    /**
     * Sets browserLink.
     * <p>
     * Field description:
     * Contains the link to the HTML sent to recipient. This will be present only if the _view in browser_ feature is used in the email. (Please note that this feature is not activated automatically for Email traffic sent over API. If you would like to utilize it please reach out to your Infobip person of contact.)
     *
     * @param browserLink
     */
    @JsonProperty("browserLink")
    public void setBrowserLink(String browserLink) {
        this.browserLink = browserLink;
    }

    /**
     * Sets sendingIp.
     * <p>
     * Field description:
     * The IP address that was used to send out the email.
     *
     * @param sendingIp
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport sendingIp(String sendingIp) {
        this.sendingIp = sendingIp;
        return this;
    }

    /**
     * Returns sendingIp.
     * <p>
     * Field description:
     * The IP address that was used to send out the email.
     *
     * @return sendingIp
     */
    @JsonProperty("sendingIp")
    public String getSendingIp() {
        return sendingIp;
    }

    /**
     * Sets sendingIp.
     * <p>
     * Field description:
     * The IP address that was used to send out the email.
     *
     * @param sendingIp
     */
    @JsonProperty("sendingIp")
    public void setSendingIp(String sendingIp) {
        this.sendingIp = sendingIp;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Callback data sent through &#x60;callbackData&#x60; field in fully featured email.
     *
     * @param callbackData
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Callback data sent through &#x60;callbackData&#x60; field in fully featured email.
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
     * Callback data sent through &#x60;callbackData&#x60; field in fully featured email.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Destination email address.
     *
     * @param to
     * @return This {@link EmailWebhookDeliveryReport instance}.
     */
    public EmailWebhookDeliveryReport to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Destination email address.
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
     * Destination email address.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailWebhookDeliveryReport emailWebhookDeliveryReport = (EmailWebhookDeliveryReport) o;
        return Objects.equals(this.bulkId, emailWebhookDeliveryReport.bulkId)
                && Objects.equals(this.price, emailWebhookDeliveryReport.price)
                && Objects.equals(this.status, emailWebhookDeliveryReport.status)
                && Objects.equals(this.error, emailWebhookDeliveryReport.error)
                && Objects.equals(this.messageId, emailWebhookDeliveryReport.messageId)
                && Objects.equals(this.doneAt, emailWebhookDeliveryReport.doneAt)
                && Objects.equals(this.smsCount, emailWebhookDeliveryReport.smsCount)
                && Objects.equals(this.sentAt, emailWebhookDeliveryReport.sentAt)
                && Objects.equals(this.browserLink, emailWebhookDeliveryReport.browserLink)
                && Objects.equals(this.sendingIp, emailWebhookDeliveryReport.sendingIp)
                && Objects.equals(this.callbackData, emailWebhookDeliveryReport.callbackData)
                && Objects.equals(this.to, emailWebhookDeliveryReport.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bulkId,
                price,
                status,
                error,
                messageId,
                doneAt,
                smsCount,
                sentAt,
                browserLink,
                sendingIp,
                callbackData,
                to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailWebhookDeliveryReport {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    smsCount: ")
                .append(toIndentedString(smsCount))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    browserLink: ")
                .append(toIndentedString(browserLink))
                .append(newLine)
                .append("    sendingIp: ")
                .append(toIndentedString(sendingIp))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
