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
 * An array of payment capabilities supported by the merchant. The array must include 3DS.
 */
public enum MessagesApiMessageApplePayPaymentConfigurationMerchantCapability {
    _3DS("3DS"),
    CREDIT("CREDIT"),
    DEBIT("DEBIT"),
    EMV("EMV");

    private final String value;

    MessagesApiMessageApplePayPaymentConfigurationMerchantCapability(String value) {
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
    public static MessagesApiMessageApplePayPaymentConfigurationMerchantCapability fromValue(String value) {
        for (MessagesApiMessageApplePayPaymentConfigurationMerchantCapability enumElement :
                MessagesApiMessageApplePayPaymentConfigurationMerchantCapability.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
