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
 * Properties of the events that provide Answering Machine Detection result.
 */
public class CallsMachineDetectionProperties {

    private CallsDetectionResult detectionResult;

    /**
     * Sets detectionResult.
     *
     * @param detectionResult
     * @return This {@link CallsMachineDetectionProperties instance}.
     */
    public CallsMachineDetectionProperties detectionResult(CallsDetectionResult detectionResult) {
        this.detectionResult = detectionResult;
        return this;
    }

    /**
     * Returns detectionResult.
     *
     * @return detectionResult
     */
    @JsonProperty("detectionResult")
    public CallsDetectionResult getDetectionResult() {
        return detectionResult;
    }

    /**
     * Sets detectionResult.
     *
     * @param detectionResult
     */
    @JsonProperty("detectionResult")
    public void setDetectionResult(CallsDetectionResult detectionResult) {
        this.detectionResult = detectionResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMachineDetectionProperties callsMachineDetectionProperties = (CallsMachineDetectionProperties) o;
        return Objects.equals(this.detectionResult, callsMachineDetectionProperties.detectionResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detectionResult);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMachineDetectionProperties {")
                .append(newLine)
                .append("    detectionResult: ")
                .append(toIndentedString(detectionResult))
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
