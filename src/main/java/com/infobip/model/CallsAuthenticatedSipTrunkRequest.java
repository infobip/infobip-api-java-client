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
 * Represents CallsAuthenticatedSipTrunkRequest model.
 */
public class CallsAuthenticatedSipTrunkRequest extends CallsSipTrunkRequest {

    private CallsSipTrunkAuthenticationRequest authentication;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsNumberPresentationFormat numberFormat;

    private CallsAnonymizationType anonymization;

    /**
     * Constructs a new {@link CallsAuthenticatedSipTrunkRequest} instance.
     */
    public CallsAuthenticatedSipTrunkRequest() {
        super("AUTHENTICATED");
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest authentication(CallsSipTrunkAuthenticationRequest authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Returns authentication.
     *
     * @return authentication
     */
    @JsonProperty("authentication")
    public CallsSipTrunkAuthenticationRequest getAuthentication() {
        return authentication;
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     */
    @JsonProperty("authentication")
    public void setAuthentication(CallsSipTrunkAuthenticationRequest authentication) {
        this.authentication = authentication;
    }

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest codecs(List<CallsAudioCodec> codecs) {
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
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest addCodecsItem(CallsAudioCodec codecsItem) {
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
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest dtmf(CallsDtmfType dtmf) {
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
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest fax(CallsFaxType fax) {
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
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest numberFormat(CallsNumberPresentationFormat numberFormat) {
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
     * @return This {@link CallsAuthenticatedSipTrunkRequest instance}.
     */
    public CallsAuthenticatedSipTrunkRequest anonymization(CallsAnonymizationType anonymization) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAuthenticatedSipTrunkRequest callsAuthenticatedSipTrunkRequest = (CallsAuthenticatedSipTrunkRequest) o;
        return Objects.equals(this.authentication, callsAuthenticatedSipTrunkRequest.authentication)
                && Objects.equals(this.codecs, callsAuthenticatedSipTrunkRequest.codecs)
                && Objects.equals(this.dtmf, callsAuthenticatedSipTrunkRequest.dtmf)
                && Objects.equals(this.fax, callsAuthenticatedSipTrunkRequest.fax)
                && Objects.equals(this.numberFormat, callsAuthenticatedSipTrunkRequest.numberFormat)
                && Objects.equals(this.anonymization, callsAuthenticatedSipTrunkRequest.anonymization)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authentication, codecs, dtmf, fax, numberFormat, anonymization, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAuthenticatedSipTrunkRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    authentication: ")
                .append(toIndentedString(authentication))
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
