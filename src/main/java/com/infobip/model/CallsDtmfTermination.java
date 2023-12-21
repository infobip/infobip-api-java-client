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
public class CallsDtmfTermination extends CallsTermination {

    private String terminator;

    /**
     * Constructs a new {@link CallsDtmfTermination} instance.
     */
    public CallsDtmfTermination() {
        super("DTMF");
    }

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digits used to end the audio playback. If no digits are set, any DTMF digit will end the audio playback. After first DTMF digit is pressed, playback will stop and pressed digit will be present in &#x60;PLAY_FINISHED&#x60; or &#x60;SAY_FINISHED&#x60; event.  If terminator is set to &#x60;123&#x60;, pressing either &#x60;1&#x60;, &#x60;2&#x60; or &#x60;3&#x60; will terminate the playback.
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
     * Digits used to end the audio playback. If no digits are set, any DTMF digit will end the audio playback. After first DTMF digit is pressed, playback will stop and pressed digit will be present in &#x60;PLAY_FINISHED&#x60; or &#x60;SAY_FINISHED&#x60; event.  If terminator is set to &#x60;123&#x60;, pressing either &#x60;1&#x60;, &#x60;2&#x60; or &#x60;3&#x60; will terminate the playback.
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
     * Digits used to end the audio playback. If no digits are set, any DTMF digit will end the audio playback. After first DTMF digit is pressed, playback will stop and pressed digit will be present in &#x60;PLAY_FINISHED&#x60; or &#x60;SAY_FINISHED&#x60; event.  If terminator is set to &#x60;123&#x60;, pressing either &#x60;1&#x60;, &#x60;2&#x60; or &#x60;3&#x60; will terminate the playback.
     *
     * @param terminator
     */
    @JsonProperty("terminator")
    public void setTerminator(String terminator) {
        this.terminator = terminator;
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
        return Objects.equals(this.terminator, callsDtmfTermination.terminator) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(terminator, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfTermination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    terminator: ")
                .append(toIndentedString(terminator))
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
