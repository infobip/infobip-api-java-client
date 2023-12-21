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
 * Business vertical.
 */
public enum WhatsAppBusinessVertical {
    AUTOMOTIVE("AUTOMOTIVE"),
    BEAUTY_AND_SPA_AND_SALON("BEAUTY_AND_SPA_AND_SALON"),
    CLOTHING_AND_APPAREL("CLOTHING_AND_APPAREL"),
    EDUCATION("EDUCATION"),
    ENTERTAINMENT("ENTERTAINMENT"),
    EVENT_PLANNING_AND_SERVICE("EVENT_PLANNING_AND_SERVICE"),
    FINANCE_AND_BANKING("FINANCE_AND_BANKING"),
    FOOD_AND_GROCERY("FOOD_AND_GROCERY"),
    PUBLIC_SERVICE("PUBLIC_SERVICE"),
    HOTEL_AND_LODGING("HOTEL_AND_LODGING"),
    MEDICAL_AND_HEALTH("MEDICAL_AND_HEALTH"),
    NON_PROFIT("NON_PROFIT"),
    PROFESSIONAL_SERVICES("PROFESSIONAL_SERVICES"),
    SHOPPING_AND_RETAIL("SHOPPING_AND_RETAIL"),
    TRAVEL_AND_TRANSPORTATION("TRAVEL_AND_TRANSPORTATION"),
    RESTAURANT("RESTAURANT"),
    OTHER("OTHER"),
    UNKNOWN("UNKNOWN");

    private final String value;

    WhatsAppBusinessVertical(String value) {
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
    public static WhatsAppBusinessVertical fromValue(String value) {
        for (WhatsAppBusinessVertical enumElement : WhatsAppBusinessVertical.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
