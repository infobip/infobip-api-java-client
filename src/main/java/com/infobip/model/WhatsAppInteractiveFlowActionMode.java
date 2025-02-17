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
 * Mode of the flow, can be either &#39;DRAFT&#39; or &#39;PUBLISHED&#39;. If mode is &#39;DRAFT&#39; header, body, footer and callToActionButton data will be not shown for end user.
 */
public enum WhatsAppInteractiveFlowActionMode {
    DRAFT("DRAFT"),
    PUBLISHED("PUBLISHED");

    private final String value;

    WhatsAppInteractiveFlowActionMode(String value) {
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
    public static WhatsAppInteractiveFlowActionMode fromValue(String value) {
        for (WhatsAppInteractiveFlowActionMode enumElement : WhatsAppInteractiveFlowActionMode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
