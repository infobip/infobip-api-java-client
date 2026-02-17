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
 * The result of the RCS capability check for the specified phone number. Following codes are available: * &#x60;ENABLED&#x60;: The number can receive RCS messages from the specified sender. * &#x60;UNREACHABLE&#x60;: The number cannot receive RCS messages from the specified sender. * &#x60;REJECTED_NETWORK&#x60;: Message not sent, network not allowed. * &#x60;REJECTED_ROUTE_NOT_AVAILABLE&#x60;: Route not available for that sender. * &#x60;REQUEST_FAILED&#x60;: External problems during capability check * &#x60;PROCESSING_ERROR&#x60;: The results for the number couldn’t be processed. Please try again. * &#x60;INVALID_DESTINATION_ADDRESS&#x60;: Number provided in wrong format. * &#x60;UNKNOWN_CODE&#x60;: Unknown error. Contact with support.
 */
public enum RcsCapabilityCheckResponseCode {
    ENABLED("ENABLED"),
    UNREACHABLE("UNREACHABLE"),
    REJECTED_NETWORK("REJECTED_NETWORK"),
    REJECTED_ROUTE_NOT_AVAILABLE("REJECTED_ROUTE_NOT_AVAILABLE"),
    REQUEST_FAILED("REQUEST_FAILED"),
    PROCESSING_ERROR("PROCESSING_ERROR"),
    INVALID_DESTINATION_ADDRESS("INVALID_DESTINATION_ADDRESS"),
    UNKNOWN_CODE("UNKNOWN_CODE");

    private final String value;

    RcsCapabilityCheckResponseCode(String value) {
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
    public static RcsCapabilityCheckResponseCode fromValue(String value) {
        for (RcsCapabilityCheckResponseCode enumElement : RcsCapabilityCheckResponseCode.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
