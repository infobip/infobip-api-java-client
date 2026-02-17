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
 * Properties of the events that provide &#x60;Participant&#x60; object.
 */
public class CallsParticipantProperties {

    private CallsParticipant participant;

    /**
     * Sets participant.
     *
     * @param participant
     * @return This {@link CallsParticipantProperties instance}.
     */
    public CallsParticipantProperties participant(CallsParticipant participant) {
        this.participant = participant;
        return this;
    }

    /**
     * Returns participant.
     *
     * @return participant
     */
    @JsonProperty("participant")
    public CallsParticipant getParticipant() {
        return participant;
    }

    /**
     * Sets participant.
     *
     * @param participant
     */
    @JsonProperty("participant")
    public void setParticipant(CallsParticipant participant) {
        this.participant = participant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsParticipantProperties callsParticipantProperties = (CallsParticipantProperties) o;
        return Objects.equals(this.participant, callsParticipantProperties.participant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participant);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsParticipantProperties {")
                .append(newLine)
                .append("    participant: ")
                .append(toIndentedString(participant))
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
