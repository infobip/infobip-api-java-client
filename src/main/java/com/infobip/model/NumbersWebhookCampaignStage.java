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
 * The new campaign registration.
 */
public enum NumbersWebhookCampaignStage {
    REGISTERED("REGISTERED"),
    REJECTED("REJECTED"),
    DEREGISTERED("DEREGISTERED"),
    SUBMITTED("SUBMITTED"),
    APPROVED_BY_INTERNAL_REVIEWER("APPROVED_BY_INTERNAL_REVIEWER");

    private final String value;

    NumbersWebhookCampaignStage(String value) {
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
    public static NumbersWebhookCampaignStage fromValue(String value) {
        for (NumbersWebhookCampaignStage enumElement : NumbersWebhookCampaignStage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
