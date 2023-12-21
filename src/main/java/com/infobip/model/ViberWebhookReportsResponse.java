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
 * Represents ViberWebhookReportsResponse model.
 */
public class ViberWebhookReportsResponse {

    private List<ViberWebhookReport> reports = null;

    /**
     * Sets reports.
     * <p>
     * Field description:
     * Collection of reports, one per every message.
     *
     * @param reports
     * @return This {@link ViberWebhookReportsResponse instance}.
     */
    public ViberWebhookReportsResponse reports(List<ViberWebhookReport> reports) {
        this.reports = reports;
        return this;
    }

    /**
     * Adds and item into reports.
     * <p>
     * Field description:
     * Collection of reports, one per every message.
     *
     * @param reportsItem The item to be added to the list.
     * @return This {@link ViberWebhookReportsResponse instance}.
     */
    public ViberWebhookReportsResponse addReportsItem(ViberWebhookReport reportsItem) {
        if (this.reports == null) {
            this.reports = new ArrayList<>();
        }
        this.reports.add(reportsItem);
        return this;
    }

    /**
     * Returns reports.
     * <p>
     * Field description:
     * Collection of reports, one per every message.
     *
     * @return reports
     */
    @JsonProperty("reports")
    public List<ViberWebhookReport> getReports() {
        return reports;
    }

    /**
     * Sets reports.
     * <p>
     * Field description:
     * Collection of reports, one per every message.
     *
     * @param reports
     */
    @JsonProperty("reports")
    public void setReports(List<ViberWebhookReport> reports) {
        this.reports = reports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberWebhookReportsResponse viberWebhookReportsResponse = (ViberWebhookReportsResponse) o;
        return Objects.equals(this.reports, viberWebhookReportsResponse.reports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reports);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberWebhookReportsResponse {")
                .append(newLine)
                .append("    reports: ")
                .append(toIndentedString(reports))
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
