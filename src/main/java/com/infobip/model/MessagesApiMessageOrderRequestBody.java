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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents MessagesApiMessageOrderRequestBody model.
 */
public class MessagesApiMessageOrderRequestBody extends MessagesApiMessageBody {

    private String text;

    private String subtext;

    private String imageUrl;

    private MessagesApiMessageOrder order;

    private MessagesApiMessagePayment payment;

    private List<MessagesApiMessageShipping> shippings = null;

    /**
     * Constructs a new {@link MessagesApiMessageOrderRequestBody} instance.
     */
    public MessagesApiMessageOrderRequestBody() {
        super("ORDER_REQUEST");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Payment request title.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Payment request title.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Payment request title.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets subtext.
     * <p>
     * Field description:
     * (Apple specific) Payment request subtitle
     *
     * @param subtext
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    /**
     * Returns subtext.
     * <p>
     * Field description:
     * (Apple specific) Payment request subtitle
     *
     * @return subtext
     */
    @JsonProperty("subtext")
    public String getSubtext() {
        return subtext;
    }

    /**
     * Sets subtext.
     * <p>
     * Field description:
     * (Apple specific) Payment request subtitle
     *
     * @param subtext
     */
    @JsonProperty("subtext")
    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of an image sent.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * URL of an image sent.
     *
     * @return imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of an image sent.
     *
     * @param imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Sets order.
     *
     * @param order
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody order(MessagesApiMessageOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Returns order.
     *
     * @return order
     */
    @JsonProperty("order")
    public MessagesApiMessageOrder getOrder() {
        return order;
    }

    /**
     * Sets order.
     *
     * @param order
     */
    @JsonProperty("order")
    public void setOrder(MessagesApiMessageOrder order) {
        this.order = order;
    }

    /**
     * Sets payment.
     * <p>
     * The field is required.
     *
     * @param payment
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody payment(MessagesApiMessagePayment payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Returns payment.
     * <p>
     * The field is required.
     *
     * @return payment
     */
    @JsonProperty("payment")
    public MessagesApiMessagePayment getPayment() {
        return payment;
    }

    /**
     * Sets payment.
     * <p>
     * The field is required.
     *
     * @param payment
     */
    @JsonProperty("payment")
    public void setPayment(MessagesApiMessagePayment payment) {
        this.payment = payment;
    }

    /**
     * Sets shippings.
     * <p>
     * Field description:
     * An array of shipping information. For WhatsApp only one item allowed, for Apple many allowed.
     *
     * @param shippings
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody shippings(List<MessagesApiMessageShipping> shippings) {
        this.shippings = shippings;
        return this;
    }

    /**
     * Adds and item into shippings.
     * <p>
     * Field description:
     * An array of shipping information. For WhatsApp only one item allowed, for Apple many allowed.
     *
     * @param shippingsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageOrderRequestBody instance}.
     */
    public MessagesApiMessageOrderRequestBody addShippingsItem(MessagesApiMessageShipping shippingsItem) {
        if (this.shippings == null) {
            this.shippings = new ArrayList<>();
        }
        this.shippings.add(shippingsItem);
        return this;
    }

    /**
     * Returns shippings.
     * <p>
     * Field description:
     * An array of shipping information. For WhatsApp only one item allowed, for Apple many allowed.
     *
     * @return shippings
     */
    @JsonProperty("shippings")
    public List<MessagesApiMessageShipping> getShippings() {
        return shippings;
    }

    /**
     * Sets shippings.
     * <p>
     * Field description:
     * An array of shipping information. For WhatsApp only one item allowed, for Apple many allowed.
     *
     * @param shippings
     */
    @JsonProperty("shippings")
    public void setShippings(List<MessagesApiMessageShipping> shippings) {
        this.shippings = shippings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrderRequestBody messagesApiMessageOrderRequestBody = (MessagesApiMessageOrderRequestBody) o;
        return Objects.equals(this.text, messagesApiMessageOrderRequestBody.text)
                && Objects.equals(this.subtext, messagesApiMessageOrderRequestBody.subtext)
                && Objects.equals(this.imageUrl, messagesApiMessageOrderRequestBody.imageUrl)
                && Objects.equals(this.order, messagesApiMessageOrderRequestBody.order)
                && Objects.equals(this.payment, messagesApiMessageOrderRequestBody.payment)
                && Objects.equals(this.shippings, messagesApiMessageOrderRequestBody.shippings)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, subtext, imageUrl, order, payment, shippings, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderRequestBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    subtext: ")
                .append(toIndentedString(subtext))
                .append(newLine)
                .append("    imageUrl: ")
                .append(toIndentedString(imageUrl))
                .append(newLine)
                .append("    order: ")
                .append(toIndentedString(order))
                .append(newLine)
                .append("    payment: ")
                .append(toIndentedString(payment))
                .append(newLine)
                .append("    shippings: ")
                .append(toIndentedString(shippings))
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
