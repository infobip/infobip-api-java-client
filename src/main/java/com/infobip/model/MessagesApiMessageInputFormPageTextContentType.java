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
 * Value representing the keyboard and system information about the expected semantic meaning for the content that users enter.
 */
public enum MessagesApiMessageInputFormPageTextContentType {
    NAME_PREFIX("NAME_PREFIX"),
    GIVEN_NAME("GIVEN_NAME"),
    MIDDLE_NAME("MIDDLE_NAME"),
    FAMILY_NAME("FAMILY_NAME"),
    NAME_SUFFIX("NAME_SUFFIX"),
    NICKNAME("NICKNAME"),
    JOB_TITLE("JOB_TITLE"),
    ORGANIZATION_NAME("ORGANIZATION_NAME"),
    LOCATION("LOCATION"),
    FULL_STREET_ADDRESS("FULL_STREET_ADDRESS"),
    STREET_ADDRESS_LINE_1("STREET_ADDRESS_LINE_1"),
    STREET_ADDRESS_LINE_2("STREET_ADDRESS_LINE_2"),
    ADDRESS_CITY("ADDRESS_CITY"),
    ADDRESS_STATE("ADDRESS_STATE"),
    ADDRESS_CITY_STATE("ADDRESS_CITY_STATE"),
    SUBLOCALITY("SUBLOCALITY"),
    COUNTRY_NAME("COUNTRY_NAME"),
    POSTAL_CODE("POSTAL_CODE"),
    PHONE_NUMBER("PHONE_NUMBER"),
    EMAIL_ADDRESS("EMAIL_ADDRESS"),
    URL("URL"),
    CREDIT_CARD_NUMBER("CREDIT_CARD_NUMBER"),
    USERNAME("USERNAME"),
    PASSWORD("PASSWORD"),
    NEW_PASSWORD("NEW_PASSWORD"),
    ONE_TIME_CODE("ONE_TIME_CODE");

    private final String value;

    MessagesApiMessageInputFormPageTextContentType(String value) {
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
    public static MessagesApiMessageInputFormPageTextContentType fromValue(String value) {
        for (MessagesApiMessageInputFormPageTextContentType enumElement :
                MessagesApiMessageInputFormPageTextContentType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
