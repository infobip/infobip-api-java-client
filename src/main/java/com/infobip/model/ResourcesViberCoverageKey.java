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
 * Represents ResourcesViberCoverageKey model.
 */
public class ResourcesViberCoverageKey extends ResourcesIbResourceCoverageKey {

    private String resource;

    private Boolean shared;

    private String originalResourceName;

    private String countryCode;

    /**
     * Constructs a new {@link ResourcesViberCoverageKey} instance.
     */
    public ResourcesViberCoverageKey() {
        super("VIBER_RESOURCE");
    }

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Resource name.
     * <p>
     * The field is required.
     *
     * @param resource
     * @return This {@link ResourcesViberCoverageKey instance}.
     */
    public ResourcesViberCoverageKey resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Returns resource.
     * <p>
     * Field description:
     * Resource name.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * @return This {@link ResourcesViberCoverageKey instance}.
     */
    public ResourcesViberCoverageKey shared(Boolean shared) {
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
     * @return This {@link ResourcesViberCoverageKey instance}.
     */
    public ResourcesViberCoverageKey originalResourceName(String originalResourceName) {
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
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link ResourcesViberCoverageKey instance}.
     */
    public ResourcesViberCoverageKey countryCode(String countryCode) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesViberCoverageKey resourcesViberCoverageKey = (ResourcesViberCoverageKey) o;
        return Objects.equals(this.resource, resourcesViberCoverageKey.resource)
                && Objects.equals(this.shared, resourcesViberCoverageKey.shared)
                && Objects.equals(this.originalResourceName, resourcesViberCoverageKey.originalResourceName)
                && Objects.equals(this.countryCode, resourcesViberCoverageKey.countryCode)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, shared, originalResourceName, countryCode, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesViberCoverageKey {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
