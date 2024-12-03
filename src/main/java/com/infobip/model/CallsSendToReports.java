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
 * Choose if you want to show DTMF inputs in Voice reports and logs. Options are: ALWAYS (always send - default value), MASKED (send masked - xxxx will be shown in reports and logs), NEVER (don&#39;t send - DTMF inputs will not be shown in reports and logs).
 */
public enum CallsSendToReports {
    ALWAYS("ALWAYS"),
    MASKED("MASKED"),
    NEVER("NEVER");

    private final String value;

    CallsSendToReports(String value) {
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
    public static CallsSendToReports fromValue(String value) {
        for (CallsSendToReports enumElement : CallsSendToReports.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
