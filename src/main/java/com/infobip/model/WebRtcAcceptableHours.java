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
 * Specify time range within a day when a link can be used. It is 00:00 - 23:59, by default. UTC timezone is used.
 */
public class WebRtcAcceptableHours {

    private WebRtcTimeOfDay start;

    private WebRtcTimeOfDay end;

    /**
     * Sets start.
     *
     * @param start
     * @return This {@link WebRtcAcceptableHours instance}.
     */
    public WebRtcAcceptableHours start(WebRtcTimeOfDay start) {
        this.start = start;
        return this;
    }

    /**
     * Returns start.
     *
     * @return start
     */
    @JsonProperty("start")
    public WebRtcTimeOfDay getStart() {
        return start;
    }

    /**
     * Sets start.
     *
     * @param start
     */
    @JsonProperty("start")
    public void setStart(WebRtcTimeOfDay start) {
        this.start = start;
    }

    /**
     * Sets end.
     *
     * @param end
     * @return This {@link WebRtcAcceptableHours instance}.
     */
    public WebRtcAcceptableHours end(WebRtcTimeOfDay end) {
        this.end = end;
        return this;
    }

    /**
     * Returns end.
     *
     * @return end
     */
    @JsonProperty("end")
    public WebRtcTimeOfDay getEnd() {
        return end;
    }

    /**
     * Sets end.
     *
     * @param end
     */
    @JsonProperty("end")
    public void setEnd(WebRtcTimeOfDay end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcAcceptableHours webRtcAcceptableHours = (WebRtcAcceptableHours) o;
        return Objects.equals(this.start, webRtcAcceptableHours.start)
                && Objects.equals(this.end, webRtcAcceptableHours.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcAcceptableHours {")
                .append(newLine)
                .append("    start: ")
                .append(toIndentedString(start))
                .append(newLine)
                .append("    end: ")
                .append(toIndentedString(end))
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
