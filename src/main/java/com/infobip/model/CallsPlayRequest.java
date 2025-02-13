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
 * Call play request.
 */
public class CallsPlayRequest {

    private Integer loopCount;

    private Long timeout;

    private Long offset;

    private CallsPlayContent content;

    private CallsTermination stopOn;

    private Map<String, String> customData = null;

    /**
     * Sets loopCount.
     * <p>
     * Field description:
     * Number of times the file will be played.
     *
     * @param loopCount
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest loopCount(Integer loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    /**
     * Returns loopCount.
     * <p>
     * Field description:
     * Number of times the file will be played.
     *
     * @return loopCount
     */
    @JsonProperty("loopCount")
    public Integer getLoopCount() {
        return loopCount;
    }

    /**
     * Sets loopCount.
     * <p>
     * Field description:
     * Number of times the file will be played.
     *
     * @param loopCount
     */
    @JsonProperty("loopCount")
    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, of the file to be played. If timeout is not defined, the file will be played until it ends.
     *
     * @param timeout
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest timeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, of the file to be played. If timeout is not defined, the file will be played until it ends.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Long getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, of the file to be played. If timeout is not defined, the file will be played until it ends.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets offset.
     * <p>
     * Field description:
     * The starting point, in milliseconds, from which the file will be played. If offset is not defined, the file will be played from its beginning.
     *
     * @param offset
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest offset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Returns offset.
     * <p>
     * Field description:
     * The starting point, in milliseconds, from which the file will be played. If offset is not defined, the file will be played from its beginning.
     *
     * @return offset
     */
    @JsonProperty("offset")
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     * <p>
     * Field description:
     * The starting point, in milliseconds, from which the file will be played. If offset is not defined, the file will be played from its beginning.
     *
     * @param offset
     */
    @JsonProperty("offset")
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest content(CallsPlayContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public CallsPlayContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(CallsPlayContent content) {
        this.content = content;
    }

    /**
     * Sets stopOn.
     *
     * @param stopOn
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest stopOn(CallsTermination stopOn) {
        this.stopOn = stopOn;
        return this;
    }

    /**
     * Returns stopOn.
     *
     * @return stopOn
     */
    @JsonProperty("stopOn")
    public CallsTermination getStopOn() {
        return stopOn;
    }

    /**
     * Sets stopOn.
     *
     * @param stopOn
     */
    @JsonProperty("stopOn")
    public void setStopOn(CallsTermination stopOn) {
        this.stopOn = stopOn;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallsPlayRequest instance}.
     */
    public CallsPlayRequest putCustomDataItem(String key, String customDataItem) {
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
        CallsPlayRequest callsPlayRequest = (CallsPlayRequest) o;
        return Objects.equals(this.loopCount, callsPlayRequest.loopCount)
                && Objects.equals(this.timeout, callsPlayRequest.timeout)
                && Objects.equals(this.offset, callsPlayRequest.offset)
                && Objects.equals(this.content, callsPlayRequest.content)
                && Objects.equals(this.stopOn, callsPlayRequest.stopOn)
                && Objects.equals(this.customData, callsPlayRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loopCount, timeout, offset, content, stopOn, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayRequest {")
                .append(newLine)
                .append("    loopCount: ")
                .append(toIndentedString(loopCount))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    offset: ")
                .append(toIndentedString(offset))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    stopOn: ")
                .append(toIndentedString(stopOn))
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
