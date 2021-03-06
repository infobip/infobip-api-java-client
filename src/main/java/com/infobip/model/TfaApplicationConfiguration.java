/*
 * Infobip Client API Libraries OpenAPI Specification
 * OpenAPI specification containing public endpoints supported in client API libraries.
 *
 * Contact: support@infobip.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.infobip.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** TfaApplicationConfiguration */
public class TfaApplicationConfiguration {
  public static final String SERIALIZED_NAME_ALLOW_MULTIPLE_PIN_VERIFICATIONS =
      "allowMultiplePinVerifications";

  @SerializedName(SERIALIZED_NAME_ALLOW_MULTIPLE_PIN_VERIFICATIONS)
  private Boolean allowMultiplePinVerifications = true;

  public static final String SERIALIZED_NAME_PIN_ATTEMPTS = "pinAttempts";

  @SerializedName(SERIALIZED_NAME_PIN_ATTEMPTS)
  private Integer pinAttempts = 10;

  public static final String SERIALIZED_NAME_PIN_TIME_TO_LIVE = "pinTimeToLive";

  @SerializedName(SERIALIZED_NAME_PIN_TIME_TO_LIVE)
  private String pinTimeToLive = "15m";

  public static final String SERIALIZED_NAME_SEND_PIN_PER_APPLICATION_LIMIT =
      "sendPinPerApplicationLimit";

  @SerializedName(SERIALIZED_NAME_SEND_PIN_PER_APPLICATION_LIMIT)
  private String sendPinPerApplicationLimit = "10000/1d";

  public static final String SERIALIZED_NAME_SEND_PIN_PER_PHONE_NUMBER_LIMIT =
      "sendPinPerPhoneNumberLimit";

  @SerializedName(SERIALIZED_NAME_SEND_PIN_PER_PHONE_NUMBER_LIMIT)
  private String sendPinPerPhoneNumberLimit = "3/1d";

  public static final String SERIALIZED_NAME_VERIFY_PIN_LIMIT = "verifyPinLimit";

  @SerializedName(SERIALIZED_NAME_VERIFY_PIN_LIMIT)
  private String verifyPinLimit = "1/3s";

  public TfaApplicationConfiguration allowMultiplePinVerifications(
      Boolean allowMultiplePinVerifications) {

    this.allowMultiplePinVerifications = allowMultiplePinVerifications;
    return this;
  }

  /**
   * Tells if multiple PIN verifications are allowed.
   *
   * @return allowMultiplePinVerifications
   */
  public Boolean getAllowMultiplePinVerifications() {
    return allowMultiplePinVerifications;
  }

  public void setAllowMultiplePinVerifications(Boolean allowMultiplePinVerifications) {
    this.allowMultiplePinVerifications = allowMultiplePinVerifications;
  }

  public TfaApplicationConfiguration pinAttempts(Integer pinAttempts) {

    this.pinAttempts = pinAttempts;
    return this;
  }

  /**
   * Number of possible PIN attempts.
   *
   * @return pinAttempts
   */
  public Integer getPinAttempts() {
    return pinAttempts;
  }

  public void setPinAttempts(Integer pinAttempts) {
    this.pinAttempts = pinAttempts;
  }

  public TfaApplicationConfiguration pinTimeToLive(String pinTimeToLive) {

    this.pinTimeToLive = pinTimeToLive;
    return this;
  }

  /**
   * PIN time to live.
   *
   * @return pinTimeToLive
   */
  public String getPinTimeToLive() {
    return pinTimeToLive;
  }

  public void setPinTimeToLive(String pinTimeToLive) {
    this.pinTimeToLive = pinTimeToLive;
  }

  public TfaApplicationConfiguration sendPinPerApplicationLimit(String sendPinPerApplicationLimit) {

    this.sendPinPerApplicationLimit = sendPinPerApplicationLimit;
    return this;
  }

  /**
   * Overall number of requests in time interval for generating a PIN and sending an SMS using
   * single application.
   *
   * @return sendPinPerApplicationLimit
   */
  public String getSendPinPerApplicationLimit() {
    return sendPinPerApplicationLimit;
  }

  public void setSendPinPerApplicationLimit(String sendPinPerApplicationLimit) {
    this.sendPinPerApplicationLimit = sendPinPerApplicationLimit;
  }

  public TfaApplicationConfiguration sendPinPerPhoneNumberLimit(String sendPinPerPhoneNumberLimit) {

    this.sendPinPerPhoneNumberLimit = sendPinPerPhoneNumberLimit;
    return this;
  }

  /**
   * Number of requests in time interval for generating a PIN and sending an SMS to one phone number
   * (MSISDN).
   *
   * @return sendPinPerPhoneNumberLimit
   */
  public String getSendPinPerPhoneNumberLimit() {
    return sendPinPerPhoneNumberLimit;
  }

  public void setSendPinPerPhoneNumberLimit(String sendPinPerPhoneNumberLimit) {
    this.sendPinPerPhoneNumberLimit = sendPinPerPhoneNumberLimit;
  }

  public TfaApplicationConfiguration verifyPinLimit(String verifyPinLimit) {

    this.verifyPinLimit = verifyPinLimit;
    return this;
  }

  /**
   * Number of PIN verification requests in time interval from one phone number (MSISDN).
   *
   * @return verifyPinLimit
   */
  public String getVerifyPinLimit() {
    return verifyPinLimit;
  }

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
            this.allowMultiplePinVerifications,
            tfaApplicationConfiguration.allowMultiplePinVerifications)
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
    StringBuilder sb = new StringBuilder();
    sb.append("class TfaApplicationConfiguration {\n");
    sb.append("    allowMultiplePinVerifications: ")
        .append(toIndentedString(allowMultiplePinVerifications))
        .append("\n");
    sb.append("    pinAttempts: ").append(toIndentedString(pinAttempts)).append("\n");
    sb.append("    pinTimeToLive: ").append(toIndentedString(pinTimeToLive)).append("\n");
    sb.append("    sendPinPerApplicationLimit: ")
        .append(toIndentedString(sendPinPerApplicationLimit))
        .append("\n");
    sb.append("    sendPinPerPhoneNumberLimit: ")
        .append(toIndentedString(sendPinPerPhoneNumberLimit))
        .append("\n");
    sb.append("    verifyPinLimit: ").append(toIndentedString(verifyPinLimit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
