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
 * Represents NumbersCampaignNetworkStatusWebhookResponse model.
 */
public class NumbersCampaignNetworkStatusWebhookResponse {

    private List<NumbersCampaignNetworkStatusWebhookMessage> results = null;

    /**
     * Sets results.
     * <p>
     * Field description:
     * Incoming events
     *
     * @param results
     * @return This {@link NumbersCampaignNetworkStatusWebhookResponse instance}.
     */
    public NumbersCampaignNetworkStatusWebhookResponse results(
            List<NumbersCampaignNetworkStatusWebhookMessage> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * Incoming events
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link NumbersCampaignNetworkStatusWebhookResponse instance}.
     */
    public NumbersCampaignNetworkStatusWebhookResponse addResultsItem(
            NumbersCampaignNetworkStatusWebhookMessage resultsItem) {
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
     * Incoming events
     *
     * @return results
     */
    @JsonProperty("results")
    public List<NumbersCampaignNetworkStatusWebhookMessage> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * Incoming events
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<NumbersCampaignNetworkStatusWebhookMessage> results) {
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
        NumbersCampaignNetworkStatusWebhookResponse numbersCampaignNetworkStatusWebhookResponse =
                (NumbersCampaignNetworkStatusWebhookResponse) o;
        return Objects.equals(this.results, numbersCampaignNetworkStatusWebhookResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaignNetworkStatusWebhookResponse {")
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
