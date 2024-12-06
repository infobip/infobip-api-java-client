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
 * An array of destination objects for where messages are being sent. A valid destination is required.
 */
public class SmsDestination {

    private String to;

    private String messageId;

    private Integer networkId;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link SmsDestination instance}.
     */
    public SmsDestination to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The destination address of the message.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link SmsDestination instance}.
     */
    public SmsDestination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets networkId.
     * <p>
     * Field description:
     * Available in US and Canada only if networkId is known for Network Operator of the destination. Returned in [SMS message delivery reports](https://www.infobip.com/docs/api/channels/sms/sms-messaging/logs-and-status-reports) and [Inbound SMS](https://www.infobip.com/docs/api/channels/sms/sms-messaging/inbound-sms); contact Infobip Support to enable.
     *
     * @param networkId
     * @return This {@link SmsDestination instance}.
     */
    public SmsDestination networkId(Integer networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Returns networkId.
     * <p>
     * Field description:
     * Available in US and Canada only if networkId is known for Network Operator of the destination. Returned in [SMS message delivery reports](https://www.infobip.com/docs/api/channels/sms/sms-messaging/logs-and-status-reports) and [Inbound SMS](https://www.infobip.com/docs/api/channels/sms/sms-messaging/inbound-sms); contact Infobip Support to enable.
     *
     * @return networkId
     */
    @JsonProperty("networkId")
    public Integer getNetworkId() {
        return networkId;
    }

    /**
     * Sets networkId.
     * <p>
     * Field description:
     * Available in US and Canada only if networkId is known for Network Operator of the destination. Returned in [SMS message delivery reports](https://www.infobip.com/docs/api/channels/sms/sms-messaging/logs-and-status-reports) and [Inbound SMS](https://www.infobip.com/docs/api/channels/sms/sms-messaging/inbound-sms); contact Infobip Support to enable.
     *
     * @param networkId
     */
    @JsonProperty("networkId")
    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsDestination smsDestination = (SmsDestination) o;
        return Objects.equals(this.to, smsDestination.to)
                && Objects.equals(this.messageId, smsDestination.messageId)
                && Objects.equals(this.networkId, smsDestination.networkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, messageId, networkId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsDestination {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    networkId: ")
                .append(toIndentedString(networkId))
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
