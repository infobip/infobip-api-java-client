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
 * Information about the numeric type of resource.
 */
public class ResourcesNumberResourceInfo implements ResourcesIbResourceInfo {

    private String number;

    private String numberKey;

    private ResourcesPlatformDocs platform;

    private ResourcesNumberTypeResourceMoDocs numberType;

    private String countryCode;

    private String countryName;

    private Set<ResourcesResourceCapabilityChannel> capabilities = null;

    private ResourcesIbResourceType resourceType;

    /**
     * Sets number.
     * <p>
     * Field description:
     * Phone number.
     *
     * @param number
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * Phone number.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Phone number.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Number key.
     *
     * @param numberKey
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     * <p>
     * Field description:
     * Number key.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Number key.
     *
     * @param numberKey
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo platform(ResourcesPlatformDocs platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public ResourcesPlatformDocs getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(ResourcesPlatformDocs platform) {
        this.platform = platform;
    }

    /**
     * Sets numberType.
     *
     * @param numberType
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo numberType(ResourcesNumberTypeResourceMoDocs numberType) {
        this.numberType = numberType;
        return this;
    }

    /**
     * Returns numberType.
     *
     * @return numberType
     */
    @JsonProperty("numberType")
    public ResourcesNumberTypeResourceMoDocs getNumberType() {
        return numberType;
    }

    /**
     * Sets numberType.
     *
     * @param numberType
     */
    @JsonProperty("numberType")
    public void setNumberType(ResourcesNumberTypeResourceMoDocs numberType) {
        this.numberType = numberType;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo countryCode(String countryCode) {
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
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo countryName(String countryName) {
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
     * Capabilities of the number.
     *
     * @param capabilities
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo capabilities(Set<ResourcesResourceCapabilityChannel> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * Capabilities of the number.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo addCapabilitiesItem(ResourcesResourceCapabilityChannel capabilitiesItem) {
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
     * Capabilities of the number.
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
     * Capabilities of the number.
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
     * @return This {@link ResourcesNumberResourceInfo instance}.
     */
    public ResourcesNumberResourceInfo resourceType(ResourcesIbResourceType resourceType) {
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
        ResourcesNumberResourceInfo resourcesNumberResourceInfo = (ResourcesNumberResourceInfo) o;
        return Objects.equals(this.number, resourcesNumberResourceInfo.number)
                && Objects.equals(this.numberKey, resourcesNumberResourceInfo.numberKey)
                && Objects.equals(this.platform, resourcesNumberResourceInfo.platform)
                && Objects.equals(this.numberType, resourcesNumberResourceInfo.numberType)
                && Objects.equals(this.countryCode, resourcesNumberResourceInfo.countryCode)
                && Objects.equals(this.countryName, resourcesNumberResourceInfo.countryName)
                && Objects.equals(this.capabilities, resourcesNumberResourceInfo.capabilities)
                && Objects.equals(this.resourceType, resourcesNumberResourceInfo.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                number, numberKey, platform, numberType, countryCode, countryName, capabilities, resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberResourceInfo {")
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    numberKey: ")
                .append(toIndentedString(numberKey))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    numberType: ")
                .append(toIndentedString(numberType))
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
