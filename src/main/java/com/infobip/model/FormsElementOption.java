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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents FormsElementOption model.
 */
public class FormsElementOption {

    private String name;

    private String value;

    private Map<String, String> additionalConfiguration = null;

    /**
     * Sets name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link FormsElementOption instance}.
     */
    public FormsElementOption name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link FormsElementOption instance}.
     */
    public FormsElementOption value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Sets additionalConfiguration.
     *
     * @param additionalConfiguration
     * @return This {@link FormsElementOption instance}.
     */
    public FormsElementOption additionalConfiguration(Map<String, String> additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
        return this;
    }

    /**
     * Puts and entry into additionalConfiguration.
     *
     * @param key The given key.
     * @param additionalConfigurationItem The item to be associated with the given key.
     * @return This {@link FormsElementOption instance}.
     */
    public FormsElementOption putAdditionalConfigurationItem(String key, String additionalConfigurationItem) {
        if (this.additionalConfiguration == null) {
            this.additionalConfiguration = new HashMap<>();
        }
        this.additionalConfiguration.put(key, additionalConfigurationItem);
        return this;
    }

    /**
     * Returns additionalConfiguration.
     *
     * @return additionalConfiguration
     */
    @JsonProperty("additionalConfiguration")
    public Map<String, String> getAdditionalConfiguration() {
        return additionalConfiguration;
    }

    /**
     * Sets additionalConfiguration.
     *
     * @param additionalConfiguration
     */
    @JsonProperty("additionalConfiguration")
    public void setAdditionalConfiguration(Map<String, String> additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormsElementOption formsElementOption = (FormsElementOption) o;
        return Objects.equals(this.name, formsElementOption.name)
                && Objects.equals(this.value, formsElementOption.value)
                && Objects.equals(this.additionalConfiguration, formsElementOption.additionalConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, additionalConfiguration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FormsElementOption {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
                .append(newLine)
                .append("    additionalConfiguration: ")
                .append(toIndentedString(additionalConfiguration))
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
