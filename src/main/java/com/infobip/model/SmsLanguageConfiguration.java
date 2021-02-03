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

/** SmsLanguageConfiguration */
public class SmsLanguageConfiguration {
  public static final String SERIALIZED_NAME_TRANSLITERATION = "transliteration";

  @SerializedName(SERIALIZED_NAME_TRANSLITERATION)
  private String transliteration;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";

  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private SmsLanguage language = null;

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

  public SmsLanguageConfiguration language(SmsLanguage language) {

    this.language = language;
    return this;
  }

  /**
   * Get language
   *
   * @return language
   */
  public SmsLanguage getLanguage() {
    return language;
  }

  public void setLanguage(SmsLanguage language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsLanguageConfiguration smsLanguageConfiguration = (SmsLanguageConfiguration) o;
    return Objects.equals(this.transliteration, smsLanguageConfiguration.transliteration)
        && Objects.equals(this.language, smsLanguageConfiguration.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transliteration, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsLanguageConfiguration {\n");
    sb.append("    transliteration: ").append(toIndentedString(transliteration)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
