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

/**
 * Represents NumbersAppealData model.
 */
public class NumbersAppealData {

    private String appealReason;

    private OffsetDateTime appealDate;

    /**
     * Sets appealReason.
     * <p>
     * Field description:
     * The reason for the appeal.
     *
     * @param appealReason
     * @return This {@link NumbersAppealData instance}.
     */
    public NumbersAppealData appealReason(String appealReason) {
        this.appealReason = appealReason;
        return this;
    }

    /**
     * Returns appealReason.
     * <p>
     * Field description:
     * The reason for the appeal.
     *
     * @return appealReason
     */
    @JsonProperty("appealReason")
    public String getAppealReason() {
        return appealReason;
    }

    /**
     * Sets appealReason.
     * <p>
     * Field description:
     * The reason for the appeal.
     *
     * @param appealReason
     */
    @JsonProperty("appealReason")
    public void setAppealReason(String appealReason) {
        this.appealReason = appealReason;
    }

    /**
     * Sets appealDate.
     * <p>
     * Field description:
     * The time of the appeal.
     *
     * @param appealDate
     * @return This {@link NumbersAppealData instance}.
     */
    public NumbersAppealData appealDate(OffsetDateTime appealDate) {
        this.appealDate = appealDate;
        return this;
    }

    /**
     * Returns appealDate.
     * <p>
     * Field description:
     * The time of the appeal.
     *
     * @return appealDate
     */
    @JsonProperty("appealDate")
    public OffsetDateTime getAppealDate() {
        return appealDate;
    }

    /**
     * Sets appealDate.
     * <p>
     * Field description:
     * The time of the appeal.
     *
     * @param appealDate
     */
    @JsonProperty("appealDate")
    public void setAppealDate(OffsetDateTime appealDate) {
        this.appealDate = appealDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersAppealData numbersAppealData = (NumbersAppealData) o;
        return Objects.equals(this.appealReason, numbersAppealData.appealReason)
                && Objects.equals(this.appealDate, numbersAppealData.appealDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appealReason, appealDate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersAppealData {")
                .append(newLine)
                .append("    appealReason: ")
                .append(toIndentedString(appealReason))
                .append(newLine)
                .append("    appealDate: ")
                .append(toIndentedString(appealDate))
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
