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
 * Composition request.
 */
public class CallsOnDemandComposition {

    private Boolean deleteCallRecordings;

    private CallsMultiChannel multiChannel;

    /**
     * Sets deleteCallRecordings.
     * <p>
     * Field description:
     * Indicates whether to delete individual files for the call recordings after composition. If set to &#39;true&#39; then files from the call recordings will be deleted after composition. Otherwise, files from the call recordings will be available, alongside with composed file.
     *
     * @param deleteCallRecordings
     * @return This {@link CallsOnDemandComposition instance}.
     */
    public CallsOnDemandComposition deleteCallRecordings(Boolean deleteCallRecordings) {
        this.deleteCallRecordings = deleteCallRecordings;
        return this;
    }

    /**
     * Returns deleteCallRecordings.
     * <p>
     * Field description:
     * Indicates whether to delete individual files for the call recordings after composition. If set to &#39;true&#39; then files from the call recordings will be deleted after composition. Otherwise, files from the call recordings will be available, alongside with composed file.
     *
     * @return deleteCallRecordings
     */
    @JsonProperty("deleteCallRecordings")
    public Boolean getDeleteCallRecordings() {
        return deleteCallRecordings;
    }

    /**
     * Sets deleteCallRecordings.
     * <p>
     * Field description:
     * Indicates whether to delete individual files for the call recordings after composition. If set to &#39;true&#39; then files from the call recordings will be deleted after composition. Otherwise, files from the call recordings will be available, alongside with composed file.
     *
     * @param deleteCallRecordings
     */
    @JsonProperty("deleteCallRecordings")
    public void setDeleteCallRecordings(Boolean deleteCallRecordings) {
        this.deleteCallRecordings = deleteCallRecordings;
    }

    /**
     * Sets multiChannel.
     *
     * @param multiChannel
     * @return This {@link CallsOnDemandComposition instance}.
     */
    public CallsOnDemandComposition multiChannel(CallsMultiChannel multiChannel) {
        this.multiChannel = multiChannel;
        return this;
    }

    /**
     * Returns multiChannel.
     *
     * @return multiChannel
     */
    @JsonProperty("multiChannel")
    public CallsMultiChannel getMultiChannel() {
        return multiChannel;
    }

    /**
     * Sets multiChannel.
     *
     * @param multiChannel
     */
    @JsonProperty("multiChannel")
    public void setMultiChannel(CallsMultiChannel multiChannel) {
        this.multiChannel = multiChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsOnDemandComposition callsOnDemandComposition = (CallsOnDemandComposition) o;
        return Objects.equals(this.deleteCallRecordings, callsOnDemandComposition.deleteCallRecordings)
                && Objects.equals(this.multiChannel, callsOnDemandComposition.multiChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteCallRecordings, multiChannel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsOnDemandComposition {")
                .append(newLine)
                .append("    deleteCallRecordings: ")
                .append(toIndentedString(deleteCallRecordings))
                .append(newLine)
                .append("    multiChannel: ")
                .append(toIndentedString(multiChannel))
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
