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
 * Message ordering options.
 */
public class MessagesApiMessageOrderingOptions {

    private Boolean respectOrder;

    private Boolean stopOnFailure;

    /**
     * Sets respectOrder.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, messages will be sent in the same order as they are provided in the request.
     *
     * @param respectOrder
     * @return This {@link MessagesApiMessageOrderingOptions instance}.
     */
    public MessagesApiMessageOrderingOptions respectOrder(Boolean respectOrder) {
        this.respectOrder = respectOrder;
        return this;
    }

    /**
     * Returns respectOrder.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, messages will be sent in the same order as they are provided in the request.
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
     * If set to &#x60;true&#x60;, messages will be sent in the same order as they are provided in the request.
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
     * It can be used in combination with &#x60;respectOrder&#x60; to stop sending messages when first message from request fails.
     *
     * @param stopOnFailure
     * @return This {@link MessagesApiMessageOrderingOptions instance}.
     */
    public MessagesApiMessageOrderingOptions stopOnFailure(Boolean stopOnFailure) {
        this.stopOnFailure = stopOnFailure;
        return this;
    }

    /**
     * Returns stopOnFailure.
     * <p>
     * Field description:
     * It can be used in combination with &#x60;respectOrder&#x60; to stop sending messages when first message from request fails.
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
     * It can be used in combination with &#x60;respectOrder&#x60; to stop sending messages when first message from request fails.
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
        MessagesApiMessageOrderingOptions messagesApiMessageOrderingOptions = (MessagesApiMessageOrderingOptions) o;
        return Objects.equals(this.respectOrder, messagesApiMessageOrderingOptions.respectOrder)
                && Objects.equals(this.stopOnFailure, messagesApiMessageOrderingOptions.stopOnFailure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(respectOrder, stopOnFailure);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderingOptions {")
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
