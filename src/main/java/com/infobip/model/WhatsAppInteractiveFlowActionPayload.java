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
 * Required when flowAction is set to &#39;NAVIGATE. Should be omitted otherwise.
 */
public class WhatsAppInteractiveFlowActionPayload {

    private String screen;

    private Map<String, Object> data = null;

    /**
     * Sets screen.
     * <p>
     * Field description:
     * ID of the first screen of the flow.
     * <p>
     * The field is required.
     *
     * @param screen
     * @return This {@link WhatsAppInteractiveFlowActionPayload instance}.
     */
    public WhatsAppInteractiveFlowActionPayload screen(String screen) {
        this.screen = screen;
        return this;
    }

    /**
     * Returns screen.
     * <p>
     * Field description:
     * ID of the first screen of the flow.
     * <p>
     * The field is required.
     *
     * @return screen
     */
    @JsonProperty("screen")
    public String getScreen() {
        return screen;
    }

    /**
     * Sets screen.
     * <p>
     * Field description:
     * ID of the first screen of the flow.
     * <p>
     * The field is required.
     *
     * @param screen
     */
    @JsonProperty("screen")
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * Sets data.
     * <p>
     * Field description:
     * Input data for first screen of the flow. Must be a non-empty object.
     *
     * @param data
     * @return This {@link WhatsAppInteractiveFlowActionPayload instance}.
     */
    public WhatsAppInteractiveFlowActionPayload data(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    /**
     * Puts and entry into data.
     * <p>
     * Field description:
     * Input data for first screen of the flow. Must be a non-empty object.
     *
     * @param key The given key.
     * @param dataItem The item to be associated with the given key.
     * @return This {@link WhatsAppInteractiveFlowActionPayload instance}.
     */
    public WhatsAppInteractiveFlowActionPayload putDataItem(String key, Object dataItem) {
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
     * Input data for first screen of the flow. Must be a non-empty object.
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
     * Input data for first screen of the flow. Must be a non-empty object.
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
        WhatsAppInteractiveFlowActionPayload whatsAppInteractiveFlowActionPayload =
                (WhatsAppInteractiveFlowActionPayload) o;
        return Objects.equals(this.screen, whatsAppInteractiveFlowActionPayload.screen)
                && Objects.equals(this.data, whatsAppInteractiveFlowActionPayload.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screen, data);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveFlowActionPayload {")
                .append(newLine)
                .append("    screen: ")
                .append(toIndentedString(screen))
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
