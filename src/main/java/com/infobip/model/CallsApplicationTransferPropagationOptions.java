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
 * Options that should be propagated while transferring the call.
 */
public class CallsApplicationTransferPropagationOptions {

    private CallsRecordingTransferOptions recordingTransferOptions;

    /**
     * Sets recordingTransferOptions.
     *
     * @param recordingTransferOptions
     * @return This {@link CallsApplicationTransferPropagationOptions instance}.
     */
    public CallsApplicationTransferPropagationOptions recordingTransferOptions(
            CallsRecordingTransferOptions recordingTransferOptions) {
        this.recordingTransferOptions = recordingTransferOptions;
        return this;
    }

    /**
     * Returns recordingTransferOptions.
     *
     * @return recordingTransferOptions
     */
    @JsonProperty("recordingTransferOptions")
    public CallsRecordingTransferOptions getRecordingTransferOptions() {
        return recordingTransferOptions;
    }

    /**
     * Sets recordingTransferOptions.
     *
     * @param recordingTransferOptions
     */
    @JsonProperty("recordingTransferOptions")
    public void setRecordingTransferOptions(CallsRecordingTransferOptions recordingTransferOptions) {
        this.recordingTransferOptions = recordingTransferOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsApplicationTransferPropagationOptions callsApplicationTransferPropagationOptions =
                (CallsApplicationTransferPropagationOptions) o;
        return Objects.equals(
                this.recordingTransferOptions, callsApplicationTransferPropagationOptions.recordingTransferOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingTransferOptions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsApplicationTransferPropagationOptions {")
                .append(newLine)
                .append("    recordingTransferOptions: ")
                .append(toIndentedString(recordingTransferOptions))
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
