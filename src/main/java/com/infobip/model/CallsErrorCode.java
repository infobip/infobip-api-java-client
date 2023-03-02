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
 * Error code to hang up with.
 */
public enum CallsErrorCode {
    NORMAL_HANGUP("NORMAL_HANGUP"),
    ANSWERED_ELSEWHERE("ANSWERED_ELSEWHERE"),
    MACHINE_DETECTED("MACHINE_DETECTED"),
    HUMAN_DETECTED("HUMAN_DETECTED"),
    MAX_DURATION_REACHED("MAX_DURATION_REACHED"),
    DEVICE_FORBIDDEN("DEVICE_FORBIDDEN"),
    DEVICE_NOT_FOUND("DEVICE_NOT_FOUND"),
    DEVICE_UNAVAILABLE("DEVICE_UNAVAILABLE"),
    MEDIA_ERROR("MEDIA_ERROR"),
    NO_ANSWER("NO_ANSWER"),
    BUSY("BUSY"),
    CANCELLED("CANCELLED"),
    REJECTED("REJECTED"),
    FORBIDDEN("FORBIDDEN"),
    INSUFFICIENT_FUNDS("INSUFFICIENT_FUNDS"),
    UNAUTHENTICATED("UNAUTHENTICATED"),
    DESTINATION_NOT_FOUND("DESTINATION_NOT_FOUND"),
    DESTINATION_UNAVAILABLE("DESTINATION_UNAVAILABLE"),
    INVALID_DESTINATION("INVALID_DESTINATION"),
    INVALID_REQUEST("INVALID_REQUEST"),
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),
    NETWORK_ERROR("NETWORK_ERROR"),
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE"),
    UNKNOWN("UNKNOWN"),
    FEATURE_UNAVAILABLE("FEATURE_UNAVAILABLE"),
    CONGESTION("CONGESTION"),
    URL_NOT_FOUND("URL_NOT_FOUND"),
    URL_UNREACHABLE("URL_UNREACHABLE"),
    INVALID_RESPONSE("INVALID_RESPONSE");

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
