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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Used to specify a time-window in which a response message is allowed to be sent. If not defined there is no limitation when message will be sent.
 */
public class ResourcesDeliveryTimeWindowResponse {

    private String from;

    private String to;

    private Set<ResourcesDayOfWeek> days = new LinkedHashSet<>();

    private ResourcesDeliveryTimeZoneResponse deliveryTimeZone;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Exact time of day in which the sending can start. Consists of hour and minute properties, both mandatory. Time is expressed in the UTC time zone. Formatted as &lt;code&gt;HH:mm&lt;/code&gt;.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link ResourcesDeliveryTimeWindowResponse instance}.
     */
    public ResourcesDeliveryTimeWindowResponse from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Exact time of day in which the sending can start. Consists of hour and minute properties, both mandatory. Time is expressed in the UTC time zone. Formatted as &lt;code&gt;HH:mm&lt;/code&gt;.
     * <p>
     * The field is required.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Exact time of day in which the sending can start. Consists of hour and minute properties, both mandatory. Time is expressed in the UTC time zone. Formatted as &lt;code&gt;HH:mm&lt;/code&gt;.
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Exact time of day in which the sending will end. Consists of an hour and minute properties, both mandatory. Time is expressed in the UTC time zone. Formatted as &lt;code&gt;HH:mm&lt;/code&gt;.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link ResourcesDeliveryTimeWindowResponse instance}.
     */
    public ResourcesDeliveryTimeWindowResponse to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Exact time of day in which the sending will end. Consists of an hour and minute properties, both mandatory. Time is expressed in the UTC time zone. Formatted as &lt;code&gt;HH:mm&lt;/code&gt;.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Exact time of day in which the sending will end. Consists of an hour and minute properties, both mandatory. Time is expressed in the UTC time zone. Formatted as &lt;code&gt;HH:mm&lt;/code&gt;.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days which are included in the delivery time window.
     * <p>
     * The field is required.
     *
     * @param days
     * @return This {@link ResourcesDeliveryTimeWindowResponse instance}.
     */
    public ResourcesDeliveryTimeWindowResponse days(Set<ResourcesDayOfWeek> days) {
        this.days = days;
        return this;
    }

    /**
     * Adds and item into days.
     * <p>
     * Field description:
     * Days which are included in the delivery time window.
     * <p>
     * The field is required.
     *
     * @param daysItem The item to be added to the list.
     * @return This {@link ResourcesDeliveryTimeWindowResponse instance}.
     */
    public ResourcesDeliveryTimeWindowResponse addDaysItem(ResourcesDayOfWeek daysItem) {
        if (this.days == null) {
            this.days = new LinkedHashSet<>();
        }
        this.days.add(daysItem);
        return this;
    }

    /**
     * Returns days.
     * <p>
     * Field description:
     * Days which are included in the delivery time window.
     * <p>
     * The field is required.
     *
     * @return days
     */
    @JsonProperty("days")
    public Set<ResourcesDayOfWeek> getDays() {
        return days;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days which are included in the delivery time window.
     * <p>
     * The field is required.
     *
     * @param days
     */
    @JsonProperty("days")
    public void setDays(Set<ResourcesDayOfWeek> days) {
        this.days = days;
    }

    /**
     * Sets deliveryTimeZone.
     * <p>
     * The field is required.
     *
     * @param deliveryTimeZone
     * @return This {@link ResourcesDeliveryTimeWindowResponse instance}.
     */
    public ResourcesDeliveryTimeWindowResponse deliveryTimeZone(ResourcesDeliveryTimeZoneResponse deliveryTimeZone) {
        this.deliveryTimeZone = deliveryTimeZone;
        return this;
    }

    /**
     * Returns deliveryTimeZone.
     * <p>
     * The field is required.
     *
     * @return deliveryTimeZone
     */
    @JsonProperty("deliveryTimeZone")
    public ResourcesDeliveryTimeZoneResponse getDeliveryTimeZone() {
        return deliveryTimeZone;
    }

    /**
     * Sets deliveryTimeZone.
     * <p>
     * The field is required.
     *
     * @param deliveryTimeZone
     */
    @JsonProperty("deliveryTimeZone")
    public void setDeliveryTimeZone(ResourcesDeliveryTimeZoneResponse deliveryTimeZone) {
        this.deliveryTimeZone = deliveryTimeZone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesDeliveryTimeWindowResponse resourcesDeliveryTimeWindowResponse =
                (ResourcesDeliveryTimeWindowResponse) o;
        return Objects.equals(this.from, resourcesDeliveryTimeWindowResponse.from)
                && Objects.equals(this.to, resourcesDeliveryTimeWindowResponse.to)
                && Objects.equals(this.days, resourcesDeliveryTimeWindowResponse.days)
                && Objects.equals(this.deliveryTimeZone, resourcesDeliveryTimeWindowResponse.deliveryTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, days, deliveryTimeZone);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesDeliveryTimeWindowResponse {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    days: ")
                .append(toIndentedString(days))
                .append(newLine)
                .append("    deliveryTimeZone: ")
                .append(toIndentedString(deliveryTimeZone))
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
