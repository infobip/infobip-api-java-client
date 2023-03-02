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
 * Limits the send speed when sending messages in bulk to deliver messages over a longer period of time. You may wish to use this to allow your systems or agents to handle large amounts of incoming traffic, e.g., if you are expecting recipients to follow through with a call-to-action option from a message you sent. Not setting a send speed limit can overwhelm your resources with incoming traffic.
 */
public class SmsSendingSpeedLimit {

    private Integer amount;

    private SmsSpeedLimitTimeUnit timeUnit;

    /**
     * Sets amount.
     * <p>
     * Field description:
     * The number of messages to be sent per timeUnit. By default, the system sends messages as fast as the infrastructure allows. Use this parameter to adapt sending capacity to your needs. The system is only able to work against its maximum capacity for ambitious message batches.
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link SmsSendingSpeedLimit instance}.
     */
    public SmsSendingSpeedLimit amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * The number of messages to be sent per timeUnit. By default, the system sends messages as fast as the infrastructure allows. Use this parameter to adapt sending capacity to your needs. The system is only able to work against its maximum capacity for ambitious message batches.
     * <p>
     * The field is required.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * The number of messages to be sent per timeUnit. By default, the system sends messages as fast as the infrastructure allows. Use this parameter to adapt sending capacity to your needs. The system is only able to work against its maximum capacity for ambitious message batches.
     * <p>
     * The field is required.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     * @return This {@link SmsSendingSpeedLimit instance}.
     */
    public SmsSendingSpeedLimit timeUnit(SmsSpeedLimitTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Returns timeUnit.
     *
     * @return timeUnit
     */
    @JsonProperty("timeUnit")
    public SmsSpeedLimitTimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(SmsSpeedLimitTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsSendingSpeedLimit smsSendingSpeedLimit = (SmsSendingSpeedLimit) o;
        return Objects.equals(this.amount, smsSendingSpeedLimit.amount)
                && Objects.equals(this.timeUnit, smsSendingSpeedLimit.timeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, timeUnit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsSendingSpeedLimit {")
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    timeUnit: ")
                .append(toIndentedString(timeUnit))
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
