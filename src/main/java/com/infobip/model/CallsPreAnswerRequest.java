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
 * Represents CallsPreAnswerRequest model.
 */
public class CallsPreAnswerRequest {

    private Boolean ringing;

    private Map<String, String> customData = null;

    /**
     * Sets ringing.
     * <p>
     * Field description:
     * Indicates whether to play a ringing sound on the call after pre-answering it.
     *
     * @param ringing
     * @return This {@link CallsPreAnswerRequest instance}.
     */
    public CallsPreAnswerRequest ringing(Boolean ringing) {
        this.ringing = ringing;
        return this;
    }

    /**
     * Returns ringing.
     * <p>
     * Field description:
     * Indicates whether to play a ringing sound on the call after pre-answering it.
     *
     * @return ringing
     */
    @JsonProperty("ringing")
    public Boolean getRinging() {
        return ringing;
    }

    /**
     * Sets ringing.
     * <p>
     * Field description:
     * Indicates whether to play a ringing sound on the call after pre-answering it.
     *
     * @param ringing
     */
    @JsonProperty("ringing")
    public void setRinging(Boolean ringing) {
        this.ringing = ringing;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     * @return This {@link CallsPreAnswerRequest instance}.
     */
    public CallsPreAnswerRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallsPreAnswerRequest instance}.
     */
    public CallsPreAnswerRequest putCustomDataItem(String key, String customDataItem) {
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
        CallsPreAnswerRequest callsPreAnswerRequest = (CallsPreAnswerRequest) o;
        return Objects.equals(this.ringing, callsPreAnswerRequest.ringing)
                && Objects.equals(this.customData, callsPreAnswerRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ringing, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPreAnswerRequest {")
                .append(newLine)
                .append("    ringing: ")
                .append(toIndentedString(ringing))
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
