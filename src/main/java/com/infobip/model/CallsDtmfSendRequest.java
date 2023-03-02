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
 * Represents CallsDtmfSendRequest model.
 */
public class CallsDtmfSendRequest {

    private String dtmf;

    /**
     * Sets dtmf.
     * <p>
     * Field description:
     * DTMF digits to send.
     * <p>
     * The field is required.
     *
     * @param dtmf
     * @return This {@link CallsDtmfSendRequest instance}.
     */
    public CallsDtmfSendRequest dtmf(String dtmf) {
        this.dtmf = dtmf;
        return this;
    }

    /**
     * Returns dtmf.
     * <p>
     * Field description:
     * DTMF digits to send.
     * <p>
     * The field is required.
     *
     * @return dtmf
     */
    @JsonProperty("dtmf")
    public String getDtmf() {
        return dtmf;
    }

    /**
     * Sets dtmf.
     * <p>
     * Field description:
     * DTMF digits to send.
     * <p>
     * The field is required.
     *
     * @param dtmf
     */
    @JsonProperty("dtmf")
    public void setDtmf(String dtmf) {
        this.dtmf = dtmf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDtmfSendRequest callsDtmfSendRequest = (CallsDtmfSendRequest) o;
        return Objects.equals(this.dtmf, callsDtmfSendRequest.dtmf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtmf);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfSendRequest {")
                .append(newLine)
                .append("    dtmf: ")
                .append(toIndentedString(dtmf))
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
