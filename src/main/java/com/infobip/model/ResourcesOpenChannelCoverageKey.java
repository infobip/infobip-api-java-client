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
 * Represents ResourcesOpenChannelCoverageKey model.
 */
public class ResourcesOpenChannelCoverageKey extends ResourcesIbResourceCoverageKey {

    private String resource;

    private String displayName;

    /**
     * Constructs a new {@link ResourcesOpenChannelCoverageKey} instance.
     */
    public ResourcesOpenChannelCoverageKey() {
        super("OPEN_CHANNEL_RESOURCE");
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
     * @return This {@link ResourcesOpenChannelCoverageKey instance}.
     */
    public ResourcesOpenChannelCoverageKey resource(String resource) {
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
     * Sets displayName.
     * <p>
     * Field description:
     * Display name.
     *
     * @param displayName
     * @return This {@link ResourcesOpenChannelCoverageKey instance}.
     */
    public ResourcesOpenChannelCoverageKey displayName(String displayName) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesOpenChannelCoverageKey resourcesOpenChannelCoverageKey = (ResourcesOpenChannelCoverageKey) o;
        return Objects.equals(this.resource, resourcesOpenChannelCoverageKey.resource)
                && Objects.equals(this.displayName, resourcesOpenChannelCoverageKey.displayName)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, displayName, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesOpenChannelCoverageKey {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
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
