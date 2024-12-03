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
 * Genesys cloud region.
 */
public enum CallsGenesysCloudRegion {
    NA_US_EAST_1("NA_US_EAST_1"),
    NA_US_EAST_2("NA_US_EAST_2"),
    NA_US_WEST_2("NA_US_WEST_2"),
    CA_CENTRAL_1("CA_CENTRAL_1"),
    SA_EAST_1("SA_EAST_1"),
    EU_CENTRAL_1("EU_CENTRAL_1"),
    EU_CENTRAL_2("EU_CENTRAL_2"),
    EU_WEST_1("EU_WEST_1"),
    EU_WEST_2("EU_WEST_2"),
    ME_CENTRAL_1("ME_CENTRAL_1"),
    AP_SOUTH_1("AP_SOUTH_1"),
    AP_NORTHEAST_3("AP_NORTHEAST_3"),
    AP_NORTHEAST_2("AP_NORTHEAST_2"),
    AP_SOUTHEAST_2("AP_SOUTHEAST_2"),
    AP_NORTHEAST_1("AP_NORTHEAST_1");

    private final String value;

    CallsGenesysCloudRegion(String value) {
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
    public static CallsGenesysCloudRegion fromValue(String value) {
        for (CallsGenesysCloudRegion enumElement : CallsGenesysCloudRegion.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
