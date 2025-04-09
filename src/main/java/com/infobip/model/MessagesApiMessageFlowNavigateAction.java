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
 * Represents MessagesApiMessageFlowNavigateAction model.
 */
public class MessagesApiMessageFlowNavigateAction extends MessagesApiMessageFlowAction {

    private MessagesApiMessageFlowActionPayload payload;

    /**
     * Constructs a new {@link MessagesApiMessageFlowNavigateAction} instance.
     */
    public MessagesApiMessageFlowNavigateAction() {
        super("NAVIGATE");
    }

    /**
     * Sets payload.
     * <p>
     * The field is required.
     *
     * @param payload
     * @return This {@link MessagesApiMessageFlowNavigateAction instance}.
     */
    public MessagesApiMessageFlowNavigateAction payload(MessagesApiMessageFlowActionPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Returns payload.
     * <p>
     * The field is required.
     *
     * @return payload
     */
    @JsonProperty("payload")
    public MessagesApiMessageFlowActionPayload getPayload() {
        return payload;
    }

    /**
     * Sets payload.
     * <p>
     * The field is required.
     *
     * @param payload
     */
    @JsonProperty("payload")
    public void setPayload(MessagesApiMessageFlowActionPayload payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageFlowNavigateAction messagesApiMessageFlowNavigateAction =
                (MessagesApiMessageFlowNavigateAction) o;
        return Objects.equals(this.payload, messagesApiMessageFlowNavigateAction.payload) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageFlowNavigateAction {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    payload: ")
                .append(toIndentedString(payload))
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
