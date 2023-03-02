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
 * Represents WhatsAppTextHeaderApiData model.
 */
public class WhatsAppTextHeaderApiData extends WhatsAppHeaderApiData {

    private String text;

    private String example;

    /**
     * Constructs a new {@link WhatsAppTextHeaderApiData} instance.
     */
    public WhatsAppTextHeaderApiData() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Template header text. Can contain up to 60 characters, with one placeholder {{1}}.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppTextHeaderApiData instance}.
     */
    public WhatsAppTextHeaderApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Template header text. Can contain up to 60 characters, with one placeholder {{1}}.
     * <p>
     * The field is required.
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
     * Template header text. Can contain up to 60 characters, with one placeholder {{1}}.
     * <p>
     * The field is required.
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
     * An example of the content for the template header a user could use. Cannot contain placeholders.
     *
     * @param example
     * @return This {@link WhatsAppTextHeaderApiData instance}.
     */
    public WhatsAppTextHeaderApiData example(String example) {
        this.example = example;
        return this;
    }

    /**
     * Returns example.
     * <p>
     * Field description:
     * An example of the content for the template header a user could use. Cannot contain placeholders.
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
     * An example of the content for the template header a user could use. Cannot contain placeholders.
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
        WhatsAppTextHeaderApiData whatsAppTextHeaderApiData = (WhatsAppTextHeaderApiData) o;
        return Objects.equals(this.text, whatsAppTextHeaderApiData.text)
                && Objects.equals(this.example, whatsAppTextHeaderApiData.example)
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
                .append("class WhatsAppTextHeaderApiData {")
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
