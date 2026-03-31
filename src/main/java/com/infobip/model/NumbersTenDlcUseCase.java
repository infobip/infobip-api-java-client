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
 * The use cases for this campaign.
 */
public enum NumbersTenDlcUseCase {
    ALERTS("ALERTS"),
    CHAT("CHAT"),
    DONATION("DONATION"),
    EDUCATION("EDUCATION"),
    FRAUD_ALERTS("FRAUD_ALERTS"),
    PROMOTIONAL_MARKETING("PROMOTIONAL_MARKETING"),
    PUBLIC_SERVICE_ANNOUNCEMENT("PUBLIC_SERVICE_ANNOUNCEMENT"),
    TWO_FACTOR_AUTH("TWO_FACTOR_AUTH"),
    VOTING_POLLING("VOTING_POLLING"),
    POLITICAL("POLITICAL"),
    M2M("M2M");

    private final String value;

    NumbersTenDlcUseCase(String value) {
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
    public static NumbersTenDlcUseCase fromValue(String value) {
        for (NumbersTenDlcUseCase enumElement : NumbersTenDlcUseCase.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
