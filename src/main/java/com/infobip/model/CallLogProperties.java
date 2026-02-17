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
 * Properties of the events that provide &#x60;CallLog&#x60; object.
 */
public class CallLogProperties {

    private CallLog callLog;

    /**
     * Sets callLog.
     *
     * @param callLog
     * @return This {@link CallLogProperties instance}.
     */
    public CallLogProperties callLog(CallLog callLog) {
        this.callLog = callLog;
        return this;
    }

    /**
     * Returns callLog.
     *
     * @return callLog
     */
    @JsonProperty("callLog")
    public CallLog getCallLog() {
        return callLog;
    }

    /**
     * Sets callLog.
     *
     * @param callLog
     */
    @JsonProperty("callLog")
    public void setCallLog(CallLog callLog) {
        this.callLog = callLog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallLogProperties callLogProperties = (CallLogProperties) o;
        return Objects.equals(this.callLog, callLogProperties.callLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callLog);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallLogProperties {")
                .append(newLine)
                .append("    callLog: ")
                .append(toIndentedString(callLog))
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
