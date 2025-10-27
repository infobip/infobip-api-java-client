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
 * Reason is provided when validMailbox status is unknown. 1. INBOX_FULL - The user quota exceeded / The user inbox is full / The user doesn&#39;t accept any more requests. 2. UNEXPECTED_FAILURE - The mail Server returned a temporary error. 3. THROTTLED - The mail server is not allowing us momentarily because of too many requests. 4. TIMED_OUT - The mail Server took a longer time to respond / there was a delay in the network. 5. TEMP_REJECTION - Mail server temporarily rejected. 6. UNABLE_TO_CONNECT - Unable to connect to the Mail Server.
 */
public enum EmailValidationReason {
    TIMED_OUT("TIMED_OUT"),
    TEMP_REJECTION("TEMP_REJECTION"),
    THROTTLED("THROTTLED"),
    INBOX_FULL("INBOX_FULL"),
    UNABLE_TO_CONNECT("UNABLE_TO_CONNECT"),
    UNEXPECTED_FAILURE("UNEXPECTED_FAILURE");

    private final String value;

    EmailValidationReason(String value) {
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
    public static EmailValidationReason fromValue(String value) {
        for (EmailValidationReason enumElement : EmailValidationReason.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
