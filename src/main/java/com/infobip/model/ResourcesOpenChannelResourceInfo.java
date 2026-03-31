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
 * Information about Open Channel type of resource.
 */
public class ResourcesOpenChannelResourceInfo implements ResourcesIbResourceInfo {

    private String resource;

    private Set<ResourcesResourceCapabilityChannel> capabilities = null;

    private ResourcesIbResourceType resourceType;

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Resource name.
     *
     * @param resource
     * @return This {@link ResourcesOpenChannelResourceInfo instance}.
     */
    public ResourcesOpenChannelResourceInfo resource(String resource) {
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
     * Sets capabilities.
     * <p>
     * Field description:
     * Capabilities of the sender.
     *
     * @param capabilities
     * @return This {@link ResourcesOpenChannelResourceInfo instance}.
     */
    public ResourcesOpenChannelResourceInfo capabilities(Set<ResourcesResourceCapabilityChannel> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * Capabilities of the sender.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesOpenChannelResourceInfo instance}.
     */
    public ResourcesOpenChannelResourceInfo addCapabilitiesItem(ResourcesResourceCapabilityChannel capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new LinkedHashSet<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Returns capabilities.
     * <p>
     * Field description:
     * Capabilities of the sender.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public Set<ResourcesResourceCapabilityChannel> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * Capabilities of the sender.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Set<ResourcesResourceCapabilityChannel> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets resourceType.
     *
     * @param resourceType
     * @return This {@link ResourcesOpenChannelResourceInfo instance}.
     */
    public ResourcesOpenChannelResourceInfo resourceType(ResourcesIbResourceType resourceType) {
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
        ResourcesOpenChannelResourceInfo resourcesOpenChannelResourceInfo = (ResourcesOpenChannelResourceInfo) o;
        return Objects.equals(this.resource, resourcesOpenChannelResourceInfo.resource)
                && Objects.equals(this.capabilities, resourcesOpenChannelResourceInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesOpenChannelResourceInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesOpenChannelResourceInfo {")
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
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
