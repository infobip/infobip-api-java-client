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
 * Conversation information associated with the message.
 */
public class RcsConversationInfo {

    private Boolean canInitiate;

    private String id;

    /**
     * Sets canInitiate.
     * <p>
     * Field description:
     * Indicates whether this message can initiate or trigger a conversation. If the message already belongs to a conversation, the value is false.
     * <p>
     * The field is required.
     *
     * @param canInitiate
     * @return This {@link RcsConversationInfo instance}.
     */
    public RcsConversationInfo canInitiate(Boolean canInitiate) {
        this.canInitiate = canInitiate;
        return this;
    }

    /**
     * Returns canInitiate.
     * <p>
     * Field description:
     * Indicates whether this message can initiate or trigger a conversation. If the message already belongs to a conversation, the value is false.
     * <p>
     * The field is required.
     *
     * @return canInitiate
     */
    @JsonProperty("canInitiate")
    public Boolean getCanInitiate() {
        return canInitiate;
    }

    /**
     * Sets canInitiate.
     * <p>
     * Field description:
     * Indicates whether this message can initiate or trigger a conversation. If the message already belongs to a conversation, the value is false.
     * <p>
     * The field is required.
     *
     * @param canInitiate
     */
    @JsonProperty("canInitiate")
    public void setCanInitiate(Boolean canInitiate) {
        this.canInitiate = canInitiate;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique conversation identifier. Present when the message belongs to a conversation, null otherwise.
     *
     * @param id
     * @return This {@link RcsConversationInfo instance}.
     */
    public RcsConversationInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique conversation identifier. Present when the message belongs to a conversation, null otherwise.
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
     * Unique conversation identifier. Present when the message belongs to a conversation, null otherwise.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsConversationInfo rcsConversationInfo = (RcsConversationInfo) o;
        return Objects.equals(this.canInitiate, rcsConversationInfo.canInitiate)
                && Objects.equals(this.id, rcsConversationInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canInitiate, id);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsConversationInfo {")
                .append(newLine)
                .append("    canInitiate: ")
                .append(toIndentedString(canInitiate))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
