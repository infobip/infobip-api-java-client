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
 * Represents MmsWebhookInboundCc model.
 */
public class MmsWebhookInboundCc {

    private String cc;

    /**
     * Sets cc.
     * <p>
     * Field description:
     * Message destination address, carbon copy.
     *
     * @param cc
     * @return This {@link MmsWebhookInboundCc instance}.
     */
    public MmsWebhookInboundCc cc(String cc) {
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
        MmsWebhookInboundCc mmsWebhookInboundCc = (MmsWebhookInboundCc) o;
        return Objects.equals(this.cc, mmsWebhookInboundCc.cc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cc);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsWebhookInboundCc {")
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
