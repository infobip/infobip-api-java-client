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
 * Type of selection.
 */
public enum MessagesApiWebhookEventFormSelectionType {
    PICKER("PICKER"),
    DATE_PICKER("DATE_PICKER"),
    INPUT("INPUT"),
    SELECT("SELECT");

    private final String value;

    MessagesApiWebhookEventFormSelectionType(String value) {
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
    public static MessagesApiWebhookEventFormSelectionType fromValue(String value) {
        for (MessagesApiWebhookEventFormSelectionType enumElement : MessagesApiWebhookEventFormSelectionType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
