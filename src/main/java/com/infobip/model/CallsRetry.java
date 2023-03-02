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
 * Used to define if the delivery of the Voice messages should be retried in case the first try doesn&#39;t succeed. Additional retries will be made according to the schedule defined by _minPeriod_ and _maxPeriod_ parameters and platform&#39;s internal retry logic. If the _minPeriod_ differs _maxPeriod_, delivery will be retried in the following manner: after 1 min, 2 min, 5 min, 10 min, 20 min, 30 min, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, 24 hours or until maxPeriod is reached.  If the retry attempt for the _maxPeriod_ is reached, the _maxPeriod_ will be used for all subsequent retries. If the _minPeriod_ and the _maxPeriod_ are defined as equal values, the period of time between retries will be equal to this value. Message delivery will be retried until the successful delivery or message validity or _maxCount_ value is reached.
 */
public class CallsRetry {

    private Integer maxCount;

    private Integer maxPeriod;

    private Integer minPeriod;

    /**
     * Sets maxCount.
     * <p>
     * Field description:
     * Specify the maximum number of retry attempts. Maximum value of the maxCount is &#x60;4&#x60;. If the value is higher than &#x60;4&#x60;, it will be set to &#x60;4&#x60;.
     * <p>
     * The field is required.
     *
     * @param maxCount
     * @return This {@link CallsRetry instance}.
     */
    public CallsRetry maxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Returns maxCount.
     * <p>
     * Field description:
     * Specify the maximum number of retry attempts. Maximum value of the maxCount is &#x60;4&#x60;. If the value is higher than &#x60;4&#x60;, it will be set to &#x60;4&#x60;.
     * <p>
     * The field is required.
     *
     * @return maxCount
     */
    @JsonProperty("maxCount")
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * Sets maxCount.
     * <p>
     * Field description:
     * Specify the maximum number of retry attempts. Maximum value of the maxCount is &#x60;4&#x60;. If the value is higher than &#x60;4&#x60;, it will be set to &#x60;4&#x60;.
     * <p>
     * The field is required.
     *
     * @param maxCount
     */
    @JsonProperty("maxCount")
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * Sets maxPeriod.
     * <p>
     * Field description:
     * Defines the maximum waiting time (in minutes) after the previous failed attempt to try to deliver the message again.
     * <p>
     * The field is required.
     *
     * @param maxPeriod
     * @return This {@link CallsRetry instance}.
     */
    public CallsRetry maxPeriod(Integer maxPeriod) {
        this.maxPeriod = maxPeriod;
        return this;
    }

    /**
     * Returns maxPeriod.
     * <p>
     * Field description:
     * Defines the maximum waiting time (in minutes) after the previous failed attempt to try to deliver the message again.
     * <p>
     * The field is required.
     *
     * @return maxPeriod
     */
    @JsonProperty("maxPeriod")
    public Integer getMaxPeriod() {
        return maxPeriod;
    }

    /**
     * Sets maxPeriod.
     * <p>
     * Field description:
     * Defines the maximum waiting time (in minutes) after the previous failed attempt to try to deliver the message again.
     * <p>
     * The field is required.
     *
     * @param maxPeriod
     */
    @JsonProperty("maxPeriod")
    public void setMaxPeriod(Integer maxPeriod) {
        this.maxPeriod = maxPeriod;
    }

    /**
     * Sets minPeriod.
     * <p>
     * Field description:
     * Defines the minimal waiting time (in minutes) after the previous failed attempt to try to deliver the message again.
     * <p>
     * The field is required.
     *
     * @param minPeriod
     * @return This {@link CallsRetry instance}.
     */
    public CallsRetry minPeriod(Integer minPeriod) {
        this.minPeriod = minPeriod;
        return this;
    }

    /**
     * Returns minPeriod.
     * <p>
     * Field description:
     * Defines the minimal waiting time (in minutes) after the previous failed attempt to try to deliver the message again.
     * <p>
     * The field is required.
     *
     * @return minPeriod
     */
    @JsonProperty("minPeriod")
    public Integer getMinPeriod() {
        return minPeriod;
    }

    /**
     * Sets minPeriod.
     * <p>
     * Field description:
     * Defines the minimal waiting time (in minutes) after the previous failed attempt to try to deliver the message again.
     * <p>
     * The field is required.
     *
     * @param minPeriod
     */
    @JsonProperty("minPeriod")
    public void setMinPeriod(Integer minPeriod) {
        this.minPeriod = minPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRetry callsRetry = (CallsRetry) o;
        return Objects.equals(this.maxCount, callsRetry.maxCount)
                && Objects.equals(this.maxPeriod, callsRetry.maxPeriod)
                && Objects.equals(this.minPeriod, callsRetry.minPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCount, maxPeriod, minPeriod);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRetry {")
                .append(newLine)
                .append("    maxCount: ")
                .append(toIndentedString(maxCount))
                .append(newLine)
                .append("    maxPeriod: ")
                .append(toIndentedString(maxPeriod))
                .append(newLine)
                .append("    minPeriod: ")
                .append(toIndentedString(minPeriod))
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
