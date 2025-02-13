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
 * Represents WhatsAppInteractiveOrderBrazilLinkPaymentStatus model.
 */
public class WhatsAppInteractiveOrderBrazilLinkPaymentStatus extends WhatsAppInteractiveOrderPaymentStatus {

    private String id;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderBrazilLinkPaymentStatus} instance.
     */
    public WhatsAppInteractiveOrderBrazilLinkPaymentStatus() {
        super("BRAZIL_LINK");
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
     * @return This {@link WhatsAppInteractiveOrderBrazilLinkPaymentStatus instance}.
     */
    public WhatsAppInteractiveOrderBrazilLinkPaymentStatus id(String id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderBrazilLinkPaymentStatus whatsAppInteractiveOrderBrazilLinkPaymentStatus =
                (WhatsAppInteractiveOrderBrazilLinkPaymentStatus) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderBrazilLinkPaymentStatus.id) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderBrazilLinkPaymentStatus {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
