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
 * Unique identifier of the participant.
 */
public class FlowPersonUniqueField {

    private String identifier;

    private FlowPersonUniqueFieldType type;

    private String sender;

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Unique ID for a person
     * <p>
     * The field is required.
     *
     * @param identifier
     * @return This {@link FlowPersonUniqueField instance}.
     */
    public FlowPersonUniqueField identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Returns identifier.
     * <p>
     * Field description:
     * Unique ID for a person
     * <p>
     * The field is required.
     *
     * @return identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Unique ID for a person
     * <p>
     * The field is required.
     *
     * @param identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link FlowPersonUniqueField instance}.
     */
    public FlowPersonUniqueField type(FlowPersonUniqueFieldType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public FlowPersonUniqueFieldType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(FlowPersonUniqueFieldType type) {
        this.type = type;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender or application ID.&#x60;sender&#x60; is required for all identifier types except &#x60;PHONE&#x60;, &#x60;EMAIL&#x60;
     *
     * @param sender
     * @return This {@link FlowPersonUniqueField instance}.
     */
    public FlowPersonUniqueField sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Sender or application ID.&#x60;sender&#x60; is required for all identifier types except &#x60;PHONE&#x60;, &#x60;EMAIL&#x60;
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender or application ID.&#x60;sender&#x60; is required for all identifier types except &#x60;PHONE&#x60;, &#x60;EMAIL&#x60;
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowPersonUniqueField flowPersonUniqueField = (FlowPersonUniqueField) o;
        return Objects.equals(this.identifier, flowPersonUniqueField.identifier)
                && Objects.equals(this.type, flowPersonUniqueField.type)
                && Objects.equals(this.sender, flowPersonUniqueField.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, type, sender);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowPersonUniqueField {")
                .append(newLine)
                .append("    identifier: ")
                .append(toIndentedString(identifier))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
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
