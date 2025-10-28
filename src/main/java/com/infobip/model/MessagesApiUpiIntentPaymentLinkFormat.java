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
 * Represents MessagesApiUpiIntentPaymentLinkFormat model.
 */
public class MessagesApiUpiIntentPaymentLinkFormat extends MessagesApiUpiIntentPaymentFormat {

    private String paymentLink;

    /**
     * Constructs a new {@link MessagesApiUpiIntentPaymentLinkFormat} instance.
     */
    public MessagesApiUpiIntentPaymentLinkFormat() {
        super("LINK");
    }

    /**
     * Sets paymentLink.
     * <p>
     * Field description:
     * Payment link.
     *
     * @param paymentLink
     * @return This {@link MessagesApiUpiIntentPaymentLinkFormat instance}.
     */
    public MessagesApiUpiIntentPaymentLinkFormat paymentLink(String paymentLink) {
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
        MessagesApiUpiIntentPaymentLinkFormat messagesApiUpiIntentPaymentLinkFormat =
                (MessagesApiUpiIntentPaymentLinkFormat) o;
        return Objects.equals(this.paymentLink, messagesApiUpiIntentPaymentLinkFormat.paymentLink) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentLink, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiUpiIntentPaymentLinkFormat {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
