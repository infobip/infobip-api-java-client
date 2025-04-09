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
 * Represents a destination which can be specified by a &#x60;channel&#x60;. **It is required for a message failover**.
 */
public class MessagesApiChannelsDestination implements MessagesApiMessageDestination {

    private String messageId;

    private List<MessagesApiChannelDestination> byChannel = new ArrayList<>();

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent. If failover is defined, then it will override values provided in &#x60;byChannel&#x60; array and be applied to each message in failover flow.
     *
     * @param messageId
     * @return This {@link MessagesApiChannelsDestination instance}.
     */
    public MessagesApiChannelsDestination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent. If failover is defined, then it will override values provided in &#x60;byChannel&#x60; array and be applied to each message in failover flow.
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
     * The ID that uniquely identifies the message sent. If failover is defined, then it will override values provided in &#x60;byChannel&#x60; array and be applied to each message in failover flow.
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
     * An array of substitute destinations, each associated with a specific &#x60;channel&#x60;. Only one substitute destination is allowed per &#x60;channel&#x60;. A substitute destination must be provided for the main &#x60;channel&#x60; defined in the &#x60;message&#x60;.
     * <p>
     * The field is required.
     *
     * @param byChannel
     * @return This {@link MessagesApiChannelsDestination instance}.
     */
    public MessagesApiChannelsDestination byChannel(List<MessagesApiChannelDestination> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    /**
     * Adds and item into byChannel.
     * <p>
     * Field description:
     * An array of substitute destinations, each associated with a specific &#x60;channel&#x60;. Only one substitute destination is allowed per &#x60;channel&#x60;. A substitute destination must be provided for the main &#x60;channel&#x60; defined in the &#x60;message&#x60;.
     * <p>
     * The field is required.
     *
     * @param byChannelItem The item to be added to the list.
     * @return This {@link MessagesApiChannelsDestination instance}.
     */
    public MessagesApiChannelsDestination addByChannelItem(MessagesApiChannelDestination byChannelItem) {
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
     * An array of substitute destinations, each associated with a specific &#x60;channel&#x60;. Only one substitute destination is allowed per &#x60;channel&#x60;. A substitute destination must be provided for the main &#x60;channel&#x60; defined in the &#x60;message&#x60;.
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
     * An array of substitute destinations, each associated with a specific &#x60;channel&#x60;. Only one substitute destination is allowed per &#x60;channel&#x60;. A substitute destination must be provided for the main &#x60;channel&#x60; defined in the &#x60;message&#x60;.
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
        MessagesApiChannelsDestination messagesApiChannelsDestination = (MessagesApiChannelsDestination) o;
        return Objects.equals(this.messageId, messagesApiChannelsDestination.messageId)
                && Objects.equals(this.byChannel, messagesApiChannelsDestination.byChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, byChannel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiChannelsDestination {")
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
