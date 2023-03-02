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
 * Represents WhatsAppWebhookListReplyContent model.
 */
public class WhatsAppWebhookListReplyContent extends WhatsAppWebhookInboundMessage {

    private String id;

    private String title;

    private String description;

    /**
     * Constructs a new {@link WhatsAppWebhookListReplyContent} instance.
     */
    public WhatsAppWebhookListReplyContent() {
        super("INTERACTIVE_LIST_REPLY");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * ID of the selected row.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link WhatsAppWebhookListReplyContent instance}.
     */
    public WhatsAppWebhookListReplyContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * ID of the selected row.
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
     * ID of the selected row.
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
     * Title of the selected row.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link WhatsAppWebhookListReplyContent instance}.
     */
    public WhatsAppWebhookListReplyContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the selected row.
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
     * Title of the selected row.
     * <p>
     * The field is required.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the selected row.
     *
     * @param description
     * @return This {@link WhatsAppWebhookListReplyContent instance}.
     */
    public WhatsAppWebhookListReplyContent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the selected row.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the selected row.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookListReplyContent whatsAppWebhookListReplyContent = (WhatsAppWebhookListReplyContent) o;
        return Objects.equals(this.id, whatsAppWebhookListReplyContent.id)
                && Objects.equals(this.title, whatsAppWebhookListReplyContent.title)
                && Objects.equals(this.description, whatsAppWebhookListReplyContent.description)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookListReplyContent {")
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
                .append("    description: ")
                .append(toIndentedString(description))
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
