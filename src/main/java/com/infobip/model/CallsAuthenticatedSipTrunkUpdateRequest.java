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
 * Represents CallsAuthenticatedSipTrunkUpdateRequest model.
 */
public class CallsAuthenticatedSipTrunkUpdateRequest extends CallsSipTrunkUpdateRequest {

    private CallsSipTrunkAuthentication authentication;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsNumberPresentationFormat numberFormat;

    private CallsAnonymizationType anonymization;

    /**
     * Constructs a new {@link CallsAuthenticatedSipTrunkUpdateRequest} instance.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest() {
        super("AUTHENTICATED");
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest authentication(CallsSipTrunkAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Returns authentication.
     *
     * @return authentication
     */
    @JsonProperty("authentication")
    public CallsSipTrunkAuthentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     */
    @JsonProperty("authentication")
    public void setAuthentication(CallsSipTrunkAuthentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest codecs(List<CallsAudioCodec> codecs) {
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
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest addCodecsItem(CallsAudioCodec codecsItem) {
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
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest dtmf(CallsDtmfType dtmf) {
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
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest fax(CallsFaxType fax) {
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
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest numberFormat(CallsNumberPresentationFormat numberFormat) {
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
     * @return This {@link CallsAuthenticatedSipTrunkUpdateRequest instance}.
     */
    public CallsAuthenticatedSipTrunkUpdateRequest anonymization(CallsAnonymizationType anonymization) {
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
        CallsAuthenticatedSipTrunkUpdateRequest callsAuthenticatedSipTrunkUpdateRequest =
                (CallsAuthenticatedSipTrunkUpdateRequest) o;
        return Objects.equals(this.authentication, callsAuthenticatedSipTrunkUpdateRequest.authentication)
                && Objects.equals(this.codecs, callsAuthenticatedSipTrunkUpdateRequest.codecs)
                && Objects.equals(this.dtmf, callsAuthenticatedSipTrunkUpdateRequest.dtmf)
                && Objects.equals(this.fax, callsAuthenticatedSipTrunkUpdateRequest.fax)
                && Objects.equals(this.numberFormat, callsAuthenticatedSipTrunkUpdateRequest.numberFormat)
                && Objects.equals(this.anonymization, callsAuthenticatedSipTrunkUpdateRequest.anonymization)
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
                .append("class CallsAuthenticatedSipTrunkUpdateRequest {")
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
