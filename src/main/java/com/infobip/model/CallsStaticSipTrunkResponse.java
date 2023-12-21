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
 * Represents CallsStaticSipTrunkResponse model.
 */
public class CallsStaticSipTrunkResponse extends CallsSipTrunkResponse {

    private List<String> sourceHosts = null;

    private List<String> destinationHosts = null;

    private CallsSelectionStrategy strategy;

    /**
     * Constructs a new {@link CallsStaticSipTrunkResponse} instance.
     */
    public CallsStaticSipTrunkResponse() {
        super("STATIC");
    }

    /**
     * Sets sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @param sourceHosts
     * @return This {@link CallsStaticSipTrunkResponse instance}.
     */
    public CallsStaticSipTrunkResponse sourceHosts(List<String> sourceHosts) {
        this.sourceHosts = sourceHosts;
        return this;
    }

    /**
     * Adds and item into sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @param sourceHostsItem The item to be added to the list.
     * @return This {@link CallsStaticSipTrunkResponse instance}.
     */
    public CallsStaticSipTrunkResponse addSourceHostsItem(String sourceHostsItem) {
        if (this.sourceHosts == null) {
            this.sourceHosts = new ArrayList<>();
        }
        this.sourceHosts.add(sourceHostsItem);
        return this;
    }

    /**
     * Returns sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @return sourceHosts
     */
    @JsonProperty("sourceHosts")
    public List<String> getSourceHosts() {
        return sourceHosts;
    }

    /**
     * Sets sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @param sourceHosts
     */
    @JsonProperty("sourceHosts")
    public void setSourceHosts(List<String> sourceHosts) {
        this.sourceHosts = sourceHosts;
    }

    /**
     * Sets destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @param destinationHosts
     * @return This {@link CallsStaticSipTrunkResponse instance}.
     */
    public CallsStaticSipTrunkResponse destinationHosts(List<String> destinationHosts) {
        this.destinationHosts = destinationHosts;
        return this;
    }

    /**
     * Adds and item into destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @param destinationHostsItem The item to be added to the list.
     * @return This {@link CallsStaticSipTrunkResponse instance}.
     */
    public CallsStaticSipTrunkResponse addDestinationHostsItem(String destinationHostsItem) {
        if (this.destinationHosts == null) {
            this.destinationHosts = new ArrayList<>();
        }
        this.destinationHosts.add(destinationHostsItem);
        return this;
    }

    /**
     * Returns destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @return destinationHosts
     */
    @JsonProperty("destinationHosts")
    public List<String> getDestinationHosts() {
        return destinationHosts;
    }

    /**
     * Sets destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @param destinationHosts
     */
    @JsonProperty("destinationHosts")
    public void setDestinationHosts(List<String> destinationHosts) {
        this.destinationHosts = destinationHosts;
    }

    /**
     * Sets strategy.
     *
     * @param strategy
     * @return This {@link CallsStaticSipTrunkResponse instance}.
     */
    public CallsStaticSipTrunkResponse strategy(CallsSelectionStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Returns strategy.
     *
     * @return strategy
     */
    @JsonProperty("strategy")
    public CallsSelectionStrategy getStrategy() {
        return strategy;
    }

    /**
     * Sets strategy.
     *
     * @param strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(CallsSelectionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsStaticSipTrunkResponse callsStaticSipTrunkResponse = (CallsStaticSipTrunkResponse) o;
        return Objects.equals(this.sourceHosts, callsStaticSipTrunkResponse.sourceHosts)
                && Objects.equals(this.destinationHosts, callsStaticSipTrunkResponse.destinationHosts)
                && Objects.equals(this.strategy, callsStaticSipTrunkResponse.strategy)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceHosts, destinationHosts, strategy, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsStaticSipTrunkResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    sourceHosts: ")
                .append(toIndentedString(sourceHosts))
                .append(newLine)
                .append("    destinationHosts: ")
                .append(toIndentedString(destinationHosts))
                .append(newLine)
                .append("    strategy: ")
                .append(toIndentedString(strategy))
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
