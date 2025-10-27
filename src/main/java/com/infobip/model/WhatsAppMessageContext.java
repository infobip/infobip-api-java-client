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
 * Context object to define WhatsApp-specific metadata about a message.
 */
public class WhatsAppMessageContext {

    private String replyToMessageId;

    /**
     * Sets replyToMessageId.
     * <p>
     * Field description:
     * Inbound message ID used for a reply. Contextual bubble will not appear for template messages.
     * <p>
     * The field is required.
     *
     * @param replyToMessageId
     * @return This {@link WhatsAppMessageContext instance}.
     */
    public WhatsAppMessageContext replyToMessageId(String replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Returns replyToMessageId.
     * <p>
     * Field description:
     * Inbound message ID used for a reply. Contextual bubble will not appear for template messages.
     * <p>
     * The field is required.
     *
     * @return replyToMessageId
     */
    @JsonProperty("replyToMessageId")
    public String getReplyToMessageId() {
        return replyToMessageId;
    }

    /**
     * Sets replyToMessageId.
     * <p>
     * Field description:
     * Inbound message ID used for a reply. Contextual bubble will not appear for template messages.
     * <p>
     * The field is required.
     *
     * @param replyToMessageId
     */
    @JsonProperty("replyToMessageId")
    public void setReplyToMessageId(String replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppMessageContext whatsAppMessageContext = (WhatsAppMessageContext) o;
        return Objects.equals(this.replyToMessageId, whatsAppMessageContext.replyToMessageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replyToMessageId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppMessageContext {")
                .append(newLine)
                .append("    replyToMessageId: ")
                .append(toIndentedString(replyToMessageId))
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
