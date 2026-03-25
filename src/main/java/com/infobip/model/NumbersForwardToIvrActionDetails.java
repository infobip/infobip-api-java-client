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
 * Represents NumbersForwardToIvrActionDetails model.
 */
public class NumbersForwardToIvrActionDetails extends NumbersVoiceActionDetails {

    private String scenarioKey;

    /**
     * Constructs a new {@link NumbersForwardToIvrActionDetails} instance.
     */
    public NumbersForwardToIvrActionDetails() {
        super("FORWARD_TO_IVR");
    }

    /**
     * Sets scenarioKey.
     * <p>
     * Field description:
     * Unique ID of the IVR scenario.
     * <p>
     * The field is required.
     *
     * @param scenarioKey
     * @return This {@link NumbersForwardToIvrActionDetails instance}.
     */
    public NumbersForwardToIvrActionDetails scenarioKey(String scenarioKey) {
        this.scenarioKey = scenarioKey;
        return this;
    }

    /**
     * Returns scenarioKey.
     * <p>
     * Field description:
     * Unique ID of the IVR scenario.
     * <p>
     * The field is required.
     *
     * @return scenarioKey
     */
    @JsonProperty("scenarioKey")
    public String getScenarioKey() {
        return scenarioKey;
    }

    /**
     * Sets scenarioKey.
     * <p>
     * Field description:
     * Unique ID of the IVR scenario.
     * <p>
     * The field is required.
     *
     * @param scenarioKey
     */
    @JsonProperty("scenarioKey")
    public void setScenarioKey(String scenarioKey) {
        this.scenarioKey = scenarioKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersForwardToIvrActionDetails numbersForwardToIvrActionDetails = (NumbersForwardToIvrActionDetails) o;
        return Objects.equals(this.scenarioKey, numbersForwardToIvrActionDetails.scenarioKey) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scenarioKey, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersForwardToIvrActionDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    scenarioKey: ")
                .append(toIndentedString(scenarioKey))
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
