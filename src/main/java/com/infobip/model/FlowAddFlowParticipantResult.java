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
 * Result of operation for the given participant.
 */
public class FlowAddFlowParticipantResult {

    private FlowPersonUniqueField identifyBy;

    private FlowAddFlowParticipantStatus status;

    private FlowErrorStatusReason errorReason;

    /**
     * Sets identifyBy.
     * <p>
     * The field is required.
     *
     * @param identifyBy
     * @return This {@link FlowAddFlowParticipantResult instance}.
     */
    public FlowAddFlowParticipantResult identifyBy(FlowPersonUniqueField identifyBy) {
        this.identifyBy = identifyBy;
        return this;
    }

    /**
     * Returns identifyBy.
     * <p>
     * The field is required.
     *
     * @return identifyBy
     */
    @JsonProperty("identifyBy")
    public FlowPersonUniqueField getIdentifyBy() {
        return identifyBy;
    }

    /**
     * Sets identifyBy.
     * <p>
     * The field is required.
     *
     * @param identifyBy
     */
    @JsonProperty("identifyBy")
    public void setIdentifyBy(FlowPersonUniqueField identifyBy) {
        this.identifyBy = identifyBy;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link FlowAddFlowParticipantResult instance}.
     */
    public FlowAddFlowParticipantResult status(FlowAddFlowParticipantStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public FlowAddFlowParticipantStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(FlowAddFlowParticipantStatus status) {
        this.status = status;
    }

    /**
     * Sets errorReason.
     *
     * @param errorReason
     * @return This {@link FlowAddFlowParticipantResult instance}.
     */
    public FlowAddFlowParticipantResult errorReason(FlowErrorStatusReason errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * Returns errorReason.
     *
     * @return errorReason
     */
    @JsonProperty("errorReason")
    public FlowErrorStatusReason getErrorReason() {
        return errorReason;
    }

    /**
     * Sets errorReason.
     *
     * @param errorReason
     */
    @JsonProperty("errorReason")
    public void setErrorReason(FlowErrorStatusReason errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowAddFlowParticipantResult flowAddFlowParticipantResult = (FlowAddFlowParticipantResult) o;
        return Objects.equals(this.identifyBy, flowAddFlowParticipantResult.identifyBy)
                && Objects.equals(this.status, flowAddFlowParticipantResult.status)
                && Objects.equals(this.errorReason, flowAddFlowParticipantResult.errorReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifyBy, status, errorReason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowAddFlowParticipantResult {")
                .append(newLine)
                .append("    identifyBy: ")
                .append(toIndentedString(identifyBy))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    errorReason: ")
                .append(toIndentedString(errorReason))
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
