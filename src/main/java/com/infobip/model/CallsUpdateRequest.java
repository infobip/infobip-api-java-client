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
 * Represents CallsUpdateRequest model.
 */
public class CallsUpdateRequest {

    private Boolean muted;

    private Boolean deaf;

    private Boolean blind;

    /**
     * Sets muted.
     * <p>
     * Field description:
     * Indicates whether to mute or unmute the end user. This action prevents the user from talking.
     *
     * @param muted
     * @return This {@link CallsUpdateRequest instance}.
     */
    public CallsUpdateRequest muted(Boolean muted) {
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
     * @return This {@link CallsUpdateRequest instance}.
     */
    public CallsUpdateRequest deaf(Boolean deaf) {
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
     * @return This {@link CallsUpdateRequest instance}.
     */
    public CallsUpdateRequest blind(Boolean blind) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsUpdateRequest callsUpdateRequest = (CallsUpdateRequest) o;
        return Objects.equals(this.muted, callsUpdateRequest.muted)
                && Objects.equals(this.deaf, callsUpdateRequest.deaf)
                && Objects.equals(this.blind, callsUpdateRequest.blind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(muted, deaf, blind);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsUpdateRequest {")
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
