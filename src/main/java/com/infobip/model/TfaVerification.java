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
 * Represents TfaVerification model.
 */
public class TfaVerification {

    private String msisdn;

    private Long sentAt;

    private Boolean verified;

    private Long verifiedAt;

    /**
     * Sets msisdn.
     * <p>
     * Field description:
     * Phone number (MSISDN) for which verification status is checked.
     *
     * @param msisdn
     * @return This {@link TfaVerification instance}.
     */
    public TfaVerification msisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    /**
     * Returns msisdn.
     * <p>
     * Field description:
     * Phone number (MSISDN) for which verification status is checked.
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
     * Phone number (MSISDN) for which verification status is checked.
     *
     * @param msisdn
     */
    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Sent UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
     *
     * @param sentAt
     * @return This {@link TfaVerification instance}.
     */
    public TfaVerification sentAt(Long sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Sent UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
     *
     * @return sentAt
     */
    @JsonProperty("sentAt")
    public Long getSentAt() {
        return sentAt;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Sent UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(Long sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets verified.
     * <p>
     * Field description:
     * Indicates if the phone number (MSISDN) is already verified for 2FA application with given ID.
     *
     * @param verified
     * @return This {@link TfaVerification instance}.
     */
    public TfaVerification verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Returns verified.
     * <p>
     * Field description:
     * Indicates if the phone number (MSISDN) is already verified for 2FA application with given ID.
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
     * Indicates if the phone number (MSISDN) is already verified for 2FA application with given ID.
     *
     * @param verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * Sets verifiedAt.
     * <p>
     * Field description:
     * Verification UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
     *
     * @param verifiedAt
     * @return This {@link TfaVerification instance}.
     */
    public TfaVerification verifiedAt(Long verifiedAt) {
        this.verifiedAt = verifiedAt;
        return this;
    }

    /**
     * Returns verifiedAt.
     * <p>
     * Field description:
     * Verification UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
     *
     * @return verifiedAt
     */
    @JsonProperty("verifiedAt")
    public Long getVerifiedAt() {
        return verifiedAt;
    }

    /**
     * Sets verifiedAt.
     * <p>
     * Field description:
     * Verification UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
     *
     * @param verifiedAt
     */
    @JsonProperty("verifiedAt")
    public void setVerifiedAt(Long verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaVerification tfaVerification = (TfaVerification) o;
        return Objects.equals(this.msisdn, tfaVerification.msisdn)
                && Objects.equals(this.sentAt, tfaVerification.sentAt)
                && Objects.equals(this.verified, tfaVerification.verified)
                && Objects.equals(this.verifiedAt, tfaVerification.verifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msisdn, sentAt, verified, verifiedAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaVerification {")
                .append(newLine)
                .append("    msisdn: ")
                .append(toIndentedString(msisdn))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    verified: ")
                .append(toIndentedString(verified))
                .append(newLine)
                .append("    verifiedAt: ")
                .append(toIndentedString(verifiedAt))
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
