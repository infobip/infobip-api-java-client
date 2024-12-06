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
 * Play from Recording Action plays audio recorded from the current or some other call.
 */
public class CallsPlayFromRecording implements CallsScriptInner {

    private String playFromRecording;

    private Integer actionId;

    /**
     * Sets playFromRecording.
     * <p>
     * Field description:
     * Can be null (play last recorded audio from the current call), number (play the recording passed index) or text (play recording with identifier - current or previous call)
     * <p>
     * The field is required.
     *
     * @param playFromRecording
     * @return This {@link CallsPlayFromRecording instance}.
     */
    public CallsPlayFromRecording playFromRecording(String playFromRecording) {
        this.playFromRecording = playFromRecording;
        return this;
    }

    /**
     * Returns playFromRecording.
     * <p>
     * Field description:
     * Can be null (play last recorded audio from the current call), number (play the recording passed index) or text (play recording with identifier - current or previous call)
     * <p>
     * The field is required.
     *
     * @return playFromRecording
     */
    @JsonProperty("playFromRecording")
    public String getPlayFromRecording() {
        return playFromRecording;
    }

    /**
     * Sets playFromRecording.
     * <p>
     * Field description:
     * Can be null (play last recorded audio from the current call), number (play the recording passed index) or text (play recording with identifier - current or previous call)
     * <p>
     * The field is required.
     *
     * @param playFromRecording
     */
    @JsonProperty("playFromRecording")
    public void setPlayFromRecording(String playFromRecording) {
        this.playFromRecording = playFromRecording;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsPlayFromRecording instance}.
     */
    public CallsPlayFromRecording actionId(Integer actionId) {
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
        CallsPlayFromRecording callsPlayFromRecording = (CallsPlayFromRecording) o;
        return Objects.equals(this.playFromRecording, callsPlayFromRecording.playFromRecording)
                && Objects.equals(this.actionId, callsPlayFromRecording.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playFromRecording, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayFromRecording {")
                .append(newLine)
                .append("    playFromRecording: ")
                .append(toIndentedString(playFromRecording))
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
