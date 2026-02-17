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
 * Recording API response.
 */
public class CallRoutingRecordingApiResponse {

    private CallRoutingRecordingApplication application;

    private CallRoutingRecordingMetadata recording;

    /**
     * Sets application.
     * <p>
     * The field is required.
     *
     * @param application
     * @return This {@link CallRoutingRecordingApiResponse instance}.
     */
    public CallRoutingRecordingApiResponse application(CallRoutingRecordingApplication application) {
        this.application = application;
        return this;
    }

    /**
     * Returns application.
     * <p>
     * The field is required.
     *
     * @return application
     */
    @JsonProperty("application")
    public CallRoutingRecordingApplication getApplication() {
        return application;
    }

    /**
     * Sets application.
     * <p>
     * The field is required.
     *
     * @param application
     */
    @JsonProperty("application")
    public void setApplication(CallRoutingRecordingApplication application) {
        this.application = application;
    }

    /**
     * Sets recording.
     * <p>
     * The field is required.
     *
     * @param recording
     * @return This {@link CallRoutingRecordingApiResponse instance}.
     */
    public CallRoutingRecordingApiResponse recording(CallRoutingRecordingMetadata recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     * <p>
     * The field is required.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallRoutingRecordingMetadata getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     * <p>
     * The field is required.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallRoutingRecordingMetadata recording) {
        this.recording = recording;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRecordingApiResponse callRoutingRecordingApiResponse = (CallRoutingRecordingApiResponse) o;
        return Objects.equals(this.application, callRoutingRecordingApiResponse.application)
                && Objects.equals(this.recording, callRoutingRecordingApiResponse.recording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(application, recording);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecordingApiResponse {")
                .append(newLine)
                .append("    application: ")
                .append(toIndentedString(application))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
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
