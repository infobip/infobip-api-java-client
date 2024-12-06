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
 * Fields representing details specific for voice messages.
 */
public class CallsVoiceData {

    private String feature;

    private String startTime;

    private String answerTime;

    private String endTime;

    private Integer duration;

    private Integer chargedDuration;

    private Double fileDuration;

    private String dtmfCodes;

    private CallsIvrData ivr;

    /**
     * Sets feature.
     * <p>
     * Field description:
     * Name of the Infobip Voice service or feature.
     *
     * @param feature
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData feature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * Returns feature.
     * <p>
     * Field description:
     * Name of the Infobip Voice service or feature.
     *
     * @return feature
     */
    @JsonProperty("feature")
    public String getFeature() {
        return feature;
    }

    /**
     * Sets feature.
     * <p>
     * Field description:
     * Name of the Infobip Voice service or feature.
     *
     * @param feature
     */
    @JsonProperty("feature")
    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the voice message was established and started ringing. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param startTime
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time when the voice message was established and started ringing. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the voice message was established and started ringing. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets answerTime.
     * <p>
     * Field description:
     * Date and time when the voice message was answered. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param answerTime
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData answerTime(String answerTime) {
        this.answerTime = answerTime;
        return this;
    }

    /**
     * Returns answerTime.
     * <p>
     * Field description:
     * Date and time when the voice message was answered. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @return answerTime
     */
    @JsonProperty("answerTime")
    public String getAnswerTime() {
        return answerTime;
    }

    /**
     * Sets answerTime.
     * <p>
     * Field description:
     * Date and time when the voice message was answered. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param answerTime
     */
    @JsonProperty("answerTime")
    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time when the voice message was ended. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param endTime
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time when the voice message was ended. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time when the voice message was ended. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Duration of the voice message, in seconds.
     *
     * @param duration
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Duration of the voice message, in seconds.
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Duration of the voice message, in seconds.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Sets chargedDuration.
     * <p>
     * Field description:
     * Charged duration of the voice message, in seconds.
     *
     * @param chargedDuration
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData chargedDuration(Integer chargedDuration) {
        this.chargedDuration = chargedDuration;
        return this;
    }

    /**
     * Returns chargedDuration.
     * <p>
     * Field description:
     * Charged duration of the voice message, in seconds.
     *
     * @return chargedDuration
     */
    @JsonProperty("chargedDuration")
    public Integer getChargedDuration() {
        return chargedDuration;
    }

    /**
     * Sets chargedDuration.
     * <p>
     * Field description:
     * Charged duration of the voice message, in seconds.
     *
     * @param chargedDuration
     */
    @JsonProperty("chargedDuration")
    public void setChargedDuration(Integer chargedDuration) {
        this.chargedDuration = chargedDuration;
    }

    /**
     * Sets fileDuration.
     * <p>
     * Field description:
     * Duration of the voice message audio file, in seconds.
     *
     * @param fileDuration
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData fileDuration(Double fileDuration) {
        this.fileDuration = fileDuration;
        return this;
    }

    /**
     * Returns fileDuration.
     * <p>
     * Field description:
     * Duration of the voice message audio file, in seconds.
     *
     * @return fileDuration
     */
    @JsonProperty("fileDuration")
    public Double getFileDuration() {
        return fileDuration;
    }

    /**
     * Sets fileDuration.
     * <p>
     * Field description:
     * Duration of the voice message audio file, in seconds.
     *
     * @param fileDuration
     */
    @JsonProperty("fileDuration")
    public void setFileDuration(Double fileDuration) {
        this.fileDuration = fileDuration;
    }

    /**
     * Sets dtmfCodes.
     * <p>
     * Field description:
     * DTMF code entered by user. Can be empty string, if user did not press anything, or &#x60;null&#x60; in case of IVR if user did not participate in Collect action.
     *
     * @param dtmfCodes
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData dtmfCodes(String dtmfCodes) {
        this.dtmfCodes = dtmfCodes;
        return this;
    }

    /**
     * Returns dtmfCodes.
     * <p>
     * Field description:
     * DTMF code entered by user. Can be empty string, if user did not press anything, or &#x60;null&#x60; in case of IVR if user did not participate in Collect action.
     *
     * @return dtmfCodes
     */
    @JsonProperty("dtmfCodes")
    public String getDtmfCodes() {
        return dtmfCodes;
    }

    /**
     * Sets dtmfCodes.
     * <p>
     * Field description:
     * DTMF code entered by user. Can be empty string, if user did not press anything, or &#x60;null&#x60; in case of IVR if user did not participate in Collect action.
     *
     * @param dtmfCodes
     */
    @JsonProperty("dtmfCodes")
    public void setDtmfCodes(String dtmfCodes) {
        this.dtmfCodes = dtmfCodes;
    }

    /**
     * Sets ivr.
     *
     * @param ivr
     * @return This {@link CallsVoiceData instance}.
     */
    public CallsVoiceData ivr(CallsIvrData ivr) {
        this.ivr = ivr;
        return this;
    }

    /**
     * Returns ivr.
     *
     * @return ivr
     */
    @JsonProperty("ivr")
    public CallsIvrData getIvr() {
        return ivr;
    }

    /**
     * Sets ivr.
     *
     * @param ivr
     */
    @JsonProperty("ivr")
    public void setIvr(CallsIvrData ivr) {
        this.ivr = ivr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsVoiceData callsVoiceData = (CallsVoiceData) o;
        return Objects.equals(this.feature, callsVoiceData.feature)
                && Objects.equals(this.startTime, callsVoiceData.startTime)
                && Objects.equals(this.answerTime, callsVoiceData.answerTime)
                && Objects.equals(this.endTime, callsVoiceData.endTime)
                && Objects.equals(this.duration, callsVoiceData.duration)
                && Objects.equals(this.chargedDuration, callsVoiceData.chargedDuration)
                && Objects.equals(this.fileDuration, callsVoiceData.fileDuration)
                && Objects.equals(this.dtmfCodes, callsVoiceData.dtmfCodes)
                && Objects.equals(this.ivr, callsVoiceData.ivr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                feature, startTime, answerTime, endTime, duration, chargedDuration, fileDuration, dtmfCodes, ivr);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsVoiceData {")
                .append(newLine)
                .append("    feature: ")
                .append(toIndentedString(feature))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    answerTime: ")
                .append(toIndentedString(answerTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    chargedDuration: ")
                .append(toIndentedString(chargedDuration))
                .append(newLine)
                .append("    fileDuration: ")
                .append(toIndentedString(fileDuration))
                .append(newLine)
                .append("    dtmfCodes: ")
                .append(toIndentedString(dtmfCodes))
                .append(newLine)
                .append("    ivr: ")
                .append(toIndentedString(ivr))
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
