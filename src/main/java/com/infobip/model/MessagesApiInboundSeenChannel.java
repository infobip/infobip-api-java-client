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
 * Messaging channel used for sending an event.
 */
public enum MessagesApiInboundSeenChannel {
    WHATSAPP("WHATSAPP"),
    VIBER_BM("VIBER_BM"),
    VIBER_BOT("VIBER_BOT"),
    RCS("RCS");

    private final String value;

    MessagesApiInboundSeenChannel(String value) {
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
    public static MessagesApiInboundSeenChannel fromValue(String value) {
        for (MessagesApiInboundSeenChannel enumElement : MessagesApiInboundSeenChannel.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
