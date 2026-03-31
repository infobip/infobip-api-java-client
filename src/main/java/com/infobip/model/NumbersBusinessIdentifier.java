/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * An alternative business identifier for the brand.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = NumbersDataUniversalNumberingSystemNumber.class, name = "DUNS"),
    @JsonSubTypes.Type(value = NumbersGlobalIntermediaryIdentificationNumber.class, name = "GIIN"),
    @JsonSubTypes.Type(value = NumbersLegalEntityIdentifier.class, name = "LEI"),
})
public abstract class NumbersBusinessIdentifier {

    private String id;

    protected final NumbersBusinessIdentifierType type;

    /**
     * Constructs a new {@link NumbersBusinessIdentifier} instance.
     */
    public NumbersBusinessIdentifier(String type) {
        this.type = NumbersBusinessIdentifierType.fromValue(type);
    }

    /**
     * Sets id.
     *
     * @param id
     * @return This {@link NumbersBusinessIdentifier instance}.
     */
    public NumbersBusinessIdentifier id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public NumbersBusinessIdentifierType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBusinessIdentifier numbersBusinessIdentifier = (NumbersBusinessIdentifier) o;
        return Objects.equals(this.id, numbersBusinessIdentifier.id)
                && Objects.equals(this.type, numbersBusinessIdentifier.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBusinessIdentifier {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
