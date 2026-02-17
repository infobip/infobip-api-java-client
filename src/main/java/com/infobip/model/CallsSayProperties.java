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
 * Properties of the events that provide results of &#x60;say&#x60; action.
 */
public class CallsSayProperties {

    private Long duration;

    private Boolean playedCompletely;

    private String capturedDtmf;

    private Map<String, String> customData = null;

    /**
     * Sets duration.
     * <p>
     * Field description:
     * How long, in milliseconds, synthesized text was played before the playback was stopped.
     *
     * @param duration
     * @return This {@link CallsSayProperties instance}.
     */
    public CallsSayProperties duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * How long, in milliseconds, synthesized text was played before the playback was stopped.
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * How long, in milliseconds, synthesized text was played before the playback was stopped.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Sets playedCompletely.
     * <p>
     * Field description:
     * Whether the synthesized text was played completely, in its full duration.
     *
     * @param playedCompletely
     * @return This {@link CallsSayProperties instance}.
     */
    public CallsSayProperties playedCompletely(Boolean playedCompletely) {
        this.playedCompletely = playedCompletely;
        return this;
    }

    /**
     * Returns playedCompletely.
     * <p>
     * Field description:
     * Whether the synthesized text was played completely, in its full duration.
     *
     * @return playedCompletely
     */
    @JsonProperty("playedCompletely")
    public Boolean getPlayedCompletely() {
        return playedCompletely;
    }

    /**
     * Sets playedCompletely.
     * <p>
     * Field description:
     * Whether the synthesized text was played completely, in its full duration.
     *
     * @param playedCompletely
     */
    @JsonProperty("playedCompletely")
    public void setPlayedCompletely(Boolean playedCompletely) {
        this.playedCompletely = playedCompletely;
    }

    /**
     * Sets capturedDtmf.
     * <p>
     * Field description:
     * Collected DTMF input that stopped the synthesized text playback.
     *
     * @param capturedDtmf
     * @return This {@link CallsSayProperties instance}.
     */
    public CallsSayProperties capturedDtmf(String capturedDtmf) {
        this.capturedDtmf = capturedDtmf;
        return this;
    }

    /**
     * Returns capturedDtmf.
     * <p>
     * Field description:
     * Collected DTMF input that stopped the synthesized text playback.
     *
     * @return capturedDtmf
     */
    @JsonProperty("capturedDtmf")
    public String getCapturedDtmf() {
        return capturedDtmf;
    }

    /**
     * Sets capturedDtmf.
     * <p>
     * Field description:
     * Collected DTMF input that stopped the synthesized text playback.
     *
     * @param capturedDtmf
     */
    @JsonProperty("capturedDtmf")
    public void setCapturedDtmf(String capturedDtmf) {
        this.capturedDtmf = capturedDtmf;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsSayProperties instance}.
     */
    public CallsSayProperties customData(Map<String, String> customData) {
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
     * @return This {@link CallsSayProperties instance}.
     */
    public CallsSayProperties putCustomDataItem(String key, String customDataItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSayProperties callsSayProperties = (CallsSayProperties) o;
        return Objects.equals(this.duration, callsSayProperties.duration)
                && Objects.equals(this.playedCompletely, callsSayProperties.playedCompletely)
                && Objects.equals(this.capturedDtmf, callsSayProperties.capturedDtmf)
                && Objects.equals(this.customData, callsSayProperties.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, playedCompletely, capturedDtmf, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSayProperties {")
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    playedCompletely: ")
                .append(toIndentedString(playedCompletely))
                .append(newLine)
                .append("    capturedDtmf: ")
                .append(toIndentedString(capturedDtmf))
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
