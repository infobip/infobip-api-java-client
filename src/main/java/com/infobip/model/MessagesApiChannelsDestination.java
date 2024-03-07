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
 * Represents a destination which can be specified by a &#x60;channel&#x60;. It is required for a message failover.
 */
public class MessagesApiChannelsDestination {

    private List<MessagesApiChannelDestination> byChannel = new ArrayList<>();

    /**
     * Sets byChannel.
     * <p>
     * Field description:
     * Array of substitute destinations distinguished by a &#x60;channel&#x60; they belong to. Only one substitute destination per &#x60;channel&#x60; is permitted.
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
     * Array of substitute destinations distinguished by a &#x60;channel&#x60; they belong to. Only one substitute destination per &#x60;channel&#x60; is permitted.
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
        MessagesApiChannelsDestination messagesApiChannelsDestination = (MessagesApiChannelsDestination) o;
        return Objects.equals(this.byChannel, messagesApiChannelsDestination.byChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(byChannel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiChannelsDestination {")
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
