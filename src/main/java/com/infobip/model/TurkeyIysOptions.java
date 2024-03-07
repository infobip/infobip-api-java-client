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
 * IYS regulations specific parameters required for sending promotional SMS to phone numbers registered in Turkey.
 */
public class TurkeyIysOptions {

    private Integer brandCode;

    private RecipientType recipientType;

    /**
     * Sets brandCode.
     * <p>
     * Field description:
     * Brand code is an ID of the company based on a company VAT number. If not provided in request, default value is used from your Infobip account.
     *
     * @param brandCode
     * @return This {@link TurkeyIysOptions instance}.
     */
    public TurkeyIysOptions brandCode(Integer brandCode) {
        this.brandCode = brandCode;
        return this;
    }

    /**
     * Returns brandCode.
     * <p>
     * Field description:
     * Brand code is an ID of the company based on a company VAT number. If not provided in request, default value is used from your Infobip account.
     *
     * @return brandCode
     */
    @JsonProperty("brandCode")
    public Integer getBrandCode() {
        return brandCode;
    }

    /**
     * Sets brandCode.
     * <p>
     * Field description:
     * Brand code is an ID of the company based on a company VAT number. If not provided in request, default value is used from your Infobip account.
     *
     * @param brandCode
     */
    @JsonProperty("brandCode")
    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * Sets recipientType.
     * <p>
     * The field is required.
     *
     * @param recipientType
     * @return This {@link TurkeyIysOptions instance}.
     */
    public TurkeyIysOptions recipientType(RecipientType recipientType) {
        this.recipientType = recipientType;
        return this;
    }

    /**
     * Returns recipientType.
     * <p>
     * The field is required.
     *
     * @return recipientType
     */
    @JsonProperty("recipientType")
    public RecipientType getRecipientType() {
        return recipientType;
    }

    /**
     * Sets recipientType.
     * <p>
     * The field is required.
     *
     * @param recipientType
     */
    @JsonProperty("recipientType")
    public void setRecipientType(RecipientType recipientType) {
        this.recipientType = recipientType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TurkeyIysOptions turkeyIysOptions = (TurkeyIysOptions) o;
        return Objects.equals(this.brandCode, turkeyIysOptions.brandCode)
                && Objects.equals(this.recipientType, turkeyIysOptions.recipientType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandCode, recipientType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TurkeyIysOptions {")
                .append(newLine)
                .append("    brandCode: ")
                .append(toIndentedString(brandCode))
                .append(newLine)
                .append("    recipientType: ")
                .append(toIndentedString(recipientType))
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
