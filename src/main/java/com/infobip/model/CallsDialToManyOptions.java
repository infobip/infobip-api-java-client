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
 * Represents CallsDialToManyOptions model.
 */
public class CallsDialToManyOptions {

    private Boolean parallel;

    private String senderId;

    private Integer maxCallDuration;

    private Integer ringTimeout;

    /**
     * Sets parallel.
     * <p>
     * Field description:
     * Flag indicating that parallel (true), or sequential (false) Dial to Many will be executed.
     *
     * @param parallel
     * @return This {@link CallsDialToManyOptions instance}.
     */
    public CallsDialToManyOptions parallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * Returns parallel.
     * <p>
     * Field description:
     * Flag indicating that parallel (true), or sequential (false) Dial to Many will be executed.
     *
     * @return parallel
     */
    @JsonProperty("parallel")
    public Boolean getParallel() {
        return parallel;
    }

    /**
     * Sets parallel.
     * <p>
     * Field description:
     * Flag indicating that parallel (true), or sequential (false) Dial to Many will be executed.
     *
     * @param parallel
     */
    @JsonProperty("parallel")
    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    /**
     * Sets senderId.
     * <p>
     * Field description:
     * Must be a valid E164 MSISDN; the parameter can be constructed using variables
     *
     * @param senderId
     * @return This {@link CallsDialToManyOptions instance}.
     */
    public CallsDialToManyOptions senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Returns senderId.
     * <p>
     * Field description:
     * Must be a valid E164 MSISDN; the parameter can be constructed using variables
     *
     * @return senderId
     */
    @JsonProperty("senderId")
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets senderId.
     * <p>
     * Field description:
     * Must be a valid E164 MSISDN; the parameter can be constructed using variables
     *
     * @param senderId
     */
    @JsonProperty("senderId")
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sets maxCallDuration.
     * <p>
     * Field description:
     * If set, call transfer will be limited by maxCallDuration seconds; must be a positive number, no upper bound.
     *
     * @param maxCallDuration
     * @return This {@link CallsDialToManyOptions instance}.
     */
    public CallsDialToManyOptions maxCallDuration(Integer maxCallDuration) {
        this.maxCallDuration = maxCallDuration;
        return this;
    }

    /**
     * Returns maxCallDuration.
     * <p>
     * Field description:
     * If set, call transfer will be limited by maxCallDuration seconds; must be a positive number, no upper bound.
     *
     * @return maxCallDuration
     */
    @JsonProperty("maxCallDuration")
    public Integer getMaxCallDuration() {
        return maxCallDuration;
    }

    /**
     * Sets maxCallDuration.
     * <p>
     * Field description:
     * If set, call transfer will be limited by maxCallDuration seconds; must be a positive number, no upper bound.
     *
     * @param maxCallDuration
     */
    @JsonProperty("maxCallDuration")
    public void setMaxCallDuration(Integer maxCallDuration) {
        this.maxCallDuration = maxCallDuration;
    }

    /**
     * Sets ringTimeout.
     * <p>
     * Field description:
     * If set limits the duration of the ringing of transferred calls in seconds. The default value is 30 seconds. This parameter can be changed only for sequential calls.
     *
     * @param ringTimeout
     * @return This {@link CallsDialToManyOptions instance}.
     */
    public CallsDialToManyOptions ringTimeout(Integer ringTimeout) {
        this.ringTimeout = ringTimeout;
        return this;
    }

    /**
     * Returns ringTimeout.
     * <p>
     * Field description:
     * If set limits the duration of the ringing of transferred calls in seconds. The default value is 30 seconds. This parameter can be changed only for sequential calls.
     *
     * @return ringTimeout
     */
    @JsonProperty("ringTimeout")
    public Integer getRingTimeout() {
        return ringTimeout;
    }

    /**
     * Sets ringTimeout.
     * <p>
     * Field description:
     * If set limits the duration of the ringing of transferred calls in seconds. The default value is 30 seconds. This parameter can be changed only for sequential calls.
     *
     * @param ringTimeout
     */
    @JsonProperty("ringTimeout")
    public void setRingTimeout(Integer ringTimeout) {
        this.ringTimeout = ringTimeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialToManyOptions callsDialToManyOptions = (CallsDialToManyOptions) o;
        return Objects.equals(this.parallel, callsDialToManyOptions.parallel)
                && Objects.equals(this.senderId, callsDialToManyOptions.senderId)
                && Objects.equals(this.maxCallDuration, callsDialToManyOptions.maxCallDuration)
                && Objects.equals(this.ringTimeout, callsDialToManyOptions.ringTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parallel, senderId, maxCallDuration, ringTimeout);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialToManyOptions {")
                .append(newLine)
                .append("    parallel: ")
                .append(toIndentedString(parallel))
                .append(newLine)
                .append("    senderId: ")
                .append(toIndentedString(senderId))
                .append(newLine)
                .append("    maxCallDuration: ")
                .append(toIndentedString(maxCallDuration))
                .append(newLine)
                .append("    ringTimeout: ")
                .append(toIndentedString(ringTimeout))
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
