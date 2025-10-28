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
 * Represents MessagesApiMessageBrazilBoletoPaymentConfiguration model.
 */
public class MessagesApiMessageBrazilBoletoPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String id;

    private String code;

    /**
     * Constructs a new {@link MessagesApiMessageBrazilBoletoPaymentConfiguration} instance.
     */
    public MessagesApiMessageBrazilBoletoPaymentConfiguration() {
        super("BRAZIL_BOLETO");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     * @return This {@link MessagesApiMessageBrazilBoletoPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilBoletoPaymentConfiguration id(String id) {
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
     * Sets code.
     * <p>
     * Field description:
     * Boleto code.
     *
     * @param code
     * @return This {@link MessagesApiMessageBrazilBoletoPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilBoletoPaymentConfiguration code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Boleto code.
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
        MessagesApiMessageBrazilBoletoPaymentConfiguration messagesApiMessageBrazilBoletoPaymentConfiguration =
                (MessagesApiMessageBrazilBoletoPaymentConfiguration) o;
        return Objects.equals(this.id, messagesApiMessageBrazilBoletoPaymentConfiguration.id)
                && Objects.equals(this.code, messagesApiMessageBrazilBoletoPaymentConfiguration.code)
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
                .append("class MessagesApiMessageBrazilBoletoPaymentConfiguration {")
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
