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
 * Represents WebRtcConversationsDestination model.
 */
public class WebRtcConversationsDestination extends WebRtcDestination {

    private String displayName;

    /**
     * Constructs a new {@link WebRtcConversationsDestination} instance.
     */
    public WebRtcConversationsDestination() {
        super("CONVERSATIONS");
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     * @return This {@link WebRtcConversationsDestination instance}.
     */
    public WebRtcConversationsDestination displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @return displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcConversationsDestination webRtcConversationsDestination = (WebRtcConversationsDestination) o;
        return Objects.equals(this.displayName, webRtcConversationsDestination.displayName) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcConversationsDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
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
