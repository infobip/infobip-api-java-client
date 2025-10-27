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
 * Represents CallsAnsweringMachineDetectionOptions model.
 */
public class CallsAnsweringMachineDetectionOptions {

    private CallsWaitForEom waitEndOfMessageDetection;

    private Integer endOfMessageDetectionTimeout;

    /**
     * Sets waitEndOfMessageDetection.
     *
     * @param waitEndOfMessageDetection
     * @return This {@link CallsAnsweringMachineDetectionOptions instance}.
     */
    public CallsAnsweringMachineDetectionOptions waitEndOfMessageDetection(CallsWaitForEom waitEndOfMessageDetection) {
        this.waitEndOfMessageDetection = waitEndOfMessageDetection;
        return this;
    }

    /**
     * Returns waitEndOfMessageDetection.
     *
     * @return waitEndOfMessageDetection
     */
    @JsonProperty("waitEndOfMessageDetection")
    public CallsWaitForEom getWaitEndOfMessageDetection() {
        return waitEndOfMessageDetection;
    }

    /**
     * Sets waitEndOfMessageDetection.
     *
     * @param waitEndOfMessageDetection
     */
    @JsonProperty("waitEndOfMessageDetection")
    public void setWaitEndOfMessageDetection(CallsWaitForEom waitEndOfMessageDetection) {
        this.waitEndOfMessageDetection = waitEndOfMessageDetection;
    }

    /**
     * Sets endOfMessageDetectionTimeout.
     * <p>
     * Field description:
     * Specifies the timeout (in seconds) to wait for the end of the message after a machine is detected. If set, actions defined in &#x60;onMachineDetected&#x60; will be executed only after the end of the message is detected or the timeout is reached. If not set, &#x60;onMachineDetected&#x60; actions will be triggered immediately after machine detection. If the timeout is reached before the end of the message, actions defined in &#x60;onTimeout&#x60; will be executed instead.
     *
     * @param endOfMessageDetectionTimeout
     * @return This {@link CallsAnsweringMachineDetectionOptions instance}.
     */
    public CallsAnsweringMachineDetectionOptions endOfMessageDetectionTimeout(Integer endOfMessageDetectionTimeout) {
        this.endOfMessageDetectionTimeout = endOfMessageDetectionTimeout;
        return this;
    }

    /**
     * Returns endOfMessageDetectionTimeout.
     * <p>
     * Field description:
     * Specifies the timeout (in seconds) to wait for the end of the message after a machine is detected. If set, actions defined in &#x60;onMachineDetected&#x60; will be executed only after the end of the message is detected or the timeout is reached. If not set, &#x60;onMachineDetected&#x60; actions will be triggered immediately after machine detection. If the timeout is reached before the end of the message, actions defined in &#x60;onTimeout&#x60; will be executed instead.
     *
     * @return endOfMessageDetectionTimeout
     */
    @JsonProperty("endOfMessageDetectionTimeout")
    public Integer getEndOfMessageDetectionTimeout() {
        return endOfMessageDetectionTimeout;
    }

    /**
     * Sets endOfMessageDetectionTimeout.
     * <p>
     * Field description:
     * Specifies the timeout (in seconds) to wait for the end of the message after a machine is detected. If set, actions defined in &#x60;onMachineDetected&#x60; will be executed only after the end of the message is detected or the timeout is reached. If not set, &#x60;onMachineDetected&#x60; actions will be triggered immediately after machine detection. If the timeout is reached before the end of the message, actions defined in &#x60;onTimeout&#x60; will be executed instead.
     *
     * @param endOfMessageDetectionTimeout
     */
    @JsonProperty("endOfMessageDetectionTimeout")
    public void setEndOfMessageDetectionTimeout(Integer endOfMessageDetectionTimeout) {
        this.endOfMessageDetectionTimeout = endOfMessageDetectionTimeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAnsweringMachineDetectionOptions callsAnsweringMachineDetectionOptions =
                (CallsAnsweringMachineDetectionOptions) o;
        return Objects.equals(
                        this.waitEndOfMessageDetection, callsAnsweringMachineDetectionOptions.waitEndOfMessageDetection)
                && Objects.equals(
                        this.endOfMessageDetectionTimeout,
                        callsAnsweringMachineDetectionOptions.endOfMessageDetectionTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waitEndOfMessageDetection, endOfMessageDetectionTimeout);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAnsweringMachineDetectionOptions {")
                .append(newLine)
                .append("    waitEndOfMessageDetection: ")
                .append(toIndentedString(waitEndOfMessageDetection))
                .append(newLine)
                .append("    endOfMessageDetectionTimeout: ")
                .append(toIndentedString(endOfMessageDetectionTimeout))
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
