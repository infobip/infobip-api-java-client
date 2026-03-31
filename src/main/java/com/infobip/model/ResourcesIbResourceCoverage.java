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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Information about the networks configured for the resource.
 */
public class ResourcesIbResourceCoverage {

    private Set<ResourcesNetworkView> outbound = null;

    private Boolean inbound;

    /**
     * Sets outbound.
     *
     * @param outbound
     * @return This {@link ResourcesIbResourceCoverage instance}.
     */
    public ResourcesIbResourceCoverage outbound(Set<ResourcesNetworkView> outbound) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Adds and item into outbound.
     *
     * @param outboundItem The item to be added to the list.
     * @return This {@link ResourcesIbResourceCoverage instance}.
     */
    public ResourcesIbResourceCoverage addOutboundItem(ResourcesNetworkView outboundItem) {
        if (this.outbound == null) {
            this.outbound = new LinkedHashSet<>();
        }
        this.outbound.add(outboundItem);
        return this;
    }

    /**
     * Returns outbound.
     *
     * @return outbound
     */
    @JsonProperty("outbound")
    public Set<ResourcesNetworkView> getOutbound() {
        return outbound;
    }

    /**
     * Sets outbound.
     *
     * @param outbound
     */
    @JsonProperty("outbound")
    public void setOutbound(Set<ResourcesNetworkView> outbound) {
        this.outbound = outbound;
    }

    /**
     * Sets inbound.
     * <p>
     * Field description:
     * Indicates if inbound configuration exists.
     *
     * @param inbound
     * @return This {@link ResourcesIbResourceCoverage instance}.
     */
    public ResourcesIbResourceCoverage inbound(Boolean inbound) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Returns inbound.
     * <p>
     * Field description:
     * Indicates if inbound configuration exists.
     *
     * @return inbound
     */
    @JsonProperty("inbound")
    public Boolean getInbound() {
        return inbound;
    }

    /**
     * Sets inbound.
     * <p>
     * Field description:
     * Indicates if inbound configuration exists.
     *
     * @param inbound
     */
    @JsonProperty("inbound")
    public void setInbound(Boolean inbound) {
        this.inbound = inbound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesIbResourceCoverage resourcesIbResourceCoverage = (ResourcesIbResourceCoverage) o;
        return Objects.equals(this.outbound, resourcesIbResourceCoverage.outbound)
                && Objects.equals(this.inbound, resourcesIbResourceCoverage.inbound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outbound, inbound);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesIbResourceCoverage {")
                .append(newLine)
                .append("    outbound: ")
                .append(toIndentedString(outbound))
                .append(newLine)
                .append("    inbound: ")
                .append(toIndentedString(inbound))
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
