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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Represents ResourcesIbResourceCoverageKey model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "resourceType",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourcesAlphaCoverageKey.class, name = "ALPHANUMERIC"),
    @JsonSubTypes.Type(value = ResourcesAppleCoverageKey.class, name = "APPLE_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesNumberCoverageKey.class, name = "NUMBER"),
    @JsonSubTypes.Type(value = ResourcesOpenChannelCoverageKey.class, name = "OPEN_CHANNEL_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesRcsCoverageKey.class, name = "RCS_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesViberCoverageKey.class, name = "VIBER_RESOURCE"),
})
public abstract class ResourcesIbResourceCoverageKey {

    protected final ResourcesIbResourceType resourceType;

    /**
     * Constructs a new {@link ResourcesIbResourceCoverageKey} instance.
     */
    public ResourcesIbResourceCoverageKey(String resourceType) {
        this.resourceType = ResourcesIbResourceType.fromValue(resourceType);
    }

    /**
     * Returns resourceType.
     * <p>
     * The field is required.
     *
     * @return resourceType
     */
    @JsonProperty("resourceType")
    public ResourcesIbResourceType getResourceType() {
        return resourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesIbResourceCoverageKey resourcesIbResourceCoverageKey = (ResourcesIbResourceCoverageKey) o;
        return Objects.equals(this.resourceType, resourcesIbResourceCoverageKey.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesIbResourceCoverageKey {")
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
