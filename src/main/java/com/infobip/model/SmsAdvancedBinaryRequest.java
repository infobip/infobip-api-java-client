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
 * Represents SmsAdvancedBinaryRequest model.
 */
public class SmsAdvancedBinaryRequest {

    private String bulkId;

    private List<SmsBinaryMessage> messages = new ArrayList<>();

    private SmsSendingSpeedLimit sendingSpeedLimit;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
     *
     * @param bulkId
     * @return This {@link SmsAdvancedBinaryRequest instance}.
     */
    public SmsAdvancedBinaryRequest bulkId(String bulkId) {
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
     * @return This {@link SmsAdvancedBinaryRequest instance}.
     */
    public SmsAdvancedBinaryRequest messages(List<SmsBinaryMessage> messages) {
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
     * @return This {@link SmsAdvancedBinaryRequest instance}.
     */
    public SmsAdvancedBinaryRequest addMessagesItem(SmsBinaryMessage messagesItem) {
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
    public List<SmsBinaryMessage> getMessages() {
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
    public void setMessages(List<SmsBinaryMessage> messages) {
        this.messages = messages;
    }

    /**
     * Sets sendingSpeedLimit.
     *
     * @param sendingSpeedLimit
     * @return This {@link SmsAdvancedBinaryRequest instance}.
     */
    public SmsAdvancedBinaryRequest sendingSpeedLimit(SmsSendingSpeedLimit sendingSpeedLimit) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsAdvancedBinaryRequest smsAdvancedBinaryRequest = (SmsAdvancedBinaryRequest) o;
        return Objects.equals(this.bulkId, smsAdvancedBinaryRequest.bulkId)
                && Objects.equals(this.messages, smsAdvancedBinaryRequest.messages)
                && Objects.equals(this.sendingSpeedLimit, smsAdvancedBinaryRequest.sendingSpeedLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages, sendingSpeedLimit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsAdvancedBinaryRequest {")
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
