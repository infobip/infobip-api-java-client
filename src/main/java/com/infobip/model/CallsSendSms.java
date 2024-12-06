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
 * Send SMS action creates and sends a text message from the scenario.
 */
public class CallsSendSms implements CallsScriptInner {

    private CallsSendSmsData sendSms;

    private Integer actionId;

    /**
     * Sets sendSms.
     * <p>
     * The field is required.
     *
     * @param sendSms
     * @return This {@link CallsSendSms instance}.
     */
    public CallsSendSms sendSms(CallsSendSmsData sendSms) {
        this.sendSms = sendSms;
        return this;
    }

    /**
     * Returns sendSms.
     * <p>
     * The field is required.
     *
     * @return sendSms
     */
    @JsonProperty("sendSms")
    public CallsSendSmsData getSendSms() {
        return sendSms;
    }

    /**
     * Sets sendSms.
     * <p>
     * The field is required.
     *
     * @param sendSms
     */
    @JsonProperty("sendSms")
    public void setSendSms(CallsSendSmsData sendSms) {
        this.sendSms = sendSms;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsSendSms instance}.
     */
    public CallsSendSms actionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Returns actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @return actionId
     */
    @JsonProperty("actionId")
    public Integer getActionId() {
        return actionId;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     */
    @JsonProperty("actionId")
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSendSms callsSendSms = (CallsSendSms) o;
        return Objects.equals(this.sendSms, callsSendSms.sendSms)
                && Objects.equals(this.actionId, callsSendSms.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendSms, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSendSms {")
                .append(newLine)
                .append("    sendSms: ")
                .append(toIndentedString(sendSms))
                .append(newLine)
                .append("    actionId: ")
                .append(toIndentedString(actionId))
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
