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
 * Sender display info (name and avatar). Used only for Viber Bot messages.
 */
public class MessagesApiMessageSenderDisplayInfo {

    private String name;

    private String avatarUrl;

    /**
     * Sets name.
     * <p>
     * Field description:
     * The sender&#39;s name to display.
     *
     * @param name
     * @return This {@link MessagesApiMessageSenderDisplayInfo instance}.
     */
    public MessagesApiMessageSenderDisplayInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The sender&#39;s name to display.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * The sender&#39;s name to display.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets avatarUrl.
     * <p>
     * Field description:
     * The sender&#39;s avatar URL.
     *
     * @param avatarUrl
     * @return This {@link MessagesApiMessageSenderDisplayInfo instance}.
     */
    public MessagesApiMessageSenderDisplayInfo avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Returns avatarUrl.
     * <p>
     * Field description:
     * The sender&#39;s avatar URL.
     *
     * @return avatarUrl
     */
    @JsonProperty("avatarUrl")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Sets avatarUrl.
     * <p>
     * Field description:
     * The sender&#39;s avatar URL.
     *
     * @param avatarUrl
     */
    @JsonProperty("avatarUrl")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageSenderDisplayInfo messagesApiMessageSenderDisplayInfo =
                (MessagesApiMessageSenderDisplayInfo) o;
        return Objects.equals(this.name, messagesApiMessageSenderDisplayInfo.name)
                && Objects.equals(this.avatarUrl, messagesApiMessageSenderDisplayInfo.avatarUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avatarUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageSenderDisplayInfo {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    avatarUrl: ")
                .append(toIndentedString(avatarUrl))
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
