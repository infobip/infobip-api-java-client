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
 * The vertical in which the brand operates.
 */
public enum NumbersVertical {
    AGRICULTURE("AGRICULTURE"),
    CONSTRUCTION_AND_MATERIALS("CONSTRUCTION_AND_MATERIALS"),
    EDUCATION("EDUCATION"),
    ENERGY_AND_UTILITIES("ENERGY_AND_UTILITIES"),
    ENTERTAINMENT("ENTERTAINMENT"),
    FINANCIAL_SERVICES("FINANCIAL_SERVICES"),
    GAMBLING_AND_LOTTERY("GAMBLING_AND_LOTTERY"),
    HEALTHCARE_AND_LIFESCIENCES("HEALTHCARE_AND_LIFESCIENCES"),
    HOSPITALITY("HOSPITALITY"),
    INFORMATION_TECHNOLOGY_SERVICES("INFORMATION_TECHNOLOGY_SERVICES"),
    INSURANCE("INSURANCE"),
    MANUFACTURING("MANUFACTURING"),
    MASS_MEDIA_AND_COMMUNICATION("MASS_MEDIA_AND_COMMUNICATION"),
    NON_PROFIT_ORGANIZATION("NON_PROFIT_ORGANIZATION"),
    PUBLIC_SECTOR("PUBLIC_SECTOR"),
    REAL_ESTATE("REAL_ESTATE"),
    RETAIL_AND_CONSUMER_PRODUCTS("RETAIL_AND_CONSUMER_PRODUCTS"),
    PROFESSIONAL_SERVICES("PROFESSIONAL_SERVICES"),
    HUMAN_RESOURCES_STAFFING_RECRUITMENT("HUMAN_RESOURCES_STAFFING_RECRUITMENT"),
    TRANSPORTATION_LOGISTICS("TRANSPORTATION_LOGISTICS"),
    POSTAL_DELIVERY("POSTAL_DELIVERY"),
    LEGAL("LEGAL"),
    POLITICAL("POLITICAL");

    private final String value;

    NumbersVertical(String value) {
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
    public static NumbersVertical fromValue(String value) {
        for (NumbersVertical enumElement : NumbersVertical.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
