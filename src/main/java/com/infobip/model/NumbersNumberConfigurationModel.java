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
 * Represents NumbersNumberConfigurationModel model.
 */
public class NumbersNumberConfigurationModel {

    private String numberKey;

    private NumbersRecordingBody recording;

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * *numberKey* - available through number configuration
     *
     * @param numberKey
     * @return This {@link NumbersNumberConfigurationModel instance}.
     */
    public NumbersNumberConfigurationModel numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     * <p>
     * Field description:
     * *numberKey* - available through number configuration
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * *numberKey* - available through number configuration
     *
     * @param numberKey
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link NumbersNumberConfigurationModel instance}.
     */
    public NumbersNumberConfigurationModel recording(NumbersRecordingBody recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public NumbersRecordingBody getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(NumbersRecordingBody recording) {
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
        NumbersNumberConfigurationModel numbersNumberConfigurationModel = (NumbersNumberConfigurationModel) o;
        return Objects.equals(this.numberKey, numbersNumberConfigurationModel.numberKey)
                && Objects.equals(this.recording, numbersNumberConfigurationModel.recording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberKey, recording);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberConfigurationModel {")
                .append(newLine)
                .append("    numberKey: ")
                .append(toIndentedString(numberKey))
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
