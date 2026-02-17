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
 * Represents CallsConferenceBroadcastWebrtcTextRequest model.
 */
public class CallsConferenceBroadcastWebrtcTextRequest {

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
     * @return This {@link CallsConferenceBroadcastWebrtcTextRequest instance}.
     */
    public CallsConferenceBroadcastWebrtcTextRequest message(String message) {
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
        CallsConferenceBroadcastWebrtcTextRequest callsConferenceBroadcastWebrtcTextRequest =
                (CallsConferenceBroadcastWebrtcTextRequest) o;
        return Objects.equals(this.message, callsConferenceBroadcastWebrtcTextRequest.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceBroadcastWebrtcTextRequest {")
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
