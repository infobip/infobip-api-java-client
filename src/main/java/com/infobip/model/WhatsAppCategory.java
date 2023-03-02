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
 * Category of the template.
 */
public enum WhatsAppCategory {
    ACCOUNT_UPDATE("ACCOUNT_UPDATE"),
    PAYMENT_UPDATE("PAYMENT_UPDATE"),
    PERSONAL_FINANCE_UPDATE("PERSONAL_FINANCE_UPDATE"),
    SHIPPING_UPDATE("SHIPPING_UPDATE"),
    RESERVATION_UPDATE("RESERVATION_UPDATE"),
    ISSUE_RESOLUTION("ISSUE_RESOLUTION"),
    APPOINTMENT_UPDATE("APPOINTMENT_UPDATE"),
    TRANSPORTATION_UPDATE("TRANSPORTATION_UPDATE"),
    TICKET_UPDATE("TICKET_UPDATE"),
    ALERT_UPDATE("ALERT_UPDATE"),
    AUTO_REPLY("AUTO_REPLY"),
    MARKETING("MARKETING"),
    TRANSACTIONAL("TRANSACTIONAL"),
    OTP("OTP");

    private final String value;

    WhatsAppCategory(String value) {
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
    public static WhatsAppCategory fromValue(String value) {
        for (WhatsAppCategory enumElement : WhatsAppCategory.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
