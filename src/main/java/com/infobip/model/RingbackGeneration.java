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
 * Option to generate a consistent local ringback tone, overriding remote ringing tones. If enabled, the ringback will be generated for the existing call, provided it joins the conference before the remote ringback of the new call starts.
 */
public class RingbackGeneration {

    private Boolean enabled;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Flag indicating whether ringback generation is enabled. Cannot be &#x60;true&#x60; when &#x60;connectOnEarlyMedia&#x60; is &#x60;true&#x60;.
     *
     * @param enabled
     * @return This {@link RingbackGeneration instance}.
     */
    public RingbackGeneration enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Flag indicating whether ringback generation is enabled. Cannot be &#x60;true&#x60; when &#x60;connectOnEarlyMedia&#x60; is &#x60;true&#x60;.
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
     * Flag indicating whether ringback generation is enabled. Cannot be &#x60;true&#x60; when &#x60;connectOnEarlyMedia&#x60; is &#x60;true&#x60;.
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
        RingbackGeneration ringbackGeneration = (RingbackGeneration) o;
        return Objects.equals(this.enabled, ringbackGeneration.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RingbackGeneration {")
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
