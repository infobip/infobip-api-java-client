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
 * Represents SmsLogsResponse model.
 */
public class SmsLogsResponse {

    private List<SmsLog> results = null;

    private SmsCursorPageInfo cursor;

    /**
     * Sets results.
     * <p>
     * Field description:
     * An array of message log results, one object per each message log entry.
     *
     * @param results
     * @return This {@link SmsLogsResponse instance}.
     */
    public SmsLogsResponse results(List<SmsLog> results) {
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
     * @return This {@link SmsLogsResponse instance}.
     */
    public SmsLogsResponse addResultsItem(SmsLog resultsItem) {
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
    public List<SmsLog> getResults() {
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
    public void setResults(List<SmsLog> results) {
        this.results = results;
    }

    /**
     * Sets cursor.
     *
     * @param cursor
     * @return This {@link SmsLogsResponse instance}.
     */
    public SmsLogsResponse cursor(SmsCursorPageInfo cursor) {
        this.cursor = cursor;
        return this;
    }

    /**
     * Returns cursor.
     *
     * @return cursor
     */
    @JsonProperty("cursor")
    public SmsCursorPageInfo getCursor() {
        return cursor;
    }

    /**
     * Sets cursor.
     *
     * @param cursor
     */
    @JsonProperty("cursor")
    public void setCursor(SmsCursorPageInfo cursor) {
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
        SmsLogsResponse smsLogsResponse = (SmsLogsResponse) o;
        return Objects.equals(this.results, smsLogsResponse.results)
                && Objects.equals(this.cursor, smsLogsResponse.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, cursor);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsLogsResponse {")
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
