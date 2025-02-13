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
 * Represents ViberWebhookInboundReportResponse model.
 */
public class ViberWebhookInboundReportResponse {

    private List<ViberInboundMessageViberInboundContent> results = null;

    private Integer messageCount;

    private Integer pendingMessageCount;

    /**
     * Sets results.
     * <p>
     * Field description:
     * Collection of mobile originated messages.
     *
     * @param results
     * @return This {@link ViberWebhookInboundReportResponse instance}.
     */
    public ViberWebhookInboundReportResponse results(List<ViberInboundMessageViberInboundContent> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * Collection of mobile originated messages.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link ViberWebhookInboundReportResponse instance}.
     */
    public ViberWebhookInboundReportResponse addResultsItem(ViberInboundMessageViberInboundContent resultsItem) {
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
     * Collection of mobile originated messages.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<ViberInboundMessageViberInboundContent> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * Collection of mobile originated messages.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<ViberInboundMessageViberInboundContent> results) {
        this.results = results;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * The number of messages returned in the results array.
     *
     * @param messageCount
     * @return This {@link ViberWebhookInboundReportResponse instance}.
     */
    public ViberWebhookInboundReportResponse messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * The number of messages returned in the results array.
     *
     * @return messageCount
     */
    @JsonProperty("messageCount")
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * The number of messages returned in the results array.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets pendingMessageCount.
     * <p>
     * Field description:
     * The number of messages that have not been pulled in.
     *
     * @param pendingMessageCount
     * @return This {@link ViberWebhookInboundReportResponse instance}.
     */
    public ViberWebhookInboundReportResponse pendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
        return this;
    }

    /**
     * Returns pendingMessageCount.
     * <p>
     * Field description:
     * The number of messages that have not been pulled in.
     *
     * @return pendingMessageCount
     */
    @JsonProperty("pendingMessageCount")
    public Integer getPendingMessageCount() {
        return pendingMessageCount;
    }

    /**
     * Sets pendingMessageCount.
     * <p>
     * Field description:
     * The number of messages that have not been pulled in.
     *
     * @param pendingMessageCount
     */
    @JsonProperty("pendingMessageCount")
    public void setPendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberWebhookInboundReportResponse viberWebhookInboundReportResponse = (ViberWebhookInboundReportResponse) o;
        return Objects.equals(this.results, viberWebhookInboundReportResponse.results)
                && Objects.equals(this.messageCount, viberWebhookInboundReportResponse.messageCount)
                && Objects.equals(this.pendingMessageCount, viberWebhookInboundReportResponse.pendingMessageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, messageCount, pendingMessageCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberWebhookInboundReportResponse {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    pendingMessageCount: ")
                .append(toIndentedString(pendingMessageCount))
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
