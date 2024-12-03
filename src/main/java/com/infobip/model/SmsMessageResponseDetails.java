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
 * Other details of the message.
 */
public class SmsMessageResponseDetails {

    private Integer messageCount;

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of SMS message parts required to deliver the message.
     *
     * @param messageCount
     * @return This {@link SmsMessageResponseDetails instance}.
     */
    public SmsMessageResponseDetails messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * Number of SMS message parts required to deliver the message.
     *
     * @return messageCount
     */
    @JsonProperty("messageCount")
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of SMS message parts required to deliver the message.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsMessageResponseDetails smsMessageResponseDetails = (SmsMessageResponseDetails) o;
        return Objects.equals(this.messageCount, smsMessageResponseDetails.messageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsMessageResponseDetails {")
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
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
