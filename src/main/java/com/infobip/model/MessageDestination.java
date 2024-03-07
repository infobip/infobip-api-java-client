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
 * Array of destination objects for where messages are being sent. A valid destination is required.
 */
public class MessageDestination {

    private String to;

    private String messageId;

    private List<MessagesApiChannelDestination> byChannel = new ArrayList<>();

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message. It can be alphanumeric or numeric.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link MessageDestination instance}.
     */
    public MessageDestination to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The destination address of the message. It can be alphanumeric or numeric.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message. It can be alphanumeric or numeric.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link MessageDestination instance}.
     */
    public MessageDestination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets byChannel.
     * <p>
     * Field description:
     * Array of substitute destinations distinguished by a &#x60;channel&#x60; they belong to. Only one substitute destination per &#x60;channel&#x60; is permitted.
     * <p>
     * The field is required.
     *
     * @param byChannel
     * @return This {@link MessageDestination instance}.
     */
    public MessageDestination byChannel(List<MessagesApiChannelDestination> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    /**
     * Adds and item into byChannel.
     * <p>
     * Field description:
     * Array of substitute destinations distinguished by a &#x60;channel&#x60; they belong to. Only one substitute destination per &#x60;channel&#x60; is permitted.
     * <p>
     * The field is required.
     *
     * @param byChannelItem The item to be added to the list.
     * @return This {@link MessageDestination instance}.
     */
    public MessageDestination addByChannelItem(MessagesApiChannelDestination byChannelItem) {
        if (this.byChannel == null) {
            this.byChannel = new ArrayList<>();
        }
        this.byChannel.add(byChannelItem);
        return this;
    }

    /**
     * Returns byChannel.
     * <p>
     * Field description:
     * Array of substitute destinations distinguished by a &#x60;channel&#x60; they belong to. Only one substitute destination per &#x60;channel&#x60; is permitted.
     * <p>
     * The field is required.
     *
     * @return byChannel
     */
    @JsonProperty("byChannel")
    public List<MessagesApiChannelDestination> getByChannel() {
        return byChannel;
    }

    /**
     * Sets byChannel.
     * <p>
     * Field description:
     * Array of substitute destinations distinguished by a &#x60;channel&#x60; they belong to. Only one substitute destination per &#x60;channel&#x60; is permitted.
     * <p>
     * The field is required.
     *
     * @param byChannel
     */
    @JsonProperty("byChannel")
    public void setByChannel(List<MessagesApiChannelDestination> byChannel) {
        this.byChannel = byChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageDestination messageDestination = (MessageDestination) o;
        return Objects.equals(this.to, messageDestination.to)
                && Objects.equals(this.messageId, messageDestination.messageId)
                && Objects.equals(this.byChannel, messageDestination.byChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, messageId, byChannel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessageDestination {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    byChannel: ")
                .append(toIndentedString(byChannel))
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
