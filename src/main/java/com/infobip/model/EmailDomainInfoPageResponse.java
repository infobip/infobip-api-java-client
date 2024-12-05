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
 * Domain get response.
 */
public class EmailDomainInfoPageResponse {

    private List<EmailDomainInfo> results = new ArrayList<>();

    private EmailPageDetails paging;

    /**
     * Sets results.
     * <p>
     * Field description:
     * Domains for requested paging information.
     * <p>
     * The field is required.
     *
     * @param results
     * @return This {@link EmailDomainInfoPageResponse instance}.
     */
    public EmailDomainInfoPageResponse results(List<EmailDomainInfo> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * Domains for requested paging information.
     * <p>
     * The field is required.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link EmailDomainInfoPageResponse instance}.
     */
    public EmailDomainInfoPageResponse addResultsItem(EmailDomainInfo resultsItem) {
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
     * Domains for requested paging information.
     * <p>
     * The field is required.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<EmailDomainInfo> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * Domains for requested paging information.
     * <p>
     * The field is required.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<EmailDomainInfo> results) {
        this.results = results;
    }

    /**
     * Sets paging.
     * <p>
     * The field is required.
     *
     * @param paging
     * @return This {@link EmailDomainInfoPageResponse instance}.
     */
    public EmailDomainInfoPageResponse paging(EmailPageDetails paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Returns paging.
     * <p>
     * The field is required.
     *
     * @return paging
     */
    @JsonProperty("paging")
    public EmailPageDetails getPaging() {
        return paging;
    }

    /**
     * Sets paging.
     * <p>
     * The field is required.
     *
     * @param paging
     */
    @JsonProperty("paging")
    public void setPaging(EmailPageDetails paging) {
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
        EmailDomainInfoPageResponse emailDomainInfoPageResponse = (EmailDomainInfoPageResponse) o;
        return Objects.equals(this.results, emailDomainInfoPageResponse.results)
                && Objects.equals(this.paging, emailDomainInfoPageResponse.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, paging);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainInfoPageResponse {")
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
