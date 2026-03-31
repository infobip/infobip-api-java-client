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
 * Response containing information about IB resources.
 */
public class ResourcesIbResourcesResponse {

    private List<ResourcesIbResourceInfo> results = null;

    private PageInfo paging;

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of resources.
     *
     * @param results
     * @return This {@link ResourcesIbResourcesResponse instance}.
     */
    public ResourcesIbResourcesResponse results(List<ResourcesIbResourceInfo> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * List of resources.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link ResourcesIbResourcesResponse instance}.
     */
    public ResourcesIbResourcesResponse addResultsItem(ResourcesIbResourceInfo resultsItem) {
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
     * List of resources.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<ResourcesIbResourceInfo> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of resources.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<ResourcesIbResourceInfo> results) {
        this.results = results;
    }

    /**
     * Sets paging.
     *
     * @param paging
     * @return This {@link ResourcesIbResourcesResponse instance}.
     */
    public ResourcesIbResourcesResponse paging(PageInfo paging) {
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
        ResourcesIbResourcesResponse resourcesIbResourcesResponse = (ResourcesIbResourcesResponse) o;
        return Objects.equals(this.results, resourcesIbResourcesResponse.results)
                && Objects.equals(this.paging, resourcesIbResourcesResponse.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, paging);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesIbResourcesResponse {")
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
