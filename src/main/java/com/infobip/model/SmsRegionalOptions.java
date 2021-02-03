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

/** SmsRegionalOptions */
public class SmsRegionalOptions {
  public static final String SERIALIZED_NAME_INDIA_DLT = "indiaDlt";

  @SerializedName(SERIALIZED_NAME_INDIA_DLT)
  private SmsIndiaDltOptions indiaDlt = null;

  public SmsRegionalOptions indiaDlt(SmsIndiaDltOptions indiaDlt) {

    this.indiaDlt = indiaDlt;
    return this;
  }

  /**
   * Distributed Ledger Technology (DLT) specific parameters required for sending SMS to phone
   * numbers registered in India.
   *
   * @return indiaDlt
   */
  public SmsIndiaDltOptions getIndiaDlt() {
    return indiaDlt;
  }

  public void setIndiaDlt(SmsIndiaDltOptions indiaDlt) {
    this.indiaDlt = indiaDlt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsRegionalOptions smsRegionalOptions = (SmsRegionalOptions) o;
    return Objects.equals(this.indiaDlt, smsRegionalOptions.indiaDlt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indiaDlt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsRegionalOptions {\n");
    sb.append("    indiaDlt: ").append(toIndentedString(indiaDlt)).append("\n");
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
