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
 * CNAM Storage is an up to 15-character name that will identify you to the person that you are calling if they subscribe to caller ID.
 */
public class CallsCnamStorage {

    private Boolean enabled;

    private String name;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether configuration is enabled or not.
     *
     * @param enabled
     * @return This {@link CallsCnamStorage instance}.
     */
    public CallsCnamStorage enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether configuration is enabled or not.
     *
     * @return enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether configuration is enabled or not.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name that will identify you to the person that you are calling.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsCnamStorage instance}.
     */
    public CallsCnamStorage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name that will identify you to the person that you are calling.
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
     * Field description:
     * Name that will identify you to the person that you are calling.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCnamStorage callsCnamStorage = (CallsCnamStorage) o;
        return Objects.equals(this.enabled, callsCnamStorage.enabled)
                && Objects.equals(this.name, callsCnamStorage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, name);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCnamStorage {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
