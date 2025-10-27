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
 * Represents MessagesApiMessagePaymentConfigurationType enumeration.
 */
public enum MessagesApiMessagePaymentConfigurationType {
    PG_PAYU("PG_PAYU"),
    PG_RAZORPAY("PG_RAZORPAY"),
    UPI_PAYU("UPI_PAYU"),
    BRAZIL("BRAZIL"),
    BRAZIL_PIX_DC("BRAZIL_PIX_DC"),
    BRAZIL_LINK("BRAZIL_LINK"),
    BRAZIL_BOLETO("BRAZIL_BOLETO"),
    UPI_INTENT("UPI_INTENT"),
    APPLE_PAY("APPLE_PAY");

    private final String value;

    MessagesApiMessagePaymentConfigurationType(String value) {
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
    public static MessagesApiMessagePaymentConfigurationType fromValue(String value) {
        for (MessagesApiMessagePaymentConfigurationType enumElement :
                MessagesApiMessagePaymentConfigurationType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
