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
 * Used to determine whether to retry the delivery of a bulk call if the initial attempt fails. Additional retries will occur based on the schedule defined by the _minWaitPeriod_ and _maxWaitPeriod_ parameters, as well as the platform&#39;s internal retry logic. If _minWaitPeriod_ differs from _maxWaitPeriod_, the delivery will be retried according to the following schedule: after 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours, or until _maxWaitPeriod_ is reached. Once the retry attempt for _maxWaitPeriod_ is reached, _maxWaitPeriod_ will be used for all subsequent retries. If _minWaitPeriod_ and _maxWaitPeriod_ are defined as equal values, the period between retries will be equal to this value. Bulk call delivery will be retried until successful delivery, call validity expiration, or reaching the _maxAttempts_ value.
 */
public class CallsRetryOptions {

    private Integer minWaitPeriod;

    private Integer maxWaitPeriod;

    private Integer maxAttempts;

    /**
     * Sets minWaitPeriod.
     * <p>
     * Field description:
     * Defines the minimum waiting time (in minutes) after the previous failed attempt before trying to establish the call again. Supported values are 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours. If entered a value that is not in the list but is smaller than 24 hours, the next bigger value from the list will be used. If a value larger than 24 hours is entered, 24 hours will be used.
     *
     * @param minWaitPeriod
     * @return This {@link CallsRetryOptions instance}.
     */
    public CallsRetryOptions minWaitPeriod(Integer minWaitPeriod) {
        this.minWaitPeriod = minWaitPeriod;
        return this;
    }

    /**
     * Returns minWaitPeriod.
     * <p>
     * Field description:
     * Defines the minimum waiting time (in minutes) after the previous failed attempt before trying to establish the call again. Supported values are 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours. If entered a value that is not in the list but is smaller than 24 hours, the next bigger value from the list will be used. If a value larger than 24 hours is entered, 24 hours will be used.
     *
     * @return minWaitPeriod
     */
    @JsonProperty("minWaitPeriod")
    public Integer getMinWaitPeriod() {
        return minWaitPeriod;
    }

    /**
     * Sets minWaitPeriod.
     * <p>
     * Field description:
     * Defines the minimum waiting time (in minutes) after the previous failed attempt before trying to establish the call again. Supported values are 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours. If entered a value that is not in the list but is smaller than 24 hours, the next bigger value from the list will be used. If a value larger than 24 hours is entered, 24 hours will be used.
     *
     * @param minWaitPeriod
     */
    @JsonProperty("minWaitPeriod")
    public void setMinWaitPeriod(Integer minWaitPeriod) {
        this.minWaitPeriod = minWaitPeriod;
    }

    /**
     * Sets maxWaitPeriod.
     * <p>
     * Field description:
     * Defines the maximum waiting time (in minutes) after the previous failed attempt before trying to establish the call again. Supported values are 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours. If entered a value that is not in the list but is smaller than 24 hours, the next bigger value from the list will be used. If a value larger than 24 hours is entered, 24 hours will be used.
     *
     * @param maxWaitPeriod
     * @return This {@link CallsRetryOptions instance}.
     */
    public CallsRetryOptions maxWaitPeriod(Integer maxWaitPeriod) {
        this.maxWaitPeriod = maxWaitPeriod;
        return this;
    }

    /**
     * Returns maxWaitPeriod.
     * <p>
     * Field description:
     * Defines the maximum waiting time (in minutes) after the previous failed attempt before trying to establish the call again. Supported values are 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours. If entered a value that is not in the list but is smaller than 24 hours, the next bigger value from the list will be used. If a value larger than 24 hours is entered, 24 hours will be used.
     *
     * @return maxWaitPeriod
     */
    @JsonProperty("maxWaitPeriod")
    public Integer getMaxWaitPeriod() {
        return maxWaitPeriod;
    }

    /**
     * Sets maxWaitPeriod.
     * <p>
     * Field description:
     * Defines the maximum waiting time (in minutes) after the previous failed attempt before trying to establish the call again. Supported values are 1 minute, 2 minutes, 5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 2 hours, 4 hours, 8 hours, 16 hours, and 24 hours. If entered a value that is not in the list but is smaller than 24 hours, the next bigger value from the list will be used. If a value larger than 24 hours is entered, 24 hours will be used.
     *
     * @param maxWaitPeriod
     */
    @JsonProperty("maxWaitPeriod")
    public void setMaxWaitPeriod(Integer maxWaitPeriod) {
        this.maxWaitPeriod = maxWaitPeriod;
    }

    /**
     * Sets maxAttempts.
     * <p>
     * Field description:
     * Defines the maximum number of retry attempts. The maximum value is &#x60;4&#x60;. If a value higher than &#x60;4&#x60; is entered, it will be set to &#x60;4&#x60;.
     *
     * @param maxAttempts
     * @return This {@link CallsRetryOptions instance}.
     */
    public CallsRetryOptions maxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }

    /**
     * Returns maxAttempts.
     * <p>
     * Field description:
     * Defines the maximum number of retry attempts. The maximum value is &#x60;4&#x60;. If a value higher than &#x60;4&#x60; is entered, it will be set to &#x60;4&#x60;.
     *
     * @return maxAttempts
     */
    @JsonProperty("maxAttempts")
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * Sets maxAttempts.
     * <p>
     * Field description:
     * Defines the maximum number of retry attempts. The maximum value is &#x60;4&#x60;. If a value higher than &#x60;4&#x60; is entered, it will be set to &#x60;4&#x60;.
     *
     * @param maxAttempts
     */
    @JsonProperty("maxAttempts")
    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRetryOptions callsRetryOptions = (CallsRetryOptions) o;
        return Objects.equals(this.minWaitPeriod, callsRetryOptions.minWaitPeriod)
                && Objects.equals(this.maxWaitPeriod, callsRetryOptions.maxWaitPeriod)
                && Objects.equals(this.maxAttempts, callsRetryOptions.maxAttempts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minWaitPeriod, maxWaitPeriod, maxAttempts);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRetryOptions {")
                .append(newLine)
                .append("    minWaitPeriod: ")
                .append(toIndentedString(minWaitPeriod))
                .append(newLine)
                .append("    maxWaitPeriod: ")
                .append(toIndentedString(maxWaitPeriod))
                .append(newLine)
                .append("    maxAttempts: ")
                .append(toIndentedString(maxAttempts))
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
