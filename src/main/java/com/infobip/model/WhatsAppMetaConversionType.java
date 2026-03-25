/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the conversion. Can be &#x60;PURCHASE&#x60; or &#x60;LEAD_SUBMITTED&#x60;.
 */
public enum WhatsAppMetaConversionType {
    PURCHASE("PURCHASE"),
    LEAD_SUBMITTED("LEAD_SUBMITTED"),
    INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
    ADD_TO_CART("ADD_TO_CART"),
    VIEW_CONTENT("VIEW_CONTENT"),
    ORDER_CREATED("ORDER_CREATED"),
    ORDER_SHIPPED("ORDER_SHIPPED"),
    ORDER_DELIVERED("ORDER_DELIVERED"),
    ORDER_CANCELED("ORDER_CANCELED"),
    ORDER_RETURNED("ORDER_RETURNED"),
    CART_ABANDONED("CART_ABANDONED"),
    QUALIFIED_LEAD("QUALIFIED_LEAD"),
    RATING_PROVIDED("RATING_PROVIDED"),
    REVIEW_PROVIDED("REVIEW_PROVIDED");

    private final String value;

    WhatsAppMetaConversionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static WhatsAppMetaConversionType fromValue(String value) {
        for (WhatsAppMetaConversionType enumElement : WhatsAppMetaConversionType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
