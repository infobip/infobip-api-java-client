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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Voice action configuration.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = NumbersForwardToCallRoutingDetails.class, name = "FORWARD_TO_CALL_ROUTING"),
    @JsonSubTypes.Type(value = NumbersForwardToIvrActionDetails.class, name = "FORWARD_TO_IVR"),
    @JsonSubTypes.Type(value = NumbersForwardToPstnActionDetails.class, name = "FORWARD_TO_PSTN"),
    @JsonSubTypes.Type(value = NumbersForwardToSubscriptionDetails.class, name = "FORWARD_TO_SUBSCRIPTION"),
    @JsonSubTypes.Type(value = NumbersVoiceForwardToAnswersDetails.class, name = "VOICE_FORWARD_TO_ANSWERS"),
    @JsonSubTypes.Type(
            value = NumbersVoiceForwardToConversationsDetails.class,
            name = "VOICE_FORWARD_TO_CONVERSATIONS"),
    @JsonSubTypes.Type(value = NumbersVoiceNumberMaskingActionDetails.class, name = "VOICE_NUMBER_MASKING"),
})
public abstract class NumbersVoiceActionDetails {

    protected final MoActionType type;

    /**
     * Constructs a new {@link NumbersVoiceActionDetails} instance.
     */
    public NumbersVoiceActionDetails(String type) {
        this.type = MoActionType.fromValue(type);
    }

    private String description;

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public MoActionType getType() {
        return type;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @param description
     * @return This {@link NumbersVoiceActionDetails instance}.
     */
    public NumbersVoiceActionDetails description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Additional action description.
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
     * Additional action description.
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
        NumbersVoiceActionDetails numbersVoiceActionDetails = (NumbersVoiceActionDetails) o;
        return Objects.equals(this.type, numbersVoiceActionDetails.type)
                && Objects.equals(this.description, numbersVoiceActionDetails.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersVoiceActionDetails {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
