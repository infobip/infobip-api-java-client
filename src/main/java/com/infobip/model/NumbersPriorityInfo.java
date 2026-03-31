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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Priority information used in latest campaign review.
 */
public class NumbersPriorityInfo {

    private UUID priorityId;

    private OffsetDateTime submittedDate;

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * Id of a priority
     *
     * @param priorityId
     * @return This {@link NumbersPriorityInfo instance}.
     */
    public NumbersPriorityInfo priorityId(UUID priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /**
     * Returns priorityId.
     * <p>
     * Field description:
     * Id of a priority
     *
     * @return priorityId
     */
    @JsonProperty("priorityId")
    public UUID getPriorityId() {
        return priorityId;
    }

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * Id of a priority
     *
     * @param priorityId
     */
    @JsonProperty("priorityId")
    public void setPriorityId(UUID priorityId) {
        this.priorityId = priorityId;
    }

    /**
     * Sets submittedDate.
     * <p>
     * Field description:
     * Date submitted for review
     *
     * @param submittedDate
     * @return This {@link NumbersPriorityInfo instance}.
     */
    public NumbersPriorityInfo submittedDate(OffsetDateTime submittedDate) {
        this.submittedDate = submittedDate;
        return this;
    }

    /**
     * Returns submittedDate.
     * <p>
     * Field description:
     * Date submitted for review
     *
     * @return submittedDate
     */
    @JsonProperty("submittedDate")
    public OffsetDateTime getSubmittedDate() {
        return submittedDate;
    }

    /**
     * Sets submittedDate.
     * <p>
     * Field description:
     * Date submitted for review
     *
     * @param submittedDate
     */
    @JsonProperty("submittedDate")
    public void setSubmittedDate(OffsetDateTime submittedDate) {
        this.submittedDate = submittedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersPriorityInfo numbersPriorityInfo = (NumbersPriorityInfo) o;
        return Objects.equals(this.priorityId, numbersPriorityInfo.priorityId)
                && Objects.equals(this.submittedDate, numbersPriorityInfo.submittedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priorityId, submittedDate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersPriorityInfo {")
                .append(newLine)
                .append("    priorityId: ")
                .append(toIndentedString(priorityId))
                .append(newLine)
                .append("    submittedDate: ")
                .append(toIndentedString(submittedDate))
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
