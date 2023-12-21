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
 * Represents CallsDtmfCaptureRequest model.
 */
public class CallsDtmfCaptureRequest {

    private Integer maxLength;

    private Integer timeout;

    private String terminator;

    private Integer digitTimeout;

    private CallsPlayContent playContent;

    private Map<String, String> customData = null;

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @param maxLength
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Returns maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @return maxLength
     */
    @JsonProperty("maxLength")
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @param maxLength
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, to wait for the first DTMF digit response.
     * <p>
     * The field is required.
     *
     * @param timeout
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, to wait for the first DTMF digit response.
     * <p>
     * The field is required.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, to wait for the first DTMF digit response.
     * <p>
     * The field is required.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @param terminator
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest terminator(String terminator) {
        this.terminator = terminator;
        return this;
    }

    /**
     * Returns terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @return terminator
     */
    @JsonProperty("terminator")
    public String getTerminator() {
        return terminator;
    }

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @param terminator
     */
    @JsonProperty("terminator")
    public void setTerminator(String terminator) {
        this.terminator = terminator;
    }

    /**
     * Sets digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @param digitTimeout
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest digitTimeout(Integer digitTimeout) {
        this.digitTimeout = digitTimeout;
        return this;
    }

    /**
     * Returns digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @return digitTimeout
     */
    @JsonProperty("digitTimeout")
    public Integer getDigitTimeout() {
        return digitTimeout;
    }

    /**
     * Sets digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @param digitTimeout
     */
    @JsonProperty("digitTimeout")
    public void setDigitTimeout(Integer digitTimeout) {
        this.digitTimeout = digitTimeout;
    }

    /**
     * Sets playContent.
     *
     * @param playContent
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest playContent(CallsPlayContent playContent) {
        this.playContent = playContent;
        return this;
    }

    /**
     * Returns playContent.
     *
     * @return playContent
     */
    @JsonProperty("playContent")
    public CallsPlayContent getPlayContent() {
        return playContent;
    }

    /**
     * Sets playContent.
     *
     * @param playContent
     */
    @JsonProperty("playContent")
    public void setPlayContent(CallsPlayContent playContent) {
        this.playContent = playContent;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest putCustomDataItem(String key, String customDataItem) {
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
        CallsDtmfCaptureRequest callsDtmfCaptureRequest = (CallsDtmfCaptureRequest) o;
        return Objects.equals(this.maxLength, callsDtmfCaptureRequest.maxLength)
                && Objects.equals(this.timeout, callsDtmfCaptureRequest.timeout)
                && Objects.equals(this.terminator, callsDtmfCaptureRequest.terminator)
                && Objects.equals(this.digitTimeout, callsDtmfCaptureRequest.digitTimeout)
                && Objects.equals(this.playContent, callsDtmfCaptureRequest.playContent)
                && Objects.equals(this.customData, callsDtmfCaptureRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLength, timeout, terminator, digitTimeout, playContent, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfCaptureRequest {")
                .append(newLine)
                .append("    maxLength: ")
                .append(toIndentedString(maxLength))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    terminator: ")
                .append(toIndentedString(terminator))
                .append(newLine)
                .append("    digitTimeout: ")
                .append(toIndentedString(digitTimeout))
                .append(newLine)
                .append("    playContent: ")
                .append(toIndentedString(playContent))
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
