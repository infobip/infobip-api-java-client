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
 * Represents CallsDialOptions model.
 */
public class CallsDialOptions {

    private String senderId;

    private Integer maxCallDuration;

    /**
     * Sets senderId.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
     *
     * @param senderId
     * @return This {@link CallsDialOptions instance}.
     */
    public CallsDialOptions senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Returns senderId.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
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
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
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
     * If set, call transfer will be limited by maxCallDuration seconds, must be a positive number, no upper bound.
     *
     * @param maxCallDuration
     * @return This {@link CallsDialOptions instance}.
     */
    public CallsDialOptions maxCallDuration(Integer maxCallDuration) {
        this.maxCallDuration = maxCallDuration;
        return this;
    }

    /**
     * Returns maxCallDuration.
     * <p>
     * Field description:
     * If set, call transfer will be limited by maxCallDuration seconds, must be a positive number, no upper bound.
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
     * If set, call transfer will be limited by maxCallDuration seconds, must be a positive number, no upper bound.
     *
     * @param maxCallDuration
     */
    @JsonProperty("maxCallDuration")
    public void setMaxCallDuration(Integer maxCallDuration) {
        this.maxCallDuration = maxCallDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialOptions callsDialOptions = (CallsDialOptions) o;
        return Objects.equals(this.senderId, callsDialOptions.senderId)
                && Objects.equals(this.maxCallDuration, callsDialOptions.maxCallDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderId, maxCallDuration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialOptions {")
                .append(newLine)
                .append("    senderId: ")
                .append(toIndentedString(senderId))
                .append(newLine)
                .append("    maxCallDuration: ")
                .append(toIndentedString(maxCallDuration))
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
