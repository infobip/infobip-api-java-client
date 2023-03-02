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
 * Represents MmsSendResult model.
 */
public class MmsSendResult {

    private String bulkId;

    private List<MmsMessageResult> messages = new ArrayList<>();

    private String errorMessage;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique bulk identifier.
     *
     * @param bulkId
     * @return This {@link MmsSendResult instance}.
     */
    public MmsSendResult bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique bulk identifier.
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
     * Unique bulk identifier.
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
     * Array of sent message objects, one object per every message.
     * <p>
     * The field is required.
     *
     * @param messages
     * @return This {@link MmsSendResult instance}.
     */
    public MmsSendResult messages(List<MmsMessageResult> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * Array of sent message objects, one object per every message.
     * <p>
     * The field is required.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link MmsSendResult instance}.
     */
    public MmsSendResult addMessagesItem(MmsMessageResult messagesItem) {
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
     * Array of sent message objects, one object per every message.
     * <p>
     * The field is required.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<MmsMessageResult> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * Array of sent message objects, one object per every message.
     * <p>
     * The field is required.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<MmsMessageResult> messages) {
        this.messages = messages;
    }

    /**
     * Sets errorMessage.
     * <p>
     * Field description:
     * General error description.
     *
     * @param errorMessage
     * @return This {@link MmsSendResult instance}.
     */
    public MmsSendResult errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Returns errorMessage.
     * <p>
     * Field description:
     * General error description.
     *
     * @return errorMessage
     */
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets errorMessage.
     * <p>
     * Field description:
     * General error description.
     *
     * @param errorMessage
     */
    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsSendResult mmsSendResult = (MmsSendResult) o;
        return Objects.equals(this.bulkId, mmsSendResult.bulkId)
                && Objects.equals(this.messages, mmsSendResult.messages)
                && Objects.equals(this.errorMessage, mmsSendResult.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages, errorMessage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsSendResult {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messages: ")
                .append(toIndentedString(messages))
                .append(newLine)
                .append("    errorMessage: ")
                .append(toIndentedString(errorMessage))
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
