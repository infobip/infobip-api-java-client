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
 * Represents CallsMachineDetectionRequest model.
 */
public class CallsMachineDetectionRequest {

    private Boolean enabled;

    private Integer messageDetectionTimeout;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether to enable answering machine detection. If set to true, answering machine detection will generate an event indicating if the call was answered by a human or a machine.
     * <p>
     * The field is required.
     *
     * @param enabled
     * @return This {@link CallsMachineDetectionRequest instance}.
     */
    public CallsMachineDetectionRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether to enable answering machine detection. If set to true, answering machine detection will generate an event indicating if the call was answered by a human or a machine.
     * <p>
     * The field is required.
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
     * Indicates whether to enable answering machine detection. If set to true, answering machine detection will generate an event indicating if the call was answered by a human or a machine.
     * <p>
     * The field is required.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets messageDetectionTimeout.
     * <p>
     * Field description:
     * Indicates maximum duration for detecting the end of the message when a answering machine is detected. If set to 0, no end of message detection will be done. Expressed in seconds.
     *
     * @param messageDetectionTimeout
     * @return This {@link CallsMachineDetectionRequest instance}.
     */
    public CallsMachineDetectionRequest messageDetectionTimeout(Integer messageDetectionTimeout) {
        this.messageDetectionTimeout = messageDetectionTimeout;
        return this;
    }

    /**
     * Returns messageDetectionTimeout.
     * <p>
     * Field description:
     * Indicates maximum duration for detecting the end of the message when a answering machine is detected. If set to 0, no end of message detection will be done. Expressed in seconds.
     *
     * @return messageDetectionTimeout
     */
    @JsonProperty("messageDetectionTimeout")
    public Integer getMessageDetectionTimeout() {
        return messageDetectionTimeout;
    }

    /**
     * Sets messageDetectionTimeout.
     * <p>
     * Field description:
     * Indicates maximum duration for detecting the end of the message when a answering machine is detected. If set to 0, no end of message detection will be done. Expressed in seconds.
     *
     * @param messageDetectionTimeout
     */
    @JsonProperty("messageDetectionTimeout")
    public void setMessageDetectionTimeout(Integer messageDetectionTimeout) {
        this.messageDetectionTimeout = messageDetectionTimeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMachineDetectionRequest callsMachineDetectionRequest = (CallsMachineDetectionRequest) o;
        return Objects.equals(this.enabled, callsMachineDetectionRequest.enabled)
                && Objects.equals(this.messageDetectionTimeout, callsMachineDetectionRequest.messageDetectionTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, messageDetectionTimeout);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMachineDetectionRequest {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    messageDetectionTimeout: ")
                .append(toIndentedString(messageDetectionTimeout))
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
