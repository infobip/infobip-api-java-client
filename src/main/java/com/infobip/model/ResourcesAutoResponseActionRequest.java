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
 * Auto-response action configuration.
 */
public class ResourcesAutoResponseActionRequest {

    private String message;

    private String sender;

    private ResourcesDeliveryTimeWindow deliveryTimeWindow;

    /**
     * Sets message.
     * <p>
     * Field description:
     * Text that will be sent as a response message.
     * <p>
     * The field is required.
     *
     * @param message
     * @return This {@link ResourcesAutoResponseActionRequest instance}.
     */
    public ResourcesAutoResponseActionRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns message.
     * <p>
     * Field description:
     * Text that will be sent as a response message.
     * <p>
     * The field is required.
     *
     * @return message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     * <p>
     * Field description:
     * Text that will be sent as a response message.
     * <p>
     * The field is required.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * If set, it will override the sender of the message in autoresponse sent to the user.
     *
     * @param sender
     * @return This {@link ResourcesAutoResponseActionRequest instance}.
     */
    public ResourcesAutoResponseActionRequest sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * If set, it will override the sender of the message in autoresponse sent to the user.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * If set, it will override the sender of the message in autoresponse sent to the user.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     * @return This {@link ResourcesAutoResponseActionRequest instance}.
     */
    public ResourcesAutoResponseActionRequest deliveryTimeWindow(ResourcesDeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }

    /**
     * Returns deliveryTimeWindow.
     *
     * @return deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public ResourcesDeliveryTimeWindow getDeliveryTimeWindow() {
        return deliveryTimeWindow;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public void setDeliveryTimeWindow(ResourcesDeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesAutoResponseActionRequest resourcesAutoResponseActionRequest = (ResourcesAutoResponseActionRequest) o;
        return Objects.equals(this.message, resourcesAutoResponseActionRequest.message)
                && Objects.equals(this.sender, resourcesAutoResponseActionRequest.sender)
                && Objects.equals(this.deliveryTimeWindow, resourcesAutoResponseActionRequest.deliveryTimeWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, sender, deliveryTimeWindow);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAutoResponseActionRequest {")
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    deliveryTimeWindow: ")
                .append(toIndentedString(deliveryTimeWindow))
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
