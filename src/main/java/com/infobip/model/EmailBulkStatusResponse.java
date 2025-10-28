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
 * Represents EmailBulkStatusResponse model.
 */
public class EmailBulkStatusResponse {

    private String externalBulkId;

    private List<EmailBulkStatusInfo> bulks = new ArrayList<>();

    /**
     * Sets externalBulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent bulk.
     * <p>
     * The field is required.
     *
     * @param externalBulkId
     * @return This {@link EmailBulkStatusResponse instance}.
     */
    public EmailBulkStatusResponse externalBulkId(String externalBulkId) {
        this.externalBulkId = externalBulkId;
        return this;
    }

    /**
     * Returns externalBulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent bulk.
     * <p>
     * The field is required.
     *
     * @return externalBulkId
     */
    @JsonProperty("externalBulkId")
    public String getExternalBulkId() {
        return externalBulkId;
    }

    /**
     * Sets externalBulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the sent bulk.
     * <p>
     * The field is required.
     *
     * @param externalBulkId
     */
    @JsonProperty("externalBulkId")
    public void setExternalBulkId(String externalBulkId) {
        this.externalBulkId = externalBulkId;
    }

    /**
     * Sets bulks.
     * <p>
     * The field is required.
     *
     * @param bulks
     * @return This {@link EmailBulkStatusResponse instance}.
     */
    public EmailBulkStatusResponse bulks(List<EmailBulkStatusInfo> bulks) {
        this.bulks = bulks;
        return this;
    }

    /**
     * Adds and item into bulks.
     * <p>
     * The field is required.
     *
     * @param bulksItem The item to be added to the list.
     * @return This {@link EmailBulkStatusResponse instance}.
     */
    public EmailBulkStatusResponse addBulksItem(EmailBulkStatusInfo bulksItem) {
        if (this.bulks == null) {
            this.bulks = new ArrayList<>();
        }
        this.bulks.add(bulksItem);
        return this;
    }

    /**
     * Returns bulks.
     * <p>
     * The field is required.
     *
     * @return bulks
     */
    @JsonProperty("bulks")
    public List<EmailBulkStatusInfo> getBulks() {
        return bulks;
    }

    /**
     * Sets bulks.
     * <p>
     * The field is required.
     *
     * @param bulks
     */
    @JsonProperty("bulks")
    public void setBulks(List<EmailBulkStatusInfo> bulks) {
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
        EmailBulkStatusResponse emailBulkStatusResponse = (EmailBulkStatusResponse) o;
        return Objects.equals(this.externalBulkId, emailBulkStatusResponse.externalBulkId)
                && Objects.equals(this.bulks, emailBulkStatusResponse.bulks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalBulkId, bulks);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailBulkStatusResponse {")
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
