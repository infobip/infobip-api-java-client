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
 * Represents CallsDtmfTermination model.
 */
public class CallsDtmfTermination {

    private String terminator;

    private CallsTerminationType type;

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digits used to end the audio playback. If no digits are set, any DTMF digit will end the audio playback.
     *
     * @param terminator
     * @return This {@link CallsDtmfTermination instance}.
     */
    public CallsDtmfTermination terminator(String terminator) {
        this.terminator = terminator;
        return this;
    }

    /**
     * Returns terminator.
     * <p>
     * Field description:
     * Digits used to end the audio playback. If no digits are set, any DTMF digit will end the audio playback.
     *
     * @return terminator
     */
    @JsonProperty("terminator")
    public String getTerminator() {
        return terminator;
    }

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digits used to end the audio playback. If no digits are set, any DTMF digit will end the audio playback.
     *
     * @param terminator
     */
    @JsonProperty("terminator")
    public void setTerminator(String terminator) {
        this.terminator = terminator;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link CallsDtmfTermination instance}.
     */
    public CallsDtmfTermination type(CallsTerminationType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsTerminationType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(CallsTerminationType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDtmfTermination callsDtmfTermination = (CallsDtmfTermination) o;
        return Objects.equals(this.terminator, callsDtmfTermination.terminator)
                && Objects.equals(this.type, callsDtmfTermination.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(terminator, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfTermination {")
                .append(newLine)
                .append("    terminator: ")
                .append(toIndentedString(terminator))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
