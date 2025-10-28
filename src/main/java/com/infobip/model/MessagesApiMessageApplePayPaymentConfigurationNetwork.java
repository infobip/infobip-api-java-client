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
 * An array of payment networks supported by the merchant. The array must include one or more of the following values: AMEX, DISCOVER, MASTERCARD, PRIVATE_LABEL or VISA.
 */
public enum MessagesApiMessageApplePayPaymentConfigurationNetwork {
    AMEX("AMEX"),
    CHINA_UNION_PAY("CHINA_UNION_PAY"),
    DISCOVER("DISCOVER"),
    ELECTRON("ELECTRON"),
    INTERAC("INTERAC"),
    MAESTRO("MAESTRO"),
    MASTERCARD("MASTERCARD"),
    PRIVATE_LABEL("PRIVATE_LABEL"),
    VISA("VISA");

    private final String value;

    MessagesApiMessageApplePayPaymentConfigurationNetwork(String value) {
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
    public static MessagesApiMessageApplePayPaymentConfigurationNetwork fromValue(String value) {
        for (MessagesApiMessageApplePayPaymentConfigurationNetwork enumElement :
                MessagesApiMessageApplePayPaymentConfigurationNetwork.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
