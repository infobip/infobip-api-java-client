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
 * Status group name that describes which category the status code belongs to, i.e., [PENDING](https://www.infobip.com/docs/essentials/response-status-and-error-codes#pending-general-status-codes), [UNDELIVERABLE](https://www.infobip.com/docs/essentials/response-status-and-error-codes#undeliverable-general-status-codes), [DELIVERED](https://www.infobip.com/docs/essentials/response-status-and-error-codes#delivered-general-status-codes), [EXPIRED](https://www.infobip.com/docs/essentials/response-status-and-error-codes#expired-general-status-codes), [REJECTED](https://www.infobip.com/docs/essentials/response-status-and-error-codes#rejected-general-status-codes).
 */
public enum SmsMessageGeneralStatus {
    ACCEPTED("ACCEPTED"),
    PENDING("PENDING"),
    UNDELIVERABLE("UNDELIVERABLE"),
    DELIVERED("DELIVERED"),
    EXPIRED("EXPIRED"),
    REJECTED("REJECTED");

    private final String value;

    SmsMessageGeneralStatus(String value) {
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
    public static SmsMessageGeneralStatus fromValue(String value) {
        for (SmsMessageGeneralStatus enumElement : SmsMessageGeneralStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
