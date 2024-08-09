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
 * Represents MessagesApiTemplateQuickReplyButton model.
 */
public class MessagesApiTemplateQuickReplyButton extends MessagesApiTemplateButton {

    private String postbackData;

    /**
     * Constructs a new {@link MessagesApiTemplateQuickReplyButton} instance.
     */
    public MessagesApiTemplateQuickReplyButton() {
        super("QUICK_REPLY");
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a user&#39;s response.
     * <p>
     * The field is required.
     *
     * @param postbackData
     * @return This {@link MessagesApiTemplateQuickReplyButton instance}.
     */
    public MessagesApiTemplateQuickReplyButton postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a user&#39;s response.
     * <p>
     * The field is required.
     *
     * @return postbackData
     */
    @JsonProperty("postbackData")
    public String getPostbackData() {
        return postbackData;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a user&#39;s response.
     * <p>
     * The field is required.
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiTemplateQuickReplyButton messagesApiTemplateQuickReplyButton =
                (MessagesApiTemplateQuickReplyButton) o;
        return Objects.equals(this.postbackData, messagesApiTemplateQuickReplyButton.postbackData) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateQuickReplyButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
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
