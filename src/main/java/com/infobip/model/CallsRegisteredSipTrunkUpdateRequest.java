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
 * Represents CallsRegisteredSipTrunkUpdateRequest model.
 */
public class CallsRegisteredSipTrunkUpdateRequest extends CallsSipTrunkUpdateRequest {

    private Boolean inviteAuthentication;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsAnonymizationType anonymization;

    private CallsNumberPresentationFormat numberFormat;

    /**
     * Constructs a new {@link CallsRegisteredSipTrunkUpdateRequest} instance.
     */
    public CallsRegisteredSipTrunkUpdateRequest() {
        super("REGISTERED");
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest inviteAuthentication(Boolean inviteAuthentication) {
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

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest codecs(List<CallsAudioCodec> codecs) {
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
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest addCodecsItem(CallsAudioCodec codecsItem) {
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
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest dtmf(CallsDtmfType dtmf) {
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
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest fax(CallsFaxType fax) {
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
     * Sets anonymization.
     *
     * @param anonymization
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest anonymization(CallsAnonymizationType anonymization) {
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
     * Sets numberFormat.
     *
     * @param numberFormat
     * @return This {@link CallsRegisteredSipTrunkUpdateRequest instance}.
     */
    public CallsRegisteredSipTrunkUpdateRequest numberFormat(CallsNumberPresentationFormat numberFormat) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRegisteredSipTrunkUpdateRequest callsRegisteredSipTrunkUpdateRequest =
                (CallsRegisteredSipTrunkUpdateRequest) o;
        return Objects.equals(this.inviteAuthentication, callsRegisteredSipTrunkUpdateRequest.inviteAuthentication)
                && Objects.equals(this.codecs, callsRegisteredSipTrunkUpdateRequest.codecs)
                && Objects.equals(this.dtmf, callsRegisteredSipTrunkUpdateRequest.dtmf)
                && Objects.equals(this.fax, callsRegisteredSipTrunkUpdateRequest.fax)
                && Objects.equals(this.anonymization, callsRegisteredSipTrunkUpdateRequest.anonymization)
                && Objects.equals(this.numberFormat, callsRegisteredSipTrunkUpdateRequest.numberFormat)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteAuthentication, codecs, dtmf, fax, anonymization, numberFormat, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRegisteredSipTrunkUpdateRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    inviteAuthentication: ")
                .append(toIndentedString(inviteAuthentication))
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
                .append("    anonymization: ")
                .append(toIndentedString(anonymization))
                .append(newLine)
                .append("    numberFormat: ")
                .append(toIndentedString(numberFormat))
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
