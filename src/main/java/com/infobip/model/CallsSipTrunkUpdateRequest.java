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
 * Represents CallsSipTrunkUpdateRequest model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsProviderSipTrunkUpdateRequest.class, name = "PROVIDER"),
    @JsonSubTypes.Type(value = CallsRegisteredSipTrunkUpdateRequest.class, name = "REGISTERED"),
    @JsonSubTypes.Type(value = CallsStaticSipTrunkUpdateRequest.class, name = "STATIC"),
})
public abstract class CallsSipTrunkUpdateRequest {

    protected final CallsSipTrunkType type;

    /**
     * Constructs a new {@link CallsSipTrunkUpdateRequest} instance.
     */
    public CallsSipTrunkUpdateRequest(String type) {
        this.type = CallsSipTrunkType.fromValue(type);
    }

    private String name;

    private Boolean internationalCallsAllowed;

    private Integer channelLimit;

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsSipTrunkType getType() {
        return type;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * SIP trunk name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsSipTrunkUpdateRequest instance}.
     */
    public CallsSipTrunkUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * SIP trunk name.
     * <p>
     * The field is required.
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
     * SIP trunk name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @param internationalCallsAllowed
     * @return This {@link CallsSipTrunkUpdateRequest instance}.
     */
    public CallsSipTrunkUpdateRequest internationalCallsAllowed(Boolean internationalCallsAllowed) {
        this.internationalCallsAllowed = internationalCallsAllowed;
        return this;
    }

    /**
     * Returns internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @return internationalCallsAllowed
     */
    @JsonProperty("internationalCallsAllowed")
    public Boolean getInternationalCallsAllowed() {
        return internationalCallsAllowed;
    }

    /**
     * Sets internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @param internationalCallsAllowed
     */
    @JsonProperty("internationalCallsAllowed")
    public void setInternationalCallsAllowed(Boolean internationalCallsAllowed) {
        this.internationalCallsAllowed = internationalCallsAllowed;
    }

    /**
     * Sets channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     *
     * @param channelLimit
     * @return This {@link CallsSipTrunkUpdateRequest instance}.
     */
    public CallsSipTrunkUpdateRequest channelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * Returns channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     *
     * @return channelLimit
     */
    @JsonProperty("channelLimit")
    public Integer getChannelLimit() {
        return channelLimit;
    }

    /**
     * Sets channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     *
     * @param channelLimit
     */
    @JsonProperty("channelLimit")
    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkUpdateRequest callsSipTrunkUpdateRequest = (CallsSipTrunkUpdateRequest) o;
        return Objects.equals(this.type, callsSipTrunkUpdateRequest.type)
                && Objects.equals(this.name, callsSipTrunkUpdateRequest.name)
                && Objects.equals(this.internationalCallsAllowed, callsSipTrunkUpdateRequest.internationalCallsAllowed)
                && Objects.equals(this.channelLimit, callsSipTrunkUpdateRequest.channelLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, internationalCallsAllowed, channelLimit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkUpdateRequest {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    internationalCallsAllowed: ")
                .append(toIndentedString(internationalCallsAllowed))
                .append(newLine)
                .append("    channelLimit: ")
                .append(toIndentedString(channelLimit))
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
