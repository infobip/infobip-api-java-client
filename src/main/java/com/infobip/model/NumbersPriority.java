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
 * Represents NumbersPriority model.
 */
public class NumbersPriority {

    private UUID priorityId;

    private Integer dailySubmitLimit;

    private NumbersPriorityTimeData reviewTime;

    private NumbersPriorityType priorityType;

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * The ID for the campaign priority.
     *
     * @param priorityId
     * @return This {@link NumbersPriority instance}.
     */
    public NumbersPriority priorityId(UUID priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /**
     * Returns priorityId.
     * <p>
     * Field description:
     * The ID for the campaign priority.
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
     * The ID for the campaign priority.
     *
     * @param priorityId
     */
    @JsonProperty("priorityId")
    public void setPriorityId(UUID priorityId) {
        this.priorityId = priorityId;
    }

    /**
     * Sets dailySubmitLimit.
     * <p>
     * Field description:
     * The limit on how many campaigns you can submit a day with this priority.
     *
     * @param dailySubmitLimit
     * @return This {@link NumbersPriority instance}.
     */
    public NumbersPriority dailySubmitLimit(Integer dailySubmitLimit) {
        this.dailySubmitLimit = dailySubmitLimit;
        return this;
    }

    /**
     * Returns dailySubmitLimit.
     * <p>
     * Field description:
     * The limit on how many campaigns you can submit a day with this priority.
     *
     * @return dailySubmitLimit
     */
    @JsonProperty("dailySubmitLimit")
    public Integer getDailySubmitLimit() {
        return dailySubmitLimit;
    }

    /**
     * Sets dailySubmitLimit.
     * <p>
     * Field description:
     * The limit on how many campaigns you can submit a day with this priority.
     *
     * @param dailySubmitLimit
     */
    @JsonProperty("dailySubmitLimit")
    public void setDailySubmitLimit(Integer dailySubmitLimit) {
        this.dailySubmitLimit = dailySubmitLimit;
    }

    /**
     * Sets reviewTime.
     *
     * @param reviewTime
     * @return This {@link NumbersPriority instance}.
     */
    public NumbersPriority reviewTime(NumbersPriorityTimeData reviewTime) {
        this.reviewTime = reviewTime;
        return this;
    }

    /**
     * Returns reviewTime.
     *
     * @return reviewTime
     */
    @JsonProperty("reviewTime")
    public NumbersPriorityTimeData getReviewTime() {
        return reviewTime;
    }

    /**
     * Sets reviewTime.
     *
     * @param reviewTime
     */
    @JsonProperty("reviewTime")
    public void setReviewTime(NumbersPriorityTimeData reviewTime) {
        this.reviewTime = reviewTime;
    }

    /**
     * Sets priorityType.
     *
     * @param priorityType
     * @return This {@link NumbersPriority instance}.
     */
    public NumbersPriority priorityType(NumbersPriorityType priorityType) {
        this.priorityType = priorityType;
        return this;
    }

    /**
     * Returns priorityType.
     *
     * @return priorityType
     */
    @JsonProperty("priorityType")
    public NumbersPriorityType getPriorityType() {
        return priorityType;
    }

    /**
     * Sets priorityType.
     *
     * @param priorityType
     */
    @JsonProperty("priorityType")
    public void setPriorityType(NumbersPriorityType priorityType) {
        this.priorityType = priorityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersPriority numbersPriority = (NumbersPriority) o;
        return Objects.equals(this.priorityId, numbersPriority.priorityId)
                && Objects.equals(this.dailySubmitLimit, numbersPriority.dailySubmitLimit)
                && Objects.equals(this.reviewTime, numbersPriority.reviewTime)
                && Objects.equals(this.priorityType, numbersPriority.priorityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priorityId, dailySubmitLimit, reviewTime, priorityType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersPriority {")
                .append(newLine)
                .append("    priorityId: ")
                .append(toIndentedString(priorityId))
                .append(newLine)
                .append("    dailySubmitLimit: ")
                .append(toIndentedString(dailySubmitLimit))
                .append(newLine)
                .append("    reviewTime: ")
                .append(toIndentedString(reviewTime))
                .append(newLine)
                .append("    priorityType: ")
                .append(toIndentedString(priorityType))
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
