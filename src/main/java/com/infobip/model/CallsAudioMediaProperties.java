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
 * Audio media properties.
 */
public class CallsAudioMediaProperties {

    private Boolean muted;

    private Boolean userMuted;

    private Boolean deaf;

    /**
     * Sets muted.
     * <p>
     * Field description:
     * Indicates whether the end user can speak.
     *
     * @param muted
     * @return This {@link CallsAudioMediaProperties instance}.
     */
    public CallsAudioMediaProperties muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * Returns muted.
     * <p>
     * Field description:
     * Indicates whether the end user can speak.
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
     * Indicates whether the end user can speak.
     *
     * @param muted
     */
    @JsonProperty("muted")
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    /**
     * Sets userMuted.
     * <p>
     * Field description:
     * Indicates whether the end user muted himself.
     *
     * @param userMuted
     * @return This {@link CallsAudioMediaProperties instance}.
     */
    public CallsAudioMediaProperties userMuted(Boolean userMuted) {
        this.userMuted = userMuted;
        return this;
    }

    /**
     * Returns userMuted.
     * <p>
     * Field description:
     * Indicates whether the end user muted himself.
     *
     * @return userMuted
     */
    @JsonProperty("userMuted")
    public Boolean getUserMuted() {
        return userMuted;
    }

    /**
     * Sets userMuted.
     * <p>
     * Field description:
     * Indicates whether the end user muted himself.
     *
     * @param userMuted
     */
    @JsonProperty("userMuted")
    public void setUserMuted(Boolean userMuted) {
        this.userMuted = userMuted;
    }

    /**
     * Sets deaf.
     * <p>
     * Field description:
     * Indicates whether the end user can hear.
     *
     * @param deaf
     * @return This {@link CallsAudioMediaProperties instance}.
     */
    public CallsAudioMediaProperties deaf(Boolean deaf) {
        this.deaf = deaf;
        return this;
    }

    /**
     * Returns deaf.
     * <p>
     * Field description:
     * Indicates whether the end user can hear.
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
     * Indicates whether the end user can hear.
     *
     * @param deaf
     */
    @JsonProperty("deaf")
    public void setDeaf(Boolean deaf) {
        this.deaf = deaf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAudioMediaProperties callsAudioMediaProperties = (CallsAudioMediaProperties) o;
        return Objects.equals(this.muted, callsAudioMediaProperties.muted)
                && Objects.equals(this.userMuted, callsAudioMediaProperties.userMuted)
                && Objects.equals(this.deaf, callsAudioMediaProperties.deaf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(muted, userMuted, deaf);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAudioMediaProperties {")
                .append(newLine)
                .append("    muted: ")
                .append(toIndentedString(muted))
                .append(newLine)
                .append("    userMuted: ")
                .append(toIndentedString(userMuted))
                .append(newLine)
                .append("    deaf: ")
                .append(toIndentedString(deaf))
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
