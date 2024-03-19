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
 * Indicates the source of the referral. Takes the value of &#x60;UNKNOWN&#x60; if there&#39;s no value or the value is different from &#x60;AD&#x60; or &#x60;POST&#x60;.
 */
public enum WhatsAppWebhookReferralSourceType {
    AD("AD"),
    POST("POST"),
    UNKNOWN("UNKNOWN");

    private final String value;

    WhatsAppWebhookReferralSourceType(String value) {
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
    public static WhatsAppWebhookReferralSourceType fromValue(String value) {
        for (WhatsAppWebhookReferralSourceType enumElement : WhatsAppWebhookReferralSourceType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
