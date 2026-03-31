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
 * Represents NumbersVoiceNumberMaskingActionDetails model.
 */
public class NumbersVoiceNumberMaskingActionDetails extends NumbersVoiceActionDetails {

    private String voiceNumberMaskingConfigKey;

    /**
     * Constructs a new {@link NumbersVoiceNumberMaskingActionDetails} instance.
     */
    public NumbersVoiceNumberMaskingActionDetails() {
        super("VOICE_NUMBER_MASKING");
    }

    /**
     * Sets voiceNumberMaskingConfigKey.
     * <p>
     * Field description:
     * Unique ID of number masking configuration.
     * <p>
     * The field is required.
     *
     * @param voiceNumberMaskingConfigKey
     * @return This {@link NumbersVoiceNumberMaskingActionDetails instance}.
     */
    public NumbersVoiceNumberMaskingActionDetails voiceNumberMaskingConfigKey(String voiceNumberMaskingConfigKey) {
        this.voiceNumberMaskingConfigKey = voiceNumberMaskingConfigKey;
        return this;
    }

    /**
     * Returns voiceNumberMaskingConfigKey.
     * <p>
     * Field description:
     * Unique ID of number masking configuration.
     * <p>
     * The field is required.
     *
     * @return voiceNumberMaskingConfigKey
     */
    @JsonProperty("voiceNumberMaskingConfigKey")
    public String getVoiceNumberMaskingConfigKey() {
        return voiceNumberMaskingConfigKey;
    }

    /**
     * Sets voiceNumberMaskingConfigKey.
     * <p>
     * Field description:
     * Unique ID of number masking configuration.
     * <p>
     * The field is required.
     *
     * @param voiceNumberMaskingConfigKey
     */
    @JsonProperty("voiceNumberMaskingConfigKey")
    public void setVoiceNumberMaskingConfigKey(String voiceNumberMaskingConfigKey) {
        this.voiceNumberMaskingConfigKey = voiceNumberMaskingConfigKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersVoiceNumberMaskingActionDetails numbersVoiceNumberMaskingActionDetails =
                (NumbersVoiceNumberMaskingActionDetails) o;
        return Objects.equals(
                        this.voiceNumberMaskingConfigKey,
                        numbersVoiceNumberMaskingActionDetails.voiceNumberMaskingConfigKey)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceNumberMaskingConfigKey, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersVoiceNumberMaskingActionDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    voiceNumberMaskingConfigKey: ")
                .append(toIndentedString(voiceNumberMaskingConfigKey))
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
