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
 * Defines voice action for inbound calls.
 */
public enum MoActionType {
    PULL("PULL"),
    HTTP_FORWARD("HTTP_FORWARD"),
    SMPP_FORWARD("SMPP_FORWARD"),
    MAIL_FORWARD("MAIL_FORWARD"),
    NO_ACTION("NO_ACTION"),
    BLOCK("BLOCK"),
    AUTORESPONSE("AUTORESPONSE"),
    USSD("USSD"),
    SEND_BULK_MT("SEND_BULK_MT"),
    EMAIL_TO_SMS_FORWARD("EMAIL_TO_SMS_FORWARD"),
    CNS_FWD("CNS_FWD"),
    USE_CONVERSATIONS("USE_CONVERSATIONS"),
    FORWARD_TO_PSTN("FORWARD_TO_PSTN"),
    FORWARD_TO_IP("FORWARD_TO_IP"),
    FORWARD_TO_IVR("FORWARD_TO_IVR"),
    VOICE_NUMBER_MASKING("VOICE_NUMBER_MASKING"),
    VOICE_CALL_DROP("VOICE_CALL_DROP"),
    FORWARD_TO_WEBRTC("FORWARD_TO_WEBRTC"),
    VOICE_FORWARD_TO_CONVERSATIONS("VOICE_FORWARD_TO_CONVERSATIONS"),
    VOICE_FORWARD_TO_CONVERSATIONS_WITH_FLOW("VOICE_FORWARD_TO_CONVERSATIONS_WITH_FLOW"),
    CALL_FORWARD_TO_APPLICATION("CALL_FORWARD_TO_APPLICATION"),
    FORWARD_TO_SUBSCRIPTION("FORWARD_TO_SUBSCRIPTION"),
    FORWARD_TO_CALL_ROUTING("FORWARD_TO_CALL_ROUTING"),
    USE_ANSWERS("USE_ANSWERS"),
    VOICE_FORWARD_TO_ANSWERS("VOICE_FORWARD_TO_ANSWERS"),
    VOICE_FORWARD_TO_FLOW("VOICE_FORWARD_TO_FLOW"),
    VOICE_FORWARD_TO_FLOW_WITH_CONVERSATIONS("VOICE_FORWARD_TO_FLOW_WITH_CONVERSATIONS"),
    FORWARD_TO_OPERATOR_CONNECT("FORWARD_TO_OPERATOR_CONNECT"),
    FORWARD_TO_EXTERNAL_INTEGRATION("FORWARD_TO_EXTERNAL_INTEGRATION"),
    FORWARD_TO_AI_AGENT("FORWARD_TO_AI_AGENT"),
    FORWARD_TO_MARKUP_LANGUAGE("FORWARD_TO_MARKUP_LANGUAGE"),
    OTHER("OTHER");

    private final String value;

    MoActionType(String value) {
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
    public static MoActionType fromValue(String value) {
        for (MoActionType enumElement : MoActionType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
