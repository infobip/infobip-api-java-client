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
public class RcsAdvancedWebhooksWithSeen {

    private RcsAdvancedMessageDeliveryReporting delivery;

    private String contentType;

    private String callbackData;

    private RcsSeenStatusReporting seen;

    /**
     * Sets delivery.
     *
     * @param delivery
     * @return This {@link RcsAdvancedWebhooksWithSeen instance}.
     */
    public RcsAdvancedWebhooksWithSeen delivery(RcsAdvancedMessageDeliveryReporting delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Returns delivery.
     *
     * @return delivery
     */
    @JsonProperty("delivery")
    public RcsAdvancedMessageDeliveryReporting getDelivery() {
        return delivery;
    }

    /**
     * Sets delivery.
     *
     * @param delivery
     */
    @JsonProperty("delivery")
    public void setDelivery(RcsAdvancedMessageDeliveryReporting delivery) {
        this.delivery = delivery;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param contentType
     * @return This {@link RcsAdvancedWebhooksWithSeen instance}.
     */
    public RcsAdvancedWebhooksWithSeen contentType(String contentType) {
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
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message Delivery Report. The maximum value is 4000 characters.
     *
     * @param callbackData
     * @return This {@link RcsAdvancedWebhooksWithSeen instance}.
     */
    public RcsAdvancedWebhooksWithSeen callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message Delivery Report. The maximum value is 4000 characters.
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
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message Delivery Report. The maximum value is 4000 characters.
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
     * @return This {@link RcsAdvancedWebhooksWithSeen instance}.
     */
    public RcsAdvancedWebhooksWithSeen seen(RcsSeenStatusReporting seen) {
        this.seen = seen;
        return this;
    }

    /**
     * Returns seen.
     *
     * @return seen
     */
    @JsonProperty("seen")
    public RcsSeenStatusReporting getSeen() {
        return seen;
    }

    /**
     * Sets seen.
     *
     * @param seen
     */
    @JsonProperty("seen")
    public void setSeen(RcsSeenStatusReporting seen) {
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
        RcsAdvancedWebhooksWithSeen rcsAdvancedWebhooksWithSeen = (RcsAdvancedWebhooksWithSeen) o;
        return Objects.equals(this.delivery, rcsAdvancedWebhooksWithSeen.delivery)
                && Objects.equals(this.contentType, rcsAdvancedWebhooksWithSeen.contentType)
                && Objects.equals(this.callbackData, rcsAdvancedWebhooksWithSeen.callbackData)
                && Objects.equals(this.seen, rcsAdvancedWebhooksWithSeen.seen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delivery, contentType, callbackData, seen);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsAdvancedWebhooksWithSeen {")
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
