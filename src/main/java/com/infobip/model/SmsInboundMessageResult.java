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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SmsInboundMessageResult */
public class SmsInboundMessageResult {
  public static final String SERIALIZED_NAME_MESSAGE_COUNT = "messageCount";

  @SerializedName(SERIALIZED_NAME_MESSAGE_COUNT)
  private Integer messageCount;

  public static final String SERIALIZED_NAME_PENDING_MESSAGE_COUNT = "pendingMessageCount";

  @SerializedName(SERIALIZED_NAME_PENDING_MESSAGE_COUNT)
  private Integer pendingMessageCount;

  public static final String SERIALIZED_NAME_RESULTS = "results";

  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<SmsInboundMessage> results = null;

  public SmsInboundMessageResult messageCount(Integer messageCount) {

    this.messageCount = messageCount;
    return this;
  }

  /**
   * Get messageCount
   *
   * @return messageCount
   */
  public Integer getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  public SmsInboundMessageResult pendingMessageCount(Integer pendingMessageCount) {

    this.pendingMessageCount = pendingMessageCount;
    return this;
  }

  /**
   * Get pendingMessageCount
   *
   * @return pendingMessageCount
   */
  public Integer getPendingMessageCount() {
    return pendingMessageCount;
  }

  public void setPendingMessageCount(Integer pendingMessageCount) {
    this.pendingMessageCount = pendingMessageCount;
  }

  public SmsInboundMessageResult results(List<SmsInboundMessage> results) {

    this.results = results;
    return this;
  }

  public SmsInboundMessageResult addResultsItem(SmsInboundMessage resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   *
   * @return results
   */
  public List<SmsInboundMessage> getResults() {
    return results;
  }

  public void setResults(List<SmsInboundMessage> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsInboundMessageResult smsInboundMessageResult = (SmsInboundMessageResult) o;
    return Objects.equals(this.messageCount, smsInboundMessageResult.messageCount)
        && Objects.equals(this.pendingMessageCount, smsInboundMessageResult.pendingMessageCount)
        && Objects.equals(this.results, smsInboundMessageResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageCount, pendingMessageCount, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsInboundMessageResult {\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    pendingMessageCount: ")
        .append(toIndentedString(pendingMessageCount))
        .append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
