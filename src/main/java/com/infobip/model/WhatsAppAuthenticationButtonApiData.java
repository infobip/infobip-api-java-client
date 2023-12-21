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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Authentication template buttons. Has to be either a &#39;copy code&#39;  button or &#39;one-tap&#39; button.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "otpType",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppCopyCodeButtonApiData.class, name = "COPY_CODE"),
    @JsonSubTypes.Type(value = WhatsAppOneTapButtonApiData.class, name = "ONE_TAP"),
})
public abstract class WhatsAppAuthenticationButtonApiData {
    /**
     * Type of OTP button.
     */
    public enum OtpTypeEnum {
        COPY_CODE("COPY_CODE"),
        ONE_TAP("ONE_TAP");

        private String value;

        OtpTypeEnum(String value) {
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
        public static OtpTypeEnum fromValue(String value) {
            for (OtpTypeEnum enumElement : OtpTypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    protected final OtpTypeEnum otpType;

    /**
     * Constructs a new {@link WhatsAppAuthenticationButtonApiData} instance.
     */
    public WhatsAppAuthenticationButtonApiData(String otpType) {
        this.otpType = OtpTypeEnum.fromValue(otpType);
    }

    /**
     * Returns otpType.
     * <p>
     * Field description:
     * Type of OTP button.
     * <p>
     * The field is required.
     *
     * @return otpType
     */
    @JsonProperty("otpType")
    public OtpTypeEnum getOtpType() {
        return otpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppAuthenticationButtonApiData whatsAppAuthenticationButtonApiData =
                (WhatsAppAuthenticationButtonApiData) o;
        return Objects.equals(this.otpType, whatsAppAuthenticationButtonApiData.otpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otpType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAuthenticationButtonApiData {")
                .append(newLine)
                .append("    otpType: ")
                .append(toIndentedString(otpType))
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
