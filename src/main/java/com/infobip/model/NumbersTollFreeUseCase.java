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
 * Represents NumbersTollFreeUseCase enumeration.
 */
public enum NumbersTollFreeUseCase {
    TWO_FA("TWO_FA"),
    APP_NOTIFICATIONS("APP_NOTIFICATIONS"),
    APPOINTMENTS("APPOINTMENTS"),
    AUCTIONS("AUCTIONS"),
    AUTO_DEALERSHIP_SERVICES("AUTO_DEALERSHIP_SERVICES"),
    BANKING("BANKING"),
    BILLING("BILLING"),
    BOOKING_CONFIRMATIONS("BOOKING_CONFIRMATIONS"),
    BUSINESS_UPDATES("BUSINESS_UPDATES"),
    COVID_19_ALERTS("COVID_19_ALERTS"),
    CAREER_TRAINING("CAREER_TRAINING"),
    CHATBOT("CHATBOT"),
    CONVERSATIONAL_ALERTS("CONVERSATIONAL_ALERTS"),
    COURIER_SERVICES_DELIVERIES("COURIER_SERVICES_DELIVERIES"),
    EDUCATIONAL("EDUCATIONAL"),
    EMERGENCY_ALERTS("EMERGENCY_ALERTS"),
    EMPLOYEE_ALERTS_NOTIFICATIONS("EMPLOYEE_ALERTS_NOTIFICATIONS"),
    EVENTS_PLANNING("EVENTS_PLANNING"),
    FINANCIAL_SERVICES("FINANCIAL_SERVICES"),
    FRAUD_ALERTS("FRAUD_ALERTS"),
    FUNDRAISING("FUNDRAISING"),
    GENERAL_MARKETING("GENERAL_MARKETING"),
    HR_STAFFING("HR_STAFFING"),
    HEALTHCARE("HEALTHCARE"),
    HOUSING_COMMUNITY_UPDATES("HOUSING_COMMUNITY_UPDATES"),
    INSURANCE_SERVICES("INSURANCE_SERVICES"),
    JOB_ALERTS("JOB_ALERTS"),
    LEGAL_SERVICES("LEGAL_SERVICES"),
    MIXED("MIXED"),
    MOTIVATIONAL_REMINDERS("MOTIVATIONAL_REMINDERS"),
    NOTARY_NOTIFICATIONS("NOTARY_NOTIFICATIONS"),
    NOTIFICATIONS("NOTIFICATIONS"),
    ORDER_NOTIFICATIONS("ORDER_NOTIFICATIONS"),
    POLITICAL("POLITICAL"),
    PUBLIC_WORKS("PUBLIC_WORKS"),
    REAL_ESTATE_SERVICES("REAL_ESTATE_SERVICES"),
    RECEIPT_NOTIFICATIONS("RECEIPT_NOTIFICATIONS"),
    RELIGIOUS_SERVICES("RELIGIOUS_SERVICES"),
    REPAIR_DIAGNOSTICS_ALERTS("REPAIR_DIAGNOSTICS_ALERTS"),
    REWARDS_PROGRAM("REWARDS_PROGRAM"),
    SURVEYS("SURVEYS"),
    SYSTEM_ALERTS("SYSTEM_ALERTS"),
    WAITLIST_ALERTS("WAITLIST_ALERTS"),
    WEBINAR_REMINDERS("WEBINAR_REMINDERS"),
    WORKSHOP_ALERTS("WORKSHOP_ALERTS");

    private final String value;

    NumbersTollFreeUseCase(String value) {
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
    public static NumbersTollFreeUseCase fromValue(String value) {
        for (NumbersTollFreeUseCase enumElement : NumbersTollFreeUseCase.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
