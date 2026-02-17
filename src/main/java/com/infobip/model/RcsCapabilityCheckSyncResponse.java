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
 * Represents RcsCapabilityCheckSyncResponse model.
 */
public class RcsCapabilityCheckSyncResponse {

    private List<RcsCapabilityCheckSyncResult> capabilityCheckResults = new ArrayList<>();

    private RcsCapabilityCheckOptions options;

    /**
     * Sets capabilityCheckResults.
     * <p>
     * Field description:
     * The result of the RCS capability check for the specified phone numbers.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckResults
     * @return This {@link RcsCapabilityCheckSyncResponse instance}.
     */
    public RcsCapabilityCheckSyncResponse capabilityCheckResults(
            List<RcsCapabilityCheckSyncResult> capabilityCheckResults) {
        this.capabilityCheckResults = capabilityCheckResults;
        return this;
    }

    /**
     * Adds and item into capabilityCheckResults.
     * <p>
     * Field description:
     * The result of the RCS capability check for the specified phone numbers.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckResultsItem The item to be added to the list.
     * @return This {@link RcsCapabilityCheckSyncResponse instance}.
     */
    public RcsCapabilityCheckSyncResponse addCapabilityCheckResultsItem(
            RcsCapabilityCheckSyncResult capabilityCheckResultsItem) {
        if (this.capabilityCheckResults == null) {
            this.capabilityCheckResults = new ArrayList<>();
        }
        this.capabilityCheckResults.add(capabilityCheckResultsItem);
        return this;
    }

    /**
     * Returns capabilityCheckResults.
     * <p>
     * Field description:
     * The result of the RCS capability check for the specified phone numbers.
     * <p>
     * The field is required.
     *
     * @return capabilityCheckResults
     */
    @JsonProperty("capabilityCheckResults")
    public List<RcsCapabilityCheckSyncResult> getCapabilityCheckResults() {
        return capabilityCheckResults;
    }

    /**
     * Sets capabilityCheckResults.
     * <p>
     * Field description:
     * The result of the RCS capability check for the specified phone numbers.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckResults
     */
    @JsonProperty("capabilityCheckResults")
    public void setCapabilityCheckResults(List<RcsCapabilityCheckSyncResult> capabilityCheckResults) {
        this.capabilityCheckResults = capabilityCheckResults;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link RcsCapabilityCheckSyncResponse instance}.
     */
    public RcsCapabilityCheckSyncResponse options(RcsCapabilityCheckOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public RcsCapabilityCheckOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(RcsCapabilityCheckOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCapabilityCheckSyncResponse rcsCapabilityCheckSyncResponse = (RcsCapabilityCheckSyncResponse) o;
        return Objects.equals(this.capabilityCheckResults, rcsCapabilityCheckSyncResponse.capabilityCheckResults)
                && Objects.equals(this.options, rcsCapabilityCheckSyncResponse.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capabilityCheckResults, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckSyncResponse {")
                .append(newLine)
                .append("    capabilityCheckResults: ")
                .append(toIndentedString(capabilityCheckResults))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
