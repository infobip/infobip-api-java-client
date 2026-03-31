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
 * Represents NumbersForwardToSubscriptionDetails model.
 */
public class NumbersForwardToSubscriptionDetails extends NumbersVoiceActionDetails {

    private String callsConfigurationId;

    /**
     * Constructs a new {@link NumbersForwardToSubscriptionDetails} instance.
     */
    public NumbersForwardToSubscriptionDetails() {
        super("FORWARD_TO_SUBSCRIPTION");
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Unique identifier of a Calls Configuration.
     *
     * @param callsConfigurationId
     * @return This {@link NumbersForwardToSubscriptionDetails instance}.
     */
    public NumbersForwardToSubscriptionDetails callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Unique identifier of a Calls Configuration.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Unique identifier of a Calls Configuration.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersForwardToSubscriptionDetails numbersForwardToSubscriptionDetails =
                (NumbersForwardToSubscriptionDetails) o;
        return Objects.equals(this.callsConfigurationId, numbersForwardToSubscriptionDetails.callsConfigurationId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callsConfigurationId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersForwardToSubscriptionDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
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
