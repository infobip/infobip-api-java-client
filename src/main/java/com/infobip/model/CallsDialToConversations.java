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
 * Dial to Conversations action performs a call redirection to the [Infobip Conversations platform](https://www.infobip.com/docs/conversations), joining the user’s call with an agent. After Dial to Conversations action the following actions are forbidden: Say, Collect, Dial, Dial to Many, Dial to WebRTC, Dial to SIP trunk, Dial to Conversations, Play, Record and Play from Recording.
 */
public class CallsDialToConversations implements CallsScriptInner {

    private CallsDialToConversationsData dialToConversations;

    /**
     * Sets dialToConversations.
     * <p>
     * The field is required.
     *
     * @param dialToConversations
     * @return This {@link CallsDialToConversations instance}.
     */
    public CallsDialToConversations dialToConversations(CallsDialToConversationsData dialToConversations) {
        this.dialToConversations = dialToConversations;
        return this;
    }

    /**
     * Returns dialToConversations.
     * <p>
     * The field is required.
     *
     * @return dialToConversations
     */
    @JsonProperty("dialToConversations")
    public CallsDialToConversationsData getDialToConversations() {
        return dialToConversations;
    }

    /**
     * Sets dialToConversations.
     * <p>
     * The field is required.
     *
     * @param dialToConversations
     */
    @JsonProperty("dialToConversations")
    public void setDialToConversations(CallsDialToConversationsData dialToConversations) {
        this.dialToConversations = dialToConversations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialToConversations callsDialToConversations = (CallsDialToConversations) o;
        return Objects.equals(this.dialToConversations, callsDialToConversations.dialToConversations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialToConversations);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialToConversations {")
                .append(newLine)
                .append("    dialToConversations: ")
                .append(toIndentedString(dialToConversations))
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
