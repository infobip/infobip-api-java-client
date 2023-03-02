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
 * Represents TfaVerifyPinResponse model.
 */
public class TfaVerifyPinResponse {

    private Integer attemptsRemaining;

    private String msisdn;

    private String pinError;

    private String pinId;

    private Boolean verified;

    /**
     * Sets attemptsRemaining.
     * <p>
     * Field description:
     * Number of remaining PIN attempts.
     *
     * @param attemptsRemaining
     * @return This {@link TfaVerifyPinResponse instance}.
     */
    public TfaVerifyPinResponse attemptsRemaining(Integer attemptsRemaining) {
        this.attemptsRemaining = attemptsRemaining;
        return this;
    }

    /**
     * Returns attemptsRemaining.
     * <p>
     * Field description:
     * Number of remaining PIN attempts.
     *
     * @return attemptsRemaining
     */
    @JsonProperty("attemptsRemaining")
    public Integer getAttemptsRemaining() {
        return attemptsRemaining;
    }

    /**
     * Sets attemptsRemaining.
     * <p>
     * Field description:
     * Number of remaining PIN attempts.
     *
     * @param attemptsRemaining
     */
    @JsonProperty("attemptsRemaining")
    public void setAttemptsRemaining(Integer attemptsRemaining) {
        this.attemptsRemaining = attemptsRemaining;
    }

    /**
     * Sets msisdn.
     * <p>
     * Field description:
     * Phone number (&#x60;MSISDN&#x60;) to which the 2FA message was sent.
     *
     * @param msisdn
     * @return This {@link TfaVerifyPinResponse instance}.
     */
    public TfaVerifyPinResponse msisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    /**
     * Returns msisdn.
     * <p>
     * Field description:
     * Phone number (&#x60;MSISDN&#x60;) to which the 2FA message was sent.
     *
     * @return msisdn
     */
    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets msisdn.
     * <p>
     * Field description:
     * Phone number (&#x60;MSISDN&#x60;) to which the 2FA message was sent.
     *
     * @param msisdn
     */
    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * Sets pinError.
     * <p>
     * Field description:
     * Indicates whether an error has occurred during PIN verification.
     *
     * @param pinError
     * @return This {@link TfaVerifyPinResponse instance}.
     */
    public TfaVerifyPinResponse pinError(String pinError) {
        this.pinError = pinError;
        return this;
    }

    /**
     * Returns pinError.
     * <p>
     * Field description:
     * Indicates whether an error has occurred during PIN verification.
     *
     * @return pinError
     */
    @JsonProperty("pinError")
    public String getPinError() {
        return pinError;
    }

    /**
     * Sets pinError.
     * <p>
     * Field description:
     * Indicates whether an error has occurred during PIN verification.
     *
     * @param pinError
     */
    @JsonProperty("pinError")
    public void setPinError(String pinError) {
        this.pinError = pinError;
    }

    /**
     * Sets pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @param pinId
     * @return This {@link TfaVerifyPinResponse instance}.
     */
    public TfaVerifyPinResponse pinId(String pinId) {
        this.pinId = pinId;
        return this;
    }

    /**
     * Returns pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @return pinId
     */
    @JsonProperty("pinId")
    public String getPinId() {
        return pinId;
    }

    /**
     * Sets pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @param pinId
     */
    @JsonProperty("pinId")
    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    /**
     * Sets verified.
     * <p>
     * Field description:
     * Indicates whether the phone number (&#x60;MSISDN&#x60;) was successfully verified.
     *
     * @param verified
     * @return This {@link TfaVerifyPinResponse instance}.
     */
    public TfaVerifyPinResponse verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Returns verified.
     * <p>
     * Field description:
     * Indicates whether the phone number (&#x60;MSISDN&#x60;) was successfully verified.
     *
     * @return verified
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Sets verified.
     * <p>
     * Field description:
     * Indicates whether the phone number (&#x60;MSISDN&#x60;) was successfully verified.
     *
     * @param verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaVerifyPinResponse tfaVerifyPinResponse = (TfaVerifyPinResponse) o;
        return Objects.equals(this.attemptsRemaining, tfaVerifyPinResponse.attemptsRemaining)
                && Objects.equals(this.msisdn, tfaVerifyPinResponse.msisdn)
                && Objects.equals(this.pinError, tfaVerifyPinResponse.pinError)
                && Objects.equals(this.pinId, tfaVerifyPinResponse.pinId)
                && Objects.equals(this.verified, tfaVerifyPinResponse.verified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attemptsRemaining, msisdn, pinError, pinId, verified);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaVerifyPinResponse {")
                .append(newLine)
                .append("    attemptsRemaining: ")
                .append(toIndentedString(attemptsRemaining))
                .append(newLine)
                .append("    msisdn: ")
                .append(toIndentedString(msisdn))
                .append(newLine)
                .append("    pinError: ")
                .append(toIndentedString(pinError))
                .append(newLine)
                .append("    pinId: ")
                .append(toIndentedString(pinId))
                .append(newLine)
                .append("    verified: ")
                .append(toIndentedString(verified))
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
