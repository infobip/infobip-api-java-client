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
 * List of BCC recipient email addresses.
 */
public class EmailToDestination {

    private String destination;

    private String messageId;

    private String placeholders;

    /**
     * Sets destination.
     * <p>
     * Field description:
     * Email address of the recipient in a form of &#x60;john.smith@somecompany.com&#x60;
     * <p>
     * The field is required.
     *
     * @param destination
     * @return This {@link EmailToDestination instance}.
     */
    public EmailToDestination destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Returns destination.
     * <p>
     * Field description:
     * Email address of the recipient in a form of &#x60;john.smith@somecompany.com&#x60;
     * <p>
     * The field is required.
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
     * Email address of the recipient in a form of &#x60;john.smith@somecompany.com&#x60;
     * <p>
     * The field is required.
     *
     * @param destination
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent to a recipient.
     *
     * @param messageId
     * @return This {@link EmailToDestination instance}.
     */
    public EmailToDestination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent to a recipient.
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
     * The ID that uniquely identifies the message sent to a recipient.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * As optional feature, a specific placeholder can be defined whose value will apply only for this destination. Value should be defined as: &#x60;{\&quot;name\&quot;: \&quot;John\&quot;}&#x60;.
     *
     * @param placeholders
     * @return This {@link EmailToDestination instance}.
     */
    public EmailToDestination placeholders(String placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    /**
     * Returns placeholders.
     * <p>
     * Field description:
     * As optional feature, a specific placeholder can be defined whose value will apply only for this destination. Value should be defined as: &#x60;{\&quot;name\&quot;: \&quot;John\&quot;}&#x60;.
     *
     * @return placeholders
     */
    @JsonProperty("placeholders")
    public String getPlaceholders() {
        return placeholders;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * As optional feature, a specific placeholder can be defined whose value will apply only for this destination. Value should be defined as: &#x60;{\&quot;name\&quot;: \&quot;John\&quot;}&#x60;.
     *
     * @param placeholders
     */
    @JsonProperty("placeholders")
    public void setPlaceholders(String placeholders) {
        this.placeholders = placeholders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailToDestination emailToDestination = (EmailToDestination) o;
        return Objects.equals(this.destination, emailToDestination.destination)
                && Objects.equals(this.messageId, emailToDestination.messageId)
                && Objects.equals(this.placeholders, emailToDestination.placeholders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, messageId, placeholders);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailToDestination {")
                .append(newLine)
                .append("    destination: ")
                .append(toIndentedString(destination))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    placeholders: ")
                .append(toIndentedString(placeholders))
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
