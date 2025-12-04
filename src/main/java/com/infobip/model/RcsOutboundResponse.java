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
 * Represents RcsOutboundResponse model.
 */
public class RcsOutboundResponse {

    private String bulkId;

    private List<RcsMessageInfo> messages;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     *
     * @param bulkId
     * @return This {@link RcsOutboundResponse instance}.
     */
    public RcsOutboundResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
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
     * The ID that uniquely identifies the request.
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
     * Array of message information objects.
     *
     * @param messages
     * @return This {@link RcsOutboundResponse instance}.
     */
    public RcsOutboundResponse messages(List<RcsMessageInfo> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * Array of message information objects.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link RcsOutboundResponse instance}.
     */
    public RcsOutboundResponse addMessagesItem(RcsMessageInfo messagesItem) {
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
     * Array of message information objects.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<RcsMessageInfo> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * Array of message information objects.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<RcsMessageInfo> messages) {
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
        RcsOutboundResponse rcsOutboundResponse = (RcsOutboundResponse) o;
        return Objects.equals(this.bulkId, rcsOutboundResponse.bulkId)
                && Objects.equals(this.messages, rcsOutboundResponse.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundResponse {")
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
