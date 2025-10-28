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
 * Represents WhatsAppInteractiveOrderBrazilBoletoPaymentDetails model.
 */
public class WhatsAppInteractiveOrderBrazilBoletoPaymentDetails extends WhatsAppInteractiveAllowedOrderPaymentDetails {

    private String id;

    private String code;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderBrazilBoletoPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderBrazilBoletoPaymentDetails() {
        super("BRAZIL_BOLETO");
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
     * @return This {@link WhatsAppInteractiveOrderBrazilBoletoPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilBoletoPaymentDetails id(String id) {
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
     * Sets code.
     * <p>
     * Field description:
     * Boleto code.
     * <p>
     * The field is required.
     *
     * @param code
     * @return This {@link WhatsAppInteractiveOrderBrazilBoletoPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilBoletoPaymentDetails code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Boleto code.
     * <p>
     * The field is required.
     *
     * @return code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Boleto code.
     * <p>
     * The field is required.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderBrazilBoletoPaymentDetails whatsAppInteractiveOrderBrazilBoletoPaymentDetails =
                (WhatsAppInteractiveOrderBrazilBoletoPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderBrazilBoletoPaymentDetails.id)
                && Objects.equals(this.code, whatsAppInteractiveOrderBrazilBoletoPaymentDetails.code)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderBrazilBoletoPaymentDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
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
