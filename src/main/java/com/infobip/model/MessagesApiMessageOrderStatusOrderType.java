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
 * Type of the order payment.
 */
public enum MessagesApiMessageOrderStatusOrderType {
    UPI_PAYU("UPI_PAYU"),
    BRAZIL("BRAZIL"),
    BRAZIL_PIX_DC("BRAZIL_PIX_DC"),
    PG_PAYU("PG_PAYU"),
    PG_RAZORPAY("PG_RAZORPAY"),
    BRAZIL_LINK("BRAZIL_LINK"),
    BRAZIL_BOLETO("BRAZIL_BOLETO"),
    UPI_INTENT("UPI_INTENT");

    private final String value;

    MessagesApiMessageOrderStatusOrderType(String value) {
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
    public static MessagesApiMessageOrderStatusOrderType fromValue(String value) {
        for (MessagesApiMessageOrderStatusOrderType enumElement : MessagesApiMessageOrderStatusOrderType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
