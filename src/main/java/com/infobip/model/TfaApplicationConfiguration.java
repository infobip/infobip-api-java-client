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
 * Created 2FA application configuration.
 */
public class TfaApplicationConfiguration {

    private Boolean allowMultiplePinVerifications;

    private Integer pinAttempts;

    private String pinTimeToLive;

    private String sendPinPerApplicationLimit;

    private String sendPinPerPhoneNumberLimit;

    private String verifyPinLimit;

    /**
     * Sets allowMultiplePinVerifications.
     * <p>
     * Field description:
     * Indicates whether multiple PIN verification is allowed.
     *
     * @param allowMultiplePinVerifications
     * @return This {@link TfaApplicationConfiguration instance}.
     */
    public TfaApplicationConfiguration allowMultiplePinVerifications(Boolean allowMultiplePinVerifications) {
        this.allowMultiplePinVerifications = allowMultiplePinVerifications;
        return this;
    }

    /**
     * Returns allowMultiplePinVerifications.
     * <p>
     * Field description:
     * Indicates whether multiple PIN verification is allowed.
     *
     * @return allowMultiplePinVerifications
     */
    @JsonProperty("allowMultiplePinVerifications")
    public Boolean getAllowMultiplePinVerifications() {
        return allowMultiplePinVerifications;
    }

    /**
     * Sets allowMultiplePinVerifications.
     * <p>
     * Field description:
     * Indicates whether multiple PIN verification is allowed.
     *
     * @param allowMultiplePinVerifications
     */
    @JsonProperty("allowMultiplePinVerifications")
    public void setAllowMultiplePinVerifications(Boolean allowMultiplePinVerifications) {
        this.allowMultiplePinVerifications = allowMultiplePinVerifications;
    }

    /**
     * Sets pinAttempts.
     * <p>
     * Field description:
     * Number of possible PIN attempts.
     *
     * @param pinAttempts
     * @return This {@link TfaApplicationConfiguration instance}.
     */
    public TfaApplicationConfiguration pinAttempts(Integer pinAttempts) {
        this.pinAttempts = pinAttempts;
        return this;
    }

    /**
     * Returns pinAttempts.
     * <p>
     * Field description:
     * Number of possible PIN attempts.
     *
     * @return pinAttempts
     */
    @JsonProperty("pinAttempts")
    public Integer getPinAttempts() {
        return pinAttempts;
    }

    /**
     * Sets pinAttempts.
     * <p>
     * Field description:
     * Number of possible PIN attempts.
     *
     * @param pinAttempts
     */
    @JsonProperty("pinAttempts")
    public void setPinAttempts(Integer pinAttempts) {
        this.pinAttempts = pinAttempts;
    }

    /**
     * Sets pinTimeToLive.
     * <p>
     * Field description:
     * Validity period of PIN in specified time unit. Required format: &#x60;{timeLength}{timeUnit}&#x60;. &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; can be set to: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @param pinTimeToLive
     * @return This {@link TfaApplicationConfiguration instance}.
     */
    public TfaApplicationConfiguration pinTimeToLive(String pinTimeToLive) {
        this.pinTimeToLive = pinTimeToLive;
        return this;
    }

    /**
     * Returns pinTimeToLive.
     * <p>
     * Field description:
     * Validity period of PIN in specified time unit. Required format: &#x60;{timeLength}{timeUnit}&#x60;. &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; can be set to: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @return pinTimeToLive
     */
    @JsonProperty("pinTimeToLive")
    public String getPinTimeToLive() {
        return pinTimeToLive;
    }

    /**
     * Sets pinTimeToLive.
     * <p>
     * Field description:
     * Validity period of PIN in specified time unit. Required format: &#x60;{timeLength}{timeUnit}&#x60;. &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; can be set to: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @param pinTimeToLive
     */
    @JsonProperty("pinTimeToLive")
    public void setPinTimeToLive(String pinTimeToLive) {
        this.pinTimeToLive = pinTimeToLive;
    }

    /**
     * Sets sendPinPerApplicationLimit.
     * <p>
     * Field description:
     * Overall number of requests over a specififed time period for generating a PIN and sending an SMS using a single application. Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @param sendPinPerApplicationLimit
     * @return This {@link TfaApplicationConfiguration instance}.
     */
    public TfaApplicationConfiguration sendPinPerApplicationLimit(String sendPinPerApplicationLimit) {
        this.sendPinPerApplicationLimit = sendPinPerApplicationLimit;
        return this;
    }

    /**
     * Returns sendPinPerApplicationLimit.
     * <p>
     * Field description:
     * Overall number of requests over a specififed time period for generating a PIN and sending an SMS using a single application. Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @return sendPinPerApplicationLimit
     */
    @JsonProperty("sendPinPerApplicationLimit")
    public String getSendPinPerApplicationLimit() {
        return sendPinPerApplicationLimit;
    }

    /**
     * Sets sendPinPerApplicationLimit.
     * <p>
     * Field description:
     * Overall number of requests over a specififed time period for generating a PIN and sending an SMS using a single application. Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @param sendPinPerApplicationLimit
     */
    @JsonProperty("sendPinPerApplicationLimit")
    public void setSendPinPerApplicationLimit(String sendPinPerApplicationLimit) {
        this.sendPinPerApplicationLimit = sendPinPerApplicationLimit;
    }

    /**
     * Sets sendPinPerPhoneNumberLimit.
     * <p>
     * Field description:
     * Number of requests over a specififed time period for generating a PIN and sending an SMS to one phone number (MSISDN). Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @param sendPinPerPhoneNumberLimit
     * @return This {@link TfaApplicationConfiguration instance}.
     */
    public TfaApplicationConfiguration sendPinPerPhoneNumberLimit(String sendPinPerPhoneNumberLimit) {
        this.sendPinPerPhoneNumberLimit = sendPinPerPhoneNumberLimit;
        return this;
    }

    /**
     * Returns sendPinPerPhoneNumberLimit.
     * <p>
     * Field description:
     * Number of requests over a specififed time period for generating a PIN and sending an SMS to one phone number (MSISDN). Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @return sendPinPerPhoneNumberLimit
     */
    @JsonProperty("sendPinPerPhoneNumberLimit")
    public String getSendPinPerPhoneNumberLimit() {
        return sendPinPerPhoneNumberLimit;
    }

    /**
     * Sets sendPinPerPhoneNumberLimit.
     * <p>
     * Field description:
     * Number of requests over a specififed time period for generating a PIN and sending an SMS to one phone number (MSISDN). Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one year, although much lower value is recommended.
     *
     * @param sendPinPerPhoneNumberLimit
     */
    @JsonProperty("sendPinPerPhoneNumberLimit")
    public void setSendPinPerPhoneNumberLimit(String sendPinPerPhoneNumberLimit) {
        this.sendPinPerPhoneNumberLimit = sendPinPerPhoneNumberLimit;
    }

    /**
     * Sets verifyPinLimit.
     * <p>
     * Field description:
     * The number of PIN verification requests over a specififed time period from one phone number (MSISDN). Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one day, although much lower value is recommended.
     *
     * @param verifyPinLimit
     * @return This {@link TfaApplicationConfiguration instance}.
     */
    public TfaApplicationConfiguration verifyPinLimit(String verifyPinLimit) {
        this.verifyPinLimit = verifyPinLimit;
        return this;
    }

    /**
     * Returns verifyPinLimit.
     * <p>
     * Field description:
     * The number of PIN verification requests over a specififed time period from one phone number (MSISDN). Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one day, although much lower value is recommended.
     *
     * @return verifyPinLimit
     */
    @JsonProperty("verifyPinLimit")
    public String getVerifyPinLimit() {
        return verifyPinLimit;
    }

    /**
     * Sets verifyPinLimit.
     * <p>
     * Field description:
     * The number of PIN verification requests over a specififed time period from one phone number (MSISDN). Required format: &#x60;{attempts}/{timeLength}{timeUnit}&#x60;. &#x60;attempts&#x60; is mandatory and &#x60;timeLength&#x60; is optional with a default value of 1. &#x60;timeUnit&#x60; is one of: &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60; or &#x60;d&#x60; representing milliseconds, seconds, minutes, hours, and days respectively. Must not exceed one day, although much lower value is recommended.
     *
     * @param verifyPinLimit
     */
    @JsonProperty("verifyPinLimit")
    public void setVerifyPinLimit(String verifyPinLimit) {
        this.verifyPinLimit = verifyPinLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaApplicationConfiguration tfaApplicationConfiguration = (TfaApplicationConfiguration) o;
        return Objects.equals(
                        this.allowMultiplePinVerifications, tfaApplicationConfiguration.allowMultiplePinVerifications)
                && Objects.equals(this.pinAttempts, tfaApplicationConfiguration.pinAttempts)
                && Objects.equals(this.pinTimeToLive, tfaApplicationConfiguration.pinTimeToLive)
                && Objects.equals(
                        this.sendPinPerApplicationLimit, tfaApplicationConfiguration.sendPinPerApplicationLimit)
                && Objects.equals(
                        this.sendPinPerPhoneNumberLimit, tfaApplicationConfiguration.sendPinPerPhoneNumberLimit)
                && Objects.equals(this.verifyPinLimit, tfaApplicationConfiguration.verifyPinLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowMultiplePinVerifications,
                pinAttempts,
                pinTimeToLive,
                sendPinPerApplicationLimit,
                sendPinPerPhoneNumberLimit,
                verifyPinLimit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaApplicationConfiguration {")
                .append(newLine)
                .append("    allowMultiplePinVerifications: ")
                .append(toIndentedString(allowMultiplePinVerifications))
                .append(newLine)
                .append("    pinAttempts: ")
                .append(toIndentedString(pinAttempts))
                .append(newLine)
                .append("    pinTimeToLive: ")
                .append(toIndentedString(pinTimeToLive))
                .append(newLine)
                .append("    sendPinPerApplicationLimit: ")
                .append(toIndentedString(sendPinPerApplicationLimit))
                .append(newLine)
                .append("    sendPinPerPhoneNumberLimit: ")
                .append(toIndentedString(sendPinPerPhoneNumberLimit))
                .append(newLine)
                .append("    verifyPinLimit: ")
                .append(toIndentedString(verifyPinLimit))
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
