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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallsGetVoicesResponse model.
 */
public class CallsGetVoicesResponse {

    private List<CallsSynthesisVoice> voices = null;

    /**
     * Sets voices.
     * <p>
     * Field description:
     * Array of voices belonging to the specified language.
     *
     * @param voices
     * @return This {@link CallsGetVoicesResponse instance}.
     */
    public CallsGetVoicesResponse voices(List<CallsSynthesisVoice> voices) {
        this.voices = voices;
        return this;
    }

    /**
     * Adds and item into voices.
     * <p>
     * Field description:
     * Array of voices belonging to the specified language.
     *
     * @param voicesItem The item to be added to the list.
     * @return This {@link CallsGetVoicesResponse instance}.
     */
    public CallsGetVoicesResponse addVoicesItem(CallsSynthesisVoice voicesItem) {
        if (this.voices == null) {
            this.voices = new ArrayList<>();
        }
        this.voices.add(voicesItem);
        return this;
    }

    /**
     * Returns voices.
     * <p>
     * Field description:
     * Array of voices belonging to the specified language.
     *
     * @return voices
     */
    @JsonProperty("voices")
    public List<CallsSynthesisVoice> getVoices() {
        return voices;
    }

    /**
     * Sets voices.
     * <p>
     * Field description:
     * Array of voices belonging to the specified language.
     *
     * @param voices
     */
    @JsonProperty("voices")
    public void setVoices(List<CallsSynthesisVoice> voices) {
        this.voices = voices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsGetVoicesResponse callsGetVoicesResponse = (CallsGetVoicesResponse) o;
        return Objects.equals(this.voices, callsGetVoicesResponse.voices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voices);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsGetVoicesResponse {")
                .append(newLine)
                .append("    voices: ")
                .append(toIndentedString(voices))
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
