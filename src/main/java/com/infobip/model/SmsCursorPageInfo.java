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
 * Cursor information.
 */
public class SmsCursorPageInfo {

    private Integer limit;

    private String nextCursor;

    /**
     * Sets limit.
     * <p>
     * Field description:
     * Requested limit.
     *
     * @param limit
     * @return This {@link SmsCursorPageInfo instance}.
     */
    public SmsCursorPageInfo limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns limit.
     * <p>
     * Field description:
     * Requested limit.
     *
     * @return limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets limit.
     * <p>
     * Field description:
     * Requested limit.
     *
     * @param limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets nextCursor.
     * <p>
     * Field description:
     * The &#x60;cursor&#x60; value you will use in your next request to fetch the subsequent set of results.
     *
     * @param nextCursor
     * @return This {@link SmsCursorPageInfo instance}.
     */
    public SmsCursorPageInfo nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    /**
     * Returns nextCursor.
     * <p>
     * Field description:
     * The &#x60;cursor&#x60; value you will use in your next request to fetch the subsequent set of results.
     *
     * @return nextCursor
     */
    @JsonProperty("nextCursor")
    public String getNextCursor() {
        return nextCursor;
    }

    /**
     * Sets nextCursor.
     * <p>
     * Field description:
     * The &#x60;cursor&#x60; value you will use in your next request to fetch the subsequent set of results.
     *
     * @param nextCursor
     */
    @JsonProperty("nextCursor")
    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsCursorPageInfo smsCursorPageInfo = (SmsCursorPageInfo) o;
        return Objects.equals(this.limit, smsCursorPageInfo.limit)
                && Objects.equals(this.nextCursor, smsCursorPageInfo.nextCursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, nextCursor);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsCursorPageInfo {")
                .append(newLine)
                .append("    limit: ")
                .append(toIndentedString(limit))
                .append(newLine)
                .append("    nextCursor: ")
                .append(toIndentedString(nextCursor))
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
