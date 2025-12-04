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
 * Represents ChannelCapability model.
 */
public class ChannelCapability {

    private String channel;

    private Boolean supported;

    private String reason;

    /**
     * Sets channel.
     * <p>
     * Field description:
     * The communication channel (e.g., SMS, VOICE, RCS, WHATSAPP).
     *
     * @param channel
     * @return This {@link ChannelCapability instance}.
     */
    public ChannelCapability channel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     * <p>
     * Field description:
     * The communication channel (e.g., SMS, VOICE, RCS, WHATSAPP).
     *
     * @return channel
     */
    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     * <p>
     * Field description:
     * The communication channel (e.g., SMS, VOICE, RCS, WHATSAPP).
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * Sets supported.
     * <p>
     * Field description:
     * Whether the channel is supported for this phone number.
     *
     * @param supported
     * @return This {@link ChannelCapability instance}.
     */
    public ChannelCapability supported(Boolean supported) {
        this.supported = supported;
        return this;
    }

    /**
     * Returns supported.
     * <p>
     * Field description:
     * Whether the channel is supported for this phone number.
     *
     * @return supported
     */
    @JsonProperty("supported")
    public Boolean getSupported() {
        return supported;
    }

    /**
     * Sets supported.
     * <p>
     * Field description:
     * Whether the channel is supported for this phone number.
     *
     * @param supported
     */
    @JsonProperty("supported")
    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Optional reason why a channel is not supported.
     *
     * @param reason
     * @return This {@link ChannelCapability instance}.
     */
    public ChannelCapability reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Optional reason why a channel is not supported.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Optional reason why a channel is not supported.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelCapability channelCapability = (ChannelCapability) o;
        return Objects.equals(this.channel, channelCapability.channel)
                && Objects.equals(this.supported, channelCapability.supported)
                && Objects.equals(this.reason, channelCapability.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, supported, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ChannelCapability {")
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    supported: ")
                .append(toIndentedString(supported))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
