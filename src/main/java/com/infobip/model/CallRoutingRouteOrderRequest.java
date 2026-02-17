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
 * Route request object.
 */
public class CallRoutingRouteOrderRequest {

    private Integer order;

    /**
     * Sets order.
     * <p>
     * Field description:
     * Route order.
     * <p>
     * The field is required.
     *
     * @param order
     * @return This {@link CallRoutingRouteOrderRequest instance}.
     */
    public CallRoutingRouteOrderRequest order(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Returns order.
     * <p>
     * Field description:
     * Route order.
     * <p>
     * The field is required.
     *
     * @return order
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets order.
     * <p>
     * Field description:
     * Route order.
     * <p>
     * The field is required.
     *
     * @param order
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRouteOrderRequest callRoutingRouteOrderRequest = (CallRoutingRouteOrderRequest) o;
        return Objects.equals(this.order, callRoutingRouteOrderRequest.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRouteOrderRequest {")
                .append(newLine)
                .append("    order: ")
                .append(toIndentedString(order))
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
