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
 * Hangup restrictions for call link.
 */
public class WebRtcHangupRestriction {

    private Integer minRingingTime;

    /**
     * Sets minRingingTime.
     * <p>
     * Field description:
     * The caller will not be able to hang up once the call is initiated, until the number of seconds in the ringing time reaches this value. Once the callee answers the call, there will be no hangup restrictions. If this field is not set, hangup will be possible anytime.
     *
     * @param minRingingTime
     * @return This {@link WebRtcHangupRestriction instance}.
     */
    public WebRtcHangupRestriction minRingingTime(Integer minRingingTime) {
        this.minRingingTime = minRingingTime;
        return this;
    }

    /**
     * Returns minRingingTime.
     * <p>
     * Field description:
     * The caller will not be able to hang up once the call is initiated, until the number of seconds in the ringing time reaches this value. Once the callee answers the call, there will be no hangup restrictions. If this field is not set, hangup will be possible anytime.
     *
     * @return minRingingTime
     */
    @JsonProperty("minRingingTime")
    public Integer getMinRingingTime() {
        return minRingingTime;
    }

    /**
     * Sets minRingingTime.
     * <p>
     * Field description:
     * The caller will not be able to hang up once the call is initiated, until the number of seconds in the ringing time reaches this value. Once the callee answers the call, there will be no hangup restrictions. If this field is not set, hangup will be possible anytime.
     *
     * @param minRingingTime
     */
    @JsonProperty("minRingingTime")
    public void setMinRingingTime(Integer minRingingTime) {
        this.minRingingTime = minRingingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcHangupRestriction webRtcHangupRestriction = (WebRtcHangupRestriction) o;
        return Objects.equals(this.minRingingTime, webRtcHangupRestriction.minRingingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minRingingTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcHangupRestriction {")
                .append(newLine)
                .append("    minRingingTime: ")
                .append(toIndentedString(minRingingTime))
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
