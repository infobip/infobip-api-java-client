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
 * Represents WebRtcApplicationDestination model.
 */
public class WebRtcApplicationDestination extends WebRtcDestination {

    private String callsConfigurationId;

    /**
     * Constructs a new {@link WebRtcApplicationDestination} instance.
     */
    public WebRtcApplicationDestination() {
        super("APPLICATION");
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Call Configuration ID.
     * <p>
     * The field is required.
     *
     * @param callsConfigurationId
     * @return This {@link WebRtcApplicationDestination instance}.
     */
    public WebRtcApplicationDestination callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Call Configuration ID.
     * <p>
     * The field is required.
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
     * Call Configuration ID.
     * <p>
     * The field is required.
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
        WebRtcApplicationDestination webRtcApplicationDestination = (WebRtcApplicationDestination) o;
        return Objects.equals(this.callsConfigurationId, webRtcApplicationDestination.callsConfigurationId)
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
                .append("class WebRtcApplicationDestination {")
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
