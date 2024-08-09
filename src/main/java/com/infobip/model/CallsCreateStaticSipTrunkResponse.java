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
 * Represents CallsCreateStaticSipTrunkResponse model.
 */
public class CallsCreateStaticSipTrunkResponse extends CallsCreateSipTrunkResponse {

    private Boolean tls;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsNumberPresentationFormat numberFormat;

    private CallsAnonymizationType anonymization;

    private List<String> sourceHosts = null;

    private List<String> destinationHosts = null;

    private CallsSelectionStrategy strategy;

    private CallsSipOptions sipOptions;

    /**
     * Constructs a new {@link CallsCreateStaticSipTrunkResponse} instance.
     */
    public CallsCreateStaticSipTrunkResponse() {
        super("STATIC");
    }

    /**
     * Sets tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @param tls
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse tls(Boolean tls) {
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
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse codecs(List<CallsAudioCodec> codecs) {
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
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse addCodecsItem(CallsAudioCodec codecsItem) {
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
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse dtmf(CallsDtmfType dtmf) {
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
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse fax(CallsFaxType fax) {
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
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse numberFormat(CallsNumberPresentationFormat numberFormat) {
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
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse anonymization(CallsAnonymizationType anonymization) {
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
     * Sets sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @param sourceHosts
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse sourceHosts(List<String> sourceHosts) {
        this.sourceHosts = sourceHosts;
        return this;
    }

    /**
     * Adds and item into sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @param sourceHostsItem The item to be added to the list.
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse addSourceHostsItem(String sourceHostsItem) {
        if (this.sourceHosts == null) {
            this.sourceHosts = new ArrayList<>();
        }
        this.sourceHosts.add(sourceHostsItem);
        return this;
    }

    /**
     * Returns sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @return sourceHosts
     */
    @JsonProperty("sourceHosts")
    public List<String> getSourceHosts() {
        return sourceHosts;
    }

    /**
     * Sets sourceHosts.
     * <p>
     * Field description:
     * List of source hosts.
     *
     * @param sourceHosts
     */
    @JsonProperty("sourceHosts")
    public void setSourceHosts(List<String> sourceHosts) {
        this.sourceHosts = sourceHosts;
    }

    /**
     * Sets destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @param destinationHosts
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse destinationHosts(List<String> destinationHosts) {
        this.destinationHosts = destinationHosts;
        return this;
    }

    /**
     * Adds and item into destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @param destinationHostsItem The item to be added to the list.
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse addDestinationHostsItem(String destinationHostsItem) {
        if (this.destinationHosts == null) {
            this.destinationHosts = new ArrayList<>();
        }
        this.destinationHosts.add(destinationHostsItem);
        return this;
    }

    /**
     * Returns destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @return destinationHosts
     */
    @JsonProperty("destinationHosts")
    public List<String> getDestinationHosts() {
        return destinationHosts;
    }

    /**
     * Sets destinationHosts.
     * <p>
     * Field description:
     * List of destination hosts.
     *
     * @param destinationHosts
     */
    @JsonProperty("destinationHosts")
    public void setDestinationHosts(List<String> destinationHosts) {
        this.destinationHosts = destinationHosts;
    }

    /**
     * Sets strategy.
     *
     * @param strategy
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse strategy(CallsSelectionStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Returns strategy.
     *
     * @return strategy
     */
    @JsonProperty("strategy")
    public CallsSelectionStrategy getStrategy() {
        return strategy;
    }

    /**
     * Sets strategy.
     *
     * @param strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(CallsSelectionStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets sipOptions.
     *
     * @param sipOptions
     * @return This {@link CallsCreateStaticSipTrunkResponse instance}.
     */
    public CallsCreateStaticSipTrunkResponse sipOptions(CallsSipOptions sipOptions) {
        this.sipOptions = sipOptions;
        return this;
    }

    /**
     * Returns sipOptions.
     *
     * @return sipOptions
     */
    @JsonProperty("sipOptions")
    public CallsSipOptions getSipOptions() {
        return sipOptions;
    }

    /**
     * Sets sipOptions.
     *
     * @param sipOptions
     */
    @JsonProperty("sipOptions")
    public void setSipOptions(CallsSipOptions sipOptions) {
        this.sipOptions = sipOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCreateStaticSipTrunkResponse callsCreateStaticSipTrunkResponse = (CallsCreateStaticSipTrunkResponse) o;
        return Objects.equals(this.tls, callsCreateStaticSipTrunkResponse.tls)
                && Objects.equals(this.codecs, callsCreateStaticSipTrunkResponse.codecs)
                && Objects.equals(this.dtmf, callsCreateStaticSipTrunkResponse.dtmf)
                && Objects.equals(this.fax, callsCreateStaticSipTrunkResponse.fax)
                && Objects.equals(this.numberFormat, callsCreateStaticSipTrunkResponse.numberFormat)
                && Objects.equals(this.anonymization, callsCreateStaticSipTrunkResponse.anonymization)
                && Objects.equals(this.sourceHosts, callsCreateStaticSipTrunkResponse.sourceHosts)
                && Objects.equals(this.destinationHosts, callsCreateStaticSipTrunkResponse.destinationHosts)
                && Objects.equals(this.strategy, callsCreateStaticSipTrunkResponse.strategy)
                && Objects.equals(this.sipOptions, callsCreateStaticSipTrunkResponse.sipOptions)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                tls,
                codecs,
                dtmf,
                fax,
                numberFormat,
                anonymization,
                sourceHosts,
                destinationHosts,
                strategy,
                sipOptions,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCreateStaticSipTrunkResponse {")
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
                .append("    sourceHosts: ")
                .append(toIndentedString(sourceHosts))
                .append(newLine)
                .append("    destinationHosts: ")
                .append(toIndentedString(destinationHosts))
                .append(newLine)
                .append("    strategy: ")
                .append(toIndentedString(strategy))
                .append(newLine)
                .append("    sipOptions: ")
                .append(toIndentedString(sipOptions))
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
