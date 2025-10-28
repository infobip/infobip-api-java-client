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
 * Represents MessagesApiMessageOrderStatusBody model.
 */
public class MessagesApiMessageOrderStatusBody extends MessagesApiMessageBody {

    private String title;

    private String id;

    private MessagesApiMessageOrderStatusOrderType orderType;

    private MessagesApiMessageOrderStatusOrderStatus orderStatus;

    private String description;

    /**
     * Constructs a new {@link MessagesApiMessageOrderStatusBody} instance.
     */
    public MessagesApiMessageOrderStatusBody() {
        super("ORDER_STATUS");
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Content of the message body.
     *
     * @param title
     * @return This {@link MessagesApiMessageOrderStatusBody instance}.
     */
    public MessagesApiMessageOrderStatusBody title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Content of the message body.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Content of the message body.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link MessagesApiMessageOrderStatusBody instance}.
     */
    public MessagesApiMessageOrderStatusBody id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets orderType.
     * <p>
     * The field is required.
     *
     * @param orderType
     * @return This {@link MessagesApiMessageOrderStatusBody instance}.
     */
    public MessagesApiMessageOrderStatusBody orderType(MessagesApiMessageOrderStatusOrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * Returns orderType.
     * <p>
     * The field is required.
     *
     * @return orderType
     */
    @JsonProperty("orderType")
    public MessagesApiMessageOrderStatusOrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets orderType.
     * <p>
     * The field is required.
     *
     * @param orderType
     */
    @JsonProperty("orderType")
    public void setOrderType(MessagesApiMessageOrderStatusOrderType orderType) {
        this.orderType = orderType;
    }

    /**
     * Sets orderStatus.
     * <p>
     * The field is required.
     *
     * @param orderStatus
     * @return This {@link MessagesApiMessageOrderStatusBody instance}.
     */
    public MessagesApiMessageOrderStatusBody orderStatus(MessagesApiMessageOrderStatusOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * Returns orderStatus.
     * <p>
     * The field is required.
     *
     * @return orderStatus
     */
    @JsonProperty("orderStatus")
    public MessagesApiMessageOrderStatusOrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets orderStatus.
     * <p>
     * The field is required.
     *
     * @param orderStatus
     */
    @JsonProperty("orderStatus")
    public void setOrderStatus(MessagesApiMessageOrderStatusOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the order status.
     *
     * @param description
     * @return This {@link MessagesApiMessageOrderStatusBody instance}.
     */
    public MessagesApiMessageOrderStatusBody description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the order status.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the order status.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrderStatusBody messagesApiMessageOrderStatusBody = (MessagesApiMessageOrderStatusBody) o;
        return Objects.equals(this.title, messagesApiMessageOrderStatusBody.title)
                && Objects.equals(this.id, messagesApiMessageOrderStatusBody.id)
                && Objects.equals(this.orderType, messagesApiMessageOrderStatusBody.orderType)
                && Objects.equals(this.orderStatus, messagesApiMessageOrderStatusBody.orderStatus)
                && Objects.equals(this.description, messagesApiMessageOrderStatusBody.description)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id, orderType, orderStatus, description, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderStatusBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    orderType: ")
                .append(toIndentedString(orderType))
                .append(newLine)
                .append("    orderStatus: ")
                .append(toIndentedString(orderStatus))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
