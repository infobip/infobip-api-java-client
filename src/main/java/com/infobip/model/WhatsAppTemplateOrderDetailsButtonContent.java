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
 * Represents WhatsAppTemplateOrderDetailsButtonContent model.
 */
public class WhatsAppTemplateOrderDetailsButtonContent extends WhatsAppTemplateButtonContent {

    private WhatsAppTemplateOrderDetailsActionContent action;

    /**
     * Constructs a new {@link WhatsAppTemplateOrderDetailsButtonContent} instance.
     */
    public WhatsAppTemplateOrderDetailsButtonContent() {
        super("ORDER_DETAILS");
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     * @return This {@link WhatsAppTemplateOrderDetailsButtonContent instance}.
     */
    public WhatsAppTemplateOrderDetailsButtonContent action(WhatsAppTemplateOrderDetailsActionContent action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * The field is required.
     *
     * @return action
     */
    @JsonProperty("action")
    public WhatsAppTemplateOrderDetailsActionContent getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(WhatsAppTemplateOrderDetailsActionContent action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateOrderDetailsButtonContent whatsAppTemplateOrderDetailsButtonContent =
                (WhatsAppTemplateOrderDetailsButtonContent) o;
        return Objects.equals(this.action, whatsAppTemplateOrderDetailsButtonContent.action) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateOrderDetailsButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
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
