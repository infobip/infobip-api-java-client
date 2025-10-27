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
 * Messaging channel used for sending a message.
 */
public enum MessagesApiOutboundMessageChannel {
    APPLE_MB("APPLE_MB"),
    INSTAGRAM_DM("INSTAGRAM_DM"),
    LINE_ON("LINE_ON"),
    MESSENGER("MESSENGER"),
    MMS("MMS"),
    RCS("RCS"),
    SMS("SMS"),
    VIBER_BM("VIBER_BM"),
    VIBER_BOT("VIBER_BOT"),
    WHATSAPP("WHATSAPP");

    private final String value;

    MessagesApiOutboundMessageChannel(String value) {
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
    public static MessagesApiOutboundMessageChannel fromValue(String value) {
        for (MessagesApiOutboundMessageChannel enumElement : MessagesApiOutboundMessageChannel.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
