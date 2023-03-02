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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * IYS regulations specific parameters required for sending promotional SMS to phone numbers registered in Turkey.
 */
public class SmsTurkeyIysOptions {

    private Integer brandCode;

    /**
     * Recipient Type must be &#x60;TACIR&#x60; or &#x60;BIREYSEL&#x60;.
     */
    public enum RecipientTypeEnum {
        BIREYSEL("BIREYSEL"),
        TACIR("TACIR");

        private String value;

        RecipientTypeEnum(String value) {
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
        public static RecipientTypeEnum fromValue(String value) {
            for (RecipientTypeEnum enumElement : RecipientTypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private RecipientTypeEnum recipientType;

    /**
     * Sets brandCode.
     * <p>
     * Field description:
     * Brand code is an ID of the company based on a company VAT number. If not provided in request, default value is used from your Infobip account.
     *
     * @param brandCode
     * @return This {@link SmsTurkeyIysOptions instance}.
     */
    public SmsTurkeyIysOptions brandCode(Integer brandCode) {
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
     * Field description:
     * Recipient Type must be &#x60;TACIR&#x60; or &#x60;BIREYSEL&#x60;.
     * <p>
     * The field is required.
     *
     * @param recipientType
     * @return This {@link SmsTurkeyIysOptions instance}.
     */
    public SmsTurkeyIysOptions recipientType(RecipientTypeEnum recipientType) {
        this.recipientType = recipientType;
        return this;
    }

    /**
     * Returns recipientType.
     * <p>
     * Field description:
     * Recipient Type must be &#x60;TACIR&#x60; or &#x60;BIREYSEL&#x60;.
     * <p>
     * The field is required.
     *
     * @return recipientType
     */
    @JsonProperty("recipientType")
    public RecipientTypeEnum getRecipientType() {
        return recipientType;
    }

    /**
     * Sets recipientType.
     * <p>
     * Field description:
     * Recipient Type must be &#x60;TACIR&#x60; or &#x60;BIREYSEL&#x60;.
     * <p>
     * The field is required.
     *
     * @param recipientType
     */
    @JsonProperty("recipientType")
    public void setRecipientType(RecipientTypeEnum recipientType) {
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
        SmsTurkeyIysOptions smsTurkeyIysOptions = (SmsTurkeyIysOptions) o;
        return Objects.equals(this.brandCode, smsTurkeyIysOptions.brandCode)
                && Objects.equals(this.recipientType, smsTurkeyIysOptions.recipientType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandCode, recipientType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsTurkeyIysOptions {")
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
