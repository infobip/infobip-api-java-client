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
 * List of requirements needed for the resource request.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourcesDocumentRequirementSpec.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = ResourcesEmailRequirementSpec.class, name = "EMAIL"),
    @JsonSubTypes.Type(value = ResourcesGsmRequirementSpec.class, name = "GSM"),
    @JsonSubTypes.Type(value = ResourcesIntegerRequirementSpec.class, name = "INTEGER"),
    @JsonSubTypes.Type(value = ResourcesTextRequirementSpec.class, name = "TEXT"),
    @JsonSubTypes.Type(value = ResourcesUrlRequirementSpec.class, name = "URL"),
})
public abstract class ResourcesRequirementSpec {

    protected final ResourcesFieldType type;

    /**
     * Constructs a new {@link ResourcesRequirementSpec} instance.
     */
    public ResourcesRequirementSpec(String type) {
        this.type = ResourcesFieldType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public ResourcesFieldType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesRequirementSpec resourcesRequirementSpec = (ResourcesRequirementSpec) o;
        return Objects.equals(this.type, resourcesRequirementSpec.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesRequirementSpec {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
