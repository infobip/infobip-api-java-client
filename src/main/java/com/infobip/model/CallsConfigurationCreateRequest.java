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
 * Represents CallsConfigurationCreateRequest model.
 */
public class CallsConfigurationCreateRequest {

    private String id;

    private String name;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Calls configuration ID. If not provided, system will generate random ID, which will be returned in response.
     *
     * @param id
     * @return This {@link CallsConfigurationCreateRequest instance}.
     */
    public CallsConfigurationCreateRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Calls configuration ID. If not provided, system will generate random ID, which will be returned in response.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Calls configuration ID. If not provided, system will generate random ID, which will be returned in response.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Calls configuration name.
     *
     * @param name
     * @return This {@link CallsConfigurationCreateRequest instance}.
     */
    public CallsConfigurationCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Calls configuration name.
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
     * Calls configuration name.
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
        CallsConfigurationCreateRequest callsConfigurationCreateRequest = (CallsConfigurationCreateRequest) o;
        return Objects.equals(this.id, callsConfigurationCreateRequest.id)
                && Objects.equals(this.name, callsConfigurationCreateRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConfigurationCreateRequest {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
