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
 * Used for unsetting configuration options. &lt;br /&gt; &lt;b&gt;If a property appears both in unset, and in the body of the request, it will &lt;u&gt;FIRST&lt;/u&gt; be removed, and then &lt;u&gt;UPDATED&lt;/u&gt; with the value from the request body!&lt;/b&gt;
 */
public enum ResourcesUnsetOption {
    USERNAME("USERNAME"),
    PLATFORM("PLATFORM"),
    FORWARDING("FORWARDING"),
    CONVERSATIONS("CONVERSATIONS"),
    ANSWERS("ANSWERS"),
    AUTORESPONSE("AUTORESPONSE"),
    BLOCKLISTCONFIGURATION("BLOCKLISTCONFIGURATION");

    private final String value;

    ResourcesUnsetOption(String value) {
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
    public static ResourcesUnsetOption fromValue(String value) {
        for (ResourcesUnsetOption enumElement : ResourcesUnsetOption.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
