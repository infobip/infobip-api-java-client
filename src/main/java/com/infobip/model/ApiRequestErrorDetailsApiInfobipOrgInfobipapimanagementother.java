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

/** ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother */
public class ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother {
  public static final String SERIALIZED_NAME_ADDITIONAL_DESCRIPTION = "additionalDescription";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DESCRIPTION)
  private String additionalDescription;

  public static final String SERIALIZED_NAME_TEXT = "text";

  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";

  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private String variables;

  public ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother additionalDescription(
      String additionalDescription) {

    this.additionalDescription = additionalDescription;
    return this;
  }

  /**
   * Get additionalDescription
   *
   * @return additionalDescription
   */
  public String getAdditionalDescription() {
    return additionalDescription;
  }

  public void setAdditionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
  }

  public ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother text(String text) {

    this.text = text;
    return this;
  }

  /**
   * Get text
   *
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother messageId(String messageId) {

    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   *
   * @return messageId
   */
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother variables(String variables) {

    this.variables = variables;
    return this;
  }

  /**
   * Get variables
   *
   * @return variables
   */
  public String getVariables() {
    return variables;
  }

  public void setVariables(String variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother
        apiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother =
            (ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother) o;
    return Objects.equals(
            this.additionalDescription,
            apiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother.additionalDescription)
        && Objects.equals(
            this.text, apiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother.text)
        && Objects.equals(
            this.messageId, apiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother.messageId)
        && Objects.equals(
            this.variables, apiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDescription, text, messageId, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestErrorDetailsApiInfobipOrgInfobipapimanagementother {\n");
    sb.append("    additionalDescription: ")
        .append(toIndentedString(additionalDescription))
        .append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
