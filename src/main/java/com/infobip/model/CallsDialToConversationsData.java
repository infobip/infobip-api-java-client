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
 * Represents CallsDialToConversationsData model.
 */
public class CallsDialToConversationsData {

    private CallsDialToConversationsOptions options;

    /**
     * Sets options.
     * <p>
     * The field is required.
     *
     * @param options
     * @return This {@link CallsDialToConversationsData instance}.
     */
    public CallsDialToConversationsData options(CallsDialToConversationsOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     * <p>
     * The field is required.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsDialToConversationsOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     * <p>
     * The field is required.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsDialToConversationsOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialToConversationsData callsDialToConversationsData = (CallsDialToConversationsData) o;
        return Objects.equals(this.options, callsDialToConversationsData.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialToConversationsData {")
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
