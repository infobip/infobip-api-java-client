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
 * Represents CallsRecordOptions model.
 */
public class CallsRecordOptions {

    private String escapeDigits;

    private Boolean beep;

    private Integer maxSilence;

    private String identifier;

    /**
     * Sets escapeDigits.
     * <p>
     * Field description:
     * DTMF codes which should stop recording when input by the user.
     *
     * @param escapeDigits
     * @return This {@link CallsRecordOptions instance}.
     */
    public CallsRecordOptions escapeDigits(String escapeDigits) {
        this.escapeDigits = escapeDigits;
        return this;
    }

    /**
     * Returns escapeDigits.
     * <p>
     * Field description:
     * DTMF codes which should stop recording when input by the user.
     *
     * @return escapeDigits
     */
    @JsonProperty("escapeDigits")
    public String getEscapeDigits() {
        return escapeDigits;
    }

    /**
     * Sets escapeDigits.
     * <p>
     * Field description:
     * DTMF codes which should stop recording when input by the user.
     *
     * @param escapeDigits
     */
    @JsonProperty("escapeDigits")
    public void setEscapeDigits(String escapeDigits) {
        this.escapeDigits = escapeDigits;
    }

    /**
     * Sets beep.
     * <p>
     * Field description:
     * Flag indicating a beep sound should be played at the start of the recording.
     *
     * @param beep
     * @return This {@link CallsRecordOptions instance}.
     */
    public CallsRecordOptions beep(Boolean beep) {
        this.beep = beep;
        return this;
    }

    /**
     * Returns beep.
     * <p>
     * Field description:
     * Flag indicating a beep sound should be played at the start of the recording.
     *
     * @return beep
     */
    @JsonProperty("beep")
    public Boolean getBeep() {
        return beep;
    }

    /**
     * Sets beep.
     * <p>
     * Field description:
     * Flag indicating a beep sound should be played at the start of the recording.
     *
     * @param beep
     */
    @JsonProperty("beep")
    public void setBeep(Boolean beep) {
        this.beep = beep;
    }

    /**
     * Sets maxSilence.
     * <p>
     * Field description:
     * The amount of silence to wait for before stopping the recording.
     *
     * @param maxSilence
     * @return This {@link CallsRecordOptions instance}.
     */
    public CallsRecordOptions maxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
        return this;
    }

    /**
     * Returns maxSilence.
     * <p>
     * Field description:
     * The amount of silence to wait for before stopping the recording.
     *
     * @return maxSilence
     */
    @JsonProperty("maxSilence")
    public Integer getMaxSilence() {
        return maxSilence;
    }

    /**
     * Sets maxSilence.
     * <p>
     * Field description:
     * The amount of silence to wait for before stopping the recording.
     *
     * @param maxSilence
     */
    @JsonProperty("maxSilence")
    public void setMaxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * The identifier for the recording. Identified recordings can be reused in Play from Recording. The parameter can be constructed using variables.
     *
     * @param identifier
     * @return This {@link CallsRecordOptions instance}.
     */
    public CallsRecordOptions identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Returns identifier.
     * <p>
     * Field description:
     * The identifier for the recording. Identified recordings can be reused in Play from Recording. The parameter can be constructed using variables.
     *
     * @return identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * The identifier for the recording. Identified recordings can be reused in Play from Recording. The parameter can be constructed using variables.
     *
     * @param identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordOptions callsRecordOptions = (CallsRecordOptions) o;
        return Objects.equals(this.escapeDigits, callsRecordOptions.escapeDigits)
                && Objects.equals(this.beep, callsRecordOptions.beep)
                && Objects.equals(this.maxSilence, callsRecordOptions.maxSilence)
                && Objects.equals(this.identifier, callsRecordOptions.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(escapeDigits, beep, maxSilence, identifier);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordOptions {")
                .append(newLine)
                .append("    escapeDigits: ")
                .append(toIndentedString(escapeDigits))
                .append(newLine)
                .append("    beep: ")
                .append(toIndentedString(beep))
                .append(newLine)
                .append("    maxSilence: ")
                .append(toIndentedString(maxSilence))
                .append(newLine)
                .append("    identifier: ")
                .append(toIndentedString(identifier))
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
