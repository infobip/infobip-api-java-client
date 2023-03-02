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
 * Voice preferences.
 */
public class CallsVoicePreferences {

    private CallsGender voiceGender;

    private CallVoice voiceName;

    /**
     * Sets voiceGender.
     *
     * @param voiceGender
     * @return This {@link CallsVoicePreferences instance}.
     */
    public CallsVoicePreferences voiceGender(CallsGender voiceGender) {
        this.voiceGender = voiceGender;
        return this;
    }

    /**
     * Returns voiceGender.
     *
     * @return voiceGender
     */
    @JsonProperty("voiceGender")
    public CallsGender getVoiceGender() {
        return voiceGender;
    }

    /**
     * Sets voiceGender.
     *
     * @param voiceGender
     */
    @JsonProperty("voiceGender")
    public void setVoiceGender(CallsGender voiceGender) {
        this.voiceGender = voiceGender;
    }

    /**
     * Sets voiceName.
     *
     * @param voiceName
     * @return This {@link CallsVoicePreferences instance}.
     */
    public CallsVoicePreferences voiceName(CallVoice voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * Returns voiceName.
     *
     * @return voiceName
     */
    @JsonProperty("voiceName")
    public CallVoice getVoiceName() {
        return voiceName;
    }

    /**
     * Sets voiceName.
     *
     * @param voiceName
     */
    @JsonProperty("voiceName")
    public void setVoiceName(CallVoice voiceName) {
        this.voiceName = voiceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsVoicePreferences callsVoicePreferences = (CallsVoicePreferences) o;
        return Objects.equals(this.voiceGender, callsVoicePreferences.voiceGender)
                && Objects.equals(this.voiceName, callsVoicePreferences.voiceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceGender, voiceName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsVoicePreferences {")
                .append(newLine)
                .append("    voiceGender: ")
                .append(toIndentedString(voiceGender))
                .append(newLine)
                .append("    voiceName: ")
                .append(toIndentedString(voiceName))
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
