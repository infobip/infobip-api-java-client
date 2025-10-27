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
 * Represents CallRoutingPhoneEndpoint model.
 */
public class CallRoutingPhoneEndpoint extends CallRoutingEndpoint {

    private String from;

    private String phoneNumber;

    private CallRoutingRingbackGeneration ringbackGeneration;

    /**
     * Constructs a new {@link CallRoutingPhoneEndpoint} instance.
     */
    public CallRoutingPhoneEndpoint() {
        super("PHONE");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Defaults to &#x60;from&#x60; value used in inbound call.
     *
     * @param from
     * @return This {@link CallRoutingPhoneEndpoint instance}.
     */
    public CallRoutingPhoneEndpoint from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Phone number in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Defaults to &#x60;from&#x60; value used in inbound call.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Defaults to &#x60;from&#x60; value used in inbound call.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number in the [E.164] format. Defaults to &#x60;to&#x60; value used in inbound call.
     *
     * @param phoneNumber
     * @return This {@link CallRoutingPhoneEndpoint instance}.
     */
    public CallRoutingPhoneEndpoint phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number in the [E.164] format. Defaults to &#x60;to&#x60; value used in inbound call.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number in the [E.164] format. Defaults to &#x60;to&#x60; value used in inbound call.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets ringbackGeneration.
     *
     * @param ringbackGeneration
     * @return This {@link CallRoutingPhoneEndpoint instance}.
     */
    public CallRoutingPhoneEndpoint ringbackGeneration(CallRoutingRingbackGeneration ringbackGeneration) {
        this.ringbackGeneration = ringbackGeneration;
        return this;
    }

    /**
     * Returns ringbackGeneration.
     *
     * @return ringbackGeneration
     */
    @JsonProperty("ringbackGeneration")
    public CallRoutingRingbackGeneration getRingbackGeneration() {
        return ringbackGeneration;
    }

    /**
     * Sets ringbackGeneration.
     *
     * @param ringbackGeneration
     */
    @JsonProperty("ringbackGeneration")
    public void setRingbackGeneration(CallRoutingRingbackGeneration ringbackGeneration) {
        this.ringbackGeneration = ringbackGeneration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingPhoneEndpoint callRoutingPhoneEndpoint = (CallRoutingPhoneEndpoint) o;
        return Objects.equals(this.from, callRoutingPhoneEndpoint.from)
                && Objects.equals(this.phoneNumber, callRoutingPhoneEndpoint.phoneNumber)
                && Objects.equals(this.ringbackGeneration, callRoutingPhoneEndpoint.ringbackGeneration)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, phoneNumber, ringbackGeneration, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingPhoneEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    ringbackGeneration: ")
                .append(toIndentedString(ringbackGeneration))
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
