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
 * Region-specific parameters, often imposed by local laws. Use this, if country or region that you are sending a message to requires additional information.
 */
public class TfaRegionalOptions {

    private TfaIndiaDltOptions indiaDlt;

    /**
     * Sets indiaDlt.
     *
     * @param indiaDlt
     * @return This {@link TfaRegionalOptions instance}.
     */
    public TfaRegionalOptions indiaDlt(TfaIndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
        return this;
    }

    /**
     * Returns indiaDlt.
     *
     * @return indiaDlt
     */
    @JsonProperty("indiaDlt")
    public TfaIndiaDltOptions getIndiaDlt() {
        return indiaDlt;
    }

    /**
     * Sets indiaDlt.
     *
     * @param indiaDlt
     */
    @JsonProperty("indiaDlt")
    public void setIndiaDlt(TfaIndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaRegionalOptions tfaRegionalOptions = (TfaRegionalOptions) o;
        return Objects.equals(this.indiaDlt, tfaRegionalOptions.indiaDlt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indiaDlt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaRegionalOptions {")
                .append(newLine)
                .append("    indiaDlt: ")
                .append(toIndentedString(indiaDlt))
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
