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
 * Template order status. Should be defined, only if template contains order status.
 */
public class WhatsAppTemplateOrderStatusContent {

    private List<WhatsAppOrderStatusContent> orderStatuses = new ArrayList<>();

    /**
     * Sets orderStatuses.
     * <p>
     * Field description:
     * Array of order statuses information.
     * <p>
     * The field is required.
     *
     * @param orderStatuses
     * @return This {@link WhatsAppTemplateOrderStatusContent instance}.
     */
    public WhatsAppTemplateOrderStatusContent orderStatuses(List<WhatsAppOrderStatusContent> orderStatuses) {
        this.orderStatuses = orderStatuses;
        return this;
    }

    /**
     * Adds and item into orderStatuses.
     * <p>
     * Field description:
     * Array of order statuses information.
     * <p>
     * The field is required.
     *
     * @param orderStatusesItem The item to be added to the list.
     * @return This {@link WhatsAppTemplateOrderStatusContent instance}.
     */
    public WhatsAppTemplateOrderStatusContent addOrderStatusesItem(WhatsAppOrderStatusContent orderStatusesItem) {
        if (this.orderStatuses == null) {
            this.orderStatuses = new ArrayList<>();
        }
        this.orderStatuses.add(orderStatusesItem);
        return this;
    }

    /**
     * Returns orderStatuses.
     * <p>
     * Field description:
     * Array of order statuses information.
     * <p>
     * The field is required.
     *
     * @return orderStatuses
     */
    @JsonProperty("orderStatuses")
    public List<WhatsAppOrderStatusContent> getOrderStatuses() {
        return orderStatuses;
    }

    /**
     * Sets orderStatuses.
     * <p>
     * Field description:
     * Array of order statuses information.
     * <p>
     * The field is required.
     *
     * @param orderStatuses
     */
    @JsonProperty("orderStatuses")
    public void setOrderStatuses(List<WhatsAppOrderStatusContent> orderStatuses) {
        this.orderStatuses = orderStatuses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateOrderStatusContent whatsAppTemplateOrderStatusContent = (WhatsAppTemplateOrderStatusContent) o;
        return Objects.equals(this.orderStatuses, whatsAppTemplateOrderStatusContent.orderStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderStatuses);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateOrderStatusContent {")
                .append(newLine)
                .append("    orderStatuses: ")
                .append(toIndentedString(orderStatuses))
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
