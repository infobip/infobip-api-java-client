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
 * List of selected items or values provided by the user for this form selection.
 */
public class MessagesApiWebhookEventFormItem {

    private String title;

    private String value;

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the item.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link MessagesApiWebhookEventFormItem instance}.
     */
    public MessagesApiWebhookEventFormItem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the item.
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
     * Title of the item.
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
     * Sets value.
     * <p>
     * Field description:
     * Value of the item.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link MessagesApiWebhookEventFormItem instance}.
     */
    public MessagesApiWebhookEventFormItem value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value of the item.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the item.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventFormItem messagesApiWebhookEventFormItem = (MessagesApiWebhookEventFormItem) o;
        return Objects.equals(this.title, messagesApiWebhookEventFormItem.title)
                && Objects.equals(this.value, messagesApiWebhookEventFormItem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventFormItem {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
