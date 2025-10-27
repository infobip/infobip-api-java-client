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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Properties of the events that provide Answering Machine Detection result.
 */
public class CallsMachineDetectionProperties {

    private CallsDetectionResult detectionResult;

    private Map<String, Double> confidenceRating = null;

    private Map<String, String> customData = null;

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

    /**
     * Sets confidenceRating.
     * <p>
     * Field description:
     * A map representing the confidence rating for each detection class. The key is a tag indicating the detection class, and the value is a float between &#x60;0.0&#x60; and &#x60;1.0&#x60; representing the confidence rating. Possible classes are: &#x60;HUMAN&#x60;, &#x60;MACHINE&#x60;, &#x60;MUSIC&#x60;, &#x60;RINGING&#x60;, &#x60;NOISE&#x60;, &#x60;SILENCE&#x60; and &#x60;OTHER&#x60;. Each class confidence rating is independent from the other, thereby the sum of all confidence values may not equal 1.0.
     *
     * @param confidenceRating
     * @return This {@link CallsMachineDetectionProperties instance}.
     */
    public CallsMachineDetectionProperties confidenceRating(Map<String, Double> confidenceRating) {
        this.confidenceRating = confidenceRating;
        return this;
    }

    /**
     * Puts and entry into confidenceRating.
     * <p>
     * Field description:
     * A map representing the confidence rating for each detection class. The key is a tag indicating the detection class, and the value is a float between &#x60;0.0&#x60; and &#x60;1.0&#x60; representing the confidence rating. Possible classes are: &#x60;HUMAN&#x60;, &#x60;MACHINE&#x60;, &#x60;MUSIC&#x60;, &#x60;RINGING&#x60;, &#x60;NOISE&#x60;, &#x60;SILENCE&#x60; and &#x60;OTHER&#x60;. Each class confidence rating is independent from the other, thereby the sum of all confidence values may not equal 1.0.
     *
     * @param key The given key.
     * @param confidenceRatingItem The item to be associated with the given key.
     * @return This {@link CallsMachineDetectionProperties instance}.
     */
    public CallsMachineDetectionProperties putConfidenceRatingItem(String key, Double confidenceRatingItem) {
        if (this.confidenceRating == null) {
            this.confidenceRating = new HashMap<>();
        }
        this.confidenceRating.put(key, confidenceRatingItem);
        return this;
    }

    /**
     * Returns confidenceRating.
     * <p>
     * Field description:
     * A map representing the confidence rating for each detection class. The key is a tag indicating the detection class, and the value is a float between &#x60;0.0&#x60; and &#x60;1.0&#x60; representing the confidence rating. Possible classes are: &#x60;HUMAN&#x60;, &#x60;MACHINE&#x60;, &#x60;MUSIC&#x60;, &#x60;RINGING&#x60;, &#x60;NOISE&#x60;, &#x60;SILENCE&#x60; and &#x60;OTHER&#x60;. Each class confidence rating is independent from the other, thereby the sum of all confidence values may not equal 1.0.
     *
     * @return confidenceRating
     */
    @JsonProperty("confidenceRating")
    public Map<String, Double> getConfidenceRating() {
        return confidenceRating;
    }

    /**
     * Sets confidenceRating.
     * <p>
     * Field description:
     * A map representing the confidence rating for each detection class. The key is a tag indicating the detection class, and the value is a float between &#x60;0.0&#x60; and &#x60;1.0&#x60; representing the confidence rating. Possible classes are: &#x60;HUMAN&#x60;, &#x60;MACHINE&#x60;, &#x60;MUSIC&#x60;, &#x60;RINGING&#x60;, &#x60;NOISE&#x60;, &#x60;SILENCE&#x60; and &#x60;OTHER&#x60;. Each class confidence rating is independent from the other, thereby the sum of all confidence values may not equal 1.0.
     *
     * @param confidenceRating
     */
    @JsonProperty("confidenceRating")
    public void setConfidenceRating(Map<String, Double> confidenceRating) {
        this.confidenceRating = confidenceRating;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsMachineDetectionProperties instance}.
     */
    public CallsMachineDetectionProperties customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsMachineDetectionProperties instance}.
     */
    public CallsMachineDetectionProperties putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
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
        return Objects.equals(this.detectionResult, callsMachineDetectionProperties.detectionResult)
                && Objects.equals(this.confidenceRating, callsMachineDetectionProperties.confidenceRating)
                && Objects.equals(this.customData, callsMachineDetectionProperties.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detectionResult, confidenceRating, customData);
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
                .append("    confidenceRating: ")
                .append(toIndentedString(confidenceRating))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
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
