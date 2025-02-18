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
 * Represents WebRtcCallsDestination model.
 */
public class WebRtcCallsDestination extends WebRtcDestination {

    private String identity;

    private String displayName;

    private WebRtcHangupRestriction hangupRestriction;

    /**
     * Constructs a new {@link WebRtcCallsDestination} instance.
     */
    public WebRtcCallsDestination() {
        super("WEBRTC");
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * The identity to present a user on the Infobip WebRTC platform. It represents a person who will receive a ring once the call is made.
     * <p>
     * The field is required.
     *
     * @param identity
     * @return This {@link WebRtcCallsDestination instance}.
     */
    public WebRtcCallsDestination identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * The identity to present a user on the Infobip WebRTC platform. It represents a person who will receive a ring once the call is made.
     * <p>
     * The field is required.
     *
     * @return identity
     */
    @JsonProperty("identity")
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * The identity to present a user on the Infobip WebRTC platform. It represents a person who will receive a ring once the call is made.
     * <p>
     * The field is required.
     *
     * @param identity
     */
    @JsonProperty("identity")
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call link UI will use instead of a display name obtained from the Infobip WebRTC platform. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     * @return This {@link WebRtcCallsDestination instance}.
     */
    public WebRtcCallsDestination displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call link UI will use instead of a display name obtained from the Infobip WebRTC platform. If a destination display name is an empty string, the UI will hide it.
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
     * Destination display name, if defined, that the call link UI will use instead of a display name obtained from the Infobip WebRTC platform. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets hangupRestriction.
     *
     * @param hangupRestriction
     * @return This {@link WebRtcCallsDestination instance}.
     */
    public WebRtcCallsDestination hangupRestriction(WebRtcHangupRestriction hangupRestriction) {
        this.hangupRestriction = hangupRestriction;
        return this;
    }

    /**
     * Returns hangupRestriction.
     *
     * @return hangupRestriction
     */
    @JsonProperty("hangupRestriction")
    public WebRtcHangupRestriction getHangupRestriction() {
        return hangupRestriction;
    }

    /**
     * Sets hangupRestriction.
     *
     * @param hangupRestriction
     */
    @JsonProperty("hangupRestriction")
    public void setHangupRestriction(WebRtcHangupRestriction hangupRestriction) {
        this.hangupRestriction = hangupRestriction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcCallsDestination webRtcCallsDestination = (WebRtcCallsDestination) o;
        return Objects.equals(this.identity, webRtcCallsDestination.identity)
                && Objects.equals(this.displayName, webRtcCallsDestination.displayName)
                && Objects.equals(this.hangupRestriction, webRtcCallsDestination.hangupRestriction)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, displayName, hangupRestriction, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallsDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
                .append(newLine)
                .append("    hangupRestriction: ")
                .append(toIndentedString(hangupRestriction))
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
