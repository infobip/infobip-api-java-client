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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Required for WhatsApp, optional for Apple. Type of the payment.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiMessageApplePayPaymentConfiguration.class, name = "APPLE_PAY"),
    @JsonSubTypes.Type(value = MessagesApiMessageBrazilPaymentConfiguration.class, name = "BRAZIL"),
    @JsonSubTypes.Type(value = MessagesApiMessageBrazilBoletoPaymentConfiguration.class, name = "BRAZIL_BOLETO"),
    @JsonSubTypes.Type(value = MessagesApiMessageBrazilLinkPaymentConfiguration.class, name = "BRAZIL_LINK"),
    @JsonSubTypes.Type(value = MessagesApiMessageBrazilPixDcPaymentConfiguration.class, name = "BRAZIL_PIX_DC"),
    @JsonSubTypes.Type(value = MessagesApiMessagePgPayuPaymentConfiguration.class, name = "PG_PAYU"),
    @JsonSubTypes.Type(value = MessagesApiMessageUpiPgRazorpayPaymentConfiguration.class, name = "PG_RAZORPAY"),
    @JsonSubTypes.Type(value = MessagesApiMessageUpiIntentPaymentConfiguration.class, name = "UPI_INTENT"),
    @JsonSubTypes.Type(value = MessagesApiMessageUpiPayuPaymentConfiguration.class, name = "UPI_PAYU"),
})
public abstract class MessagesApiMessagePaymentConfiguration {

    protected final MessagesApiMessagePaymentConfigurationType type;

    /**
     * Constructs a new {@link MessagesApiMessagePaymentConfiguration} instance.
     */
    public MessagesApiMessagePaymentConfiguration(String type) {
        this.type = MessagesApiMessagePaymentConfigurationType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiMessagePaymentConfigurationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessagePaymentConfiguration messagesApiMessagePaymentConfiguration =
                (MessagesApiMessagePaymentConfiguration) o;
        return Objects.equals(this.type, messagesApiMessagePaymentConfiguration.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessagePaymentConfiguration {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
