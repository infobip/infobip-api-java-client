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
 * Represents RcsOutboundEventSeenContent model.
 */
public class RcsOutboundEventSeenContent extends RcsOutboundEventContent {

    private String messageId;

    /**
     * Constructs a new {@link RcsOutboundEventSeenContent} instance.
     */
    public RcsOutboundEventSeenContent() {
        super("SEEN");
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * ID of the message that should be marked as seen.
     * <p>
     * The field is required.
     *
     * @param messageId
     * @return This {@link RcsOutboundEventSeenContent instance}.
     */
    public RcsOutboundEventSeenContent messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * ID of the message that should be marked as seen.
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
     * ID of the message that should be marked as seen.
     * <p>
     * The field is required.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsOutboundEventSeenContent rcsOutboundEventSeenContent = (RcsOutboundEventSeenContent) o;
        return Objects.equals(this.messageId, rcsOutboundEventSeenContent.messageId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundEventSeenContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
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
