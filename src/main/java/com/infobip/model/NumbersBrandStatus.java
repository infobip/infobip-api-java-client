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
 * Represents NumbersBrandStatus model.
 */
public class NumbersBrandStatus {

    private NumbersBrandRegistrar registrar;

    private NumbersBrandRegistrationStatusPublic state;

    /**
     * The status of the brand as determined by the registrar.
     */
    public enum BrandIdentityStatusEnum {
        SELF_DECLARED("SELF_DECLARED"),
        UNVERIFIED("UNVERIFIED"),
        VERIFIED("VERIFIED"),
        VETTED_VERIFIED("VETTED_VERIFIED");

        private String value;

        BrandIdentityStatusEnum(String value) {
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
        public static BrandIdentityStatusEnum fromValue(String value) {
            for (BrandIdentityStatusEnum enumElement : BrandIdentityStatusEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private BrandIdentityStatusEnum brandIdentityStatus;

    /**
     * The status of brand authentication applicable for TENDLC_PUBLIC_COMPANY brand type.
     */
    public enum BrandAuthenticationStatusEnum {
        PENDING("PENDING"),
        ACTIVE("ACTIVE"),
        FAILED("FAILED"),
        EXPIRED("EXPIRED");

        private String value;

        BrandAuthenticationStatusEnum(String value) {
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
        public static BrandAuthenticationStatusEnum fromValue(String value) {
            for (BrandAuthenticationStatusEnum enumElement : BrandAuthenticationStatusEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private BrandAuthenticationStatusEnum brandAuthenticationStatus;

    private String rejectionReason;

    /**
     * Sets registrar.
     *
     * @param registrar
     * @return This {@link NumbersBrandStatus instance}.
     */
    public NumbersBrandStatus registrar(NumbersBrandRegistrar registrar) {
        this.registrar = registrar;
        return this;
    }

    /**
     * Returns registrar.
     *
     * @return registrar
     */
    @JsonProperty("registrar")
    public NumbersBrandRegistrar getRegistrar() {
        return registrar;
    }

    /**
     * Sets registrar.
     *
     * @param registrar
     */
    @JsonProperty("registrar")
    public void setRegistrar(NumbersBrandRegistrar registrar) {
        this.registrar = registrar;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link NumbersBrandStatus instance}.
     */
    public NumbersBrandStatus state(NumbersBrandRegistrationStatusPublic state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public NumbersBrandRegistrationStatusPublic getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(NumbersBrandRegistrationStatusPublic state) {
        this.state = state;
    }

    /**
     * Sets brandIdentityStatus.
     * <p>
     * Field description:
     * The status of the brand as determined by the registrar.
     *
     * @param brandIdentityStatus
     * @return This {@link NumbersBrandStatus instance}.
     */
    public NumbersBrandStatus brandIdentityStatus(BrandIdentityStatusEnum brandIdentityStatus) {
        this.brandIdentityStatus = brandIdentityStatus;
        return this;
    }

    /**
     * Returns brandIdentityStatus.
     * <p>
     * Field description:
     * The status of the brand as determined by the registrar.
     *
     * @return brandIdentityStatus
     */
    @JsonProperty("brandIdentityStatus")
    public BrandIdentityStatusEnum getBrandIdentityStatus() {
        return brandIdentityStatus;
    }

    /**
     * Sets brandIdentityStatus.
     * <p>
     * Field description:
     * The status of the brand as determined by the registrar.
     *
     * @param brandIdentityStatus
     */
    @JsonProperty("brandIdentityStatus")
    public void setBrandIdentityStatus(BrandIdentityStatusEnum brandIdentityStatus) {
        this.brandIdentityStatus = brandIdentityStatus;
    }

    /**
     * Sets brandAuthenticationStatus.
     * <p>
     * Field description:
     * The status of brand authentication applicable for TENDLC_PUBLIC_COMPANY brand type.
     *
     * @param brandAuthenticationStatus
     * @return This {@link NumbersBrandStatus instance}.
     */
    public NumbersBrandStatus brandAuthenticationStatus(BrandAuthenticationStatusEnum brandAuthenticationStatus) {
        this.brandAuthenticationStatus = brandAuthenticationStatus;
        return this;
    }

    /**
     * Returns brandAuthenticationStatus.
     * <p>
     * Field description:
     * The status of brand authentication applicable for TENDLC_PUBLIC_COMPANY brand type.
     *
     * @return brandAuthenticationStatus
     */
    @JsonProperty("brandAuthenticationStatus")
    public BrandAuthenticationStatusEnum getBrandAuthenticationStatus() {
        return brandAuthenticationStatus;
    }

    /**
     * Sets brandAuthenticationStatus.
     * <p>
     * Field description:
     * The status of brand authentication applicable for TENDLC_PUBLIC_COMPANY brand type.
     *
     * @param brandAuthenticationStatus
     */
    @JsonProperty("brandAuthenticationStatus")
    public void setBrandAuthenticationStatus(BrandAuthenticationStatusEnum brandAuthenticationStatus) {
        this.brandAuthenticationStatus = brandAuthenticationStatus;
    }

    /**
     * Sets rejectionReason.
     * <p>
     * Field description:
     * The reason for brand registration rejection.
     *
     * @param rejectionReason
     * @return This {@link NumbersBrandStatus instance}.
     */
    public NumbersBrandStatus rejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }

    /**
     * Returns rejectionReason.
     * <p>
     * Field description:
     * The reason for brand registration rejection.
     *
     * @return rejectionReason
     */
    @JsonProperty("rejectionReason")
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets rejectionReason.
     * <p>
     * Field description:
     * The reason for brand registration rejection.
     *
     * @param rejectionReason
     */
    @JsonProperty("rejectionReason")
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrandStatus numbersBrandStatus = (NumbersBrandStatus) o;
        return Objects.equals(this.registrar, numbersBrandStatus.registrar)
                && Objects.equals(this.state, numbersBrandStatus.state)
                && Objects.equals(this.brandIdentityStatus, numbersBrandStatus.brandIdentityStatus)
                && Objects.equals(this.brandAuthenticationStatus, numbersBrandStatus.brandAuthenticationStatus)
                && Objects.equals(this.rejectionReason, numbersBrandStatus.rejectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrar, state, brandIdentityStatus, brandAuthenticationStatus, rejectionReason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrandStatus {")
                .append(newLine)
                .append("    registrar: ")
                .append(toIndentedString(registrar))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    brandIdentityStatus: ")
                .append(toIndentedString(brandIdentityStatus))
                .append(newLine)
                .append("    brandAuthenticationStatus: ")
                .append(toIndentedString(brandAuthenticationStatus))
                .append(newLine)
                .append("    rejectionReason: ")
                .append(toIndentedString(rejectionReason))
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
