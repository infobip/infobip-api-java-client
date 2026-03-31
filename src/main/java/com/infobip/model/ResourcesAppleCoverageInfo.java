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
public class ResourcesAppleCoverageInfo implements ResourcesIbResourceCoverageInfo {

    private String resource;

    private String displayName;

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
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo resource(String resource) {
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
     * Sets displayName.
     * <p>
     * Field description:
     * Display name.
     *
     * @param displayName
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Display name.
     *
     * @return displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo countryCode(String countryCode) {
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
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo countryName(String countryName) {
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
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo capabilities(Set<ResourcesIbResourceCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo addCapabilitiesItem(ResourcesIbResourceCapability capabilitiesItem) {
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
     * @return This {@link ResourcesAppleCoverageInfo instance}.
     */
    public ResourcesAppleCoverageInfo resourceType(ResourcesIbResourceType resourceType) {
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
        ResourcesAppleCoverageInfo resourcesAppleCoverageInfo = (ResourcesAppleCoverageInfo) o;
        return Objects.equals(this.resource, resourcesAppleCoverageInfo.resource)
                && Objects.equals(this.displayName, resourcesAppleCoverageInfo.displayName)
                && Objects.equals(this.countryCode, resourcesAppleCoverageInfo.countryCode)
                && Objects.equals(this.countryName, resourcesAppleCoverageInfo.countryName)
                && Objects.equals(this.capabilities, resourcesAppleCoverageInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesAppleCoverageInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, displayName, countryCode, countryName, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAppleCoverageInfo {")
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
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
