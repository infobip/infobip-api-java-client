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
 * The array of objects for your sent messages.
 */
public class SmsWebhookInboundReportResponse {

    private Integer messageCount;

    private Integer pendingMessageCount;

    private List<SmsWebhookInboundReport> results = null;

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of returned messages in this request.
     *
     * @param messageCount
     * @return This {@link SmsWebhookInboundReportResponse instance}.
     */
    public SmsWebhookInboundReportResponse messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * Number of returned messages in this request.
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
     * Number of returned messages in this request.
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
     * Number of remaining new messages on Infobip servers ready to be returned in the next request.
     *
     * @param pendingMessageCount
     * @return This {@link SmsWebhookInboundReportResponse instance}.
     */
    public SmsWebhookInboundReportResponse pendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
        return this;
    }

    /**
     * Returns pendingMessageCount.
     * <p>
     * Field description:
     * Number of remaining new messages on Infobip servers ready to be returned in the next request.
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
     * Number of remaining new messages on Infobip servers ready to be returned in the next request.
     *
     * @param pendingMessageCount
     */
    @JsonProperty("pendingMessageCount")
    public void setPendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
    }

    /**
     * Sets results.
     *
     * @param results
     * @return This {@link SmsWebhookInboundReportResponse instance}.
     */
    public SmsWebhookInboundReportResponse results(List<SmsWebhookInboundReport> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link SmsWebhookInboundReportResponse instance}.
     */
    public SmsWebhookInboundReportResponse addResultsItem(SmsWebhookInboundReport resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Returns results.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<SmsWebhookInboundReport> getResults() {
        return results;
    }

    /**
     * Sets results.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<SmsWebhookInboundReport> results) {
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
        SmsWebhookInboundReportResponse smsWebhookInboundReportResponse = (SmsWebhookInboundReportResponse) o;
        return Objects.equals(this.messageCount, smsWebhookInboundReportResponse.messageCount)
                && Objects.equals(this.pendingMessageCount, smsWebhookInboundReportResponse.pendingMessageCount)
                && Objects.equals(this.results, smsWebhookInboundReportResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageCount, pendingMessageCount, results);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsWebhookInboundReportResponse {")
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    pendingMessageCount: ")
                .append(toIndentedString(pendingMessageCount))
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
