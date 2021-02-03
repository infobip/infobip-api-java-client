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

/** SmsPreviewRequest */
public class SmsPreviewRequest {
  public static final String SERIALIZED_NAME_TRANSLITERATION = "transliteration";

  @SerializedName(SERIALIZED_NAME_TRANSLITERATION)
  private String transliteration;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";

  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_TEXT = "text";

  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public SmsPreviewRequest transliteration(String transliteration) {

    this.transliteration = transliteration;
    return this;
  }

  /**
   * Conversion of a message text from one script to another. Possible values: &#x60;TURKISH&#x60;,
   * &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;,
   * &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60; and &#x60;NON_UNICODE&#x60;.
   *
   * @return transliteration
   */
  public String getTransliteration() {
    return transliteration;
  }

  public void setTransliteration(String transliteration) {
    this.transliteration = transliteration;
  }

  public SmsPreviewRequest languageCode(String languageCode) {

    this.languageCode = languageCode;
    return this;
  }

  /**
   * Code for language character set of a message text. Possible values: &#x60;TR&#x60; for Turkish,
   * &#x60;ES&#x60; for Spanish, &#x60;PT&#x60; for Portuguese and &#x60;AUTODETECT&#x60; to let
   * platform pick character set automatically based on the message text.
   *
   * @return languageCode
   */
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public SmsPreviewRequest text(String text) {

    this.text = text;
    return this;
  }

  /**
   * Message text to preview.
   *
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsPreviewRequest smsPreviewRequest = (SmsPreviewRequest) o;
    return Objects.equals(this.transliteration, smsPreviewRequest.transliteration)
        && Objects.equals(this.languageCode, smsPreviewRequest.languageCode)
        && Objects.equals(this.text, smsPreviewRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transliteration, languageCode, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsPreviewRequest {\n");
    sb.append("    transliteration: ").append(toIndentedString(transliteration)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
