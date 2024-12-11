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
 * The information which describes the source of the last modification of record.
 */
public enum FlowOrigin {
    API("API"),
    PORTAL("PORTAL"),
    WEB_SDK("WEB_SDK"),
    INTEGRATION("INTEGRATION"),
    PUSH("PUSH"),
    FACEBOOK("FACEBOOK"),
    LINE("LINE"),
    TELEGRAM("TELEGRAM"),
    SALESFORCE("SALESFORCE"),
    DYNAMICS("DYNAMICS"),
    ZAPIER("ZAPIER"),
    FORMS("FORMS"),
    COMPUTED("COMPUTED"),
    ANSWERS("ANSWERS"),
    CONVERSATIONS("CONVERSATIONS");

    private final String value;

    FlowOrigin(String value) {
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
    public static FlowOrigin fromValue(String value) {
        for (FlowOrigin enumElement : FlowOrigin.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
