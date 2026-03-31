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
 * Current status of CNAM Delivery configuration.
 */
public class CallsCnamDeliveryStatus {

    private CallsStatus status;

    private String reason;

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link CallsCnamDeliveryStatus instance}.
     */
    public CallsCnamDeliveryStatus status(CallsStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public CallsStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(CallsStatus status) {
        this.status = status;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Description of the status.
     *
     * @param reason
     * @return This {@link CallsCnamDeliveryStatus instance}.
     */
    public CallsCnamDeliveryStatus reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Description of the status.
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
     * Description of the status.
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
        CallsCnamDeliveryStatus callsCnamDeliveryStatus = (CallsCnamDeliveryStatus) o;
        return Objects.equals(this.status, callsCnamDeliveryStatus.status)
                && Objects.equals(this.reason, callsCnamDeliveryStatus.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCnamDeliveryStatus {")
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
