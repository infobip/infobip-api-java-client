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
 * Represents NumbersAttachNumberPoolRequest model.
 */
public class NumbersAttachNumberPoolRequest {

    private String numberPoolId;

    private String reason;

    /**
     * Sets numberPoolId.
     * <p>
     * Field description:
     * Unique identifier of the number pool to be used for this campaign. If not provided, a default number pool will be automatically assigned.
     *
     * @param numberPoolId
     * @return This {@link NumbersAttachNumberPoolRequest instance}.
     */
    public NumbersAttachNumberPoolRequest numberPoolId(String numberPoolId) {
        this.numberPoolId = numberPoolId;
        return this;
    }

    /**
     * Returns numberPoolId.
     * <p>
     * Field description:
     * Unique identifier of the number pool to be used for this campaign. If not provided, a default number pool will be automatically assigned.
     *
     * @return numberPoolId
     */
    @JsonProperty("numberPoolId")
    public String getNumberPoolId() {
        return numberPoolId;
    }

    /**
     * Sets numberPoolId.
     * <p>
     * Field description:
     * Unique identifier of the number pool to be used for this campaign. If not provided, a default number pool will be automatically assigned.
     *
     * @param numberPoolId
     */
    @JsonProperty("numberPoolId")
    public void setNumberPoolId(String numberPoolId) {
        this.numberPoolId = numberPoolId;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * A concise explanation of why this campaign requires a dedicated number pool. Include operational or regulatory justifications, such as high-volume messaging, the use of multiple sender identities, or throughput guarantees.
     *
     * @param reason
     * @return This {@link NumbersAttachNumberPoolRequest instance}.
     */
    public NumbersAttachNumberPoolRequest reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * A concise explanation of why this campaign requires a dedicated number pool. Include operational or regulatory justifications, such as high-volume messaging, the use of multiple sender identities, or throughput guarantees.
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
     * A concise explanation of why this campaign requires a dedicated number pool. Include operational or regulatory justifications, such as high-volume messaging, the use of multiple sender identities, or throughput guarantees.
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
        NumbersAttachNumberPoolRequest numbersAttachNumberPoolRequest = (NumbersAttachNumberPoolRequest) o;
        return Objects.equals(this.numberPoolId, numbersAttachNumberPoolRequest.numberPoolId)
                && Objects.equals(this.reason, numbersAttachNumberPoolRequest.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPoolId, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersAttachNumberPoolRequest {")
                .append(newLine)
                .append("    numberPoolId: ")
                .append(toIndentedString(numberPoolId))
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
