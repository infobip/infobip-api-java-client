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
import java.util.Objects;

/**
 * Coverage by capability.
 */
public class ResourcesIbResourceCapability {

    private ResourcesResourceCapabilityChannel channel;

    private ResourcesIbResourceCoverage coverage;

    /**
     * Sets channel.
     *
     * @param channel
     * @return This {@link ResourcesIbResourceCapability instance}.
     */
    public ResourcesIbResourceCapability channel(ResourcesResourceCapabilityChannel channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     *
     * @return channel
     */
    @JsonProperty("channel")
    public ResourcesResourceCapabilityChannel getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(ResourcesResourceCapabilityChannel channel) {
        this.channel = channel;
    }

    /**
     * Sets coverage.
     *
     * @param coverage
     * @return This {@link ResourcesIbResourceCapability instance}.
     */
    public ResourcesIbResourceCapability coverage(ResourcesIbResourceCoverage coverage) {
        this.coverage = coverage;
        return this;
    }

    /**
     * Returns coverage.
     *
     * @return coverage
     */
    @JsonProperty("coverage")
    public ResourcesIbResourceCoverage getCoverage() {
        return coverage;
    }

    /**
     * Sets coverage.
     *
     * @param coverage
     */
    @JsonProperty("coverage")
    public void setCoverage(ResourcesIbResourceCoverage coverage) {
        this.coverage = coverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesIbResourceCapability resourcesIbResourceCapability = (ResourcesIbResourceCapability) o;
        return Objects.equals(this.channel, resourcesIbResourceCapability.channel)
                && Objects.equals(this.coverage, resourcesIbResourceCapability.coverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, coverage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesIbResourceCapability {")
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    coverage: ")
                .append(toIndentedString(coverage))
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
