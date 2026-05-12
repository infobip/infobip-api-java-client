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
 * Collection of lookup results.
 */
public class NumberLookupResponseDetails {

    private String to;

    private String mccMnc;

    private String imsi;

    private NumberLookupNetwork originalNetwork;

    private Boolean ported;

    private NumberLookupNetwork portedNetwork;

    private Boolean roaming;

    private NumberLookupNetwork roamingNetwork;

    private String servingMSC;

    private NumberLookupStatus status;

    private NumberLookupError error;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The looked up phone number.
     *
     * @param to
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The looked up phone number.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The looked up phone number.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country code and mobile network code concatenated. MccMnc will start with the MCC, and it will always have three digits, followed by the MNC (length of the MNC depends on the value of the MCC, and it can be two or three).
     *
     * @param mccMnc
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails mccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    /**
     * Returns mccMnc.
     * <p>
     * Field description:
     * Mobile country code and mobile network code concatenated. MccMnc will start with the MCC, and it will always have three digits, followed by the MNC (length of the MNC depends on the value of the MCC, and it can be two or three).
     *
     * @return mccMnc
     */
    @JsonProperty("mccMnc")
    public String getMccMnc() {
        return mccMnc;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country code and mobile network code concatenated. MccMnc will start with the MCC, and it will always have three digits, followed by the MNC (length of the MNC depends on the value of the MCC, and it can be two or three).
     *
     * @param mccMnc
     */
    @JsonProperty("mccMnc")
    public void setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
    }

    /**
     * Sets imsi.
     * <p>
     * Field description:
     * International Mobile Subscriber Identity, used to uniquely identify the user of a mobile network.
     *
     * @param imsi
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails imsi(String imsi) {
        this.imsi = imsi;
        return this;
    }

    /**
     * Returns imsi.
     * <p>
     * Field description:
     * International Mobile Subscriber Identity, used to uniquely identify the user of a mobile network.
     *
     * @return imsi
     */
    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets imsi.
     * <p>
     * Field description:
     * International Mobile Subscriber Identity, used to uniquely identify the user of a mobile network.
     *
     * @param imsi
     */
    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    /**
     * Sets originalNetwork.
     *
     * @param originalNetwork
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails originalNetwork(NumberLookupNetwork originalNetwork) {
        this.originalNetwork = originalNetwork;
        return this;
    }

    /**
     * Returns originalNetwork.
     *
     * @return originalNetwork
     */
    @JsonProperty("originalNetwork")
    public NumberLookupNetwork getOriginalNetwork() {
        return originalNetwork;
    }

    /**
     * Sets originalNetwork.
     *
     * @param originalNetwork
     */
    @JsonProperty("originalNetwork")
    public void setOriginalNetwork(NumberLookupNetwork originalNetwork) {
        this.originalNetwork = originalNetwork;
    }

    /**
     * Sets ported.
     * <p>
     * Field description:
     * True if number has been ported.
     *
     * @param ported
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails ported(Boolean ported) {
        this.ported = ported;
        return this;
    }

    /**
     * Returns ported.
     * <p>
     * Field description:
     * True if number has been ported.
     *
     * @return ported
     */
    @JsonProperty("ported")
    public Boolean getPorted() {
        return ported;
    }

    /**
     * Sets ported.
     * <p>
     * Field description:
     * True if number has been ported.
     *
     * @param ported
     */
    @JsonProperty("ported")
    public void setPorted(Boolean ported) {
        this.ported = ported;
    }

    /**
     * Sets portedNetwork.
     *
     * @param portedNetwork
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails portedNetwork(NumberLookupNetwork portedNetwork) {
        this.portedNetwork = portedNetwork;
        return this;
    }

    /**
     * Returns portedNetwork.
     *
     * @return portedNetwork
     */
    @JsonProperty("portedNetwork")
    public NumberLookupNetwork getPortedNetwork() {
        return portedNetwork;
    }

    /**
     * Sets portedNetwork.
     *
     * @param portedNetwork
     */
    @JsonProperty("portedNetwork")
    public void setPortedNetwork(NumberLookupNetwork portedNetwork) {
        this.portedNetwork = portedNetwork;
    }

    /**
     * Sets roaming.
     * <p>
     * Field description:
     * True if number is currently in roaming.
     *
     * @param roaming
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails roaming(Boolean roaming) {
        this.roaming = roaming;
        return this;
    }

    /**
     * Returns roaming.
     * <p>
     * Field description:
     * True if number is currently in roaming.
     *
     * @return roaming
     */
    @JsonProperty("roaming")
    public Boolean getRoaming() {
        return roaming;
    }

    /**
     * Sets roaming.
     * <p>
     * Field description:
     * True if number is currently in roaming.
     *
     * @param roaming
     */
    @JsonProperty("roaming")
    public void setRoaming(Boolean roaming) {
        this.roaming = roaming;
    }

    /**
     * Sets roamingNetwork.
     *
     * @param roamingNetwork
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails roamingNetwork(NumberLookupNetwork roamingNetwork) {
        this.roamingNetwork = roamingNetwork;
        return this;
    }

    /**
     * Returns roamingNetwork.
     *
     * @return roamingNetwork
     */
    @JsonProperty("roamingNetwork")
    public NumberLookupNetwork getRoamingNetwork() {
        return roamingNetwork;
    }

    /**
     * Sets roamingNetwork.
     *
     * @param roamingNetwork
     */
    @JsonProperty("roamingNetwork")
    public void setRoamingNetwork(NumberLookupNetwork roamingNetwork) {
        this.roamingNetwork = roamingNetwork;
    }

    /**
     * Sets servingMSC.
     * <p>
     * Field description:
     * Serving mobile switching center.
     *
     * @param servingMSC
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails servingMSC(String servingMSC) {
        this.servingMSC = servingMSC;
        return this;
    }

    /**
     * Returns servingMSC.
     * <p>
     * Field description:
     * Serving mobile switching center.
     *
     * @return servingMSC
     */
    @JsonProperty("servingMSC")
    public String getServingMSC() {
        return servingMSC;
    }

    /**
     * Sets servingMSC.
     * <p>
     * Field description:
     * Serving mobile switching center.
     *
     * @param servingMSC
     */
    @JsonProperty("servingMSC")
    public void setServingMSC(String servingMSC) {
        this.servingMSC = servingMSC;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails status(NumberLookupStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public NumberLookupStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(NumberLookupStatus status) {
        this.status = status;
    }

    /**
     * Sets error.
     *
     * @param error
     * @return This {@link NumberLookupResponseDetails instance}.
     */
    public NumberLookupResponseDetails error(NumberLookupError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     *
     * @return error
     */
    @JsonProperty("error")
    public NumberLookupError getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(NumberLookupError error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberLookupResponseDetails numberLookupResponseDetails = (NumberLookupResponseDetails) o;
        return Objects.equals(this.to, numberLookupResponseDetails.to)
                && Objects.equals(this.mccMnc, numberLookupResponseDetails.mccMnc)
                && Objects.equals(this.imsi, numberLookupResponseDetails.imsi)
                && Objects.equals(this.originalNetwork, numberLookupResponseDetails.originalNetwork)
                && Objects.equals(this.ported, numberLookupResponseDetails.ported)
                && Objects.equals(this.portedNetwork, numberLookupResponseDetails.portedNetwork)
                && Objects.equals(this.roaming, numberLookupResponseDetails.roaming)
                && Objects.equals(this.roamingNetwork, numberLookupResponseDetails.roamingNetwork)
                && Objects.equals(this.servingMSC, numberLookupResponseDetails.servingMSC)
                && Objects.equals(this.status, numberLookupResponseDetails.status)
                && Objects.equals(this.error, numberLookupResponseDetails.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                to,
                mccMnc,
                imsi,
                originalNetwork,
                ported,
                portedNetwork,
                roaming,
                roamingNetwork,
                servingMSC,
                status,
                error);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupResponseDetails {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    imsi: ")
                .append(toIndentedString(imsi))
                .append(newLine)
                .append("    originalNetwork: ")
                .append(toIndentedString(originalNetwork))
                .append(newLine)
                .append("    ported: ")
                .append(toIndentedString(ported))
                .append(newLine)
                .append("    portedNetwork: ")
                .append(toIndentedString(portedNetwork))
                .append(newLine)
                .append("    roaming: ")
                .append(toIndentedString(roaming))
                .append(newLine)
                .append("    roamingNetwork: ")
                .append(toIndentedString(roamingNetwork))
                .append(newLine)
                .append("    servingMSC: ")
                .append(toIndentedString(servingMSC))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
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
