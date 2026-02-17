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
 * Represents RcsLogsResponse model.
 */
public class RcsLogsResponse {

    private List<RcsLogsResult> results = null;

    private RcsCursorPageInfo cursor;

    /**
     * Sets results.
     * <p>
     * Field description:
     * An array of message log results, one object per each message log entry.
     *
     * @param results
     * @return This {@link RcsLogsResponse instance}.
     */
    public RcsLogsResponse results(List<RcsLogsResult> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * An array of message log results, one object per each message log entry.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link RcsLogsResponse instance}.
     */
    public RcsLogsResponse addResultsItem(RcsLogsResult resultsItem) {
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
     * An array of message log results, one object per each message log entry.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<RcsLogsResult> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * An array of message log results, one object per each message log entry.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<RcsLogsResult> results) {
        this.results = results;
    }

    /**
     * Sets cursor.
     *
     * @param cursor
     * @return This {@link RcsLogsResponse instance}.
     */
    public RcsLogsResponse cursor(RcsCursorPageInfo cursor) {
        this.cursor = cursor;
        return this;
    }

    /**
     * Returns cursor.
     *
     * @return cursor
     */
    @JsonProperty("cursor")
    public RcsCursorPageInfo getCursor() {
        return cursor;
    }

    /**
     * Sets cursor.
     *
     * @param cursor
     */
    @JsonProperty("cursor")
    public void setCursor(RcsCursorPageInfo cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsLogsResponse rcsLogsResponse = (RcsLogsResponse) o;
        return Objects.equals(this.results, rcsLogsResponse.results)
                && Objects.equals(this.cursor, rcsLogsResponse.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, cursor);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsLogsResponse {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    cursor: ")
                .append(toIndentedString(cursor))
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
