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
 * Represents ResourcesAlphaCoverageKey model.
 */
public class ResourcesAlphaCoverageKey extends ResourcesIbResourceCoverageKey {

    private String senderName;

    private String countryCode;

    /**
     * Constructs a new {@link ResourcesAlphaCoverageKey} instance.
     */
    public ResourcesAlphaCoverageKey() {
        super("ALPHANUMERIC");
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     * <p>
     * The field is required.
     *
     * @param senderName
     * @return This {@link ResourcesAlphaCoverageKey instance}.
     */
    public ResourcesAlphaCoverageKey senderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Returns senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     * <p>
     * The field is required.
     *
     * @return senderName
     */
    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Alphanumeric sender name.
     * <p>
     * The field is required.
     *
     * @param senderName
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
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
     * @return This {@link ResourcesAlphaCoverageKey instance}.
     */
    public ResourcesAlphaCoverageKey countryCode(String countryCode) {
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
        ResourcesAlphaCoverageKey resourcesAlphaCoverageKey = (ResourcesAlphaCoverageKey) o;
        return Objects.equals(this.senderName, resourcesAlphaCoverageKey.senderName)
                && Objects.equals(this.countryCode, resourcesAlphaCoverageKey.countryCode)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderName, countryCode, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAlphaCoverageKey {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    senderName: ")
                .append(toIndentedString(senderName))
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
