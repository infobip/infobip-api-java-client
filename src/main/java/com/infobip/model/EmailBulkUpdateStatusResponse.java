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
 * Represents EmailBulkUpdateStatusResponse model.
 */
public class EmailBulkUpdateStatusResponse {

    private String bulkId;

    private EmailBulkStatus status;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message within the bulk.
     * <p>
     * The field is required.
     *
     * @param bulkId
     * @return This {@link EmailBulkUpdateStatusResponse instance}.
     */
    public EmailBulkUpdateStatusResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message within the bulk.
     * <p>
     * The field is required.
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
     * The ID that uniquely identifies the message within the bulk.
     * <p>
     * The field is required.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link EmailBulkUpdateStatusResponse instance}.
     */
    public EmailBulkUpdateStatusResponse status(EmailBulkStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public EmailBulkStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(EmailBulkStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailBulkUpdateStatusResponse emailBulkUpdateStatusResponse = (EmailBulkUpdateStatusResponse) o;
        return Objects.equals(this.bulkId, emailBulkUpdateStatusResponse.bulkId)
                && Objects.equals(this.status, emailBulkUpdateStatusResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, status);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailBulkUpdateStatusResponse {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
