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
 * Represents CallsVoiceOptions model.
 */
public class CallsVoiceOptions {

    private String name;

    private String gender;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the voice in which the text would be synthesized.
     *
     * @param name
     * @return This {@link CallsVoiceOptions instance}.
     */
    public CallsVoiceOptions name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the voice in which the text would be synthesized.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the voice in which the text would be synthesized.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets gender.
     * <p>
     * Field description:
     * Gender in which the text would be synthesized.
     *
     * @param gender
     * @return This {@link CallsVoiceOptions instance}.
     */
    public CallsVoiceOptions gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Returns gender.
     * <p>
     * Field description:
     * Gender in which the text would be synthesized.
     *
     * @return gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     * <p>
     * Field description:
     * Gender in which the text would be synthesized.
     *
     * @param gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsVoiceOptions callsVoiceOptions = (CallsVoiceOptions) o;
        return Objects.equals(this.name, callsVoiceOptions.name)
                && Objects.equals(this.gender, callsVoiceOptions.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsVoiceOptions {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    gender: ")
                .append(toIndentedString(gender))
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
