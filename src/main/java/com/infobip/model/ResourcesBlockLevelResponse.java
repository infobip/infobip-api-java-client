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
 * The level of block configuration. If the value is &lt;code&gt;CUSTOM_NOT_EDITABLE&lt;/code&gt;, then the value is not manageable by API.
 */
public enum ResourcesBlockLevelResponse {
    FROM_SENDER("FROM_SENDER"),
    FROM_ANY_SENDER("FROM_ANY_SENDER"),
    CUSTOM_NOT_EDITABLE("CUSTOM_NOT_EDITABLE");

    private final String value;

    ResourcesBlockLevelResponse(String value) {
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
    public static ResourcesBlockLevelResponse fromValue(String value) {
        for (ResourcesBlockLevelResponse enumElement : ResourcesBlockLevelResponse.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
