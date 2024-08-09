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
 * Region-specific parameters, often imposed by local laws. Use this, if country or region that you are sending an SMS to requires additional information.
 */
public class MmsRegional {

    private MmsSouthKoreaOptions southKorea;

    /**
     * Sets southKorea.
     *
     * @param southKorea
     * @return This {@link MmsRegional instance}.
     */
    public MmsRegional southKorea(MmsSouthKoreaOptions southKorea) {
        this.southKorea = southKorea;
        return this;
    }

    /**
     * Returns southKorea.
     *
     * @return southKorea
     */
    @JsonProperty("southKorea")
    public MmsSouthKoreaOptions getSouthKorea() {
        return southKorea;
    }

    /**
     * Sets southKorea.
     *
     * @param southKorea
     */
    @JsonProperty("southKorea")
    public void setSouthKorea(MmsSouthKoreaOptions southKorea) {
        this.southKorea = southKorea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsRegional mmsRegional = (MmsRegional) o;
        return Objects.equals(this.southKorea, mmsRegional.southKorea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(southKorea);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsRegional {")
                .append(newLine)
                .append("    southKorea: ")
                .append(toIndentedString(southKorea))
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
