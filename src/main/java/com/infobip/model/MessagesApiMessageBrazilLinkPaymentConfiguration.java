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
 * Represents MessagesApiMessageBrazilLinkPaymentConfiguration model.
 */
public class MessagesApiMessageBrazilLinkPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String id;

    private String paymentLink;

    /**
     * Constructs a new {@link MessagesApiMessageBrazilLinkPaymentConfiguration} instance.
     */
    public MessagesApiMessageBrazilLinkPaymentConfiguration() {
        super("BRAZIL_LINK");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     * @return This {@link MessagesApiMessageBrazilLinkPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilLinkPaymentConfiguration id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
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
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets paymentLink.
     * <p>
     * Field description:
     * Payment link.
     *
     * @param paymentLink
     * @return This {@link MessagesApiMessageBrazilLinkPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilLinkPaymentConfiguration paymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
        return this;
    }

    /**
     * Returns paymentLink.
     * <p>
     * Field description:
     * Payment link.
     *
     * @return paymentLink
     */
    @JsonProperty("paymentLink")
    public String getPaymentLink() {
        return paymentLink;
    }

    /**
     * Sets paymentLink.
     * <p>
     * Field description:
     * Payment link.
     *
     * @param paymentLink
     */
    @JsonProperty("paymentLink")
    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageBrazilLinkPaymentConfiguration messagesApiMessageBrazilLinkPaymentConfiguration =
                (MessagesApiMessageBrazilLinkPaymentConfiguration) o;
        return Objects.equals(this.id, messagesApiMessageBrazilLinkPaymentConfiguration.id)
                && Objects.equals(this.paymentLink, messagesApiMessageBrazilLinkPaymentConfiguration.paymentLink)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paymentLink, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageBrazilLinkPaymentConfiguration {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    paymentLink: ")
                .append(toIndentedString(paymentLink))
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
