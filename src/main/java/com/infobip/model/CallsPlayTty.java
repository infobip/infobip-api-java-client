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
 * Play TTY action converts the provided text into Baudot tones and plays the generated audio, enabling the message to be displayed on a connected TTY device. This action is designed to support IVR scenarios adapted for users with hearing impairments.
 */
public class CallsPlayTty {

    private String playTty;

    private CallsPlayTtyOptions options;

    private Integer actionId;

    /**
     * Sets playTty.
     * <p>
     * Field description:
     * Text that will be played in Baudot tones. The parameter can be constructed using variables.
     * <p>
     * The field is required.
     *
     * @param playTty
     * @return This {@link CallsPlayTty instance}.
     */
    public CallsPlayTty playTty(String playTty) {
        this.playTty = playTty;
        return this;
    }

    /**
     * Returns playTty.
     * <p>
     * Field description:
     * Text that will be played in Baudot tones. The parameter can be constructed using variables.
     * <p>
     * The field is required.
     *
     * @return playTty
     */
    @JsonProperty("playTty")
    public String getPlayTty() {
        return playTty;
    }

    /**
     * Sets playTty.
     * <p>
     * Field description:
     * Text that will be played in Baudot tones. The parameter can be constructed using variables.
     * <p>
     * The field is required.
     *
     * @param playTty
     */
    @JsonProperty("playTty")
    public void setPlayTty(String playTty) {
        this.playTty = playTty;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsPlayTty instance}.
     */
    public CallsPlayTty options(CallsPlayTtyOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsPlayTtyOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsPlayTtyOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsPlayTty instance}.
     */
    public CallsPlayTty actionId(Integer actionId) {
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
        CallsPlayTty callsPlayTty = (CallsPlayTty) o;
        return Objects.equals(this.playTty, callsPlayTty.playTty)
                && Objects.equals(this.options, callsPlayTty.options)
                && Objects.equals(this.actionId, callsPlayTty.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playTty, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayTty {")
                .append(newLine)
                .append("    playTty: ")
                .append(toIndentedString(playTty))
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
