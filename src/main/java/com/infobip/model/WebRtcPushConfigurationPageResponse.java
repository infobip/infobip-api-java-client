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
 * Represents WebRtcPushConfigurationPageResponse model.
 */
public class WebRtcPushConfigurationPageResponse {

    private List<WebRtcPushConfigurationResponse> results = null;

    private PageInfo pageInfo;

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of results for this page.
     *
     * @param results
     * @return This {@link WebRtcPushConfigurationPageResponse instance}.
     */
    public WebRtcPushConfigurationPageResponse results(List<WebRtcPushConfigurationResponse> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * List of results for this page.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link WebRtcPushConfigurationPageResponse instance}.
     */
    public WebRtcPushConfigurationPageResponse addResultsItem(WebRtcPushConfigurationResponse resultsItem) {
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
     * List of results for this page.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<WebRtcPushConfigurationResponse> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of results for this page.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<WebRtcPushConfigurationResponse> results) {
        this.results = results;
    }

    /**
     * Sets pageInfo.
     *
     * @param pageInfo
     * @return This {@link WebRtcPushConfigurationPageResponse instance}.
     */
    public WebRtcPushConfigurationPageResponse pageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    /**
     * Returns pageInfo.
     *
     * @return pageInfo
     */
    @JsonProperty("pageInfo")
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets pageInfo.
     *
     * @param pageInfo
     */
    @JsonProperty("pageInfo")
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcPushConfigurationPageResponse webRtcPushConfigurationPageResponse =
                (WebRtcPushConfigurationPageResponse) o;
        return Objects.equals(this.results, webRtcPushConfigurationPageResponse.results)
                && Objects.equals(this.pageInfo, webRtcPushConfigurationPageResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, pageInfo);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPushConfigurationPageResponse {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    pageInfo: ")
                .append(toIndentedString(pageInfo))
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
