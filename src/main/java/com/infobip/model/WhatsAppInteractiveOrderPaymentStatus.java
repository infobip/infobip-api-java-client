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
 * Payment of the order.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppInteractiveOrderBrazilPaymentStatus.class, name = "BRAZIL"),
    @JsonSubTypes.Type(value = WhatsAppInteractiveOrderUPIPGPayUPaymentStatus.class, name = "PG_PAYU"),
    @JsonSubTypes.Type(value = WhatsAppInteractiveOrderUPIPGRazorpayPaymentStatus.class, name = "PG_RAZORPAY"),
    @JsonSubTypes.Type(value = WhatsAppInteractiveOrderUPIPayUPaymentStatus.class, name = "UPI_PAYU"),
})
public abstract class WhatsAppInteractiveOrderPaymentStatus {

    protected final String type;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderPaymentStatus} instance.
     */
    public WhatsAppInteractiveOrderPaymentStatus(String type) {
        this.type = type;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
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
        WhatsAppInteractiveOrderPaymentStatus whatsAppInteractiveOrderPaymentStatus =
                (WhatsAppInteractiveOrderPaymentStatus) o;
        return Objects.equals(this.type, whatsAppInteractiveOrderPaymentStatus.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderPaymentStatus {")
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
