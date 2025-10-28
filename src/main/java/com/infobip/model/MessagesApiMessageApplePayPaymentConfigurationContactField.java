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
 * The list of shipping or contact information required from the customer to fulfill the order.
 */
public enum MessagesApiMessageApplePayPaymentConfigurationContactField {
    POSTAL_ADDRESS("POSTAL_ADDRESS"),
    EMAIL("EMAIL"),
    PHONE("PHONE"),
    NAME("NAME"),
    PHONETIC_NAME("PHONETIC_NAME");

    private final String value;

    MessagesApiMessageApplePayPaymentConfigurationContactField(String value) {
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
    public static MessagesApiMessageApplePayPaymentConfigurationContactField fromValue(String value) {
        for (MessagesApiMessageApplePayPaymentConfigurationContactField enumElement :
                MessagesApiMessageApplePayPaymentConfigurationContactField.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
