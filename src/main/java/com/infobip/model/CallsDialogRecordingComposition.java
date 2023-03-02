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
 * Represents CallsDialogRecordingComposition model.
 */
public class CallsDialogRecordingComposition {

    private Boolean enabled;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether to create a single recording of both participants. If set to &#x60;true&#x60;, both participants are merged into a single audio or video file. Otherwise, both participants will have their own individual audio or video file.
     *
     * @param enabled
     * @return This {@link CallsDialogRecordingComposition instance}.
     */
    public CallsDialogRecordingComposition enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether to create a single recording of both participants. If set to &#x60;true&#x60;, both participants are merged into a single audio or video file. Otherwise, both participants will have their own individual audio or video file.
     *
     * @return enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether to create a single recording of both participants. If set to &#x60;true&#x60;, both participants are merged into a single audio or video file. Otherwise, both participants will have their own individual audio or video file.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogRecordingComposition callsDialogRecordingComposition = (CallsDialogRecordingComposition) o;
        return Objects.equals(this.enabled, callsDialogRecordingComposition.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecordingComposition {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
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
