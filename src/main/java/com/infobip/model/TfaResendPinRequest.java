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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** TfaResendPinRequest */
public class TfaResendPinRequest {
  public static final String SERIALIZED_NAME_PLACEHOLDERS = "placeholders";

  @SerializedName(SERIALIZED_NAME_PLACEHOLDERS)
  private Map<String, String> placeholders = null;

  public TfaResendPinRequest placeholders(Map<String, String> placeholders) {

    this.placeholders = placeholders;
    return this;
  }

  public TfaResendPinRequest putPlaceholdersItem(String key, String placeholdersItem) {
    if (this.placeholders == null) {
      this.placeholders = new HashMap<>();
    }
    this.placeholders.put(key, placeholdersItem);
    return this;
  }

  /**
   * Key value pairs that will be replaced during message sending. Placeholder keys should NOT
   * contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example:
   * &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
   *
   * @return placeholders
   */
  public Map<String, String> getPlaceholders() {
    return placeholders;
  }

  public void setPlaceholders(Map<String, String> placeholders) {
    this.placeholders = placeholders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaResendPinRequest tfaResendPinRequest = (TfaResendPinRequest) o;
    return Objects.equals(this.placeholders, tfaResendPinRequest.placeholders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeholders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfaResendPinRequest {\n");
    sb.append("    placeholders: ").append(toIndentedString(placeholders)).append("\n");
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
