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
 * Recording configuration of a Number Masking call.
 */
public class CallsRecording {

    private Boolean enabled;

    private Boolean recordCalleeAnnouncement;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether call recording is enabled from the callee perspective.
     *
     * @param enabled
     * @return This {@link CallsRecording instance}.
     */
    public CallsRecording enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether call recording is enabled from the callee perspective.
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
     * Indicates whether call recording is enabled from the callee perspective.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets recordCalleeAnnouncement.
     * <p>
     * Field description:
     * Flag that indicates will callee announcement be included in recording file. If not set, it will be &#x60;true&#x60;.
     *
     * @param recordCalleeAnnouncement
     * @return This {@link CallsRecording instance}.
     */
    public CallsRecording recordCalleeAnnouncement(Boolean recordCalleeAnnouncement) {
        this.recordCalleeAnnouncement = recordCalleeAnnouncement;
        return this;
    }

    /**
     * Returns recordCalleeAnnouncement.
     * <p>
     * Field description:
     * Flag that indicates will callee announcement be included in recording file. If not set, it will be &#x60;true&#x60;.
     *
     * @return recordCalleeAnnouncement
     */
    @JsonProperty("recordCalleeAnnouncement")
    public Boolean getRecordCalleeAnnouncement() {
        return recordCalleeAnnouncement;
    }

    /**
     * Sets recordCalleeAnnouncement.
     * <p>
     * Field description:
     * Flag that indicates will callee announcement be included in recording file. If not set, it will be &#x60;true&#x60;.
     *
     * @param recordCalleeAnnouncement
     */
    @JsonProperty("recordCalleeAnnouncement")
    public void setRecordCalleeAnnouncement(Boolean recordCalleeAnnouncement) {
        this.recordCalleeAnnouncement = recordCalleeAnnouncement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecording callsRecording = (CallsRecording) o;
        return Objects.equals(this.enabled, callsRecording.enabled)
                && Objects.equals(this.recordCalleeAnnouncement, callsRecording.recordCalleeAnnouncement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, recordCalleeAnnouncement);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecording {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    recordCalleeAnnouncement: ")
                .append(toIndentedString(recordCalleeAnnouncement))
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
