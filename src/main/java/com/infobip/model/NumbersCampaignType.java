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
 * Represents NumbersCampaignType enumeration.
 */
public enum NumbersCampaignType {
    TEN_DIGIT_LONG_CODE("TEN_DIGIT_LONG_CODE"),
    EXTERNAL_TEN_DIGIT_LONG_CODE("EXTERNAL_TEN_DIGIT_LONG_CODE"),
    SHORT_CODE("SHORT_CODE"),
    DCA2_TEN_DIGIT_LONG_CODE("DCA2_TEN_DIGIT_LONG_CODE"),
    TOLL_FREE_NUMBER("TOLL_FREE_NUMBER"),
    TOLL_FREE_UNIFIED_NUMBER("TOLL_FREE_UNIFIED_NUMBER"),
    TOLL_FREE_EXTERNALLY_VERIFIED("TOLL_FREE_EXTERNALLY_VERIFIED");

    private final String value;

    NumbersCampaignType(String value) {
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
    public static NumbersCampaignType fromValue(String value) {
        for (NumbersCampaignType enumElement : NumbersCampaignType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
