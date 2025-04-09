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
 * List of destinations. First destination in the list is the first one to be executed. Subsequent destinations are executed only if the previous one fails.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallRoutingEndpointDestination.class, name = "ENDPOINT"),
    @JsonSubTypes.Type(value = CallRoutingUrlDestination.class, name = "URL"),
})
public abstract class CallRoutingDestination {

    private Integer priority;

    private Integer weight;

    protected final CallRoutingDestinationType type;

    /**
     * Constructs a new {@link CallRoutingDestination} instance.
     */
    public CallRoutingDestination(String type) {
        this.type = CallRoutingDestinationType.fromValue(type);
    }

    /**
     * Sets priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @param priority
     * @return This {@link CallRoutingDestination instance}.
     */
    public CallRoutingDestination priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Returns priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @return priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @param priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Sets weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100. Either all or no destination need to have this value defined.
     *
     * @param weight
     * @return This {@link CallRoutingDestination instance}.
     */
    public CallRoutingDestination weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Returns weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100. Either all or no destination need to have this value defined.
     *
     * @return weight
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100. Either all or no destination need to have this value defined.
     *
     * @param weight
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallRoutingDestinationType getType() {
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
        CallRoutingDestination callRoutingDestination = (CallRoutingDestination) o;
        return Objects.equals(this.priority, callRoutingDestination.priority)
                && Objects.equals(this.weight, callRoutingDestination.weight)
                && Objects.equals(this.type, callRoutingDestination.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, weight, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingDestination {")
                .append(newLine)
                .append("    priority: ")
                .append(toIndentedString(priority))
                .append(newLine)
                .append("    weight: ")
                .append(toIndentedString(weight))
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
