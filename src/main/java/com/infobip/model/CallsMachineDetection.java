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
 * Answering machine detection configuration of a Number Masking call. Detection will be performed only on the callee side of the call.
 */
public class CallsMachineDetection {

    private Boolean enabled;

    private CallsExecutionMode executionMode;

    private Double detectionTime;

    private Boolean hangupOnMachineDetection;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether machine detection is enabled from the callee perspective.
     *
     * @param enabled
     * @return This {@link CallsMachineDetection instance}.
     */
    public CallsMachineDetection enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether machine detection is enabled from the callee perspective.
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
     * Indicates whether machine detection is enabled from the callee perspective.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets executionMode.
     *
     * @param executionMode
     * @return This {@link CallsMachineDetection instance}.
     */
    public CallsMachineDetection executionMode(CallsExecutionMode executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * Returns executionMode.
     *
     * @return executionMode
     */
    @JsonProperty("executionMode")
    public CallsExecutionMode getExecutionMode() {
        return executionMode;
    }

    /**
     * Sets executionMode.
     *
     * @param executionMode
     */
    @JsonProperty("executionMode")
    public void setExecutionMode(CallsExecutionMode executionMode) {
        this.executionMode = executionMode;
    }

    /**
     * Sets detectionTime.
     * <p>
     * Field description:
     * Duration of machine detection. Higher values will increase the accuracy of machine detection, but will also increase the time it takes to detect a machine.
     *
     * @param detectionTime
     * @return This {@link CallsMachineDetection instance}.
     */
    public CallsMachineDetection detectionTime(Double detectionTime) {
        this.detectionTime = detectionTime;
        return this;
    }

    /**
     * Returns detectionTime.
     * <p>
     * Field description:
     * Duration of machine detection. Higher values will increase the accuracy of machine detection, but will also increase the time it takes to detect a machine.
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
     * Duration of machine detection. Higher values will increase the accuracy of machine detection, but will also increase the time it takes to detect a machine.
     *
     * @param detectionTime
     */
    @JsonProperty("detectionTime")
    public void setDetectionTime(Double detectionTime) {
        this.detectionTime = detectionTime;
    }

    /**
     * Sets hangupOnMachineDetection.
     * <p>
     * Field description:
     * Indicates whether the callee side will hangup upon machine detection.
     *
     * @param hangupOnMachineDetection
     * @return This {@link CallsMachineDetection instance}.
     */
    public CallsMachineDetection hangupOnMachineDetection(Boolean hangupOnMachineDetection) {
        this.hangupOnMachineDetection = hangupOnMachineDetection;
        return this;
    }

    /**
     * Returns hangupOnMachineDetection.
     * <p>
     * Field description:
     * Indicates whether the callee side will hangup upon machine detection.
     *
     * @return hangupOnMachineDetection
     */
    @JsonProperty("hangupOnMachineDetection")
    public Boolean getHangupOnMachineDetection() {
        return hangupOnMachineDetection;
    }

    /**
     * Sets hangupOnMachineDetection.
     * <p>
     * Field description:
     * Indicates whether the callee side will hangup upon machine detection.
     *
     * @param hangupOnMachineDetection
     */
    @JsonProperty("hangupOnMachineDetection")
    public void setHangupOnMachineDetection(Boolean hangupOnMachineDetection) {
        this.hangupOnMachineDetection = hangupOnMachineDetection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMachineDetection callsMachineDetection = (CallsMachineDetection) o;
        return Objects.equals(this.enabled, callsMachineDetection.enabled)
                && Objects.equals(this.executionMode, callsMachineDetection.executionMode)
                && Objects.equals(this.detectionTime, callsMachineDetection.detectionTime)
                && Objects.equals(this.hangupOnMachineDetection, callsMachineDetection.hangupOnMachineDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, executionMode, detectionTime, hangupOnMachineDetection);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMachineDetection {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    executionMode: ")
                .append(toIndentedString(executionMode))
                .append(newLine)
                .append("    detectionTime: ")
                .append(toIndentedString(detectionTime))
                .append(newLine)
                .append("    hangupOnMachineDetection: ")
                .append(toIndentedString(hangupOnMachineDetection))
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
