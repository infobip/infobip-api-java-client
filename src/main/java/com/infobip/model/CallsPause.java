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
 * Pause action pauses execution of the IVR scenario for the provided duration.
 */
public class CallsPause implements CallsScriptInner {

    private Double pause;

    private Integer actionId;

    /**
     * Sets pause.
     * <p>
     * Field description:
     * the amount to wait in seconds, from 0 (exclusive) to 5 (inclusive)
     * <p>
     * The field is required.
     *
     * @param pause
     * @return This {@link CallsPause instance}.
     */
    public CallsPause pause(Double pause) {
        this.pause = pause;
        return this;
    }

    /**
     * Returns pause.
     * <p>
     * Field description:
     * the amount to wait in seconds, from 0 (exclusive) to 5 (inclusive)
     * <p>
     * The field is required.
     *
     * @return pause
     */
    @JsonProperty("pause")
    public Double getPause() {
        return pause;
    }

    /**
     * Sets pause.
     * <p>
     * Field description:
     * the amount to wait in seconds, from 0 (exclusive) to 5 (inclusive)
     * <p>
     * The field is required.
     *
     * @param pause
     */
    @JsonProperty("pause")
    public void setPause(Double pause) {
        this.pause = pause;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsPause instance}.
     */
    public CallsPause actionId(Integer actionId) {
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
        CallsPause callsPause = (CallsPause) o;
        return Objects.equals(this.pause, callsPause.pause) && Objects.equals(this.actionId, callsPause.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pause, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPause {")
                .append(newLine)
                .append("    pause: ")
                .append(toIndentedString(pause))
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
