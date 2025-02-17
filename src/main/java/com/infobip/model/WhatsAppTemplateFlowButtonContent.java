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
 * Represents WhatsAppTemplateFlowButtonContent model.
 */
public class WhatsAppTemplateFlowButtonContent extends WhatsAppTemplateButtonContent {

    private String flowToken;

    private Map<String, Object> data = null;

    /**
     * Constructs a new {@link WhatsAppTemplateFlowButtonContent} instance.
     */
    public WhatsAppTemplateFlowButtonContent() {
        super("FLOW");
    }

    /**
     * Sets flowToken.
     * <p>
     * Field description:
     * Flow token.
     *
     * @param flowToken
     * @return This {@link WhatsAppTemplateFlowButtonContent instance}.
     */
    public WhatsAppTemplateFlowButtonContent flowToken(String flowToken) {
        this.flowToken = flowToken;
        return this;
    }

    /**
     * Returns flowToken.
     * <p>
     * Field description:
     * Flow token.
     *
     * @return flowToken
     */
    @JsonProperty("flowToken")
    public String getFlowToken() {
        return flowToken;
    }

    /**
     * Sets flowToken.
     * <p>
     * Field description:
     * Flow token.
     *
     * @param flowToken
     */
    @JsonProperty("flowToken")
    public void setFlowToken(String flowToken) {
        this.flowToken = flowToken;
    }

    /**
     * Sets data.
     * <p>
     * Field description:
     * Message action payload data. JSON object with the data payload for the first screen.
     *
     * @param data
     * @return This {@link WhatsAppTemplateFlowButtonContent instance}.
     */
    public WhatsAppTemplateFlowButtonContent data(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    /**
     * Puts and entry into data.
     * <p>
     * Field description:
     * Message action payload data. JSON object with the data payload for the first screen.
     *
     * @param key The given key.
     * @param dataItem The item to be associated with the given key.
     * @return This {@link WhatsAppTemplateFlowButtonContent instance}.
     */
    public WhatsAppTemplateFlowButtonContent putDataItem(String key, Object dataItem) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, dataItem);
        return this;
    }

    /**
     * Returns data.
     * <p>
     * Field description:
     * Message action payload data. JSON object with the data payload for the first screen.
     *
     * @return data
     */
    @JsonProperty("data")
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * Sets data.
     * <p>
     * Field description:
     * Message action payload data. JSON object with the data payload for the first screen.
     *
     * @param data
     */
    @JsonProperty("data")
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateFlowButtonContent whatsAppTemplateFlowButtonContent = (WhatsAppTemplateFlowButtonContent) o;
        return Objects.equals(this.flowToken, whatsAppTemplateFlowButtonContent.flowToken)
                && Objects.equals(this.data, whatsAppTemplateFlowButtonContent.data)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowToken, data, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateFlowButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    flowToken: ")
                .append(toIndentedString(flowToken))
                .append(newLine)
                .append("    data: ")
                .append(toIndentedString(data))
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
