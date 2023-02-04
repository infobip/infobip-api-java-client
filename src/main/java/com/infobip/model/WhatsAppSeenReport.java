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
import java.time.OffsetDateTime;
import java.util.Objects;

/** WhatsAppSeenReport */
public class WhatsAppSeenReport {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";

  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_SENT_AT = "sentAt";

  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_SEEN_AT = "seenAt";

  @SerializedName(SERIALIZED_NAME_SEEN_AT)
  private OffsetDateTime seenAt;

  public WhatsAppSeenReport messageId(String messageId) {

    this.messageId = messageId;
    return this;
  }

  /**
   * The ID of the sent message.
   *
   * @return messageId
   */
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public WhatsAppSeenReport from(String from) {

    this.from = from;
    return this;
  }

  /**
   * Number which sent the message.
   *
   * @return from
   */
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public WhatsAppSeenReport to(String to) {

    this.to = to;
    return this;
  }

  /**
   * Registered WhatsApp business number.
   *
   * @return to
   */
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public WhatsAppSeenReport sentAt(OffsetDateTime sentAt) {

    this.sentAt = sentAt;
    return this;
  }

  /**
   * Tells when the message was sent.
   *
   * @return sentAt
   */
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }

  public WhatsAppSeenReport seenAt(OffsetDateTime seenAt) {

    this.seenAt = seenAt;
    return this;
  }

  /**
   * Tells when the message was seen.
   *
   * @return seenAt
   */
  public OffsetDateTime getSeenAt() {
    return seenAt;
  }

  public void setSeenAt(OffsetDateTime seenAt) {
    this.seenAt = seenAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppSeenReport whatsAppSeenReport = (WhatsAppSeenReport) o;
    return Objects.equals(this.messageId, whatsAppSeenReport.messageId)
        && Objects.equals(this.from, whatsAppSeenReport.from)
        && Objects.equals(this.to, whatsAppSeenReport.to)
        && Objects.equals(this.sentAt, whatsAppSeenReport.sentAt)
        && Objects.equals(this.seenAt, whatsAppSeenReport.seenAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, from, to, sentAt, seenAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppSeenReport {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
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