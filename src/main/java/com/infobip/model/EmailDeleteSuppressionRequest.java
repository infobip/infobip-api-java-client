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
 * Suppressions request.
 */
public class EmailDeleteSuppressionRequest {

    private List<EmailDeleteSuppression> suppressions = new ArrayList<>();

    /**
     * Sets suppressions.
     * <p>
     * Field description:
     * Email addresses to delete from the suppression list. Number of destinations cannot exceed 10,000.
     * <p>
     * The field is required.
     *
     * @param suppressions
     * @return This {@link EmailDeleteSuppressionRequest instance}.
     */
    public EmailDeleteSuppressionRequest suppressions(List<EmailDeleteSuppression> suppressions) {
        this.suppressions = suppressions;
        return this;
    }

    /**
     * Adds and item into suppressions.
     * <p>
     * Field description:
     * Email addresses to delete from the suppression list. Number of destinations cannot exceed 10,000.
     * <p>
     * The field is required.
     *
     * @param suppressionsItem The item to be added to the list.
     * @return This {@link EmailDeleteSuppressionRequest instance}.
     */
    public EmailDeleteSuppressionRequest addSuppressionsItem(EmailDeleteSuppression suppressionsItem) {
        if (this.suppressions == null) {
            this.suppressions = new ArrayList<>();
        }
        this.suppressions.add(suppressionsItem);
        return this;
    }

    /**
     * Returns suppressions.
     * <p>
     * Field description:
     * Email addresses to delete from the suppression list. Number of destinations cannot exceed 10,000.
     * <p>
     * The field is required.
     *
     * @return suppressions
     */
    @JsonProperty("suppressions")
    public List<EmailDeleteSuppression> getSuppressions() {
        return suppressions;
    }

    /**
     * Sets suppressions.
     * <p>
     * Field description:
     * Email addresses to delete from the suppression list. Number of destinations cannot exceed 10,000.
     * <p>
     * The field is required.
     *
     * @param suppressions
     */
    @JsonProperty("suppressions")
    public void setSuppressions(List<EmailDeleteSuppression> suppressions) {
        this.suppressions = suppressions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDeleteSuppressionRequest emailDeleteSuppressionRequest = (EmailDeleteSuppressionRequest) o;
        return Objects.equals(this.suppressions, emailDeleteSuppressionRequest.suppressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suppressions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDeleteSuppressionRequest {")
                .append(newLine)
                .append("    suppressions: ")
                .append(toIndentedString(suppressions))
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
