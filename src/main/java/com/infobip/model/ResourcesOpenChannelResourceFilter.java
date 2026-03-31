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
 * Open Channel filter for resources.
 */
public class ResourcesOpenChannelResourceFilter extends ResourcesIbResourcesFilter {

    private String resource;

    /**
     * Constructs a new {@link ResourcesOpenChannelResourceFilter} instance.
     */
    public ResourcesOpenChannelResourceFilter() {
        super("OPEN_CHANNEL_RESOURCE");
    }

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Resource name.
     *
     * @param resource
     * @return This {@link ResourcesOpenChannelResourceFilter instance}.
     */
    public ResourcesOpenChannelResourceFilter resource(String resource) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesOpenChannelResourceFilter resourcesOpenChannelResourceFilter = (ResourcesOpenChannelResourceFilter) o;
        return Objects.equals(this.resource, resourcesOpenChannelResourceFilter.resource) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesOpenChannelResourceFilter {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
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
