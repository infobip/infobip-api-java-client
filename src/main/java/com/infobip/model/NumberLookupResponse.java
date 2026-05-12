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
 * Represents NumberLookupResponse model.
 */
public class NumberLookupResponse {

    private List<NumberLookupResponseDetails> results = null;

    private String bulkId;

    /**
     * Sets results.
     * <p>
     * Field description:
     * Collection of lookup results.
     *
     * @param results
     * @return This {@link NumberLookupResponse instance}.
     */
    public NumberLookupResponse results(List<NumberLookupResponseDetails> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * Collection of lookup results.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link NumberLookupResponse instance}.
     */
    public NumberLookupResponse addResultsItem(NumberLookupResponseDetails resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Returns results.
     * <p>
     * Field description:
     * Collection of lookup results.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<NumberLookupResponseDetails> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * Collection of lookup results.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<NumberLookupResponseDetails> results) {
        this.results = results;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     *
     * @param bulkId
     * @return This {@link NumberLookupResponse instance}.
     */
    public NumberLookupResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
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
     * The ID that uniquely identifies the request.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberLookupResponse numberLookupResponse = (NumberLookupResponse) o;
        return Objects.equals(this.results, numberLookupResponse.results)
                && Objects.equals(this.bulkId, numberLookupResponse.bulkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, bulkId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupResponse {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
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
