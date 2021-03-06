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
import java.util.List;
import java.util.Objects;

/** TfaVerificationResponse */
public class TfaVerificationResponse {
  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";

  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private List<TfaVerification> verifications = null;

  /**
   * Collection of verifications
   *
   * @return verifications
   */
  public List<TfaVerification> getVerifications() {
    return verifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaVerificationResponse tfaVerificationResponse = (TfaVerificationResponse) o;
    return Objects.equals(this.verifications, tfaVerificationResponse.verifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfaVerificationResponse {\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
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
