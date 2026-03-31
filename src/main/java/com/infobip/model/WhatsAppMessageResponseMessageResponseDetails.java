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
 * An array of message objects of a single message or multiple messages sent under one bulk ID.
 */
public class WhatsAppMessageResponseMessageResponseDetails {

    private String messageId;

    private WhatsAppMessageStatus status;

    private String destination;

    private Object details;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID. If not provided, it will be auto-generated and returned in the API response.
     *
     * @param messageId
     * @return This {@link WhatsAppMessageResponseMessageResponseDetails instance}.
     */
    public WhatsAppMessageResponseMessageResponseDetails messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique message ID. If not provided, it will be auto-generated and returned in the API response.
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
     * Unique message ID. If not provided, it will be auto-generated and returned in the API response.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link WhatsAppMessageResponseMessageResponseDetails instance}.
     */
    public WhatsAppMessageResponseMessageResponseDetails status(WhatsAppMessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public WhatsAppMessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(WhatsAppMessageStatus status) {
        this.status = status;
    }

    /**
     * Sets destination.
     * <p>
     * Field description:
     * The destination address of the message, i.e., its recipient.
     *
     * @param destination
     * @return This {@link WhatsAppMessageResponseMessageResponseDetails instance}.
     */
    public WhatsAppMessageResponseMessageResponseDetails destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Returns destination.
     * <p>
     * Field description:
     * The destination address of the message, i.e., its recipient.
     *
     * @return destination
     */
    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    /**
     * Sets destination.
     * <p>
     * Field description:
     * The destination address of the message, i.e., its recipient.
     *
     * @param destination
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Sets details.
     * <p>
     * Field description:
     * Other details of the message.
     *
     * @param details
     * @return This {@link WhatsAppMessageResponseMessageResponseDetails instance}.
     */
    public WhatsAppMessageResponseMessageResponseDetails details(Object details) {
        this.details = details;
        return this;
    }

    /**
     * Returns details.
     * <p>
     * Field description:
     * Other details of the message.
     *
     * @return details
     */
    @JsonProperty("details")
    public Object getDetails() {
        return details;
    }

    /**
     * Sets details.
     * <p>
     * Field description:
     * Other details of the message.
     *
     * @param details
     */
    @JsonProperty("details")
    public void setDetails(Object details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppMessageResponseMessageResponseDetails whatsAppMessageResponseMessageResponseDetails =
                (WhatsAppMessageResponseMessageResponseDetails) o;
        return Objects.equals(this.messageId, whatsAppMessageResponseMessageResponseDetails.messageId)
                && Objects.equals(this.status, whatsAppMessageResponseMessageResponseDetails.status)
                && Objects.equals(this.destination, whatsAppMessageResponseMessageResponseDetails.destination)
                && Objects.equals(this.details, whatsAppMessageResponseMessageResponseDetails.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, status, destination, details);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppMessageResponseMessageResponseDetails {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    destination: ")
                .append(toIndentedString(destination))
                .append(newLine)
                .append("    details: ")
                .append(toIndentedString(details))
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
