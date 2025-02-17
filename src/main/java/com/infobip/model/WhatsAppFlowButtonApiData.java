/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents WhatsAppFlowButtonApiData model.
 */
public class WhatsAppFlowButtonApiData extends WhatsAppButtonApiData {

    private String text;

    private Long flowId;

    /**
     * Type of action after pressing the button.
     */
    public enum FlowActionEnum {
        NAVIGATE("NAVIGATE"),
        DATA_EXCHANGE("DATA_EXCHANGE");

        private String value;

        FlowActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FlowActionEnum fromValue(String value) {
            for (FlowActionEnum enumElement : FlowActionEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private FlowActionEnum flowAction;

    private String navigateScreen;

    /**
     * Constructs a new {@link WhatsAppFlowButtonApiData} instance.
     */
    public WhatsAppFlowButtonApiData() {
        super("FLOW");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppFlowButtonApiData instance}.
     */
    public WhatsAppFlowButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets flowId.
     * <p>
     * Field description:
     * Flow Id.
     * <p>
     * The field is required.
     *
     * @param flowId
     * @return This {@link WhatsAppFlowButtonApiData instance}.
     */
    public WhatsAppFlowButtonApiData flowId(Long flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * Returns flowId.
     * <p>
     * Field description:
     * Flow Id.
     * <p>
     * The field is required.
     *
     * @return flowId
     */
    @JsonProperty("flowId")
    public Long getFlowId() {
        return flowId;
    }

    /**
     * Sets flowId.
     * <p>
     * Field description:
     * Flow Id.
     * <p>
     * The field is required.
     *
     * @param flowId
     */
    @JsonProperty("flowId")
    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    /**
     * Sets flowAction.
     * <p>
     * Field description:
     * Type of action after pressing the button.
     * <p>
     * The field is required.
     *
     * @param flowAction
     * @return This {@link WhatsAppFlowButtonApiData instance}.
     */
    public WhatsAppFlowButtonApiData flowAction(FlowActionEnum flowAction) {
        this.flowAction = flowAction;
        return this;
    }

    /**
     * Returns flowAction.
     * <p>
     * Field description:
     * Type of action after pressing the button.
     * <p>
     * The field is required.
     *
     * @return flowAction
     */
    @JsonProperty("flowAction")
    public FlowActionEnum getFlowAction() {
        return flowAction;
    }

    /**
     * Sets flowAction.
     * <p>
     * Field description:
     * Type of action after pressing the button.
     * <p>
     * The field is required.
     *
     * @param flowAction
     */
    @JsonProperty("flowAction")
    public void setFlowAction(FlowActionEnum flowAction) {
        this.flowAction = flowAction;
    }

    /**
     * Sets navigateScreen.
     * <p>
     * Field description:
     * Name of screen to navigate, required if flow action is &#39;navigate&#39;.
     *
     * @param navigateScreen
     * @return This {@link WhatsAppFlowButtonApiData instance}.
     */
    public WhatsAppFlowButtonApiData navigateScreen(String navigateScreen) {
        this.navigateScreen = navigateScreen;
        return this;
    }

    /**
     * Returns navigateScreen.
     * <p>
     * Field description:
     * Name of screen to navigate, required if flow action is &#39;navigate&#39;.
     *
     * @return navigateScreen
     */
    @JsonProperty("navigateScreen")
    public String getNavigateScreen() {
        return navigateScreen;
    }

    /**
     * Sets navigateScreen.
     * <p>
     * Field description:
     * Name of screen to navigate, required if flow action is &#39;navigate&#39;.
     *
     * @param navigateScreen
     */
    @JsonProperty("navigateScreen")
    public void setNavigateScreen(String navigateScreen) {
        this.navigateScreen = navigateScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppFlowButtonApiData whatsAppFlowButtonApiData = (WhatsAppFlowButtonApiData) o;
        return Objects.equals(this.text, whatsAppFlowButtonApiData.text)
                && Objects.equals(this.flowId, whatsAppFlowButtonApiData.flowId)
                && Objects.equals(this.flowAction, whatsAppFlowButtonApiData.flowAction)
                && Objects.equals(this.navigateScreen, whatsAppFlowButtonApiData.navigateScreen)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, flowId, flowAction, navigateScreen, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppFlowButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    flowId: ")
                .append(toIndentedString(flowId))
                .append(newLine)
                .append("    flowAction: ")
                .append(toIndentedString(flowAction))
                .append(newLine)
                .append("    navigateScreen: ")
                .append(toIndentedString(navigateScreen))
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
