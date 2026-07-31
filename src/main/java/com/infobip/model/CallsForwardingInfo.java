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
 * Information about a call diversion/forwarding hop, containing the original destination and the reason for forwarding.
 */
public class CallsForwardingInfo {

    private String number;

    private String reason;

    /**
     * Sets number.
     * <p>
     * Field description:
     * The phone number from which the call was forwarded.
     *
     * @param number
     * @return This {@link CallsForwardingInfo instance}.
     */
    public CallsForwardingInfo number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * The phone number from which the call was forwarded.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * The phone number from which the call was forwarded.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * The reason why the call was forwarded.
     *
     * @param reason
     * @return This {@link CallsForwardingInfo instance}.
     */
    public CallsForwardingInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * The reason why the call was forwarded.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * The reason why the call was forwarded.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsForwardingInfo callsForwardingInfo = (CallsForwardingInfo) o;
        return Objects.equals(this.number, callsForwardingInfo.number)
                && Objects.equals(this.reason, callsForwardingInfo.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsForwardingInfo {")
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
