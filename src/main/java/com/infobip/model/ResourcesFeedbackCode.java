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
 * Code of the feedback.
 */
public enum ResourcesFeedbackCode {
    REQUIRED("RES_REQ_FEED_REQUIRED"),
    FORMAT("RES_REQ_FEED_FORMAT"),
    LENGTH_OOR("RES_REQ_FEED_LENGTH_OOR"),
    VALUE_OOR("RES_REQ_FEED_VALUE_OOR"),
    OTHER("RES_REQ_FEED_OTHER");

    private final String value;

    ResourcesFeedbackCode(String value) {
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
    public static ResourcesFeedbackCode fromValue(String value) {
        for (ResourcesFeedbackCode enumElement : ResourcesFeedbackCode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
