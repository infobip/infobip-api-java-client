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
 * Recording Configuration object
 */
public class NumbersRecordingBody {

    private Boolean enabled;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * True or False. Default is *false*. If *true* then each call made toward this number will be recorded.
     *
     * @param enabled
     * @return This {@link NumbersRecordingBody instance}.
     */
    public NumbersRecordingBody enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * True or False. Default is *false*. If *true* then each call made toward this number will be recorded.
     *
     * @return enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * True or False. Default is *false*. If *true* then each call made toward this number will be recorded.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersRecordingBody numbersRecordingBody = (NumbersRecordingBody) o;
        return Objects.equals(this.enabled, numbersRecordingBody.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersRecordingBody {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
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
