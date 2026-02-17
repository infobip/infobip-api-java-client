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
 * Detailed error description.
 */
public class CallsErrorProperties {

    private CallsActionType actionType;

    private String errorCode;

    private String errorDetails;

    /**
     * Sets actionType.
     *
     * @param actionType
     * @return This {@link CallsErrorProperties instance}.
     */
    public CallsErrorProperties actionType(CallsActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Returns actionType.
     *
     * @return actionType
     */
    @JsonProperty("actionType")
    public CallsActionType getActionType() {
        return actionType;
    }

    /**
     * Sets actionType.
     *
     * @param actionType
     */
    @JsonProperty("actionType")
    public void setActionType(CallsActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * Unique error code in machine-readable format.
     *
     * @param errorCode
     * @return This {@link CallsErrorProperties instance}.
     */
    public CallsErrorProperties errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     * <p>
     * Field description:
     * Unique error code in machine-readable format.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * Unique error code in machine-readable format.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets errorDetails.
     * <p>
     * Field description:
     * Error details in human-readable format.
     *
     * @param errorDetails
     * @return This {@link CallsErrorProperties instance}.
     */
    public CallsErrorProperties errorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Returns errorDetails.
     * <p>
     * Field description:
     * Error details in human-readable format.
     *
     * @return errorDetails
     */
    @JsonProperty("errorDetails")
    public String getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets errorDetails.
     * <p>
     * Field description:
     * Error details in human-readable format.
     *
     * @param errorDetails
     */
    @JsonProperty("errorDetails")
    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsErrorProperties callsErrorProperties = (CallsErrorProperties) o;
        return Objects.equals(this.actionType, callsErrorProperties.actionType)
                && Objects.equals(this.errorCode, callsErrorProperties.errorCode)
                && Objects.equals(this.errorDetails, callsErrorProperties.errorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType, errorCode, errorDetails);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsErrorProperties {")
                .append(newLine)
                .append("    actionType: ")
                .append(toIndentedString(actionType))
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
                .append(newLine)
                .append("    errorDetails: ")
                .append(toIndentedString(errorDetails))
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
