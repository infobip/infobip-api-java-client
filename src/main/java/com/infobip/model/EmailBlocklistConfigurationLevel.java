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
 * Defines the level at which Infobip stores unsubscribe preferences.  Note: When you change the unsubscribe configuration from a more global level (such as FROM_DOMAIN) to a more specific level (such as FROM_SENDER), remember that anyone who previously unsubscribed at the domain level chose to stop receiving all messages from your domain. These existing unsubscribe records will not automatically update to reflect the new sender-level setting. As a result, individuals who unsubscribed from your domain will continue to not receive messages, even after the change. To prevent confusion and respect user preferences, carefully manage and, if necessary, update these records when altering unsubscribe settings.
 */
public enum EmailBlocklistConfigurationLevel {
    SENDER("FROM_SENDER"),
    DOMAIN("FROM_DOMAIN");

    private final String value;

    EmailBlocklistConfigurationLevel(String value) {
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
    public static EmailBlocklistConfigurationLevel fromValue(String value) {
        for (EmailBlocklistConfigurationLevel enumElement : EmailBlocklistConfigurationLevel.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
