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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallsRegisteredSipTrunkRequest model.
 */
public class CallsRegisteredSipTrunkRequest extends CallsSipTrunkRequest {

    private Boolean tls;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsNumberPresentationFormat numberFormat;

    private CallsAnonymizationType anonymization;

    private Boolean inviteAuthentication;

    /**
     * Constructs a new {@link CallsRegisteredSipTrunkRequest} instance.
     */
    public CallsRegisteredSipTrunkRequest() {
        super("REGISTERED");
    }

    /**
     * Sets tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @param tls
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest tls(Boolean tls) {
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
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest codecs(List<CallsAudioCodec> codecs) {
        this.codecs = codecs;
        return this;
    }

    /**
     * Adds and item into codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecsItem The item to be added to the list.
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest addCodecsItem(CallsAudioCodec codecsItem) {
        if (this.codecs == null) {
            this.codecs = new ArrayList<>();
        }
        this.codecs.add(codecsItem);
        return this;
    }

    /**
     * Returns codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @return codecs
     */
    @JsonProperty("codecs")
    public List<CallsAudioCodec> getCodecs() {
        return codecs;
    }

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     */
    @JsonProperty("codecs")
    public void setCodecs(List<CallsAudioCodec> codecs) {
        this.codecs = codecs;
    }

    /**
     * Sets dtmf.
     *
     * @param dtmf
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest dtmf(CallsDtmfType dtmf) {
        this.dtmf = dtmf;
        return this;
    }

    /**
     * Returns dtmf.
     *
     * @return dtmf
     */
    @JsonProperty("dtmf")
    public CallsDtmfType getDtmf() {
        return dtmf;
    }

    /**
     * Sets dtmf.
     *
     * @param dtmf
     */
    @JsonProperty("dtmf")
    public void setDtmf(CallsDtmfType dtmf) {
        this.dtmf = dtmf;
    }

    /**
     * Sets fax.
     *
     * @param fax
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest fax(CallsFaxType fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Returns fax.
     *
     * @return fax
     */
    @JsonProperty("fax")
    public CallsFaxType getFax() {
        return fax;
    }

    /**
     * Sets fax.
     *
     * @param fax
     */
    @JsonProperty("fax")
    public void setFax(CallsFaxType fax) {
        this.fax = fax;
    }

    /**
     * Sets numberFormat.
     *
     * @param numberFormat
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest numberFormat(CallsNumberPresentationFormat numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    /**
     * Returns numberFormat.
     *
     * @return numberFormat
     */
    @JsonProperty("numberFormat")
    public CallsNumberPresentationFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets numberFormat.
     *
     * @param numberFormat
     */
    @JsonProperty("numberFormat")
    public void setNumberFormat(CallsNumberPresentationFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    /**
     * Sets anonymization.
     *
     * @param anonymization
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest anonymization(CallsAnonymizationType anonymization) {
        this.anonymization = anonymization;
        return this;
    }

    /**
     * Returns anonymization.
     *
     * @return anonymization
     */
    @JsonProperty("anonymization")
    public CallsAnonymizationType getAnonymization() {
        return anonymization;
    }

    /**
     * Sets anonymization.
     *
     * @param anonymization
     */
    @JsonProperty("anonymization")
    public void setAnonymization(CallsAnonymizationType anonymization) {
        this.anonymization = anonymization;
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest inviteAuthentication(Boolean inviteAuthentication) {
        this.inviteAuthentication = inviteAuthentication;
        return this;
    }

    /**
     * Returns inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @return inviteAuthentication
     */
    @JsonProperty("inviteAuthentication")
    public Boolean getInviteAuthentication() {
        return inviteAuthentication;
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     */
    @JsonProperty("inviteAuthentication")
    public void setInviteAuthentication(Boolean inviteAuthentication) {
        this.inviteAuthentication = inviteAuthentication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRegisteredSipTrunkRequest callsRegisteredSipTrunkRequest = (CallsRegisteredSipTrunkRequest) o;
        return Objects.equals(this.tls, callsRegisteredSipTrunkRequest.tls)
                && Objects.equals(this.codecs, callsRegisteredSipTrunkRequest.codecs)
                && Objects.equals(this.dtmf, callsRegisteredSipTrunkRequest.dtmf)
                && Objects.equals(this.fax, callsRegisteredSipTrunkRequest.fax)
                && Objects.equals(this.numberFormat, callsRegisteredSipTrunkRequest.numberFormat)
                && Objects.equals(this.anonymization, callsRegisteredSipTrunkRequest.anonymization)
                && Objects.equals(this.inviteAuthentication, callsRegisteredSipTrunkRequest.inviteAuthentication)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                tls, codecs, dtmf, fax, numberFormat, anonymization, inviteAuthentication, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRegisteredSipTrunkRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    tls: ")
                .append(toIndentedString(tls))
                .append(newLine)
                .append("    codecs: ")
                .append(toIndentedString(codecs))
                .append(newLine)
                .append("    dtmf: ")
                .append(toIndentedString(dtmf))
                .append(newLine)
                .append("    fax: ")
                .append(toIndentedString(fax))
                .append(newLine)
                .append("    numberFormat: ")
                .append(toIndentedString(numberFormat))
                .append(newLine)
                .append("    anonymization: ")
                .append(toIndentedString(anonymization))
                .append(newLine)
                .append("    inviteAuthentication: ")
                .append(toIndentedString(inviteAuthentication))
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
