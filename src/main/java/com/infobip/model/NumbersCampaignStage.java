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
 * Represents NumbersCampaignStage enumeration.
 */
public enum NumbersCampaignStage {
    DRAFT("DRAFT"),
    SUBMITTED_FOR_REVIEW("SUBMITTED_FOR_REVIEW"),
    IN_REVIEW("IN_REVIEW"),
    UPDATE_REQUESTED_BY_INTERNAL_REVIEWER("UPDATE_REQUESTED_BY_INTERNAL_REVIEWER"),
    APPROVED_BY_INTERNAL_REVIEWER("APPROVED_BY_INTERNAL_REVIEWER"),
    SUBMITTED("SUBMITTED"),
    UPDATE_REQUESTED_BY_CARRIERS("UPDATE_REQUESTED_BY_CARRIERS"),
    REGISTERED("REGISTERED"),
    REJECTED("REJECTED"),
    ON_HOLD("ON_HOLD"),
    DEREGISTERED("DEREGISTERED"),
    REGISTERED_PENDING_UPDATE("REGISTERED_PENDING_UPDATE"),
    REGISTERED_PENDING_DEREGISTRATION("REGISTERED_PENDING_DEREGISTRATION"),
    ARCHIVED("ARCHIVED"),
    BLOCKED("BLOCKED"),
    SUSPENDED("SUSPENDED"),
    APPEALED("APPEALED"),
    IN_MIGRATION("IN_MIGRATION"),
    PAUSED("PAUSED");

    private final String value;

    NumbersCampaignStage(String value) {
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
    public static NumbersCampaignStage fromValue(String value) {
        for (NumbersCampaignStage enumElement : NumbersCampaignStage.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
