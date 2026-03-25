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
 * The stock exchange where brand is listed.
 */
public enum NumbersStockExchange {
    AMEX("AMEX"),
    AMX("AMX"),
    ASX("ASX"),
    B3("B3"),
    BME("BME"),
    BSE("BSE"),
    FRA("FRA"),
    ICEX("ICEX"),
    JPX("JPX"),
    JSE("JSE"),
    KRX("KRX"),
    LON("LON"),
    NASDAQ("NASDAQ"),
    NSE("NSE"),
    NYSE("NYSE"),
    OMX("OMX"),
    SEHK("SEHK"),
    SGX("SGX"),
    SSE("SSE"),
    STO("STO"),
    SWX("SWX"),
    SZSE("SZSE"),
    TSX("TSX"),
    TWSE("TWSE"),
    VSE("VSE"),
    OTHER("OTHER");

    private final String value;

    NumbersStockExchange(String value) {
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
    public static NumbersStockExchange fromValue(String value) {
        for (NumbersStockExchange enumElement : NumbersStockExchange.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
