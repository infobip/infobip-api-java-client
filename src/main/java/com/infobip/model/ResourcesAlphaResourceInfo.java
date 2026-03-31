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
 * Information about alphanumeric type of resource.
 */
public class ResourcesAlphaResourceInfo implements ResourcesIbResourceInfo {

    private String senderName;

    private String countryCode;

    private String countryName;

    private Set<ResourcesResourceCapabilityChannel> capabilities = null;

    private ResourcesIbResourceType resourceType;

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     *
     * @param senderName
     * @return This {@link ResourcesAlphaResourceInfo instance}.
     */
    public ResourcesAlphaResourceInfo senderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Returns senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     *
     * @return senderName
     */
    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     *
     * @param senderName
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     * @return This {@link ResourcesAlphaResourceInfo instance}.
     */
    public ResourcesAlphaResourceInfo countryCode(String countryCode) {
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
     * @return This {@link ResourcesAlphaResourceInfo instance}.
     */
    public ResourcesAlphaResourceInfo countryName(String countryName) {
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
     * <p>
     * Field description:
     * Capabilities of the sender.
     *
     * @param capabilities
     * @return This {@link ResourcesAlphaResourceInfo instance}.
     */
    public ResourcesAlphaResourceInfo capabilities(Set<ResourcesResourceCapabilityChannel> capabilities) {
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
     * @return This {@link ResourcesAlphaResourceInfo instance}.
     */
    public ResourcesAlphaResourceInfo addCapabilitiesItem(ResourcesResourceCapabilityChannel capabilitiesItem) {
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
     * @return This {@link ResourcesAlphaResourceInfo instance}.
     */
    public ResourcesAlphaResourceInfo resourceType(ResourcesIbResourceType resourceType) {
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
        ResourcesAlphaResourceInfo resourcesAlphaResourceInfo = (ResourcesAlphaResourceInfo) o;
        return Objects.equals(this.senderName, resourcesAlphaResourceInfo.senderName)
                && Objects.equals(this.countryCode, resourcesAlphaResourceInfo.countryCode)
                && Objects.equals(this.countryName, resourcesAlphaResourceInfo.countryName)
                && Objects.equals(this.capabilities, resourcesAlphaResourceInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesAlphaResourceInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderName, countryCode, countryName, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAlphaResourceInfo {")
                .append(newLine)
                .append("    senderName: ")
                .append(toIndentedString(senderName))
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
