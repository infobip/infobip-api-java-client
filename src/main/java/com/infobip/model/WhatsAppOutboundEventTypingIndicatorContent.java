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
 * Represents WhatsAppOutboundEventTypingIndicatorContent model.
 */
public class WhatsAppOutboundEventTypingIndicatorContent {

    private String messageId;

    private WhatsAppOutboundEventContentType type;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * ID of the message to be marked as read. This field is deprecated and will be autofilled by the system. Any values supplied by the user will be ignored.
     *
     * @param messageId
     * @return This {@link WhatsAppOutboundEventTypingIndicatorContent instance}.
     */
    public WhatsAppOutboundEventTypingIndicatorContent messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * ID of the message to be marked as read. This field is deprecated and will be autofilled by the system. Any values supplied by the user will be ignored.
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
     * ID of the message to be marked as read. This field is deprecated and will be autofilled by the system. Any values supplied by the user will be ignored.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppOutboundEventTypingIndicatorContent instance}.
     */
    public WhatsAppOutboundEventTypingIndicatorContent type(WhatsAppOutboundEventContentType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppOutboundEventContentType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppOutboundEventContentType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppOutboundEventTypingIndicatorContent whatsAppOutboundEventTypingIndicatorContent =
                (WhatsAppOutboundEventTypingIndicatorContent) o;
        return Objects.equals(this.messageId, whatsAppOutboundEventTypingIndicatorContent.messageId)
                && Objects.equals(this.type, whatsAppOutboundEventTypingIndicatorContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppOutboundEventTypingIndicatorContent {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
