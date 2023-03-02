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
 * Represents CallsConferenceAndCall model.
 */
public class CallsConferenceAndCall {

    private CallsConference conference;

    private Call call;

    /**
     * Sets conference.
     *
     * @param conference
     * @return This {@link CallsConferenceAndCall instance}.
     */
    public CallsConferenceAndCall conference(CallsConference conference) {
        this.conference = conference;
        return this;
    }

    /**
     * Returns conference.
     *
     * @return conference
     */
    @JsonProperty("conference")
    public CallsConference getConference() {
        return conference;
    }

    /**
     * Sets conference.
     *
     * @param conference
     */
    @JsonProperty("conference")
    public void setConference(CallsConference conference) {
        this.conference = conference;
    }

    /**
     * Sets call.
     *
     * @param call
     * @return This {@link CallsConferenceAndCall instance}.
     */
    public CallsConferenceAndCall call(Call call) {
        this.call = call;
        return this;
    }

    /**
     * Returns call.
     *
     * @return call
     */
    @JsonProperty("call")
    public Call getCall() {
        return call;
    }

    /**
     * Sets call.
     *
     * @param call
     */
    @JsonProperty("call")
    public void setCall(Call call) {
        this.call = call;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConferenceAndCall callsConferenceAndCall = (CallsConferenceAndCall) o;
        return Objects.equals(this.conference, callsConferenceAndCall.conference)
                && Objects.equals(this.call, callsConferenceAndCall.call);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conference, call);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceAndCall {")
                .append(newLine)
                .append("    conference: ")
                .append(toIndentedString(conference))
                .append(newLine)
                .append("    call: ")
                .append(toIndentedString(call))
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
