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
 * Represents TfaVerifyPinRequest model.
 */
public class TfaVerifyPinRequest {

    private String pin;

    /**
     * Sets pin.
     * <p>
     * Field description:
     * The PIN code to verify.
     * <p>
     * The field is required.
     *
     * @param pin
     * @return This {@link TfaVerifyPinRequest instance}.
     */
    public TfaVerifyPinRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * Returns pin.
     * <p>
     * Field description:
     * The PIN code to verify.
     * <p>
     * The field is required.
     *
     * @return pin
     */
    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    /**
     * Sets pin.
     * <p>
     * Field description:
     * The PIN code to verify.
     * <p>
     * The field is required.
     *
     * @param pin
     */
    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaVerifyPinRequest tfaVerifyPinRequest = (TfaVerifyPinRequest) o;
        return Objects.equals(this.pin, tfaVerifyPinRequest.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaVerifyPinRequest {")
                .append(newLine)
                .append("    pin: ")
                .append(toIndentedString(pin))
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
