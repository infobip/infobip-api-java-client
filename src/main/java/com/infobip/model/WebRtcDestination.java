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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Description of who or what is going to receive a call.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WebRtcApplicationDestination.class, name = "APPLICATION"),
    @JsonSubTypes.Type(value = WebRtcConversationsDestination.class, name = "CONVERSATIONS"),
    @JsonSubTypes.Type(value = WebRtcPhoneDestination.class, name = "PHONE"),
    @JsonSubTypes.Type(value = WebRtcRoomDestination.class, name = "ROOM"),
    @JsonSubTypes.Type(value = WebRtcWebRtcDestination.class, name = "WEBRTC"),
})
public abstract class WebRtcDestination {

    protected final WebRtcDestinationType type;

    /**
     * Constructs a new {@link WebRtcDestination} instance.
     */
    public WebRtcDestination(String type) {
        this.type = WebRtcDestinationType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WebRtcDestinationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcDestination webRtcDestination = (WebRtcDestination) o;
        return Objects.equals(this.type, webRtcDestination.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcDestination {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
