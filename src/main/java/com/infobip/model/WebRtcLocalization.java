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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * If the localization object is not defined, English will be used. If the localization type is set to PRESET, the language code is mandatory to be defined to one of the predefined values.If the localization type is set to BROWSER_DETECTED and the browser language is one of the languages that could be set in PRESET type, then that language will be used. Otherwise, English will be used.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WebRtcBrowserDetectedLocalization.class, name = "BROWSER_DETECTED"),
    @JsonSubTypes.Type(value = WebRtcPresetLocalization.class, name = "PRESET"),
})
public abstract class WebRtcLocalization {

    protected final WebRtcLocalizationType type;

    /**
     * Constructs a new {@link WebRtcLocalization} instance.
     */
    public WebRtcLocalization(String type) {
        this.type = WebRtcLocalizationType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WebRtcLocalizationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcLocalization webRtcLocalization = (WebRtcLocalization) o;
        return Objects.equals(this.type, webRtcLocalization.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcLocalization {")
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
