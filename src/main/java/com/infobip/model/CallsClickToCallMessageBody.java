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
 * Represents CallsClickToCallMessageBody model.
 */
public class CallsClickToCallMessageBody {

    private String bulkId;

    private List<CallsClickToCallMessage> messages = new ArrayList<>();

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID which uniquely identifies the request.
     *
     * @param bulkId
     * @return This {@link CallsClickToCallMessageBody instance}.
     */
    public CallsClickToCallMessageBody bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID which uniquely identifies the request.
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
     * The ID which uniquely identifies the request.
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
     * Array of click to call messages to be sent.
     * <p>
     * The field is required.
     *
     * @param messages
     * @return This {@link CallsClickToCallMessageBody instance}.
     */
    public CallsClickToCallMessageBody messages(List<CallsClickToCallMessage> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * Array of click to call messages to be sent.
     * <p>
     * The field is required.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link CallsClickToCallMessageBody instance}.
     */
    public CallsClickToCallMessageBody addMessagesItem(CallsClickToCallMessage messagesItem) {
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
     * Array of click to call messages to be sent.
     * <p>
     * The field is required.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<CallsClickToCallMessage> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * Array of click to call messages to be sent.
     * <p>
     * The field is required.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<CallsClickToCallMessage> messages) {
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
        CallsClickToCallMessageBody callsClickToCallMessageBody = (CallsClickToCallMessageBody) o;
        return Objects.equals(this.bulkId, callsClickToCallMessageBody.bulkId)
                && Objects.equals(this.messages, callsClickToCallMessageBody.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsClickToCallMessageBody {")
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
