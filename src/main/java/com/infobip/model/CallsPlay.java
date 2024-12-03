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
 * Play action performs playback of audio provided by the client’s URL. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
 */
public class CallsPlay implements CallsScriptInner {

    private String playFromUrl;

    private Integer actionId;

    /**
     * Sets playFromUrl.
     * <p>
     * Field description:
     * Audio file URL.
     * <p>
     * The field is required.
     *
     * @param playFromUrl
     * @return This {@link CallsPlay instance}.
     */
    public CallsPlay playFromUrl(String playFromUrl) {
        this.playFromUrl = playFromUrl;
        return this;
    }

    /**
     * Returns playFromUrl.
     * <p>
     * Field description:
     * Audio file URL.
     * <p>
     * The field is required.
     *
     * @return playFromUrl
     */
    @JsonProperty("playFromUrl")
    public String getPlayFromUrl() {
        return playFromUrl;
    }

    /**
     * Sets playFromUrl.
     * <p>
     * Field description:
     * Audio file URL.
     * <p>
     * The field is required.
     *
     * @param playFromUrl
     */
    @JsonProperty("playFromUrl")
    public void setPlayFromUrl(String playFromUrl) {
        this.playFromUrl = playFromUrl;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsPlay instance}.
     */
    public CallsPlay actionId(Integer actionId) {
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
        CallsPlay callsPlay = (CallsPlay) o;
        return Objects.equals(this.playFromUrl, callsPlay.playFromUrl)
                && Objects.equals(this.actionId, callsPlay.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playFromUrl, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlay {")
                .append(newLine)
                .append("    playFromUrl: ")
                .append(toIndentedString(playFromUrl))
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
