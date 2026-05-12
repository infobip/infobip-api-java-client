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
 * Collection of preliminary lookup results.
 */
public class NumberLookupResponseAsyncDetails {

    private String to;

    private NumberLookupStatus status;

    private String messageId;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The looked up phone number.
     *
     * @param to
     * @return This {@link NumberLookupResponseAsyncDetails instance}.
     */
    public NumberLookupResponseAsyncDetails to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The looked up phone number.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The looked up phone number.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link NumberLookupResponseAsyncDetails instance}.
     */
    public NumberLookupResponseAsyncDetails status(NumberLookupStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public NumberLookupStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(NumberLookupStatus status) {
        this.status = status;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the performed lookup.
     *
     * @param messageId
     * @return This {@link NumberLookupResponseAsyncDetails instance}.
     */
    public NumberLookupResponseAsyncDetails messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the performed lookup.
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
     * The ID that uniquely identifies the performed lookup.
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
        NumberLookupResponseAsyncDetails numberLookupResponseAsyncDetails = (NumberLookupResponseAsyncDetails) o;
        return Objects.equals(this.to, numberLookupResponseAsyncDetails.to)
                && Objects.equals(this.status, numberLookupResponseAsyncDetails.status)
                && Objects.equals(this.messageId, numberLookupResponseAsyncDetails.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, status, messageId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupResponseAsyncDetails {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
