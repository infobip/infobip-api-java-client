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
 * Additional information associated with the message
 */
public class MessagesApiWebhookEventMetadata {

    private String correlationData;

    /**
     * Sets correlationData.
     * <p>
     * Field description:
     * Correlation data included in the outbound message. Auto-generated if not set explicitly.
     *
     * @param correlationData
     * @return This {@link MessagesApiWebhookEventMetadata instance}.
     */
    public MessagesApiWebhookEventMetadata correlationData(String correlationData) {
        this.correlationData = correlationData;
        return this;
    }

    /**
     * Returns correlationData.
     * <p>
     * Field description:
     * Correlation data included in the outbound message. Auto-generated if not set explicitly.
     *
     * @return correlationData
     */
    @JsonProperty("correlationData")
    public String getCorrelationData() {
        return correlationData;
    }

    /**
     * Sets correlationData.
     * <p>
     * Field description:
     * Correlation data included in the outbound message. Auto-generated if not set explicitly.
     *
     * @param correlationData
     */
    @JsonProperty("correlationData")
    public void setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventMetadata messagesApiWebhookEventMetadata = (MessagesApiWebhookEventMetadata) o;
        return Objects.equals(this.correlationData, messagesApiWebhookEventMetadata.correlationData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventMetadata {")
                .append(newLine)
                .append("    correlationData: ")
                .append(toIndentedString(correlationData))
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
