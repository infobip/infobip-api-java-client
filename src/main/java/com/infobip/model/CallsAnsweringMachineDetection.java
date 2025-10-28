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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This action detects answering machines at the beginning of a call. It allows for detailed configuration of actions to be executed at various stages of the detection process.
 */
public class CallsAnsweringMachineDetection {

    private Boolean answeringMachineDetection;

    private CallsAnsweringMachineDetectionOptions options;

    private List<Object> onDetecting = null;

    private List<Object> onMachineDetected = new ArrayList<>();

    private List<Object> onTimeout = null;

    private List<Object> onHumanDetected = null;

    /**
     * Sets answeringMachineDetection.
     * <p>
     * Field description:
     * Indicates whether machine detection should be performed.
     * <p>
     * The field is required.
     *
     * @param answeringMachineDetection
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection answeringMachineDetection(Boolean answeringMachineDetection) {
        this.answeringMachineDetection = answeringMachineDetection;
        return this;
    }

    /**
     * Returns answeringMachineDetection.
     * <p>
     * Field description:
     * Indicates whether machine detection should be performed.
     * <p>
     * The field is required.
     *
     * @return answeringMachineDetection
     */
    @JsonProperty("answeringMachineDetection")
    public Boolean getAnsweringMachineDetection() {
        return answeringMachineDetection;
    }

    /**
     * Sets answeringMachineDetection.
     * <p>
     * Field description:
     * Indicates whether machine detection should be performed.
     * <p>
     * The field is required.
     *
     * @param answeringMachineDetection
     */
    @JsonProperty("answeringMachineDetection")
    public void setAnsweringMachineDetection(Boolean answeringMachineDetection) {
        this.answeringMachineDetection = answeringMachineDetection;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection options(CallsAnsweringMachineDetectionOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsAnsweringMachineDetectionOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsAnsweringMachineDetectionOptions options) {
        this.options = options;
    }

    /**
     * Sets onDetecting.
     * <p>
     * Field description:
     * Array of actions to execute while detection is in progress. A maximum of two actions of specific types (&#x60;Play&#x60;, &#x60;Say&#x60;, &#x60;Collect&#x60;) can be defined.
     *
     * @param onDetecting
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection onDetecting(List<Object> onDetecting) {
        this.onDetecting = onDetecting;
        return this;
    }

    /**
     * Adds and item into onDetecting.
     * <p>
     * Field description:
     * Array of actions to execute while detection is in progress. A maximum of two actions of specific types (&#x60;Play&#x60;, &#x60;Say&#x60;, &#x60;Collect&#x60;) can be defined.
     *
     * @param onDetectingItem The item to be added to the list.
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection addOnDetectingItem(Object onDetectingItem) {
        if (this.onDetecting == null) {
            this.onDetecting = new ArrayList<>();
        }
        this.onDetecting.add(onDetectingItem);
        return this;
    }

    /**
     * Returns onDetecting.
     * <p>
     * Field description:
     * Array of actions to execute while detection is in progress. A maximum of two actions of specific types (&#x60;Play&#x60;, &#x60;Say&#x60;, &#x60;Collect&#x60;) can be defined.
     *
     * @return onDetecting
     */
    @JsonProperty("onDetecting")
    public List<Object> getOnDetecting() {
        return onDetecting;
    }

    /**
     * Sets onDetecting.
     * <p>
     * Field description:
     * Array of actions to execute while detection is in progress. A maximum of two actions of specific types (&#x60;Play&#x60;, &#x60;Say&#x60;, &#x60;Collect&#x60;) can be defined.
     *
     * @param onDetecting
     */
    @JsonProperty("onDetecting")
    public void setOnDetecting(List<Object> onDetecting) {
        this.onDetecting = onDetecting;
    }

    /**
     * Sets onMachineDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected, or when the end of the message is reached if &#x60;endOfMessageDetectionTimeout&#x60; is set. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. If you do not intend to continue the scenario after &#x60;onMachineDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     * <p>
     * The field is required.
     *
     * @param onMachineDetected
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection onMachineDetected(List<Object> onMachineDetected) {
        this.onMachineDetected = onMachineDetected;
        return this;
    }

    /**
     * Adds and item into onMachineDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected, or when the end of the message is reached if &#x60;endOfMessageDetectionTimeout&#x60; is set. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. If you do not intend to continue the scenario after &#x60;onMachineDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     * <p>
     * The field is required.
     *
     * @param onMachineDetectedItem The item to be added to the list.
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection addOnMachineDetectedItem(Object onMachineDetectedItem) {
        if (this.onMachineDetected == null) {
            this.onMachineDetected = new ArrayList<>();
        }
        this.onMachineDetected.add(onMachineDetectedItem);
        return this;
    }

    /**
     * Returns onMachineDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected, or when the end of the message is reached if &#x60;endOfMessageDetectionTimeout&#x60; is set. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. If you do not intend to continue the scenario after &#x60;onMachineDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     * <p>
     * The field is required.
     *
     * @return onMachineDetected
     */
    @JsonProperty("onMachineDetected")
    public List<Object> getOnMachineDetected() {
        return onMachineDetected;
    }

    /**
     * Sets onMachineDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected, or when the end of the message is reached if &#x60;endOfMessageDetectionTimeout&#x60; is set. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. If you do not intend to continue the scenario after &#x60;onMachineDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     * <p>
     * The field is required.
     *
     * @param onMachineDetected
     */
    @JsonProperty("onMachineDetected")
    public void setOnMachineDetected(List<Object> onMachineDetected) {
        this.onMachineDetected = onMachineDetected;
    }

    /**
     * Sets onTimeout.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected and the &#x60;endOfMessageDetectionTimeout&#x60; is reached. If you do not intend to continue the scenario after &#x60;onTimeout&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @param onTimeout
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection onTimeout(List<Object> onTimeout) {
        this.onTimeout = onTimeout;
        return this;
    }

    /**
     * Adds and item into onTimeout.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected and the &#x60;endOfMessageDetectionTimeout&#x60; is reached. If you do not intend to continue the scenario after &#x60;onTimeout&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @param onTimeoutItem The item to be added to the list.
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection addOnTimeoutItem(Object onTimeoutItem) {
        if (this.onTimeout == null) {
            this.onTimeout = new ArrayList<>();
        }
        this.onTimeout.add(onTimeoutItem);
        return this;
    }

    /**
     * Returns onTimeout.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected and the &#x60;endOfMessageDetectionTimeout&#x60; is reached. If you do not intend to continue the scenario after &#x60;onTimeout&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @return onTimeout
     */
    @JsonProperty("onTimeout")
    public List<Object> getOnTimeout() {
        return onTimeout;
    }

    /**
     * Sets onTimeout.
     * <p>
     * Field description:
     * Array of actions to execute when a machine is detected and the &#x60;endOfMessageDetectionTimeout&#x60; is reached. If you do not intend to continue the scenario after &#x60;onTimeout&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @param onTimeout
     */
    @JsonProperty("onTimeout")
    public void setOnTimeout(List<Object> onTimeout) {
        this.onTimeout = onTimeout;
    }

    /**
     * Sets onHumanDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a human is detected. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. To avoid this interruption, omit this section and define the remaining scenario after this action. If you do not intend to continue the scenario after &#x60;onHumanDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @param onHumanDetected
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection onHumanDetected(List<Object> onHumanDetected) {
        this.onHumanDetected = onHumanDetected;
        return this;
    }

    /**
     * Adds and item into onHumanDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a human is detected. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. To avoid this interruption, omit this section and define the remaining scenario after this action. If you do not intend to continue the scenario after &#x60;onHumanDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @param onHumanDetectedItem The item to be added to the list.
     * @return This {@link CallsAnsweringMachineDetection instance}.
     */
    public CallsAnsweringMachineDetection addOnHumanDetectedItem(Object onHumanDetectedItem) {
        if (this.onHumanDetected == null) {
            this.onHumanDetected = new ArrayList<>();
        }
        this.onHumanDetected.add(onHumanDetectedItem);
        return this;
    }

    /**
     * Returns onHumanDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a human is detected. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. To avoid this interruption, omit this section and define the remaining scenario after this action. If you do not intend to continue the scenario after &#x60;onHumanDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @return onHumanDetected
     */
    @JsonProperty("onHumanDetected")
    public List<Object> getOnHumanDetected() {
        return onHumanDetected;
    }

    /**
     * Sets onHumanDetected.
     * <p>
     * Field description:
     * Array of actions to execute when a human is detected. Actions defined in &#x60;onDetecting&#x60; are interrupted before these actions begin. To avoid this interruption, omit this section and define the remaining scenario after this action. If you do not intend to continue the scenario after &#x60;onHumanDetected&#x60;, include a &#x60;Hangup&#x60; action at the end of this section to terminate the call.
     *
     * @param onHumanDetected
     */
    @JsonProperty("onHumanDetected")
    public void setOnHumanDetected(List<Object> onHumanDetected) {
        this.onHumanDetected = onHumanDetected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAnsweringMachineDetection callsAnsweringMachineDetection = (CallsAnsweringMachineDetection) o;
        return Objects.equals(this.answeringMachineDetection, callsAnsweringMachineDetection.answeringMachineDetection)
                && Objects.equals(this.options, callsAnsweringMachineDetection.options)
                && Objects.equals(this.onDetecting, callsAnsweringMachineDetection.onDetecting)
                && Objects.equals(this.onMachineDetected, callsAnsweringMachineDetection.onMachineDetected)
                && Objects.equals(this.onTimeout, callsAnsweringMachineDetection.onTimeout)
                && Objects.equals(this.onHumanDetected, callsAnsweringMachineDetection.onHumanDetected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                answeringMachineDetection, options, onDetecting, onMachineDetected, onTimeout, onHumanDetected);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAnsweringMachineDetection {")
                .append(newLine)
                .append("    answeringMachineDetection: ")
                .append(toIndentedString(answeringMachineDetection))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    onDetecting: ")
                .append(toIndentedString(onDetecting))
                .append(newLine)
                .append("    onMachineDetected: ")
                .append(toIndentedString(onMachineDetected))
                .append(newLine)
                .append("    onTimeout: ")
                .append(toIndentedString(onTimeout))
                .append(newLine)
                .append("    onHumanDetected: ")
                .append(toIndentedString(onHumanDetected))
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
