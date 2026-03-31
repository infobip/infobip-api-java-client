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
 * Represents WhatsAppVoiceCallButtonApiData model.
 */
public class WhatsAppVoiceCallButtonApiData extends WhatsAppButtonApiData {

    private String text;

    private Integer callValidityPeriod;

    /**
     * Constructs a new {@link WhatsAppVoiceCallButtonApiData} instance.
     */
    public WhatsAppVoiceCallButtonApiData() {
        super("VOICE_CALL");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppVoiceCallButtonApiData instance}.
     */
    public WhatsAppVoiceCallButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the call button in minutes. Must be between 1440 (1 day) and 43200 (30 days).
     *
     * @param callValidityPeriod
     * @return This {@link WhatsAppVoiceCallButtonApiData instance}.
     */
    public WhatsAppVoiceCallButtonApiData callValidityPeriod(Integer callValidityPeriod) {
        this.callValidityPeriod = callValidityPeriod;
        return this;
    }

    /**
     * Returns callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the call button in minutes. Must be between 1440 (1 day) and 43200 (30 days).
     *
     * @return callValidityPeriod
     */
    @JsonProperty("callValidityPeriod")
    public Integer getCallValidityPeriod() {
        return callValidityPeriod;
    }

    /**
     * Sets callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the call button in minutes. Must be between 1440 (1 day) and 43200 (30 days).
     *
     * @param callValidityPeriod
     */
    @JsonProperty("callValidityPeriod")
    public void setCallValidityPeriod(Integer callValidityPeriod) {
        this.callValidityPeriod = callValidityPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppVoiceCallButtonApiData whatsAppVoiceCallButtonApiData = (WhatsAppVoiceCallButtonApiData) o;
        return Objects.equals(this.text, whatsAppVoiceCallButtonApiData.text)
                && Objects.equals(this.callValidityPeriod, whatsAppVoiceCallButtonApiData.callValidityPeriod)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, callValidityPeriod, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppVoiceCallButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    callValidityPeriod: ")
                .append(toIndentedString(callValidityPeriod))
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
