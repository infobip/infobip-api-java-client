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
 * Allows you to specify flow message details.
 */
public class WhatsAppInteractiveFlowActionContent {

    private WhatsAppInteractiveFlowActionMode mode;

    private Integer flowMessageVersion;

    private String flowToken;

    private String flowId;

    private String callToActionButton;

    private WhatsAppInteractiveFlowAction flowAction;

    private WhatsAppInteractiveFlowActionPayload flowActionPayload;

    /**
     * Sets mode.
     *
     * @param mode
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent mode(WhatsAppInteractiveFlowActionMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Returns mode.
     *
     * @return mode
     */
    @JsonProperty("mode")
    public WhatsAppInteractiveFlowActionMode getMode() {
        return mode;
    }

    /**
     * Sets mode.
     *
     * @param mode
     */
    @JsonProperty("mode")
    public void setMode(WhatsAppInteractiveFlowActionMode mode) {
        this.mode = mode;
    }

    /**
     * Sets flowMessageVersion.
     * <p>
     * Field description:
     * Version of the flow message.
     *
     * @param flowMessageVersion
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent flowMessageVersion(Integer flowMessageVersion) {
        this.flowMessageVersion = flowMessageVersion;
        return this;
    }

    /**
     * Returns flowMessageVersion.
     * <p>
     * Field description:
     * Version of the flow message.
     *
     * @return flowMessageVersion
     */
    @JsonProperty("flowMessageVersion")
    public Integer getFlowMessageVersion() {
        return flowMessageVersion;
    }

    /**
     * Sets flowMessageVersion.
     * <p>
     * Field description:
     * Version of the flow message.
     *
     * @param flowMessageVersion
     */
    @JsonProperty("flowMessageVersion")
    public void setFlowMessageVersion(Integer flowMessageVersion) {
        this.flowMessageVersion = flowMessageVersion;
    }

    /**
     * Sets flowToken.
     * <p>
     * Field description:
     * Flow token that should serve as an identifier.
     * <p>
     * The field is required.
     *
     * @param flowToken
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent flowToken(String flowToken) {
        this.flowToken = flowToken;
        return this;
    }

    /**
     * Returns flowToken.
     * <p>
     * Field description:
     * Flow token that should serve as an identifier.
     * <p>
     * The field is required.
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
     * Flow token that should serve as an identifier.
     * <p>
     * The field is required.
     *
     * @param flowToken
     */
    @JsonProperty("flowToken")
    public void setFlowToken(String flowToken) {
        this.flowToken = flowToken;
    }

    /**
     * Sets flowId.
     * <p>
     * Field description:
     * ID of the registered flow.
     * <p>
     * The field is required.
     *
     * @param flowId
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent flowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * Returns flowId.
     * <p>
     * Field description:
     * ID of the registered flow.
     * <p>
     * The field is required.
     *
     * @return flowId
     */
    @JsonProperty("flowId")
    public String getFlowId() {
        return flowId;
    }

    /**
     * Sets flowId.
     * <p>
     * Field description:
     * ID of the registered flow.
     * <p>
     * The field is required.
     *
     * @param flowId
     */
    @JsonProperty("flowId")
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * Sets callToActionButton.
     * <p>
     * Field description:
     * Call to action button text.
     * <p>
     * The field is required.
     *
     * @param callToActionButton
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent callToActionButton(String callToActionButton) {
        this.callToActionButton = callToActionButton;
        return this;
    }

    /**
     * Returns callToActionButton.
     * <p>
     * Field description:
     * Call to action button text.
     * <p>
     * The field is required.
     *
     * @return callToActionButton
     */
    @JsonProperty("callToActionButton")
    public String getCallToActionButton() {
        return callToActionButton;
    }

    /**
     * Sets callToActionButton.
     * <p>
     * Field description:
     * Call to action button text.
     * <p>
     * The field is required.
     *
     * @param callToActionButton
     */
    @JsonProperty("callToActionButton")
    public void setCallToActionButton(String callToActionButton) {
        this.callToActionButton = callToActionButton;
    }

    /**
     * Sets flowAction.
     *
     * @param flowAction
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent flowAction(WhatsAppInteractiveFlowAction flowAction) {
        this.flowAction = flowAction;
        return this;
    }

    /**
     * Returns flowAction.
     *
     * @return flowAction
     */
    @JsonProperty("flowAction")
    public WhatsAppInteractiveFlowAction getFlowAction() {
        return flowAction;
    }

    /**
     * Sets flowAction.
     *
     * @param flowAction
     */
    @JsonProperty("flowAction")
    public void setFlowAction(WhatsAppInteractiveFlowAction flowAction) {
        this.flowAction = flowAction;
    }

    /**
     * Sets flowActionPayload.
     *
     * @param flowActionPayload
     * @return This {@link WhatsAppInteractiveFlowActionContent instance}.
     */
    public WhatsAppInteractiveFlowActionContent flowActionPayload(
            WhatsAppInteractiveFlowActionPayload flowActionPayload) {
        this.flowActionPayload = flowActionPayload;
        return this;
    }

    /**
     * Returns flowActionPayload.
     *
     * @return flowActionPayload
     */
    @JsonProperty("flowActionPayload")
    public WhatsAppInteractiveFlowActionPayload getFlowActionPayload() {
        return flowActionPayload;
    }

    /**
     * Sets flowActionPayload.
     *
     * @param flowActionPayload
     */
    @JsonProperty("flowActionPayload")
    public void setFlowActionPayload(WhatsAppInteractiveFlowActionPayload flowActionPayload) {
        this.flowActionPayload = flowActionPayload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveFlowActionContent whatsAppInteractiveFlowActionContent =
                (WhatsAppInteractiveFlowActionContent) o;
        return Objects.equals(this.mode, whatsAppInteractiveFlowActionContent.mode)
                && Objects.equals(this.flowMessageVersion, whatsAppInteractiveFlowActionContent.flowMessageVersion)
                && Objects.equals(this.flowToken, whatsAppInteractiveFlowActionContent.flowToken)
                && Objects.equals(this.flowId, whatsAppInteractiveFlowActionContent.flowId)
                && Objects.equals(this.callToActionButton, whatsAppInteractiveFlowActionContent.callToActionButton)
                && Objects.equals(this.flowAction, whatsAppInteractiveFlowActionContent.flowAction)
                && Objects.equals(this.flowActionPayload, whatsAppInteractiveFlowActionContent.flowActionPayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                mode, flowMessageVersion, flowToken, flowId, callToActionButton, flowAction, flowActionPayload);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveFlowActionContent {")
                .append(newLine)
                .append("    mode: ")
                .append(toIndentedString(mode))
                .append(newLine)
                .append("    flowMessageVersion: ")
                .append(toIndentedString(flowMessageVersion))
                .append(newLine)
                .append("    flowToken: ")
                .append(toIndentedString(flowToken))
                .append(newLine)
                .append("    flowId: ")
                .append(toIndentedString(flowId))
                .append(newLine)
                .append("    callToActionButton: ")
                .append(toIndentedString(callToActionButton))
                .append(newLine)
                .append("    flowAction: ")
                .append(toIndentedString(flowAction))
                .append(newLine)
                .append("    flowActionPayload: ")
                .append(toIndentedString(flowActionPayload))
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
