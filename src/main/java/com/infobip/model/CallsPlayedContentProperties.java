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
 * Properties about content played before collecting DTMF input.
 */
public class CallsPlayedContentProperties {

    private Long duration;

    private Boolean playedCompletely;

    /**
     * Sets duration.
     * <p>
     * Field description:
     * How long, in milliseconds, content was played before DTMF collection started.
     *
     * @param duration
     * @return This {@link CallsPlayedContentProperties instance}.
     */
    public CallsPlayedContentProperties duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * How long, in milliseconds, content was played before DTMF collection started.
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
     * How long, in milliseconds, content was played before DTMF collection started.
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
     * Whether the content was played completely, in it&#39;s full duration.
     *
     * @param playedCompletely
     * @return This {@link CallsPlayedContentProperties instance}.
     */
    public CallsPlayedContentProperties playedCompletely(Boolean playedCompletely) {
        this.playedCompletely = playedCompletely;
        return this;
    }

    /**
     * Returns playedCompletely.
     * <p>
     * Field description:
     * Whether the content was played completely, in it&#39;s full duration.
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
     * Whether the content was played completely, in it&#39;s full duration.
     *
     * @param playedCompletely
     */
    @JsonProperty("playedCompletely")
    public void setPlayedCompletely(Boolean playedCompletely) {
        this.playedCompletely = playedCompletely;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPlayedContentProperties callsPlayedContentProperties = (CallsPlayedContentProperties) o;
        return Objects.equals(this.duration, callsPlayedContentProperties.duration)
                && Objects.equals(this.playedCompletely, callsPlayedContentProperties.playedCompletely);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, playedCompletely);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayedContentProperties {")
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    playedCompletely: ")
                .append(toIndentedString(playedCompletely))
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
