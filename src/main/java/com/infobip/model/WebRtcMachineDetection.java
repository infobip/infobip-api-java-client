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
 * Machine detection settings for phone calls.
 */
public class WebRtcMachineDetection {

    private Boolean enabled;

    private Double detectionTime;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Enable machine detection for phone calls. When enabled, the system will attempt to detect if the call is answered by a voicemail or answering machine.
     *
     * @param enabled
     * @return This {@link WebRtcMachineDetection instance}.
     */
    public WebRtcMachineDetection enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Enable machine detection for phone calls. When enabled, the system will attempt to detect if the call is answered by a voicemail or answering machine.
     *
     * @return enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Enable machine detection for phone calls. When enabled, the system will attempt to detect if the call is answered by a voicemail or answering machine.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets detectionTime.
     * <p>
     * Field description:
     * Maximum time in seconds to wait for machine detection. Only applicable when machineDetection is enabled.
     *
     * @param detectionTime
     * @return This {@link WebRtcMachineDetection instance}.
     */
    public WebRtcMachineDetection detectionTime(Double detectionTime) {
        this.detectionTime = detectionTime;
        return this;
    }

    /**
     * Returns detectionTime.
     * <p>
     * Field description:
     * Maximum time in seconds to wait for machine detection. Only applicable when machineDetection is enabled.
     *
     * @return detectionTime
     */
    @JsonProperty("detectionTime")
    public Double getDetectionTime() {
        return detectionTime;
    }

    /**
     * Sets detectionTime.
     * <p>
     * Field description:
     * Maximum time in seconds to wait for machine detection. Only applicable when machineDetection is enabled.
     *
     * @param detectionTime
     */
    @JsonProperty("detectionTime")
    public void setDetectionTime(Double detectionTime) {
        this.detectionTime = detectionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcMachineDetection webRtcMachineDetection = (WebRtcMachineDetection) o;
        return Objects.equals(this.enabled, webRtcMachineDetection.enabled)
                && Objects.equals(this.detectionTime, webRtcMachineDetection.detectionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, detectionTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcMachineDetection {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    detectionTime: ")
                .append(toIndentedString(detectionTime))
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
