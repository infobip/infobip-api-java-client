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
 * Represents SmsAdvancedTextualRequest model.
 */
public class SmsAdvancedTextualRequest {

    private String bulkId;

    private List<SmsTextualMessage> messages = new ArrayList<>();

    private SmsSendingSpeedLimit sendingSpeedLimit;

    private SmsUrlOptions urlOptions;

    private SmsTracking tracking;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
     *
     * @param bulkId
     * @return This {@link SmsAdvancedTextualRequest instance}.
     */
    public SmsAdvancedTextualRequest bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
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
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @param messages
     * @return This {@link SmsAdvancedTextualRequest instance}.
     */
    public SmsAdvancedTextualRequest messages(List<SmsTextualMessage> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link SmsAdvancedTextualRequest instance}.
     */
    public SmsAdvancedTextualRequest addMessagesItem(SmsTextualMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * Returns messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<SmsTextualMessage> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     * <p>
     * The field is required.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<SmsTextualMessage> messages) {
        this.messages = messages;
    }

    /**
     * Sets sendingSpeedLimit.
     *
     * @param sendingSpeedLimit
     * @return This {@link SmsAdvancedTextualRequest instance}.
     */
    public SmsAdvancedTextualRequest sendingSpeedLimit(SmsSendingSpeedLimit sendingSpeedLimit) {
        this.sendingSpeedLimit = sendingSpeedLimit;
        return this;
    }

    /**
     * Returns sendingSpeedLimit.
     *
     * @return sendingSpeedLimit
     */
    @JsonProperty("sendingSpeedLimit")
    public SmsSendingSpeedLimit getSendingSpeedLimit() {
        return sendingSpeedLimit;
    }

    /**
     * Sets sendingSpeedLimit.
     *
     * @param sendingSpeedLimit
     */
    @JsonProperty("sendingSpeedLimit")
    public void setSendingSpeedLimit(SmsSendingSpeedLimit sendingSpeedLimit) {
        this.sendingSpeedLimit = sendingSpeedLimit;
    }

    /**
     * Sets urlOptions.
     *
     * @param urlOptions
     * @return This {@link SmsAdvancedTextualRequest instance}.
     */
    public SmsAdvancedTextualRequest urlOptions(SmsUrlOptions urlOptions) {
        this.urlOptions = urlOptions;
        return this;
    }

    /**
     * Returns urlOptions.
     *
     * @return urlOptions
     */
    @JsonProperty("urlOptions")
    public SmsUrlOptions getUrlOptions() {
        return urlOptions;
    }

    /**
     * Sets urlOptions.
     *
     * @param urlOptions
     */
    @JsonProperty("urlOptions")
    public void setUrlOptions(SmsUrlOptions urlOptions) {
        this.urlOptions = urlOptions;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link SmsAdvancedTextualRequest instance}.
     */
    public SmsAdvancedTextualRequest tracking(SmsTracking tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public SmsTracking getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(SmsTracking tracking) {
        this.tracking = tracking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsAdvancedTextualRequest smsAdvancedTextualRequest = (SmsAdvancedTextualRequest) o;
        return Objects.equals(this.bulkId, smsAdvancedTextualRequest.bulkId)
                && Objects.equals(this.messages, smsAdvancedTextualRequest.messages)
                && Objects.equals(this.sendingSpeedLimit, smsAdvancedTextualRequest.sendingSpeedLimit)
                && Objects.equals(this.urlOptions, smsAdvancedTextualRequest.urlOptions)
                && Objects.equals(this.tracking, smsAdvancedTextualRequest.tracking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages, sendingSpeedLimit, urlOptions, tracking);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsAdvancedTextualRequest {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messages: ")
                .append(toIndentedString(messages))
                .append(newLine)
                .append("    sendingSpeedLimit: ")
                .append(toIndentedString(sendingSpeedLimit))
                .append(newLine)
                .append("    urlOptions: ")
                .append(toIndentedString(urlOptions))
                .append(newLine)
                .append("    tracking: ")
                .append(toIndentedString(tracking))
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
