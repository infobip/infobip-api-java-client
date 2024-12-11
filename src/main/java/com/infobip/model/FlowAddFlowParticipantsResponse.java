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
 * Represents FlowAddFlowParticipantsResponse model.
 */
public class FlowAddFlowParticipantsResponse {

    private String operationId;

    /**
     * Sets operationId.
     * <p>
     * Field description:
     * Unique identifier of the operation.
     * <p>
     * The field is required.
     *
     * @param operationId
     * @return This {@link FlowAddFlowParticipantsResponse instance}.
     */
    public FlowAddFlowParticipantsResponse operationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Returns operationId.
     * <p>
     * Field description:
     * Unique identifier of the operation.
     * <p>
     * The field is required.
     *
     * @return operationId
     */
    @JsonProperty("operationId")
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets operationId.
     * <p>
     * Field description:
     * Unique identifier of the operation.
     * <p>
     * The field is required.
     *
     * @param operationId
     */
    @JsonProperty("operationId")
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowAddFlowParticipantsResponse flowAddFlowParticipantsResponse = (FlowAddFlowParticipantsResponse) o;
        return Objects.equals(this.operationId, flowAddFlowParticipantsResponse.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowAddFlowParticipantsResponse {")
                .append(newLine)
                .append("    operationId: ")
                .append(toIndentedString(operationId))
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
