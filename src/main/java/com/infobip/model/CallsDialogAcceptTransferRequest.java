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
 * Represents CallsDialogAcceptTransferRequest model.
 */
public class CallsDialogAcceptTransferRequest {

    private CallsDialogCallRequest targetCallRequest;

    /**
     * Sets targetCallRequest.
     * <p>
     * The field is required.
     *
     * @param targetCallRequest
     * @return This {@link CallsDialogAcceptTransferRequest instance}.
     */
    public CallsDialogAcceptTransferRequest targetCallRequest(CallsDialogCallRequest targetCallRequest) {
        this.targetCallRequest = targetCallRequest;
        return this;
    }

    /**
     * Returns targetCallRequest.
     * <p>
     * The field is required.
     *
     * @return targetCallRequest
     */
    @JsonProperty("targetCallRequest")
    public CallsDialogCallRequest getTargetCallRequest() {
        return targetCallRequest;
    }

    /**
     * Sets targetCallRequest.
     * <p>
     * The field is required.
     *
     * @param targetCallRequest
     */
    @JsonProperty("targetCallRequest")
    public void setTargetCallRequest(CallsDialogCallRequest targetCallRequest) {
        this.targetCallRequest = targetCallRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogAcceptTransferRequest callsDialogAcceptTransferRequest = (CallsDialogAcceptTransferRequest) o;
        return Objects.equals(this.targetCallRequest, callsDialogAcceptTransferRequest.targetCallRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetCallRequest);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogAcceptTransferRequest {")
                .append(newLine)
                .append("    targetCallRequest: ")
                .append(toIndentedString(targetCallRequest))
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
