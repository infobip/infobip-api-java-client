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
 * Represents NumbersWmcVetImportRequest model.
 */
public class NumbersWmcVetImportRequest extends NumbersVetImportRequest {

    private String transactionId;

    /**
     * Constructs a new {@link NumbersWmcVetImportRequest} instance.
     */
    public NumbersWmcVetImportRequest() {
        super("WMC_GLOBAL");
    }

    /**
     * Sets transactionId.
     * <p>
     * Field description:
     * WMC Global transaction ID
     * <p>
     * The field is required.
     *
     * @param transactionId
     * @return This {@link NumbersWmcVetImportRequest instance}.
     */
    public NumbersWmcVetImportRequest transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Returns transactionId.
     * <p>
     * Field description:
     * WMC Global transaction ID
     * <p>
     * The field is required.
     *
     * @return transactionId
     */
    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets transactionId.
     * <p>
     * Field description:
     * WMC Global transaction ID
     * <p>
     * The field is required.
     *
     * @param transactionId
     */
    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersWmcVetImportRequest numbersWmcVetImportRequest = (NumbersWmcVetImportRequest) o;
        return Objects.equals(this.transactionId, numbersWmcVetImportRequest.transactionId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersWmcVetImportRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    transactionId: ")
                .append(toIndentedString(transactionId))
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
