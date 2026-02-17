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
 * List of suggestions
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = RcsCreateCalendarEventSuggestion.class, name = "CREATE_CALENDAR_EVENT"),
    @JsonSubTypes.Type(value = RcsDialPhoneSuggestion.class, name = "DIAL_PHONE"),
    @JsonSubTypes.Type(value = RcsOpenUrlSuggestion.class, name = "OPEN_URL"),
    @JsonSubTypes.Type(value = RcsReplySuggestion.class, name = "REPLY"),
    @JsonSubTypes.Type(value = RcsRequestLocationSuggestion.class, name = "REQUEST_LOCATION"),
    @JsonSubTypes.Type(value = RcsShowLocationSuggestion.class, name = "SHOW_LOCATION"),
})
public abstract class RcsSuggestion {

    protected final RcsSuggestionType type;

    /**
     * Constructs a new {@link RcsSuggestion} instance.
     */
    public RcsSuggestion(String type) {
        this.type = RcsSuggestionType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public RcsSuggestionType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsSuggestion rcsSuggestion = (RcsSuggestion) o;
        return Objects.equals(this.type, rcsSuggestion.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsSuggestion {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
