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
 * Represents CallsDialogRecordingRequest model.
 */
public class CallsDialogRecordingRequest {

    private CallsRecordingType recordingType;

    private CallsDialogRecordingComposition dialogComposition;

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest recordingType(CallsRecordingType recordingType) {
        this.recordingType = recordingType;
        return this;
    }

    /**
     * Returns recordingType.
     * <p>
     * The field is required.
     *
     * @return recordingType
     */
    @JsonProperty("recordingType")
    public CallsRecordingType getRecordingType() {
        return recordingType;
    }

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     */
    @JsonProperty("recordingType")
    public void setRecordingType(CallsRecordingType recordingType) {
        this.recordingType = recordingType;
    }

    /**
     * Sets dialogComposition.
     *
     * @param dialogComposition
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest dialogComposition(CallsDialogRecordingComposition dialogComposition) {
        this.dialogComposition = dialogComposition;
        return this;
    }

    /**
     * Returns dialogComposition.
     *
     * @return dialogComposition
     */
    @JsonProperty("dialogComposition")
    public CallsDialogRecordingComposition getDialogComposition() {
        return dialogComposition;
    }

    /**
     * Sets dialogComposition.
     *
     * @param dialogComposition
     */
    @JsonProperty("dialogComposition")
    public void setDialogComposition(CallsDialogRecordingComposition dialogComposition) {
        this.dialogComposition = dialogComposition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogRecordingRequest callsDialogRecordingRequest = (CallsDialogRecordingRequest) o;
        return Objects.equals(this.recordingType, callsDialogRecordingRequest.recordingType)
                && Objects.equals(this.dialogComposition, callsDialogRecordingRequest.dialogComposition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, dialogComposition);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecordingRequest {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    dialogComposition: ")
                .append(toIndentedString(dialogComposition))
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
