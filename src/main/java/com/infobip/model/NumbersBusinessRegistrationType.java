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
 * Type of tax identification number provided. Value depend on selected taxId issuing country. For US it can be only EIN.
 */
public enum NumbersBusinessRegistrationType {
    EIN("EIN"),
    CBN("CBN"),
    NEQ("NEQ"),
    PROVINCIAL_NUMBER("PROVINCIAL_NUMBER"),
    CRN("CRN"),
    VAT("VAT"),
    ACN("ACN"),
    ABN("ABN"),
    BRN("BRN"),
    SIREN("SIREN"),
    SIRET("SIRET"),
    NZBN("NZBN"),
    UST_IDNR("UST_IDNR"),
    CIF("CIF"),
    NIF("NIF"),
    CNPJ("CNPJ"),
    UID("UID"),
    OTHER("OTHER");

    private final String value;

    NumbersBusinessRegistrationType(String value) {
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
    public static NumbersBusinessRegistrationType fromValue(String value) {
        for (NumbersBusinessRegistrationType enumElement : NumbersBusinessRegistrationType.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
