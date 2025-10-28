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
 * Represents CallsAddExistingCallRequest model.
 */
public class CallsAddExistingCallRequest {

    private Boolean connectOnEarlyMedia;

    private RingbackGeneration ringbackGeneration;

    private CallsRole role;

    private Map<String, String> customData = null;

    /**
     * Sets connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to add an existing call on early media. Otherwise, the call will be added after being established. This field is applicable for &#x60;OUTBOUND&#x60; calls only. Cannot be &#x60;true&#x60; when &#x60;ringbackGeneration&#x60; is enabled.
     *
     * @param connectOnEarlyMedia
     * @return This {@link CallsAddExistingCallRequest instance}.
     */
    public CallsAddExistingCallRequest connectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
        return this;
    }

    /**
     * Returns connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to add an existing call on early media. Otherwise, the call will be added after being established. This field is applicable for &#x60;OUTBOUND&#x60; calls only. Cannot be &#x60;true&#x60; when &#x60;ringbackGeneration&#x60; is enabled.
     *
     * @return connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public Boolean getConnectOnEarlyMedia() {
        return connectOnEarlyMedia;
    }

    /**
     * Sets connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to add an existing call on early media. Otherwise, the call will be added after being established. This field is applicable for &#x60;OUTBOUND&#x60; calls only. Cannot be &#x60;true&#x60; when &#x60;ringbackGeneration&#x60; is enabled.
     *
     * @param connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public void setConnectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
    }

    /**
     * Sets ringbackGeneration.
     *
     * @param ringbackGeneration
     * @return This {@link CallsAddExistingCallRequest instance}.
     */
    public CallsAddExistingCallRequest ringbackGeneration(RingbackGeneration ringbackGeneration) {
        this.ringbackGeneration = ringbackGeneration;
        return this;
    }

    /**
     * Returns ringbackGeneration.
     *
     * @return ringbackGeneration
     */
    @JsonProperty("ringbackGeneration")
    public RingbackGeneration getRingbackGeneration() {
        return ringbackGeneration;
    }

    /**
     * Sets ringbackGeneration.
     *
     * @param ringbackGeneration
     */
    @JsonProperty("ringbackGeneration")
    public void setRingbackGeneration(RingbackGeneration ringbackGeneration) {
        this.ringbackGeneration = ringbackGeneration;
    }

    /**
     * Sets role.
     *
     * @param role
     * @return This {@link CallsAddExistingCallRequest instance}.
     */
    public CallsAddExistingCallRequest role(CallsRole role) {
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

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     * @return This {@link CallsAddExistingCallRequest instance}.
     */
    public CallsAddExistingCallRequest customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsAddExistingCallRequest instance}.
     */
    public CallsAddExistingCallRequest putCustomDataItem(String key, String customDataItem) {
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
     * Optional parameter to update a call&#39;s custom data.
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
     * Optional parameter to update a call&#39;s custom data.
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
        CallsAddExistingCallRequest callsAddExistingCallRequest = (CallsAddExistingCallRequest) o;
        return Objects.equals(this.connectOnEarlyMedia, callsAddExistingCallRequest.connectOnEarlyMedia)
                && Objects.equals(this.ringbackGeneration, callsAddExistingCallRequest.ringbackGeneration)
                && Objects.equals(this.role, callsAddExistingCallRequest.role)
                && Objects.equals(this.customData, callsAddExistingCallRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectOnEarlyMedia, ringbackGeneration, role, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAddExistingCallRequest {")
                .append(newLine)
                .append("    connectOnEarlyMedia: ")
                .append(toIndentedString(connectOnEarlyMedia))
                .append(newLine)
                .append("    ringbackGeneration: ")
                .append(toIndentedString(ringbackGeneration))
                .append(newLine)
                .append("    role: ")
                .append(toIndentedString(role))
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
