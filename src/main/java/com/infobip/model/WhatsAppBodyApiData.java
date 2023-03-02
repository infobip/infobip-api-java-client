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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Template body.
 */
public class WhatsAppBodyApiData {

    private String text;

    private List<String> examples = null;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Plain text or text with placeholders. Placeholders have to be correctly formatted and in the correct order, regardless of other sections. Example: {{1}}, {{2}}, {{3}}...
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppBodyApiData instance}.
     */
    public WhatsAppBodyApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Plain text or text with placeholders. Placeholders have to be correctly formatted and in the correct order, regardless of other sections. Example: {{1}}, {{2}}, {{3}}...
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
     * Plain text or text with placeholders. Placeholders have to be correctly formatted and in the correct order, regardless of other sections. Example: {{1}}, {{2}}, {{3}}...
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
     * Sets examples.
     * <p>
     * Field description:
     * Placeholders examples. The number of examples has to be the same as the number of placeholders. Examples cannot contain placeholders.
     *
     * @param examples
     * @return This {@link WhatsAppBodyApiData instance}.
     */
    public WhatsAppBodyApiData examples(List<String> examples) {
        this.examples = examples;
        return this;
    }

    /**
     * Adds and item into examples.
     * <p>
     * Field description:
     * Placeholders examples. The number of examples has to be the same as the number of placeholders. Examples cannot contain placeholders.
     *
     * @param examplesItem The item to be added to the list.
     * @return This {@link WhatsAppBodyApiData instance}.
     */
    public WhatsAppBodyApiData addExamplesItem(String examplesItem) {
        if (this.examples == null) {
            this.examples = new ArrayList<>();
        }
        this.examples.add(examplesItem);
        return this;
    }

    /**
     * Returns examples.
     * <p>
     * Field description:
     * Placeholders examples. The number of examples has to be the same as the number of placeholders. Examples cannot contain placeholders.
     *
     * @return examples
     */
    @JsonProperty("examples")
    public List<String> getExamples() {
        return examples;
    }

    /**
     * Sets examples.
     * <p>
     * Field description:
     * Placeholders examples. The number of examples has to be the same as the number of placeholders. Examples cannot contain placeholders.
     *
     * @param examples
     */
    @JsonProperty("examples")
    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppBodyApiData whatsAppBodyApiData = (WhatsAppBodyApiData) o;
        return Objects.equals(this.text, whatsAppBodyApiData.text)
                && Objects.equals(this.examples, whatsAppBodyApiData.examples);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, examples);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppBodyApiData {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    examples: ")
                .append(toIndentedString(examples))
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
