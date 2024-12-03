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
 * Represents CallsLaunchScenarioRequest model.
 */
public class CallsLaunchScenarioRequest {

    private String bulkId;

    private List<CallsIvrMessage> messages = new ArrayList<>();

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID which uniquely identifies the request.
     *
     * @param bulkId
     * @return This {@link CallsLaunchScenarioRequest instance}.
     */
    public CallsLaunchScenarioRequest bulkId(String bulkId) {
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
     * Array of IVR messages to be sent, one object per every message.
     * <p>
     * The field is required.
     *
     * @param messages
     * @return This {@link CallsLaunchScenarioRequest instance}.
     */
    public CallsLaunchScenarioRequest messages(List<CallsIvrMessage> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Adds and item into messages.
     * <p>
     * Field description:
     * Array of IVR messages to be sent, one object per every message.
     * <p>
     * The field is required.
     *
     * @param messagesItem The item to be added to the list.
     * @return This {@link CallsLaunchScenarioRequest instance}.
     */
    public CallsLaunchScenarioRequest addMessagesItem(CallsIvrMessage messagesItem) {
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
     * Array of IVR messages to be sent, one object per every message.
     * <p>
     * The field is required.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public List<CallsIvrMessage> getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     * <p>
     * Field description:
     * Array of IVR messages to be sent, one object per every message.
     * <p>
     * The field is required.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(List<CallsIvrMessage> messages) {
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
        CallsLaunchScenarioRequest callsLaunchScenarioRequest = (CallsLaunchScenarioRequest) o;
        return Objects.equals(this.bulkId, callsLaunchScenarioRequest.bulkId)
                && Objects.equals(this.messages, callsLaunchScenarioRequest.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messages);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsLaunchScenarioRequest {")
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
