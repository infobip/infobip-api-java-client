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
 * Represents CallsDialogBroadcastWebrtcTextRequest model.
 */
public class CallsDialogBroadcastWebrtcTextRequest {

    private String message;

    /**
     * Sets message.
     * <p>
     * Field description:
     * Message to send.
     * <p>
     * The field is required.
     *
     * @param message
     * @return This {@link CallsDialogBroadcastWebrtcTextRequest instance}.
     */
    public CallsDialogBroadcastWebrtcTextRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns message.
     * <p>
     * Field description:
     * Message to send.
     * <p>
     * The field is required.
     *
     * @return message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     * <p>
     * Field description:
     * Message to send.
     * <p>
     * The field is required.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogBroadcastWebrtcTextRequest callsDialogBroadcastWebrtcTextRequest =
                (CallsDialogBroadcastWebrtcTextRequest) o;
        return Objects.equals(this.message, callsDialogBroadcastWebrtcTextRequest.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogBroadcastWebrtcTextRequest {")
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
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
