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
 * Represents EmailAllDomainsResponse model.
 */
public class EmailAllDomainsResponse {

    private EmailPaging paging;

    private List<EmailDomainResponse> results = null;

    /**
     * Sets paging.
     *
     * @param paging
     * @return This {@link EmailAllDomainsResponse instance}.
     */
    public EmailAllDomainsResponse paging(EmailPaging paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Returns paging.
     *
     * @return paging
     */
    @JsonProperty("paging")
    public EmailPaging getPaging() {
        return paging;
    }

    /**
     * Sets paging.
     *
     * @param paging
     */
    @JsonProperty("paging")
    public void setPaging(EmailPaging paging) {
        this.paging = paging;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of domains that belong to the account.
     *
     * @param results
     * @return This {@link EmailAllDomainsResponse instance}.
     */
    public EmailAllDomainsResponse results(List<EmailDomainResponse> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * List of domains that belong to the account.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link EmailAllDomainsResponse instance}.
     */
    public EmailAllDomainsResponse addResultsItem(EmailDomainResponse resultsItem) {
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
     * List of domains that belong to the account.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<EmailDomainResponse> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * List of domains that belong to the account.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<EmailDomainResponse> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailAllDomainsResponse emailAllDomainsResponse = (EmailAllDomainsResponse) o;
        return Objects.equals(this.paging, emailAllDomainsResponse.paging)
                && Objects.equals(this.results, emailAllDomainsResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paging, results);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailAllDomainsResponse {")
                .append(newLine)
                .append("    paging: ")
                .append(toIndentedString(paging))
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
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
