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
 * Sending time zone. If &lt;code&gt;null&lt;/code&gt; is sent, &lt;code&gt;User time zone&lt;/code&gt; will be set.
 */
public enum ResourcesDeliveryTimeZone {
    USER_TIME_ZONE("USER_TIME_ZONE"),
    DESTINATION_TIME_ZONE("DESTINATION_TIME_ZONE");

    private final String value;

    ResourcesDeliveryTimeZone(String value) {
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
    public static ResourcesDeliveryTimeZone fromValue(String value) {
        for (ResourcesDeliveryTimeZone enumElement : ResourcesDeliveryTimeZone.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
