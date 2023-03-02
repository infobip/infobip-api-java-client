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
 * Contains information about the page.
 */
public class WebRtcPageInfo {

    private Integer page;

    private Integer size;

    private Integer totalPages;

    private Long totalResults;

    /**
     * Sets page.
     * <p>
     * Field description:
     * Requested page number.
     * <p>
     * The field is required.
     *
     * @param page
     * @return This {@link WebRtcPageInfo instance}.
     */
    public WebRtcPageInfo page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Returns page.
     * <p>
     * Field description:
     * Requested page number.
     * <p>
     * The field is required.
     *
     * @return page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page.
     * <p>
     * Field description:
     * Requested page number.
     * <p>
     * The field is required.
     *
     * @param page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Requested page size.
     * <p>
     * The field is required.
     *
     * @param size
     * @return This {@link WebRtcPageInfo instance}.
     */
    public WebRtcPageInfo size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Returns size.
     * <p>
     * Field description:
     * Requested page size.
     * <p>
     * The field is required.
     *
     * @return size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Requested page size.
     * <p>
     * The field is required.
     *
     * @param size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Sets totalPages.
     * <p>
     * Field description:
     * The total number of pages of the results matching the requested parameters.
     * <p>
     * The field is required.
     *
     * @param totalPages
     * @return This {@link WebRtcPageInfo instance}.
     */
    public WebRtcPageInfo totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Returns totalPages.
     * <p>
     * Field description:
     * The total number of pages of the results matching the requested parameters.
     * <p>
     * The field is required.
     *
     * @return totalPages
     */
    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets totalPages.
     * <p>
     * Field description:
     * The total number of pages of the results matching the requested parameters.
     * <p>
     * The field is required.
     *
     * @param totalPages
     */
    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Sets totalResults.
     * <p>
     * Field description:
     * The total number of the results matching the requested parameters.
     * <p>
     * The field is required.
     *
     * @param totalResults
     * @return This {@link WebRtcPageInfo instance}.
     */
    public WebRtcPageInfo totalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * Returns totalResults.
     * <p>
     * Field description:
     * The total number of the results matching the requested parameters.
     * <p>
     * The field is required.
     *
     * @return totalResults
     */
    @JsonProperty("totalResults")
    public Long getTotalResults() {
        return totalResults;
    }

    /**
     * Sets totalResults.
     * <p>
     * Field description:
     * The total number of the results matching the requested parameters.
     * <p>
     * The field is required.
     *
     * @param totalResults
     */
    @JsonProperty("totalResults")
    public void setTotalResults(Long totalResults) {
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
        WebRtcPageInfo webRtcPageInfo = (WebRtcPageInfo) o;
        return Objects.equals(this.page, webRtcPageInfo.page)
                && Objects.equals(this.size, webRtcPageInfo.size)
                && Objects.equals(this.totalPages, webRtcPageInfo.totalPages)
                && Objects.equals(this.totalResults, webRtcPageInfo.totalResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, size, totalPages, totalResults);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPageInfo {")
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
