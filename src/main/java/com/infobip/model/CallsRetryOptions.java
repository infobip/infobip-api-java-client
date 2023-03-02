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
 * Specifies options to retry establishing a call: if the first attempt fails, until successful call establishment, or until &#x60;validityPeriod&#x60; or &#x60;maxCount&#x60; is reached.
 */
public class CallsRetryOptions {

    private Integer minWaitPeriod;

    private Integer maxWaitPeriod;

    private Integer maxAttempts;

    /**
     * Sets minWaitPeriod.
     * <p>
     * Field description:
     * Defines the minimal waiting time (in minutes) after the previous failed attempt to try to establish the call again.
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
     * Defines the minimal waiting time (in minutes) after the previous failed attempt to try to establish the call again.
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
     * Defines the minimal waiting time (in minutes) after the previous failed attempt to try to establish the call again.
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
     * Defines the maximum waiting time (in minutes) after the previous failed attempt to try to establish the call again.
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
     * Defines the maximum waiting time (in minutes) after the previous failed attempt to try to establish the call again.
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
     * Defines the maximum waiting time (in minutes) after the previous failed attempt to try to establish the call again.
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
     * Specifies the maximum number of retry attempts.
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
     * Specifies the maximum number of retry attempts.
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
     * Specifies the maximum number of retry attempts.
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
