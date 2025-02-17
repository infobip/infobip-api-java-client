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
 * Represents WebRtcTokenRequestModel model.
 */
public class WebRtcTokenRequestModel {

    private String identity;

    private String displayName;

    private WebRtcCapabilities capabilities;

    private Long timeToLive;

    /**
     * Sets identity.
     * <p>
     * Field description:
     * The identity used to present user on Infobip WebRTC platform. Must be unique. Must contain at least 3 and at most 64 unicode characters including -, _, ..
     * <p>
     * The field is required.
     *
     * @param identity
     * @return This {@link WebRtcTokenRequestModel instance}.
     */
    public WebRtcTokenRequestModel identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * The identity used to present user on Infobip WebRTC platform. Must be unique. Must contain at least 3 and at most 64 unicode characters including -, _, ..
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
     * The identity used to present user on Infobip WebRTC platform. Must be unique. Must contain at least 3 and at most 64 unicode characters including -, _, ..
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
     * Optional. A human-readable name for a given identity. Does not have to be unique. If set, it will be presented to all other users communicating with the identified user, along with identity. Must contain at least 5 and at most 50 characters.
     *
     * @param displayName
     * @return This {@link WebRtcTokenRequestModel instance}.
     */
    public WebRtcTokenRequestModel displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Optional. A human-readable name for a given identity. Does not have to be unique. If set, it will be presented to all other users communicating with the identified user, along with identity. Must contain at least 5 and at most 50 characters.
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
     * Optional. A human-readable name for a given identity. Does not have to be unique. If set, it will be presented to all other users communicating with the identified user, along with identity. Must contain at least 5 and at most 50 characters.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     * @return This {@link WebRtcTokenRequestModel instance}.
     */
    public WebRtcTokenRequestModel capabilities(WebRtcCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Returns capabilities.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public WebRtcCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(WebRtcCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets timeToLive.
     * <p>
     * Field description:
     * Optional. This field represents a number of seconds until the token expires. If not set, the token will last 8 hours. The maximum value is 24 hours.
     *
     * @param timeToLive
     * @return This {@link WebRtcTokenRequestModel instance}.
     */
    public WebRtcTokenRequestModel timeToLive(Long timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Returns timeToLive.
     * <p>
     * Field description:
     * Optional. This field represents a number of seconds until the token expires. If not set, the token will last 8 hours. The maximum value is 24 hours.
     *
     * @return timeToLive
     */
    @JsonProperty("timeToLive")
    public Long getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets timeToLive.
     * <p>
     * Field description:
     * Optional. This field represents a number of seconds until the token expires. If not set, the token will last 8 hours. The maximum value is 24 hours.
     *
     * @param timeToLive
     */
    @JsonProperty("timeToLive")
    public void setTimeToLive(Long timeToLive) {
        this.timeToLive = timeToLive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcTokenRequestModel webRtcTokenRequestModel = (WebRtcTokenRequestModel) o;
        return Objects.equals(this.identity, webRtcTokenRequestModel.identity)
                && Objects.equals(this.displayName, webRtcTokenRequestModel.displayName)
                && Objects.equals(this.capabilities, webRtcTokenRequestModel.capabilities)
                && Objects.equals(this.timeToLive, webRtcTokenRequestModel.timeToLive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, displayName, capabilities, timeToLive);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcTokenRequestModel {")
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    timeToLive: ")
                .append(toIndentedString(timeToLive))
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
