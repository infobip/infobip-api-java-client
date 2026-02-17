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
 * Properties of the events that provide DTMF capturing result.
 */
public class CallsDtmfProperties {

    private String dtmf;

    private Boolean timeout;

    private Map<String, String> customData = null;

    private CallsPlayedContentProperties playedContentProperties;

    /**
     * Sets dtmf.
     * <p>
     * Field description:
     * Collected DTMF input.
     *
     * @param dtmf
     * @return This {@link CallsDtmfProperties instance}.
     */
    public CallsDtmfProperties dtmf(String dtmf) {
        this.dtmf = dtmf;
        return this;
    }

    /**
     * Returns dtmf.
     * <p>
     * Field description:
     * Collected DTMF input.
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
     * Collected DTMF input.
     *
     * @param dtmf
     */
    @JsonProperty("dtmf")
    public void setDtmf(String dtmf) {
        this.dtmf = dtmf;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Whether collection was terminated by the timeout.
     *
     * @param timeout
     * @return This {@link CallsDtmfProperties instance}.
     */
    public CallsDtmfProperties timeout(Boolean timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * Whether collection was terminated by the timeout.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Boolean getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Whether collection was terminated by the timeout.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Boolean timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsDtmfProperties instance}.
     */
    public CallsDtmfProperties customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsDtmfProperties instance}.
     */
    public CallsDtmfProperties putCustomDataItem(String key, String customDataItem) {
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
     * Custom data.
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
     * Custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets playedContentProperties.
     *
     * @param playedContentProperties
     * @return This {@link CallsDtmfProperties instance}.
     */
    public CallsDtmfProperties playedContentProperties(CallsPlayedContentProperties playedContentProperties) {
        this.playedContentProperties = playedContentProperties;
        return this;
    }

    /**
     * Returns playedContentProperties.
     *
     * @return playedContentProperties
     */
    @JsonProperty("playedContentProperties")
    public CallsPlayedContentProperties getPlayedContentProperties() {
        return playedContentProperties;
    }

    /**
     * Sets playedContentProperties.
     *
     * @param playedContentProperties
     */
    @JsonProperty("playedContentProperties")
    public void setPlayedContentProperties(CallsPlayedContentProperties playedContentProperties) {
        this.playedContentProperties = playedContentProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDtmfProperties callsDtmfProperties = (CallsDtmfProperties) o;
        return Objects.equals(this.dtmf, callsDtmfProperties.dtmf)
                && Objects.equals(this.timeout, callsDtmfProperties.timeout)
                && Objects.equals(this.customData, callsDtmfProperties.customData)
                && Objects.equals(this.playedContentProperties, callsDtmfProperties.playedContentProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtmf, timeout, customData, playedContentProperties);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfProperties {")
                .append(newLine)
                .append("    dtmf: ")
                .append(toIndentedString(dtmf))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    playedContentProperties: ")
                .append(toIndentedString(playedContentProperties))
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
