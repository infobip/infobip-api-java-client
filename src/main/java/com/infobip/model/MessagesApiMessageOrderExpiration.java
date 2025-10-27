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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * (WhatsApp specific) Expiration of the order.
 */
public class MessagesApiMessageOrderExpiration {

    private OffsetDateTime timestamp;

    private String description;

    /**
     * Sets timestamp.
     * <p>
     * Field description:
     * Timestamp of the expiration. Must be at least 5 minutes in the future.
     *
     * @param timestamp
     * @return This {@link MessagesApiMessageOrderExpiration instance}.
     */
    public MessagesApiMessageOrderExpiration timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Returns timestamp.
     * <p>
     * Field description:
     * Timestamp of the expiration. Must be at least 5 minutes in the future.
     *
     * @return timestamp
     */
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     * <p>
     * Field description:
     * Timestamp of the expiration. Must be at least 5 minutes in the future.
     *
     * @param timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the expiration.
     *
     * @param description
     * @return This {@link MessagesApiMessageOrderExpiration instance}.
     */
    public MessagesApiMessageOrderExpiration description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the expiration.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the expiration.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrderExpiration messagesApiMessageOrderExpiration = (MessagesApiMessageOrderExpiration) o;
        return Objects.equals(this.timestamp, messagesApiMessageOrderExpiration.timestamp)
                && Objects.equals(this.description, messagesApiMessageOrderExpiration.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderExpiration {")
                .append(newLine)
                .append("    timestamp: ")
                .append(toIndentedString(timestamp))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
