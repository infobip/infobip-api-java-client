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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallRoutingSimulatorWebRTCEndpoint model.
 */
public class CallRoutingSimulatorWebRTCEndpoint extends CallRoutingSimulatorCallEndpoint {

    private String from;

    private Map<String, String> customData = null;

    /**
     * Constructs a new {@link CallRoutingSimulatorWebRTCEndpoint} instance.
     */
    public CallRoutingSimulatorWebRTCEndpoint() {
        super("WEBRTC");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The unique from identity used to present a user on the Infobip WebRTC platform.
     *
     * @param from
     * @return This {@link CallRoutingSimulatorWebRTCEndpoint instance}.
     */
    public CallRoutingSimulatorWebRTCEndpoint from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The unique from identity used to present a user on the Infobip WebRTC platform.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The unique from identity used to present a user on the Infobip WebRTC platform.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * WebRTC custom data.
     *
     * @param customData
     * @return This {@link CallRoutingSimulatorWebRTCEndpoint instance}.
     */
    public CallRoutingSimulatorWebRTCEndpoint customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * WebRTC custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRoutingSimulatorWebRTCEndpoint instance}.
     */
    public CallRoutingSimulatorWebRTCEndpoint putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * WebRTC custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * WebRTC custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingSimulatorWebRTCEndpoint callRoutingSimulatorWebRTCEndpoint = (CallRoutingSimulatorWebRTCEndpoint) o;
        return Objects.equals(this.from, callRoutingSimulatorWebRTCEndpoint.from)
                && Objects.equals(this.customData, callRoutingSimulatorWebRTCEndpoint.customData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, customData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSimulatorWebRTCEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
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
