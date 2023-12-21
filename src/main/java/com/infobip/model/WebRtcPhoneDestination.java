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
 * Represents WebRtcPhoneDestination model.
 */
public class WebRtcPhoneDestination extends WebRtcDestination {

    private String phoneNumber;

    private String from;

    private String displayName;

    /**
     * Constructs a new {@link WebRtcPhoneDestination} instance.
     */
    public WebRtcPhoneDestination() {
        super("PHONE");
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number of a callee in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link WebRtcPhoneDestination instance}.
     */
    public WebRtcPhoneDestination phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number of a callee in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
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
     * Phone number of a callee in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number displayed to a user as a caller in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
     *
     * @param from
     * @return This {@link WebRtcPhoneDestination instance}.
     */
    public WebRtcPhoneDestination from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Phone number displayed to a user as a caller in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
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
     * Phone number displayed to a user as a caller in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     * @return This {@link WebRtcPhoneDestination instance}.
     */
    public WebRtcPhoneDestination displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @return displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcPhoneDestination webRtcPhoneDestination = (WebRtcPhoneDestination) o;
        return Objects.equals(this.phoneNumber, webRtcPhoneDestination.phoneNumber)
                && Objects.equals(this.from, webRtcPhoneDestination.from)
                && Objects.equals(this.displayName, webRtcPhoneDestination.displayName)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, from, displayName, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPhoneDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
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
