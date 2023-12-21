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
 * Represents CallRoutingWebRtcEndpoint model.
 */
public class CallRoutingWebRtcEndpoint extends CallRoutingEndpoint {

    private String identity;

    /**
     * Constructs a new {@link CallRoutingWebRtcEndpoint} instance.
     */
    public CallRoutingWebRtcEndpoint() {
        super("WEBRTC");
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * The unique identity used to present a user on the Infobip WebRTC platform.
     * <p>
     * The field is required.
     *
     * @param identity
     * @return This {@link CallRoutingWebRtcEndpoint instance}.
     */
    public CallRoutingWebRtcEndpoint identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * The unique identity used to present a user on the Infobip WebRTC platform.
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
     * The unique identity used to present a user on the Infobip WebRTC platform.
     * <p>
     * The field is required.
     *
     * @param identity
     */
    @JsonProperty("identity")
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingWebRtcEndpoint callRoutingWebRtcEndpoint = (CallRoutingWebRtcEndpoint) o;
        return Objects.equals(this.identity, callRoutingWebRtcEndpoint.identity) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingWebRtcEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
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
