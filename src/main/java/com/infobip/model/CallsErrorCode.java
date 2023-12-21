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
 * Error code to hang up with. There are rules for using error codes.  &#x60;NORMAL_HANGUP&#x60; - Call needs to be established.  &#x60;NO_ANSWER&#x60; - Call cannot be established.  &#x60;BUSY&#x60; - Call cannot be established.  &#x60;CANCELLED&#x60; - Call cannot be established and must be &#x60;INBOUND&#x60; call  &#x60;REJECTED&#x60; - Call cannot be established and must be &#x60;OUTBOUND&#x60; call.  &#x60;FORBIDDEN&#x60; - Call cannot be established.  &#x60;DESTINATION_NOT_FOUND&#x60; - Call cannot be established and must be &#x60;OUTBOUND&#x60;  &#x60;DESTINATION_UNAVAILABLE&#x60; - Call cannot be established and must be &#x60;OUTBOUND&#x60;.  &#x60;INVALID_DESTINATION&#x60; - Call needs to be established and must be &#x60;OUTBOUND&#x60;.  &#x60;SERVICE_UNAVAILABLE&#x60; - Call cannot to be established.
 */
public enum CallsErrorCode {
    NORMAL_HANGUP("NORMAL_HANGUP"),
    NO_ANSWER("NO_ANSWER"),
    BUSY("BUSY"),
    CANCELLED("CANCELLED"),
    REJECTED("REJECTED"),
    FORBIDDEN("FORBIDDEN"),
    DESTINATION_NOT_FOUND("DESTINATION_NOT_FOUND"),
    DESTINATION_UNAVAILABLE("DESTINATION_UNAVAILABLE"),
    INVALID_DESTINATION("INVALID_DESTINATION"),
    INVALID_REQUEST("INVALID_REQUEST"),
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE");

    private final String value;

    CallsErrorCode(String value) {
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
    public static CallsErrorCode fromValue(String value) {
        for (CallsErrorCode enumElement : CallsErrorCode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
