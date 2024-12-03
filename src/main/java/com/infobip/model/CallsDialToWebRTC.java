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
 * Dial to WebRTC action performs a call redirection to WebRTC application, joining the user’s call with the WebRTC application. After Dial to WebRTC action the following actions are forbidden: Say, Collect, Dial, Dial to Many, Dial to WebRTC, Dial to SIP trunk, Dial to Conversations, Play, Record and Play from Recording.
 */
public class CallsDialToWebRTC implements CallsScriptInner {

    private String dialToWebRTC;

    /**
     * Sets dialToWebRTC.
     * <p>
     * Field description:
     * Web and in-app calls applicationId. Read more about Web and in-app calls [here](https://www.infobip.com/docs/voice-and-video/web-and-in-app-calls)
     * <p>
     * The field is required.
     *
     * @param dialToWebRTC
     * @return This {@link CallsDialToWebRTC instance}.
     */
    public CallsDialToWebRTC dialToWebRTC(String dialToWebRTC) {
        this.dialToWebRTC = dialToWebRTC;
        return this;
    }

    /**
     * Returns dialToWebRTC.
     * <p>
     * Field description:
     * Web and in-app calls applicationId. Read more about Web and in-app calls [here](https://www.infobip.com/docs/voice-and-video/web-and-in-app-calls)
     * <p>
     * The field is required.
     *
     * @return dialToWebRTC
     */
    @JsonProperty("dialToWebRTC")
    public String getDialToWebRTC() {
        return dialToWebRTC;
    }

    /**
     * Sets dialToWebRTC.
     * <p>
     * Field description:
     * Web and in-app calls applicationId. Read more about Web and in-app calls [here](https://www.infobip.com/docs/voice-and-video/web-and-in-app-calls)
     * <p>
     * The field is required.
     *
     * @param dialToWebRTC
     */
    @JsonProperty("dialToWebRTC")
    public void setDialToWebRTC(String dialToWebRTC) {
        this.dialToWebRTC = dialToWebRTC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialToWebRTC callsDialToWebRTC = (CallsDialToWebRTC) o;
        return Objects.equals(this.dialToWebRTC, callsDialToWebRTC.dialToWebRTC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialToWebRTC);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialToWebRTC {")
                .append(newLine)
                .append("    dialToWebRTC: ")
                .append(toIndentedString(dialToWebRTC))
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
