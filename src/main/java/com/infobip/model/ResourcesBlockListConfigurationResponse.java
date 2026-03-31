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
 * Whitelist or blacklist the traffic of MT messages.
 */
public class ResourcesBlockListConfigurationResponse {

    private ResourcesBlockListConfigurationType type;

    private ResourcesBlockLevelResponse level;

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link ResourcesBlockListConfigurationResponse instance}.
     */
    public ResourcesBlockListConfigurationResponse type(ResourcesBlockListConfigurationType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public ResourcesBlockListConfigurationType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(ResourcesBlockListConfigurationType type) {
        this.type = type;
    }

    /**
     * Sets level.
     * <p>
     * The field is required.
     *
     * @param level
     * @return This {@link ResourcesBlockListConfigurationResponse instance}.
     */
    public ResourcesBlockListConfigurationResponse level(ResourcesBlockLevelResponse level) {
        this.level = level;
        return this;
    }

    /**
     * Returns level.
     * <p>
     * The field is required.
     *
     * @return level
     */
    @JsonProperty("level")
    public ResourcesBlockLevelResponse getLevel() {
        return level;
    }

    /**
     * Sets level.
     * <p>
     * The field is required.
     *
     * @param level
     */
    @JsonProperty("level")
    public void setLevel(ResourcesBlockLevelResponse level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesBlockListConfigurationResponse resourcesBlockListConfigurationResponse =
                (ResourcesBlockListConfigurationResponse) o;
        return Objects.equals(this.type, resourcesBlockListConfigurationResponse.type)
                && Objects.equals(this.level, resourcesBlockListConfigurationResponse.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, level);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesBlockListConfigurationResponse {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    level: ")
                .append(toIndentedString(level))
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
