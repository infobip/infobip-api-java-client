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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallRoutingApplicationDestination model.
 */
public class CallRoutingApplicationDestination extends CallRoutingDestination {

    private CallRoutingApplication value;

    private List<DeliveryTimeWindow> allowedTimeWindows = null;

    /**
     * Constructs a new {@link CallRoutingApplicationDestination} instance.
     */
    public CallRoutingApplicationDestination() {
        super("APPLICATION");
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link CallRoutingApplicationDestination instance}.
     */
    public CallRoutingApplicationDestination value(CallRoutingApplication value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public CallRoutingApplication getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(CallRoutingApplication value) {
        this.value = value;
    }

    /**
     * Sets allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @param allowedTimeWindows
     * @return This {@link CallRoutingApplicationDestination instance}.
     */
    public CallRoutingApplicationDestination allowedTimeWindows(List<DeliveryTimeWindow> allowedTimeWindows) {
        this.allowedTimeWindows = allowedTimeWindows;
        return this;
    }

    /**
     * Adds and item into allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @param allowedTimeWindowsItem The item to be added to the list.
     * @return This {@link CallRoutingApplicationDestination instance}.
     */
    public CallRoutingApplicationDestination addAllowedTimeWindowsItem(DeliveryTimeWindow allowedTimeWindowsItem) {
        if (this.allowedTimeWindows == null) {
            this.allowedTimeWindows = new ArrayList<>();
        }
        this.allowedTimeWindows.add(allowedTimeWindowsItem);
        return this;
    }

    /**
     * Returns allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @return allowedTimeWindows
     */
    @JsonProperty("allowedTimeWindows")
    public List<DeliveryTimeWindow> getAllowedTimeWindows() {
        return allowedTimeWindows;
    }

    /**
     * Sets allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @param allowedTimeWindows
     */
    @JsonProperty("allowedTimeWindows")
    public void setAllowedTimeWindows(List<DeliveryTimeWindow> allowedTimeWindows) {
        this.allowedTimeWindows = allowedTimeWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingApplicationDestination callRoutingApplicationDestination = (CallRoutingApplicationDestination) o;
        return Objects.equals(this.value, callRoutingApplicationDestination.value)
                && Objects.equals(this.allowedTimeWindows, callRoutingApplicationDestination.allowedTimeWindows)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, allowedTimeWindows, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingApplicationDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
                .append(newLine)
                .append("    allowedTimeWindows: ")
                .append(toIndentedString(allowedTimeWindows))
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
