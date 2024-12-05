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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Represents CallbackResponse model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "command",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsAudioCallbackResponse.class, name = "audio"),
    @JsonSubTypes.Type(value = CallsCaptureDtmfCallbackResponse.class, name = "captureDtmf"),
    @JsonSubTypes.Type(value = CallsDialCallbackResponse.class, name = "dial"),
})
public abstract class CallbackResponse {

    protected final String command;

    /**
     * Constructs a new {@link CallbackResponse} instance.
     */
    public CallbackResponse(String command) {
        this.command = command;
    }

    /**
     * Returns command.
     * <p>
     * The field is required.
     *
     * @return command
     */
    @JsonProperty("command")
    public String getCommand() {
        return command;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallbackResponse callbackResponse = (CallbackResponse) o;
        return Objects.equals(this.command, callbackResponse.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallbackResponse {")
                .append(newLine)
                .append("    command: ")
                .append(toIndentedString(command))
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
