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
 *  Detailed reason for the REJECTED status: * &#x60;REJECTED_INVALID_CONTACT&#x60; - Person started to be processed but has been rejected as the contact is not recognized. * &#x60;REJECTED_ATTRIBUTE_MISSED&#x60; - One of the person&#39;s attributes specified in the request does not exist or has spelling error. * &#x60;REJECTED_PERSON_ALREADY_IN_FLOW&#x60; - Person is already in flow. * &#x60;REJECTED_PERSON_NOT_ALLOWED_TO_REENTER&#x60; - Person is not allowed to re-enter flow now. * &#x60;REJECTED_FLOW_ERROR_UNKNOWN&#x60; - Generic flow error. * &#x60;REJECTED_NOT_ENOUGH_CREDITS&#x60; - Your account is out of credits for further submission. Top up your account. For further assistance in topping up or applying for an online account top-up service, you may contact your Account Manager.
 */
public enum FlowErrorStatusReason {
    INVALID_CONTACT("REJECTED_INVALID_CONTACT"),
    ATTRIBUTE_MISSED("REJECTED_ATTRIBUTE_MISSED"),
    PERSON_IN_FLOW("REJECTED_PERSON_IN_FLOW"),
    PERSON_NOT_ALLOWED_TO_REENTER("REJECTED_PERSON_NOT_ALLOWED_TO_REENTER"),
    FLOW_ERROR_UNKNOWN("REJECTED_FLOW_ERROR_UNKNOWN"),
    NOT_ENOUGH_CREDITS("REJECTED_NOT_ENOUGH_CREDITS"),
    CDP_ERROR_UNKNOWN("REJECTED_CDP_ERROR_UNKNOWN");

    private final String value;

    FlowErrorStatusReason(String value) {
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
    public static FlowErrorStatusReason fromValue(String value) {
        for (FlowErrorStatusReason enumElement : FlowErrorStatusReason.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
