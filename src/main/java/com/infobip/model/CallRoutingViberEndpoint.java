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
 * Represents CallRoutingViberEndpoint model.
 */
public class CallRoutingViberEndpoint extends CallRoutingEndpoint {

    private String from;

    private String phoneNumber;

    /**
     * Constructs a new {@link CallRoutingViberEndpoint} instance.
     */
    public CallRoutingViberEndpoint() {
        super("VIBER");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Viber registered phone number. Defaults to &#x60;from&#x60; value used in inbound call.
     *
     * @param from
     * @return This {@link CallRoutingViberEndpoint instance}.
     */
    public CallRoutingViberEndpoint from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Viber registered phone number. Defaults to &#x60;from&#x60; value used in inbound call.
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
     * Viber registered phone number. Defaults to &#x60;from&#x60; value used in inbound call.
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
     * Phone number in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Defaults to &#x60;to&#x60; value used in inbound call.
     *
     * @param phoneNumber
     * @return This {@link CallRoutingViberEndpoint instance}.
     */
    public CallRoutingViberEndpoint phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Defaults to &#x60;to&#x60; value used in inbound call.
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
     * Phone number in the [E.164](https://en.wikipedia.org/wiki/E.164) format. Defaults to &#x60;to&#x60; value used in inbound call.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingViberEndpoint callRoutingViberEndpoint = (CallRoutingViberEndpoint) o;
        return Objects.equals(this.from, callRoutingViberEndpoint.from)
                && Objects.equals(this.phoneNumber, callRoutingViberEndpoint.phoneNumber)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, phoneNumber, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingViberEndpoint {")
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
