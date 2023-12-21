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
 * Represents CallsDtmfSendRequest model.
 */
public class CallsDtmfSendRequest {

    private Map<String, String> customData = null;

    private String dtmf;

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     * @return This {@link CallsDtmfSendRequest instance}.
     */
    public CallsDtmfSendRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallsDtmfSendRequest instance}.
     */
    public CallsDtmfSendRequest putCustomDataItem(String key, String customDataItem) {
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

    /**
     * Sets dtmf.
     * <p>
     * Field description:
     * DTMF digits to send.
     * <p>
     * The field is required.
     *
     * @param dtmf
     * @return This {@link CallsDtmfSendRequest instance}.
     */
    public CallsDtmfSendRequest dtmf(String dtmf) {
        this.dtmf = dtmf;
        return this;
    }

    /**
     * Returns dtmf.
     * <p>
     * Field description:
     * DTMF digits to send.
     * <p>
     * The field is required.
     *
     * @return dtmf
     */
    @JsonProperty("dtmf")
    public String getDtmf() {
        return dtmf;
    }

    /**
     * Sets dtmf.
     * <p>
     * Field description:
     * DTMF digits to send.
     * <p>
     * The field is required.
     *
     * @param dtmf
     */
    @JsonProperty("dtmf")
    public void setDtmf(String dtmf) {
        this.dtmf = dtmf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDtmfSendRequest callsDtmfSendRequest = (CallsDtmfSendRequest) o;
        return Objects.equals(this.customData, callsDtmfSendRequest.customData)
                && Objects.equals(this.dtmf, callsDtmfSendRequest.dtmf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, dtmf);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfSendRequest {")
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    dtmf: ")
                .append(toIndentedString(dtmf))
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
