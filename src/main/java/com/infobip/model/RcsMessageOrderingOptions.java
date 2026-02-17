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
 * Represents RcsMessageOrderingOptions model.
 */
public class RcsMessageOrderingOptions {

    private Boolean respectOrder;

    private Boolean stopOnFailure;

    /**
     * Sets respectOrder.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, messages will be sent in the same order as they are provided in the request. Following rules must be respected in that case: * The &#x60;messages&#x60; array can contain either 2 messages, where only the first message has failover defined, or between 2 and 10 messages, none of which has failover defined. * Following properties must be the same for all messages in the request: &#x60;sender&#x60;, &#x60;destinations&#x60;, &#x60;options.platform&#x60;, &#x60;options.deliveryTimeWindow&#x60;, &#x60;options.campaignReferenceId&#x60;, &#x60;webhooks.delivery&#x60;, &#x60;webhooks.contentType&#x60;, &#x60;webhooks.callbackData&#x60;, &#x60;webhooks.seen&#x60;. For best experience, if message ordering is used, it&#39;s recommended to have list of suggestions defined for last message only or have it the same for all messages in the request.
     *
     * @param respectOrder
     * @return This {@link RcsMessageOrderingOptions instance}.
     */
    public RcsMessageOrderingOptions respectOrder(Boolean respectOrder) {
        this.respectOrder = respectOrder;
        return this;
    }

    /**
     * Returns respectOrder.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, messages will be sent in the same order as they are provided in the request. Following rules must be respected in that case: * The &#x60;messages&#x60; array can contain either 2 messages, where only the first message has failover defined, or between 2 and 10 messages, none of which has failover defined. * Following properties must be the same for all messages in the request: &#x60;sender&#x60;, &#x60;destinations&#x60;, &#x60;options.platform&#x60;, &#x60;options.deliveryTimeWindow&#x60;, &#x60;options.campaignReferenceId&#x60;, &#x60;webhooks.delivery&#x60;, &#x60;webhooks.contentType&#x60;, &#x60;webhooks.callbackData&#x60;, &#x60;webhooks.seen&#x60;. For best experience, if message ordering is used, it&#39;s recommended to have list of suggestions defined for last message only or have it the same for all messages in the request.
     *
     * @return respectOrder
     */
    @JsonProperty("respectOrder")
    public Boolean getRespectOrder() {
        return respectOrder;
    }

    /**
     * Sets respectOrder.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, messages will be sent in the same order as they are provided in the request. Following rules must be respected in that case: * The &#x60;messages&#x60; array can contain either 2 messages, where only the first message has failover defined, or between 2 and 10 messages, none of which has failover defined. * Following properties must be the same for all messages in the request: &#x60;sender&#x60;, &#x60;destinations&#x60;, &#x60;options.platform&#x60;, &#x60;options.deliveryTimeWindow&#x60;, &#x60;options.campaignReferenceId&#x60;, &#x60;webhooks.delivery&#x60;, &#x60;webhooks.contentType&#x60;, &#x60;webhooks.callbackData&#x60;, &#x60;webhooks.seen&#x60;. For best experience, if message ordering is used, it&#39;s recommended to have list of suggestions defined for last message only or have it the same for all messages in the request.
     *
     * @param respectOrder
     */
    @JsonProperty("respectOrder")
    public void setRespectOrder(Boolean respectOrder) {
        this.respectOrder = respectOrder;
    }

    /**
     * Sets stopOnFailure.
     * <p>
     * Field description:
     * It can be used in combination with &#x60;respectOrder&#x60; to stop sending messages if any message fails. It will be respected only if none of the messages from the request has failover defined. If failover is used, the system will, by default, send only the failover message and will not send the second message from the request.
     *
     * @param stopOnFailure
     * @return This {@link RcsMessageOrderingOptions instance}.
     */
    public RcsMessageOrderingOptions stopOnFailure(Boolean stopOnFailure) {
        this.stopOnFailure = stopOnFailure;
        return this;
    }

    /**
     * Returns stopOnFailure.
     * <p>
     * Field description:
     * It can be used in combination with &#x60;respectOrder&#x60; to stop sending messages if any message fails. It will be respected only if none of the messages from the request has failover defined. If failover is used, the system will, by default, send only the failover message and will not send the second message from the request.
     *
     * @return stopOnFailure
     */
    @JsonProperty("stopOnFailure")
    public Boolean getStopOnFailure() {
        return stopOnFailure;
    }

    /**
     * Sets stopOnFailure.
     * <p>
     * Field description:
     * It can be used in combination with &#x60;respectOrder&#x60; to stop sending messages if any message fails. It will be respected only if none of the messages from the request has failover defined. If failover is used, the system will, by default, send only the failover message and will not send the second message from the request.
     *
     * @param stopOnFailure
     */
    @JsonProperty("stopOnFailure")
    public void setStopOnFailure(Boolean stopOnFailure) {
        this.stopOnFailure = stopOnFailure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsMessageOrderingOptions rcsMessageOrderingOptions = (RcsMessageOrderingOptions) o;
        return Objects.equals(this.respectOrder, rcsMessageOrderingOptions.respectOrder)
                && Objects.equals(this.stopOnFailure, rcsMessageOrderingOptions.stopOnFailure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(respectOrder, stopOnFailure);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsMessageOrderingOptions {")
                .append(newLine)
                .append("    respectOrder: ")
                .append(toIndentedString(respectOrder))
                .append(newLine)
                .append("    stopOnFailure: ")
                .append(toIndentedString(stopOnFailure))
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
