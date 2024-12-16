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
 * Contains the data used for person creation (if it does not exist) or partial update (if it exists)
 */
public class FlowPersonRequest {

    private FlowPerson personData;

    private Map<String, Object> flowVariables = null;

    /**
     * Sets personData.
     * <p>
     * The field is required.
     *
     * @param personData
     * @return This {@link FlowPersonRequest instance}.
     */
    public FlowPersonRequest personData(FlowPerson personData) {
        this.personData = personData;
        return this;
    }

    /**
     * Returns personData.
     * <p>
     * The field is required.
     *
     * @return personData
     */
    @JsonProperty("personData")
    public FlowPerson getPersonData() {
        return personData;
    }

    /**
     * Sets personData.
     * <p>
     * The field is required.
     *
     * @param personData
     */
    @JsonProperty("personData")
    public void setPersonData(FlowPerson personData) {
        this.personData = personData;
    }

    /**
     * Sets flowVariables.
     *
     * @param flowVariables
     * @return This {@link FlowPersonRequest instance}.
     */
    public FlowPersonRequest flowVariables(Map<String, Object> flowVariables) {
        this.flowVariables = flowVariables;
        return this;
    }

    /**
     * Puts and entry into flowVariables.
     *
     * @param key The given key.
     * @param flowVariablesItem The item to be associated with the given key.
     * @return This {@link FlowPersonRequest instance}.
     */
    public FlowPersonRequest putFlowVariablesItem(String key, Object flowVariablesItem) {
        if (this.flowVariables == null) {
            this.flowVariables = new HashMap<>();
        }
        this.flowVariables.put(key, flowVariablesItem);
        return this;
    }

    /**
     * Returns flowVariables.
     *
     * @return flowVariables
     */
    @JsonProperty("flowVariables")
    public Map<String, Object> getFlowVariables() {
        return flowVariables;
    }

    /**
     * Sets flowVariables.
     *
     * @param flowVariables
     */
    @JsonProperty("flowVariables")
    public void setFlowVariables(Map<String, Object> flowVariables) {
        this.flowVariables = flowVariables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowPersonRequest flowPersonRequest = (FlowPersonRequest) o;
        return Objects.equals(this.personData, flowPersonRequest.personData)
                && Objects.equals(this.flowVariables, flowPersonRequest.flowVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personData, flowVariables);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowPersonRequest {")
                .append(newLine)
                .append("    personData: ")
                .append(toIndentedString(personData))
                .append(newLine)
                .append("    flowVariables: ")
                .append(toIndentedString(flowVariables))
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
