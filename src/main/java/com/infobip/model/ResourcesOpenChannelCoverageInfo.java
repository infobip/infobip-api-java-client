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
 * Information about the sender coverage.
 */
public class ResourcesOpenChannelCoverageInfo implements ResourcesIbResourceCoverageInfo {

    private String resource;

    private Boolean shared;

    private Set<ResourcesIbResourceCapability> capabilities = null;

    private ResourcesIbResourceType resourceType;

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Resource name.
     *
     * @param resource
     * @return This {@link ResourcesOpenChannelCoverageInfo instance}.
     */
    public ResourcesOpenChannelCoverageInfo resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Returns resource.
     * <p>
     * Field description:
     * Resource name.
     *
     * @return resource
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Resource name.
     *
     * @param resource
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * Sets shared.
     * <p>
     * Field description:
     * Indicates whether a resource is shared.
     *
     * @param shared
     * @return This {@link ResourcesOpenChannelCoverageInfo instance}.
     */
    public ResourcesOpenChannelCoverageInfo shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * Returns shared.
     * <p>
     * Field description:
     * Indicates whether a resource is shared.
     *
     * @return shared
     */
    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    /**
     * Sets shared.
     * <p>
     * Field description:
     * Indicates whether a resource is shared.
     *
     * @param shared
     */
    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     * @return This {@link ResourcesOpenChannelCoverageInfo instance}.
     */
    public ResourcesOpenChannelCoverageInfo capabilities(Set<ResourcesIbResourceCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesOpenChannelCoverageInfo instance}.
     */
    public ResourcesOpenChannelCoverageInfo addCapabilitiesItem(ResourcesIbResourceCapability capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new LinkedHashSet<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Returns capabilities.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public Set<ResourcesIbResourceCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Set<ResourcesIbResourceCapability> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets resourceType.
     *
     * @param resourceType
     * @return This {@link ResourcesOpenChannelCoverageInfo instance}.
     */
    public ResourcesOpenChannelCoverageInfo resourceType(ResourcesIbResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Returns resourceType.
     *
     * @return resourceType
     */
    @JsonProperty("resourceType")
    public ResourcesIbResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Sets resourceType.
     *
     * @param resourceType
     */
    @JsonProperty("resourceType")
    public void setResourceType(ResourcesIbResourceType resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesOpenChannelCoverageInfo resourcesOpenChannelCoverageInfo = (ResourcesOpenChannelCoverageInfo) o;
        return Objects.equals(this.resource, resourcesOpenChannelCoverageInfo.resource)
                && Objects.equals(this.shared, resourcesOpenChannelCoverageInfo.shared)
                && Objects.equals(this.capabilities, resourcesOpenChannelCoverageInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesOpenChannelCoverageInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, shared, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesOpenChannelCoverageInfo {")
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
                .append(newLine)
                .append("    shared: ")
                .append(toIndentedString(shared))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    resourceType: ")
                .append(toIndentedString(resourceType))
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
