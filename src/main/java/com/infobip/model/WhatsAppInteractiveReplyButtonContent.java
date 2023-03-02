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
 * Represents WhatsAppInteractiveReplyButtonContent model.
 */
public class WhatsAppInteractiveReplyButtonContent extends WhatsAppInteractiveButtonContent {

    private String id;

    private String title;

    /**
     * Constructs a new {@link WhatsAppInteractiveReplyButtonContent} instance.
     */
    public WhatsAppInteractiveReplyButtonContent() {
        super("REPLY");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the button containing no leading nor trailing whitespaces.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link WhatsAppInteractiveReplyButtonContent instance}.
     */
    public WhatsAppInteractiveReplyButtonContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the button containing no leading nor trailing whitespaces.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the button containing no leading nor trailing whitespaces.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Unique title of the button. Doesn&#39;t allow emojis or markdown.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link WhatsAppInteractiveReplyButtonContent instance}.
     */
    public WhatsAppInteractiveReplyButtonContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Unique title of the button. Doesn&#39;t allow emojis or markdown.
     * <p>
     * The field is required.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Unique title of the button. Doesn&#39;t allow emojis or markdown.
     * <p>
     * The field is required.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveReplyButtonContent whatsAppInteractiveReplyButtonContent =
                (WhatsAppInteractiveReplyButtonContent) o;
        return Objects.equals(this.id, whatsAppInteractiveReplyButtonContent.id)
                && Objects.equals(this.title, whatsAppInteractiveReplyButtonContent.title)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveReplyButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
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
