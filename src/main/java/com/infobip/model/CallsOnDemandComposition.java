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

    /**
     * Sets deleteCallRecordings.
     * <p>
     * Field description:
     * Indicates whether to delete call recordings after composition. If set to &#39;true&#39; then call recordings will be deleted after composition. Otherwise, call recordings will be available, alongside with composed file.
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
     * Indicates whether to delete call recordings after composition. If set to &#39;true&#39; then call recordings will be deleted after composition. Otherwise, call recordings will be available, alongside with composed file.
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
     * Indicates whether to delete call recordings after composition. If set to &#39;true&#39; then call recordings will be deleted after composition. Otherwise, call recordings will be available, alongside with composed file.
     *
     * @param deleteCallRecordings
     */
    @JsonProperty("deleteCallRecordings")
    public void setDeleteCallRecordings(Boolean deleteCallRecordings) {
        this.deleteCallRecordings = deleteCallRecordings;
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
        return Objects.equals(this.deleteCallRecordings, callsOnDemandComposition.deleteCallRecordings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteCallRecordings);
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
