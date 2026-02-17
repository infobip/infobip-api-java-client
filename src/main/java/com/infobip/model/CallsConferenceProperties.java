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
 * Properties of the events that provide &#x60;Conference&#x60; object.
 */
public class CallsConferenceProperties {

    private CallsConference conference;

    private String apiBaseUrl;

    /**
     * Sets conference.
     *
     * @param conference
     * @return This {@link CallsConferenceProperties instance}.
     */
    public CallsConferenceProperties conference(CallsConference conference) {
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
     * Sets apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of API which you should invoke for all actions related to the conference.
     *
     * @param apiBaseUrl
     * @return This {@link CallsConferenceProperties instance}.
     */
    public CallsConferenceProperties apiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    /**
     * Returns apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of API which you should invoke for all actions related to the conference.
     *
     * @return apiBaseUrl
     */
    @JsonProperty("apiBaseUrl")
    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    /**
     * Sets apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of API which you should invoke for all actions related to the conference.
     *
     * @param apiBaseUrl
     */
    @JsonProperty("apiBaseUrl")
    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConferenceProperties callsConferenceProperties = (CallsConferenceProperties) o;
        return Objects.equals(this.conference, callsConferenceProperties.conference)
                && Objects.equals(this.apiBaseUrl, callsConferenceProperties.apiBaseUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conference, apiBaseUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceProperties {")
                .append(newLine)
                .append("    conference: ")
                .append(toIndentedString(conference))
                .append(newLine)
                .append("    apiBaseUrl: ")
                .append(toIndentedString(apiBaseUrl))
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
