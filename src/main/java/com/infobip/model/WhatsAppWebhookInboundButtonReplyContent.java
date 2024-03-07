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
 * Represents WhatsAppWebhookInboundButtonReplyContent model.
 */
public class WhatsAppWebhookInboundButtonReplyContent extends WhatsAppWebhookInboundContent {

    private String id;

    private String title;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundButtonReplyContent} instance.
     */
    public WhatsAppWebhookInboundButtonReplyContent() {
        super("INTERACTIVE_BUTTON_REPLY");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Identifier of the selected button.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link WhatsAppWebhookInboundButtonReplyContent instance}.
     */
    public WhatsAppWebhookInboundButtonReplyContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Identifier of the selected button.
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
     * Identifier of the selected button.
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
     * Title of the selected button.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link WhatsAppWebhookInboundButtonReplyContent instance}.
     */
    public WhatsAppWebhookInboundButtonReplyContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the selected button.
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
     * Title of the selected button.
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
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundButtonReplyContent instance}.
     */
    public WhatsAppWebhookInboundButtonReplyContent context(WhatsAppContext context) {
        this.context = context;
        return this;
    }

    /**
     * Returns context.
     *
     * @return context
     */
    @JsonProperty("context")
    public WhatsAppContext getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context
     */
    @JsonProperty("context")
    public void setContext(WhatsAppContext context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundButtonReplyContent whatsAppWebhookInboundButtonReplyContent =
                (WhatsAppWebhookInboundButtonReplyContent) o;
        return Objects.equals(this.id, whatsAppWebhookInboundButtonReplyContent.id)
                && Objects.equals(this.title, whatsAppWebhookInboundButtonReplyContent.title)
                && Objects.equals(this.context, whatsAppWebhookInboundButtonReplyContent.context)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundButtonReplyContent {")
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
                .append("    context: ")
                .append(toIndentedString(context))
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
