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
 * List of call recordings.
 */
public class WebRtcFileRecording {

    private String callId;

    private WebRtcFile _file;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Id of the call.
     *
     * @param callId
     * @return This {@link WebRtcFileRecording instance}.
     */
    public WebRtcFileRecording callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Id of the call.
     *
     * @return callId
     */
    @JsonProperty("callId")
    public String getCallId() {
        return callId;
    }

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Id of the call.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets _file.
     *
     * @param _file
     * @return This {@link WebRtcFileRecording instance}.
     */
    public WebRtcFileRecording _file(WebRtcFile _file) {
        this._file = _file;
        return this;
    }

    /**
     * Returns _file.
     *
     * @return _file
     */
    @JsonProperty("file")
    public WebRtcFile getFile() {
        return _file;
    }

    /**
     * Sets _file.
     *
     * @param _file
     */
    @JsonProperty("file")
    public void setFile(WebRtcFile _file) {
        this._file = _file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcFileRecording webRtcFileRecording = (WebRtcFileRecording) o;
        return Objects.equals(this.callId, webRtcFileRecording.callId)
                && Objects.equals(this._file, webRtcFileRecording._file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callId, _file);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcFileRecording {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    _file: ")
                .append(toIndentedString(_file))
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
