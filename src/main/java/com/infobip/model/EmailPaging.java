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
 * Pagination details like page number, page size,etc.
 */
public class EmailPaging {

    private Integer page;

    private Integer size;

    private Integer totalPages;

    private Integer totalResults;

    /**
     * Sets page.
     *
     * @param page
     * @return This {@link EmailPaging instance}.
     */
    public EmailPaging page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Returns page.
     *
     * @return page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page.
     *
     * @param page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Sets size.
     *
     * @param size
     * @return This {@link EmailPaging instance}.
     */
    public EmailPaging size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Returns size.
     *
     * @return size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Sets totalPages.
     *
     * @param totalPages
     * @return This {@link EmailPaging instance}.
     */
    public EmailPaging totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Returns totalPages.
     *
     * @return totalPages
     */
    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets totalPages.
     *
     * @param totalPages
     */
    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Sets totalResults.
     *
     * @param totalResults
     * @return This {@link EmailPaging instance}.
     */
    public EmailPaging totalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * Returns totalResults.
     *
     * @return totalResults
     */
    @JsonProperty("totalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets totalResults.
     *
     * @param totalResults
     */
    @JsonProperty("totalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailPaging emailPaging = (EmailPaging) o;
        return Objects.equals(this.page, emailPaging.page)
                && Objects.equals(this.size, emailPaging.size)
                && Objects.equals(this.totalPages, emailPaging.totalPages)
                && Objects.equals(this.totalResults, emailPaging.totalResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, size, totalPages, totalResults);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailPaging {")
                .append(newLine)
                .append("    page: ")
                .append(toIndentedString(page))
                .append(newLine)
                .append("    size: ")
                .append(toIndentedString(size))
                .append(newLine)
                .append("    totalPages: ")
                .append(toIndentedString(totalPages))
                .append(newLine)
                .append("    totalResults: ")
                .append(toIndentedString(totalResults))
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
