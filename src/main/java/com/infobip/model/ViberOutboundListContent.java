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
 * Represents ViberOutboundListContent model.
 */
public class ViberOutboundListContent extends ViberOutboundContent {

    private String text;

    private List<String> options = new ArrayList<>();

    /**
     * Constructs a new {@link ViberOutboundListContent} instance.
     */
    public ViberOutboundListContent() {
        super("LIST");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the options.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link ViberOutboundListContent instance}.
     */
    public ViberOutboundListContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed alongside the options.
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
     * Text to be displayed alongside the options.
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
     * Sets options.
     * <p>
     * Field description:
     * List of possible options.
     * <p>
     * The field is required.
     *
     * @param options
     * @return This {@link ViberOutboundListContent instance}.
     */
    public ViberOutboundListContent options(List<String> options) {
        this.options = options;
        return this;
    }

    /**
     * Adds and item into options.
     * <p>
     * Field description:
     * List of possible options.
     * <p>
     * The field is required.
     *
     * @param optionsItem The item to be added to the list.
     * @return This {@link ViberOutboundListContent instance}.
     */
    public ViberOutboundListContent addOptionsItem(String optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Returns options.
     * <p>
     * Field description:
     * List of possible options.
     * <p>
     * The field is required.
     *
     * @return options
     */
    @JsonProperty("options")
    public List<String> getOptions() {
        return options;
    }

    /**
     * Sets options.
     * <p>
     * Field description:
     * List of possible options.
     * <p>
     * The field is required.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(List<String> options) {
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
        ViberOutboundListContent viberOutboundListContent = (ViberOutboundListContent) o;
        return Objects.equals(this.text, viberOutboundListContent.text)
                && Objects.equals(this.options, viberOutboundListContent.options)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, options, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundListContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
