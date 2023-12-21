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
 * Hangup request.
 */
public class CallsHangupRequest {

    private CallsErrorCode errorCode;

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link CallsHangupRequest instance}.
     */
    public CallsHangupRequest errorCode(CallsErrorCode errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public CallsErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(CallsErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsHangupRequest callsHangupRequest = (CallsHangupRequest) o;
        return Objects.equals(this.errorCode, callsHangupRequest.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsHangupRequest {")
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
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
