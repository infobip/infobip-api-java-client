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
 * Represents ResourcesMmsPullActionDocs model.
 */
public class ResourcesMmsPullActionDocs extends ResourcesMmsMoActionDocs {

    private String description;

    /**
     * Constructs a new {@link ResourcesMmsPullActionDocs} instance.
     */
    public ResourcesMmsPullActionDocs() {
        super("PULL");
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @param description
     * @return This {@link ResourcesMmsPullActionDocs instance}.
     */
    public ResourcesMmsPullActionDocs description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesMmsPullActionDocs resourcesMmsPullActionDocs = (ResourcesMmsPullActionDocs) o;
        return Objects.equals(this.description, resourcesMmsPullActionDocs.description) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesMmsPullActionDocs {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
