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
import java.util.UUID;

/**
 * Response containing the request UUID for tracking the AI review submission
 */
public class NumbersReviewSubmissionResponse {

    private UUID requestUuid;

    /**
     * Sets requestUuid.
     * <p>
     * Field description:
     * Unique identifier for this AI review request.
     *
     * @param requestUuid
     * @return This {@link NumbersReviewSubmissionResponse instance}.
     */
    public NumbersReviewSubmissionResponse requestUuid(UUID requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }

    /**
     * Returns requestUuid.
     * <p>
     * Field description:
     * Unique identifier for this AI review request.
     *
     * @return requestUuid
     */
    @JsonProperty("requestUuid")
    public UUID getRequestUuid() {
        return requestUuid;
    }

    /**
     * Sets requestUuid.
     * <p>
     * Field description:
     * Unique identifier for this AI review request.
     *
     * @param requestUuid
     */
    @JsonProperty("requestUuid")
    public void setRequestUuid(UUID requestUuid) {
        this.requestUuid = requestUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersReviewSubmissionResponse numbersReviewSubmissionResponse = (NumbersReviewSubmissionResponse) o;
        return Objects.equals(this.requestUuid, numbersReviewSubmissionResponse.requestUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestUuid);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersReviewSubmissionResponse {")
                .append(newLine)
                .append("    requestUuid: ")
                .append(toIndentedString(requestUuid))
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
