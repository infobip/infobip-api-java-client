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
 * Represents WhatsAppPhoneNumberRequest model.
 */
public class WhatsAppPhoneNumberRequest {

    private String countryCode;

    private String phoneNumber;

    private String displayName;

    /**
     * Type of the phone number. It specifies verification type.
     */
    public enum TypeEnum {
        EXTERNAL_SMS("EXTERNAL_SMS"),
        EXTERNAL_VOICE("EXTERNAL_VOICE"),
        INFOBIP_OWNED("INFOBIP_OWNED");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    private String locale = "en_US";

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code of the phone number.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link WhatsAppPhoneNumberRequest instance}.
     */
    public WhatsAppPhoneNumberRequest countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code of the phone number.
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
     * Country code of the phone number.
     * <p>
     * The field is required.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number to add.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link WhatsAppPhoneNumberRequest instance}.
     */
    public WhatsAppPhoneNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number to add.
     * <p>
     * The field is required.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number to add.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name of the phone number.
     * <p>
     * The field is required.
     *
     * @param displayName
     * @return This {@link WhatsAppPhoneNumberRequest instance}.
     */
    public WhatsAppPhoneNumberRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Display name of the phone number.
     * <p>
     * The field is required.
     *
     * @return displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name of the phone number.
     * <p>
     * The field is required.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the phone number. It specifies verification type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link WhatsAppPhoneNumberRequest instance}.
     */
    public WhatsAppPhoneNumberRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of the phone number. It specifies verification type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the phone number. It specifies verification type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets locale.
     * <p>
     * Field description:
     * Locale which will be used to submit for verification.
     * <p>
     * The field is required.
     *
     * @param locale
     * @return This {@link WhatsAppPhoneNumberRequest instance}.
     */
    public WhatsAppPhoneNumberRequest locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Returns locale.
     * <p>
     * Field description:
     * Locale which will be used to submit for verification.
     * <p>
     * The field is required.
     *
     * @return locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * Sets locale.
     * <p>
     * Field description:
     * Locale which will be used to submit for verification.
     * <p>
     * The field is required.
     *
     * @param locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppPhoneNumberRequest whatsAppPhoneNumberRequest = (WhatsAppPhoneNumberRequest) o;
        return Objects.equals(this.countryCode, whatsAppPhoneNumberRequest.countryCode)
                && Objects.equals(this.phoneNumber, whatsAppPhoneNumberRequest.phoneNumber)
                && Objects.equals(this.displayName, whatsAppPhoneNumberRequest.displayName)
                && Objects.equals(this.type, whatsAppPhoneNumberRequest.type)
                && Objects.equals(this.locale, whatsAppPhoneNumberRequest.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, phoneNumber, displayName, type, locale);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppPhoneNumberRequest {")
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    locale: ")
                .append(toIndentedString(locale))
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
