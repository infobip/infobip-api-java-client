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
 * Properties of the events that provide &#x60;Conference&#x60; object together with &#x60;ErrorCode&#x60;.
 */
public class CallsConferenceWithErrorCodeProperties {

    private CallsConference conference;

    private CallsErrorCodeInfo errorCode;

    /**
     * Sets conference.
     *
     * @param conference
     * @return This {@link CallsConferenceWithErrorCodeProperties instance}.
     */
    public CallsConferenceWithErrorCodeProperties conference(CallsConference conference) {
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
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link CallsConferenceWithErrorCodeProperties instance}.
     */
    public CallsConferenceWithErrorCodeProperties errorCode(CallsErrorCodeInfo errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public CallsErrorCodeInfo getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(CallsErrorCodeInfo errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConferenceWithErrorCodeProperties callsConferenceWithErrorCodeProperties =
                (CallsConferenceWithErrorCodeProperties) o;
        return Objects.equals(this.conference, callsConferenceWithErrorCodeProperties.conference)
                && Objects.equals(this.errorCode, callsConferenceWithErrorCodeProperties.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conference, errorCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceWithErrorCodeProperties {")
                .append(newLine)
                .append("    conference: ")
                .append(toIndentedString(conference))
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
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
