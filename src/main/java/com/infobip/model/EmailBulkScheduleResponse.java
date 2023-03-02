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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents EmailBulkScheduleResponse model.
 */
public class EmailBulkScheduleResponse {

    private String externalBulkId;

    private List<EmailBulkInfo> bulks = null;

    /**
     * Sets externalBulkId.
     *
     * @param externalBulkId
     * @return This {@link EmailBulkScheduleResponse instance}.
     */
    public EmailBulkScheduleResponse externalBulkId(String externalBulkId) {
        this.externalBulkId = externalBulkId;
        return this;
    }

    /**
     * Returns externalBulkId.
     *
     * @return externalBulkId
     */
    @JsonProperty("externalBulkId")
    public String getExternalBulkId() {
        return externalBulkId;
    }

    /**
     * Sets externalBulkId.
     *
     * @param externalBulkId
     */
    @JsonProperty("externalBulkId")
    public void setExternalBulkId(String externalBulkId) {
        this.externalBulkId = externalBulkId;
    }

    /**
     * Sets bulks.
     *
     * @param bulks
     * @return This {@link EmailBulkScheduleResponse instance}.
     */
    public EmailBulkScheduleResponse bulks(List<EmailBulkInfo> bulks) {
        this.bulks = bulks;
        return this;
    }

    /**
     * Adds and item into bulks.
     *
     * @param bulksItem The item to be added to the list.
     * @return This {@link EmailBulkScheduleResponse instance}.
     */
    public EmailBulkScheduleResponse addBulksItem(EmailBulkInfo bulksItem) {
        if (this.bulks == null) {
            this.bulks = new ArrayList<>();
        }
        this.bulks.add(bulksItem);
        return this;
    }

    /**
     * Returns bulks.
     *
     * @return bulks
     */
    @JsonProperty("bulks")
    public List<EmailBulkInfo> getBulks() {
        return bulks;
    }

    /**
     * Sets bulks.
     *
     * @param bulks
     */
    @JsonProperty("bulks")
    public void setBulks(List<EmailBulkInfo> bulks) {
        this.bulks = bulks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailBulkScheduleResponse emailBulkScheduleResponse = (EmailBulkScheduleResponse) o;
        return Objects.equals(this.externalBulkId, emailBulkScheduleResponse.externalBulkId)
                && Objects.equals(this.bulks, emailBulkScheduleResponse.bulks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalBulkId, bulks);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailBulkScheduleResponse {")
                .append(newLine)
                .append("    externalBulkId: ")
                .append(toIndentedString(externalBulkId))
                .append(newLine)
                .append("    bulks: ")
                .append(toIndentedString(bulks))
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
