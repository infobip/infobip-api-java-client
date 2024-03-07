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
 * Represents WhatsAppCopyCodeDefaultButtonApiData model.
 */
public class WhatsAppCopyCodeDefaultButtonApiData extends WhatsAppButtonApiData {

    private String text;

    private String example;

    /**
     * Constructs a new {@link WhatsAppCopyCodeDefaultButtonApiData} instance.
     */
    public WhatsAppCopyCodeDefaultButtonApiData() {
        super("COPY_CODE");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     *
     * @param text
     * @return This {@link WhatsAppCopyCodeDefaultButtonApiData instance}.
     */
    public WhatsAppCopyCodeDefaultButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * An example of a copy code.
     *
     * @param example
     * @return This {@link WhatsAppCopyCodeDefaultButtonApiData instance}.
     */
    public WhatsAppCopyCodeDefaultButtonApiData example(String example) {
        this.example = example;
        return this;
    }

    /**
     * Returns example.
     * <p>
     * Field description:
     * An example of a copy code.
     *
     * @return example
     */
    @JsonProperty("example")
    public String getExample() {
        return example;
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * An example of a copy code.
     *
     * @param example
     */
    @JsonProperty("example")
    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppCopyCodeDefaultButtonApiData whatsAppCopyCodeDefaultButtonApiData =
                (WhatsAppCopyCodeDefaultButtonApiData) o;
        return Objects.equals(this.text, whatsAppCopyCodeDefaultButtonApiData.text)
                && Objects.equals(this.example, whatsAppCopyCodeDefaultButtonApiData.example)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, example, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCopyCodeDefaultButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    example: ")
                .append(toIndentedString(example))
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
