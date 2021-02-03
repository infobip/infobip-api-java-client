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

/** SmsIndiaDltOptions */
public class SmsIndiaDltOptions {
  public static final String SERIALIZED_NAME_CONTENT_TEMPLATE_ID = "contentTemplateId";

  @SerializedName(SERIALIZED_NAME_CONTENT_TEMPLATE_ID)
  private String contentTemplateId;

  public static final String SERIALIZED_NAME_PRINCIPAL_ENTITY_ID = "principalEntityId";

  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ENTITY_ID)
  private String principalEntityId;

  public SmsIndiaDltOptions contentTemplateId(String contentTemplateId) {

    this.contentTemplateId = contentTemplateId;
    return this;
  }

  /**
   * Id of your registered DTL content template that matches this message&#39;s text.
   *
   * @return contentTemplateId
   */
  public String getContentTemplateId() {
    return contentTemplateId;
  }

  public void setContentTemplateId(String contentTemplateId) {
    this.contentTemplateId = contentTemplateId;
  }

  public SmsIndiaDltOptions principalEntityId(String principalEntityId) {

    this.principalEntityId = principalEntityId;
    return this;
  }

  /**
   * Your assigned DTL principal entity id.
   *
   * @return principalEntityId
   */
  public String getPrincipalEntityId() {
    return principalEntityId;
  }

  public void setPrincipalEntityId(String principalEntityId) {
    this.principalEntityId = principalEntityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsIndiaDltOptions smsIndiaDltOptions = (SmsIndiaDltOptions) o;
    return Objects.equals(this.contentTemplateId, smsIndiaDltOptions.contentTemplateId)
        && Objects.equals(this.principalEntityId, smsIndiaDltOptions.principalEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentTemplateId, principalEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsIndiaDltOptions {\n");
    sb.append("    contentTemplateId: ").append(toIndentedString(contentTemplateId)).append("\n");
    sb.append("    principalEntityId: ").append(toIndentedString(principalEntityId)).append("\n");
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
