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
 * Provides options for configuring message webhooks.
 */
public class MessagesApiWebhooks {

    private MessagesApiMessageDeliveryReporting delivery;

    private String contentType;

    private String callbackData;

    private MessagesApiSeenStatusReporting seen;

    /**
     * Sets delivery.
     *
     * @param delivery
     * @return This {@link MessagesApiWebhooks instance}.
     */
    public MessagesApiWebhooks delivery(MessagesApiMessageDeliveryReporting delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Returns delivery.
     *
     * @return delivery
     */
    @JsonProperty("delivery")
    public MessagesApiMessageDeliveryReporting getDelivery() {
        return delivery;
    }

    /**
     * Sets delivery.
     *
     * @param delivery
     */
    @JsonProperty("delivery")
    public void setDelivery(MessagesApiMessageDeliveryReporting delivery) {
        this.delivery = delivery;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param contentType
     * @return This {@link MessagesApiWebhooks instance}.
     */
    public MessagesApiWebhooks contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @return contentType
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message Delivery Report and Seen Report. The maximum value is 4000 characters.
     *
     * @param callbackData
     * @return This {@link MessagesApiWebhooks instance}.
     */
    public MessagesApiWebhooks callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message Delivery Report and Seen Report. The maximum value is 4000 characters.
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message Delivery Report and Seen Report. The maximum value is 4000 characters.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets seen.
     *
     * @param seen
     * @return This {@link MessagesApiWebhooks instance}.
     */
    public MessagesApiWebhooks seen(MessagesApiSeenStatusReporting seen) {
        this.seen = seen;
        return this;
    }

    /**
     * Returns seen.
     *
     * @return seen
     */
    @JsonProperty("seen")
    public MessagesApiSeenStatusReporting getSeen() {
        return seen;
    }

    /**
     * Sets seen.
     *
     * @param seen
     */
    @JsonProperty("seen")
    public void setSeen(MessagesApiSeenStatusReporting seen) {
        this.seen = seen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhooks messagesApiWebhooks = (MessagesApiWebhooks) o;
        return Objects.equals(this.delivery, messagesApiWebhooks.delivery)
                && Objects.equals(this.contentType, messagesApiWebhooks.contentType)
                && Objects.equals(this.callbackData, messagesApiWebhooks.callbackData)
                && Objects.equals(this.seen, messagesApiWebhooks.seen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delivery, contentType, callbackData, seen);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhooks {")
                .append(newLine)
                .append("    delivery: ")
                .append(toIndentedString(delivery))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    seen: ")
                .append(toIndentedString(seen))
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
