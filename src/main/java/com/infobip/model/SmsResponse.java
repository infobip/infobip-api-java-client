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
 * Represents SmsResponse model.
 */
public class SmsResponse {

    private String bulkId;

    private List<SmsResponseDetails> messages = null;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
     *
     * @param bulkId
     * @return This {@link SmsResponse instance}.
     */
    public SmsResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
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
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. Typically, used to fetch [delivery reports](#channels/sms/get-outbound-sms-message-delivery-reports) and [message logs](#channels/sms/get-outbound-sms-message-logs).
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
     *
     * @param messages
     * @return This {@link SmsResponse instance}.
     */
    public SmsResponse messages(List<SmsResponseDetails> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link SmsResponse instance}.
     */
    public SmsResponse addMessagesItem(SmsResponseDetails messagesItem) {
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
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<SmsResponseDetails> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * An array of message objects of a single message or multiple messages sent under one bulk ID.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<SmsResponseDetails> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsResponse smsResponse = (SmsResponse) o;
        return Objects.equals(this.bulkId, smsResponse.bulkId) && Objects.equals(this.messages, smsResponse.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsResponse {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messages: ")
                .append(toIndentedString(messages))
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
