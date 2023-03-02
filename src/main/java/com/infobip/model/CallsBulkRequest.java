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
 * Represents CallsBulkRequest model.
 */
public class CallsBulkRequest {

    private OffsetDateTime sendAt;

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Rescheduled timestamp of the bulk.
     * <p>
     * The field is required.
     *
     * @param sendAt
     * @return This {@link CallsBulkRequest instance}.
     */
    public CallsBulkRequest sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Returns sendAt.
     * <p>
     * Field description:
     * Rescheduled timestamp of the bulk.
     * <p>
     * The field is required.
     *
     * @return sendAt
     */
    @JsonProperty("sendAt")
    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Rescheduled timestamp of the bulk.
     * <p>
     * The field is required.
     *
     * @param sendAt
     */
    @JsonProperty("sendAt")
    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsBulkRequest callsBulkRequest = (CallsBulkRequest) o;
        return Objects.equals(this.sendAt, callsBulkRequest.sendAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsBulkRequest {")
                .append(newLine)
                .append("    sendAt: ")
                .append(toIndentedString(sendAt))
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
