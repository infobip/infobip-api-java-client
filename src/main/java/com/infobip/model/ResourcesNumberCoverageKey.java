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
import java.util.Objects;

/**
 * Represents ResourcesNumberCoverageKey model.
 */
public class ResourcesNumberCoverageKey extends ResourcesIbResourceCoverageKey {

    private String number;

    private String countryCode;

    /**
     * Constructs a new {@link ResourcesNumberCoverageKey} instance.
     */
    public ResourcesNumberCoverageKey() {
        super("NUMBER");
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Phone number.
     * <p>
     * The field is required.
     *
     * @param number
     * @return This {@link ResourcesNumberCoverageKey instance}.
     */
    public ResourcesNumberCoverageKey number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * Phone number.
     * <p>
     * The field is required.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Phone number.
     * <p>
     * The field is required.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link ResourcesNumberCoverageKey instance}.
     */
    public ResourcesNumberCoverageKey countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     * <p>
     * The field is required.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     * <p>
     * The field is required.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesNumberCoverageKey resourcesNumberCoverageKey = (ResourcesNumberCoverageKey) o;
        return Objects.equals(this.number, resourcesNumberCoverageKey.number)
                && Objects.equals(this.countryCode, resourcesNumberCoverageKey.countryCode)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, countryCode, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberCoverageKey {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
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
