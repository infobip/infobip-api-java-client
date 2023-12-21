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
 * Recipients of group MMS.
 */
public class MmsInboundDestination {

    private String to;

    private String cc;

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @param to
     * @return This {@link MmsInboundDestination instance}.
     */
    public MmsInboundDestination to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets cc.
     * <p>
     * Field description:
     * Message destination address, carbon copy.
     *
     * @param cc
     * @return This {@link MmsInboundDestination instance}.
     */
    public MmsInboundDestination cc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * Returns cc.
     * <p>
     * Field description:
     * Message destination address, carbon copy.
     *
     * @return cc
     */
    @JsonProperty("cc")
    public String getCc() {
        return cc;
    }

    /**
     * Sets cc.
     * <p>
     * Field description:
     * Message destination address, carbon copy.
     *
     * @param cc
     */
    @JsonProperty("cc")
    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsInboundDestination mmsInboundDestination = (MmsInboundDestination) o;
        return Objects.equals(this.to, mmsInboundDestination.to) && Objects.equals(this.cc, mmsInboundDestination.cc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, cc);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundDestination {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    cc: ")
                .append(toIndentedString(cc))
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
