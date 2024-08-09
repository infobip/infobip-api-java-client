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
 * Represents MessagesApiTemplateOpenUrlButton model.
 */
public class MessagesApiTemplateOpenUrlButton extends MessagesApiTemplateButton {

    private String suffix;

    /**
     * Constructs a new {@link MessagesApiTemplateOpenUrlButton} instance.
     */
    public MessagesApiTemplateOpenUrlButton() {
        super("OPEN_URL");
    }

    /**
     * Sets suffix.
     * <p>
     * Field description:
     * Extension of a URL defined in the registered template.
     * <p>
     * The field is required.
     *
     * @param suffix
     * @return This {@link MessagesApiTemplateOpenUrlButton instance}.
     */
    public MessagesApiTemplateOpenUrlButton suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Returns suffix.
     * <p>
     * Field description:
     * Extension of a URL defined in the registered template.
     * <p>
     * The field is required.
     *
     * @return suffix
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets suffix.
     * <p>
     * Field description:
     * Extension of a URL defined in the registered template.
     * <p>
     * The field is required.
     *
     * @param suffix
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiTemplateOpenUrlButton messagesApiTemplateOpenUrlButton = (MessagesApiTemplateOpenUrlButton) o;
        return Objects.equals(this.suffix, messagesApiTemplateOpenUrlButton.suffix) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suffix, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateOpenUrlButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    suffix: ")
                .append(toIndentedString(suffix))
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
