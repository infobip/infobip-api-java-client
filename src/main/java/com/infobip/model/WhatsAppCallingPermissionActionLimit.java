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
 * A list of time-bound restrictions for the given action.
 */
public class WhatsAppCallingPermissionActionLimit {

    private String timePeriod;

    private Integer maxAllowed;

    private Integer currentUsage;

    private OffsetDateTime limitExpirationTime;

    /**
     * Sets timePeriod.
     * <p>
     * Field description:
     * Duration for which the limitation is applied in ISO 8601 format.
     * <p>
     * The field is required.
     *
     * @param timePeriod
     * @return This {@link WhatsAppCallingPermissionActionLimit instance}.
     */
    public WhatsAppCallingPermissionActionLimit timePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Returns timePeriod.
     * <p>
     * Field description:
     * Duration for which the limitation is applied in ISO 8601 format.
     * <p>
     * The field is required.
     *
     * @return timePeriod
     */
    @JsonProperty("timePeriod")
    public String getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets timePeriod.
     * <p>
     * Field description:
     * Duration for which the limitation is applied in ISO 8601 format.
     * <p>
     * The field is required.
     *
     * @param timePeriod
     */
    @JsonProperty("timePeriod")
    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * Sets maxAllowed.
     * <p>
     * Field description:
     * The maximum number of actions allowed within the specified time period.
     * <p>
     * The field is required.
     *
     * @param maxAllowed
     * @return This {@link WhatsAppCallingPermissionActionLimit instance}.
     */
    public WhatsAppCallingPermissionActionLimit maxAllowed(Integer maxAllowed) {
        this.maxAllowed = maxAllowed;
        return this;
    }

    /**
     * Returns maxAllowed.
     * <p>
     * Field description:
     * The maximum number of actions allowed within the specified time period.
     * <p>
     * The field is required.
     *
     * @return maxAllowed
     */
    @JsonProperty("maxAllowed")
    public Integer getMaxAllowed() {
        return maxAllowed;
    }

    /**
     * Sets maxAllowed.
     * <p>
     * Field description:
     * The maximum number of actions allowed within the specified time period.
     * <p>
     * The field is required.
     *
     * @param maxAllowed
     */
    @JsonProperty("maxAllowed")
    public void setMaxAllowed(Integer maxAllowed) {
        this.maxAllowed = maxAllowed;
    }

    /**
     * Sets currentUsage.
     * <p>
     * Field description:
     * The current number of actions the business has taken within the specified time period.
     * <p>
     * The field is required.
     *
     * @param currentUsage
     * @return This {@link WhatsAppCallingPermissionActionLimit instance}.
     */
    public WhatsAppCallingPermissionActionLimit currentUsage(Integer currentUsage) {
        this.currentUsage = currentUsage;
        return this;
    }

    /**
     * Returns currentUsage.
     * <p>
     * Field description:
     * The current number of actions the business has taken within the specified time period.
     * <p>
     * The field is required.
     *
     * @return currentUsage
     */
    @JsonProperty("currentUsage")
    public Integer getCurrentUsage() {
        return currentUsage;
    }

    /**
     * Sets currentUsage.
     * <p>
     * Field description:
     * The current number of actions the business has taken within the specified time period.
     * <p>
     * The field is required.
     *
     * @param currentUsage
     */
    @JsonProperty("currentUsage")
    public void setCurrentUsage(Integer currentUsage) {
        this.currentUsage = currentUsage;
    }

    /**
     * Sets limitExpirationTime.
     * <p>
     * Field description:
     * Time at which the limit will expire.
     *
     * @param limitExpirationTime
     * @return This {@link WhatsAppCallingPermissionActionLimit instance}.
     */
    public WhatsAppCallingPermissionActionLimit limitExpirationTime(OffsetDateTime limitExpirationTime) {
        this.limitExpirationTime = limitExpirationTime;
        return this;
    }

    /**
     * Returns limitExpirationTime.
     * <p>
     * Field description:
     * Time at which the limit will expire.
     *
     * @return limitExpirationTime
     */
    @JsonProperty("limitExpirationTime")
    public OffsetDateTime getLimitExpirationTime() {
        return limitExpirationTime;
    }

    /**
     * Sets limitExpirationTime.
     * <p>
     * Field description:
     * Time at which the limit will expire.
     *
     * @param limitExpirationTime
     */
    @JsonProperty("limitExpirationTime")
    public void setLimitExpirationTime(OffsetDateTime limitExpirationTime) {
        this.limitExpirationTime = limitExpirationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppCallingPermissionActionLimit whatsAppCallingPermissionActionLimit =
                (WhatsAppCallingPermissionActionLimit) o;
        return Objects.equals(this.timePeriod, whatsAppCallingPermissionActionLimit.timePeriod)
                && Objects.equals(this.maxAllowed, whatsAppCallingPermissionActionLimit.maxAllowed)
                && Objects.equals(this.currentUsage, whatsAppCallingPermissionActionLimit.currentUsage)
                && Objects.equals(this.limitExpirationTime, whatsAppCallingPermissionActionLimit.limitExpirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timePeriod, maxAllowed, currentUsage, limitExpirationTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCallingPermissionActionLimit {")
                .append(newLine)
                .append("    timePeriod: ")
                .append(toIndentedString(timePeriod))
                .append(newLine)
                .append("    maxAllowed: ")
                .append(toIndentedString(maxAllowed))
                .append(newLine)
                .append("    currentUsage: ")
                .append(toIndentedString(currentUsage))
                .append(newLine)
                .append("    limitExpirationTime: ")
                .append(toIndentedString(limitExpirationTime))
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
