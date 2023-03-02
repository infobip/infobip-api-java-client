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
 * Represents CallsDialogRecordingPage model.
 */
public class CallsDialogRecordingPage {

    private List<CallsDialogRecordingResponse> results = null;

    private CallsPageInfo paging;

    /**
     * Sets results.
     * <p>
     * Field description:
     * The list of the results for this page.
     *
     * @param results
     * @return This {@link CallsDialogRecordingPage instance}.
     */
    public CallsDialogRecordingPage results(List<CallsDialogRecordingResponse> results) {
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
     * @return This {@link CallsDialogRecordingPage instance}.
     */
    public CallsDialogRecordingPage addResultsItem(CallsDialogRecordingResponse resultsItem) {
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
    public List<CallsDialogRecordingResponse> getResults() {
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
    public void setResults(List<CallsDialogRecordingResponse> results) {
        this.results = results;
    }

    /**
     * Sets paging.
     *
     * @param paging
     * @return This {@link CallsDialogRecordingPage instance}.
     */
    public CallsDialogRecordingPage paging(CallsPageInfo paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Returns paging.
     *
     * @return paging
     */
    @JsonProperty("paging")
    public CallsPageInfo getPaging() {
        return paging;
    }

    /**
     * Sets paging.
     *
     * @param paging
     */
    @JsonProperty("paging")
    public void setPaging(CallsPageInfo paging) {
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
        CallsDialogRecordingPage callsDialogRecordingPage = (CallsDialogRecordingPage) o;
        return Objects.equals(this.results, callsDialogRecordingPage.results)
                && Objects.equals(this.paging, callsDialogRecordingPage.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, paging);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecordingPage {")
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
