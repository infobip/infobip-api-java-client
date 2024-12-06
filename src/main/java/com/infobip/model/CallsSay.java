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
 * Say action converts provided text into an audio file which is played during the call based on the provided parameters. Message text can be up to 1400 characters long.
 */
public class CallsSay implements CallsScriptInner {

    private String say;

    private CallsSayOptions options;

    private Integer actionId;

    /**
     * Sets say.
     * <p>
     * Field description:
     * Message text. SSML (_Speech Synthesis Markup Language_) is supported and can be used to fully customize pronunciation of the provided text.
     * <p>
     * The field is required.
     *
     * @param say
     * @return This {@link CallsSay instance}.
     */
    public CallsSay say(String say) {
        this.say = say;
        return this;
    }

    /**
     * Returns say.
     * <p>
     * Field description:
     * Message text. SSML (_Speech Synthesis Markup Language_) is supported and can be used to fully customize pronunciation of the provided text.
     * <p>
     * The field is required.
     *
     * @return say
     */
    @JsonProperty("say")
    public String getSay() {
        return say;
    }

    /**
     * Sets say.
     * <p>
     * Field description:
     * Message text. SSML (_Speech Synthesis Markup Language_) is supported and can be used to fully customize pronunciation of the provided text.
     * <p>
     * The field is required.
     *
     * @param say
     */
    @JsonProperty("say")
    public void setSay(String say) {
        this.say = say;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsSay instance}.
     */
    public CallsSay options(CallsSayOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsSayOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsSayOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsSay instance}.
     */
    public CallsSay actionId(Integer actionId) {
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
        CallsSay callsSay = (CallsSay) o;
        return Objects.equals(this.say, callsSay.say)
                && Objects.equals(this.options, callsSay.options)
                && Objects.equals(this.actionId, callsSay.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(say, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSay {")
                .append(newLine)
                .append("    say: ")
                .append(toIndentedString(say))
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
