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
 * Represents CallsDialogTransferRequestedProperties model.
 */
public class CallsDialogTransferRequestedProperties {

    private Call transferorCall;

    private String referTo;

    /**
     * Sets transferorCall.
     *
     * @param transferorCall
     * @return This {@link CallsDialogTransferRequestedProperties instance}.
     */
    public CallsDialogTransferRequestedProperties transferorCall(Call transferorCall) {
        this.transferorCall = transferorCall;
        return this;
    }

    /**
     * Returns transferorCall.
     *
     * @return transferorCall
     */
    @JsonProperty("transferorCall")
    public Call getTransferorCall() {
        return transferorCall;
    }

    /**
     * Sets transferorCall.
     *
     * @param transferorCall
     */
    @JsonProperty("transferorCall")
    public void setTransferorCall(Call transferorCall) {
        this.transferorCall = transferorCall;
    }

    /**
     * Sets referTo.
     * <p>
     * Field description:
     * Transfer destination.
     *
     * @param referTo
     * @return This {@link CallsDialogTransferRequestedProperties instance}.
     */
    public CallsDialogTransferRequestedProperties referTo(String referTo) {
        this.referTo = referTo;
        return this;
    }

    /**
     * Returns referTo.
     * <p>
     * Field description:
     * Transfer destination.
     *
     * @return referTo
     */
    @JsonProperty("referTo")
    public String getReferTo() {
        return referTo;
    }

    /**
     * Sets referTo.
     * <p>
     * Field description:
     * Transfer destination.
     *
     * @param referTo
     */
    @JsonProperty("referTo")
    public void setReferTo(String referTo) {
        this.referTo = referTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogTransferRequestedProperties callsDialogTransferRequestedProperties =
                (CallsDialogTransferRequestedProperties) o;
        return Objects.equals(this.transferorCall, callsDialogTransferRequestedProperties.transferorCall)
                && Objects.equals(this.referTo, callsDialogTransferRequestedProperties.referTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferorCall, referTo);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogTransferRequestedProperties {")
                .append(newLine)
                .append("    transferorCall: ")
                .append(toIndentedString(transferorCall))
                .append(newLine)
                .append("    referTo: ")
                .append(toIndentedString(referTo))
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
