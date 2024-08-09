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
 * HMAC algorithm.
 */
public enum HmacAlgorithm {
    MD5("HMAC_MD5"),
    SHA_1("HMAC_SHA_1"),
    SHA_224("HMAC_SHA_224"),
    SHA_256("HMAC_SHA_256"),
    SHA_384("HMAC_SHA_384"),
    SHA_512("HMAC_SHA_512");

    private final String value;

    HmacAlgorithm(String value) {
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
    public static HmacAlgorithm fromValue(String value) {
        for (HmacAlgorithm enumElement : HmacAlgorithm.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
