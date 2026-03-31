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
public class ResourcesAlphaCoverageInfo implements ResourcesIbResourceCoverageInfo {

    private String senderName;

    private String countryCode;

    private String countryName;

    private Set<ResourcesIbResourceCapability> capabilities = null;

    private ResourcesIbResourceType resourceType;

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     *
     * @param senderName
     * @return This {@link ResourcesAlphaCoverageInfo instance}.
     */
    public ResourcesAlphaCoverageInfo senderName(String senderName) {
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
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link ResourcesAlphaCoverageInfo instance}.
     */
    public ResourcesAlphaCoverageInfo countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * @return This {@link ResourcesAlphaCoverageInfo instance}.
     */
    public ResourcesAlphaCoverageInfo countryName(String countryName) {
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
     * @return This {@link ResourcesAlphaCoverageInfo instance}.
     */
    public ResourcesAlphaCoverageInfo capabilities(Set<ResourcesIbResourceCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesAlphaCoverageInfo instance}.
     */
    public ResourcesAlphaCoverageInfo addCapabilitiesItem(ResourcesIbResourceCapability capabilitiesItem) {
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
     * @return This {@link ResourcesAlphaCoverageInfo instance}.
     */
    public ResourcesAlphaCoverageInfo resourceType(ResourcesIbResourceType resourceType) {
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
        ResourcesAlphaCoverageInfo resourcesAlphaCoverageInfo = (ResourcesAlphaCoverageInfo) o;
        return Objects.equals(this.senderName, resourcesAlphaCoverageInfo.senderName)
                && Objects.equals(this.countryCode, resourcesAlphaCoverageInfo.countryCode)
                && Objects.equals(this.countryName, resourcesAlphaCoverageInfo.countryName)
                && Objects.equals(this.capabilities, resourcesAlphaCoverageInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesAlphaCoverageInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderName, countryCode, countryName, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAlphaCoverageInfo {")
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
