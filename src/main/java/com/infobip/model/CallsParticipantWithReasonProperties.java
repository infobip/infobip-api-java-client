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
 * Properties of the events that provide &#x60;Participant&#x60; object and reason.
 */
public class CallsParticipantWithReasonProperties {

    private CallsParticipant participant;

    private String reason;

    /**
     * Sets participant.
     *
     * @param participant
     * @return This {@link CallsParticipantWithReasonProperties instance}.
     */
    public CallsParticipantWithReasonProperties participant(CallsParticipant participant) {
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

    /**
     * Sets reason.
     *
     * @param reason
     * @return This {@link CallsParticipantWithReasonProperties instance}.
     */
    public CallsParticipantWithReasonProperties reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsParticipantWithReasonProperties callsParticipantWithReasonProperties =
                (CallsParticipantWithReasonProperties) o;
        return Objects.equals(this.participant, callsParticipantWithReasonProperties.participant)
                && Objects.equals(this.reason, callsParticipantWithReasonProperties.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participant, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsParticipantWithReasonProperties {")
                .append(newLine)
                .append("    participant: ")
                .append(toIndentedString(participant))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
