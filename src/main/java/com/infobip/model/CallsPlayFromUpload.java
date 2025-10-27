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
 * Play From Upload action performs playback of uploaded audio file. Not available in inbound IVR at the moment.
 */
public class CallsPlayFromUpload {

    private String playFromUpload;

    private CallsPlayFromUploadOptions options;

    private Integer actionId;

    /**
     * Sets playFromUpload.
     * <p>
     * Field description:
     * ID of uploaded file. The parameter can be constructed using variables.
     * <p>
     * The field is required.
     *
     * @param playFromUpload
     * @return This {@link CallsPlayFromUpload instance}.
     */
    public CallsPlayFromUpload playFromUpload(String playFromUpload) {
        this.playFromUpload = playFromUpload;
        return this;
    }

    /**
     * Returns playFromUpload.
     * <p>
     * Field description:
     * ID of uploaded file. The parameter can be constructed using variables.
     * <p>
     * The field is required.
     *
     * @return playFromUpload
     */
    @JsonProperty("playFromUpload")
    public String getPlayFromUpload() {
        return playFromUpload;
    }

    /**
     * Sets playFromUpload.
     * <p>
     * Field description:
     * ID of uploaded file. The parameter can be constructed using variables.
     * <p>
     * The field is required.
     *
     * @param playFromUpload
     */
    @JsonProperty("playFromUpload")
    public void setPlayFromUpload(String playFromUpload) {
        this.playFromUpload = playFromUpload;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsPlayFromUpload instance}.
     */
    public CallsPlayFromUpload options(CallsPlayFromUploadOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsPlayFromUploadOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsPlayFromUploadOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsPlayFromUpload instance}.
     */
    public CallsPlayFromUpload actionId(Integer actionId) {
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
        CallsPlayFromUpload callsPlayFromUpload = (CallsPlayFromUpload) o;
        return Objects.equals(this.playFromUpload, callsPlayFromUpload.playFromUpload)
                && Objects.equals(this.options, callsPlayFromUpload.options)
                && Objects.equals(this.actionId, callsPlayFromUpload.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playFromUpload, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayFromUpload {")
                .append(newLine)
                .append("    playFromUpload: ")
                .append(toIndentedString(playFromUpload))
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
