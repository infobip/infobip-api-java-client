/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Options for scheduling a message.
 */
public class EmailRequestSchedulingSettings {

    private String bulkId;

    private String sendAt;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response.
     *
     * @param bulkId
     * @return This {@link EmailRequestSchedulingSettings instance}.
     */
    public EmailRequestSchedulingSettings bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response.
     *
     * @return bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request. If not provided, it will be auto-generated and returned in the API response.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for scheduled messages. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 5 days in advance.
     *
     * @param sendAt
     * @return This {@link EmailRequestSchedulingSettings instance}.
     */
    public EmailRequestSchedulingSettings sendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Returns sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for scheduled messages. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 5 days in advance.
     *
     * @return sendAt
     */
    @JsonProperty("sendAt")
    public String getSendAt() {
        return sendAt;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for scheduled messages. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 5 days in advance.
     *
     * @param sendAt
     */
    @JsonProperty("sendAt")
    public void setSendAt(String sendAt) {
        this.sendAt = sendAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailRequestSchedulingSettings emailRequestSchedulingSettings = (EmailRequestSchedulingSettings) o;
        return Objects.equals(this.bulkId, emailRequestSchedulingSettings.bulkId)
                && Objects.equals(this.sendAt, emailRequestSchedulingSettings.sendAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, sendAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailRequestSchedulingSettings {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    sendAt: ")
                .append(toIndentedString(sendAt))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
