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
 * Represents CallsPlayFromUploadOptions model.
 */
public class CallsPlayFromUploadOptions {

    private Integer loopCount;

    /**
     * Sets loopCount.
     * <p>
     * Field description:
     * Number of times the file will be played. Valid values are from 1 to 10.
     *
     * @param loopCount
     * @return This {@link CallsPlayFromUploadOptions instance}.
     */
    public CallsPlayFromUploadOptions loopCount(Integer loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    /**
     * Returns loopCount.
     * <p>
     * Field description:
     * Number of times the file will be played. Valid values are from 1 to 10.
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
     * Number of times the file will be played. Valid values are from 1 to 10.
     *
     * @param loopCount
     */
    @JsonProperty("loopCount")
    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPlayFromUploadOptions callsPlayFromUploadOptions = (CallsPlayFromUploadOptions) o;
        return Objects.equals(this.loopCount, callsPlayFromUploadOptions.loopCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loopCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayFromUploadOptions {")
                .append(newLine)
                .append("    loopCount: ")
                .append(toIndentedString(loopCount))
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
