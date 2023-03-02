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
 * Represents CallsDialogPlayRequest model.
 */
public class CallsDialogPlayRequest {

    private Integer loopCount;

    private CallsPlayContent content;

    /**
     * Sets loopCount.
     * <p>
     * Field description:
     * Number of times the file will be played.
     *
     * @param loopCount
     * @return This {@link CallsDialogPlayRequest instance}.
     */
    public CallsDialogPlayRequest loopCount(Integer loopCount) {
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
     * Sets content.
     *
     * @param content
     * @return This {@link CallsDialogPlayRequest instance}.
     */
    public CallsDialogPlayRequest content(CallsPlayContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public CallsPlayContent getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(CallsPlayContent content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogPlayRequest callsDialogPlayRequest = (CallsDialogPlayRequest) o;
        return Objects.equals(this.loopCount, callsDialogPlayRequest.loopCount)
                && Objects.equals(this.content, callsDialogPlayRequest.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loopCount, content);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogPlayRequest {")
                .append(newLine)
                .append("    loopCount: ")
                .append(toIndentedString(loopCount))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
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
