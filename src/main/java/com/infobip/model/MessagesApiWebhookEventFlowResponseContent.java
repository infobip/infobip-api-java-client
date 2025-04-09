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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents MessagesApiWebhookEventFlowResponseContent model.
 */
public class MessagesApiWebhookEventFlowResponseContent extends MessagesApiWebhookEventContent {

    private Map<String, Object> response = new HashMap<>();

    /**
     * Constructs a new {@link MessagesApiWebhookEventFlowResponseContent} instance.
     */
    public MessagesApiWebhookEventFlowResponseContent() {
        super("FLOW_RESPONSE");
    }

    /**
     * Sets response.
     * <p>
     * Field description:
     * Flow response payload.
     * <p>
     * The field is required.
     *
     * @param response
     * @return This {@link MessagesApiWebhookEventFlowResponseContent instance}.
     */
    public MessagesApiWebhookEventFlowResponseContent response(Map<String, Object> response) {
        this.response = response;
        return this;
    }

    /**
     * Puts and entry into response.
     * <p>
     * Field description:
     * Flow response payload.
     * <p>
     * The field is required.
     *
     * @param key The given key.
     * @param responseItem The item to be associated with the given key.
     * @return This {@link MessagesApiWebhookEventFlowResponseContent instance}.
     */
    public MessagesApiWebhookEventFlowResponseContent putResponseItem(String key, Object responseItem) {
        if (this.response == null) {
            this.response = new HashMap<>();
        }
        this.response.put(key, responseItem);
        return this;
    }

    /**
     * Returns response.
     * <p>
     * Field description:
     * Flow response payload.
     * <p>
     * The field is required.
     *
     * @return response
     */
    @JsonProperty("response")
    public Map<String, Object> getResponse() {
        return response;
    }

    /**
     * Sets response.
     * <p>
     * Field description:
     * Flow response payload.
     * <p>
     * The field is required.
     *
     * @param response
     */
    @JsonProperty("response")
    public void setResponse(Map<String, Object> response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventFlowResponseContent messagesApiWebhookEventFlowResponseContent =
                (MessagesApiWebhookEventFlowResponseContent) o;
        return Objects.equals(this.response, messagesApiWebhookEventFlowResponseContent.response) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventFlowResponseContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    response: ")
                .append(toIndentedString(response))
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
