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
 * Numeric filter for resources.
 */
public class ResourcesNumberResourceFilter extends ResourcesIbResourcesFilter {

    private String number;

    private String countryCode;

    private List<ResourcesNumberResourceCapabilityChannelDocs> capabilities = null;

    /**
     * Constructs a new {@link ResourcesNumberResourceFilter} instance.
     */
    public ResourcesNumberResourceFilter() {
        super("NUMBER");
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Phone number.
     *
     * @param number
     * @return This {@link ResourcesNumberResourceFilter instance}.
     */
    public ResourcesNumberResourceFilter number(String number) {
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
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     * @return This {@link ResourcesNumberResourceFilter instance}.
     */
    public ResourcesNumberResourceFilter countryCode(String countryCode) {
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
     * Sets capabilities.
     * <p>
     * Field description:
     * Number capabilities
     *
     * @param capabilities
     * @return This {@link ResourcesNumberResourceFilter instance}.
     */
    public ResourcesNumberResourceFilter capabilities(List<ResourcesNumberResourceCapabilityChannelDocs> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * Number capabilities
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceFilter instance}.
     */
    public ResourcesNumberResourceFilter addCapabilitiesItem(
            ResourcesNumberResourceCapabilityChannelDocs capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Returns capabilities.
     * <p>
     * Field description:
     * Number capabilities
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public List<ResourcesNumberResourceCapabilityChannelDocs> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * Number capabilities
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<ResourcesNumberResourceCapabilityChannelDocs> capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesNumberResourceFilter resourcesNumberResourceFilter = (ResourcesNumberResourceFilter) o;
        return Objects.equals(this.number, resourcesNumberResourceFilter.number)
                && Objects.equals(this.countryCode, resourcesNumberResourceFilter.countryCode)
                && Objects.equals(this.capabilities, resourcesNumberResourceFilter.capabilities)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, countryCode, capabilities, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberResourceFilter {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
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
