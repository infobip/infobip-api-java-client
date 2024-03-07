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
 * Represents WebRtcPresetLocalization model.
 */
public class WebRtcPresetLocalization extends WebRtcLocalization {

    private WebRtcLanguageCode languageCode;

    /**
     * Constructs a new {@link WebRtcPresetLocalization} instance.
     */
    public WebRtcPresetLocalization() {
        super("PRESET");
    }

    /**
     * Sets languageCode.
     * <p>
     * The field is required.
     *
     * @param languageCode
     * @return This {@link WebRtcPresetLocalization instance}.
     */
    public WebRtcPresetLocalization languageCode(WebRtcLanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Returns languageCode.
     * <p>
     * The field is required.
     *
     * @return languageCode
     */
    @JsonProperty("languageCode")
    public WebRtcLanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets languageCode.
     * <p>
     * The field is required.
     *
     * @param languageCode
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(WebRtcLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcPresetLocalization webRtcPresetLocalization = (WebRtcPresetLocalization) o;
        return Objects.equals(this.languageCode, webRtcPresetLocalization.languageCode) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageCode, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPresetLocalization {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    languageCode: ")
                .append(toIndentedString(languageCode))
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
