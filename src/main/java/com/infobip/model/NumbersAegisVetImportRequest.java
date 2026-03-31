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
 * Represents NumbersAegisVetImportRequest model.
 */
public class NumbersAegisVetImportRequest extends NumbersVetImportRequest {

    private String externalVetId;

    private String vettingToken;

    /**
     * Constructs a new {@link NumbersAegisVetImportRequest} instance.
     */
    public NumbersAegisVetImportRequest() {
        super("AEGIS_MOBILE");
    }

    /**
     * Sets externalVetId.
     * <p>
     * Field description:
     * Aegis external vetting ID
     * <p>
     * The field is required.
     *
     * @param externalVetId
     * @return This {@link NumbersAegisVetImportRequest instance}.
     */
    public NumbersAegisVetImportRequest externalVetId(String externalVetId) {
        this.externalVetId = externalVetId;
        return this;
    }

    /**
     * Returns externalVetId.
     * <p>
     * Field description:
     * Aegis external vetting ID
     * <p>
     * The field is required.
     *
     * @return externalVetId
     */
    @JsonProperty("externalVetId")
    public String getExternalVetId() {
        return externalVetId;
    }

    /**
     * Sets externalVetId.
     * <p>
     * Field description:
     * Aegis external vetting ID
     * <p>
     * The field is required.
     *
     * @param externalVetId
     */
    @JsonProperty("externalVetId")
    public void setExternalVetId(String externalVetId) {
        this.externalVetId = externalVetId;
    }

    /**
     * Sets vettingToken.
     * <p>
     * Field description:
     * Aegis vetting token
     * <p>
     * The field is required.
     *
     * @param vettingToken
     * @return This {@link NumbersAegisVetImportRequest instance}.
     */
    public NumbersAegisVetImportRequest vettingToken(String vettingToken) {
        this.vettingToken = vettingToken;
        return this;
    }

    /**
     * Returns vettingToken.
     * <p>
     * Field description:
     * Aegis vetting token
     * <p>
     * The field is required.
     *
     * @return vettingToken
     */
    @JsonProperty("vettingToken")
    public String getVettingToken() {
        return vettingToken;
    }

    /**
     * Sets vettingToken.
     * <p>
     * Field description:
     * Aegis vetting token
     * <p>
     * The field is required.
     *
     * @param vettingToken
     */
    @JsonProperty("vettingToken")
    public void setVettingToken(String vettingToken) {
        this.vettingToken = vettingToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersAegisVetImportRequest numbersAegisVetImportRequest = (NumbersAegisVetImportRequest) o;
        return Objects.equals(this.externalVetId, numbersAegisVetImportRequest.externalVetId)
                && Objects.equals(this.vettingToken, numbersAegisVetImportRequest.vettingToken)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalVetId, vettingToken, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersAegisVetImportRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    externalVetId: ")
                .append(toIndentedString(externalVetId))
                .append(newLine)
                .append("    vettingToken: ")
                .append(toIndentedString(vettingToken))
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
