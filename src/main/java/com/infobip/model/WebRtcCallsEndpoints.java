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
 * Represents WebRtcCallsEndpoints model.
 */
public class WebRtcCallsEndpoints extends WebRtcEndpoint {

    private String identity;

    private String displayName;

    /**
     * Constructs a new {@link WebRtcCallsEndpoints} instance.
     */
    public WebRtcCallsEndpoints() {
        super("WEBRTC");
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * Identity of the call link participant.
     * <p>
     * The field is required.
     *
     * @param identity
     * @return This {@link WebRtcCallsEndpoints instance}.
     */
    public WebRtcCallsEndpoints identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * Identity of the call link participant.
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
     * Identity of the call link participant.
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
     * Display name of the call link participant.
     *
     * @param displayName
     * @return This {@link WebRtcCallsEndpoints instance}.
     */
    public WebRtcCallsEndpoints displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Display name of the call link participant.
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
     * Display name of the call link participant.
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
        WebRtcCallsEndpoints webRtcCallsEndpoints = (WebRtcCallsEndpoints) o;
        return Objects.equals(this.identity, webRtcCallsEndpoints.identity)
                && Objects.equals(this.displayName, webRtcCallsEndpoints.displayName)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, displayName, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallsEndpoints {")
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
