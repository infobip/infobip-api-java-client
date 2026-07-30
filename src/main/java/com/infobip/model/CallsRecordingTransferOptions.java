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
 * Options that control how call recording should behave after the application transfer.
 */
public class CallsRecordingTransferOptions {

    private Boolean continueCallRecording;

    /**
     * Sets continueCallRecording.
     * <p>
     * Field description:
     * Continue recording on the transferred call.
     *
     * @param continueCallRecording
     * @return This {@link CallsRecordingTransferOptions instance}.
     */
    public CallsRecordingTransferOptions continueCallRecording(Boolean continueCallRecording) {
        this.continueCallRecording = continueCallRecording;
        return this;
    }

    /**
     * Returns continueCallRecording.
     * <p>
     * Field description:
     * Continue recording on the transferred call.
     *
     * @return continueCallRecording
     */
    @JsonProperty("continueCallRecording")
    public Boolean getContinueCallRecording() {
        return continueCallRecording;
    }

    /**
     * Sets continueCallRecording.
     * <p>
     * Field description:
     * Continue recording on the transferred call.
     *
     * @param continueCallRecording
     */
    @JsonProperty("continueCallRecording")
    public void setContinueCallRecording(Boolean continueCallRecording) {
        this.continueCallRecording = continueCallRecording;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordingTransferOptions callsRecordingTransferOptions = (CallsRecordingTransferOptions) o;
        return Objects.equals(this.continueCallRecording, callsRecordingTransferOptions.continueCallRecording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continueCallRecording);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordingTransferOptions {")
                .append(newLine)
                .append("    continueCallRecording: ")
                .append(toIndentedString(continueCallRecording))
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
