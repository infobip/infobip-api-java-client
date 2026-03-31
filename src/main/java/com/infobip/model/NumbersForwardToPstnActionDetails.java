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
 * Represents NumbersForwardToPstnActionDetails model.
 */
public class NumbersForwardToPstnActionDetails extends NumbersVoiceActionDetails {

    private String pstnNumber;

    /**
     * Constructs a new {@link NumbersForwardToPstnActionDetails} instance.
     */
    public NumbersForwardToPstnActionDetails() {
        super("FORWARD_TO_PSTN");
    }

    /**
     * Sets pstnNumber.
     * <p>
     * The field is required.
     *
     * @param pstnNumber
     * @return This {@link NumbersForwardToPstnActionDetails instance}.
     */
    public NumbersForwardToPstnActionDetails pstnNumber(String pstnNumber) {
        this.pstnNumber = pstnNumber;
        return this;
    }

    /**
     * Returns pstnNumber.
     * <p>
     * The field is required.
     *
     * @return pstnNumber
     */
    @JsonProperty("pstnNumber")
    public String getPstnNumber() {
        return pstnNumber;
    }

    /**
     * Sets pstnNumber.
     * <p>
     * The field is required.
     *
     * @param pstnNumber
     */
    @JsonProperty("pstnNumber")
    public void setPstnNumber(String pstnNumber) {
        this.pstnNumber = pstnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersForwardToPstnActionDetails numbersForwardToPstnActionDetails = (NumbersForwardToPstnActionDetails) o;
        return Objects.equals(this.pstnNumber, numbersForwardToPstnActionDetails.pstnNumber) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pstnNumber, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersForwardToPstnActionDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    pstnNumber: ")
                .append(toIndentedString(pstnNumber))
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
