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
 * The network a campaign is submitted to.
 */
public enum NumbersCampaignRegistrar {
    CAMPAIGN_REGISTRY("CAMPAIGN_REGISTRY"),
    T_MOBILE("T_MOBILE"),
    ATT("ATT"),
    VERIZON("VERIZON"),
    CLEARSKY("CLEARSKY"),
    US_CELLULAR_SMS("US_CELLULAR_SMS"),
    INTEROP("INTEROP"),
    GOOGLE_VOICE("GOOGLE_VOICE"),
    US_CELLULAR_MMS("US_CELLULAR_MMS"),
    ZIPWHIP("ZIPWHIP");

    private final String value;

    NumbersCampaignRegistrar(String value) {
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
    public static NumbersCampaignRegistrar fromValue(String value) {
        for (NumbersCampaignRegistrar enumElement : NumbersCampaignRegistrar.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
