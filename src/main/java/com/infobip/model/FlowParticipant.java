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
 * Participant to be added to Flow campaign.
 */
public class FlowParticipant {

    private FlowPersonUniqueField identifyBy;

    private Map<String, Object> variables = null;

    private FlowPerson person;

    /**
     * Sets identifyBy.
     * <p>
     * The field is required.
     *
     * @param identifyBy
     * @return This {@link FlowParticipant instance}.
     */
    public FlowParticipant identifyBy(FlowPersonUniqueField identifyBy) {
        this.identifyBy = identifyBy;
        return this;
    }

    /**
     * Returns identifyBy.
     * <p>
     * The field is required.
     *
     * @return identifyBy
     */
    @JsonProperty("identifyBy")
    public FlowPersonUniqueField getIdentifyBy() {
        return identifyBy;
    }

    /**
     * Sets identifyBy.
     * <p>
     * The field is required.
     *
     * @param identifyBy
     */
    @JsonProperty("identifyBy")
    public void setIdentifyBy(FlowPersonUniqueField identifyBy) {
        this.identifyBy = identifyBy;
    }

    /**
     * Sets variables.
     * <p>
     * Field description:
     * Flow variables to assign to the participant when it is added to the flow.
     *
     * @param variables
     * @return This {@link FlowParticipant instance}.
     */
    public FlowParticipant variables(Map<String, Object> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Puts and entry into variables.
     * <p>
     * Field description:
     * Flow variables to assign to the participant when it is added to the flow.
     *
     * @param key The given key.
     * @param variablesItem The item to be associated with the given key.
     * @return This {@link FlowParticipant instance}.
     */
    public FlowParticipant putVariablesItem(String key, Object variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * Returns variables.
     * <p>
     * Field description:
     * Flow variables to assign to the participant when it is added to the flow.
     *
     * @return variables
     */
    @JsonProperty("variables")
    public Map<String, Object> getVariables() {
        return variables;
    }

    /**
     * Sets variables.
     * <p>
     * Field description:
     * Flow variables to assign to the participant when it is added to the flow.
     *
     * @param variables
     */
    @JsonProperty("variables")
    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    /**
     * Sets person.
     *
     * @param person
     * @return This {@link FlowParticipant instance}.
     */
    public FlowParticipant person(FlowPerson person) {
        this.person = person;
        return this;
    }

    /**
     * Returns person.
     *
     * @return person
     */
    @JsonProperty("person")
    public FlowPerson getPerson() {
        return person;
    }

    /**
     * Sets person.
     *
     * @param person
     */
    @JsonProperty("person")
    public void setPerson(FlowPerson person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowParticipant flowParticipant = (FlowParticipant) o;
        return Objects.equals(this.identifyBy, flowParticipant.identifyBy)
                && Objects.equals(this.variables, flowParticipant.variables)
                && Objects.equals(this.person, flowParticipant.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifyBy, variables, person);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowParticipant {")
                .append(newLine)
                .append("    identifyBy: ")
                .append(toIndentedString(identifyBy))
                .append(newLine)
                .append("    variables: ")
                .append(toIndentedString(variables))
                .append(newLine)
                .append("    person: ")
                .append(toIndentedString(person))
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
