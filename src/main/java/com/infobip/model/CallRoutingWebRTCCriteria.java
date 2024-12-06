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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallRoutingWebRTCCriteria model.
 */
public class CallRoutingWebRTCCriteria extends CallRoutingCriteria {

    private String identity;

    private List<CallRoutingCustomDataEntry> customData = null;

    /**
     * Constructs a new {@link CallRoutingWebRTCCriteria} instance.
     */
    public CallRoutingWebRTCCriteria() {
        super("WEBRTC");
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * WebRTC identity or regular expression pattern representing identity. Examples: &#x60;WebRTC_user&#x60;, &#x60;WebRTC_(.+)&#x60;.
     *
     * @param identity
     * @return This {@link CallRoutingWebRTCCriteria instance}.
     */
    public CallRoutingWebRTCCriteria identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * WebRTC identity or regular expression pattern representing identity. Examples: &#x60;WebRTC_user&#x60;, &#x60;WebRTC_(.+)&#x60;.
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
     * WebRTC identity or regular expression pattern representing identity. Examples: &#x60;WebRTC_user&#x60;, &#x60;WebRTC_(.+)&#x60;.
     *
     * @param identity
     */
    @JsonProperty("identity")
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * WebRTC custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @param customData
     * @return This {@link CallRoutingWebRTCCriteria instance}.
     */
    public CallRoutingWebRTCCriteria customData(List<CallRoutingCustomDataEntry> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Adds and item into customData.
     * <p>
     * Field description:
     * WebRTC custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @param customDataItem The item to be added to the list.
     * @return This {@link CallRoutingWebRTCCriteria instance}.
     */
    public CallRoutingWebRTCCriteria addCustomDataItem(CallRoutingCustomDataEntry customDataItem) {
        if (this.customData == null) {
            this.customData = new ArrayList<>();
        }
        this.customData.add(customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * WebRTC custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public List<CallRoutingCustomDataEntry> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * WebRTC custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(List<CallRoutingCustomDataEntry> customData) {
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
        CallRoutingWebRTCCriteria callRoutingWebRTCCriteria = (CallRoutingWebRTCCriteria) o;
        return Objects.equals(this.identity, callRoutingWebRTCCriteria.identity)
                && Objects.equals(this.customData, callRoutingWebRTCCriteria.customData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, customData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingWebRTCCriteria {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
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
