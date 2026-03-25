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
public class ResourcesViberCoverageInfo implements ResourcesIbResourceCoverageInfo {

    private String resource;

    private Boolean shared;

    private String originalResourceName;

    private String countryCode;

    private String countryName;

    private Set<ResourcesIbResourceCapability> capabilities = null;

    private ResourcesIbResourceType resourceType;

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Resource name.
     *
     * @param resource
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo resource(String resource) {
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
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo shared(Boolean shared) {
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
     * Sets originalResourceName.
     * <p>
     * Field description:
     * Original resource name.
     *
     * @param originalResourceName
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo originalResourceName(String originalResourceName) {
        this.originalResourceName = originalResourceName;
        return this;
    }

    /**
     * Returns originalResourceName.
     * <p>
     * Field description:
     * Original resource name.
     *
     * @return originalResourceName
     */
    @JsonProperty("originalResourceName")
    public String getOriginalResourceName() {
        return originalResourceName;
    }

    /**
     * Sets originalResourceName.
     * <p>
     * Field description:
     * Original resource name.
     *
     * @param originalResourceName
     */
    @JsonProperty("originalResourceName")
    public void setOriginalResourceName(String originalResourceName) {
        this.originalResourceName = originalResourceName;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Country name.
     *
     * @param countryName
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Returns countryName.
     * <p>
     * Field description:
     * Country name.
     *
     * @return countryName
     */
    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Country name.
     *
     * @param countryName
     */
    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo capabilities(Set<ResourcesIbResourceCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo addCapabilitiesItem(ResourcesIbResourceCapability capabilitiesItem) {
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
     * @return This {@link ResourcesViberCoverageInfo instance}.
     */
    public ResourcesViberCoverageInfo resourceType(ResourcesIbResourceType resourceType) {
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
        ResourcesViberCoverageInfo resourcesViberCoverageInfo = (ResourcesViberCoverageInfo) o;
        return Objects.equals(this.resource, resourcesViberCoverageInfo.resource)
                && Objects.equals(this.shared, resourcesViberCoverageInfo.shared)
                && Objects.equals(this.originalResourceName, resourcesViberCoverageInfo.originalResourceName)
                && Objects.equals(this.countryCode, resourcesViberCoverageInfo.countryCode)
                && Objects.equals(this.countryName, resourcesViberCoverageInfo.countryName)
                && Objects.equals(this.capabilities, resourcesViberCoverageInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesViberCoverageInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resource, shared, originalResourceName, countryCode, countryName, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesViberCoverageInfo {")
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
                .append(newLine)
                .append("    shared: ")
                .append(toIndentedString(shared))
                .append(newLine)
                .append("    originalResourceName: ")
                .append(toIndentedString(originalResourceName))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    countryName: ")
                .append(toIndentedString(countryName))
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
