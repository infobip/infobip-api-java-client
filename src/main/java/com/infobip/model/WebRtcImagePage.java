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
 * Represents WebRtcImagePage model.
 */
public class WebRtcImagePage {

    private List<WebRtcImageResponse> results = null;

    private PageInfo paging;

    /**
     * Sets results.
     * <p>
     * Field description:
     * The list of the results for this page.
     *
     * @param results
     * @return This {@link WebRtcImagePage instance}.
     */
    public WebRtcImagePage results(List<WebRtcImageResponse> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * The list of the results for this page.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link WebRtcImagePage instance}.
     */
    public WebRtcImagePage addResultsItem(WebRtcImageResponse resultsItem) {
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
     * The list of the results for this page.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<WebRtcImageResponse> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * The list of the results for this page.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<WebRtcImageResponse> results) {
        this.results = results;
    }

    /**
     * Sets paging.
     *
     * @param paging
     * @return This {@link WebRtcImagePage instance}.
     */
    public WebRtcImagePage paging(PageInfo paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Returns paging.
     *
     * @return paging
     */
    @JsonProperty("paging")
    public PageInfo getPaging() {
        return paging;
    }

    /**
     * Sets paging.
     *
     * @param paging
     */
    @JsonProperty("paging")
    public void setPaging(PageInfo paging) {
        this.paging = paging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcImagePage webRtcImagePage = (WebRtcImagePage) o;
        return Objects.equals(this.results, webRtcImagePage.results)
                && Objects.equals(this.paging, webRtcImagePage.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, paging);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcImagePage {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    paging: ")
                .append(toIndentedString(paging))
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