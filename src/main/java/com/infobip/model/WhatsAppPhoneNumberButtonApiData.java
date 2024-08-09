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
 * Represents WhatsAppPhoneNumberButtonApiData model.
 */
public class WhatsAppPhoneNumberButtonApiData extends WhatsAppButtonApiData {

    private String text;

    private String phoneNumber;

    /**
     * Constructs a new {@link WhatsAppPhoneNumberButtonApiData} instance.
     */
    public WhatsAppPhoneNumberButtonApiData() {
        super("PHONE_NUMBER");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppPhoneNumberButtonApiData instance}.
     */
    public WhatsAppPhoneNumberButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number to which a phone call would be placed by end-user when hitting the button.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link WhatsAppPhoneNumberButtonApiData instance}.
     */
    public WhatsAppPhoneNumberButtonApiData phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number to which a phone call would be placed by end-user when hitting the button.
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
     * Phone number to which a phone call would be placed by end-user when hitting the button.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppPhoneNumberButtonApiData whatsAppPhoneNumberButtonApiData = (WhatsAppPhoneNumberButtonApiData) o;
        return Objects.equals(this.text, whatsAppPhoneNumberButtonApiData.text)
                && Objects.equals(this.phoneNumber, whatsAppPhoneNumberButtonApiData.phoneNumber)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, phoneNumber, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppPhoneNumberButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
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
