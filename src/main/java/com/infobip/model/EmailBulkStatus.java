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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EmailBulkStatus */
@JsonAdapter(EmailBulkStatus.Adapter.class)
public enum EmailBulkStatus {
  PENDING("PENDING"),

  PAUSED("PAUSED"),

  PROCESSING("PROCESSING"),

  CANCELED("CANCELED"),

  FINISHED("FINISHED"),

  FAILED("FAILED");

  private String value;

  EmailBulkStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmailBulkStatus fromValue(String value) {
    for (EmailBulkStatus b : EmailBulkStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EmailBulkStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmailBulkStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EmailBulkStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EmailBulkStatus.fromValue(value);
    }
  }
}
