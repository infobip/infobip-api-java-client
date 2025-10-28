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
 * Represents CallsUpdateCallRequest model.
 */
public class CallsUpdateCallRequest {

    private Boolean muted;

    private Boolean deaf;

    private Boolean blind;

    private CallsRole role;

    /**
     * Sets muted.
     * <p>
     * Field description:
     * Indicates whether to mute or unmute the end user. This action prevents the user from talking.
     *
     * @param muted
     * @return This {@link CallsUpdateCallRequest instance}.
     */
    public CallsUpdateCallRequest muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * Returns muted.
     * <p>
     * Field description:
     * Indicates whether to mute or unmute the end user. This action prevents the user from talking.
     *
     * @return muted
     */
    @JsonProperty("muted")
    public Boolean getMuted() {
        return muted;
    }

    /**
     * Sets muted.
     * <p>
     * Field description:
     * Indicates whether to mute or unmute the end user. This action prevents the user from talking.
     *
     * @param muted
     */
    @JsonProperty("muted")
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    /**
     * Sets deaf.
     * <p>
     * Field description:
     * Indicates whether to deaf or undeaf the end user. This action prevents the user from hearing the call.
     *
     * @param deaf
     * @return This {@link CallsUpdateCallRequest instance}.
     */
    public CallsUpdateCallRequest deaf(Boolean deaf) {
        this.deaf = deaf;
        return this;
    }

    /**
     * Returns deaf.
     * <p>
     * Field description:
     * Indicates whether to deaf or undeaf the end user. This action prevents the user from hearing the call.
     *
     * @return deaf
     */
    @JsonProperty("deaf")
    public Boolean getDeaf() {
        return deaf;
    }

    /**
     * Sets deaf.
     * <p>
     * Field description:
     * Indicates whether to deaf or undeaf the end user. This action prevents the user from hearing the call.
     *
     * @param deaf
     */
    @JsonProperty("deaf")
    public void setDeaf(Boolean deaf) {
        this.deaf = deaf;
    }

    /**
     * Sets blind.
     * <p>
     * Field description:
     * Indicates whether to blind or unblind the end user. This action prevents the user from seeing any remote video in the call. Only applicable for WebRTC endpoints.
     *
     * @param blind
     * @return This {@link CallsUpdateCallRequest instance}.
     */
    public CallsUpdateCallRequest blind(Boolean blind) {
        this.blind = blind;
        return this;
    }

    /**
     * Returns blind.
     * <p>
     * Field description:
     * Indicates whether to blind or unblind the end user. This action prevents the user from seeing any remote video in the call. Only applicable for WebRTC endpoints.
     *
     * @return blind
     */
    @JsonProperty("blind")
    public Boolean getBlind() {
        return blind;
    }

    /**
     * Sets blind.
     * <p>
     * Field description:
     * Indicates whether to blind or unblind the end user. This action prevents the user from seeing any remote video in the call. Only applicable for WebRTC endpoints.
     *
     * @param blind
     */
    @JsonProperty("blind")
    public void setBlind(Boolean blind) {
        this.blind = blind;
    }

    /**
     * Sets role.
     *
     * @param role
     * @return This {@link CallsUpdateCallRequest instance}.
     */
    public CallsUpdateCallRequest role(CallsRole role) {
        this.role = role;
        return this;
    }

    /**
     * Returns role.
     *
     * @return role
     */
    @JsonProperty("role")
    public CallsRole getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role
     */
    @JsonProperty("role")
    public void setRole(CallsRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsUpdateCallRequest callsUpdateCallRequest = (CallsUpdateCallRequest) o;
        return Objects.equals(this.muted, callsUpdateCallRequest.muted)
                && Objects.equals(this.deaf, callsUpdateCallRequest.deaf)
                && Objects.equals(this.blind, callsUpdateCallRequest.blind)
                && Objects.equals(this.role, callsUpdateCallRequest.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(muted, deaf, blind, role);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsUpdateCallRequest {")
                .append(newLine)
                .append("    muted: ")
                .append(toIndentedString(muted))
                .append(newLine)
                .append("    deaf: ")
                .append(toIndentedString(deaf))
                .append(newLine)
                .append("    blind: ")
                .append(toIndentedString(blind))
                .append(newLine)
                .append("    role: ")
                .append(toIndentedString(role))
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
