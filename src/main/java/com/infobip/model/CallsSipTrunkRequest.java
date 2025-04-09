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
 * Represents CallsSipTrunkRequest model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsProviderSipTrunkRequest.class, name = "PROVIDER"),
    @JsonSubTypes.Type(value = CallsRegisteredSipTrunkRequest.class, name = "REGISTERED"),
    @JsonSubTypes.Type(value = CallsStaticSipTrunkRequest.class, name = "STATIC"),
})
public abstract class CallsSipTrunkRequest {

    protected final CallsSipTrunkType type;

    /**
     * Constructs a new {@link CallsSipTrunkRequest} instance.
     */
    public CallsSipTrunkRequest(String type) {
        this.type = CallsSipTrunkType.fromValue(type);
    }

    private String name;

    private String location;

    private Boolean tls;

    private Boolean internationalCallsAllowed;

    private Integer channelLimit;

    private CallsBillingPackage billingPackage;

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
     * @return This {@link CallsSipTrunkRequest instance}.
     */
    public CallsSipTrunkRequest name(String name) {
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
     * Sets location.
     * <p>
     * Field description:
     * SIP trunk location.
     *
     * @param location
     * @return This {@link CallsSipTrunkRequest instance}.
     */
    public CallsSipTrunkRequest location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Returns location.
     * <p>
     * Field description:
     * SIP trunk location.
     *
     * @return location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     * <p>
     * Field description:
     * SIP trunk location.
     *
     * @param location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Sets tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @param tls
     * @return This {@link CallsSipTrunkRequest instance}.
     */
    public CallsSipTrunkRequest tls(Boolean tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Returns tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @return tls
     */
    @JsonProperty("tls")
    public Boolean getTls() {
        return tls;
    }

    /**
     * Sets tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @param tls
     */
    @JsonProperty("tls")
    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    /**
     * Sets internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @param internationalCallsAllowed
     * @return This {@link CallsSipTrunkRequest instance}.
     */
    public CallsSipTrunkRequest internationalCallsAllowed(Boolean internationalCallsAllowed) {
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
     * <p>
     * The field is required.
     *
     * @param channelLimit
     * @return This {@link CallsSipTrunkRequest instance}.
     */
    public CallsSipTrunkRequest channelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * Returns channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param channelLimit
     */
    @JsonProperty("channelLimit")
    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    /**
     * Sets billingPackage.
     * <p>
     * The field is required.
     *
     * @param billingPackage
     * @return This {@link CallsSipTrunkRequest instance}.
     */
    public CallsSipTrunkRequest billingPackage(CallsBillingPackage billingPackage) {
        this.billingPackage = billingPackage;
        return this;
    }

    /**
     * Returns billingPackage.
     * <p>
     * The field is required.
     *
     * @return billingPackage
     */
    @JsonProperty("billingPackage")
    public CallsBillingPackage getBillingPackage() {
        return billingPackage;
    }

    /**
     * Sets billingPackage.
     * <p>
     * The field is required.
     *
     * @param billingPackage
     */
    @JsonProperty("billingPackage")
    public void setBillingPackage(CallsBillingPackage billingPackage) {
        this.billingPackage = billingPackage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkRequest callsSipTrunkRequest = (CallsSipTrunkRequest) o;
        return Objects.equals(this.type, callsSipTrunkRequest.type)
                && Objects.equals(this.name, callsSipTrunkRequest.name)
                && Objects.equals(this.location, callsSipTrunkRequest.location)
                && Objects.equals(this.tls, callsSipTrunkRequest.tls)
                && Objects.equals(this.internationalCallsAllowed, callsSipTrunkRequest.internationalCallsAllowed)
                && Objects.equals(this.channelLimit, callsSipTrunkRequest.channelLimit)
                && Objects.equals(this.billingPackage, callsSipTrunkRequest.billingPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, location, tls, internationalCallsAllowed, channelLimit, billingPackage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkRequest {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    location: ")
                .append(toIndentedString(location))
                .append(newLine)
                .append("    tls: ")
                .append(toIndentedString(tls))
                .append(newLine)
                .append("    internationalCallsAllowed: ")
                .append(toIndentedString(internationalCallsAllowed))
                .append(newLine)
                .append("    channelLimit: ")
                .append(toIndentedString(channelLimit))
                .append(newLine)
                .append("    billingPackage: ")
                .append(toIndentedString(billingPackage))
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
