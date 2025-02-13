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
 * Represents CallsUpdateScenarioRequest model.
 */
public class CallsUpdateScenarioRequest {

    private String name;

    private String description;

    private String script;

    /**
     * Sets name.
     * <p>
     * Field description:
     * The name of IVR scenario.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsUpdateScenarioRequest instance}.
     */
    public CallsUpdateScenarioRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The name of IVR scenario.
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
     * The name of IVR scenario.
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
     * Sets description.
     * <p>
     * Field description:
     * Description of IVR scenario.
     *
     * @param description
     * @return This {@link CallsUpdateScenarioRequest instance}.
     */
    public CallsUpdateScenarioRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of IVR scenario.
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
     * Description of IVR scenario.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets script.
     * <p>
     * The field is required.
     *
     * @param script
     * @return This {@link CallsUpdateScenarioRequest instance}.
     */
    public CallsUpdateScenarioRequest script(String script) {
        this.script = script;
        return this;
    }

    /**
     * Returns script.
     * <p>
     * The field is required.
     *
     * @return script
     */
    @JsonProperty("script")
    public String getScript() {
        return script;
    }

    /**
     * Sets script.
     * <p>
     * The field is required.
     *
     * @param script
     */
    @JsonProperty("script")
    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsUpdateScenarioRequest callsUpdateScenarioRequest = (CallsUpdateScenarioRequest) o;
        return Objects.equals(this.name, callsUpdateScenarioRequest.name)
                && Objects.equals(this.description, callsUpdateScenarioRequest.description)
                && Objects.equals(this.script, callsUpdateScenarioRequest.script);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, script);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsUpdateScenarioRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    script: ")
                .append(toIndentedString(script))
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
