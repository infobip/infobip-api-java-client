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

/** TfaVerification */
public class TfaVerification {
  public static final String SERIALIZED_NAME_MSISDN = "msisdn";

  @SerializedName(SERIALIZED_NAME_MSISDN)
  private String msisdn;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";

  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_VERIFIED_AT = "verifiedAt";

  @SerializedName(SERIALIZED_NAME_VERIFIED_AT)
  private Long verifiedAt;

  public static final String SERIALIZED_NAME_SENT_AT = "sentAt";

  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private Long sentAt;

  /**
   * Phone number (MSISDN) for which verification status is checked.
   *
   * @return msisdn
   */
  public String getMsisdn() {
    return msisdn;
  }

  /**
   * Indicates if the phone number (MSISDN) is already verified for 2FA application with given ID.
   *
   * @return verified
   */
  public Boolean getVerified() {
    return verified;
  }

  /**
   * Verification UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
   *
   * @return verifiedAt
   */
  public Long getVerifiedAt() {
    return verifiedAt;
  }

  /**
   * Sent UNIX timestamp (in millis), if the phone number (MSISDN) is verified.
   *
   * @return sentAt
   */
  public Long getSentAt() {
    return sentAt;
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
        && Objects.equals(this.verified, tfaVerification.verified)
        && Objects.equals(this.verifiedAt, tfaVerification.verifiedAt)
        && Objects.equals(this.sentAt, tfaVerification.sentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, verified, verifiedAt, sentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfaVerification {\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
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
