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
 * Dial action performs a call redirection, joining the user&#39;s call with another destination. After Dial action the following actions are forbidden: Say, Collect, Dial, Dial to Many, Dial to WebRTC, Dial to SIP trunk, Dial to Conversations, Play, Record and Play from Recording.
 */
public class CallsDial implements CallsScriptInner {

    private String dial;

    private CallsDialOptions options;

    private Integer actionId;

    /**
     * Sets dial.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
     * <p>
     * The field is required.
     *
     * @param dial
     * @return This {@link CallsDial instance}.
     */
    public CallsDial dial(String dial) {
        this.dial = dial;
        return this;
    }

    /**
     * Returns dial.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
     * <p>
     * The field is required.
     *
     * @return dial
     */
    @JsonProperty("dial")
    public String getDial() {
        return dial;
    }

    /**
     * Sets dial.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
     * <p>
     * The field is required.
     *
     * @param dial
     */
    @JsonProperty("dial")
    public void setDial(String dial) {
        this.dial = dial;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsDial instance}.
     */
    public CallsDial options(CallsDialOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsDialOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsDialOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsDial instance}.
     */
    public CallsDial actionId(Integer actionId) {
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
        CallsDial callsDial = (CallsDial) o;
        return Objects.equals(this.dial, callsDial.dial)
                && Objects.equals(this.options, callsDial.options)
                && Objects.equals(this.actionId, callsDial.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dial, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDial {")
                .append(newLine)
                .append("    dial: ")
                .append(toIndentedString(dial))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
