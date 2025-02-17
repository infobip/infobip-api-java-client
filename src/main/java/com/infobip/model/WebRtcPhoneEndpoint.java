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
 * Represents WebRtcPhoneEndpoint model.
 */
public class WebRtcPhoneEndpoint extends WebRtcEndpoint {

    private String phoneNumber;

    /**
     * Constructs a new {@link WebRtcPhoneEndpoint} instance.
     */
    public WebRtcPhoneEndpoint() {
        super("PHONE");
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number of the call link participant.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link WebRtcPhoneEndpoint instance}.
     */
    public WebRtcPhoneEndpoint phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number of the call link participant.
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
     * Phone number of the call link participant.
     * <p>
     * The field is required.
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
        WebRtcPhoneEndpoint webRtcPhoneEndpoint = (WebRtcPhoneEndpoint) o;
        return Objects.equals(this.phoneNumber, webRtcPhoneEndpoint.phoneNumber) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPhoneEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
