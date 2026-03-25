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
 * Collection of conversation started events.
 */
public class RcsConversationStartedEvent {

    private String messageId;

    private RcsTrafficType trafficType;

    private RcsConversationStartedEventContent event;

    private RcsConversationStartedInfo conversation;

    private Platform platform;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent/received message.
     * <p>
     * The field is required.
     *
     * @param messageId
     * @return This {@link RcsConversationStartedEvent instance}.
     */
    public RcsConversationStartedEvent messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent/received message.
     * <p>
     * The field is required.
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
     * The ID that uniquely identifies the sent/received message.
     * <p>
     * The field is required.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     * @return This {@link RcsConversationStartedEvent instance}.
     */
    public RcsConversationStartedEvent trafficType(RcsTrafficType trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * Returns trafficType.
     *
     * @return trafficType
     */
    @JsonProperty("trafficType")
    public RcsTrafficType getTrafficType() {
        return trafficType;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     */
    @JsonProperty("trafficType")
    public void setTrafficType(RcsTrafficType trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * Sets event.
     * <p>
     * The field is required.
     *
     * @param event
     * @return This {@link RcsConversationStartedEvent instance}.
     */
    public RcsConversationStartedEvent event(RcsConversationStartedEventContent event) {
        this.event = event;
        return this;
    }

    /**
     * Returns event.
     * <p>
     * The field is required.
     *
     * @return event
     */
    @JsonProperty("event")
    public RcsConversationStartedEventContent getEvent() {
        return event;
    }

    /**
     * Sets event.
     * <p>
     * The field is required.
     *
     * @param event
     */
    @JsonProperty("event")
    public void setEvent(RcsConversationStartedEventContent event) {
        this.event = event;
    }

    /**
     * Sets conversation.
     * <p>
     * The field is required.
     *
     * @param conversation
     * @return This {@link RcsConversationStartedEvent instance}.
     */
    public RcsConversationStartedEvent conversation(RcsConversationStartedInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    /**
     * Returns conversation.
     * <p>
     * The field is required.
     *
     * @return conversation
     */
    @JsonProperty("conversation")
    public RcsConversationStartedInfo getConversation() {
        return conversation;
    }

    /**
     * Sets conversation.
     * <p>
     * The field is required.
     *
     * @param conversation
     */
    @JsonProperty("conversation")
    public void setConversation(RcsConversationStartedInfo conversation) {
        this.conversation = conversation;
    }

    /**
     * Sets platform.
     * <p>
     * The field is required.
     *
     * @param platform
     * @return This {@link RcsConversationStartedEvent instance}.
     */
    public RcsConversationStartedEvent platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     * <p>
     * The field is required.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     * <p>
     * The field is required.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsConversationStartedEvent rcsConversationStartedEvent = (RcsConversationStartedEvent) o;
        return Objects.equals(this.messageId, rcsConversationStartedEvent.messageId)
                && Objects.equals(this.trafficType, rcsConversationStartedEvent.trafficType)
                && Objects.equals(this.event, rcsConversationStartedEvent.event)
                && Objects.equals(this.conversation, rcsConversationStartedEvent.conversation)
                && Objects.equals(this.platform, rcsConversationStartedEvent.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, trafficType, event, conversation, platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsConversationStartedEvent {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    trafficType: ")
                .append(toIndentedString(trafficType))
                .append(newLine)
                .append("    event: ")
                .append(toIndentedString(event))
                .append(newLine)
                .append("    conversation: ")
                .append(toIndentedString(conversation))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
