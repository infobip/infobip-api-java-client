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
 * List of requirements for the resource.
 */
public class ResourcesFilledRequirement {

    private String key;

    private Object value;

    /**
     * Sets key.
     * <p>
     * Field description:
     * The key of the requirement.
     * <p>
     * The field is required.
     *
     * @param key
     * @return This {@link ResourcesFilledRequirement instance}.
     */
    public ResourcesFilledRequirement key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * The key of the requirement.
     * <p>
     * The field is required.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * The key of the requirement.
     * <p>
     * The field is required.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * The value of the requirement. Can be a string, integer, or a list of strings and integers.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link ResourcesFilledRequirement instance}.
     */
    public ResourcesFilledRequirement value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * The value of the requirement. Can be a string, integer, or a list of strings and integers.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * The value of the requirement. Can be a string, integer, or a list of strings and integers.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesFilledRequirement resourcesFilledRequirement = (ResourcesFilledRequirement) o;
        return Objects.equals(this.key, resourcesFilledRequirement.key)
                && Objects.equals(this.value, resourcesFilledRequirement.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesFilledRequirement {")
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
