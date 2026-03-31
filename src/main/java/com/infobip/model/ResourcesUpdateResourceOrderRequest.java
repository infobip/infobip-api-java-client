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
 * Represents ResourcesUpdateResourceOrderRequest model.
 */
public class ResourcesUpdateResourceOrderRequest {

    private List<ResourcesFilledRequirement> requirements = new ArrayList<>();

    /**
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @param requirements
     * @return This {@link ResourcesUpdateResourceOrderRequest instance}.
     */
    public ResourcesUpdateResourceOrderRequest requirements(List<ResourcesFilledRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * Adds and item into requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @param requirementsItem The item to be added to the list.
     * @return This {@link ResourcesUpdateResourceOrderRequest instance}.
     */
    public ResourcesUpdateResourceOrderRequest addRequirementsItem(ResourcesFilledRequirement requirementsItem) {
        if (this.requirements == null) {
            this.requirements = new ArrayList<>();
        }
        this.requirements.add(requirementsItem);
        return this;
    }

    /**
     * Returns requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @return requirements
     */
    @JsonProperty("requirements")
    public List<ResourcesFilledRequirement> getRequirements() {
        return requirements;
    }

    /**
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @param requirements
     */
    @JsonProperty("requirements")
    public void setRequirements(List<ResourcesFilledRequirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesUpdateResourceOrderRequest resourcesUpdateResourceOrderRequest =
                (ResourcesUpdateResourceOrderRequest) o;
        return Objects.equals(this.requirements, resourcesUpdateResourceOrderRequest.requirements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requirements);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesUpdateResourceOrderRequest {")
                .append(newLine)
                .append("    requirements: ")
                .append(toIndentedString(requirements))
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
